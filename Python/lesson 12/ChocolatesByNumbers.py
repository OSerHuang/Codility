# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(N, M):
    # write your code in Python 3.6
    return lcm(N, M) // M

def gcd(a, b):
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)
        
def lcm(a, b):
    return a * (b // gcd(a, b))