/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransportes;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class EmpresaTransportes {

    private static ArrayList<Envio> envios = new ArrayList<Envio>();
    private static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public static void rellenarDatos() {

        EnvioAzul a;
        Envio24H h;
        Coche c;
        Furgo f;
        Camion ca;
        Empleado e;

        for (int i = 0; i < 10; i++) {
            a = new EnvioAzul();
            a.setPeso(i + 1);
            a.setFecha("04/11/2016");
            a.setValor((i + 1) * 2);
            envios.add(a);

            h = new Envio24H();
            h.setPeso(i + 2);
            h.setFecha("04/11/2016");
            h.setPrioridad("Urgente" + i);
            envios.add(h);

            c = new Coche();
            c.setMarca("Renault " + i);
            c.setMatricula("873" + i + "JKL");
            c.setColor("Amarillo" + i);
            vehiculos.add(c);

            f = new Furgo();
            f.setMarca("Mercedes " + i);
            f.setMatricula("123" + i + "JKL");
            f.setPma(200 + i);
            vehiculos.add(f);

            ca = new Camion();
            ca.setMarca("Renault " + i);
            ca.setMatricula("873" + i + "JKL");
            ca.setVolumen(300 + i);
            vehiculos.add(ca);

            e = new Empleado();
            e.setNombre("Luis " + i);
            e.setEdad(30 + i);
            empleados.add(e);
        }

    }

    public static void mostrarTodosEnvios() {
        for (Envio envio : envios) {
            envio.mostrar();
        }
    }

    public static void mostrarEnvio24MayorPeso() {
        double max = 0;
        for (Envio envio : envios) {
            if (envio instanceof Envio24H) {
                if (max < envio.getPeso()) {
                    max = envio.getPeso();
                }
            }
        }
        System.out.println("El envío de 24 con mayor peso es:" + max + "kg");

    }

    public static void mostrarSumaPesosSegunTipoEnvio() {
        double pesoAzul = 0;
        double peso24H = 0;
        for (Envio envio : envios) {
            if (envio instanceof EnvioAzul) {
                pesoAzul = pesoAzul + envio.getPeso();
            } else {
                peso24H = peso24H + envio.getPeso();
            }

        }
        System.out.println("El peso de todos los paquetes Azules es:" + pesoAzul + "kg");
        System.out.println("El peso de todos los paquetes de 24H es:" + peso24H + "kg");
        System.out.println("El peso de todos los paquetes es:" + (peso24H + pesoAzul) + "kg");

    }

    public static void asignarEmpleadoAVehiculo(Vehiculo v,Empleado e) {
        v.setConductor(e);
        System.out.print("El vehiculo "+v.getMarca()+" se le asigna al empleado "+e.getNombre());
    }

    public static void main(String[] args) {
        rellenarDatos();
        mostrarTodosEnvios();
        mostrarEnvio24MayorPeso();
        mostrarSumaPesosSegunTipoEnvio();
        
        Vehiculo miVehiculo=vehiculos.get(2);
        Empleado miEmpleado=empleados.get(5);
        asignarEmpleadoAVehiculo(miVehiculo,miEmpleado);
    }

}
