import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Kh_2 implements MouseListener {
   final xj_2 F;

   Kh_2(xj_2 var1) {
      this.F = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 1) {
         Object[] var10000 = com.c.a(
            com.c.c(445558421278779817L).get(com.c.c(244054721873399846L).get(this)), com.c.c(362540202329407130L).get(com.c.c(244054721873399846L).get(this))
         );
         Method var3 = com.c.d(274988989695972769L);
         Object[] var5 = var10000;
         Object var4 = null;

         try {
            var3.invoke(var4, var5);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
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





