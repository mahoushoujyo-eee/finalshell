import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class YZ implements ActionListener {
   final nx_2 H;

   YZ(nx_2 var1) {
      this.H = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = Km_2.U();
      nx_2 var10000 = (nx_2)com.c.c(380371888959224761L).get(this);
      if (var2 == null) {
         if ((ck_4)com.c.c(450156560726681374L).get(var10000) != null) {
            var10000 = (nx_2)com.c.c(450156560726681374L).get(com.c.c(380371888959224761L).get(this));
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(605430732347023634L);
            Object[] var10002 = var10001;
            var10001 = var10000;
            Method var9 = var10003;

            try {
               var10000 = (nx_2)var9.invoke(var10001, var10002);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            Object[] var11 = com.c.a(var10000);
            Method var12 = com.c.d(396962080382410298L);
            var10002 = var11;
            var10001 = null;

            try {
               var12.invoke(var10001, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }
         }

         var10000 = (nx_2)com.c.c(380371888959224761L).get(this);
      }

      tf_4 var13 = (tf_4)com.c.c(566271456646205392L).get(var10000);
      if (var2 == null) {
         if (var13 == null) {
            return;
         }

         var13 = (tf_4)com.c.c(566271456646205392L).get(com.c.c(380371888959224761L).get(this));
      }

      Object[] var22 = com.c.f();
      Method var31 = com.c.d(498856411508641826L);
      Object[] var28 = var22;
      tf_4 var23 = var13;
      Method var14 = var31;

      try {
         var15 = (String)var14.invoke(var23, var28);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      String var3 = var15;
      var16 = var3;
      label56:
      if (var2 == null) {
         if (!var3.equals("/")) {
            var16 = var3;
            if (var2 != null) {
               break label56;
            }

            if (!var3.endsWith("/")) {
               var3 = var3 + "/";
            }
         }

         var16 = var3;
      }

      Object[] var17 = com.c.a(var16);
      Method var18 = com.c.d(396962080382410298L);
      var28 = var17;
      var22 = null;

      try {
         var18.invoke(var22, var28);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





