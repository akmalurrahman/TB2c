/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;

public class TestKelas {
	public static void main(String[] args) {
		KeamananRuangKelas data2 = new KeamananRuangKelas();
		
		//Input
		data2.InputIdentitasRuangKelas();
		data2.InputKondisiRuangKelas();
		data2.InputJumlahKondisidanPosisiSarana();
		data2.InputLingkunganKelas();
		data2.InputKebersihanRuangKelas();
		data2.InputKenyamananRuangKelas();
		data2.InputKeamananRuangKelas();
		
		//analysis
		data2.AnalysisKondisiRuangKelas();
		data2.AnalysisJumlahKondisidanPosisiSarana();
		data2.AnalysisLingkunganRuangKelas();
		data2.AnalysisKebersihanRuangKelas();
		data2.AnalysisKenyamananRuangKelas();
		data2.AnalysisKeamananRuangKelas();
		
		//Output
		data2.OutputIdentitasRuangKelas();
		data2.OutputKondisiRuangKelas();
		data2.OutputJumlahKondisidanPosisiSarana();
		data2.OutputLingkunganKelas();
		data2.OutputKebersihanRuangKelas();
		data2.OutputKenyamanRuangKelas();
		data2.OutputKeamananRuangKelas();
		
	}
}
