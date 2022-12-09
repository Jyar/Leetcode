class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        tmp = {}
        for idx, num in enumerate(nums):
            if num in tmp:
                tmp[num] += 1
            else:
                tmp[num] = 1
        return sum(n*(n-1)//2 for n in tmp.values())