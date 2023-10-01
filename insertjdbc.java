import java.sql.*;
class insertjdbc
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

		 String q= "create table table1(tid int(20) primary key auto_increment,tname varchar(200) not null,tcity varchar(400))";
		 //create statement
		 Statement stmt=Con.createStatement();
		 stmt.executeUpdate(q);
		 System.out.println("Connection");
		 Con.close();


	}
	catch(Exception e)
	{

     e.printStackTrace();
	}
	
	}
}