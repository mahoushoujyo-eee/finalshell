import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class QZ implements Runnable {
   final ca_4 w;

   QZ(ca_4 var1) {
      this.w = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(510787872752501177L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(283552467042563158L);
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





