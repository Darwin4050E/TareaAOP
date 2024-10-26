package espol.edu.ec;

public class Main {
    public static void main(String[] args) {
		Empleado andreas = new Empleado("Andreas",
				"Jefe",
				"Impresora 1");
		Empleado julia = new Empleado("Julia",
				"Consultor",
				"Impresora 2");
		Empleado tom = new Empleado("Tom",
				"Venta",
				"Impresora 2");
		Empleado stefanie = new Empleado("Stefanie",
				"Desarrollador",
				"Impresora 3");
	
		andreas.printCurrentFunción();
		julia.printCurrentFunción();
		tom.printCurrentFunción();
		stefanie.printCurrentFunción();
	}
}