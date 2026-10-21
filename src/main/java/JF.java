import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class JF implements MouseListener {
   final oa_4 x;
   final zK K;
   final LQ S;

   JF(LQ var1, oa_4 var2, zK var3) {
      this.S = var1;
      this.x = var2;
      this.K = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var10000 = zK.B();
      int var3 = ((LQ)com.c.c(176164739172737231L).get(this)).rowAtPoint(var1.getPoint());
      String[] var2 = var10000;
      int var7 = var1.getButton();
      byte var10001 = 3;
      if (var2 != null) {
         label44: {
            if (var7 == 3) {
               var7 = ((LQ)com.c.c(176164739172737231L).get(this)).isRowSelected(var3);
               if (var2 == null) {
                  break label44;
               }

               if (var7 == 0) {
                  ((LQ)com.c.c(176164739172737231L).get(this)).getSelectionModel().setSelectionInterval(var3, var3);
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

      if (var7 == var10001) {
         var10000 = (String[])com.c.c(152770326095145004L).get(this);
         Object[] var13 = com.c.a(var3);
         Method var10003 = com.c.d(274266531369243862L);
         Object[] var10002 = var13;
         Object var14 = var10000;
         Method var9 = var10003;

         try {
            var10 = (zG)var9.invoke(var14, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         zG var4 = var10;
         var10000 = (String[])com.c.c(530033461434861960L).get(this);
         Object[] var15 = com.c.a(var4);
         var10003 = com.c.d(536313935565337962L);
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





