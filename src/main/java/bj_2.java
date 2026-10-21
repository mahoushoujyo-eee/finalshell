import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Bj_2 implements Runnable {
   final F8 A;

   Bj_2(F8 var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(345845810532294667L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(612305338479149688L);
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





