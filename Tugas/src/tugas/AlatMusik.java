/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author afriz
 */

abstract class AlatMusik implements DetailAlat{
    private String nama;
        
    public AlatMusik(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    abstract void dimainkan();
    
    void display(){
        System.out.println("Nama Alat: " + this.nama);
    }
    
}
