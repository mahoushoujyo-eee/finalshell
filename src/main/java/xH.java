import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class xH implements DocumentListener {
   final nj_2 Q;

   xH(nj_2 var1) {
      this.Q = var1;
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(277476196757967488L);
      Object[] var10002 = var10001;
      xH var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(277476196757967488L);
      Object[] var10002 = var10001;
      xH var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(277476196757967488L);
      Object[] var10002 = var10001;
      xH var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   private void Y() {
      Method var10000 = (Method)com.c.c(501433403111402778L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(428473676051130971L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





