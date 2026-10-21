package com.finalshell.ui.listener;

import com.finalshell.core.K5_2;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JTree;
import javax.swing.plaf.TreeUI;
import javax.swing.tree.TreePath;

public class R3 implements MouseMotionListener {
   public JTree a;

   public R3(JTree var1) {
      this.a = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      int var6;
      String var2 = com.finalshell.ui.panel.S.d();
      JTree var10000 = this.a;
      if (var2 != null) {
         if (!this.a.isEnabled()) {
            return;
         }

         var10000 = this.a;
      }

      label54: {
         TreeUI var3 = var10000.getUI();
         var6 = (var3 instanceof K5_2) ? 1 : 0;
         if (var2 != null) {
            if (var6 == 0) {
               break label54;
            }

            var6 = ((K5_2)var3).Y(var1.getPoint());
         }

         label39: {
            label38: {
               int var4 = var6;
               if (var2 != null) {
                  if (var4 == -1) {
                     break label38;
                  }

                  this.a.setSelectionRow(var4);
               }

               if (var2 != null) {
                  break label39;
               }
            }

            this.a.clearSelection();
         }

         if (var2 != null) {
            return;
         }
      }

      label28: {
         TreePath var5 = this.a.getPathForLocation(var1.getX(), var1.getY());
         if (var2 != null) {
            if (var5 == null) {
               break label28;
            }

            this.a.setSelectionPath(var5);
         }

         if (var2 != null) {
            return;
         }
      }

      this.a.clearSelection();
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
   }

   public static R3 E(JTree var0) {
      s(var0);
      R3 var1 = new R3(var0);
      var0.addMouseMotionListener(var1);
      return var1;
   }

   public static void s(JTree var0) {
      String var10000 = com.finalshell.ui.panel.S.d();
      MouseMotionListener[] var2 = var0.getMouseMotionListeners();
      String var1 = var10000;
      int var3 = var2.length;
      int var4 = 0;

      while (var4 < var3) {
         MouseMotionListener var5 = var2[var4];
         if (var1 != null) {
            if (var5 instanceof R3) {
               var0.removeMouseMotionListener(var5);
            }

            var4++;
         }

         if (var1 == null) {
            break;
         }
      }
   }

   public static boolean t(JTree var0) {
      boolean var6;
      String var10000 = com.finalshell.ui.panel.S.d();
      MouseMotionListener[] var2 = var0.getMouseMotionListeners();
      String var1 = var10000;
      int var3 = var2.length;
      int var4 = 0;

      while (true) {
         if (var4 < var3) {
            MouseMotionListener var5 = var2[var4];
            if (var1 != null) {
               var6 = var5 instanceof R3;
               if (var1 == null) {
                  break;
               }

               if (var6) {
                  return true;
               }

               var4++;
            }

            if (var1 != null) {
               continue;
            }
         }

         var6 = false;
         break;
      }

      return var6;
   }
}





