public class Clase_Main {
    
    public static void main(String[] args){

            libro_Texto_UAJC UNIAJC = new libro_Texto_UAJC("Libro de Matemáticas", "Profesor A", 115000,"Matemáticas Avanzadas", "Facultad de Ciencias Exactas");
            Novela Nov = new Novela("Romeo y Julieta", "William Shakespeare", 55000,"Romantica");

            System.out.println("Informacion sobre libro de texto de la Institución Universitaria Antonio José Camacho:");
            UNIAJC.imprimirLibro();
            System.out.println("\nInformación de la Novela:");
            Nov.imprimirLibro();
       
    }
}
