package com.ptp.phamtanphat.oop0405;

import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Nhanvien nhanvien1 = new Nhanvien("Nguyen Van A",1990,"121 Quận 1 Phường Bến Thành",28);
//        nhanvien1.setTen("Nguyen Van A");
//        nhanvien1.Namsinh = 1980;
//        nhanvien1.Diachi = "121 Quận 1 Phường Bến Thành";
//        nhanvien1.Tinhsotuoi();
//        Quanly quanly1 = new Quanly();
//        quanly1.setTen("Pham Van B");

//
//        Toast.makeText(this, quanly1.Tinhsotuoi(20) + "", Toast.LENGTH_SHORT).show();
//        Show(20);
        Quanly quanly = new Quanly();
        quanly.setTen("Pham Van B");

        Nhanvien nhanvien = new Nhanvien(quanly);
        nhanvien.setTen("Nguyen Van A");



    }


    // phuong nap chong
    public void Show(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public void Show(int tuoi) {
        Toast.makeText(this, tuoi + "", Toast.LENGTH_SHORT).show();
    }
}
