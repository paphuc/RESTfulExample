package com.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Path("/json/acticle")
public class JSONService {

	@GET
	@Path("/get")
	@Produces("application/json")
	public List<Acticle> getProductInJSON() {
		List<Acticle> listall = new ArrayList();
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Where is your MySQL JDBC Driver?");
//			e.printStackTrace();			
//		}
//
//		System.out.println("\nMySQL JDBC Driver Registered!");
//		Connection connection = null;
//
//		try {
//			connection = DriverManager
//			.getConnection("jdbc:mysql://localhost:3306/travel","root", "123456");
//
//		} catch (SQLException e) {
//			System.out.println("Connection Failed! Check output console");
//			e.printStackTrace();
//		}		
//		
//		if (connection != null) {
//			System.out.println("You made it, take control your database now!");
//		} else {
//			System.out.println("Failed to make connection!");
//		}
//		// Táº¡o Ä‘á»‘i tÆ°á»£ng Statement.
//	      try {
//			Statement statement = connection.createStatement();
//			String sql = "Select * from TRAVEL";
//			 
//		      // Thuc thi cau lenh SQL tráº£ vá»� Ä‘á»‘i tÆ°á»£ng ResultSet.
//		      ResultSet rs = statement.executeQuery(sql);
//		 
//		      // Duyá»‡t trÃªn káº¿t quáº£ tráº£ vá»�.
//		      while (rs.next()) {// Di chuyá»ƒn con trá»� xuá»‘ng báº£n ghi káº¿ tiáº¿p.
//		          String Id = rs.getString(1);
//		          String Title = rs.getString(2);
//		          String Content = rs.getString(3);
//		          String Banner = rs.getString(4);
//		          String Description = rs.getString(5);
//		          String Date = rs.getString(6);
//		          String Summarize = rs.getString(7);
//		          String Author = rs.getString(8);		          
//		          System.out.println("--------------------");
//		          System.out.println("Id:" + Id);
//		          System.out.println("Title:" + Title);
//		          System.out.println("Content:" + Content);
//		          System.out.println("Banner:" + Banner);
//		          System.out.println("Description:" + Description);
//		          System.out.println("Date:" + Date);
//		          System.out.println("Summarize:" + Summarize);
//		          System.out.println("Author:" + Author);
//			  	  Acticle acticle1 = new Acticle();
//				  acticle1.setId(Id);
//				  acticle1.setTitle(Title);
//				  acticle1.setContent(Content);	
//				  acticle1.setBanner(Banner);			
//				  acticle1.setDescription(Description);			
//				  acticle1.setDate(Date);			
//				  acticle1.setSummarize(Summarize);			
//				  acticle1.setAuthor(Author);	
//				  listall.add(acticle1);
		Acticle acticle1 = new Acticle();
		  acticle1.setId("123");
		  acticle1.setTitle("Bai viet dau tien");
		  acticle1.setContent("This is a content");	
		  acticle1.setBanner("this is a banner");			
		  acticle1.setDescription("");			
		  acticle1.setDate("");			
		  acticle1.setSummarize("");			
		  acticle1.setAuthor("");	
		  listall.add(acticle1);
//
//		    	  
//		      }
//		      // Ä�Ã³ng káº¿t ná»‘i
//		      connection.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		return listall; 
	}

//	@POST
//	@Path("/post")
//	@Consumes("application/json")
//	public Response createActicleInJSON(Acticle acticle) {
//		System.out.println(acticle.id);
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Where is your MySQL JDBC Driver?");
//			e.printStackTrace();			
//		}
//
//		System.out.println("\nMySQL JDBC Driver Registered!");
//		Connection connection = null;
//
//		try {
//			connection = DriverManager
//			.getConnection("jdbc:mysql://localhost:3306/travel","root", "123456");
//
//		} catch (SQLException e) {
//			System.out.println("Connection Failed! Check output console");
//			e.printStackTrace();
//		}		
//		
//		if (connection != null) {
//			System.out.println("You made it, take control your database now!");
//		} else {
//			System.out.println("Failed to make connection!");
//		}
//		// Táº¡o Ä‘á»‘i tÆ°á»£ng Statement.
//		try {
//			Statement statement = connection.createStatement();
//			String sql = "Insert into TRAVEL (Id, Title, Content) "
//		              + " values ('"+ acticle.id +"', '"+ acticle.title +"', '"+ acticle.content +"') ";
////		              + " values ('1', '3', '4') ";
//		 
//		      // Thá»±c thi cÃ¢u lá»‡nh.
//		      // executeUpdate(String) sá»­ dá»¥ng cho cÃ¡c loáº¡i lá»‡nh Insert,Update,Delete.
//		      int rowCount = statement.executeUpdate(sql);
//		 
//		      // In ra sá»‘ dÃ²ng Ä‘Æ°á»£c trÃ¨n vÃ o bá»Ÿi cÃ¢u lá»‡nh trÃªn.
//		      System.out.println("Row Count affected = " + rowCount);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		String output = acticle.toString();
//	    return Response.status(200).entity(output).build();
//	}	
}