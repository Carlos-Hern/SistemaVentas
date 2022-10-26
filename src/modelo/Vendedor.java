
package modelo;

public class Vendedor {
    int id;
    String dpi;
    String nom;
    String tel;
    String est;
    String user;

    public Vendedor() {
    }

    public Vendedor(int id, String dpi, String nom, String tel, String est, String user) {
        this.id = id;
        this.dpi = dpi;
        this.nom = nom;
        this.tel = tel;
        this.est = est;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
    
}
