class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        rows, cols = len(board), len(board[0])
        ans=[False]
        def dfs(i,j,index):
            if ans[0]:
                return
            if i < 0 or j < 0 or i >= rows or j >= cols or board[i][j] != word[index]:
                return 
            if index==len(word)-1:
                ans[0]=True
                return True
            temp = board[i][j]
            board[i][j] = '#'
            dfs(i + 1, j, index + 1)
            dfs(i - 1, j, index + 1)
            dfs(i, j + 1, index + 1)
            dfs(i, j - 1, index + 1)
            board[i][j] = temp
        for i in range(rows):
            for j in range(cols):
                dfs(i,j,0)
        return  ans[0]