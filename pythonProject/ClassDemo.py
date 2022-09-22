class Student:
    # name = None
    # age = None
    # address = None

    def __init__(self, name, age, address):
        self.name = name
        self.age = age
        self.address = address
        print("constructor executed")

    def __str__(self) -> str:
        return super().__str__()

    @staticmethod
    def add(a: int, b: int) -> int:
        return a + b

    def __new__(cls, *args, **kwargs):
        print("创建对象, 分配空间")

        instance = super().__new__(cls)

        return instance


s1 = Student("zhangsan", 18, "beijing")
print(s1.name)
print(str(s1))

from typing import Union

my_list: list[Union] = [1, 2, "str1", "str2"]
print(my_list)


class ClassDemo:
    instance = None

    def __new__(cls, *args, **kwargs):
        if cls.instance is None:
            cls.instance = super().__new__(cls)

        return cls.instance

    init_flag = False

    def __init__(self):
        if ClassDemo.init_flag:
            return

        print("execute init method")

        ClassDemo.init_flag = True


print(ClassDemo())  # <__main__.ClassDemo object at 0x0000021EFB1D1760>
print(ClassDemo())  # <__main__.ClassDemo object at 0x0000021EFB1D1760>

calc = input("please input an expression:")
# 5 + 2
print(eval(calc))  # 7
