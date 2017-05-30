if __name__ == '__main__':
    n = int(input())
    students = []

    for i in range(n):
        name = input()
        score = float(input())
        students.append([name, score])

    lowest_score = students[0][1]
    second_lowest_score = 100
    for i in range(n):
        if students[i][1]<lowest_score:
            lowest_score = students[i][1]
        if students[i][1] >= second_lowest_score:
            second_lowest_score = students[i][1]

    for i in range(n):
        if students[i][1] < second_lowest_score and students[i][1] > lowest_score:
            second_lowest_score = students[i][1]
    alpha = []
    for i in range(n):
        if students[i][1] == second_lowest_score:
            alpha.append(students[i][0])
    alpha.sort()
    for i in alpha:
        print(i)
