# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # write your code in Python 3.6
    m, n = len(A[0]), len(A)
    count = {}
    for row in A:
        ones = []
        zeros = []
        for i in range(m):
            if row[i] == 1:
                ones.append(i)
            else:
                zeros.append(i)
        ones = tuple(ones)
        zeros = tuple(zeros)
        count[ones] = count.get(ones, 0) + 1
        count[zeros] = count.get(zeros, 0) + 1
    return max(count.values())
