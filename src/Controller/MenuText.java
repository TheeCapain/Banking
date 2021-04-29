package Controller;

import java.util.Arrays;

public class MenuText {
    private String[] menuText = new String[]{"1.", "2.", "3"};

    public void printMenuText() {
        for (int i = 0; i < menuText.length; i++) {
            Arrays.toString(menuText);
        }
    }
    
    @Override
    public String toString() {
        return    "menuText=" + Arrays.toString(menuText);
    }
}


