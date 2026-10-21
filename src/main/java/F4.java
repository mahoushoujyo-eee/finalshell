import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JComboBox;

class F4 implements ItemListener {
   final zn_2 v;

   F4(zn_2 var1) {
      this.v = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      int[] var2 = zn_2.g();
      if (var2 == null) {
         if (var1.getStateChange() != 1) {
            return;
         }

         com.c.c(362807796445170916L)
            .setInt(
               com.c.c(273404959419733099L).get(this),
               Integer.parseInt((String)((JComboBox)com.c.c(164806858731042884L).get(com.c.c(273404959419733099L).get(this))).getSelectedItem())
            );
      }

      Method var10000 = (Method)com.c.c(273404959419733099L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(450058049632895301L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





