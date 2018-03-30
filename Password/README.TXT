------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: PASSWORD
PURPOSE OF PROJECT: REPASO 2º EVALUACION
VERSION or DATE: 1.0
HOW TO START THIS PROJECT:
AUTHORS: KYRIL KEAN

Haz una clase llamada Password que siga las siguientes condiciones:
  •	Que tenga los atributos longitud (int) y contraseña (String) . Por defecto, la longitud sera de 8.
  •	Los constructores serán los siguiente:
  •	Un constructor por defecto.  Password()
  •	Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud. Password(5)
  •	Un constructor a partir de una cadena pasada como parámetro, contraseña cogera el valor de al cadena y longitud su tamaño            Password(“Topsecret03”)
  •	Los métodos que implementa serán:
  •	esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe una longitud igual o mayor que 8, tener mayúsculas y      minúscula y algún dígito númerico.
  •	generarPassword():  genera la contraseña del objeto con la longitud que tenga, pero garantizando que sea fuerte ( usar random)
  •	Método get para contraseña y longitud.

Ahora, crea una clase clase PruebaContraseña que solo tiene un método main:
  •	Crea un array de Passwords con el tamaño que tu le indiques por teclado.
  •	Crea un bucle que cree un objeto Password para cada posición del array.
Se preguntará al usuario que tipo de contraseña se creará: automática y solo le  indicas el tamaño o si le defines el valor.
  •	Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
  •	Al final, muestra la contraseña y si es o no fuerte usando los datos de ambas tablas. Usa este simple formato:
      VALOR             FUERTE
      12345             false
      M23iesm20x        true
