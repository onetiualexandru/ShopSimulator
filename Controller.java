import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {

    private View theView;

    public Controller(View theView) {
        this.theView = theView;
        this.theView.startSimulationListener(new StartSimulation());

    }

    class StartSimulation implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int i;
            int nr = theView.getNrCaseField();
            Casa c[] = new Casa[nr];
            for (i = 0; i < nr; i++) {
                c[i] = new Casa("Casa " + i);
            }

            theView.desenareEvolutie(nr);

           // CasaManager casaManager = new CasaManager(c, theView.getTimpMinSosireField(), theView.getTimpMaxSosireField(), theView.getTimpMinServireField(), theView.getTimpMaxSosireField(), nr, theView.getTimpSimulareField());
            CasaManager casaManager = new CasaManager(c,2,4,2,6,nr,12,theView);
            casaManager.start();

        }
    }
}
