import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Vv_2 implements ComponentListener {
   final aM q;

   Vv_2(aM var1) {
      this.q = var1;
   }

   @Override
   public void componentShown(ComponentEvent var1) {
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      Method var10000 = (Method)com.c.c(253393745237664095L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(487819805049017899L);
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





