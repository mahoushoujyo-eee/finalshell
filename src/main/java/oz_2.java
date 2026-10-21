import java.awt.KeyEventDispatcher;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.SwingUtilities;

class Oz_2 implements KeyEventDispatcher {
   final pG G;

   Oz_2(pG var1) {
      this.G = var1;
   }

   @Override
   public boolean dispatchKeyEvent(KeyEvent var1) {
      Method var10000 = (Method)com.c.c(349843220842867282L).get(this);
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(225144652801197158L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Window var3 = SwingUtilities.getWindowAncestor(var1.getComponent());
      int[] var10 = zG.Z();
      Iterator var4 = ((ArrayList)com.c.c(297544026394429738L).get(com.c.c(349843220842867282L).get(this))).iterator();
      int[] var2 = var10;

      while (true) {
         if (var4.hasNext()) {
            label53: {
               Qh_2 var5 = (Qh_2)var4.next();
               Qh_2 var11 = var5;
               if (var2 == null) {
                  var10001 = com.c.f();
                  var10003 = com.c.d(466015795722654385L);
                  var10002 = var10001;
                  Qh_2 var18 = var5;
                  var10000 = var10003;

                  try {
                     var13 = (Window)var10000.invoke(var18, var10002);
                  } catch (InvocationTargetException var6) {
                     throw var6.getTargetException();
                  }

                  var14 = var13.equals(var3);
                  if (var2 != null) {
                     break;
                  }

                  if (!var14) {
                     break label53;
                  }

                  var11 = var5;
               }

               var10001 = com.c.a(var1);
               var10003 = com.c.d(554259894036820476L);
               var10002 = var10001;
               Qh_2 var20 = var11;
               var10000 = var10003;

               try {
                  var10000.invoke(var20, var10002);
               } catch (InvocationTargetException var7) {
                  throw var7.getTargetException();
               }
            }

            if (var2 == null) {
               continue;
            }
         }

         var14 = false;
         break;
      }

      return var14;
   }
}





