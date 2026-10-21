package org.H;

import java.io.DataOutputStream;
import java.io.IOException;

public class Ca_2 implements org.H.y_2 {
   public short o;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public Ca_2(short var1) {
      this.o = var1;
   }

   @Override
   public int u() {
      return 1;
   }

   @Override
   public void H(DataOutputStream var1) throws IOException {
      var1.writeByte(a(6759, 7220736768803525082L));
      var1.writeShort(this.o);
   }

   @Override
   public String toString() {
      return a + this.o + ")";
   }

   @Override
   public int hashCode() {
      return a(12392, 6009473756921199572L) ^ this.o;
   }

   @Override
   public boolean equals(@org.F.c Object var1) {
      com.ky_4[] var2 = org.H.Cr_2.q();
      short var10000 = var1 instanceof org.H.Ca_2;
      if (var2 == null) {
         if (var10000 == 0) {
            return (boolean)0;
         }

         var10000 = ((org.H.Ca_2)var1).o;
      }

      if (var2 != null) {
         return (boolean)var10000;
      } else {
         return (boolean)(var10000 == this.o ? 1 : 0);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0004\u001fPX<e\b\u0010\u001dPL0uI\u001e\u0017_E0e\\".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 28;
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
         var10007 = 28;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 109;
               break;
            case 1:
               var37 = 109;
               break;
            case 2:
               var37 = 37;
               break;
            case 3:
               var37 = 42;
               break;
            case 4:
               var37 = 73;
               break;
            case 5:
               var37 = 13;
               break;
            default:
               var37 = 125;
         }
      } else {
         var25 = 28;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 3530073096401707280L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "\u008d&Ç\u0085ö~\u001aÌ\u00111XD§\r0Â";
            int var13 = "\u008d&Ç\u0085ö~\u001aÌ\u00111XD§\r0Â".length();
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
            c = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 28;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 109;
               break;
            case 1:
               var37 = 109;
               break;
            case 2:
               var37 = 37;
               break;
            case 3:
               var37 = 42;
               break;
            case 4:
               var37 = 73;
               break;
            case 5:
               var37 = 13;
               break;
            default:
               var37 = 125;
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
                  var37 = 109;
                  break;
               case 1:
                  var37 = 109;
                  break;
               case 2:
                  var37 = 37;
                  break;
               case 3:
                  var37 = 42;
                  break;
               case 4:
                  var37 = 73;
                  break;
               case 5:
                  var37 = 13;
                  break;
               default:
                  var37 = 125;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 3530073096401707280L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "\u008d&Ç\u0085ö~\u001aÌ\u00111XD§\r0Â";
               int var5 = "\u008d&Ç\u0085ö~\u001aÌ\u00111XD§\r0Â".length();
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
               c = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 109;
                  break;
               case 1:
                  var37 = 109;
                  break;
               case 2:
                  var37 = 37;
                  break;
               case 3:
                  var37 = 42;
                  break;
               case 4:
                  var37 = 73;
                  break;
               case 5:
                  var37 = 13;
                  break;
               default:
                  var37 = 125;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19388;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





