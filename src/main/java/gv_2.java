import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class gv_2 implements DocumentListener {
   final Vc_2 d;

   gv_2(Vc_2 var1) {
      this.d = var1;
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      Method var10000 = (Method)com.c.c(497865600392043956L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(193516965737299518L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      Method var10000 = (Method)com.c.c(497865600392043956L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(193516965737299518L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      Method var10000 = (Method)com.c.c(497865600392043956L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(193516965737299518L);
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





