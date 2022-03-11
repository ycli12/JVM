C:\java\JVM>jps
18104 Jps
4968
5896 Launcher
604 DemoJstack
8044 RemoteMavenServer36

C:\java\JVM>jstack -F 604
Attaching to process ID 604, please wait...
Debugger attached successfully.
Server compiler detected.
JVM version is 25.311-b11
Deadlock Detection:

No deadlocks found.

Thread 20: (state = IN_NATIVE)
 - java.net.SocketInputStream.socketRead0(java.io.FileDescriptor, byte[], int, int, int) @bci=0 (Interpreted frame)
 - java.net.SocketInputStream.socketRead(java.io.FileDescriptor, byte[], int, int, int) @bci=8, line=116 (Interpreted
 frame)
 - java.net.SocketInputStream.read(byte[], int, int, int) @bci=117, line=171 (Interpreted frame)
 - java.net.SocketInputStream.read(byte[], int, int) @bci=11, line=141 (Interpreted frame)
 - sun.nio.cs.StreamDecoder.readBytes() @bci=135, line=284 (Interpreted frame)
 - sun.nio.cs.StreamDecoder.implRead(char[], int, int) @bci=112, line=326 (Interpreted frame)
 - sun.nio.cs.StreamDecoder.read(char[], int, int) @bci=180, line=178 (Interpreted frame)
 - java.io.InputStreamReader.read(char[], int, int) @bci=7, line=184 (Interpreted frame)
 - java.io.BufferedReader.fill() @bci=145, line=161 (Interpreted frame)
 - java.io.BufferedReader.readLine(boolean) @bci=44, line=324 (Interpreted frame)
 - java.io.BufferedReader.readLine() @bci=2, line=389 (Interpreted frame)
 - com.intellij.rt.execution.application.AppMainV2$1.run() @bci=36, line=61 (Interpreted frame)


Thread 19: (state = BLOCKED)


Thread 18: (state = BLOCKED)


Thread 17: (state = BLOCKED)
 - java.lang.Object.wait(long) @bci=0 (Interpreted frame)
 - java.lang.ref.ReferenceQueue.remove(long) @bci=59, line=144 (Interpreted frame)
 - java.lang.ref.ReferenceQueue.remove() @bci=2, line=165 (Interpreted frame)
 - java.lang.ref.Finalizer$FinalizerThread.run() @bci=36, line=216 (Interpreted frame)


Thread 16: (state = BLOCKED)
 - java.lang.Object.wait(long) @bci=0 (Interpreted frame)
 - java.lang.Object.wait() @bci=2, line=502 (Interpreted frame)
 - java.lang.ref.Reference.tryHandlePending(boolean) @bci=54, line=191 (Interpreted frame)
 - java.lang.ref.Reference$ReferenceHandler.run() @bci=1, line=153 (Interpreted frame)


Thread 4: (state = IN_NATIVE)
 - java.io.FileInputStream.readBytes(byte[], int, int) @bci=0 (Interpreted frame)
 - java.io.FileInputStream.read(byte[], int, int) @bci=4, line=255 (Interpreted frame)
 - java.io.BufferedInputStream.fill() @bci=214, line=246 (Interpreted frame)
 - java.io.BufferedInputStream.read() @bci=12, line=265 (Interpreted frame)
 - command.jstack.DemoJstack.main(java.lang.String[]) @bci=11, line=8 (Interpreted frame)



C:\java\JVM>jstack -m 604
Attaching to process ID 604, please wait...
Debugger attached successfully.
Server compiler detected.
JVM version is 25.311-b11
Deadlock Detection:

No deadlocks found.

