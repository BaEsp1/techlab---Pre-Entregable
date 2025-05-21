# Sistema de Gestión de Productos y Pedidos en Java - TechLab

## Descripción

Este proyecto consiste en una aplicación en Java diseñada para registrar, mostrar y gestionar productos, así como crear y administrar pedidos que involucren varios productos. El sistema hace uso de conceptos fundamentales de programación orientada a objetos (POO), colecciones, excepciones y una estructura organizada en paquetes.

---

## Objetivo General

Diseñar una aplicación que permita:

- Registrar productos con nombre, precio y cantidad en stock.
- Visualizar la lista de productos disponibles.
- Buscar, actualizar y eliminar productos.
- Crear pedidos que involucren varios productos, con control de stock y cálculo de costos.
- Gestionar pedidos registrados.
- Interactuar mediante un menú principal que permita seleccionar las distintas operaciones.

---

## Requerimientos Funcionales

### Gestión de Productos

- **Ingreso de productos:**  
  Permite agregar productos con nombre, precio y cantidad en stock. Los productos se almacenan en una colección (`ArrayList<Producto>`).

- **Visualización:**  
  Lista todos los productos con su ID (auto-generado o índice), nombre, precio y stock.

- **Búsqueda y actualización:**  
  Buscar productos por nombre o ID. Mostrar detalles completos y actualizar precio o stock con validaciones.

- **Eliminación:**  
  Permite eliminar productos por ID o posición, con opción de confirmación.

### Gestión de Pedidos

- **Creación de pedidos:**  
  Crear pedidos que incluyen múltiples productos y cantidades. Validar stock suficiente antes de confirmar.

- **Cálculo y actualización:**  
  Calcular el costo total del pedido y actualizar el stock en consecuencia.

- **Visualización:**  
  Mostrar lista de pedidos con productos y costos totales.

### Menú Interactivo

- Opciones para agregar, listar, buscar/actualizar, eliminar productos, crear y listar pedidos, y salir.
- El menú se repite hasta que el usuario decida salir.

---

## Tecnologías y Conceptos Utilizados

- **Lenguaje:** Java  
- **Paradigma:** Programación Orientada a Objetos (POO)  
  - Clases, objetos, encapsulamiento  
  - Herencia y polimorfismo  
- **Colecciones:** Listas (`ArrayList`)  
- **Manejo de excepciones:** Excepciones personalizadas para control de errores (ej. stock insuficiente)  
- **Organización:** Código estructurado en paquetes/módulos para facilitar mantenimiento

