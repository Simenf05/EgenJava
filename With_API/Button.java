import javax.swing.JButton;
import java.awt.event.*;


public class Button {
    private String name;
    private JButton button;
    private ActionListener action;

    public void changeWidth(Screen.Rect rect) {
        button.setSize(rect.width(), button.getHeight());
    }

    public void changeHeight(Screen.Rect rect) {
        button.setSize(button.getWidth(), rect.height());
    }

    public void changeSize(Screen.Rect rect) {
        button.setSize(rect.width(), rect.width());
    }

    public void changeVert(Screen.Rect rect) {
        switch(rect.align().vert()) {

            case ("none") : {
                button.setVerticalAlignment(JButton.CENTER);
            }

            case ("TOP") : {
                button.setVerticalAlignment(JButton.TOP);
            }

            case ("BOTTOM") : {
                button.setVerticalAlignment(JButton.BOTTOM);
            }

            
        }
    }

    public void changeHori(Screen.Rect rect) {
        switch(rect.align().hori()) {
                    

                    case ("none") : {
                        button.setHorizontalAlignment(JButton.CENTER);
                    }

                    case ("CENTER") : {
                        button.setHorizontalAlignment(JButton.CENTER);
                    }

                    case ("LEFT") : {
                        button.setHorizontalAlignment(JButton.LEFT);
                    }

                    case ("RIGHT") : {
                        button.setHorizontalAlignment(JButton.RIGHT);
                    }

                    case ("LEADING") : {
                        button.setHorizontalAlignment(JButton.LEADING);
                    }

                    case ("TRAILING") : {
                        button.setHorizontalAlignment(JButton.TRAILING);
                    }

                }
    }

    public Button(String name, String txt, Screen.Rect rect, ActionListener action){
        this.name = name;
        this.action = action;

        System.out.println(JButton.CENTER);

        button = new JButton(txt);

        changeHori(rect);
        changeVert(rect);
        changeSize(rect);

        button.addActionListener(this.action);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAction(ActionListener action) {
        this.action = action;
    }

    public ActionListener getAction() {
        return action;
    }

    public void setClickable(boolean b) {
        button.setEnabled(b);
    }

    public void changeText(String txt) {
        button.setText(txt);
    };

    public JButton getButton() {
        return button;
    }

}
