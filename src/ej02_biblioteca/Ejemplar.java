package ej02_biblioteca;

import java.time.LocalDate;

class Ejemplar {

    enum EstadoEjemplar {
        EN_BIBLIOTECA,
        PRESTADO,
        RETRASO,   // TODO: caso de uso de cambio a retraso
        REPARACION
    }

    private final int identificador;
    private final Libro libro;

    private EstadoEjemplar estadoEjemplar;
    private LocalDate fechaPrestamo;


    public void devolver() {
        this.estadoEjemplar = EstadoEjemplar.EN_BIBLIOTECA;
        this.fechaPrestamo = null;
    }


    public void prestarA(Lector lector) throws Lector.MaxPrestamosException, Lector.MultadoException {
        lector.addEjemplarEnPrestamo(this);
        this.estadoEjemplar = EstadoEjemplar.PRESTADO;
        this.fechaPrestamo = LocalDate.now();
    }


    public Ejemplar(int identificador, Libro libro) {
        this.identificador = identificador;
        this.libro = libro;
        this.estadoEjemplar = EstadoEjemplar.EN_BIBLIOTECA;
    }

    @Override
    public String toString() {
        return "Ejemplar {" +
                "identificador=" + identificador +
                ", libro=\"" + libro.getNombre() +
                "\", estadoEjemplar=" + estadoEjemplar +
                ", fechaPrestamo=" + fechaPrestamo +
                '}';
    }

}
