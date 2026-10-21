import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class O7 implements Runnable {
   final Qh_2 A;
   final U E;
   private static final long a;

   O7(U var1, Qh_2 var2) {
      this.E = var1;
      this.A = var2;
   }

   @Override
   public void run() {
      String[] var1 = F8.y();

      while (true) {
         Object[] var10000 = com.c.f();
         Method var9 = com.c.d(270389152141252877L);
         Object[] var28 = var10000;
         Object var19 = null;

         try {
            var10000 = (Object[])var9.invoke(var19, var28);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var19 = com.c.f();
         Method var10003 = com.c.d(296847891750502060L);
         var28 = (Object[])var19;
         var19 = var10000;
         Method var11 = var10003;

         try {
            var10000 = (pG)var11.invoke(var19, var28);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         label58:
         if (var10000 == null) {
            try {
               Thread.sleep(a);
            } catch (InterruptedException var8) {
               var8.printStackTrace();
               if (var1 == null) {
                  continue;
               }
               break label58;
            }

            if (var1 == null) {
               continue;
            }
            break;
         }

         var10000 = com.c.f();
         Method var14 = com.c.d(270389152141252877L);
         var28 = var10000;
         var19 = null;

         try {
            var10000 = (Object[])var14.invoke(var19, var28);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var19 = com.c.f();
         var10003 = com.c.d(296847891750502060L);
         var28 = (Object[])var19;
         var19 = var10000;
         Method var16 = var10003;

         try {
            var10000 = (Object[])var16.invoke(var19, var28);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var19 = com.c.a(com.c.c(613453992252475315L).get(this));
         var10003 = com.c.d(575690921154627974L);
         var28 = (Object[])var19;
         var19 = var10000;
         Method var18 = var10003;

         try {
            var18.invoke(var19, var28);
            break;
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }

   static {
      long var0 = 2117471273568922787L;
      long var10002 = 2117471273568922784L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





