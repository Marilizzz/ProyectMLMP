public class Reservas {
    public int Codigo_reserva;
    public String Fecha_solicirud;
    public String Fecha_Vencimiento;
    public void setCodigo_reserva(int Codigo_reserva)
    {
        this.Codigo_reserva=Codigo_reserva;
    }
    public void setFecha_solicirud(String Fecha_solicirud)
    {
        this.Fecha_solicirud=Fecha_solicirud;
    }
    public void setFecha_Vencimiento(String Fecha_Vencimiento)
    {
        this.Fecha_Vencimiento=Fecha_Vencimiento;
    }

    public int getCodigo_reserva() {
        return Codigo_reserva;
    }

    public String getFecha_solicirud() {
        return Fecha_solicirud;
    }

    public String getFecha_Vencimiento() {
        return Fecha_Vencimiento;
    }
}
