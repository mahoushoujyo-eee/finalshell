import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class KB implements MouseListener {
   final f7_2 P;

   KB(f7_2 var1) {
      this.P = var1;
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
         Object var6 = com.c.c(512348400607580044L).get(com.c.c(455024111575775958L).get(this));
         Object[] var11 = com.c.f();
         Method var10003 = com.c.d(457204009113929650L);
         Object[] var10002 = var11;
         Object var12 = var6;
         Method var7 = var10003;

         try {
            var8 = (lN_3)var7.invoke(var12, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         lN_3 var3 = var8;
         if (var3 != null) {
            Object var9 = com.c.c(512348400607580044L).get(com.c.c(455024111575775958L).get(this));
            Object[] var13 = com.c.a(var3);
            var10003 = com.c.d(306838697711798482L);
            var10002 = var13;
            Object var14 = var9;
            Method var10 = var10003;

            try {
               var10.invoke(var14, var10002);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }
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





