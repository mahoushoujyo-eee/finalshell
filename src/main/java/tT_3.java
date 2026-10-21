import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class tT_3 implements Runnable {
   final UZ J;

   tT_3(UZ var1) {
      this.J = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(215526989813745242L).get(com.c.c(587337361913163398L).get(com.c.c(136486683299574244L).get(this)));
      Object[] var10001 = com.c.a(
         com.c.c(587337361913163398L).get(com.c.c(136486683299574244L).get(this)), com.c.c(587337361913163398L).get(com.c.c(136486683299574244L).get(this))
      );
      Method var10003 = com.c.d(582301692004958968L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





