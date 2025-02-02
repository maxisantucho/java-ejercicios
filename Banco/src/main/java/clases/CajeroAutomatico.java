package clases;

public class CajeroAutomatico implements Runnable{

    private CuentaBancaria miCuentaBancaria = new CuentaBancaria();

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            try{
                retirarDineroCuenta(10);
                if(miCuentaBancaria.getSalarioActual() < 0) {
                    System.out.println("Su cuenta posee salario negativo !");
                }
                System.out.println();
                Thread.sleep(800);
            } catch(InterruptedException e) {
                e.printStackTrace(System.out);
            }
        }
    }

    private synchronized void retirarDineroCuenta(int valorRetiro) {
        if(miCuentaBancaria.getSalarioActual() >= valorRetiro) {
            System.out.println("Salario actual = " + miCuentaBancaria.getSalarioActual());
            System.out.println("El usuario: " + Thread.currentThread().getName() + " esta realizando un retiro de " + valorRetiro + " pesos");
            miCuentaBancaria.retirarDeCuenta(valorRetiro);
            System.out.println("El retiro se realizo con exito, el nuevo salario es de: " + miCuentaBancaria.getSalarioActual());
        } else {
            System.out.println("Mister " + Thread.currentThread().getName() + ", no hay saldo suficiente para realizar la transaccion");
        }
    }

}
