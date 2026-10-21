package com.finalshell.core;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A7 {
   public static Logger e;
   public static List k;
   public static long[] a;
   public static Integer[] b;

   public static List j() {
      return new ArrayList(k);
   }

   public static KB q(XE var0, XE var1) {
      boolean var2;
      XE var3;
      label45: {
         var2 = com.finalshell.ui.model.J2.g();
         int var10000 = var0.r;
         int var10001 = var1.r;
         if (var2) {
            if (var0.r == var1.r) {
               var3 = var0;
               if (var2) {
                  var3 = var0.q <= var1.q ? var0 : var1;
               }

               XE var6 = var0;
               if (var2) {
                  var6 = var0.q > var1.q ? var0 : var1;
               }

               return KB.Z(var3, var6);
            }

            var3 = var0;
            if (!var2) {
               break label45;
            }

            var10000 = var0.r;
            var10001 = var1.r;
         }

         var3 = var10000 < var10001 ? var0 : var1;
      }

      XE var5 = var0;
      if (var2) {
         var5 = var0.r > var1.r ? var0 : var1;
      }

      return KB.Z(var3, var5);
   }

   public static String t(RU3 var0, Im4 var1) {
      return v(var0.N(), var0.e(), var1);
   }

   @NotNull
   public static String v(@NotNull XE var0, @NotNull XE var1, @NotNull Im4 var2) {
      KB var4 = q(var0, var1);
      ((XE)var4.X).r = Math.max(((XE)var4.X).r, -var2.H());
      int var10000 = (com.finalshell.ui.model.J2.g()) ? 1 : 0;
      var4 = q((XE)var4.X, (XE)var4.S);
      XE var5 = (XE)var4.X;
      XE var6 = (XE)var4.S;
      StringBuilder var7 = new StringBuilder();
      int var8 = var5.r;
      boolean var3 = (((((boolean)var10000) != 0) != 0) != 0) != 0;

      while (true) {
         if (var8 <= var6.r) {
            DC3 var9 = var2.D(var8);
            var12 = var9.V$String();
            if (!var3) {
               break;
            }

            String var10;
            label65: {
               var10 = var12;
               var10000 = var8;
               int var10001 = var5.r;
               if (var3) {
                  if (var8 == var5.r) {
                     if (var8 == var6.r) {
                        var7.append(j(var10.substring(Math.min(var10.length(), var5.q), Math.min(var10.length(), var6.q))));
                        if (var3) {
                           break label65;
                        }
                     }

                     var7.append(j(var10.substring(Math.min(var10.length(), var5.q))));
                     if (var3) {
                        break label65;
                     }
                  }

                  var10000 = var8;
                  var10001 = var6.r;
               }

               if (var10000 == var10001) {
                  var7.append(j(var10.substring(0, Math.min(var10.length(), var6.q))));
                  if (var3) {
                     break label65;
                  }
               }

               var7.append(j(var9.V$String()));
            }

            label42: {
               label41: {
                  int var15;
                  label40: {
                     var10000 = (var9.G()) ? 1 : 0;
                     if (var3) {
                        if (var10000 == 0) {
                           var10000 = var8;
                           var15 = var6.r;
                           if (!var3) {
                              break label40;
                           }

                           if (var8 < var6.r) {
                              break label41;
                           }
                        }

                        var10000 = var6.q;
                     }

                     var15 = var10.length();
                  }

                  if (var10000 <= var15) {
                     break label42;
                  }
               }

               var7.append("\n");
            }

            var8++;
            if (var3) {
               continue;
            }
         }

         var12 = var7.toString();
         break;
      }

      return var12;
   }

   public static String j(String var0) {
      boolean var1 = com.finalshell.ui.model.J2.g();
      String var10000 = var0;
      if (var1) {
         if (var0.indexOf(a(11496, 7192703627292897938L)) != 0) {
            StringBuilder var2 = new StringBuilder();
            char[] var3 = var0.toCharArray();
            int var4 = var3.length;
            int var5 = 0;

            while (var5 < var4) {
               char var6 = var3[var5];
               if (var1) {
                  if (var6 != a(18297, 7840242565733456139L)) {
                     var2.append(var6);
                  }

                  var5++;
               }

               if (!var1) {
                  break;
               }
            }

            return var2.toString();
         }

         var10000 = var0;
      }

      return var10000;
   }

   public static XE t(XE var0, Im4 var1) {
      return A(var0, var1, k);
   }

   public static XE A(XE var0, Im4 var1, @NotNull List var2) {
      int var4 = var0.q;
      int var10000 = (com.finalshell.ui.model.J2.P()) ? 1 : 0;
      int var5 = var0.r;
      int var6 = var1.B$int();
      boolean var3 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      if (var2.contains(var1.g(var4, var5))) {
         return new XE(var4, var5);
      } else {
         String var7 = var1.D(var5).V$String();

         while (true) {
            if (var4 < var7.length()) {
               var10000 = (var2.contains(var7.charAt(var4))) ? 1 : 0;
               if (var3 || var3) {
                  break;
               }

               if (var10000 == 0) {
                  var10000 = --var4;
                  if (!var3) {
                     if (var4 >= 0) {
                        continue;
                     }

                     var10000 = var5;
                  }

                  int var10001 = -var1.H();
                  if (!var3) {
                     if (var10000 <= var10001) {
                        return new XE(0, var5);
                     }

                     var5--;
                     var10000 = var6;
                     var10001 = 1;
                  }

                  var4 = var10000 - var10001;
                  var7 = var1.D(var5).V$String();
                  if (!var3) {
                     continue;
                  }
               }
            }

            var10000 = ++var4;
            break;
         }

         if (!var3) {
            if (var10000 < var6) {
               return new XE(var4, var5);
            }

            var5++;
            var10000 = 0;
         }

         var4 = var10000;
         return new XE(var4, var5);
      }
   }

   public static XE l(XE var0, Im4 var1) {
      return e(var0, var1, k);
   }

   public static XE e(XE var0, Im4 var1, @NotNull List var2) {
      int var10000 = (com.finalshell.ui.model.J2.g()) ? 1 : 0;
      int var4 = var0.q;
      int var5 = var0.r;
      boolean var3 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      int var6 = var1.B$int();
      int var7 = var1.O();
      if (var2.contains(var1.g(var4, var5))) {
         return new XE(var4, var5);
      } else {
         String var8 = var1.D(var5).V$String();

         while (true) {
            if (var4 < var8.length()) {
               var10000 = (var2.contains(var8.charAt(var4))) ? 1 : 0;
               if (!var3 || !var3) {
                  break;
               }

               if (var10000 == 0) {
                  label57: {
                     var10000 = ++var4;
                     int var10001 = var6;
                     if (var3) {
                        if (var4 < var6) {
                           continue;
                        }

                        var10000 = var5;
                        if (!var3) {
                           break label57;
                        }

                        var10001 = var7 - 1;
                     }

                     if (var10000 >= var10001) {
                        return new XE(var6 - 1, var7 - 1);
                     }

                     var5++;
                     var10000 = 0;
                  }

                  var4 = var10000;
                  var8 = var1.D(var5).V$String();
                  if (var3) {
                     continue;
                  }
               }
            }

            var10000 = --var4;
            break;
         }

         if (var3) {
            if (var10000 >= 0) {
               return new XE(var4, var5);
            }

            var5--;
            var10000 = var6 - 1;
         }

         var4 = var10000;
         return new XE(var4, var5);
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24190;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1985475908755173609L;
      long[] var6 = new long[16];
      int var3 = 0;
      String var4 = "¥+\u0098ßéæ6Õ³¬¾\fuC7â\u0098e\u0089ç\u000fx\u0018\u0092¶\u0096N×õ[ÿí #~\u008fì\u0006¢{\u0006uÜ7,Í\u008cðP%Ù\u0006öê|C\n\r%\u0082ðD\u001c\u0083\u0016X×CÄUÔ\u0094\u00121±Å£öwµ¡\u001bTæ]\u0012Äl\u008a¹½3ÙÊÁAìÞ\bl0\u0002Éâ\tJ\u0084á\u0001#\u0084\u008d";
      int var5 = "¥+\u0098ßéæ6Õ³¬¾\fuC7â\u0098e\u0089ç\u000fx\u0018\u0092¶\u0096N×õ[ÿí #~\u008fì\u0006¢{\u0006uÜ7,Í\u008cðP%Ù\u0006öê|C\n\r%\u0082ðD\u001c\u0083\u0016X×CÄUÔ\u0094\u00121±Å£öwµ¡\u001bTæ]\u0012Äl\u008a¹½3ÙÊÁAìÞ\bl0\u0002Éâ\tJ\u0084á\u0001#\u0084\u008d"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[16];
                     e = LoggerFactory.getLogger(A7.class);
                     k = new ArrayList();
                     k.add(Character.valueOf((char)a(22626, 2244382156637111836L)));
                     k.add(Character.valueOf((char)a(9195, 7615428294738115995L)));
                     k.add(Character.valueOf((char)a(25195, 8123182551163419664L)));
                     k.add(Character.valueOf((char)a(12282, 6786821499416768911L)));
                     k.add(Character.valueOf((char)a(22870, 7354986469430232873L)));
                     k.add(Character.valueOf((char)a(27187, 8034862303483606080L)));
                     k.add(Character.valueOf((char)a(4858, 6849909085041118338L)));
                     k.add(Character.valueOf((char)a(6402, 1222933587863848821L)));
                     k.add(Character.valueOf((char)a(30602, 7890933545576573435L)));
                     k.add(Character.valueOf((char)a(30298, 3512148641316513830L)));
                     k.add(Character.valueOf((char)a(29288, 4229037994221677585L)));
                     k.add(Character.valueOf((char)a(4356, 7496727672314744697L)));
                     k.add(Character.valueOf((char)a(10957, 509120130096067769L)));
                     k.add(Character.valueOf((char)a(14901, 6735810988826125379L)));
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "#H¶2[ MÒ\u008eþ/M¹<\u0099I";
                  var5 = "#H¶2[ MÒ\u008eþ/M¹<\u0099I".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





