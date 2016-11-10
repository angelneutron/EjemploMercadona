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
public class Bebida extends ProductoCaduca{
    
    private String azucar;


    public String getAzucar() {
        return azucar;
    }

    public void setAzucar(String azucar) {
        this.azucar = azucar;
    }
    
    public void mostrar (){
        super.mostrar();
        System.out.println(this.azucar);
    }
    
    
}
