public class LIBRODIGITAL extends LIBRO {

    private Double Tamaño;
    private String Disponibilidad;


    public LIBRODIGITAL() {
    }

    public LIBRODIGITAL(String titulo, String autor, String precio, Integer cantidaddeejemplares, Double tamaño, String disponibilidad) {
        super(titulo, autor, precio, cantidaddeejemplares);
        Tamaño = tamaño;
        Disponibilidad = disponibilidad;
    }


    @Override
    public String toString() {
        return super.toString() + "LIBRODIGITAL{" +
                "Disponibilidad='" + Disponibilidad + '\'' +
                ", Tamaño=" + Tamaño +
                '}';
    }

    Override

    public String mostrarlibro() {
        return "titulo: " + titulo + "Autor: " + Autor + "Precio: " + Precio + "Cabtidaddeejemplares: " + cantidaddeejemplares + "Tamaño: " + Tamaño + "Disponibilidad: " + Disponibilidad;
    }


    public int prestar(int cant) {
        if (Disponibilidad.equals("si")) {
            return cantidaddeejemplares -= cant;
        }
        return 0;

    }

    public int devolver(int cant) {
        if (Disponibilidad.equals("si")) {
            return cantidaddeejemplares += cant;
        }

        return cant;
    }
}

