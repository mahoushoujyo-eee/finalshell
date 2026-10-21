import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class BW implements ComponentListener {
   final Bq_2 p;
   final U u;
   final yN_3 s;

   BW(yN_3 var1, Bq_2 var2, U var3) {
      this.s = var1;
      this.p = var2;
      this.u = var3;
   }

   @Override
   public void componentShown(ComponentEvent var1) {
      Point var2 = new Point();
      Point var3 = MouseInfo.getPointerInfo().getLocation();
      Point var4 = ((Bq_2)com.c.c(235474809631262608L).get(this)).getLocationOnScreen();
      var2.x = var3.x
         - (
            var4.x
               - ((U)com.c.c(297636157862580024L).get(this)).getLocationOnScreen().x
               + ((Point)com.c.c(161378981027509202L).get(com.c.c(479413945485822457L).get(com.c.c(312271273134902461L).get(this)))).x
         );
      var2.y = var3.y
         - (
            var4.y
               - ((U)com.c.c(297636157862580024L).get(this)).getLocationOnScreen().y
               + ((Point)com.c.c(161378981027509202L).get(com.c.c(479413945485822457L).get(com.c.c(312271273134902461L).get(this)))).y
         );
      ((U)com.c.c(297636157862580024L).get(this)).setLocation(var2);
      Object[] var10000 = com.c.a(com.c.c(297636157862580024L).get(this));
      Method var6 = com.c.d(214213921318960935L);
      Object[] var8 = var10000;
      Object var7 = null;

      try {
         var6.invoke(var7, var8);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      ((U)com.c.c(297636157862580024L).get(this)).removeComponentListener(this);
   }

   @Override
   public void componentResized(ComponentEvent var1) {
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
   }
}





