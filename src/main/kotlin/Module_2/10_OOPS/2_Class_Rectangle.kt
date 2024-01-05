/*
Construct a class Rectangle that represents a rectangle.

The class should support the following functionalities:-

perimeter() -> returns the perimeter of the rectangle
area() -> returns the area of the rectangle
 */

class Rectangle(var length: Int, var breadth: Int) {

    fun perimeter(): Int {
        return 2 * length * breadth
    }

    fun area(): Int {
        return length * breadth
    }
}


fun main() {
    var rec = Rectangle(2, 3)
    var area = rec.area()
    var perimeter = rec.perimeter()
}