
package modelo;

public class EntidadVendedor {
    int id;
    String dpi;
    String nom;
    String tel;
    String estado;
    String user;

    public EntidadVendedor() {
    }

    public EntidadVendedor(int id, String dpi, String nom, String tel, String estado, String user) {
        this.id = id;
        this.dpi = dpi;
        this.nom = nom;
        this.tel = tel;
        this.estado = estado;
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
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

   // void setEstado(String string) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
    
    
}
