public class LIBROIMPRESO extends LIBRO {

    private Double Peso;


    public LIBROIMPRESO() {
    }

    public LIBROIMPRESO(String titulo, String autor, String precio, int cantidaddeejemplares, Double peso) {
        super(titulo, autor, precio, cantidaddeejemplares);
        Peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "LIBROIMPRESO{" +
                "Peso=" + Peso +
                '}';
    }

    public String mostrarlibro() {
        return "titulo: " + titulo + "Autor: " + Autor + "Precio: " + Precio + "Cabtidaddeejemplares: " + Cantidaddeejemplares;
    }

    public String prestar() {
        return "Tamaño: " + Tamaño + "Disponibilidad: " + Disponibilidad;


        }

}
