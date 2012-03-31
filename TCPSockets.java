package com.habel.plugin.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;


public class TCPSockets extends Plugin {

	@Override
	public PluginResult execute(String action, JSONArray args, String callbackID) {
		Log.d("TCPSockets", "Plugin Called");
	}
	
	public PluginResult sendMessage(JSONArray args)
	{
		try {
			int port  = args.getInt(0);
			String host = args.getString(1);
			String message = args.getString(2);
			String reply = "";
			try {
				Socket sock = new Socket(host, port);
				Log.d("TCPSockets", "Socket created");
				
				PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				
				Log.d("TCPSockets", "Created reader/writer");
				
				out.println(message);
				Log.d("TCPSockets", "Sent message");
				
				reply = in.readLine();
				
				Log.d("TCPSockets", "Received reply: " + reply);
				
				out.close();
				in.close();
				sock.close();
				return new PluginResult(PluginResult.Status.OK, reply);
			} catch (UnknownHostException e) {
				Log.d("TCPSockets", "Unknown Host");
				return new PluginResult(PluginResult.Status.IO_EXCEPTION);
			} catch (IOException e) {
				Log.d("TCPSockets", "IOException");
				return new PluginResult(PluginResult.Status.IO_EXCEPTION);
			}
			
		} catch (JSONException e) {
			Log.d("TCPSockets", "JSONException: " + e.getMessage());
			return new PluginResult(PluginResult.Status.JSON_EXCEPTION);
		}
	}

}
