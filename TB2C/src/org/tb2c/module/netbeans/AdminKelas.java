/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;

import java.util.Scanner;

public class AdminKelas {
    Scanner scan = new Scanner(System.in);

    private String NamaRuang;
    private String LokasiRuang;
    private String ProgramStudi_Fakultas;

    private int JumlahStopKontak;
    private String KondisiStopKontak;
    private String PosisiStopKontak;

    private int JumlahKabel_LCD;
    private String KondisiKabel_LCD;
    private String PosisiKabel_LCD;

    private int JumlahLampu;
    private String KondisiLampu;
    private String PosisiLampu;

    private int JumlahKipasAngin;
    private String KondisiKipasAngin;
    private String PosisiKipasAngin;

    private int Jumlah_AC;
    private String Kondisi_AC;
    private String Posisi_AC;

    private String SSID;
    private String Login;
    private int Bandwidth;

    private int Jumlah_CCTV;
    private String Kondisi_CCTV;
    private String Posisi_CCTV;

    private String Kekokohan;
    private String KunciPintu;
    private String KunciJendela;
    private String Bahaya;

    private String SirkulasiUdara;
    private int NilaiPencahayaan;
    private int Kelembapan;
    private int Suhu;

    private String Kebisingan;
    private String Bau;
    private String Kebocoran;
    private String Kerusakan;
    private String Keausan;

    private double PanjangRuang;
    private double LebarRuang;
    private int JumlahKursi;
    private int JumlahPintu;
    private int JumlahJendela;
    private double LuasRuang;
    private double RasioLuas;

    private String KondisiLantai;
    private String KondisiDinding;
    private String KondisiAtap;
    private String KondisiPintu;
    private String KondisiJendela;

    void setNamaRuang(String Ruang) {
        this.NamaRuang = Ruang;
    }

    String getNamaRuang() {
        return this.NamaRuang;
    }

    void setLokasiRuang(String Gedung) {
        this.LokasiRuang = Gedung;
    }

    String getLokasiRuang() {
        return this.LokasiRuang;
    }

    void setProgramStudi_Fakultas(String Jurusan) {
        this.ProgramStudi_Fakultas = Jurusan;
    }

    String getProgramStudi_Fakultas() {
        return this.ProgramStudi_Fakultas;
    }

    void setJumlahStopKontak(int JumlahStopKontak) {
        this.JumlahStopKontak = JumlahStopKontak;
    }

    int getJumlahStopKontak() {
        return this.JumlahStopKontak;
    }

    void setKondisiStopKontak(String KondisiStopKontak) {
        this.KondisiStopKontak = KondisiStopKontak;
    }

    String getKondisiStopKontak() {
        return this.KondisiStopKontak;
    }

    void setPosisiStopKontak(String PosisiStopKontak) {
        this.PosisiStopKontak = PosisiStopKontak;
    }

    String getPosisiStopKontak() {
        return this.PosisiStopKontak;
    }

    void setJumlahKabel_LCD(int TotalKabel_LCD) {
        this.JumlahKabel_LCD = TotalKabel_LCD;
    }

    int getJumlahKabel_LCD() {
        return this.JumlahKabel_LCD;
    }

    void setKondisiKabel_LCD(String KondisiKabel_LCD) {
        this.KondisiKabel_LCD = KondisiKabel_LCD;
    }

    String getKondisiKabel_LCD() {
        return this.KondisiKabel_LCD;
    }

    void setPosisiKabel_LCD(String PosisiKabel_LCD) {
        this.PosisiKabel_LCD = PosisiKabel_LCD;
    }

    String getPosisiKabel_LCD() {
        return this.PosisiKabel_LCD;
    }

    void setJumlahLampu(int JumlahLampu) {
        this.JumlahLampu = JumlahLampu;
    }

    int getJumlahLampu() {
        return this.JumlahLampu;
    }

    void setKondisiLampu(String KondisiLampu) {
        this.KondisiLampu = KondisiLampu;
    }

    String getKondisiLampu() {
        return this.KondisiLampu;
    }

    void setPosisiLampu(String PosisiLampu) {
        this.PosisiLampu = PosisiLampu;
    }

    String getPosisiLampu() {
        return this.PosisiLampu;
    }

    void setSSID(String SSID) {
        this.SSID = SSID;
    }

    String getSSID() {
        return this.SSID;
    }

    void setLogin(String Login) {
        this.Login = Login;
    }

    String getLogin() {
        return this.Login;
    }

