import java.awt.event.ActionListener;
import javax.swing.*;


public class
View extends JFrame {

    private int timer = 0;
    private JPanel panel = new JPanel();

    private JLabel timpMinSosireLabel = new JLabel("Timp Sosire Minim");
    private JLabel timpMaxSosireLabel = new JLabel("Timp Sosire Maxim");
    private JLabel timpMinServireLabel = new JLabel("Timp Servire Minim");
    private JLabel timpMaxServireLabel = new JLabel("Timp Servire Maxim");
    private JLabel numarCaseLabel = new JLabel("Numar Case");
    private JLabel timpSimulareLabel = new JLabel("Timp Simulare");
    private JLabel realTimeLabel = new JLabel("Timer : ");
    private JLabel timerLabel = new JLabel();


    private JTextField timpMinSosireField = new JTextField();
    private JTextField timpMaxSosireField = new JTextField();
    private JTextField timpMinServireField = new JTextField();
    private JTextField timpMaxServireField = new JTextField();
    private JTextField numarCaseField = new JTextField();
    private JTextField timpSimulareField = new JTextField();


    private JButton startSimulationButton = new JButton("Start Simulation");


    public View() {

        //text Label
        timpMinSosireLabel.setBounds(45, 105, 115, 20);
        timpMaxSosireLabel.setBounds(45, 136, 115, 20);
        timpMinServireLabel.setBounds(45, 20, 115, 20);
        timpMaxServireLabel.setBounds(45, 51, 130, 20);
        numarCaseLabel.setBounds(45, 202, 130, 20);
        timpSimulareLabel.setBounds(45, 233, 130, 20);
        realTimeLabel.setBounds(90, 300, 130, 20);

        timpMinSosireField.setBounds(170, 107, 135, 20);
        timpMaxSosireField.setBounds(170, 138, 135, 20);
        timpMinServireField.setBounds(170, 22, 135, 20);
        timpMaxServireField.setBounds(170, 53, 135, 20);
        numarCaseField.setBounds(170, 204, 135, 20);
        timpSimulareField.setBounds(170, 233, 135, 20);

        timerLabel.setBounds(200, 300, 135, 20);

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
        panel.add(timpSimulareField);

        panel.add(timerLabel);
        panel.add(realTimeLabel);

        panel.add(startSimulationButton);


        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 600);
        panel.setLayout(null);
        this.setTitle("Calculator Polinomial");
        setVisible(true);
    }

    public void desenareEvolutie(int nr) {
        System.out.println("sunt si pe aci");
        JLabel listaCase[] = new JLabel[nr];
        int j = 350;
        for (int i = 0; i < nr; i++) {
            listaCase[i] = new JLabel("Casa" + (i + 1));
            listaCase[i].setBounds(j, 40, 130, 20);
            j += 50;
            this.panel.add(listaCase[i]);
            this.panel.repaint();
            this.panel.validate();
        }
    }


    public int getTimpMinSosireField() {

        return Integer.parseInt(timpMinSosireField.getText());
    }

    public int getTimpMaxSosireField() {

        return Integer.parseInt(timpMaxSosireField.getText());
    }

    public int getTimpMinServireField() {

        return Integer.parseInt(timpMinServireField.getText());
    }

    public int getTimpMaxServireField() {

        return Integer.parseInt(timpMaxServireField.getText());
    }

    public int getNrCaseField() {

        return Integer.parseInt(numarCaseField.getText());
    }

    public int getTimpSimulareField() {

        return Integer.parseInt(timpSimulareField.getText());
    }


    public void setTimpMaxServireField(int timer) {
        System.out.println("sunt aii");
        //this.panel.repaint();
        // this.panel.validate();
        timerLabel.setText("" + timer);

    }

    void startSimulationListener(ActionListener listenForCalcButton) {
        startSimulationButton.addActionListener(listenForCalcButton);
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}

