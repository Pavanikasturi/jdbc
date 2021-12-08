import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Main {

	public static void main(String[] args) {
	
		
		
		try {
			
			
			//1 Connection create
			
			Connection  mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
			
			
			// 2 Create Statement
			
			
			Statement mystate = (Statement) mycon.createStatement();
			
			
			//3 Query execute
			
			ResultSet rs = mystate.executeQuery("select * from employee");
			
			while(rs.next())
			{
				System.out.println(rs.getNString("empname")+ " "+rs.getNString("emprole"));
			}
			
		} catch(Exception e)
		{
			
			e.printStackTrace();
		}

	}

}




