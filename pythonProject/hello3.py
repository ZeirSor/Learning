def multiple_return_values():
    return 1, 'ZeirSor', True, [1, 2, 3]


x, y, z, w = multiple_return_values()
print(x)
print(y)
print(z)
print(w)


def variable_length_parameter_position(*args):
    print(args)


variable_length_parameter_position(1, 2, 3, 4, 'sda', [2, 3, 4])


# (1, 2, 3, 4, 'sda', [2, 3, 4])


def variable_length_parameter_keys(**kwargs):
    print(kwargs)


variable_length_parameter_keys(wo=5, ni=6, ta=7)

# {'wo': 5, 'ni': 6, 'ta': 7}

f = lambda x, y: x + y
print(f(2, 3))  # 5

print((lambda x, y: x + y)(3, 4))

my_list = ['wo si zs', 'a an i u y t', 'hui dss']
my_list.sort(key=lambda str: len(str.split()))
print(my_list)


# ['hui dss', 'wo si zs', 'a an i u y t']

def f(a, b, c):
    return lambda x: a * x ** 2 + b * x + c


g = f(2, 2, 1)

print(g(3))  # 25

# def func(x):
#     return x > 5
#
#
# data = [4, 6, 7, 2, 9, 8, 0, 1, 11, 45, 2]
# filtered = filter(func, data)
# filtered_data = list(filtered)
# print(filtered_data)
# [6, 7, 9, 8, 11, 45]

print(list(filter(lambda x: x > 5, [4, 6, 7, 2, 9, 8, 0, 1, 11, 45, 2])))

# def func(x):
#     return x * 2
#
#
# data = [4, 6, 7, 2, 9, 8, 0, 1, 11, 45, 2]
# mapped = map(func, data)
# mapped_data = list(mapped)
# print(mapped_data)
# [8, 12, 14, 4, 18, 16, 0, 2, 22, 90, 4]

print(list(map(lambda x: x * 2, [4, 6, 7, 2, 9, 8, 0, 1, 11, 45, 2])))
