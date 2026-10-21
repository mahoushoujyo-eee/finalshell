import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class xn_2 implements Runnable {
   final u__2 I;

   xn_2(u__2 var1) {
      this.I = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(287611408882635703L).get(com.c.c(276732548056820562L).get(this));
      Object[] var10001 = com.c.a(com.c.c(149407827136588388L).getInt(null), true);
      Method var10003 = com.c.d(547792367998174127L);
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





