import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class VG implements ActionListener {
   final yB_3 p;

   VG(yB_3 var1) {
      this.p = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(220282364724549275L).get(com.c.c(580916639675388688L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(194560825135347400L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var6 = (t3_2)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      t3_2 var2 = var6;
      var10000 = (Method)com.c.c(580916639675388688L).get(this);
      var10001 = com.c.a(var2);
      var10003 = com.c.d(453881667189302194L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





