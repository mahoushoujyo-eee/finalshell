package org.T;

import java.util.ArrayList;

public class x {
   private final int X;
   @org.F.c
   private final String Y;
   public static final x[] D;
   public static final x[] u;
   private static final long[] a;
   private static final Integer[] b;

   public x(int var1, String var2) {
      this.X = var1;
      this.Y = var2;
   }

   public x(@org.F.c String var1) {
      this.X = 0;
      this.Y = var1;
   }

   public int b() {
      return this.X;
   }

   public boolean f(String var1) {
      return M(this.Y, var1);
   }

   public static x[] k(String var0) {
      ArrayList var2 = new ArrayList();
      int var10000 = org.T.N.R();
      int var3 = 0;
      boolean var1 = (boolean)var10000;

      label61:
      while (true) {
         var10000 = var3;
         int var10001 = var0.length();

         label59:
         while (var10000 < var10001) {
            char var5;
            label56: {
               label66: {
                  char var6 = var0.charAt(var3);
                  var9 = var6;
                  var10001 = a(15753, 8882260775175847049L);
                  if (var1) {
                     if (var6 == var10001) {
                        var5 = 0;
                        var3++;
                        if (var1) {
                           break label56;
                        }
                     }

                     var9 = var6;
                     if (!var1) {
                        break label66;
                     }

                     var10001 = a(22543, 683291834762893582L);
                  }

                  if (var9 == var10001) {
                     var5 = 1;
                     var3++;
                     if (var1) {
                        break label56;
                     }
                  }

                  var9 = 0;
               }

               var5 = var9;
            }

            int var4 = var3;

            while (true) {
               if (var4 < var0.length()) {
                  char var7 = var0.charAt(var4);
                  var10000 = var7;
                  if (!var1) {
                     break;
                  }

                  var10001 = a(15753, 8882260775175847049L);
                  if (!var1) {
                     continue label59;
                  }

                  if (var7 != var10001 && var7 != a(22543, 683291834762893582L)) {
                     var4++;
                     if (var1) {
                        continue;
                     }
                  }
               }

               var2.add(new x(var5, var0.substring(var3, var4)));
               var10000 = var4;
               break;
            }

            var3 = var10000;
            if (!var1) {
               return var2.toArray(new x[var2.size()]);
            }
            continue label61;
         }

         return var2.toArray(new x[var2.size()]);
      }
   }

   public static boolean h(x[] var0, String var1) {
      boolean var2 = org.T.N.m();
      x[] var10000 = var0;
      if (!var2) {
         if (var0 == null) {
            return false;
         }

         var10000 = var0;
      }

      int var3 = var10000.length - 1;

      while (true) {
         if (var3 >= 0) {
            var4 = var0[var3].f(var1);
            if (var2) {
               return (boolean)var4;
            }

            if (var2) {
               break;
            }

            if (var4 != 0) {
               var4 = var0[var3].b();
               break;
            }

            var3--;
            if (!var2) {
               continue;
            }
         }

         return (boolean)0;
      }

      if (!var2) {
         var4 = var4 == 0 ? 1 : 0;
      }

      return (boolean)var4;
   }

   @Override
   public String toString() {
      boolean var1 = org.T.N.R();
      StringBuilder var10000 = new StringBuilder();
      int var10001 = this.X;
      if (var1) {
         if (this.X == 0) {
            return var10000.append((char)a(18241, 440691696027371075L)).append(this.Y).toString();
         }

         var10001 = this.X;
      }

      if (var1) {
         var10001 = var10001 == 1 ? a(27490, 455984008477256295L) : a(21613, 4508860898254394734L);
      }

      return var10000.append((char)var10001).append(this.Y).toString();
   }

   private static boolean M(@org.F.c String var0, String var1) {
      boolean var2 = org.T.N.m();
      if (var0 == null) {
         return true;
      } else {
         int var3 = 0;

         int var10000;
         while (true) {
            if (var3 < var0.length()) {
               char var4 = var0.charAt(var3);
               var10000 = var4;
               if (var2) {
                  break;
               }

               label107: {
                  if (!var2) {
                     switch (var4) {
                        case '*':
                           String var7 = var0;
                           if (!var2) {
                              if (var0.length() == var3 + 1) {
                                 return true;
                              }

                              var7 = var0.substring(var3 + 1);
                           }

                           var0 = var7;

                           while (true) {
                              if (var3 <= var1.length()) {
                                 var8 = M(var0, var1.substring(var3));
                                 if (var2) {
                                    break;
                                 }

                                 if (var2) {
                                    return var8;
                                 }

                                 if (var8) {
                                    return true;
                                 }

                                 var3++;
                                 if (!var2) {
                                    continue;
                                 }
                              }

                              var8 = false;
                              break;
                           }

                           return var8;
                        case '?':
                           if (var2) {
                              return (boolean)var3;
                           }

                           if (var3 == var1.length()) {
                              return (boolean)0;
                           }
                           break label107;
                        default:
                           var10000 = var3;
                     }
                  }

                  int var10001 = var1.length();
                  if (!var2) {
                     if (var10000 == var10001) {
                        return false;
                     }

                     var10000 = var1.charAt(var3);
                     if (var2) {
                        return (boolean)var10000;
                     }

                     var10001 = var4;
                  }

                  if (var10000 != var10001) {
                     return (boolean)0;
                  }
               }

               var3++;
               if (!var2) {
                  continue;
               }
            }

            var10000 = var1.length();
            break;
         }

         if (!var2) {
            var10000 = var10000 == var3 ? 1 : 0;
         }

         return (boolean)var10000;
      }
   }

   static {
      long var0 = 6976898198744434628L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "\u009f\u001a»ýâÎ\u001eçä\u0093:\u00910\u0084{f¥8÷-D#\u0092\u0095";
      int var5 = "\u009f\u001a»ýâÎ\u001eçä\u0093:\u00910\u0084{f¥8÷-D#\u0092\u0095".length();
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
                     b = new Integer[5];
                     D = new x[]{new x("*")};
                     u = new x[0];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "ÃÆ1_o\u0014\u0081¬ÀáDöb²-\u008e";
                  var5 = "ÃÆ1_o\u0014\u0081¬ÀáDöb²-\u008e".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16641;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





