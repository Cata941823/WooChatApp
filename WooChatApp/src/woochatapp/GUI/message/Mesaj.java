/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package woochatapp.GUI.message;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author anton
 */
public class Mesaj {
    private SimpleDateFormat dataTrimiterii;
    private String senderName;
    private String message;
    private String photoPath;
    /*
        punem poze
    */
    private ArrayList<String> receiverNames;

    public Mesaj(SimpleDateFormat dataTrimiterii, String senderName, String message, String photoPath, ArrayList<String> receiverNames) {
        this.dataTrimiterii = dataTrimiterii;
        this.senderName = senderName;
        this.message = message;
        this.photoPath = photoPath;
        this.receiverNames = receiverNames;
    }

    public Mesaj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SimpleDateFormat getDataTrimiterii() {
        return dataTrimiterii;
    }

    public String getMessage() {
        return message;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public ArrayList<String> getReceiverNames() {
        return receiverNames;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setDataTrimiterii(SimpleDateFormat dataTrimiterii) {
        this.dataTrimiterii = dataTrimiterii;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public void setReceiverNames(ArrayList<String> receiverNames) {
        this.receiverNames = receiverNames;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
    
}
