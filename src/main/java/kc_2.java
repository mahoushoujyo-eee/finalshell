import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Kc_2 implements ActionListener {
   final aM H;
   final xT F;

   Kc_2(xT var1, aM var2) {
      this.F = var1;
      this.H = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(389935200192627445L).get(this);
      Object[] var10001 = com.c.a(true);
      Method var10003 = com.c.d(328322194154687590L);
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





