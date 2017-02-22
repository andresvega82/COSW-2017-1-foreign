package com.eci.edu.services;

import com.eci.edu.entities.Client;
import com.eci.edu.entities.User;
import com.eci.edu.services.InterfazClientes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by 2098165 on 2/16/17.
 */
@Service
public class ManejadorClientes implements InterfazClientes {
    public Hashtable<String, User> stubMemory = new Hashtable<>();
    public ArrayList<Client> clientes = new ArrayList<>();

    public void registrarCliente(Client cliente){

        clientes.add(cliente);
    }
    @Override
    public ArrayList<Client> getClientes(){

        Client fili= new Client(1, "Juan","jehova", "correo", 654, "juan014", "brasil", "bogota","portugues" );
        clientes.add(fili);
        return clientes;
    }
    @Override
    public Client getClientePorId(Integer id){
        Client c=null;

        Client fili= new Client(2, "Juan","jehova", "correo", 654, "juana", "brasil", "bogota","español" );
        clientes.add(fili);
        for (int i=0; i<clientes.size(); i++){
            if(clientes.get(i).getNombreUsuario().equals(id)){
                c=clientes.get(i);
            }
        }
        return c;
    }

    @Override
    /**
     * Registrar un usuario al sistema.
     */
    public boolean registerUser(User user) {

        if(stubMemory.contains(user.getEmail()))return false;
        stubMemory.put(user.getEmail(),user);
        return true;
    }
}

