package com;

import java.awt.image.BufferedImage;

public class hv_4 extends com.W5 {
   private float D;
   private float M;
   private int A = 1;
   private boolean z = true;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public hv_4() {
   }

   public hv_4(float var1, float var2, int var3) {
      this.D = var1;
      this.M = var2;
      this.A = var3;
   }

   public void m(boolean var1) {
      this.z = var1;
   }

   public boolean z() {
      return this.z;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label43: {
         var4 = var1.getWidth();
         String[] var10000 = com.W5.q();
         var5 = var1.getHeight();
         var3 = var10000;
         BufferedImage var9 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label43;
            }

            var9 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var9;
      }

      int[] var6 = new int[var4 * var5];
      int[] var7 = new int[var4 * var5];
      this.l(var1, 0, 0, var4, var5, var6);
      byte var10 = this.z;
      if (var3 != null) {
         if (this.z) {
            NM.g(var6, 0, var6.length);
         }

         var10 = 0;
      }

      int var8 = var10;

      while (true) {
         if (var8 < this.A) {
            C(var6, var7, var4, var5, this.D);
            C(var7, var6, var5, var4, this.M);
            var8++;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         N(var6, var7, var4, var5, this.D);
         N(var7, var6, var5, var4, this.M);
         break;
      }

      hv_4 var11 = this;
      if (var3 != null) {
         if (this.z) {
            NM.L(var6, 0, var6.length);
         }

         var11 = this;
      }

      var11.E(var2, 0, 0, var4, var5, var6);
      return var2;
   }

   public static void C(int[] var0, int[] var1, int var2, int var3, float var4) {
      int var6 = var2 - 1;
      String[] var10002 = com.W5.q();
      int var7 = (int)var4;
      String[] var5 = var10002;
      int var8 = 2 * var7 + 1;
      int[] var9 = new int[a(12793, 7274310190022921034L) * var8];
      int var10 = 0;

      while (true) {
         if (var10 < a(31419, 8382217966437515265L) * var8) {
            var9[var10] = var10 / var8;
            var10++;
            if (var5 == null) {
               break;
            }

            if (var5 != null) {
               continue;
            }
         }

         var10 = 0;
         break;
      }

      int var11 = 0;

      while (var11 < var3) {
         int var12 = var11;
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         int var17 = -var7;

         while (true) {
            if (var17 <= var7) {
               int var18 = var0[var10 + NM.L(var17, 0, var2 - 1)];
               var13 += var18 >> a(10225, 4045218070481837386L) & a(10621, 5672627276802462658L);
               var14 += var18 >> a(25792, 4941131323126242929L) & a(7459, 4736922753661478813L);
               var15 += var18 >> a(2677, 817984506768208076L) & a(7459, 4736922753661478813L);
               var16 += var18 & a(7459, 4736922753661478813L);
               var17++;
               if (var5 == null) {
                  break;
               }

               if (var5 != null) {
                  continue;
               }
            }

            var17 = 0;
            break;
         }

         int var10000;
         int var10001;
         while (true) {
            if (var17 < var2) {
               var1[var12] = var9[var13] << a(16461, 5297646419139459834L)
                  | var9[var14] << a(10267, 4561252707083031209L)
                  | var9[var15] << a(31243, 6167613121216594099L)
                  | var9[var16];
               int var22 = var17 + var7 + 1;
               var10000 = var22;
               var10001 = var6;
               if (var5 == null) {
                  break;
               }

               if (var5 != null) {
                  if (var22 > var6) {
                     var22 = var6;
                  }

                  var10000 = var17;
                  var10001 = var7;
               }

               int var19 = var10000 - var10001;
               var10000 = var19;
               if (var5 != null) {
                  if (var19 < 0) {
                     var19 = 0;
                  }

                  var10000 = var0[var10 + var22];
               }

               int var20 = var10000;
               int var21 = var0[var10 + var19];
               var13 += (var20 >> a(16461, 5297646419139459834L) & a(7459, 4736922753661478813L))
                  - (var21 >> a(16461, 5297646419139459834L) & a(7459, 4736922753661478813L));
               var14 += (var20 & a(4117, 7412759598701685413L)) - (var21 & a(26823, 5289931211000631923L)) >> a(10267, 4561252707083031209L);
               var15 += (var20 & a(19707, 4570119171132978765L)) - (var21 & a(7637, 3621344387041896288L)) >> a(31243, 6167613121216594099L);
               var16 += (var20 & a(7459, 4736922753661478813L)) - (var21 & a(7459, 4736922753661478813L));
               var12 += var3;
               var17++;
               if (var5 != null) {
                  continue;
               }
            }

            var10000 = var10;
            var10001 = var2;
            break;
         }

         var10 = var10000 + var10001;
         var11++;
         if (var5 == null) {
            break;
         }
      }
   }

