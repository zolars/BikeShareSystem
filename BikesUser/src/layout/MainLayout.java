package layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import application.Main;

/**
 * MainLayout
 * 
 * @author Xin Yifei
 * @version 0.1
 */
public class MainLayout extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel controlPanel = new JPanel();
    private JPanel displayPanel = new JPanel();
    private CardLayout cardLayout = new CardLayout();

    public MainLayout() {
        init();
    }

    private void init() {
        setLayout(new BorderLayout());

        add(displayPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        displayPanel.setLayout(cardLayout);
        controlPanel.setPreferredSize(new Dimension(0, 65));
        controlPanel.setLayout(new GridLayout());
        controlPanel.setBackground(Color.BLACK);

        for (int i = 0; i < Main.funcSet.size(); i++) {
            addFunc(this, Main.funcSet.get(i).getName(), Main.funcSet.get(i));
        }

        setSize(900, 600);
        setMinimumSize(new Dimension(1000, 700));
        setTitle("Shared Bike System " + Main.version);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // A new function label page in order to increase new functions easily.
    public void addFunc(MainLayout mainLayout, String labelPageName, JPanel funcPanel) {
        JPanel controlPanel = mainLayout.getControlPanel();
        JPanel displayPanel = mainLayout.getDisplayPanel();
        CardLayout cardLayout = mainLayout.getCardLayout();

        displayPanel.add(labelPageName, funcPanel);

        JButton btn = new JButton(labelPageName);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(displayPanel, labelPageName);
                setTitle("Shared Bike System " + Main.version + " " + labelPageName);
            }
        });

        controlPanel.add(btn);

        mainLayout.setControlPanel(controlPanel);
        mainLayout.setDisplayPanel(displayPanel);
        mainLayout.setCardLayout(cardLayout);
    }

    /**
     * @param controlPanel the controlPanel to set
     */
    public void setControlPanel(JPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    /**
     * @return the controlPanel
     */
    public JPanel getControlPanel() {
        return controlPanel;
    }

    /**
     * @param displayPanel the displayPanel to set
     */
    public void setDisplayPanel(JPanel displayPanel) {
        this.displayPanel = displayPanel;
    }

    /**
     * @return the displayPanel
     */
    public JPanel getDisplayPanel() {
        return displayPanel;
    }

    /**
     * @param cardLayout the cardLayout to set
     */
    public void setCardLayout(CardLayout cardLayout) {
        this.cardLayout = cardLayout;
    }

    /**
     * @return the cardLayout
     */
    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public static void main(String[] args) {
        Main.setup();
    }
}