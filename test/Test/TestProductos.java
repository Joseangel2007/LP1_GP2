/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Dao.ProductoDaoImpl;
import Interfaces.IProducto;
import Model.Productos;
import java.util.List;

/**
 *
 * @author josea
 */
public class TestProductos {
    
    public static IProducto dao = new ProductoDaoImpl();
    
    public static void main(String[] args) {
        TestProductos t = new TestProductos();
        //t.listar();
        t.insertar();
        
    }
    
    public static void listar() {
        List<Productos> lista = dao.lista();
        
        if (lista != null & !lista.isEmpty()) {
            System.out.println("ID\tNombre\t\tPrecio\tStock");
            for (Productos p : lista) {
                System.out.println(p.getId_producto()
                        + "\t" + p.getNombre() + "\t$"
                        + p.getPrecio() + "\t" + p.getStock());
            }
        } else {
            System.out.println("No hay productos");
        }
    }
    
    public static void insertar() {
        Productos p = new Productos();
        p.setNombre("Leche en polvo");
        p.setDescripcion("Lacteos");
        p.setPrecio(5.00);
        p.setStock(40);
        
        boolean result = dao.insert(p);
        if (result) {
            System.out.println(" Registro Satisfactorio");
        } else {
            System.out.println(" ERROR No sé logró registrar");
            
        }
        
    }
    
}
