package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Backspace;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;

public class NB extends T4 {
   public static long[] a;
   public static Integer[] b;

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      return new Dimension(b(28963, 6711902340995496985L), b(667, 2600422355702370208L));
   }

   @Override
   public void layoutContainer(Container var1) {
      String[] var10000 = Backspace.F();
      Component[] var3 = var1.getComponents();
      String[] var2 = var10000;
      int var4 = var3.length;
      int var5 = 0;

      while (var5 < var4) {
         Component var6 = var3[var5];
         label40:
         if (var2 != null) {
            if (var6.getClass().equals(com.finalshell.ui.panel.Y3.class)) {
               com.finalshell.ui.panel.Y3 var7 = (com.finalshell.ui.panel.Y3)var6;
               if (var2 == null) {
                  break label40;
               }

               Rectangle var10001 = (Rectangle)(Registry.emptyArgs());
               long var9 = 346087293806109292L;
               Object var8 = var10001;
               var10001 = Ref.h(346087293806109292L, var8, var9);

               try {
                  var10001 = (Rectangle)var10001;
               } catch (InvocationTargetException var13) {
                  throw new RuntimeException(var13.getTargetException());
               }

               if (var10001 != null) {
                  Rectangle var10003 = (Rectangle)(Registry.emptyArgs());
                  long var11 = 346087293806109292L;
                  Object var10 = var10003;
                  var10003 = Ref.h(346087293806109292L, var10, var11);

                  try {
                     var10003 = (Rectangle)var10003;
                  } catch (InvocationTargetException var12) {
                     throw new RuntimeException(var12.getTargetException());
                  }

                  var7.setBounds(var10003);
               }
            }

            var5++;
         }

         if (var2 == null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19771;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3899595100330472455L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ÃCh\u0001ê\u0092ûÃÙyg\u009c\u0001+\bz";
      int var5 = "ÃCh\u0001ê\u0092ûÃÙyg\u009c\u0001+\bz".length();
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





