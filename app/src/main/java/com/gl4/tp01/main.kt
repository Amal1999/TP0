package com.gl4.tp01

import kotlin.math.abs

fun main(argv : Array<String> ){
    print("Hello")
    var rectangles : Array<Rectangle> = arrayOf(
        Rectangle(q = Point(5,5)),
        Rectangle(p=Point(10,2)),
        Rectangle()
    )

    for (i in 0..(rectangles.size-1))
    {
        print(" \n "+rectangles[i].surface().toString())
    }
}
class Point(var x:Int, var y:Int){
    fun distance(p2 : Point) : Int {
        return abs(p2.x-x) + abs(p2.y-y)
    }
}

class Rectangle( val p:Point = Point(0,0), var q:Point = Point(1,1)){
    override fun toString(): String {
        return "p=$p q=$q"
    }
    fun surface() : Int {
        return abs(( p.x - q.x ) * (p.y - q.y))
    }

}