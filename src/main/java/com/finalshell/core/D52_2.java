package com.finalshell.core;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class D52_2 {
   public static Key o;
   public static String V;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   static {
      __vfClinit__();
   }

   public String W(String var1) {
      String var10000 = k();
      String var3 = var1;
      String var2 = var10000;

      label45: {
         try {
            if (var2 != null) {
               return var3;
            }

            if (var3 != null) {
               break label45;
            }
         } catch (NoSuchAlgorithmException var9) {
            throw a(var9);
         }

         return "";
      }

      String var4 = null;
      MessageDigest var5 = null;

      try {
         var5 = MessageDigest.getInstance(a(10428, -6396));
      } catch (NoSuchAlgorithmException var8) {
      }

      try {
         var4 = Base64.getEncoder().encodeToString(var5.digest(var3.getBytes(a(10429, -15328))));
      } catch (Exception var7) {
      }

      return var4;
   }

   public static Key p() throws Exception {
      String var0 = k();

      try {
         if (var0 != null) {
            return o;
         }

         if (o != null) {
            return o;
         }
      } catch (Exception var5) {
         throw a(var5);
      }

      InputStream var1 = new D52_2().getClass().getResourceAsStream(a(10426, -27435));
      DataInputStream var2 = new DataInputStream(var1);
      byte[] var3 = new byte[a(23142, 2246304965403897441L)];
      var2.readFully(var3);
      DESKeySpec var4 = new DESKeySpec(var3);
      o = SecretKeyFactory.getInstance(a(10431, -8346)).generateSecret(var4);
      return o;
   }

   public static HttpURLConnection P(String param0) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D52_2.k ()Ljava/lang/String;
      // 03: new java/net/URL
      // 06: dup
      // 07: aload 0
      // 08: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 0b: astore 2
      // 0c: astore 1
      // 0d: aconst_null
      // 0e: astore 3
      // 0f: aload 0
      // 10: sipush 10430
      // 13: sipush 1588
      // 16: invokestatic com/finalshell/core/D52_2.a (II)Ljava/lang/String;
      // 19: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1c: aload 1
      // 1d: ifnonnull 42
      // 20: ifeq 35
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/D52_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 2
      // 2b: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 2e: checkcast java/net/HttpURLConnection
      // 31: astore 3
      // 32: goto 5d
      // 35: aload 0
      // 36: sipush 10424
      // 39: sipush 27375
      // 3c: invokestatic com/finalshell/core/D52_2.a (II)Ljava/lang/String;
      // 3f: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 42: ifeq 5d
      // 45: aload 2
      // 46: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 49: checkcast javax/net/ssl/HttpsURLConnection
      // 4c: astore 4
      // 4e: aload 4
      // 50: new com/finalshell/core/WP
      // 53: dup
      // 54: invokespecial com/finalshell/core/WP.<init> ()V
      // 57: invokevirtual javax/net/ssl/HttpsURLConnection.setHostnameVerifier (Ljavax/net/ssl/HostnameVerifier;)V
      // 5a: aload 4
      // 5c: astore 3
      // 5d: aload 3
      // 5e: aload 1
      // 5f: ifnonnull aa
      // 62: ifnull a9
      // 65: goto 6c
      // 68: invokestatic com/finalshell/core/D52_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: aload 3
      // 6d: sipush 6238
      // 70: ldc2_w 1060081166411836498
      // 73: invokestatic com/finalshell/core/D52_2.a (IJ)I
      // 76: invokevirtual java/net/HttpURLConnection.setConnectTimeout (I)V
      // 79: aload 3
      // 7a: sipush 18374
      // 7d: ldc2_w 3271100564454601673
      // 80: invokestatic com/finalshell/core/D52_2.a (IJ)I
      // 83: invokevirtual java/net/HttpURLConnection.setReadTimeout (I)V
      // 86: aload 3
      // 87: sipush 10427
      // 8a: sipush 1744
      // 8d: invokestatic com/finalshell/core/D52_2.a (II)Ljava/lang/String;
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
      // a5: invokestatic com/finalshell/core/D52_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a8: athrow
      // a9: aload 3
      // aa: areturn
   }

   public static SSLContext h() throws Exception {
      Gu2 var0 = new Gu2();
      TrustManager[] var1 = new TrustManager[]{var0};
      SSLContext var2 = SSLContext.getInstance(a(10425, -7800));
      var2.init(null, var1, null);
      return var2;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static String v(byte[] var0) {
      String var1 = k();
      if (var1 == null) {
         if (var0.length == a(3248, 3229199299207608501L)) {
            StringBuffer var2 = new StringBuffer();
            int var4 = 0;
            if (var1 == null && var4 >= var0.length) {
               var2.delete(var2.length() - 1, var2.length());
               return var2.toString().toUpperCase();
            }

            do {
               byte var3 = (byte)((var0[var4] & a(15729, 695599963701184842L)) >> 4);
               var2.append(Integer.toHexString(var3));
               var3 = (byte)(var0[var4] & a(18902, 3412352378346700226L));
               var2.append(Integer.toHexString(var3));
               var2.append("-");
            } while (++var4 < var0.length);

            var2.delete(var2.length() - 1, var2.length());
            return var2.toString().toUpperCase();
         }

         System.err.println(a(10421, -5234));
      }

      return null;
   }

   public static String J(String var0) {
      byte[] var1 = var0.getBytes();
      return D(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static String D(byte[] var0) {
      String var10001 = k();
      String var2 = null;
      String var1 = var10001;
      char[] var10000 = new char[a(19507, 3874578032251533356L)];
      var10000[0] = (char)a(26612, 3163933981910979578L);
      var10000[1] = (char)a(30787, 5854175651467021402L);
      var10000[2] = (char)a(10705, 2277695507103489493L);
      var10000[3] = (char)a(4363, 3758876358924608784L);
      var10000[4] = (char)a(30248, 5200406912802636336L);
      var10000[5] = (char)a(17371, 6793066934448256974L);
      var10000[a(1557, 2959555017750426119L)] = (char)a(14408, 3490581938833820767L);
      var10000[a(31631, 9031396612920790925L)] = (char)a(23895, 336678624177973581L);
      var10000[a(12171, 611632482239716237L)] = (char)a(24259, 3569596956282284767L);
      var10000[a(28582, 3625655076196834213L)] = (char)a(11708, 7663030952970394045L);
      var10000[a(28294, 3257841714071722640L)] = (char)a(30385, 225669063408009903L);
      var10000[a(1575, 6787742301998232110L)] = (char)a(6450, 1579360011700612410L);
      var10000[a(8344, 6880415635440243848L)] = (char)a(24799, 5914702393864541414L);
      var10000[a(5274, 1591118012641124503L)] = (char)a(19164, 892716899146104534L);
      var10000[a(4237, 3032814361248277648L)] = (char)a(2595, 582678517594996274L);
      var10000[a(11120, 9146179084966436720L)] = (char)a(1162, 2039499911730933913L);
      char[] var3 = var10000;

      try {
         MessageDigest var4 = MessageDigest.getInstance(a(10420, -4341));
         var4.update(var0);
         byte[] var5 = var4.digest();
         char[] var6 = new char[a(29937, 6673814660389585097L)];
         int var7 = 0;
         int var8 = 0;
         if (var1 != null || var8 < a(18624, 7755044807156301003L)) {
            do {
               byte var9 = var5[var8];
               var6[var7++] = var3[var9 >>> 4 & a(11120, 9146179084966436720L)];
               var6[var7++] = var3[var9 & a(11120, 9146179084966436720L)];
            } while (++var8 < a(18624, 7755044807156301003L));
         }

         var2 = new String(var6);
      } catch (Exception var10) {
         var10.printStackTrace();
      }

      return var2;
   }

   public static void b(String var0) {
      V = var0;
   }

   public static String k() {
      return V;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 10429) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 68;
               break;
            case 1:
               var10000 = 50;
               break;
            case 2:
               var10000 = 113;
               break;
            case 3:
               var10000 = 134;
               break;
            case 4:
               var10000 = 10;
               break;
            case 5:
               var10000 = 149;
               break;
            case 6:
               var10000 = 26;
               break;
            case 7:
               var10000 = 11;
               break;
            case 8:
               var10000 = 49;
               break;
            case 9:
               var10000 = 218;
               break;
            case 10:
               var10000 = 52;
               break;
            case 11:
               var10000 = 185;
               break;
            case 12:
               var10000 = 54;
               break;
            case 13:
               var10000 = 57;
               break;
            case 14:
               var10000 = 75;
               break;
            case 15:
               var10000 = 93;
               break;
            case 16:
               var10000 = 85;
               break;
            case 17:
               var10000 = 175;
               break;
            case 18:
               var10000 = 172;
               break;
            case 19:
               var10000 = 90;
               break;
            case 20:
               var10000 = 31;
               break;
            case 21:
               var10000 = 202;
               break;
            case 22:
               var10000 = 16;
               break;
            case 23:
               var10000 = 161;
               break;
            case 24:
               var10000 = 150;
               break;
            case 25:
               var10000 = 241;
               break;
            case 26:
               var10000 = 209;
               break;
            case 27:
               var10000 = 100;
               break;
            case 28:
               var10000 = 199;
               break;
            case 29:
               var10000 = 215;
               break;
            case 30:
               var10000 = 166;
               break;
            case 31:
               var10000 = 130;
               break;
            case 32:
               var10000 = 21;
               break;
            case 33:
               var10000 = 244;
               break;
            case 34:
               var10000 = 234;
               break;
            case 35:
               var10000 = 226;
               break;
            case 36:
               var10000 = 69;
               break;
            case 37:
               var10000 = 112;
               break;
            case 38:
               var10000 = 105;
               break;
            case 39:
               var10000 = 250;
               break;
            case 40:
               var10000 = 233;
               break;
            case 41:
               var10000 = 23;
               break;
            case 42:
               var10000 = 84;
               break;
            case 43:
               var10000 = 247;
               break;
            case 44:
               var10000 = 46;
               break;
            case 45:
               var10000 = 235;
               break;
            case 46:
               var10000 = 111;
               break;
            case 47:
               var10000 = 4;
               break;
            case 48:
               var10000 = 192;
               break;
            case 49:
               var10000 = 231;
               break;
            case 50:
               var10000 = 145;
               break;
            case 51:
               var10000 = 204;
               break;
            case 52:
               var10000 = 99;
               break;
            case 53:
               var10000 = 186;
               break;
            case 54:
               var10000 = 168;
               break;
            case 55:
               var10000 = 207;
               break;
            case 56:
               var10000 = 124;
               break;
            case 57:
               var10000 = 147;
               break;
            case 58:
               var10000 = 104;
               break;
            case 59:
               var10000 = 109;
               break;
            case 60:
               var10000 = 3;
               break;
            case 61:
               var10000 = 92;
               break;
            case 62:
               var10000 = 232;
               break;
            case 63:
               var10000 = 156;
               break;
            case 64:
               var10000 = 67;
               break;
            case 65:
               var10000 = 121;
               break;
            case 66:
               var10000 = 24;
               break;
            case 67:
               var10000 = 55;
               break;
            case 68:
               var10000 = 79;
               break;
            case 69:
               var10000 = 74;
               break;
            case 70:
               var10000 = 87;
               break;
            case 71:
               var10000 = 245;
               break;
            case 72:
               var10000 = 201;
               break;
            case 73:
               var10000 = 131;
               break;
            case 74:
               var10000 = 217;
               break;
            case 75:
               var10000 = 246;
               break;
            case 76:
               var10000 = 210;
               break;
            case 77:
               var10000 = 212;
               break;
            case 78:
               var10000 = 73;
               break;
            case 79:
               var10000 = 63;
               break;
            case 80:
               var10000 = 170;
               break;
            case 81:
               var10000 = 70;
               break;
            case 82:
               var10000 = 116;
               break;
            case 83:
               var10000 = 249;
               break;
            case 84:
               var10000 = 162;
               break;
            case 85:
               var10000 = 97;
               break;
            case 86:
               var10000 = 222;
               break;
            case 87:
               var10000 = 146;
               break;
            case 88:
               var10000 = 187;
               break;
            case 89:
               var10000 = 251;
               break;
            case 90:
               var10000 = 225;
               break;
            case 91:
               var10000 = 61;
               break;
            case 92:
               var10000 = 213;
               break;
            case 93:
               var10000 = 219;
               break;
            case 94:
               var10000 = 194;
               break;
            case 95:
               var10000 = 252;
               break;
            case 96:
               var10000 = 197;
               break;
            case 97:
               var10000 = 148;
               break;
            case 98:
               var10000 = 221;
               break;
            case 99:
               var10000 = 138;
               break;
            case 100:
               var10000 = 169;
               break;
            case 101:
               var10000 = 155;
               break;
            case 102:
               var10000 = 44;
               break;
            case 103:
               var10000 = 118;
               break;
            case 104:
               var10000 = 153;
               break;
            case 105:
               var10000 = 157;
               break;
            case 106:
               var10000 = 151;
               break;
            case 107:
               var10000 = 193;
               break;
            case 108:
               var10000 = 48;
               break;
            case 109:
               var10000 = 183;
               break;
            case 110:
               var10000 = 240;
               break;
            case 111:
               var10000 = 243;
               break;
            case 112:
               var10000 = 34;
               break;
            case 113:
               var10000 = 171;
               break;
            case 114:
               var10000 = 12;
               break;
            case 115:
               var10000 = 255;
               break;
            case 116:
               var10000 = 19;
               break;
            case 117:
               var10000 = 228;
               break;
            case 118:
               var10000 = 224;
               break;
            case 119:
               var10000 = 18;
               break;
            case 120:
               var10000 = 71;
               break;
            case 121:
               var10000 = 122;
               break;
            case 122:
               var10000 = 7;
               break;
            case 123:
               var10000 = 125;
               break;
            case 124:
               var10000 = 126;
               break;
            case 125:
               var10000 = 37;
               break;
            case 126:
               var10000 = 137;
               break;
            case 127:
               var10000 = 43;
               break;
            case 128:
               var10000 = 58;
               break;
            case 129:
               var10000 = 211;
               break;
            case 130:
               var10000 = 154;
               break;
            case 131:
               var10000 = 51;
               break;
            case 132:
               var10000 = 205;
               break;
            case 133:
               var10000 = 141;
               break;
            case 134:
               var10000 = 32;
               break;
            case 135:
               var10000 = 101;
               break;
            case 136:
               var10000 = 189;
               break;
            case 137:
               var10000 = 140;
               break;
            case 138:
               var10000 = 254;
               break;
            case 139:
               var10000 = 81;
               break;
            case 140:
               var10000 = 82;
               break;
            case 141:
               var10000 = 15;
               break;
            case 142:
               var10000 = 60;
               break;
            case 143:
               var10000 = 77;
               break;
            case 144:
               var10000 = 165;
               break;
            case 145:
               var10000 = 20;
               break;
            case 146:
               var10000 = 117;
               break;
            case 147:
               var10000 = 132;
               break;
            case 148:
               var10000 = 152;
               break;
            case 149:
               var10000 = 139;
               break;
            case 150:
               var10000 = 2;
               break;
            case 151:
               var10000 = 177;
               break;
            case 152:
               var10000 = 5;
               break;
            case 153:
               var10000 = 65;
               break;
            case 154:
               var10000 = 86;
               break;
            case 155:
               var10000 = 42;
               break;
            case 156:
               var10000 = 167;
               break;
            case 157:
               var10000 = 198;
               break;
            case 158:
               var10000 = 88;
               break;
            case 159:
               var10000 = 236;
               break;
            case 160:
               var10000 = 39;
               break;
            case 161:
               var10000 = 1;
               break;
            case 162:
               var10000 = 128;
               break;
            case 163:
               var10000 = 174;
               break;
            case 164:
               var10000 = 229;
               break;
            case 165:
               var10000 = 115;
               break;
            case 166:
               var10000 = 142;
               break;
            case 167:
               var10000 = 239;
               break;
            case 168:
               var10000 = 143;
               break;
            case 169:
               var10000 = 0;
               break;
            case 170:
               var10000 = 196;
               break;
            case 171:
               var10000 = 33;
               break;
            case 172:
               var10000 = 40;
               break;
            case 173:
               var10000 = 223;
               break;
            case 174:
               var10000 = 94;
               break;
            case 175:
               var10000 = 248;
               break;
            case 176:
               var10000 = 45;
               break;
            case 177:
               var10000 = 103;
               break;
            case 178:
               var10000 = 89;
               break;
            case 179:
               var10000 = 227;
               break;
            case 180:
               var10000 = 158;
               break;
            case 181:
               var10000 = 182;
               break;
            case 182:
               var10000 = 178;
               break;
            case 183:
               var10000 = 102;
               break;
            case 184:
               var10000 = 191;
               break;
            case 185:
               var10000 = 214;
               break;
            case 186:
               var10000 = 195;
               break;
            case 187:
               var10000 = 35;
               break;
            case 188:
               var10000 = 78;
               break;
            case 189:
               var10000 = 179;
               break;
            case 190:
               var10000 = 17;
               break;
            case 191:
               var10000 = 62;
               break;
            case 192:
               var10000 = 237;
               break;
            case 193:
               var10000 = 129;
               break;
            case 194:
               var10000 = 206;
               break;
            case 195:
               var10000 = 98;
               break;
            case 196:
               var10000 = 200;
               break;
            case 197:
               var10000 = 242;
               break;
            case 198:
               var10000 = 64;
               break;
            case 199:
               var10000 = 27;
               break;
            case 200:
               var10000 = 133;
               break;
            case 201:
               var10000 = 14;
               break;
            case 202:
               var10000 = 160;
               break;
            case 203:
               var10000 = 184;
               break;
            case 204:
               var10000 = 29;
               break;
            case 205:
               var10000 = 106;
               break;
            case 206:
               var10000 = 123;
               break;
            case 207:
               var10000 = 220;
               break;
            case 208:
               var10000 = 80;
               break;
            case 209:
               var10000 = 230;
               break;
            case 210:
               var10000 = 22;
               break;
            case 211:
               var10000 = 159;
               break;
            case 212:
               var10000 = 253;
               break;
            case 213:
               var10000 = 38;
               break;
            case 214:
               var10000 = 203;
               break;
            case 215:
               var10000 = 108;
               break;
            case 216:
               var10000 = 9;
               break;
            case 217:
               var10000 = 56;
               break;
            case 218:
               var10000 = 176;
               break;
            case 219:
               var10000 = 136;
               break;
            case 220:
               var10000 = 119;
               break;
            case 221:
               var10000 = 28;
               break;
            case 222:
               var10000 = 216;
               break;
            case 223:
               var10000 = 238;
               break;
            case 224:
               var10000 = 6;
               break;
            case 225:
               var10000 = 180;
               break;
            case 226:
               var10000 = 30;
               break;
            case 227:
               var10000 = 107;
               break;
            case 228:
               var10000 = 95;
               break;
            case 229:
               var10000 = 188;
               break;
            case 230:
               var10000 = 59;
               break;
            case 231:
               var10000 = 13;
               break;
            case 232:
               var10000 = 144;
               break;
            case 233:
               var10000 = 53;
               break;
            case 234:
               var10000 = 47;
               break;
            case 235:
               var10000 = 127;
               break;
            case 236:
               var10000 = 66;
               break;
            case 237:
               var10000 = 208;
               break;
            case 238:
               var10000 = 164;
               break;
            case 239:
               var10000 = 96;
               break;
            case 240:
               var10000 = 36;
               break;
            case 241:
               var10000 = 110;
               break;
            case 242:
               var10000 = 173;
               break;
            case 243:
               var10000 = 25;
               break;
            case 244:
               var10000 = 72;
               break;
            case 245:
               var10000 = 76;
               break;
            case 246:
               var10000 = 181;
               break;
            case 247:
               var10000 = 135;
               break;
            case 248:
               var10000 = 190;
               break;
            case 249:
               var10000 = 83;
               break;
            case 250:
               var10000 = 114;
               break;
            case 251:
               var10000 = 41;
               break;
            case 252:
               var10000 = 163;
               break;
            case 253:
               var10000 = 91;
               break;
            case 254:
               var10000 = 120;
               break;
            default:
               var10000 = 8;
         }

         short var4 = var10000;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13337;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[10];
      int var11 = 0;
      b(null);
      String var10 = "\u0083mø)À\u0003Ä\u00ad|\u0003\u0093hØ\u0007]Ð\u008fÃ|\u0080\u000e\u0003\u0011íb\b\u0091E\u0016q\u0006Ã!Z\u0004ÓÕF\u001b\u0003Ñ\u008f®";
      int var12 = "\u0083mø)À\u0003Ä\u00ad|\u0003\u0093hØ\u0007]Ð\u008fÃ|\u0080\u000e\u0003\u0011íb\b\u0091E\u0016q\u0006Ã!Z\u0004ÓÕF\u001b\u0003Ñ\u008f®"
         .length();
      char var9 = 5;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 24;
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
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 41;
                        break;
                     case 1:
                        var65 = 106;
                        break;
                     case 2:
                        var65 = 11;
                        break;
                     case 3:
                        var65 = 5;
                        break;
                     case 4:
                        var65 = 55;
                        break;
                     case 5:
                        var65 = 18;
                        break;
                     default:
                        var65 = 46;
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
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[10];
                     long var0 = 4362096308803946011L;
                     long[] var6 = new long[35];
                     int var3 = 0;
                     String var4 = "\u00adÉêý¼#\u008ap±\u0095]å\u0087[\u0004\u001f0¢\u007f\u0093R\u001dã8±F\u009a¾\u0087Õ/a{Ã\u0002\"\u008d¥b\u0085EM¿\f¨È,ü\u001c>>\u0081`¯>'Ø[\u009dÄ\u000bw\u0084Õ@åÔ£\tÍxLXÃ\u001fjC8Ò\u009fqù]ºldöä^\u009eä\u0092ôpt\u001a±\b\u000fÞùp1à8bu\u0093Ý\u009d;ÖxÅÏ±ÉØÊr¦áÀ\u0090wü\u009c\u0081\f9ç\u001bc2t>\u009fE^µW\u0092kCjj%:A\u0084ºÀ·ÛeixÚ8©\u0012\u0084\u008e\"A~f\u0081é¯\u008b\u0085\u000fBMYöX\u0007ú¢¨\u0012Â\u0001ïë;>Ú\u0015ÑØÒL(\\Òß\u009fE\u0014P\u0090\u0011ÅYdî¨aYL\u0080\u009d·Ë\"É%8\u0082\t\u0091\u0092\u009b\u0093¢\u0010xþ¨+p1°µ%[ü-\u009aû/²U(rÒv¸\u009bÆ°]\u009eX=£µ ?\u0092\u009e";
                     int var5 = "\u00adÉêý¼#\u008ap±\u0095]å\u0087[\u0004\u001f0¢\u007f\u0093R\u001dã8±F\u009a¾\u0087Õ/a{Ã\u0002\"\u008d¥b\u0085EM¿\f¨È,ü\u001c>>\u0081`¯>'Ø[\u009dÄ\u000bw\u0084Õ@åÔ£\tÍxLXÃ\u001fjC8Ò\u009fqù]ºldöä^\u009eä\u0092ôpt\u001a±\b\u000fÞùp1à8bu\u0093Ý\u009d;ÖxÅÏ±ÉØÊr¦áÀ\u0090wü\u009c\u0081\f9ç\u001bc2t>\u009fE^µW\u0092kCjj%:A\u0084ºÀ·ÛeixÚ8©\u0012\u0084\u008e\"A~f\u0081é¯\u008b\u0085\u000fBMYöX\u0007ú¢¨\u0012Â\u0001ïë;>Ú\u0015ÑØÒL(\\Òß\u009fE\u0014P\u0090\u0011ÅYdî¨aYL\u0080\u009d·Ë\"É%8\u0082\t\u0091\u0092\u009b\u0093¢\u0010xþ¨+p1°µ%[ü-\u009aû/²U(rÒv¸\u009bÆ°]\u009eX=£µ ?\u0092\u009e"
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
                                    d = new Integer[35];
                                    o = null;
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "À@\u0097½C\u001d\u0086òam\u0095\f\u0004bO¡";
                                 var5 = "À@\u0097½C\u001d\u0086òam\u0095\f\u0004bO¡".length();
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

                  var10 = "[÷\u0011\fｑ９פ＄ｼ￢ﾋҏﾏX\u0003¨Æ\u0019";
                  var12 = "[÷\u0011\fｑ９פ＄ｼ￢ﾋҏﾏX\u0003¨Æ\u0019".length();
                  var9 = 14;
                  var17 = -1;
            }

            var10000 = 124;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





