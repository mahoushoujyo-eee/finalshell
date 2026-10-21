import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Ke_2 implements ActionListener {
   final fp_4 c;

   Ke_2(fp_4 var1) {
      this.c = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(260425465387371054L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(343871400640450352L);
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





