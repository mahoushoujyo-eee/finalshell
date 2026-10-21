import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class OB implements MouseListener {
   final xw_2 W;

   OB(xw_2 var1) {
      this.W = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      boolean var2 = F6.g();
      int var10000 = var1.getClickCount();
      byte var10001 = 2;
      if (!var2) {
         if (var10000 != 2) {
            return;
         }

         var10000 = var1.getButton();
         var10001 = 1;
      }

      if (var10000 == var10001) {
         Object var4 = com.c.c(302105993042482768L).get(this);
         Object[] var6 = com.c.f();
         Method var10003 = com.c.d(297395466930437108L);
         Object[] var10002 = var6;
         Object var7 = var4;
         Method var5 = var10003;

         try {
            var5.invoke(var7, var10002);
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
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





