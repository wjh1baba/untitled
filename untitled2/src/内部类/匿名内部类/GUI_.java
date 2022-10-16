package 内部类.匿名内部类;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GUI_ {
    public static void main(String[] args) {
        // 1.创建窗口
        JFrame win = new JFrame("登录界面");

        //添加桌布
        JPanel panel = new JPanel();
        win.add(panel);

        //创建一个按钮对象
        JButton btn = new JButton("登录");


        //匿名内部类   监听事件
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"点我");
            }
        });
        //把按钮对象添加到桌布上展示
        panel.add(btn);

        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
