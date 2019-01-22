/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborintos.mapping;

import com.laborintos.dto.User;
import com.laborintos.entity.Usuario;

/**
 *
 * @author Diego
 */
public class UsuarioMapping {

    /**
     * Convertir objeto de web services a Entity a persistir
     *
     * @param objeto
     * @return
     */
    public static Usuario userToUsuario(User objeto) {

        Usuario usu = new Usuario();
        usu.setId(objeto.getId() != null ? objeto.getId() : " ");
        usu.setName(objeto.getName() != null ? objeto.getName() : " ");
        usu.setUsername(objeto.getUsername() != null ? objeto.getUsername() : " ");
        usu.setAddressStreet(objeto.getAddress() != null && objeto.getAddress().getStreet() != null ? objeto.getAddress().getStreet() : " ");
        usu.setAddressSuite(objeto.getAddress() != null && objeto.getAddress().getSuite() != null ? objeto.getAddress().getSuite() : " ");
        usu.setAddressCity(objeto.getAddress() != null && objeto.getAddress().getCity() != null ? objeto.getAddress().getCity() : " ");
        usu.setAddressZipcode(objeto.getAddress() != null && objeto.getAddress().getZipcode() != null ? objeto.getAddress().getZipcode() : " ");
        usu.setAddressGeoLat(objeto.getAddress() != null && objeto.getAddress().getGeo() != null && objeto.getAddress().getGeo().getLat()!=null  ? objeto.getAddress().getGeo().getLat() : " ");
        usu.setAddressGeoIng(objeto.getAddress() != null && objeto.getAddress().getGeo() != null && objeto.getAddress().getGeo().getLng()!=null  ? objeto.getAddress().getGeo().getLng(): " ");
        usu.setPhone(objeto.getPhone() != null ? objeto.getPhone() : " ");
        usu.setWebsite(objeto.getWebsite() != null ? objeto.getWebsite() : " ");
        usu.setCompanyName(objeto.getCompany() != null && objeto.getCompany().getName() != null ? objeto.getCompany().getName() : " ");
        usu.setCompanyCatchphrase(objeto.getCompany() != null && objeto.getCompany().getCatchPhrase() != null ? objeto.getCompany().getCatchPhrase() : " ");
        usu.setCompanyBs(objeto.getCompany() != null && objeto.getCompany().getBs() != null ? objeto.getCompany().getBs() : " ");
          
        return usu;
    }
}
