public class Alumno
{
    private String nombre;
    private int clave;
    
    public Alumno(String nombre, int clave)
    {
        this.nombre = nombre;
        this.clave = clave;
    }

    public String dimeNombre()
    {
        return nombre;
    }
    
    public int dimeClave()
    {
        return clave;
    }
}
