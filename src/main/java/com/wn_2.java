package com;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class Wn_2 extends com.W5 {
   private int p;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public Wn_2() {
      this.p = a(12310, 6043725273262062438L);
   }

   public Wn_2(int var1) {
      this.p = a(4701, 935603847029119273L);
      this.p = var1;
   }

   public void R(int var1) {
      this.p = var1;
   }

   public int R() {
      return this.p;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label100: {
         String[] var10000 = com.W5.q();
         var4 = var1.getWidth();
         var5 = var1.getHeight();
         int var6 = var1.getType();
         var3 = var10000;
         WritableRaster var7 = var1.getRaster();
         BufferedImage var25 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label100;
            }

            var25 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var25;
      }

      int[] var8 = new int[this.p * this.p];
      int var9 = 0;

      while (var9 < var5) {
         int var10 = 0;

         int var26;
         while (true) {
            if (var10 < var4) {
               int var11 = Math.min(this.p, var4 - var10);
               int var12 = Math.min(this.p, var5 - var9);
               int var13 = var11 * var12;
               this.l(var1, var10, var9, var11, var12, var8);
               int var14 = 0;
               int var15 = 0;
               int var16 = 0;
               int var18 = 0;
               var26 = 0;
               if (var3 == null) {
                  break;
               }

               int var19 = 0;

               label85: {
                  while (var19 < var12) {
                     var26 = 0;
                     if (var3 == null) {
                        break label85;
                     }

                     int var20 = 0;

                     while (true) {
                        if (var20 < var11) {
                           int var17 = var8[var18];
                           var14 += var17 >> a(2536, 2236656074292380313L) & a(3125, 1565285346372470606L);
                           var15 += var17 >> a(8800, 4992849081458551059L) & a(3162, 171589964607047471L);
                           var16 += var17 & a(3162, 171589964607047471L);
                           var18++;
                           var20++;
                           if (var3 == null) {
                              break;
                           }

                           if (var3 != null) {
                              continue;
                           }
                        }

                        var19++;
                        break;
                     }

                     if (var3 == null) {
                        break;
                     }
                  }

                  var26 = var14 / var13 << a(31393, 6920623054707110358L) | var15 / var13 << a(29770, 5204818039570284348L) | var16 / var13;
               }

               int var21 = var26;
               var18 = 0;
               var19 = 0;

               label64: {
                  while (var19 < var12) {
                     var26 = 0;
                     if (var3 == null) {
                        break label64;
                     }

                     int var24 = 0;

                     while (true) {
                        if (var24 < var11) {
                           var8[var18] = var8[var18] & a(6022, 5795552734345288948L) | var21;
                           var18++;
                           var24++;
                           if (var3 == null) {
                              break;
                           }

                           if (var3 != null) {
                              continue;
                           }
                        }

                        var19++;
                        break;
                     }

                     if (var3 == null) {
                        break;
                     }
                  }

                  this.E(var2, var10, var9, var11, var12, var8);
                  var26 = var10 + this.p;
               }

               var10 = var26;
               if (var3 != null) {
                  continue;
               }
            }

            var26 = var9 + this.p;
            break;
         }

         var9 = var26;
         if (var3 == null) {
            break;
         }
      }

      return var2;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "Y\\f7x\u0006%}P1\u001f{\u0019%`V0|:".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 122;
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
         var10007 = 122;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 115;
               break;
            case 1:
               var50 = 79;
               break;
            case 2:
               var50 = 100;
               break;
            case 3:
               var50 = 40;
               break;
            case 4:
               var50 = 110;
               break;
            case 5:
               var50 = 16;
               break;
            default:
               var50 = 62;
         }
      } else {
         var34 = 122;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3865600601891543067L;
            long[] var14 = new long[9];
            int var11 = 0;
            String var12 = "<`îÕr0ñ\u0000d\u0011¤#·ùÄïj\u008c\u0091ÉW¢Ú\u0092TÁ\u0084\u0097O\u009dã\u007fô\u009fóYoz)Ý\u0081HÉg~i§/\u009d±råØ$ßË";
            int var13 = "<`îÕr0ñ\u0000d\u0011¤#·ùÄïj\u008c\u0091ÉW¢Ú\u0092TÁ\u0084\u0097O\u009dã\u007fô\u009fóYoz)Ý\u0081HÉg~i§/\u009d±råØ$ßË".length();
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
                           c = new Integer[9];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u009f\u0005\u009f}×àÁ0âBed\u008dïßª";
                        var13 = "\u009f\u0005\u009f}×àÁ0âBed\u008dïßª".length();
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
         var10007 = 122;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 115;
               break;
            case 1:
               var50 = 79;
               break;
            case 2:
               var50 = 100;
               break;
            case 3:
               var50 = 40;
               break;
            case 4:
               var50 = 110;
               break;
            case 5:
               var50 = 16;
               break;
            default:
               var50 = 62;
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
                  var50 = 115;
                  break;
               case 1:
                  var50 = 79;
                  break;
               case 2:
                  var50 = 100;
                  break;
               case 3:
                  var50 = 40;
                  break;
               case 4:
                  var50 = 110;
                  break;
               case 5:
                  var50 = 16;
                  break;
               default:
                  var50 = 62;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3865600601891543067L;
               long[] var6 = new long[9];
               int var3 = 0;
               String var4 = "<`îÕr0ñ\u0000d\u0011¤#·ùÄïj\u008c\u0091ÉW¢Ú\u0092TÁ\u0084\u0097O\u009dã\u007fô\u009fóYoz)Ý\u0081HÉg~i§/\u009d±råØ$ßË";
               int var5 = "<`îÕr0ñ\u0000d\u0011¤#·ùÄïj\u008c\u0091ÉW¢Ú\u0092TÁ\u0084\u0097O\u009dã\u007fô\u009fóYoz)Ý\u0081HÉg~i§/\u009d±råØ$ßË".length();
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
                              c = new Integer[9];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u009f\u0005\u009f}×àÁ0âBed\u008dïßª";
                           var5 = "\u009f\u0005\u009f}×àÁ0âBed\u008dïßª".length();
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
                  var50 = 115;
                  break;
               case 1:
                  var50 = 79;
                  break;
               case 2:
                  var50 = 100;
                  break;
               case 3:
                  var50 = 40;
                  break;
               case 4:
                  var50 = 110;
                  break;
               case 5:
                  var50 = 16;
                  break;
               default:
                  var50 = 62;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19315;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





