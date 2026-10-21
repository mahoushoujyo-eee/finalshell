import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Ce_2 implements Runnable {
   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(525809009753943217L).get(null);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(580193852202659773L);
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





