import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class xk_2 implements Runnable {
   final yB_3 C;

   xk_2(yB_3 var1) {
      this.C = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(167179888068300774L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(121159855614552174L);
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





