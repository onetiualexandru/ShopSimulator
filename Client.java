
public class Client {

    private int clientId;
    private int timpSosire;
    private int timpServire;

    public Client(){}

    public Client(int clientId, int timpSosire, int timpServire){
        this.clientId=clientId;
        this.timpSosire=timpSosire;
        this.timpServire=timpServire;
    }

    public int getClientId(){
        return this.clientId;
    }
    public void setClientId(int clientId){
        this.clientId=clientId;
    }

    public int getTimpSosisre(){
        return this.timpSosire;
    }

    public int getTimpServire(){
        return this.timpServire;
    }

    public String toString(){
        return ("ClientID: "+Integer.toString(clientId)+" Timp Sosire="+
                timpSosire+ " Timp Servire="+timpServire);
    }

}
