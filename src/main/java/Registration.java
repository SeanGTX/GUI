import javax.swing.*;
import java.awt.*;

public class Registration extends JFrame {

    JLabel titleName1 = new JLabel("First name");
    JTextField firstName = new JTextField(30);

    JLabel titleName2 = new JLabel("Second name");
    JTextField secondName = new JTextField(30);

    JLabel titleAddress = new JLabel("Address");
    JTextField address = new JTextField(30);

    JCheckBox isMature = new JCheckBox("18+");

    JButton submit = new JButton("Submit");


    Registration(){
        super("Registration");

        setSize(300, 400);
        setResizable(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        setLayout(new FlowLayout());

        add(titleName1);
        add(firstName);

        add(titleName2);
        add(secondName);

        add(titleAddress);
        add(address);

        add(isMature);

        setLocationRelativeTo(null);

        submit.addActionListener(e ->{

            Application.setMature(isMature.isEnabled());
            setVisible(false);

        });

        add(submit);
        setVisible(true);

    }

}
