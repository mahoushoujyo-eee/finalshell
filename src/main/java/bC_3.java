import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bC_3 implements MouseListener {
   final aM B;
   final t3_2 I;
   final Bq_2 l;

   bC_3(Bq_2 var1, aM var2, t3_2 var3) {
      this.l = var1;
      this.B = var2;
      this.I = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 1) {
         Method var10000 = (Method)com.c.c(469467548237991397L).get(this);
         Object[] var10001 = com.c.a(com.c.c(266445943636381636L).get(this));
         Method var10003 = com.c.d(228917422408595458L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
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





