package com;

import java.util.Arrays;
import javax.swing.JTree;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.TreePath;

public class Y5 implements TreeExpansionListener {
   @Override
   public void treeExpanded(TreeExpansionEvent var1) {
      JTree var2 = (JTree)var1.getSource();
      TreePath var3 = var1.getPath();
      Object var4 = var3.getLastPathComponent();
      if (var2.getModel().getChildCount(var4) == 1) {
         Object[] var5 = var3.getPath();
         Object[] var6 = Arrays.copyOf(var5, var5.length + 1);
         var6[var5.length] = var2.getModel().getChild(var4, 0);
         var2.expandPath(new TreePath(var6));
      }
   }

   @Override
   public void treeCollapsed(TreeExpansionEvent var1) {
   }

   public static com.Y5 H(JTree var0) {
      C(var0);
      com.Y5 var1 = new com.Y5();
      var0.addTreeExpansionListener(var1);
      return var1;
   }

   public static void C(JTree var0) {
      int[] var10000 = com.WC.V();
      TreeExpansionListener[] var2 = var0.getTreeExpansionListeners();
      int var3 = var2.length;
      int var4 = 0;
      int[] var1 = var10000;

      while (var4 < var3) {
         TreeExpansionListener var5 = var2[var4];
         if (var1 == null) {
            if (var5 instanceof com.Y5) {
               var0.removeTreeExpansionListener(var5);
            }

            var4++;
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public static boolean A(JTree var0) {
      TreeExpansionListener[] var2 = var0.getTreeExpansionListeners();
      int[] var10000 = com.WC.V();
      int var3 = var2.length;
      int var4 = 0;
      int[] var1 = var10000;

      while (true) {
         if (var4 < var3) {
            TreeExpansionListener var5 = var2[var4];
            if (var1 == null) {
               var6 = var5 instanceof com.Y5;
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





