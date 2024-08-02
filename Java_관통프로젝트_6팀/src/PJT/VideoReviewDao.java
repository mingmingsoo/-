package PJT;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface VideoReviewDao {
	int insertReview(VideoReview videoReview) throws FileNotFoundException, IOException;
	List<VideoReview> selectReview(int videoNo) throws NotFoundVideoNo;
}
