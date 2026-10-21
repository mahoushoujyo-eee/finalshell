import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class OH implements ActionListener {
   final F6 j;

   OH(F6 var1) {
      this.j = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(221933783446966383L).get(this);
      Object[] var10001 = com.c.a(com.c.c(506751131738108937L).get(com.c.c(221933783446966383L).get(this)));
      Method var10003 = com.c.d(277808345207982888L);
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





