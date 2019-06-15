package cdaddr.advent2018

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Day05Test {
    val sampleInput = "dabAcCaCBAcCcaDA"
    val actualInput = Resources.resourceAsString("day05.txt")

    @Test
    fun `day05 part1 sample`() {
        val day = Day05(sampleInput)
        assertThat(day.solvePart1()).isEqualTo(10)
    }

    @Test
    fun `day05 part1 actual`() {
        val day = Day05(actualInput)
        assertThat(day.solvePart1()).isEqualTo(9704)
    }

//    @Test
//    fun `day01 part2 sample`() {
//        val day = Day01(sampleInput)
//        assertThat(day.solvePart2()).isEqualTo(4)
//    }
//
//    @Test
//    fun `day02 part2 actual`() {
//        val day = Day01(actualInput)
//        assertThat(day.solvePart2()).isEqualTo(6942)
//    }
//
}
