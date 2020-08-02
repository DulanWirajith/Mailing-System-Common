/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mailingsystem.factory;

import edu.ijse.mailingsystem.controller.MailController;
import edu.ijse.mailingsystem.controller.SuperController;
import edu.ijse.mailingsystem.controller.UserController;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author dulan
 */
public interface MailingSystemFactory extends Remote {
    
    public enum ControllerType{
        USER,MAIL;
    }
    
    public SuperController getController(ControllerType controllerType)throws RemoteException;
   
}
