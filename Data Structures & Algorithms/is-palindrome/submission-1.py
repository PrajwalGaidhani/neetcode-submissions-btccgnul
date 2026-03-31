class Solution:
    def isPalindrome(self, s: str) -> bool:
        temp=[]
        for i in s:
            if not i.isalnum() :
                pass
            else:
                temp.append(i.lower())
        print(temp)
        return temp==temp[::-1]