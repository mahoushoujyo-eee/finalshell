import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class gM implements Runnable {
   final ca_4 k;
   private static final long a;

   gM(ca_4 var1) {
      this.k = var1;
   }

   @Override
   public void run() {
      while (true) {
         Method var10000 = (Method)com.c.c(458098468214047198L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(475862018592834069L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         try {
            Thread.sleep(a);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }
      }
   }

   static {
      long var0 = 3302110406838298373L;
      long var10002 = 3302110406838298465L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





