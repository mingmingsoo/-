package PJT;

public interface UserDao {
	public boolean addUser(User user) throws DuplicateUserId;
	public boolean modifyUserPassword(String password, int userNo);
	public boolean passwordCheck(String password);
}
