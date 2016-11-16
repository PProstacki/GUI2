package gui2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener{

    JTextField tfNr1, tfNr2, tfOutcome;
    JButton bCalculate;
    JRadioButton rbAdd, rbSub, rbMul, rbDiv;
    ButtonGroup radioButtons;
    
    Window(){
        setTitle("Kalkulator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(200,230);
        setLocation(500, 500);
        setResizable(false);
        
        tfNr1 = new JTextField();
        tfNr1.setSize(75, 25);
        tfNr1.setLocation(15,15);
        add(tfNr1);
        
        tfNr2 = new JTextField();
        tfNr2.setSize(75, 25);
        tfNr2.setLocation(110,15);
        add(tfNr2);
        
        radioButtons = new ButtonGroup();
        
        rbAdd = new JRadioButton("Dodawanie", true);
        rbAdd.setSize(125,20);
        rbAdd.setLocation(15, 60);
        radioButtons.add(rbAdd);
        add(rbAdd);

        rbSub = new JRadioButton("Odejmowanie");
        rbSub.setSize(125, 20);
        rbSub.setLocation(15, 85);
        radioButtons.add(rbSub);
        add(rbSub);

        rbMul = new JRadioButton("Mnozenie");
        rbMul.setSize(125, 20);
        rbMul.setLocation(15, 110);
        radioButtons.add(rbMul);
        add(rbMul);
        
        rbDiv = new JRadioButton("Dzielenie");
        rbDiv.setSize(125, 20);
        rbDiv.setLocation(15, 135);
        radioButtons.add(rbDiv);
        add(rbDiv);
        
        bCalculate = new JButton("Oblicz");
        bCalculate.setSize(70, 25);
        bCalculate.setLocation(15, 160);
        bCalculate.addActionListener(this);
        add(bCalculate);
        
        tfOutcome = new JTextField();
        tfOutcome.setSize(95, 26);
        tfOutcome.setLocation(90, 160);
        add(tfOutcome);
       
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        double outcome = 0;
        try{
        if(rbAdd.isSelected()){
            outcome = Double.parseDouble(tfNr1.getText()) + Double.parseDouble(tfNr2.getText());
        }else if(rbSub.isSelected()){
            outcome = Double.parseDouble(tfNr1.getText()) - Double.parseDouble(tfNr2.getText());
        }else if(rbMul.isSelected()){
            outcome = Double.parseDouble(tfNr1.getText()) * Double.parseDouble(tfNr2.getText());
        }else if(rbDiv.isSelected()){
            outcome = Double.parseDouble(tfNr1.getText()) / Double.parseDouble(tfNr2.getText());
        }
         tfOutcome.setText(Double.toString(outcome));
        }catch(NumberFormatException ex){
            tfOutcome.setText("Bląd wejścia");
        }
    }
    
}
