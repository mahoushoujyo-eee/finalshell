package com.finalshell.core;

public class YU {
   public static I82 e;
   public UJ P;
   public byte[] p = new byte[4];
   public static long[] a;
   public static Integer[] b;

   public static void c(I82 var0) {
      e = var0;
   }

   public YU(UJ var1) {
      this.P = var1;
   }

   public void M() {
      this.P.X = a(21690, 6771670974593680585L);
   }

   public void d(int var1, boolean var2) {
      int var10000 = (Dm4.J$boolean()) ? 1 : 0;
      int var4 = this.P.X;
      boolean var3 = (var10000) != 0;
      var10000 = (var2) ? 1 : 0;
      if (!var3) {
         if (var2 == 0) {
            var4 -= 4;
         }

         var10000 = -var4 & var1 - 1;
      }

      int var5 = var10000;
      var10000 = var5;
      int var10001 = var1;
      if (!var3) {
         if (var5 < var1) {
            var5 += var1;
         }

         var10000 = var4;
         var10001 = var5;
      }

      var4 = var10000 + var10001;
      if (!var3) {
         if (var2 != 0) {
            var4 -= 4;
         }

         this.p[0] = (byte)(var4 >>> a(26011, 1150365073907807725L));
         this.p[1] = (byte)(var4 >>> a(11591, 3530156642576678195L));
         this.p[2] = (byte)(var4 >>> a(29141, 7873588118821298599L));
         this.p[3] = (byte)var4;
         System.arraycopy(this.p, 0, this.P.g, 0, 4);
         this.P.g[4] = (byte)var5;
      }

      synchronized (e) {
         e.Y(this.P.g, this.P.X, var5);
      }

      this.P.S(var5);
   }

   public int h(int var1, int var2, int var3) {
      int var10000 = (Dm4.J$boolean()) ? 1 : 0;
      int var5 = var1 + 5 + a(28033, 1716368427774639606L);
      boolean var4 = (var10000) != 0;
      int var6 = -var5 & var2 - 1;
      var10000 = var6;
      int var10001 = var2;
      if (!var4) {
         if (var6 < var2) {
            var6 += var2;
         }

         var5 += var6;
         var5 += var3;
         var5 += 32;
         var10000 = this.P.g.length;
         if (var4) {
            return var10000;
         }

         var10001 = var5 + this.P.X - 5 - a(28033, 1716368427774639606L) - var1;
      }

      if (var10000 < var10001) {
         byte[] var7 = new byte[var5 + this.P.X - 5 - a(28033, 1716368427774639606L) - var1];
         System.arraycopy(this.P.g, 0, var7, 0, this.P.g.length);
         this.P.g = var7;
      }

      System.arraycopy(this.P.g, var1 + 5 + a(28033, 1716368427774639606L), this.P.g, var5, this.P.X - 5 - a(28033, 1716368427774639606L) - var1);
      this.P.X = a(29886, 1847022847054832843L);
      this.P.u(var1);
      this.P.X = var1 + 5 + a(28033, 1716368427774639606L);
      return var5;
   }

   public void u(byte var1, int var2, int var3, int var4) {
      System.arraycopy(this.P.g, var3, this.P.g, a(18374, 7143747033848010679L), var4);
      this.P.g[5] = var1;
      this.P.X = a(26882, 721737783733778808L);
      this.P.u(var2);
      this.P.u(var4);
      this.P.X = var4 + 5 + a(9438, 1740106895197123758L);
   }

   public UJ I() {
      return this.P;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4210;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2197234426160027578L;
      long[] var6 = new long[9];
      int var3 = 0;
      String var4 = "ÿÄxï!\u0093v\u0015\u0007HÅX\u0013ýÓvlv7\u0007Üé£\u001d©=3\u008bNEÀ\u0003)\tY\u009d+ÍbOÏ\f\u009e\u009cz´êE\u001c\u0011ö\u000fùÃª\u0099";
      int var5 = "ÿÄxï!\u0093v\u0015\u0007HÅX\u0013ýÓvlv7\u0007Üé£\u001d©=3\u008bNEÀ\u0003)\tY\u009d+ÍbOÏ\f\u009e\u009cz´êE\u001c\u0011ö\u000fùÃª\u0099"
         .length();
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
                     b = new Integer[9];
                     e = null;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "å\u0085+\u0005á<ó{èrW\u0097\u000fêîÄ";
                  var5 = "å\u0085+\u0005á<ó{èrW\u0097\u000fêîÄ".length();
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





