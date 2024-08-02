package PJT;

public class NotFoundVideoNo extends RuntimeException {
	public NotFoundVideoNo(){
		super("존재하지 않는 비디오 입니다.");
	}
}
