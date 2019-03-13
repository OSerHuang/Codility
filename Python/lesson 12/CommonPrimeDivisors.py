# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A, B):
    # write your code in Python 3.6
    result = 0
    for a, b in zip(A, B):
        if has_common_prime_divisors(b, a):
                result += 1
    return result
    
def has_common_prime_divisors(a, b):
    gcd_val = gcd(a, b)
    return has_no_more_prime_divisor(gcd_val, a) and has_no_more_prime_divisor(gcd_val, b)
        
def has_no_more_prime_divisor(pre_gcd, x):
    while x != 1:
        new_gcd = gcd(pre_gcd, x)
        if new_gcd == 1: break
        x //= new_gcd
    return x == 1

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)