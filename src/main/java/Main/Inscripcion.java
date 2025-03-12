package Main;

import java.time.LocalDateTime;

public class Inscripcion {
    private Participante participante;
    private Concurso concurso;
    private LocalDateTime fechaInscripcion;


    public Inscripcion(Participante participante, Concurso concurso, LocalDateTime fechaInscripcion) {
        this.participante = participante;
        this.concurso = concurso;
        this.fechaInscripcion = fechaInscripcion;
    }

    /*
    public static void inscribirAEN(Participante participante, Concurso concurso){
        var nuevaInscripcion = new Inscripcion(unParticipante, unConcurso, LocalDateTime.now());
        unConcurso.nuevaInscripcion(nuevaInscripcion);
    }
     */

    public void inscribirA(Participante participante) {
        Inscripcion nuevaInscripcion = new Inscripcion(participante, this, LocalDateTime.now());
        this.nuevaInscripcion(nuevaInscripcion);
    }

    public boolean estaInscripto(Participante participante){
        return this.participante.equals(participante);
    }
    /*
    public boolean estaInscripto(Participante participante) {
        return this.participante.getDni().equals(participante.getDni());
    }
     */
}
