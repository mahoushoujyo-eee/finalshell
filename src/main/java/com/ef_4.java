package com;

import javax.swing.JComponent;
import javax.swing.JTabbedPane;

public class ef_4 extends e1_2 {
   protected boolean m = ew_4.q;

   public ef_4() {
   }

   public ef_4(boolean var1) {
      this.m = var1;
   }

   public boolean w() {
      return this.m;
   }

   public void s(boolean var1) {
      this.m = var1;
   }

   public void V(JTabbedPane var1, String var2, G9 var3, Object[] var4) {
      String[] var10000 = e1_2.A();
      int var6 = 0;
      String[] var5 = var10000;

      while (var6 < var1.getTabCount()) {
         String var7 = this.m ? var1.getComponentAt(var6).getName() : "" + var6;
         G9 var8 = i2_2.Y(var1, var2, var7);
         String var9 = this.q(var8, var4);
         String var10002 = var9;
         if (var5 != null) {
            var10002 = var9 != null ? var9 : null;
         }

         label37: {
            label36: {
               var1.setTitleAt(var6, var10002);
               if (var9 != null) {
                  var10 = var3.C();
                  if (var5 == null) {
                     break label36;
                  }

                  if (var10 != null) {
                     var10 = var3.C();
                     break label36;
                  }
               }

               var11 = 0;
               break label37;
            }

            var11 = var10;
         }

         var1.setMnemonicAt(var6, var11);
         var6++;
         if (var5 == null) {
            break;
         }
      }
   }

   @Override
   public void L(JComponent var1, String var2, G9 var3, Object[] var4) {
      this.V((JTabbedPane)var1, var2, var3, var4);
   }
}





