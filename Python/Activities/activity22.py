import pytest

# Addition test
def test_addition():

    num1 = 2
    num2 = 4

    sum = num1+num2

    assert sum==6

# Subtraction test
def test_subtraction():

    num1 = 20
    num2 = 4

    diff = num1-num2

    assert diff==16

# Multiplication test
@pytest.mark.activity
def test_multiply():

    num1 = 2
    num2 = 4

    mul = num1*num2

    assert mul==8

# Division test
@pytest.mark.activity
def test_division():

    num1 = 20
    num2 = 4

    div = num1/num2

    assert div==5