package io.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class HomeWork01Server {
    public static void main(String[] args) throws IOException {
        //服务端  使用ServerSocket
        ServerSocket serverSocket = new ServerSocket(8888);

        BufferedReader br = null;
        String str = null;
        Socket accept = null;
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));;
        while (true) {
            accept = serverSocket.accept();
            br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            if ("name".equals(br.readLine())) {
                bw.write("我是nova");
                System.out.println("收到");
            } else if ("hobby".equals(br.readLine())) {
                bw.write("编写java程序");
            }else{
                bw.write("你说啥??");
            }
        }

        //br.close();
        //bw.close();
        //accept.close();
    }
}
