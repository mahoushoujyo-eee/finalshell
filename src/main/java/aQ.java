import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class aQ implements Runnable {
   final T9 C;

   aQ(T9 var1) {
      this.C = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.f();
      Method var3 = com.c.d(270389152141252877L);
      Object[] var9 = var10000;
      Object var6 = null;

      try {
         var10000 = (Object[])var3.invoke(var6, var9);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var6 = com.c.f();
      Method var10003 = com.c.d(579658074404235868L);
      var9 = (Object[])var6;
      var6 = var10000;
      Method var5 = var10003;

      try {
         var5.invoke(var6, var9);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





