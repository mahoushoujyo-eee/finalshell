import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

class tK_3 implements PopupMenuListener {
   final KQ m;
   final oQ_3 z;

   tK_3(oQ_3 var1, KQ var2) {
      this.z = var1;
      this.m = var2;
   }

   @Override
   public void popupMenuWillBecomeVisible(PopupMenuEvent var1) {
   }

   @Override
   public void popupMenuWillBecomeInvisible(PopupMenuEvent var1) {
      Method var10000 = (Method)com.c.c(518058221808674410L).get(this);
      Object[] var10001 = com.c.a(false);
      Method var10003 = com.c.d(438941361784812150L);
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
   public void popupMenuCanceled(PopupMenuEvent var1) {
      Method var10000 = (Method)com.c.c(518058221808674410L).get(this);
      Object[] var10001 = com.c.a(false);
      Method var10003 = com.c.d(438941361784812150L);
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





