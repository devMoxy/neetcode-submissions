class Solution {
    public boolean isValidSudoku(char[][] board) { 
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];
        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
        }

        for(int i = 0; i < 9; i++){
            cols[i] = new HashSet<>();
        }

        for(int i = 0; i < 9; i++){
            boxes[i] = new HashSet<>();
        }

        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                int boxIndex = (row/3)*3 + (col/3);
                if(board[row][col] != '.'){
                    if(rows[row].contains(board[row][col])){
                        return false;
                    }
                    rows[row].add(board[row][col]);

                    if(cols[col].contains(board[row][col])){
                        return false;
                    }
                    cols[col].add(board[row][col]);
                    
                    if(boxes[boxIndex].contains(board[row][col])){
                        return false;
                    }
                    boxes[boxIndex].add(board[row][col]);
                }
            }
        }

        
        return true;
    }
}
