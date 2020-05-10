package kotlinx.coroutines

import org.junit.Test
import java.io.IOException


class Playground {
    @Test
    fun play(): Unit = runBlocking {
        launch {
            launch {
                try {
                    delay(10000000000000000L)
                } catch (e: Exception) {
                    println(e)
                }
            }
            launch {
                delay(1000)
                throw IOException()
            }
        }
        Unit
    }

}


