package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Java 1. ClassWork8 + homework8
 *
 * @author MadMopuse
 * @version 10.05.2022 (ClassWork8 + homework8)
 *
 */

public class App extends JFrame {

    int counter = 0;

    private static int countOfNumbers = 0;


    public App() {
        setTitle("Window Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 500, 250);
        setResizable(false); //нельзя менять размер окна
        //setLayout(new GridLayout(10, 10));

        //JButton button1 = new JButton(" 0");
        //add(button1, BorderLayout.CENTER);

        Font font = new Font("Arrial", Font.BOLD, 25);

        /*JButton leftButton = new JButton("Сгенерировать");
        leftButton.setFont(font);
        add(leftButton, BorderLayout.SOUTH);
         */

        /*JButton rightButton = new JButton(">");
        rightButton.setFont(font);
        add(rightButton, BorderLayout.EAST);
         */


        JTextField counterText = new JTextField("Генератор");
        counterText.setFont(font);
        counterText.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterText, BorderLayout.CENTER);

        //Добавлен подсчет генераций homework8
        JLabel label = new JLabel("Подсчет генераций. Нажать Enter");
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.LEFT);

        add(label, BorderLayout.SOUTH);

        /*JLabel counterText = new JLabel("0");
        counterText.setFont(font);
        counterText.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterText, BorderLayout.CENTER);
        */

        counterText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               counter++;
               counterText.setText(generateData());
               label.setText(String.valueOf(counter)); //Добавлен подсчет генераций homework8
            }
        });

        /*rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                counterText.setText(String.valueOf(counter));
            }
        });
         */

        /*button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                System.out.println(counter);
                button1.setText(String.valueOf(counter));

            }
        });


        for (int i = 0; i < 100; i++) {
            //setLayout(new FlowLayout());
            JButton button1 = new JButton(String.valueOf(i));
            add(button1, BorderLayout.NORTH);
        }

        JButton button2 = new JButton();
        button2.setText("DOWN Button");
        add(button2, BorderLayout.SOUTH);
        */

        setVisible(true);
    }


    public static void main(String[] args) {
        App app = new App();

    }

    //
    //Пользователь <-> графическая оболочка <-> программа
    //Действия - навести курсор, нажать кнопку, ввести текст

    public String generateData() {
        Random random = new Random();
        return  "89" + random.nextInt(10) + random.nextInt(10)
                + random.nextInt(10) + random.nextInt(10)
                + random.nextInt(10) + random.nextInt(10)
                + random.nextInt(10) + random.nextInt(10)
                + random.nextInt(10);
    }
}
