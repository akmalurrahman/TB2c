/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;

public class KeamananRuangKelas extends KenyamananRuangKelas{
	
	
	
	void InputKeamananRuangKelas(){
	   	
	System.out.println("Kekokohan dalam kelas : ");
        data.setKekokohan(scan.nextLine());
        
        System.out.println("Kelengkapan Kunci Pintu :  ");
        data.setKunciPintu(scan.nextLine());
        
        System.out.println("Kelengkapan Kunci Jendela :  ");
        data.setKunciJendela(scan.nextLine());
        
        System.out.println("Bahaya dalam kelas : ");
        data.setBahaya(scan.nextLine());
   }
	
   void AnalysisKeamananRuangKelas(){
	   String Kekokohan = "Kokoh";
	   String KunciPintu = "Ada";
	   String KunciJendela = "Ada";
	   String Bahaya = "Aman";
   
   if(Kekokohan.equals(data.getKekokohan())){
       System.out.println("Sudah Sesuai");
   }
   else{
       System.out.println("Belum Sesuai ");
   }
  
   if(KunciPintu.equals(data.getKunciPintu())){
       System.out.println("Sudah Sesuai");
   }
   else{
       System.out.println("Belum Sesuai ");
   }
  
   if(KunciJendela.equals(data.getKunciJendela())){
       System.out.println("Sudah Sesuai");
   }
   else{
       System.out.println("Tidak Sesuai ");
   }
   if(Bahaya.equals(data.getBahaya())){
	  System.out.println("Sudah Sesuai");
   }
   else{
	  System.out.println("Belum Sesuai");
   }
}
   
   void OutputKeamananRuangKelas(){
  System.out.println("== Keamanan Ruang Kelas ==");
  System.out.println("Kekokohan : " + data.getKekokohan());
  System.out.println("Kunci Pintu : " + data.getKunciPintu());
  System.out.println("Kunci Jendela : " + data.getKunciJendela());
  System.out.println("Bahaya : " + data.getBahaya());
	  }  
   @Override
   public void InputIdentitasRuangKelas(){
		
       
       System.out.println("Masukan Nama Ruangan yang akan Anda gunakan : ");
       data.setNamaRuang(scan.nextLine());
      
       System.out.println("Masukan Lokasi Ruangan yang akan Anda gunakan : ");
       data.setLokasiRuang(scan.nextLine());
       
       System.out.println("Masukan Pengguna Program Studi/Fakultas : ");
       data.setProgramStudi_Fakultas(scan.nextLine());
	}

   
        @Override
    void InputKondisiRuangKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void InputJumlahKondisidanPosisiSarana() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void InputLingkunganKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void InputKebersihanRuangKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void InputKenyamananRuangKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalysisKondisiRuangKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalysisJumlahKondisidanPosisiSarana() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalysisLingkunganRuangKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalysisKebersihanRuangKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalysisKenyamananRuangKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void OutputIdentitasRuangKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void OutputKondisiRuangKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void OutputJumlahKondisidanPosisiSarana() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void OutputLingkunganKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void OutputKebersihanRuangKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void OutputKenyamanRuangKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

