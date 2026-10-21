import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class WE implements Runnable {
   final Qg_2 W;
   private static final long a;

   WE(Qg_2 var1) {
      this.W = var1;
   }

   @Override
   public void run() {
      String var1 = Vn_2.C();

      while (true) {
         try {
            Object[] var10000 = com.c.f();
            Method var11 = com.c.d(270389152141252877L);
            Object[] var35 = var10000;
            Object var24 = null;

            try {
               var10000 = (Object[])var11.invoke(var24, var35);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            var24 = com.c.f();
            Method var10003 = com.c.d(410905379772103887L);
            var35 = (Object[])var24;
            var24 = var10000;
            Method var13 = var10003;

            try {
               var10000 = (Yf_2)var13.invoke(var24, var35);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            if (var10000 != null) {
               var10000 = com.c.f();
               Method var16 = com.c.d(270389152141252877L);
               var35 = var10000;
               var24 = null;

               try {
                  var10000 = (Object[])var16.invoke(var24, var35);
               } catch (InvocationTargetException var6) {
                  throw var6.getTargetException();
               }

               var24 = com.c.f();
               var10003 = com.c.d(410905379772103887L);
               var35 = (Object[])var24;
               var24 = var10000;
               Method var18 = var10003;

               try {
                  var10000 = (Object[])var18.invoke(var24, var35);
               } catch (InvocationTargetException var5) {
                  throw var5.getTargetException();
               }

               var24 = com.c.f();
               var10003 = com.c.d(582109538642750681L);
               var35 = (Object[])var24;
               var24 = var10000;
               Method var20 = var10003;

               try {
                  var21 = (Boolean)var20.invoke(var24, var35);
               } catch (InvocationTargetException var4) {
                  throw var4.getTargetException();
               }

               if (var21) {
                  break;
               }
            }
         } catch (InterruptedException var10) {
            throw a(var10);
         }

         try {
            Thread.sleep(a);
         } catch (InterruptedException var9) {
            var9.printStackTrace();
            if (var1 != null) {
               break;
            }
         }
      }

      Method var22 = (Method)com.c.c(227767814287181233L).get(this);
      Object[] var33 = com.c.f();
      Method var44 = com.c.d(417567863675886752L);
      Object[] var41 = var33;
      var33 = var22;
      var22 = var44;

      try {
         var22.invoke(var33, var41);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      long var0 = 3805953201902328409L;
      long var10002 = 3805953201902328410L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





