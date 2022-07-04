import pandas


# Read data from Excel sheet
dataFrame = pandas.read_excel("sample.xlsx")

# print the data frame
print(dataFrame)

#Print the number of rows and columns
print("======================================================")
print("Number of rows and columns are:", dataFrame.shape)

#Print the data in the emails column only
print("======================================================")
print("Data in the emails columns is")
print(dataFrame['Email'])

#Sort the data based on FirstName in ascending order and print the data
print("======================================================")
print("FirstNames in ascending order are")
print(dataFrame.sort_values('FirstName'))