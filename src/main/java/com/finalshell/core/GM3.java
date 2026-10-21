package com.finalshell.core;

import java.awt.Rectangle;

public class GM3 extends GT3 {
   public static float e;
   public static float[] L;
   public static float[] t;
   public static float[] i;
   public static float[] N;
   public static float[] S;
   public static float[] R;
   public static float[] p;
   public static float[] M;
   public float[] d;
   public float[] T;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public GM3() {
      this.d = S;
      this.T = R;
   }

   public void y(float[] var1) {
      this.d = var1;
   }

   public float[] p() {
      return this.d;
   }

   public void f(float[] var1) {
      this.T = var1;
   }

   public float[] Z() {
      return this.T;
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int var36;
      int var37;
      int var6 = 0;
      String[] var10000 = W5.q();
      int[] var7 = new int[var1 * var2];
      String[] var5 = var10000;
      int var8 = 0;

      label97:
      while (true) {
         int var34 = var8;

         label95:
         while (var34 < var2) {
            int var9 = 0;

            label92:
            while (var9 < var1) {
               int var10 = 0;
               int var11 = 0;
               int var12 = 0;
               int var13 = 0;
               int var14 = 0;
               int var15 = 0;
               int var16 = 0;
               int var17 = 0;
               int var18 = 0;
               int var19 = var3[var8 * var1 + var9] & a(12404, 7604787667714226000L);
               var34 = -1;
               if (var5 == null) {
                  continue label95;
               }

               int var20 = -1;

               label90:
               while (true) {
                  int var35 = var20;
                  int var10001 = 1;

                  label87:
                  while (true) {
                     if (var35 <= var10001) {
                        int var21 = var8 + var20;
                        var36 = 0;
                        var10001 = var21;
                        if (var5 == null) {
                           break;
                        }

                        int var22;
                        label82: {
                           label81:
                           if (var5 != null) {
                              if (0 <= var21) {
                                 var36 = var21;
                                 var10001 = var2;
                                 if (var5 == null) {
                                    break label81;
                                 }

                                 if (var21 < var2) {
                                    var22 = var21 * var1;
                                    if (var5 != null) {
                                       break label82;
                                    }
                                 }
                              }

                              var36 = var8;
                              var10001 = var1;
                           }

                           var22 = var36 * var10001;
                        }

                        int var23 = 3 * (var20 + 1) + 1;
                        int var24 = -1;

                        while (var24 <= 1) {
                           label67: {
                              int var25;
                              label66: {
                                 var25 = var9 + var24;
                                 var35 = 0;
                                 if (var5 != null) {
                                    var10001 = var25;
                                    if (var5 == null) {
                                       continue label87;
                                    }

                                    if (0 <= var25) {
                                       var37 = var25;
                                       if (var5 == null) {
                                          break label67;
                                       }

                                       if (var25 < var1) {
                                          break label66;
                                       }
                                    }

                                    var35 = var9;
                                 }

                                 var25 = var35;
                              }

                              var37 = var3[var22 + var25];
                           }

                           int var26 = var37;
                           float var27 = this.T[var23 + var24];
                           float var28 = this.d[var23 + var24];
                           var10 = (var26 & a(18707, 4564500819708038713L)) >> a(11607, 935946842587474559L);
                           var11 = (var26 & a(2848, 3258992809372060681L)) >> a(12797, 1064130171544581841L);
                           var12 = var26 & a(19449, 7698272194334772443L);
                           var13 += (int)(var27 * (float)var10);
                           var14 += (int)(var27 * (float)var11);
                           var15 += (int)(var27 * (float)var12);
                           var16 += (int)(var28 * (float)var10);
                           var17 += (int)(var28 * (float)var11);
                           var18 += (int)(var28 * (float)var12);
                           var24++;
                           if (var5 == null) {
                              break;
                           }
                        }

                        var20++;
                        if (var5 != null) {
                           continue label90;
                        }
                     }

                     var10 = (int)(Math.sqrt((double)(var13 * var13 + var16 * var16)) / 1.8);
                     var11 = (int)(Math.sqrt((double)(var14 * var14 + var17 * var17)) / 1.8);
                     var36 = var15 * var15;
                     var10001 = var18 * var18;
                     break;
                  }

                  var12 = (int)(Math.sqrt((double)(var36 + var10001)) / 1.8);
                  var10 = Iw4.e(var10);
                  var11 = Iw4.e(var11);
                  var12 = Iw4.e(var12);
                  var7[var6++] = var19 | var10 << a(5452, 5960234544762557031L) | var11 << a(5807, 1492394015331750272L) | var12;
                  var9++;
                  if (var5 == null) {
                     break label92;
                  }
                  break;
               }
            }

            var8++;
            if (var5 == null) {
               return var7;
            }
            continue label97;
         }

         return var7;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1839;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "1\u0015O2=\u0017\u0010\u0011\u0005M4:\u0018\u0011\u0010\u0016M$".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var50 = 107;
      char[] var10002 = var10003;
      int var35 = var10004;
      char[] var58;
      byte var66;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var58 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 107;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var66 = 31;
               break;
            case 1:
               var66 = 26;
               break;
            case 2:
               var66 = 67;
               break;
            case 3:
               var66 = 60;
               break;
            case 4:
               var66 = 37;
               break;
            case 5:
               var66 = 83;
               break;
            default:
               var66 = 63;
         }
      } else {
         var50 = 107;
         var35 = var10004;
         if (var10004 <= var8) {
            String var55 = new String(var10003).intern();
            int var41 = -1;
            a = var55;
            long var9 = 5909161447376435688L;
            long[] var14 = new long[14];
            int var11 = 0;
            String var12 = "ÕÖ °\u0013\u008a¨`I°Åe(\u0085\t0\u0010üÔ-Á\u009d7ß:d\u000f\u0006úþ\u008f1\"t²¯]Û«\u009f¾ÓqQð\u001cwÑ\t\u008d\u0093\"GbJá}YSMö]\u0013\u0087ÿµÃßà[4¨\n?Eõäå;,D\u0088\u009cÑ\u0013\u0088PïÈÑËnF.\u008e¸";
            int var13 = "ÕÖ °\u0013\u008a¨`I°Åe(\u0085\t0\u0010üÔ-Á\u009d7ß:d\u000f\u0006úþ\u008f1\"t²¯]Û«\u009f¾ÓqQð\u001cwÑ\t\u008d\u0093\"GbJá}YSMö]\u0013\u0087ÿµÃßà[4¨\n?Eõäå;,D\u0088\u009cÑ\u0013\u0088PïÈÑËnF.\u008e¸"
               .length();
            byte var10 = 0;

            label71:
            while (true) {
               var41 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var41, var10).getBytes("ISO-8859-1");
               long[] var26 = var14;
               var41 = var11++;
               long var48 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var56 = -1;

               while (true) {
                  long var64 = var48 ^ var9;
                  switch (var56) {
                     case 0:
                        var26[var41] = var64;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[14];
                           e = (float)Math.sqrt(2.0);
                           float[] var27 = new float[a(2323, 8253840146799201854L)];
                           var27[0] = 0.0F;
                           var27[1] = 0.0F;
                           var27[2] = -1.0F;
                           var27[3] = 0.0F;
                           var27[4] = 1.0F;
                           var27[5] = 0.0F;
                           var27[a(24811, 2574382003196192712L)] = 0.0F;
                           var27[a(1509, 2813745744877126339L)] = 0.0F;
                           var27[a(5807, 1492394015331750272L)] = 0.0F;
                           L = var27;
                           float[] var28 = new float[a(14335, 3936911163015246033L)];
                           var28[0] = -1.0F;
                           var28[1] = 0.0F;
                           var28[2] = 0.0F;
                           var28[3] = 0.0F;
                           var28[4] = 1.0F;
                           var28[5] = 0.0F;
                           var28[a(28196, 1483324118144542977L)] = 0.0F;
                           var28[a(2656, 1111336436693798215L)] = 0.0F;
                           var28[a(5807, 1492394015331750272L)] = 0.0F;
                           t = var28;
                           float[] var29 = new float[a(14335, 3936911163015246033L)];
                           var29[0] = -1.0F;
                           var29[1] = 0.0F;
                           var29[2] = 1.0F;
                           var29[3] = -1.0F;
                           var29[4] = 0.0F;
                           var29[5] = 1.0F;
                           var29[a(28196, 1483324118144542977L)] = -1.0F;
                           var29[a(2656, 1111336436693798215L)] = 0.0F;
                           var29[a(5807, 1492394015331750272L)] = 1.0F;
                           i = var29;
                           float[] var30 = new float[a(14335, 3936911163015246033L)];
                           var30[0] = -1.0F;
                           var30[1] = -1.0F;
                           var30[2] = -1.0F;
                           var30[3] = 0.0F;
                           var30[4] = 0.0F;
                           var30[5] = 0.0F;
                           var30[a(28196, 1483324118144542977L)] = 1.0F;
                           var30[a(2656, 1111336436693798215L)] = 1.0F;
                           var30[a(5807, 1492394015331750272L)] = 1.0F;
                           N = var30;
                           float[] var31 = new float[a(14335, 3936911163015246033L)];
                           var31[0] = -1.0F;
                           var31[1] = 0.0F;
                           var31[2] = 1.0F;
                           var31[3] = -2.0F;
                           var31[4] = 0.0F;
                           var31[5] = 2.0F;
                           var31[a(28196, 1483324118144542977L)] = -1.0F;
                           var31[a(2656, 1111336436693798215L)] = 0.0F;
                           var31[a(5807, 1492394015331750272L)] = 1.0F;
                           S = var31;
                           float[] var32 = new float[a(14335, 3936911163015246033L)];
                           var32[0] = -1.0F;
                           var32[1] = -2.0F;
                           var32[2] = -1.0F;
                           var32[3] = 0.0F;
                           var32[4] = 0.0F;
                           var32[5] = 0.0F;
                           var32[a(28196, 1483324118144542977L)] = 1.0F;
                           var32[a(2656, 1111336436693798215L)] = 2.0F;
                           var32[a(5807, 1492394015331750272L)] = 1.0F;
                           R = var32;
                           float[] var33 = new float[a(14335, 3936911163015246033L)];
                           var33[0] = -1.0F;
                           var33[1] = 0.0F;
                           var33[2] = 1.0F;
                           var33[3] = -e;
                           var33[4] = 0.0F;
                           var33[5] = e;
                           var33[a(28196, 1483324118144542977L)] = -1.0F;
                           var33[a(2656, 1111336436693798215L)] = 0.0F;
                           var33[a(5807, 1492394015331750272L)] = 1.0F;
                           p = var33;
                           float[] var34 = new float[a(14335, 3936911163015246033L)];
                           var34[0] = -1.0F;
                           var34[1] = -e;
                           var34[2] = -1.0F;
                           var34[3] = 0.0F;
                           var34[4] = 0.0F;
                           var34[5] = 0.0F;
                           var34[a(28196, 1483324118144542977L)] = 1.0F;
                           var34[a(2656, 1111336436693798215L)] = e;
                           var34[a(5807, 1492394015331750272L)] = 1.0F;
                           M = var34;
                           return;
                        }
                        break;
                     default:
                        var26[var41] = var64;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "V¡3úïäÞ&\u0095Ø&Ï8ÙuÌ";
                        var13 = "V¡3úïäÞ&\u0095Ø&Ï8ÙuÌ".length();
                        var10 = 0;
                  }

                  byte var44 = var10;
                  var10 += 8;
                  var16 = var12.substring(var44, var10).getBytes("ISO-8859-1");
                  var26 = var14;
                  var41 = var11++;
                  var48 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var56 = 0;
               }
            }
         }

         var58 = var10003;
         var10005 = var8;
         char var67 = var10003[var8];
         var10007 = 107;
         var10006 = var67;
         switch (var8 % 7) {
            case 0:
               var66 = 31;
               break;
            case 1:
               var66 = 26;
               break;
            case 2:
               var66 = 67;
               break;
            case 3:
               var66 = 60;
               break;
            case 4:
               var66 = 37;
               break;
            case 5:
               var66 = 83;
               break;
            default:
               var66 = 63;
         }
      }

      while (true) {
         var58[var10005] = (char)(var10006 ^ var10007 ^ var66);
         var8++;
         if (var50 == 0) {
            var58 = var10002;
            var10005 = var50;
            char var69 = var10002[var50];
            var10007 = var50;
            var10006 = var69;
            switch (var8 % 7) {
               case 0:
                  var66 = 31;
                  break;
               case 1:
                  var66 = 26;
                  break;
               case 2:
                  var66 = 67;
                  break;
               case 3:
                  var66 = 60;
                  break;
               case 4:
                  var66 = 37;
                  break;
               case 5:
                  var66 = 83;
                  break;
               default:
                  var66 = 63;
            }
         } else {
            if (var35 <= var8) {
               String var52 = new String(var10002).intern();
               int var37 = -1;
               a = var52;
               long var0 = 5909161447376435688L;
               long[] var6 = new long[14];
               int var3 = 0;
               String var4 = "ÕÖ °\u0013\u008a¨`I°Åe(\u0085\t0\u0010üÔ-Á\u009d7ß:d\u000f\u0006úþ\u008f1\"t²¯]Û«\u009f¾ÓqQð\u001cwÑ\t\u008d\u0093\"GbJá}YSMö]\u0013\u0087ÿµÃßà[4¨\n?Eõäå;,D\u0088\u009cÑ\u0013\u0088PïÈÑËnF.\u008e¸";
               int var5 = "ÕÖ °\u0013\u008a¨`I°Åe(\u0085\t0\u0010üÔ-Á\u009d7ß:d\u000f\u0006úþ\u008f1\"t²¯]Û«\u009f¾ÓqQð\u001cwÑ\t\u008d\u0093\"GbJá}YSMö]\u0013\u0087ÿµÃßà[4¨\n?Eõäå;,D\u0088\u009cÑ\u0013\u0088PïÈÑËnF.\u008e¸"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var37 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var37 = var3++;
                  long var46 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var53 = -1;

                  while (true) {
                     long var62 = var46 ^ var0;
                     switch (var53) {
                        case 0:
                           var10000[var37] = var62;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[14];
                              e = (float)Math.sqrt(2.0);
                              float[] var18 = new float[a(2323, 8253840146799201854L)];
                              var18[0] = 0.0F;
                              var18[1] = 0.0F;
                              var18[2] = -1.0F;
                              var18[3] = 0.0F;
                              var18[4] = 1.0F;
                              var18[5] = 0.0F;
                              var18[a(24811, 2574382003196192712L)] = 0.0F;
                              var18[a(1509, 2813745744877126339L)] = 0.0F;
                              var18[a(5807, 1492394015331750272L)] = 0.0F;
                              L = var18;
                              float[] var19 = new float[a(14335, 3936911163015246033L)];
                              var19[0] = -1.0F;
                              var19[1] = 0.0F;
                              var19[2] = 0.0F;
                              var19[3] = 0.0F;
                              var19[4] = 1.0F;
                              var19[5] = 0.0F;
                              var19[a(28196, 1483324118144542977L)] = 0.0F;
                              var19[a(2656, 1111336436693798215L)] = 0.0F;
                              var19[a(5807, 1492394015331750272L)] = 0.0F;
                              t = var19;
                              float[] var20 = new float[a(14335, 3936911163015246033L)];
                              var20[0] = -1.0F;
                              var20[1] = 0.0F;
                              var20[2] = 1.0F;
                              var20[3] = -1.0F;
                              var20[4] = 0.0F;
                              var20[5] = 1.0F;
                              var20[a(28196, 1483324118144542977L)] = -1.0F;
                              var20[a(2656, 1111336436693798215L)] = 0.0F;
                              var20[a(5807, 1492394015331750272L)] = 1.0F;
                              i = var20;
                              float[] var21 = new float[a(14335, 3936911163015246033L)];
                              var21[0] = -1.0F;
                              var21[1] = -1.0F;
                              var21[2] = -1.0F;
                              var21[3] = 0.0F;
                              var21[4] = 0.0F;
                              var21[5] = 0.0F;
                              var21[a(28196, 1483324118144542977L)] = 1.0F;
                              var21[a(2656, 1111336436693798215L)] = 1.0F;
                              var21[a(5807, 1492394015331750272L)] = 1.0F;
                              N = var21;
                              float[] var22 = new float[a(14335, 3936911163015246033L)];
                              var22[0] = -1.0F;
                              var22[1] = 0.0F;
                              var22[2] = 1.0F;
                              var22[3] = -2.0F;
                              var22[4] = 0.0F;
                              var22[5] = 2.0F;
                              var22[a(28196, 1483324118144542977L)] = -1.0F;
                              var22[a(2656, 1111336436693798215L)] = 0.0F;
                              var22[a(5807, 1492394015331750272L)] = 1.0F;
                              S = var22;
                              float[] var23 = new float[a(14335, 3936911163015246033L)];
                              var23[0] = -1.0F;
                              var23[1] = -2.0F;
                              var23[2] = -1.0F;
                              var23[3] = 0.0F;
                              var23[4] = 0.0F;
                              var23[5] = 0.0F;
                              var23[a(28196, 1483324118144542977L)] = 1.0F;
                              var23[a(2656, 1111336436693798215L)] = 2.0F;
                              var23[a(5807, 1492394015331750272L)] = 1.0F;
                              R = var23;
                              float[] var24 = new float[a(14335, 3936911163015246033L)];
                              var24[0] = -1.0F;
                              var24[1] = 0.0F;
                              var24[2] = 1.0F;
                              var24[3] = -e;
                              var24[4] = 0.0F;
                              var24[5] = e;
                              var24[a(28196, 1483324118144542977L)] = -1.0F;
                              var24[a(2656, 1111336436693798215L)] = 0.0F;
                              var24[a(5807, 1492394015331750272L)] = 1.0F;
                              p = var24;
                              float[] var25 = new float[a(14335, 3936911163015246033L)];
                              var25[0] = -1.0F;
                              var25[1] = -e;
                              var25[2] = -1.0F;
                              var25[3] = 0.0F;
                              var25[4] = 0.0F;
                              var25[5] = 0.0F;
                              var25[a(28196, 1483324118144542977L)] = 1.0F;
                              var25[a(2656, 1111336436693798215L)] = e;
                              var25[a(5807, 1492394015331750272L)] = 1.0F;
                              M = var25;
                              return;
                           }
                           break;
                        default:
                           var10000[var37] = var62;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "V¡3úïäÞ&\u0095Ø&Ï8ÙuÌ";
                           var5 = "V¡3úïäÞ&\u0095Ø&Ï8ÙuÌ".length();
                           var2 = 0;
                     }

                     byte var40 = var2;
                     var2 += 8;
                     var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var37 = var3++;
                     var46 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var53 = 0;
                  }
               }
            }

            var58 = var10002;
            var10005 = var8;
            char var68 = var10002[var8];
            var10007 = var50;
            var10006 = var68;
            switch (var8 % 7) {
               case 0:
                  var66 = 31;
                  break;
               case 1:
                  var66 = 26;
                  break;
               case 2:
                  var66 = 67;
                  break;
               case 3:
                  var66 = 60;
                  break;
               case 4:
                  var66 = 37;
                  break;
               case 5:
                  var66 = 83;
                  break;
               default:
                  var66 = 63;
            }
         }
      }
   }
}





