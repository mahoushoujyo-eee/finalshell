package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.lang.reflect.InvocationTargetException;

public abstract class Ck2 implements LayoutManager2 {
   public static long[] a;
   public static Integer[] b;

   @Override
   public void addLayoutComponent(Component var1, Object var2) {
      Object[] var10001 = Registry.packArgs(var1, var2);
      long var4 = 211984589505220492L;
      Object[] var3 = var10001;
      Ref.h(211984589505220492L, var3, var4);

      try {
         ;
      } catch (RuntimeException var5) {
         throw new RuntimeException(var5);
      }
   }

   @Override
   public void addLayoutComponent(String var1, Component var2) {
      Object[] var10001 = Registry.packArgs(var2, var1);
      long var4 = 211984589505220492L;
      Object[] var3 = var10001;
      Ref.h(211984589505220492L, var3, var4);

      try {
         ;
      } catch (RuntimeException var5) {
         throw new RuntimeException(var5);
      }
   }

   @Override
   public void removeLayoutComponent(Component var1) {
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 455538072076904486L;
      Object[] var2 = var10001;
      Ref.h(455538072076904486L, var2, var3);

      try {
         ;
      } catch (RuntimeException var4) {
         throw new RuntimeException(var4);
      }
   }

   public void O(Component var1, Object var2) {
   }

   public void B(Component var1) {
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return this.preferredLayoutSize(var1);
   }

   @Override
   public Dimension maximumLayoutSize(Container var1) {
      return new Dimension(a(10031, 8514026021197084715L), a(10137, 963672662800955548L));
   }

   @Override
   public float getLayoutAlignmentX(Container var1) {
      return 0.5F;
   }

   @Override
   public float getLayoutAlignmentY(Container var1) {
      return 0.5F;
   }

   @Override
   public void invalidateLayout(Container var1) {
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24324;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1452564465116053195L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0093\u007f\u00174º\u0085y\u001f=\u0087\u0003\byfy¨";
      int var5 = "\u0093\u007f\u00174º\u0085y\u001f=\u0087\u0003\byfy¨".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





