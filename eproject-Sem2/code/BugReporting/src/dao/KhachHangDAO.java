package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DataUtil;

import model.KhachHangModel;

public class KhachHangDAO {
	
	public static ArrayList<KhachHangModel> getAllKhachHang(){
		ArrayList<KhachHangModel> listKhachHang = new ArrayList<KhachHangModel>();
		
		try 
		{
			String sql = "SELECT * FROM KHACHHANG";
			ResultSet rs = DataUtil.executeQuery(sql);		
			while(rs.next()) 
			{
				KhachHangModel model = new KhachHangModel();	
				
				model.setID(rs.getString("ID"));
				model.setTen_Khach_Hang(rs.getString("Ten_Khach_Hang"));
				model.setDia_Chi(rs.getString("Dia_Chi"));
				model.setSo_Dien_Thoai(rs.getString("So_Dien_Thoai"));
				model.setGhi_Chu(rs.getString("Ghi_Chu"));	
				
				listKhachHang.add(model);
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static ArrayList<KhachHangModel> searchKhachHang(String Ten_KH){
		ArrayList<KhachHangModel> listKhachHang = new ArrayList<KhachHangModel>();
		try {
			String sql = "SELECT Ten_Khach_Hang FROM KHACHHANG WHERE Ten_Khach_Hang LIKE '%"+Ten_KH+"%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
			while (rs.next()){
				KhachHangModel model = new KhachHangModel();
				model.setID(rs.getString("ID"));
				model.setTen_Khach_Hang(rs.getString("Ten_Khach_Hang"));
				model.setDia_Chi(rs.getString("Dia_Chi"));
				model.setSo_Dien_Thoai(rs.getString("So_Dien_Thoai"));
				model.setGhi_Chu(rs.getString("Ghi_Chu"));
				listKhachHang.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  null;
	}
	public static Boolean insertKhachHang(KhachHangModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO KHACHHANG VALUES (?,?,?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getID());
				ps.setString(2, model.getTen_Khach_Hang());
				ps.setString(3, model.getDia_Chi());
				ps.setString(4, model.getSo_Dien_Thoai());
				ps.setString(5, model.getGhi_Chu());
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return kq;
	}
	public static Boolean updateKhachHang(KhachHangModel model){
		Boolean kq = false;
		String sql = "Update KHACHHANG set Ten_Khach_Hang= '" + model.getTen_Khach_Hang()
											+"', Dia_Chi='"+model.getDia_Chi()
											+"', So_Dien_Thoai='"+model.getSo_Dien_Thoai()
											+"', Ghi_Chu="+model.getGhi_Chu();
		kq=DataUtil.executeNonQuery(sql);
		return kq;
	}
	public static Boolean deleteKhachHang(KhachHangModel model){
		Boolean kq = false;
		try {
			String sql = "DELETE FROM KHACHHANG WHERE ID = ?";
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
