Found one Java-level deadlock:
=============================
"Thread-1":
  waiting to lock monitor 0x000001ce400defe8 (object 0x000000076e297e38, a java.lang.Object),
  which is held by "Thread-0"
"Thread-0":
  waiting to lock monitor 0x000001ce400e1878 (object 0x000000076e297e48, a java.lang.Object),
  which is held by "Thread-1"

Java stack information for the threads listed above:
===================================================
"Thread-1":
        at command.jstack.DemoJstackDeadLock$Thread2.run(DemoJstackDeadLock.java:40)
        - waiting to lock <0x000000076e297e38> (a java.lang.Object)
        - locked <0x000000076e297e48> (a java.lang.Object)
        at java.lang.Thread.run(Thread.java:748)
"Thread-0":
        at command.jstack.DemoJstackDeadLock$Thread1.run(DemoJstackDeadLock.java:23)
        - waiting to lock <0x000000076e297e48> (a java.lang.Object)
        - locked <0x000000076e297e38> (a java.lang.Object)
        at java.lang.Thread.run(Thread.java:748)

Found 1 deadlock.
