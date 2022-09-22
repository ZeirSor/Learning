# name = 'zhangsan'
# for x in name:
#     print(x) type hint
# print(x)

#
# def add(x, y=3):
#     return x + y
#
#
# print(add(1))  # 4
# print((add(1, 5)))  # 6
#
# help(add)


# num = 200


# class A:
#     __XXX: int = ...
#
#     def __init__(self, a: int):
#         self.a = a
#
#     @property
#     def aaa(self):
#         """
#
#         :return:
#         """
#         ...
#
#
# a = A(1)

# def func1():
#     global num
#     num = 1000
#     print(num)
#
#
# print(num)

# func1()

list_example = {1, 2, 3, 4, 5}


def get_sum(*num):
    sum = 0
    for x in num:
        sum += x
    return sum


print(get_sum(1, 2, 3))  # 6
print(get_sum(*list_example))  # 15


def personinfo(name, age, **kw):
    print('name:', name, 'age:', age, 'ps:', kw)


personinfo('Steve', 22)
personinfo('Lily', 23, city='Shanghai')
personinfo('Leo', 23, gender='male', city='Shanghai')


# name: Steve age: 22 ps: {}
# name: Lily age: 23 ps: {'city': 'Shanghai'}
# name: Leo age: 23 ps: {'gender': 'male', 'city': 'Shanghai'}


def personinfo(name, age, *, gender, city):  # 只能传递gender和city参数
    print(name, age, gender, city)


personinfo('Steve', 22, gender='male', city='shanghai')


# Steve 22 male shanghai


def my_add(x: int, y: int = 8) -> int:
    return x + y


print(my_add(1))  # 9
help(my_add)
