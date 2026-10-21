import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class lm_4 implements MouseListener {
   final boolean T;
   final kA_3 t;

   lm_4(kA_3 var1, boolean var2) {
      this.t = var1;
      this.T = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      com.ky_4[] var2 = kA_3.y();
      int var10000 = var1.getButton();
      if (var2 == null) {
         if (var10000 != 1) {
            return;
         }

         var10000 = com.c.c(495673752776433786L).getBoolean(this);
      }

      if (var10000 == 0) {
         Object var4 = com.c.c(388376917454860932L).get(null);
         Object[] var10001 = com.c.a(new DM(this));
         Method var10003 = com.c.d(434592463220957006L);
         Object[] var10002 = var10001;
         var10001 = (Object[])var4;
         Method var5 = var10003;

         try {
            var5.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      com.c.c(123845205254103433L).setBoolean(com.c.c(275628384420924903L).get(this), false);
      Method var10000 = (Method)com.c.c(275628384420924903L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(212415783875365536L);
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
   public void mouseEntered(MouseEvent var1) {
      com.c.c(123845205254103433L).setBoolean(com.c.c(275628384420924903L).get(this), true);
      Method var10000 = (Method)com.c.c(275628384420924903L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(212415783875365536L);
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
   public void mouseClicked(MouseEvent var1) {
   }
}





