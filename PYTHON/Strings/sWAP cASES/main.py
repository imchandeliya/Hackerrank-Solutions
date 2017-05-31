def swap_case(s):

    input_string = s
    output_string = ''
    for i in range(len(input_string)):
        if ord(input_string[i]) >= 65 and ord(input_string[i]) <= 90:
            output_string = output_string + chr(ord(input_string[i])+32)
        elif ord(input_string[i]) >= 97 and ord(input_string[i]) <= 122:
            output_string = output_string + chr(ord(input_string[i])-32)
        else:
            output_string = output_string + input_string[i]

    print(output_string)
    return output_string

input_string = input()
swap_case(input_string)
