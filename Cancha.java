public class Cancha {
    private int precio;
    private int tipoDeCancha;
    private int id;


    public Cancha(int precio, int tipoDeCancha, int id) {
        this.precio = precio;
        this.tipoDeCancha = tipoDeCancha;
        this.id = id;
    }
    public int getPrecio() {
        return precio;
    }

    public int getTipoDeCancha() {
        return tipoDeCancha;
    }

    public int getNumeroCancha() {
        return this.id;
    }
}
