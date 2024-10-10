package departement;
import base.Connexion;
import java.util.*;
import java.sql.*;

public class Departement {
    int id;
    String designation;
    String description;

    public Departement(int id, String designation, String description) {
        this.id = id;
        this.designation = designation;
        this.description = description;
    }

 
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }


    public static List<Departement> getAll() throws SQLException {
        Connection conn = new Connexion().getConnection(); 
        String sql = "SELECT * FROM departement";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        List<Departement> departements = new ArrayList<>();
        while (rs.next()) {
            Departement dept = new Departement(
                rs.getInt("id"),
                rs.getString("designation"),
                rs.getString("description")
            );
            departements.add(dept);
        }
        return departements;
    }

    public static Departement getById(int idDepartement) throws SQLException {
        Connection conn = new Connexion().getConnection();
        String sql = "SELECT * FROM departement WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, idDepartement);

        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return new Departement(
                rs.getInt("id"),
                rs.getString("designation"),
                rs.getString("description")
            );
        } else {
            return null;
        }
    }
}
