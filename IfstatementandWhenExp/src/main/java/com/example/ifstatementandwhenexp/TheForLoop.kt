package com.example.ifstatementandwhenexp

fun main()
{
    for(i in 1..1000)
    {
        if(i%3 ==0)
            println("$i is multiple of 3 ")
        else
            println("---")
    }
}