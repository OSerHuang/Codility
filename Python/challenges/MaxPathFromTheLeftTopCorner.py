# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # write your code in Python 3.6
    # This works because Python can represent any integer number without overflow
    # See more general solutions in other languages
    N, M = len(A), len(A[0])
    dp = [[0] * (M + 1) for _ in range(N + 1)]
    for i in range(1, N + 1):
        for j in range(1, M + 1):
            dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]) * 10 + A[i - 1][j - 1]
    return str(dp[i][j])