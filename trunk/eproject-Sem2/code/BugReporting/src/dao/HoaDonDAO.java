package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DataUtil;

import model.HoaDonModel;
import model.KhachHangModel;
import model.ThanhVienModel;



public class HoaDonDAO {
	public static ArrayList<HoaDonModel> getAllKhachHang(){
ArrayList<HoaDonModel> listHoaDon = new ArrayList<HoaDonModel>();
		
		try 
		{
			String sql = "SELECT * FROM HOADON";
			ResultSet rs = DataUtil.executeQuery(sql);		
			while(rs.next()) 
			{
				HoaDonModel model = new HoaDonModel();	
				
				model.setID(rs.getString("ID"));
				model.setNgay_Lap(rs.getString("Ngay_Lap"));
				model.setMa_Nhan_Vien(rs.getString("Ma_Nhan_Vien"));
				model.setMa_Khach_Hang(rs.getString("Ma_Khach_Hang"));
				model.setSo_Luong(rs.getString("So_Luong"));
				model.setGhi_Chu(rs.getString("Ghi_Chu"));	
				
				listHoaDon.add(model);
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static ArrayList<HoaDonModel> searchHoaDon(String Ma_HD){
		ArrayList<HoaDonModel> listHoaDon = new ArrayList<HoaDonModel>();
		try {
			String sql = "SELECT ID FROM HOADON WHERE ID LIKE '%"+Ma_HD+"%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
			while (rs.next()){
				HoaDonModel model = new HoaDonModel();
				model.setID(rs.getString("ID"));
				model.setNgay_Lap(rs.getString("Ngay_Lap"));
				model.setMa_Nhan_Vien(rs.getString("Ma_Nhan_Vien"));
				model.setMa_Khach_Hang(rs.getString("Ma_Khach_Hang"));
				model.setSo_Luong(rs.getString("So_Luong"));
				model.setGhi_Chu(rs.getString("Ghi_Chu"));
				listHoaDon.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  null;
	}
	public static Boolean insertHoaDon(HoaDonModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO HOADON VALUES (?,?,?,?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getID());
				ps.setString(2, model.getNgay_Lap());
				ps.setString(3, model.getMa_Nhan_Vien());
				ps.setString(4, model.getMa_Khach_Hang());
				ps.setString(5, model.getSo_Luong());
				ps.setString(6, model.getGhi_Chu());
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return kq;
	}
	public static Boolean updateHoaDon(HoaDonModel model){
		Boolean kq = false;
		String sql = "Update HOADON set Ngay_Lap= '" + model.getNgay_Lap()
											+"', Ma_Nhan_Vien='"+model.getMa_Nhan_Vien()
											+"', Ma_Khach_Hang='"+model.getMa_Khach_Hang()
											+"', So_Luong='"+model.getSo_Luong()
											+"', Ghi_Chu="+model.getGhi_Chu();
		kq=DataUtil.executeNonQuery(sql);
		return kq;
	}
	public static Boolean deleteHoaDon(HoaDonModel model){
		Boolean kq = false;
		try {
			String sql = "DELETE FROM HOADON WHERE ID = ?";
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
