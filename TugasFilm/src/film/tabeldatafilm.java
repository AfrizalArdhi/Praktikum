/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package film;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author afriz
 */
public class tabeldatafilm extends AbstractTableModel{

    List<datafilm> df;
    public tabeldatafilm(List<datafilm>df){
        this.df = df;
    }
    @Override
    public int getRowCount() {
        return df.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Judul";
            case 1:
                return "Alur";
            case 2:
                return "Penokohan";
            case 3: 
                return "Akting";
            case 4: 
                return "Nilai";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return df.get(row).getJudul();
            case 1:
                return df.get(row).getAlur();
            case 2:
                return df.get(row).getPenokohan();
            case 3: 
                return df.get(row).getAkting();
            case 4: 
                return df.get(row).getNilai();
            default:
                return null;
        }
    }
    
}
