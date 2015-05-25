/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;

public class JumlahKondisidanPosisiSarana extends KondisiRuangKelas{
	 	
	    
	
	void InputJumlahKondisidanPosisiSarana(){
		
		
		System.out.println("Masukkan jumlah stop kontak : ");
	        setJumlahStopKontak(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi stop kontak : ");
	        setKondisiStopKontak(scan.nextLine());
	        
	        System.out.println("Masukkan posisi stop kontak :  ");
	        setPosisiStopKontak(scan.nextLine());
	        
	        System.out.println("Masukkan jumlah kabel LCD : ");
	        setJumlahKabel_LCD(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi kabel LCD : ");
	        setKondisiKabel_LCD(scan.nextLine());
	        
	        System.out.println("Masukkan posisi kabel LCD : ");
	        setPosisiKabel_LCD(scan.nextLine());
	        
	        System.out.println("Masukkan jumlah lampu : ");
	        setJumlahLampu(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi lampu : ");
	        setKondisiLampu(scan.nextLine());
	        
	        System.out.println("Masukkan posisi lampu : ");
	        setPosisiLampu(scan.nextLine());
	        
	        System.out.println("Masukkan SSID : ");
	        setSSID(scan.nextLine());
	        
	        System.out.println("Masukkan Login : ");
	        setLogin(scan.nextLine());
	        
	       	System.out.println("Masukkan Bandwidth : ");
	        setBandwidth(scan.nextInt());
	        
	        System.out.println("Masukkan jumlah kipas angin : ");
	        setJumlahKipasAngin(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi kipas angin  : ");
	        setKondisiKipasAngin(scan.nextLine());
	        
	        System.out.println("Masukkan posisi kipas angin : ");
	        setPosisiKipasAngin(scan.nextLine());
	        
	        System.out.println("Masukkan jumlah AC : ");
	        setJumlah_AC(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi AC : ");
	        setKondisi_AC(scan.nextLine());
	        
	        System.out.println("Masukan posisi AC : ");
	        setPosisi_AC(scan.nextLine());
	        
	        System.out.println("Masukkan jumlah CCTV : ");
	        setJumlah_CCTV(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi CCTV : ");
	        setKondisi_CCTV(scan.nextLine());
	        
	        System.out.println("Masukkan posisi CCTV : ");
	        setPosisi_CCTV(scan.nextLine());       
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
	
	        if(getJumlahStopKontak() >= 4){
	            System.out.println("Sudah Sesuai Standard");
	        }
	        
	        else{
	        	System.out.println("Belum Sesuai Standard");
	        }
	        
	       if(KondisiStopKontak.equals(getKondisiStopKontak())){
	              System.out.println(" Sudah Sesuai Standard ");
	            }
	                
	       else {
	            System.out.println("Belum Sesuai Standard ");
	        }
	        
	       	if(PosisiStopKontak1.equals(getPosisiStopKontak())){
	           if(PosisiStopKontak2.equals(getPosisiStopKontak())){
	               System.out.println(" Sudah Sesuai Standard ");
	           
	           }
	       }
	       
	       else {
	            System.out.println("Belum sesuai Standard ");
	       
	        }
	       if(getJumlahKabel_LCD() >= 1 ){
	            System.out.println("Sudah Sesuai Standard ");
	        }
	        
	       else {
	            System.out.println("Belum Sesuai Standard ");
	        }
	        
	       if(KondisiKabel_LCD.equals(getKondisiKabel_LCD())){
	             System.out.println("Sudah Sesuai Standard ");
	        }
	        
	       else{
	             System.out.println("Belum Sesuai Standard ");
	        }
	        
	       if(PosisiKabel_LCD.equals(getPosisiKabel_LCD())){
	             System.out.println("Sudah Sesuai Standard ");
	        }
	        
	       else{
	             System.out.println("Belum Sesuai Standard ");
	        }
	        
	       if(getJumlahLampu() >= 18){
	            if(KondisiLampu.equals(getKondisiLampu())){
	                System.out.println("Sesuai Standard ");
	             }
	        }
	        
	       else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	       
	        
	        if(PosisiLampu.equals(getPosisiLampu())){
	            System.out.println("Sudah Sesuai Standard ");
	        }
	        
	        else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	        
	        if(getJumlahKipasAngin()>=2){
	            if(KondisiKipasAngin.equals(getKondisiKipasAngin())){
	                System.out.println("Sudah Sesuai Standard ");
	            }
	        }
	        
	        else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	        
	        if(PosisiKipasAngin.equals(getPosisiKipasAngin())){
	           System.out.println("Sudah Sesuai Standard ");
	        }
	        
	        else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	              
	        if(getJumlah_AC()>=1){
	            System.out.println("Sudah Sesuai Standard ");
	        }
	       	        
	        else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	        
	       if(Kondisi_AC.equals(getKondisi_AC())){
	             System.out.println("Sudah Sesuai Standard ");
	       }
	      	       
	       else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	       
	       if(Posisi_AC1.equals(getPosisi_AC())){
	            System.out.println("Sudah Sesuai Standard ");
	        }
	       
	       if(Posisi_AC2.equals(getPosisi_AC())){
	            System.out.println("Sudah Sesuai Standard ");
	        }
	       
	       else{
	            System.out.println("Belum Sesuai Standard ");
	        }
	       
	       if(SSID.equals(getSSID())){
	           System.out.println("Sudah Sesuai Standard ");
	       }
	       
	       else{
	            System.out.println("Belum Sesuai Standard ");
	       }
	       if(Login.equals(getLogin())){
	    	   System.out.println("Sudah Sesuai Standard");
	       }
	       else{
	    	   System.out.println("Belum Sesuai Standard");
	       }
	       
	       if(getJumlah_CCTV()== 2){
	           System.out.println("Sudah Sesuai Standard ");
	       }
	       else{
	    	   System.out.println("Belum Sesuai Standard");
	       }
	       
	       if(Kondisi_CCTV.equals(getKondisi_CCTV())){
	             System.out.println("Sudah Sesuai Standard ");
	           }
	       
	       else{
	          System.out.println("Belum Sesuai Standard ");
	       }
	       
	      if(Posisi_CCTV1.equals(getPosisi_CCTV())){
	    	  System.out.println("Sudah Sesuai Standard");
	      }
	      else{
	    	  System.out.println("Belum Sesuai Standard");
	      }
	      if(Posisi_CCTV2.equals(getPosisi_CCTV())){
	          System.out.println("Sudah Sesuai Standard ");
	          }
	      
	      else{
	          System.out.println("Belum Sesuai Standard ");
	  }
	}
	      void OutputJumlahKondisidanPosisiSarana(){
	    	  
	      
	    	  	System.out.println("== Jumlah,Kondisi dan Posisi Sarana ==");
	    	  	System.out.println("Jumlah Stop Kontak : " + getJumlahStopKontak());
	    	  	System.out.println("Kondisi Stop Kontak : " + getKondisiStopKontak());
	    	  	System.out.println("Posisi Stop Kontak 1 : " + getPosisiStopKontak());
	    	  	System.out.println("Posisi Stop Kontak 2 : " + getPosisiStopKontak());
	    	  	System.out.println("Jumlah Kabel LCD : " + getJumlahKabel_LCD());
	    	  	System.out.println("Kondisi Kabel LCD : " + getKondisiKabel_LCD());
	    	  	System.out.println("Posisi Kabel LCD : " + getPosisiKabel_LCD());
	    	  	System.out.println("Jumlah Lampu : " + getJumlahLampu());
	    	  	System.out.println("Kondisi Lampu : " + getKondisiLampu());
	    	  	System.out.println("Posisi Lampu : " + getPosisiLampu());
	    	  	System.out.println("Jumlah Kipas Angin : " + getJumlahKipasAngin());
	    	  	System.out.println("Kondisi Kipas Angin : " + getKondisiKipasAngin());
	    	  	System.out.println("Posisi Kipas Angin 1 : " + getPosisiKipasAngin());
	    	  	System.out.println("Kondisi Kipas Angin 2 : " + getKondisiKipasAngin());
	    	  	System.out.println("Jumlah AC : " + getJumlah_AC());
	    	  	System.out.println("Kondisi AC : " + getKondisi_AC());
	    	  	System.out.println("Posisi AC : " + getPosisi_AC());
	    	  	System.out.println("SSID : " + getSSID());
	    	  	System.out.println("Login : " + getLogin());
	    		System.out.println("Bandwidth : " + getBandwidth());
	    		System.out.println("Jumlah CCTV : " + getJumlah_CCTV());
	    	  	System.out.println("Kondisi CCTV : " + getKondisi_CCTV());
	    	  	System.out.println("Posisi CCTV 1 : " + getPosisi_CCTV());
	    	  	System.out.println("Posisi CCTV 2 : " + getPosisi_CCTV());
	    	  	
	      }
		
	    
}

