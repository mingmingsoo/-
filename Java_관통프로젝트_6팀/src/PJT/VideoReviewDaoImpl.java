package PJT;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VideoReviewDaoImpl implements VideoReviewDao {
	List<VideoReview> reviews = new ArrayList<>();
	@Override
	public int insertReview(VideoReview videoReview) throws IOException {
		reviews.add(videoReview);
		return 1 ;
	}

	@Override
	public List<VideoReview> selectReview(int videoNo) throws NotFoundVideoNo {
		List<VideoReview> tempReviews = new ArrayList<>();
		for (int i = 0; i < reviews.size(); i++) {
			if (reviews.get(i).getVideoNo() == videoNo) {
				tempReviews.add(reviews.get(i));
			} 
		}
		if (tempReviews.size() == 0) {
			throw new NotFoundVideoNo();
		}
		return tempReviews;
	}
}