
#author = "aditya_chandeliya"
if __name__ == '__main__':
    n = int(input())
    array = [int(i) for i in input().split()]

    largest = array[0]
    second_largest = 0
    for i in array:
        if i >= largest:
            largest = i
        if i <= second_largest:
            second_largest = i

    for i in array:
        if i >= second_largest and i < largest:
            second_largest = i

    print(second_largest)
