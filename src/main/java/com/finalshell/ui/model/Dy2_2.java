package com.finalshell.ui.model;

public final class Dy2_2 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Dy2_2 Character;
   public static Dy2_2 Backspace;
   public static Dy2_2 AltBackspace;
   public static Dy2_2 LeftArrow;
   public static Dy2_2 RightArrow;
   public static Dy2_2 AltLeftArrow;
   public static Dy2_2 AltRightArrow;
   public static Dy2_2 Delete;
   public static Dy2_2 Home;
   public static Dy2_2 End;
   public static Dy2_2 Unknown;
   public static Dy2_2[] r;
   public static long[] a;
   public static Integer[] b;

   public static Dy2_2[] values() {
      return (Dy2_2[])r.clone();
   }

   public static Dy2_2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Dy2_2(String var1, int var2) {
   }

   public static Dy2_2[] a() {
      Dy2_2[] var10000 = new Dy2_2[a(4980, 5032447088388625154L)];
      var10000[0] = Character;
      var10000[1] = Backspace;
      var10000[2] = AltBackspace;
      var10000[3] = LeftArrow;
      var10000[4] = RightArrow;
      var10000[5] = AltLeftArrow;
      var10000[a(4768, 6866963138646758101L)] = AltRightArrow;
      var10000[a(23614, 911104205695327297L)] = Delete;
      var10000[a(9848, 4002453550734861826L)] = Home;
      var10000[a(18504, 5227934465354598448L)] = End;
      var10000[a(6799, 4325365779957177074L)] = Unknown;
      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16511;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var8 = new String[11];
      int var12 = 0;
      String var11 = "V\u0019\u0007@K{\u0003\u0003F\u0019\b\fB\u001b\u0018bAj\u0019B\u0005\u001eAS\nQ\u001e\u000bFPM\u001fq\u0018\u001b\tA\u0016\u000fEW|\f`\u0012\rB\u001b\u0018|Mk\u0005w6\u001e\\K{\tO\u0012\nZe~\u001fl\u0000\u0006G\u0012\u0000KPi\t@\u001f\r\\Eo\u0019f\u0005";
      int var13 = "V\u0019\u0007@K{\u0003\u0003F\u0019\b\fB\u001b\u0018bAj\u0019B\u0005\u001eAS\nQ\u001e\u000bFPM\u001fq\u0018\u001b\tA\u0016\u000fEW|\f`\u0012\rB\u001b\u0018|Mk\u0005w6\u001e\\K{\tO\u0012\nZe~\u001fl\u0000\u0006G\u0012\u0000KPi\t@\u001f\r\\Eo\u0019f\u0005"
         .length();
      char var10 = 7;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 61;
         String var10001 = var11.substring(++var17, var17 + var10);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 62;
                        break;
                     case 1:
                        var65 = 74;
                        break;
                     case 2:
                        var65 = 81;
                        break;
                     case 3:
                        var65 = 19;
                        break;
                     case 4:
                        var65 = 25;
                        break;
                     case 5:
                        var65 = 49;
                        break;
                     default:
                        var65 = 80;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var8[var12++] = var44;
                  if ((var17 += var10) >= var13) {
                     long var0 = 9069667028154136505L;
                     long[] var6 = new long[11];
                     int var3 = 0;
                     String var4 = "üw\u0089\rAæ«ÿ(L\u0087\u0097\u0084ßÖþ\u0095\u0003\u0090ÀqÉmAÌîæÍÈ³[\u0086+y6ÑÂ]\u0081O\u009d\u008e\u008dg\u008d¾Q³¦tØ\u001f'\u0095sõÁ7\u0016\u0018hH¿\u0080/Á\u0084K\u0088!ÌÅ";
                     int var5 = "üw\u0089\rAæ«ÿ(L\u0087\u0097\u0084ßÖþ\u0095\u0003\u0090ÀqÉmAÌîæÍÈ³[\u0086+y6ÑÂ]\u0081O\u009d\u008e\u008dg\u008d¾Q³¦tØ\u001f'\u0095sõÁ7\u0016\u0018hH¿\u0080/Á\u0084K\u0088!ÌÅ"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    a = var6;
                                    b = new Integer[11];
                                    Character = new Dy2_2(var8[8], 0);
                                    Backspace = new Dy2_2(var8[4], 1);
                                    AltBackspace = new Dy2_2(var8[9], 2);
                                    LeftArrow = new Dy2_2(var8[6], 3);
                                    RightArrow = new Dy2_2(var8[3], 4);
                                    AltLeftArrow = new Dy2_2(var8[2], 5);
                                    AltRightArrow = new Dy2_2(var8[5], a(8511, 8728300121867739457L));
                                    Delete = new Dy2_2(var8[7], a(15116, 2518410816635730811L));
                                    Home = new Dy2_2(var8[10], a(1085, 3027134129354720324L));
                                    End = new Dy2_2(var8[1], a(30340, 5527688511927269119L));
                                    Unknown = new Dy2_2(var8[0], a(11337, 2152903463682468917L));
                                    r = a();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "#q4ÆZid°ù)\u0003\u001f`\u008eåj";
                                 var5 = "#q4ÆZid°ù)\u0003\u001f`\u008eåj".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var8[var12++] = var44;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label70;
                  }

                  var11 = "Y\u0000\u0003w^t\u001dk\u001c\u0016VZ\u0004P\u0003\u001aP";
                  var13 = "Y\u0000\u0003w^t\u001dk\u001c\u0016VZ\u0004P\u0003\u001aP".length();
                  var10 = '\f';
                  var17 = -1;
            }

            var10000 = 38;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }
}







