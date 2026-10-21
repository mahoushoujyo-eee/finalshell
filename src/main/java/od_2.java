import java.awt.event.ActionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.AbstractAction;

class Od_2 extends AbstractAction {
   final U W;

   Od_2(U var1, String var2) {
      super(var2);
      this.W = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(236214990303510116L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(222971910568398589L);
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





