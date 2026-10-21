package com.finalshell.core;

import java.util.HashMap;
import java.util.Map;

public class IT3 {
   static int s;
   static int w;
   static int S;
   public final Ph2[] c;
   public final String z;
   public final Zzzzd4BeanInfo W;
   public final boolean Y;
   public Map O;
   public int H;
   public final boolean Z;
   public static long[] a;
   public static Integer[] b;

   public IT3(Ph2[] var1, Zzzzd4BeanInfo var2, String var3, boolean var4, boolean var5) {
      boolean var10001;
      super();
      String var10000 = Nv4.o();
      this.O = new HashMap();
      String var6 = var10000;
      this.H = a(29786, 6175316970159740022L);
      this.c = var1;
      this.z = var3;
      this.W = var2;
      this.Y = var4;
      var10001 = var5;
      label18:
      if (var6 != null) {
         if (!var5) {
            var10001 = var2.x.isEnum();
            if (var6 == null) {
               break label18;
            }

            if (!var10001) {
               var10001 = false;
               break label18;
            }
         }

         var10001 = true;
      }

      this.Z = var10001;
   }

   public int z(String var1) {
      String var10000 = Nv4.o();
      Integer var3 = (Integer)this.O.get(var1);
      String var2 = var10000;
      Integer var5 = var3;
      if (var2 != null) {
         if (var3 == null) {
            this.O.put(var1, this.H++);
         }

         var3 = (Integer)this.O.get(var1);
         var5 = var3;
      }

      return var5;
   }

   public int G(String var1, int var2) {
      String var10000 = Nv4.o();
      Integer var4 = (Integer)this.O.get(var1);
      String var3 = var10000;
      Integer var6 = var4;
      if (var3 != null) {
         if (var4 == null) {
            this.O.put(var1, this.H);
            this.H += var2;
         }

         var4 = (Integer)this.O.get(var1);
         var6 = var4;
      }

      return var6;
   }

   public int H(String var1) {
      int var3 = -1;
      String var10000 = Nv4.o();
      int var4 = 0;
      String var2 = var10000;
      int var5 = this.c.length;

      while (true) {
         label24:
         if (var4 < var5) {
            Ph2 var6 = this.c[var4];
            if (var2 != null) {
               var7 = var6.I.equals(var1);
               if (var2 == null) {
                  break;
               }

               if (var7 != 0) {
                  var3 = var4;
                  if (var2 != null) {
                     break label24;
                  }
               }

               var4++;
            }

            if (var2 != null) {
      Integer var7;
      Integer var7;
               continue;
            }
         }

         var7 = var3;
         break;
      }

      return var7;
   }

   static boolean Z(IT3 var0) {
      return var0.Y;
   }

   static int G(IT3 var0) {
      return var0.H;
   }

   static boolean I(IT3 var0) {
      return var0.Z;
   }

   static String D(IT3 var0) {
      return var0.z;
   }

   static Zzzzd4BeanInfo c(IT3 var0) {
      return var0.W;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24621;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2921285818936924334L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "ÓR\u0099\u001aT\u0005O6¿\u0001£¬hÏ\fÑ";
      int var5 = "ÓR\u0099\u001aT\u0005O6¿\u0001£¬hÏ\fÑ".length();
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
                     s = a(14259, 5612501680661354398L);
                     w = a(5197, 8508222112106837091L);
                     S = a(6973, 5060763141614041874L);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "±0Ìî!Tc´4Û\u0086ð3_lÊ";
                  var5 = "±0Ìî!Tc´4Û\u0086ð3_lÊ".length();
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






