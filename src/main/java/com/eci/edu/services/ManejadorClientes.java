package com.eci.edu.services;

import com.eci.edu.entities.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by 2098165 on 2/16/17.
 */
@Service
public class ManejadorClientes implements InterfazClientes{

    public ArrayList<Client> clientes = new ArrayList<>();

    public void registrarCliente(Client cliente){

        clientes.add(cliente);
    }

    public ArrayList<Client> getClientes(){

        Client fili= new Client("Juan","jehova", "correo", 654, "juan014", "brasil", "bogota","portugues" );
        clientes.add(fili);
        return clientes;
    }

    public Client getClientePorId(String id){
        Client c=null;

        Client fili= new Client("Juan","jehova", "correo", 654, "juana", "brasil", "bogota","español" );
        clientes.add(fili);
        for (int i=0; i<clientes.size(); i++){
            if(clientes.get(i).getNombreUsuario().equals(id)){
                c=clientes.get(i);
            }
        }
        return c;
    }
}

