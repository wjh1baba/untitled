package 网络通信.UDP.多发多收案例;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


//发送端
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("================客户端启动================");
        //1.创建发送端对象,发送端自带默认端口号，也可以指定给一个端口号DatagramSocket()到括号中
        DatagramSocket socket = new DatagramSocket(7777);
        //2.创建一个数据包对象封装数据(韭菜盘子)
        //public DatagramPacket(byte buf[], int length,InetAddress address, int port)
        //参数一  发送数据内容(韭菜)
        //参数二  发送数据的大小
        //参数三  服务端的主机ip地址
        //参数四  服务端的端口号
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你想发送的内容:");
            String nums = sc.nextLine();
            if ("exit".equals(nums)){
                System.out.println("退出成功");
                //结束线程
                socket.close();
                break;
            }
            byte[] bytes = nums.getBytes();

            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),8888);
            //发送数据
            socket.send(packet);
        }


    }
}
