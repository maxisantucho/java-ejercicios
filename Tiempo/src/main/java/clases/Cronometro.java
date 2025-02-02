package clases;

public class Cronometro extends Thread{

    @Override
    public void run() {
        int minutos = 0;
        int segundos = 0;
        String cero1 = "";
        String cero2 = "";
        for (minutos = 0; minutos < 60; minutos++) {
            if(minutos < 10) {
                cero1 = "0";
            } else {
                cero1 = "";
            }
            for (segundos = 0; segundos < 60; segundos++) {
                if(segundos < 10) {
                    cero2 = "0";
                } else {
                    cero2 = "";
                }
                System.out.println(cero1 + minutos + ":" + cero2 + segundos);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace(System.out);
                }
            }
        }
    }
}
