package com.finalshell.connection;

import com.finalshell.core.CU;
import com.finalshell.core.Fs2;
import com.finalshell.core.Qm2;
import com.finalshell.ui.panel.Ky4;
import java.io.InputStream;
import java.io.OutputStream;

public class Connect {
   int q = -1;
   boolean f = false;
   byte[] g;
   int W;
   int U;
   int M = -1;
   Fs2 l;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public void f(InputStream param1, CU param2, int param3, Connect param4) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 6
      // 03: invokestatic com/finalshell/core/Qm2.J ()[Lcom/finalshell/ui/panel/Ky4;
      // 06: sipush 8587
      // 09: ldc2_w 5394582921031408935
      // 0c: invokestatic com/finalshell/connection/Connect.a (IJ)I
      // 0f: newarray 8
      // 11: astore 7
      // 13: bipush 0
      // 14: istore 8
      // 16: astore 5
      // 18: aload 5
      // 1a: ifnonnull 3f
      // 1d: aload 0
      // 1e: bipush 1
      // 1f: putfield com/finalshell/connection/Connect.f Z
      // 22: goto 29
      // 25: invokestatic com/finalshell/connection/Connect.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: iload 8
      // 2b: aload 5
      // 2d: ifnull 34
      // 30: ifne 36
      // 33: bipush 1
      // 34: istore 8
      // 36: aload 2
      // 37: aload 7
      // 39: bipush 0
      // 3a: iload 6
      // 3c: invokevirtual com/finalshell/core/CU.V ([BII)V
      // 3f: aload 1
      // 40: aload 7
      // 42: invokevirtual java/io/InputStream.read ([B)I
      // 45: dup
      // 46: istore 6
      // 48: ifgt 1d
      // 4b: aload 5
      // 4d: ifnull 29
      // 50: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   void x(long var1, int var3, int var4) {
      long var14;
      Ky4[] var10000 = Qm2.J();
      long var6 = (long)(1000.0F * (float)var4 / (float)var3);
      Ky4[] var5 = var10000;
      long var8 = System.currentTimeMillis() - var1;

      label30: {
         long var10001;
         label29: {
            try {
               var14 = var8;
               var10001 = var6;
               if (var5 == null) {
                  break label29;
               }

               if (var8 >= var6) {
                  return;
               }
            } catch (InterruptedException var13) {
               throw a(var13);
            }

            try {
               var14 = var6;
               var10001 = var8;
            } catch (InterruptedException var12) {
      int var15;
               var15 = var12;
               boolean var16 = false;
               break label30;
            }
         }

         try {
            Thread.sleep(var14 - var10001);
            return;
         } catch (InterruptedException var11) {
      int var15;
            var15 = var11;
            boolean var17 = false;
         }
      }

