def split_and_join(line):
    breakLine = line.split(" ")
    breakLine = "-".join(breakLine)
    print(breakLine)

input_line = input()
split_and_join(input_line)
