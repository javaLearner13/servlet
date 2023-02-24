package sec02.ex01;
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	/*
	 * private static final String driver = "oracle.jdbc.OracleDriver"; private
	 * static final String url = "jdbc:oracle:thin:@localhost:1521:xe"; private
	 * static final String user = "owen"; private static final String pwd = "12345";
	 */
	
	private PreparedStatement pstmt;
	private Connection con;
	private DataSource dataFactory;
	
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/shop_db"); 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List listMembers(MemberVO memberVO){
		
		List membersList = new ArrayList();
		String _name = memberVO.getName();
		try {
//			connDB();
			con = dataFactory.getConnection();
			String query = "select * from t_member ";
			if((_name!=null && _name.length()!=0)) {
				query+=" where name=?";
				pstmt = con.prepareStatement(query);
				pstmt.setString(1,  _name);
			}else {
				pstmt = con.prepareStatement(query);
			}
			
			System.out.println("prepareStatement: "+query);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				membersList.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace(); //in case of error, prints what kind
		}
		
		return membersList;
	}
	
	/*
	 * private void connDB() { try { Class.forName(driver);
	 * System.out.println("Oracle 드라이버 로딩 성공"); con =
	 * DriverManager.getConnection(url, user, pwd);
	 * System.out.println("Connection 생성 성공");
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } }
	 */
}
