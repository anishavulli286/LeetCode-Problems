def lengthOfLastWord(s: str):
    splited = s.split(" ")
    return len(splited[len(splited) - 1])


inputStr = input("Enter the string with spaces: ")
print(lengthOfLastWord(inputStr))