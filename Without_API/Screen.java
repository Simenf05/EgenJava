import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;

public class Screen {

    private JFrame frame;
    private JPanel main;
    private JPanel sub;
    private Font title;
    
    public Screen(String name) {

        title = new Font("Verdana", Font.PLAIN, 25);

        frame = new JFrame(name);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 

        main = new JPanel();

        sub = new JPanel();


        JLabel txt = new JLabel("HEI");
        txt.setFont(title);

        main.add(txt);
        



        JButton button2 = new JButton("Main");
        
        JButton button1 = new JButton("Sub");

        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(sub);
                frame.setVisible(true);
            }
        });

        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(main);
                frame.setVisible(true);
            }
        });
        

        main.add(button1);
        sub.add(button2);
        

        frame.setContentPane(main);
        frame.setVisible(true);
    }

}
