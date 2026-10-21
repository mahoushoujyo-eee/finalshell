package com;

public class hI_3 extends hN_3 {
   private int x;
   private int[] Q;
   private boolean h = false;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public hI_3() {
      this.K(a(30700, 4782267716416545402L));
   }

   public void K(int var1) {
      this.x = var1;
      this.h = false;
   }

   public int i() {
      return this.x;
   }

   protected void e() {
      String[] var10000 = com.W5.q();
      this.Q = new int[a(6579, 4774606376127745062L)];
      String[] var1 = var10000;
      int var3 = this.x;
      if (var1 != null) {
         if (this.x == 1) {
            return;
         }

         var3 = 0;
      }

      int var2 = var3;

      while (var2 < a(6595, 7968360735997119569L)) {
         this.Q[var2] = a(8145, 7659024105586346574L) * (this.x * var2 / a(6595, 7968360735997119569L)) / (this.x - 1);
         var2++;
         if (var1 == null) {
            break;
         }
      }
   }

   @Override
   public int C(int var1, int var2, int var3) {
      String[] var4 = com.W5.q();
      int var10000 = this.h;
      if (var4 != null) {
         if (!this.h) {
            this.h = true;
            this.e();
         }

         var10000 = var3 & a(22430, 874410939915043343L);
      }

      int var5 = var10000;
      int var6 = var3 >> a(21985, 2575101647964635250L) & a(1764, 1278512844339532659L);
      int var7 = var3 >> a(3810, 3847332018334915442L) & a(1764, 1278512844339532659L);
      int var8 = var3 & a(1764, 1278512844339532659L);
      var6 = this.Q[var6];
      var7 = this.Q[var7];
      var8 = this.Q[var8];
      return var5 | var6 << a(29441, 648856275684239007L) | var7 << a(30431, 7393209237886378827L) | var8;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "|\u0014%#liyo\u0014:8{h?E\u001egb0".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 82;
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
         var10007 = 82;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 109;
               break;
            case 1:
               var50 = 41;
               break;
            case 2:
               var50 = 27;
               break;
            case 3:
               var50 = 30;
               break;
            case 4:
               var50 = 76;
               break;
            case 5:
               var50 = 72;
               break;
            default:
               var50 = 4;
         }
      } else {
         var34 = 82;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 4784890934960561614L;
            long[] var14 = new long[10];
            int var11 = 0;
            String var12 = "\u008c\u008d\u0011\u0093º\u009c?²Iá\u009a\u000fDîNB,FXóµ\u0015>\u008dÿ{ïR\u008c'PèËÜè)4\bÐ\u009f,\" c\u0018;\u001d¬ã\u0012þ·\u001e\u0099F´;«kh9\u0015\u009fÁ";
            int var13 = "\u008c\u008d\u0011\u0093º\u009c?²Iá\u009a\u000fDîNB,FXóµ\u0015>\u008dÿ{ïR\u008c'PèËÜè)4\bÐ\u009f,\" c\u0018;\u001d¬ã\u0012þ·\u001e\u0099F´;«kh9\u0015\u009fÁ"
               .length();
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
                           c = new Integer[10];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "O`\u0092Ï}>»A\u009c\u0081¢EpïW\u007f";
                        var13 = "O`\u0092Ï}>»A\u009c\u0081¢EpïW\u007f".length();
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
         var10007 = 82;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 109;
               break;
            case 1:
               var50 = 41;
               break;
            case 2:
               var50 = 27;
               break;
            case 3:
               var50 = 30;
               break;
            case 4:
               var50 = 76;
               break;
            case 5:
               var50 = 72;
               break;
            default:
               var50 = 4;
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
                  var50 = 109;
                  break;
               case 1:
                  var50 = 41;
                  break;
               case 2:
                  var50 = 27;
                  break;
               case 3:
                  var50 = 30;
                  break;
               case 4:
                  var50 = 76;
                  break;
               case 5:
                  var50 = 72;
                  break;
               default:
                  var50 = 4;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 4784890934960561614L;
               long[] var6 = new long[10];
               int var3 = 0;
               String var4 = "\u008c\u008d\u0011\u0093º\u009c?²Iá\u009a\u000fDîNB,FXóµ\u0015>\u008dÿ{ïR\u008c'PèËÜè)4\bÐ\u009f,\" c\u0018;\u001d¬ã\u0012þ·\u001e\u0099F´;«kh9\u0015\u009fÁ";
               int var5 = "\u008c\u008d\u0011\u0093º\u009c?²Iá\u009a\u000fDîNB,FXóµ\u0015>\u008dÿ{ïR\u008c'PèËÜè)4\bÐ\u009f,\" c\u0018;\u001d¬ã\u0012þ·\u001e\u0099F´;«kh9\u0015\u009fÁ"
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
                              c = new Integer[10];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "O`\u0092Ï}>»A\u009c\u0081¢EpïW\u007f";
                           var5 = "O`\u0092Ï}>»A\u009c\u0081¢EpïW\u007f".length();
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
                  var50 = 109;
                  break;
               case 1:
                  var50 = 41;
                  break;
               case 2:
                  var50 = 27;
                  break;
               case 3:
                  var50 = 30;
                  break;
               case 4:
                  var50 = 76;
                  break;
               case 5:
                  var50 = 72;
                  break;
               default:
                  var50 = 4;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21910;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





