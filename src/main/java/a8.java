import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jdesktop.swingx.JXList;

class a8 implements MouseListener {
   final FK U;

   a8(FK var1) {
      this.U = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var2;
      int var9;
      label59: {
         String[] var10000 = FK.i();
         int var3 = ((JXList)com.c.c(369475678680292668L).get(com.c.c(550210732415152298L).get(this))).getSelectedIndex();
         var2 = var10000;
         var9 = var1.getButton();
         byte var10001 = 1;
         if (var2 == null) {
            if (var9 != 1) {
               return;
            }

            var9 = var3;
            if (var2 != null) {
               break label59;
            }

            var10001 = -1;
         }

         if (var9 <= var10001) {
            return;
         }

         var9 = ((JXList)com.c.c(369475678680292668L).get(com.c.c(550210732415152298L).get(this))).convertIndexToModel(var3);
      }

      int var4 = var9;
      Object var10 = com.c.c(627738372728753803L).get(com.c.c(550210732415152298L).get(this));
      Object[] var18 = com.c.a(var4);
      Method var10003 = com.c.d(430610060651646114L);
      Object[] var10002 = var18;
      var18 = (Object[])var10;
      Method var11 = var10003;

      try {
         var12 = (L1)var11.invoke(var18, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      L1 var5 = var12;
      var9 = var1.getButton();
      if (var2 == null) {
         if (var9 != 1) {
            return;
         }

         var18 = com.c.f();
         var10003 = com.c.d(542058094445767607L);
         var10002 = var18;
         L1 var21 = var5;
         Method var14 = var10003;

         try {
            var15 = (String)var14.invoke(var21, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var9 = var15.endsWith("/");
      }

      if (var9 == 0) {
      }

      Object var16 = com.c.c(550210732415152298L).get(this);
      var18 = com.c.a(var5);
      var10003 = com.c.d(345502075173010592L);
      var10002 = var18;
      var18 = (Object[])var16;
      Method var17 = var10003;

      try {
         var17.invoke(var18, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
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





