package view;

import factory.CarFactory;
import model.Car;
import enums.CarType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarSelectionGUI extends JFrame {
    private JComboBox<String> carTypeComboBox;
    private JTextField colorTextField;
    private JComboBox<String> modelComboBox;
    private JLabel resultLabel;

    public CarSelectionGUI() {
        setTitle("HawnkMotoCar - Selecione seu Carro");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        mainPanel.add(new JLabel("Categoria do Carro:"));
        carTypeComboBox = new JComboBox<>(new String[]{"SEDAN", "SUV", "HATCHBACK"});
        mainPanel.add(carTypeComboBox);

        mainPanel.add(new JLabel("Cor do Carro:"));
        colorTextField = new JTextField();
        mainPanel.add(colorTextField);

        mainPanel.add(new JLabel("Modelo do Carro:"));
        modelComboBox = new JComboBox<>(new String[]{"Model S", "Model X", "Model H"});
        mainPanel.add(modelComboBox);

        JButton createButton = new JButton("Confirmar Pedido");
        createButton.setBackground(new Color(0, 150, 136));
        createButton.setForeground(Color.WHITE);
        createButton.setFocusPainted(false);
        mainPanel.add(createButton);

        resultLabel = new JLabel("", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainPanel.add(resultLabel);


        add(mainPanel, BorderLayout.CENTER);

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createCar();
            }
        });
    }

    private void createCar() {

        String selectedCarType = (String) carTypeComboBox.getSelectedItem();
        String selectedColor = colorTextField.getText().trim();
        String selectedModel = (String) modelComboBox.getSelectedItem();

        if (selectedColor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, insira a cor do carro.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        CarType carType = CarType.valueOf(selectedCarType);

        Car car = CarFactory.createCar(carType, selectedModel, selectedColor, 2023);

        String message = "<html><center>Muito obrigado por escolher a HawnkMotoCar!<br>" +
                "Seu pedido:<br>" +
                "Categoria: " + selectedCarType + "<br>" +
                "Modelo: " + selectedModel + "<br>" +
                "Cor: " + selectedColor + "<br>" +
                "Em até 48 horas retornaremos com mais informações sobre seu pedido.</center></html>";
        resultLabel.setText(message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CarSelectionGUI gui = new CarSelectionGUI();
                gui.setVisible(true);
                gui.setLocationRelativeTo(null);
            }
        });
    }
}