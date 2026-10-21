import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class FJ implements ActionListener {
   final U n;

   FJ(U var1) {
      this.n = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      ((dA_3)com.c.c(529321737223656579L).get(null)).setLocationRelativeTo(null);
      Method var10000 = (Method)com.c.c(529321737223656579L).get(null);
      Object[] var10001 = com.c.a(true);
      Method var10003 = com.c.d(610529704363663802L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      ((dA_3)com.c.c(529321737223656579L).get(null)).requestFocus();
   }
}





