public class Director {
    private String nombre;

    private  String apellidos;

    private  String nacionalidad;
    public Director(String nombre, String apellidos, String nacionalidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
    }
        public void Detalles(){
            System.out.println("El director es: " + this.nombre + " " + this.apellidos + " Cuya nacionalidad es: " + this.nacionalidad);
        }
    }

