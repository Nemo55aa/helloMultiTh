
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import myThread.helloTh;
import myThread.worldTh;

public class App {
    public static void main(String[] args) throws Exception {
        MyFrame f = new MyFrame();
        f.setVisible(true);

        helloTh heTh = new helloTh();
        worldTh wldTh = new worldTh();
        
        heTh.start();
        wldTh.start();

        System.out.println("Hello, World!");
    }
}


class MyFrame extends JFrame implements ActionListener{
    JButton b1;
    public MyFrame() {
        Container contentPane = getContentPane();
        b1 = new JButton("Button1");
        
        setSize(300, 200);
        setTitle("My Window Application");
        
        b1.addActionListener(this);
        contentPane.setLayout(new FlowLayout());
        contentPane.add(b1);
        addWindowListener(new MyWindowAdapter());
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1) 
           System.out.println("Button1がクリックされました");
        }
}

/**
 * MyWindowAdapter extend
 */
class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
       System.exit(0);
    }
}