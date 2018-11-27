package vo;

import java.util.ArrayList;

public class MemberVO {
	
	private int seq;
	private String member_id;
	private int member_pw;
	private String member_name;
	private String phone;
	private String email;
	private MenuVO vo;
	
	
	public MemberVO() {
		super();
	}


	public MemberVO(int seq, String member_id, int member_pw, String member_name, String phone, String email,
			MenuVO vo) {
		super();
		this.seq = seq;
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_name = member_name;
		this.phone = phone;
		this.email = email;
		this.vo = vo;
	}
	
	public MemberVO(int seq, String member_id, int member_pw, String member_name, String phone, String email) {
		super();
		this.seq = seq;
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_name = member_name;
		this.phone = phone;
		this.email = email;
	}

	public int getSeq() {
		return seq;
	}


	public void setSeq(int seq) {
		this.seq = seq;
	}


	public String getMember_id() {
		return member_id;
	}


	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}


	public int getMember_pw() {
		return member_pw;
	}


	public void setMember_pw(int member_pw) {
		this.member_pw = member_pw;
	}


	public String getMember_name() {
		return member_name;
	}


	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public MenuVO getVo() {
		return vo;
	}


	public void setVo(MenuVO vo) {
		this.vo = vo;
	}


	
	
	
	
	
	
}
