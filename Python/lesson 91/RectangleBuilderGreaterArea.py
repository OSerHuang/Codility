# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A, X):
    # write your code in Python 3.6
    res = 0
    
    count = {}
    for l in A:
        count[l] = count.get(l, 0) + 1
        
    usable = []
    for l in count:
        if count[l] >= 4:
            usable.append(l)
            if l * l >= X:
                res += 1
        elif count[l] >= 2:
            usable.append(l)
    usable.sort()
    
    i, j = 0, len(usable) - 1
    while i < j:
        if usable[i] * usable[j] < X:
            i += 1
        else:
            res += j - i
            if res > 1000000000: return -1
            j -= 1
    return res
