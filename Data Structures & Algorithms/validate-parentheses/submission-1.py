class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        open_append=['(','{','[']
        close_pop=[')','}',']']
        relation={'(':')','{':'}','[':']'}
        for i in s:
            if i in close_pop and not stack:
                return False
            if i in open_append:
                stack.append(i)
            if i in close_pop:
                if relation[stack[-1]]==i:
                    stack.pop()
                else:
                    return False
        if not stack:
            return True
        else:
            return False

        