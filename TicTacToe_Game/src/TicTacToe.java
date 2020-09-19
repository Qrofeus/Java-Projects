import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame{
    public TicTacToe(){
        initComponents();
    }

    public void button1ActionPerformed() {
        if(button1.getText().equals("")){
            if(Main.playerTurn){
                button1.setText("X");
                Main.p1Pos.add(1);
                Main.playerTurn=false;
            } else {
                button1.setText("O");
                Main.p2Pos.add(1);
                Main.playerTurn=true;
            }
            if (!Main.checkWin().equals(""))
                setWinner(Main.checkWin());
        }
    }

    public void button2ActionPerformed() {
        if(button2.getText().equals("")){
            if(Main.playerTurn){
                button2.setText("X");
                Main.p1Pos.add(2);
                Main.playerTurn=false;
            } else {
                button2.setText("O");
                Main.p2Pos.add(2);
                Main.playerTurn=true;
            }
            if (!Main.checkWin().equals(""))
                setWinner(Main.checkWin());
        }
    }

    public void button3ActionPerformed() {
        if(button3.getText().equals("")){
            if(Main.playerTurn){
                button3.setText("X");
                Main.p1Pos.add(3);
                Main.playerTurn=false;
            } else {
                button3.setText("O");
                Main.p2Pos.add(3);
                Main.playerTurn=true;
            }
            if (!Main.checkWin().equals(""))
                setWinner(Main.checkWin());
        }
    }

    public void button4ActionPerformed() {
        if(button4.getText().equals("")){
            if(Main.playerTurn){
                button4.setText("X");
                Main.p1Pos.add(4);
                Main.playerTurn=false;
            } else {
                button4.setText("O");
                Main.p2Pos.add(4);
                Main.playerTurn=true;
            }
            if (!Main.checkWin().equals(""))
                setWinner(Main.checkWin());
        }
    }

    public void button5ActionPerformed() {
        if(button5.getText().equals("")){
            if(Main.playerTurn){
                button5.setText("X");
                Main.p1Pos.add(5);
                Main.playerTurn=false;
            } else {
                button5.setText("O");
                Main.p2Pos.add(5);
                Main.playerTurn=true;
            }
            if (!Main.checkWin().equals(""))
                setWinner(Main.checkWin());
        }
    }

    public void button6ActionPerformed() {
        if(button6.getText().equals("")){
            if(Main.playerTurn){
                button6.setText("X");
                Main.p1Pos.add(6);
                Main.playerTurn=false;
            } else {
                button6.setText("O");
                Main.p2Pos.add(6);
                Main.playerTurn=true;
            }
            if (!Main.checkWin().equals(""))
                setWinner(Main.checkWin());
        }
    }

    public void button7ActionPerformed() {
        if(button7.getText().equals("")){
            if(Main.playerTurn){
                button7.setText("X");
                Main.p1Pos.add(7);
                Main.playerTurn=false;
            } else {
                button7.setText("O");
                Main.p2Pos.add(7);
                Main.playerTurn=true;
            }
            if (!Main.checkWin().equals(""))
                setWinner(Main.checkWin());
        }
    }

    public void button8ActionPerformed() {
        if(button8.getText().equals("")){
            if(Main.playerTurn){
                button8.setText("X");
                Main.p1Pos.add(8);
                Main.playerTurn=false;
            } else {
                button8.setText("O");
                Main.p2Pos.add(8);
                Main.playerTurn=true;
            }
            if (!Main.checkWin().equals(""))
                setWinner(Main.checkWin());
        }
    }

    public void button9ActionPerformed() {
        if(button9.getText().equals("")){
            if(Main.playerTurn){
                button9.setText("X");
                Main.p1Pos.add(9);
                Main.playerTurn=false;
            } else {
                button9.setText("O");
                Main.p2Pos.add(9);
                Main.playerTurn=true;
            }
            if (!Main.checkWin().equals(""))
                setWinner(Main.checkWin());
        }
    }

    public void initComponents(){
        //Set up Basic Frame
        setTitle("Tic Tac Toe");        setFocusable(true);
        setSize(250,300);   setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Board Panels
        panelbuttons=new JPanel(new GridLayout(3,3));
        panelbuttons.setBorder(new Border() {
            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                //
            }

            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(5,5,5,5);
            }

            @Override
            public boolean isBorderOpaque() {
                return false;
            }
        });
        panelReset=new JPanel();


        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        reset = new JButton();

        //Win Label
        winLabel = new JLabel();
        winLabel.setText("WINNER: ");
        winLabel.setFont(new Font("TimesRoman",Font.BOLD,25));

        //---- reset ----
        reset.setText("RESET BOARD");
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.boardReset();
            }
        });

        //---- button1 ----
        button1.setText("");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed();
            }
        });

        //---- button2 ----
        button2.setText("");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2ActionPerformed();
            }
        });

        //---- button3 ----
        button3.setText("");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3ActionPerformed();
            }
        });

        //---- button4 ----
        button4.setText("");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4ActionPerformed();
            }
        });

        //---- button5 ----
        button5.setText("");
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5ActionPerformed();
            }
        });

        //---- button6 ----
        button6.setText("");
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button6ActionPerformed();
            }
        });

        //---- button7 ----
        button7.setText("");
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button7ActionPerformed();
            }
        });

        //---- button8 ----
        button8.setText("");
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button8ActionPerformed();
            }
        });

        //---- button9 ----
        button9.setText("");
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button9ActionPerformed();
            }
        });

        //Arranging Buttons on screen
        panelbuttons.add(button1);
        panelbuttons.add(button2);
        panelbuttons.add(button3);
        panelbuttons.add(button4);
        panelbuttons.add(button5);
        panelbuttons.add(button6);
        panelbuttons.add(button7);
        panelbuttons.add(button8);
        panelbuttons.add(button9);

        panelReset.add(reset);

        //Panel to Frame
        add(winLabel,BorderLayout.NORTH);
        winLabel.setVisible(false);

        add(panelbuttons,BorderLayout.CENTER);
        panelbuttons.setPreferredSize(new Dimension(200,200));

        panelReset.setPreferredSize(new Dimension(200,25));
        add(panelReset,BorderLayout.SOUTH);

    }

    public void setWinner(String win){
        panelbuttons.setVisible(false);
        winLabel.setVisible(true);
        switch (win) {
            case "Player 1" -> winLabel.setText("WINNER: Player X");
            case "Player 2" -> winLabel.setText("WINNER: Player O");
            case "Draw" -> winLabel.setText("--DRAW--");
        }
    }
    
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public JButton button5;
    public JButton button6;
    public JButton button7;
    public JButton button8;
    public JButton button9;
    public JButton reset;

    public JPanel panelbuttons;
    public JPanel panelReset;

    public JLabel winLabel;
}
