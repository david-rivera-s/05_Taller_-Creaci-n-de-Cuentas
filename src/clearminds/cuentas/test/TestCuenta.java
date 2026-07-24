package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("03476");
        cuenta1.setSaldo(675);
        
        Cuenta cuenta2 = new Cuenta("03476", "C", 98);
        
        Cuenta cuenta3 = new Cuenta("03476");
        cuenta3.setTipo("C");
        
        System.out.println("-------- Valores Iniciales ---------");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        
     // Modificación de saldos y tipos de las cuentas existentes
        cuenta1.setSaldo(1000.0);
        cuenta2.setTipo("A");
        cuenta2.setSaldo(500.0);
        cuenta3.setTipo("A");
        cuenta3.setSaldo(250.0);

        System.out.println("-------- Valores Modificados ---------");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();

        // Creación de tres cuentas adicionales usando constructores sobrecargados
        Cuenta cuenta4 = new Cuenta("09876");
        Cuenta cuenta5 = new Cuenta("11223", "C", 1500.50);
        Cuenta cuenta6 = new Cuenta("44556");
        cuenta6.setSaldo(300.0);

        System.out.println("-------- Cuentas Adicionales ---------");
        cuenta4.imprimir();
        cuenta5.imprimir();
        cuenta6.imprimir();
    }
}