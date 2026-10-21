package com.finalshell.core;

import java.awt.Rectangle;

public class Yq4 extends GT3 {
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public int o(int[] var1) {
      String[] var10001 = W5.q();
      int var3 = 0;
      int var4 = 0;
      String[] var2 = var10001;
      int var5 = a(12780, 5993100657842290892L);
      int var6 = a(26143, 971975268155381566L);
      int var7 = 0;

      int var10000;
      while (true) {
         if (var7 < a(24130, 965786793410424682L)) {
            var10000 = var7;
            var8 = 4;
            if (var2 == null) {
               break;
            }

            label66: {
               if (var2 != null) {
                  if (var7 == 4) {
      int var8;
                     break label66;
                  }

                  var10000 = var1[var7];
                  var8 = var5;
               }

               label67: {
                  if (var2 != null) {
                     if (var10000 < var8) {
                        var5 = var1[var7];
                        var3 = var7;
                     }

                     var10000 = var1[var7];
                     if (var2 == null) {
                        break label67;
                     }

                     var8 = var6;
                  }

                  if (var10000 <= var8) {
                     break label66;
                  }

                  var6 = var1[var7];
                  var10000 = var7;
               }

               var4 = var10000;
            }

            var7++;
            if (var2 != null) {
               continue;
            }
         }

         var10000 = var1[4];
         var8 = var5;
         break;
      }

      if (var2 != null) {
         if (var10000 < var8) {
            return var1[var3];
         }

         var10000 = var1[4];
         if (var2 == null) {
            return var10000;
         }

         var8 = var6;
      }

      return var10000 > var8 ? var1[var4] : var1[4];
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int[] var8;
      int var6 = 0;
      String[] var10000 = W5.q();
      int[] var7 = new int[a(6894, 6803633326055861185L)];
      var8 = new int[a(6894, 6803633326055861185L)];
      int[] var9 = new int[a(6894, 6803633326055861185L)];
      int[] var10 = new int[var1 * var2];
      String[] var5 = var10000;
      int var11 = 0;

      label117:
      while (true) {
         int var25 = var11;

         label115:
         while (var25 < var2) {
            int var12 = 0;

            label112:
            while (true) {
               int var26 = var12;
               int var10001 = var1;

               label110:
               while (true) {
                  if (var26 >= var10001) {
                     break label112;
                  }

                  int var13 = 0;
                  int var14 = var3[var6];
                  int var15 = var14 >> a(3411, 1454035824961731704L) & a(16814, 5800072740861538432L);
                  int var16 = var14 >> a(8960, 424705522229875244L) & a(19430, 7439709530125728459L);
                  int var17 = var14 & a(19430, 7439709530125728459L);
                  var25 = -1;
                  if (var5 == null) {
                     continue label115;
                  }

                  int var18 = -1;

                  label107:
                  while (true) {
                     int var27 = var18;
                     var10001 = 1;

                     label105:
                     while (true) {
                        if (var27 > var10001) {
                           break label107;
                        }

                        label102: {
                           label124: {
                              int var19 = var11 + var18;
                              var26 = 0;
                              label100:
                              if (var5 != null) {
                                 var10001 = var19;
                                 if (var5 == null) {
                                    continue label110;
                                 }

                                 if (0 <= var19) {
                                    var26 = var19;
                                    if (var5 == null) {
                                       break label100;
                                    }

                                    if (var19 < var2) {
                                       int var20 = var19 * var1;
                                       int var21 = -1;

                                       while (var21 <= 1) {
                                          label89: {
                                             int var22 = var12 + var21;
                                             if (var5 != null) {
                                                var27 = 0;
                                                var10001 = var22;
                                                if (var5 == null) {
                                                   continue label105;
                                                }

                                                label84:
                                                if (0 <= var22) {
                                                   int var28 = var22;
                                                   if (var5 != null) {
                                                      if (var22 >= var1) {
                                                         break label84;
                                                      }

                                                      var28 = var3[var20 + var22];
                                                   }

                                                   int var23 = var28;
                                                   var7[var13] = var23 >> a(22102, 1008112507837769599L) & a(19430, 7439709530125728459L);
                                                   var8[var13] = var23 >> a(13370, 1938207697694524696L) & a(19430, 7439709530125728459L);
                                                   var9[var13] = var23 & a(19430, 7439709530125728459L);
                                                   if (var5 != null) {
                                                      break label89;
                                                   }
                                                }

                                                var7[var13] = var15;
                                                var8[var13] = var16;
                                             }

                                             var9[var13] = var17;
                                          }

                                          var13++;
                                          var21++;
                                          if (var5 == null) {
                                             break;
                                          }
                                       }

                                       if (var5 != null) {
                                          break label124;
                                       }
                                    }
                                 }

                                 var26 = -1;
                              }

                              int var24 = var26;

                              while (var24 <= 1) {
                                 var7[var13] = var15;
                                 var8[var13] = var16;
                                 var9[var13] = var17;
                                 var13++;
                                 var24++;
                                 if (var5 == null) {
                                    break label102;
                                 }

                                 if (var5 == null) {
                                    break;
                                 }
                              }
                           }

                           var18++;
                        }

                        if (var5 == null) {
                           break label107;
                        }
                        break;
                     }
                  }

                  var10[var6] = var3[var6] & a(851, 7199813677010596473L)
                     | this.o(var7) << a(22102, 1008112507837769599L)
                     | this.o(var8) << a(13370, 1938207697694524696L)
                     | this.o(var9);
                  var6++;
                  var12++;
                  if (var5 == null) {
                     break label112;
                  }
                  break;
               }
            }

            var11++;
            if (var5 == null) {
               return var10;
            }
            continue label117;
         }

         return var10;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12584;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "]FzL:!}pE{V".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 52;
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
         var10007 = 52;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 43;
               break;
            case 1:
               var50 = 30;
               break;
            case 2:
               var50 = 59;
               break;
            case 3:
               var50 = 10;
               break;
            case 4:
               var50 = 33;
               break;
            case 5:
               var50 = 70;
               break;
            default:
               var50 = 36;
         }
      } else {
         var34 = 52;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 7270167058506934416L;
            long[] var14 = new long[11];
            int var11 = 0;
            String var12 = "zJ\u0007\u0092\tð\u0087óa)´=§A\u000fÿ_\u001f×mÐ:ZéÙ\u0017ô\u00ad±\u0084Tø,I Û®¥ú´\u0080\u0002\u008fÚË6\u0012¤üîL¹Êw\u0018ï<~\u0096\u009cÉ\u009cÃXú@öUn+\u0017£";
            int var13 = "zJ\u0007\u0092\tð\u0087óa)´=§A\u000fÿ_\u001f×mÐ:ZéÙ\u0017ô\u00ad±\u0084Tø,I Û®¥ú´\u0080\u0002\u008fÚË6\u0012¤üîL¹Êw\u0018ï<~\u0096\u009cÉ\u009cÃXú@öUn+\u0017£"
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
                           c = new Integer[11];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "E°¸\u000bxÐ¿®ùÉ£§~\u000fí\u0080";
                        var13 = "E°¸\u000bxÐ¿®ùÉ£§~\u000fí\u0080".length();
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
         var10007 = 52;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 43;
               break;
            case 1:
               var50 = 30;
               break;
            case 2:
               var50 = 59;
               break;
            case 3:
               var50 = 10;
               break;
            case 4:
               var50 = 33;
               break;
            case 5:
               var50 = 70;
               break;
            default:
               var50 = 36;
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
                  var50 = 43;
                  break;
               case 1:
                  var50 = 30;
                  break;
               case 2:
                  var50 = 59;
                  break;
               case 3:
                  var50 = 10;
                  break;
               case 4:
                  var50 = 33;
                  break;
               case 5:
                  var50 = 70;
                  break;
               default:
                  var50 = 36;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 7270167058506934416L;
               long[] var6 = new long[11];
               int var3 = 0;
               String var4 = "zJ\u0007\u0092\tð\u0087óa)´=§A\u000fÿ_\u001f×mÐ:ZéÙ\u0017ô\u00ad±\u0084Tø,I Û®¥ú´\u0080\u0002\u008fÚË6\u0012¤üîL¹Êw\u0018ï<~\u0096\u009cÉ\u009cÃXú@öUn+\u0017£";
               int var5 = "zJ\u0007\u0092\tð\u0087óa)´=§A\u000fÿ_\u001f×mÐ:ZéÙ\u0017ô\u00ad±\u0084Tø,I Û®¥ú´\u0080\u0002\u008fÚË6\u0012¤üîL¹Êw\u0018ï<~\u0096\u009cÉ\u009cÃXú@öUn+\u0017£"
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
                              c = new Integer[11];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "E°¸\u000bxÐ¿®ùÉ£§~\u000fí\u0080";
                           var5 = "E°¸\u000bxÐ¿®ùÉ£§~\u000fí\u0080".length();
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
                  var50 = 43;
                  break;
               case 1:
                  var50 = 30;
                  break;
               case 2:
                  var50 = 59;
                  break;
               case 3:
                  var50 = 10;
                  break;
               case 4:
                  var50 = 33;
                  break;
               case 5:
                  var50 = 70;
                  break;
               default:
                  var50 = 36;
            }
         }
      }
   }
}





