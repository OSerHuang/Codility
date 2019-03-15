# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A, B):
    # write your code in Python 3.6
    height = max(A)
    divisor = 2 ** max(B)
    dp = [1] * (height + 1)
    for i in range(2, height + 1):
        dp[i] = (dp[i - 1] + dp[i - 2]) % divisor
    return [dp[a] % 2**b for a, b in zip(A, B)]