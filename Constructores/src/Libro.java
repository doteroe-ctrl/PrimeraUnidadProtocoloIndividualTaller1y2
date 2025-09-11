public class Libro {

    String titulo;
    String autor;
    int numeroPaginas;

    public Libro() {
        titulo = "desconocido";
        autor = "desconocido";
        numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;  
        this.numeroPaginas = numeroPaginas;
    }

    public String toString(){
        return "\nTitulo= " + titulo + "\nAutor= " + autor + "\nPaginas= " + numeroPaginas;

    }
    
}