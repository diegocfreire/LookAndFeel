import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Properties;

/**
 * Created by diego on 06/01/2015.
 */
public class App {

    private static String propValue;

    public static void main(String...args) {

        try {
            //UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
            UIManager.setLookAndFeel(new SyntheticaSimple2DLookAndFeel());
            //UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Lê arquivo de configuração salvo na mesma pasta do arquivo Jar
        try {
            FileInputStream input = new FileInputStream("./config.ini");
            Properties props = new Properties();
            props.load(input);
            propValue = props.getProperty("param1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainForm m = new MainForm();
                m.getTextField1().setText(propValue);
                m.setVisible(true);
            }
        });

    }

}
