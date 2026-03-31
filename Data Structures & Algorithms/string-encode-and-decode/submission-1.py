class Solution:

    def encode(self, strs: List[str]) -> str:
        ans=''
        for i in range(len(strs)):
            ans=ans+f"{len(strs[i])}"+"#"+strs[i]
        print(ans)
        return ans

    def decode(self, s: str) -> List[str]:
        ans=[]
        i=0
        while i<len(s):
            j=i
            while s[j]!="#":
                j+=1
            len_word=int(s[i:j])
            i=j+1
            j=i+len_word
            ans.append(s[i:j])
            i=j

        return ans
