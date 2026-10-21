import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class JQ implements MouseMotionListener {
   final Bq_2 H;

   JQ(Bq_2 var1) {
      this.H = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      Method var10000 = (Method)com.c.c(464755288152877617L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(259809416276946956L);
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
      Method var10000 = (Method)com.c.c(464755288152877617L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(259809416276946956L);
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





