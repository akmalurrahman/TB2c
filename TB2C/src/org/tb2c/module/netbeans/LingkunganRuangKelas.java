/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;


public class LingkunganRuangKelas extends JumlahKondisidanPosisiSarana{
	
	
	
	 void InputLingkunganKelas(){
		 
			
	       System.out.println("Kondisi Lantai : ");
	       data.setKondisiLantai(scan.nextLine());
	       
	       System.out.println("Kondisi Dinding : ");
	       data.setKondisiDinding(scan.nextLine());
	       
	       System.out.println("Kondisi Atap : ");
	       data.setKondisiAtap(scan.nextLine());
	       
	       System.out.println("Kondisi Pintu : ");
	       data.setKondisiPintu(scan.nextLine());
	       
	       System.out.println("Kondisi Jendela : ");
	       data.setKondisiJendela(scan.nextLine());
	   }
	 
	 void AnalysisLingkunganRuangKelas(){
	       String KondisiRuangKelas = "Bersih";
	       
	       if(KondisiRuangKelas.equals(data.getKondisiLantai())){
	    	   System.out.println("Sudah Sesuai Standard ");
	       }
	    	   else{
		           System.out.println(" Belum Sesuai Standard ");
		       } 
	       if(KondisiRuangKelas.equals(data.getKondisiDinding())){
	    	   System.out.println("Sudah Sesuai Standard ");
	       }
	    	   else{
		           System.out.println(" Belum Sesuai Standard ");
		       } 
	       if(KondisiRuangKelas.equals(data.getKondisiAtap())){
	    	   System.out.println("Sudah Sesuai Standard ");
	       }
	    	   else{
		           System.out.println("Belum Sesuai Standard");
		       } 
	       if(KondisiRuangKelas.equals(data.getKondisiPintu())){
	    	   System.out.println("Sudah Sesuai Standard");
	       }
	    	   else{
		           System.out.println("Belum Sesuai Standard");
		       } 
	       if(KondisiRuangKelas.equals(data.getKondisiJendela())){
	      
	       System.out.println("Sudah Sesuai Standard");
	       }
	    	   else{
		           System.out.println("Belum Sesuai Standard");
		       } 
	           	   
	       }
	 
	 void OutputLingkunganKelas(){
		 System.out.println("== Lingkungan Kelas ==");
		 System.out.println("Kondisi Lantai : " + data.getKondisiLantai());
		 System.out.println("Kondisi Dinding : " + data.getKondisiDinding());
		 System.out.println("Kondisi Atap : " + data.getKondisiAtap());
		 System.out.println("Kondisi Pintu : " + data.getKondisiPintu());
		 System.out.println("Kondisi Jendela : " + data.getKondisiJendela());
	 }
}

