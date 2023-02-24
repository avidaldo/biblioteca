package ej02_biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Lector {
    private static final long DIAS_MULTA = 2;
    private static final int MAX_PRESTAMOS = 3;

    private final int numSocio;
    private final String nombre;


    private final List<Ejemplar> librosEnPrestamo = new ArrayList<>();

    private LocalDate multadoDesde;


    public Lector(int numSocio, String nombre) {
        this.numSocio = numSocio;
        this.nombre = nombre;
    }


    public void addEjemplarEnPrestamo(Ejemplar ejemplar) throws MaxPrestamosException, MultadoException {
        if (multadoDesde != null && multadoDesde.plusDays(DIAS_MULTA + 1).isAfter(LocalDate.now()))
            throw new MultadoException();
        if (librosEnPrestamo.size() >= MAX_PRESTAMOS) throw new MaxPrestamosException();
        librosEnPrestamo.add(ejemplar);
    }

    public List<Ejemplar> getEjemplaresPrestados() {
        return librosEnPrestamo;
    }

    public void devolverEjemplar(Ejemplar ejemplarPrestado) {
        librosEnPrestamo.remove(ejemplarPrestado);
        ejemplarPrestado.devolver();
    }

    @Override
    public String toString() {
        return "Lector{" +
                "numSocio=" + numSocio +
                ", nombre='" + nombre + '\'' +
                ", librosEnPrestamo=" + librosEnPrestamo +
                '}';
    }

    static class MaxPrestamosException extends Exception {
    }

    static class MultadoException extends Throwable {
    }
}
