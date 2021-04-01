/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.th2bai6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class QLHV {
    
    private List<HocVien> ds = new ArrayList<HocVien>();
    
    public void themHV(HocVien e){
        this.ds.add(e);
    }
    public void xoaHV(HocVien e){
        this.ds.remove(e);
    }
    public void nhapDiem(){
        this.ds.forEach(h -> {
            h.nhapDiem();
        });
    }
    public void hienThi(){
        this.ds.forEach(h -> h.hienThi());
    }
    
    public void sapXepHV(){
        this.ds.sort((hv1,hv2) ->{
            double t = hv1.tinhTB() - hv2.tinhTB();            
            return t > 0 ? 1 : (t < 0 ? -1 : 0);
        });
    }

     public HocVien timKiem(String maHv) {
        for (HocVien h: this.ds)
            if (h.getMaHV().equalsIgnoreCase(maHv))
                return h;
                return null;
    }
    
    
    public List<HocVien> timKiemHV(String dk){
        List<HocVien> dsSearch = new ArrayList<>();
        this.ds.forEach(h ->{
            if(h.getHoTenHV().toLowerCase().contains(dk) 
                    || h.getQueQuan().toLowerCase().contains(dk))
                dsSearch.add(h);
        });
        return dsSearch;
    }
    
    public List<HocVien> dsLayHocBong(){
        
        List<HocVien> dsHocBong = new ArrayList<>();
        for (HocVien h : this.ds){
            if(h.tinhTB() >= 8)
                dsHocBong.add(h);
        }
        return dsHocBong;
    }
    
     public List<HocVien> xetHb() {
        List<HocVien> kq = new ArrayList<>();
        for (HocVien h: this.ds)
            if (h.tinhTB() >= 8)
                kq.add(h);
        
        return kq;
    }
    
    
    /**
     * @return the ds
     */
    public List<HocVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<HocVien> ds) {
        this.ds = ds;
    }
    
}
