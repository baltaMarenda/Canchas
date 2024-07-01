public class Main {
    public static void main(String[] args) {
        Complejo miComplejo = new Complejo();
        Cancha cancha1 = new Cancha(1000, 5,1);
        Cancha cancha2 = new Cancha(1500, 8,2);
        Cancha cancha3 = new Cancha(2000, 5,3);

        Cliente cliente1 = new Cliente("Nicolas");
        Turnos turno1 = new Turnos("18:00");

        Cliente cliente2 = new Cliente("Balta");
        Turnos turno2 = new Turnos("18:00");
        try {
            Reserva reserva = miComplejo.generarReserva(turno1,cliente1, cancha1);
            System.out.println("La reserva se hizo a nombre de: "+ reserva.getCliente());
            System.out.println("Horario: "+ reserva.getTurno());
            System.out.println("En la cancha numero: "+reserva.getNumeroCancha() + " ,con un precio de: $"+reserva.getPrecioCancha()+ ". El tipo de cancha es de: "+reserva.getTipoCancha());
        }catch (ValidacionExcepcion e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
        try {
            Reserva reserva2 =  miComplejo.generarReserva(turno2, cliente2, cancha1);
            System.out.println("La reserva se hizo a nombre de: "+ reserva2.getCliente());
            System.out.println("Horario: "+ reserva2.getTurno());
            System.out.println("En la cancha numero: "+reserva2.getNumeroCancha() + " ,con un precio de: $"+reserva2.getPrecioCancha()+ ". El tipo de cancha es de: "+reserva2.getTipoCancha());


        }catch (ValidacionExcepcion e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }


    }



}
