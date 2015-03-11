package vnlawyer.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luanngu
 * Lớp  đối tượng lưu giữ các điểm trong một khoản
 */
public class Point {
	private List<String> points;//cac diem dc phan vao trong mang
	private String content;//toan bo noi dung cac diem;
	public static String regexp="\\w+[)]\\s*[\\w+ .,;]+\\s*;\\s*";
	public List<String> getPoints() {
		return points;
	}
	public void setPoints(List<String> points) {
		this.points = points;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
