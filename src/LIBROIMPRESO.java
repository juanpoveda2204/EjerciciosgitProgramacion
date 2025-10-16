public class LIBROIMPRESO extends LIBRO {

    private String peso;

    public LIBROIMPRESO(String t, String a, double p, int e, double peso) {
    }

    public LIBROIMPRESO(String titulo, String autor, String precio, Integer cantidaddeejemplares, String codigo, String peso) {
        super(titulo, autor, precio, cantidaddeejemplares, codigo);
        this.peso = peso;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "LIBROIMPRESO{" +
                "Peso=" + peso +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio='" + precio + '\'' +
                ", cantidaddeejemplares=" + cantidaddeejemplares +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    public String mostrarlibro() {
        return
                "LIBRO IMPRESO: " + "titulo: " + titulo + "Autor: " + autor + "Precio: " + precio + "Cabtidaddeejemplares: " + cantidaddeejemplares + "Peso: " + peso;
    }



        }


