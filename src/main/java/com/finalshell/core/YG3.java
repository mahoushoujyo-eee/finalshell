package com.finalshell.core;

import java.awt.Rectangle;

public class YG3 extends GT3 {
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public int q(int[] var1) {
      int var10;
      int var9;
      String[] var10000 = W5.q();
      int var5 = 0;
      String[] var2 = var10000;

      int var3;
      label68:
      while (true) {
         int var8 = var5;
         int var10001 = 4;

         label65:
         while (var8 < var10001) {
            var3 = 0;
            int var4 = 0;
            var9 = 0;
            if (var2 == null) {
               break label68;
            }

            int var6 = 0;

            while (var6 < a(7753, 1033753468321708880L)) {
               label59: {
                  var8 = var1[var6];
                  if (var2 != null) {
                     var10001 = var3;
                     if (var2 == null) {
                        continue label65;
                     }

                     if (var8 <= var3) {
                        break label59;
                     }

                     var3 = var1[var6];
                     var8 = var6;
                  }

                  var4 = var8;
               }

               var6++;
               if (var2 == null) {
                  break;
               }
            }

            var1[var4] = 0;
            var5++;
            if (var2 != null) {
               continue label68;
            }
            break;
         }

         var3 = 0;
         var9 = 0;
         break;
      }

      var5 = var9;

      while (true) {
         if (var5 < a(26692, 4867723795067751768L)) {
            var10 = var1[var5];
            if (var2 == null) {
               break;
            }

            label35: {
               if (var2 != null) {
                  if (var10 <= var3) {
                     break label35;
                  }

                  var10 = var1[var5];
               }

               var3 = var10;
            }

            var5++;
            if (var2 != null) {
               continue;
            }
         }

         var10 = var3;
         break;
      }

      return var10;
   }

