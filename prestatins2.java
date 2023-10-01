//input take from user
import java.io.*;
import java.sql.*;
 
 class prestatins2
 {
 	public static void main(String[] args) {
 		try
 		{
 				Class.forName("com.mysql.jdbc.Driver");
			String Url="jdbc:mysql://localhost:3306/youtube";
			String Username="root";
			String Password="root";
		
		Connection Con =DriverManager.getConnection(Url,Username,Password);
		//insert query
		String q= "insert into table1(tname,tcity) values(?,?)";
		PreparedStatement pstmt=Con.prepareStatement(q);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name");
		String name=br.readLine();
		System.out.println("city");
		String city=br.readLine();
		pstmt.setString(1,name);
		pstmt.setString(2,city);
		pstmt.executeUpdate();


 		}
 		catch(Exception e)
 		{
         e.printStackTrace();
 		}
 	}
 }