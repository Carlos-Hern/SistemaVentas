
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO implements CRUD{
    Connection  con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Producto> lista = new ArrayList();
        String sql = "select * from producto";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                 Producto c= new Producto();
                 c.setId(rs.getInt(1));
                 c.setNom(rs.getString(2));
                 c.setPrecio(rs.getDouble(3));
                 c.setCant(rs.getInt(4));
                 c.setEst(rs.getString(5));
                 lista.add(c);
            }
        }catch (Exception e){      
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql="insert into producto(Nombre, Precio, Stock, Estado)values(?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r=ps.executeUpdate();
            
        } catch (Exception e) {   
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql="update producto set Nombre=?, Precio=?, Stock=?, Estado=?, where IdProducto=?" ;
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r=ps.executeUpdate();
        } catch (Exception e){   
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql="delete from producto where IdProducto=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e){  
        }
    }
    
    
}
