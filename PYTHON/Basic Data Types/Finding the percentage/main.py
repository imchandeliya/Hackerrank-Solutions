if __name__ == '__main__':
    n = int(input())

    dictionary = {}

    for i in range(n):
        entry = input().split()
        subs = entry[1:]
        temp = {entry[0]: subs}
        dictionary.update(temp)

    find = input()
    for i in dictionary:
        if i == find:
            temp = dictionary[find]
            sum = 0.00
            for j in range(3):
                sum = sum + float(temp[j])

            percentage = str(sum/3)

            if len(percentage)<=4:
                percentage = percentage + '0'
            elif len(percentage) > 5:
                percentage = percentage[0:5]
            print(percentage)
