import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tarea en Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setSize(300, 200);

        JButton button = new JButton("Obtem un mensaje");
        frame.add(button);

        JLabel label = new JLabel();
        frame.add(label);

        String[] messages = {"El cielo sera tu limite.", "Uno de tus sueños se hara realidad.", "No hagas lo que los demas hacen.", "No dejes de soñar.", "Confia en ti."};

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Seleccionar un mensaje al azar de la lista descrita
                String randomMessage = messages[new Random().nextInt(messages.length)];

                // Mostrar el mensaje en el JLabel
                label.setText(randomMessage);
            }
        });

        frame.setVisible(true);
    }
}


