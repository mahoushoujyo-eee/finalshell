import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class YT implements ActionListener {
   final l5_2 J;

   YT(l5_2 var1) {
      this.J = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var10000 = com.c.c(131037384951395357L).get(com.c.c(338458785176155725L).get(this));
      Method var10001 = (Method)com.c.c(131037384951395357L).get(com.c.c(338458785176155725L).get(this));
      Object[] var10002 = com.c.a(false);
      Method var10004 = com.c.d(573324936575671059L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var10001 = (Method)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      com.c.c(359637467035547923L).set(var10000, var10001);
   }
}





