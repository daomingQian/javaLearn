1. jdk(java开发包) > jre(java运行环境)+java开发工具 > jvm(java虚拟机)+java核心内裤
2. 配置环境变量 (1) JAVA_HOME: 'jdk文件地址' (2) 上面的path: 加一个 %JAVA_HOME%\bin;
3. java代码 javac编译--> class java运行--> window|Linux|mac;

4. 一个文件只有个public类,可以有多个普通类,main方法可以在任一个类里面,class可以以任意一个类的main开始运行
5. \t \n \r \\ \" \'; 制表符,换行符,回车符,..,..,.. 

6. cd ./下一级目录, 其他磁盘: 直接跳到其他磁盘, exit 关闭cmd
7. 多行注释 /* 多行代码 */, 文档注释有点不太理解以后有机会再看

第三章 类型和类型转换
8. byte 1, short 2, int 4, long(L) 8,  boolean 1, char 2, float(f) 4, double 8;
9. 小数计算是有误差的, 不能直接判断, 可以判断误差值
--自动类型转化
10. char -> int -> long -> float -> double; 类型自动转换 低到高;
11. byte -> short -> int -> long -> float -> double; 类型自动转换 低到高;
不能返过来 倒着转
12. char 不能与 (byte, short) 互相转换; 他们之间的计算 会转换为int类型
13. 不同类型之间的计算结果 会自动转换为最高级的类型;
14. boolean 和其他类型 不会自动转化 会报错;
--主动类型转化
15. 其他类型转 字符串直接 + "";
16. 字符串转 其他类型 需要 
    Interger.parseInt(字符串); 字符串只能是数字
    Boolean.parseBoolean(字符串); 字符串只能是 "true" 或 "false";
    ...其他都一样

第四章运算符
17. 整数/整数 = 整数
18. a%b = a - int()a/b * b;

19. 正数的源码,反码,补码 都一样(三码合一);
20. 负数的反码 = 符号位不变, 其他位取反; 负数的补码 = 反码+1; 反码 = 补码-1;
21. 运算都是补码运算, 显示都是源码, 如果补码时负数的, 需要转换成源码: 补码+1 -> 反码 -> 源码
22. &, | , ~ , ^ , >>(高位由符号位补充) , << , >>>(高位由0补充) 也叫无符号位右移; 正数的>> 与 >>> 一样
23. 2进制 转 8进制 通过3位一转, 2进制 转 16进制 通过4位一转, 反之一样
24. 10进制转 2,8,16进制; 通过倒除法;
25. 2, 8, 16进制 转 10进制. 通过 2, 8, 16 * 1e几次方

