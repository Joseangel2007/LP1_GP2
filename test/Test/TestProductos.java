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
        //t.insertar();      
        //t.listar();
        //t.search();
        //t.update();
        //t.updateStock();
        //t.delete();

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
        p.setNombre("Ternera");
        p.setDescripcion("Carnes");
        p.setPrecio(25.00);
        p.setStock(20);

        boolean result = dao.insert(p);
        if (result) {
            System.out.println(" Producto registrado satisfactoriamente");
        } else {
            System.out.println(" |ERROR| No se pudo registrar el producto");

        }

    }

    public static void update() {
        Productos p = new Productos();
        p.setNombre("Arroz Añejo");
        p.setDescripcion("Mas agradable");
        p.setPrecio(25.00);
        p.setStock(20);
        p.setImagen("/resource/img/arroz.jpg");
        p.setId_producto(1);
        boolean result = dao.update(p);
        if (result) {
            System.out.println(" Producto actualizado satisfactoriamente");
        } else {
            System.out.println(" Error No se pudo actualizar el producto");

        }
    }

    public static void search() {
        Productos pr = dao.SearchById(3);

        if (pr != null) {
            System.out.println("Producto encontrado");
            System.out.println("ID " + pr.getId_producto());
            System.out.println("Nombre: " + pr.getNombre());
            System.out.println("Descripcion: " + pr.getDescripcion());
            System.out.println("Precio: " + pr.getPrecio());
            System.out.println("Stock: " + pr.getStock());
            System.out.println("Ruta img" + pr.getImagen());
        } else {
            System.out.println("No hay registros");
        }
    }

    public static void delete() {
        boolean result = dao.delete(4);

        if (result) {
            System.out.println("Eliminado");
        } else {
            System.out.println("No se pudo eliminar");
        }
    }

    public static void updateStock() {
        boolean result = dao.updateStock(4, 200);

        if (result) {
            System.out.println("Stock actualizado");
        } else {
            System.out.println("No se pudo actualizar el stock");
        }
    }
}
