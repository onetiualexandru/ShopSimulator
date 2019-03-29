import java.util.*;

public class CasaManager extends Thread {

    private int minTimpSosire=0, maxTimpSosire=0, minTimpServire=0, maxTimpServire=0;
    private int nrCase, timpSimulare,realTime = 0;
    private ArrayList<Client> clienti = new ArrayList<>();
    private Casa listaCase[];
    private Random rand = new Random();
    private int timpMediuAsteptare=0,timpMediuServire=0;
    public View view;

    public CasaManager(Casa[] listaCase1, int minTimpSosire, int maxTimpSosire, int minTimpServire, int maxTimpServire, int nrCase, int timpSimulare,View view) {

        this.minTimpSosire = minTimpSosire;
        this.maxTimpSosire = maxTimpSosire;
        this.minTimpServire = minTimpServire;
        this.maxTimpServire = maxTimpServire;
        this.nrCase = nrCase;
        this.timpSimulare = timpSimulare;
        this.listaCase = listaCase1;
        this.view=view;

        int i;
        for (i = 0; i < nrCase; i++) {
            listaCase[i] = new Casa(Integer.toString(i + 1));
        }

        for (i = 1; i <= timpSimulare / 2; i++) {
            clienti.add(new Client(i, rand.nextInt(maxTimpSosire - minTimpSosire) + 1,
                    rand.nextInt(maxTimpServire - minTimpServire) + 1));
            //  System.out.println(clienti.get(i));
        }
    }


    public int obtineCoadaMin() {

        int index = 0;
        try {
            long min = listaCase[0].lungimeCoada();
            for (int i = 0; i < nrCase; i++) {
                long l = listaCase[i].lungimeCoada();
                if (l < min) {
                    min = l;
                    index = i;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }

        return index;
    }

    public void run() {

        for (Casa c : listaCase) {
            c.start();
        }

        try {
            System.out.println(listaCase.length);
            for (realTime = 1; realTime <= timpSimulare; realTime++) {
                for (Client client : clienti) {
                    int m = obtineCoadaMin();
                    if (realTime == client.getTimpSosisre())
                        listaCase[m].addClient(client);
                        timpMediuServire+=client.getTimpServire();
                }
                System.out.println("RealTIME:" + realTime);
                view.setTimpMaxServireField(realTime);

                sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
        System.out.println("TimpMediuAstepate = "+timpMediuServire/clienti.size());
    }

}


