package com.hawkins.AlgoExpert.Medium;

import java.util.ArrayList;
import java.util.List;

public class RiverSizes {

    public static int count = 0;

    public static List<Integer> riverSizes(int[][] grid) {
        ArrayList<Integer> counts = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j);
                    counts.add(count);
                    count = 0; //must reset every time once we store it in sum so we can find max area
                }
            }
        }
        return counts;
    }

    private static void dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return;
        }
        count++;
        grid[i][j] = 0;
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
        return;
    }
}
