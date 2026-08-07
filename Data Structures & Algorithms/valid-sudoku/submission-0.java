class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                char value = board[row][column];

                if (value == '.') {
                    continue;
                }

                int number = value - '1';

                int boxIndex = (row / 3) * 3 + (column / 3);

                if (rows[row][number]
                        || columns[column][number]
                        || boxes[boxIndex][number]) {
                    return false;
                }

                rows[row][number] = true;
                columns[column][number] = true;
                boxes[boxIndex][number] = true;
            }
        }

        return true;
    }
}
