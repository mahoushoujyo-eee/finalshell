package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.OG3;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComponent;

public class J6 implements LayoutManager {
   OG3 J;
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
      new Dimension();
      Object var10002 = var1.getWidth();
      Object var3 = 403443201352784895L;
      Object var10004 = Ref.g(403443201352784895L, var3);
      JComponent var10005 = (JComponent)(Registry.emptyArgs());
      long var6 = 471986896906843084L;
      Object[] var5 = var10005;
      var10005 = Ref.h(471986896906843084L, var5, var6);

      try {
         var10005 = (JComponent)var10005;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      super((int)var10004, var10005.getPreferredSize().height);
      return (Dimension)var10002;
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return new Dimension(a(7023, 5129712945139162511L), a(13167, 7373005805903066510L));
   }

   @Override
   public void layoutContainer(Container var1) {
      Component[] var2 = var1.getComponents();
      Object var4 = 403443201352784895L;
      Ref.g(403443201352784895L, var4);
      JComponent var10002 = (JComponent)(Registry.emptyArgs());
      long var7 = 471986896906843084L;
      Object[] var6 = var10002;
      var10002 = Ref.h(471986896906843084L, var6, var7);

      try {
         var10002 = (JComponent)var10002;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      JComponent var3 = var10002;
      var3.setBounds(0, 0, var1.getWidth(), var1.getHeight());
   }

   public void i(Rectangle var1) {
      Object var2 = 403443201352784895L;
      Ref.g(403443201352784895L, var2);
      JComponent var10002 = Registry.emptyArgs();
      long var5 = 132133208927421439L;
      Object[] var4 = var10002;
      var10002 = Ref.h(132133208927421439L, var4, var5);

      try {
         var10002 = (JComponent)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var10002.setBounds(var1);
   }

   public OG3 q() {
      Object var1 = 403443201352784895L;
      return (OG3)Ref.g(403443201352784895L, var1);
   }

   public void P(OG3 var1) {
      long var3 = 403443201352784895L;
      Ref.s(403443201352784895L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1760;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7994035924332159797L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "/\u008d\u0004öa9¾ÞÈ[\u00849Ô9\u0016ß";
      int var5 = "/\u008d\u0004öa9¾ÞÈ[\u00849Ô9\u0016ß".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
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
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }
}





