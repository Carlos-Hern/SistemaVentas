
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class VendedorDAOO implements CRUD {
    Connection  con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<Vendedor> lista = new ArrayList();
        String sql = "select * from vendedor";
         try{
             con=cn.Conectar();
             ps=con.prepareStatement(sql);
             rs = ps.executeQuery();
             
             while (rs.next()){
                 Vendedor c= new Vendedor();
                 c.setId(rs.getInt(1));
                 c.setDpi(rs.getString(2));
                 c.setNom(rs.getString(3));
                 c.setTel(rs.getString(4));
                 c.setEst(rs.getString(5));
                 c.setUser(rs.getString(6));
                 lista.add(c);
             }
             
         }catch (Exception e){   
         }
         return lista;
    }

    @Override
    public int add(Object[] o) {
        int r =0;
        String sql="insert into vendedor(Dpi, Nombre, Telefono, Estado, User)values(?,?,?,?,?)";
         try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();
            
        } catch (Exception e) {   
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql="update vendedor set Dpi=?, Nombre=?, Telefono=?, Estado=?, User=?, where IdVendedor=?" ;
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();
        } catch (Exception e){   
        }
        return r;
        
    }

    @Override
    public void eliminar(int id) {
        String sql="delete from vendedor where IdVendedor=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e){  
        }
    }
    
}
