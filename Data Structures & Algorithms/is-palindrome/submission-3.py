class Solution:
    def isPalindrome(self, s: str) -> bool:
        i=0
        j=len(s)-1
        s=s.lower()
        while(i<j):
            while(i<j and  not s[i].isalnum()):
                i+=1 
            
            while(i<j and not s[j].isalnum()):
                j-=1
            
            if s[i]==s[j]:
                i+=1
                j-=1
            else:
                return False
        return True
        # temp=[]
        # for i in s:
        #     if not i.isalnum() :
        #         pass
        #     else:
        #         temp.append(i.lower())
        # print(temp)
        # return temp==temp[::-1]