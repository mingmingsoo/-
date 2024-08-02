package PJT;

import java.util.List;
import java.util.Scanner;
import java.util.*;

public class VideoUI {
	private Scanner sc = new Scanner(System.in);
	private VideoDao videoDao = VideoDaoImpl.getInstance();
	public void start() {
		while (true) {
			int menuNo = menu();
			switch (menuNo) {
			case 1:
				videoList();
				break;
			case 0:
				exit();
				return;
			default: 
				System.out.println("잘못된 메뉴를 선택하였습니다.");
			}
		}
	}

	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}

	private void videoList() {
		System.out.println("비디오 목록 보여주는 기능 호출");
		List<Video> videos = videoDao.getVideos();
		System.out.println("---------------------------");
		for (Video v : videos) {
			System.out.println(v.getNo()+" "+v.getTitle());
		}
		System.out.println("---------------------------");
		while (true) {
			int detailNo = detail(); //1 ~9			
			System.out.println(videos.get(detailNo));
			
		}
	}

	private int menu() {
		System.out.println("---------------");
		System.out.println("1. 비디오 목록");
		System.out.println("0. 종료");
		System.out.println("---------------");
		System.out.print("메뉴선택 : ");
		return Integer.parseInt(sc.nextLine());

	}
	
	private int detail() {
		System.out.println("---------------");
		System.out.println("1. 비디오 상세");
		System.out.println("0. 종료");
		System.out.println("---------------");
		System.out.print("메뉴선택 : ");
		int num = Integer.parseInt(sc.nextLine());
		if (num ==1) {
			System.out.println("번호를 입력하세요 : ");
		}
		else {exit();}
		return Integer.parseInt(sc.nextLine());
	}
	
	
	
	
	

}
