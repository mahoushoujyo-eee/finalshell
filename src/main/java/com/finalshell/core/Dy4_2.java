package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Connection5;
import com.finalshell.ui.panel.OG3;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

public class Dy4_2 implements LayoutManager {
   Connection5 P;
   com.finalshell.ui.panel.Tv2 n;
   public static long[] a;
   public static Integer[] b;

   @Override
   public void addLayoutComponent(String var1, Component var2) {
   }

   @Override
   public void removeLayoutComponent(Component var1) {
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      int[] var10000 = OG3.T();
      Dimension var3 = new Dimension();
      int[] var2 = var10000;
      if (var2 != null) {
         Object var4 = 628501091079280263L;
         if ((Connection5)Ref.g(628501091079280263L, var4) != null) {
            Object var6 = 628501091079280263L;
            var3 = ((Connection5)Ref.g(628501091079280263L, var6)).getPreferredSize();
         }

         var3 = new Dimension(a(27817, 2722024917501821351L), a(25644, 2484060400015690017L));
      }

      return var3;
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return new Dimension(a(17772, 8026740851858139235L), a(2659, 8320299013893760879L));
   }

   @Override
   public void layoutContainer(Container var1) {
      Component[] var3 = var1.getComponents();
      int[] var2 = OG3.T();

      for (Component var7 : var3) {
         label33: {
            boolean var16 = var7.getClass().equals(Connection5.class);
            if (var2 != null) {
               if (var16) {
                  Connection5 var10001 = (Connection5)var7;
                  long var9 = 628501091079280263L;
                  Connection5 var8 = var10001;
                  Ref.s(628501091079280263L, var8, var9);
                  if (var2 != null) {
                     break label33;
                  }
               }

               var16 = var7.getClass().equals(com.finalshell.ui.panel.Tv2.class);
            }

            if (var16) {
               com.finalshell.ui.panel.Tv2 var17 = (com.finalshell.ui.panel.Tv2)var7;
               long var11 = 537516051091557680L;
               com.finalshell.ui.panel.Tv2 var10 = var17;
               Ref.s(537516051091557680L, var10, var11);
            }
         }

         label26: {
            Object var12 = 628501091079280263L;
            Object var18 = (Connection5)Ref.g(628501091079280263L, var12);
            if (var2 != null) {
               if (var18 == null) {
                  break label26;
               }

               var18 = this;
               Object var14 = 628501091079280263L;
               Connection5 var10002 = (Connection5)Ref.g(628501091079280263L, var14);
            }

            ((Connection5)var18).setBounds(0, 0, var1.getWidth(), var1.getHeight());
         }

         if (var2 == null) {
            break;
         }
      }
   }

   public void v(Rectangle var1, DefaultMutableTreeNode var2) {
      int[] var3 = OG3.T();
      Object var4 = 537516051091557680L;
      com.finalshell.ui.panel.Tv2 var10001 = (com.finalshell.ui.panel.Tv2)Ref.g(537516051091557680L, var4);
      if (var3 != null) {
         if (var10001 == null) {
            return;
         }

         Object var6 = 537516051091557680L;
         ((com.finalshell.ui.panel.Tv2)Ref.g(537516051091557680L, var6)).setBounds(var1);
         Object var8 = 537516051091557680L;
         com.finalshell.ui.panel.Tv2 var10003 = (com.finalshell.ui.panel.Tv2)Ref.g(537516051091557680L, var8);
      }

      Object[] var10002 = Registry.packArgs(var2);
      long var11 = 135515410391156914L;
      Object[] var10 = var10002;
      Ref.h(135515410391156914L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11532;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1243245480819868915L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "Z\u0006%sHËcøæ\u000eã\u001aKl\fþ";
      int var5 = "Z\u0006%sHËcøæ\u000eã\u001aKl\fþ".length();
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

                  var4 = ">\u0092þ\u000e\u0011\u0095\u0084xÎ)\u0019Ô\u007fþ,ô";
                  var5 = ">\u0092þ\u000e\u0011\u0095\u0084xÎ)\u0019Ô\u007fþ,ô".length();
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





