package com.finalshell.core;

import java.awt.image.BufferedImage;

public class Hg4 extends W5 {
   public int O = 0;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void p(int var1) {
      this.O = var1;
   }

   public int R() {
      return this.O;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label102: {
         String[] var10000 = W5.q();
         var4 = var1.getWidth();
         var3 = var10000;
         var5 = var1.getHeight();
         BufferedImage var26 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label102;
            }

            var26 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var26;
      }

      int[] var6 = null;
      int var27 = this.O;
      if (var3 != null) {
         if (this.O == 0) {
            byte var21 = 0;

            while (var21 < var5 - 1) {
               var6 = this.l(var1, 0, var21, var4, 1, var6);
               if (var3 != null) {
                  if (var3 == null) {
                     return var1;
                  }

                  if (var1 != var2) {
                     this.E(var2, 0, var21, var4, 1, var6);
                  }

                  this.E(var2, 0, var21 + 1, var4, 1, var6);
                  var21 += 2;
               }

               if (var3 == null) {
                  return var2;
               }
            }

            return var2;
         }

         var27 = this.O;
      }

      byte var10001 = 1;
      if (var3 != null) {
         if (var27 == 1) {
            byte var20 = 1;

            while (var20 < var5) {
               var6 = this.l(var1, 0, var20, var4, 1, var6);
               if (var3 != null) {
                  if (var3 == null) {
                     return var1;
                  }

                  if (var1 != var2) {
                     this.E(var2, 0, var20, var4, 1, var6);
                  }

                  this.E(var2, 0, var20 - 1, var4, 1, var6);
                  var20 += 2;
               }

               if (var3 == null) {
                  return var2;
               }
            }

            return var2;
         }

         var27 = this.O;
         var10001 = 2;
      }

      if (var27 == var10001) {
         int[] var7 = null;
         byte var8 = 0;

         while (var8 < var5 - 1) {
            var6 = this.l(var1, 0, var8, var4, 1, var6);
            var7 = this.l(var1, 0, var8 + 1, var4, 1, var7);
            int var9 = 0;

            label66: {
               while (var9 < var4) {
                  int var10 = var6[var9];
                  int var11 = var7[var9];
                  int var12 = var10 >> a(22020, 6660909736900286392L) & a(24997, 7304224409362096159L);
                  int var13 = var10 >> a(9962, 2064359976056235863L) & a(16636, 5308548976213934404L);
                  int var14 = var10 >> a(13648, 6918645394162169070L) & a(16636, 5308548976213934404L);
                  int var15 = var10 & a(16636, 5308548976213934404L);
                  int var16 = var11 >> a(9253, 3531568273899857310L) & a(16636, 5308548976213934404L);
                  int var17 = var11 >> a(25099, 5257327558478455730L) & a(16636, 5308548976213934404L);
                  int var18 = var11 >> a(31220, 1515940004305631307L) & a(16636, 5308548976213934404L);
                  int var19 = var11 & a(16636, 5308548976213934404L);
                  var12 = (var12 + var16) / 2;
                  var13 = (var13 + var17) / 2;
                  var14 = (var14 + var18) / 2;
                  var15 = (var15 + var19) / 2;
                  var6[var9] = var12 << a(9253, 3531568273899857310L)
                     | var13 << a(25099, 5257327558478455730L)
                     | var14 << a(31220, 1515940004305631307L)
                     | var15;
                  var9++;
                  if (var3 == null) {
                     break label66;
                  }

                  if (var3 == null) {
                     break;
                  }
               }

               this.E(var2, 0, var8, var4, 1, var6);
               this.E(var2, 0, var8 + 1, var4, 1, var6);
               var8 += 2;
            }

            if (var3 == null) {
               break;
            }
         }
      }

      return var2;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 442;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "8\"\u0017)qj]\u000bf:\"j k\u0002*\u0010)".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 67;
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
         var10007 = 67;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 45;
               break;
            case 1:
               var50 = 8;
               break;
            case 2:
               var50 = 48;
               break;
            case 3:
               var50 = 15;
               break;
            case 4:
               var50 = 93;
               break;
            case 5:
               var50 = 6;
               break;
            default:
               var50 = 90;
         }
      } else {
         var34 = 67;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 6320435293349515449L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "í\u000e\u009f\u0087\u001a3pY]ç¡\u0088Ô'µ?vápüz\u000eQ\u0002käF\u0007Ó\ns\u001bà\u000b\u0097\u0015Ð\u001d$_pis\u0092t\u0080hú";
            int var13 = "í\u000e\u009f\u0087\u001a3pY]ç¡\u0088Ô'µ?vápüz\u000eQ\u0002käF\u0007Ó\ns\u001bà\u000b\u0097\u0015Ð\u001d$_pis\u0092t\u0080hú".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
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
                           c = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "o¥õ\\Ù\u0011G\u0019µ¥ ²p\u00ad7þ";
                        var13 = "o¥õ\\Ù\u0011G\u0019µ¥ ²p\u00ad7þ".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
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
         var10007 = 67;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 45;
               break;
            case 1:
               var50 = 8;
               break;
            case 2:
               var50 = 48;
               break;
            case 3:
               var50 = 15;
               break;
            case 4:
               var50 = 93;
               break;
            case 5:
               var50 = 6;
               break;
            default:
               var50 = 90;
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
                  var50 = 45;
                  break;
               case 1:
                  var50 = 8;
                  break;
               case 2:
                  var50 = 48;
                  break;
               case 3:
                  var50 = 15;
                  break;
               case 4:
                  var50 = 93;
                  break;
               case 5:
                  var50 = 6;
                  break;
               default:
                  var50 = 90;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 6320435293349515449L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "í\u000e\u009f\u0087\u001a3pY]ç¡\u0088Ô'µ?vápüz\u000eQ\u0002käF\u0007Ó\ns\u001bà\u000b\u0097\u0015Ð\u001d$_pis\u0092t\u0080hú";
               int var5 = "í\u000e\u009f\u0087\u001a3pY]ç¡\u0088Ô'µ?vápüz\u000eQ\u0002käF\u0007Ó\ns\u001bà\u000b\u0097\u0015Ð\u001d$_pis\u0092t\u0080hú"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
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
                              c = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "o¥õ\\Ù\u0011G\u0019µ¥ ²p\u00ad7þ";
                           var5 = "o¥õ\\Ù\u0011G\u0019µ¥ ²p\u00ad7þ".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
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
                  var50 = 45;
                  break;
               case 1:
                  var50 = 8;
                  break;
               case 2:
                  var50 = 48;
                  break;
               case 3:
                  var50 = 15;
                  break;
               case 4:
                  var50 = 93;
                  break;
               case 5:
                  var50 = 6;
                  break;
               default:
                  var50 = 90;
            }
         }
      }
   }
}





