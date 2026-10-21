import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Dr_2 implements Runnable {
   final String o;
   final BV b;

   Dr_2(BV var1, String var2) {
      this.b = var1;
      this.o = var2;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(300671885637670350L).get(com.c.c(426764604080246614L).get(this));
      Object[] var10001 = com.c.a(com.c.c(353262325720269499L).get(this), true, true);
      Method var10003 = com.c.d(324338769529465951L);
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





