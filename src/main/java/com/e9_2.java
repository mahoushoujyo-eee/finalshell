package com;

import javax.swing.AbstractButton;
import javax.swing.JComponent;

public class e9_2 extends e1_2 {
   public void G(AbstractButton var1, String var2, G9 var3, Object[] var4) {
      String[] var10000 = e1_2.A();
      String var6 = this.q(var3, var4);
      String[] var5 = var10000;
      String var10001 = var6;
      if (var5 != null) {
         var10001 = var6 != null ? var6 : null;
      }

      label29: {
         label28: {
            var1.setText(var10001);
            if (var6 != null) {
               var7 = var3.C();
               if (var5 == null) {
                  break label28;
               }

               if (var7 != null) {
                  var7 = var3.C();
                  break label28;
               }
            }

            var8 = 0;
            break label29;
         }

         var8 = var7;
      }

      var1.setMnemonic(var8);
      if (com.ky_4.F() != null) {
         e1_2.K(new String[3]);
      }
   }

   @Override
   public void L(JComponent var1, String var2, G9 var3, Object[] var4) {
      this.G((AbstractButton)var1, var2, var3, var4);
   }
}





