# Command Line
## 命令行界面
命令行界面Command Line Interface, 简称CLI.

通过一行一行的输入命令来操作计算机的界面，主要的输入设备是键盘命令行界面是一种UI: Character User Interface(字符用户界面，CUI)
是图形用户界面(GUI)普及前最普遍的用户界面
### 图形用户界面，Graphical User Interface (GuI)
    通过窗口、图标、按钮等图形的操作计算机的界面，主要的输入设备是鼠标/手指

操作难度低(对于普通人更加友好，降低了计算机的普及的门槛)

eg
1. `date`时间
2. `ls` 查看文件

## 目录和路径相关操作
### 目录
目录,directory,缩写为dir

工作目录

`pwd`:打印工作目录(print working directory)

子目录

`ls`/`dir`:查看目录内容列表

`ls -a`或`ls -all` 列出全部文件(包括隐藏)

`ls -l` 以长格式列出详细信息, long format

组合`ls -al`

以上两个Windows不支持
在Windows Powershell中也可用`Get-ChildItem`

父目录
用`..`表示

根目录
用`/`表示,windows下默认`\`,也支持`/`,  返回最顶层

主目录(用户目录)
用`~`表示

`cd 目标目录路径`: 更换目录(change directory)

盘符    一般从`C:`开始, 不区分大小写, 可省略`cd`



### 路径
路径,Path,表示文件或目录位置

分隔符  `/`, windows默认`\`

绝对路径    从根目录出发的路径, Windows下为从盘符出发的路径

相对路径    从工作目录出发的路径, 一般以`.`或者`..`开始; 通常`./`或`.\`可以省略

`cls`   清屏

`exit`  退出

## 命令参数


有时命令后带参数

`命令 参数1 参数2`不用参数以空格分隔, 如果参数本身有空格需要加`""`引导

参数分为有flag参数和无flag参数, flag以前缀`-`或`--`标识, 一些flag可以组合使用

`-flag`     无值的flag

`-flag value/-flag=value/-flag:value `      有值的flag

### 文件夹相关操作
`mkdir [-m UGO/ -p][带路径]文件名`     创建文件夹

-m  配置权限

-p  如果父级文件夹不存在, 则连父级文件夹一同创建

`rmdir [带路径]文件夹名`

'del 文件名'        删除文件

## 文件常用操作

`cp [-i/-p/-r] 源文件 目标文件`     复制并命名, copy

    -i, 覆盖前确认, interactive
    -p, 同时复制文件属性, preserve 
    -r, 复制文件夹, recursive 

`cp [-i/-p/-r] 源文件1[源文件2] 目标目录`       复制到指定目录, copy

例如    
`cp f1.txt D:`表示把f1.txt复制到D: ; 

`cp f1.txt D:\f2.txt`表示把f1.txt复制到D:并改名为f2.txt

`mv [-i/-f] 源文件 目标文件`        移动并命名, copy

    -i, 覆盖前确认, interactive
    -f, 强制覆盖, force

`mv [-i/-f] 源文件1[源文件2] 目标目录`      移动到指定目录, copy

`rm [-i/-f/-r] 文件1[文件2]`        删除, remove

    -i, 删除前提示, interactive
    -f, 强制删除, force    
    -r, 删除文件夹, recursive

## 管理员
    Superuser(超级用户/管理员)，是操作系统中拥有更高权限的用户身份。
为了防止让恶意/小白/用户/软件不对整个系统产生不利影响，一些权限─般预留给有经验的被授权的用户使用。实际中管理员账户的名称可能是root(unix中唯一有权限操作根目录的账户)、administrator等。

`su [-l/-m] [用户]`(Windows不支持)      切换用户

    -l, 重新登陆, login, "l"可省略
    -m, 保持原环境变量, maintain用户为"root"时可以省略用户
``

`sudo 要运行的命令`     以超级用户的身份运行命令, superuser do

## 环境变量
Environment variables(环境变量)，是程序运行环境的一部分，由变量名和变量值构成.

程序可以根据环境变量访问到一些每台电脑都有，但是不一定每台电脑都一样的目录;如`$home`(home为变量名)，代表当前用户的目录，一般为`/Users/用户名`(变量值);一般以`$变量名`或`%变量名%`<sup>windows</sup>. 来访问环境变量; 一个变量名可能对应多个值

### windows
`S变量名="变量值"`      添加/修改临时环境变量(引号不是必须的)

### 非windows
`env`       查看环境变量, environment

`export 变量名="变量值"`         添加/修改临时环境变量(引号不是必须的)

`source/.被引用的文件`      引用一个配置文件

## 软件包管理工具
    软件包管理工具可以帮我们简化常见软件包的安装; 比如自动安装所需依赖, 自动配置环境变量, 自动添加开机自启等配置; 一般需要超级用户权限
Chocolatey-Windows

官网: https://chocolatey.org/

介绍与教程: https://www.jianshu.com/p/f6c4d261f356

## conda常用命令
    conda优势: 可以构建多个python虚拟环境, 彼此隔离, 互不干扰
 `conda -V`     查看版本信息

 `conda update condqa`      更新版本
 
 `conda env list`       查看虚拟环境列表(默认环境`base`, 后带`*`)     
 
 `conda -n 新环境名字 python=3.7(这里是版本号)`     创建新环境
 
 `conda activate 环境名字`      切换/激活环境
 
 `conda deactivate 环境名字`      退出环境

`conda list`        列出对应环境已安装的包

`conda install numpy`       安装numpy

`conda search numpy`        查看安装包的版本

`conda remove numpy`        删除包

`conda remove -n 环境名 --all`      删除环境(记得先退出环境)
