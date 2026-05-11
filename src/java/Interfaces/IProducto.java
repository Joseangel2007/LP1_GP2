/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Model.Productos;
import java.util.List;

/**
 *
 * @author josea
 */
public interface IProducto {
    
    public List<Productos> lista();
    public boolean insert(Productos p);
    public boolean update(Productos p);
    public Productos SearchById(int id);
    public boolean delete(int id);
    public boolean updateStock(int id, int stock);
    
    
    
}
