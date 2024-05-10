# Interface utilizando Layouts
Este proyecto se muestra una interfaz gráfica donde se presenta unas imágenes junto a sus respectivas etiquetas. 

# imagén del proyecto
![image](https://github.com/vnssmb/programacion3-1/assets/142614155/d40256f9-8fbf-4723-924e-208d6ad6955e)

# ImageView
En este caso, se utilizaron seis "ImagenView" para mostrar al personajes. Se posicionan a lo largo del lado izquierdo del panel, cada una con un tamaño ajustado para encajar correctamente:
**Richard Webber**: 
Imagen ubicada: layoutX: 58.0, layoutY: 76.0
Tamaño ajustado: fitHeight: 44.0, fitWidth: 60.0
**Lexie Grey**: 
Imagen ubicada: layoutX: 58.0, layoutY: 131.0
Tamaño ajustado: fitHeight: 44.0, fitWidth: 60.0
**Arizona Robbins**: 
Imagen ubicada: layoutX: 58.0, layoutY: 188.0
Tamaño ajustado: fitHeight: 44.0, fitWidth: 60.0
**Calliope Torresr**: 
Imagen ubicada: layoutX: 58.0, layoutY: 247.0
Tamaño ajustado: fitHeight: 44.0, fitWidth: 60.0
**Meredith Grey**: 
Imagen ubicada: layoutX: 37.0, layoutY: 247.0
Tamaño ajustado: fitHeight: 44.0, fitWidth: 60.0
**Alex Karev**: 
Imagen ubicada: layoutX: 58.0, layoutY: 307.0
Tamaño ajustado: fitHeight: 44.0, fitWidth: 60.0

# Label
Se agregaron etiquetas para identificar cada personaje correspondientes a las imagénes. En total fueron seis etiquetas que se utilizaron para este proyecto.

# AnchorPane
Los elementos está dispuestos en un "AnchorPane" con un tamaño predefinido (556 de ancho y 397 de alto), lo cuál, permite posicionar cada componente con coordenadas absolutas.

# ListView
En este campo se agrego para contener información adicional de los personajes. Obtuvo un color negro haciendolo más llamativo.

# TextField
Los usuarios pueden utilizar este campo para ingresar información adicional o comentarios. Obtuvo un fondo de color azul, destacandose del resto.

# Importación y Controlador
Se importa varios componentes de JavaFX, como lo son:
**ImagenView**
**Label**
**ListView**
**TextField**

El atributo "fx:controller" está configurado para usarlo en un controlador personalizado llamado "MuestraController". El mismo que maneja la lógica del proyecto.
