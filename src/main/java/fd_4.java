import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class fd_4 implements ActionListener {
   final U O;

   fd_4(U var1) {
      this.O = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(524137627140263158L).get(this);
      Object[] var10001 = com.c.a(com.c.c(613893959659572417L).get(null));
      Method var10003 = com.c.d(510227890552392495L);
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





