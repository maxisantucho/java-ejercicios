package clases;

public enum Mes {

    ENERO(1, 31),
    FEBRERO(2, 28),
    MARZO(3, 31),
    ABRIL(4, 30),
    MAYO(5, 31),
    JUNIO(6, 30),
    JULIO(7, 31),
    AGOSTO(8, 31),
    SEPTIEMBRE(9, 30),
    OCTUBRE(10, 31),
    NOVIEMBRE(11, 30),
    DICIEMBRE(12, 31);

    private int orden;
    private int numDias;

    private Mes(int orden, int numDias) {
        this.orden = orden;
        this.numDias = numDias;
    }

    @Override
    public String toString() {
        String mes = name().toString().substring(0, 1).toUpperCase() +
                     name().toString().substring(1).toLowerCase();
        return "El mes " + orden + "º " + mes + " tiene " + numDias + " dias";
    }

}
