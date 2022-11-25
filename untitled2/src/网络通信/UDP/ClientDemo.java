package 网络通信.UDP;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//发送端
public class ClientDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("================客户端启动================");
        //1.创建发送端对象,发送端自带默认端口号，也可以指定给一个端口号DatagramSocket()到括号中
        DatagramSocket socket = new DatagramSocket();
        //2.创建一个数据包对象封装数据(韭菜盘子)
        //public DatagramPacket(byte buf[], int length,InetAddress address, int port)
        //参数一  发送数据内容(韭菜)
        //参数二  发送数据的大小
        //参数三  服务端的主机ip地址
        //参数四  服务端的端口号
        byte[] bytes = "李冲在裸奔".getBytes();

        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),8888);
        //发送数据
        socket.send(packet);
        //结束线程
        socket.close();
    }
}
