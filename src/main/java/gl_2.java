import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class gl_2 implements Runnable {
   final dJ_3 B;

   gl_2(dJ_3 var1) {
      this.B = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(253496364775430961L).get(com.c.c(573928442214264835L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(250498425434992262L);
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





