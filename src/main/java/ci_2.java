import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JCheckBoxMenuItem;

class Ci_2 implements ActionListener {
   final JCheckBoxMenuItem k;
   final nx_2 O;

   Ci_2(nx_2 var1, JCheckBoxMenuItem var2) {
      this.O = var1;
      this.k = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = Km_2.U();
      Object[] var10000 = com.c.f();
      Method var13 = com.c.d(270389152141252877L);
      Object[] var51 = var10000;
      Object var32 = null;

      try {
         var10000 = (yT_3)var13.invoke(var32, var51);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      if (var2 == null) {
         var32 = com.c.f();
         Method var10003 = com.c.d(163462326892114024L);
         var51 = (Object[])var32;
         var32 = var10000;
         Method var15 = var10003;

         try {
            var10000 = (Object[])var15.invoke(var32, var51);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         var32 = com.c.f();
         var10003 = com.c.d(633712494917113170L);
         var51 = (Object[])var32;
         var32 = var10000;
         Method var17 = var10003;

         try {
            var18 = (Boolean)var17.invoke(var32, var51);
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         if (!var18) {
            var10000 = com.c.f();
            Method var29 = com.c.d(270389152141252877L);
            var51 = var10000;
            var32 = null;

            try {
               var10000 = (Object[])var29.invoke(var32, var51);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }

            var32 = com.c.f();
            var10003 = com.c.d(248890456776257543L);
            var51 = (Object[])var32;
            var32 = var10000;
            Method var31 = var10003;

            try {
               var31.invoke(var32, var51);
               return;
            } catch (InvocationTargetException var3) {
               throw var3.getTargetException();
            }
         }

         var10000 = com.c.f();
         Method var20 = com.c.d(270389152141252877L);
         var51 = var10000;
         var32 = null;

         try {
            var10000 = (Object[])var20.invoke(var32, var51);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         var32 = com.c.f();
         var10003 = com.c.d(306266403902896148L);
         var51 = (Object[])var32;
         var32 = var10000;
         Method var22 = var10003;

         try {
            var10000 = (Object[])var22.invoke(var32, var51);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         var32 = com.c.a(((JCheckBoxMenuItem)com.c.c(529240269626246118L).get(this)).isSelected());
         var10003 = com.c.d(522016653675214088L);
         var51 = (Object[])var32;
         var32 = var10000;
         Method var24 = var10003;

         try {
            var24.invoke(var32, var51);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var10000 = com.c.f();
         Method var26 = com.c.d(270389152141252877L);
         var51 = var10000;
         var32 = null;

         try {
            var10000 = (yT_3)var26.invoke(var32, var51);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }

      var32 = com.c.f();
      Method var67 = com.c.d(578864097947885485L);
      var51 = (Object[])var32;
      var32 = var10000;
      Method var27 = var67;

      try {
         var27.invoke(var32, var51);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





