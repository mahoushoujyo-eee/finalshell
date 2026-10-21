import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ft_4 implements MouseListener {
   final aM j;

   ft_4(aM var1) {
      this.j = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      String[] var2 = aM.s();
      Object[] var10000 = com.c.f();
      Method var10 = com.c.d(299368763907830673L);
      Object[] var37 = var10000;
      Object var24 = null;

      try {
         var10000 = (Object[])var10.invoke(var24, var37);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var24 = com.c.f();
      Method var10003 = com.c.d(400084338690857485L);
      var37 = (Object[])var24;
      var24 = var10000;
      Method var12 = var10003;

      try {
         var13 = (Boolean)var12.invoke(var24, var37);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      if (var2 == null) {
         if (!var13) {
            return;
         }

         var10000 = (Object[])com.c.c(142536030060271800L).get(com.c.c(276917056825011926L).get(this));
         var24 = com.c.f();
         var10003 = com.c.d(193033702979442502L);
         var37 = (Object[])var24;
         var24 = var10000;
         Method var15 = var10003;

         try {
            var13 = (Boolean)var15.invoke(var24, var37);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      }

      if (!var13) {
         var10000 = com.c.f();
         Method var17 = com.c.d(299368763907830673L);
         var37 = var10000;
         var24 = null;

         try {
            var10000 = (Object[])var17.invoke(var24, var37);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         var24 = com.c.a(true);
         var10003 = com.c.d(271429106917420594L);
         var37 = (Object[])var24;
         var24 = var10000;
         Method var19 = var10003;

         try {
            var19.invoke(var24, var37);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var10000 = com.c.f();
         Method var21 = com.c.d(299368763907830673L);
         var37 = var10000;
         var24 = null;

         try {
            var10000 = (Object[])var21.invoke(var24, var37);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var24 = com.c.a(com.c.c(142536030060271800L).get(com.c.c(276917056825011926L).get(this)));
         var10003 = com.c.d(588837842234789414L);
         var37 = (Object[])var24;
         var24 = var10000;
         Method var23 = var10003;

         try {
            var23.invoke(var24, var37);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





