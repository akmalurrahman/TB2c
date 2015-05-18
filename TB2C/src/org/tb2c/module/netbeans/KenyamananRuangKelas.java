/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;

public class KebersihanRuangKelas extends LingkunganRuangKelas{
	
		
	
	void InputKebersihanRuangKelas(){
		
		 	System.out.println("Masukkan kondisi sirkulasi udara dalam ruangan : (baik/tidak baik) ");
		 	data.setSirkulasiUdara(scan.nextLine());
	       
		 	System.out.println("Masukkan nilai pencahayaan dalam ruangan : ");
		 	data.setNilaiPencahayaan(scan.nextInt());
	       
		 	System.out.println("Masukkan nilai kelembapan dalam ruangan : ");
		 	data.setKelembapan(scan.nextInt());
	       
		 	System.out.println("Masukkan suhu dalam ruangan : ");
		 	data.setSuhu(scan.nextInt());
	   }
	   
	 void AnalysisKebersihanRuangKelas(){
		 String SirkulasiUdara = "Lancar";
		 
		 if (SirkulasiUdara.equals(data.getSirkualasiUdara())){
			 System.out.println("Sirkulasi udara di dalam ruangan sudah sesuai Standard");
		 }
		 else{
			 System.out.println("Sirkulasi udara di dalam ruangan belum sesuai Standard");
		 }

	       if( data.getNilaiPencahayaan()<=350 == data.getNilaiPencahayaan()>=250){
	           System.out.println("Nilai pencahayaan ruangan sudah sesuai Standard ");
	       }
	       
	        else{
	           System.out.println(" Niali pencahayaan ruangan tidak sesuai Standard ");
	       }
	       
	        if( data.getKelembapan()<=80 == data.getKelembapan()>=70){
	           System.out.println("Kelembapan ruangan sudah sesuai Standard ");
	       }
	       
	        else{
	           System.out.println("Kelembapan ruangan belum sesuai Standard ");
	       }
	        
	        if( data.getSuhu()<=35 == data.getSuhu()>=25){
	           System.out.println("Kebersihan ruangan sudah sesuai Standard ");
	       }
	       
	        else {
	           System.out.println("Kebersihan ruangan belum sesuai Standard ");
	       }
	   }
	 
	 void OutputKebersihanRuangKelas(){
		 System.out.println("== Kebersihan Ruang Kelas ==");
		 System.out.println("Sirkulasi Udara : " + data.getSirkualasiUdara());
		 System.out.println("Nilai Pencahayaan : " + data.getNilaiPencahayaan());
		 System.out.println("Kelembapan : " + data.getKelembapan());
		 System.out.println("Suhu : " + data.getSuhu());
	 }
	 
}

