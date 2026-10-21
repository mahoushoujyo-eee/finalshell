import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class DY implements Runnable {
   final F_ y;

   DY(F_ var1) {
      this.y = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(610729099331163660L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(383484095973190497L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10000 = (Method)com.c.c(610729099331163660L).get(this);
      var10001 = com.c.f();
      var10003 = com.c.d(612990022110170911L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





