package validparentheses

import java.util.Stack

class IsValidParentheses {

    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        var res = true
        if (s.length % 2 != 0) return false
        s.forEach {
            if (it.isRight()) {
                if (stack.isEmpty() || !stack.pop().isRversedEqual(it)) {
                    res = false
                }
            } else {
                stack.push(it)
            }
        }
        if (stack.isNotEmpty()) {
            return false
        }
        return res
    }

    fun Char.isRight(): Boolean {
        return (this == ')' || this == '}' || this == ']')
    }


    private fun Char.isRversedEqual(it: Char): Boolean {
        val rev = when (this) {
            '(' -> ')'
            '{' -> '}'
            '[' -> ']'
            else -> 'C'
        }
        return rev == it
    }

}

