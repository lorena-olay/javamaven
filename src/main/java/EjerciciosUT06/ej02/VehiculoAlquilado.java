package EjerciciosUT06.ej02;

public class VehiculoAlquilado {
    private Cliente cliente;
    private Vehiculo vehiculo;

    public VehiculoAlquilado() {
    }

    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "VehiculoAlquilado{" +
                "cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
