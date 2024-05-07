/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplement;
import java.util.List;
import film.*;

/**
 *
 * @author afriz
 */
public interface datafilmimplement {
    public void insert(datafilm f);
    public void update(datafilm f);
    public void delete(String f);
    public List<datafilm> getALL();
    
    
}
