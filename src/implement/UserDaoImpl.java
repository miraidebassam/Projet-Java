package implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ums.connexionDB.DBManager;
import com.ums.dao.IDAO;
import com.ums.entitys.User;
import com.ums.exceptions.DAOException;

public class UserDaoImpl implements IDAO<User>{	


	public UserDaoImpl() {
		super();
		System.out.println("data source : database");
	}

	@Override
	public void create(User entity) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			String query = "Insert into t_users (id, login, password) values (?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, Integer.toString(entity.getIdentifiant()));
			ps.setString(2, entity.getLogin());
			ps.setString(3, entity.getPassword());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public User read(int id) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			String query = "Select * From t_users where id=?";
			PreparedStatement ps = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, 
					ResultSet.CONCUR_UPDATABLE);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.first()) {
				String login = rs.getString("login");
				String password = rs.getString("password");
				User user = new User (id, login, password);
				return user;
			}
		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}
		return null;
	}

	@Override
	public List<User> list() throws DAOException {
		List<User> users = new ArrayList<>();
		try (Connection connection = DBManager.getConnection()) {
			String query = "Select * From t_users";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int identifiant = rs.getInt("id");
				String login = rs.getString("login");
				String password = rs.getString("password");
				User user = new User (identifiant, login, password);
				users.add(user);
			}
			connection.close();
		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}

		return users;
	}

	@Override
	public void update(User entity) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			String query = "Update t_users Set login=?, password=? Where id=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, entity.getLogin());
			ps.setString(2, entity.getPassword());
			ps.setInt(3, entity.getIdentifiant());
			ps.executeUpdate();
			connection.close();

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public void delete(int id) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			String query = "Delete From t_users Where id=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			connection.close();

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}
	}

}
