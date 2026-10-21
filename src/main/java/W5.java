import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class W5 implements Runnable {
   final FM z;

   W5(FM var1) {
      this.z = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(266191841177162341L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(189986363113311747L);
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





