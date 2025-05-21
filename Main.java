package com.techlab;

import com.techlab.productos.Producto;
import com.techlab.pedidos.Pedido;
import com.techlab.servicios.ProductoService;
import com.techlab.servicios.PedidoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductoService productoService = new ProductoService();
        PedidoService pedidoService = new PedidoService(productoService);

        int opcion;
        do {
            System.out.println("================================");
            System.out.println("=== SISTEMA DE GESTIÓN - TECHLAB ===");
            System.out.println("1) Agregar producto");
            System.out.println("2) Listar productos");
            System.out.println("3) Buscar/Actualizar producto");
            System.out.println("4) Eliminar producto");
            System.out.println("5) Crear un pedido");
            System.out.println("6) Listar pedidos");
            System.out.println("7) Salir");
            System.out.print("Elija una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> productoService.agregarProducto(scanner);
                case 2 -> productoService.listarProductos();
                case 3 -> productoService.buscarActualizarProducto(scanner);
                case 4 -> productoService.eliminarProducto(scanner);
                case 5 -> pedidoService.crearPedido(scanner);
                case 6 -> pedidoService.listarPedidos();
                case 7 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}