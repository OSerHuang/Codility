# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(S, K):
    # write your code in Python 3.6
    res = float('inf')
    ranges = {}
    for i in range(len(S)):
        ch = S[i]
        if ch in ranges:
            ranges[ch][1] = i
        else:
            ranges[ch] = [i, i]
    if len(ranges) < K:
        return -1
    elif len(ranges) == K:
        return 0
    end_to_start = {}
    for ch in ranges:
        start, end = ranges[ch]
        end_to_start[end] = start
    waited_starts = set()
    i, j = 0, 0
    count = 0
    n = len(ranges) - K
    while i < len(S) or j < len(S):
        if count < n and j < len(S):
            if j in end_to_start and end_to_start[j] >= i:
                count += 1
                waited_starts.add(end_to_start[j])
            j += 1
        elif count == n and i < len(S):
            if i in waited_starts:
                res = j - i if j - i < res else res
                count -= 1
            i += 1
        else:
            return res
    return res
            
    