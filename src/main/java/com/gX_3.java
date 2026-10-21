package com;

public class gX_3 extends gj_4 {
   private float n;
   private float X;
   private float h;
   private static final String a;
   private static final long[] b;
   private static final Integer[] g;

   public gX_3() {
      this(1.0F);
   }

   public gX_3(float var1) {
      this(var1, var1, var1);
   }

   public gX_3(float var1, float var2, float var3) {
      this.p(var1, var2, var3);
   }

   public void p(float var1, float var2, float var3) {
      this.n = var1;
      this.X = var2;
      this.h = var3;
      this.N = false;
   }

   public void s(float var1) {
      this.p(var1, var1, var1);
   }

   public float U() {
      return this.n;
   }

   @Override
   protected void D() {
      String[] var1;
      label38: {
         String[] var10000 = com.W5.q();
         this.f = this.Z(this.n);
         var1 = var10000;
         gX_3 var2 = this;
         if (var1 != null) {
            if (this.X == this.n) {
               this.d = this.f;
               if (var1 != null) {
                  break label38;
               }
            }

            var2 = this;
         }

         var2.d = this.Z(this.X);
      }

      gX_3 var4;
      label41: {
         float var5;
         int var3 = (var5 = this.h - this.n) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
         if (var1 != null) {
            if (!var3) {
               this.M = this.f;
               if (var1 != null) {
                  return;
               }
            }

            var4 = this;
            if (var1 == null) {
               break label41;
            }

            float var6;
            var3 = (var6 = this.h - this.X) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
         }

         if (!var3) {
            this.M = this.d;
            if (var1 != null) {
               return;
            }
         }

         var4 = this;
      }

      var4.M = this.Z(this.h);
   }

   private int[] Z(float var1) {
      String[] var10000 = com.W5.q();
      int[] var3 = new int[b(28946, 6699172578224408797L)];
      String[] var2 = var10000;
      int var4 = 0;

      while (var4 < b(13384, 3543511213800410501L)) {
         int var5 = (int)(255.0 * Math.pow((double)var4 / 255.0, 1.0 / (double)var1) + 0.5);
         if (var2 != null) {
            if (var5 > b(18623, 2755528337822364019L)) {
               var5 = b(18507, 6649012839953084805L);
            }

            var3[var4] = var5;
            var4++;
         }

         if (var2 == null) {
            break;
         }
      }

      return var3;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "J\u0019yB4gYN\u0017x@':X'".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 2;
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
         var10007 = 2;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 11;
               break;
            case 1:
               var50 = 116;
               break;
            case 2:
               var50 = 23;
               break;
            case 3:
               var50 = 47;
               break;
            case 4:
               var50 = 68;
               break;
            case 5:
               var50 = 22;
               break;
            default:
               var50 = 116;
         }
      } else {
         var34 = 2;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 8397254394260256233L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12 = "\u009e¬\u0000¦Übü4\u008f\u0098Þ\u008fº\u0012D\u0093";
            int var13 = "\u009e¬\u0000¦Übü4\u008f\u0098Þ\u008fº\u0012D\u0093".length();
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
                           g = new Integer[4];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "TGÙ\u0001>W¹l\rûÌ\u009d\n\u0014Äe";
                        var13 = "TGÙ\u0001>W¹l\rûÌ\u009d\n\u0014Äe".length();
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
         var10007 = 2;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 11;
               break;
            case 1:
               var50 = 116;
               break;
            case 2:
               var50 = 23;
               break;
            case 3:
               var50 = 47;
               break;
            case 4:
               var50 = 68;
               break;
            case 5:
               var50 = 22;
               break;
            default:
               var50 = 116;
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
                  var50 = 11;
                  break;
               case 1:
                  var50 = 116;
                  break;
               case 2:
                  var50 = 23;
                  break;
               case 3:
                  var50 = 47;
                  break;
               case 4:
                  var50 = 68;
                  break;
               case 5:
                  var50 = 22;
                  break;
               default:
                  var50 = 116;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 8397254394260256233L;
               long[] var6 = new long[4];
               int var3 = 0;
               String var4 = "\u009e¬\u0000¦Übü4\u008f\u0098Þ\u008fº\u0012D\u0093";
               int var5 = "\u009e¬\u0000¦Übü4\u008f\u0098Þ\u008fº\u0012D\u0093".length();
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
                              g = new Integer[4];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "TGÙ\u0001>W¹l\rûÌ\u009d\n\u0014Äe";
                           var5 = "TGÙ\u0001>W¹l\rûÌ\u009d\n\u0014Äe".length();
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
                  var50 = 11;
                  break;
               case 1:
                  var50 = 116;
                  break;
               case 2:
                  var50 = 23;
                  break;
               case 3:
                  var50 = 47;
                  break;
               case 4:
                  var50 = 68;
                  break;
               case 5:
                  var50 = 22;
                  break;
               default:
                  var50 = 116;
            }
         }
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31183;
      if (g[var3] == null) {
         g[var3] = (int)(b[var3] ^ var1);
      }

      return g[var3];
   }
}





