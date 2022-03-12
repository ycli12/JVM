### -XX:+PrintGC
[GC (Allocation Failure)  12736K->11345K(49152K), 0.0035421 secs]

### -XX:+PrintGCDetails

```
[GC（是young gc） (Allocation Failure（垃圾回收的原因）) [PSYoungGen（使用的垃圾回收器，PS for Parallel Scavage）: 12736K（回收前的大小）->2032K（回收后的大小）(14848K)（总的大小）] 12736K->11309K(49152K)（总的堆的大小）, 0.0042944 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
Heap
 PSYoungGen      total 14848K, used 11838K [0x00000000fef80000, 0x0000000100000000, 0x0000000100000000)
  eden space 12800K, 76% used [0x00000000fef80000,0x00000000ff9137c0,0x00000000ffc00000)
  from space 2048K, 99% used [0x00000000ffc00000,0x00000000ffdfc110,0x00000000ffe00000)
  to   space 2048K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x0000000100000000)
 ParOldGen       total 34304K, used 9277K [0x00000000fce00000, 0x00000000fef80000, 0x00000000fef80000)
  object space 34304K, 27% used [0x00000000fce00000,0x00000000fd70f5a0,0x00000000fef80000)
 Metaspace       used 3310K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 360K, capacity 388K, committed 512K, reserved 1048576K
```


### -XX:+PrintGCDetails -XX:+PrintGCDateStamps
2022-03-12T09:21:30.119+0800: [GC (Allocation Failure) [PSYoungGen: 12736K->2020K(14848K)] 12736K->11349K(49152K), 0.0076397 secs] [Times: user=0.11 sys=0.01, real=0.01 secs] 
Heap
 PSYoungGen      total 14848K, used 11826K [0x00000000fef80000, 0x0000000100000000, 0x0000000100000000)
  eden space 12800K, 76% used [0x00000000fef80000,0x00000000ff9137c0,0x00000000ffc00000)
  from space 2048K, 98% used [0x00000000ffc00000,0x00000000ffdf9110,0x00000000ffe00000)
  to   space 2048K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x0000000100000000)
 ParOldGen       total 34304K, used 9329K [0x00000000fce00000, 0x00000000fef80000, 0x00000000fef80000)
  object space 34304K, 27% used [0x00000000fce00000,0x00000000fd71c5a0,0x00000000fef80000)
 Metaspace       used 3310K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 360K, capacity 388K, committed 512K, reserved 1048576K

### -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintHeapAtGC
{Heap before GC invocations=1 (full 0):
 PSYoungGen      total 14848K, used 12736K [0x00000000fef80000, 0x0000000100000000, 0x0000000100000000)
  eden space 12800K, 99% used [0x00000000fef80000,0x00000000ffbf00a0,0x00000000ffc00000)
  from space 2048K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x0000000100000000)
  to   space 2048K, 0% used [0x00000000ffc00000,0x00000000ffc00000,0x00000000ffe00000)
 ParOldGen       total 34304K, used 0K [0x00000000fce00000, 0x00000000fef80000, 0x00000000fef80000)
  object space 34304K, 0% used [0x00000000fce00000,0x00000000fce00000,0x00000000fef80000)
 Metaspace       used 3287K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 358K, capacity 388K, committed 512K, reserved 1048576K
0.127: [GC (Allocation Failure) [PSYoungGen: 12736K->2032K(14848K)] 12736K->11289K(49152K), 0.0041171 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
Heap after GC invocations=1 (full 0):
 PSYoungGen      total 14848K, used 2032K [0x00000000fef80000, 0x0000000100000000, 0x0000000100000000)
  eden space 12800K, 0% used [0x00000000fef80000,0x00000000fef80000,0x00000000ffc00000)
  from space 2048K, 99% used [0x00000000ffc00000,0x00000000ffdfc110,0x00000000ffe00000)
  to   space 2048K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x0000000100000000)
 ParOldGen       total 34304K, used 9257K [0x00000000fce00000, 0x00000000fef80000, 0x00000000fef80000)
  object space 34304K, 26% used [0x00000000fce00000,0x00000000fd70a5b0,0x00000000fef80000)
 Metaspace       used 3287K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 358K, capacity 388K, committed 512K, reserved 1048576K
}
Heap
 PSYoungGen      total 14848K, used 11838K [0x00000000fef80000, 0x0000000100000000, 0x0000000100000000)
  eden space 12800K, 76% used [0x00000000fef80000,0x00000000ff913800,0x00000000ffc00000)
  from space 2048K, 99% used [0x00000000ffc00000,0x00000000ffdfc110,0x00000000ffe00000)
  to   space 2048K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x0000000100000000)
 ParOldGen       total 34304K, used 9257K [0x00000000fce00000, 0x00000000fef80000, 0x00000000fef80000)
  object space 34304K, 26% used [0x00000000fce00000,0x00000000fd70a5b0,0x00000000fef80000)
 Metaspace       used 3310K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 360K, capacity 388K, committed 512K, reserved 1048576K


