public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String telefono;
    private String domicilio;

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombre() {
        return this.nombre;

    }

    public void setapellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getapellidoPaterno() {
        return this.apellidoPaterno;
    }

    public void setapellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getapellidoMaterno() {
        return this.apellidoMaterno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
    }

    public String gettelefono() {
        return this.telefono;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido Paterno: " + apellidoPaterno + "\nApellido Materno: " + apellidoMaterno
                + "\nEdad: " + edad + "\nTeléfono: " + telefono + "\nDomicilio: " + domicilio;
    }

}
