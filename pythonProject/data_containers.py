my_list = [1, 2, 3]
print(my_list)

my_list2 = [my_list, [2, 3, 4], 'sdsdf', '23894y2']

print(my_list2)

print(my_list2[2])
print(my_list2[-1])

for x in my_list2:
    print(x)

print(my_list2[1][1])

my_list = [1, 2, 3]
my_list.extend([2, 3, 4])
print(my_list)  # [1, 2, 3, 2, 3, 4]

my_list = [1, 2, 3, 2, 3, 4]
del my_list[3]
e = my_list.pop(1)
print(e)  # 2
print(my_list)  # [1, 3, 3, 4]

my_list = [1, 3, 3, 4]
my_list.remove(3)
print(my_list)  # [1, 3, 4]

my_list.clear()
print(my_list)  # []

my_list = [1, 3, 3, 4, 3, 2, 3]
print(my_list.count(3))  # 4

my_list = [1, 3, 3, 4, 3, 2, 3]
print(len(my_list))  # 7

my_list = [1, 3, 3, 4, 3, 2, 3]
print(my_list[2:])
print(my_list[2:5])
print(my_list[:6])
print(my_list[1:6:2])

my_list = [1, 3, 3, 4, 3, 2, 3]
my_list.sort()
print(my_list)  # [1, 2, 3, 3, 3, 3, 4]
my_list.sort(reverse=True)
print(my_list)  # [1, 2, 3, 3, 3, 3, 4]

my_list = [1, 3, 3, 4, 3, 2, 3]
new_list = sorted(my_list)
print(my_list)  # [1, 3, 3, 4, 3, 2, 3]
print(new_list)  # [1, 2, 3, 3, 3, 3, 4]

my_list = [-1, 2, 4, -4, 2, -5, 8]
print([i ** 2 for i in my_list])  # [1, 4, 16, 16, 4, 25, 64]
print([i + 1 for i in my_list if abs(i) > 3])  # [5, -3, -4, 9]

my_tuple = (1, 2, 3, 4, 5, 6, 6, 7, 8, 9, -1)
print(max(my_tuple))
print(min(my_tuple))
print(sum(my_tuple))
print(tuple(my_list))

my_str = '213 zeir sor 123312 '
print(my_str.strip("123 "))

set_1 = {1, 2, 3, 4, 5}
set_2 = {3, 4, 6, 7}
set_1.difference_update(set_2)
print(set_1, set_2)  # {1, 2, 5} {3, 4, 6, 7}

set_1 = {1, 2, 3, 4, 5}
set_2 = {3, 4, 6, 7}
set_3 = set_1.union(set_2)
print(set_3)  # {1, 2, 3, 4, 5, 6, 7}

for x in set_3:
    print(x)

my_dict = {"wo": 5, "ni": 6, "ta": 7}
keys = my_dict.keys()
for key in keys:
    print(f"{key}: {my_dict[key]}", end=" ")

print()

for key in my_dict:
    print(f"{key}: {my_dict[key]}", end=" ")
print()

my_dict = {"wo": 5, "ni": 6, "ta": 7}
my_dict.setdefault("TA", 8)
print(my_dict)  # {'wo': 5, 'ni': 6, 'ta': 7, 'TA': 8}

a = my_dict.get("ni")
print(a)

my_dict_1 = {"wo": 5, "ni": 6, "ta": 7}
my_dict_2 = {"wo": 999, "Ni": 27, "ta": 7}
my_dict_1.update(my_dict_2)
print(my_dict_1)  # {'wo': 999, 'ni': 6, 'ta': 7, 'Ni': 27}

my_dict = {"wo": 5, "ni": 6, "ta": 7}
new_dic = my_dict.popitem()
print(new_dic)  # ('ta', 7)
print(my_dict)  # {'wo': 5, 'ni': 6}

my_dict = {"wo": 5, "ni": 6, "ta": 7}
values = my_dict.values()
print(values)  # dict_values([5, 6, 7])

my_dict = {"wo": 5, "ni": 6, "ta": 7}
for get_item in my_dict.items():
    print(get_item)
# ('wo', 5)
# ('ni', 6)
# ('ta', 7)

my_dict = {"wo": 5, "ni": 6, "ta": 7}
my_dict = my_dict.fromkeys(["Wo", "Ni", "Ta", "TA"])
print(my_dict)  # {'Wo': None, 'Ni': None, 'Ta': None, 'TA': None}

new_dic = {}.fromkeys(["Wo", "Ni", "Ta", "TA"])
print(new_dic)  # {'Wo': None, 'Ni': None, 'Ta': None, 'TA': None}
