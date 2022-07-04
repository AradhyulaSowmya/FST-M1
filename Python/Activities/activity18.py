import pandas

#read csv file
dataFrame = pandas.read_csv("sample.csv")

#print the file
print(dataFrame)

#Print the values only in the Usernames column
print("======================================================")
print("Usernames:")
print(dataFrame["Usernames"])


#Print the username and password of the second row
print("======================================================")
print("Username and Password of second row are")
print("Username: ", dataFrame["Usernames"][1], "|", "Password: ", dataFrame["Passwords"][1])

#Sort the Usernames column data in ascending order and print data
print("======================================================")
print("Usernames column in ascending order is ")
print(dataFrame.sort_values("Usernames"))

#Sort the Passwords column in descending order and print data
print("======================================================")
print("Passwords column in descending order is ")
print(dataFrame.sort_values("Passwords", ascending=False))