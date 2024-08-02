package PJT;

public class DuplicateUserId extends Exception {
	public DuplicateUserId() {
		super("이미 존재하는 회원 아이디.");
	}
}
