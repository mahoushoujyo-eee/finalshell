import java.util.Arrays;

public class xU {
   private int S;
   private int P;
   private byte[] l;
   private static int[] r;
   private static final String[] a;
   private static final String[] b;

   public xU(int var1, byte[] var2) {
      t();
      this.S = var1;
      this.l = var2;
      this.P = var2.length;
      if (com.ky_4.F() != null) {
         w(new int[3]);
      }
   }

   public int S() {
      return this.S;
   }

   public int j() {
      return this.P;
   }

   public void d(int var1) {
      this.P = var1;
   }

   public byte[] C() {
      return this.l;
   }

   public void x(byte[] var1) {
      this.l = var1;
   }

   @Override
   public String toString() {
      int var10001 = this.S;
      int var10002 = this.P;
      String var1 = Arrays.toString(this.l);
      int var2 = var10002;
      int var3 = var10001;
      return a(616, 1766) + var3 + a(618, 18972) + var2 + a(617, -26204) + var1 + "]";
   }

   public static void w(int[] var0) {
      r = var0;
   }

   public static int[] t() {
      return r;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "¼ú!M\u00146\u001c\u0099`\u0093\u00993>ú,ÂÉB|ý\u008e\u0014=àÒ\u0089\u0096ó\n\u001bZG \u0080\u0002ÓÒ9*\u0010%\u0003\u0080\u008bxgÌ~ÚÎd{Â½½\u008e";
      int var4 = "¼ú!M\u00146\u001c\u0099`\u0093\u00993>ú,ÂÉB|ý\u008e\u0014=àÒ\u0089\u0096ó\n\u001bZG \u0080\u0002ÓÒ9*\u0010%\u0003\u0080\u008bxgÌ~ÚÎd{Â½½\u008e"
         .length();
      char var1 = 28;
      int[] var10000 = new int[2];
      int var0 = -1;
      w(var10000);

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 107;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 107;
               var10006 = var6;
            } else {
               var13 = 107;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 107;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 76;
                  case 1 -> 20;
                  case 2 -> 97;
                  case 3 -> 36;
                  case 4 -> 35;
                  case 5 -> 98;
                  default -> 103;
               });
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new String[3];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 616) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 102;
            case 1 -> 37;
            case 2 -> 238;
            case 3 -> 23;
            case 4 -> 240;
            case 5 -> 111;
            case 6 -> 226;
            case 7 -> 91;
            case 8 -> 246;
            case 9 -> 32;
            case 10 -> 96;
            case 11 -> 17;
            case 12 -> 124;
            case 13 -> 45;
            case 14 -> 35;
            case 15 -> 78;
            case 16 -> 145;
            case 17 -> 225;
            case 18 -> 42;
            case 19 -> 173;
            case 20 -> 241;
            case 21 -> 106;
            case 22 -> 116;
            case 23 -> 193;
            case 24 -> 5;
            case 25 -> 207;
            case 26 -> 14;
            case 27 -> 184;
            case 28 -> 98;
            case 29 -> 175;
            case 30 -> 146;
            case 31 -> 123;
            case 32 -> 47;
            case 33 -> 118;
            case 34 -> 171;
            case 35 -> 84;
            case 36 -> 67;
            case 37 -> 6;
            case 38 -> 24;
            case 39 -> 179;
            case 40 -> 31;
            case 41 -> 147;
            case 42 -> 18;
            case 43 -> 40;
            case 44 -> 56;
            case 45 -> 150;
            case 46 -> 161;
            case 47 -> 201;
            case 48 -> 196;
            case 49 -> 126;
            case 50 -> 188;
            case 51 -> 93;
            case 52 -> 59;
            case 53 -> 223;
            case 54 -> 216;
            case 55 -> 195;
            case 56 -> 50;
            case 57 -> 130;
            case 58 -> 41;
            case 59 -> 163;
            case 60 -> 148;
            case 61 -> 82;
            case 62 -> 151;
            case 63 -> 55;
            case 64 -> 224;
            case 65 -> 132;
            case 66 -> 52;
            case 67 -> 92;
            case 68 -> 176;
            case 69 -> 153;
            case 70 -> 21;
            case 71 -> 85;
            case 72 -> 254;
            case 73 -> 167;
            case 74 -> 2;
            case 75 -> 245;
            case 76 -> 228;
            case 77 -> 233;
            case 78 -> 127;
            case 79 -> 81;
            case 80 -> 215;
            case 81 -> 73;
            case 82 -> 156;
            case 83 -> 100;
            case 84 -> 164;
            case 85 -> 198;
            case 86 -> 103;
            case 87 -> 108;
            case 88 -> 210;
            case 89 -> 101;
            case 90 -> 221;
            case 91 -> 20;
            case 92 -> 181;
            case 93 -> 39;
            case 94 -> 15;
            case 95 -> 62;
            case 96 -> 194;
            case 97 -> 230;
            case 98 -> 140;
            case 99 -> 204;
            case 100 -> 247;
            case 101 -> 0;
            case 102 -> 72;
            case 103 -> 154;
            case 104 -> 80;
            case 105 -> 190;
            case 106 -> 120;
            case 107 -> 44;
            case 108 -> 214;
            case 109 -> 203;
            case 110 -> 25;
            case 111 -> 158;
            case 112 -> 115;
            case 113 -> 206;
            case 114 -> 1;
            case 115 -> 177;
            case 116 -> 10;
            case 117 -> 251;
            case 118 -> 70;
            case 119 -> 168;
            case 120 -> 12;
            case 121 -> 243;
            case 122 -> 180;
            case 123 -> 131;
            case 124 -> 57;
            case 125 -> 231;
            case 126 -> 229;
            case 127 -> 68;
            case 128 -> 77;
            case 129 -> 165;
            case 130 -> 16;
            case 131 -> 187;
            case 132 -> 186;
            case 133 -> 232;
            case 134 -> 49;
            case 135 -> 144;
            case 136 -> 222;
            case 137 -> 60;
            case 138 -> 79;
            case 139 -> 220;
            case 140 -> 235;
            case 141 -> 166;
            case 142 -> 86;
            case 143 -> 29;
            case 144 -> 94;
            case 145 -> 97;
            case 146 -> 54;
            case 147 -> 7;
            case 148 -> 63;
            case 149 -> 253;
            case 150 -> 192;
            case 151 -> 87;
            case 152 -> 142;
            case 153 -> 3;
            case 154 -> 34;
            case 155 -> 30;
            case 156 -> 61;
            case 157 -> 36;
            case 158 -> 157;
            case 159 -> 66;
            case 160 -> 105;
            case 161 -> 88;
            case 162 -> 219;
            case 163 -> 117;
            case 164 -> 152;
            case 165 -> 43;
            case 166 -> 172;
            case 167 -> 141;
            case 168 -> 234;
            case 169 -> 128;
            case 170 -> 11;
            case 171 -> 218;
            case 172 -> 58;
            case 173 -> 205;
            case 174 -> 209;
            case 175 -> 22;
            case 176 -> 107;
            case 177 -> 242;
            case 178 -> 33;
            case 179 -> 48;
            case 180 -> 252;
            case 181 -> 155;
            case 182 -> 83;
            case 183 -> 27;
            case 184 -> 112;
            case 185 -> 182;
            case 186 -> 8;
            case 187 -> 170;
            case 188 -> 46;
            case 189 -> 211;
            case 190 -> 227;
            case 191 -> 51;
            case 192 -> 149;
            case 193 -> 185;
            case 194 -> 199;
            case 195 -> 135;
            case 196 -> 89;
            case 197 -> 239;
            case 198 -> 139;
            case 199 -> 75;
            case 200 -> 202;
            case 201 -> 110;
            case 202 -> 197;
            case 203 -> 213;
            case 204 -> 74;
            case 205 -> 200;
            case 206 -> 114;
            case 207 -> 129;
            case 208 -> 4;
            case 209 -> 250;
            case 210 -> 9;
            case 211 -> 189;
            case 212 -> 191;
            case 213 -> 183;
            case 214 -> 13;
            case 215 -> 122;
            case 216 -> 136;
            case 217 -> 71;
            case 218 -> 90;
            case 219 -> 174;
            case 220 -> 38;
            case 221 -> 208;
            case 222 -> 237;
            case 223 -> 76;
            case 224 -> 255;
            case 225 -> 69;
            case 226 -> 95;
            case 227 -> 169;
            case 228 -> 236;
            case 229 -> 133;
            case 230 -> 64;
            case 231 -> 121;
            case 232 -> 28;
            case 233 -> 162;
            case 234 -> 134;
            case 235 -> 109;
            case 236 -> 244;
            case 237 -> 53;
            case 238 -> 65;
            case 239 -> 125;
            case 240 -> 212;
            case 241 -> 217;
            case 242 -> 159;
            case 243 -> 138;
            case 244 -> 178;
            case 245 -> 249;
            case 246 -> 160;
            case 247 -> 119;
            case 248 -> 143;
            case 249 -> 19;
            case 250 -> 104;
            case 251 -> 113;
            case 252 -> 248;
            case 253 -> 26;
            case 254 -> 137;
            default -> 99;
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
}





