package com.finalshell.core;

import java.util.Random;

public class H22 extends HN3 {
   public int z = a(14039, 8343736757332483402L);
   public int g = 1;
   public boolean a = false;
   public float v = 1.0F;
   public Random w = new Random();
   public static String b;
   public static long[] c;
   public static Integer[] d;

   public void C(int var1) {
      this.z = var1;
   }

   public int F() {
      return this.z;
   }

   public void H(int var1) {
      this.g = var1;
   }

   public int M() {
      return this.g;
   }

   public void L(boolean var1) {
      this.a = var1;
   }

   public boolean G() {
      return this.a;
   }

   public void o(float var1) {
      this.v = var1;
   }

   public float q() {
      return this.v;
   }

   public int J(int var1) {
      String[] var2;
      double var4;
      label34: {
         var2 = W5.q();
         H22 var10001 = this;
         if (var2 != null) {
            if (this.g != 0) {
               var4 = (double)(2.0F * this.w.nextFloat() - 1.0F);
               break label34;
            }

            var10001 = this;
         }

         var4 = var10001.w.nextGaussian();
      }

      var1 += (int)(var4 * (double)this.z);
      int var10000 = var1;
      if (var2 != null) {
         if (var1 < 0) {
            var1 = 0;
            if (var2 != null) {
               return var1;
            }
         }

         var10000 = var1;
      }

      if (var2 == null) {
         return var10000;
      } else {
         if (var10000 > a(22250, 7811926807668030834L)) {
            var1 = a(22250, 7811926807668030834L);
         }

         return var1;
      }
   }

   @Override
   public int C(int var1, int var2, int var3) {
      double var12;
      String[] var4 = W5.q();
      float var13;
      int var10000 = (var13 = this.w.nextFloat() - this.v) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
      if (var4 != null) {
         if (var10000 <= 0) {
            int var5 = var3 & a(10178, 6699114989256969309L);
            int var6 = var3 >> a(30446, 6512885227380923767L) & a(10523, 1659680475165983361L);
            int var7 = var3 >> a(26598, 7266649919726439549L) & a(22250, 7811926807668030834L);
            int var8 = var3 & a(22250, 7811926807668030834L);
            var10000 = (this.a) ? 1 : 0;
            if (var4 != null) {
               if (this.a) {
                  label27: {
                     H22 var11 = this;
                     if (var4 != null) {
                        if (this.g != 0) {
                           var12 = (double)(2.0F * this.w.nextFloat() - 1.0F);
                           break label27;
                        }

                        var11 = this;
                     }

                     var12 = var11.w.nextGaussian();
                  }

                  int var9 = (int)(var12 * (double)this.z);
                  var6 = Iw4.e(var6 + var9);
                  var7 = Iw4.e(var7 + var9);
                  var8 = Iw4.e(var8 + var9);
                  if (var4 != null) {
                     return var5 | var6 << a(20062, 8482305982558627266L) | var7 << a(9973, 5012092736686624107L) | var8;
                  }
               }

               var6 = this.J(var6);
               var7 = this.J(var7);
               var10000 = this.J(var8);
            }

            var8 = var10000;
            return var5 | var6 << a(20062, 8482305982558627266L) | var7 << a(9973, 5012092736686624107L) | var8;
         }

         var10000 = var3;
      }

      return var10000;
   }

   @Override
   public String toString() {
      return b;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11160;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\b\u0003d\"\bG3t6y*As92\u0004x`O\u0013".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 52;
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
         var10007 = 52;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 111;
               break;
            case 1:
               var50 = 67;
               break;
            case 2:
               var50 = 41;
               break;
            case 3:
               var50 = 122;
               break;
            case 4:
               var50 = 85;
               break;
            case 5:
               var50 = 9;
               break;
            default:
               var50 = 98;
         }
      } else {
         var34 = 52;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            b = var39;
            long var9 = 4083431141902918417L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "\u008b\u0015ý0Û\u0083^\u009cCÝÕ®\u009d\tþv$÷º!_\u000f¡o\u0097pLT\u0011\u008eodÓÑ¹¦\u0083wÆÃ\u0004\u0018&f¥È>B";
            int var13 = "\u008b\u0015ý0Û\u0083^\u009cCÝÕ®\u009d\tþv$÷º!_\u000f¡o\u0097pLT\u0011\u008eodÓÑ¹¦\u0083wÆÃ\u0004\u0018&f¥È>B".length();
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
                           c = var14;
                           d = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0082y\u0088\u0003úa®rTrØR6Ì/L";
                        var13 = "\u0082y\u0088\u0003úa®rTrØR6Ì/L".length();
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
         var10007 = 52;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 111;
               break;
            case 1:
               var50 = 67;
               break;
            case 2:
               var50 = 41;
               break;
            case 3:
               var50 = 122;
               break;
            case 4:
               var50 = 85;
               break;
            case 5:
               var50 = 9;
               break;
            default:
               var50 = 98;
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
                  var50 = 111;
                  break;
               case 1:
                  var50 = 67;
                  break;
               case 2:
                  var50 = 41;
                  break;
               case 3:
                  var50 = 122;
                  break;
               case 4:
                  var50 = 85;
                  break;
               case 5:
                  var50 = 9;
                  break;
               default:
                  var50 = 98;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               b = var36;
               long var0 = 4083431141902918417L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "\u008b\u0015ý0Û\u0083^\u009cCÝÕ®\u009d\tþv$÷º!_\u000f¡o\u0097pLT\u0011\u008eodÓÑ¹¦\u0083wÆÃ\u0004\u0018&f¥È>B";
               int var5 = "\u008b\u0015ý0Û\u0083^\u009cCÝÕ®\u009d\tþv$÷º!_\u000f¡o\u0097pLT\u0011\u008eodÓÑ¹¦\u0083wÆÃ\u0004\u0018&f¥È>B".length();
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
                              c = var6;
                              d = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0082y\u0088\u0003úa®rTrØR6Ì/L";
                           var5 = "\u0082y\u0088\u0003úa®rTrØR6Ì/L".length();
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
                  var50 = 111;
                  break;
               case 1:
                  var50 = 67;
                  break;
               case 2:
                  var50 = 41;
                  break;
               case 3:
                  var50 = 122;
                  break;
               case 4:
                  var50 = 85;
                  break;
               case 5:
                  var50 = 9;
                  break;
               default:
                  var50 = 98;
            }
         }
      }
   }
}





