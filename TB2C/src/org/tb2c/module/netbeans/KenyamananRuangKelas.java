/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;


public class KenyamananRuangKelas extends KebersihanRuangKelas {
	
	
	
	
	void InputKenyamananRuangKelas(){
		 
		 
		 
		 System.out.println("Kondisi kebisingan di dalam kelas : ");
	     data.setKebisingan(scan.nextLine());
	       
	     System.out.println("Kondisi aroma di dalam/di luar kelas : ");
	     data.setBau(scan.nextLine());
	       
	     System.out.println("Kondisi kaca jendela di dalam/di luar kelas  : ");
	     data.setKebocoran(scan.nextLine());
	       
	     System.out.println("Kondisi Kerusakan di dalam kelas : ");
	     data.setKerusakan(scan.nextLine());
	     
	     System.out.println("Kondisi keausan di dalam kelas : ");
	     data.setKeausan(scan.nextLine());
	 }
	
	 void AnalysisKenyamananRuangKelas(){
		 String Kebisingan = "Tidak Bising";
		 String Bau = "Tidak Bau";
		 String Kebocoran = "Tidak Bocor";
		 String Kerusakan = "Tidak Rusak";
		 String Keausan = "Tidak Aus";
		 
		 if(Kebisingan.equals(data.getKebisingan())){
			 System.out.println("Sudah Sesuai");
	       }
	       else{
	           System.out.println("Belum Sesuai");
	       }
		 if(Bau.equals(data.getBau())){
			 System.out.println("Sudah Sesuai ");
		 }
		 else{
			 System.out.println("Belum Sesuai ");
		 }
		 if(Kebocoran.equals(data.getKebocoran())){
			 System.out.println("Sudah Sesuai");
		 }
		 else{
			 System.out.println("Belum Sesuai");
		 }
		 if(Kerusakan.equals(data.getKerusakan())){
			 System.out.println("Sudah Sesuai");
		 }
		 else{
			 System.out.println("Belum Sesuai");
		 }
		 if(Keausan.equals(data.getKeausan())){
			 System.out.println("Sudah Sesuai");
		 }
		 else{
			 System.out.println("Belum Sesuai");
		 }
	 }
	 
	 void OutputKenyamanRuangKelas(){
		 System.out.println("== Kenyamanan Ruang Kelas ==");
		 System.out.println("Kebisingan : " + data.getKebisingan());
		 System.out.println("Aroma : " + data.getBau());
		 System.out.println("Kebocoran : " + data.getKebocoran());
		 System.out.println("Kerusakan : " + data.getKerusakan());
		 System.out.println("Keausan : " + data.getKeausan());
	 }
}
	 
	 
	   