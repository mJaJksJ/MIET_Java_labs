
import javax.swing.*;

import static java.lang.Thread.sleep;

/**
 * @author Max Myasikov PIN-34
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Game.init();

        JFrame.setDefaultLookAndFeelDecorated(true);

        MainFrame.init();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame.run();
            }
        });

    }
}