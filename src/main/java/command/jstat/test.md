### jps查看进程
```
C:\java\JVM>jps
26448 DemoJinfo
5344 NailgunRunner
21076
7112 RemoteMavenServer36
15724 Jps
18988 DemoJps
21612 Launcher
```

### 查看类加载情况
```
C:\java\JVM>jstat -class 26448
Loaded  Bytes  Unloaded  Bytes     Time
   625  1260.1        0     0.0       0.11
```

### 查看即时编译器编译情况
```
C:\java\JVM>jstat -compiler 26448
Compiled Failed Invalid   Time   FailedType FailedMethod
      70      0       0     0.03          0
```

### gc情况
可以看到新生代和老年代使用情况和gc次数、时间
```
C:\java\JVM>jstat -gc 768
 S0C    S1C    S0U    S1U      EC       EU        OC         OU       MC     MU    CCSC   CCSU   YGC     YGCT    FGC
   FGCT     GCT
10240.0 10240.0  0.0    0.0   63488.0   8397.0   167936.0     0.0     4480.0 778.0  384.0   76.6       0    0.000   0
      0.000    0.000
```
### 查看内存使用比例
```
C:\java\JVM>jstat -gcutil 7772
  S0     S1     E      O      M     CCS    YGC     YGCT    FGC    FGCT     GCT
  0.00  94.70  26.76  40.00  78.23  81.79      1    0.011     0    0.000    0.011
```