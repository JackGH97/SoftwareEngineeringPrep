package com.hawkins.Algorithms.SpanningTrees;

import java.util.*;

/*
Dijkstra’s algorithm is very similar to Prim’s algorithm for minimum spanning tree. Like Prim’s MST,
we generate a SPT (shortest path tree) with given source as root. We maintain two sets, one set
contains vertices included in shortest path tree, other set includes vertices not yet included in
shortest path tree. At every step of the algorithm, we find a vertex which is in the other set (set of
not yet included) and has a minimum distance from the source.
 */
public class Dijkstra {

    private final List<List<int[]>> graph = new ArrayList<>();

    private void init(int n, int[][] flights) {
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        for (int[] flight : flights)
            graph.get(flight[0]).add(new int[]{flight[1], flight[2]});
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        init(n, flights);
        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        queue.offer(new int[]{src, 0, 0});
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int city = current[0], distance = current[1], cost = current[2];
            if (city == dst)
                return cost;
            if (distance <= K) {
                for (int[] child : graph.get(city)) {
                    queue.offer(new int[]{child[0], distance + 1, cost + child[1]});
                }
            }
        }
        return -1;
    }
}
