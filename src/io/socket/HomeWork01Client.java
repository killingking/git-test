package io.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class HomeWork01Client {
    public static void main(String[] args) throws IOException {
        //服务端  使用ServerSocket
        ServerSocket serverSocket = new ServerSocket(9999);


        BufferedReader br = null;
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        BufferedWriter bw = bw = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream()));;

        bw.write("name");
        bw.flush();
        while(true){
            br = new BufferedReader(new InputStreamReader(serverSocket.accept().getInputStream()));
            System.out.println(br.readLine());
        }
        //
        //}
        //br.close();
        //bw.close();
        //accept.close();
        //socket.close();
    }
}
