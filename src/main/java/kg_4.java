import com._y_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class kg_4 implements ActionListener {
   final C5 e;
   final Ka_2 C;

   kg_4(Ka_2 var1, C5 var2) {
      this.C = var1;
      this.e = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.ky_4[] var10000 = Ka_2.N();
      Object[] var10001 = com.c.f();
      Method var22 = com.c.d(270389152141252877L);
      Object[] var46 = var10001;
      Object var36 = null;

      try {
         var10001 = (Object[])var22.invoke(var36, var46);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      var36 = com.c.f();
      Method var10004 = com.c.d(634817973682994708L);
      var46 = (Object[])var36;
      var36 = var10001;
      Method var24 = var10004;

      try {
         var10001 = (Object[])var24.invoke(var36, var46);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      var36 = com.c.f();
      var10004 = com.c.d(240567170779145617L);
      var46 = (Object[])var36;
      var36 = var10001;
      Method var26 = var10004;

      try {
         var10001 = (Object[])var26.invoke(var36, var46);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var36 = com.c.f();
      var10004 = com.c.d(226341449505323490L);
      var46 = (Object[])var36;
      var36 = var10001;
      Method var28 = var10004;

      try {
         var10001 = (U)var28.invoke(var36, var46);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      U var3 = var10001;
      com.ky_4[] var2 = var10000;
      var10001 = com.c.f();
      Method var50 = com.c.d(179934491990092343L);
      var36 = var10001;
      U var31 = var3;
      Method var15 = var50;

      try {
         var16 = (_y_2)var15.invoke(var31, (Object[])var36);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      _y_2 var4 = var16;
      if (var3 != null) {
         _y_2 var17 = var4;
         if (var2 != null) {
            if (var4 == null) {
               return;
            }

            var10001 = com.c.f();
            Method var51 = com.c.d(179934491990092343L);
            var36 = var10001;
            U var33 = var3;
            Method var18 = var51;

            try {
               var17 = (_y_2)var18.invoke(var33, (Object[])var36);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }
         }

         lv_4 var5 = var17.a();
         lv_4 var19 = var5;
         if (var2 != null) {
            if (var5 == null) {
               return;
            }

            var19 = var5;
         }

         var10001 = com.c.f();
         Method var52 = com.c.d(380415140795833934L);
         var36 = var10001;
         lv_4 var35 = var19;
         Method var20 = var52;

         try {
            String var21 = (String)var20.invoke(var35, (Object[])var36);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         new dl_4(var5, var3);
         ((C5)com.c.c(355245715027756284L).get(this)).setVisible(false);
      }
   }
}





