package com.ptp.phamtanphat.oop0405;

/**
 * Created by KhoaPhamPC on 25/5/2018.
 */

public class Nhanvien {
    private String Ten;
    private int Namsinh;
    private String Diachi;
    private int Tuoi;
    Quanly quanly;

    public Nhanvien(Quanly quanly){
        this.quanly = quanly;
    }

    //Constructor
//    public Nhanvien(String ten , int namsinh , String Diachi , int Tuoi){
//        Ten = ten;
//        Namsinh = namsinh;
//        this.Diachi = Diachi;
//        this.Tuoi = Tuoi;
//    }
    public void setTen(String Ten){
        this.Ten = Ten;
    }
    public String getTen(){
        return Ten;
    }
    public int getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int namsinh) {
        Namsinh = namsinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public void Tinhsotuoi(){
        Tuoi = 2018 - Namsinh;
    }

}
