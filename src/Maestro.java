
import java.util.ArrayList;


class Maestro {
    String nombre;
    String apellido;
    double salario;
    int edad;
    ArrayList <Clase> clases = new ArrayList();

    public Maestro() {
    }

    public Maestro(String nombre, String apellido, double salario, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Maestro{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", edad=" + edad + ", clases=" + clases + '}';
    }
    
    
    
}