----------------- 0 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 1 -----------------
0x00007ffd6bb63814      ntdll!NtReadFile + 0x14
----------------- 2 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 3 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 4 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 5 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 6 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 7 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 8 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 9 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 10 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 11 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 12 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 13 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 14 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 15 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 16 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
0x00000240f72e8920              ????????
----------------- 17 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 18 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 19 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
0x65706f72702e616a              ????????
----------------- 20 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
0x0000380000074700              ????????
----------------- 21 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
0x0005060000050620              ????????
sun.jvm.hotspot.debugger.DebuggerException: Windbg Error: ReadVirtual failed!
        at sun.jvm.hotspot.debugger.windbg.WindbgDebuggerLocal.readBytesFromProcess0(Native Method)
        at sun.jvm.hotspot.debugger.windbg.WindbgDebuggerLocal.readBytesFromProcess(WindbgDebuggerLocal.java:490)
        at sun.jvm.hotspot.debugger.DebuggerBase$Fetcher.fetchPage(DebuggerBase.java:80)
        at sun.jvm.hotspot.debugger.PageCache.getPage(PageCache.java:178)
        at sun.jvm.hotspot.debugger.PageCache.getLong(PageCache.java:100)
        at sun.jvm.hotspot.debugger.DebuggerBase.readCInteger(DebuggerBase.java:364)
        at sun.jvm.hotspot.debugger.DebuggerBase.readAddressValue(DebuggerBase.java:462)
        at sun.jvm.hotspot.debugger.windbg.WindbgDebuggerLocal.readAddress(WindbgDebuggerLocal.java:316)
        at sun.jvm.hotspot.debugger.windbg.WindbgAddress.getAddressAt(WindbgAddress.java:72)
        at sun.jvm.hotspot.debugger.windows.amd64.WindowsAMD64CFrame.sender(WindowsAMD64CFrame.java:60)
        at sun.jvm.hotspot.tools.PStack.run(PStack.java:161)
        at sun.jvm.hotspot.tools.PStack.run(PStack.java:58)
        at sun.jvm.hotspot.tools.PStack.run(PStack.java:53)
        at sun.jvm.hotspot.tools.JStack.run(JStack.java:66)
        at sun.jvm.hotspot.tools.Tool.startInternal(Tool.java:260)
        at sun.jvm.hotspot.tools.Tool.start(Tool.java:223)
        at sun.jvm.hotspot.tools.Tool.execute(Tool.java:118)
        at sun.jvm.hotspot.tools.JStack.main(JStack.java:92)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at sun.tools.jstack.JStack.runJStackTool(JStack.java:140)
        at sun.tools.jstack.JStack.main(JStack.java:106)
----------------- 22 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
----------------- 23 -----------------
0x00007ffd6bb637d4      ntdll!ZwWaitForSingleObject + 0x14
0x7998533b2a3b0000              ????????

C:\java\JVM>jstack -l 604
2022-03-11 22:12:31
Full thread dump Java HotSpot(TM) 64-Bit Server VM (25.311-b11 mixed mode):

"Service Thread" #11 daemon prio=9 os_prio=0 tid=0x00000240f9781000 nid=0x3f90 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"C1 CompilerThread3" #10 daemon prio=9 os_prio=2 tid=0x00000240f96d5800 nid=0x4044 waiting on condition [0x0000000000
000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"C2 CompilerThread2" #9 daemon prio=9 os_prio=2 tid=0x00000240f96c1000 nid=0x3a88 waiting on condition [0x00000000000
00000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"C2 CompilerThread1" #8 daemon prio=9 os_prio=2 tid=0x00000240f96b9000 nid=0x71c waiting on condition [0x000000000000
0000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"C2 CompilerThread0" #7 daemon prio=9 os_prio=2 tid=0x00000240f96b6800 nid=0x45f4 waiting on condition [0x00000000000
00000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"Monitor Ctrl-Break" #6 daemon prio=5 os_prio=0 tid=0x00000240f96b3800 nid=0x4834 runnable [0x000000b160efe000]
   java.lang.Thread.State: RUNNABLE
        at java.net.SocketInputStream.socketRead0(Native Method)
        at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
        at java.net.SocketInputStream.read(SocketInputStream.java:171)
        at java.net.SocketInputStream.read(SocketInputStream.java:141)
        at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:284)
        at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:326)
        at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:178)
        - locked <0x000000076e1882e0> (a java.io.InputStreamReader)
        at java.io.InputStreamReader.read(InputStreamReader.java:184)
        at java.io.BufferedReader.fill(BufferedReader.java:161)
        at java.io.BufferedReader.readLine(BufferedReader.java:324)
        - locked <0x000000076e1882e0> (a java.io.InputStreamReader)
        at java.io.BufferedReader.readLine(BufferedReader.java:389)
        at com.intellij.rt.execution.application.AppMainV2$1.run(AppMainV2.java:61)

   Locked ownable synchronizers:
        - None

