public class Novela extends Libro {
    
    protected String Tipos;

    public Novela(String Titulo, String Autor, int Precio, String Tipos) {
        super(Titulo, Autor, Precio);
        Tipos = Tipos;
    }

    public void imprimirLibro(){

        super.imprimirLibro();
        System.out.println("Tipo de novela: " + Tipos);
    }
    
}
