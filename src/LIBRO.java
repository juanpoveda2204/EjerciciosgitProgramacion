public class LIBRO {

    protected String titulo;
    protected String Autor;
    protected String Precio;
    protected Integer cantidaddeejemplares;


    public LIBRO() {
    }

    public LIBRO(String titulo, String autor, String precio, Integer cantidaddeejemplares) {
        this.titulo = titulo;
        Autor = autor;
        Precio = precio;
        cantidaddeejemplares = cantidaddeejemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public Integer getCantidaddeejemplares() {
        return cantidaddeejemplares;
    }

    public void setCantidaddeejemplares(Integer cantidaddeejemplares) {
        cantidaddeejemplares = cantidaddeejemplares;
    }


    @Override
    public String toString() {
        return "LIBRO{" +
                "titulo='" + titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Precio='" + Precio + '\'' +
                ", Cantidaddeejemplares='" + cantidaddeejemplares + '\'' +
                '}';
    }

    public String mostrarlibro(){
        return "titulo: " + titulo + "Autor: " + Autor + "Precio: " + Precio + "Cabtidaddeejemplares: " + cantidaddeejemplares;
    }


}

