package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DataUtil;

import model.KhachHangModel;
import model.SanPhamModel;



public class SanPhamDAO {
	public static ArrayList<SanPhamModel> getAllSanPham(){
ArrayList<SanPhamModel> listSanPham = new ArrayList<SanPhamModel>();
		
		try 
		{
			String sql = "SELECT * FROM SANPHAM";
			ResultSet rs = DataUtil.executeQuery(sql);		
			while(rs.next()) 
			{
				SanPhamModel model = new SanPhamModel();	
				
				model.setID(rs.getString("ID"));
				model.setTen_San_Pham(rs.getString("Ten_San_Pham"));
				model.setGia_Tien(rs.getString("Gia_Tien"));
				model.setGhi_Chu(rs.getString("Ghi_Chu"));
				
				listSanPham.add(model);
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static ArrayList<SanPhamModel> searchSanPham(String Ten_SP){
		ArrayList<SanPhamModel> listSanPham = new ArrayList<SanPhamModel>();
		try {
			String sql = "SELECT Ten_San_Pham FROM SANPHAM WHERE Ten_San_Pham LIKE '%"+Ten_SP+"%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
			while (rs.next()){
				SanPhamModel model = new SanPhamModel();
				model.setID(rs.getString("ID"));
				model.setTen_San_Pham(rs.getString("Ten_San_Pham"));
				model.setGia_Tien(rs.getString("Gia_Tien"));
				model.setGhi_Chu(rs.getString("Ghi_Chu"));
				listSanPham.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  null;
	}
	public static Boolean insertSanPham(SanPhamModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO SANPHAM VALUES (?,?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getID());
				ps.setString(2, model.getTen_San_Pham());
				ps.setString(3, model.getGia_Tien());
				ps.setString(4, model.getGhi_Chu());
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return kq;
	}
	public static Boolean updateSanPham(SanPhamModel model){
		Boolean kq = false;
		String sql = "Update SANPHAM set Ten_San_Pham= '" + model.getTen_San_Pham()
											+"', Gia_Tien='"+model.getGia_Tien()
											+"', Ghi_Chu="+model.getGhi_Chu();
		kq=DataUtil.executeNonQuery(sql);
		return kq;
	}
	public static Boolean deleteSanPham(SanPhamModel model){
		Boolean kq = false;
		try {
			String sql = "DELETE FROM SANPHAM WHERE ID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getID());
			ps.executeUpdate();
			kq = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}

}
