package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;

public class WQ {
   public static String V;
   public static long[] a;
   public static Integer[] b;
   public static long[] c;
   public static Long[] d;

   public static int y(byte[] var0, int var1) {
      int var3 = a(13197, 6767060242505760426L);
      String var10000 = H();
      int var4 = a(24129, 2762923885076845395L);
      int var5 = a(31123, 3481093960209380530L);
      int var6 = a(3466, 4342495464462172294L);
      byte var7 = 5;
      int var8 = a(29038, 1187943839769640005L);
      int var9 = var1;
      int var10 = var0.length;
      String var2 = var10000;
      int var11 = var10 & a(21611, 1127487676949469558L);
      int var12 = 0;

      while (true) {
         if (var12 < var11) {
            int var13 = var0[var12] & a(26521, 5011925406786759299L)
               | (var0[var12 + 1] & a(4510, 3331824955331959956L)) << a(4947, 1642543640318041674L)
               | (var0[var12 + 2] & a(4510, 3331824955331959956L)) << a(12139, 5820180700194038381L)
               | (var0[var12 + 3] & a(4510, 3331824955331959956L)) << a(915, 1864416489461141139L);
            var13 *= a(381, 1517377184340954219L);
            var13 = Integer.rotateLeft(var13, a(31123, 3481093960209380530L));
            var13 *= a(29224, 3054362521927925548L);
            var9 ^= var13;
            var9 = Integer.rotateLeft(var9, a(3466, 4342495464462172294L));
            var9 = var9 * 5 + a(5035, 8656462902644235939L);
            var12 += 4;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         var12 = 0;
         break;
      }

      int var29 = var10 & 3;
      if (var2 == null) {
         switch (var29) {
            case 3:
               var12 ^= (var0[var11 + 2] & a(4510, 3331824955331959956L)) << a(12139, 5820180700194038381L);
            case 2:
               var12 ^= (var0[var11 + 1] & a(4510, 3331824955331959956L)) << a(4947, 1642543640318041674L);
            case 1:
               var12 ^= var0[var11] & a(4510, 3331824955331959956L);
               var12 *= a(381, 1517377184340954219L);
               var12 = Integer.rotateLeft(var12, a(31123, 3481093960209380530L));
               var12 *= a(29224, 3054362521927925548L);
               var9 ^= var12;
            default:
               var9 ^= var10;
               var9 ^= var9 >>> a(12139, 5820180700194038381L);
               var9 *= a(22582, 2467533060512814382L);
               var9 ^= var9 >>> a(3466, 4342495464462172294L);
               var9 *= a(26819, 1086815534219961831L);
               var9 ^= var9 >>> a(12139, 5820180700194038381L);
               var29 = var9;
         }
      }

      if (Ky4.F$arrString() != null) {
         C("liI6b");
      }

      return var29;
   }

   public static long[] A(byte[] var0, int var1) {
      long var52;
      long var3 = b(30204, 778639446394293286L);
      long var5 = b(27462, 1365980114020455071L);
      int var7 = a(23231, 1253327073870223294L);
      int var8 = a(13531, 6661263535525362140L);
      int var9 = a(31633, 5534612396029392543L);
      byte var10 = 5;
      long var11 = b(29277, 5372630048538676109L);
      long var13 = b(24766, 2104238932973312365L);
      long var15 = (long)var1 & b(30741, 4282831706854441409L);
      long var17 = (long)var1 & b(3910, 8586923411419870864L);
      String var10000 = H();
      int var19 = var0.length;
      int var20 = var19 & a(15617, 6765240455423750177L);
      String var2 = var10000;
      byte var21 = 0;

      while (true) {
         if (var21 < var20) {
            long var22 = Q(var0, var21);
            long var24 = Q(var0, var21 + a(31967, 3668033655317705153L));
            var22 *= b(12140, 1820641327000229566L);
            var22 = Long.rotateLeft(var22, a(29785, 2665782920770828622L));
            var22 *= b(9199, 704174023778376242L);
            long var26 = var15 ^ var22;
            long var27 = Long.rotateLeft(var26, a(14579, 2738800092853728748L));
            long var28 = var27 + var17;
            var15 = var28 * b(30076, 5354743543328427177L) + b(27679, 8489639316515575240L);
            var24 *= b(9199, 704174023778376242L);
            var24 = Long.rotateLeft(var24, a(14667, 524145075995440216L));
            var24 *= b(12140, 1820641327000229566L);
            long var32 = var17 ^ var24;
            long var33 = Long.rotateLeft(var32, a(29785, 2665782920770828622L));
            var17 = var33 + var15;
            var52 = var17 * b(24737, 6643969445453486457L) + b(32755, 3283889297720559149L);
            if (var2 != null) {
               break;
            }

            var17 = var52;
            var21 += 16;
            if (var2 == null) {
               continue;
            }

            Ky4.K(new String[1]);
         }

         var52 = 0L;
         break;
      }

      long var37 = var52;
      long var23 = 0L;
      int var53 = var19 & a(6459, 2519596713538507832L);
      if (var2 == null) {
         switch (var53) {
            case 15:
               var23 ^= ((long)var0[var20 + a(5447, 2100350744839444552L)] & b(21913, 942178451249785922L)) << a(24209, 5471762348240540563L);
            case 14:
               var23 ^= ((long)var0[var20 + a(10700, 4216838691169592537L)] & b(6541, 7355715004967231580L)) << a(30920, 3403671092365473259L);
            case 13:
               var23 ^= ((long)var0[var20 + a(452, 5253871214346030288L)] & b(6541, 7355715004967231580L)) << a(13548, 7457197707286149582L);
            case 12:
               var23 ^= ((long)var0[var20 + a(15971, 233234887654339398L)] & b(6541, 7355715004967231580L)) << a(12388, 6293439969133231436L);
            case 11:
               var23 ^= ((long)var0[var20 + a(12848, 8902084491804737310L)] & b(6541, 7355715004967231580L)) << a(8882, 9086557603095801755L);
            case 10:
               var23 ^= ((long)var0[var20 + a(30947, 5706752502023927295L)] & b(6541, 7355715004967231580L)) << a(4947, 1642543640318041674L);
            case 9:
               var23 ^= (long)var0[var20 + a(4947, 1642543640318041674L)] & b(6541, 7355715004967231580L);
               var23 *= b(9199, 704174023778376242L);
               var23 = Long.rotateLeft(var23, a(14667, 524145075995440216L));
               var23 *= b(12140, 1820641327000229566L);
               var17 ^= var23;
            case 8:
               var37 ^= ((long)var0[var20 + a(16602, 509384625955016188L)] & b(6541, 7355715004967231580L)) << a(20056, 7109998466134377297L);
            case 7:
               var37 ^= ((long)var0[var20 + a(933, 7803510114521665167L)] & b(6541, 7355715004967231580L)) << a(4978, 7384540874462256745L);
            case 6:
               var37 ^= ((long)var0[var20 + 5] & b(6541, 7355715004967231580L)) << a(28266, 119993862969467770L);
            case 5:
               var37 ^= ((long)var0[var20 + 4] & b(6541, 7355715004967231580L)) << a(5011, 1082419445758418562L);
            case 4:
               var37 ^= ((long)var0[var20 + 3] & b(6541, 7355715004967231580L)) << a(915, 1864416489461141139L);
            case 3:
               var37 ^= ((long)var0[var20 + 2] & b(6541, 7355715004967231580L)) << a(12139, 5820180700194038381L);
            case 2:
               var37 ^= ((long)var0[var20 + 1] & b(6541, 7355715004967231580L)) << a(4947, 1642543640318041674L);
            case 1:
               long var38 = var37 ^ (long)var0[var20] & b(6541, 7355715004967231580L);
               long var39 = var38 * b(12140, 1820641327000229566L);
               long var40 = Long.rotateLeft(var39, a(29785, 2665782920770828622L));
               long var41 = var40 * b(9199, 704174023778376242L);
               var15 ^= var41;
            default:
               long var29 = var15 ^ (long)var19;
               var17 ^= (long)var19;
               long var30 = var29 + var17;
               var17 += var30;
               long var31 = l(var30);
               var17 = l(var17);
               var15 = var31 + var17;
               var17 += var15;
               var53 = 2;
         }
      }

      long[] var54 = new long[var53];
      var54[0] = var15;
      var54[1] = var17;
      return var54;
   }

   public static long Q(byte[] var0, int var1) {
      return (long)var0[var1] & b(6541, 7355715004967231580L)
         | ((long)var0[var1 + 1] & b(6541, 7355715004967231580L)) << a(4947, 1642543640318041674L)
         | ((long)var0[var1 + 2] & b(6541, 7355715004967231580L)) << a(12139, 5820180700194038381L)
         | ((long)var0[var1 + 3] & b(6541, 7355715004967231580L)) << a(915, 1864416489461141139L)
         | ((long)var0[var1 + 4] & b(6541, 7355715004967231580L)) << a(5011, 1082419445758418562L)
         | ((long)var0[var1 + 5] & b(6541, 7355715004967231580L)) << a(28266, 119993862969467770L)
         | ((long)var0[var1 + a(32160, 2783051855589060781L)] & b(6541, 7355715004967231580L)) << a(4978, 7384540874462256745L)
         | ((long)var0[var1 + a(16285, 8993675542397121176L)] & b(6541, 7355715004967231580L)) << a(12936, 7180301626574208899L);
   }

   public static long l(long var0) {
      var0 ^= var0 >>> a(14667, 524145075995440216L);
      var0 *= b(14786, 3425798755487154206L);
      var0 ^= var0 >>> a(14667, 524145075995440216L);
      var0 *= b(18928, 5441612500571648047L);
      return var0 ^ var0 >>> a(14667, 524145075995440216L);
   }

   public static void C(String var0) {
      V = var0;
   }

   public static String H() {
      return V;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19714;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 14810) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var8 = 3191732413460529079L;
      long[] var14 = new long[45];
      int var11 = 0;
      String var12 = "¨´kZDV,\u0014Ðõ\u0083\u000e½Þk\u0080¤\u009dªãuÜq<^S|§c\u0000(\u0016F½}\u0089©Ì]Êäy\u0090T´*FpÕE\u0002\u00adÇ*µ\b|Ôù\tkØÍ(8^YäÖ=ãÜ\u0017PÔpjw@\fs,uß·J\u008ap´Ì\u0099\u008a\ré<Þqd\u0010h¸¤\t\tÖ\\düã\u008bçñIçï\u008b<i\u007f<%h\u008fwé\u008a\u008f\u001cÌô\u00070®\u009f\u0099w©5×\u001d[\u0010KÎA6äõkï\u009cå\r7¢kp\rá\u0015\u0000üþi\u0080\u0018Þ\u008d}\fÑ¶z³\u0006æ\u0085é÷Û°Ôók\u0018º-Ê\u0094#[c\u0015\u001dù7Z-\u0095Ë\f&E¡ÑÆáîh\u0085à¬\u0000çàò*JzÃ3Qáõ\u0002Ø\u0081MÛ\t\u008e~F\u0090·úG0J@P\u0001\u001a\u0018\n_\nA8YÓCD¡Ù=\u001d\u0002Ø\u008a8ÏÆY¸\u0090mU\nß\u008atÅ@íõx7°f^a\u009a·Rc\u008b\nl·\u0081¾fr2LGñ#\u0018\u0016ÍlLq¹ðÍ\u00adV4e«~&È1·Lúí\u00019ä\u008bQq>éúÛ\n\u0002«h\u0096zÙ'éý\u0004Bã";
      int var13 = "¨´kZDV,\u0014Ðõ\u0083\u000e½Þk\u0080¤\u009dªãuÜq<^S|§c\u0000(\u0016F½}\u0089©Ì]Êäy\u0090T´*FpÕE\u0002\u00adÇ*µ\b|Ôù\tkØÍ(8^YäÖ=ãÜ\u0017PÔpjw@\fs,uß·J\u008ap´Ì\u0099\u008a\ré<Þqd\u0010h¸¤\t\tÖ\\düã\u008bçñIçï\u008b<i\u007f<%h\u008fwé\u008a\u008f\u001cÌô\u00070®\u009f\u0099w©5×\u001d[\u0010KÎA6äõkï\u009cå\r7¢kp\rá\u0015\u0000üþi\u0080\u0018Þ\u008d}\fÑ¶z³\u0006æ\u0085é÷Û°Ôók\u0018º-Ê\u0094#[c\u0015\u001dù7Z-\u0095Ë\f&E¡ÑÆáîh\u0085à¬\u0000çàò*JzÃ3Qáõ\u0002Ø\u0081MÛ\t\u008e~F\u0090·úG0J@P\u0001\u001a\u0018\n_\nA8YÓCD¡Ù=\u001d\u0002Ø\u008a8ÏÆY¸\u0090mU\nß\u008atÅ@íõx7°f^a\u009a·Rc\u008b\nl·\u0081¾fr2LGñ#\u0018\u0016ÍlLq¹ðÍ\u00adV4e«~&È1·Lúí\u00019ä\u008bQq>éúÛ\n\u0002«h\u0096zÙ'éý\u0004Bã"
         .length();
      C(null);
      byte var10 = 0;

      label38:
      while (true) {
         int var10001 = var10;
         var10 += 8;
         byte[] var15 = var12.substring(var10001, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         long[] var10000 = var14;
         var10001 = var11++;
         long var10002 = ((long)var15[0] & 255L) << 56
            | ((long)var15[1] & 255L) << 48
            | ((long)var15[2] & 255L) << 40
            | ((long)var15[3] & 255L) << 32
            | ((long)var15[4] & 255L) << 24
            | ((long)var15[5] & 255L) << 16
            | ((long)var15[6] & 255L) << 8
            | (long)var15[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var30 = var10002 ^ var8;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var30;
                  if (var10 >= var13) {
                     a = var14;
                     b = new Integer[45];
                     long var0 = 6133426277232085216L;
                     long[] var6 = new long[16];
                     int var3 = 0;
                     String var4 = "Ø\u0013}Q\u0085E\u0017\u0013X\r\u0004üÓ²d]\t*Q±\u0088ºÑ\u009c\u000b\u001f\f]ã]I\u0000x\u008cùY6i\u0014xÚT\u008aðñ\u0017\u0014\u009c\u0085Å\u0000µGë\u00043\u0010.Y{úl\u0081\u00adË\u0099\u0002\u0086ø\u000bÍ\u008bH-\u008c\u009aüU\u008b8\u001f\u0091$#ì\u0017$D3\nñ`Êb(C\"4¯ëò¢A\u008f Ï\u000fIÈ²:\u0001";
                     int var5 = "Ø\u0013}Q\u0085E\u0017\u0013X\r\u0004üÓ²d]\t*Q±\u0088ºÑ\u009c\u000b\u001f\f]ã]I\u0000x\u008cùY6i\u0014xÚT\u008aðñ\u0017\u0014\u009c\u0085Å\u0000µGë\u00043\u0010.Y{úl\u0081\u00adË\u0099\u0002\u0086ø\u000bÍ\u008bH-\u008c\u009aüU\u008b8\u001f\u0091$#ì\u0017$D3\nñ`Êb(C\"4¯ëò¢A\u008f Ï\u000fIÈ²:\u0001"
                        .length();
                     byte var2 = 0;

                     label28:
                     while (true) {
                        int var21 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var21, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                        var10000 = var6;
                        var21 = var3++;
                        var10002 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        var10003 = -1;

                        while (true) {
                           var30 = var10002 ^ var0;
                           switch (var10003) {
                              case 0:
                                 var10000[var21] = var30;
                                 if (var2 >= var5) {
                                    c = var6;
                                    d = new Long[16];
                                    return;
                                 }
                                 break;
                              default:
                                 var10000[var21] = var30;
                                 if (var2 < var5) {
                                    continue label28;
                                 }

                                 var4 = "nqâ\ræ^6Þ\u001fQ\u0090R%\u001fDL";
                                 var5 = "nqâ\ræ^6Þ\u001fQ\u0090R%\u001fDL".length();
                                 var2 = 0;
                           }

                           byte var23 = var2;
                           var2 += 8;
                           var7 = var4.substring(var23, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                           var10000 = var6;
                           var21 = var3++;
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
                  break;
               default:
                  var10000[var10001] = var30;
                  if (var10 < var13) {
                     continue label38;
                  }

                  var12 = "\u0080áK\taÌP<ªtêË$âÀ£";
                  var13 = "\u0080áK\taÌP<ªtêË$âÀ£".length();
                  var10 = 0;
            }

            byte var20 = var10;
            var10 += 8;
            var15 = var12.substring(var20, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
            var10000 = var14;
            var10001 = var11++;
            var10002 = ((long)var15[0] & 255L) << 56
               | ((long)var15[1] & 255L) << 48
               | ((long)var15[2] & 255L) << 40
               | ((long)var15[3] & 255L) << 32
               | ((long)var15[4] & 255L) << 24
               | ((long)var15[5] & 255L) << 16
               | ((long)var15[6] & 255L) << 8
               | (long)var15[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





