# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # write your code in Python 3.6
    bound = max(A)
    tripleA = []
    for num in A:
        tripleA += [2 * bound + num, 2 * bound - num, num]
    return longest_increasing_subsequence(tripleA)
    
def longest_increasing_subsequence(lst):
    from bisect import bisect_left
    dp = []
    for num in lst:
        idx = bisect_left(dp, num)
        if idx == len(dp):
            dp.append(num)
        else:
            dp[idx] = num
    return len(dp)
