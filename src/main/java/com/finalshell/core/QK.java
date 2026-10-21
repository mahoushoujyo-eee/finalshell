package com.finalshell.core;

import com.finalshell.ui.model.Dy2_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class QK {
   public Dy2_2 W;
   @Nullable
   public Character h = null;
   public static Map l;
   public static long[] a;
   public static Integer[] b;

   public QK(Dy2_2 var1) {
      this.W = var1;
   }

   public QK(Dy2_2 var1, char var2) {
      this.W = var1;
      this.h = var2;
   }

   @NotNull
   public static List E(byte[] var0) {
      String[] var1 = Wq2_2.y();
      if (var0.length == 0) {
         return Collections.emptyList();
      } else {
         String var2 = new String(var0);
         String var10000 = var2;
         if (var1 == null) {
            if (!B(var2.charAt(0))) {
               return Collections.singletonList(l(var0));
            }

            var10000 = var2;
         }

         return L(var10000);
      }
   }

   @NotNull
   public static QK E(char var0) {
      return B(var0) ? new QK(Dy2_2.Character, var0) : new QK(Dy2_2.Unknown);
   }

   @NotNull
   public static List L(@NotNull String var0) {
      ArrayList var9;
      String[] var1 = Wq2_2.y();
      boolean var10000 = var0.isEmpty();
      if (var1 == null) {
         if (var10000) {
            return Collections.emptyList();
         }

         if (var1 != null) {
            return Collections.singletonList(l(var0.getBytes()));
         }

         var10000 = B(var0.charAt(0));
      }

      if (var10000) {
         ArrayList var2 = new ArrayList();
         char[] var3 = var0.toCharArray();
         int var4 = var3.length;
         int var5 = 0;

         while (true) {
            label32:
            if (var5 < var4) {
               char var6 = var3[var5];
               QK var7 = E(var6);
               var9 = var2;
               if (var1 != null) {
                  break;
               }

               var2.add(var7);
               if (var1 == null) {
                  if (var7.W == Dy2_2.Unknown) {
                     break label32;
                  }

                  var5++;
               }

               if (var1 == null) {
                  continue;
               }
            }

            var9 = var2;
            break;
         }

         return var9;
      } else {
         return Collections.singletonList(l(var0.getBytes()));
      }
   }

   @Nullable
   public Character Z() {
      return this.h;
   }

   @Contract(
      pure = true
   )
   public static boolean B(char var0) {
      String[] var10000 = Wq2_2.y();
      int var2 = Character.getType(var0);
      String[] var1 = var10000;
      int var3 = var2;
      if (var1 == null) {
         if (var2 == 0) {
            return 0 != 0;
         }

         var3 = var2;
      }

      int var10001 = a(11580, 3856075470875138001L);
      if (var1 == null) {
         if (var3 == var10001) {
            return 0 != 0;
         }

         var3 = var2;
         var10001 = a(16264, 4793229648326591843L);
      }

      if (var1 == null) {
         if (var3 == var10001) {
            return 0 != 0;
         }

         var3 = var2;
         var10001 = a(3922, 5844801897105339778L);
      }

      if (var1 == null) {
         if (var3 == var10001) {
            return 0 != 0;
         }

         var3 = var2;
         var10001 = a(15786, 1273834449780770679L);
      }

      if (var1 == null) {
         if (var3 == var10001) {
            return 0 != 0;
         }

         var3 = var2;
         var10001 = a(21930, 1834731419254878076L);
      }

      if (var1 == null) {
         if (var3 == var10001) {
            return 0 != 0;
         }

         var3 = var2;
         if (var1 != null) {
            return var2 != 0;
         }

         var10001 = a(31321, 2624397515676205196L);
      }

      return (boolean)((var3 != var10001 ? 1 : 0) != 0);
   }

   @NotNull
   public static QK l(byte[] var0) {
      return new QK(l.getOrDefault(new Rp2(var0), Dy2_2.Unknown));
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15051;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      Entry[] var9;
      long var0 = 1116613458521949625L;
      long[] var6 = new long[48];
      int var3 = 0;
      String var4 = "A\u0016\u008b\u0011RN¤À¼\u008cmÏE©d\u009e\u0088qbé#ñ\u008e\u0016·êØG''GY²qÉ}\u001fhn±\u001e¢ï\u008eñÑäÄ\u0084ì\u008d4(2ø2ø\rBË¿à¦f$äá},q\u0084eµß2®\u009f«\u0003ù\u009a#µ¬\u0085]Düd Ä\u001aÃZ.cÇãì\u0084ðöRmôm\\ð!R©\u0001½ÀÓ3¡BD°\u009aû·\u001cÙË\u0007,C\u009a\u0016ÅÂàâ_\u0093£î)\u0084û\u0082\tb\u009b\u0019¯;î°0Q·®\u001b3 \u009bv(wM\u008c1æsvá\u009c¦¸\u009b,U>(m·\u0012\u009bI\u0082Þ<,\u008c\u00ad®K«\u0015RyÁY(ç|^Úu~\u009bFå\tT_´Uï¯\u0018\u0002\u008cH°CFùá04r\u0091å\u0091\u0097P¦Üå\u0001½d\u0004pj×\u0088(ºF\u0085ÓE&\u0099\u0092/L®.¸Îh\u0098¤\u0085qÿ\u0080Ô\u008eh\u008cì\u000fïèÁÓ³\u009døæ\u0096dqéã\u0098\u000fZ\u0081\\á\u0084&/\u0088¯¨ÏïPjÙ±\u0088%EhYÑBj\u009e\u0003\u0012e/4_=³\u008a.ïÀ¤Ò½\u0098\u0014üLw\b1ïPÿªê\u001fý\u0089}§'ñ\u000b\u0083c^DF\u0000\u001bQ\u008f\u000b«\u0088qK£ÐWÙ-,£®\u001e\u0094";
      int var5 = "A\u0016\u008b\u0011RN¤À¼\u008cmÏE©d\u009e\u0088qbé#ñ\u008e\u0016·êØG''GY²qÉ}\u001fhn±\u001e¢ï\u008eñÑäÄ\u0084ì\u008d4(2ø2ø\rBË¿à¦f$äá},q\u0084eµß2®\u009f«\u0003ù\u009a#µ¬\u0085]Düd Ä\u001aÃZ.cÇãì\u0084ðöRmôm\\ð!R©\u0001½ÀÓ3¡BD°\u009aû·\u001cÙË\u0007,C\u009a\u0016ÅÂàâ_\u0093£î)\u0084û\u0082\tb\u009b\u0019¯;î°0Q·®\u001b3 \u009bv(wM\u008c1æsvá\u009c¦¸\u009b,U>(m·\u0012\u009bI\u0082Þ<,\u008c\u00ad®K«\u0015RyÁY(ç|^Úu~\u009bFå\tT_´Uï¯\u0018\u0002\u008cH°CFùá04r\u0091å\u0091\u0097P¦Üå\u0001½d\u0004pj×\u0088(ºF\u0085ÓE&\u0099\u0092/L®.¸Îh\u0098¤\u0085qÿ\u0080Ô\u008eh\u008cì\u000fïèÁÓ³\u009døæ\u0096dqéã\u0098\u000fZ\u0081\\á\u0084&/\u0088¯¨ÏïPjÙ±\u0088%EhYÑBj\u009e\u0003\u0012e/4_=³\u008a.ïÀ¤Ò½\u0098\u0014üLw\b1ïPÿªê\u001fý\u0089}§'ñ\u000b\u0083c^DF\u0000\u001bQ\u008f\u000b«\u0088qK£ÐWÙ-,£®\u001e\u0094"
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
            long var18 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var18;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[48];
                     var9 = new Entry[a(5741, 9053429790468320427L)];
                     var9[0] = Map.entry(
                        new Rp2(
                           new int[]{
                              a(5227, 2069284929012018871L), a(13924, 7853750280980663478L), a(5506, 7258056321761587040L), a(18232, 6650924870176472565L)
                           }
                        ),
                        Dy2_2.Delete
                     );
                     var9[1] = Map.entry(new Rp2(new int[]{a(23390, 246513614960812471L)}), Dy2_2.Backspace);
                     var9[2] = Map.entry(new Rp2(new int[]{a(23464, 447462671001772390L), a(12569, 7881560711177866192L)}), Dy2_2.AltBackspace);
                     var9[3] = Map.entry(
                        new Rp2(new int[]{a(23464, 447462671001772390L), a(30823, 8489789060309074607L), a(15558, 3514368340966770180L)}), Dy2_2.LeftArrow
                     );
                     var9[4] = Map.entry(
                        new Rp2(new int[]{a(23464, 447462671001772390L), a(17263, 7054740860733782460L), a(22750, 8078548660089446970L)}), Dy2_2.LeftArrow
                     );
                     var9[5] = Map.entry(
                        new Rp2(new int[]{a(23464, 447462671001772390L), a(6653, 49255603365716778L), a(3859, 2733625920051066314L)}), Dy2_2.RightArrow
                     );
                     var9[a(17168, 6754081954914367987L)] = Map.entry(
                        new Rp2(new int[]{a(23464, 447462671001772390L), a(17263, 7054740860733782460L), a(6480, 2775155348326032284L)}), Dy2_2.RightArrow
                     );
                     var9[a(9232, 4196755917124902600L)] = Map.entry(
                        new Rp2(new int[]{a(23464, 447462671001772390L), a(7404, 1426692711017391627L)}), Dy2_2.AltLeftArrow
                     );
                     int var13 = a(28849, 6018506305423526494L);
                     int[] var10005 = new int[a(22420, 3078705852688952702L)];
                     var10005[0] = a(23464, 447462671001772390L);
                     var10005[1] = a(17263, 7054740860733782460L);
                     var10005[2] = a(4491, 1989761925970733927L);
                     var10005[3] = a(14442, 572385019924054702L);
                     var10005[4] = a(9275, 6726042016815193819L);
                     var10005[5] = a(22750, 8078548660089446970L);
                     var9[var13] = Map.entry(new Rp2(var10005), Dy2_2.AltLeftArrow);
                     int var14 = a(23860, 1059527301177272303L);
                     var10005 = new int[a(22420, 3078705852688952702L)];
                     var10005[0] = a(23464, 447462671001772390L);
                     var10005[1] = a(17263, 7054740860733782460L);
                     var10005[2] = a(20982, 4047210159191583545L);
                     var10005[3] = a(23510, 1272856817201209628L);
                     var10005[4] = a(31242, 2936110827439800548L);
                     var10005[5] = a(22750, 8078548660089446970L);
                     var9[var14] = Map.entry(new Rp2(var10005), Dy2_2.AltLeftArrow);
                     var9[a(4368, 5300139638584060880L)] = Map.entry(
                        new Rp2(new int[]{a(23464, 447462671001772390L), a(7124, 3546978297639444767L)}), Dy2_2.AltRightArrow
                     );
                     int var15 = a(25531, 5924308847184206163L);
                     var10005 = new int[a(22420, 3078705852688952702L)];
                     var10005[0] = a(23464, 447462671001772390L);
                     var10005[1] = a(17263, 7054740860733782460L);
                     var10005[2] = a(20982, 4047210159191583545L);
                     var10005[3] = a(23510, 1272856817201209628L);
                     var10005[4] = a(9275, 6726042016815193819L);
                     var10005[5] = a(6480, 2775155348326032284L);
                     var9[var15] = Map.entry(new Rp2(var10005), Dy2_2.AltRightArrow);
                     int var16 = a(8647, 4222848253348092705L);
                     var10005 = new int[a(22420, 3078705852688952702L)];
                     var10005[0] = a(23464, 447462671001772390L);
                     var10005[1] = a(17263, 7054740860733782460L);
                     var10005[2] = a(20982, 4047210159191583545L);
                     var10005[3] = a(23510, 1272856817201209628L);
                     var10005[4] = a(1942, 7630642023933001026L);
                     var10005[5] = a(6480, 2775155348326032284L);
                     var9[var16] = Map.entry(new Rp2(var10005), Dy2_2.AltRightArrow);
                     var9[a(31625, 8574968545585283400L)] = Map.entry(
                        new Rp2(new int[]{a(23464, 447462671001772390L), a(17263, 7054740860733782460L), a(27153, 4123641865963786447L)}), Dy2_2.Home
                     );
                     var9[a(15850, 8364390001957865275L)] = Map.entry(
                        new Rp2(new int[]{a(23464, 447462671001772390L), a(6653, 49255603365716778L), a(31620, 3667213166147617089L)}), Dy2_2.Home
                     );
                     var9[a(15717, 7192101454069663679L)] = Map.entry(new Rp2(new int[]{1}), Dy2_2.Home);
                     var9[a(15119, 8764101788366176716L)] = Map.entry(
                        new Rp2(new int[]{a(23464, 447462671001772390L), a(17263, 7054740860733782460L), a(27989, 374080225566873490L)}), Dy2_2.End
                     );
                     var9[a(20034, 7835377634438083747L)] = Map.entry(
                        new Rp2(new int[]{a(23464, 447462671001772390L), a(6653, 49255603365716778L), a(19542, 5005136652817495689L)}), Dy2_2.End
                     );
                     var9[a(22304, 6537311414649908677L)] = Map.entry(new Rp2(new int[]{5}), Dy2_2.End);
                     l = Map.ofEntries(var9);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var18;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Á\u0089=ê2ÏhnÖW\u00113\u0013ÉçÇ";
                  var5 = "Á\u0089=ê2ÏhnÖW\u00113\u0013ÉçÇ".length();
                  var2 = 0;
            }

            byte var11 = var2;
            var2 += 8;
            var7 = var4.substring(var11, var2).getBytes("ISO-8859-1");
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





