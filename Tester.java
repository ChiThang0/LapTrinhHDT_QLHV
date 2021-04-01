/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.th2bai6;

import java.util.List;

/**
 *
 * @author nguye
 */
public class Tester {
    public static void main(String[] args) {
        
        HocVien h1 = new HocVien("Nguyen Van A", "21/12/1999", "Nam", "HCM");
        HocVien h2 = new HocVien("Tran Van B", "21/10/1999", "Nam", "HCM");
        HocVien h3 = new HocVien("Nguyen Thi C", "21/02/1999", "Nu", "HCM");
        
        QLHV qLy = new QLHV();
        qLy.themHV(h1);
        qLy.themHV(h2);
        qLy.themHV(h3);
//        
        qLy.nhapDiem();
        qLy.hienThi();
        
//        System.out.println("-----------Tim Kiem DK----------------");
//        qLy.timKiemHV("van").forEach(h -> h.hienThi());
//        System.out.println("-----------Tim Kiem MaHV----------------");
//        qLy.timKiem("HV00002").hienThi();
//        
//        System.out.println("-----------Sap Xep-----------------");
//        qLy.sapXepHV();
//        qLy.hienThi();
        
        System.out.println("-----------Ds Hoc Bong-----------------");
        qLy.dsLayHocBong().forEach(h -> h.hienThi());
        
    }
    
}
