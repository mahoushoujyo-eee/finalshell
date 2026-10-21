package com.finalshell.core;

import java.awt.Rectangle;

public class YX3 extends GT3 {
   protected static int[] V;
   public int o = a(32109, 688847293996231935L);
   public boolean k;
   public int B = a(22191, 3198772515552806710L);
   public boolean U = true;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void E(int var1) {
      this.B = Math.min(Math.max(var1, a(9193, 7279093812482650745L)), a(28473, 2410304285436214946L));
   }

   public int Q() {
      return this.B;
   }

   public void t(boolean var1) {
      this.k = var1;
   }

   public boolean c() {
      return this.k;
   }

   public void Z(boolean var1) {
      this.U = var1;
   }

   public boolean z() {
      return this.U;
   }

   public void Q(int[] var1, int[] var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      int var9 = var3 * var4;
      String[] var10000 = W5.q();
      KL var10 = new KL();
      var10.P(var5);
      String[] var8 = var10000;
      var10.p(var1, 0, var9);
      int[] var11 = var10.D();
      byte var42 = (var6) ? 1 : 0;
      if (var8 != null) {
         if (var6 == 0) {
            int var12 = 0;

            while (var12 < var9) {
               var2[var12] = var11[var10.k(var1[var12])];
               var12++;
               if (var8 == null) {
                  return;
               }

               if (var8 == null) {
                  break;
               }
            }

            if (var8 != null) {
               return;
            }
         }

         var42 = 0;
      }

      int var34 = var42;
      int var13 = 0;

      do {
         int var43 = var13;

         label160:
         while (true) {
            if (var43 >= var4) {
      byte[] var44;
      byte[] var44;
               return;
            }

            label85: {
               label188: {
                  var44 = var7;
                  if (var8 != null) {
                     if (var7 == 0) {
                        break label188;
                     }

                     var44 = var13 & 1;
                  }

                  if (var8 == null) {
                     break label85;
                  }

                  if (var44 == 1) {
                     var44 = 1;
                     break label85;
                  }
               }

               var44 = 0;
            }

            int var14;
            int var15;
            label92: {
               var14 = var44;
               int var45 = var14;
               if (var8 != null) {
                  if (var14 != 0) {
                     var34 = var13 * var3 + var3 - 1;
                     var15 = -1;
                     if (var8 != null) {
                        break label92;
                     }
                  }

                  var34 = var13 * var3;
                  var45 = 1;
               }

               var15 = var45;
            }

            int var16 = 0;

            while (true) {
               if (var16 >= var3) {
                  break label160;
               }

               int var17 = var1[var34];
               int var18 = var11[var10.k(var17)];
               var2[var34] = var18;
               int var19 = var17 >> a(31737, 1535162623707867758L) & a(979, 3871066833205858885L);
               int var20 = var17 >> a(2762, 105446668308814683L) & a(25116, 3250213609732961167L);
               int var21 = var17 & a(25116, 3250213609732961167L);
               int var22 = var18 >> a(31737, 1535162623707867758L) & a(25116, 3250213609732961167L);
               int var23 = var18 >> a(9193, 7279093812482650745L) & a(25116, 3250213609732961167L);
               int var24 = var18 & a(25116, 3250213609732961167L);
               int var25 = var19 - var22;
               int var26 = var20 - var23;
               int var27 = var21 - var24;
               var43 = -1;
               if (var8 == null) {
                  break;
               }

               int var28 = -1;

               int var52;
               label155: {
                  label154:
                  while (true) {
                     int var46 = var28;
                     var52 = 1;

                     label152:
                     while (true) {
                        if (var46 > var52) {
                           break label154;
                        }

                        int var29 = var28 + var13;
                        if (var8 != null) {
                           var47 = 0;
                           var52 = var29;
                           if (var8 == null) {
                              break label155;
                           }

                           label113:
                           if (0 <= var29) {
                              int var48 = var29;
                              if (var8 != null) {
                                 if (var29 >= var4) {
                                    break label113;
                                 }

                                 var48 = -1;
                              }

                              int var30 = var48;

                              while (var30 <= 1) {
                                 int var31 = var30 + var16;
                                 if (var8 != null) {
                                    var46 = 0;
                                    var52 = var31;
                                    if (var8 == null) {
                                       continue label152;
                                    }

                                    label123:
                                    if (0 <= var31) {
                                       int var49 = var31;
                                       if (var8 != null) {
                                          if (var31 >= var3) {
                                             break label123;
                                          }

                                          var49 = var14;
                                       }

                                       int var32;
                                       label137: {
                                          if (var8 != null) {
                                             if (var49 != 0) {
                                                var32 = V[(var28 + 1) * 3 - var30 + 1];
                                                if (var8 != null) {
                                                   break label137;
                                                }
                                             }

                                             var49 = V[(var28 + 1) * 3 + var30 + 1];
                                          }

                                          var32 = var49;
                                       }

                                       int var50 = var32;
                                       if (var8 != null) {
                                          if (var32 == 0) {
                                             break label123;
                                          }

                                          var50 = var14;
                                       }

                                       label129: {
                                          if (var8 != null) {
                                             if (var50 != 0) {
                                                var51 = var34 - var30;
                                                break label129;
                                             }

                                             var50 = var34;
                                          }

                                          var51 = var50 + var30;
                                       }

                                       int var33 = var51;
                                       var17 = var1[var33];
                                       var19 = var17 >> a(31737, 1535162623707867758L) & a(25116, 3250213609732961167L);
                                       var20 = var17 >> a(9193, 7279093812482650745L) & a(25116, 3250213609732961167L);
                                       var21 = var17 & a(25116, 3250213609732961167L);
                                       var19 += var25 * var32 / this.o;
                                       var20 += var26 * var32 / this.o;
                                       var21 += var27 * var32 / this.o;
                                       var1[var33] = Iw4.e(var19) << a(31737, 1535162623707867758L)
                                          | Iw4.e(var20) << a(9193, 7279093812482650745L)
                                          | Iw4.e(var21);
                                    }

                                    var30++;
                                 }

                                 if (var8 == null) {
                                    break;
                                 }
                              }
                           }

                           var28++;
                        }

                        if (var8 == null) {
                           break label154;
                        }
                        break;
                     }
                  }

                  var47 = var34;
                  var52 = var15;
               }

               var34 = var47 + var52;
               var16++;
               if (var8 == null) {
                  break label160;
               }
            }
         }

         var13++;
      } while (var8 != null);
   }

