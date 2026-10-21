import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class cO_3 implements ActionListener {
   final l5_2 s;

   cO_3(l5_2 var1) {
      this.s = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(270550610354043937L).get(com.c.c(332441495899066156L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(283087596964075372L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(378734658016285263L);
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





