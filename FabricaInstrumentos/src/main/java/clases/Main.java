package clases;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Fabrica f = new Fabrica();

        cargarFabrica(f);

        f.listarInstrumentos();

        ArrayList<Instrumento> instrumentosTipo = f.instrumentoPorTipo(TipoInstrumento.PERCUSION);
        for(Instrumento instrumento : instrumentosTipo) {
            System.out.println(instrumento);
        }

        Instrumento instrumentoBorrado = f.borrarInstrumento("ABC123");

        if(instrumentoBorrado != null) {
            System.out.println("Fue borrado de la lista el " + instrumentoBorrado);
        } else {
            System.out.println("No se encontro instrumento");
        }

        f.listarInstrumentos();

        double [] porcentajes = f.porcInstrumentoPorTipo("Sucursal B");

        for (int i = 0; i < porcentajes.length; i++) {
            System.out.println(porcentajes[i]);
        }

    }

    public static void cargarFabrica(Fabrica f) {
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");

        f.agregarSucursal(s1);
        f.agregarSucursal(s2);

        s1.agregarInstrumento(new Instrumento("ABC123", 13214, TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("BCD234", 13332, TipoInstrumento.VIENTO));
        s1.agregarInstrumento(new Instrumento("DEF345", 14321, TipoInstrumento.PERCUSION));

        s2.agregarInstrumento(new Instrumento("EFG567", 18292, TipoInstrumento.CUERDA));
        s2.agregarInstrumento(new Instrumento("HIJ678", 54354, TipoInstrumento.VIENTO));
    }

}