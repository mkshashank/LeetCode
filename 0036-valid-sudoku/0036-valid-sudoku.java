class Solution {
    public boolean validateBox(char[][] board, int sr, int er, int sc, int ec)
    {
        Set<Character> set = new HashSet<>();
        for(int i = sr; i <= er; i++)
        {
            for(int j = sc; j <= ec; j++)
            {
                if(board[i][j] != '.')
                {
                    if(set.contains(board[i][j]))
                        return false;
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) 
    {
        //check row-wise
        for(int i = 0; i < board.length; i++)
        {
            Set<Integer> set = new HashSet<>();
            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] != '.')
                {
                    if(set.contains(board[i][j] - '0'))
                        return false;
                    set.add(board[i][j] - '0');
                }
            }
        }
        //check col-wise
        for(int j = 0; j < board[0].length; j++)
        {
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i < board.length; i++)
            {
                if(board[i][j] != '.')
                {
                    if(set.contains(board[i][j] - '0'))
                        return false;
                    set.add(board[i][j] - '0');
                }
            }
        }
        //check sub-box-wise
        for(int sr = 0; sr < 9; sr+=3)
        {
            int er = sr + 2;
            for(int sc = 0; sc < 9; sc+=3)
            {
                int ec = sc + 2;
                if(!validateBox(board,sr,er,sc,ec))
                    return false;
            }
        }
        return true;    
    }
}