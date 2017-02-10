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



