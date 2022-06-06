@file:Suppress("DEPRECATED_IDENTITY_EQUALS", "unused")

package main

import arrays.DeleteSolution
import arrays.FindSolution
import arrays.SetSolution
import arrays.SumSolution
import kotlin.math.exp

fun main() {
    strToIntTest()
}

// 测试两数之和
private fun twoSum() {
    val nums = intArrayOf(1, 2, -1, 3, 5)
    val expectTarget = 2
    val result = SumSolution.twoSum(nums, expectTarget)
    val target = result.sum()
    assert(expectTarget == target)
    println("Successfully!")
}

// 测试删除重复数组元素
private fun removeDuplicatesTest() {
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val expectedNums = intArrayOf(0, 1, 2, 3, 4)
    val k = DeleteSolution.removeDuplicates(nums)
    assert(k == expectedNums.size)
    for (i in 0 until k) {
        assert(nums[i] === expectedNums[i])
    }
    println("Successfully!")
}

// 测试数组是否存在相同值
private fun containsDuplicateTest() {
    val containsDuplicateNums = intArrayOf(0, 1, 3, 4, 5, 0)
    val noContainsDuplicateNums = intArrayOf(2, 4, 5, 1, 3)
    var k = FindSolution.containsDuplicate(containsDuplicateNums)
    assert(k)
    k = FindSolution.containsDuplicate(noContainsDuplicateNums)
    assert(!k)
    println("Successfully!")
}

// 查找只出现一次的值
private fun singleNumberTest() {
    val nums = intArrayOf(4, 4, 0, 3, 0)
    val expect = 3
    val k = FindSolution.singleNumber(nums)
    assert(expect == k)
    println("Successfully!")
}

private fun plusOneTest() {
    val nums = intArrayOf(1, 2, 3, 9)
    val expect = intArrayOf(1, 2, 4, 0)
    val k = SumSolution.plusOne(nums)
    assert(k.contentEquals(expect))
    println("Successfully!")
}

private fun reverseStringTest() {
    val s = charArrayOf('a', 'c', 'v', 'e', 'p')
    val expect = charArrayOf('p', 'e', 'v', 'c', 'a')
    SetSolution.reverseString(s)
    assert(s.contentEquals(expect))
    println("Successfully!")
}

private fun reverseDigitTest() {
    val num = 132
    val expectNum = 231
    assert(SetSolution.reverse(num) == expectNum)
    println("Successfully!")
}

private fun replaceSpaceTest() {
    val str = "We are happy."
    val expectStr = "We%20are%20happy."
    assert(SetSolution.replaceSpace(str) == expectStr)
    println("Successfully!")
}

private fun strToIntTest() {
    val str = "    311455 oabcd"
    val expectNum = 311455
    val k = SetSolution.strToInt(str)
    println(k)
    assert(k == expectNum)
    println("Successfully!")
}