
package Libros;


public class Libro {
    
    private String Titulo;
    private String Editorial;
    private String Autor;
    private String Año;

    public Libro(String Titulo, String Editorial, String Autor, String Año) {
        this.Titulo = Titulo;
        this.Editorial = Editorial;
        this.Autor = Autor;
        this.Año = Año;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }
    
    public Object[] toObject(){
        Object [] obj =  new Object[]{this.Titulo,this.Editorial,this.Autor,this.Año};
        return obj;
    }
    
}
