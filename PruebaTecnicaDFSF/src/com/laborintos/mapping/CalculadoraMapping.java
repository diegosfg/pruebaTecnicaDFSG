/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborintos.mapping;

import com.laborintos.entity.Calculadora;

/**
 *
 * @author Diego
 */
public class CalculadoraMapping {

    public static Calculadora wsToObjeto(int id, int numero1, int numero2, int suma, int resta, int multiplicacion, int division) {
        Calculadora actual = new Calculadora();
        actual.setId(id);
        actual.setNumero1(numero1);
        actual.setNumero2(numero2);
        actual.setSuma(suma);
        actual.setMultiplicacion(multiplicacion);
        actual.setResta(resta);
        actual.setDivision(division);
        return actual;
    }
}
