public class LIBRO {

    protected String titulo;
    protected String autor;
    protected String precio;
    protected Integer cantidaddeejemplares;
    protected String codigo;

    public LIBRO() {
    }

    public LIBRO(String titulo, String autor, String precio, Integer cantidaddeejemplares, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidaddeejemplares = cantidaddeejemplares;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getCantidaddeejemplares() {
        return cantidaddeejemplares;
    }

    public void setCantidaddeejemplares(Integer cantidaddeejemplares) {
        this.cantidaddeejemplares = cantidaddeejemplares;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "LIBRO{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio='" + precio + '\'' +
                ", cantidaddeejemplares=" + cantidaddeejemplares +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    public String mostrarlibro(){
        return "Codigo" + codigo + "titulo: " + titulo + "Autor: " + autor + "Precio: " + precio + "Cabtidaddeejemplares: " + cantidaddeejemplares;
    }


    public void mostrarLibro() {
    }
}

