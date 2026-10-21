package com.finalshell.core;

import com.finalshell.ui.model.O0;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;

public class Ai2 {
   public static int f;
   public static HashSet k;
   public static int b;
   public static int S;
   public static int J;
   public static int V;
   public static String[] a;
   public static String[] c;

   static {
      __vfClinit__();
   }

   public static O0 L(XU var0) {
      O0 var1 = null;

      try {
         var1 = O0.y(new String(var0.C(), a(-11410, -17245)));
      } catch (UnsupportedEncodingException var3) {
         var3.printStackTrace();
      }

      return var1;
   }

   public static XU N(O0 var0) {
      XU var1 = null;

      try {
         byte[] var2 = var0.toString().getBytes(a(-11409, 10090));
         var1 = new XU(f, var2);
      } catch (UnsupportedEncodingException var4) {
         var4.printStackTrace();
      }

      return var1;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -11410) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 54;
            case 1 -> 64;
            case 2 -> 231;
            case 3 -> 229;
            case 4 -> 236;
            case 5 -> 20;
            case 6 -> 100;
            case 7 -> 141;
            case 8 -> 220;
            case 9 -> 183;
            case 10 -> 48;
            case 11 -> 202;
            case 12 -> 49;
            case 13 -> 201;
            case 14 -> 181;
            case 15 -> 249;
            case 16 -> 167;
            case 17 -> 218;
            case 18 -> 14;
            case 19 -> 66;
            case 20 -> 42;
            case 21 -> 160;
            case 22 -> 33;
            case 23 -> 179;
            case 24 -> 15;
            case 25 -> 96;
            case 26 -> 108;
            case 27 -> 219;
            case 28 -> 247;
            case 29 -> 149;
            case 30 -> 91;
            case 31 -> 102;
            case 32 -> 228;
            case 33 -> 39;
            case 34 -> 195;
            case 35 -> 175;
            case 36 -> 180;
            case 37 -> 75;
            case 38 -> 35;
            case 39 -> 117;
            case 40 -> 132;
            case 41 -> 255;
            case 42 -> 76;
            case 43 -> 155;
            case 44 -> 234;
            case 45 -> 166;
            case 46 -> 67;
            case 47 -> 90;
            case 48 -> 13;
            case 49 -> 95;
            case 50 -> 254;
            case 51 -> 71;
            case 52 -> 148;
            case 53 -> 144;
            case 54 -> 203;
            case 55 -> 70;
            case 56 -> 159;
            case 57 -> 192;
            case 58 -> 24;
            case 59 -> 189;
            case 60 -> 232;
            case 61 -> 122;
            case 62 -> 239;
            case 63 -> 188;
            case 64 -> 9;
            case 65 -> 190;
            case 66 -> 120;
            case 67 -> 105;
            case 68 -> 210;
            case 69 -> 191;
            case 70 -> 79;
            case 71 -> 21;
            case 72 -> 116;
            case 73 -> 45;
            case 74 -> 227;
            case 75 -> 114;
            case 76 -> 194;
            case 77 -> 246;
            case 78 -> 126;
            case 79 -> 59;
            case 80 -> 74;
            case 81 -> 0;
            case 82 -> 123;
            case 83 -> 110;
            case 84 -> 215;
            case 85 -> 27;
            case 86 -> 174;
            case 87 -> 41;
            case 88 -> 115;
            case 89 -> 57;
            case 90 -> 12;
            case 91 -> 147;
            case 92 -> 134;
            case 93 -> 11;
            case 94 -> 165;
            case 95 -> 31;
            case 96 -> 153;
            case 97 -> 86;
            case 98 -> 99;
            case 99 -> 89;
            case 100 -> 56;
            case 101 -> 6;
            case 102 -> 23;
            case 103 -> 85;
            case 104 -> 128;
            case 105 -> 197;
            case 106 -> 177;
            case 107 -> 53;
            case 108 -> 252;
            case 109 -> 109;
            case 110 -> 61;
            case 111 -> 152;
            case 112 -> 162;
            case 113 -> 32;
            case 114 -> 3;
            case 115 -> 46;
            case 116 -> 138;
            case 117 -> 118;
            case 118 -> 163;
            case 119 -> 43;
            case 120 -> 158;
            case 121 -> 68;
            case 122 -> 94;
            case 123 -> 150;
            case 124 -> 111;
            case 125 -> 187;
            case 126 -> 97;
            case 127 -> 22;
            case 128 -> 28;
            case 129 -> 178;
            case 130 -> 7;
            case 131 -> 154;
            case 132 -> 209;
            case 133 -> 98;
            case 134 -> 82;
            case 135 -> 200;
            case 136 -> 50;
            case 137 -> 69;
            case 138 -> 143;
            case 139 -> 212;
            case 140 -> 170;
            case 141 -> 224;
            case 142 -> 106;
            case 143 -> 58;
            case 144 -> 101;
            case 145 -> 161;
            case 146 -> 44;
            case 147 -> 253;
            case 148 -> 30;
            case 149 -> 206;
            case 150 -> 213;
            case 151 -> 146;
            case 152 -> 145;
            case 153 -> 135;
            case 154 -> 40;
            case 155 -> 1;
            case 156 -> 104;
            case 157 -> 26;
            case 158 -> 127;
            case 159 -> 151;
            case 160 -> 241;
            case 161 -> 93;
            case 162 -> 92;
            case 163 -> 235;
            case 164 -> 72;
            case 165 -> 83;
            case 166 -> 140;
            case 167 -> 184;
            case 168 -> 60;
            case 169 -> 186;
            case 170 -> 172;
            case 171 -> 211;
            case 172 -> 238;
            case 173 -> 205;
            case 174 -> 103;
            case 175 -> 38;
            case 176 -> 80;
            case 177 -> 17;
            case 178 -> 242;
            case 179 -> 139;
            case 180 -> 176;
            case 181 -> 198;
            case 182 -> 62;
            case 183 -> 8;
            case 184 -> 208;
            case 185 -> 63;
            case 186 -> 199;
            case 187 -> 124;
            case 188 -> 125;
            case 189 -> 133;
            case 190 -> 136;
            case 191 -> 237;
            case 192 -> 121;
            case 193 -> 4;
            case 194 -> 130;
            case 195 -> 185;
            case 196 -> 250;
            case 197 -> 156;
            case 198 -> 226;
            case 199 -> 207;
            case 200 -> 216;
            case 201 -> 47;
            case 202 -> 55;
            case 203 -> 245;
            case 204 -> 88;
            case 205 -> 230;
            case 206 -> 173;
            case 207 -> 107;
            case 208 -> 251;
            case 209 -> 73;
            case 210 -> 182;
            case 211 -> 137;
            case 212 -> 112;
            case 213 -> 221;
            case 214 -> 131;
            case 215 -> 164;
            case 216 -> 77;
            case 217 -> 119;
            case 218 -> 243;
            case 219 -> 51;
            case 220 -> 157;
            case 221 -> 36;
            case 222 -> 84;
            case 223 -> 5;
            case 224 -> 65;
            case 225 -> 37;
            case 226 -> 87;
            case 227 -> 129;
            case 228 -> 52;
            case 229 -> 222;
            case 230 -> 196;
            case 231 -> 2;
            case 232 -> 204;
            case 233 -> 244;
            case 234 -> 25;
            case 235 -> 223;
            case 236 -> 193;
            case 237 -> 10;
            case 238 -> 169;
            case 239 -> 78;
            case 240 -> 113;
            case 241 -> 217;
            case 242 -> 19;
            case 243 -> 214;
            case 244 -> 225;
            case 245 -> 248;
            case 246 -> 81;
            case 247 -> 168;
            case 248 -> 34;
            case 249 -> 233;
            case 250 -> 142;
            case 251 -> 18;
            case 252 -> 240;
            case 253 -> 171;
            case 254 -> 16;
            default -> 29;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "\u0096!0X\u000b\u0005\u0084\u009br\u000fC";
      int var12 = "\u0096!0X\u000b\u0005\u0084\u009br\u000fC".length();
      char var9 = 5;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label57: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 93;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 93;
               var10006 = var14;
            } else {
               var27 = 93;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label57;
               }

               var10005 = var10003;
               var32 = 93;
               var10006 = var14;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var32 ^ switch (var14 % 7) {
                  case 0 -> 71;
                  case 1 -> 26;
                  case 2 -> 65;
                  case 3 -> 30;
                  case 4 -> 65;
                  case 5 -> 44;
                  default -> 57;
               });
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            a = var13;
            c = new String[2];
            long var1 = 2271055143768585906L;
            long[] var0 = new long[5];
            int var4 = 0;
            String var5 = "\u001a¨z\u0081å¦têA$ùëå¦u[`9\u0019Þå©2\u0087";
            int var6 = "\u001a¨z\u0081å¦têA$ùëå¦u[`9\u0019Þå©2\u0087".length();
            byte var3 = 0;

            label41:
            while (true) {
               var19 = var3;
               var3 += 8;
               byte[] var7 = var5.substring(var19, var3).getBytes("ISO-8859-1");
               long[] var10000 = var0;
               var19 = var4++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var1;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var3 >= var6) {
                           f = (int)var0[2];
                           k = new HashSet();
                           b = (int)var0[3];
                           S = (int)var0[1];
                           J = (int)var0[4];
                           V = (int)var0[0];
                           k.add(f);
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var3 < var6) {
                           continue label41;
                        }

                        var5 = "À·\b+å¦uZh4i\u000få¦wF";
                        var6 = "À·\b+å¦uZh4i\u000få¦wF".length();
                        var3 = 0;
                  }

                  byte var22 = var3;
                  var3 += 8;
                  var7 = var5.substring(var22, var3).getBytes("ISO-8859-1");
                  var10000 = var0;
                  var19 = var4++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }
}





