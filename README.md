# Concesionario-de-coches
Examen de programación marzo-2015. Concesionario de coches
Restricciones

    Evitar el uso de iteradores
    Respetar la arquitectura en tres capas en la medida de lo posible


Coches del concesionario

Queremos modelar un concesionario de coches en Java. Nos limitaremos a las  siguientes opciones:

    Alta de un coche (se pedirá matricula, color y modelo),
    Baja de  un coche (por matrícula),
    Mostrar un coche (por matrícula),
    Mostrar concesionario (todos los coches del concesionario)
    Contar el número de coches en el concesionario
    Mostrar coches de un color



Lógicamente, no podrá añadirse un coche inválido o ya contenido (No pueden existir dos coches con la misma matrícula en el concesionario)
Por cada coche que se dé de alta, han de conocerse todas sus características. Ninguna de las características del coche puede ser  por defecto.

Coches del concesionario
Un coche tendrá las siguientes características:

    Color. Se limitarán los colores a tres: plata, rojo y azul. Para solicitar el color al dar de alta al coche se implementará un método pedirColor que mediante la gestión de un menú, devolverá el color indicado
    Modelo. Se limitarán los modelos de coches a siete: Córdoba (marca Seat),Toledo (marca Seat),Ibiza (marca Seat), Serie 1 (marca BMW), Serie 2 (marca BMW),Serie 3 (marca BMW) y Serie 5 (marca BMW). Para solicitar el modelo al dar de alta al coche podrá implementarse un método pedirModelo que mediante la gestión de un menú, devolverá el modelo indicado.
    Matrícula (única por coche) El formato de las matrículas será el nuevo: combinación de cuatro números (de 0000 a 9999) y tres letras, comenzando por BBB y terminando por ZZZ, excluyendo vocales, la LL, la Ñ y la Q. 
        Matrículas válidas: 0000-BBB, 0000 BBB, 0000BBB, 1234ZZZ.
        Matrículas inválidas: 000_BBB, 9999-BBQ, 0000-BÑB, 0000-DEF, 0000 bbb, 0000 AAA 
