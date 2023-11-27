package com.bcit.lecture10

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/**
 * Jayden Baek
 *
 * 1.) 87451155
 * 2.) 87451155
 * 3.) 87451155
 */

fun main(){

    myCoroutine()
}

fun myCoroutine(){

    val scope = CoroutineScope(context = Dispatchers.Main)

    scope.launch {
        val deferred = async {

        }
    }


//    runBlocking {
//
//        val deferredJob = async {
//            myDelay()
//            " is "
//        }
//
//        print("The sponge")
//        print(deferredJob.await())
//        println("back")
//    }
}

suspend fun myDelay(){
    delay(1000L)
}