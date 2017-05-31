s = input()

flag = False

for i in range(len(s)):
    if s[i].isalnum():
        flag = True
        break

print(flag)
flag = False

for i in range(len(s)):
    if s[i].isalpha():
        flag = True
        break

print(flag)
flag = False

for i in range(len(s)):
    if s[i].isdigit():
        flag = True
        break

print(flag)
flag = False

for i in range(len(s)):
    if s[i].islower():
        flag = True
        break

print(flag)
flag = False

for i in range(len(s)):
    if s[i].isupper():
        flag = True
        break

print(flag)

