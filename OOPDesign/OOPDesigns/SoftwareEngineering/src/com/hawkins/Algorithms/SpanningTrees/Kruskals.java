package com.hawkins.Algorithms.SpanningTrees;

import java.util.*;

/*
we first do a mst to find the mst min weight sum MIN;
for finding critical edge, we remove one edge and to see if the rest can still have the min mst weight sum == MIN.
If sum is bigger, means the edge we remove is the critical edge.
if 2 is false then for finding non-critical edge, we try every edge as a pre degined edge as part of final mst result,
and then we start building mst, same here if the final result of total weight of mst is same as MIN,
means it part of some other MST result we can add to non-critical edge result.
 */
public class Kruskals {

    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        List<Integer> critical = new ArrayList<>(), nonCritical = new ArrayList<>();
        Map<int[], Integer> map = new HashMap<>();
        for (int i = 0; i < edges.length; i++) map.put(edges[i], i);
        Arrays.sort(edges, (a, b) -> (a[2] - b[2]));
        int minCost = findMSTCost(n, edges, -1, -1);
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            int index = map.get(edge);
            if (findMSTCost(n, edges, -1, i) > minCost) critical.add(index);          //cost remove current edge
            else if (findMSTCost(n, edges, i, -1) == minCost) nonCritical.add(index); //cost preDefine current edge as result
        }
        return List.of(critical, nonCritical);
    }

    private int findMSTCost(int n, int[][] edges, int pick, int skip) {
        DSU dsu = new DSU(n);
        int cost = 0;
        if (pick != -1) {
            dsu.union(edges[pick][0], edges[pick][1]);
            cost += edges[pick][2];
        }
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            if (i == skip) continue;
            if (dsu.find(edge[0]) != dsu.find(edge[1])) {
                dsu.union(edge[0], edge[1]);
                cost += edge[2];
            }
        }
        return dsu.count == n - 1 ? cost : Integer.MAX_VALUE;
    }
}

class DSU {
    int[] parent;
    int count;
    public DSU(int N) {
        count = 0;
        parent = new int[N];
        for (int i = 0; i < N; i++) parent[i] = i;
    }
    public int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }
    public void union(int x, int y) {
        count++;
        parent[find(x)] = find(y);
    }
}