      InterruptedException var10 = var15;
      var10.printStackTrace();
   }

   public void S(InputStream param1, OutputStream param2, int param3, Qm2 param4) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: sipush 12310
      // 03: bipush 0
      // 04: istore 6
      // 06: ldc2_w 4116637390755646651
      // 09: invokestatic com/finalshell/connection/Connect.a (IJ)I
      // 0c: newarray 8
      // 0e: astore 7
      // 10: invokestatic com/finalshell/core/Qm2.J ()[Lcom/finalshell/ui/panel/Ky4;
      // 13: bipush 0
      // 14: istore 8
      // 16: bipush 0
      // 17: istore 9
      // 19: bipush 0
      // 1a: istore 10
      // 1c: bipush 0
      // 1d: istore 11
      // 1f: astore 5
      // 21: aload 5
      // 23: ifnonnull d8
      // 26: aload 0
      // 27: dup
      // 28: getfield com/finalshell/connection/Connect.U I
      // 2b: iload 6
      // 2d: iadd
      // 2e: putfield com/finalshell/connection/Connect.U I
      // 31: goto 38
      // 34: invokestatic com/finalshell/connection/Connect.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: iload 9
      // 3a: aload 5
      // 3c: ifnull 55
      // 3f: ifne 51
      // 42: aload 0
      // 43: aload 7
      // 45: putfield com/finalshell/connection/Connect.g [B
      // 48: aload 0
      // 49: iload 6
      // 4b: putfield com/finalshell/connection/Connect.W I
      // 4e: bipush 1
      // 4f: istore 9
      // 51: aload 0
      // 52: getfield com/finalshell/connection/Connect.M I
      // 55: aload 5
      // 57: ifnull c6
      // 5a: ifle bb
      // 5d: goto 64
      // 60: invokestatic com/finalshell/connection/Connect.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63: athrow
      // 64: aload 0
      // 65: getfield com/finalshell/connection/Connect.l Lcom/finalshell/core/Fs2;
      // 68: ifnull bb
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/connection/Connect.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: iload 11
      // 74: aload 5
      // 76: ifnull c6
      // 79: goto 80
      // 7c: invokestatic com/finalshell/connection/Connect.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: ifne bb
      // 83: goto 8a
      // 86: invokestatic com/finalshell/connection/Connect.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89: athrow
      // 8a: bipush 1
      // 8b: istore 11
      // 8d: aload 0
      // 8e: getfield com/finalshell/connection/Connect.M I
      // 91: sipush 22461
      // 94: sipush -11881
      // 97: invokestatic com/finalshell/connection/Connect.a (II)Ljava/lang/String;
      // 9a: swap
      // 9b: sipush 22460
      // 9e: sipush 2293
      // a1: invokestatic com/finalshell/connection/Connect.a (II)Ljava/lang/String;
      // a4: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // a9: astore 12
      // ab: aload 0
      // ac: getfield com/finalshell/connection/Connect.l Lcom/finalshell/core/Fs2;
      // af: aload 12
      // b1: invokeinterface com/finalshell/core/Fs2.V (Ljava/lang/String;)V 2
      // b6: aload 12
      // b8: invokestatic com/finalshell/core/Lx4_2.u (Ljava/lang/String;)V
      // bb: aload 2
      // bc: aload 7
      // be: bipush 0
      // bf: iload 6
      // c1: invokevirtual java/io/OutputStream.write ([BII)V
      // c4: iload 8
      // c6: aload 5
      // c8: ifnull e5
      // cb: ifne d8
      // ce: goto d5
      // d1: invokestatic com/finalshell/connection/Connect.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d4: athrow
      // d5: bipush 1
      // d6: istore 8
      // d8: aload 1
      // d9: aload 7
      // db: bipush 0
      // dc: aload 7
      // de: arraylength
      // df: invokevirtual java/io/InputStream.read ([BII)I
      // e2: dup
      // e3: istore 6
      // e5: ifgt 26
      // e8: aload 5
      // ea: ifnull 38
      // ed: return
   }

   public int P() {
      return this.U;
   }

   public void i(int var1) {
      this.M = var1;
   }

   public Fs2 L() {
      return this.l;
   }

   public void T(Fs2 var1) {
      this.l = var1;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 22460) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 5;
            case 1 -> 169;
            case 2 -> 222;
            case 3 -> 179;
            case 4 -> 0;
            case 5 -> 163;
            case 6 -> 252;
            case 7 -> 59;
            case 8 -> 236;
            case 9 -> 51;
            case 10 -> 60;
            case 11 -> 55;
            case 12 -> 178;
            case 13 -> 121;
            case 14 -> 109;
            case 15 -> 11;
            case 16 -> 12;
            case 17 -> 41;
            case 18 -> 137;
            case 19 -> 125;
            case 20 -> 220;
            case 21 -> 141;
            case 22 -> 39;
            case 23 -> 66;
            case 24 -> 176;
            case 25 -> 239;
            case 26 -> 203;
            case 27 -> 247;
            case 28 -> 38;
            case 29 -> 2;
            case 30 -> 213;
            case 31 -> 71;
            case 32 -> 162;
            case 33 -> 135;
            case 34 -> 68;
            case 35 -> 139;
            case 36 -> 16;
            case 37 -> 84;
            case 38 -> 81;
            case 39 -> 120;
            case 40 -> 111;
            case 41 -> 216;
            case 42 -> 64;
            case 43 -> 240;
            case 44 -> 234;
            case 45 -> 23;
            case 46 -> 147;
            case 47 -> 113;
            case 48 -> 7;
            case 49 -> 228;
            case 50 -> 72;
            case 51 -> 183;
            case 52 -> 43;
            case 53 -> 164;
            case 54 -> 1;
            case 55 -> 255;
            case 56 -> 229;
            case 57 -> 159;
            case 58 -> 9;
            case 59 -> 202;
            case 60 -> 177;
            case 61 -> 89;
            case 62 -> 32;
            case 63 -> 122;
            case 64 -> 184;
            case 65 -> 148;
            case 66 -> 145;
            case 67 -> 58;
            case 68 -> 26;
            case 69 -> 235;
            case 70 -> 108;
            case 71 -> 253;
            case 72 -> 134;
            case 73 -> 161;
            case 74 -> 107;
            case 75 -> 46;
            case 76 -> 175;
            case 77 -> 57;
            case 78 -> 224;
            case 79 -> 231;
            case 80 -> 254;
            case 81 -> 199;
            case 82 -> 237;
            case 83 -> 123;
            case 84 -> 52;
            case 85 -> 106;
            case 86 -> 33;
            case 87 -> 10;
            case 88 -> 227;
            case 89 -> 152;
            case 90 -> 127;
            case 91 -> 218;
            case 92 -> 20;
            case 93 -> 219;
            case 94 -> 77;
            case 95 -> 186;
            case 96 -> 97;
            case 97 -> 91;
            case 98 -> 6;
            case 99 -> 36;
            case 100 -> 223;
            case 101 -> 25;
            case 102 -> 87;
            case 103 -> 65;
            case 104 -> 168;
            case 105 -> 174;
            case 106 -> 144;
            case 107 -> 142;
            case 108 -> 211;
            case 109 -> 14;
            case 110 -> 246;
            case 111 -> 4;
            case 112 -> 251;
            case 113 -> 27;
            case 114 -> 130;
            case 115 -> 126;
            case 116 -> 30;
            case 117 -> 79;
            case 118 -> 225;
            case 119 -> 96;
            case 120 -> 193;
            case 121 -> 206;
            case 122 -> 29;
            case 123 -> 230;
            case 124 -> 197;
            case 125 -> 165;
            case 126 -> 187;
            case 127 -> 92;
            case 128 -> 241;
            case 129 -> 189;
            case 130 -> 62;
            case 131 -> 166;
            case 132 -> 76;
            case 133 -> 114;
            case 134 -> 136;
            case 135 -> 182;
            case 136 -> 19;
            case 137 -> 82;
            case 138 -> 149;
            case 139 -> 103;
            case 140 -> 3;
            case 141 -> 70;
            case 142 -> 112;
            case 143 -> 54;
            case 144 -> 21;
            case 145 -> 181;
            case 146 -> 158;
            case 147 -> 205;
            case 148 -> 115;
            case 149 -> 250;
            case 150 -> 132;
            case 151 -> 155;
            case 152 -> 99;
            case 153 -> 73;
            case 154 -> 232;
            case 155 -> 100;
            case 156 -> 8;
            case 157 -> 170;
            case 158 -> 190;
            case 159 -> 83;
            case 160 -> 48;
            case 161 -> 45;
            case 162 -> 42;
            case 163 -> 138;
            case 164 -> 104;
            case 165 -> 24;
            case 166 -> 192;
            case 167 -> 93;
            case 168 -> 86;
            case 169 -> 22;
            case 170 -> 95;
            case 171 -> 140;
            case 172 -> 74;
            case 173 -> 119;
            case 174 -> 53;
            case 175 -> 34;
            case 176 -> 56;
            case 177 -> 196;
            case 178 -> 238;
            case 179 -> 209;
            case 180 -> 69;
            case 181 -> 185;
            case 182 -> 50;
            case 183 -> 245;
            case 184 -> 226;
            case 185 -> 151;
            case 186 -> 208;
            case 187 -> 133;
            case 188 -> 102;
            case 189 -> 49;
            case 190 -> 221;
            case 191 -> 88;
            case 192 -> 63;
            case 193 -> 249;
            case 194 -> 61;
            case 195 -> 31;
            case 196 -> 40;
            case 197 -> 195;
            case 198 -> 243;
            case 199 -> 13;
            case 200 -> 98;
            case 201 -> 15;
            case 202 -> 90;
            case 203 -> 143;
            case 204 -> 180;
            case 205 -> 18;
            case 206 -> 172;
            case 207 -> 75;
            case 208 -> 37;
            case 209 -> 124;
            case 210 -> 47;
            case 211 -> 198;
            case 212 -> 150;
            case 213 -> 80;
            case 214 -> 201;
            case 215 -> 167;
            case 216 -> 105;
            case 217 -> 28;
            case 218 -> 188;
            case 219 -> 131;
            case 220 -> 78;
            case 221 -> 207;
            case 222 -> 67;
            case 223 -> 154;
            case 224 -> 35;
            case 225 -> 248;
            case 226 -> 146;
            case 227 -> 214;
            case 228 -> 17;
            case 229 -> 210;
            case 230 -> 160;
            case 231 -> 129;
            case 232 -> 85;
            case 233 -> 242;
            case 234 -> 200;
            case 235 -> 156;
            case 236 -> 117;
            case 237 -> 191;
            case 238 -> 171;
            case 239 -> 194;
            case 240 -> 217;
            case 241 -> 118;
            case 242 -> 101;
            case 243 -> 212;
            case 244 -> 157;
            case 245 -> 128;
            case 246 -> 116;
            case 247 -> 204;
            case 248 -> 153;
            case 249 -> 233;
            case 250 -> 173;
            case 251 -> 94;
            case 252 -> 110;
            case 253 -> 215;
            case 254 -> 244;
            default -> 44;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31917;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "輱掵打剂\u0002窱卫";
      int var12 = "輱掵打剂\u0002窱卫".length();
      char var9 = 4;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 33;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 33;
               var10006 = var14;
            } else {
               var23 = 33;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 33;
               var10006 = var14;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var27 ^ switch (var14 % 7) {
                  case 0 -> 32;
                  case 1 -> 48;
                  case 2 -> 97;
                  case 3 -> 121;
                  case 4 -> 42;
                  case 5 -> 16;
                  default -> 99;
               });
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var13[var11++] = var25;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[2];
            long var0 = 6481301779687671382L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "_Ó\u0096±upÉ\u0005E½üæ«\u0012Ëq";
            int var5 = "_Ó\u0096±upÉ\u0005E½üæ«\u0012Ëq".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
               var18 = var3++;
               long var31 = (
                     ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L
                  )
                  ^ var0;
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            c = var6;
            d = new Integer[2];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }
}





