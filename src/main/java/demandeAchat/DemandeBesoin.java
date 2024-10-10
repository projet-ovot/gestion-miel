package demandeAchat;




public class DemandeBesoin {
     String id;
     String date;
     String datyLivraison;
     int echeance;
     String motif;
     String description;
     String idDepartement;
     String idEmploye;

    public DemandeBesoin(String id, String date, String datyLivraison, int echeance, String motif, String description, String idDepartement, String idEmploye) {
        this.id = id;
        this.date = date;
        this.datyLivraison = datyLivraison;
        this.echeance = echeance;
        this.motif = motif;
        this.description = description;
        this.idDepartement = idDepartement;
        this.idEmploye = idEmploye;
    }

    
    public String getId() {
         return id; 
    }
    public void setId(String id) { 
        this.id = id; 
    }

    public String getDate() { 
        return date; 
    }
    public void setDate(String date) { 
        this.date = date; 
    }

    public String getdatyLivraison() { 
        return datyLivraison; 
    }
    public void setdatyLivraison(String datyLivraison) { 
        this.datyLivraison = datyLivraison; 
    }

    public int getEcheance() { 
        return echeance; 
    }
    public void setEcheance(int echeance) { 
        this.echeance = echeance; 
    }

    public String getMotif() { 
        return motif; 
    }
    public void setMotif(String motif) { 
        this.motif = motif; 
    }

    public String getDescription() {
         return description; 
    }
    public void setDescription(String description) { 
        this.description = description; 
    }

    public String getIdDepartement() { 
        return idDepartement; 
    }
    public void setIdDepartement(String idDepartement) { 
        this.idDepartement = idDepartement; 
    }

    public String getIdEmploye() { 
        return idEmploye; 
    }
    public void setIdEmploye(String idEmploye) { 
        this.idEmploye = idEmploye; 
    }
}
