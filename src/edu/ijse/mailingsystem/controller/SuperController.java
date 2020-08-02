/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mailingsystem.controller;

import edu.ijse.mailingsystem.dto.SuperDTO;
import java.rmi.Remote;

/**
 *
 * @author Dulan
 */
public interface SuperController<T extends SuperDTO> extends Remote{
    
}
