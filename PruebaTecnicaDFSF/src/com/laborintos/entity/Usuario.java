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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Diego
 */
@Entity
@Table(name = "USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.id = :id")
    , @NamedQuery(name = "Usuario.findByName", query = "SELECT u FROM Usuario u WHERE u.name = :name")
    , @NamedQuery(name = "Usuario.findByUsername", query = "SELECT u FROM Usuario u WHERE u.username = :username")
    , @NamedQuery(name = "Usuario.findByAddressStreet", query = "SELECT u FROM Usuario u WHERE u.addressStreet = :addressStreet")
    , @NamedQuery(name = "Usuario.findByAddressSuite", query = "SELECT u FROM Usuario u WHERE u.addressSuite = :addressSuite")
    , @NamedQuery(name = "Usuario.findByAddressCity", query = "SELECT u FROM Usuario u WHERE u.addressCity = :addressCity")
    , @NamedQuery(name = "Usuario.findByAddressZipcode", query = "SELECT u FROM Usuario u WHERE u.addressZipcode = :addressZipcode")
    , @NamedQuery(name = "Usuario.findByAddressGeoLat", query = "SELECT u FROM Usuario u WHERE u.addressGeoLat = :addressGeoLat")
    , @NamedQuery(name = "Usuario.findByAddressGeoIng", query = "SELECT u FROM Usuario u WHERE u.addressGeoIng = :addressGeoIng")
    , @NamedQuery(name = "Usuario.findByPhone", query = "SELECT u FROM Usuario u WHERE u.phone = :phone")
    , @NamedQuery(name = "Usuario.findByWebsite", query = "SELECT u FROM Usuario u WHERE u.website = :website")
    , @NamedQuery(name = "Usuario.findByCompanyName", query = "SELECT u FROM Usuario u WHERE u.companyName = :companyName")
    , @NamedQuery(name = "Usuario.findByCompanyCatchphrase", query = "SELECT u FROM Usuario u WHERE u.companyCatchphrase = :companyCatchphrase")
    , @NamedQuery(name = "Usuario.findByCompanyBs", query = "SELECT u FROM Usuario u WHERE u.companyBs = :companyBs")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ID")
    private String id;
    @Size(max = 40)
    @Column(name = "NAME")
    private String name;
    @Size(max = 20)
    @Column(name = "USERNAME")
    private String username;
    @Size(max = 20)
    @Column(name = "ADDRESS_STREET")
    private String addressStreet;
    @Size(max = 20)
    @Column(name = "ADDRESS_SUITE")
    private String addressSuite;
    @Size(max = 20)
    @Column(name = "ADDRESS_CITY")
    private String addressCity;
    @Size(max = 15)
    @Column(name = "ADDRESS_ZIPCODE")
    private String addressZipcode;
    @Size(max = 15)
    @Column(name = "ADDRESS_GEO_LAT")
    private String addressGeoLat;
    @Size(max = 15)
    @Column(name = "ADDRESS_GEO_ING")
    private String addressGeoIng;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 30)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 20)
    @Column(name = "WEBSITE")
    private String website;
    @Size(max = 50)
    @Column(name = "COMPANY_NAME")
    private String companyName;
    @Size(max = 50)
    @Column(name = "COMPANY_CATCHPHRASE")
    private String companyCatchphrase;
    @Size(max = 50)
    @Column(name = "COMPANY_BS")
    private String companyBs;

    public Usuario() {
    }

    public Usuario(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressSuite() {
        return addressSuite;
    }

    public void setAddressSuite(String addressSuite) {
        this.addressSuite = addressSuite;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressZipcode() {
        return addressZipcode;
    }

    public void setAddressZipcode(String addressZipcode) {
        this.addressZipcode = addressZipcode;
    }

    public String getAddressGeoLat() {
        return addressGeoLat;
    }

    public void setAddressGeoLat(String addressGeoLat) {
        this.addressGeoLat = addressGeoLat;
    }

    public String getAddressGeoIng() {
        return addressGeoIng;
    }

    public void setAddressGeoIng(String addressGeoIng) {
        this.addressGeoIng = addressGeoIng;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCatchphrase() {
        return companyCatchphrase;
    }

    public void setCompanyCatchphrase(String companyCatchphrase) {
        this.companyCatchphrase = companyCatchphrase;
    }

    public String getCompanyBs() {
        return companyBs;
    }

    public void setCompanyBs(String companyBs) {
        this.companyBs = companyBs;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.laborintos.entity.Usuario[ id=" + id + " ]";
    }
    
}
