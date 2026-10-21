package com;

final class nl_4 {
   int J;
   int p;
   int Y;
   long E;
   String P;
   String k;
   String U;
   int r;
   nl_4 B;
   private static final long[] a;
   private static final Integer[] b;

   nl_4() {
   }

   nl_4(int var1, nl_4 var2) {
      this.J = var1;
      this.p = var2.p;
      this.Y = var2.Y;
      this.E = var2.E;
      this.P = var2.P;
      this.k = var2.k;
      this.U = var2.U;
      this.r = var2.r;
   }

   void y(int var1, String var2, String var3, String var4) {
      this.p = var1;
      int[] var10000 = XB.X();
      this.P = var2;
      this.k = var3;
      this.U = var4;
      int[] var5 = var10000;
      if (var5 == null) {
         switch (var1) {
            case 1:
            case 7:
            case 8:
            case 13:
               this.r = a(7774, 149780135012464228L) & var1 + var2.hashCode();
               return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            default:
               this.r = a(29302, 6716061752367356493L) & var1 + var2.hashCode() * var3.hashCode() * var4.hashCode();
               break;
            case 12:
               this.r = a(29302, 6716061752367356493L) & var1 + var2.hashCode() * var3.hashCode();
               return;
         }
      }
   }

   void r(int var1) {
      this.p = a(8896, 7642846246444813048L);
      this.Y = var1;
      this.r = a(29302, 6716061752367356493L) & this.p + var1;
   }

   boolean F(nl_4 var1) {
      int[] var2 = XB.X();
      int var10000 = this.p;
      if (var2 == null) {
         switch (this.p) {
            case 1:
            case 7:
            case 8:
            case 13:
               return var1.P.equals(this.P);
            case 2:
            case 9:
            case 10:
            case 11:
            case 14:
            default:
               var10000 = var1.P.equals(this.P);
               break;
            case 3:
            case 4:
               var10000 = var1.Y;
               if (var2 == null) {
                  var10000 = var1.Y == this.Y ? 1 : 0;
               }

               return (boolean)var10000;
            case 5:
            case 6:
            case 15:
               long var6;
               var10000 = (var6 = var1.E - this.E) == 0L ? 0 : (var6 < 0L ? -1 : 1);
               if (var2 == null) {
                  var10000 = !var10000;
               }

               return (boolean)var10000;
            case 12:
               boolean var3 = var1.P.equals(this.P);
               if (var2 == null) {
                  if (!var3) {
                     return false;
                  }

                  var3 = var1.k.equals(this.k);
               }

               if (var2 != null) {
                  return var3;
               }

               if (var3) {
                  return true;
               }

               return false;
         }
      }

      if (var2 == null) {
         if (var10000 == 0) {
            return (boolean)0;
         }

         var10000 = var1.k.equals(this.k);
      }

      if (var2 == null) {
         if (var10000 == 0) {
            return (boolean)0;
         }

         var10000 = var1.U.equals(this.U);
      }

      if (var2 != null) {
         return (boolean)var10000;
      } else {
         return (boolean)(var10000 != 0 ? 1 : 0);
      }
   }

   static {
      long var0 = 656050105280159580L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "Ã\u0010ö¯\n8ÖÇí\\\\Ë¨\u009aºî\r»\u0087ß Q\u0095§";
      int var5 = "Ã\u0010ö¯\n8ÖÇí\\\\Ë¨\u009aºî\r»\u0087ß Q\u0095§".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
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
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[3];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26682;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





