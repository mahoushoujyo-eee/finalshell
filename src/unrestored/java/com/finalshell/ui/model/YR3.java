package com.finalshell.ui.model;

public final class YR3 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static YR3 center;
   public static YR3 topLeft;
   public static YR3 topRight;
   public static YR3 bottomLeft;
   public static YR3 bottomRight;
   public static YR3 topCenter;
   public static YR3 bottomCenter;
   public static YR3 leftCenter;
   public static YR3 rightCenter;
   public static long[] a;
   public static Integer[] b;

   public static YR3[] values() {
      return (YR3[])com.finalshell.reflect.Ref.cloneObject(l);
   }

   public static YR3 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public YR3(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5799;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var8 = new String[9];
      int var12 = 0;
      String var11 = "?\u000f\u0011\u0017aDm.\u0012\n)\u000f\u0015 kGU.\u0006\u0015\u0007?\u000f\u0011\u0018aLm\u0006(\u0005\u000f aX\f)\u000f\u0015 kGZ.\u000e\u00151v\n'\u0005\u0007 GOw?\u0005\u0013\u000b9\t\u0006<pi|%\u0014\u0004&";
      int var13 = "?\u000f\u0011\u0017aDm.\u0012\n)\u000f\u0015 kGU.\u0006\u0015\u0007?\u000f\u0011\u0018aLm\u0006(\u0005\u000f aX\f)\u000f\u0015 kGZ.\u000e\u00151v\n'\u0005\u0007 GOw?\u0005\u0013\u000b9\t\u0006<pi|%\u0014\u0004&"
         .length();
      char var10 = '\t';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 16;
         String var10001 = var11.substring(++var17, var17 + var10);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 91;
                        break;
                     case 1:
                        var65 = 112;
                        break;
                     case 2:
                        var65 = 113;
                        break;
                     case 3:
                        var65 = 68;
                        break;
                     case 4:
                        var65 = 20;
                        break;
                     case 5:
                        var65 = 58;
                        break;
                     default:
                        var65 = 9;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var8[var12++] = var44;
                  if ((var17 += var10) >= var13) {
                     long var0 = 7750794137010530234L;
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "\\\u0081\th´\u0005\f\u0006¦ |)\u009fù.ßô\u0087å\u0083?xNêL¾\u0004\u0013·DzK\u0003{\u0093¿\u0087vIb";
                     int var5 = "\\\u0081\th´\u0005\f\u0006¦ |)\u009fù.ßô\u0087å\u0083?xNêL¾\u0004\u0013·DzK\u0003{\u0093¿\u0087vIb".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    a = var6;
                                    b = new Integer[7];
                                    center = new YR3(var8[3], 0);
                                    topLeft = new YR3(var8[2], 1);
                                    topRight = new YR3(var8[8], 2);
                                    bottomLeft = new YR3(var8[1], 3);
                                    bottomRight = new YR3(var8[7], 4);
                                    topCenter = new YR3(var8[0], 5);
                                    bottomCenter = new YR3(var8[4], a(18965, 3332388938000096436L));
                                    leftCenter = new YR3(var8[5], a(12576, 182949257619220354L));
                                    rightCenter = new YR3(var8[6], a(24523, 5034363418539739501L));
                                    l = B();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\fÓ`\u001a×áÀ?~\u008e-eé^»\b";
                                 var5 = "\fÓ`\u001a×áÀ?~\u008e-eé^»\b".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var8[var12++] = var44;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label70;
                  }

                  var11 = "\u00171+\u001eUyu\u001c97\u001e\b\u00011/8SsO\u0001";
                  var13 = "\u00171+\u001eUyu\u001c97\u001e\b\u00011/8SsO\u0001".length();
                  var10 = 11;
                  var17 = -1;
            }

            var10000 = 46;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }
   private static Object l;
}







