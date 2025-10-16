public class LIBRODIGITAL extends LIBRO {

    private Double tamaño;
    private String disponibilidad;

    public LIBRODIGITAL(String t, String a, double p, int e, double tam) {
    }

    public LIBRODIGITAL(String titulo, String autor, String precio, Integer cantidaddeejemplares, String codigo, Double tamaño, String disponibilidad) {
        super(titulo, autor, precio, cantidaddeejemplares, codigo);
        this.tamaño = tamaño;
        this.disponibilidad = disponibilidad;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "LIBRODIGITAL{" +
                "tamaño=" + tamaño +
                ", disponibilidad='" + disponibilidad + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio='" + precio + '\'' +
                ", cantidaddeejemplares=" + cantidaddeejemplares +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    @Override

    public String mostrarlibro() {
        return
                "LIBRO DIGITAL: " + "titulo: " + titulo + "Autor: " + autor + "Precio: " + precio + "Cabtidaddeejemplares: " + cantidaddeejemplares + "Tamaño: " + tamaño + "Disponibilidad: " + disponibilidad;
    }


    public int prestar(int cant) {
        if (disponibilidad.equals("si")) {
            return cantidaddeejemplares -= cant;
        }
        return 0;

    }

    public int devolver(int cant) {
        if (disponibilidad.equals("si")) {
            return cantidaddeejemplares += cant;
        }

        return cant;
    }
}

