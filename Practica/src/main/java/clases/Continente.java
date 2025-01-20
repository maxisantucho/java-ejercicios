package clases;

public enum Continente {

    AMERICA(910000000, 42330000),
    EUROPA(731000000, 10180000),
    AFRICA(922011000, 30370000),
    ASIA(387900001, 43810000),
    OCEANIA(27000000, 8720710),
    ANTARTIDA(1000, 13720000);

    private int cantHabitantes;
    private double superficie;

    private Continente(int cantHabitantes, double superficie) {
        this.cantHabitantes = cantHabitantes;
        this.superficie = superficie;
    }

    public double densidadPoblacional() {
        return cantHabitantes / superficie;
    }

    @Override
    public String toString() {
        return "Continente{" +
                "cantHabitantes=" + cantHabitantes +
                ", superficie=" + superficie +
                '}';
    }
}
