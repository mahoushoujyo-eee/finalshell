import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class VI implements Runnable {
   final mT h;

   VI(mT var1) {
      this.h = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(549431568394920065L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(317796404524602366L);
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





