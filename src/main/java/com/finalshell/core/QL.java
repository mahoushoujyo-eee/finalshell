package com.finalshell.core;

import java.util.concurrent.ExecutionException;

public class QL {
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long e;

   public static void M(String[] param0) throws InterruptedException, ExecutionException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D82_2.Q ()Ljava/lang/String;
      // 03: sipush 29886
      // 06: ldc2_w 7826841748864805573
      // 09: invokestatic com/finalshell/core/QL.a (IJ)I
      // 0c: invokestatic java/util/concurrent/Executors.newFixedThreadPool (I)Ljava/util/concurrent/ExecutorService;
      // 0f: astore 2
      // 10: astore 1
      // 11: new java/util/ArrayList
      // 14: dup
      // 15: invokespecial java/util/ArrayList.<init> ()V
      // 18: astore 3
      // 19: bipush 0
      // 1a: istore 4
      // 1c: aload 1
      // 1d: ifnull 47
      // 20: bipush 4
      // 21: anewarray 46
      // 24: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/QL.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 2d: athrow
      // 2e: aload 2
      // 2f: invokedynamic run ()Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/finalshell/core/QL.lambda$0 ()V, ()V ]
      // 34: invokeinterface java/util/concurrent/ExecutorService.submit (Ljava/lang/Runnable;)Ljava/util/concurrent/Future; 2
      // 39: astore 5
      // 3b: aload 3
      // 3c: aload 5
      // 3e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 43: pop
      // 44: iinc 4 1
      // 47: iload 4
      // 49: sipush 6527
      // 4c: ldc2_w 8162298549557446405
      // 4f: invokestatic com/finalshell/core/QL.a (IJ)I
      // 52: if_icmplt 2e
      // 55: aload 3
      // 56: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 5b: astore 5
      // 5d: aload 1
      // 5e: ifnull 7c
      // 61: aload 5
      // 63: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/core/QL.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 6e: athrow
      // 6f: checkcast java/util/concurrent/Future
      // 72: astore 4
      // 74: aload 4
      // 76: invokeinterface java/util/concurrent/Future.get ()Ljava/lang/Object; 1
      // 7b: pop
      // 7c: aload 5
      // 7e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 83: ifne 61
      // 86: aload 2
      // 87: invokeinterface java/util/concurrent/ExecutorService.shutdown ()V 1
      // 8c: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 8f: aload 1
      // 90: ifnonnull 6f
      // 93: sipush -28610
      // 96: sipush -624
      // 99: invokestatic com/finalshell/core/QL.a (II)Ljava/lang/String;
      // 9c: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 9f: return
   }

   public static void lambda$0() {
      try {
         System.out.println(a(-28609, -27544) + Thread.currentThread().getName() + a(-28612, 11103));
         Thread.sleep(e);
      } catch (InterruptedException var1) {
         var1.printStackTrace();
      }
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -28610) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 48;
            case 1 -> 192;
            case 2 -> 209;
            case 3 -> 61;
            case 4 -> 25;
            case 5 -> 117;
            case 6 -> 244;
            case 7 -> 71;
            case 8 -> 142;
            case 9 -> 15;
            case 10 -> 124;
            case 11 -> 17;
            case 12 -> 202;
            case 13 -> 208;
            case 14 -> 254;
            case 15 -> 68;
            case 16 -> 26;
            case 17 -> 140;
            case 18 -> 195;
            case 19 -> 96;
            case 20 -> 53;
            case 21 -> 49;
            case 22 -> 95;
            case 23 -> 215;
            case 24 -> 10;
            case 25 -> 176;
            case 26 -> 130;
            case 27 -> 87;
            case 28 -> 35;
            case 29 -> 131;
            case 30 -> 196;
            case 31 -> 16;
            case 32 -> 57;
            case 33 -> 180;
            case 34 -> 107;
            case 35 -> 67;
            case 36 -> 145;
            case 37 -> 28;
            case 38 -> 19;
            case 39 -> 42;
            case 40 -> 18;
            case 41 -> 64;
            case 42 -> 38;
            case 43 -> 233;
            case 44 -> 82;
            case 45 -> 219;
            case 46 -> 222;
            case 47 -> 33;
            case 48 -> 81;
            case 49 -> 129;
            case 50 -> 177;
            case 51 -> 133;
            case 52 -> 116;
            case 53 -> 12;
            case 54 -> 36;
            case 55 -> 230;
            case 56 -> 188;
            case 57 -> 50;
            case 58 -> 191;
            case 59 -> 189;
            case 60 -> 122;
            case 61 -> 106;
            case 62 -> 144;
            case 63 -> 74;
            case 64 -> 148;
            case 65 -> 90;
            case 66 -> 152;
            case 67 -> 37;
            case 68 -> 99;
            case 69 -> 146;
            case 70 -> 121;
            case 71 -> 20;
            case 72 -> 242;
            case 73 -> 161;
            case 74 -> 9;
            case 75 -> 212;
            case 76 -> 166;
            case 77 -> 123;
            case 78 -> 14;
            case 79 -> 7;
            case 80 -> 109;
            case 81 -> 190;
            case 82 -> 245;
            case 83 -> 172;
            case 84 -> 29;
            case 85 -> 151;
            case 86 -> 27;
            case 87 -> 115;
            case 88 -> 39;
            case 89 -> 239;
            case 90 -> 135;
            case 91 -> 70;
            case 92 -> 66;
            case 93 -> 32;
            case 94 -> 247;
            case 95 -> 243;
            case 96 -> 13;
            case 97 -> 184;
            case 98 -> 58;
            case 99 -> 241;
            case 100 -> 47;
            case 101 -> 174;
            case 102 -> 171;
            case 103 -> 24;
            case 104 -> 186;
            case 105 -> 225;
            case 106 -> 200;
            case 107 -> 199;
            case 108 -> 56;
            case 109 -> 136;
            case 110 -> 162;
            case 111 -> 165;
            case 112 -> 132;
            case 113 -> 113;
            case 114 -> 100;
            case 115 -> 5;
            case 116 -> 213;
            case 117 -> 59;
            case 118 -> 31;
            case 119 -> 182;
            case 120 -> 236;
            case 121 -> 163;
            case 122 -> 0;
            case 123 -> 118;
            case 124 -> 204;
            case 125 -> 175;
            case 126 -> 251;
            case 127 -> 51;
            case 128 -> 226;
            case 129 -> 111;
            case 130 -> 234;
            case 131 -> 170;
            case 132 -> 44;
            case 133 -> 138;
            case 134 -> 11;
            case 135 -> 228;
            case 136 -> 40;
            case 137 -> 23;
            case 138 -> 97;
            case 139 -> 63;
            case 140 -> 65;
            case 141 -> 143;
            case 142 -> 201;
            case 143 -> 221;
            case 144 -> 101;
            case 145 -> 198;
            case 146 -> 30;
            case 147 -> 105;
            case 148 -> 187;
            case 149 -> 21;
            case 150 -> 98;
            case 151 -> 114;
            case 152 -> 154;
            case 153 -> 235;
            case 154 -> 86;
            case 155 -> 76;
            case 156 -> 55;
            case 157 -> 75;
            case 158 -> 237;
            case 159 -> 4;
            case 160 -> 229;
            case 161 -> 8;
            case 162 -> 203;
            case 163 -> 210;
            case 164 -> 102;
            case 165 -> 179;
            case 166 -> 84;
            case 167 -> 1;
            case 168 -> 224;
            case 169 -> 253;
            case 170 -> 137;
            case 171 -> 206;
            case 172 -> 231;
            case 173 -> 207;
            case 174 -> 60;
            case 175 -> 218;
            case 176 -> 157;
            case 177 -> 223;
            case 178 -> 6;
            case 179 -> 159;
            case 180 -> 79;
            case 181 -> 156;
            case 182 -> 104;
            case 183 -> 83;
            case 184 -> 216;
            case 185 -> 211;
            case 186 -> 91;
            case 187 -> 149;
            case 188 -> 173;
            case 189 -> 103;
            case 190 -> 255;
            case 191 -> 94;
            case 192 -> 158;
            case 193 -> 126;
            case 194 -> 249;
            case 195 -> 41;
            case 196 -> 3;
            case 197 -> 139;
            case 198 -> 34;
            case 199 -> 169;
            case 200 -> 89;
            case 201 -> 205;
            case 202 -> 22;
            case 203 -> 214;
            case 204 -> 193;
            case 205 -> 197;
            case 206 -> 93;
            case 207 -> 164;
            case 208 -> 178;
            case 209 -> 52;
            case 210 -> 246;
            case 211 -> 62;
            case 212 -> 232;
            case 213 -> 2;
            case 214 -> 72;
            case 215 -> 134;
            case 216 -> 167;
            case 217 -> 252;
            case 218 -> 150;
            case 219 -> 73;
            case 220 -> 78;
            case 221 -> 168;
            case 222 -> 125;
            case 223 -> 250;
            case 224 -> 88;
            case 225 -> 54;
            case 226 -> 120;
            case 227 -> 45;
            case 228 -> 80;
            case 229 -> 141;
            case 230 -> 238;
            case 231 -> 181;
            case 232 -> 227;
            case 233 -> 69;
            case 234 -> 110;
            case 235 -> 43;
            case 236 -> 160;
            case 237 -> 185;
            case 238 -> 220;
            case 239 -> 128;
            case 240 -> 155;
            case 241 -> 153;
            case 242 -> 147;
            case 243 -> 46;
            case 244 -> 119;
            case 245 -> 183;
            case 246 -> 248;
            case 247 -> 217;
            case 248 -> 92;
            case 249 -> 127;
            case 250 -> 108;
            case 251 -> 77;
            case 252 -> 240;
            case 253 -> 112;
            case 254 -> 85;
            default -> 194;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24187;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var15 = new String[3];
      int var13 = 0;
      String var12 = " Ó×\u001d\u0098ì\u0087Q\u0095Úhú/^¥\u008b\u0000%[µãðé/\u0005àÒgÚ&\u000b\u001b\râcÄ7×¹;,â";
      int var14 = " Ó×\u001d\u0098ì\u0087Q\u0095Úhú/^¥\u008b\u0000%[µãðé/\u0005àÒgÚ&\u000b\u001b\râcÄ7×¹;,â".length();
      char var11 = 24;
      int var10 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var12.substring(++var10, var10 + var11).toCharArray();
            int var10004 = var10003.length;
            int var16 = 0;
            byte var27 = 61;
            var10002 = var10003;
            int var18 = var10004;
            byte var31;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var31 = 61;
               var10006 = var16;
            } else {
               var27 = 61;
               var18 = var10004;
               if (var10004 <= var16) {
                  break label47;
               }

               var10005 = var10003;
               var31 = 61;
               var10006 = var16;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var31 ^ switch (var16 % 7) {
                  case 0 -> 58;
                  case 1 -> 81;
                  case 2 -> 11;
                  case 3 -> 22;
                  case 4 -> 12;
                  case 5 -> 82;
                  default -> 6;
               });
               var16++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var31 = var27;
               } else {
                  if (var18 <= var16) {
                     break;
                  }

                  var10005 = var10002;
                  var31 = var27;
                  var10006 = var16;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var20 = -1;
         var15[var13++] = var29;
         if ((var10 += var11) >= var14) {
            a = var15;
            b = new String[3];
            long var2 = 3620785152225336531L;
            long[] var8 = new long[2];
            int var5 = 0;
            String var6 = "se¯\u0090¬.ö$×\b\u0019¦{h\u009bÜ";
            int var7 = "se¯\u0090¬.ö$×\b\u0019¦{h\u009bÜ".length();
            byte var4 = 0;

            do {
               var20 = var4;
               var4 += 8;
               byte[] var9 = var6.substring(var20, var4).getBytes("ISO-8859-1");
               var20 = var5++;
               long var35 = (
                     ((long)var9[0] & 255L) << 56
                        | ((long)var9[1] & 255L) << 48
                        | ((long)var9[2] & 255L) << 40
                        | ((long)var9[3] & 255L) << 32
                        | ((long)var9[4] & 255L) << 24
                        | ((long)var9[5] & 255L) << 16
                        | ((long)var9[6] & 255L) << 8
                        | (long)var9[7] & 255L
                  )
                  ^ var2;
               byte var30 = -1;
               var8[var20] = var35;
            } while (var4 < var7);

            c = var8;
            d = new Integer[2];
            long var0 = 4182863905557583836L;
            long var26 = 4182863905557578836L ^ var0;
            byte var23 = -1;
            e = var26;
            return;
         }

         var11 = var12.charAt(var10);
      }
   }
}





