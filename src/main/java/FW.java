import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class FW extends MouseAdapter {
   final Color s;
   final Color H;
   final U p;

   FW(U var1, Color var2, Color var3) {
      this.p = var1;
      this.s = var2;
      this.H = var3;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Object[] var10000 = com.c.f();
      Method var5 = com.c.d(270389152141252877L);
      Object[] var11 = var10000;
      Object var8 = null;

      try {
         var10000 = (Object[])var5.invoke(var8, var11);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var8 = com.c.f();
      Method var10003 = com.c.d(284609497308396758L);
      var11 = (Object[])var8;
      var8 = var10000;
      Method var7 = var10003;

      try {
         var7.invoke(var8, var11);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      U var2 = (U)com.c.c(572351643511277543L).get(this);
      ((C_)com.c.c(488270198363831547L).get(com.c.c(572351643511277543L).get(this))).setForeground((Color)com.c.c(171664279687725675L).get(this));
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      ((C_)com.c.c(488270198363831547L).get(com.c.c(572351643511277543L).get(this))).setForeground((Color)com.c.c(420586151167517677L).get(this));
   }
}





