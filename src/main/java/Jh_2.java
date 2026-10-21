import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Jh_2 implements MouseListener {
   final c6_2 y;
   final z_ F;
   final Yy_2 J;

   Jh_2(Yy_2 var1, c6_2 var2, z_ var3) {
      this.J = var1;
      this.y = var2;
      this.F = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      com.ky_4[] var10000 = z_.t();
      int var3 = ((Yy_2)com.c.c(452820645423409010L).get(this)).rowAtPoint(var1.getPoint());
      com.ky_4[] var2 = var10000;
      int var7 = var1.getButton();
      byte var10001 = 3;
      if (var2 == null) {
         label53: {
            if (var7 == 3) {
               var7 = ((Yy_2)com.c.c(452820645423409010L).get(this)).isRowSelected(var3);
               if (var2 != null) {
                  break label53;
               }

               if (var7 == 0) {
                  ((Yy_2)com.c.c(452820645423409010L).get(this)).getSelectionModel().setSelectionInterval(var3, var3);
               }
            }

            var7 = var1.getButton();
         }

         var10001 = 1;
      }

      label58: {
         if (var2 == null) {
            if (var7 != var10001) {
               return;
            }

            var7 = var1.getClickCount();
            if (var2 != null) {
               break label58;
            }

            var10001 = 2;
         }

         if (var7 != var10001) {
            return;
         }

         var7 = var3;
      }

      if (var7 != 0) {
         var10000 = (com.ky_4[])com.c.c(504554534303582134L).get(this);
         Object[] var13 = com.c.a(var3);
         Method var10003 = com.c.d(548405852497465390L);
         Object[] var10002 = var13;
         Object var14 = var10000;
         Method var9 = var10003;

         try {
            var10 = (lD_3)var9.invoke(var14, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         lD_3 var4 = var10;
         var10000 = (com.ky_4[])com.c.c(399758841572303115L).get(this);
         Object[] var15 = com.c.a(var4);
         var10003 = com.c.d(293809111816395161L);
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





