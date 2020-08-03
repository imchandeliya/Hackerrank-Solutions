"""
String formatting
@author adityachandeliya
"""

def print_formatted(number):
    
    # logic to print decimals
    length_binary = len(bin(number))

    for i in range(1, number + 1):
        # logic to print decimals
        print(' ' * (length_binary - len(format(i, 'd')) -2), end='')
        print(format(i, 'd'), end='')

        # logic to print octal
        print(" " * (length_binary - len(format(i, 'o')) -1), end='')
        print(format(i, 'o'), end='')

        # logic to print hexadecimal
        print(" " * (length_binary - len(format(i, 'x')) -1), end='')
        print(format(i, 'x').upper(), end='')

        # logic to print binary
        print(" " * (length_binary - len(format(i, 'b')) -1), end='')
        print(format(i, 'b'), end='')

        print()

if __name__ == '__main__':
    num = int(input())
    print_formatted(num)