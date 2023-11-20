def manipulate_data(data):
    data[0] = "Modified"  # This will work for a list but not for a tuple
    return data

# Using a list
mutable_list = ["Original", 2, 3.14]
modified_list = manipulate_data(mutable_list.copy())  # Passing a copy to keep the original unchanged

# Using a tuple
immutable_tuple = ("Original", 2, 3.14)

# Attempting to modify the tuple (will result in an error)
# immutable_tuple[0] = "Modified"  # Uncommenting this line will result in a TypeError

# Printing results
print("Mutable List:", modified_list)
print("Immutable Tuple:", immutable_tuple)