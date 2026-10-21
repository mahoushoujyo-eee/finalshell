import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Qz_2 implements Runnable {
   final File j;
   final U I;
   final d9_2 g;

   Qz_2(d9_2 var1, File var2, U var3) {
      this.g = var1;
      this.j = var2;
      this.I = var3;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(483663784764278403L).get(com.c.c(370007062679519157L).get(this));
      Object[] var10001 = com.c.a(com.c.c(248333035757884415L).get(this), com.c.c(351404065837575042L).get(this));
      Method var10003 = com.c.d(594337148944086925L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





