package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class GG3 extends Gj4 {
   public float Z = 1.0F;
   public float m = 1.0F;
   public static String a;
   public static long[] b;
   public static Integer[] g;

   @Override
   public float q(float var1) {
      var1 *= this.Z;
      return (var1 - 0.5F) * this.m + 0.5F;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      String[] var4;
      int var5;
      int var6;
      int var7;
      int var8;
      float var11;
      int var12;
      label54: {
         int var22;
         label57: {
            var5 = var3 & b(15302, 4140671923746370737L);
            String[] var10000 = W5.q();
            var6 = var3 >> b(24420, 7239521282490011665L) & b(30879, 874709006340601835L);
            var7 = var3 >> b(21129, 7712524956420480505L) & b(20200, 7931202970443874715L);
            var8 = var3 & b(20200, 7931202970443874715L);
            var4 = var10000;
            float var9 = (float)(var6 + var7 + var8);
            float var10 = 418.0F;
            var11 = var10 / var9;
            var12 = var6;
            var22 = var7;
            int var10001 = var6;
            if (var4 != null) {
               if (var7 > var6) {
                  var12 = var7;
               }

               var22 = var8;
               if (var4 == null) {
                  break label57;
               }

               var10001 = var7;
            }

            if (var22 <= var10001) {
               break label54;
            }

            var22 = var8;
         }

         var12 = var22;
      }

      float var13 = 255.0F / (float)var12;
      float var14 = 2.0F;
      float var23 = var13;
      if (var4 != null) {
         if (var13 > var14) {
            var13 = var14;
         }

         var23 = var11;
      }

      float var15 = var23;
      float var25;
      int var24 = (var25 = var11 - var13) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
      if (var4 != null) {
         if (var24 > 0) {
            var15 = var13;
         }

         float var26;
         var24 = (var26 = (float)var6 * var15 - 255.0F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
      }

      if (var4 != null) {
         if (var24 >= 0) {
            Registry.packArgs("");
            long var16 = 627852336435066246L;
            Ref.h2(627852336435066246L, var16);

            try {
               ;
            } catch (InvocationTargetException var18) {
               throw new RuntimeException(var18.getTargetException());
            }
         }

         var6 = (int)((float)var6 * var15);
         var7 = (int)((float)var7 * var15);
         var8 = (int)((float)var8 * var15);
         var24 = var5 | var6 << b(8391, 4398985851202957238L) | var7 << b(11436, 8188803613564232670L) | var8;
      }

      return var24;
   }

   public void k(float var1) {
      this.Z = var1;
      this.N = false;
   }

   public float n() {
      return this.Z;
   }

   public void K(float var1) {
      this.m = var1;
      this.N = false;
   }

   public float X() {
      return this.m;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20337;
      if (g[var3] == null) {
         g[var3] = (int)(b[var3] ^ var1);
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001dcgVLbe\u001dceMLp9*\"%\u0017".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 1;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 1;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 95;
               break;
            case 1:
               var50 = 13;
               break;
            case 2:
               var50 = 10;
               break;
            case 3:
               var50 = 56;
               break;
            case 4:
               var50 = 63;
               break;
            case 5:
               var50 = 16;
               break;
            default:
               var50 = 75;
         }
      } else {
         var34 = 1;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3203742839085871400L;
            long[] var14 = new long[7];
            int var11 = 0;
            String var12 = "1\u0015ðe{\u0081Þ\u008e«j\u001e%\u009f\u00ad,Ù\u009a>ù5Ý¾°L\u0002\u0090\u0016õJ\u0084RþDÜq$¡Ø¡)";
            int var13 = "1\u0015ðe{\u0081Þ\u008e«j\u001e%\u009f\u00ad,Ù\u009a>ù5Ý¾°L\u0002\u0090\u0016õJ\u0084RþDÜq$¡Ø¡)".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           g = new Integer[7];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "&zAê§®\u0006<#å\u0010#\u0086?Å\u0099";
                        var13 = "&zAê§®\u0006<#å\u0010#\u0086?Å\u0099".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 1;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 95;
               break;
            case 1:
               var50 = 13;
               break;
            case 2:
               var50 = 10;
               break;
            case 3:
               var50 = 56;
               break;
            case 4:
               var50 = 63;
               break;
            case 5:
               var50 = 16;
               break;
            default:
               var50 = 75;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 95;
                  break;
               case 1:
                  var50 = 13;
                  break;
               case 2:
                  var50 = 10;
                  break;
               case 3:
                  var50 = 56;
                  break;
               case 4:
                  var50 = 63;
                  break;
               case 5:
                  var50 = 16;
                  break;
               default:
                  var50 = 75;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3203742839085871400L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "1\u0015ðe{\u0081Þ\u008e«j\u001e%\u009f\u00ad,Ù\u009a>ù5Ý¾°L\u0002\u0090\u0016õJ\u0084RþDÜq$¡Ø¡)";
               int var5 = "1\u0015ðe{\u0081Þ\u008e«j\u001e%\u009f\u00ad,Ù\u009a>ù5Ý¾°L\u0002\u0090\u0016õJ\u0084RþDÜq$¡Ø¡)".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              g = new Integer[7];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "&zAê§®\u0006<#å\u0010#\u0086?Å\u0099";
                           var5 = "&zAê§®\u0006<#å\u0010#\u0086?Å\u0099".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 95;
                  break;
               case 1:
                  var50 = 13;
                  break;
               case 2:
                  var50 = 10;
                  break;
               case 3:
                  var50 = 56;
                  break;
               case 4:
                  var50 = 63;
                  break;
               case 5:
                  var50 = 16;
                  break;
               default:
                  var50 = 75;
            }
         }
      }
   }
}





