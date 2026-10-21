import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class YD implements Runnable {
   final WT O;

   YD(WT var1) {
      this.O = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(354794456661762655L).get(com.c.c(484378731380892109L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(119751058421524022L);
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