"Attach Listener" #5 daemon prio=5 os_prio=2 tid=0x00000240f72d6000 nid=0x598 waiting on condition [0x000000000000000
0]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"Signal Dispatcher" #4 daemon prio=9 os_prio=2 tid=0x00000240f72e8000 nid=0x132c runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"Finalizer" #3 daemon prio=8 os_prio=1 tid=0x00000240f72a3000 nid=0x23cc in Object.wait() [0x000000b160bff000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x000000076e008ee0> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:144)
        - locked <0x000000076e008ee0> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:165)
        at java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:216)

   Locked ownable synchronizers:
        - None

"Reference Handler" #2 daemon prio=10 os_prio=2 tid=0x00000240f729a800 nid=0x1294 in Object.wait() [0x000000b160aff00
0]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x000000076e006c00> (a java.lang.ref.Reference$Lock)
        at java.lang.Object.wait(Object.java:502)
        at java.lang.ref.Reference.tryHandlePending(Reference.java:191)
        - locked <0x000000076e006c00> (a java.lang.ref.Reference$Lock)
        at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:153)

   Locked ownable synchronizers:
        - None

"main" #1 prio=5 os_prio=0 tid=0x00000240dca19000 nid=0x22ac runnable [0x000000b15feff000]
   java.lang.Thread.State: RUNNABLE
        at java.io.FileInputStream.readBytes(Native Method)
        at java.io.FileInputStream.read(FileInputStream.java:255)
        at java.io.BufferedInputStream.fill(BufferedInputStream.java:246)
        at java.io.BufferedInputStream.read(BufferedInputStream.java:265)
        - locked <0x000000076e05ab10> (a java.io.BufferedInputStream)
        at command.jstack.DemoJstack.main(DemoJstack.java:8)

   Locked ownable synchronizers:
        - None

"VM Thread" os_prio=2 tid=0x00000240f7273000 nid=0x383c runnable

"GC task thread#0 (ParallelGC)" os_prio=0 tid=0x00000240dca30800 nid=0x1c10 runnable

"GC task thread#1 (ParallelGC)" os_prio=0 tid=0x00000240dca32000 nid=0x2894 runnable

"GC task thread#2 (ParallelGC)" os_prio=0 tid=0x00000240dca33800 nid=0x1440 runnable

"GC task thread#3 (ParallelGC)" os_prio=0 tid=0x00000240dca35000 nid=0x482c runnable

"GC task thread#4 (ParallelGC)" os_prio=0 tid=0x00000240dca37000 nid=0x4830 runnable

"GC task thread#5 (ParallelGC)" os_prio=0 tid=0x00000240dca39000 nid=0x2c20 runnable

"GC task thread#6 (ParallelGC)" os_prio=0 tid=0x00000240dca3c000 nid=0x3a70 runnable

"GC task thread#7 (ParallelGC)" os_prio=0 tid=0x00000240dca3d800 nid=0x954 runnable

"GC task thread#8 (ParallelGC)" os_prio=0 tid=0x00000240dca3e800 nid=0x3ac8 runnable

"GC task thread#9 (ParallelGC)" os_prio=0 tid=0x00000240dca3f800 nid=0x48f0 runnable

"VM Periodic Task Thread" os_prio=2 tid=0x00000240f97c1800 nid=0x3518 waiting on condition

JNI global references: 12

