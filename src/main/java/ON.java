import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ON implements ActionListener {
   final Tg_2 v;

   ON(Tg_2 var1) {
      this.v = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(269701149216436117L).get(com.c.c(434618117288135903L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(178763011854806787L);
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





