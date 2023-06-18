import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.util.Arrays;

public class Menu {
    private JMenuBar menuBar;
    private JMenu[] menu;
    private JMenuItem[][] menuItems;

    private JMenuItem[] fileItem() {
        JMenuItem[] arr = new JMenuItem[]{}; 

        

        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = new JMenuItem("Exit");
        
        
        
        


        return arr;
    }

    public Menu(String[] nameList) {

        menuBar = new JMenuBar();
        menu = new JMenu[]{};
        menuItems = new JMenuItem[][]{};

        for (String name : nameList) {

            menu = Arrays.copyOf(menu, menu.length + 1);
            menu[menu.length - 1] = new JMenu(name);

            if (name == "File") {

                menuItems = Arrays.copyOf(menuItems, menuItems.length + 1);
                menuItems[menuItems.length - 1] = fileItem();
                
            }
            

            menuBar.add(menu[menu.length - 1]);

        }

        
        


    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }

}
