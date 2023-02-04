package baseballGame

import java.util.Stack

class BaseBall {
    fun calPoints(operations: Array<String>): Int {

        val stack = Stack<Int>()

        operations.forEach { operation ->
            if (operation.toIntOrNull() is Int) {
                stack.add(operation.toInt())
            } else if (operation == "D") {
                if (stack.isNotEmpty()) {
                    val last = stack.pop()
                    stack.push(last)
                    stack.push(last * 2)
                }

            } else if (operation == "C") {
                if (stack.isNotEmpty()) {
                    stack.pop()
                }
            } else if (operation == "+") {
                if (stack.isNotEmpty()) {
                    val last = stack.pop()
                    val prev = stack.pop()
                    stack.push(prev)
                    stack.push(last)
                    stack.push((last + prev))
                }
            }
        }
        return stack.sum()
    }
}