package com.finalshell.ui.model;

import com.finalshell.core.Kp2;
import com.finalshell.core.NE;
import java.io.Serializable;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class Q_2 extends DefaultMutableTreeNode implements Serializable {
   public String R;
   public static String a;

   public Q_2() {
      this.b();
   }

   public Q_2(Object var1) {
      super(var1);
      this.b();
   }

   public String H() {
      String var1 = com.finalshell.ui.panel.S.d();
      String var10000 = this.R;
      if (var1 != null) {
         if (this.R == null) {
            this.b();
         }

         var10000 = this.R;
      }

      return var10000;
   }

   public void n(String var1) {
      this.R = var1;
   }

   public void b() {
      this.R = NE.E(a);
   }

   public Q_2 w() {
      return (Q_2)super.getParent();
   }

   public TreePath i() {
      return new TreePath(this.getPath());
   }

   @Override
   public String toString() {
      String var1 = com.finalshell.ui.panel.S.d();
      Object var10000 = this.userObject;
      if (var1 != null) {
         if (this.userObject == null) {
            return Kp2.c(this.getClass());
         }

         var10000 = this.userObject;
      }

      return var10000.toString();
   }

   @Override
   public TreeNode getParent() {
      return this.w();
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "7b".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 125;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 125;
         var10006 = var0;
      } else {
         var6 = 125;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 125;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 31;
               break;
            case 1:
               var23 = 81;
               break;
            case 2:
               var23 = 59;
               break;
            case 3:
               var23 = 79;
               break;
            case 4:
               var23 = 30;
               break;
            case 5:
               var23 = 58;
               break;
            default:
               var23 = 44;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





