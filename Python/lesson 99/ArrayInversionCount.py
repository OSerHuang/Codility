# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # write your code in Python 3.6
    return merge_sort(A)[-1]

def merge(nums1, count1, nums2, count2):
    if count1 == -1 or count2 == -1:
        return [], -1
    merged_nums = []
    count = count1 + count2
    i = j = 0
    while i < len(nums1) or j < len(nums2):
        if j == len(nums2) or i != len(nums1) and nums1[i] <= nums2[j]:
            merged_nums.append(nums1[i])
            i += 1
        else:
            merged_nums.append(nums2[j])
            j += 1
            count += len(nums1) - i
            if count > 1000000000: return [], -1
    return merged_nums, count
    
def merge_sort(nums):
    if len(nums) <= 1:
        return nums, 0
    return merge(*merge_sort(nums[:len(nums) // 2]), *merge_sort(nums[len(nums) // 2:]))
    