   public int K(int[] var1, int[] var2, int[] var3) {
      int var12;
      int var9;
      int var6 = 0;
      int var7 = a(21045, 1336400658486261544L);
      String[] var10000 = W5.q();
      int var8 = 0;
      String[] var4 = var10000;

      while (true) {
         if (var8 < a(26692, 4867723795067751768L)) {
            int var5 = 0;
            var12 = 0;
            if (var4 == null) {
               break;
            }

            var9 = 0;

            label47: {
               while (var9 < a(26692, 4867723795067751768L)) {
                  var5 += Math.abs(var1[var8] - var1[var9]);
                  var5 += Math.abs(var2[var8] - var2[var9]);
                  var5 += Math.abs(var3[var8] - var3[var9]);
                  var9++;
                  if (var4 == null) {
                     break label47;
                  }

                  if (var4 == null) {
                     break;
                  }
               }

               label29: {
                  int var13 = var5;
                  if (var4 != null) {
                     if (var5 >= var7) {
                        break label29;
                     }

                     var7 = var5;
                     var13 = var8;
                  }

                  var6 = var13;
               }

               var8++;
            }

            if (var4 != null) {
               continue;
            }
         }

         var12 = var6;
         break;
      }

      return var12;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int[] var10;
      int var12;
      int var23;
      int[] var9;
      int var6 = 0;
      String[] var10000 = W5.q();
      int[] var7 = new int[a(26692, 4867723795067751768L)];
      int[] var8 = new int[a(26692, 4867723795067751768L)];
      var9 = new int[a(26692, 4867723795067751768L)];
      String[] var5 = var10000;
      var10 = new int[a(26692, 4867723795067751768L)];
      int[] var11 = new int[var1 * var2];
      var12 = 0;

      label111:
      while (true) {
         int var21 = var12;

         label109:
         while (var21 < var2) {
            int var13 = 0;

            label106:
            while (var13 < var1) {
               int var14 = 0;
               var21 = -1;
               if (var5 == null) {
                  continue label109;
               }

               int var15 = -1;

               label104:
               while (true) {
                  int var22 = var15;
                  int var10001 = 1;

                  label101: {
                     label100:
                     while (true) {
                        label98:
                        if (var22 <= var10001) {
                           int var16 = var12 + var15;
                           if (var5 != null) {
                              var23 = 0;
                              var10001 = var16;
                              if (var5 == null) {
                                 break label98;
                              }

                              label71:
                              if (0 <= var16) {
                                 int var24 = var16;
                                 var10001 = var2;
                                 if (var5 != null) {
                                    if (var16 >= var2) {
                                       break label71;
                                    }

                                    var24 = var16;
                                    var10001 = var1;
                                 }

                                 int var17 = var24 * var10001;
                                 int var18 = -1;

                                 while (var18 <= 1) {
                                    int var19 = var13 + var18;
                                    if (var5 != null) {
                                       var22 = 0;
                                       var10001 = var19;
                                       if (var5 == null) {
                                          continue label100;
                                       }

                                       label79:
                                       if (0 <= var19) {
                                          int var25 = var19;
                                          if (var5 != null) {
                                             if (var19 >= var1) {
                                                break label79;
                                             }

                                             var25 = var3[var17 + var19];
                                          }

                                          int var20 = var25;
                                          var7[var14] = var20;
                                          var8[var14] = var20 >> a(3247, 2804014343782574516L) & a(17605, 4551622530940494303L);
                                          var9[var14] = var20 >> a(9206, 7786147149570442990L) & a(13104, 4646420769866257966L);
                                          var10[var14] = var20 & a(13104, 4646420769866257966L);
                                          var14++;
                                       }

                                       var18++;
                                    }

                                    if (var5 == null) {
                                       break;
                                    }
                                 }
                              }

                              var15++;
                              if (var5 != null) {
                                 continue label104;
                              }
                           } else if (var5 != null) {
                              continue label104;
                           }

                           var23 = var14;
                           var10001 = a(26692, 4867723795067751768L);
                        } else {
                           var23 = var14;
                           var10001 = a(26692, 4867723795067751768L);
                        }

                        while (true) {
                           if (var23 >= var10001) {
                              break label100;
                           }

                           var7[var14] = a(24692, 3993834145299187051L);
                           var8[var14] = var9[var14] = var10[var14] = 0;
                           var14++;
                           if (var5 == null) {
                              break label101;
                           }

                           if (var5 == null) {
                              break label100;
                           }

                           var23 = var14;
                           var10001 = a(26692, 4867723795067751768L);
                        }
                     }

                     var11[var6++] = var7[this.K(var8, var9, var10)];
                     var13++;
                  }

                  if (var5 == null) {
                     break label106;
                  }
                  break;
               }
            }

            var12++;
            if (var5 == null) {
               return var11;
            }
            continue label111;
         }

         return var11;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9502;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      long var9;
      char[] var10003 = "\u00001\b&~L#&4\u001c:".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 60;
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
         var10007 = 60;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 126;
               break;
            case 1:
               var50 = 97;
               break;
            case 2:
               var50 = 65;
               break;
            case 3:
               var50 = 104;
               break;
            case 4:
               var50 = 109;
               break;
            case 5:
               var50 = 61;
               break;
            default:
               var50 = 122;
         }
      } else {
         var34 = 60;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            var9 = 7449937619813012069L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = ";\u0098X\u0012»&\u0004´\u001c'°ã~¤W\u000eÖ×Ê1f|ß4'³\u0003+2\u0092\u001a²ñ\u0087÷\u0010¿\u0099sE7\u0014M~I\u0084»Á";
            int var13 = ";\u0098X\u0012»&\u0004´\u001c'°ã~¤W\u000eÖ×Ê1f|ß4'³\u0003+2\u0092\u001a²ñ\u0087÷\u0010¿\u0099sE7\u0014M~I\u0084»Á".length();
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
                           c = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "¶\u0018kèX×\u0014\u0083¶\u0097Çi[b©<";
                        var13 = "¶\u0018kèX×\u0014\u0083¶\u0097Çi[b©<".length();
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
         var10007 = 60;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 126;
               break;
            case 1:
               var50 = 97;
               break;
            case 2:
               var50 = 65;
               break;
            case 3:
               var50 = 104;
               break;
            case 4:
               var50 = 109;
               break;
            case 5:
               var50 = 61;
               break;
            default:
               var50 = 122;
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
                  var50 = 126;
                  break;
               case 1:
                  var50 = 97;
                  break;
               case 2:
                  var50 = 65;
                  break;
               case 3:
                  var50 = 104;
                  break;
               case 4:
                  var50 = 109;
                  break;
               case 5:
                  var50 = 61;
                  break;
               default:
                  var50 = 122;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 7449937619813012069L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = ";\u0098X\u0012»&\u0004´\u001c'°ã~¤W\u000eÖ×Ê1f|ß4'³\u0003+2\u0092\u001a²ñ\u0087÷\u0010¿\u0099sE7\u0014M~I\u0084»Á";
               int var5 = ";\u0098X\u0012»&\u0004´\u001c'°ã~¤W\u000eÖ×Ê1f|ß4'³\u0003+2\u0092\u001a²ñ\u0087÷\u0010¿\u0099sE7\u0014M~I\u0084»Á".length();
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
                              c = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "¶\u0018kèX×\u0014\u0083¶\u0097Çi[b©<";
                           var5 = "¶\u0018kèX×\u0014\u0083¶\u0097Çi[b©<".length();
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
                  var50 = 126;
                  break;
               case 1:
                  var50 = 97;
                  break;
               case 2:
                  var50 = 65;
                  break;
               case 3:
                  var50 = 104;
                  break;
               case 4:
                  var50 = 109;
                  break;
               case 5:
                  var50 = 61;
                  break;
               default:
                  var50 = 122;
            }
         }
      }
   }
}





