package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String DBHelper = "jdbc:mysql://localhost:3306/javatest";
		Connection conn = null;
		ArrayList<Persona> personas = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DBHelper, "root","");
			System.out.println("Conecto");
			
			//java.sql.Statement st = conn.createStatement();
			//PreparedStatement st = conn.prepareStatement("INSERT INTO personas ( nombre, apellido, edad) VALUES ('Pepe','Argento','50' )");
			//st.execute();
			PreparedStatement st2 = conn.prepareStatement("SELECT * FROM personas");

			ResultSet rs = st2.executeQuery();
			while(rs.next()){
				personas.add(new Persona(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
			}
			personas.stream().forEach(p -> System.out.println(p));
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
