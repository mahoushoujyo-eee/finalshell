package com.finalshell.core;

import com.finalshell.ui.model.O0;
import com.finalshell.ui.panel.Ky4;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.AttributeKey;
import io.netty.util.ReferenceCountUtil;
import java.io.UnsupportedEncodingException;

public class PingClientHandler extends ChannelInboundHandlerAdapter {
   public static AttributeKey i;
   public static AttributeKey j;
   public XE_2 O = null;
   public ChannelHandlerContext P;
   public static String[] a;
   public static String[] b;

   static {
      __vfClinit__();
   }

   @Override
   public void channelActive(ChannelHandlerContext var1) throws Exception {
      this.P = var1;
      this.O = var1.channel().<XE_2>attr(i).get();
      var1.channel().<PingClientHandler>attr(j).set(this);
   }

   public void U() throws UnsupportedEncodingException {
      O0 var2 = new O0();
      int var10000 = XE_2.I();
      var2.C(a(-10971, 30472), a(-10969, -13406));
      var2.C(a(-10976, 20338), this.O.B$String());
      int var1 = var10000;
      var2.C(a(-10974, -3360), this.O.V$String());
      var2.C(a(-10970, 7679), this.O.r());
      byte[] var3 = var2.toString().getBytes(a(-10975, 8479));
      XU var4 = new XU(Ai2.f, var3);

      try {
         this.P.writeAndFlush(var4);
         if (var1 == 0) {
            Ky4.K(new String[2]);
         }
      } catch (UnsupportedEncodingException var5) {
         throw a(var5);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void channelRead(ChannelHandlerContext var1, Object var2) throws Exception {
      int var3 = XE_2.D();
      boolean var11 = false /* VF: Semaphore variable */;

      try {
         label49: {
            var11 = true;
            Channel var4 = var1.channel();
            XU var5 = (XU)var2;
            int var6 = var5.S();

            try {
               if (var3 != 0) {
                  var11 = false;
                  return;
               }

               if (var6 != Ai2.f) {
                  var11 = false;
                  break label49;
               }
            } catch (Exception var12) {
               throw a(var12);
            }

            O0 var7 = Ai2.L(var5);
            this.O.d(var5);
            var11 = false;
         }
      } finally {
         if (var11) {
            ReferenceCountUtil.release(var2);
         }
      }

      ReferenceCountUtil.release(var2);
   }

   @Override
   public void channelInactive(ChannelHandlerContext var1) throws Exception {
      this.O.a();
   }

   @Override
   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) throws Exception {
      var1.close();
      var2.printStackTrace();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -10973) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 76;
            case 1 -> 3;
            case 2 -> 158;
            case 3 -> 7;
            case 4 -> 16;
            case 5 -> 34;
            case 6 -> 163;
            case 7 -> 1;
            case 8 -> 74;
            case 9 -> 143;
            case 10 -> 196;
            case 11 -> 114;
            case 12 -> 15;
            case 13 -> 184;
            case 14 -> 36;
            case 15 -> 229;
            case 16 -> 206;
            case 17 -> 117;
            case 18 -> 137;
            case 19 -> 25;
            case 20 -> 141;
            case 21 -> 207;
            case 22 -> 13;
            case 23 -> 168;
            case 24 -> 4;
            case 25 -> 156;
            case 26 -> 21;
            case 27 -> 183;
            case 28 -> 215;
            case 29 -> 135;
            case 30 -> 52;
            case 31 -> 189;
            case 32 -> 125;
            case 33 -> 106;
            case 34 -> 144;
            case 35 -> 138;
            case 36 -> 40;
            case 37 -> 77;
            case 38 -> 185;
            case 39 -> 194;
            case 40 -> 72;
            case 41 -> 128;
            case 42 -> 216;
            case 43 -> 47;
            case 44 -> 177;
            case 45 -> 159;
            case 46 -> 200;
            case 47 -> 241;
            case 48 -> 64;
            case 49 -> 100;
            case 50 -> 198;
            case 51 -> 82;
            case 52 -> 19;
            case 53 -> 120;
            case 54 -> 165;
            case 55 -> 90;
            case 56 -> 123;
            case 57 -> 6;
            case 58 -> 227;
            case 59 -> 70;
            case 60 -> 56;
            case 61 -> 252;
            case 62 -> 175;
            case 63 -> 121;
            case 64 -> 48;
            case 65 -> 54;
            case 66 -> 103;
            case 67 -> 236;
            case 68 -> 108;
            case 69 -> 228;
            case 70 -> 66;
            case 71 -> 218;
            case 72 -> 8;
            case 73 -> 203;
            case 74 -> 89;
            case 75 -> 101;
            case 76 -> 139;
            case 77 -> 102;
            case 78 -> 27;
            case 79 -> 224;
            case 80 -> 245;
            case 81 -> 59;
            case 82 -> 22;
            case 83 -> 187;
            case 84 -> 181;
            case 85 -> 10;
            case 86 -> 182;
            case 87 -> 65;
            case 88 -> 247;
            case 89 -> 172;
            case 90 -> 239;
            case 91 -> 191;
            case 92 -> 30;
            case 93 -> 211;
            case 94 -> 251;
            case 95 -> 78;
            case 96 -> 119;
            case 97 -> 179;
            case 98 -> 230;
            case 99 -> 130;
            case 100 -> 253;
            case 101 -> 173;
            case 102 -> 237;
            case 103 -> 26;
            case 104 -> 240;
            case 105 -> 205;
            case 106 -> 62;
            case 107 -> 209;
            case 108 -> 223;
            case 109 -> 199;
            case 110 -> 41;
            case 111 -> 149;
            case 112 -> 212;
            case 113 -> 11;
            case 114 -> 153;
            case 115 -> 233;
            case 116 -> 244;
            case 117 -> 145;
            case 118 -> 154;
            case 119 -> 98;
            case 120 -> 80;
            case 121 -> 23;
            case 122 -> 60;
            case 123 -> 93;
            case 124 -> 92;
            case 125 -> 146;
            case 126 -> 20;
            case 127 -> 85;
            case 128 -> 192;
            case 129 -> 104;
            case 130 -> 148;
            case 131 -> 133;
            case 132 -> 35;
            case 133 -> 249;
            case 134 -> 67;
            case 135 -> 250;
            case 136 -> 171;
            case 137 -> 197;
            case 138 -> 42;
            case 139 -> 83;
            case 140 -> 162;
            case 141 -> 217;
            case 142 -> 170;
            case 143 -> 134;
            case 144 -> 188;
            case 145 -> 160;
            case 146 -> 157;
            case 147 -> 213;
            case 148 -> 68;
            case 149 -> 55;
            case 150 -> 235;
            case 151 -> 43;
            case 152 -> 91;
            case 153 -> 242;
            case 154 -> 208;
            case 155 -> 28;
            case 156 -> 51;
            case 157 -> 132;
            case 158 -> 176;
            case 159 -> 167;
            case 160 -> 131;
            case 161 -> 45;
            case 162 -> 49;
            case 163 -> 53;
            case 164 -> 31;
            case 165 -> 195;
            case 166 -> 44;
            case 167 -> 152;
            case 168 -> 254;
            case 169 -> 69;
            case 170 -> 210;
            case 171 -> 88;
            case 172 -> 124;
            case 173 -> 186;
            case 174 -> 140;
            case 175 -> 37;
            case 176 -> 214;
            case 177 -> 150;
            case 178 -> 75;
            case 179 -> 234;
            case 180 -> 222;
            case 181 -> 109;
            case 182 -> 226;
            case 183 -> 232;
            case 184 -> 113;
            case 185 -> 151;
            case 186 -> 17;
            case 187 -> 58;
            case 188 -> 107;
            case 189 -> 86;
            case 190 -> 63;
            case 191 -> 225;
            case 192 -> 50;
            case 193 -> 231;
            case 194 -> 46;
            case 195 -> 0;
            case 196 -> 202;
            case 197 -> 174;
            case 198 -> 39;
            case 199 -> 33;
            case 200 -> 204;
            case 201 -> 193;
            case 202 -> 219;
            case 203 -> 246;
            case 204 -> 12;
            case 205 -> 248;
            case 206 -> 122;
            case 207 -> 166;
            case 208 -> 81;
            case 209 -> 255;
            case 210 -> 169;
            case 211 -> 220;
            case 212 -> 57;
            case 213 -> 95;
            case 214 -> 29;
            case 215 -> 9;
            case 216 -> 110;
            case 217 -> 14;
            case 218 -> 115;
            case 219 -> 147;
            case 220 -> 97;
            case 221 -> 32;
            case 222 -> 73;
            case 223 -> 18;
            case 224 -> 221;
            case 225 -> 87;
            case 226 -> 178;
            case 227 -> 142;
            case 228 -> 161;
            case 229 -> 112;
            case 230 -> 79;
            case 231 -> 127;
            case 232 -> 5;
            case 233 -> 155;
            case 234 -> 126;
            case 235 -> 164;
            case 236 -> 243;
            case 237 -> 129;
            case 238 -> 84;
            case 239 -> 180;
            case 240 -> 71;
            case 241 -> 190;
            case 242 -> 238;
            case 243 -> 61;
            case 244 -> 201;
            case 245 -> 24;
            case 246 -> 99;
            case 247 -> 118;
            case 248 -> 94;
            case 249 -> 105;
            case 250 -> 96;
            case 251 -> 116;
            case 252 -> 136;
            case 253 -> 111;
            case 254 -> 2;
            default -> 38;
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
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "æ®\u007ftæk3\u00adS}\u0080\u0001Û\u0004¼Ç`+\u0005#J8»¶\u0011\nRx\u009aqà\u0003$á´v\nÏ\u008f4¾·\u0013uÕ\u001e9T\u0098+ñ¢ÏR&ë\u0011k\u0084¶\u001dH\bIÌ\u0010I|\u009a¢\u0006";
      int var4 = "æ®\u007ftæk3\u00adS}\u0080\u0001Û\u0004¼Ç`+\u0005#J8»¶\u0011\nRx\u009aqà\u0003$á´v\nÏ\u008f4¾·\u0013uÕ\u001e9T\u0098+ñ¢ÏR&ë\u0011k\u0084¶\u001dH\bIÌ\u0010I|\u009a¢\u0006"
         .length();
      char var1 = '\r';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 7;
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
                     case 0 -> 90;
                     case 1 -> 52;
                     case 2 -> 77;
                     case 3 -> 68;
                     case 4 -> 109;
                     case 5 -> 55;
                     default -> 78;
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
                     b = new String[8];
                     i = AttributeKey.valueOf(a(-10972, 25681));
                     j = AttributeKey.valueOf(a(-10973, 11058));
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

                  var2 = "=ÜÝÀ[±Ùb\n²È¿#\bç{\u001fc\u0083";
                  var4 = "=ÜÝÀ[±Ùb\n²È¿#\bç{\u001fc\u0083".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 117;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





