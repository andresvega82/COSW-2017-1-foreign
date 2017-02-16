package com.eci.edu.services;

import com.eci.edu.entities.Client;

import java.util.ArrayList;

/**
 * Created by 2098165 on 2/16/17.
 */
public class ManejadorClientes {

    public ArrayList<Client> clientes = new ArrayList<>();

    public void registrarCliente(Client cliente){

        clientes.add(cliente);
    }

    public ArrayList<Client> getClientes(){

        return clientes;
    }

    public Client getClientePorId(String id){
        Client c=null;
        for (int i=0; i<clientes.size(); i++){
            if(clientes.get(i).getNombreUsuario()==id){
                c=clientes.get(i);
            }
        }
        return c;
    }
}

