# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(K, M, A):
    # write your code in Python 3.6
    N = len(A)
    result = set()
    
    count = [0] * (M + 2)
    for i in range(K):
        A[i] += 1
    for val in A:
        count[val] += 1
    for i, num in  enumerate(count):
        if num >= (N + 1) / 2:
            result.add(i)
    
    for i in range(N - K):
        x, y = A[i], A[i + K]
        count[A[i]] -= 1
        count[A[i + K]] -= 1
        A[i] -= 1
        A[i + K] += 1
        count[A[i]] += 1
        count[A[i + K]] += 1
        if count[A[i]] >= (N + 1) / 2:
            result.add(A[i])
        if count[A[i + K]] >= (N + 1) / 2:
            result.add(A[i + K])
    
    return sorted(list(result))