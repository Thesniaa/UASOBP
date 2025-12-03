 /*
  * Class 
  * Author: Marcella Jessica Sutanto
  * NIM: 825240079
  * Date: 21 November 2025
  */

package com.example.demospringboot.entity;

import jakarta.persistence.*;

@Entity
public class Transaksi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaksi_id") // sesuai database
    private Integer idTransaksi;

    @Column(name = "harga_jual")
    private Long hargaJual;

    @Column(name = "jumlah")
    private Integer jumlah;

    @Column(name = "tanggal")
    private String tanggal; // bisa diganti LocalDate kalau mau

    // Relasi ke pakaian dan subclass-nya
    @ManyToOne
    @JoinColumn(name = "pakaian_id", nullable=true) // FK ke Pakaian
    private Pakaian objPakaian;

    @ManyToOne
    @JoinColumn(name = "atasan_id", nullable=true) // FK ke Atasan
    private Atasan objAtasan;

    @ManyToOne
    @JoinColumn(name = "bawahan_id", nullable=true) // FK ke Bawahan
    private Bawahan objBawahan;

    @ManyToOne
    @JoinColumn(name = "luaran_id", nullable=true) // FK ke Luaran
    private Luaran objLuaran;

    // Relasi ke pelanggan dan penjual
    @ManyToOne
    @JoinColumn(name = "pelanggan_nohp") // FK ke Pelanggan
    private Pelanggan objPelanggan;

    @ManyToOne
    @JoinColumn(name = "penjual_nohp") // FK ke Penjual
    private Penjual objPenjual;

    public Transaksi() {}

    // Getter & Setter
    public Integer getIdTransaksi() { return idTransaksi; }
    public void setIdTransaksi(Integer idTransaksi) { this.idTransaksi = idTransaksi; }

    public Pakaian getObjPakaian() { return objPakaian; }
    public void setObjPakaian(Pakaian objPakaian) { this.objPakaian = objPakaian; }

    public Atasan getObjAtasan() { return objAtasan; }
    public void setObjAtasan(Atasan objAtasan) { this.objAtasan = objAtasan; }

    public Bawahan getObjBawahan() { return objBawahan; }
    public void setObjBawahan(Bawahan objBawahan) { this.objBawahan = objBawahan; }

    public Luaran getObjLuaran() { return objLuaran; }
    public void setObjLuaran(Luaran objLuaran) { this.objLuaran = objLuaran; }

    public Pelanggan getObjPelanggan() { return objPelanggan; }
    public void setObjPelanggan(Pelanggan objPelanggan) { this.objPelanggan = objPelanggan; }

    public Penjual getObjPenjual() { return objPenjual; }
    public void setObjPenjual(Penjual objPenjual) { this.objPenjual = objPenjual; }

    public Integer getJumlah() { return jumlah; }
    public void setJumlah(Integer jumlah) { this.jumlah = jumlah; }

    public String getTanggal() { return tanggal; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }

    public Long getHargaJual() { return hargaJual; }
    public void setHargaJual(Long hargaJual) { this.hargaJual = hargaJual; }
}
