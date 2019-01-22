/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborintos.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Diego
 */
@Entity
@Table(name = "CALCULADORA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calculadora.findAll", query = "SELECT c FROM Calculadora c")
    , @NamedQuery(name = "Calculadora.findByNumero1", query = "SELECT c FROM Calculadora c WHERE c.numero1 = :numero1")
    , @NamedQuery(name = "Calculadora.findByNumero2", query = "SELECT c FROM Calculadora c WHERE c.numero2 = :numero2")
    , @NamedQuery(name = "Calculadora.findBySuma", query = "SELECT c FROM Calculadora c WHERE c.suma = :suma")
    , @NamedQuery(name = "Calculadora.findByResta", query = "SELECT c FROM Calculadora c WHERE c.resta = :resta")
    , @NamedQuery(name = "Calculadora.findByDivision", query = "SELECT c FROM Calculadora c WHERE c.division = :division")
    , @NamedQuery(name = "Calculadora.findByMultiplicacion", query = "SELECT c FROM Calculadora c WHERE c.multiplicacion = :multiplicacion")
    , @NamedQuery(name = "Calculadora.findById", query = "SELECT c FROM Calculadora c WHERE c.id = :id")})
public class Calculadora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "NUMERO1")
    private Integer numero1;
    @Column(name = "NUMERO2")
    private Integer numero2;
    @Column(name = "SUMA")
    private Integer suma;
    @Column(name = "RESTA")
    private Integer resta;
    @Column(name = "DIVISION")
    private Integer division;
    @Column(name = "MULTIPLICACION")
    private Integer multiplicacion;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;

    public Calculadora() {
    }

    public Calculadora(Integer id) {
        this.id = id;
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    public Integer getSuma() {
        return suma;
    }

    public void setSuma(Integer suma) {
        this.suma = suma;
    }

    public Integer getResta() {
        return resta;
    }

    public void setResta(Integer resta) {
        this.resta = resta;
    }

    public Integer getDivision() {
        return division;
    }

    public void setDivision(Integer division) {
        this.division = division;
    }

    public Integer getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(Integer multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calculadora)) {
            return false;
        }
        Calculadora other = (Calculadora) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.laborintos.entity.Calculadora[ id=" + id + " ]";
    }
    
}
