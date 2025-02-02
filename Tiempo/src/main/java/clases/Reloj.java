package clases;

import java.util.Calendar;

public class Reloj extends Thread{

    @Override
    public void run() {
        while(true) {
            Calendar c =Calendar.getInstance();
            int hora = c.get(Calendar.HOUR);
            int minutos = c.get(Calendar.MINUTE);
            int segundos = c.get(Calendar.SECOND);
            String tiempo = "   " + hora + ":" + minutos + ":" + segundos;
            System.out.println(tiempo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
