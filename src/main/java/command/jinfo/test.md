### jinfo
```
C:\java\JVM>jps
26448 DemoJinfo
5344 NailgunRunner
21076
5112 Jps
7112 RemoteMavenServer36
18988 DemoJps
21612 Launcher

C:\java\JVM>jinfo 18988
Attaching to process ID 18988, please wait...
Debugger attached successfully.
Server compiler detected.
JVM version is 25.311-b11
Java System Properties:

java.runtime.name = Java(TM) SE Runtime Environment
java.vm.version = 25.311-b11
sun.boot.library.path = C:\Program Files\Java\jdk1.8.0_311\jre\bin
java.vendor.url = http://java.oracle.com/
java.vm.vendor = Oracle Corporation
path.separator = ;
file.encoding.pkg = sun.io
java.vm.name = Java HotSpot(TM) 64-Bit Server VM
sun.os.patch.level =
sun.java.launcher = SUN_STANDARD
user.script =
user.country = CN
user.dir = C:\java\JVM
java.vm.specification.name = Java Virtual Machine Specification
java.runtime.version = 1.8.0_311-b11
java.awt.graphicsenv = sun.awt.Win32GraphicsEnvironment
os.arch = amd64
java.endorsed.dirs = C:\Program Files\Java\jdk1.8.0_311\jre\lib\endorsed
line.separator =

java.io.tmpdir = C:\Users\ycli12\AppData\Local\Temp\
java.vm.specification.vendor = Oracle Corporation
user.variant =
os.name = Windows 10
sun.jnu.encoding = GBK
java.library.path = C:\Program Files\Java\jdk1.8.0_311\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\
Program Files (x86)\Common Files\Oracle\Java\javapath;C:\Program Files\Java\jdk1.8.0_311\bin;C:\Program Files\Java\jd
k1.8.0_311\jre\bin;C:\Program Files (x86)\sbt\bin;C:\MySoftware\apache-maven-3.8.2\bin;C:\Scala\scala-2.12.15\bin;C:\
mysql-8.0.27-winx64\bin;C:\Spark\spark\bin;C:\Spark\spark\sbin;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbe
m;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\hive\apache-hive-2.1.1-bin\bin;C:\hadoo
p\hadoop-2.7.6\bin;C:\hadoop\hadoop-2.7.6\sbin;C:\Program Files (x86)\NetSarang\Xftp 7\;C:\Users\ycli12\AppData\Local
\Microsoft\WindowsApps;;C:\Users\ycli12\AppData\Local\Programs\Microsoft VS Code\bin;C:\Program Files\JetBrains\PyCha
rm 2020.3.2\bin;C:\Program Files\JetBrains\IntelliJ IDEA 2020.2.3\bin;C:\Program Files\JetBrains\GoLand 2020.3.3\bin;
C:\Users\ycli12\go\bin;C:\Users\ycli12\AppData\Local\Programs\Fiddler;C:\Users\ycli12\AppData\Local\Microsoft\Windows
Apps;.
java.specification.name = Java Platform API Specification
java.class.version = 52.0
sun.management.compiler = HotSpot 64-Bit Tiered Compilers
os.version = 10.0
user.home = C:\Users\ycli12
user.timezone = Asia/Shanghai
java.awt.printerjob = sun.awt.windows.WPrinterJob
file.encoding = UTF-8
java.specification.version = 1.8
user.name = ycli12
java.class.path = C:\Program Files\Java\jdk1.8.0_311\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\
deploy.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_311\jre
\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_311\jre
\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_311\jre\
lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_311\
jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8
.0_311\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\j
dk1.8.0_311\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.
0_311\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\j
fxswt.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\management-a
gent.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\resources.j
ar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\rt.jar;C:\java\JVM\target\classes;C:\Program Files\JetBrains\IntelliJ I
DEA 2020.2.3\lib\idea_rt.jar
java.vm.specification.version = 1.8
sun.arch.data.model = 64
sun.java.command = command.jps.DemoJps
java.home = C:\Program Files\Java\jdk1.8.0_311\jre
user.language = zh
java.specification.vendor = Oracle Corporation
awt.toolkit = sun.awt.windows.WToolkit
java.vm.info = mixed mode
java.version = 1.8.0_311
java.ext.dirs = C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext;C:\WINDOWS\Sun\Java\lib\ext
sun.boot.class.path = C:\Program Files\Java\jdk1.8.0_311\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_311\jre
\lib\rt.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\sunrsasign.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jsse
.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\charsets.jar;C:\Pr
ogram Files\Java\jdk1.8.0_311\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_311\jre\classes
java.vendor = Oracle Corporation
file.separator = \
java.vendor.url.bug = http://bugreport.sun.com/bugreport/
sun.io.unicode.encoding = UnicodeLittle
sun.cpu.endian = little
sun.desktop = windows
sun.cpu.isalist = amd64

VM Flags:
Non-default VM flags: -XX:CICompilerCount=4 -XX:InitialHeapSize=257949696 -XX:MaxHeapSize=4127195136 -XX:MaxNewSize=1
375731712 -XX:MinHeapDeltaBytes=524288 -XX:NewSize=85983232 -XX:OldSize=171966464 -XX:+UseCompressedClassPointers -XX
:+UseCompressedOops -XX:+UseFastUnorderedTimeStamps -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC
Command line:  -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.2.3\lib\idea_rt.jar=12929:C:\Program Files\Je
tBrains\IntelliJ IDEA 2020.2.3\bin -Dfile.encoding=UTF-8
```
