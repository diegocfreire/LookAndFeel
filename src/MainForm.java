import javax.swing.*;

/**
 * Created by diego on 06/01/2015.
 */
public class MainForm extends JFrame {
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sairButton;
    private JButton confirmarButton;
    private JTextArea textArea1;

    public MainForm() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Teste de LookAndFeel");
        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null);
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }
}
