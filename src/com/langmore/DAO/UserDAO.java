package com.langmore.DAO;

import java.sql.SQLException;
import com.langmore.model.User;

public class UserDAO extends OracleConnection{

	public User findByUsername(String username) {
		getConnection();
		User user = new User();
		String sql = "select * from \"USER\" u where "
				+ "u.security_id = (SELECT security_id from \"SECURITY\" WHERE username = ?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,username);
			rs = ps.executeQuery();
			while(rs.next()) {
				user.setFname(rs.getString("fname"));
				user.setLname(rs.getString("lname"));
				user.setPh(rs.getString("ph"));
				user.setEmail(rs.getString("email"));
				user.setStreetAddress(rs.getString("street_address"));
				user.setCity(rs.getString("city"));
				user.setState(rs.getString("state"));
				user.setPreferences(rs.getString("preferences"));
				user.setCcNumber(rs.getString("credit_card_number"));
			}
	
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn();
		}
		return user;
	}
	
//	public List<User> findAllUsers() {
//		Criteria criteria = createEntityCriteria().addOrder(Order.asc("userName"));
//		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid
//																		// duplicates.
//		List<User> users = (List<User>) criteria.list();
//		return users;
//	}

	public void save(User user, int secId) {
		getConnection();
		String sql = "Insert into 'USER' (fname,lname,ph,email,street_address, city, state,preferences, credit_card_number) "
				+ "values(?,?,?,?,?,?,?,?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,user.getFname());
			ps.setString(2,user.getLname());
			ps.setString(3,user.getPh());
			ps.setString(4,user.getEmail());
			ps.setString(5,user.getStreetAddress());
			ps.setString(6,user.getCity());
			ps.setString(7,user.getState());
			ps.setString(8,user.getPreferences());
			ps.setString(9,user.getCcNumber());
			ps.setInt(10,secId);
			if (ps.executeUpdate() < 1) {
				System.out.println("Unable to save user to db");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn();
		}
	}

}
