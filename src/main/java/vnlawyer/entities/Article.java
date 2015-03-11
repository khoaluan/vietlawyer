package vnlawyer.entities;

import java.util.List;


/**
 * @author luanngu
 * Lớp đối tượng lưu giữ thông tin của một điều luật
 */
public class Article {
	String name;//ten dieu luat
	

	String art_num;//so thu tu cua dieu
	String sec_num;//thuoc muc nao
	String chap_num;//thuoc chuong nao
	String doc_title;//thuoc van ban nao
	public enum LawType{
		THONG_TU(10),
		NGHI_DINH(20),
		LUAT(30),
		NGHI_QUYET(40);
		private int value;
		private String name;
		private LawType(int val){
			this.value=val;
		}
		public void setName(String n){
			this.name=n;
		}
		public String getName(){
			return name;
		}
	} 
	LawType law_type;
	List<Clause> clauses;
	
	String content;//noi dung toan bo dieu luat
	public static String regexp="Điều\\s+\\d+.\\s*[\\w+ ]*\\s*";
	
	public List<Clause> getClauses() {
		return clauses;
	}

	public void setClauses(List<Clause> clauses) {
		this.clauses = clauses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArt_num() {
		return art_num;
	}

	public void setArt_num(String art_num) {
		this.art_num = art_num;
	}

	public String getSec_num() {
		return sec_num;
	}

	public void setSec_num(String sec_num) {
		this.sec_num = sec_num;
	}

	public String getChap_num() {
		return chap_num;
	}

	public void setChap_num(String chap_num) {
		this.chap_num = chap_num;
	}

	public String getDoc_title() {
		return doc_title;
	}

	public void setDoc_title(String doc_title) {
		this.doc_title = doc_title;
	}

	public LawType getLaw_type() {
		return law_type;
	}

	public void setLaw_type(LawType law_type) {
		this.law_type = law_type;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
