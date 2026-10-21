import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class O9 implements Runnable {
   final FK E;

   O9(FK var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(464128336754552796L).get(this);
      Object[] var10001 = com.c.a(false);
      Method var10003 = com.c.d(238155532020070409L);
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





