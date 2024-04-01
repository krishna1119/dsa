# find the max sum of the subarray of size 3
#[ 4,2,1,7,8,1,2,8,1,0]


def maxSumOfSubArray(arr,k):
    res =[]
    current =0
    maxSum = float('-inf')

    for i in range(len(arr)):
        current += arr[i]
        if (i>=k-1):
            maxSum = max(maxSum, current)
            current -= arr[i-(k-1)]
    
    return maxSum


arr= [4,2,1,7,8,1,2,8,1,0]
print(maxSumOfSubArray(arr,3))


