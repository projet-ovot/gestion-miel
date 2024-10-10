package departement;
import base.Connexion;
import java.util.*;
import java.sql.*;
import base.Connexion;

public class Produit {
     int id;
     String designation;
     String description;

    public Produit(int id, String designation, String description) {
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

    public static List<Produit> getAll() throws SQLException {
        Connection conn = new Connexion().getConnection();
        String sql = "SELECT * FROM produit";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        List<Produit> produits = new ArrayList<>();
        while (rs.next()) {
            Produit produit = new Produit(
                rs.getInt("id"),
                rs.getString("designation"),
                rs.getString("description")
            );
            produits.add(produit);
        }
        return produits;
    }

    public static Produit getById(int idProduit) throws SQLException {
        Connection conn = new Connexion().getConnection();
        String sql = "SELECT * FROM produit WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, idProduit);

        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return new Produit(
                rs.getInt("id"),
                rs.getString("designation"),
                rs.getString("description")
            );
        } else {
            return null;
        }
    }
}
