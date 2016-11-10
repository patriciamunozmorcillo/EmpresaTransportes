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
public class EnvioAzul extends Envio {
    private double valor;
    
    public void mostrar(){
        super.mostrar();
        System.out.println(this.valor);  
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
