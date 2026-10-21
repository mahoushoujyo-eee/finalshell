package com.finalshell.core;

import java.awt.Component;
import javax.swing.JTable;

public class RX3 extends Rt4 {
   public static long[] b;
   public static Integer[] c;

   public RX3() {
      super(n());
      this.N(1);
   }

   @Override
   public Component getTableCellEditorComponent(JTable var1, Object var2, boolean var3, int var4, int var5) {
      Component var6 = super.getTableCellEditorComponent(var1, var2, var3, var4, var5);
      var6.setBackground(var1.getSelectionBackground());
      return var6;
   }

   public static UE n() {
      UE var0 = new UE();
      var0.setHorizontalAlignment(0);
      var0.w(false);
      var0.setOpaque(true);
      var0.setFocusable(false);
      var0.e(0);
      var0.G$void(a(7253, 7623217649089190938L));
      var0.u(a(11779, 8707579546186919501L));
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 79;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2039888367663307873L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Vö\u0086\u0083SvÀw2VË\u0015Çèr ";
      int var5 = "Vö\u0086\u0083SvÀw2VË\u0015Çèr ".length();
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

      b = var6;
      c = new Integer[2];
   }
}





