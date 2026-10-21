import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class FD implements MouseListener {
   final km_4 t;

   FD(km_4 var1) {
      this.t = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Object var10000 = com.c.c(275811009654227000L).get(this);
      Method var10001 = (Method)com.c.c(595819195510091629L).get(com.c.c(275811009654227000L).get(this));
      Object[] var10002 = com.c.a(var1.getPoint());
      Method var10004 = com.c.d(520457556467656899L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var10001 = (Method)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      com.c.c(578607023926813312L).set(var10000, var10001);
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