    void setBandwidth(int Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    int getBandwidth() {
        return this.Bandwidth;
    }

    void setJumlahKipasAngin(int JumlahKipasAngin) {
        this.JumlahKipasAngin = JumlahKipasAngin;
    }

    int getJumlahKipasAngin() {
        return this.JumlahKipasAngin;
    }

    void setKondisiKipasAngin(String KondisiKipas) {
        this.KondisiKipasAngin = KondisiKipas;
    }

    String getKondisiKipasAngin() {
        return this.KondisiKipasAngin;
    }

    void setPosisiKipasAngin(String PosisiKipas) {
        this.PosisiKipasAngin = PosisiKipas;
    }

    String getPosisiKipasAngin() {
        return this.PosisiKipasAngin;
    }

    void setJumlah_AC(int JumlahAC) {
        this.Jumlah_AC = JumlahAC;
    }

    int getJumlah_AC() {
        return this.Jumlah_AC;
    }

    void setKondisi_AC(String KondisiAC) {
        this.Kondisi_AC = KondisiAC;
    }

    String getKondisi_AC() {
        return this.Kondisi_AC;
    }

    void setPosisi_AC(String Posisi_AC) {
        this.Posisi_AC = Posisi_AC;
    }

    String getPosisi_AC() {
        return this.Posisi_AC;
    }

    void setJumlah_CCTV(int JumlahCCTV) {
        this.Jumlah_CCTV = JumlahCCTV;
    }

    int getJumlah_CCTV() {
        return this.Jumlah_CCTV;
    }

    void setKondisi_CCTV(String KondisiCCTV) {
        this.Kondisi_CCTV = KondisiCCTV;
    }

    String getKondisi_CCTV() {
        return this.Kondisi_CCTV;
    }

    void setPosisi_CCTV(String PosisiCCTV) {
        this.Posisi_CCTV = PosisiCCTV;
    }

    String getPosisi_CCTV() {
        return this.Posisi_CCTV;
    }

    void setKekokohan(String Kekokohan) {
        this.Kekokohan = Kekokohan;
    }

    String getKekokohan() {
        return this.Kekokohan;
    }

    void setKunciPintu(String KunciPintu) {
        this.KunciPintu = KunciPintu;
    }

    String getKunciPintu() {
        return this.KunciPintu;
    }

    void setKunciJendela(String KunciJendela) {
        this.KunciJendela = KunciJendela;
    }

    String getKunciJendela() {
        return this.KunciJendela;
    }

    void setBahaya(String Bahaya) {
        this.Bahaya = Bahaya;
    }

    String getBahaya() {
        return this.Bahaya;
    }

    void setSirkulasiUdara(String SirkulasiUdara) {
        this.SirkulasiUdara = SirkulasiUdara;
    }

    String getSirkualasiUdara() {
        return this.SirkulasiUdara;
    }

    void setNilaiPencahayaan(int NilaiPencahayaan) {
        this.NilaiPencahayaan = NilaiPencahayaan;
    }

    int getNilaiPencahayaan() {
        return this.NilaiPencahayaan;
    }

    void setKelembapan(int Kelembapan) {
        this.Kelembapan = Kelembapan;
    }

    int getKelembapan() {
        return this.Kelembapan;
    }

    void setSuhu(int Suhu) {
        this.Suhu = Suhu;
    }

    int getSuhu() {
        return this.Suhu;
    }

    void setKebisingan(String Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    String getKebisingan() {
        return this.Kebisingan;
    }

    void setBau(String Bau) {
        this.Bau = Bau;
    }

    String getBau() {
        return this.Bau;
    }

    void setKebocoran(String Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    String getKebocoran() {
        return this.Kebocoran;
    }

    void setKerusakan(String Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    String getKerusakan() {
        return this.Kerusakan;
    }

    void setKeausan(String Keausan) {
        this.Keausan = Keausan;
    }

    String getKeausan() {
        return this.Keausan;
    }

    void setPanjangRuang(double Panjang) {
        this.PanjangRuang = Panjang;
    }

    double getPanjangRuang() {
        return this.PanjangRuang;
    }

    void setLebarRuang(double Lebar) {
        this.LebarRuang = Lebar;
    }

    double getLebarRuang() {
        return this.LebarRuang;
    }

    void setJumlahKursi(int TotalKursi) {
        this.JumlahKursi = TotalKursi;
    }

    int getJumlahKursi() {
        return this.JumlahKursi;
    }

    void setJumlahPintu(int TotalPintu) {
        this.JumlahPintu = TotalPintu;
    }

    int getJumlahPintu() {
        return this.JumlahPintu;
    }

    void setJumlahJendela(int TotalJendela) {
        this.JumlahJendela = TotalJendela;
    }

    int getJumlahJendela() {
        return this.JumlahJendela;
    }

    double LuasRuang() {
        return PanjangRuang * LebarRuang;
    }

    double RasioLuas() {
        return RasioLuas() / JumlahKursi;
    }

    void setKondisiLantai(String KondisiLantai) {
        this.KondisiLantai = KondisiLantai;
    }

    String getKondisiLantai() {
        return this.KondisiLantai;
    }

    void setKondisiDinding(String KondisiDinding) {
        this.KondisiDinding = KondisiDinding;
    }

    String getKondisiDinding() {
        return this.KondisiDinding;
    }

    void setKondisiAtap(String KondisiAtap) {
        this.KondisiAtap = KondisiAtap;
    }

    String getKondisiAtap() {
        return this.KondisiAtap;
    }

    void setKondisiPintu(String KondisiPintu) {
        this.KondisiPintu = KondisiPintu;
    }

    String getKondisiPintu() {
        return this.KondisiPintu;
    }

    void setKondisiJendela(String KondisiJendela) {
        this.KondisiJendela = KondisiJendela;
    }

    String getKondisiJendela() {
        return this.KondisiJendela;
    }

}
