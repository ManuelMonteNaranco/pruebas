import java.time.Duration;

public class app {

    private static Object generarCadenaAleatoria;

    public static void main(String[] args) {
        Director tarantino = new Director("Quentin ", "Tarantino", "Americano");
        Pelicula pelicula1 = new Pelicula("Malditos bastardos", 146,tarantino,  "Belico");
        Director Steven = new Director("Steven", "Spelverg", "Americano");
        Pelicula pelicula2 = new Pelicula("Jaws", 167, Steven,"Ciencia Ficion");
        Director Robert = new Director("Robert ", "Zemeckis", "Americano");
        Pelicula pelicula3 = new Pelicula("Back to the future", 98,Robert,"Ciencia Ficion");
    pelicula1.Detalles();
    tarantino.Detalles();
    pelicula2.Detalles();
    Steven. Detalles();
    pelicula3.Detalles();
    Robert.Detalles();





    }
    }

