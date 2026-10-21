package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.ImportExportPanel;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import javax.swing.tree.DefaultMutableTreeNode;

public class Z5_2 implements LayoutManager {
   public Km2 C;
   public com.finalshell.ui.panel.Ca2 K;
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
      String var10000 = Km2.U$String();
      Dimension var3 = new Dimension();
      String var2 = var10000;
      if (var2 == null) {
         Object var4 = 206472421489690892L;
         if ((Km2)Ref.g(206472421489690892L, var4) != null) {
            Object var6 = 206472421489690892L;
            var3 = ((Km2)Ref.g(206472421489690892L, var6)).getPreferredSize();
         }

         var3 = new Dimension(a(5741, 4923632099740319726L), a(28537, 4422274238168401656L));
      }

      return var3;
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return new Dimension(a(19778, 1977415988761601218L), a(4436, 7299215602918226134L));
   }

   @Override
   public void layoutContainer(Container var1) {
      Component[] var3 = var1.getComponents();
      String var10000 = Km2.U$String();
      Component[] var4 = var3;
      int var5 = var3.length;
      int var6 = 0;
      String var2 = var10000;

      while (var6 < var5) {
         label33: {
            Component var7 = var4[var6];
            boolean var16 = var7.getClass().equals(ImportExportPanel.class);
            if (var2 == null) {
               if (var16) {
                  Km2 var10001 = (Km2)var7;
                  long var9 = 206472421489690892L;
                  Km2 var8 = var10001;
                  Ref.s(206472421489690892L, var8, var9);
                  if (var2 == null) {
                     break label33;
                  }
               }

               var16 = var7.getClass().equals(com.finalshell.ui.panel.Tv2.class);
            }

            if (var16) {
               com.finalshell.ui.panel.Ca2 var17 = (com.finalshell.ui.panel.Ca2)var7;
               long var11 = 464530483298657098L;
               com.finalshell.ui.panel.Ca2 var10 = var17;
               Ref.s(464530483298657098L, var10, var11);
            }
         }

         label26: {
            Object var12 = 206472421489690892L;
            Object var18 = (Km2)Ref.g(206472421489690892L, var12);
            if (var2 == null) {
               if (var18 == null) {
                  break label26;
               }

               var18 = this;
               Object var14 = 206472421489690892L;
               Km2 var10002 = (Km2)Ref.g(206472421489690892L, var14);
            }

            ((Km2)var18).setBounds(0, 0, var1.getWidth(), var1.getHeight());
         }

         var6++;
         if (var2 != null) {
            break;
         }
      }
   }

   public void K(Rectangle var1, DefaultMutableTreeNode var2) {
      String var3 = Km2.U$String();
      Object var4 = 464530483298657098L;
      Object var10001 = (com.finalshell.ui.panel.Ca2)Ref.g(464530483298657098L, var4);
      if (var3 == null) {
         if (var10001 == null) {
            return;
         }

         var10001 = this;
         Object var6 = 464530483298657098L;
         com.finalshell.ui.panel.Ca2 var10002 = (com.finalshell.ui.panel.Ca2)Ref.g(464530483298657098L, var6);
      }

      ((com.finalshell.ui.panel.Ca2)var10001).setBounds(var1);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27009;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3280677383495894744L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "cê\u0019É\u0098\u008dÁ\f¾úpÇ¾¾b~";
      int var5 = "cê\u0019É\u0098\u008dÁ\f¾úpÇ¾¾b~".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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

                  var4 = "Hõm\u00014U8\u001a\f¡èq/\u0003¾j";
                  var5 = "Hõm\u00014U8\u001a\f¡èq/\u0003¾j".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





