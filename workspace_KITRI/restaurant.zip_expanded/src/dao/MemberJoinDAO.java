package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import vo.MemberVO;

public class MemberJoinDAO {

	public String insertMember(MemberVO vo) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

			String sql = "insert into member values((select max(member_seq) from member)+1, ?, ?, ?, ?, ?)";
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, vo.getMember_id());
			st.setInt(2, vo.getMember_pw());
			st.setString(3, vo.getMember_name());
			st.setString(4, vo.getPhone());
			st.setString(5, vo.getEmail());
			int result = st.executeUpdate();
			if (result == 1) {
				System.out.println("회원가입이 완료 되었습니다.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}
		}
		return null;

	}

}
