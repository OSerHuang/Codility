# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(S):
    # write your code in Python 3.6
    if len(S) % 2 != 0 and S == S[::-1]:
        return len(S) // 2
    else:
        return -1