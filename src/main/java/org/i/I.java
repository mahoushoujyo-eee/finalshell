package org.i;

import java.util.Iterator;
import java.util.List;

public class I implements q, z_2 {
   public final String W;
   public final String D;
   public final List Y;
   public final List L;
   private final k Q;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public I(String var1, String var2, List var3, List var4, k var5) {
      this.W = var1;
      this.D = var2;
      this.Y = var3;
      this.L = var4;
      this.Q = var5;
   }

   @Override
   public Object P(D var1) throws Throwable {
      return var1.m(this);
   }

   @Override
   public String toString() {
      String var10000 = org.i.M.w();
      String var2 = this.W.replace((char)a(20819, 7809542723905355770L), (char)a(11988, 9118117175711006847L));
      StringBuilder var3 = new StringBuilder().append(this.Q.B(var2)).append(this.D);
      String var1 = var10000;
      List var7 = this.Y;
      if (var1 != null) {
         label33:
         if (!this.Y.isEmpty()) {
            Iterator var4 = this.Y.iterator();
            var3.append((char)a(22134, 2480402778419722460L)).append(((l)var4.next()).toString());

            while (var4.hasNext()) {
               var3.append(a).append(((l)var4.next()).toString());
               if (var1 == null) {
                  break label33;
               }

               if (var1 == null) {
                  break;
               }
            }

            var3.append((char)a(26062, 445237641614969702L));
         }

         var7 = this.L;
      }

      Iterator var6 = var7.iterator();

      while (true) {
         if (var6.hasNext()) {
            Z var5 = (Z)var6.next();
            var8 = var3.append((char)a(4627, 6814222937820019903L)).append(var5.toString());
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         var8 = var3;
         break;
      }

      var10000 = var8.toString();
      if (com.ky_4.F() != null) {
         org.i.M.W("d2AjUb");
      }

      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u001b~".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 18;
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
         var10007 = 18;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 37;
               break;
            case 1:
               var50 = 76;
               break;
            case 2:
               var50 = 64;
               break;
            case 3:
               var50 = 123;
               break;
            case 4:
               var50 = 22;
               break;
            case 5:
               var50 = 64;
               break;
            default:
               var50 = 125;
         }
      } else {
         var34 = 18;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3772344670906437222L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12 = "n\u000e\u0005¹b \u0085>ëkL<Ã*1³ÊÂ¶4¤.6\u0086";
            int var13 = "n\u000e\u0005¹b \u0085>ëkL<Ã*1³ÊÂ¶4¤.6\u0086".length();
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
                           c = new Integer[5];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "ä\u008e\u001d¹!\u0013Î7}wz\u000eR£ò÷";
                        var13 = "ä\u008e\u001d¹!\u0013Î7}wz\u000eR£ò÷".length();
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
         var10007 = 18;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 37;
               break;
            case 1:
               var50 = 76;
               break;
            case 2:
               var50 = 64;
               break;
            case 3:
               var50 = 123;
               break;
            case 4:
               var50 = 22;
               break;
            case 5:
               var50 = 64;
               break;
            default:
               var50 = 125;
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
                  var50 = 37;
                  break;
               case 1:
                  var50 = 76;
                  break;
               case 2:
                  var50 = 64;
                  break;
               case 3:
                  var50 = 123;
                  break;
               case 4:
                  var50 = 22;
                  break;
               case 5:
                  var50 = 64;
                  break;
               default:
                  var50 = 125;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3772344670906437222L;
               long[] var6 = new long[5];
               int var3 = 0;
               String var4 = "n\u000e\u0005¹b \u0085>ëkL<Ã*1³ÊÂ¶4¤.6\u0086";
               int var5 = "n\u000e\u0005¹b \u0085>ëkL<Ã*1³ÊÂ¶4¤.6\u0086".length();
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
                              c = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "ä\u008e\u001d¹!\u0013Î7}wz\u000eR£ò÷";
                           var5 = "ä\u008e\u001d¹!\u0013Î7}wz\u000eR£ò÷".length();
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
                  var50 = 37;
                  break;
               case 1:
                  var50 = 76;
                  break;
               case 2:
                  var50 = 64;
                  break;
               case 3:
                  var50 = 123;
                  break;
               case 4:
                  var50 = 22;
                  break;
               case 5:
                  var50 = 64;
                  break;
               default:
                  var50 = 125;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11944;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





