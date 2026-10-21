import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class OM implements Runnable {
   final U z;

   OM(U var1) {
      this.z = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(428884336772749219L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(267463681951434232L);
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





