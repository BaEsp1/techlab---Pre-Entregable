package com.techlab.servicios;

import com.techlab.productos.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductoService {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.print("Stock: ");
        int stock = Integer.parseInt(scanner.nextLine());

        productos.add(new Producto(nombre, precio, stock));
        System.out.println("Producto agregado.");
    }

    public void listarProductos() {
        productos.forEach(System.out::println);
    }

    public Producto buscarPorId(int id) {
        return productos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void buscarActualizarProducto(Scanner scanner) {
        System.out.print("Ingrese ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        Producto p = buscarPorId(id);
        if (p != null) {
            System.out.println(p);
            System.out.print("Nuevo precio (actual $" + p.getPrecio() + "): ");
            p.setPrecio(Double.parseDouble(scanner.nextLine()));
            System.out.print("Nuevo stock (actual " + p.getStock() + "): ");
            p.setStock(Integer.parseInt(scanner.nextLine()));
            System.out.println("Producto actualizado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProducto(Scanner scanner) {
        System.out.print("ID a eliminar: ");
        int id = Integer.parseInt(scanner.nextLine());
        Producto p = buscarPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }
}