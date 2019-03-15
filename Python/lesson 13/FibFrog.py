# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # write your code in Python 3.6
    A.append(1)
    target = len(A)
    fib = fibonacci(target)
    dp = {-1: 0}
    for i in range(target):
        if A[i] == 0: continue
        temp_result = []
        for jump in fib:
            if jump > i + 1: break
            if i - jump in dp:
                temp_result.append(dp[i - jump] + 1)
        if temp_result: dp[i] = min(temp_result)
    return dp.get(target - 1, -1)

def fibonacci(n):
    fib = [1, 1]
    while fib[-1] < n:
        fib.append(fib[-1] + fib[-2])
    return fib