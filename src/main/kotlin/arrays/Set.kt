package arrays

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

}