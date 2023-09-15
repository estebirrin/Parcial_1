public class Libro {
    
    protected String Titulo;
    protected String Autor;
    protected int Precio;
    
    public Libro(String Titulo, String Autor, int Precio) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Precio = Precio;
    }

    
    public void imprimirLibro() {
        System.out.println("Título: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("Precio: " + Precio);
         
    }

    public String getTitulo(){
            return Titulo;
    }

    public void setTitulo(String Titulo){
            this.Titulo = Titulo;
    }
    
    public String getAutor() {
            return Autor;
    }

    public void setAutor(String Autor) {
            this.Autor = Autor;
    }

    public double getPrecio() {
            return Precio;
    }

    public void setPrecio(int Precio) {
            this.Precio = Precio;
    }


}