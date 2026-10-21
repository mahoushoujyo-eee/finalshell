import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;

class Bp_2 implements Runnable {
   String D;
   final TA E;

   Bp_2(TA var1) {
      this.E = var1;
      com.c.c(547712353249085906L).set(this, null);
   }

   @Override
   public void run() {
      ((C_)com.c.c(293785544051389437L).get(com.c.c(136255156672474390L).get(this))).setEnabled(false);
      boolean var10000 = F6.i();
      Method var10001 = (Method)com.c.c(294487557435087442L).get(com.c.c(233423413271348758L).get(com.c.c(136255156672474390L).get(this)));
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(212042562452272939L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         zD var6 = (zD)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      boolean var1 = var10000;
      Bp_2 var4 = this;
      if (var1) {
         if ((String)com.c.c(547712353249085906L).get(this) != null) {
            JOptionPane.showMessageDialog(null, (String)com.c.c(547712353249085906L).get(this));
         }

         var4 = this;
      }

      ((C_)com.c.c(293785544051389437L).get(com.c.c(136255156672474390L).get(var4))).setEnabled(true);
   }
}





