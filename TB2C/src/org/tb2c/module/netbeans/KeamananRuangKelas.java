/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;

public class KeamananRuangKelas extends KenyamananRuangKelas{
	
	
	
	void InputKeamananRuangKelas(){
	   	
	System.out.println("Kekokohan dalam kelas : ");
        setKekokohan(scan.nextLine());
        
        System.out.println("Kelengkapan Kunci Pintu :  ");
        setKunciPintu(scan.nextLine());
        
        System.out.println("Kelengkapan Kunci Jendela :  ");
        setKunciJendela(scan.nextLine());
        
        System.out.println("Bahaya dalam kelas : ");
        setBahaya(scan.nextLine());
   }
	
   void AnalysisKeamananRuangKelas(){
	   String Kekokohan = "Kokoh";
	   String KunciPintu = "Ada";
	   String KunciJendela = "Ada";
	   String Bahaya = "Aman";
   
   if(Kekokohan.equals(getKekokohan())){
       System.out.println("Sudah Sesuai");
   }
   else{
       System.out.println("Belum Sesuai ");
   }
  
   if(KunciPintu.equals(getKunciPintu())){
       System.out.println("Sudah Sesuai");
   }
   else{
       System.out.println("Belum Sesuai ");
   }
  
   if(KunciJendela.equals(getKunciJendela())){
       System.out.println("Sudah Sesuai");
   }
   else{
       System.out.println("Tidak Sesuai ");
   }
   if(Bahaya.equals(getBahaya())){
	  System.out.println("Sudah Sesuai");
   }
   else{
	  System.out.println("Belum Sesuai");
   }
}
   
   void OutputKeamananRuangKelas(){
       
  System.out.println("== Keamanan Ruang Kelas ==");
  System.out.println("Kekokohan : " + getKekokohan());
  System.out.println("Kunci Pintu : " + getKunciPintu());
  System.out.println("Kunci Jendela : " + getKunciJendela());
  System.out.println("Bahaya : " + getBahaya());
    }  

}

