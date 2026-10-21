import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class dH_3 implements DocumentListener {
   final FK X;

   dH_3(FK var1) {
      this.X = var1;
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(269083138322254064L);
      Object[] var10002 = var10001;
      dH_3 var3 = this;
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
      Method var10003 = com.c.d(269083138322254064L);
      Object[] var10002 = var10001;
      dH_3 var3 = this;
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
      Method var10003 = com.c.d(269083138322254064L);
      Object[] var10002 = var10001;
      dH_3 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   private void T() {
      Method var10000 = (Method)com.c.c(292467524940408936L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(603079923931586578L);
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





