import Frames.InvoicesTableFrame;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void initUI(){
        try {

            UIManager.setLookAndFeel( new FlatMacDarkLaf() );
            UIManager.put("Table.showVerticalLines",true);
            UIManager.put("Table.showHorizontalLines",true);
            UIManager.put( "Button.arc", 10 );
            UIManager.put( "Component.arc", 10 );
            UIManager.put( "ProgressBar.arc", 10 );
            UIManager.put( "TextComponent.arc", 10 );
            UIManager.put( "ScrollBar.thumbArc", 999 );
            UIManager.put( "ScrollBar.thumbInsets", new Insets( 2, 2, 2, 2 ) );
            UIManager.put( "Table.intercellSpacing", new Dimension( 0, 1 ) );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize FlatLaF" );
        }
    }



    /**
     * @author Tommaso Braglia
     */
    public static void main(String[] args) {

        //applicazione di look and feel personalizzati basati su FlatLaF
        initUI();

        //generazione frame principale
        InvoicesTableFrame frame = new InvoicesTableFrame();
        frame.setVisible(true);

    }
}