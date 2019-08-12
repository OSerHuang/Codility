# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(N):
    # write your code in Python 3.6
    result = 0
    counter = 0
    is_start = False
    while N != 0:
        bit = N % 2
        N = N >> 1
        if bit:
            if is_start:
                result = counter if counter > result else result
                counter = 0
            else:
                is_start = True
        elif is_start:
            counter += 1
    return result