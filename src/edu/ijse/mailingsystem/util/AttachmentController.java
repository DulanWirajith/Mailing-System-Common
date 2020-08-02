/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mailingsystem.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Dulan
 */
/*
create date,name
description
modified date name description about the modification
 */
public class AttachmentController {

    public static byte[] saveAttachment(String attachmentPath) throws FileNotFoundException, IOException {
        return Files.readAllBytes(Paths.get(attachmentPath));
//File sendingFile = new File(attachmentPath);
//        if (sendingFile.exists()) {
//            System.out.println("File Attachment Path is OK");
//            FileInputStream fileInputStream = new FileInputStream(sendingFile);
//            byte[] fileToByteArray = new byte[fileInputStream.available()];
//            fileInputStream.read(fileToByteArray);
////\src\edu\ijse\mailingsystem
//            File savingFile = new File(".//src//edu//ijse//mailingsystem//util//attachmentSavingFile");
//            if (!savingFile.exists()) {
//                savingFile.createNewFile();
//                
//            }else{
//                savingFile.delete();
//                savingFile.createNewFile();
//            }
//
//            FileOutputStream fileOutputStream = new FileOutputStream(savingFile);
//            fileOutputStream.write(fileToByteArray);
//            fileOutputStream.flush();
//            fileInputStream.close();
//            fileOutputStream.close();
//            System.out.println("savingFile is successfully created..");
//            return savingFile;
//        }
//        return null;
//        File sendingFile = new File(attachmentPath);
//        if (sendingFile.exists()) {
//            System.out.println("File Attachment Path is OK");
//            FileInputStream fileInputStream = new FileInputStream(sendingFile);
//            byte[] fileToByteArray = new byte[fileInputStream.available()];
//            
//            System.out.println("byte Array is successfully created..");
//            return fileToByteArray;
//        }
//        return null;

    }
}
