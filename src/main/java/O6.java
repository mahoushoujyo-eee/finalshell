import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class O6 implements MouseListener {
   final F6 I;

   O6(F6 var1) {
      this.I = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      boolean var2 = F6.i();
      int var10000 = var1.getClickCount();
      byte var10001 = 2;
      if (var2) {
         if (var10000 != 2) {
            return;
         }

         var10000 = var1.getButton();
         var10001 = 1;
      }

      if (var10000 == var10001) {
         Object var4 = com.c.c(163605535943126963L).get(this);
         Object[] var6 = com.c.a(false);
         Method var10003 = com.c.d(238680660514778174L);
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





