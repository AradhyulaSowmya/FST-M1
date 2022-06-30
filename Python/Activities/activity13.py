def sum(numbers):
    sum = 0
    for n in numbers:
        sum = sum+n
    return sum


list1 = [1, 2, 3, 4, 5]

result = sum(list1)

print(result)