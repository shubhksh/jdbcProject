import java.sql.*;
class prestatins
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
		pstmt.setString(1,"Ekansh");
		pstmt.setString(2,"Bhopal");
		pstmt.executeUpdate();

    System.out.println("all good");
       }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}