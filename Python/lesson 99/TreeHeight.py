# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

from extratypes import Tree  # library with types used in the task

def solution(T):
    # write your code in Python 3.6
    res = -1
    stack = [(T, res)]
    while stack:
        node, depth = stack.pop(0)
        if node:
            res = max(res, depth + 1)
            stack.append((node.l, res))
            stack.append((node.r, res))
    return res