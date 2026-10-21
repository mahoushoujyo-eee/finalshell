import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class LX implements ComponentListener {
   final yB_3 V;

   LX(yB_3 var1) {
      this.V = var1;
   }

   @Override
   public void componentShown(ComponentEvent var1) {
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      Method var10000 = (Method)com.c.c(219012725260767547L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(363067491039837712L);
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
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
   }
}





