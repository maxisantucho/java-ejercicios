package clases;

import java.util.ArrayList;

public class Fabrica {

    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    public void listarInstrumentos() {
        for(Sucursal sucursal : sucursales) {
            System.out.println(sucursal.getNombre());
            sucursal.listarInstrumentos();
        }
    }

    public ArrayList<Instrumento> instrumentoPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> instrumentosTipo = new ArrayList<>();
        for(Sucursal sucursal : sucursales) {
            instrumentosTipo.addAll(sucursal.instrumentoPorTipo(tipo));
        }
        return instrumentosTipo;
    }

    public Instrumento borrarInstrumento(String id) {
        Instrumento instrumentoBorrado = null;
        int i = 0;
        while(i < sucursales.size() && instrumentoBorrado == null) {
            instrumentoBorrado = sucursales.get(i).borrarInstrumento(id);
            i++;
        }
        return instrumentoBorrado;
    }

    public double[] porcInstrumentoPorTipo(String nombreSucursal) {
        double[] porcentajes = null;
        Sucursal sucursalEncontrada = buscarSucursal(nombreSucursal);
        if(sucursalEncontrada != null) {
            porcentajes = sucursalEncontrada.porcInstrumentoPorTipo();
        }
        return porcentajes;
    }

    public Sucursal buscarSucursal(String nombreSucursal) {
        int i = 0;
        Sucursal sucursalEncontrada = null;
        while(i < sucursales.size() && !sucursales.get(i).getNombre().equalsIgnoreCase(nombreSucursal)) {
            i++;
        }
        if(i < sucursales.size()) {
            sucursalEncontrada = sucursales.get(i);
        }
        return sucursalEncontrada;
    }

}
