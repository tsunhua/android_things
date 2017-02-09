Android UI体系
-------

### 概述

Android应用中的所有用户界面元素都是使用View和ViewGroup对象构建而成。

- View对象：用于在屏幕上绘制可供用户交互的内容
- ViewGroup对象：用于存储其他View和ViewGroup对象，以便定义界面的布局

ViewGroup是View的子类，所以拥有View所未有的布局相关的方法。

Android允许通过XML定义布局，Android的资源管理器会加载XML文件，将布局的每个节点初始化为运行时对象供你调用。

### 布局

使用XML声明UI的优点：更好地将应用的外观与控制应用行为的代码隔离。

XML属性：包括所有View通用的、特定View专有的、ViewGroup需要的布局参数。

ID属性：对View对象进行唯一标识。其值通过字符串定义，Android会在R类中创建关联的整型ID。

布局参数：ViewGroup通过LayoutParams布局子类，最基本的ViewGroup.LayoutParams有宽高的属性。子类可以扩展定义更多的布局参数。

布局位置：通过一对水平向左和垂直向上坐标表示。

尺寸：通过宽高表示，视图实际上具有两对宽度和高度值。

- 测量宽度和测量高度：这些尺寸定义视图想要在其父项内具有的大小
- （绘制）宽度和（绘制）高度：定义视图在绘制时或布局后在屏幕上的实际尺寸
- 测量尺寸时需要包含内边距。视图可以定义内边距。

#### 动态布局

当布局的内容属于动态或未预先确定的内容时，可以使用子类AdapterView（通常是列表布局、网格布局和瀑布流布局），用视图填充内容。AdapterView的子类Adapter将数据与其布局绑定，充当数据源与AdapterView的中间人（其实就是适配器模式）。

#### 线性布局（LinearLayout）

![img](https://developer.android.google.cn/images/ui/linearlayout.png)

特性：

- 使所有子视图在单个方向（垂直或水平）保持对齐。
- 可以分配权重，确定子视图的宽高的占比。

#### 相对布局（RelativeLayout）

![img](https://developer.android.google.cn/images/ui/relativelayout.png)

特性：

- 根据子视图间的相对关系确定子视图的位置，有助于减少视图嵌套
- 也可以相对父布局确定位置和对齐方式

#### RecyclerView

特性：

- 通过有限的复用的视图展示大量的动态数据。

工作流：

