public class Prestamos {
    public int Codigo;
    public String Fecha_inicio;
    public String Fecha_devolucion;
    public String Estado;
    public void setCodigo(int Codigo)
    {
        this.Codigo=Codigo;
    }
    public void setFecha_inicio(String Fecha_inicio)
    {
        this.Fecha_inicio=Fecha_inicio;
    }
    public void setFecha_devolucion(String Fecha_devolucion)
    {
        this.Fecha_devolucion=Fecha_devolucion;
    }
    public void setEstado(String Estado)
    {
        this.Estado=Estado;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getEstado() {
        return Estado;
    }

    public String getFecha_devolucion() {
        return Fecha_devolucion;
    }

    public String getFecha_inicio() {
        return Fecha_inicio;
    }
}
