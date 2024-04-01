# find the max sum of the subarray of size 3
#[ 4,2,1,7,8,1,2,8,1,0]


def maxSumOfSubArray(arr):
    res =[]
    current =sum(arr[0:3])
    maxSum = float('-inf')

    l,r = 0, 3
    while r<len(arr):
        maxSum = max(maxSum, current)
        current = current - arr[l] + arr[r]
        l+=1
        r+=1
    return maxSum


arr= [4,2,1,7,8,2,8,1,0]
print(maxSumOfSubArray(arr))


