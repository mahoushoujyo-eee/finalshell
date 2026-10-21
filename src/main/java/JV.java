import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class JV implements Runnable {
   final CB y;

   JV(CB var1) {
      this.y = var1;
   }

   @Override
   public void run() {
      String[] var1 = KV.b();
      CB var10000 = (CB)com.c.c(425507471413967389L).get(this);
      if (var1 == null) {
         if (!com.c.c(288681454708139251L).getBoolean(var10000)) {
            return;
         }

         var10000 = (CB)com.c.c(425507471413967389L).get(this);
      }

      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(384639163675728627L);
      Object[] var10002 = var10001;
      CB var4 = var10000;
      Method var3 = var10003;

      try {
         var3.invoke(var4, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





