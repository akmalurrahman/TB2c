/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;


public class LingkunganRuangKelas extends JumlahKondisidanPosisiSarana{
	
	
	
	 void InputLingkunganKelas(){
		 
			
	       System.out.println("Kondisi Lantai : ");
	       setKondisiLantai(scan.nextLine());
	       
	       System.out.println("Kondisi Dinding : ");
	       setKondisiDinding(scan.nextLine());
	       
	       System.out.println("Kondisi Atap : ");
	       setKondisiAtap(scan.nextLine());
	       
	       System.out.println("Kondisi Pintu : ");
	       setKondisiPintu(scan.nextLine());
	       
	       System.out.println("Kondisi Jendela : ");
	       setKondisiJendela(scan.nextLine());
	   }
	 
	 void AnalysisLingkunganRuangKelas(){
	       String KondisiRuangKelas = "Bersih";
	       
	       if(KondisiRuangKelas.equals(getKondisiLantai())){
	    	   System.out.println("Sudah Sesuai Standard ");
	       }
	    	   else{
		           System.out.println(" Belum Sesuai Standard ");
		       } 
	       if(KondisiRuangKelas.equals(getKondisiDinding())){
	    	   System.out.println("Sudah Sesuai Standard ");
	       }
	    	   else{
		           System.out.println(" Belum Sesuai Standard ");
		       } 
	       if(KondisiRuangKelas.equals(getKondisiAtap())){
	    	   System.out.println("Sudah Sesuai Standard ");
	       }
	    	   else{
		           System.out.println("Belum Sesuai Standard");
		       } 
	       if(KondisiRuangKelas.equals(getKondisiPintu())){
	    	   System.out.println("Sudah Sesuai Standard");
	       }
	    	   else{
		           System.out.println("Belum Sesuai Standard");
		       } 
	       if(KondisiRuangKelas.equals(getKondisiJendela())){
	      
	       System.out.println("Sudah Sesuai Standard");
	       }
	    	   else{
		           System.out.println("Belum Sesuai Standard");
		       } 
	           	   
	       }
	 
	 void OutputLingkunganKelas(){
		 System.out.println("== Lingkungan Kelas ==");
		 System.out.println("Kondisi Lantai : " + getKondisiLantai());
		 System.out.println("Kondisi Dinding : " + getKondisiDinding());
		 System.out.println("Kondisi Atap : " + getKondisiAtap());
		 System.out.println("Kondisi Pintu : " + getKondisiPintu());
		 System.out.println("Kondisi Jendela : " + getKondisiJendela());
	 }
}

