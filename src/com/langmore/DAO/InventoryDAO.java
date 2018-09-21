package com.langmore.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.langmore.model.Inventory;

public class InventoryDAO extends OracleConnection{
	
	public List<Inventory> getAvailRooms(){
		
		String sql = "SELECT * FROM inventory WHERE available_units > 0";
		List<Inventory> inventory = new ArrayList<Inventory>();
		getConnection();
	
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Inventory in = new Inventory();
				in.setItemId(rs.getInt("item_id"));
				in.setImageUrl(rs.getString("image"));
				in.setItemType(rs.getString("item_type"));
				in.setDescription(rs.getString("description"));
				in.setPricePerUnit(rs.getDouble("price_per_unit"));
				inventory.add(in);
			}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn();
		}
		return inventory;
	}
	
	public Inventory getItemInfo(String itemType) {
		
		String sql = "SELECT * FROM inventory WHERE item_type = ?";
		Inventory inventory = new Inventory();
		getConnection();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, itemType);
			rs= ps.executeQuery();
			while(rs.next()) {
				inventory.setImageUrl(rs.getString("image"));
				inventory.setItemType(rs.getString("item_type"));
				inventory.setDescription(rs.getString("description"));
				inventory.setPricePerUnit(rs.getDouble("price_per_unit"));
				inventory.setAvailableUnits(rs.getInt("available_units"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn();
		}
		return inventory;
	}
}
