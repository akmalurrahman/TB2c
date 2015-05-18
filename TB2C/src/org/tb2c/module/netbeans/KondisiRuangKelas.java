/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;


public class KondisiRuangKelas extends IdentitasRuangKelas {
	

	
	void InputKondisiRuangKelas(){
		
			System.out.println("Masukkan panjang ruangan : ");
	        data.setPanjangRuang(scan.nextInt());
	        
	        System.out.println("Masukkan lebar ruangan :  ");
	        data.setLebarRuang(scan.nextInt());
	        
	        System.out.println("Masukkan jumlah kursi dalam suatu ruangan : ");
	        data.setJumlahKursi(scan.nextInt());
	        
	        System.out.println("Masukkan jumlah pintu dalam suatu ruangan : ");
	        data.setJumlahPintu(scan.nextInt()); 
	        
	        System.out.println("Masukkan jumlah jendela dalam ruangan : ");
	        data.setJumlahJendela(scan.nextInt());
	        
	        
	}
	void AnalysisKondisiRuangKelas(){
			if (data.getPanjangRuang() < data.getLebarRuang()){
	          System.out.println("Angka yang Anda masukkan Salah");
	      } 
	      
			else if (data.getPanjangRuang() == data.getLebarRuang()){
	        System.out.println("Tidak ada ruangan yang berbentuk persegi panjang");
	      }
	      
			if (data.RasioLuas() >= 0.5){
	          System.out.println(" Ruangan kelas telah memenuhi Standard ");
	      }
	      
			else if (data.RasioLuas() <= 0.5){
	          System.out.println(" Ruang kelas tidak memenuhi Standard ");
	      }
	      
			if (data.getJumlahPintu() >= 2){
	          System.out.println(" Jumlah pintu telah memenuhi Standard ");
	      }
	          
			else if(data.getJumlahPintu() <= 2){
	          System.out.println(" Jumlah pintu tidak memenuhi Standard ");
	      }
	      
			if (data.getJumlahJendela() >= 1){
	          System.out.println(" Jumlah Jendela sesuai ");
	      }
	      
			else if (data.getJumlahJendela() == 0){
	          System.out.println(" Jumlah Jendela tidak memenuhi Standard ");
			}
		}
	
	void OutputKondisiRuangKelas(){
		 System.out.println("== Kondisi Ruang Kelas ==");
		 System.out.println("Jumlah kursi didalam kelas : " + data.getJumlahKursi());
	     System.out.println("Jumlah Pintu pada kelas : " + data.getJumlahPintu());
	     System.out.println("Jumlah Jendela pada kelas : " + data.getJumlahJendela());
	     System.out.println("Luas Ruang : " + data.LuasRuang());
	     System.out.println("Rasio Ruang : "+ data.RasioLuas());    
	}
	    	 
}

