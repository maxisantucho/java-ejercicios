package clases;

public class ExamenOral extends Examen{

    private NivelDeSatisfaccion nivel;

    public ExamenOral(String fecha, NivelDeSatisfaccion nivel) {
        super(fecha);
        this.nivel = nivel;
    }

    @Override
    public boolean aprobo() {
        NivelDeSatisfaccion[] niveles = NivelDeSatisfaccion.values();
        return nivel.ordinal() >= niveles[1].ordinal();
    }

}
