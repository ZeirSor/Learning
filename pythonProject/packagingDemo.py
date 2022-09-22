# -*- coding: utf-8 -*-
# @Time : 2022/9/19 23:07
# @Author : ZeirSor
# @File : packagingDemo.py
# @Software: PyCharm
# @contact: Szpsn2357@gmail.com
# -*- function instruction -*-
#
# -*- function instruction -*-

class Phone:
    __is_5g_enable = True

    def __check_5g(self):
        if self.__is_5g_enable:
            print("5g enabled")
        else:
            print("5g off, use 4g")

    def call_by_5g(self):
        self.__check_5g()
        print("calling...")


p = Phone()
p.call_by_5g()
