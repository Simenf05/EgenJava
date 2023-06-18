import javax.swing.JLabel;

public class Label {
    private String name;
    private JLabel label;

    public Label(String name, String txt, Screen.Rect rect) {
        this.name = name;

        System.out.println(rect.align().hori());
        switch(rect.align().hori()) {
            

            case ("none") : {
                label = new JLabel(txt, JLabel.CENTER);
            }

            case ("CENTER") : {
                label = new JLabel(txt, JLabel.CENTER);
            }

            case ("LEFT") : {
                label = new JLabel(txt, JLabel.LEFT);
            }

            case ("RIGHT") : {
                label = new JLabel(txt, JLabel.RIGHT);
            }

            case ("LEADING") : {
                label = new JLabel(txt, JLabel.LEADING);
            }

            case ("TRAILING") : {
                label = new JLabel(txt, JLabel.TRAILING);
            }

        }

        switch(rect.align().vert()) {

            case ("none") : {
                label.setVerticalTextPosition(JLabel.CENTER);
            }

            case ("TOP") : {
                label.setVerticalTextPosition(JLabel.TOP);
            }

            case ("BOTTOM") : {
                label.setVerticalTextPosition(JLabel.BOTTOM);
            }

            
        }

        label.setSize(rect.width(), rect.height());
        
    }

    public JLabel getLabel() {
        return label;
    }

    public void changeText(String txt) {
        label.setText(txt);
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
