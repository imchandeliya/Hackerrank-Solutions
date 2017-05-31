def mutate_string(string,position,character):
    string = string[:position] + character + string[position+1:]
    print(string)

input_string = input()
change = change = [i for i in input().split(' ')]

mutate_string(input_string,int(change[0]),change[1])