   public static void N(int[] var0, int[] var1, int var2, int var3, float var4) {
      var4 -= (float)((int)var4);
      float var6 = 1.0F / (1.0F + 2.0F * var4);
      int var7 = 0;
      String[] var10000 = com.W5.q();
      int var8 = 0;
      String[] var5 = var10000;

      while (var8 < var3) {
         var1[var8] = var0[0];
         int var9 = var8 + var3;
         int var10 = 1;

         while (true) {
            if (var10 < var2 - 1) {
               int var11 = var7 + var10;
               int var12 = var0[var11 - 1];
               int var13 = var0[var11];
               int var14 = var0[var11 + 1];
               int var15 = var12 >> a(16461, 5297646419139459834L) & a(7459, 4736922753661478813L);
               int var16 = var12 >> a(10267, 4561252707083031209L) & a(7459, 4736922753661478813L);
               int var17 = var12 >> a(31243, 6167613121216594099L) & a(7459, 4736922753661478813L);
               int var18 = var12 & a(7459, 4736922753661478813L);
               int var19 = var13 >> a(16461, 5297646419139459834L) & a(7459, 4736922753661478813L);
               int var20 = var13 >> a(10267, 4561252707083031209L) & a(7459, 4736922753661478813L);
               int var21 = var13 >> a(31243, 6167613121216594099L) & a(7459, 4736922753661478813L);
               int var22 = var13 & a(7459, 4736922753661478813L);
               int var23 = var14 >> a(16461, 5297646419139459834L) & a(7459, 4736922753661478813L);
               int var24 = var14 >> a(10267, 4561252707083031209L) & a(7459, 4736922753661478813L);
               int var25 = var14 >> a(31243, 6167613121216594099L) & a(7459, 4736922753661478813L);
               int var26 = var14 & a(7459, 4736922753661478813L);
               var15 = var19 + (int)((float)(var15 + var23) * var4);
               var16 = var20 + (int)((float)(var16 + var24) * var4);
               var17 = var21 + (int)((float)(var17 + var25) * var4);
               var18 = var22 + (int)((float)(var18 + var26) * var4);
               var15 = (int)((float)var15 * var6);
               var16 = (int)((float)var16 * var6);
               var17 = (int)((float)var17 * var6);
               var18 = (int)((float)var18 * var6);
               var1[var9] = var15 << a(16461, 5297646419139459834L) | var16 << a(10267, 4561252707083031209L) | var17 << a(31243, 6167613121216594099L) | var18;
               var9 += var3;
               var10++;
               if (var5 == null) {
                  break;
               }

               if (var5 != null) {
                  continue;
               }
            }

            var1[var9] = var0[var2 - 1];
            var7 += var2;
            var8++;
            break;
         }

         if (var5 == null) {
            break;
         }
      }
   }

   public void d(float var1) {
      this.D = var1;
   }

   public float N() {
      return this.D;
   }

   public void I(float var1) {
      this.M = var1;
   }

   public float M() {
      return this.M;
   }

   public void P(float var1) {
      this.D = this.M = var1;
   }

   public float a() {
      return this.D;
   }

