class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count=Counter(nums)
        print(count)
        a=[]
        for key in count.keys():
            a.append((key,count[key]))
        sorted_a=sorted(a,key=lambda x:x[1],reverse=True)
        ans=[]
        for i in range(k):
            ans.append(sorted_a[i][0])
        return ans