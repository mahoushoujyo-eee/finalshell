package com;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JList;

public class cI_3 extends MouseMotionAdapter {
   private final JList l;

   public cI_3(JList var1) {
      this.l = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      String[] var2 = com.CI.c();
      int var10000 = this.l.isEnabled();
      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = this.l.locationToIndex(var1.getPoint());
      }

      int var3 = var10000;
      if (var3 != this.l.getSelectedIndex()) {
         this.l.setSelectedIndex(var3);
      }
   }

   public static com.cI_3 w(JList var0) {
      z(var0);
      com.cI_3 var1 = new com.cI_3(var0);
      var0.addMouseMotionListener(var1);
      return var1;
   }

   public static void z(JList var0) {
      String[] var10000 = com.CI.c();
      MouseMotionListener[] var2 = var0.getMouseMotionListeners();
      String[] var1 = var10000;
      int var3 = var2.length;
      int var4 = 0;

      while (var4 < var3) {
         MouseMotionListener var5 = var2[var4];
         if (var1 == null) {
            if (var5 instanceof com.cI_3) {
               var0.removeMouseMotionListener(var5);
            }

            var4++;
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public static boolean V(JList var0) {
      MouseMotionListener[] var2 = var0.getMouseMotionListeners();
      String[] var10000 = com.CI.c();
      int var3 = var2.length;
      String[] var1 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var3) {
            MouseMotionListener var5 = var2[var4];
            if (var1 == null) {
               var6 = var5 instanceof com.cI_3;
               if (var1 != null) {
                  break;
               }

               if (var6) {
                  return true;
               }

               var4++;
            }

            if (var1 == null) {
               continue;
            }
         }

         var6 = false;
         break;
      }

      return var6;
   }
}





