package ej02_biblioteca;

public class Main {

    public static void main(String[] args) {
        Biblioteca.inicializar();


        prestarEjemplarALector(1, 1);
        prestarEjemplarALector(1, 2);
        prestarEjemplarALector(1, 3);
        prestarEjemplarALector(1, 4); // Muestra error

        System.out.println(Biblioteca.listaLectores);
        System.out.println(Biblioteca.listaLectores.get(1).getEjemplaresPrestados());


        Ejemplar libroPrestado = Biblioteca.listaLectores.get(1).getEjemplaresPrestados().get(1);
        Biblioteca.listaLectores.get(1).devolverEjemplar(libroPrestado);

        prestarEjemplarALector(1, 4);

        System.out.println(Biblioteca.listaLectores);

    }

    private static void prestarEjemplarALector(int libroIdEnLista, int lectorIdEnLista) {
        try {
            Biblioteca.prestarEjemplarALector(libroIdEnLista, lectorIdEnLista);
        } catch (Lector.MaxPrestamosException e) {
            System.err.println("El lector " + lectorIdEnLista + "ya tiene tres libros en préstamo");
        } catch (Lector.MultadoException e) {
            System.err.println("El lector está multado y no puede recibir préstamos");
        }
    }
}
