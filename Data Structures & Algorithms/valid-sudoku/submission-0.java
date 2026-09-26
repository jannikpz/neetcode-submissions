class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int k=0; k<9;k++){
         HashSet<Character> set1 = new HashSet<>();
         for(int i=0; i<9;i++){
            if(set1.contains(board[k][i]) && board[k][i] != '.'){
                return false;
            }else{
                set1.add(board[k][i]);
            }
         }
         }
         for(int k=0; k<9;k++){
         HashSet<Character> set2 = new HashSet<>();
         for(int i=0; i<9;i++){
            if(set2.contains(board[i][k]) && board[i][k] != '.'){
                return false;
            }else{
                set2.add(board[i][k]);
            }
         }
         }
         Set<Character>[] boxes = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            boxes[i] = new HashSet<>();
        }
        for(int k=0; k<9; k++){
        for(int i=0; i<9;i++){
            int index = k/3 + (i/3)*3;
            if(boxes[index].contains(board[k][i]) && board[k][i] != '.'){
                return false;
            }else{
                boxes[index].add(board[k][i]);
            }
         }
         
    }
    return true;
    }
}

