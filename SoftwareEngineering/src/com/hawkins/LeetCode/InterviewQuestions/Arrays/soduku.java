package com.hawkins.LeetCode.InterviewQuestions.Arrays;

import java.util.HashSet;

public class soduku {

    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                 char current = board[i][j];
                if (current != '.') {
                    int box_index = (i / 3) * 3 + j / 3;  // learn how!
                    if ((!rows[i].add(current))
                            ||
                            (!cols[j].add(current))
                            ||
                            (!boxes[box_index].add(current))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
