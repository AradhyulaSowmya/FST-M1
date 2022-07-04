import pytest

# Create fixture
@pytest.fixture
def num_list():

    # Create list
    list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    return list

# Write test method
def test_sum(num_list):

    # Initialize sum
    sum = 0

    # Add number in the list
    for num in num_list:
        sum = sum+num

    # Assertion
    assert sum == 55