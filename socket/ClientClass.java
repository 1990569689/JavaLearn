package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientClass {
    public static String ip = "";
    public static int port = 80;

    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("连接到主机：" + ip + " ，端口号：" + port);
        Socket client=new Socket(ip,port);
        System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
        OutputStream outToServer = client.getOutputStream();
        DataOutputStream out = new DataOutputStream(outToServer);

        out.writeUTF("Hello from " + client.getLocalSocketAddress());
        InputStream inFromServer = client.getInputStream();
        DataInputStream in = new DataInputStream(inFromServer);
        System.out.println("服务器响应： " + in.readUTF());
        client.close();
        
    }

}
