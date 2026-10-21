import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class b0_2 implements WindowFocusListener {
   final KQ u;

   b0_2(KQ var1) {
      this.u = var1;
   }

   @Override
   public void windowGainedFocus(WindowEvent var1) {
   }

   @Override
   public void windowLostFocus(WindowEvent var1) {
      String[] var10000 = F8.y();
      com.c.c(174659894326967944L).setLong(com.c.c(502105892341583135L).get(this), System.currentTimeMillis());
      String[] var2 = var10000;
      KQ var5 = (KQ)com.c.c(502105892341583135L).get(this);
      if (var2 == null) {
         Object[] var6 = com.c.a(var5);
         Method var7 = com.c.d(609548876769159921L);
         Object[] var13 = var6;
         Object var10 = null;

         try {
            var8 = (Boolean)var7.invoke(var10, var13);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         if (var8) {
            return;
         }

         var5 = (KQ)com.c.c(502105892341583135L).get(this);
      }

      Object[] var11 = com.c.a(false);
      Method var10003 = com.c.d(438941361784812150L);
      Object[] var14 = var11;
      KQ var12 = var5;
      Method var9 = var10003;

      try {
         var9.invoke(var12, var14);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





