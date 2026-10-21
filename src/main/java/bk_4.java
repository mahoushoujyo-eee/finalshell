import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bk_4 implements ActionListener {
   final l5_2 o;

   bk_4(l5_2 var1) {
      this.o = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(131037384951395357L).get(com.c.c(120690641910372750L).get(this));
      Object[] var10001 = com.c.a(false);
      Method var10003 = com.c.d(330853429046648426L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





