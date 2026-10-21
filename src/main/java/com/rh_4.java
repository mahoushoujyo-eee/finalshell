package com;

import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;

class rh_4 extends r8_2 {
   final com.Dj_2 W;

   rh_4(com.Dj_2 var1) {
      this.W = var1;
   }

   @Override
   protected boolean h(List var1) {
      String var10000 = com.Wb_2.m();
      Iterator var3 = var1.iterator();
      String var2 = var10000;

      while (true) {
         try {
            boolean var8 = var3.hasNext();
            if (var2 == null) {
               return var8;
            }

            if (!var8) {
               break;
            }
         } catch (Throwable var7) {
            throw a(var7);
         }

         ImageIcon var4 = (ImageIcon)var3.next();

         try {
            this.W.C(Xg_2.Z(var4));
            return true;
         } catch (Throwable var6) {
            if (var2 != null) {
               continue;
            }
            break;
         }
      }

      return false;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





