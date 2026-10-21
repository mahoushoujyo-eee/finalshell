import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bt_4 implements MouseListener {
   final uV_3 H;

   bt_4(uV_3 var1) {
      this.H = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String[] var2 = F8.y();
      aJ var10000 = (aJ)com.c.c(601581016628183308L).get(com.c.c(254650031326843112L).get(this));
      if (var2 == null) {
         var10000.getSelectionModel().clearSelection();
         if (var1.getButton() != 3) {
            return;
         }

         var10000 = (aJ)com.c.c(601581016628183308L).get(com.c.c(254650031326843112L).get(this));
      }

      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(458516521755846832L);
      Object[] var10002 = var10001;
      aJ var7 = var10000;
      Method var5 = var10003;

      try {
         var6 = (l5_2)var5.invoke(var7, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      l5_2 var3 = var6;
      var3.show((Component)var1.getSource(), var1.getX() + 1, var1.getY() + 1);
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





