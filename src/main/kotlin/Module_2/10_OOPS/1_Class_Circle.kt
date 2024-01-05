/*
Construct a class Circle that represents a Circle.

The class should support the following functionalities:-

perimeter() -> returns the perimeter of the circle
area() -> returns the area of the circle

Note: Assume Π (pi) = 3.14 for calculations.
 */

class Circle(var r: Int) {
    val pi: Float = 3.14F

    fun perimeter(): Float {
        return 2 * pi * r
    }

    fun area(): Float {
        return pi * r * r
    }
}

fun main() {
    var circle = Circle(3)
    var perimeter = circle.perimeter()
    var area = circle.area()
}