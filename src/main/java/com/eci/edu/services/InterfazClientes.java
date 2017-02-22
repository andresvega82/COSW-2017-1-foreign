package com.eci.edu.services;

import com.eci.edu.entities.Client;
import com.eci.edu.entities.User;

import java.util.ArrayList;

/**
 * Created by 2098165 on 2/16/17.
 */
public interface InterfazClientes {

    void registrarCliente(Client cliente);
    ArrayList<Client> getClientes();
    Client getClientePorId(Integer id);
    boolean registerUser (User user);
}
