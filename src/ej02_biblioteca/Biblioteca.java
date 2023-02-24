package ej02_biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ej02_biblioteca.Libro.TipoLibro.ENSAYO;

final class Biblioteca {
    static List<Ejemplar> listaEjemplares = new ArrayList<>();
    static List<Lector> listaLectores = new ArrayList<>();


    static void inicializar() {
        generarListaLectores();
        generarListaEjemplares();
    }


    public static void prestarEjemplarALector(int libroIdEnLista, int lectorIdEnLista)
            throws Lector.MaxPrestamosException, Lector.MultadoException {
        Ejemplar ejemplar = listaEjemplares.get(libroIdEnLista);
        Lector lector = listaLectores.get(lectorIdEnLista);
        ejemplar.prestarA(lector);
    }

    private static void generarListaLectores() {
        listaLectores.addAll(Arrays.asList(
                new Lector(1, "Robert C. Martin"),
                new Lector(2, "Martin Fowler"),
                new Lector(3, "James Gosling"),
                new Lector(4, "Bjarne Stroustrup"),
                new Lector(5, "Guido van Rossum"),
                new Lector(6, "Linus Torvalds"),
                new Lector(7, "Larry Wall"),
                new Lector(8, "Dennis Ritchie"),
                new Lector(9, "Richard Stallman"),
                new Lector(10, "Grace Hopper")
        ));
    }


    private static void generarListaEjemplares() {
        listaEjemplares.addAll(Arrays.asList(
                new Ejemplar(1,
                        new Libro("0201633612", "Design Patterns: Elements of Reusable Object-Oriented Software", ENSAYO, "Addison-Wesley", 1994,
                                new Autor("Erich Gamma", "Switzerland", LocalDate.parse("1961-02-06"))
                        )
                ),
                new Ejemplar(2,
                        new Libro("0132350882", "Clean Code: A Handbook of Agile Software Craftsmanship", ENSAYO, "Prentice Hall", 2008,
                                new Autor("Robert C. Martin", "USA", LocalDate.parse("1952-09-17"))
                        )
                ),
                new Ejemplar(3,
                        new Libro("020161622X", "The Pragmatic Programmer: From Journeyman to Master", ENSAYO, "Addison-Wesley", 1999,
                                new Autor("Andrew Hunt", "USA", LocalDate.parse("1960-10-19"))
                        )
                ),
                new Ejemplar(4,
                        new Libro("0201485672", "Refactoring: Improving the Design of Existing Code", ENSAYO, "Addison-Wesley", 1999,
                                new Autor("Martin Fowler", "UK", LocalDate.parse("1963-03-14"))
                        )
                ),
                new Ejemplar(5,
                        new Libro("0201124960", "Introduction to the Theory of Computation", ENSAYO, "PWS Publishing Company", 1997,
                                new Autor("Michael Sipser", "USA", LocalDate.parse("1947-07-17"))
                        )
                ),
                new Ejemplar(6,
                        new Libro("0735619670", "Code Complete: A Practical Handbook of Software Construction", ENSAYO, "Microsoft Press", 2004,
                                new Autor("Steve McConnell", "USA", LocalDate.parse("1954-08-07"))
                        )
                ),
                new Ejemplar(7,
                        new Libro("0130224189", "Algorithms + Data Structures = Programs", ENSAYO, "Prentice-Hall", 1976,
                                new Autor("Niklaus Wirth", "Switzerland", LocalDate.parse("1934-02-15"))
                        )
                ),
                new Ejemplar(8,
                        new Libro("0262510871", "Structure and Interpretation of Computer Programs", ENSAYO, "MIT Press", 1985,
                                new Autor("Harold Abelson", "USA", LocalDate.parse("1947-07-04"))
                        )
                )
        ));
    }
}
