import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class tC_3 implements FocusListener {
   final TM O;

   tC_3(TM var1) {
      this.O = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      Method var10000 = (Method)com.c.c(494766072002035328L).get(com.c.c(152236502500346171L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(149160680229662748L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.a(true);
      var10003 = com.c.d(438941361784812150L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void focusLost(FocusEvent var1) {
      ((aJ)com.c.c(123645524365861271L).get(com.c.c(152236502500346171L).get(this))).stopEditing();
   }
}





