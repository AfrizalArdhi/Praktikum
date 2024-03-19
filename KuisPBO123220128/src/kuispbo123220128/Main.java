/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo123220128;

import javax.swing.*;
/**
 *
 * @author Lab Informatika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI g = new GUI();
    }
    
    
    
}
class GUI extends JFrame{
        JLabel lNamaKategori = new JLabel("Kategori");
        JRadioButton rbtn1 = new JRadioButton("Animasi");
        JRadioButton rbtn2 = new JRadioButton("Menulis");
        
        JLabel lNama = new JLabel("Nama");
        JTextField fNama = new JTextField(20);
        
        JLabel lAsalSekolah = new JLabel("Asal Sekolah");
        JTextField fAsalSekolah = new JTextField(20);
        
        JLabel lAlurCerita = new JLabel("AlurCerita");
        JTextField fAlurCerita = new JTextField(20);
        
        JLabel lKonten = new JLabel("Konten");
        JTextField fKonten = new JTextField(20);
        
        JLabel lKreativitas = new JLabel("Kreativitas");
        JTextField fKreativitas = new JTextField(20);
        
        JLabel lSinematografi = new JLabel("Sinematografi");
        JTextField fSinematografi = new JTextField(20);
        
        JButton bHasilAkhir = new JButton("Hasil");
        JButton bUbahNilai = new JButton("Ubah");
        JButton bKeluarProgram = new JButton("Keluar");
        
        
        
        
        public GUI(){
            setTitle("Lomba");
            setSize(400, 500);
            
            ButtonGroup group = new ButtonGroup();
            group.add(rbtn1);
            group.add(rbtn2);
        
            setLayout(null);
            add(lNamaKategori);
            add(rbtn1);
            add(rbtn2);
            add(lNama);
            add(fNama);
            add(lAsalSekolah);
            add(fAsalSekolah);
            
            add(lAlurCerita);
            add(fAlurCerita);
            add(lKonten);
            add(fKonten);
            add(lKreativitas);
            add(fKreativitas);
            add(lSinematografi);
            add(fSinematografi);
            
            add(bHasilAkhir);
            add(bUbahNilai);
            add(bKeluarProgram);
            
            lNamaKategori.setBounds(10, 10, 50, 30);
            rbtn1.setBounds(100, 10, 150, 30);
            rbtn2.setBounds(200, 10, 150, 30);
            
            lNama.setBounds(10, 50, 150, 30);
            fNama.setBounds(100, 50, 150, 30);
            
            lAsalSekolah.setBounds(10, 90, 150, 30);
            fAsalSekolah.setBounds(100, 90, 150, 30);
            
            lAlurCerita.setBounds(10, 140, 150, 30);
            fAlurCerita.setBounds(100, 140, 150, 30);
            
            lKonten.setBounds(10, 190, 150, 30);
            fKonten.setBounds(100, 190, 150, 30);
            
            lKreativitas.setBounds(10, 240, 150, 30);
            fKreativitas.setBounds(100, 240, 150, 30);
            
            lSinematografi.setBounds(10, 290, 150, 30);
            fSinematografi.setBounds(100, 290, 150, 30);
            
            bHasilAkhir.setBounds(10, 340, 70, 30);
            bUbahNilai.setBounds(150, 340, 70, 30);
            bKeluarProgram.setBounds(290, 340, 90, 30);
            
            setVisible(true);
            setDefaultCloseOperation(3);
            setLocationRelativeTo(null);
        }
    }
