/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mailingsystem.observer;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Dulan
 */
public interface Subject extends Remote {

    public void registerObsever(Observer observer) throws RemoteException;

    public void unregisterObsever(Observer observer) throws RemoteException;

    public void notifyObsever(String mailReceivers) throws RemoteException;

}
