import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Bt_2 implements ActionListener {
   final km_4 r;

   Bt_2(km_4 var1) {
      this.r = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      try {
         Method var10000 = (Method)com.c.c(288129705126756315L).get(this);
         Object[] var10001 = com.c.a(com.c.c(193644890840143673L).get(com.c.c(288129705126756315L).get(this)), false);
         Method var10003 = com.c.d(628885630814220039L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }
}





