package vnlawyer.entities;

import java.util.List;

/**
 * @author luanngu Lớp đối tượng lưu giữ thông tin của một khoản
 */
public class Clause {
	List<Point> points_a; // cac diem trong gia dinh
	List<Point> points_p; // cac diem trong quy dinh
	List<Point> points_s; // cac diem trong che tai
	String assume; // gia dinh
	String provision; // quy dinh
	String sanction; // che tai
	String prefix; // nhung tu bo nghia cho trang thai dong tu : duoc, phai, chi
					// duoc, khong duoc, cam, tru truong hop... (pho tu)
	String content;// noi dung cua khoan
	public static String regexp="\\d+\\s*.\\s*[\\w+ .,;]+\\s*.\\s*";
	public List<Point> getPoints_a() {
		return points_a;
	}

	public void setPoints_a(List<Point> points_a) {
		this.points_a = points_a;
	}

	public List<Point> getPoints_p() {
		return points_p;
	}

	public void setPoints_p(List<Point> points_p) {
		this.points_p = points_p;
	}

	public List<Point> getPoints_s() {
		return points_s;
	}

	public void setPoints_s(List<Point> points_s) {
		this.points_s = points_s;
	}

	public String getAssume() {
		return assume;
	}

	public void setAssume(String assume) {
		this.assume = assume;
	}

	public String getProvision() {
		return provision;
	}

	public void setProvision(String provision) {
		this.provision = provision;
	}

	public String getSanction() {
		return sanction;
	}

	public void setSanction(String sanction) {
		this.sanction = sanction;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

}
