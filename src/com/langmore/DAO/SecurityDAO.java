package com.langmore.DAO;

import java.sql.SQLException;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.langmore.model.Security;


public class SecurityDAO extends OracleConnection{
	
	private PasswordEncoder passwordEncoder;

	public int saveSecurity(Security security) {
		getConnection();
		int secId = -1;
		security.setPass(passwordEncoder.encode(security.getPass()));
		String sql = "INSERT INTO \"SECURITY\" VALUES (null, ?, ?, ?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,security.getUsername());
			ps.setString(2,security.getPass());
			ps.setString(3, security.getUserType());
			rs = ps.executeQuery();
			while( rs.next())
			{
				secId = rs.getInt("security_id");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn();
		}
		return secId;
	}

//	public void deleteUserByName(String name) {
//		userDao.deleteByName(name);
//	}
//
//	public List<User> findAllUsers() {
//		return userDao.findAllUsers();
//	}

	public boolean isUserNameUnique(String userName) {
		getConnection();
		String sql = "SELECT * FROM \"SECURITY\" WHERE username = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			rs = ps.executeQuery();
			if(rs.next()) {
				return false;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn();
		}
		return true;
	}
	
	public Boolean passwordsMatch( String userName, String unencryptedPass) {
		getConnection();
		String pass  = null;
		String sql = "SELECT pass FROM \"SECURITY\" WHERE username = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			rs = ps.executeQuery();
			if(rs.next()) {
				pass = rs.getString("pass");
			}
			if ( pass.equals("{bcrypt}" +passwordEncoder.encode(unencryptedPass))) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn();
		}
		return false;
	}
}
