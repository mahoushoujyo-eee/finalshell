package com.finalshell.ui.model;

public final class KD3 extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static KD3 SOH;
   public static KD3 STX;
   public static KD3 EOT;
   public static KD3 ENQ;
   public static KD3 ACK;
   public static KD3 BS;
   public static KD3 LF;
   public static KD3 CR;
   public static KD3 XON;
   public static KD3 XOFF;
   public static KD3 NAK;
   public static KD3 CAN;
   public byte u;
   public static long[] a;
   public static Integer[] b;

   public static KD3[] values() {
      return (KD3[])A.clone();
   }

   public static KD3 valueOf(String var0) {
      return Enum.valueOf(KD3.class, var0);
   }

   public KD3(String var1, int var2, byte var3) {
      super(var1, var2);
      this.u = var3;
   }

   public byte m$byte() {
      return this.u;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22044;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var8 = new String[12];
      int var12 = 0;
      String var11 = "NK\"\u0002AL\u0003HD=\u0003^E$\u0003^^4\u0002NX\u0003HE8\u0003UE\"\u0003LI'\u0003CK'";
      int var13 = "NK\"\u0002AL\u0003HD=\u0003^E$\u0003^^4\u0002NX\u0003HE8\u0003UE\"\u0003LI'\u0003CK'".length();
      char var10 = 3;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 50;
         String var10001 = var11.substring(++var17, var17 + var10);
         byte var10002 = -1;

         while (true) {
      char[] var33;
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
                        var65 = 63;
                        break;
                     case 1:
                        var65 = 56;
                        break;
                     case 2:
                        var65 = 94;
                        break;
                     case 3:
                        var65 = 50;
                        break;
                     case 4:
                        var65 = 80;
                        break;
                     case 5:
                        var65 = 5;
                        break;
                     default:
                        var65 = 1;
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
                     long var0 = 7521506930921860729L;
                     long[] var6 = new long[18];
                     int var3 = 0;
                     String var4 = "\b¿Å\u0012ÕÿhqüÉØ\u0004!PØ\u000eâÿ\nÔÀ¤aõF\u000b@øQñJJTéù\u0096\u009as`àô\u0019@4DÈQÁÝ/\u0098¶MªÌö\u0090aÈû6à{\u0006w{\u001fäÛ\u0005Í\u008fpì\u00adÿYÒAS\u0001¬¶¦d¦A\u0086ÜÑRÕbÚø\u001e»]ÈQ\u0082.\u0099¿í§\u0011\u008f\u008fO \u0007)V\u0099p°û\u001cMñê=zò\u0091\nå";
                     int var5 = "\b¿Å\u0012ÕÿhqüÉØ\u0004!PØ\u000eâÿ\nÔÀ¤aõF\u000b@øQñJJTéù\u0096\u009as`àô\u0019@4DÈQÁÝ/\u0098¶MªÌö\u0090aÈû6à{\u0006w{\u001fäÛ\u0005Í\u008fpì\u00adÿYÒAS\u0001¬¶¦d¦A\u0086ÜÑRÕbÚø\u001e»]ÈQ\u0082.\u0099¿í§\u0011\u008f\u008fO \u0007)V\u0099p°û\u001cMñê=zò\u0091\nå"
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
                                    b = new Integer[18];
                                    SOH = new KD3(var8[3], 0, (byte)1);
                                    STX = new KD3(var8[4], 1, (byte)2);
                                    EOT = new KD3(var8[6], 2, (byte)4);
                                    ENQ = new KD3(var8[2], 3, (byte)5);
                                    ACK = new KD3(var8[8], 4, (byte)a(20498, 2236288316708423182L));
                                    BS = new KD3(var8[10], 5, (byte)a(28995, 275899949373728590L));
                                    LF = new KD3(var8[1], a(20498, 2236288316708423182L), (byte)a(12933, 6603803261959758998L));
                                    CR = new KD3(var8[5], a(22933, 5045187093032603531L), (byte)a(31204, 5325211987382775794L));
                                    XON = new KD3(var8[7], a(28995, 275899949373728590L), (byte)a(8647, 6301345748379432919L));
                                    XOFF = new KD3(var8[11], a(24675, 6965249811602519678L), (byte)a(16483, 8748433903043647092L));
                                    NAK = new KD3(var8[9], a(12933, 6603803261959758998L), (byte)a(17265, 2956618845392737642L));
                                    CAN = new KD3(var8[0], a(30185, 3127363192862909437L), (byte)a(22681, 1215222004061245057L));
                                    A = m$arrkD_3();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "@|\u009eo«¥Í»\u0086uÅ¼2ÄI?";
                                 var5 = "@|\u009eo«¥Í»\u0086uÅ¼2ÄI?".length();
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

                  var11 = "cu\u0004yi\u0006j";
                  var13 = "cu\u0004yi\u0006j".length();
                  var10 = 2;
                  var17 = -1;
            }

            var10000 = 30;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }
}







