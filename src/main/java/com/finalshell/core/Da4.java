package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import javax.swing.DropMode;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Da4 {
   public static long[] a;
   public static Integer[] b;

   public JScrollPane j() {
      JTree var1 = new JTree();
      var1.setDragEnabled(true);
      var1.setDropMode(DropMode.ON_OR_INSERT);
      var1.setTransferHandler(new T8());
      var1.getSelectionModel().setSelectionMode(2);
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 456314098107551553L;
      Object[] var2 = var10001;
      Ref.h(456314098107551553L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      return new JScrollPane(var1);
   }

   public void H(JTree var1) {
      String[] var10000 = com.finalshell.ui.panel.F8.y();
      DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)var1.getModel().getRoot();
      String[] var2 = var10000;
      Enumeration var4 = var3.breadthFirstEnumeration();

      while (var4.hasMoreElements()) {
         DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var4.nextElement();
         int var7 = (var5.isLeaf()) ? 1 : 0;
         if (var2 == null) {
            if (var7 != 0) {
               continue;
            }

            var7 = var1.getRowForPath(new TreePath(var5.getPath()));
         }

         int var6 = var7;
         var1.expandRow(var6);
         if (var2 != null) {
            break;
         }
      }
   }

   public static void main(String[] var0) {
      JFrame var1 = new JFrame();
      var1.setDefaultCloseOperation(3);
      Da4 var10001 = new Da4();
      JScrollPane var10002 = (JScrollPane)(Registry.emptyArgs());
      long var3 = 437711895013604562L;
      Object[] var2 = var10002;
      var10002 = Ref.h(437711895013604562L, var2, var3);

      try {
         var10002 = (JScrollPane)var10002;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10001.add(var10002);
      var1.setSize(a(9918, 4914330257659809117L), a(11822, 3670117610238035406L));
      var1.setLocation(a(18280, 9010126470277147785L), a(7687, 1898245755519038949L));
      var1.setVisible(true);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27619;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2957805752508551391L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "E¹\u0095Y,%\\\u0012×\u0089s£:ûåò";
      int var5 = "E¹\u0095Y,%\\\u0012×\u0089s£:ûåò".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "ªù\u0013oR×¼\u009eä Ü[RÅÔ\u0081";
                  var5 = "ªù\u0013oR×¼\u009eä Ü[RÅÔ\u0081".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





