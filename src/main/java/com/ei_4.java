package com;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Window;
import javax.swing.JComponent;
import javax.swing.JRootPane;

public class ei_4 extends e1_2 {
   public void p(JRootPane var1, String var2, G9 var3, Object[] var4) {
      Window var8;
      label26: {
         String[] var10000 = e1_2.A();
         Window var6 = com.FV.L(var1);
         String[] var5 = var10000;
         boolean var7 = var6 instanceof Frame;
         if (var5 != null) {
            if (var7) {
               ((Frame)var6).setTitle(this.q(var3, var4));
               if (var5 != null) {
                  return;
               }
            }

            var8 = var6;
            if (var5 == null) {
               break label26;
            }

            var7 = var6 instanceof Dialog;
         }

         if (!var7) {
            return;
         }

         var8 = var6;
      }

      ((Dialog)var8).setTitle(this.q(var3, var4));
   }

   @Override
   public void L(JComponent var1, String var2, G9 var3, Object[] var4) {
      this.p((JRootPane)var1, var2, var3, var4);
   }
}





