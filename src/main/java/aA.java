import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class aA extends JTree {
   private static String u;
   private static final String b;
   private static final long[] q;
   private static final Integer[] v;

   public aA() {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(296738783540743980L);
      Object[] var10002 = var10001;
      aA var2 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public aA(DefaultMutableTreeNode var1) {
      super(var1);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(296738783540743980L);
      Object[] var10002 = var10001;
      aA var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   void E() {
      this.putClientProperty(b, new Color(a(13560, 3873196748215737387L), a(17886, 5022847974886354190L), a(15719, 8150349306695603638L)));
   }

   public void V() {
      TreePath var1 = this.getSelectionPath();
      if (var1 != null) {
         this.startEditingAtPath(var1);
      }
   }

   public void f(DefaultMutableTreeNode var1) {
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(263865946362642439L);
      Object[] var10002 = var10001;
      aA var5 = this;
      Method var10000 = var10003;

      try {
         var4 = (TreePath)var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      TreePath var2 = var4;
      if (var2 != null) {
         this.startEditingAtPath(var2);
      }
   }

   public TreePath K(Point var1) {
      return this.getPathForLocation(var1.x, var1.y);
   }

   public boolean N(DefaultMutableTreeNode var1) {
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(263865946362642439L);
      Object[] var10003 = var10002;
      aA var4 = this;
      Method var10001 = var10004;

      try {
         var3 = (TreePath)var10001.invoke(var4, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      return this.isPathSelected(var3);
   }

   public void X(DefaultMutableTreeNode var1) {
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(263865946362642439L);
      Object[] var10003 = var10002;
      aA var4 = this;
      Method var10001 = var10004;

      try {
         var3 = (TreePath)var10001.invoke(var4, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      this.expandPath(var3);
   }

   public void g(int var1, int var2) {
      this.setSelectionPath(this.getPathForLocation(var1, var2));
   }

   public void A(DefaultMutableTreeNode var1) {
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(263865946362642439L);
      Object[] var10002 = var10001;
      aA var5 = this;
      Method var10000 = var10003;

      try {
         var4 = (TreePath)var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      TreePath var2 = var4;
      if (var2 != null) {
         this.setSelectionPath(var2);
      }
   }

   public DefaultMutableTreeNode o(Point var1) {
      Object[] var10001 = com.c.a(var1.x, var1.y);
      Method var10003 = com.c.d(546937145493854086L);
      Object[] var10002 = var10001;
      aA var3 = this;
      Method var10000 = var10003;

      try {
         return (DefaultMutableTreeNode)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public DefaultMutableTreeNode k(int var1, int var2) {
      Object[] var10001 = com.c.a(this.getPathForLocation(var1, var2));
      Method var10003 = com.c.d(465406037200718653L);
      Object[] var10002 = var10001;
      aA var4 = this;
      Method var10000 = var10003;

      try {
         return (DefaultMutableTreeNode)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public Rectangle f$Rectangle(DefaultMutableTreeNode var1) {
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(263865946362642439L);
      Object[] var10003 = var10002;
      aA var4 = this;
      Method var10001 = var10004;

      try {
         var3 = (TreePath)var10001.invoke(var4, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      return this.getPathBounds(var3);
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
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(263865946362642439L);
      Object[] var10003 = var10002;
      aA var4 = this;
      Method var10001 = var10004;

      try {
         var3 = (TreePath)var10001.invoke(var4, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      return this.isExpanded(var3);
   }

   public DefaultMutableTreeNode u() {
      Object[] var10001 = com.c.a(this.getSelectionPath());
      Method var10003 = com.c.d(465406037200718653L);
      Object[] var10002 = var10001;
      aA var2 = this;
      Method var10000 = var10003;

      try {
         return (DefaultMutableTreeNode)var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public List B() {
      String var10000 = z();
      ArrayList var2 = new ArrayList();
      String var1 = var10000;
      TreePath[] var3 = this.getSelectionPaths();
      TreePath[] var9 = var3;
      if (var1 == null) {
         if (var3 == null) {
            return var2;
         }

         var9 = var3;
      }

      TreePath[] var4 = var9;
      int var5 = var4.length;
      int var6 = 0;

      while (var6 < var5) {
         TreePath var7 = var4[var6];
         if (var1 != null) {
            return var2;
         }

         Object[] var10002 = com.c.a(var7);
         Method var10004 = com.c.d(465406037200718653L);
         Object[] var10003 = var10002;
         aA var12 = this;
         Method var10001 = var10004;

         try {
            var11 = (DefaultMutableTreeNode)var10001.invoke(var12, var10003);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         var2.add(var11);
         var6++;
         if (var1 != null) {
            break;
         }
      }

      return var2;
   }

   public DefaultMutableTreeNode i(int var1) {
      Object[] var10001 = com.c.a(this.getPathForRow(var1));
      Method var10003 = com.c.d(465406037200718653L);
      Object[] var10002 = var10001;
      aA var3 = this;
      Method var10000 = var10003;

      try {
         return (DefaultMutableTreeNode)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
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
      Object[] var10001 = com.c.a(var1.x, var1.y);
      Method var10003 = com.c.d(628674419087187212L);
      Object[] var10002 = var10001;
      aA var3 = this;
      Method var10000 = var10003;

      try {
         return (DefaultMutableTreeNode)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public DefaultMutableTreeNode J(int var1, int var2) {
      Object[] var10001 = com.c.a(this.getClosestPathForLocation(var1, var2));
      Method var10003 = com.c.d(465406037200718653L);
      Object[] var10002 = var10001;
      aA var4 = this;
      Method var10000 = var10003;

      try {
         return (DefaultMutableTreeNode)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26833;
      if (v[var3] == null) {
         v[var3] = (int)(q[var3] ^ var1);
      }

      return v[var3];
   }
}





