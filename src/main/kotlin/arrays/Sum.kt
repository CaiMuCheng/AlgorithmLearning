package arrays

// 两数之和
object SumSolution {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        // 存储 j 为当前值，然后向后遍历数组
        var array: IntArray? = null
        var doBreak = false
        nums.forEachIndexed { index, value ->
            // 在此继续遍历数组
            var idx = index + 1
            if (doBreak) return@forEachIndexed
            while (idx < nums.size) {
                val result = nums[idx]
                if (result + value == target) {
                    array = intArrayOf(index, idx)
                    doBreak = true
                    break
                }
                idx++
            }
        }

        return array!!
    }

    // 将数组看作数值加 1 并返回结果
    fun plusOne(digits: IntArray): IntArray {
        val len = digits.size
        var pointer = digits.size - 1

        while (pointer >= 0) {
            val value = digits[pointer]
            if (value != 9) {
                digits[pointer] += 1
                return digits
            }
            digits[pointer] = 0
            --pointer
        }


        val result = IntArray(len + 1)
        result[0] = 1
        return result
    }

}