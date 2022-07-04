import pandas

data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

# create a data frame using the data
dataFrame = pandas.DataFrame(data)

# print the data frame
print(dataFrame)

#write the data to csv
dataFrame.to_csv("sample.csv", index=False)
