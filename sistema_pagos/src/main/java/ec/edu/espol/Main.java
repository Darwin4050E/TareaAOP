package ec.edu.espol;

public class Main {
    public static void main(String[] args) {
            // Crea una instancia de SistemaPagoAntiguo
            SistemaPagoAntiguo sistemaPagoAntiguo = new SistemaPagoAntiguo() {
                @Override
                public void pagar(int monto) {
                	 System.out.println("Procesando pago por $" +monto+ " a través del ANTIGUO sistema de pagos");
                }
            };

            // Crea el cliente con el sistema de pago antiguo
            Cliente cliente = new Cliente(sistemaPagoAntiguo);

            // Realiza un pago
            cliente.hacerPago(100);  // Se redirigirá a NuevoSistemaPago.procesarPago
        }
}