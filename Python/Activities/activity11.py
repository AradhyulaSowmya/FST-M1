dict1 = {
    "apple" : 10,
    "mango" : 50,
    "papaya" : 40
}
fruit = input("Please enter fruit which you want to check availability").lower()

if fruit in dict1:
    print("fruit is available")
else:
    print("fruit is not available")

