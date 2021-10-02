# Especificacion de Requisitos de Software

## Enunciado del problema

Una empresa necesita un sistema que se encargue de gestionar clientes y los pedidos que estos pueden hacer. Actualmente no se cuenta con una base de datos de clientes ni de pedidos, y se busca digitalizar los datos de estos asi tambien como de los insumos utilizados en la fabricacion de productos y los empleados que utilizan los mismos ademas de los proveedores que traen los insumos.

## Clientes potenciales

El cliente se trata de la Heladeria "Willy" que no cuenta con un sistema de gestion de informacion ni pedidos. Esta se beneficiaria tanto a nivel de datos como de contabilidad.

## Solucion propuesta

La solucion propuesta se trata de un sistema de gestion de pedidos al cual se podra acceder mediante la web. El mismo contara con una base de datos donde se plasmen todos los usuarios que interactuan con el sistema, desde clientes hasta empleados y proveedores.

**Requisitos Funcionales**

El sistema debera permitir el registro de dos tipos diferentes de empleados, jornaleros de la fabrica y repartidores de pedidos.

El sistema debera permitir que los los clientes se registren en el sistema.

El sistema debera permitir que los clientes puedan realizar pedidos a la heladeria.

Cada pedido debera tener un numero de identificacion unico.

El sistema debera permitir asignar un pedido a un repartidor para que este lo entregue.

El sistema debe permitir que el repartidor notifique que el pedido fue completado

El sistema debera permitir que se registren los pagos de los pedidos.

El sistema debera permitir llevar un control de stock de los insumos necesarios.


**Requisitos no Funcionales**

El sistema podria poseer una pantalla de estadisticas que indique la consumicion de los diferentes productos.

El sistema podria poseer la capacidad de alertar cuando hay bajo stock de un insumo al administrador del sistema.

El sistema podria poseer la capacidad de alertar cuando hay bajo stock de un producto a un cliente.

## Arquitectura de software

Esta solucion se tratara de una aplicacion web. Y se ajustara a la arquitectura de software cliente-servidor.