package clases;

public class CuentaBancaria {

    private double saldoActual = 50;

    public double getSalarioActual() {
        return saldoActual;
    }

    public void retirarDeCuenta(double valorRetiro) {
        saldoActual -= valorRetiro;
    }

}
