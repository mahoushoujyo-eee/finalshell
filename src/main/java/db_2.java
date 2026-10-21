import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Db_2 implements MouseMotionListener {
   final Vn_2 i;

   Db_2(Vn_2 var1) {
      this.i = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      Method var10000 = (Method)com.c.c(365227874678742036L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(168252186092657055L);
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





