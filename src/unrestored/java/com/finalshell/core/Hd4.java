package com.finalshell.core;

import java.awt.image.BufferedImage;

public class Hd4 extends W5 {
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void t(int[] var1) {
      String[] var10000 = W5.q();
      int var3 = 0;
      String[] var2 = var10000;

      while (var3 < var1.length) {
         int var4 = var1[var3];
         int var5 = var4 >> a(8140, 813035958678453247L) & a(3217, 8095873878671976611L);
         int var6 = var4 >> a(5638, 557475173309182520L) & a(1928, 4667281847533200305L);
         int var7 = var4 & a(1928, 4667281847533200305L);
         var1[var3] = (var5 + var6 + var7) / 3;
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label163: {
         String[] var10000 = W5.q();
         var4 = var1.getWidth();
         var3 = var10000;
         var5 = var1.getHeight();
         BufferedImage var28 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label163;
            }

            var28 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var28;
      }

      Object var6 = null;
      Object var7 = null;
      int[] var8 = null;
      int[] var9 = new int[var4];
      var6 = this.l(var1, 0, 0, var4, 1, (int[])var6);
      var7 = this.l(var1, 0, 0, var4, 1, (int[])var7);
      this.t((int[])var6);
      this.t((int[])var7);
      int var10 = 0;

      label156:
      while (true) {
         int var29 = var10;

         int var10001;
         label153:
         while (true) {
            if (var29 < var5) {
               var29 = var10;
               int var11;
               if (var3 != null) {
                  var10001 = var5 - 1;
                  if (var3 == null) {
                     break;
                  }

                  if (var10 < var10001) {
                     var8 = this.l(var1, 0, var10 + 1, var4, 1, var8);
                     this.t(var8);
                  }

                  var9[0] = var9[var4 - 1] = a(23328, 1567409644925894426L);
                  var11 = 1;
               } else {
                  var11 = var10;
               }

               while (var11 < var4 - 1) {
                  int var12 = (int)((Object[])var7)[var11 - 1];
                  int var13 = (int)((Object[])var6)[var11];
                  int var14 = var8[var11];
                  int var15 = (int)((Object[])var7)[var11 + 1];
                  int var16 = (int)((Object[])var7)[var11];
                  int var17 = Math.max(Math.max(var12, var13), Math.max(var14, var15));
                  int var18 = Math.min(Math.min(var12, var13), Math.min(var14, var15));
                  int var19 = (int)(0.5F * (float)Math.max(var17 - var16, var16 - var18));
                  var29 = ((Object[])var6)[var11 - 1]
                     + ((Object[])var6)[var11]
                     + ((Object[])var6)[var11 + 1]
                     + ((Object[])var7)[var11 - 1]
                     - a(4866, 7223194307816322879L) * ((Object[])var7)[var11]
                     + ((Object[])var7)[var11 + 1]
                     + var8[var11 - 1]
                     + var8[var11]
                     + var8[var11 + 1];
                  if (var3 == null) {
                     continue label153;
                  }

                  label145: {
                     if (var3 != null) {
                        if (var29 > 0) {
                           var29 = var19;
                           break label145;
                        }

                        var29 = a(8485, 7888476860802745630L);
                     }

                     var29 += var19;
                  }

                  int var20 = var29;
                  var9[var11] = var20;
                  var11++;
                  if (var3 == null) {
                     break;
                  }
               }

               this.E(var2, 0, var10, var4, 1, var9);
               int[] var23 = (int[])var6;
               var6 = var7;
               var7 = var8;
               var8 = var23;
               var10++;
               if (var3 != null) {
                  continue label156;
               }
            }

            var6 = this.l(var2, 0, 0, var4, 1, (int[])var6);
            var7 = this.l(var2, 0, 0, var4, 1, (int[])var7);
            var10 = 0;
            var29 = var10;
            var10001 = var5;
            break;
         }

         label131:
         while (var29 < var10001) {
            var29 = var10;
            if (var3 != null) {
               if (var10 < var5 - 1) {
                  var8 = this.l(var2, 0, var10 + 1, var4, 1, var8);
               }

               var9[0] = var9[var4 - 1] = a(18295, 1158868333767467848L);
               var29 = 1;
            }

            int var24 = var29;

            while (var24 < var4 - 1) {
               int var26 = (int)((Object[])var7)[var24];
               var29 = var26;
               var10001 = a(28710, 2225998683964904478L);
               if (var3 == null) {
                  continue label131;
               }

               label174: {
                  if (var3 != null) {
                     if (var26 > var10001) {
                        var29 = 0;
                        break label174;
                     }

                     var29 = (int)((Object[])var6)[var24 - 1];
                     var10001 = a(28710, 2225998683964904478L);
                  }

                  label118:
                  if (var3 != null) {
                     if (var29 <= var10001) {
                        var29 = (int)((Object[])var6)[var24];
                        var10001 = a(28710, 2225998683964904478L);
                        if (var3 == null) {
                           break label118;
                        }

                        if (var29 <= var10001) {
                           var29 = (int)((Object[])var6)[var24 + 1];
                           var10001 = a(28710, 2225998683964904478L);
                           if (var3 == null) {
                              break label118;
                           }

                           if (var29 <= var10001) {
                              var29 = (int)((Object[])var7)[var24 - 1];
                              var10001 = a(28710, 2225998683964904478L);
                              if (var3 == null) {
                                 break label118;
                              }

                              if (var29 <= var10001) {
                                 var29 = (int)((Object[])var7)[var24 + 1];
                                 var10001 = a(28710, 2225998683964904478L);
                                 if (var3 == null) {
                                    break label118;
                                 }

                                 if (var29 <= var10001) {
                                    var29 = var8[var24 - 1];
                                    var10001 = a(28710, 2225998683964904478L);
                                    if (var3 == null) {
                                       break label118;
                                    }

                                    if (var29 <= var10001) {
                                       var29 = var8[var24];
                                       var10001 = a(28710, 2225998683964904478L);
                                       if (var3 == null) {
                                          break label118;
                                       }

                                       if (var29 <= var10001) {
                                          var29 = var8[var24 + 1];
                                          var10001 = a(28710, 2225998683964904478L);
                                          if (var3 == null) {
                                             break label118;
                                          }

                                          if (var29 <= var10001) {
                                             var29 = 0;
                                             break label174;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     var29 = var26;
                     if (var3 == null) {
                        break label174;
                     }

                     var10001 = a(28710, 2225998683964904478L);
                  }

                  var29 = var29 >= var10001 ? var26 - a(28710, 2225998683964904478L) : var26;
               }

               var26 = var29;
               var9[var24] = a(18295, 1158868333767467848L) | var26 << a(7697, 2670627301543934509L) | var26 << a(4866, 7223194307816322879L) | var26;
               var24++;
               if (var3 == null) {
                  break;
               }
            }

            this.E(var2, 0, var10, var4, 1, var9);
            int[] var25 = (int[])var6;
            var6 = var7;
            var7 = var8;
            var8 = var25;
            var10++;
            if (var3 == null) {
               return var2;
            }

            var29 = var10;
            var10001 = var5;
         }

         return var2;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25658;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "n(\u0004=M`bJ<\u000f9]*\u0000\u0005b".toCharArray();
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
               var50 = 36;
               break;
            case 1:
               var50 = 67;
               break;
            case 2:
               var50 = 108;
               break;
            case 3:
               var50 = 87;
               break;
            case 4:
               var50 = 49;
               break;
            case 5:
               var50 = 64;
               break;
            default:
               var50 = 33;
         }
      } else {
         var34 = 15;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 404225145815324443L;
            long[] var14 = new long[10];
            int var11 = 0;
            String var12 = "isô aÎh\u0001\u0011 £>\u0012\u0093\u0012\u0085ÜRÊ%½\u00adC\u0085t\u0084«ÓMB4U*Ý¹\u009b\u008d«%+*\u0092±¸\u00112ôSK\u0095)\u0000rf-&\u001b\u009d\u0098a\f\u0099 ,";
            int var13 = "isô aÎh\u0001\u0011 £>\u0012\u0093\u0012\u0085ÜRÊ%½\u00adC\u0085t\u0084«ÓMB4U*Ý¹\u009b\u008d«%+*\u0092±¸\u00112ôSK\u0095)\u0000rf-&\u001b\u009d\u0098a\f\u0099 ,"
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

                        var12 = "ÊI3Bý\u0001?G¥m]4s?¬ô";
                        var13 = "ÊI3Bý\u0001?G¥m]4s?¬ô".length();
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
               var50 = 36;
               break;
            case 1:
               var50 = 67;
               break;
            case 2:
               var50 = 108;
               break;
            case 3:
               var50 = 87;
               break;
            case 4:
               var50 = 49;
               break;
            case 5:
               var50 = 64;
               break;
            default:
               var50 = 33;
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
                  var50 = 36;
                  break;
               case 1:
                  var50 = 67;
                  break;
               case 2:
                  var50 = 108;
                  break;
               case 3:
                  var50 = 87;
                  break;
               case 4:
                  var50 = 49;
                  break;
               case 5:
                  var50 = 64;
                  break;
               default:
                  var50 = 33;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 404225145815324443L;
               long[] var6 = new long[10];
               int var3 = 0;
               String var4 = "isô aÎh\u0001\u0011 £>\u0012\u0093\u0012\u0085ÜRÊ%½\u00adC\u0085t\u0084«ÓMB4U*Ý¹\u009b\u008d«%+*\u0092±¸\u00112ôSK\u0095)\u0000rf-&\u001b\u009d\u0098a\f\u0099 ,";
               int var5 = "isô aÎh\u0001\u0011 £>\u0012\u0093\u0012\u0085ÜRÊ%½\u00adC\u0085t\u0084«ÓMB4U*Ý¹\u009b\u008d«%+*\u0092±¸\u00112ôSK\u0095)\u0000rf-&\u001b\u009d\u0098a\f\u0099 ,"
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

                           var4 = "ÊI3Bý\u0001?G¥m]4s?¬ô";
                           var5 = "ÊI3Bý\u0001?G¥m]4s?¬ô".length();
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
                  var50 = 36;
                  break;
               case 1:
                  var50 = 67;
                  break;
               case 2:
                  var50 = 108;
                  break;
               case 3:
                  var50 = 87;
                  break;
               case 4:
                  var50 = 49;
                  break;
               case 5:
                  var50 = 64;
                  break;
               default:
                  var50 = 33;
            }
         }
      }
   }
}





