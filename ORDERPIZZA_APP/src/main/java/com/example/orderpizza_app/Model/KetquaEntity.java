package com.example.orderpizza_app.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "KETQUA", schema = "QLSV_10", catalog = "")
@IdClass(com.example.orderpizza_app.Model.KetquaEntityPK.class)
public class KetquaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "MASV")
    private String masv;

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "MAMH")
    private String mamh;

    public String getMamh() {
        return mamh;
    }

    public void setMamh(String mamh) {
        this.mamh = mamh;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "LANTHI")
    private byte lanthi;

    public byte getLanthi() {
        return lanthi;
    }

    public void setLanthi(byte lanthi) {
        this.lanthi = lanthi;
    }

    @Basic
    @Column(name = "DIEM")
    private double diem;

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KetquaEntity that = (KetquaEntity) o;
        return lanthi == that.lanthi && Double.compare(diem, that.diem) == 0 && Objects.equals(masv, that.masv) && Objects.equals(mamh, that.mamh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masv, mamh, lanthi, diem);
    }
}
