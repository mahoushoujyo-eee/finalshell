import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class kL_3 implements Runnable {
   final F5 X;

   kL_3(F5 var1) {
      this.X = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(351977148881061934L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(625942730809122781L);
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





