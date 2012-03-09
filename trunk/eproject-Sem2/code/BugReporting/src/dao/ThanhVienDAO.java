package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DataUtil;

import model.KhachHangModel;
import model.ThanhVienModel;
public class ThanhVienDAO {
	
	public static ArrayList<ThanhVienModel> getAllThanhVien(){
	ArrayList<ThanhVienModel> listThanhVien = new ArrayList<ThanhVienModel>();
		
		try 
		{
			String sql = "SELECT * FROM THANHVIEN";
			ResultSet rs = DataUtil.executeQuery(sql);		
			while(rs.next()) 
			{
				ThanhVienModel model = new ThanhVienModel();	
				
				model.setID(rs.getString("ID"));
				model.setTen_Dang_Nhap(rs.getString("Ten_Dang_Nhap"));
				model.setMa_Vai_Tro(rs.getString("Ma_Vai_Tro"));
				model.setGioi_Tinh(rs.getString("Gioi_Tinh"));
				model.setDia_Chi(rs.getString("Dia_Chi"));
				model.setSo_Dien_Thoai(rs.getString("So_Dien_Thoai"));
				model.setGhi_Chu(rs.getString("Ghi_Chu"));	
				
				listThanhVien.add(model);
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}
	public static Boolean updateThanhVien(ThanhVienModel model){
		Boolean kq = false;
		String sql = "Update THANHVIEN set Ten_Dang_Nhap= '" + model.getTen_Dang_Nhap()
											+"', Ma_Vai_Tro='"+model.getMa_Vai_Tro()
											+"', Gioi_Tinh='"+model.getGioi_Tinh()
											+"', Dia_Chi='"+model.getDia_Chi()
											+"', So_Dien_Thoai='"+model.getSo_Dien_Thoai()
											+"', Ghi_Chu="+model.getGhi_Chu();
		kq=DataUtil.executeNonQuery(sql);
		return kq;
	}
	public static Boolean insertThanhVien(ThanhVienModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO THANHVIEN VALUES (?,?,?,?,?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getID());
				ps.setString(2, model.getTen_Dang_Nhap());
				ps.setString(3, model.getMa_Vai_Tro());
				ps.setString(4, model.getGioi_Tinh());
				ps.setString(5, model.getDia_Chi());
				ps.setString(6, model.getSo_Dien_Thoai());
				ps.setString(7, model.getGhi_Chu());
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return kq;
	}
	public static Boolean deleteThanhVien(ThanhVienModel model){
		Boolean kq = false;
		try {
			String sql = "DELETE FROM THANHVIEN WHERE ID = ?";
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
	public static ArrayList<ThanhVienModel> searchThanhVien(String username){
		ArrayList<ThanhVienModel> listThanhVien = new ArrayList<ThanhVienModel>();
		try {
			String sql = "SELECT Ten_Dang_Nhap FROM THANHVIEN WHERE Ten_Dang_Nhap LIKE '%"+username+"%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
			while (rs.next()){
				ThanhVienModel model = new ThanhVienModel();
				model.setID(rs.getString("ID"));
				model.setTen_Dang_Nhap(rs.getString("Ten_Dang_Nhap"));
				model.setMa_Vai_Tro(rs.getString("Ma_Vai_Tro"));
				model.setGioi_Tinh(rs.getString("Gioi_Tinh"));
				model.setDia_Chi(rs.getString("Dia_Chi"));
				model.setSo_Dien_Thoai(rs.getString("So_Dien_Thoai"));
				model.setGhi_Chu(rs.getString("Ghi_Chu"));
				listThanhVien.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
