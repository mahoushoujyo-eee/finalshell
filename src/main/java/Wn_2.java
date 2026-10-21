import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Wn_2 implements ActionListener {
   final zs_2 Y;

   Wn_2(zs_2 var1) {
      this.Y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(606640237838480290L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(419624596741622746L);
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





