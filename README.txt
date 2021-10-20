-------------------------------------------
                导入教程
-------------------------------------------
1.打开idea界面
2.选择从vsc导入项目
3.URL处填写项目的ssl地址（http一般连不上）
4.等待克隆（克隆时需要在socket和ssr环境下）
-------------------------------------------
                 推送
-------------------------------------------
1.推送时先推送至个人分支，确定无误后再合并到主分支
2.提交的格式参考规范如下

其中<type>内为必填内容,<?body><?footer>（?）为选填内容

<type>(影响范围)（提交目的简述）: feat(添加新功能)|fix(修补bug)|docs(修改文档)|style(修改样式不影响代码的运行逻辑)|refactor(代码重构)|test(增加测试)|chore(构建过程或者辅助工具变动)

<?body>:此处填写提交的详细改动，包括更改了哪些文件，增删改了什么内容

<?footer>:
「不兼容变动」。如果当前代码与上一个版本不兼容，则 Footer 部分以BREAKING CHANGE开头，后面是对变动的描述、以及变动理由和迁移方法
「关闭Issue」。如果当前 commit 针对某个issue，那么可以在 Footer 部分关闭这个 issue 


示例:
1.
<feat>:大当量tnt
<body>:增加了新的方块<大当量tnt>,增加了big_tnt.java和event.java中的一段运行逻辑(xx-xx行)

2.
<fix>(big_tnt.java & event.java):
<body>:修复了方块<大当量tnt>不会爆炸的bug
<footer>:关闭issue 6

3.
<docs>:增加了文档xxx.txt

4.
<refactor>(big_tnt.java):重构
<body>:修改了方法xxxxxxxx,修改了某个功能的运行逻辑
<footer>(BREAKING CHANGE):修改某功能的运行逻辑放弃了旧的xxxxx方法，使用了新的xxxxx方法，不兼容版本xxx及以下的开发环境
