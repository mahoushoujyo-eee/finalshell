import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class lz_4 implements MouseListener {
   final tE_3 H;

   lz_4(tE_3 var1) {
      this.H = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 1) {
         Object[] var10000 = com.c.a(
            com.c.c(412103333330765630L).get(com.c.c(567895785615318652L).get(this)), com.c.c(177705260303572150L).get(com.c.c(567895785615318652L).get(this))
         );
         Method var3 = com.c.d(499557154371623443L);
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





