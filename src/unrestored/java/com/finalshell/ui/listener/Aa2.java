package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.AR;
import com.finalshell.task.D32;
import com.finalshell.ui.panel.Ky4;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Aa2 implements MouseListener {
   public final com.finalshell.ui.panel.OG3 E;
   public static long[] a;
   public static Integer[] b;

   public Aa2(com.finalshell.ui.panel.OG3 var1) {
      this.E = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      com.finalshell.ui.panel.OG3.T();
      Ref.g(388376917454860932L, null);
      Object[] var10002 = Registry.packArgs(new com.finalshell.task.L8(this), a(15643, 9187351744884100080L));
      long var4 = 266288712085965362L;
      Object[] var3 = var10002;
      Ref.h(266288712085965362L, var3, var4);
      Ref.g(388376917454860932L, null);
      var10002 = Registry.packArgs(new D32(this), a(5173, 2458248588370961117L));
      long var6 = 266288712085965362L;
      Object[] var5 = var10002;
      Ref.h(266288712085965362L, var5, var6);
      Ref.g(388376917454860932L, null);
      Object[] var10003 = Registry.packArgs(new AR(this), a(24283, 8257302625511942194L));
      long var8 = 266288712085965362L;
      Object[] var7 = var10003;
      Ref.h(266288712085965362L, var7, var8);
      if (Ky4.F$arrString() != null) {
         com.finalshell.ui.panel.OG3.B(new int[1]);
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30441;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3204507853210650952L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "\u0091\u009e\u0098Ô*\u0018\"\u0092Ì\u0015\u001c0\u0019æê¹\u0084l³Ï2óÂÜ";
      int var5 = "\u0091\u009e\u0098Ô*\u0018\"\u0092Ì\u0015\u001c0\u0019æê¹\u0084l³Ï2óÂÜ".length();
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
      b = new Integer[3];
   }
}





