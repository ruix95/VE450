package com.johnny.test;
import org.postgresql.*;
import java.sql. * ;

public class HelloWorld{
	   /* (non-Java-doc)
		 * @see javax.servlet.http.HttpServlet#HttpServlet()
		 */
		public HelloWorld() {
			super();
		}   	
		 public String gogogo()
	     {
			 String byebye = " ";
	         try 
	          {
	        	System.out.println("ahhhh");
	            Class.forName("org.postgresql.Driver").newInstance();
	            System.out.println("ahhhh");
	            String url = "jdbc:postgresql://localhost:5432/example_db" ;
	            System.out.println("ahhhh");
	            Connection con = DriverManager.getConnection(url, "postgres" , "123456");
	            System.out.println(con);
	            Statement st = con.createStatement();
	            String sql = "select * from equipment";
	            ResultSet rs = st.executeQuery(sql);
	            if (rs.next()) {
	            	byebye = rs.getString("name");
	            	System.out.println(rs.getString("name"));
	            }
	            /*while (rs.next())
	              {
	                System.out.println(rs.getString("name"));
	            }*/ 
	            rs.close();
	            st.close();
	            con.close();
	            return (byebye);

	        } 
	         catch (Exception ee)
	         {
	            System.out.print("errrrrro");
	        }
			return null;
	    } 
}