   public void n(int var1) {
      this.A = var1;
   }

   public int h() {
      return this.A;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0012dKlU\u0018 ((|r\u000f(a~&".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 15;
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
         var10007 = 15;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 95;
               break;
            case 1:
               var50 = 7;
               break;
            case 2:
               var50 = 49;
               break;
            case 3:
               var50 = 17;
               break;
            case 4:
               var50 = 117;
               break;
            case 5:
               var50 = 85;
               break;
            default:
               var50 = 64;
         }
      } else {
         var34 = 15;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3965898513203079348L;
            long[] var14 = new long[14];
            int var11 = 0;
            String var12 = "Ñf1³ÖÁ:\r\u001bä\u0098ãÐê\"þ·¾[Sã¼\u0002\u0011\u009bß¬Z)ÆöÕ}h3fN-¡ùO¥m·àÕRV_\u001fÏtÃ¶úÇ¸0T}øDpÔõdäê!ßéµ9¬Âcl·µæ\u0096' 7¬\u009fh\u000frs\u00035K\t\u0018p";
            int var13 = "Ñf1³ÖÁ:\r\u001bä\u0098ãÐê\"þ·¾[Sã¼\u0002\u0011\u009bß¬Z)ÆöÕ}h3fN-¡ùO¥m·àÕRV_\u001fÏtÃ¶úÇ¸0T}øDpÔõdäê!ßéµ9¬Âcl·µæ\u0096' 7¬\u009fh\u000frs\u00035K\t\u0018p"
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
                           c = new Integer[14];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "*YChÒÍ\u000fÖ\u009dL\u001a\u00ado¸»\u0089";
                        var13 = "*YChÒÍ\u000fÖ\u009dL\u001a\u00ado¸»\u0089".length();
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
         var10007 = 15;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 95;
               break;
            case 1:
               var50 = 7;
               break;
            case 2:
               var50 = 49;
               break;
            case 3:
               var50 = 17;
               break;
            case 4:
               var50 = 117;
               break;
            case 5:
               var50 = 85;
               break;
            default:
               var50 = 64;
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
                  var50 = 7;
                  break;
               case 2:
                  var50 = 49;
                  break;
               case 3:
                  var50 = 17;
                  break;
               case 4:
                  var50 = 117;
                  break;
               case 5:
                  var50 = 85;
                  break;
               default:
                  var50 = 64;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3965898513203079348L;
               long[] var6 = new long[14];
               int var3 = 0;
               String var4 = "Ñf1³ÖÁ:\r\u001bä\u0098ãÐê\"þ·¾[Sã¼\u0002\u0011\u009bß¬Z)ÆöÕ}h3fN-¡ùO¥m·àÕRV_\u001fÏtÃ¶úÇ¸0T}øDpÔõdäê!ßéµ9¬Âcl·µæ\u0096' 7¬\u009fh\u000frs\u00035K\t\u0018p";
               int var5 = "Ñf1³ÖÁ:\r\u001bä\u0098ãÐê\"þ·¾[Sã¼\u0002\u0011\u009bß¬Z)ÆöÕ}h3fN-¡ùO¥m·àÕRV_\u001fÏtÃ¶úÇ¸0T}øDpÔõdäê!ßéµ9¬Âcl·µæ\u0096' 7¬\u009fh\u000frs\u00035K\t\u0018p"
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
                              c = new Integer[14];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "*YChÒÍ\u000fÖ\u009dL\u001a\u00ado¸»\u0089";
                           var5 = "*YChÒÍ\u000fÖ\u009dL\u001a\u00ado¸»\u0089".length();
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
                  var50 = 95;
                  break;
               case 1:
                  var50 = 7;
                  break;
               case 2:
                  var50 = 49;
                  break;
               case 3:
                  var50 = 17;
                  break;
               case 4:
                  var50 = 117;
                  break;
               case 5:
                  var50 = 85;
                  break;
               default:
                  var50 = 64;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15026;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





