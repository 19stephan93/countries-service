package com.stefanstan.countries.service.api.algorithm

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GenericShortestPathTest {

    @Test
    fun `should find shortest path`() {
        val graph = listOf(
            Edge("a", "b", 4),
            Edge("a", "c", 2),
            Edge("b", "c", 3),
            Edge("c", "b", 1),
            Edge("c", "d", 5),
            Edge("b", "d", 1),
            Edge("a", "e", 1),
            Edge("e", "d", 4)
        )
        val result = findShortestPath(graph, "a", "d")

        Assertions.assertEquals(listOf("a", "c", "b", "d"), result.shortestPath())
        Assertions.assertEquals(4, result.shortestDistance())
    }

    @Test
    fun `should behave when shortest path is not reachable`() {
        val graph = listOf(
            Edge("a", "b", 4),
            Edge("a", "c", 2),
            Edge("b", "c", 3),
            Edge("c", "b", 1),
            Edge("c", "d", 5),
            Edge("b", "d", 1),
            Edge("e", "d", 4)
        )
        val result = findShortestPath(graph, "a", "e")

        Assertions.assertEquals(emptyList<String>(), result.shortestPath())
        Assertions.assertEquals(null, result.shortestDistance())
    }

    @Test
    fun `should behave when to-node doesnt event exist`() {
        val graph = listOf(
            Edge("a", "b", 4),
            Edge("a", "c", 2),
            Edge("b", "c", 3),
            Edge("c", "b", 1),
            Edge("c", "d", 5),
            Edge("b", "d", 1),
            Edge("a", "e", 1),
            Edge("e", "d", 4)
        )
        val result = findShortestPath(graph, "a", "f")

        Assertions.assertEquals(emptyList<String>(), result.shortestPath())
        Assertions.assertEquals(null, result.shortestDistance())
    }

    @Test
    fun `should behave when the world is empty`() {
        val graph = emptyList<Edge<String>>()
        val result = findShortestPath(graph, "a", "f")

        Assertions.assertEquals(emptyList<String>(), result.shortestPath())
        Assertions.assertEquals(null, result.shortestDistance())
    }
}
