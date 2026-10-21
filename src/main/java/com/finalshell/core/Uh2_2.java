package com.finalshell.core;

public class Uh2_2 {
   public final Uh2_2 M;
   public final Object Q;
   public final Object D;
   public final int g;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Uh2_2(Uh2_2 var1, Object var2, Object var3, int var4, int var5) {
      this.M = var1;
      this.Q = var2;
      this.D = var3;
      this.g = var4;
   }

   @Override
   public String toString() {
      if (this.M == null) {
         return "$";
      } else {
         StringBuilder var1 = new StringBuilder();
         this.g(var1);
         return var1.toString();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   protected void g(StringBuilder var1) {
      String var2 = Nv4.o();
      Object var10000 = this.M;
      if (var2 != null) {
         if (this.M == null) {
            var1.append((char)a(5841, 3102795346331477214L));
            if (var2 != null) {
               return;
            }
         }

         this.M.g(var1);
         var10000 = this.D;
      }

      if (var2 != null) {
         if (var10000 == null) {
            var1.append(a);
            if (var2 != null) {
               return;
            }
         }

         var10000 = this.D;
      }

      if (var2 != null) {
         if (var10000 instanceof Integer) {
            var1.append((char)a(5140, 5044953845604591106L));
            var1.append(((Integer)this.D).intValue());
            var1.append((char)a(31584, 7334111252576553339L));
            if (var2 != null) {
               return;
            }
         }

         var1.append((char)a(4873, 3600852801688936728L));
         var10000 = this.D;
      }

      String var3 = var10000.toString();
      int var4 = 0;
      int var5 = 0;

      label213: {
         int var10001;
         while (true) {
            label186:
            if (var5 < var3.length()) {
      char var8;
               char var6 = var3.charAt(var5);
               var8 = var6;
               var10001 = a(7831, 3172635347048803459L);
               if (var2 == null) {
                  break;
               }

               label216: {
                  label182:
                  if (var2 != null) {
                     if (var6 >= var10001) {
                        var8 = var6;
                        var10001 = a(4691, 6652211266409865290L);
                        if (var2 == null) {
                           break label182;
                        }

                        if (var6 <= var10001) {
                           break label216;
                        }
                     }

                     var8 = var6;
                     var10001 = a(7238, 9221258111600766553L);
                  }

                  label173:
                  if (var2 != null) {
                     if (var8 >= var10001) {
                        var8 = var6;
                        var10001 = a(30522, 7809600859859764516L);
                        if (var2 == null) {
                           break label173;
                        }

                        if (var6 <= var10001) {
                           break label216;
                        }
                     }

                     var8 = var6;
                     var10001 = a(27591, 8158947522142198228L);
                  }

                  label164: {
                     label163:
                     if (var2 != null) {
                        if (var8 >= var10001) {
                           var8 = var6;
                           var10001 = a(28236, 4986127014656597086L);
                           if (var2 == null) {
                              break label163;
                           }

                           if (var6 <= var10001) {
                              break label216;
                           }
                        }

                        var8 = var6;
                        if (var2 == null) {
                           break label164;
                        }

                        var10001 = a(16849, 418417653456663500L);
                     }

                     if (var8 > var10001) {
                        if (var2 != null) {
                           break label216;
                        }

                        var8 = 1;
                     } else {
                        var8 = 1;
                     }
                  }

                  var4 = var8;
                  if (var2 != null) {
                     break label186;
                  }
               }

               var5++;
               if (var2 != null) {
                  continue;
               }
            }

            int var9 = var4;
            if (var2 != null) {
               if (var4 == 0) {
      int var8;
                  break label213;
               }

               var9 = 0;
            }

            var5 = var9;
            var8 = var5;
            var10001 = var3.length();
            break;
         }

         while (var8 < var10001) {
            char var7 = var3.charAt(var5);
            if (var2 == null) {
               return;
            }

            label142: {
               label219: {
                  char var10 = var7;
                  var10001 = a(2789, 1829566867894614269L);
                  if (var2 != null) {
                     if (var7 == var10001) {
                        var1.append((char)a(27847, 5780257803441462994L));
                        var1.append((char)a(27847, 5780257803441462994L));
                        var1.append((char)a(27847, 5780257803441462994L));
                        if (var2 != null) {
                           break label219;
                        }
                     }

                     var10 = var7;
                     var10001 = a(16726, 5753378345836180312L);
                  }

                  label134: {
                     label133: {
                        label220: {
                           label131:
                           if (var2 != null) {
                              if (var10 >= var10001) {
                                 var10 = var7;
                                 var10001 = a(18493, 4764490785223408177L);
                                 if (var2 == null) {
                                    break label131;
                                 }

                                 if (var7 <= var10001) {
                                    break label220;
                                 }
                              }

                              var10 = var7;
                              var10001 = a(26230, 3761612938503246974L);
                           }

                           label122:
                           if (var2 != null) {
                              if (var10 >= var10001) {
                                 var10 = var7;
                                 var10001 = a(30926, 6974464646650907353L);
                                 if (var2 == null) {
                                    break label122;
                                 }

                                 if (var7 <= var10001) {
                                    break label220;
                                 }
                              }

                              var10 = var7;
                              var10001 = a(3498, 6589426850372501434L);
                           }

                           label113:
                           if (var2 != null) {
                              if (var10 >= var10001) {
                                 var10 = var7;
                                 var10001 = a(31002, 2992691318085831430L);
                                 if (var2 == null) {
                                    break label113;
                                 }

                                 if (var7 <= var10001) {
                                    break label220;
                                 }
                              }

                              var10 = var7;
                              var10001 = a(19656, 1133154145597161170L);
                           }

                           if (var2 == null) {
                              break label134;
                           }

                           if (var10 <= var10001) {
                              break label133;
                           }
                        }

                        var1.append(var7);
                        if (var2 != null) {
                           break label142;
                        }
                     }

                     var10 = var7;
                     var10001 = a(31721, 6537039439102724580L);
                  }

                  if (var10 == var10001) {
                     var1.append((char)a(27847, 5780257803441462994L));
                     var1.append((char)a(27847, 5780257803441462994L));
                     var1.append((char)a(27847, 5780257803441462994L));
                     if (var2 != null) {
                        break label219;
                     }
                  }

                  var1.append((char)a(27847, 5780257803441462994L));
                  var1.append((char)a(27847, 5780257803441462994L));
               }

               var1.append(var7);
            }

            var5++;
            if (var2 == null) {
               break;
            }

            var8 = var5;
            var10001 = var3.length();
         }

         if (var2 != null) {
            return;
         }
      }

      var1.append(var3);
   }

   /** @deprecated */
   public Uh2_2 d() {
      return this.M;
   }

   /** @deprecated */
   public Object P() {
      return this.Q;
   }

   /** @deprecated */
   public Object f() {
      return this.D;
   }

   /** @deprecated */
   public String b() {
      return this.toString();
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12828;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "lX\u0016\u0002\u001d".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 47;
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
         var10007 = 47;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 109;
               break;
            case 1:
               var50 = 25;
               break;
            case 2:
               var50 = 76;
               break;
            case 3:
               var50 = 65;
               break;
            case 4:
               var50 = 94;
               break;
            case 5:
               var50 = 116;
               break;
            default:
               var50 = 89;
         }
      } else {
         var34 = 47;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 8767443299810899732L;
            long[] var14 = new long[21];
            int var11 = 0;
            String var12 = "\u008d\u0005\u0096Ãi}¼h¢ïHÏ#\u0092\u0004Xa\u0098ß^P\u001d²jdÞþ3Ý¼Y\fÓÛ\b\u0001Ä5Ïµ:-qºP\u00adWg\u008f§1y¥\u008f\tFcZë\\ \u009e>2Ñ\u0095á__*[§\u0099;/+mÕ©\u009a\u0098¯ÁG¢\u001bÑM\u0003É\u0097\u009dc¾½\u0097kãÅ¢PDÈÏPds\u008e4¸Ö\"Õ÷Yï\u0098\u000e«00þ2j¯Í®¡eÜ\u0019e\u0085G\u008d\u001c)Á_e\u0083ô¾Ò\u0005\u0091\u001d\u0096Àf\u0004|";
            int var13 = "\u008d\u0005\u0096Ãi}¼h¢ïHÏ#\u0092\u0004Xa\u0098ß^P\u001d²jdÞþ3Ý¼Y\fÓÛ\b\u0001Ä5Ïµ:-qºP\u00adWg\u008f§1y¥\u008f\tFcZë\\ \u009e>2Ñ\u0095á__*[§\u0099;/+mÕ©\u009a\u0098¯ÁG¢\u001bÑM\u0003É\u0097\u009dc¾½\u0097kãÅ¢PDÈÏPds\u008e4¸Ö\"Õ÷Yï\u0098\u000e«00þ2j¯Í®¡eÜ\u0019e\u0085G\u008d\u001c)Á_e\u0083ô¾Ò\u0005\u0091\u001d\u0096Àf\u0004|"
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
                           c = new Integer[21];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "Ä·T\u001d-IÓî\u001eç·w\u0014d£+";
                        var13 = "Ä·T\u001d-IÓî\u001eç·w\u0014d£+".length();
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
         var10007 = 47;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 109;
               break;
            case 1:
               var50 = 25;
               break;
            case 2:
               var50 = 76;
               break;
            case 3:
               var50 = 65;
               break;
            case 4:
               var50 = 94;
               break;
            case 5:
               var50 = 116;
               break;
            default:
               var50 = 89;
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
                  var50 = 109;
                  break;
               case 1:
                  var50 = 25;
                  break;
               case 2:
                  var50 = 76;
                  break;
               case 3:
                  var50 = 65;
                  break;
               case 4:
                  var50 = 94;
                  break;
               case 5:
                  var50 = 116;
                  break;
               default:
                  var50 = 89;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 8767443299810899732L;
               long[] var6 = new long[21];
               int var3 = 0;
               String var4 = "\u008d\u0005\u0096Ãi}¼h¢ïHÏ#\u0092\u0004Xa\u0098ß^P\u001d²jdÞþ3Ý¼Y\fÓÛ\b\u0001Ä5Ïµ:-qºP\u00adWg\u008f§1y¥\u008f\tFcZë\\ \u009e>2Ñ\u0095á__*[§\u0099;/+mÕ©\u009a\u0098¯ÁG¢\u001bÑM\u0003É\u0097\u009dc¾½\u0097kãÅ¢PDÈÏPds\u008e4¸Ö\"Õ÷Yï\u0098\u000e«00þ2j¯Í®¡eÜ\u0019e\u0085G\u008d\u001c)Á_e\u0083ô¾Ò\u0005\u0091\u001d\u0096Àf\u0004|";
               int var5 = "\u008d\u0005\u0096Ãi}¼h¢ïHÏ#\u0092\u0004Xa\u0098ß^P\u001d²jdÞþ3Ý¼Y\fÓÛ\b\u0001Ä5Ïµ:-qºP\u00adWg\u008f§1y¥\u008f\tFcZë\\ \u009e>2Ñ\u0095á__*[§\u0099;/+mÕ©\u009a\u0098¯ÁG¢\u001bÑM\u0003É\u0097\u009dc¾½\u0097kãÅ¢PDÈÏPds\u008e4¸Ö\"Õ÷Yï\u0098\u000e«00þ2j¯Í®¡eÜ\u0019e\u0085G\u008d\u001c)Á_e\u0083ô¾Ò\u0005\u0091\u001d\u0096Àf\u0004|"
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
                              c = new Integer[21];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "Ä·T\u001d-IÓî\u001eç·w\u0014d£+";
                           var5 = "Ä·T\u001d-IÓî\u001eç·w\u0014d£+".length();
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
                  var50 = 109;
                  break;
               case 1:
                  var50 = 25;
                  break;
               case 2:
                  var50 = 76;
                  break;
               case 3:
                  var50 = 65;
                  break;
               case 4:
                  var50 = 94;
                  break;
               case 5:
                  var50 = 116;
                  break;
               default:
                  var50 = 89;
            }
         }
      }
   }
}






