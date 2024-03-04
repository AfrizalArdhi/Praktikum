/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;
//Afrizal Ardhi, 123220128
/**
 *
 * @author afriz
 */
public class Tugas{

    public static void main(String[] args) {
        // TODO code application logic her
        
        try{
            AlatMusik alat[] = new AlatMusik[3];
            alat[0] = new Senar6("Gitar Akustik");
            alat[1] = new Senar4("Ukulele");
            String alatcontoh = "Gitar Listrik";
            if(alatcontoh == null){
                throw new NullPointerException("Alat Tidak Boleh Null");
            }
            alat[2] = new Senar6(alatcontoh);
            
            for(int i = 0; i < 3; i++){
                alat[i].display();
                alat[i].caraMain();
                alat[i].dimainkan();
                System.out.println();
            }
        } catch (NullPointerException e){
            System.out.println("Exception: " + e.getMessage());
        }
        
        //ALAT MUSIK GENJRENG YANG MEMILIKI 4 DAN 6 SENAR
        
    }
    
}
