# 跳一跳游戏小程序
> 南京邮电大学Java程序设计课程大作业
## 项目要求
* 课题代号： 1
* 课题名称：跳一跳游戏程序
* 课题要求：
    1. 基本要求：
       1. 设计单机版的跳一跳游戏程序。
       2. 基本要求中只需要设计单人游戏模式。
       3. 采用鼠标键控制自己在游戏中的小人，完成起跳（按住鼠标左键不放可以向下压缩脚下的弹簧跳板，释放鼠标左键则进行起跳，按住鼠标左键的时间越长，弹簧跳板被压得越短，小人跳得越远）。
设计一个平面上的矩形游戏窗口，左边为起点，右边为终点。游戏开始时，小人位于起点跳板，右侧有第一个程序自动产生的中间跳板。同时程序开始倒计时。控制小人起跳，如果正确落在中间跳板上，则其右侧下一个中间跳板自动出现，直到小人跳到终点游戏结束。中间跳板个数，长度和高度为程序自动产生，但跳板之间的最长距离需要保证小人能够在最大弹跳时可以到达。当小人跳到右边终点时，游戏获胜结束。屏幕显示小人从起点到终点花费的时间。如果在到达右边终点前倒计时时间到，则游戏失败。如果小人在途中没有跳到跳板上，则游戏失败。
    2. 提高要求：
        1. 设计多回合游戏功能，每个回合的游戏难度不同；设计在游戏中可以用键盘控制小人起跳（按键按下不放压缩跳板，按键释放进行起跳，按下时间决定跳出距离）；如实现了键盘控制起跳功能，在此基础上设计双人对战模式，即两个游戏者，各自用一个按键控制自己的小人起跳。游戏窗口划分为上下两部分，两个游戏者在各自的窗口中游戏，游戏中出现的跳板个数，大小，高度对两个游戏者均相同。在倒计时结束前最先抵达窗口右边终点者获胜；给游戏设计良好的动画效果；给游戏设计良好的声音效果。
* 备注：课题要求（3）中给出的基本要求和提高要求将作为评分依据，根据大作业评分标准进行评分，在基本要求和提高要求以外实现的其它功能不作为评分依据。本大作业课题不需要设计立体版本程序。
