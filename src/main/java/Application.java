import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    //private JButton addOrder = new JButton("+");

    public static void setMature(boolean mature) {
        isMature = mature;
    }

    private static boolean isMature;

    public Application(){
        super("Orders");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(new FlowLayout(FlowLayout.LEFT));



        setVisible(true);

        new Registration();

    }
}
