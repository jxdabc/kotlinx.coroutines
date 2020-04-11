package kotlinx.coroutines

public class Resource<T>(
    public val value: T,
    private val onCancellation: () -> Unit
) {
    public fun cancel(): Unit = onCancellation()
}
