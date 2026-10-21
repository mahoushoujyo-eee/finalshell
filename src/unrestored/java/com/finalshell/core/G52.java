package com.finalshell.core;

import java.awt.Rectangle;

public class G52 extends GT3 {
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public short r(short var1, short var2, short var3) {
      String[] var4 = W5.q();
      short var10000 = var1;
      short var10001 = var2;
      if (var4 != null) {
         if (var1 < var2) {
            var1++;
         }

         var10000 = var1;
         var10001 = var3;
      }

      if (var4 != null) {
         if (var10000 < var10001) {
            var1++;
         }

         var10000 = var1;
         var10001 = var2;
      }

      if (var4 != null) {
         if (var10000 > var10001) {
            var1--;
         }

         var10000 = var1;
         if (var4 == null) {
            return var1;
         }

         var10001 = var3;
      }

      if (var10000 > var10001) {
         var1--;
      }

      return var1;
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int var30;
      int var6 = 0;
      String[] var10000 = W5.q();
      short[][] var7 = new short[3][var1];
      short[][] var8 = new short[3][var1];
      short[][] var9 = new short[3][var1];
      int[] var10 = new int[var1 * var2];
      int var11 = 0;
      String[] var5 = var10000;

      while (true) {
         if (var11 < var1) {
            int var12 = var3[var11];
            var7[1][var11] = (short)(var12 >> a(27379, 4442007896337129138L) & a(13998, 5695508856203461357L));
            var8[1][var11] = (short)(var12 >> a(19885, 2549555643292891631L) & a(30414, 749649302192292494L));
            var9[1][var11] = (short)(var12 & a(30414, 749649302192292494L));
            var11++;
            if (var5 == null) {
               break;
            }

            if (var5 != null) {
               continue;
            }
         }

         var11 = 0;
         break;
      }

      label126:
      while (true) {
         int var29 = var11;

         label124:
         while (var29 < var2) {
            label121: {
               label139: {
                  var30 = var11;
                  if (var5 != null) {
                     if (var11 <= 0) {
                        break label139;
                     }

                     var30 = var11;
                  }

                  if (var5 == null) {
                     break label121;
                  }

                  if (var30 < var2 - 1) {
                     var30 = 1;
                     break label121;
                  }
               }

               var30 = 0;
            }

            int var14;
            int var21;
            label110: {
               var21 = var30;
               int var13 = var6 + var1;
               int var31 = var11;
               if (var5 != null) {
                  if (var11 < var2 - 1) {
                     var14 = 0;

                     while (var14 < var1) {
                        int var15 = var3[var13++];
                        var7[2][var14] = (short)(var15 >> a(27988, 7623219778246482195L) & a(30414, 749649302192292494L));
                        var8[2][var14] = (short)(var15 >> a(24178, 2417729281828071991L) & a(30414, 749649302192292494L));
                        var9[2][var14] = (short)(var15 & a(30414, 749649302192292494L));
                        var14++;
                        if (var5 == null) {
                           break label110;
                        }

                        if (var5 == null) {
                           break;
                        }
                     }
                  }

                  var31 = 0;
               }

               var14 = var31;
            }

            while (var14 < var1) {
               var29 = var14;
               if (var5 == null) {
                  continue label124;
               }

               label92: {
                  label143: {
                     if (var5 != null) {
                        if (var14 <= 0) {
                           break label143;
                        }

                        var29 = var14;
                     }

                     if (var5 == null) {
                        break label92;
                     }

                     if (var29 < var1 - 1) {
                        var29 = 1;
                        break label92;
                     }
                  }

                  var29 = 0;
               }

               int var25 = var29;
               short var16 = var7[1][var14];
               short var17 = var8[1][var14];
               int var18 = var9[1][var14];
               int var19 = var14 - 1;
               int var20 = var14 + 1;
               int var32 = var21;
               if (var5 != null) {
                  if (var21 != 0) {
                     var16 = this.r(var16, var7[0][var14], var7[2][var14]);
                     var17 = this.r(var17, var8[0][var14], var8[2][var14]);
                     var18 = this.r((short)var18, var9[0][var14], var9[2][var14]);
                  }

                  var32 = var25;
               }

               if (var5 != null) {
                  if (var32 != 0) {
                     var16 = this.r(var16, var7[1][var19], var7[1][var20]);
                     var17 = this.r(var17, var8[1][var19], var8[1][var20]);
                     var18 = this.r((short)var18, var9[1][var19], var9[1][var20]);
                  }

                  var32 = var21;
               }

               label144: {
                  if (var5 != null) {
                     if (var32 == 0) {
                        break label144;
                     }

                     var32 = var25;
                  }

                  if (var5 != null) {
                     if (var32 == 0) {
                        break label144;
                     }

                     var16 = this.r(var16, var7[0][var19], var7[2][var20]);
                     var17 = this.r(var17, var8[0][var19], var8[2][var20]);
                     short var28 = this.r((short)var18, var9[0][var19], var9[2][var20]);
                     var16 = this.r(var16, var7[2][var19], var7[0][var20]);
                     var17 = this.r(var17, var8[2][var19], var8[0][var20]);
                     var32 = this.r(var28, var9[2][var19], var9[0][var20]);
                  }

                  var18 = var32;
               }

               var10[var6] = var3[var6] & a(28955, 5234124418389575005L)
                  | var16 << a(27988, 7623219778246482195L)
                  | var17 << a(24178, 2417729281828071991L)
                  | var18;
               var6++;
               var14++;
               if (var5 == null) {
                  break;
               }
            }

            short[] var22 = var7[0];
            var7[0] = var7[1];
            var7[1] = var7[2];
            var7[2] = var22;
            short[] var23 = var8[0];
            var8[0] = var8[1];
            var8[1] = var8[2];
            var8[2] = var23;
            short[] var24 = var9[0];
            var9[0] = var9[1];
            var9[1] = var9[2];
            var9[2] = var24;
            var11++;
            if (var5 == null) {
               return var10;
            }
            continue label126;
         }

         return var10;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29763;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      long var30;
      char[] var10003 = "\u007f{\u0012\u001a<}<Ng\u0002\u000bxU<\u00139I".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 31;
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
         var10007 = 31;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 34;
               break;
            case 1:
               var50 = 8;
               break;
            case 2:
               var50 = 120;
               break;
            case 3:
               var50 = 119;
               break;
            case 4:
               var50 = 12;
               break;
            case 5:
               var50 = 38;
               break;
            default:
               var50 = 70;
         }
      } else {
         var34 = 31;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 2994476063676801050L;
            long[] var14 = new long[7];
            int var11 = 0;
            String var12 = "¸+´\u0000¢Äâ\b«5åu:M\u0019ý,k`mÑz>¸\u0002\u000b]îÄ\u0097\"keü\u000f©àÀ¹\u0019";
            int var13 = "¸+´\u0000¢Äâ\b«5åu:M\u0019ý,k`mÑz>¸\u0002\u000b]îÄ\u0097\"keü\u000f©àÀ¹\u0019".length();
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
                           c = new Integer[7];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "¾\u0015@\u0092ü\u0092¥GK\u009eÒ\u0086\u0091±\u008a%";
                        var13 = "¾\u0015@\u0092ü\u0092¥GK\u009eÒ\u0086\u0091±\u008a%".length();
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
         var10007 = 31;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 34;
               break;
            case 1:
               var50 = 8;
               break;
            case 2:
               var50 = 120;
               break;
            case 3:
               var50 = 119;
               break;
            case 4:
               var50 = 12;
               break;
            case 5:
               var50 = 38;
               break;
            default:
               var50 = 70;
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
                  var50 = 34;
                  break;
               case 1:
                  var50 = 8;
                  break;
               case 2:
                  var50 = 120;
                  break;
               case 3:
                  var50 = 119;
                  break;
               case 4:
                  var50 = 12;
                  break;
               case 5:
                  var50 = 38;
                  break;
               default:
                  var50 = 70;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 2994476063676801050L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "¸+´\u0000¢Äâ\b«5åu:M\u0019ý,k`mÑz>¸\u0002\u000b]îÄ\u0097\"keü\u000f©àÀ¹\u0019";
               int var5 = "¸+´\u0000¢Äâ\b«5åu:M\u0019ý,k`mÑz>¸\u0002\u000b]îÄ\u0097\"keü\u000f©àÀ¹\u0019".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  long[] var10000 = var6;
                  var21 = var3++;
                  var30 = ((long)var7[0] & 255L) << 56
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
                              c = new Integer[7];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "¾\u0015@\u0092ü\u0092¥GK\u009eÒ\u0086\u0091±\u008a%";
                           var5 = "¾\u0015@\u0092ü\u0092¥GK\u009eÒ\u0086\u0091±\u008a%".length();
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
                  var50 = 34;
                  break;
               case 1:
                  var50 = 8;
                  break;
               case 2:
                  var50 = 120;
                  break;
               case 3:
                  var50 = 119;
                  break;
               case 4:
                  var50 = 12;
                  break;
               case 5:
                  var50 = 38;
                  break;
               default:
                  var50 = 70;
            }
         }
      }
   }
}





