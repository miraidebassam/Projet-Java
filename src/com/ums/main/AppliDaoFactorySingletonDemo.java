package com.ums.main;

import java.util.List;

import com.ums.dao.IDAO;
import com.ums.entitys.User;
import com.ums.factory.IDaoFactory;

public class AppliDaoFactorySingletonDemo {

	public static void main(String[] args) {

		try {
			IDAO<User> user =  IDaoFactory.getInstance();
			List<User> userList = user.list();
			userList.forEach(System.out::println);

			user.create(new User(1,"astou","1200"));

			List<User> userList2 = user.list();
			userList2.forEach(System.out::println);
		} catch (Exception e ) {
			System.out.println(e.getMessage());
		}

	}
}

