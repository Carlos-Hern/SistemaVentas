
package modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VendedorDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con = new Conexion();
    Connection acceso;
    
    public EntidadVendedor ValidadVendedor(String dpi, String user){
         EntidadVendedor ev = new EntidadVendedor();
        String sql = "select * from vendedor where Dpi like? and User like?";
        
        try {
          acceso=con.Conectar();
          ps= acceso.prepareStatement(sql);
          ps.setString(1, dpi);
          ps.setString(2, user);
          rs=ps.executeQuery();
          while (rs.next()){
              ev.setId(rs.getInt(1));
              ev.setDpi(rs.getString(2));
              ev.setNom(rs.getString(3));
              ev.setTel(rs.getString(4));
              ev.setEstado(rs.getString(5));
              ev.setUser(rs.getString(6));
          }
          
        } catch (Exception e){
            
        }
        
        return ev;
        
    }
}
