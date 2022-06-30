def fibonacci(number):
    if number <= 1:
        return number
    else:
        return fibonacci(number-1) + fibonacci(number-2)


n = int(input("please enter a number"))

if n <= 0:
    print("please enter a positive number")
else:
    for i in range(n):
        print(fibonacci(i))