import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Yn_2 implements Runnable {
   final Ln_2 N;
   private static final long a;

   Yn_2(Ln_2 var1) {
      this.N = var1;
   }

   @Override
   public void run() {
      boolean var1 = ln_4.R();
      Method var10000 = (Method)com.c.c(129595593052585232L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(349012733953542138L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var6 = (Boolean)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      if (!var1) {
         if (var6 == 0) {
            return;
         }

         var6 = (int)a;
      }

      int var2 = var6;
      var10000 = com.c.c(129595593052585232L).get(this);
      var10001 = com.c.a(var2);
      var10003 = com.c.d(278542859830713193L);
      var10002 = var10001;
      var10001 = (Object[])var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   static {
      long var0 = 4470594266267196051L;
      long var10002 = -8297652392963248221L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





