import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Dc_2 extends ComponentAdapter {
   final U A;

   Dc_2(U var1) {
      this.A = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      Method var10000 = (Method)com.c.c(341968994965858136L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(138331449693050657L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      Method var10000 = (Method)com.c.c(341968994965858136L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(138331449693050657L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





