import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class oO_3 implements Runnable {
   final Ln_2 E;

   oO_3(Ln_2 var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      boolean var1 = ln_4.R();
      Ln_2 var10000 = (Ln_2)com.c.c(556455112978357862L).get(this);
      if (!var1) {
         if ((Fc_2)com.c.c(538673647573365483L).get(var10000) != null) {
            var10000 = (Ln_2)com.c.c(538673647573365483L).get(com.c.c(556455112978357862L).get(this));
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(507718653540547382L);
            Object[] var10002 = var10001;
            var10001 = var10000;
            Method var4 = var10003;

            try {
               var4.invoke(var10001, var10002);
            } catch (InvocationTargetException var2) {
               throw var2.getTargetException();
            }
         }

         var10000 = (Ln_2)com.c.c(556455112978357862L).get(this);
      }

      com.c.c(257898823081515939L).setBoolean(var10000, false);
   }
}





