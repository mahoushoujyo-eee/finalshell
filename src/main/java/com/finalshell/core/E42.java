package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class E42 extends EF3 {
   public void J(AbstractButton var1, String var2, com.finalshell.ui.model.G9 var3, Object[] var4) {
      String[] var10000 = E12.A();
      String var6 = this.q(var3, var4);
      String[] var5 = var10000;
      String var10001 = var6;
      if (var5 != null) {
         var10001 = var6 != null ? var6 : null;
      }

      label57: {
         label56: {
            var1.setText(var10001);
            if (var6 != null) {
               var13 = var3.C();
               if (var5 == null) {
                  break label56;
               }

               if (var13 != null) {
                  var13 = var3.C();
                  break label56;
               }
            }

            var14 = 0;
            break label57;
         }

         var14 = var13;
      }

      label48: {
         var1.setMnemonic(var14);
         AbstractButton var10 = var1;
         if (var5 != null) {
            if (!T(var1)) {
               break label48;
            }

            var10 = var1;
         }

         W62.n(G(var10));
      }

      label61: {
         String var11 = var3.Y();
         if (var5 != null) {
            if (var11 == null) {
               break label61;
            }

            var11 = var3.Y();
         }

         KeyStroke var7 = KeyStroke.getKeyStroke(var11);
         KeyStroke var12 = var7;
         if (var5 != null) {
            if (var7 == null) {
               break label61;
            }

            var12 = var7;
         }

         com.finalshell.ui.model.Cs2 var8 = FN.h(var12);
         DN_2 var9 = W62.R(var1, var8);
         t(var1, var9);
      }

      if (var5 == null) {
         Ky4.K(new String[4]);
      }
   }

   @Override
   public void L(JComponent var1, String var2, com.finalshell.ui.model.G9 var3, Object[] var4) {
      this.J((AbstractButton)var1, var2, var3, var4);
   }
}





