import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ya_4 implements MouseListener {
   final JR m;

   ya_4(JR var1) {
      this.m = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var2 = ((JR)com.c.c(544896587708147604L).get(this)).rowAtPoint(var1.getPoint());
      if (var1.getButton() == 1) {
         Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
         Object[] var10001 = com.c.a(new T4(this));
         Method var10003 = com.c.d(434592463220957006L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}





