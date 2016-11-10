/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

/**
 *
 * @author angel
 */
public class Alcohol extends Bebida{
    
    private int graduacion;

    public int getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(int graduacion) {
        this.graduacion = graduacion;
    }
    
    public void mostrar (){
        super.mostrar();
        System.out.println(this.graduacion);
    }

  
    
}
