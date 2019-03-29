import java.awt.event.ActionListener;
import javax.swing.*;


public class
View extends JFrame {

    private JPanel panel = new JPanel();
    
    private JLabel timpMinSosireLabel = new JLabel("Timp Sosire Minim");
    private JLabel timpMaxSosireLabel = new JLabel("Timp Sosire Minim");
    private JLabel timpMinServireLabel = new JLabel("Timp Servire Minim");
    private JLabel timpMaxServireLabel = new JLabel("Timp Servire Minim");
    private JLabel numarCaseLabel = new JLabel("Numar Case");
    private JLabel timpSimulareLabel = new JLabel("Timp Simulare");


    private JTextField timpMinSosireField = new JTextField();
    private JTextField timpMaxSosireField = new JTextField();
    private JTextField timpMinServireField = new JTextField();
    private JTextField timpMaxServireField = new JTextField();
    private JTextField numarCaseField = new JTextField();


    private JButton startSimulationButton = new JButton("Start Simulation");
    
    


    View() {

        //text Label
        timpMinSosireLabel.setBounds(45, 105, 115, 20);
        timpMaxSosireLabel.setBounds(45, 136, 115, 20);
        timpMinServireLabel.setBounds(45, 20, 115, 20);
        timpMaxServireLabel.setBounds(45, 51, 130, 20);
        numarCaseLabel.setBounds(45, 202, 130, 20);
        timpSimulareLabel.setBounds(45, 233, 130, 20);

        timpMinSosireField.setBounds(170, 107, 135, 20);
        timpMaxSosireField.setBounds(170, 138, 135, 20);
        timpMinServireField.setBounds(170, 22, 135, 20);
        timpMaxServireField.setBounds(170, 53, 135, 20);
        numarCaseField.setBounds(170, 204, 135, 20);

        //jButton
        startSimulationButton.setBounds(100, 270, 135, 20);

        //combo box

        //panel
        panel.add(timpMinSosireLabel);
        panel.add(timpMaxSosireLabel);

        panel.add(timpMinServireLabel);
        panel.add(timpMaxServireLabel);

        panel.add(timpMinSosireField);
        panel.add(timpMaxSosireField);

        panel.add(timpMinServireField);
        panel.add(timpMaxServireField);

        panel.add(numarCaseLabel);
        panel.add(numarCaseField);

        panel.add(timpSimulareLabel);

        panel.add(startSimulationButton);


        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 600);
        panel.setLayout(null);
        this.setTitle("Calculator Polinomial");
        setVisible(true);
    }


    public int getTimpMinSosireLabel() {

        return Integer.parseInt(timpMinSosireLabel.getText());
    }

    public int getTimpMaxSosireLabel() {

        return Integer.parseInt(timpMaxSosireLabel.getText());
    }

    public int getTimpMinServireLabel() {

        return Integer.parseInt(timpMinServireLabel.getText());
    }

    public int getTimpMaxServireLabel() {

        return Integer.parseInt(timpMaxServireLabel.getText());
    }

    public int getNrCaseLabel() {

        return Integer.parseInt(numarCaseLabel.getText());
    }



   /* public void settimpMaxServireField(Polinom polinom) {
        timpMaxServireField.setText(polinom.toString());

    }*/

    void solutieCalculateListener(ActionListener listenForCalcButton) {
        startSimulationButton.addActionListener(listenForCalcButton);
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}

