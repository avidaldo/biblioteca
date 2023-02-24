package ej02_biblioteca;

class Libro {

    enum TipoLibro {
        NOVELA,
        TEATRO,
        POESIA,
        ENSAYO
    }

    private final String isbn;
    private final String nombre;
    private final TipoLibro tipo;
    private final String editorial;
    private final int anho;
    private final Autor autor;

    public Libro(String isbn, String nombre, TipoLibro tipo, String editorial, int anho, Autor autor) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.anho = anho;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", editorial='" + editorial + '\'' +
                ", anho=" + anho +
                ", autor=" + autor +
                '}';
    }
}
