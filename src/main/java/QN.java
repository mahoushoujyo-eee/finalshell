import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class QN implements ActionListener {
   final Kb_2 B;

   QN(Kb_2 var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      try {
         Method var10000 = (Method)com.c.c(191575800978898401L).get(this);
         Object[] var10001 = com.c.a(com.c.c(473641348993414305L).get(com.c.c(191575800978898401L).get(this)), true);
         Method var10003 = com.c.d(235982160539264686L);
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





