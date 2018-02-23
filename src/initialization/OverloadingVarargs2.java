//: initialization/OverloadingVarargs2.java
package initialization; /* Added by Eclipse.py */
// {CompileTimeError} (Won't compile)

public class OverloadingVarargs2 {
  static void f(float i, Character... args) {
    System.out.println("first");
  }
  static void f(char c,Character... args) {
    System.out.print("second");
  }
  public static void main(String[] args) {
    f(1, 'a');
    f('a', 'b');
      /**
       * 这里我在第二个f方法里面添加了一个char c使得程序和OverloadingVarargs3一样了
       */
  }
} ///:~
