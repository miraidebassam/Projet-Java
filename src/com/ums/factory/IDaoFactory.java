package com.ums.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.ums.dao.IDAO;
import com.ums.entitys.User;
public class IDaoFactory{
	private static IDAO<User> dao ;
	private static String className;
	private static String packageName;


	@SuppressWarnings("unchecked")
	private IDaoFactory() throws Exception {
		super();
		Class<?> daoImpl = null;
		config();
		daoImpl = Class.forName(packageName + "." + className);
		dao =  (IDAO<User>) daoImpl.getConstructor().newInstance();

	}

	public static IDAO<User> getInstance() throws Exception {
		if (dao == null){
			new IDaoFactory();
		} 
		return dao;
	}

	public static  void config() throws Exception {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("application.properties"));
			className = properties.getProperty("className");
			packageName = properties.getProperty("packageName");
		} catch (IOException e) {
			throw new Exception("Error while loading application.properties file", e);
		}
	}
}
