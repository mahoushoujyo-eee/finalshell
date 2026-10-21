import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class yw_4 implements Runnable {
   final FK G;

   yw_4(FK var1) {
      this.G = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(520085588810419933L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(141175834513271564L);
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





