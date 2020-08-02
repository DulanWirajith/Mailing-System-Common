/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mailingsystem.dto;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author dulan
 */
public class MailDTO extends SuperDTO {

    private String mailID;
    private String senderName;
    private String[] receiversNames;
    private String mailContent;
    private String mailTopic;
    private String attachmentName;
    private String attachmentPath;
    private String mailSentDate;
//    String mailReceiveDate;
    private String mailSentTime;
//    String mailReceivedTime;
//    private File attachmentFile;
    private byte[] attachmentInByteArray;
    private String receiverName;
    private String ifNewMail;

    public MailDTO() {
    }

    public MailDTO(String mailID, String senderName, String[] receiversNames, String mailContent, String mailTopic, String attachmentName, String attachmentPath, String mailSentDate, String mailSentTime, byte[] attachmentInByteArray) {
        this.mailID = mailID;
        this.senderName = senderName;
        this.receiversNames = receiversNames;
        this.mailContent = mailContent;
        this.mailTopic = mailTopic;
        this.attachmentName = attachmentName;
        this.attachmentPath = attachmentPath;
        this.mailSentDate = mailSentDate;
        this.mailSentTime = mailSentTime;
        this.attachmentInByteArray = attachmentInByteArray;
    }

    public MailDTO(String mailID, String senderName, String receiverName, String mailContent, String mailTopic, String attachmentName, String attachmentPath, String mailSentDate, String mailSentTime) {
        this.mailID = mailID;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.mailContent = mailContent;
        this.mailTopic = mailTopic;
        this.attachmentName = attachmentName;
        this.attachmentPath = attachmentPath;
        this.mailSentDate = mailSentDate;
        this.mailSentTime = mailSentTime;
    }

    public MailDTO(String mailID, String senderName, String receiverName, String mailContent, String mailTopic, String attachmentName, String attachmentPath, String mailSentDate, String mailSentTime, String ifNewMail) {
        this.mailID = mailID;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.mailContent = mailContent;
        this.mailTopic = mailTopic;
        this.attachmentName = attachmentName;
        this.attachmentPath = attachmentPath;
        this.mailSentDate = mailSentDate;
        this.mailSentTime = mailSentTime;
        this.ifNewMail=ifNewMail;
    }

    /**
     * @return the mailID
     */
    public String getMailID() {
        return mailID;
    }

    /**
     * @param mailID the mailID to set
     */
    public void setMailID(String mailID) {
        this.mailID = mailID;
    }

    /**
     * @return the senderName
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * @param senderName the senderName to set
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * @return the receiversNames
     */
    public String[] getReceiversNames() {
        return receiversNames;
    }

    /**
     * @param receiversNames the receiversNames to set
     */
    public void setReceiversNames(String[] receiversNames) {
        this.receiversNames = receiversNames;
    }

    /**
     * @return the mailContent
     */
    public String getMailContent() {
        return mailContent;
    }

    /**
     * @param mailContent the mailContent to set
     */
    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    /**
     * @return the mailTopic
     */
    public String getMailTopic() {
        return mailTopic;
    }

    /**
     * @param mailTopic the mailTopic to set
     */
    public void setMailTopic(String mailTopic) {
        this.mailTopic = mailTopic;
    }

    /**
     * @return the attachmentName
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    /**
     * @param attachmentName the attachmentName to set
     */
    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    /**
     * @return the attachmentPath
     */
    public String getAttachmentPath() {
        return attachmentPath;
    }

    /**
     * @param attachmentPath the attachmentPath to set
     */
    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

    /**
     * @return the mailSentDate
     */
    public String getMailSentDate() {
        return mailSentDate;
    }

    /**
     * @param mailSentDate the mailSentDate to set
     */
    public void setMailSentDate(String mailSentDate) {
        this.mailSentDate = mailSentDate;
    }

    /**
     * @return the mailSentTime
     */
    public String getMailSentTime() {
        return mailSentTime;
    }

    /**
     * @param mailSentTime the mailSentTime to set
     */
    public void setMailSentTime(String mailSentTime) {
        this.mailSentTime = mailSentTime;
    }

    /**
     * @return the attachmentInByteArray
     */
    public byte[] getAttachmentInByteArray() {
        return attachmentInByteArray;
    }

    /**
     * @param attachmentInByteArray the attachmentInByteArray to set
     */
    public void setAttachmentInByteArray(byte[] attachmentInByteArray) {
        this.attachmentInByteArray = attachmentInByteArray;
    }

    /**
     * @return the receiverName
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * @param receiverName the receiverName to set
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * @return the ifNewMail
     */
    public String getIfNewMail() {
        return ifNewMail;
    }

    /**
     * @param ifNewMail the ifNewMail to set
     */
    public void setIfNewMail(String ifNewMail) {
        this.ifNewMail = ifNewMail;
    }
    
    
}
