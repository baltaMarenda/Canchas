public class Reserva {
    private Cliente cliente;

    private Turnos turno;

    private Cancha cancha;


    public Reserva(Cliente cliente, Turnos turno, Cancha cancha) {
        this.cliente = cliente;
        this.turno = turno;
        this.cancha = cancha;
    }

    public void setTurno(Turnos unTurno) {
    }

    public void setCliente(Cliente cliente) {
    }

    public void setCancha(Cancha cancha) {
    }
    public String getCliente() {
        return cliente.getNombre();
    }

    public String getTurno() {
        return turno.getHorario();
    }

    public int getTipoCancha() {
        return cancha.getTipoDeCancha();
    }

    public Cancha getCancha() {
        return cancha;
    }

    public int getNumeroCancha() {
        return cancha.getNumeroCancha();
    }


    public int getPrecioCancha() {
        return cancha.getPrecio();
    }
}
