import java.sql.*;
import java.io.*;
class insertimage
{
	public static void main(String[] args) {
		
	try
   {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","root");
    String q="insert into images(pic) values(?)";
    PreparedStatement pstmt=con.prepareStatement(q);
   // pstmt.setString();
    FileInputStream fis=new FileInputStream("free.jpg");
    pstmt.setBinaryStream(1,fis,fis.available());
    pstmt.executeUpdate();
    System.out.println("done");
   }
   catch(Exception e)
   {
   	System.out.println("error");
   }
}
}