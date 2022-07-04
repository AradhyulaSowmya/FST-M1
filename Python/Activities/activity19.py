import pandas
from pandas import ExcelWriter
from openpyxl.workbook import Workbook

data = {
    'FirstName': ["Satvik", "Avinash", "Lahri"],
    'LastName': ["Shah", "Kati", "Rath"],
    'Email': ["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
    'PhoneNumber': ["4537829158", "4892184058", "4528727830"]
}

# Create the DataFrame that will be written to the excel file
dataFrame = pandas.DataFrame(data)

# Print the dataframe
print(dataFrame)


# Write the dataframe to a Excel file
writer = pandas.ExcelWriter("sample.xlsx")
dataFrame.to_excel(writer, "sheet1", index=False)


# Commit data to the Excel file
writer.save()
