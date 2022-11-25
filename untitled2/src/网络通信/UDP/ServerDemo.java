package 网络通信.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo {
//    接收端   服务端
public static void main(String[] args) throws Exception {
    System.out.println("=============服务端启动=============");
    //1.创建接收端接收数据  接收端口号8888
    DatagramSocket socket = new DatagramSocket(8888);
    //创建盘子的大小
    byte[] bytes = new byte[1024 * 64];
    //2.创建一个数据包对象封装数据(韭菜盘子)
    DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
    //等待接收数据
    socket.receive(packet);
    int len =  packet.getLength();
    //转成字符串类型
    String s = new String(bytes,0,len);
    System.out.println(s);
    socket.close();

    String ip = packet.getSocketAddress().toString();
    System.out.println(ip);
}
}
