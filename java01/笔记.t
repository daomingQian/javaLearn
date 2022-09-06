1. jdk(java开发包) > jre(java运行环境)+java开发工具 > jvm(java虚拟机)+java核心内裤
2. 配置环境变量 (1) JAVA_HOME: 'jdk文件地址' (2) 上面的path: 加一个 %JAVA_HOME%\bin;
3. java代码 javac编译--> class java运行--> window|Linux|mac;

4. 一个文件只有个public类,可以有多个普通类,main方法可以在任一个类里面,class可以以任意一个类的main开始运行
5. \t \n \r \\ \" \'; 制表符,换行符,回车符,..,..,.. 

6. cd ./下一级目录, 其他磁盘: 直接跳到其他磁盘, exit 关闭cmd
7. 多行注释 /* 多行代码 */, 文档注释有点不太理解以后有机会再看

8. byte 1, short 2, int 4, long(L) 8,  boolean 1, char 2, float(f) 4, double 8;
9. 小数计算是有误差的, 不能直接判断, 可以判断误差值
--自动类型转化
10. char -> int -> long -> float -> double; 类型自动转换 低到高;
11. byte -> short -> int -> long -> float -> double; 类型自动转换 低到高;
12. char 不能与 (byte, short) 互相转换; 他们之间的计算 会转换为int类型
13. 不同类型之间的计算结果 会自动转换为最高级的类型;
14. boolean 和其他类型 不会自动转化 会报错;
--主动类型转化
15. 其他类型转 字符串直接 + "";
16. 字符串转 其他类型 需要 
    Interger.parseInt(字符串); 字符串只能是数字
    Boolean.parseBoolean(字符串); 字符串只能是 "true" 或 "false";
    ...其他都一样
17. 整数/整数 = 整数
18. a%b = a - a/b * b;