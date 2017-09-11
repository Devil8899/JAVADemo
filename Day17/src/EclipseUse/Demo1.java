package EclipseUse;

import java.util.ArrayList;
import java.util.List;

/*快捷键的配置，常用快捷键：
 
内容提示：
Alt + /  
例如: System.out.println(); 语句 ,syso再按住alt 和/ 就会补全.
	   忘记某个类如何书写,可以写出一部分,按住alt 和/ 就会有提示.
快速修复：

Ctrl + 1
	例如,程序有编译期异常,或者需要导包.使用该快捷键.会有相关提示.
	
导包：
Ctrl + shift + O
	如果需要导入的包比较多,可以一次性全部导入,也会将多余的包清理掉.
格式化代码块：
Ctrl + Shift + F

代码位置调换：
Alt+上下键
添加/除去单行注释 
Ctrl+/
添加/除去多行注释 
Ctrl+Shift+/
Ctrl+Shift+\
重置透视图：window->reset perspective
	当eclipse 的Java视图变的很乱的时候,就可以重置透视图,还原为最初的界面.
大小写转换
更改为大写 Ctrl+Shift+X
更改为小写 Ctrl+Shift+Y
复制行
 Ctrl+Alt+向下键
查看源代码
1、Ctrl+单击 需要查看源码的类
2、Ctrl+Shift+T
删除:
1.Ctrl + D            删除当前行

断点调试   右击 Debug  可以让程序停留在指定的地方，然后去看目前程序的数据。然后分析错误原因
    step over 跳过本行代码  f6   进入下一行
    step into 进入方法内部  f5
    step return 结束方法 返回数据 f7

*/
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String> str=new ArrayList<String>();
         str.add("jerry");
         
	}

}
