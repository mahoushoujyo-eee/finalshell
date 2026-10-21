import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class UM implements Runnable {
   final f3_2 w;

   UM(f3_2 var1) {
      this.w = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(432539051267499093L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(503996986995373182L);
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





