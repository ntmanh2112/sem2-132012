package util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.Scanner;

public class DataUtil {
	
	// Khai bao 4 bien
	public static Connection conn;
	public static String DATA = "";
	public static String USER_NAME = "";
	public static String PASSWORD = "";
	public static ResourceBundle BUNDLE = null;
	
	public static void readFileConfig(){
		
		try{
			Scanner scanner = new Scanner(new FileInputStream("ConfigDatabase/setting.properties"));
			int count = 1;
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				if(count ==1){
					DATA = line;
				} else if (count ==2){
					USER_NAME = line;
				} else if (count ==3){
					PASSWORD = line;
				}
				count ++;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	// Ham dung de tao cau noi den SQL Server
	public static void connect(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(DATA, USER_NAME, PASSWORD);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	// Dung de su dung sau nay
	public static Connection getConnection(){
		if (conn == null){
			connect();
		}
		return conn;
	}
	
	// Cong cu dung de noi chuyen voi SQL ==> chi ap dung cho cau truy van (SELECT)
	public static ResultSet executeQuery(String sql){
		try {
			connect();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			return rs;
		}
		catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	//Ham dung cho cac cau truy van (INSERT, UPDATE, DELETE)
	public static Boolean executeNonQuery(String sql){
		try {
			connect();
			Statement statement = conn.createStatement();
			statement.executeUpdate(sql);
			return true;
		}
		catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
}
