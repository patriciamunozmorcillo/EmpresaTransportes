/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransportes;

/**
 *
 * @author usuario
 */
public abstract class Vehiculo {

    private String marca;
    private String matricula;
    private Empleado conductor;
    
    public void mostrar(){
        System.out.println(this.marca);
        System.out.println(this.matricula);
        this.conductor.mostrar();
    }

    public Empleado getConductor() {
        return conductor;
    }

    public void setConductor(Empleado conductor) {
        this.conductor = conductor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
