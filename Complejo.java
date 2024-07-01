import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Complejo {
    private Set<Reserva> reservas = new HashSet();
    private Set<Turnos> turnos = new HashSet<>();
    private List<Cancha> canchas = new ArrayList<>();
    public Reserva generarReserva(Turnos unTurno, Cliente cliente, Cancha cancha) throws ValidacionExcepcion {
        for (Reserva reserva : reservas) {
            if (reserva.getTurno().equals(unTurno.getHorario()) && reserva.getNumeroCancha() == cancha.getNumeroCancha()) {
                throw new ValidacionExcepcion("Esa cancha ya está ocupada a esa hora");
            }
        }

        Reserva miReserva = new Reserva(cliente, unTurno, cancha);
        reservas.add(miReserva);
        return miReserva;
    }
}
