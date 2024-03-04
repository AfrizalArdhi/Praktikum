/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author afriz
 */
class Senar4 extends AlatMusik{
    
    public Senar4(String nama){
        super(nama);
    }
    
    @Override
    public void display(){
        System.out.println("Nama Alat Musik Senar 4\t= " + getNama());
    } 
    @Override
    public void caraMain(){
        System.out.println(getNama() + " dimainkan dengan cara digenjreng");
    }
    @Override
    public void dimainkan(){
        System.out.println(getNama() + " sedang dimainkan");
    }
}
