/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.th2bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.DoubleStream;

/**
 *
 * @author nguye
 */
public class HocVien {

    /**
     * @return the maHV
     */
    public String getMaHV() {
        return maHV;
    }

    /**
     * @param maHV the maHV to set
     */
    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    /**
     * @return the hoTenHV
     */
    public String getHoTenHV() {
        return hoTenHV;
    }

    /**
     * @param hoTenHV the hoTenHV to set
     */
    public void setHoTenHV(String hoTenHV) {
        this.hoTenHV = hoTenHV;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
    private static Scanner sc = new Scanner(System.in);
    private static final SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
    private static final int SO_MON = 3;
    private static int dem;
    private String maHV;
    private String hoTenHV;
    private Date ngaySinh;
    private String gioiTinh;
    private String queQuan;
    private double diem[];
    
    {
        ++dem;
        this.setMaHV(String.format("HV%05d", dem));
        this.diem = null;
    }

    public HocVien(String hoTenHV, Date ngaySinh, String gioiTinh, String queQuan) {
        this.hoTenHV = hoTenHV;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }
    
    public HocVien(String hoTenHV, String ngaySinh, String gioiTinh, String queQuan) {
        try {
            this.hoTenHV = hoTenHV;
            this.ngaySinh = d.parse(ngaySinh);
            this.gioiTinh = gioiTinh;
            this.queQuan = queQuan;
        } catch (ParseException ex) {
            System.out.println("loi pare date sang String: " + ex);
        }
    }
    
    public void hienThi(){
        System.out.printf("""
                          \nMa HVien: %s
                          Ho Ten: %s
                          Ngay Sinh: %s
                          Gioi Tinh: %s
                          Que Quan: %s
                          """, this.getMaHV(), this.getHoTenHV(), 
                d.format(this.getNgaySinh()), this.getGioiTinh(), this.getQueQuan());
        if(this.diem != null){
            for (double d : this.diem) {
                System.out.printf("Diem: %.1f\t", d);    
            }
        }
    }
    
    public void nhapDiem(){
        this.diem = new double[SO_MON];
        System.out.println("Nhap diem cua " + this.getHoTenHV());
        for (int i = 0; i < SO_MON; i++) {
            System.out.println("Mon " + (i + 1)+ ":");
            diem[i] = sc.nextDouble();
        }
    }
    
    public double tinhTB(){
        DoubleStream d = DoubleStream.of(this.diem);
        double tb = d.average().getAsDouble();
        return tb;
    }
    
}
