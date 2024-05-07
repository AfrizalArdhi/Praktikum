/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOdatafilm;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import film.*;
import DAOImplement.datafilmimplement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author afriz
 */
public class datafilmDAO implements datafilmimplement{
    Connection connection;
    
    final String select = "SELECT * FROM `movie`;";
    final String insert = "INSERT INTO `movie` (judul, alur, penokohan, akting, nilai) VALUES (?, ?, ?, ?, ?);";
    final String update = "update movie set judul=?, alur=?, penokohan=?, akting=?, nilai=? where judul=?";
    final String delete = "delete from movie where judul =?";
    
    public datafilmDAO(){
        connection = connector.connection();
    }
    

    @Override
    public void insert(datafilm f) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, f.getJudul());
            statement.setDouble(2, f.getAlur());
            statement.setDouble(3, f.getPenokohan());
            statement.setDouble(4, f.getAkting());
            
            double rating = (f.getAlur()+f.getPenokohan()+f.getAkting())/3;
            statement.setDouble(5, rating);
            
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            
            while(rs.next()){
                f.setJudul(rs.getString(1));
            }
            JOptionPane.showMessageDialog(null, "Successfully added data!");

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to add data!");

        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(datafilm f) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update);
            statement.setString(1, f.getJudul());
            statement.setDouble(2, f.getAlur());
            statement.setDouble(3, f.getPenokohan());
            statement.setDouble(4, f.getAkting());
            
            double rating = (f.getAlur()+f.getPenokohan()+f.getAkting())/3;
            statement.setDouble(5, rating);
            String dump = f.getJudul();
            statement.setString(6, dump);
            
            statement.executeUpdate();       
            JOptionPane.showMessageDialog(null, "Data updated successfully!");
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Data failed to update!");
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(String f) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            
            statement.setString(1, f);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data deleted successfully!");

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Data failed to delete!");

        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<datafilm> getALL() {
        List<datafilm> df = null;
        try{
            df = new ArrayList<datafilm>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                datafilm film = new datafilm();
                film.setJudul(rs.getString("Judul"));
                film.setAlur(rs.getDouble("Alur"));
                film.setPenokohan(rs.getDouble("Penokohan"));
                film.setAkting(rs.getDouble("Akting"));
                film.setNilai(rs.getDouble("Nilai"));
                df.add(film);
            }
            
        }catch(SQLException ex){
            Logger.getLogger(datafilmDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return df;
        
    }
}
