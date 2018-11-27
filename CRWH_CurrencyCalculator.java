/*
*By: Caesar W. & Obina O.
*Class: JAVA 1
*Instructor: Dr.Primo
*Assignment: Group-Project
*Date: 11/20/2018
*Due: 11/29/2018 @9:30AM
*/
//START
package crwh_currencycalculator;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class CRWH_CurrencyCalculator 
extends Frame implements ItemListener, ActionListener
{ 
    //This will initialize all the GUI components within the program.
    JComboBox crwhConvertFrom, crwhConvertTo;
    JTextField crwhTXTFieldFrom, crwhTXTFieldTo;
    JButton crwhComputingAnswer, crwhExitingTheSystem;
    JLabel crwhFROM, crwhTO;
    JLabel crwhFromLabel, crwhToLabel;
    JPanel crwhCenterStage = new JPanel();

    double crwhInputValues = 0;
    double crwhTheResult = 0;

    public CRWH_CurrencyCalculator() { 
        //Lets add up all the GUI components
        super("CENTURION - Currency Calculator [VR.0.01]"); 
        setSize(420,300);
        setLayout(null);
        setBackground(Color.lightGray);

        crwhFromLabel = new JLabel("From:");
        crwhFromLabel.setBounds(30,45,250,30);
        crwhFromLabel.setForeground(Color.BLUE);
        add(crwhFromLabel);

        crwhConvertFrom = new JComboBox();
        crwhConvertFrom.setBounds(30,70,150,30);
        crwhConvertFrom.addItem("U.S. Dollar");        //American USD Currency
        crwhConvertFrom.addItem("Canadian Dollar");    //Canadian Currency
        crwhConvertFrom.addItem("Australian Dollar");  //Australian Currency  
        crwhConvertFrom.addItem("Chinese Yuan");       //Chinese Yuan currency
        crwhConvertFrom.addItem("Japan Yen");          //Japanese Yen currency
        crwhConvertFrom.addItem("Pound Sterling");     //Great Britian currency
        crwhConvertFrom.addItem("Euro");               //European currency
        add(crwhConvertFrom);

        crwhToLabel = new JLabel("To:");
        crwhToLabel.setBounds(230,45,250,30);
        crwhToLabel.setForeground(Color.BLUE);
        add(crwhToLabel);

        crwhConvertTo = new JComboBox();
        crwhConvertTo.setBounds(230,70,150,30);
        crwhConvertTo.addItem("U.S. Dollar");        
        crwhConvertTo.addItem("Canadian Dollar");
        crwhConvertTo.addItem("Australian Dollar");
        crwhConvertTo.addItem("Chinese Yuan");     
        crwhConvertTo.addItem("Japan Yen");        
        crwhConvertTo.addItem("Pound Sterling");   
        crwhConvertTo.addItem("Euro");             
        add(crwhConvertTo);

        crwhFROM = new JLabel("Enter Amount to Convert:");
        crwhFROM.setBounds(50,110,300,30);
        add(crwhFROM);

        crwhTXTFieldFrom = new JTextField(15);
        crwhTXTFieldFrom.setBounds(50,140,300,30);
        add(crwhTXTFieldFrom);

        crwhComputingAnswer = new JButton("Compute");
        crwhComputingAnswer.setBounds(100,250,100,30);
        add(crwhComputingAnswer);

        crwhTO = new JLabel("Here's the converted amount:");
        crwhTO.setBounds(50,170,300,30);
        add(crwhTO);   

        crwhTXTFieldTo = new JTextField(15);
        crwhTXTFieldTo.setBounds(50,200,300,30);
        crwhTXTFieldTo.setEditable(false);
        crwhTXTFieldTo.setForeground(Color.BLUE);
        add(crwhTXTFieldTo);

        crwhExitingTheSystem = new JButton("Exit");
        crwhExitingTheSystem.setBounds(210,250,100,30);
        add(crwhExitingTheSystem);
        
        //register all the GUI components who will listen or invoke the methods
        crwhConvertFrom.addItemListener(this);
        crwhConvertTo.addItemListener(this);
        crwhComputingAnswer.addActionListener(this);
        crwhTXTFieldFrom.addActionListener(this);
        crwhExitingTheSystem.addActionListener(this);
        
        //this will close the applet window if the user clicked the close or exit button
        addWindowListener(new WindowAdapter() { 
                public void windowClosing(WindowEvent e) { 
                    exit(); 
                } 
            });
    }
    //the exit method
    public void exit(){ 
        setVisible(false); 
        dispose(); 
        System.exit(0); 
    } 
    //show or make the applet window frame visible 
    public static void main(String args[]) { 
        CRWH_CurrencyCalculator w = new CRWH_CurrencyCalculator(); 
        w.setVisible(true); 
    } 

    public void ConvertUSDollar() { 
    //Convert USD to any country
        if(crwhConvertTo.getSelectedItem()=="US Dollar")
        {
            crwhTheResult = (crwhInputValues);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            crwhTheResult = (crwhInputValues * 1.33);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Australian Dollar")
        {
            crwhTheResult = (crwhInputValues * 1.39);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            crwhTheResult = (crwhInputValues * 6.94);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Japanese Yen")
        {
            crwhTheResult = (crwhInputValues * 112.54);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Pound Sterling")
        {
            crwhTheResult = (crwhInputValues * 0.78);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else 
        {
            crwhTheResult = (crwhInputValues * 0.87);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
    }

    public void ConvertCanadianDollar() { 
    //Convert the Canadian Dollar to any country
        if(crwhConvertTo.getSelectedItem()=="US Dollar")
        {
            crwhTheResult = (crwhInputValues * 0.75);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            crwhTheResult = (crwhInputValues);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Australian Dollar")
        {
            crwhTheResult = (crwhInputValues * 1.04);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            crwhTheResult = (crwhInputValues * 5.22);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Japanese Yen")
        {
            crwhTheResult = (crwhInputValues * 84.67);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Pound Sterling")
        {
            crwhTheResult = (crwhInputValues * 0.59);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else 
        {
            crwhTheResult = (crwhInputValues * 0.66);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
    }
    public void ConvertAustralianDollar() { 
    //Convert the Canadian Dollar to any country
        if(crwhConvertTo.getSelectedItem()=="US Dollar")
        {
            crwhTheResult = (crwhInputValues * 0.72);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            crwhTheResult = (crwhInputValues * 0.96);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Australian Dollar")
        {
            crwhTheResult = (crwhInputValues);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            crwhTheResult = (crwhInputValues * 5.01);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Japanese Yen")
        {
            crwhTheResult = (crwhInputValues * 81.39);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Pound Sterling")
        {
            crwhTheResult = (crwhInputValues * 0.56);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else 
        {
            crwhTheResult = (crwhInputValues * 0.63);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
    }
    
    public void ConvertChineseYuan() { //Convert Chinese Yuan
        if(crwhConvertTo.getSelectedItem()=="US Dollar")
        {
            crwhTheResult = (crwhInputValues * 0.14);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            crwhTheResult = (crwhInputValues * 0.19);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Australian Dollar")
        {
            crwhTheResult = (crwhInputValues * 0.20);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            crwhTheResult = (crwhInputValues);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Japanese Yen")
        {
            crwhTheResult = (crwhInputValues * 16.21);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Pound Sterling")
        {
            crwhTheResult = (crwhInputValues * 0.11);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else
        {
            crwhTheResult = (crwhInputValues * 0.13);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
    }

    public void ConvertJapaneseYen() { //Convert Japanese Yen
        if(crwhConvertTo.getSelectedItem()=="US Dollar")
        {
            crwhTheResult = (crwhInputValues * 0.0089);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            crwhTheResult = (crwhInputValues * 0.012);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Australian Dollar")
        {
            crwhTheResult = (crwhInputValues * 0.012);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            crwhTheResult = (crwhInputValues * 0.062);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Japanese Yen")
        {
            crwhTheResult = (crwhInputValues);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Pound Sterling")
        {
            crwhTheResult = (crwhInputValues * 0.0069);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else
        {
            crwhTheResult = (crwhInputValues * 0.0078);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
    }

    public void ConvertPoundSterling() { //Convert Great Britain Pound-Sterling
        if(crwhConvertTo.getSelectedItem()=="US Dollar")
        {
            crwhTheResult = (crwhInputValues * 1.29);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            crwhTheResult = (crwhInputValues * 1.70);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Australian Dollar")
        {
            crwhTheResult = (crwhInputValues * 1.77);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            crwhTheResult = (crwhInputValues * 8.88);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Japanese Yen")
        {
            crwhTheResult = (crwhInputValues * 144.17);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Pound Sterling")
        {
            crwhTheResult = (crwhInputValues);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else
        {
            crwhTheResult = (crwhInputValues * 1.12);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
    }

    public void ConvertEuro() { //Convert Euros
        if(crwhConvertTo.getSelectedItem()=="US Dollar")
        {
            crwhTheResult = (crwhInputValues * 1.15);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            crwhTheResult = (crwhInputValues * 1.51);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Australian Dollar")
        {
            crwhTheResult = (crwhInputValues * 1.58);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            crwhTheResult = (crwhInputValues * 7.95);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Japanese Yen")
        {
            crwhTheResult = (crwhInputValues * 128.91);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else if(crwhConvertTo.getSelectedItem()=="Pound Sterling")
        {
            crwhTheResult = (crwhInputValues * 0.89);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
        else
        {
            crwhTheResult = (crwhInputValues);
            crwhTXTFieldTo.setText(""+crwhTheResult);
        }
    }

    public void actionPerformed(ActionEvent e) {

        crwhInputValues = Double.parseDouble(crwhTXTFieldFrom.getText());
        String msg = crwhTXTFieldFrom.getText();

        if(e.getSource()==crwhComputingAnswer)
        {
            if(crwhConvertFrom.getSelectedItem()=="US Dollar")
            {
                ConvertUSDollar();                 
            }
            else if(crwhConvertFrom.getSelectedItem()=="Canadian Dollar")
            {
                ConvertCanadianDollar();
            }
            else if(crwhConvertFrom.getSelectedItem()=="Australian Dollar")
            {
                ConvertAustralianDollar();
            }
            else if(crwhConvertFrom.getSelectedItem()=="Chinese Yuan")
            {
                ConvertChineseYuan();
            }
            else if(crwhConvertFrom.getSelectedItem()=="Japanese Yen")
            {
                ConvertJapaneseYen();
            }
            else if(crwhConvertFrom.getSelectedItem()=="Pound Sterling")
            {
                ConvertPoundSterling();
            }
            else
            {
                ConvertEuro();
            }

        }
        
        // What this does, is that it will ask the nameless user,
        // if they'd like to exit the GUI or not.
        else
        {
            //This will then display a confirmation box.
            int choice = JOptionPane.showConfirmDialog(null,"Are you positive?",
                    "Exit",JOptionPane.YES_NO_OPTION);
            if(choice==0) {
                dispose();
                System.exit(0);
            }
        }
    }

    public void itemStateChanged(ItemEvent e)
    {
    }
} 
//END