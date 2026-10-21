package com;

import java.awt.Rectangle;

public class yL_3 extends gT_3 {
   private int[][] t;
   private float c = 0.0F;
   private float F = 1.0F;
   private float i = 0.0F;
   private float p = 1.0F;
   private static final String a;
   private static final long[] b;
   private static final Integer[] d;

   public void T(float var1) {
      this.c = var1;
   }

   public float w() {
      return this.c;
   }

   public void d(float var1) {
      this.F = var1;
   }

   public float C() {
      return this.F;
   }

   public void l(float var1) {
      this.i = var1;
   }

   public float Q() {
      return this.i;
   }

   public void A(float var1) {
      this.p = var1;
   }

   public float g() {
      return this.p;
   }

   @Override
   protected int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      String[] var5;
      int var7;
      int var15;
      label81: {
         label80: {
            String[] var10000 = com.W5.q();
            com.zI var6 = new com.zI(var3, var1, var2, 0, var1);
            var5 = var10000;
            if (var6.M() > 0) {
               float var9 = 255.0F / (float)var6.M();
               this.t = new int[3][a(25020, 4631435306475356039L)];
               float var10 = this.c * 255.0F;
               float var11 = this.F * 255.0F;
               float var16;
               var15 = (var16 = var10 - var11) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
               if (var5 != null) {
                  if (var15 == 0) {
                     var11++;
                  }

                  var15 = 0;
               }

               var7 = var15;

               while (var7 < 3) {
                  var15 = 0;
                  if (var5 == null) {
                     break label81;
                  }

                  int var8 = 0;

                  label73: {
                     while (var8 < a(407, 2074392531107389349L)) {
                        this.t[var7][var8] = iw_4.e((int)(255.0F * (this.i + (this.p - this.i) * ((float)var8 - var10) / (var11 - var10))));
                        var8++;
                        if (var5 == null) {
                           break label73;
                        }

                        if (var5 == null) {
                           break;
                        }
                     }

                     var7++;
                  }

                  if (var5 == null) {
                     break;
                  }
               }

               if (var5 != null) {
                  break label80;
               }
            }

            this.t = null;
         }

         var7 = 0;
         var15 = 0;
      }

      int var12 = var15;

      while (true) {
         if (var12 < var2) {
            if (var5 == null) {
               break;
            }

            int var13 = 0;

            label48: {
               while (var13 < var1) {
                  var3[var7] = this.d(var13, var12, var3[var7]);
                  var7++;
                  var13++;
                  if (var5 == null) {
                     break label48;
                  }

                  if (var5 == null) {
                     break;
                  }
               }

               var12++;
            }

            if (var5 != null) {
               continue;
            }
         }

         this.t = null;
         break;
      }

      return var3;
   }

   public int d(int var1, int var2, int var3) {
      if (this.t != null) {
         int var4 = var3 & a(30196, 2431400434846297026L);
         int var5 = this.t[0][var3 >> a(9919, 524616122743568522L) & a(5809, 1360934392350869633L)];
         int var6 = this.t[1][var3 >> a(11924, 7298995651828789415L) & a(26274, 5172968155250522262L)];
         int var7 = this.t[2][var3 & a(26274, 5172968155250522262L)];
         return var4 | var5 << a(25083, 8304953073868373964L) | var6 << a(25351, 8150162246890519862L) | var7;
      } else {
         return var3;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "!\b$Zn63.\u0002>Pp62LI".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 118;
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
         var10007 = 118;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 20;
               break;
            case 1:
               var50 = 17;
               break;
            case 2:
               var50 = 62;
               break;
            case 3:
               var50 = 67;
               break;
            case 4:
               var50 = 106;
               break;
            case 5:
               var50 = 51;
               break;
            default:
               var50 = 106;
         }
      } else {
         var34 = 118;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 8362081296898534500L;
            long[] var14 = new long[9];
            int var11 = 0;
            String var12 = "HsÃã\u0000ó\u001cË¤x¬ê\u0091ò2Á\u0014X¤\u0002w&QZû´\u009db.<¤\u001a9´\r¨\u0010¥S¸ g\u001a°b-G¦æ\u0084\u0013\t#\u0001\u0094þ";
            int var13 = "HsÃã\u0000ó\u001cË¤x¬ê\u0091ò2Á\u0014X¤\u0002w&QZû´\u009db.<¤\u001a9´\r¨\u0010¥S¸ g\u001a°b-G¦æ\u0084\u0013\t#\u0001\u0094þ".length();
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
                           d = new Integer[9];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0084\u0099»\u009f\u0094\u008eT\r\u000eÍ\u0017\u001fÖ9Rã";
                        var13 = "\u0084\u0099»\u009f\u0094\u008eT\r\u000eÍ\u0017\u001fÖ9Rã".length();
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
         var10007 = 118;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 20;
               break;
            case 1:
               var50 = 17;
               break;
            case 2:
               var50 = 62;
               break;
            case 3:
               var50 = 67;
               break;
            case 4:
               var50 = 106;
               break;
            case 5:
               var50 = 51;
               break;
            default:
               var50 = 106;
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
                  var50 = 20;
                  break;
               case 1:
                  var50 = 17;
                  break;
               case 2:
                  var50 = 62;
                  break;
               case 3:
                  var50 = 67;
                  break;
               case 4:
                  var50 = 106;
                  break;
               case 5:
                  var50 = 51;
                  break;
               default:
                  var50 = 106;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 8362081296898534500L;
               long[] var6 = new long[9];
               int var3 = 0;
               String var4 = "HsÃã\u0000ó\u001cË¤x¬ê\u0091ò2Á\u0014X¤\u0002w&QZû´\u009db.<¤\u001a9´\r¨\u0010¥S¸ g\u001a°b-G¦æ\u0084\u0013\t#\u0001\u0094þ";
               int var5 = "HsÃã\u0000ó\u001cË¤x¬ê\u0091ò2Á\u0014X¤\u0002w&QZû´\u009db.<¤\u001a9´\r¨\u0010¥S¸ g\u001a°b-G¦æ\u0084\u0013\t#\u0001\u0094þ"
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
                              d = new Integer[9];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0084\u0099»\u009f\u0094\u008eT\r\u000eÍ\u0017\u001fÖ9Rã";
                           var5 = "\u0084\u0099»\u009f\u0094\u008eT\r\u000eÍ\u0017\u001fÖ9Rã".length();
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
                  var50 = 20;
                  break;
               case 1:
                  var50 = 17;
                  break;
               case 2:
                  var50 = 62;
                  break;
               case 3:
                  var50 = 67;
                  break;
               case 4:
                  var50 = 106;
                  break;
               case 5:
                  var50 = 51;
                  break;
               default:
                  var50 = 106;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7731;
      if (d[var3] == null) {
         d[var3] = (int)(b[var3] ^ var1);
      }

      return d[var3];
   }
}





