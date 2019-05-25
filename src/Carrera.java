
class Carrera {
    String nombre;
    String facu;
    double costo;
    String jefe;

    public Carrera() {
    }

    public Carrera(String nombre, String facu, double costo, String jefe) {
        this.nombre = nombre;
        this.facu = facu;
        this.costo = costo;
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacu() {
        return facu;
    }

    public void setFacu(String facu) {
        this.facu = facu;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
