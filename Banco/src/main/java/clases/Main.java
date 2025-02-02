package clases;

public class Main {

    public static void main(String[] args) {

        CajeroAutomatico cajero = new CajeroAutomatico();

        Thread pepito = new Thread(cajero, "Jordan");
        Thread juanito = new Thread(cajero, "Kelly");

        pepito.start();
        juanito.start();

    }
}