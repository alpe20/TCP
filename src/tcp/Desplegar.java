package tcp;
import javax.swing.*;
import java.awt.event.*;

/**
 * @author Martínez Ortíz Fabiola Yahel
 * @author Pichardo Esquivel Angélica Lizbeth
 */
public class Desplegar extends JFrame implements ActionListener, KeyListener{
public JLabel termu, termd, varu, vard, numUno, numDos ;           
    public JTextField cajan1,cajan2, cajavar1,cajavar2;       
    public JButton aceptar;
    
    public Desplegar(){
    //Se inicializan los componentes de javaSwing
        setTitle("Trinomio Cuadrado Perfecto");                 
        setBounds(30,30,400,300);                                 
        setLocationRelativeTo(null);                       
        setLayout(null);                                   
        setResizable(false);                               
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        //Creación de la parte gráfica de JavaSwing
        termu= new JLabel("1° Termino");
        termu.setBounds(30,25,100,30);
        add(termu);
        
        termd= new JLabel("2° Termino");
        termd.setBounds(30,25,100,100);
        add(termd);
        
        numUno= new JLabel("Numero:");
        numUno.setBounds(50,25,50,70);
        add(numUno);
        
        numDos= new JLabel("Numero:");
        numDos.setBounds(50,25,70,140);
        add(numDos);
        
        varu= new JLabel("Variable");
        varu.setBounds(200,25,100,50);
        add(varu);
        
        vard= new JLabel("Variable");
        vard.setBounds(200,80,100,20);
        add(vard);
        
        cajan1 = new JTextField();
        cajan1.setBounds(110,50,60,20);
        cajan1.addKeyListener(this);
        add(cajan1);
        
        cajan2 = new JTextField();
        cajan2.setBounds(110,80,60,20);
        cajan2.addKeyListener(this);
        add(cajan2);
        
        cajavar1 = new JTextField();
        cajavar1.setBounds(250,40,50,20);
        cajavar1.addKeyListener(this);
        add(cajavar1);
        
        cajavar2 = new JTextField();
        cajavar2.setBounds(250,80,50,20);
        cajavar2.addKeyListener(this);
        add(cajavar2);
        
        aceptar = new JButton("Aceptar");
        aceptar.setBounds(100,115,90,20);
        aceptar.addActionListener(this);
        add(aceptar);
        
        //Se hace visible el programa
        setVisible(true);
    }
    //Se sobreescribe y se llama a la clase de java
    @Override
    public void actionPerformed(ActionEvent e) {
        int num1=1;
        int num2=2;
        if(cajan1.getText()!="")
            num1 = Integer.parseInt(cajan1.getText());
        if (cajan2.getText()!="")
            num2 = Integer.parseInt(cajan2.getText());
        String var1= cajavar1.getText();
        String var2= cajavar2.getText();
        String resulta;
            if(e.getActionCommand().equals("Aceptar")){
                Opera ope= new Opera();
               ope.setNum1(num1);
               ope.setNum2(num2);
               ope.setVar1(var1);
               ope.setVar2(var2);
                resulta = ope.TCP();
                JOptionPane.showMessageDialog(null, "El resultado es " + resulta);
                resulta = "";
                cajan1.setText("");
                cajan2.setText("");
                cajavar1.setText("");
                cajavar2.setText("");
            }
        }

    @Override
    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        if(cajan1 == e.getSource()){
            if(((((letra >= 'a') && (letra <= 'z')))) && (letra != ' ') && (!((letra >= 'A') && (letra <= 'Z'))) && (letra != 'ñ')){
                e.consume();
            }
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    //En el momento que se escribe una letra, se invalida
   