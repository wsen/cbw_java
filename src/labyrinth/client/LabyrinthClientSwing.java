package labyrinth.client;

import labyrinth.protocol.LabyrinthService;
import labyrinth.protocol.PlayerService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class LabyrinthClientSwing extends JFrame implements ActionListener, KeyListener {

    private final JButton button;

    private PlayerService player;

    public LabyrinthClientSwing() {
        setLayout(new FlowLayout());
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        button = new JButton("Klick mich!");
        button.addActionListener(this);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            LabyrinthService labyrinth = (LabyrinthService) Naming.lookup(LabyrinthService.NAME);
            player = labyrinth.login();
            button.removeKeyListener(this);
            button.addKeyListener(this);

            String result;

            result = player.moveForward();
            System.out.println("'"+result+"'");

            result = player.turnRight();
            System.out.println("'"+result+"'");

//        result = player.moveForward();
//        System.out.println("'"+result+"'");

            result = player.turnRight();
            System.out.println("'"+result+"'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void keyTyped(KeyEvent event) {
        // empty
    }

    @Override
    public void keyPressed(KeyEvent event) {
        try {
            switch (event.getKeyCode()) {
                case KeyEvent.VK_S:
                    //player.shoot();
                    break;
                case KeyEvent.VK_UP:
                    player.moveForward();
                    break;
                case KeyEvent.VK_LEFT:
                    player.turnLeft();
                    break;
                case KeyEvent.VK_RIGHT:
                    player.turnRight();
                    break;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void keyReleased(KeyEvent event) {
        // empty
    }

    public static void main(String[] args) throws Exception {
        new LabyrinthClientSwing().setVisible(true);
    }

}
