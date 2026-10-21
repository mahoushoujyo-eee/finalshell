import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class d0_2 implements Runnable {
   final Ff_2 s;

   d0_2(Ff_2 var1) {
      this.s = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(285773678609041001L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(540679430908090072L);
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





