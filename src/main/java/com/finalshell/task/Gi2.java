package com.finalshell.task;

import com.finalshell.reflect.Ref;
import java.util.concurrent.atomic.AtomicInteger;

public class Gi2 extends Thread {
   public Runnable N;
   public AtomicInteger M;
   public static String[] a;
   public static String[] b;

   public Gi2(Runnable var1, AtomicInteger var2) {
      long var4 = 320545752684215891L;
      Ref.s(320545752684215891L, var1, var4);
      long var6 = 550394108353901631L;
      Ref.s(550394108353901631L, var2, var6);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void run() {
      boolean var10 = false /* VF: Semaphore variable */;

      try {
         var10 = true;
         Object var3 = 320545752684215891L;
         ((Runnable)Ref.g(320545752684215891L, var3)).run();
         var10 = false;
      } finally {
         if (var10) {
            Object var5 = 550394108353901631L;
            int var2 = ((AtomicInteger)Ref.g(550394108353901631L, var5)).getAndDecrement();
            System.out.println(a(1437, 26045) + var2 + a(1439, 732));
         }
      }

      Object var7 = 550394108353901631L;
      int var12 = ((AtomicInteger)Ref.g(550394108353901631L, var7)).getAndDecrement();
      System.out.println(a(1436, -1080) + var12 + a(1438, 23054));
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 1439) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 142;
            case 1 -> 1;
            case 2 -> 245;
            case 3 -> 75;
            case 4 -> 113;
            case 5 -> 231;
            case 6 -> 45;
            case 7 -> 51;
            case 8 -> 187;
            case 9 -> 249;
            case 10 -> 102;
            case 11 -> 252;
            case 12 -> 25;
            case 13 -> 242;
            case 14 -> 93;
            case 15 -> 208;
            case 16 -> 77;
            case 17 -> 171;
            case 18 -> 160;
            case 19 -> 39;
            case 20 -> 63;
            case 21 -> 74;
            case 22 -> 18;
            case 23 -> 173;
            case 24 -> 121;
            case 25 -> 217;
            case 26 -> 65;
            case 27 -> 204;
            case 28 -> 225;
            case 29 -> 234;
            case 30 -> 4;
            case 31 -> 54;
            case 32 -> 174;
            case 33 -> 117;
            case 34 -> 181;
            case 35 -> 224;
            case 36 -> 47;
            case 37 -> 212;
            case 38 -> 179;
            case 39 -> 62;
            case 40 -> 92;
            case 41 -> 147;
            case 42 -> 255;
            case 43 -> 169;
            case 44 -> 95;
            case 45 -> 99;
            case 46 -> 60;
            case 47 -> 229;
            case 48 -> 35;
            case 49 -> 17;
            case 50 -> 32;
            case 51 -> 132;
            case 52 -> 44;
            case 53 -> 130;
            case 54 -> 94;
            case 55 -> 58;
            case 56 -> 162;
            case 57 -> 24;
            case 58 -> 221;
            case 59 -> 210;
            case 60 -> 211;
            case 61 -> 10;
            case 62 -> 101;
            case 63 -> 38;
            case 64 -> 126;
            case 65 -> 202;
            case 66 -> 88;
            case 67 -> 232;
            case 68 -> 72;
            case 69 -> 151;
            case 70 -> 16;
            case 71 -> 21;
            case 72 -> 109;
            case 73 -> 152;
            case 74 -> 155;
            case 75 -> 219;
            case 76 -> 199;
            case 77 -> 119;
            case 78 -> 159;
            case 79 -> 37;
            case 80 -> 134;
            case 81 -> 188;
            case 82 -> 7;
            case 83 -> 14;
            case 84 -> 107;
            case 85 -> 68;
            case 86 -> 19;
            case 87 -> 198;
            case 88 -> 85;
            case 89 -> 192;
            case 90 -> 76;
            case 91 -> 137;
            case 92 -> 209;
            case 93 -> 87;
            case 94 -> 177;
            case 95 -> 81;
            case 96 -> 247;
            case 97 -> 26;
            case 98 -> 82;
            case 99 -> 251;
            case 100 -> 78;
            case 101 -> 146;
            case 102 -> 112;
            case 103 -> 98;
            case 104 -> 71;
            case 105 -> 133;
            case 106 -> 57;
            case 107 -> 108;
            case 108 -> 89;
            case 109 -> 97;
            case 110 -> 66;
            case 111 -> 197;
            case 112 -> 161;
            case 113 -> 201;
            case 114 -> 183;
            case 115 -> 226;
            case 116 -> 104;
            case 117 -> 166;
            case 118 -> 124;
            case 119 -> 48;
            case 120 -> 61;
            case 121 -> 239;
            case 122 -> 96;
            case 123 -> 254;
            case 124 -> 153;
            case 125 -> 206;
            case 126 -> 144;
            case 127 -> 91;
            case 128 -> 31;
            case 129 -> 196;
            case 130 -> 69;
            case 131 -> 246;
            case 132 -> 182;
            case 133 -> 250;
            case 134 -> 148;
            case 135 -> 15;
            case 136 -> 141;
            case 137 -> 158;
            case 138 -> 100;
            case 139 -> 168;
            case 140 -> 180;
            case 141 -> 215;
            case 142 -> 84;
            case 143 -> 156;
            case 144 -> 70;
            case 145 -> 220;
            case 146 -> 150;
            case 147 -> 184;
            case 148 -> 203;
            case 149 -> 214;
            case 150 -> 8;
            case 151 -> 59;
            case 152 -> 86;
            case 153 -> 186;
            case 154 -> 235;
            case 155 -> 9;
            case 156 -> 176;
            case 157 -> 244;
            case 158 -> 190;
            case 159 -> 122;
            case 160 -> 30;
            case 161 -> 163;
            case 162 -> 11;
            case 163 -> 5;
            case 164 -> 79;
            case 165 -> 207;
            case 166 -> 172;
            case 167 -> 52;
            case 168 -> 216;
            case 169 -> 139;
            case 170 -> 240;
            case 171 -> 200;
            case 172 -> 175;
            case 173 -> 178;
            case 174 -> 28;
            case 175 -> 36;
            case 176 -> 12;
            case 177 -> 129;
            case 178 -> 116;
            case 179 -> 205;
            case 180 -> 223;
            case 181 -> 83;
            case 182 -> 118;
            case 183 -> 105;
            case 184 -> 13;
            case 185 -> 40;
            case 186 -> 238;
            case 187 -> 194;
            case 188 -> 34;
            case 189 -> 90;
            case 190 -> 241;
            case 191 -> 253;
            case 192 -> 3;
            case 193 -> 111;
            case 194 -> 29;
            case 195 -> 236;
            case 196 -> 115;
            case 197 -> 50;
            case 198 -> 33;
            case 199 -> 73;
            case 200 -> 145;
            case 201 -> 170;
            case 202 -> 27;
            case 203 -> 120;
            case 204 -> 165;
            case 205 -> 64;
            case 206 -> 237;
            case 207 -> 185;
            case 208 -> 243;
            case 209 -> 67;
            case 210 -> 49;
            case 211 -> 140;
            case 212 -> 227;
            case 213 -> 131;
            case 214 -> 125;
            case 215 -> 114;
            case 216 -> 248;
            case 217 -> 56;
            case 218 -> 6;
            case 219 -> 136;
            case 220 -> 2;
            case 221 -> 218;
            case 222 -> 195;
            case 223 -> 154;
            case 224 -> 233;
            case 225 -> 138;
            case 226 -> 110;
            case 227 -> 222;
            case 228 -> 149;
            case 229 -> 106;
            case 230 -> 20;
            case 231 -> 213;
            case 232 -> 189;
            case 233 -> 53;
            case 234 -> 43;
            case 235 -> 191;
            case 236 -> 0;
            case 237 -> 42;
            case 238 -> 193;
            case 239 -> 164;
            case 240 -> 228;
            case 241 -> 80;
            case 242 -> 46;
            case 243 -> 157;
            case 244 -> 135;
            case 245 -> 167;
            case 246 -> 103;
            case 247 -> 230;
            case 248 -> 22;
            case 249 -> 128;
            case 250 -> 123;
            case 251 -> 127;
            case 252 -> 23;
            case 253 -> 55;
            case 254 -> 41;
            default -> 143;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "V\u0014\u001bØÞ\u0085'á\bÍµhì°\u0003ê1";
      int var4 = "V\u0014\u001bØÞ\u0085'á\bÍµhì°\u0003ê1".length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 96;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                     case 0 -> 39;
                     case 1 -> 119;
                     case 2 -> 21;
                     case 3 -> 116;
                     case 4 -> 115;
                     case 5 -> 33;
                     default -> 83;
                  });
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[4];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0013ú\u0095ï¸r\u0081\u0014\u008b'Âðú\rÞª,å\u008f3g<W\"YP\u0089";
                  var4 = "\u0013ú\u0095ï¸r\u0081\u0014\u008b'Âðú\rÞª,å\u008f3g<W\"YP\u0089".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 70;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





