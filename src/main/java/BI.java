import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class BI implements Runnable {
   final YI S;
   private static final long a;

   BI(YI var1) {
      this.S = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var5) {
         var5.printStackTrace();
      }

      Object[] var10000 = com.c.f();
      Method var6 = com.c.d(270389152141252877L);
      Object[] var16 = var10000;
      Object var11 = null;

      try {
         var10000 = (Object[])var6.invoke(var11, var16);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var11 = com.c.f();
      Method var10003 = com.c.d(377280722715900564L);
      var16 = (Object[])var11;
      var11 = var10000;
      Method var8 = var10003;

      try {
         var10000 = (Object[])var8.invoke(var11, var16);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var11 = com.c.a(com.c.c(377371690155578360L).get(com.c.c(418950108620675427L).get(this)));
      var10003 = com.c.d(507595107774603013L);
      var16 = (Object[])var11;
      var11 = var10000;
      Method var10 = var10003;

      try {
         var10.invoke(var11, var16);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   static {
      long var0 = 7981388552316499215L;
      long var10002 = 7981388552316498979L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





