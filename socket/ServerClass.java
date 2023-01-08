package socket;
/*
网络编程是指编写运行在多个设备（计算机）的程序，这些设备都通过网络连接起来。

java.net 包中 J2SE 的 API 包含有类和接口，它们提供低层次的通信细节。你可以直接使用这些类和接口，来专注于解决问题，而不用关注通信细节。

java.net 包中提供了两种常见的网络协议的支持：

TCP：TCP（英语：Transmission Control Protocol，传输控制协议） 是一种面向连接的、可靠的、基于字节流的传输层通信协议，TCP 层是位于 IP 层之上，应用层之下的中间层。TCP 保障了两个应用程序之间的可靠通信。通常用于互联网协议，被称 TCP / IP。

UDP：UDP （英语：User Datagram Protocol，用户数据报协议），位于 OSI 模型的传输层。一个无连接的协议。提供了应用程序之间要发送数据的数据报。由于UDP缺乏可靠性且属于无连接协议，所以应用程序通常必须容许一些丢失、错误或重复的数据包。

本教程主要讲解以下两个主题。

Socket 编程：这是使用最广泛的网络概念，它已被解释地非常详细。
Socket 编程
套接字使用TCP提供了两台计算机之间的通信机制。 客户端程序创建一个套接字，并尝试连接服务器的套接字。

当连接建立时，服务器会创建一个 Socket 对象。客户端和服务器现在可以通过对 Socket 对象的写入和读取来进行通信。

java.net.Socket 类代表一个套接字，并且 java.net.ServerSocket 类为服务器程序提供了一种来监听客户端，并与他们建立连接的机制。

以下步骤在两台计算机之间使用套接字建立TCP连接时会出现：

服务器实例化一个 ServerSocket 对象，表示通过服务器上的端口通信。

服务器调用 ServerSocket 类的 accept() 方法，该方法将一直等待，直到客户端连接到服务器上给定的端口。

服务器正在等待时，一个客户端实例化一个 Socket 对象，指定服务器名称和端口号来请求连接。

Socket 类的构造函数试图将客户端连接到指定的服务器和端口号。如果通信被建立，则在客户端创建一个 Socket 对象能够与服务器进行通信。

在服务器端，accept() 方法返回服务器上一个新的 socket 引用，该 socket 连接到客户端的 socket。

连接建立后，通过使用 I/O 流在进行通信，每一个socket都有一个输出流和一个输入流，客户端的输出流连接到服务器端的输入流，而客户端的输入流连接到服务器端的输出流。

TCP 是一个双向的通信协议，因此数据可以通过两个数据流在同一时间发送.以下是一些类提供的一套完整的有用的方法来实现 socket。
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass extends Thread{
    private ServerSocket serversocket;
 
     /**
     * 
     */
    public ServerClass(int port) throws IOException
     {
     serversocket=new ServerSocket(port);
     serversocket.setSoTimeout(10000);
     }
     public void run()
     {
        while(true)
        {
         try
         {
            //getLocalPort获得port端口
            System.out.println("等待远程连接，端口号为：" + serversocket.getLocalPort() + "...");
            Socket server = serversocket.accept();
            //没连接返回null连接返回地址
            System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
            //得到数据输入流
            DataInputStream in = new DataInputStream(server.getInputStream());
            System.out.println(in.readUTF());
            //写输出流到客户端
            DataOutputStream out = new DataOutputStream(server.getOutputStream());
            out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
            server.close();
         }catch(IOException e)
         {

         }
        }
     }
     /**
    * @param args
    */
   public static void main(String[] args) {
        try
        {
        Thread t=new ServerClass(80);
        t.run();
        }catch(IOException e)
        {

        }

     }
    
}
