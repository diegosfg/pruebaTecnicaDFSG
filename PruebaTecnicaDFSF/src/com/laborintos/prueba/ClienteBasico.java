/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborintos.prueba;

import com.laborintos.clientesoap.Calculator;
import com.laborintos.dto.User;
import com.laborintos.mapping.CalculadoraMapping;
import com.laborintos.mapping.UsuarioMapping;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Diego
 */
public class ClienteBasico {

    private static final String URL_WS_REST = "https://jsonplaceholder.typicode.com/users";

    private static final int calculadora_numero1 = 34;

    private static final int calculadora_numero2 = 76;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EntityManager entityManager = Persistence.createEntityManagerFactory("PruebaTecnicaDFSGPU").createEntityManager();
        
        // Web Service SOAP
        Calculator clienteWSSoap = new Calculator();
        
        int suma = clienteWSSoap.getCalculatorSoap().add(calculadora_numero1, calculadora_numero2);
        int resta = clienteWSSoap.getCalculatorSoap().subtract(calculadora_numero1, calculadora_numero2);
        int division = clienteWSSoap.getCalculatorSoap().divide(calculadora_numero1, calculadora_numero2);
        int multiplicacion = clienteWSSoap.getCalculatorSoap().multiply(calculadora_numero1, calculadora_numero2);

        entityManager.getTransaction().begin();
        entityManager.createQuery("DELETE FROM Calculadora").executeUpdate();
        entityManager.persist(CalculadoraMapping.wsToObjeto(1, calculadora_numero1, calculadora_numero2, suma, resta, multiplicacion, division));
        entityManager.getTransaction().commit();
        
        // Web Service Rest
        Client cliente = ClientBuilder.newClient();
        WebTarget webTarget = cliente.target(URL_WS_REST);
        Response response = webTarget.request(MediaType.APPLICATION_JSON_TYPE).get();
        List<User> usuarios = Arrays.asList(response.readEntity(User[].class));

        entityManager.getTransaction().begin();
        //Limpiar la tabla antes de insertar para evitar registros duplicados
        entityManager.createQuery("DELETE FROM Usuario").executeUpdate();
        for (User usuarioActual : usuarios) {
            entityManager.persist(UsuarioMapping.userToUsuario(usuarioActual));
        }
        entityManager.getTransaction().commit();
    }
}
