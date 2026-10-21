import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class YX implements MouseMotionListener {
   final Bq_2 U;

   YX(Bq_2 var1) {
      this.U = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      com.c.c(444246150125769098L).setLong(com.c.c(149040079554109209L).get(this), System.currentTimeMillis());
      Method var10000 = (Method)com.c.c(149040079554109209L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(356550171956632315L);
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





