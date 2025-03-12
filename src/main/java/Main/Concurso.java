package Main;

import java.util.ArrayList;

public class Concurso {
    private String nombre;
    private ArrayList<Inscripcion> inscriptos;

    public Concurso(String nombre) {
        this.nombre = nombre;
        this.inscriptos = new ArrayList<>();
    }

    public boolean participanteInscripto(Participante participante) {
        return inscriptos.stream().anyMatch(inscripcion -> inscripcion.estaInscripto(participante));
    }

    public void nuevaInscripcion(Inscripcion inscripcion) {
        this.inscriptos.add(inscripcion);
    }

    public int cantidadInscriptos() {
        return this.inscriptos.size();
    }
}
