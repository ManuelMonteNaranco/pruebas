public class Pelicula {

    private String titulo;


    private int duraion;



private Director director;

private  String genero;


public Pelicula(String titulo, int duracion, Director director, String genero){
    this.titulo=titulo;
    this.director=director;
    this.genero=genero;
    this.duraion=duracion;
}
public void Detalles(){
    System.out.println(this.titulo + " cuya duracion es: " + this.duraion + " su genero es: " + this.genero);
    this.director.Detalles();
    System.out.println();
}

    public void setNombre(String Nombre) {
        this.genero = genero;
    }
}
