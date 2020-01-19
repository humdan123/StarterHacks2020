

import java.util.*;
import javax.swing.JOptionPane;


public class UserPrompts {

    //String prompts[][] = new String[2][6];

    public UserPrompts(String[][] prompts){
      //  this.prompts = prompts;
    }

    public static void main(String[] args) {

        String prompts[][] = new String[2][6];

        prompts[0][0] = "Mood (Enter a number between 1 and 5)";
        prompts[0][1] = "Enthusiasm (Enter a number between 1 and 5)";
        prompts[0][2] = "Eating (Enter a number between 1 and 5)";
        prompts[0][3] = "Energy (Enter a number between 1 and 5)";
        prompts[0][4] = "Focus (Enter a number between 1 and 5)";
        prompts[0][5] = "Guilt (Enter a number between 1 and 5)";

        int i = 0;


        while (i < 6)  {
            prompts[1][i] = JOptionPane.showInputDialog(null, prompts[0][i]);

            if ((Integer.parseInt(prompts[1][i]) < 1) || (Integer.parseInt(prompts[1][i]) > 5)) {
                prompts[1][i] = JOptionPane.showInputDialog(null, prompts[0][i] + "\nPlease enter a number between the constaints!");
            }
           
            else {
                i = i + 1;
            }
        }

        for (int j = 0; j < 6; j++) {
            System.out.println(prompts[1][j]);
        }
      

        
     
       
       
    }
}