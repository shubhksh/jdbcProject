import java.sql.*;
class firstjdbc
{
	public static void main(String[] args)
	 {
		try{

			Class.forName("com.mysql.jdbc.Driver");
			String Url="jdbc:mysql://localhost:3306/youtube";
			String Username="root";
			String Password="root";
		
		Connection Con =DriverManager.getConnection(Url,Username,Password);
		if (Con.isClosed())
		 {
			System.out.println("connect error");
		}
		else
		{
			System.out.println("establishedee");
			
		}
	}
		catch(Exception e){
			e.printStackTrace();

		}
		}
	}
