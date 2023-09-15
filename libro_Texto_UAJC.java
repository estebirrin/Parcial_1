public class libro_Texto_UAJC extends libro_Texto{
    
    protected String Facultad;

    public libro_Texto_UAJC(String Titulo, String Autor, int Precio, String Curso, String facultad) {
        super(Titulo, Autor, Precio, Curso);
        Facultad = facultad;
    }

    public void imprimirLibro(){

        super.imprimirLibro();
        System.out.println("Facultad: " + Facultad);
    }
}
