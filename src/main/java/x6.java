import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class x6 extends WindowAdapter {
   final U J;

   x6(U var1) {
      this.J = var1;
   }

   @Override
   public void windowActivated(WindowEvent var1) {
      super.windowActivated(var1);
      Method var10000 = (Method)com.c.c(493158471773442262L).get(com.c.c(450503380664452479L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(230171768324088030L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var6 = (ArrayList)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      if (var6.size() > 0) {
         Object[] var7 = com.c.f();
         var10000 = com.c.d(270389152141252877L);
         var10002 = var7;
         var10001 = null;

         try {
            var10000 = (Method)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(284609497308396758L);
         var10002 = var10001;
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
   public void windowDeactivated(WindowEvent var1) {
      super.windowDeactivated(var1);
   }

   @Override
   public void windowIconified(WindowEvent var1) {
      super.windowIconified(var1);
   }
}





