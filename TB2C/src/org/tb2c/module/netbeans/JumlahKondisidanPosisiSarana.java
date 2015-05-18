/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;

public class JumlahKondisidanPosisiSarana extends KondisiRuangKelas{
	 	
	    
	
	void InputJumlahKondisidanPosisiSarana(){
		
		
			System.out.println("Masukkan jumlah stop kontak : ");
	        data.setJumlahStopKontak(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi stop kontak : ");
	        data.setKondisiStopKontak(scan.nextLine());
	        
	        System.out.println("Masukkan posisi stop kontak :  ");
	        data.setPosisiStopKontak(scan.nextLine());
	        
	        System.out.println("Masukkan jumlah kabel LCD : ");
	        data.setJumlahKabel_LCD(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi kabel LCD : ");
	        data.setKondisiKabel_LCD(scan.nextLine());
	        
	        System.out.println("Masukkan posisi kabel LCD : ");
	        data.setPosisiKabel_LCD(scan.nextLine());
	        
	        System.out.println("Masukkan jumlah lampu : ");
	        data.setJumlahLampu(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi lampu : ");
	        data.setKondisiLampu(scan.nextLine());
	        
	        System.out.println("Masukkan posisi lampu : ");
	        data.setPosisiLampu(scan.nextLine());
	        
	        System.out.println("Masukkan SSID : ");
	        data.setSSID(scan.nextLine());
	        
	        System.out.println("Masukkan Login : ");
	        data.setLogin(scan.nextLine());
	        
	       	System.out.println("Masukkan Bandwidth : ");
	        data.setBandwidth(scan.nextInt());
	        
	        System.out.println("Masukkan jumlah kipas angin : ");
	        data.setJumlahKipasAngin(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi kipas angin  : ");
	        data.setKondisiKipasAngin(scan.nextLine());
	        
	        System.out.println("Masukkan posisi kipas angin : ");
	        data.setPosisiKipasAngin(scan.nextLine());
	        
	        System.out.println("Masukkan jumlah AC : ");
	        data.setJumlah_AC(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi AC : ");
	        data.setKondisi_AC(scan.nextLine());
	        
	        System.out.println("Masukan posisi AC : ");
	        data.setPosisi_AC(scan.nextLine());
	        
	        System.out.println("Masukkan jumlah CCTV : ");
	        data.setJumlah_CCTV(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi CCTV : ");
	        data.setKondisi_CCTV(scan.nextLine());
	        
	        System.out.println("Masukkan posisi CCTV : ");
	        data.setPosisi_CCTV(scan.nextLine());       
	}

	void AnalysisJumlahKondisidanPosisiSarana(){
			String KondisiStopKontak = "Berfungsi dengan baik";
	        String PosisiStopKontak1 = "Di pojokkan ruangan";
	        String PosisiStopKontak2 = "Dekat dosen";
	        String KondisiKabel_LCD = "Berfungsi dengan baik";
	        String PosisiKabel_LCD = "Dekat dosen";
	        String KondisiLampu= "Berfungsi dengan baik";
	        String PosisiLampu = "Diatap ruangan";
	        String KondisiKipasAngin = "Berfungsi dengan baik";
	        String PosisiKipasAngin = "Di atap ruangan";
	      	String Kondisi_AC = "Berfungsi dengan baik";
	        String Posisi_AC1= "Di belakang";
	        String Posisi_AC2= "Di samping";
	      	String SSID = "UMM Hotspot";
	      	String Login = "Bisa Login";
	      	String Kondisi_CCTV = "Berfungsi dengan baik";
	        String Posisi_CCTV1 = "Di depan";
	        String Posisi_CCTV2 = "Di belakang";
	
	        if(data.getJumlahStopKontak() >= 4){
	            System.out.println("Sudah Sesuai Standard");
	        }
	        
	        else{
	        	System.out.println("Belum Sesuai Standard");
	        }
	        
	       if(KondisiStopKontak.equals(data.getKondisiStopKontak())){
	              System.out.println(" Sudah Sesuai Standard ");
	            }
	                
	       else {
	            System.out.println("Belum Sesuai Standard ");
	        }
	        
	       	if(PosisiStopKontak1.equals(data.getPosisiStopKontak())){
	           if(PosisiStopKontak2.equals(data.getPosisiStopKontak())){
	               System.out.println(" Sudah Sesuai Standard ");
	           
	           }
	       }
	       
	       else {
	            System.out.println("Belum sesuai Standard ");
	       
	        }
	       if(data.getJumlahKabel_LCD() >= 1 ){
	            System.out.println("Sudah Sesuai Standard ");
	        }
	        
	       else {
	            System.out.println("Belum Sesuai Standard ");
	        }
	        
	       if(KondisiKabel_LCD.equals(data.getKondisiKabel_LCD())){
	             System.out.println("Sudah Sesuai Standard ");
	        }
	        
	       else{
	             System.out.println("Belum Sesuai Standard ");
	        }
	        
	       if(PosisiKabel_LCD.equals(data.getPosisiKabel_LCD())){
	             System.out.println("Sudah Sesuai Standard ");
	        }
	        
	       else{
	             System.out.println("Belum Sesuai Standard ");
	        }
	        
	       if(data.getJumlahLampu() >= 18){
	            if(KondisiLampu.equals(data.getKondisiLampu())){
	                System.out.println("Sesuai Standard ");
	             }
	        }
	        
	       else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	       
	        
	        if(PosisiLampu.equals(data.getPosisiLampu())){
	            System.out.println("Sudah Sesuai Standard ");
	        }
	        
	        else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	        
	        if(data.getJumlahKipasAngin()>=2){
	            if(KondisiKipasAngin.equals(data.getKondisiKipasAngin())){
	                System.out.println("Sudah Sesuai Standard ");
	            }
	        }
	        
	        else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	        
	        if(PosisiKipasAngin.equals(data.getPosisiKipasAngin())){
	           System.out.println("Sudah Sesuai Standard ");
	        }
	        
	        else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	              
	        if(data.getJumlah_AC()>=1){
	            System.out.println("Sudah Sesuai Standard ");
	        }
	       	        
	        else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	        
	       if(Kondisi_AC.equals(data.getKondisi_AC())){
	             System.out.println("Sudah Sesuai Standard ");
	       }
	      	       
	       else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	       
	       if(Posisi_AC1.equals(data.getPosisi_AC())){
	            System.out.println("Sudah Sesuai Standard ");
	        }
	       
	       if(Posisi_AC2.equals(data.getPosisi_AC())){
	            System.out.println("Sudah Sesuai Standard ");
	        }
	       
	       else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	       
	       if(SSID.equals(data.getSSID())){
	           System.out.println("Sudah Sesuai Standard ");
	       }
	       
	       else{
	            System.out.println("Belum Sesuai Standard ");
	       }
	       if(Login.equals(data.getLogin())){
	    	   System.out.println("Sudah Sesuai Standard");
	       }
	       else{
	    	   System.out.println("Belum Sesuai Standard");
	       }
	       
	       if(data.getJumlah_CCTV()== 2){
	           System.out.println("Sudah Sesuai Standard ");
	       }
	       else{
	    	   System.out.println("Belum Sesuai Standard");
	       }
	       
	       if(Kondisi_CCTV.equals(data.getKondisi_CCTV())){
	             System.out.println("Sudah Sesuai Standard ");
	           }
	       
	       else{
	          System.out.println("Belum Sesuai Standard ");
	       }
	       
	      if(Posisi_CCTV1.equals(data.getPosisi_CCTV())){
	    	  System.out.println("Sudah Sesuai Standard");
	      }
	      else{
	    	  System.out.println("Belum Sesuai Standard");
	      }
	      if(Posisi_CCTV2.equals(data.getPosisi_CCTV())){
	          System.out.println("Sudah Sesuai Standard ");
	          }
	      
	      else{
	          System.out.println("Belum Sesuai Standard ");
	  }
	}
	      void OutputJumlahKondisidanPosisiSarana(){
	    	  
	      
	    	  	System.out.println("== Jumlah,Kondisi dan Posisi Sarana ==");
	    	  	System.out.println("Jumlah Stop Kontak : " + data.getJumlahStopKontak());
	    	  	System.out.println("Kondisi Stop Kontak : " + data.getKondisiStopKontak());
	    	  	System.out.println("Posisi Stop Kontak 1 : " + data.getPosisiStopKontak());
	    	  	System.out.println("Posisi Stop Kontak 2 : " + data.getPosisiStopKontak());
	    	  	System.out.println("Jumlah Kabel LCD : " + data.getJumlahKabel_LCD());
	    	  	System.out.println("Kondisi Kabel LCD : " + data.getKondisiKabel_LCD());
	    	  	System.out.println("Posisi Kabel LCD : " + data.getPosisiKabel_LCD());
	    	  	System.out.println("Jumlah Lampu : " + data.getJumlahLampu());
	    	  	System.out.println("Kondisi Lampu : " + data.getKondisiLampu());
	    	  	System.out.println("Posisi Lampu : " + data.getPosisiLampu());
	    	  	System.out.println("Jumlah Kipas Angin : " + data.getJumlahKipasAngin());
	    	  	System.out.println("Kondisi Kipas Angin : " + data.getKondisiKipasAngin());
	    	  	System.out.println("Posisi Kipas Angin 1 : " + data.getPosisiKipasAngin());
	    	  	System.out.println("Kondisi Kipas Angin 2 : " + data.getKondisiKipasAngin());
	    	  	System.out.println("Jumlah AC : " + data.getJumlah_AC());
	    	  	System.out.println("Kondisi AC : " + data.getKondisi_AC());
	    	  	System.out.println("Posisi AC : " + data.getPosisi_AC());
	    	  	System.out.println("SSID : " + data.getSSID());
	    	  	System.out.println("Login : " + data.getLogin());
	    		System.out.println("Bandwidth : " + data.getBandwidth());
	    		System.out.println("Jumlah CCTV : " + data.getJumlah_CCTV());
	    	  	System.out.println("Kondisi CCTV : " + data.getKondisi_CCTV());
	    	  	System.out.println("Posisi CCTV 1 : " + data.getPosisi_CCTV());
	    	  	System.out.println("Posisi CCTV 2 : " + data.getPosisi_CCTV());
	    	  	
	      }
		
	    
}

