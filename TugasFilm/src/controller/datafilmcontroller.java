/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import DAOdatafilm.datafilmDAO;
import DAOImplement.datafilmimplement;
import film.*;
import mainView.MainView;
/**
 *
 * @author afriz
 */
public class datafilmcontroller {
    MainView frame;
    datafilmimplement impldatafilm;
    List<datafilm> df;
    
    public datafilmcontroller(MainView frame){
        this.frame = frame;
        impldatafilm = new datafilmDAO();
        df = impldatafilm.getALL();
        
    }
    
    public void isiTabel(){
        df = impldatafilm.getALL();
        tabeldatafilm tf = new tabeldatafilm(df);
        frame.getTabelData().setModel(tf);
    }
    
    public void insert(){
        datafilm df = new datafilm();
        df.setJudul(frame.getJTxJudul().getText());
        df.setAlur(Double.parseDouble(frame.getJTxAlur().getText()));
        df.setPenokohan(Double.parseDouble(frame.getJTxPenokohan().getText()));
        df.setAkting(Double.parseDouble(frame.getJTxAkting().getText()));
        
        impldatafilm.insert(df);
    }
    
    public void update(){
        datafilm df = new datafilm();
        
        df.setJudul(frame.getJTxJudul().getText());
        df.setAlur(Double.parseDouble(frame.getJTxAlur().getText()));
        df.setPenokohan(Double.parseDouble(frame.getJTxPenokohan().getText()));
        df.setAkting(Double.parseDouble(frame.getJTxAkting().getText()));
        
        impldatafilm.update(df);
    }
    
    public void delete(){
        String judul = frame.getJTxJudul().getText();
        impldatafilm.delete(judul);
    }
   
}
