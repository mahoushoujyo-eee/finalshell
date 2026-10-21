package com.finalshell.core;

import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.text.DecimalFormat;

public class DO3_2 {
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static HttpURLConnection T(String param0) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/CN3.B ()Z
      // 03: new java/net/URL
      // 06: dup
      // 07: aload 0
      // 08: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 0b: astore 2
      // 0c: istore 1
      // 0d: aconst_null
      // 0e: astore 3
      // 0f: aload 0
      // 10: sipush 11864
      // 13: sipush 13101
      // 16: invokestatic com/finalshell/core/DO3_2.a (II)Ljava/lang/String;
      // 19: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1c: iload 1
      // 1d: ifne 42
      // 20: ifeq 35
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/DO3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 2
      // 2b: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 2e: checkcast java/net/HttpURLConnection
      // 31: astore 3
      // 32: goto 5d
      // 35: aload 0
      // 36: sipush 11866
      // 39: sipush 16089
      // 3c: invokestatic com/finalshell/core/DO3_2.a (II)Ljava/lang/String;
      // 3f: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 42: ifeq 5d
      // 45: aload 2
      // 46: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 49: checkcast javax/net/ssl/HttpsURLConnection
      // 4c: astore 4
      // 4e: aload 4
      // 50: new com/finalshell/core/YF
      // 53: dup
      // 54: invokespecial com/finalshell/core/YF.<init> ()V
      // 57: invokevirtual javax/net/ssl/HttpsURLConnection.setHostnameVerifier (Ljavax/net/ssl/HostnameVerifier;)V
      // 5a: aload 4
      // 5c: astore 3
      // 5d: aload 3
      // 5e: iload 1
      // 5f: ifne aa
      // 62: ifnull a9
      // 65: goto 6c
      // 68: invokestatic com/finalshell/core/DO3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: aload 3
      // 6d: sipush 24576
      // 70: ldc2_w 5376184224152696828
      // 73: invokestatic com/finalshell/core/DO3_2.a (IJ)I
      // 76: invokevirtual java/net/HttpURLConnection.setConnectTimeout (I)V
      // 79: aload 3
      // 7a: sipush 12518
      // 7d: ldc2_w 8105396525257418511
      // 80: invokestatic com/finalshell/core/DO3_2.a (IJ)I
      // 83: invokevirtual java/net/HttpURLConnection.setReadTimeout (I)V
      // 86: aload 3
      // 87: sipush 11870
      // 8a: sipush -31926
      // 8d: invokestatic com/finalshell/core/DO3_2.a (II)Ljava/lang/String;
      // 90: invokevirtual java/net/HttpURLConnection.setRequestMethod (Ljava/lang/String;)V
      // 93: aload 3
      // 94: bipush 1
      // 95: invokevirtual java/net/HttpURLConnection.setDoInput (Z)V
      // 98: aload 3
      // 99: bipush 1
      // 9a: invokevirtual java/net/HttpURLConnection.setDoOutput (Z)V
      // 9d: aload 3
      // 9e: bipush 0
      // 9f: invokevirtual java/net/HttpURLConnection.setUseCaches (Z)V
      // a2: goto a9
      // a5: invokestatic com/finalshell/core/DO3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a8: athrow
      // a9: aload 3
      // aa: areturn
   }

   public static String b(String var0) {
      byte[] var1 = var0.getBytes();
      return c(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static String c(byte[] var0) {
      boolean var10001 = CN3.B();
      String var2 = null;
      boolean var1 = var10001;
      char[] var10000 = new char[a(15789, 6040534281061198409L)];
      var10000[0] = (char)a(15683, 8951421809937738400L);
      var10000[1] = (char)a(19659, 4386777348184480556L);
      var10000[2] = (char)a(24557, 4216862108515469340L);
      var10000[3] = (char)a(26291, 6719713232588157255L);
      var10000[4] = (char)a(23758, 5359558343850855214L);
      var10000[5] = (char)a(21847, 7774227852064817837L);
      var10000[a(10051, 5208862579186004134L)] = (char)a(12861, 6716613985420436942L);
      var10000[a(23390, 4171595423746919601L)] = (char)a(27654, 5037125346503867360L);
      var10000[a(1223, 8432283798605288250L)] = (char)a(6386, 4738186108210466562L);
      var10000[a(29116, 7401455165348423241L)] = (char)a(22699, 2400634459981516609L);
      var10000[a(2564, 4536660657965915626L)] = (char)a(14117, 4376868301232922835L);
      var10000[a(31975, 7933657754591505162L)] = (char)a(28388, 5705934257814878469L);
      var10000[a(8739, 4831962584196019656L)] = (char)a(12736, 8601963166385956408L);
      var10000[a(11396, 488388192950188925L)] = (char)a(25234, 2816442537607673193L);
      var10000[a(20006, 7374440824976087512L)] = (char)a(7578, 1687349146487605869L);
      var10000[a(5570, 65313158950011438L)] = (char)a(24364, 5182129379999385796L);
      char[] var3 = var10000;

      try {
         MessageDigest var4 = MessageDigest.getInstance(a(11867, -13245));
         var4.update(var0);
         byte[] var5 = var4.digest();
         char[] var6 = new char[a(32000, 7929404820382198527L)];
         int var7 = 0;
         int var8 = 0;
         if (var1 || var8 < a(31862, 7308920878905666452L)) {
            do {
               byte var9 = var5[var8];
               var6[var7++] = var3[var9 >>> 4 & a(6976, 977564145535241394L)];
               var6[var7++] = var3[var9 & a(6976, 977564145535241394L)];
            } while (++var8 < a(31862, 7308920878905666452L));
         }

         var2 = new String(var6);
      } catch (Exception var10) {
         var10.printStackTrace();
      }

      return var2;
   }

   public static String h(long var0) {
      boolean var2 = CN3.B();
      long var6;
      int var10000 = (var6 = var0 - 0L) == 0L ? 0 : (var6 < 0L ? -1 : 1);
      if (!var2) {
         if (var10000 <= 0) {
            return "0";
         }

         var10000 = 5;
      }

      String[] var5 = new String[var10000];
      var5[0] = "B";
      var5[1] = a(11869, 23858);
      var5[2] = a(11871, -14382);
      var5[3] = a(11868, 29167);
      var5[4] = a(11857, 10165);
      String[] var3 = var5;
      int var4 = (int)(Math.log10((double)var0) / Math.log10(1024.0));
      return new DecimalFormat(a(11865, 3373)).format((double)var0 / Math.pow(1024.0, (double)var4)) + " " + var3[var4];
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 11865) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 5;
            case 1 -> 89;
            case 2 -> 32;
            case 3 -> 175;
            case 4 -> 109;
            case 5 -> 100;
            case 6 -> 22;
            case 7 -> 255;
            case 8 -> 160;
            case 9 -> 221;
            case 10 -> 252;
            case 11 -> 254;
            case 12 -> 93;
            case 13 -> 27;
            case 14 -> 177;
            case 15 -> 125;
            case 16 -> 250;
            case 17 -> 8;
            case 18 -> 49;
            case 19 -> 228;
            case 20 -> 117;
            case 21 -> 3;
            case 22 -> 187;
            case 23 -> 44;
            case 24 -> 119;
            case 25 -> 114;
            case 26 -> 198;
            case 27 -> 73;
            case 28 -> 127;
            case 29 -> 71;
            case 30 -> 234;
            case 31 -> 23;
            case 32 -> 2;
            case 33 -> 131;
            case 34 -> 216;
            case 35 -> 232;
            case 36 -> 10;
            case 37 -> 70;
            case 38 -> 53;
            case 39 -> 46;
            case 40 -> 151;
            case 41 -> 200;
            case 42 -> 130;
            case 43 -> 83;
            case 44 -> 47;
            case 45 -> 190;
            case 46 -> 59;
            case 47 -> 129;
            case 48 -> 212;
            case 49 -> 61;
            case 50 -> 205;
            case 51 -> 66;
            case 52 -> 88;
            case 53 -> 166;
            case 54 -> 122;
            case 55 -> 173;
            case 56 -> 48;
            case 57 -> 124;
            case 58 -> 176;
            case 59 -> 103;
            case 60 -> 161;
            case 61 -> 136;
            case 62 -> 155;
            case 63 -> 128;
            case 64 -> 207;
            case 65 -> 57;
            case 66 -> 162;
            case 67 -> 38;
            case 68 -> 150;
            case 69 -> 204;
            case 70 -> 235;
            case 71 -> 226;
            case 72 -> 169;
            case 73 -> 194;
            case 74 -> 62;
            case 75 -> 229;
            case 76 -> 181;
            case 77 -> 149;
            case 78 -> 192;
            case 79 -> 112;
            case 80 -> 210;
            case 81 -> 1;
            case 82 -> 111;
            case 83 -> 84;
            case 84 -> 63;
            case 85 -> 82;
            case 86 -> 45;
            case 87 -> 184;
            case 88 -> 183;
            case 89 -> 6;
            case 90 -> 29;
            case 91 -> 145;
            case 92 -> 78;
            case 93 -> 225;
            case 94 -> 243;
            case 95 -> 60;
            case 96 -> 68;
            case 97 -> 104;
            case 98 -> 11;
            case 99 -> 202;
            case 100 -> 165;
            case 101 -> 244;
            case 102 -> 37;
            case 103 -> 193;
            case 104 -> 236;
            case 105 -> 12;
            case 106 -> 168;
            case 107 -> 239;
            case 108 -> 105;
            case 109 -> 106;
            case 110 -> 75;
            case 111 -> 217;
            case 112 -> 247;
            case 113 -> 19;
            case 114 -> 35;
            case 115 -> 223;
            case 116 -> 206;
            case 117 -> 215;
            case 118 -> 133;
            case 119 -> 99;
            case 120 -> 180;
            case 121 -> 55;
            case 122 -> 34;
            case 123 -> 31;
            case 124 -> 64;
            case 125 -> 209;
            case 126 -> 30;
            case 127 -> 118;
            case 128 -> 21;
            case 129 -> 147;
            case 130 -> 91;
            case 131 -> 79;
            case 132 -> 81;
            case 133 -> 245;
            case 134 -> 199;
            case 135 -> 123;
            case 136 -> 115;
            case 137 -> 101;
            case 138 -> 146;
            case 139 -> 208;
            case 140 -> 222;
            case 141 -> 186;
            case 142 -> 164;
            case 143 -> 110;
            case 144 -> 67;
            case 145 -> 137;
            case 146 -> 43;
            case 147 -> 33;
            case 148 -> 191;
            case 149 -> 195;
            case 150 -> 39;
            case 151 -> 246;
            case 152 -> 72;
            case 153 -> 201;
            case 154 -> 54;
            case 155 -> 142;
            case 156 -> 189;
            case 157 -> 113;
            case 158 -> 126;
            case 159 -> 51;
            case 160 -> 26;
            case 161 -> 172;
            case 162 -> 238;
            case 163 -> 197;
            case 164 -> 140;
            case 165 -> 153;
            case 166 -> 233;
            case 167 -> 76;
            case 168 -> 242;
            case 169 -> 108;
            case 170 -> 154;
            case 171 -> 74;
            case 172 -> 7;
            case 173 -> 213;
            case 174 -> 28;
            case 175 -> 121;
            case 176 -> 253;
            case 177 -> 96;
            case 178 -> 24;
            case 179 -> 0;
            case 180 -> 36;
            case 181 -> 120;
            case 182 -> 40;
            case 183 -> 15;
            case 184 -> 95;
            case 185 -> 16;
            case 186 -> 132;
            case 187 -> 171;
            case 188 -> 152;
            case 189 -> 241;
            case 190 -> 158;
            case 191 -> 156;
            case 192 -> 90;
            case 193 -> 174;
            case 194 -> 102;
            case 195 -> 92;
            case 196 -> 224;
            case 197 -> 85;
            case 198 -> 80;
            case 199 -> 144;
            case 200 -> 25;
            case 201 -> 97;
            case 202 -> 107;
            case 203 -> 231;
            case 204 -> 134;
            case 205 -> 203;
            case 206 -> 170;
            case 207 -> 185;
            case 208 -> 219;
            case 209 -> 227;
            case 210 -> 182;
            case 211 -> 18;
            case 212 -> 17;
            case 213 -> 50;
            case 214 -> 214;
            case 215 -> 141;
            case 216 -> 135;
            case 217 -> 249;
            case 218 -> 211;
            case 219 -> 69;
            case 220 -> 139;
            case 221 -> 196;
            case 222 -> 157;
            case 223 -> 148;
            case 224 -> 65;
            case 225 -> 143;
            case 226 -> 251;
            case 227 -> 52;
            case 228 -> 14;
            case 229 -> 163;
            case 230 -> 237;
            case 231 -> 179;
            case 232 -> 4;
            case 233 -> 167;
            case 234 -> 178;
            case 235 -> 218;
            case 236 -> 220;
            case 237 -> 86;
            case 238 -> 58;
            case 239 -> 116;
            case 240 -> 13;
            case 241 -> 248;
            case 242 -> 20;
            case 243 -> 188;
            case 244 -> 87;
            case 245 -> 9;
            case 246 -> 41;
            case 247 -> 56;
            case 248 -> 230;
            case 249 -> 159;
            case 250 -> 42;
            case 251 -> 77;
            case 252 -> 98;
            case 253 -> 138;
            case 254 -> 240;
            default -> 94;
         };
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22522;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[9];
      int var11 = 0;
      String var10 = "<xÖÓ>$î\u0007àÑ8æTºä\u0003Cö\u008c\bMÇ\u008d$«÷{k\u00029F\u0002Añ\u0002\u001e/";
      int var12 = "<xÖÓ>$î\u0007àÑ8æTºä\u0003Cö\u008c\bMÇ\u008d$«÷{k\u00029F\u0002Añ\u0002\u001e/".length();
      char var9 = 7;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 83;
         String var10001 = var10.substring(++var17, var17 + var9);
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
                  var55[var10006] = (char)(var55[var10006] ^ var49 ^ switch (var14 % 7) {
                     case 0 -> 26;
                     case 1 -> 49;
                     case 2 -> 79;
                     case 3 -> 73;
                     case 4 -> 67;
                     case 5 -> 39;
                     default -> 109;
                  });
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
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[9];
                     long var0 = 7077223893917426076L;
                     long[] var6 = new long[32];
                     int var3 = 0;
                     String var4 = "¯5\u001fO5\u009fc\u0004Äÿõ\u001dX½T\u0091®û\u0000³7·\u0007Çâ \u008e÷Ñ\u0090\u009aì\u009b\\f¬]\fxJ\u0098ä¼\u008b\u009füKC³×ÊüÏtñpn¿s\u0088Íü²®-ên\u0080·\u0013\u00ad!ÍÒ«Øæ½\u0004d9\u0011¯¤ÓI®¦\u008ds©~l\u0004i²øB°^C}\u0001.û\u0014\u0089ÑX©+\u0094\u009eîAÃ\u009c2Pè\u0018-\u000fz\u009fHGÜ\u0018\u0084\u0082iþ\u0018nä\u009fÎ\u0088h\u0016!\u0094Xn®1\u008e\u008a i>ã\u009e¹\u0084\u008b}¡\u0083orQz\u0088V¼|\u009b¼\u001a·\u0013Îm*øJyUV\u0085#½\t+WÎ\u0007)Ê\u009d\u001aô\u0006Ì&AJ\u0018\u009cN¸ê ß\u000b\f\t\u0085µ+fìê\u0086Zp[¨d\u0013Xû\u0080¦ÿh\u0017 ZK\u001e¥\f\u001e\u000b\u009eú\u0081";
                     int var5 = "¯5\u001fO5\u009fc\u0004Äÿõ\u001dX½T\u0091®û\u0000³7·\u0007Çâ \u008e÷Ñ\u0090\u009aì\u009b\\f¬]\fxJ\u0098ä¼\u008b\u009füKC³×ÊüÏtñpn¿s\u0088Íü²®-ên\u0080·\u0013\u00ad!ÍÒ«Øæ½\u0004d9\u0011¯¤ÓI®¦\u008ds©~l\u0004i²øB°^C}\u0001.û\u0014\u0089ÑX©+\u0094\u009eîAÃ\u009c2Pè\u0018-\u000fz\u009fHGÜ\u0018\u0084\u0082iþ\u0018nä\u009fÎ\u0088h\u0016!\u0094Xn®1\u008e\u008a i>ã\u009e¹\u0084\u008b}¡\u0083orQz\u0088V¼|\u009b¼\u001a·\u0013Îm*øJyUV\u0085#½\t+WÎ\u0007)Ê\u009d\u001aô\u0006Ì&AJ\u0018\u009cN¸ê ß\u000b\f\t\u0085µ+fìê\u0086Zp[¨d\u0013Xû\u0080¦ÿh\u0017 ZK\u001e¥\f\u001e\u000b\u009eú\u0081"
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
                                    c = var6;
                                    d = new Integer[32];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "&D~0,â\u000bÅ\u0013·9ñ\u0084î\u0011<";
                                 var5 = "&D~0,â\u000bÅ\u0013·9ñ\u0084î\u0011<".length();
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

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "@\u00adz_\u0002ª\u0005";
                  var12 = "@\u00adz_\u0002ª\u0005".length();
                  var9 = 4;
                  var17 = -1;
            }

            var10000 = 120;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





