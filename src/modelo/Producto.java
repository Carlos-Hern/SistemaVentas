
package modelo;


public class Producto {
    int id;
    String nom;
    double precio;
    int cant;
    String est;

    public Producto() {
    }

    public Producto(int id, String nom, double precio, int cant, String est) {
        this.id = id;
        this.nom = nom;
        this.precio = precio;
        this.cant = cant;
        this.est = est;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }
    
    
}
