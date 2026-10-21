import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class u__2 extends MouseAdapter {
   final kA_3 s;

   u__2(kA_3 var1) {
      this.s = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new xn_2(this));
      Method var10003 = com.c.d(434592463220957006L);
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





