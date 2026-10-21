package com.finalshell.core;

import com.finalshell.ui.panel.Dj2;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;

public class Rh4 extends R82 {
   final Dj2 W;

   Rh4(Dj2 var1) {
      this.W = var1;
   }

   @Override
   protected boolean h(List var1) {
      String var10000 = com.finalshell.ui.panel.Wb2.m$String();
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
            this.W.C(Xg2.Z(var4));
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

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





