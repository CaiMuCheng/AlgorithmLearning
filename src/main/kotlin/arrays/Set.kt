package arrays

import kotlin.math.max

object SetSolution {

    // 反转字符串的算法
    fun reverseString(s: CharArray) {
        var leftPointer = 0
        var rightPointer = s.size - 1

        while (true) {
            if (leftPointer == rightPointer || leftPointer > rightPointer) {
                return
            }

            val temp = s[leftPointer]
            s[leftPointer] = s[rightPointer]
            s[rightPointer] = temp
            ++leftPointer
            --rightPointer
        }

    }

    fun reverse(x: Int): Int {
        // TODO 待完成
        return 0
    }

    // 替换空格为 %20
    fun replaceSpace(s: String): String {
        val builder = StringBuilder(s.length * 2)
        for (char in s) {
            if (char == ' ') {
                builder.append("%20")
            } else {
                builder.append(char)
            }
        }
        return builder.toString()
    }

    fun strToInt(str: String): Int {
        val text = str.trim()
        var pointer = 0
        if (text.isEmpty()) return 0
        val buffer = StringBuilder()
        var char = text[pointer]
        val maxValue = Int.MAX_VALUE.toBigInteger()
        val minValue = Int.MIN_VALUE.toBigInteger()

        if (char == '-') {
            ++pointer
            char = text.getOrNull(pointer) ?: '\u0000'
            while (char in '0'..'9' && pointer < text.length) {
                buffer.append(char)
                ++pointer
                char = text.getOrNull(pointer) ?: '\u0000'
            }
            if (buffer.isEmpty()) return 0
            val value = -buffer.toString().toBigInteger()
            return if (value < minValue) {
                minValue.toInt()
            } else {
                value.toInt()
            }
        }

        if (char == '+') {
            ++pointer
            char = text.getOrNull(pointer) ?: '\u0000'
            while (char in '0'..'9' && pointer < text.length) {
                buffer.append(char)
                ++pointer
                char = text.getOrNull(pointer) ?: '\u0000'
            }
            if (buffer.isEmpty()) return 0
            val value = buffer.toString().toBigInteger()
            return if (value > maxValue) {
                maxValue.toInt()
            } else {
                value.toInt()
            }
        }

        while (char in '0'..'9' && pointer < text.length) {
            buffer.append(char)
            ++pointer
            char = text.getOrNull(pointer) ?: '\u0000'
        }
        if (buffer.isEmpty()) return 0
        val value = buffer.toString().toBigInteger()
        return if (value > maxValue) {
            maxValue.toInt()
        } else {
            value.toInt()
        }
    }

}