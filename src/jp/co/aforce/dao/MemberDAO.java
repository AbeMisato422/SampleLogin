package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Member;

public class MemberDAO extends DAO{

	public Member search(String id, String password)
		throws Exception{
		Member member=null;

		Connection con=getConnection();

		PreparedStatement st;
		st=con.prepareStatement(
				"select * from member where id=? and password=?");
		st.setString(1, id);
		st.setString(2, password);
		ResultSet rs=st.executeQuery();

		while(rs.next()) {
			member=new Member();
			member.setId(rs.getString("id"));
			member.setPassword(rs.getString("password"));
			member.setName(rs.getString("name"));
		}

		st.close();
		con.close();
		return member;
	}
}
