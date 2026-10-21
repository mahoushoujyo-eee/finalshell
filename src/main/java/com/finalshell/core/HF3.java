package com.finalshell.core;

public class HF3 extends HN3 {
   public int o = a(17656, 9143147995528204816L);
   public int p = a(22909, 6689448643816034198L);
   public int t = -1;
   public int d = a(25698, 259278783383089800L);
   public int v = 0;
   public float G = 0.0F;
   public float J = 1.0F;
   public float M = 0.0F;
   public float V = 0.0F;
   public float n = 1.0F;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void h(int var1) {
      this.t = var1;
   }

   public int j() {
      return this.t;
   }

   public void A(int var1) {
      this.d = var1;
   }

   public int h() {
      return this.d;
   }

   public void U(int var1) {
      this.o = var1;
   }

   public int G() {
      return this.o;
   }

   public void g(int var1) {
      this.p = var1;
   }

   public int O() {
      return this.p;
   }

   public void T(int var1) {
      this.v = var1;
   }

   public int e() {
      return this.v;
   }

   public void s(float var1) {
      this.G = var1;
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      this.J = var2;
      this.M = var3;
      this.V = -var3;
      this.n = var2;
   }

   public float W() {
      return this.G;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      String[] var10000 = W5.q();
      float var5 = (this.J * (float)var1 + this.M * (float)var2) / (float)this.o;
      String[] var4 = var10000;
      float var6 = (this.V * (float)var1 + this.n * (float)var2) / (float)this.p;
      float var11 = var5 + 100000.0F;
      if (var4 != null) {
         var11 = (int)var11 % 2 != (int)(var6 + 100000.0F) % 2 ? 1.0F : 0.0F;
      }

      float var7 = var11;
      int var12 = this.v;
      if (var4 != null) {
         if (this.v != 0) {
            float var8 = (float)this.v / 100.0F;
            float var9 = NM.G(0.0F, var8, 1.0F - var8, 1.0F, NM.i(var5, 1.0F));
            float var10 = NM.G(0.0F, var8, 1.0F - var8, 1.0F, NM.i(var6, 1.0F));
            var7 *= var9 * var10;
         }

         var12 = NM.n(var7, this.t, this.d);
      }

      return var12;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22250;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "qA\\yFF6\ngLhP_6WFKlAP}\u000b\n".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 101;
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
         var10007 = 101;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 64;
               break;
            case 1:
               var37 = 65;
               break;
            case 2:
               var37 = 65;
               break;
            case 3:
               var37 = 104;
               break;
            case 4:
               var37 = 86;
               break;
            case 5:
               var37 = 81;
               break;
            default:
               var37 = 54;
         }
      } else {
         var25 = 101;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 5618748184615950397L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "\u00adM9\u0086 ?ªµ(Ahÿ7¸\u0017£`~if\u0088/\n%";
            int var13 = "\u00adM9\u0086 ?ªµ(Ahÿ7¸\u0017£`~if\u0088/\n%".length();
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

            b = var14;
            c = new Integer[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 101;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 64;
               break;
            case 1:
               var37 = 65;
               break;
            case 2:
               var37 = 65;
               break;
            case 3:
               var37 = 104;
               break;
            case 4:
               var37 = 86;
               break;
            case 5:
               var37 = 81;
               break;
            default:
               var37 = 54;
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
                  var37 = 64;
                  break;
               case 1:
                  var37 = 65;
                  break;
               case 2:
                  var37 = 65;
                  break;
               case 3:
                  var37 = 104;
                  break;
               case 4:
                  var37 = 86;
                  break;
               case 5:
                  var37 = 81;
                  break;
               default:
                  var37 = 54;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 5618748184615950397L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "\u00adM9\u0086 ?ªµ(Ahÿ7¸\u0017£`~if\u0088/\n%";
               int var5 = "\u00adM9\u0086 ?ªµ(Ahÿ7¸\u0017£`~if\u0088/\n%".length();
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

               b = var6;
               c = new Integer[3];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 64;
                  break;
               case 1:
                  var37 = 65;
                  break;
               case 2:
                  var37 = 65;
                  break;
               case 3:
                  var37 = 104;
                  break;
               case 4:
                  var37 = 86;
                  break;
               case 5:
                  var37 = 81;
                  break;
               default:
                  var37 = 54;
            }
         }
      }
   }
}