   @Override
   protected int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int[] var5 = new int[var1 * var2];
      this.Q(var3, var5, var1, var2, this.B, this.k, this.U);
      return var5;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4499;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0018\u0019\u0006:\u0007\u0007\u001b\n\u0003\u000b;\u0001\u001dN>XD{".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var36 = 25;
      char[] var10002 = var10003;
      int var21 = var10004;
      char[] var44;
      byte var52;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var44 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 25;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var52 = 66;
               break;
            case 1:
               var52 = 111;
               break;
            case 2:
               var52 = 115;
               break;
            case 3:
               var52 = 76;
               break;
            case 4:
               var52 = 108;
               break;
            case 5:
               var52 = 109;
               break;
            default:
               var52 = 45;
         }
      } else {
         var36 = 25;
         var21 = var10004;
         if (var10004 <= var8) {
            String var41 = new String(var10003).intern();
            int var27 = -1;
            a = var41;
            long var9 = 7134814195777123248L;
            long[] var14 = new long[12];
            int var11 = 0;
            String var12 = "²ø+\u001aIð@À\u0089¼<WZ\u0097ß_c\tñ>*þ(ãýi\u001eÜ\u001ep\u0001ÁÆ4]\u0083G%ÙÎJù7\u0000ê½¡\nã¡\u0087Õ\u0012sXU\u0019mêð\u009dBóëõ\"ä2£³L\u0012#\u0015|\u0085ö\u008fqr";
            int var13 = "²ø+\u001aIð@À\u0089¼<WZ\u0097ß_c\tñ>*þ(ãýi\u001eÜ\u001ep\u0001ÁÆ4]\u0083G%ÙÎJù7\u0000ê½¡\nã¡\u0087Õ\u0012sXU\u0019mêð\u009dBóëõ\"ä2£³L\u0012#\u0015|\u0085ö\u008fqr"
               .length();
            byte var10 = 0;

            label71:
            while (true) {
               var27 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var27, var10).getBytes("ISO-8859-1");
               long[] var19 = var14;
               var27 = var11++;
               long var34 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var42 = -1;

               while (true) {
                  long var50 = var34 ^ var9;
                  switch (var42) {
                     case 0:
                        var19[var27] = var50;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[12];
                           int[] var20 = new int[a(21329, 4937614986755883723L)];
                           var20[0] = 0;
                           var20[1] = 0;
                           var20[2] = 0;
                           var20[3] = 0;
                           var20[4] = 0;
                           var20[5] = a(20936, 7770652602566918236L);
                           var20[a(23280, 1470117597472607080L)] = 3;
                           var20[a(31351, 4582434549338139618L)] = 5;
                           var20[a(9193, 7279093812482650745L)] = 1;
                           V = var20;
                           return;
                        }
                        break;
                     default:
                        var19[var27] = var50;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "_Çz×?{u\u0086T´\u0088óúÒxÞ";
                        var13 = "_Çz×?{u\u0086T´\u0088óúÒxÞ".length();
                        var10 = 0;
                  }

                  byte var30 = var10;
                  var10 += 8;
                  var16 = var12.substring(var30, var10).getBytes("ISO-8859-1");
                  var19 = var14;
                  var27 = var11++;
                  var34 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var42 = 0;
               }
            }
         }

         var44 = var10003;
         var10005 = var8;
         char var53 = var10003[var8];
         var10007 = 25;
         var10006 = var53;
         switch (var8 % 7) {
            case 0:
               var52 = 66;
               break;
            case 1:
               var52 = 111;
               break;
            case 2:
               var52 = 115;
               break;
            case 3:
               var52 = 76;
               break;
            case 4:
               var52 = 108;
               break;
            case 5:
               var52 = 109;
               break;
            default:
               var52 = 45;
         }
      }

      while (true) {
         var44[var10005] = (char)(var10006 ^ var10007 ^ var52);
         var8++;
         if (var36 == 0) {
            var44 = var10002;
            var10005 = var36;
            char var55 = var10002[var36];
            var10007 = var36;
            var10006 = var55;
            switch (var8 % 7) {
               case 0:
                  var52 = 66;
                  break;
               case 1:
                  var52 = 111;
                  break;
               case 2:
                  var52 = 115;
                  break;
               case 3:
                  var52 = 76;
                  break;
               case 4:
                  var52 = 108;
                  break;
               case 5:
                  var52 = 109;
                  break;
               default:
                  var52 = 45;
            }
         } else {
            if (var21 <= var8) {
               String var38 = new String(var10002).intern();
               int var23 = -1;
               a = var38;
               long var0 = 7134814195777123248L;
               long[] var6 = new long[12];
               int var3 = 0;
               String var4 = "²ø+\u001aIð@À\u0089¼<WZ\u0097ß_c\tñ>*þ(ãýi\u001eÜ\u001ep\u0001ÁÆ4]\u0083G%ÙÎJù7\u0000ê½¡\nã¡\u0087Õ\u0012sXU\u0019mêð\u009dBóëõ\"ä2£³L\u0012#\u0015|\u0085ö\u008fqr";
               int var5 = "²ø+\u001aIð@À\u0089¼<WZ\u0097ß_c\tñ>*þ(ãýi\u001eÜ\u001ep\u0001ÁÆ4]\u0083G%ÙÎJù7\u0000ê½¡\nã¡\u0087Õ\u0012sXU\u0019mêð\u009dBóëõ\"ä2£³L\u0012#\u0015|\u0085ö\u008fqr"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var23 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var23, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var23 = var3++;
                  long var32 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var39 = -1;

                  while (true) {
                     long var48 = var32 ^ var0;
                     switch (var39) {
                        case 0:
                           var10000[var23] = var48;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[12];
                              int[] var18 = new int[a(21329, 4937614986755883723L)];
                              var18[0] = 0;
                              var18[1] = 0;
                              var18[2] = 0;
                              var18[3] = 0;
                              var18[4] = 0;
                              var18[5] = a(20936, 7770652602566918236L);
                              var18[a(23280, 1470117597472607080L)] = 3;
                              var18[a(31351, 4582434549338139618L)] = 5;
                              var18[a(9193, 7279093812482650745L)] = 1;
                              V = var18;
                              return;
                           }
                           break;
                        default:
                           var10000[var23] = var48;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "_Çz×?{u\u0086T´\u0088óúÒxÞ";
                           var5 = "_Çz×?{u\u0086T´\u0088óúÒxÞ".length();
                           var2 = 0;
                     }

                     byte var26 = var2;
                     var2 += 8;
                     var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var23 = var3++;
                     var32 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var39 = 0;
                  }
               }
            }

            var44 = var10002;
            var10005 = var8;
            char var54 = var10002[var8];
            var10007 = var36;
            var10006 = var54;
            switch (var8 % 7) {
               case 0:
                  var52 = 66;
                  break;
               case 1:
                  var52 = 111;
                  break;
               case 2:
                  var52 = 115;
                  break;
               case 3:
                  var52 = 76;
                  break;
               case 4:
                  var52 = 108;
                  break;
               case 5:
                  var52 = 109;
                  break;
               default:
                  var52 = 45;
            }
         }
      }
   }
}






