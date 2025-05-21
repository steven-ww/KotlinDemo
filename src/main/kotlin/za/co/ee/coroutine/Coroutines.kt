package za.co.ee.coroutine

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    // Create a scope with the Default dispatcher (good for CPU-bound work)
    val scope = CoroutineScope(Dispatchers.Default)

    // Launch a coroutine on the default dispatcher
    scope.launch {
        println("Running in coroutine on thread: ${Thread.currentThread().name}")

        // Call our suspending function
        println("Before calling doSomething()")
        doSomething() // This will suspend the coroutine
        println("After doSomething() completed")

        delay(1000)
        println("Done!")
    }

    println("Main thread continues immediately without waiting for the coroutine")

    // Keep the main thread alive long enough for coroutine to complete
    Thread.sleep(3000) // Increased to give enough time for all operations
}

// This is a suspending function, so it can be paused and resumed at a later time.
// To make a function actually suspendable, it needs to call another suspending function
// or use a suspending primitive like delay(), yield(), etc.
suspend fun doSomething() {
    println("Starting doSomething() on thread: ${Thread.currentThread().name}")
    // The delay function is a suspending function that suspends the coroutine for a specified time
    delay(500) // This is what makes this function actually suspend
    println("Resuming doSomething() after suspension on thread: ${Thread.currentThread().name}")

    // Other examples of suspending functions/operations:
    // yield() - yields the thread to other coroutines if needed

}
