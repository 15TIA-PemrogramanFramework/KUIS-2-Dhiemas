/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis2_dimas.kuis2_1021.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "ipk_1021")
public class IPK_1021 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String matkul;
    @Column(length = 255, nullable = true)
    private String nilai;
     @Column(length = 255, nullable = true)
    private String status;
     @ManyToOne
    private Identitas_1021 identitas_1021;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getMatkul() {
        return matkul;
    }

    /**
     * @param name the name to set
     */
    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    /**
     * @return the description
     */
    public String getNilai() {
        return nilai;
    }

    /**
     * @param description the description to set
     */
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getStatus() {
        return status;
    }

    /**
     * @param description the description to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    public Identitas_1021 getIdentitas_1021() {
        return identitas_1021;
    }

    /**
     * @param category the category to set
     */
    public void setIdentitas_1021(Identitas_1021 identitas_1021) {
        this.identitas_1021 = identitas_1021;
    }
}
