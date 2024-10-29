package ec.edu.espol;

public class Cliente {
    private SistemaPagoAntiguo sistemaPago;

    public Cliente(SistemaPagoAntiguo sistemaPago) {
        this.sistemaPago = sistemaPago;
    }

    public void hacerPago(int monto) {
        sistemaPago.pagar(monto);
    }
}
