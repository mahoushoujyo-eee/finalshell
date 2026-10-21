package com.finalshell.core;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class H72 extends W5 {
   public BufferedImage C;
   public float J;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void f(BufferedImage var1) {
      this.C = var1;
   }

   public BufferedImage n() {
      return this.C;
   }

   public void m(float var1) {
      this.J = var1;
   }

   public float k() {
      return this.J;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var4 = var1.getWidth();
      String[] var10000 = W5.q();
      int var5 = var1.getHeight();
      int var6 = var1.getType();
      WritableRaster var7 = var1.getRaster();
      String[] var3 = var10000;
      BufferedImage var28 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = this.createCompatibleDestImage(var1, null);
         }

         var28 = var2;
      }

      WritableRaster var8 = var28.getRaster();
      BufferedImage var29 = this.C;
      if (var3 != null) {
         if (this.C != null) {
            var4 = Math.min(var4, this.C.getWidth());
            var5 = Math.min(var5, this.C.getWidth());
            int[] var9 = null;
            int[] var10 = null;
            int var11 = 0;

            while (var11 < var5) {
               var9 = this.l(var1, 0, var11, var4, 1, var9);
               var10 = this.l(this.C, 0, var11, var4, 1, var10);
               int var12 = 0;

               label37: {
                  while (var12 < var4) {
                     int var13 = var9[var12];
                     int var14 = var10[var12];
                     int var15 = var13 >> a(22318, 1419353154635558414L) & a(7865, 2184163835890050975L);
                     int var16 = var13 >> a(26666, 2881362310166139145L) & a(26743, 6187875281530376530L);
                     int var17 = var13 >> a(27031, 8340520092832977075L) & a(26743, 6187875281530376530L);
                     int var18 = var13 & a(26743, 6187875281530376530L);
                     int var19 = var14 >> a(13542, 5264367012463283652L) & a(26743, 6187875281530376530L);
                     int var20 = var14 >> a(31004, 8322430865805787195L) & a(26743, 6187875281530376530L);
                     int var21 = var14 >> a(1019, 2862013292942637786L) & a(26743, 6187875281530376530L);
                     int var22 = var14 & a(26743, 6187875281530376530L);
                     var16 = Iw4.e(NM.Q(this.J, var16, var20));
                     var17 = Iw4.e(NM.Q(this.J, var17, var21));
                     var18 = Iw4.e(NM.Q(this.J, var18, var22));
                     var9[var12] = var15 << a(13542, 5264367012463283652L)
                        | var16 << a(31004, 8322430865805787195L)
                        | var17 << a(1019, 2862013292942637786L)
                        | var18;
                     var12++;
                     if (var3 == null) {
                        break label37;
                     }

                     if (var3 == null) {
                        break;
                     }
                  }

                  this.E(var2, 0, var11, var4, 1, var9);
                  var11++;
               }

               if (var3 == null) {
                  break;
               }
            }
         }

         var29 = var2;
      }

      return var29;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14627;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = ">\u0015\u000513\u001c\u001dT:\r 5\u001a\u001e\u0014\u001f\u0002 5F@U".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 60;
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
         var10007 = 60;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 71;
               break;
            case 1:
               var50 = 79;
               break;
            case 2:
               var50 = 95;
               break;
            case 3:
               var50 = 104;
               break;
            case 4:
               var50 = 108;
               break;
            case 5:
               var50 = 84;
               break;
            default:
               var50 = 82;
         }
      } else {
         var34 = 60;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 6499792767935496911L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "V\fR¿\u0080Ô\u0013ÖËjZ«7ZO\u0013\u0013Ã)Òâ8x\u001dKµ»\u008eV\u0093,ÙùË¸Ï\u0086k\u0002ä=Øc\u009d\u0007\tå¯";
            int var13 = "V\fR¿\u0080Ô\u0013ÖËjZ«7ZO\u0013\u0013Ã)Òâ8x\u001dKµ»\u008eV\u0093,ÙùË¸Ï\u0086k\u0002ä=Øc\u009d\u0007\tå¯".length();
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
                           c = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "a\u0012\u0014A`{\u0013b©\u0088\u0086~Y#\u0092t";
                        var13 = "a\u0012\u0014A`{\u0013b©\u0088\u0086~Y#\u0092t".length();
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
         var10007 = 60;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 71;
               break;
            case 1:
               var50 = 79;
               break;
            case 2:
               var50 = 95;
               break;
            case 3:
               var50 = 104;
               break;
            case 4:
               var50 = 108;
               break;
            case 5:
               var50 = 84;
               break;
            default:
               var50 = 82;
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
                  var50 = 71;
                  break;
               case 1:
                  var50 = 79;
                  break;
               case 2:
                  var50 = 95;
                  break;
               case 3:
                  var50 = 104;
                  break;
               case 4:
                  var50 = 108;
                  break;
               case 5:
                  var50 = 84;
                  break;
               default:
                  var50 = 82;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 6499792767935496911L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "V\fR¿\u0080Ô\u0013ÖËjZ«7ZO\u0013\u0013Ã)Òâ8x\u001dKµ»\u008eV\u0093,ÙùË¸Ï\u0086k\u0002ä=Øc\u009d\u0007\tå¯";
               int var5 = "V\fR¿\u0080Ô\u0013ÖËjZ«7ZO\u0013\u0013Ã)Òâ8x\u001dKµ»\u008eV\u0093,ÙùË¸Ï\u0086k\u0002ä=Øc\u009d\u0007\tå¯".length();
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
                              c = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "a\u0012\u0014A`{\u0013b©\u0088\u0086~Y#\u0092t";
                           var5 = "a\u0012\u0014A`{\u0013b©\u0088\u0086~Y#\u0092t".length();
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
                  var50 = 71;
                  break;
               case 1:
                  var50 = 79;
                  break;
               case 2:
                  var50 = 95;
                  break;
               case 3:
                  var50 = 104;
                  break;
               case 4:
                  var50 = 108;
                  break;
               case 5:
                  var50 = 84;
                  break;
               default:
                  var50 = 82;
            }
         }
      }
   }
}





