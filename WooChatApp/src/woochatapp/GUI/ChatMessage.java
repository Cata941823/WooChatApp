/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package woochatapp.GUI;

import java.io.Serializable;

/**
 *
 * @author anton
 */
public class ChatMessage implements Serializable {

	// The different types of message sent by the Client
	// WHOISIN to receive the list of the users connected
	// MESSAGE an ordinary text message
	// LOGOUT to disconnect from the Server
	public static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;
        int type;
        String message;
	
	// constructor
	public ChatMessage(int type, String message) {
		this.type = type;
		this.message = message;
	}
	
	public int getType() {
		return type;
	}

	public String getMessage() {
		return message;
	}
}
