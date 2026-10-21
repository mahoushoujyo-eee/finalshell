import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class lp_4 implements ActionListener {
   final aM w;
   final t3_2 I;
   final xT P;

   lp_4(xT var1, aM var2, t3_2 var3) {
      this.P = var1;
      this.w = var2;
      this.I = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(544996552895680695L).get(this);
      Object[] var10001 = com.c.a(com.c.c(365315904702362553L).get(this));
      Method var10003 = com.c.d(367055708446946697L);
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





