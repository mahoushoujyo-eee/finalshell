package com.finalshell.core;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Window;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.plaf.RootPaneUI;

public class Ec4 extends E12 {
   public void m(JRootPane var1, String var2, com.finalshell.ui.model.G9 var3, Object[] var4) {
      String[] var5;
      RootPaneUI var9;
      label46: {
         label47: {
            label48: {
               String[] var10000 = E12.A();
               Window var6 = FV_2.L(var1);
               var5 = var10000;
               var8 = var6 instanceof Frame;
               if (var5 != null) {
                  if (var8) {
                     ((Frame)var6).setTitle(this.q(var3, var4));
                     if (var5 != null) {
                        break label48;
                     }
                  }

                  var8 = var6 instanceof Dialog;
               }

               if (var5 == null) {
                  break label47;
               }

               if (var8) {
                  ((Dialog)var6).setTitle(this.q(var3, var4));
               }
            }

            var9 = var1.getUI();
            if (var5 == null) {
               break label46;
            }

            var8 = var9 instanceof D;
         }

         if (!var8) {
            return;
         }

         var9 = var1.getUI();
      }

      JComponent var7 = ((D)var9).R$JComponent();
      JComponent var10 = var7;
      if (var5 != null) {
         if (var7 == null) {
            return;
         }

         var10 = var7;
      }

      var10.repaint();
   }

   @Override
   public void L(JComponent var1, String var2, com.finalshell.ui.model.G9 var3, Object[] var4) {
      this.m((JRootPane)var1, var2, var3, var4);
   }
}





