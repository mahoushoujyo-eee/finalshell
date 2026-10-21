package com.finalshell.ui.model;

import com.finalshell.core.Ub2;

public final class Dg4 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Dg4 CANFDX;
   public static Dg4 CANOVIO;
   public static Dg4 CANBRK;
   public static Dg4 CANCRY;
   public static Dg4 CANLZW;
   public static Dg4 CANFC32;
   public static Dg4 ESCCTL;
   public static Dg4 ESC8;
   public static Dg4 ZCBIN;
   public byte h;
   public static long[] a;
   public static Integer[] b;

   public static Dg4[] values() {
      return (Dg4[])U.clone();
   }

   public static Dg4 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Dg4(String var1, int var2, char var3) {
      this.h = (byte)var3;
   }

   public Dg4(String var1, int var2, int var3) {
      this.h = (byte)var3;
   }

   public Dg4(String var1, int var2, byte var3) {
      this.h = var3;
   }

   public byte L() {
      return this.h;
   }

   public static byte f(Dg4[] var0) {
      String[] var10000 = Ub2.A();
      byte var2 = 0;
      String[] var1 = var10000;
      Dg4[] var3 = var0;
      int var4 = var0.length;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            Dg4 var6 = var3[var5];
            var7 = (byte)(var2 | var6.L());
            if (var1 != null) {
               break;
            }

            var2 = var7;
            var5++;
            if (var1 == null) {
      byte var7;
      byte var7;
               continue;
            }
         }

         var7 = var2;
         break;
      }

      return var7;
   }

   public static Dg4 C(byte var0) {
      String[] var10000 = Ub2.A();
      Dg4[] var2 = values();
      int var3 = var2.length;
      String[] var1 = var10000;
      int var4 = 0;

      while (var4 < var3) {
         Dg4 var5 = var2[var4];
         if (var1 == null) {
            if (var5.L() == var0) {
               return var5;
            }

            var4++;
         }

         if (var1 != null) {
            break;
         }
      }

      return null;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20833;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var8 = new String[9];
      int var12 = 0;
      String var11 = "UMWhq_\u0006S_ZiwX\u0006S_ZhwJ\u0006S_Zg\u007fD\u0004UMW\u0013\u0007S_ZdsZU\u0006S_ZmaK";
      int var13 = "UMWhq_\u0006S_ZiwX\u0006S_ZhwJ\u0006S_Zg\u007fD\u0004UMW\u0013\u0007S_ZdsZU\u0006S_ZmaK".length();
      char var10 = 6;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 115;
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
                        var65 = 99;
                        break;
                     case 1:
                        var65 = 109;
                        break;
                     case 2:
                        var65 = 103;
                        break;
                     case 3:
                        var65 = 88;
                        break;
                     case 4:
                        var65 = 86;
                        break;
                     case 5:
                        var65 = 96;
                        break;
                     default:
                        var65 = 105;
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
                     long var0 = 7927325533045500647L;
                     long[] var6 = new long[11];
                     int var3 = 0;
                     String var4 = "\u0006\u009981Y²Õ¢\u0083õâ\u0006åv\u0095\u009aá|$\u0092Û/\u0097ìàÌ\u0091Åu})\u0019©\u0082\u009dìÚ¨\u001e§³óÆU,=Æ8|Óg¹©\u0003zÑ§<ñ\u0096\u0093VÉßÈ::84ªe\u000e";
                     int var5 = "\u0006\u009981Y²Õ¢\u0083õâ\u0006åv\u0095\u009aá|$\u0092Û/\u0097ìàÌ\u0091Åu})\u0019©\u0082\u009dìÚ¨\u001e§³óÆU,=Æ8|Óg¹©\u0003zÑ§<ñ\u0096\u0093VÉßÈ::84ªe\u000e"
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
                                    CANFDX = new Dg4(var8[6], 0, 1);
                                    CANOVIO = new Dg4(var8[5], 1, 2);
                                    CANBRK = new Dg4(var8[1], 2, 4);
                                    CANCRY = new Dg4(var8[2], 3, a(21140, 1658554896753001462L));
                                    CANLZW = new Dg4(var8[3], 4, a(12878, 7826776390620504872L));
                                    CANFC32 = new Dg4(var8[8], 5, a(27720, 2691754589121690923L));
                                    ESCCTL = new Dg4(var8[0], a(343, 6309691606388494384L), a(26105, 6396440997664404625L));
                                    ESC8 = new Dg4(var8[4], a(25890, 8944244644349719623L), a(11940, 4930570654370856901L));
                                    ZCBIN = new Dg4(var8[7], a(15795, 850484048738544855L), 1);
                                    U = z();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "IÉzÑÄ\u0087\u009e6÷îf/©@²\"";
                                 var5 = "IÉzÑÄ\u0087\u009e6÷îf/©@²\"".length();
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

                  var11 = "\u0018\u000f\u000409\u0007\u0001\r\b?4rz";
                  var13 = "\u0018\u000f\u000409\u0007\u0001\r\b?4rz".length();
                  var10 = 5;
                  var17 = -1;
            }

            var10000 = 33;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }
}








