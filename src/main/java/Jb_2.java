import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Jb_2 implements Runnable {
   final g_ f;

   Jb_2(g_ var1) {
      this.f = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(332928532684882633L).get(com.c.c(494329747335816596L).get(com.c.c(377408411119867282L).get(this)));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(149160680229662748L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(615229640085119640L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





