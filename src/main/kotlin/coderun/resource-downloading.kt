class ResourceDownloading {

    fun main() {

        val scopes = mutableListOf<MutableSet<String>>()

        val n = readln().toInt()

        repeat(n) {
            var added = false

            val (first, second) = readln().split(" ")

            if (scopes.isEmpty()) {
                added = scopes.add(mutableSetOf(first, second))
            } else {
                scopes.forEach { scope ->
                    added = if (scope.contains(first)) {
                        scope.add(second)
                    } else if (scope.contains(second)) {
                        scope.add(first)
                    } else {
                        false
                    }
                }
            }

            if (!added) {
                scopes.add(mutableSetOf(first, second))
            }
        }

        val requestCount = readln().toInt()

        repeat(requestCount) {
            val toWarehouse = readln().split(" ").first()
            var fromWarehouses = readln().split(" ")

            var toWarehouseScope = setOf<String>()

            scopes.forEach { scope ->
                if (scope.contains(toWarehouse)) {
                    toWarehouseScope = scope
                }
            }

            fromWarehouses = fromWarehouses.filter { toWarehouseScope.contains(it) }

            println("${fromWarehouses.size} ${fromWarehouses.joinToString(" ")}")
        }
    }
}