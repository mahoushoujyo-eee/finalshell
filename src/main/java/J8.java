import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class J8 extends Thread {
   final Jx_2 Q;
   private static final long a;

   J8(Jx_2 var1) {
      this.Q = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }

         Method var10000 = (Method)com.c.c(424677657916615795L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(391362407042412196L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      }
   }

   static {
      long var0 = 3186634981635917129L;
      long var10002 = 3186634981635916901L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





