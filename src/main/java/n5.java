import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class n5 implements Runnable {
   final F_ Y;

   n5(F_ var1) {
      this.Y = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(427720727773808476L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(555408631921586293L);
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





