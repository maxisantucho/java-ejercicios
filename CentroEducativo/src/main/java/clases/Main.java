package clases;

import java.util.ArrayList;

public class Main {

    ArrayList<Alumno> alumnos = new ArrayList<>();

    public Main() {
        this.alumnos = new ArrayList<>();
    }

    public static void main(String[] args) {

        Main c = new Main();

        Alumno pepe = new Alumno("123", "Fulano", "Pepe");
        Alumno maria = new Alumno("123", "Mengano", "Maria");
        Alumno luis = new Alumno("123", "Sultano", "Luis");

        pepe.agregarExamen(new ExamenEscrito(40, 7, "00/00/0000"));
        pepe.agregarExamen(new ExamenOral("00/00/0000", NivelDeSatisfaccion.SUFICIENTE));

        maria.agregarExamen(new ExamenEscrito(60, 4, "00/00/0000"));
        maria.agregarExamen(new ExamenEscrito(65, 8, "00/00/0000"));
        maria.agregarExamen(new ExamenOral("00/00/0000", NivelDeSatisfaccion.EXCELENTE));

        luis.agregarExamen(new ExamenEscrito(100, 9, "00/00/0000"));
        luis.agregarExamen(new ExamenOral("00/00/0000", NivelDeSatisfaccion.EXCELENTE));
        luis.agregarExamen(new ExamenOral("00/00/0000", NivelDeSatisfaccion.INSUFICIENTE));

        c.agregarAlumno(pepe);
        c.agregarAlumno(maria);
        c.agregarAlumno(luis);

        System.out.println("Cantidad de aprobados: " + c.cantidadAprobados());

    }

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    public int cantidadAprobados() {
        int contador = 0;
        for(Alumno alumno : alumnos) {
            if(alumno.aprobo()) {
                contador++;
            }
        }
        return contador;
    }

}