package com.finalshell.ui.model;

public final class D2 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static D2 path;
   public static D2 tree;
   public static D2 list;
   public static D2 table;
   public static D2 toolbar;
   public static D2 history;
   public static D2 other;
   public static D2[] G;
   public static long[] a;
   public static Integer[] b;

   public static D2[] values() {
      return (D2[])G.clone();
   }

   public static D2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public D2(String var1, int var2) {
   }

   public static D2[] B() {
      D2[] var10000 = new D2[a(22907, 8884329091997267958L)];
      var10000[0] = path;
      var10000[1] = tree;
      var10000[2] = list;
      var10000[3] = table;
      var10000[4] = toolbar;
      var10000[5] = history;
      var10000[a(10845, 8802187126140110035L)] = other;
      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11916;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var8 = new String[7];
      int var12 = 0;
      String var11 = "\u0006\u001c/\u001f\u0007\u001e\u001a3\u0007p\u001aR\u0005\u0005\u00014\u000e`\u0004\u001a\u0014(\u0003\u0007\u0002\u001c/\u001f}\tY";
      int var13 = "\u0006\u001c/\u001f\u0007\u001e\u001a3\u0007p\u001aR\u0005\u0005\u00014\u000e`\u0004\u001a\u0014(\u0003\u0007\u0002\u001c/\u001f}\tY"
         .length();
      char var10 = 4;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 78;
         String var10001 = var11.substring(++var16, var16 + var10);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 36;
                        break;
                     case 1:
                        var58 = 59;
                        break;
                     case 2:
                        var58 = 18;
                        break;
                     case 3:
                        var58 = 37;
                        break;
                     case 4:
                        var58 = 92;
                        break;
                     case 5:
                        var58 = 53;
                        break;
                     default:
                        var58 = 110;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var8[var12++] = var39;
                  if ((var16 += var10) >= var13) {
                     long var0 = 5636605380910315823L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "\u0002¾:C\"±\u0087\u0000äÉÙ\u00850\u001c\u008eÞ\u0094Ås1ø/ýú";
                     int var5 = "\u0002¾:C\"±\u0087\u0000äÉÙ\u00850\u001c\u008eÞ\u0094Ås1ø/ýú".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     a = var6;
                     b = new Integer[3];
                     path = new D2(var8[3], 0);
                     tree = new D2(var8[5], 1);
                     list = new D2(var8[0], 2);
                     table = new D2(var8[6], 3);
                     toolbar = new D2(var8[1], 4);
                     history = new D2(var8[4], 5);
                     other = new D2(var8[2], a(20645, 4159135922992414249L));
                     G = B();
                     return;
                  }

                  var10 = var11.charAt(var16);
                  break;
               default:
                  var8[var12++] = var39;
                  if ((var16 += var10) < var13) {
                     var10 = var11.charAt(var16);
                     continue label61;
                  }

                  var11 = "JSmZ\u0005J@jS#";
                  var13 = "JSmZ\u0005J@jS#".length();
                  var10 = 4;
                  var16 = -1;
            }

            var10000 = 26;
            var10001 = var11.substring(++var16, var16 + var10);
            var10002 = 0;
         }
      }
   }
}







