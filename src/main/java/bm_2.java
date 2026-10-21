import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Bm_2 implements ActionListener {
   final av_2 g;

   Bm_2(av_2 var1) {
      this.g = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(134467010412844833L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(249566416557987503L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10000 = (Method)com.c.c(134467010412844833L).get(this);
      var10001 = com.c.a(false);
      var10003 = com.c.d(392410176539816794L);
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





