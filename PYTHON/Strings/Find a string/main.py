def find_substring(str, substr):
    substrLength = len(substr)
    count = 0
    for i in range(len(str)):
        if str[i:i+substrLength] == substr:
            count += 1
    return count

string = input()
substring = input()
print(find_substring(string,substring))
