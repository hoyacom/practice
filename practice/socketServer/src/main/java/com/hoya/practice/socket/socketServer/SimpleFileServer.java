package com.hoya.practice.socket.socketServer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleFileServer {

	public final static int SOCKET_PORT = 13267; // you may change this

	/**
	 * filename
	 */
//	public final static String FILE_TO_SEND = "c:/temp/source.pdf";
	public final static String FILE_TO_SEND = "pom.xml";

	public static void main(String[] args) throws IOException {
		ServerSocket servsock = null;
		try {
			servsock = new ServerSocket(SOCKET_PORT);
			while (true) {
				System.out.println("1Waiting...");
				sendFileIfAcceptedConnection(servsock);
				System.out.println("2Waiting...");
			}
		} finally {
			if (servsock != null)
				servsock.close();
		}
	}

	/**
	 * Created date : Sep 8, 2016 2:28:34 PM
	 * @author hoyacom
	 * @since 
	 * @param servsock
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private static void sendFileIfAcceptedConnection(ServerSocket servsock) throws IOException, FileNotFoundException {
		FileInputStream fis;
		BufferedInputStream bis = null;
		OutputStream os = null;
		Socket sock = null;
		try {
			sock = servsock.accept();
			System.out.println("Accepted connection : " + sock);
			// send file
			File myFile = new File(FILE_TO_SEND);
			byte[] mybytearray = new byte[(int) myFile.length()];
			fis = new FileInputStream(myFile);
			bis = new BufferedInputStream(fis);
			bis.read(mybytearray, 0, mybytearray.length);
			os = sock.getOutputStream();
			System.out.println("Sending " + FILE_TO_SEND + "(" + mybytearray.length + " bytes)");
			os.write(mybytearray, 0, mybytearray.length);
			os.flush();
			System.out.println("Done.");
		} finally {
			if (bis != null)
				bis.close();
			if (os != null)
				os.close();
			if (sock != null)
				sock.close();
		}
	}
}