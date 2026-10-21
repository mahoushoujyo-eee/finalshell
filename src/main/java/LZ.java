import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class LZ implements MouseListener {
   final on_4 E;

   LZ(on_4 var1) {
      this.E = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var2 = Y_.j();
      int var10000 = var1.getButton();
      byte var10001 = 1;
      if (var2 != null) {
         if (var10000 != 1) {
            return;
         }

         var10000 = var1.getClickCount();
         var10001 = 2;
      }

      if (var10000 == var10001) {
         Object var4 = com.c.c(208817150286845168L).get(this);
         Object[] var6 = com.c.f();
         Method var10003 = com.c.d(271888329314383012L);
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
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}





