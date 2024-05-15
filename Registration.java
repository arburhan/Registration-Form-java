
/**
 * Registration
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame {
    Container c;
    JLabel firstLabel, lastLabel, birthLabel, genderLabel, emailLabel, phoneLabel, subjectLabel;
    JTextField firstField, lastField, birthField, emailField, phoneField;
    JRadioButton maleRadio, femaleRadio;
    JComboBox subjectBox;
    JButton submitBtn, clearBtn;
    ButtonGroup genderGroup;

    Registration() {
        setTitle("Registration Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 550);
        c = getContentPane();
        setResizable(false);
        c.setLayout(null);

        // first name
        firstLabel = new JLabel("First Name");
        firstLabel.setBounds(30, 30, 80, 80);
        c.add(firstLabel);

        firstField = new JTextField();
        firstField.setBounds(30, 80, 150, 30);
        firstField.setText("AR");
        c.add(firstField);

        // last name
        lastLabel = new JLabel("Last Name");
        lastLabel.setBounds(200, 30, 80, 80);
        c.add(lastLabel);

        lastField = new JTextField();
        lastField.setBounds(200, 80, 150, 30);
        lastField.setText("Burhan");
        c.add(lastField);

        // birth field
        birthLabel = new JLabel("Birthday");
        birthLabel.setBounds(30, 120, 80, 80);
        c.add(birthLabel);

        birthField = new JTextField();
        birthField.setBounds(30, 170, 150, 30);
        c.add(birthField);

        // gender
        genderLabel = new JLabel("Gender");
        genderLabel.setBounds(200, 130, 80, 80);
        c.add(genderLabel);

        maleRadio = new JRadioButton();
        maleRadio.setBounds(200, 180, 80, 20);
        maleRadio.setText("Male");
        c.add(maleRadio);
        femaleRadio = new JRadioButton();
        femaleRadio.setBounds(280, 180, 80, 20);
        femaleRadio.setText("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        c.add(femaleRadio);

        // Email
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(30, 200, 80, 80);
        c.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(30, 250, 150, 30);
        c.add(emailField);

        // phone
        phoneLabel = new JLabel("Phone Number");
        phoneLabel.setBounds(200, 200, 150, 80);
        c.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(200, 250, 150, 30);
        c.add(phoneField);

        // subject
        subjectLabel = new JLabel("Subject");
        subjectLabel.setBounds(30, 290, 80, 80);
        c.add(subjectLabel);

        subjectBox = new JComboBox();
        subjectBox.setBounds(30, 340, 340, 30);
        subjectBox.setEditable(true);
        c.add(subjectBox);

        // Submit
        submitBtn = new JButton("Submit");
        submitBtn.setBounds(30, 390, 100, 40);
        submitBtn.setBackground(Color.blue);
        submitBtn.setForeground(Color.white);
        c.add(submitBtn);

        // clear
        clearBtn = new JButton("Clear");
        clearBtn.setBounds(200, 390, 100, 40);
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstField.setText("");
                lastField.setText("");
                birthField.setText("");
                emailField.setText("");
                phoneField.setText("");
            }

        });
        c.add(clearBtn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Registration();

    }
}
