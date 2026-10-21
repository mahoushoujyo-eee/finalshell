import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class uX_3 implements Runnable {
   final yT_3 e;

   uX_3(yT_3 var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      com.ky_4[] var1 = yT_3.c();
      yT_3 var10000 = (yT_3)com.c.c(595259318578023995L).get(this);
      if (var1 != null) {
         if (!com.c.c(309441501335294259L).getBoolean(var10000)) {
            return;
         }

         var10000 = (yT_3)com.c.c(595259318578023995L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(223833355588839652L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         Method var4 = var10003;

         try {
            var4.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }

         var10000 = (yT_3)com.c.c(595259318578023995L).get(this);
      }

      com.c.c(309441501335294259L).setBoolean(var10000, false);
   }
}





