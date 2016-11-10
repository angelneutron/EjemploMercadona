/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Mercadona {

    static ArrayList<Producto> productos = new ArrayList<Producto>();
    static ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public static void rellenarDatos() {

        //Relleno la lista de empleados (20)
        for (int i = 0; i < 20; i++) {
            Empleado e = new Empleado();
            e.setNombre("Empleado " + i);
            e.setEdad(20 + i);
        }

        //Relleno el árbol de herencia. 
        for (int i = 0; i < 50; i++) {

            Producto p = new Producto();
            p.setCodigo(52163 + i);
            p.setNombre("Manzana "+i);
            p.setPeso(30+i);
            productos.add(p);

            ProductoCaduca cad = new ProductoCaduca();
            cad.setCodigo(937474);
            cad.setNombre("Manzana "+i);
            cad.setPeso(30+i);
            cad.setFecha_caducidad("17/02/2017");
            productos.add(cad);

            Fresco f = new Fresco();
            f.setCodigo(937403);
            f.setNombre("Manzana "+i);
            f.setPeso(30+i);
            f.setFecha_caducidad("23/08/2017");
            f.setTemperatura("10");
            productos.add(f);

            Bebida b = new Bebida();
            b.setCodigo(937493);
            b.setNombre("Manzana "+i);
            b.setPeso(30+i);
            b.setFecha_caducidad("16/08/2017");
            b.setAzucar("5%");
            productos.add(b);

            Alcohol a = new Alcohol();
            a.setCodigo(974384);
            a.setNombre("Manzana "+i);
            a.setPeso(30+i);
            a.setFecha_caducidad("10/10/2017");
            a.setAzucar("3%");
            a.setGraduacion(5 + i);
            productos.add(a);
        }
    }

    public static void mostrarTodasBebidas() {
        for (Producto pro : productos) {
            if (pro instanceof Bebida) {
                System.out.println(((Bebida) pro).getAzucar());
            }
        }
    }

    public static void maximaGraduacion() {

        int maxGraduacion = 0;

        for (Producto pro : productos) {
            if (pro instanceof Alcohol) {

            }
        }
    }

    public static void mostrarAzucarNoAlcoholicas() {
        for (Producto producto : productos) {
            if ((producto instanceof Bebida) && !(producto instanceof Alcohol)) {
                System.out.println(((Bebida) producto).getAzucar());
            }
        }
    }
    
    public static void mostrarTodosLosProductos (){
        
        for (Producto producto : productos) {
            producto.mostrar();
        }
    }

    public static void mediaGraduacion() {
        
        double suma = 0;
        int elementos = 0;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Alcohol){
                suma = suma + ((Alcohol) productos.get(i)).getGraduacion();
                elementos++;
            }
        }
        System.out.println(suma / elementos);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        rellenarDatos();
        //mostrarTodasBebidas();
        //maximaGraduacion();
        //mostrarAzucarNoAlcoholicas();
        //mostrarTodosLosProductos();
        mediaGraduacion();

    }

}
