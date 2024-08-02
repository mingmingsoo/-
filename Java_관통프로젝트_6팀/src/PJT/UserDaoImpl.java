package PJT;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
	
	private List<User> users = new ArrayList<>();
	
	private UserDaoImpl () {}
	private static UserDao instance = new UserDaoImpl();
	public static UserDao getInstance() {
		return instance;
	}
	
	@Override
	public boolean addUser(User user) throws DuplicateUserId {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUserNo() == user.getUserNo()) {
				throw new DuplicateUserId();
			}
		}
		users.add(user);
		return true;
	}

	@Override
	public boolean modifyUserPassword(String password, int userNo) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUserNo() == userNo) {
				users.get(i).setPassword(password);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean passwordCheck(String password) {
		
		return false;
	}
}
