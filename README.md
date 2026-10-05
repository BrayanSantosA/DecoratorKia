# Configurador de Kia Picanto con Patrón Decorator

Aplicación en Java que simula la compra de un Kia Picanto y la personalización con accesorios del catálogo oficial. Calcula el precio final y genera la descripción completa del vehículo, usando el patrón de diseño **Decorator**.

## Descripción general

El usuario elige un modelo base del Kia Picanto y le agrega los accesorios que quiera, en cualquier cantidad y orden. Cada accesorio suma su precio al total y añade su nombre a la descripción del vehículo. Al final se obtiene un solo objeto que representa el carro con todo lo que se le agregó.

## ¿Por qué el patrón Decorator?

Los accesorios se pueden combinar de muchas formas. Si cada combinación fuera una clase distinta (por ejemplo "Zenith AT con sensor y rines"), se necesitarían cientos de clases. El patrón Decorator evita esto: cada accesorio es una capa que envuelve al vehículo y le agrega su propio costo y descripción. Así se pueden crear combinaciones nuevas sin modificar el código existente, solo apilando accesorios.

## Cómo funciona

- **Vehículo base:** una clase abstracta define lo que tiene todo Kia Picanto, que es una descripción y un costo.
- **Modelos:** cada modelo (Vibrant MT, Zenith MT, Zenith AT y GT Line AT) hereda de esa clase base y define su propio nombre y precio.
- **Decorador abstracto:** los accesorios heredan de una clase común que obliga a cada uno a entregar su descripción. Esto permite tratarlos igual que a un vehículo.
- **Accesorios:** cada accesorio recibe un vehículo (o un vehículo ya decorado) y lo guarda. Al consultar su costo, suma su precio al del objeto que envuelve. Al consultar su descripción, agrega su nombre al texto del objeto envuelto.
- **Cálculo final:** como cada capa delega en la anterior, el resultado final es el precio del modelo base más el de todos los accesorios, y una descripción que los lista en el orden en que se agregaron.

## Modelos disponibles

| Modelo | Precio (COP) |
|---|---|
| Vibrant MT | 57.990.000 |
| Zenith MT | 64.990.000 |
| Zenith AT | 69.990.000 |
| GT Line AT | 72.990.000 |

## Accesorios disponibles

| Accesorio | Precio (COP) |
|---|---|
| Alarmas matrix | 205.000 |
| Porta bicicletas | 910.000 |
| Pernos de seguridad | 156.100 |
| Kit botón de encendido | 1.500.000 |
| Malla de carga | 110.000 |
| Sensor de parqueo | 150.000 |
| Rines de 13 pulgadas | 350.000 |
| Rin aluminio 14" negro mecanizado | 500.000 |
| Rin aluminio 14" gris mecanizado | 500.000 |
| Rin aluminio 14" gris mecanizado (básico) | 450.000 |
| Tiro de arrastre | 810.000 |
| Tapete de tres piezas | 92.000 |
| Kit de ampliaciones laterales | 1.500.000 |
| Cubre baúl | 250.000 |

## Programa principal

El programa principal crea cinco vehículos para demostrar el funcionamiento:

1. Un **Vibrant MT** con sensor de parqueo, tapete y rines de 13 pulgadas.
2. Un **Zenith MT** con rines negros de 14", cubre baúl, pernos de seguridad y malla de carga.
3. Un **Zenith AT** con kit de ampliaciones laterales, rines grises básicos, sensor de parqueo y alarmas.
4. Un **GT Line AT** con rines grises de 14", porta bicicletas, tiro de arrastre y kit botón de encendido.
5. Un **GT Line AT completo** con la mayoría de accesorios disponibles. Se excluyen los rines alternativos, ya que un vehículo solo lleva un juego de rines.

Para cada vehículo se imprime en consola la descripción con todos sus accesorios y el precio total en pesos colombianos, con punto como separador de miles.

## Requisitos

- Java JDK 8 o superior.
- Un IDE (VS Code, IntelliJ, Eclipse) o la terminal para compilar y ejecutar.

## Cómo ejecutar

1. Clonar el repositorio.
2. Compilar todas las clases del proyecto.
3. Ejecutar la clase `Main`.

## Referencias
- Los precios están basados en el catálogo de accesorios de Kia Colombia.
https://accesorios.kia.com.co/collections/picanto
https://kia.com.co/nuestros-vehiculos/picanto/especificaciones/vibrant-mt
