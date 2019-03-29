public class Main {

    public static void main(String[] args) {

        View v=new View();

        int i, nr = 3;
        Casa c[] = new Casa[nr];
        for (i = 0; i < nr; i++) {
            c[i] = new Casa("Casa " + Integer.toString(i));
            //c[i].start();
        }

        CasaManager casaManager = new CasaManager(c, 2, 8, 3, 8, nr, 12);
        casaManager.start();

    }
}
