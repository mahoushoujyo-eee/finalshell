package com.finalshell.core;

public final class NA_3 extends Nt2_2 implements Hp2_2 {
   public final HV_2[] N;
   public final String[] k;
   @C_9
   public final Hp2_2[] C;
   static boolean f;
   public static String d;
   public static long[] e;
   public static Integer[] h;

   public NA_3(com.finalshell.ui.model.I var1, HV_2[] var2, String[] var3, @C_9 Hp2_2[] var4) {
      String[] var10000 = RG_2.C();
      super(var1);
      String[] var5 = var10000;
      boolean var6 = f;
      if (var5 != null) {
         if (!f && var2 == null) {
            throw new AssertionError();
         }

         this.N = var2;
         if (var5 == null) {
            return;
         }

         var6 = f;
      }

      if (!var6 && var3 == null) {
         throw new AssertionError();
      } else {
         this.k = var3;
         this.C = var4;
      }
   }

   @Override
   public void n(X_3_2 var1) {
      String[] var10000 = RG_2.C();
      super.n(var1);
      String[] var2 = var10000;
      Hp2_2[] var7 = this.C;
      if (var2 != null) {
         if (this.C == null) {
            return;
         }

         var7 = this.C;
      }

      Hp2_2[] var3 = var7;
      int var4 = var3.length;
      int var5 = 0;

      while (var5 < var4) {
         Hp2_2 var6 = var3[var5];
         var6.n(var1);
         var5++;
         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public String toString() {
      String[] var10000 = RG_2.C();
      String var2 = RG_2.N(this.N, " ");
      String[] var1 = var10000;
      NA_3 var3 = this;
      if (var1 != null) {
         if (this.N.length >= 1) {
            var2 = var2 + a(24719, 3914022510489648698L);
         }

         String var4 = var2 + RG_2.N(this.k, ".");
         if (var1 == null) {
            return var4;
         }

         var2 = var4;
         var3 = this;
      }

      if (var3.C != null) {
         var2 = var2 + a(1402, 7487801877993413582L) + RG_2.N(this.C, d) + ">";
      }

      return var2;
   }

   @C_9
   @Override
   public Object p(X_2_3 var1) throws Throwable {
      return var1.u(this);
   }

   @C_9
   @Override
   public Object h(Fz2_2 var1) throws Throwable {
      return var1.u(this);
   }

   @C_9
   @Override
   public Object N(FE var1) throws Throwable {
      return var1.v(this);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24244;
      if (h[var3] == null) {
         h[var3] = (int)(e[var3] ^ var1);
      }

      return h[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0006h".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 116;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 116;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 94;
               break;
            case 1:
               var37 = 60;
               break;
            case 2:
               var37 = 7;
               break;
            case 3:
               var37 = 79;
               break;
            case 4:
               var37 = 76;
               break;
            case 5:
               var37 = 102;
               break;
            default:
               var37 = 90;
         }
      } else {
         var25 = 116;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            d = var29;
            long var9 = 6239460787332754857L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "Ô³*\u008fä¾v[\u001au¢\u001fNl\u0093³";
            int var13 = "Ô³*\u008fä¾v[\u001au¢\u001fNl\u0093³".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            e = var14;
            h = new Integer[2];
            f = !RG_2.class.desiredAssertionStatus();
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 116;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 94;
               break;
            case 1:
               var37 = 60;
               break;
            case 2:
               var37 = 7;
               break;
            case 3:
               var37 = 79;
               break;
            case 4:
               var37 = 76;
               break;
            case 5:
               var37 = 102;
               break;
            default:
               var37 = 90;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 94;
                  break;
               case 1:
                  var37 = 60;
                  break;
               case 2:
                  var37 = 7;
                  break;
               case 3:
                  var37 = 79;
                  break;
               case 4:
                  var37 = 76;
                  break;
               case 5:
                  var37 = 102;
                  break;
               default:
                  var37 = 90;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               d = var27;
               long var0 = 6239460787332754857L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "Ô³*\u008fä¾v[\u001au¢\u001fNl\u0093³";
               int var5 = "Ô³*\u008fä¾v[\u001au¢\u001fNl\u0093³".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var0;
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               e = var6;
               h = new Integer[2];
               f = !RG_2.class.desiredAssertionStatus();
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 94;
                  break;
               case 1:
                  var37 = 60;
                  break;
               case 2:
                  var37 = 7;
                  break;
               case 3:
                  var37 = 79;
                  break;
               case 4:
                  var37 = 76;
                  break;
               case 5:
                  var37 = 102;
                  break;
               default:
                  var37 = 90;
            }
         }
      }
   }
}





