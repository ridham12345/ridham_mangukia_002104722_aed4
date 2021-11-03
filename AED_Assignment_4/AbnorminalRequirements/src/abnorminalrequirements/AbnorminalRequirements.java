
package abnorminalrequirements;

import java.awt.Dimension;
import java.awt.Toolkit;


public class AbnorminalRequirements {

    
    public static void main(String[] args) {
        AddDetails d = new AddDetails();
        d.setVisible(true);
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                   d.setSize(screenSize.width, screenSize.height);
                  d.setResizable(false);
      
    }
    
}
