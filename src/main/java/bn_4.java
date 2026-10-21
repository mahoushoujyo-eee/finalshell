import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bn_4 implements MouseListener {
   final U Z;

   bn_4(U var1) {
      this.Z = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String[] var2 = F8.y();
      int var10000 = var1.getButton();
      byte var10001 = 1;
      if (var2 == null) {
         if (var10000 == 1) {
            Object[] var5 = com.c.f();
            Method var6 = com.c.d(253808553645062345L);
            Object[] var14 = var5;
            Object var11 = null;

            try {
               var7 = (Boolean)var6.invoke(var11, var14);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }

            if (!var7) {
               return;
            }

            Object var8 = com.c.c(250841638483635250L).get(this);
            Object[] var12 = com.c.f();
            Method var10003 = com.c.d(361892076397147493L);
            var14 = var12;
            Object var13 = var8;
            Method var9 = var10003;

            try {
               var9.invoke(var13, var14);
            } catch (InvocationTargetException var3) {
               throw var3.getTargetException();
            }

            if (var2 == null) {
               return;
            }
         }

         var10000 = var1.getButton();
         var10001 = 3;
      }

      if (var10000 == var10001) {
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





