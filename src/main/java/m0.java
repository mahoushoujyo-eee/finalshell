import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class m0 implements ActionListener {
   final m4 S;

   m0(m4 var1) {
      this.S = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(485704634840338368L).get(com.c.c(570022061691913965L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(243017095898527761L);
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





