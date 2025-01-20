package clases;

import java.util.ArrayList;

public class Sucursal {

    private String nombre;
    private ArrayList<Instrumento> instrumentos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public void listarInstrumentos() {
        for(Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);
        }
    }

    public void agregarInstrumento(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Instrumento> instrumentoPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> instrumentosTipo = new ArrayList<>();
        for(Instrumento instrumento : instrumentos) {
            if(instrumento.getTipoInstrumento() == tipo) {
                instrumentosTipo.add(instrumento);
            }
        }
        return instrumentosTipo;
    }

    public Instrumento borrarInstrumento(String id) {
        int i = 0;
        while(i < instrumentos.size() && !instrumentos.get(i).getId().equalsIgnoreCase(id)) {
            i++;
        }
        if(i < instrumentos.size()) {
            return instrumentos.remove(i);
        } else {
            return null;
        }
    }

    public double[] porcInstrumentoPorTipo() {
        int cantidadInstrumentos = TipoInstrumento.values().length;
        double[] porcentajes = new double[cantidadInstrumentos];
        for(Instrumento instrumento : instrumentos) {
            porcentajes[instrumento.getTipoInstrumento().ordinal()]++;
        }
        absolutoaPorcentaje(porcentajes);
        return porcentajes;
    }

    public void absolutoaPorcentaje(double[] porcentajes) {
        for (int i = 0; i < porcentajes.length; i++) {
            porcentajes[i] = (porcentajes[i] * 100) / instrumentos.size();
        }
    }

}
