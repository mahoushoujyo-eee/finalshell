import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class uK_3 implements ActionListener {
   final Wx_2 B;

   uK_3(Wx_2 var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = a3.I();
      tf_4 var10000 = (tf_4)com.c.c(515525013030853953L).get(com.c.c(469519602226110268L).get(this));
      if (var2 != null) {
         if (var10000 == null) {
            return;
         }

         var10000 = (tf_4)com.c.c(515525013030853953L).get(com.c.c(469519602226110268L).get(this));
      }

      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(498856411508641826L);
      Object[] var10002 = var10001;
      tf_4 var11 = var10000;
      Method var6 = var10003;

      try {
         var7 = (String)var6.invoke(var11, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      String var3 = var7;
      var8 = var3;
      label35:
      if (var2 != null) {
         if (!var3.equals("/")) {
            var8 = var3;
            if (var2 == null) {
               break label35;
            }

            if (!var3.endsWith("/")) {
               var3 = var3 + "/";
            }
         }

         var8 = var3;
      }

      Object[] var9 = com.c.a(var8);
      Method var10 = com.c.d(396962080382410298L);
      var10002 = var9;
      var10001 = null;

      try {
         var10.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





