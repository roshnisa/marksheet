package marksheet.in.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MarksheetModel {

	public static void add(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "mom992688");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("INSERT INTO Marksheet VALUES(?,?,?,?,?,?,?)");
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getRollno());
		ps.setString(3, bean.getFirstName());
		ps.setString(4, bean.getLastName());
		ps.setInt(5, bean.getPhy());
		ps.setInt(6, bean.getChem());
		ps.setInt(7, bean.getMaths());
		ps.executeUpdate();
		conn.commit();

		System.out.println("record inserted");
		ps.close();
		conn.close();
	}
	public static void update(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "mom992688");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("update marksheet set fname=? where id=?");
		ps.setInt(2,bean.getId());
		ps.setString(1, bean.getFirstName());
		
		ps.executeUpdate();
		conn.commit();
		System.out.println("record updated");
		ps.close();
		conn.close();
	}
    public static void delete(MarksheetBean bean) throws Exception{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","mom992688");
	conn.setAutoCommit(false);
	PreparedStatement ps = conn.prepareStatement("delete from marksheet where id=?");
	ps.setInt(1, bean.getId());
	ps.executeUpdate();
	conn.commit();
	System.out.println("record delete");
	ps.close();
	conn.close();
	}
    public static void testget(MarksheetBean bean) throws Exception {
    	Class.forName("com.mysql.jdbc.Driver").newInstance();
    	Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","mom992688");
    	conn.setAutoCommit(false);
    	PreparedStatement ps = conn.prepareStatement("select * from marksheet where id=?");
    	int id=1;
    	ps.setInt(1, bean.getId());
    	ResultSet rs = ps.executeQuery();
    	while(rs.next()) {
    	System.out.print(rs.getInt(1));
    	System.out.print("\t"+rs.getString(2));
    	System.out.print("\t"+rs.getString(3));
    	System.out.print("\t"+rs.getString(4));
    	System.out.print(rs.getInt(5));
    	System.out.print(rs.getInt(6));
    	System.out.println(rs.getInt(7));
    }
    	ps.executeQuery();
    	conn.commit();
    	System.out.println("rcord get");
    	ps.close();
    	conn.close();
    }
    public static void Maritlist(MarksheetBean bean) throws Exception {
    	Class.forName("com.mysql.jdbc.Driver").newInstance();
    	Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","mom992688");
    	conn.setAutoCommit(false);
    	PreparedStatement ps = conn.prepareStatement("select *,(physics+chemistry+maths)as toatal,(((physics+chemistry+maths)/300)*100)as percentage from marksheet where((physics+chemistry+maths)/300*100)>=40 order by percentage desc limit 0,10;");
    	//ps.setInt();
    	ResultSet rs = ps.executeQuery();
    	System.out.println("STD_ID\tROLLNO\tFNAME\tPHYICS\tCHEMISTRY\tMATHS\tTOTAL\tPERCENTAGE");
    	while(rs.next()) {
    	System.out.print(rs.getInt(1));
    	System.out.print("\t"+rs.getString(2));
    	System.out.print("\t"+rs.getString(3));
    	System.out.print("\t"+rs.getString(4));
    	System.out.print("\t"+rs.getInt(5));
    	System.out.print("\t"+rs.getInt(6));
    	System.out.print("\t"+rs.getInt(7));
    	System.out.print("\t"+rs.getString(8));
    	System.out.println("\t"+rs.getString(9)+"%");
    }
    	ps.executeQuery();
    	conn.commit();
    	System.out.println("record maritlist");
    	ps.close();
    	conn.close();
    
    }
    public static void search(MarksheetBean bean) throws Exception {
    	Class.forName("com.mysql.jdbc.Driver").newInstance();
    	Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","mom992688");
    	conn.setAutoCommit(false);
    	PreparedStatement ps = conn.prepareStatement("select * from marksheet where fname=?");
    	ps.setString(1, bean.getFirstName());
    	ResultSet rs = ps.executeQuery();
    	while(rs.next()) {
    	System.out.print(rs.getInt(1));
    	System.out.print("\t"+rs.getString(2));
    	System.out.print("\t"+rs.getString(3));
    	System.out.print("\t"+rs.getString(4));
    	System.out.print(rs.getInt(5));
    	System.out.print(rs.getInt(6));
    	System.out.println(rs.getInt(7));
    }
    	ps.executeQuery();
    	conn.commit();
    	System.out.println("rcord Search");
    	ps.close();
    	conn.close();
    	
    }








































}

