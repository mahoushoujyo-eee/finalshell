import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JMenuItem;

class i implements Runnable {
   final JMenuItem J;
   final JMenuItem H;
   final JMenuItem w;
   final l5_2 t;

   i(l5_2 var1, JMenuItem var2, JMenuItem var3, JMenuItem var4) {
      this.t = var1;
      this.J = var2;
      this.H = var3;
      this.w = var4;
   }

   @Override
   public void run() {
      JMenuItem var10000 = (JMenuItem)com.c.c(131037384951395357L).get(com.c.c(504202582560507006L).get(this));
      ArrayList var10001 = com.c.f();
      Method var10003 = com.c.d(545305462032614375L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var6 = (Boolean)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      boolean var2 = var6;
      ((JMenuItem)com.c.c(329455657549197975L).get(this)).setEnabled(var2);
      var10000 = aA.z();
      ((JMenuItem)com.c.c(367382779939447854L).get(this)).setEnabled(var2);
      String var1 = (String)var10000;
      var10000 = (JMenuItem)com.c.c(255849383768534640L).get(this);
      var10001 = (Object[])com.c.c(359637467035547923L).get(com.c.c(131037384951395357L).get(com.c.c(504202582560507006L).get(this)));
      var10002 = com.c.f();
      Method var10004 = com.c.d(442657485924266205L);
      Object[] var16 = var10002;
      var10002 = var10001;
      Method var11 = var10004;

      try {
         var10001 = (ArrayList)var11.invoke(var10002, var16);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      int var13 = var10001.size();
      if (var1 == null) {
         var13 = var13 > 0 ? 1 : 0;
      }

      var10000.setEnabled((boolean)var13);
   }
}





