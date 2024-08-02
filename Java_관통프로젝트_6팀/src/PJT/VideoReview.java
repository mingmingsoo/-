package PJT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class VideoReview {
	private int videoNo;
	private int reviewNo;
	private String reviewWriter;
	private String content;

	public VideoReview() {
		// 리뷰는 어디서 읽지?
	}

	public VideoReview(int videoNo, int reviewNo, String reviewWriter, String content) {
		super();
		this.videoNo = videoNo;
		this.reviewNo = reviewNo;
		this.reviewWriter = reviewWriter;
		this.content = content;
	}

	@Override
	public String toString() {
		return "VideoReview [videoNo=" + videoNo + ", reviewNo=" + reviewNo + ", reviewWriter=" + reviewWriter
				+ ", content=" + content + "]";
	}

	public int getVideoNo() {
		return videoNo;
	}

	public void setVideoNo(int videoNo) {
		this.videoNo = videoNo;
	}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public String getReviewWriter() {
		return reviewWriter;
	}

	public void setReviewWriter(String reviewWriter) {
		this.reviewWriter = reviewWriter;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
