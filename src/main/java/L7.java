import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class L7 implements MouseListener {
   final c1_2 h;
   final zw_2 B;
   final nH d;

   L7(nH var1, c1_2 var2, zw_2 var3) {
      this.d = var1;
      this.h = var2;
      this.B = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String var10000 = zw_2.V();
      int var3 = ((nH)com.c.c(541009193423060093L).get(this)).rowAtPoint(var1.getPoint());
      String var2 = var10000;
      int var7 = var1.getButton();
      byte var10001 = 3;
      if (var2 != null) {
         label52: {
            if (var7 == 3) {
               var7 = ((nH)com.c.c(541009193423060093L).get(this)).isRowSelected(var3);
               if (var2 == null) {
                  break label52;
               }

               if (var7 == 0) {
                  ((nH)com.c.c(541009193423060093L).get(this)).getSelectionModel().setSelectionInterval(var3, var3);
               }
            }

            var7 = var1.getButton();
         }

         var10001 = 1;
      }

      if (var2 != null) {
         if (var7 != var10001) {
            return;
         }

         var7 = var1.getClickCount();
         var10001 = 2;
      }

      if (var2 != null) {
         if (var7 != var10001) {
            return;
         }

         var7 = var3;
         var10001 = -1;
      }

      if (var7 > var10001) {
         var10000 = (String)com.c.c(320906538225821202L).get(this);
         Object[] var13 = com.c.a(var3);
         Method var10003 = com.c.d(619629146278140254L);
         Object[] var10002 = var13;
         Object var14 = var10000;
         Method var9 = var10003;

         try {
            var10 = (YE)var9.invoke(var14, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         YE var4 = var10;
         var10000 = (String)com.c.c(523481248465454277L).get(this);
         Object[] var15 = com.c.a(var4);
         var10003 = com.c.d(359557313276269404L);
         var10002 = var15;
         Object var16 = var10000;
         Method var12 = var10003;

         try {
            var12.invoke(var16, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
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





