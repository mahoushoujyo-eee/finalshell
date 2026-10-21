import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class UB implements MouseListener {
   final nd_2 S;

   UB(nd_2 var1) {
      this.S = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var10000;
      label42: {
         String[] var2 = Br_2.w();
         var10000 = var1.getButton();
         byte var10001 = 3;
         if (var2 == null) {
            if (var10000 != 3) {
               return;
            }

            var10000 = var1.getClickCount();
            if (var2 != null) {
               break label42;
            }

            var10001 = 1;
         }

         if (var10000 != var10001) {
            return;
         }

         var10000 = ((nd_2)com.c.c(312381051327550610L).get(this)).rowAtPoint(var1.getPoint());
      }

      int var3 = var10000;
      int var4 = ((nd_2)com.c.c(312381051327550610L).get(this)).convertRowIndexToModel(var3);
      ((nd_2)com.c.c(312381051327550610L).get(this)).getSelectionModel().setSelectionInterval(var4, var4);
      Object var8 = com.c.c(312381051327550610L).get(this);
      Object[] var13 = com.c.f();
      Method var10003 = com.c.d(542425596934223077L);
      Object[] var10002 = var13;
      var13 = (Object[])var8;
      Method var9 = var10003;

      try {
         var10 = var9.invoke(var13, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var13 = com.c.a(var4);
      var10003 = com.c.d(397133340990525366L);
      var10002 = var13;
      var13 = (Object[])var10;
      Method var11 = var10003;

      try {
         BS var12 = (BS)var11.invoke(var13, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      String[] var2 = Br_2.w();
      int var10000 = var1.getButton();
      byte var10001 = 1;
      if (var2 == null) {
         if (var10000 != 1) {
            return;
         }

         var10000 = var1.getClickCount();
         var10001 = 2;
      }

      if (var10000 == var10001) {
         Object var4 = com.c.c(312381051327550610L).get(this);
         Object[] var6 = com.c.f();
         Method var10003 = com.c.d(621923125197779420L);
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
}





