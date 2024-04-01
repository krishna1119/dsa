# find the size of the smallest subarray with the given sum
#[4,2,2,7,8,1,2,8,1,0]


def smallestSubarray(arr, k):
    smallest = float('inf')
    current =0
    j = 0
    for i in range(len(arr)):
        current += arr[i]

        while(current >= k):
            smallest = min(smallest, i-j+1)
            current -= arr[j]
            j+=1
    
    return smallest

arr =[4,2,2,7,8,1,2,8,1,0]

print(smallestSubarray(arr, 8))


