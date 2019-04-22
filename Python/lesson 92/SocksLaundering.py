# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(K, C, D):
    # write your code in Python 3.6
    c = count_socks(C)
    d = count_socks(D)
    for sock in c:
        if c[sock] % 2 == 1:
            if K > 0 and d.get(sock, None):
                c[sock] += 1
                d[sock] -= 1
                K -= 1
            else:
                c[sock] -= 1
    remaining_pairs = K // 2
    for sock in d:
        if remaining_pairs > 0:
            washed_pairs = min(d[sock] // 2, remaining_pairs)
            c[sock] = c.get(sock, 0) + washed_pairs * 2
            remaining_pairs -= washed_pairs
    return sum(c[sock] for sock in c) // 2

def count_socks(lst):
    dist = {}
    for sock in lst:
        dist[sock] = dist.get(sock, 0) + 1
    return dist