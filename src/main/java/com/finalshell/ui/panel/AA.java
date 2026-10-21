package com.finalshell.ui.panel;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class AA extends JTree {
   public static String u;
   public static String b;
   public static long[] q;
   public static Integer[] v;

   public AA() {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 296738783540743980L;
      Object[] var1 = var10001;
      Ref.h(296738783540743980L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public AA(DefaultMutableTreeNode var1) {
      super(var1);
      Object[] var10001 = Registry.emptyArgs();
      long var3 = 296738783540743980L;
      Object[] var2 = var10001;
      Ref.h(296738783540743980L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void E() {
      this.putClientProperty(b, new Color(a(13560, 3873196748215737387L), a(17886, 5022847974886354190L), a(15719, 8150349306695603638L)));
   }

   public void V() {
      TreePath var1 = this.getSelectionPath();
      if (var1 != null) {
         this.startEditingAtPath(var1);
      }
   }

   public void f$void(DefaultMutableTreeNode var1) {
      TreePath var10001 = (TreePath)(Registry.packArgs(var1));
      long var4 = 263865946362642439L;
      Object var3 = var10001;
      var10001 = Ref.h(263865946362642439L, var3, var4);

      try {
         var10001 = (TreePath)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      TreePath var2 = var10001;
      if (var2 != null) {
         this.startEditingAtPath(var2);
      }
   }

   public TreePath K(Point var1) {
      return this.getPathForLocation(var1.x, var1.y);
   }

   public boolean N(DefaultMutableTreeNode var1) {
      TreePath var10002 = (TreePath)(Registry.packArgs(var1));
      long var3 = 263865946362642439L;
      Object var2 = var10002;
      var10002 = Ref.h(263865946362642439L, var2, var3);

      try {
         var10002 = (TreePath)var10002;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      return this.isPathSelected(var10002);
   }

   public void X(DefaultMutableTreeNode var1) {
      TreePath var10002 = (TreePath)(Registry.packArgs(var1));
      long var3 = 263865946362642439L;
      Object var2 = var10002;
      var10002 = Ref.h(263865946362642439L, var2, var3);

      try {
         var10002 = (TreePath)var10002;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      this.expandPath(var10002);
   }

   public void g(int var1, int var2) {
      this.setSelectionPath(this.getPathForLocation(var1, var2));
   }

   public void A(DefaultMutableTreeNode var1) {
      TreePath var10001 = (TreePath)(Registry.packArgs(var1));
      long var4 = 263865946362642439L;
      Object var3 = var10001;
      var10001 = Ref.h(263865946362642439L, var3, var4);

      try {
         var10001 = (TreePath)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      TreePath var2 = var10001;
      if (var2 != null) {
         this.setSelectionPath(var2);
      }
   }

   public DefaultMutableTreeNode o(Point var1) {
      Object var10001 = Registry.packArgs(var1.x, var1.y);
      long var3 = 546937145493854086L;
      Object var2 = var10001;
      var10001 = Ref.h(546937145493854086L, var2, var3);

      try {
         return (DefaultMutableTreeNode)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public DefaultMutableTreeNode k(int var1, int var2) {
      Object var10001 = Registry.packArgs(this.getPathForLocation(var1, var2));
      long var4 = 465406037200718653L;
      Object var3 = var10001;
      var10001 = Ref.h(465406037200718653L, var3, var4);

      try {
         return (DefaultMutableTreeNode)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public Rectangle f$Rectangle(DefaultMutableTreeNode var1) {
      TreePath var10002 = (TreePath)(Registry.packArgs(var1));
      long var3 = 263865946362642439L;
      Object var2 = var10002;
      var10002 = Ref.h(263865946362642439L, var2, var3);

      try {
         var10002 = (TreePath)var10002;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      return this.getPathBounds(var10002);
   }

   public TreePath y(DefaultMutableTreeNode var1) {
      return var1 != null ? new TreePath(var1.getPath()) : null;
   }

   public void J() {
      String var10000 = z();
      int var2 = 0;
      String var1 = var10000;

      while (var2 < this.getRowCount()) {
         this.expandRow(var2);
         var2++;
         if (var1 != null) {
            break;
         }
      }
   }

   public boolean x(DefaultMutableTreeNode var1) {
      TreePath var10002 = (TreePath)(Registry.packArgs(var1));
      long var3 = 263865946362642439L;
      Object var2 = var10002;
      var10002 = Ref.h(263865946362642439L, var2, var3);

      try {
         var10002 = (TreePath)var10002;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      return this.isExpanded(var10002);
   }

   public DefaultMutableTreeNode u() {
      Object var10001 = Registry.packArgs(this.getSelectionPath());
      long var2 = 465406037200718653L;
      Object var1 = var10001;
      var10001 = Ref.h(465406037200718653L, var1, var2);

      try {
         return (DefaultMutableTreeNode)var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public List B() {
      String var10000 = z();
      ArrayList var2 = new ArrayList();
      String var1 = var10000;
      TreePath[] var3 = this.getSelectionPaths();
      TreePath[] var11 = var3;
      if (var1 == null) {
         if (var3 == null) {
            return var2;
         }

         var11 = var3;
      }

      TreePath[] var4 = var11;
      int var5 = var4.length;
      int var6 = 0;

      while (var6 < var5) {
         TreePath var7 = var4[var6];
         if (var1 != null) {
            return var2;
         }

         DefaultMutableTreeNode var10002 = (DefaultMutableTreeNode)(Registry.packArgs(var7));
         long var9 = 465406037200718653L;
         Object var8 = var10002;
         var10002 = Ref.h(465406037200718653L, var8, var9);

         try {
            var10002 = (DefaultMutableTreeNode)var10002;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         this.add(var10002);
         var6++;
         if (var1 != null) {
            break;
         }
      }

      return var2;
   }

   public DefaultMutableTreeNode i(int var1) {
      Object var10001 = Registry.packArgs(this.getPathForRow(var1));
      long var3 = 465406037200718653L;
      Object var2 = var10001;
      var10001 = Ref.h(465406037200718653L, var2, var3);

      try {
         return (DefaultMutableTreeNode)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public DefaultMutableTreeNode C(TreePath var1) {
      String var2 = z();
      Object var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return null;
         }

         var10000 = var1.getLastPathComponent();
      }

      return (DefaultMutableTreeNode)var10000;
   }

   public DefaultMutableTreeNode p(Point var1) {
      Object var10001 = Registry.packArgs(var1.x, var1.y);
      long var3 = 628674419087187212L;
      Object var2 = var10001;
      var10001 = Ref.h(628674419087187212L, var2, var3);

      try {
         return (DefaultMutableTreeNode)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public DefaultMutableTreeNode J(int var1, int var2) {
      Object var10001 = Registry.packArgs(this.getClosestPathForLocation(var1, var2));
      long var4 = 465406037200718653L;
      Object var3 = var10001;
      var10001 = Ref.h(465406037200718653L, var3, var4);

      try {
         return (DefaultMutableTreeNode)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public TreePath g(Point var1) {
      return this.getClosestPathForLocation(var1.x, var1.y);
   }

   public static void F(String var0) {
      u = var0;
   }

   public static String z() {
      return u;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26833;
      if (v[var3] == null) {
         v[var3] = (int)(q[var3] ^ var1);
      }

      return v[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (z() != null) {
         F("zJLXkc");
      }

      char[] var10003 = "J\u001f\u0007\f<5\fr\b\u0001\u001d{)\u0007\\\f\u0001\u0002u4\u0006k\u0003\u0006".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 54;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 54;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 40;
               break;
            case 1:
               var37 = 91;
               break;
            case 2:
               var37 = 84;
               break;
            case 3:
               var37 = 95;
               break;
            case 4:
               var37 = 36;
               break;
            case 5:
               var37 = 112;
               break;
            default:
               var37 = 95;
         }
      } else {
         var25 = 54;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            b = var29;
            long var9 = 8096708686331357986L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "áA?tþhþäc¸\u008bU\u001d}\u0086\u0014ä|[\u0095\b\u0001w\u0011";
            int var13 = "áA?tþhþäc¸\u008bU\u001d}\u0086\u0014ä|[\u0095\b\u0001w\u0011".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            q = var14;
            v = new Integer[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 54;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 40;
               break;
            case 1:
               var37 = 91;
               break;
            case 2:
               var37 = 84;
               break;
            case 3:
               var37 = 95;
               break;
            case 4:
               var37 = 36;
               break;
            case 5:
               var37 = 112;
               break;
            default:
               var37 = 95;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 40;
                  break;
               case 1:
                  var37 = 91;
                  break;
               case 2:
                  var37 = 84;
                  break;
               case 3:
                  var37 = 95;
                  break;
               case 4:
                  var37 = 36;
                  break;
               case 5:
                  var37 = 112;
                  break;
               default:
                  var37 = 95;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               b = var27;
               long var0 = 8096708686331357986L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "áA?tþhþäc¸\u008bU\u001d}\u0086\u0014ä|[\u0095\b\u0001w\u0011";
               int var5 = "áA?tþhþäc¸\u008bU\u001d}\u0086\u0014ä|[\u0095\b\u0001w\u0011".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var0;
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               q = var6;
               v = new Integer[3];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 40;
                  break;
               case 1:
                  var37 = 91;
                  break;
               case 2:
                  var37 = 84;
                  break;
               case 3:
                  var37 = 95;
                  break;
               case 4:
                  var37 = 36;
                  break;
               case 5:
                  var37 = 112;
                  break;
               default:
                  var37 = 95;
            }
         }
      }
   }
}





