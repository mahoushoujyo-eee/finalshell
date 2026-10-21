import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JLabel;

class tU_3 implements ActionListener {
   final aj_2 R;

   tU_3(aj_2 var1) {
      this.R = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(324902839999849235L).get(this);
      JLabel var10001 = com.c.f();
      Method var10003 = com.c.d(221034384446077256L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10001 = (Object[])com.c.c(119949875613775635L).get(com.c.c(324902839999849235L).get(this));
      var10002 = com.c.f();
      Method var10004 = com.c.d(454489789944584533L);
      Object[] var22 = var10002;
      var10002 = var10001;
      Method var11 = var10004;

      try {
         var10001 = (JLabel)var11.invoke(var10002, var22);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      String var13 = var10001.getText();
      var10002 = (Object[])com.c.c(377738841635939563L).get(com.c.c(324902839999849235L).get(this));
      Object[] var23 = com.c.f();
      Method var10005 = com.c.d(612402923891880410L);
      Object[] var26 = var23;
      var10003 = var10002;
      Method var19 = var10005;

      try {
         var10002 = (Object[])var19.invoke(var10003, var26);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      Object[] var14 = com.c.a(var13, var10002);
      var10003 = com.c.d(407547220859876749L);
      var10002 = var14;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





