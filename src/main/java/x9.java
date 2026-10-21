public enum x9 {
   ZPAD, ZDLE, ZDLEE, ZBIN, ZHEX, ZBIN32, ZCRCE, ZCRCG, ZCRCQ, ZCRCW, ZRUB0, ZRUB1, ZRQINIT, ZRINIT, ZSINIT, ZACK, ZFILE, ZSKIP, ZNAK, ZABORT, ZFIN, ZRPOS, ZDATA, ZEOF, ZFERR, ZCRC, ZCHALLENGE, ZCOMPL, ZCAN, ZFREECNT, ZCOMMAND, ZSTDERR;
   private byte e;
   private static final long[] a;
   private static final Integer[] b;

   private x9(char var3) {
      this.e = (byte)var3;
   }

   private x9(int var3) {
      this.e = (byte)var3;
   }

   private x9(byte var3) {
      this.e = var3;
   }

   public byte r() {
      return this.e;
   }

   public static x9 X(byte var0) {
      String[] var10000 = Ub_2.A();
      x9[] var2 = values();
      int var3 = var2.length;
      int var4 = 0;
      String[] var1 = var10000;

      while (var4 < var3) {
         x9 var5 = var2[var4];
         if (var1 == null) {
            if (var5.r() == var0) {
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var8 = new String[32];
      int var12 = 0;
      String var11 = "Ya;#\u0007Yc+.\u0002FB\u0005Yr($\u000b\u0004Yr($\u0004Yr;)\u0005Yb1.\u001c\u0005Yu6\"\t\u0004Yt5!\u0004Yw3)\u0006Yr5*\u001cC\u0006Yb3)\u0005[\u0005Yr($\u001b\u0005Yu;3\r\u0005Yw3+\t\u0005Yr($\t\u0004Yy??\u0005Yc/%}\bYr5*\u0001NXG\u0007Yb.#\t]D\u0004Yp9,\u0006Yc3)\u0005[\bYw(\"\tLXW\u0004Yu6\"\u0006Ys3)\u007f=\u0005Yr($\u001d\nYr2&\u0000CSMv?\u0005Yc/%|\u0005Yc*(\u001f\u0006Yp8(\u001e[\u0004Ys3)";
      int var13 = "Ya;#\u0007Yc+.\u0002FB\u0005Yr($\u000b\u0004Yr($\u0004Yr;)\u0005Yb1.\u001c\u0005Yu6\"\t\u0004Yt5!\u0004Yw3)\u0006Yr5*\u001cC\u0006Yb3)\u0005[\u0005Yr($\u001b\u0005Yu;3\r\u0005Yw3+\t\u0005Yr($\t\u0004Yy??\u0005Yc/%}\bYr5*\u0001NXG\u0007Yb.#\t]D\u0004Yp9,\u0006Yc3)\u0005[\bYw(\"\tLXW\u0004Yu6\"\u0006Ys3)\u007f=\u0005Yr($\u001d\nYr2&\u0000CSMv?\u0005Yc/%|\u0005Yc*(\u001f\u0006Yp8(\u001e[\u0004Ys3)"
         .length();
      char var10 = 4;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 65;
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
                        var65 = 66;
                        break;
                     case 1:
                        var65 = 112;
                        break;
                     case 2:
                        var65 = 59;
                        break;
                     case 3:
                        var65 = 38;
                        break;
                     case 4:
                        var65 = 13;
                        break;
                     case 5:
                        var65 = 78;
                        break;
                     default:
                        var65 = 87;
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
                     long var0 = 4695532889504775890L;
                     long[] var6 = new long[64];
                     int var3 = 0;
                     String var4 = "\u009dÚÁ\u009e\u000f\u00149ñE\u001d+\u0005»#-\u0017¢ð.>¥Â.\fÏÈ)®\"\u0004¢\u0080|\u0010i\u001fÉjÏÀüóµæ\u0083/.\u0006t?,ýË\u0001ü\u000fÇ2:\u009aK}Æ\u0091\u0082\u0086Nâa°\u00ad\u0018Ùú\u0082PmÌ\u0092\u008d¶4¼Är~/\u000eÖ±HY?D\u0086ú~$ðNQ ;GÂ\u0011ªðë\u0004\u0000ÿ´/ÖÆ\u00adsU\u009cMÖN\u0003ÿé°\u00adg\u009bÖ¦Î\u0088uý[\u001cL\u0093ï÷ÞêÙï\u001f5ªEî_p\u0010tñËî«¬å;JI»óg\u0003ª\u0099ÒVdM8×TûYyÌÆ\u009aÉº\u0089ª\f\u001e¾N\u0006\u0089ßdNk\u009c\u009c\u007f\u0015¤.y.Ä\u0012Ó_}\u0014J^~)ù\u0003\t»·`êÂ\"\u0005³N\u0095\u0015\u0013\u0097qN»+`%MªV\u0095G®\u0096á\u0011.EQÚog\u009c]\u0080|D\u0081÷¾ùý#\u008ft}ßÆSÒ\u0016\u0084\u0080Ñ\u0011§kg24]Ô¿°k\u0085CM\u0084\u009d/'ÜU3ÆãWî/ý@I\"A»øbsx2,àu×\u0098B\u0004\u0089c;\u0005+l _.]åý\u008d\u0011T5\"N\u0083cå1Ïa\u0095þ»pÝIQ\\&HÔå\u001e;%ø\u0018\u00ad\u0097*E\u0000xG¸Y9Ò\u008bÎ\"p;;\u009f\u007fN\u0005ÔQf>\u0088ù\b\u0007\u001fä\u0014º)#i(\tê¡\u0084ÈM(º\u0099µ55\u0092\u0097\u0005ÉsZ\u0089ps\u0015ÛCª\u0086Ï\u0087± ¤ D\u0084\t ×ÌxeôðÚ^ç±\"\u0016\u0003*eÞÇ\u000eç\u001ax¹\u001csS¹\u0006þ}½ôZÙ à\u0006\u0016\u001eüJ nÌ\u0099\u0085k\u000fHÕ<\u008e`»\u0015[Þü\u0003º_èE\u0012\u0015";
                     int var5 = "\u009dÚÁ\u009e\u000f\u00149ñE\u001d+\u0005»#-\u0017¢ð.>¥Â.\fÏÈ)®\"\u0004¢\u0080|\u0010i\u001fÉjÏÀüóµæ\u0083/.\u0006t?,ýË\u0001ü\u000fÇ2:\u009aK}Æ\u0091\u0082\u0086Nâa°\u00ad\u0018Ùú\u0082PmÌ\u0092\u008d¶4¼Är~/\u000eÖ±HY?D\u0086ú~$ðNQ ;GÂ\u0011ªðë\u0004\u0000ÿ´/ÖÆ\u00adsU\u009cMÖN\u0003ÿé°\u00adg\u009bÖ¦Î\u0088uý[\u001cL\u0093ï÷ÞêÙï\u001f5ªEî_p\u0010tñËî«¬å;JI»óg\u0003ª\u0099ÒVdM8×TûYyÌÆ\u009aÉº\u0089ª\f\u001e¾N\u0006\u0089ßdNk\u009c\u009c\u007f\u0015¤.y.Ä\u0012Ó_}\u0014J^~)ù\u0003\t»·`êÂ\"\u0005³N\u0095\u0015\u0013\u0097qN»+`%MªV\u0095G®\u0096á\u0011.EQÚog\u009c]\u0080|D\u0081÷¾ùý#\u008ft}ßÆSÒ\u0016\u0084\u0080Ñ\u0011§kg24]Ô¿°k\u0085CM\u0084\u009d/'ÜU3ÆãWî/ý@I\"A»øbsx2,àu×\u0098B\u0004\u0089c;\u0005+l _.]åý\u008d\u0011T5\"N\u0083cå1Ïa\u0095þ»pÝIQ\\&HÔå\u001e;%ø\u0018\u00ad\u0097*E\u0000xG¸Y9Ò\u008bÎ\"p;;\u009f\u007fN\u0005ÔQf>\u0088ù\b\u0007\u001fä\u0014º)#i(\tê¡\u0084ÈM(º\u0099µ55\u0092\u0097\u0005ÉsZ\u0089ps\u0015ÛCª\u0086Ï\u0087± ¤ D\u0084\t ×ÌxeôðÚ^ç±\"\u0016\u0003*eÞÇ\u000eç\u001ax¹\u001csS¹\u0006þ}½ôZÙ à\u0006\u0016\u001eüJ nÌ\u0099\u0085k\u000fHÕ<\u008e`»\u0015[Þü\u0003º_èE\u0012\u0015"
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
                                    b = new Integer[64];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "d\u001donÖö+ÅÒøÀÇ¨\u009c8c";
                                 var5 = "d\u001donÖö+ÅÒøÀÇ¨\u009c8c".length();
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

                  var11 = "\f*ny\u0005\f\"j`K";
                  var13 = "\f*ny\u0005\f\"j`K".length();
                  var10 = 4;
                  var17 = -1;
            }

            var10000 = 20;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15479;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}






