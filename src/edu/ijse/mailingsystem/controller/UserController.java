/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mailingsystem.controller;

import edu.ijse.mailingsystem.dto.UserDTO;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author dulan
 */
public interface UserController extends SuperController<UserDTO>{

    public boolean addUser(UserDTO user) throws IOException, RemoteException, MalformedURLException, NotBoundException;

    public boolean modifyUser(UserDTO user) throws IOException, RemoteException, MalformedURLException, NotBoundException;

    public UserDTO searchUser(String userName) throws IOException, RemoteException, MalformedURLException, NotBoundException;

    public ArrayList<UserDTO> getAllUsers() throws IOException, RemoteException, MalformedURLException, NotBoundException;

    public boolean SignIn(UserDTO user) throws IOException, RemoteException, MalformedURLException, NotBoundException;

    public boolean userNameAvailability(String userName) throws IOException, RemoteException, MalformedURLException, NotBoundException;

    public boolean reserveUser(String userName) throws IOException, RemoteException, MalformedURLException, NotBoundException;

    public boolean releaseUser(String userName) throws IOException, RemoteException, MalformedURLException, NotBoundException;

}
