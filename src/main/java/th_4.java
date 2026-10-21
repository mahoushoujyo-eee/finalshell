import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class th_4 implements ActionListener {
   final nx_2 B;

   th_4(nx_2 var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var10000 = Km_2.U();
      Object[] var10001 = com.c.f();
      Method var25 = com.c.d(270389152141252877L);
      Object[] var51 = var10001;
      Method var39 = null;

      try {
         var10001 = (Object[])var25.invoke(var39, var51);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      var39 = com.c.f();
      Method var10004 = com.c.d(306266403902896148L);
      var51 = (Object[])var39;
      var39 = var10001;
      Method var27 = var10004;

      try {
         var10001 = (u6_2)var27.invoke(var39, var51);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      u6_2 var3 = var10001;
      String var2 = var10000;
      var10001 = com.c.a(1);
      Method var53 = com.c.d(355959850244158035L);
      var39 = var10001;
      u6_2 var30 = var3;
      Method var14 = var53;

      try {
         var14.invoke(var30, (Object[])var39);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      Object[] var15 = com.c.f();
      Method var16 = com.c.d(270389152141252877L);
      var39 = var15;
      var10001 = null;

      try {
         var10000 = (String)var16.invoke(var10001, (Object[])var39);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var10001 = com.c.f();
      Method var54 = com.c.d(578864097947885485L);
      var39 = var10001;
      var10001 = var10000;
      Method var18 = var54;

      try {
         var18.invoke(var10001, (Object[])var39);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      label91: {
         boolean var4;
         label95: {
            label89: {
               var4 = false;
               if (var2 == null) {
                  var10001 = com.c.f();
                  Method var55 = com.c.d(620011176897972573L);
                  var39 = var10001;
                  u6_2 var36 = var3;
                  Method var19 = var55;

                  try {
                     var10000 = (String)var19.invoke(var36, (Object[])var39);
                  } catch (InvocationTargetException var8) {
                     throw var8.getTargetException();
                  }

                  if (var10000 != null) {
                     break label89;
                  }

                  var4 = true;
               }

               if (var2 == null) {
                  break label95;
               }
            }

            File var21;
            var51 = com.c.f();
            Method var10005 = com.c.d(620011176897972573L);
            Object[] var58 = var51;
            u6_2 var57 = var3;
            var39 = var10005;

            try {
               var48 = (String)var39.invoke(var57, var58);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            var21 = new File(var48);
            File var5 = var21;
            var22 = var5.exists();
            if (var2 != null) {
               break label91;
            }

            if (!var22) {
               var4 = true;
            }
         }

         var22 = var4;
      }

      if (var22) {
         Object[] var23 = com.c.a(com.c.c(166731455568463101L).get(com.c.c(207788080053309886L).get(this)));
         Method var24 = com.c.d(211273487601650149L);
         Object[] var50 = var23;
         var10001 = null;

         try {
            var24.invoke(var10001, var50);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }
   }
}





