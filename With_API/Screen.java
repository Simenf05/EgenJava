import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;


public class Screen {
    private JFrame frame;
    private JPanel panel;
    
    
    public Screen(String screenName) {

        frame = new JFrame(screenName);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 


        panel = new JPanel();
        panel.setLayout(new GridLayout(100, 100));


        String[] nameList = new String[]{"Simen", "Tomas", "jeg", "er", "kul"};

        Rect rect = new Rect(new Alignment("TOP", "CENTER"), 10, 10);

        //Label label = new Label("simen", "heihei", rect);

        Label[] labelList = new Label[]{};

        for (String object : nameList) {
            labelList = Arrays.copyOf(labelList, labelList.length + 1);
            labelList[labelList.length - 1] = new Label(object, object, new Rect(rect.align(), labelList.length, labelList.length));
            panel.add(labelList[labelList.length - 1].getName(), labelList[labelList.length - 1].getLabel());
        }
        
        ActionListener action = new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("noe");
            }
        };

        //Button button = new Button("simen2", "heiheihei", rect, action);

        //panel.add(button.getName(), button.getButton());
        //panel.add(label.getName(), label.getLabel());

        //Menu menu = new Menu(nameList);

        //frame.setJMenuBar(menu.getMenuBar());


        frame.setContentPane(panel);

        frame.setVisible(true);        
        
    }

    public void writeText(String text, Alignment align) {

    }

    public record Alignment(String vert, String hori) {
    }

    public record Rect(Alignment align, int width, int height) {
    }
  
    

}
