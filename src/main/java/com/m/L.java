package com.m;

import java.util.Iterator;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class L extends DefaultTreeModel {
   public L(DefaultMutableTreeNode var1) {
      super(var1);
   }

   public L(DefaultMutableTreeNode var1, boolean var2) {
      super(var1, var2);
   }

   public DefaultMutableTreeNode G() {
      return (DefaultMutableTreeNode)this.getRoot();
   }

   public void F(List var1, DefaultMutableTreeNode var2, int var3) {
      String var10000 = com.m.s.d();
      int var5 = var1.size() - 1;
      String var4 = var10000;

      while (var5 >= 0) {
         var2.insert((MutableTreeNode)var1.get(var5), var3);
         var5--;
         if (var4 == null) {
            break;
         }
      }

      int[] var7 = new int[var1.size()];
      int var6 = 0;

      while (true) {
         if (var6 < var1.size()) {
            var7[var6] = var3 + var6;
            var6++;
            if (var4 == null) {
               break;
            }

            if (var4 != null) {
               continue;
            }
         }

         this.nodesWereInserted(var2, var7);
         break;
      }
   }

   public void d(DefaultMutableTreeNode[] var1, DefaultMutableTreeNode var2, int var3) {
      String var10000 = com.m.s.d();
      int var5 = var1.length - 1;
      String var4 = var10000;

      while (var5 >= 0) {
         var2.insert(var1[var5], var3);
         var5--;
         if (var4 == null) {
            break;
         }
      }

      int[] var7 = new int[var1.length];
      int var6 = 0;

      while (true) {
         if (var6 < var1.length) {
            var7[var6] = var3 + var6;
            var6++;
            if (var4 == null) {
               break;
            }

            if (var4 != null) {
               continue;
            }
         }

         this.nodesWereInserted(var2, var7);
         break;
      }
   }

   public void a(List var1) {
      String var10000 = com.m.s.d();
      Iterator var3 = var1.iterator();
      String var2 = var10000;

      while (var3.hasNext()) {
         DefaultMutableTreeNode var4 = (DefaultMutableTreeNode)var3.next();
         this.removeNodeFromParent(var4);
         if (var2 == null) {
            break;
         }
      }
   }

   public void N(DefaultMutableTreeNode var1) {
      String var10000 = com.m.s.d();
      int var3 = 0;
      String var2 = var10000;

      while (var3 < var1.getChildCount()) {
         this.removeNodeFromParent((MutableTreeNode)var1.getChildAt(var3));
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   public void l(DefaultMutableTreeNode[] var1) {
      String var2 = com.m.s.d();

      for (DefaultMutableTreeNode var6 : var1) {
         this.removeNodeFromParent(var6);
         if (var2 == null) {
            break;
         }
      }
   }

   public void B(DefaultMutableTreeNode var1) {
      if (var1 != null) {
         this.fireTreeNodesChanged(this, this.getPathToRoot(var1), null, null);
      }
   }

   public void L(DefaultMutableTreeNode var1) {
      if (var1 != null) {
         this.fireTreeStructureChanged(this, this.getPathToRoot(var1), null, null);
      }
   }

   public void t() {
      this.fireTreeStructureChanged(this, this.G().getPath(), null, null);
   }
}





