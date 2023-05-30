# PROG-UD5-EnemySimulator
Este proyecto surge debido a que una empresa de videojuegos quiere realizar una simulación de un
género antiguo de juegos en el que el usuario interactuaba con la consola para cumplir un
objetivo. En nuestro caso, se pretende simular la interacción del usuario con algunos
mobs aleatorios del juego de Minecraft.

El principio de segregación de interfaces refiere a la idea de mantener interfaces y componentes de un sistema separados y con una interacción mínima entre ellos.
Este proyecto lo cumple ya que hemos dividido las interfaces para clases concretas, de forma que solo
se utilizan los métodos necesarios en cada clase en vez de tener una interfaz más generalista y tengamos que implementar toda la interfaz en las clases con métodos que son innecesarios para su clase.