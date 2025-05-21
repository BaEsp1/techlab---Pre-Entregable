package com.techlab.servicios;

import com.techlab.excepciones.StockInsuficienteException;
import com.techlab.pedidos.LineaPedido;
import com.techlab.pedidos.Pedido;
import com.techlab.productos.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedidoService {
    private List<Pedido> pedidos = new ArrayList<>();
    private ProductoService productoService;

    public PedidoService(ProductoService productoService) {
        this.productoService = productoService;
    }

    public void crearPedido(Scanner scanner) {
        Pedido pedido = new Pedido();
        System.out.print("Cantidad de productos en el pedido: ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.print("ID del producto: ");
            int id = Integer.parseInt(scanner.nextLine());
            Producto p = productoService.buscarPorId(id);
            if (p == null) {
                System.out.println("Producto no encontrado.");
                i--;
                continue;
            }
            System.out.print("Cantidad: ");
            int cantidadPedida = Integer.parseInt(scanner.nextLine());
            try {
                if (cantidadPedida > p.getStock()) {
                    throw new StockInsuficienteException("Stock insuficiente para " + p.getNombre());
                }
                p.setStock(p.getStock() - cantidadPedida);
                pedido.agregarLinea(new LineaPedido(p, cantidadPedida));
            } catch (StockInsuficienteException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        pedidos.add(pedido);
        System.out.println("Pedido creado:");
        System.out.println(pedido);
    }

    public void listarPedidos() {
        pedidos.forEach(System.out::println);
    }
}