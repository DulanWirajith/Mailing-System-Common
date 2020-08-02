/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mailingsystem.controller;

import edu.ijse.mailingsystem.dto.MailDTO;
import java.io.FileNotFoundException;
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
public interface MailController extends SuperController<MailDTO>{

    public boolean sendMail(MailDTO mail) throws RemoteException, IOException, MalformedURLException, NotBoundException;

    public boolean saveAsDraft(MailDTO mail) throws RemoteException, IOException, MalformedURLException, NotBoundException;

    public boolean viewCurrentMail(String userName, String mailID) throws RemoteException, IOException, MalformedURLException, NotBoundException;

    public ArrayList<MailDTO> viewAllMails(String userName, String folderName, String textFileName) throws RemoteException, IOException, MalformedURLException, NotBoundException;

    public boolean deleteMail(String folderName, String userName, String mailID) throws RemoteException, IOException, MalformedURLException, NotBoundException;

//    public ArrayList<MailDTO> viewTrash() throws RemoteException, IOException, MalformedURLException, NotBoundException;
    public boolean saveReceivedAttachment(String fileSavingPath, String fileSavedPath, String fileName) throws RemoteException, IOException, MalformedURLException, NotBoundException;

    public ArrayList<MailDTO> viewAllMailsToInbox(String userName, String folderName, String textFileName) throws RemoteException, IOException, MalformedURLException, NotBoundException;

    public int countMails(String userName, String fileName) throws RemoteException, MalformedURLException, IOException, NotBoundException;
}
