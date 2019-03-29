import java.util.LinkedList;
import java.util.Vector;

public class Casa extends Thread {
///incearca cu vector

    private Vector<Client> cumparatori = new Vector<>();

    // actualizaeza numele argumentului din threadul curent
    public Casa(String name) {
        setName(name);
    }


    public void run() {

        while (true) {
            //System.out.println("is pe aici");
            //  System.out.println(cumparatori.getFirst());
            if (cumparatori.size() != 0) {
                try {
                    // System.out.println("is pe aici");
                    sleep(cumparatori.elementAt(0).getTimpServire() * 1000);
                    removeClient();
                    // System.out.println(cumparatori.getFirst());
                   /* System.out.println("Clientul cu id=" + cumparatori.elementAt(0).getClientId() +
                            " a fost deservit de Casa " + getName());*/
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

       /* try {

            while (true) {
                if (!cumparatori.isEmpty()) {
                    removeClient();
                    System.out.println(cumparatori.isEmpty());
                    sleep(cumparatori.getFirst().getTimpServire());
                }
            }


        } catch (InterruptedException e) {
            System.out.println("Intrerupere" + e.toString());
        }*/


    }

    public synchronized void addClient(Client client) {

        System.out.println("Clientul cu id=" +
                client.getClientId() + " timpSosire=" + client.getTimpSosisre() + " timpServire="
                + client.getTimpServire() + " a fost adaugat la Casa " + getName());
        cumparatori.add(client);
        notifyAll();

    }

    public synchronized void removeClient() throws InterruptedException {
        while (cumparatori.size() == 0)
            wait();
        Client client = cumparatori.elementAt(0);
        System.out.println("Clientul cu id=" + cumparatori.elementAt(0).getClientId() +
                " a fost deservit de Casa " + getName());
        cumparatori.removeElementAt(0);
        notifyAll();
    }

    public synchronized int lungimeCoada() throws InterruptedException {
        notifyAll();
        return cumparatori.size();
    }

}
