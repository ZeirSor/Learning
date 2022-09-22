#include <iostream>
#include <iomanip>
using namespace std;


//***************************************************************************************
int main_InputAndOutput()
{
	int x;
	cin >> x;		//remember it as 'c' + 'in','in' stands for input;
					//'>>' we can imagine that it just like a pipeline, the things you input will flow into 'x' throught the pipeline
	cout << "x = " << x << endl;	//remember it as 'c' + 'out','out' stands for output
							//'<<' also we can imagine it as a pineline, but differ from the input is that 
							//things which woud be output will flow in the negetive position orderly.
	// namespace
	// it is used to prevent the same name problem in the program.The most common one is "std"
	
	int a, b, c;
	cin >> a >> b >> c;
	cout << c << endl << b << endl << a;
	return 0;
}
//***************************************************************************************


//***************************************************************************************
int main_const()
{
	const int CONST = 3;	//const常量声明 标准格式：const 类型 变量名 = 初值；其中变量名最好用大写；
	cout << CONST << endl;
	return 0;
}
//***************************************************************************************


//***************************************************************************************
int main_NewAndDelete()
{
	int* arr = new int[5];
	for (int i = 0; i < 5; i++) {
		cin >> arr[i];
	}
	for (int i = 0; i < 5; i++) {
		cout << arr[i]<<' ';
	}
	cout << endl;
	
	delete[] arr;
	
	//for (int i = 0; i < 5; i++) {		//会出错
	//	cout << arr[i] << ' ';
	//}

	int* m = new int;
	cin >> m[0];
	cout << m[0];
	cout << m << endl;
	delete m;
	m = nullptr;
	cout << m;


	//cout << m[0];
	return 0;
}
//***************************************************************************************


//***************************************************************************************
int main_cite()
{
	//引用
	//引用是变量的别名
	//引用必须早定义时就初始化
	//一般只用在函数参数上面
	int a = 527;
	int &b = a;
	cout << a << endl;
	cout << &a << endl;
	cout << b << endl;
	cout << &b << endl;
	return 0;
}
//***************************************************************************************


//***************************************************************************************
//函数重载overload
	//函数名可以相同
	//函数返回类型、函数参数类型及参数个数可以不同
	// int add(int a, int b);
	// float add(float a, float b);
	// float add(int a, float b);		这种情况最好不要出现 容易出错
	//调用时 编译器会选择最佳的函数

int sumSq(int a, int b)
{
	return a * a + b * b;
}

int sumSq(double a, int b)
{
	return a * a + b * b;
}

float sumSq(int a, double b)
{
	return a * a + b * b;
}

float sumSq(float a, float b, float c)		//?
{
	return a * a + b * b + c * c;
}

int sumSq(int a, int b, int c)
{
	return a * a + b * b + c * c;
}

int main_testOverload()
{
	cout << sumSq(1, 2) << endl;
	cout << sumSq(1.1, 2) << endl;
	cout << sumSq(1, 2.1) << endl;
	cout << sumSq(1, 2.1, 3) << endl;
	cout << sumSq(1.1, 2.1, 3) << endl;		//?
	return 0;
}
//***************************************************************************************


//***************************************************************************************
//带默认参数值的函数
//	预先给出默认的形参值
//	调用时若有传实参则用实参
//	否则采用默认形参值

int add(int a = 5, int b = 2, int c = 7)
{
	return a + b + c;
}

int main_defaultParameters()
{
	cout << add(1) << endl;
	cout << add(1, 4) << endl;
	cout << add(1, 2, 3) << endl;
	cout << add() << endl;
	return 0;
}
//***************************************************************************************

//begin_practice_1***********************************************************************
//题目要求:
//从标准输入接受整型输入n，动态分配存储空间为n的数组radius。
//从标准输入输入n个浮点数存储在数组radius中，这n个数代表了n个圆的半径。
//编写函数sumArea(double* radius, int n)求这n个圆的面积之和。
//输出总面积，保留小数点后5位。
int main_caclArea(float* radius, int n)
{
	float sum = 0;
	float area;
	const float PI = 3.1415926;
	for (int i = 0; i < n; i++) {
		area = PI * radius[i] * radius[i];
		cout << area << ' ';
		sum += area;
	}
	cout << endl;
	cout << setprecision(5) << sum << endl;
	cout << fixed << setprecision(5) << sum << endl;

	return 0;
}
// 保留小数位参考 https://blog.csdn.net/gyxx1998/article/details/103337790

int main_practice_1()
{
	int n;
	cin >> n;
	float* radius = new float[n];
	for (int i = 0; i < n; i++) {
		cin >> radius[i];
	}
	for (int i = 0; i < n; i++) {
		cout << radius[i]<< ' ';
	}
	cout << endl;
	main_caclArea(radius, n);

	return 0;
}
//end_practice_1*************************************************************************


int main(int argc, char* argv[])
{
	//main_InputAndOutput();
	//main_const();
	//main_NewAndDelete();	
	//main_cite();
	//main_testOverload();
	//main_defaultParameters();
	main_practice_1();

	for (int i = 0; i < argc; i++) {
		cout << argv[i] << endl;
	}
	return 0;
}


