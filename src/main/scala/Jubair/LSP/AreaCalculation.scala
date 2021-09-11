package Jubair.LSP

object AreaCalculation extends App {

    val rectangleArea = (length: Int, width: Int) => length * width
    println(rectangleArea(20, 20))

    val squareArea = (length: Int) => length * length
    println(squareArea(15))

    val rectangle = Rectangle(20, 20)
    println(rectangle.calculateArea(rectangle))

}
