f = open("test.txt", "r", encoding="UTF-8")
# print(type(f))
#
# content = f.read()
# print(type(content))
# count = content.count("发展")
# print(count)

count = 0
for line in f:
    line = line.strip(" \n , 、")  # 去除首尾空格和换行符
    words = line.split(" ")  # 按空格分割
    for word in words:
        count += word.count("发展")
print(count)
f.close()

# print(f.readlines())

# print(f.readline())
# print(f.readline())
# print(f.readline())
# print(f.readline())

# for line in open("test.txt", "r", encoding="UTF-8"):
#     print(line)
# with open("test.txt", "r", encoding="UTF-8") as f:
#     for line in f:
#         print(line)
