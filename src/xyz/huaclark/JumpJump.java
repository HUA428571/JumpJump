package xyz.huaclark;

import java.awt.*;
import javax.swing.*;

public class JumpJump
{
    public static ImageIcon scaleImage(ImageIcon icon, int w, int h)
    {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();

        if (icon.getIconWidth() > w)
        {
            nw = w;
            nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }

        if (nh > h)
        {
            nh = h;
            nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }
        icon = new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_SMOOTH));
        return icon;
    }

    public static void main(String[] args)
    {
        //创建窗口
        JFrame frame = new JFrame("JumpJump");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);//固定大小


        //创建面板
        JPanel panel = new JPanel();
        panel.setBackground(new Color(250, 250, 250));
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        //创建标签
        ImageIcon chess = new ImageIcon("src/images/chess.png");
        chess = scaleImage(chess, 50, 50);
        JLabel label = new JLabel(chess);
        frame.setBounds(0, 0, 800, 600);
        panel.setBounds(0, 0, 800, 600);

        panel.add(label);
        frame.add(panel);

    }
}

