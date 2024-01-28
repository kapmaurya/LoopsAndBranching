package com.example.ifstatementandwhenexp

fun main()
{
   val amount =1000
//    if(amount>=1000)
//    { print("True")  }
//    else{ print("False") }

when(amount){
    100->print("You have 100")
    125->print("True")
    999->print("Really Close")
    else->{
        print("$amount is False")
    }

}


}