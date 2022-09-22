[toc]
# C/C++ Review And Supplement
<!-- vscode-markdown-toc -->
* 1. [数据类型](#)
	* 1.1. [元素类型说明](#-1)
		* 1.1.1. [顺序表类型说明](#-1)
* 2. [数组](#-1)
	* 2.1. [动态内存分配](#-1)
		* 2.1.1. [C语言](#C)
		* 2.1.2. [（supplement）C++](#supplementC)
	* 2.2. [数组定义](#-1)
		* 2.2.1. [①静态定义](#-1)
		* 2.2.2. [②动态定义](#-1)
* 3. [函数](#-1)
	* 3.1. [（supplement）C++中的参数传递](#supplementC-1)
		* 3.1.1. [传值方式(参数为整型、实型、字符型等)](#-1)
		* 3.1.2. [传地址](#-1)
* 4. [指针](#-1)
	* 4.1. [[指针变量的初始化，C语言指针变量初始化详解](http://c.biancheng.net/view/214.html)](#Chttp:c.biancheng.netview214.html)
* 5. [C库函数](#C-1)
	* 5.1. [生成伪随机数](#-1)
		* 5.1.1. [srand( )    为随机数生成器提供一个种子](#srand)
		* 5.1.2. [rand( ) 生成随机数](#rand)
		* 5.1.3. [time( )函数](#time)
		* 5.1.4. [生成随机数模板](#-1)

<!-- vscode-markdown-toc-config
	numbering=true
	autoSave=true
	/vscode-markdown-toc-config -->
<!-- /vscode-markdown-toc -->

##  1. <a name=''></a>数据类型
###  1.1. <a name='-1'></a>元素类型说明
####  1.1.1. <a name='-1'></a>顺序表类型说明
```C
typedef struct
{
    ElemType data[];
    int length;
}SqList;    //顺序表类型
```
 其中的ElemType要根据具体需要定义**数据类型**，可以是`char、float、int`等等，也可以利用`typedef`定义为`typedef char ElemType`。

##  2. <a name='-1'></a>数组
###  2.1. <a name='-1'></a>动态内存分配
####  2.1.1. <a name='C'></a>C语言
  头文件`stdlib.h`
  * `malloc(m)`函数，开辟m字节长度的内存空间，并返回这段空间的首地址
  * `sizeof(x)`运算，计算变量x的长度
  * `free(p)函数`，释放指针p所指变量的存储空间，即彻底删除一个变量
  * `realloc(void mem_address, unsigned int newsize)`当`malloc\calloc`分配空间不够使进行重新分配、扩增，指针名=（数据类型）realloc（要改变内存大小的指针名，新的大小）。
####  2.1.2. <a name='supplementC'></a>（supplement）C++
```C
new 类型名T（初值列表）
    功能：
        申请用于存放T类型对象的内存空间，并依初值列表赋以初值
    结果值：
        成功：T类型的指针，指向新分配的内存
        失败：0(NULL)

    **用法举例**
    int *p1 = new int;
    int *p1 = new int(10);

delete 指针p
    功能：
        释放指针p所指向的内存。p必须是new操作的返回值
    int *p1 = new int;          这种情况就直接delete p1；
    int *p1 = new int(10);      这种情况需要在delete后加[]，写成delete [] p1;
```
注：具体参考[这里](http://c.biancheng.net/view/206.html)
###  2.2. <a name='-1'></a>数组定义
####  2.2.1. <a name='-1'></a>①静态定义
 ```c
typedef struct
{
    ElemType data[MAXSIZE];
    int length;
}SqList;    //顺序表类型
 ```
####  2.2.2. <a name='-1'></a>②动态定义
```c
typedef struct
{
    ElemType *data;
    int length;
}SqList;    //顺序表类型

SqList L;
    L.data = (ElemType*)malloc(sizeof(ElemType)*MAXSIZE);
```

[C语言realloc()函数：重新分配内存空间](http://c.biancheng.net/cpp/html/2859.html)
[安全起见，小心使用C语言realloc()函数](http://c.biancheng.net/cpp/html/2536.html)
##  3. <a name='-1'></a>函数
###  3.1. <a name='supplementC-1'></a>（supplement）C++中的参数传递
    函数调用时传送给形参表的实参必须与形参三个一致【类型、个数、顺序】
####  3.1.1. <a name='-1'></a>传值方式(参数为整型、实型、字符型等)
####  3.1.2. <a name='-1'></a>传地址
#####  3.1.2.1 <a name='-1'></a>参数为指针变量．
  *  形参变化影响实参
        ```C++
        void swap(float *m,float *n)
        {
            float t;    //t不是指针，存放指针变量的内容
            t = *m;
            *m = *n;
            *n = t;     //改变了内容
        }
        ```
  *  形参变化不影响实参
        ```C++
        void swap(float *m,float *n)
        {
            float *t;    //t是指针，存放指针变量的地址
            t = m;
            m = n;
            n = t;      //只交换了m，n所指
        }
        ```
#####  3.1.2.2 <a name='-1'></a>**参数为引用类型．**（推荐|比另外两种方式操作更加简单）
  引用：它用来给一个对象提供一个代替的名字
```C++
       # include<iostream.h>
       int i = 5;
       int &j = i;
       i = 7
       cout<<"i="<<i<<"j="<<j;
```
`j`是一个应用类型，代表i的一个替代名，`i`值改变时`j`值也跟着变；也可以理解为`i、j`共用一个内存空间
*  传参示例
```C++
#include<iostream>
using namespace std;
void swap(float &m,float &n)
{
    float temp;
    temp = m;
    m = n;
    n = temp;
}
int main()
{
    float a,b;
    cin>>a>>b;
    swap(a,b);
    cout<<a<<endl<<b<<endl;
}
``` 
* **直接对实参操作，没有产生副本，省空间，且不容易出错**
#####  3.1.2.3 <a name='-1'></a>参数为数组名
* 传递的是数组的**首地址**
* 对形参数组所做的任何改变都将反映到实参数组中
* 例如
```C++
void sub(char b[])
{
    b[] = 'world';
} 
```
或者
```C++
void sub(char *b)
{
    *b = 'world';
} 
```
**注意b[]不能有大小**，传递的只是数组的首地址

##  4. <a name='-1'></a>指针
###  4.1. <a name='Chttp:c.biancheng.netview214.html'></a>[指针变量的初始化，C语言指针变量初始化详解](http://c.biancheng.net/view/214.html)


##  5. <a name='C-1'></a>C库函数
###  5.1. <a name='-1'></a>生成伪随机数
####  5.1.1. <a name='srand'></a>srand( )    为随机数生成器提供一个种子
```C
void srand(unsigned int seed)
    seed —— 这是一个整型值，用于伪随机数生成算法播种。
    unsigned int 表示非负整型
    在C中头文件为`<stdlib>`
    在C++中为`<cstdlib>`
该函数不返回任何值。
```
####  5.1.2. <a name='rand'></a>rand( ) 生成随机数
```C++
    用法：randomNum = rand();
返回一个非负整数
    该算法需要一个起始值，称为种子，以生成数字。
    种子可以由用户输入，也可以调用time函数生成
```
####  5.1.3. <a name='time'></a>time( )函数
```C++
    获取种子值的另一个常见做法是调用time函数，它是 C++ 标准库的一部分。
time函数返回从 1970 年 1 月 1 日午夜开始到现在逝去的秒数，因此每次运行程序时，它都将提供不同的种子值。
    请注意，在调用它时必须给它传递一个参数 0。
    同时程序中包含一个新的头文件<ctime>，此头文件是使用time函数所必需的。
```
####  5.1.4. <a name='-1'></a>生成随机数模板
```C++
#include<cstdio>
#include<cstdlib>
#include<ctime>
using namespace std;
int main()
{
    unsigned seed;      // Random generator seed
    seed = time(0);     // Use the time function to get a "seed” value for srand
    srand(seed);
                        // Now generate and print three random numbers
    cout << rand() << " " ;
    cout << rand() << " " ;
    cout << rand() << endl;
    return 0;
}
```
或者
```C
void test_rand(void)
{
    unsigned long n;
    srand((unsigned)time(NULL));
    for(int i = 0; i < 100; i++)
    {
        n = rand();
        printf("d\n", n);
    }
}
```
* 若要限制随机数的范围，有公式
  * ①`number = rand() % max + 1`表示生成从1 ~ max范围内的随机数
  * ②`number = (rand()%(maxValue - minValue +1)) + minValue;`表示生成从min ~ max范围内的随机数


```c++

 #include<stdio.h>
 int main()
 {
     
 }

```