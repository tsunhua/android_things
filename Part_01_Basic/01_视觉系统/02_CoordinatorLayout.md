## CoordinatorLayout

作用：作为根布局，协调子控件间的行为。

AppBarLayout：允许toolbar与其他View一起相应滚动事件。

CollapsingToolbarLayout：可以让toolbar跟随其他View滚动，折叠。

嵌套关系：

CoordinatorLayout

​	-- AppbarLayout

​		-- CollapsingToolbarLayout

​			-- Toolbar

​			-- OtherViews

​	-- NestedScrollView



CollapsingToolbarLayout需要添加滚动标记（layout_ScrollFlags），说明当NestedScrollView滚动时将如何改变自身的行为（滚动行为）：

- scroll：滚动

- exitUntilCollapsed：

- enterAlways：进入时总是可以滚动

- enterAlwaysCollapsed：进入时总是可以下陷

- ​

  ​