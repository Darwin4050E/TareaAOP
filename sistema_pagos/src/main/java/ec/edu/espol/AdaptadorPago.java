package ec.edu.espol;

import org.aspectj.lang.annotation.*;

@Aspect
public class AdaptadorPago {
    private NuevoSistemaPago nuevoSistemaPago = new NuevoSistemaPago();

    // Intercepta la llamada a pagar en SistemaPagoAntiguo y redirige a procesarPago
    @Before("execution(* SistemaPagoAntiguo.pagar(..)) && args(monto)")
    public void adaptarPago(int monto) {
        nuevoSistemaPago.procesarPago((double) monto);
    }
}


