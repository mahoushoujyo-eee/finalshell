import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class fT_3 implements WindowFocusListener {
   final ta_4 q;

   fT_3(ta_4 var1) {
      this.q = var1;
   }

   @Override
   public void windowLostFocus(WindowEvent var1) {
   }

   @Override
   public void windowGainedFocus(WindowEvent var1) {
      int[] var2 = ta_4.m();
      FF var10000 = (FF)com.c.c(247518897504885985L).get(com.c.c(382511049032296034L).get(this));
      if (var2 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = (FF)com.c.c(247518897504885985L).get(com.c.c(382511049032296034L).get(this));
      }

      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(155099205039445149L);
      Object[] var10002 = var10001;
      FF var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





