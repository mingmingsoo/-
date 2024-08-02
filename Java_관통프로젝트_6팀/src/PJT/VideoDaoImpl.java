package PJT;

import java.io.BufferedReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class VideoDaoImpl implements VideoDao {
	private List<Video> videos;
	private VideoDaoImpl() {
		// video.json 파일을 읽어서 videos 추가하자
		try (
			FileReader fr = new FileReader("data/video.json");
			BufferedReader br = new BufferedReader(fr);	
		) {
			StringBuffer sb = new StringBuffer();
			while (true) {
				String line = br.readLine();
				if (line == null) break;
				
				sb.append(line);
			}
			
			Gson gson = new Gson();
			videos = Arrays.asList( gson.fromJson(sb.toString(), Video[].class) );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static VideoDao instance = new VideoDaoImpl();
	public static VideoDao getInstance() {
		return instance;
	}
	@Override
	public List<Video> getVideos() {
		return videos;
	}
	

	
	
	
	
	
}






