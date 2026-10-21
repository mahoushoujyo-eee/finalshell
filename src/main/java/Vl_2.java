import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Vl_2 implements MouseMotionListener {
   final oG_3 Q;

   Vl_2(oG_3 var1) {
      this.Q = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      Method var10000 = (Method)com.c.c(551714858448237927L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(494456998971578926L);
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
   public void mouseDragged(MouseEvent var1) {
   }
}





