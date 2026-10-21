package com;

public class pG_3 extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static final pG_3 ASCII;
   public static final pG_3 BRITISH;
   public static final pG_3 DANISH;
   public static final pG_3 DEC_SPECIAL_GRAPHICS;
   public static final pG_3 DEC_SUPPLEMENTAL;
   public static final pG_3 DUTCH;
   public static final pG_3 FINNISH;
   public static final pG_3 FRENCH;
   public static final pG_3 FRENCH_CANADIAN;
   public static final pG_3 GERMAN;
   public static final pG_3 ITALIAN;
   public static final pG_3 SPANISH;
   public static final pG_3 SWEDISH;
   public static final pG_3 SWISS;
   private final int[] B;
   private static final pG_3[] v;
   private static final long[] a;
   private static final Integer[] b;

   private pG_3(int[] var3) {
      this.B = var3;
   }

   public static pG_3 T(char var0) {
      int[] var10000 = XP.j();
      pG_3[] var2 = values();
      int[] var1 = var10000;
      int var3 = var2.length;
      int var4 = 0;

      while (true) {
         if (var4 < var3) {
            pG_3 var5 = var2[var4];
            if (var1 == null) {
               var6 = var5;
               if (var1 != null) {
                  break;
               }

               if (var5.a(var0)) {
                  return var5;
               }

               var4++;
            }

            if (var1 == null) {
               continue;
            }
         }

         var6 = ASCII;
         break;
      }

      return var6;
   }

   public abstract int Q(int var1);

   private boolean a(char var1) {
      int[] var10000 = XP.j();
      int[] var3 = this.B;
      int var4 = var3.length;
      int var5 = 0;
      int[] var2 = var10000;

      while (true) {
         if (var5 < var4) {
            int var6 = var3[var5];
            if (var2 == null) {
               var7 = var6;
               if (var2 != null) {
                  break;
               }

               if (var6 == var1) {
                  return true;
               }

               var5++;
            }

            if (var2 == null) {
               continue;
            }
         }

         var7 = 0;
         break;
      }

      return (boolean)var7;
   }

   private static pG_3[] q() {
      pG_3[] var10000 = new pG_3[a(27810, 1398539271998518538L)];
      var10000[0] = ASCII;
      var10000[1] = BRITISH;
      var10000[2] = DANISH;
      var10000[3] = DEC_SPECIAL_GRAPHICS;
      var10000[4] = DEC_SUPPLEMENTAL;
      var10000[5] = DUTCH;
      var10000[a(2096, 4884989575338217873L)] = FINNISH;
      var10000[a(26420, 3446572921797590670L)] = FRENCH;
      var10000[a(22526, 6615742181234675269L)] = FRENCH_CANADIAN;
      var10000[a(31079, 6377440228195999972L)] = GERMAN;
      var10000[a(26267, 5568086236201172781L)] = ITALIAN;
      var10000[a(28324, 3686192053778986775L)] = SPANISH;
      var10000[a(9662, 5641102963996883993L)] = SWEDISH;
      var10000[a(17086, 8980027335563582208L)] = SWISS;
      return var10000;
   }

   pG_3(int[] var3, pm_4 var4) {
      this(var3);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var8 = new String[14];
      int var12 = 0;
      String var11 = "M4\u0011;}{\u0014N4\u0000)oe\u0010I8\u0002:cr\u0007K!\u000b?\u007ff\u0007Y&\u00062uf\u001d\u0005N$\u00175t\u0007Y!\u00028uf\u001d\u0010N4\u0000)o`\u0005Z=\u0006;y{\u0001K=\u0006N0\r?o}\u0006L#\u00068\u007f}\u0007H#\n\"uf\u001d\u000fL#\u00068\u007f}\nI0\r7x|\u0014D\u0007C%\u0002:ut\u001b\u0005K\"\u0000?u";
      int var13 = "M4\u0011;}{\u0014N4\u0000)oe\u0010I8\u0002:cr\u0007K!\u000b?\u007ff\u0007Y&\u00062uf\u001d\u0005N$\u00175t\u0007Y!\u00028uf\u001d\u0010N4\u0000)o`\u0005Z=\u0006;y{\u0001K=\u0006N0\r?o}\u0006L#\u00068\u007f}\u0007H#\n\"uf\u001d\u000fL#\u00068\u007f}\nI0\r7x|\u0014D\u0007C%\u0002:ut\u001b\u0005K\"\u0000?u"
         .length();
      char var10 = 6;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 64;
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
                        var65 = 74;
                        break;
                     case 1:
                        var65 = 49;
                        break;
                     case 2:
                        var65 = 3;
                        break;
                     case 3:
                        var65 = 54;
                        break;
                     case 4:
                        var65 = 124;
                        break;
                     case 5:
                        var65 = 117;
                        break;
                     default:
                        var65 = 21;
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
                     long var0 = 2587482213544743571L;
                     long[] var6 = new long[36];
                     int var3 = 0;
                     String var4 = "A³\u008bHÍ\u0012¸XÙ?I\u0097)|\u0083\u0004Ó¶\u0002ÙÆ\u0001ÀÆÉXÔ\u0090\u0004£ßÎ\u0082rXqKÈ·54¨¦9ÒK=\tjJº^\u008ev¶Þd\u0080¿\n>\u0096.\u0086\u00806ä\u0004ç\u001eg\u0097&\u0088l\räï\u0099D]ú\u0089Q\u008eMÛ!ý9ÚeI\u000eÄ\u0006w\u00827C\u0087_\u0087¯b\u0097?#¦\u0096\u0088/¹\u00970\u0001\u0088\\×\u00807=Ñ¼\u008d,Ó\u009c\u00969sIÎ\u0089KÉ\u009f\u008c -:ä¸4\n$\u0096½+r\u0017\u009e\r\u000bVM»¤å\u008f#\u0018Eò\u0091þ(ñ`\u009e¦\u009eÑÌ\u0092-ø\u0000«\u007fszí´\rß¿-\"+jË3W\fY~\b\u0080½ò\u009aa\u008e\u009c¦Û\u000fÑ\u0095@þðÀl\u001a$\u008c_£vö\\Þ©^±Ü½è\u0018ëIÌ\b\u008b\u00911´\u000fuB\u0087+©iI\u009eú\u008a{wûJÄ37\u008c¥>òj\u0096F\u0093\u0094×v\u0081S\u008e\u001e";
                     int var5 = "A³\u008bHÍ\u0012¸XÙ?I\u0097)|\u0083\u0004Ó¶\u0002ÙÆ\u0001ÀÆÉXÔ\u0090\u0004£ßÎ\u0082rXqKÈ·54¨¦9ÒK=\tjJº^\u008ev¶Þd\u0080¿\n>\u0096.\u0086\u00806ä\u0004ç\u001eg\u0097&\u0088l\räï\u0099D]ú\u0089Q\u008eMÛ!ý9ÚeI\u000eÄ\u0006w\u00827C\u0087_\u0087¯b\u0097?#¦\u0096\u0088/¹\u00970\u0001\u0088\\×\u00807=Ñ¼\u008d,Ó\u009c\u00969sIÎ\u0089KÉ\u009f\u008c -:ä¸4\n$\u0096½+r\u0017\u009e\r\u000bVM»¤å\u008f#\u0018Eò\u0091þ(ñ`\u009e¦\u009eÑÌ\u0092-ø\u0000«\u007fszí´\rß¿-\"+jË3W\fY~\b\u0080½ò\u009aa\u008e\u009c¦Û\u000fÑ\u0095@þðÀl\u001a$\u008c_£vö\\Þ©^±Ü½è\u0018ëIÌ\b\u008b\u00911´\u000fuB\u0087+©iI\u009eú\u008a{wûJÄ37\u008c¥>òj\u0096F\u0093\u0094×v\u0081S\u008e\u001e"
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
                                    b = new Integer[36];
                                    ASCII = new pm_4(new int[]{a(4998, 6881934243594881594L)});
                                    BRITISH = new pB_3(new int[]{a(23804, 8491587291358496082L)});
                                    DANISH = new pY_3(new int[]{a(13946, 1711278217780981727L), a(20232, 625546999138555555L)});
                                    DEC_SPECIAL_GRAPHICS = new pQ_3(new int[]{a(15410, 5613211770323821974L), a(2980, 710378873165009436L)});
                                    DEC_SUPPLEMENTAL = new pg_4(new int[]{a(16244, 1522404998330738377L), a(15831, 3803445391963153521L)});
                                    DUTCH = new pe_4(new int[]{a(20497, 5843302304591055272L)});
                                    FINNISH = new px_4(new int[]{a(1359, 8099832294965664974L), a(804, 6379981042474769033L)});
                                    FRENCH = new pa_4(new int[]{a(9092, 2998770495597836848L)});
                                    FRENCH_CANADIAN = new pr_4(new int[]{a(4655, 6523734664058129286L)});
                                    GERMAN = new pt_4(new int[]{a(22763, 7185362877737664836L)});
                                    ITALIAN = new pZ_3(new int[]{a(20545, 4730777149554035179L)});
                                    SPANISH = new pX_3(new int[]{a(20293, 607896596183717626L)});
                                    SWEDISH = new pS_3(new int[]{a(19391, 2474915088293171741L), a(13148, 314736753764952828L)});
                                    SWISS = new pq_4(new int[]{a(6454, 5550097528536776835L)});
                                    v = q();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "ÒÄ¨ï\u009e\u0096¼#ñàÙÆ\t\u0011r~";
                                 var5 = "ÒÄ¨ï\u009e\u0096¼#ñàÙÆ\t\u0011r~".length();
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

                  var11 = "F2\u00072\u007fl\u0017\u0005S,\u0000/e";
                  var13 = "F2\u00072\u007fl\u0017\u0005S,\u0000/e".length();
                  var10 = 7;
                  var17 = -1;
            }

            var10000 = 74;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22944;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}







