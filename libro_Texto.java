public class libro_Texto extends Libro {
    
    protected String Curso;

    public libro_Texto(String Titulo, String Autor, int Precio, String curso) {
        super(Titulo, Autor, Precio);
        Curso = curso;
    }

    public void imprimirLibro(){

        super.imprimirLibro();
        System.out.println("Curso: " + Curso);
    }



}