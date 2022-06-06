package arrays

object FindSolution {

    fun containsDuplicate(nums: IntArray): Boolean {
        val hashSet: MutableSet<Int> = HashSet()
        for (element in nums) {
            if (!hashSet.add(element)) {
                return true
            }
        }
        hashSet.clear()
        return false
    }

    fun singleNumber(nums: IntArray): Int {
        var reduce = 0
        for(num in nums) {
            reduce = reduce xor num
        }
        return reduce
    }

}