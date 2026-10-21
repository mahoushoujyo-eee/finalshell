package com.finalshell.task;

public class Kf2 implements Runnable {
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long e;

   Kf2() {
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/BN3.Z ()I
      // 03: istore 1
      // 04: bipush 2
      // 05: invokestatic com/finalshell/core/BN3.E (I)V
      // 08: getstatic com/finalshell/core/BN3.V Lcom/finalshell/core/XJ_2;
      // 0b: sipush 17924
      // 0e: ldc2_w 3341613817306438295
      // 11: invokestatic com/finalshell/task/Kf2.a (IJ)I
      // 14: invokevirtual com/finalshell/core/XJ_2.V (I)V
      // 17: sipush 17061
      // 1a: getstatic com/finalshell/core/BN3.V Lcom/finalshell/core/XJ_2;
      // 1d: invokevirtual com/finalshell/core/XJ_2.z ()V
      // 20: ldc2_w 7162711629974134327
      // 23: invokestatic com/finalshell/task/Kf2.a (IJ)I
      // 26: newarray 8
      // 28: astore 2
      // 29: getstatic com/finalshell/core/BN3.J Ljava/io/InputStream;
      // 2c: aload 2
      // 2d: invokevirtual java/io/InputStream.read ([B)I
      // 30: istore 3
      // 31: invokestatic java/lang/System.currentTimeMillis ()J
      // 34: invokestatic com/finalshell/core/BS3.F ()J
      // 37: lsub
      // 38: lstore 4
      // 3a: iload 3
      // 3b: iload 1
      // 3c: ifeq 76
      // 3f: sipush 17294
      // 42: ldc2_w 1945386217677381407
      // 45: invokestatic com/finalshell/task/Kf2.a (IJ)I
      // 48: if_icmpeq 70
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/task/Kf2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 51: athrow
      // 52: sipush -4048
      // 55: sipush 5093
      // 58: invokestatic com/finalshell/task/Kf2.a (II)Ljava/lang/String;
      // 5b: bipush 1
      // 5c: anewarray 4
      // 5f: dup
      // 60: bipush 0
      // 61: iload 3
      // 62: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 65: aastore
      // 66: invokestatic com/finalshell/core/BN3.Z (Ljava/lang/String;[Ljava/lang/Object;)V
      // 69: goto 70
      // 6c: invokestatic com/finalshell/task/Kf2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 6f: athrow
      // 70: lload 4
      // 72: getstatic com/finalshell/task/Kf2.e J
      // 75: lcmp
      // 76: ifge 98
      // 79: sipush -4047
      // 7c: sipush -23071
      // 7f: invokestatic com/finalshell/task/Kf2.a (II)Ljava/lang/String;
      // 82: bipush 1
      // 83: anewarray 4
      // 86: dup
      // 87: bipush 0
      // 88: lload 4
      // 8a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8d: aastore
      // 8e: invokestatic com/finalshell/core/BN3.Z (Ljava/lang/String;[Ljava/lang/Object;)V
      // 91: goto 98
      // 94: invokestatic com/finalshell/task/Kf2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 97: athrow
      // 98: goto c9
      // 9b: astore 2
      // 9c: goto c9
      // 9f: astore 2
      // a0: iload 1
      // a1: ifeq c3
      // a4: invokestatic com/finalshell/core/BS3.m ()Ljava/lang/Exception;
      // a7: ifnonnull bd
      // aa: goto b1
      // ad: invokestatic com/finalshell/task/Kf2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // b0: athrow
      // b1: aload 2
      // b2: invokestatic com/finalshell/core/BS3.w (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b5: pop
      // b6: goto bd
      // b9: invokestatic com/finalshell/task/Kf2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // bc: athrow
      // bd: invokestatic com/finalshell/core/BS3.G ()Ljava/lang/Thread;
      // c0: invokevirtual java/lang/Thread.interrupt ()V
      // c3: invokestatic com/finalshell/core/BS3.D ()Ljava/lang/Thread;
      // c6: invokevirtual java/lang/Thread.interrupt ()V
      // c9: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -4048) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 156;
               break;
            case 1:
               var10000 = 52;
               break;
            case 2:
               var10000 = 192;
               break;
            case 3:
               var10000 = 62;
               break;
            case 4:
               var10000 = 78;
               break;
            case 5:
               var10000 = 128;
               break;
            case 6:
               var10000 = 236;
               break;
            case 7:
               var10000 = 231;
               break;
            case 8:
               var10000 = 249;
               break;
            case 9:
               var10000 = 59;
               break;
            case 10:
               var10000 = 0;
               break;
            case 11:
               var10000 = 229;
               break;
            case 12:
               var10000 = 31;
               break;
            case 13:
               var10000 = 69;
               break;
            case 14:
               var10000 = 44;
               break;
            case 15:
               var10000 = 111;
               break;
            case 16:
               var10000 = 104;
               break;
            case 17:
               var10000 = 185;
               break;
            case 18:
               var10000 = 218;
               break;
            case 19:
               var10000 = 154;
               break;
            case 20:
               var10000 = 238;
               break;
            case 21:
               var10000 = 189;
               break;
            case 22:
               var10000 = 15;
               break;
            case 23:
               var10000 = 83;
               break;
            case 24:
               var10000 = 234;
               break;
            case 25:
               var10000 = 222;
               break;
            case 26:
               var10000 = 12;
               break;
            case 27:
               var10000 = 230;
               break;
            case 28:
               var10000 = 17;
               break;
            case 29:
               var10000 = 120;
               break;
            case 30:
               var10000 = 109;
               break;
            case 31:
               var10000 = 75;
               break;
            case 32:
               var10000 = 125;
               break;
            case 33:
               var10000 = 169;
               break;
            case 34:
               var10000 = 138;
               break;
            case 35:
               var10000 = 172;
               break;
            case 36:
               var10000 = 143;
               break;
            case 37:
               var10000 = 157;
               break;
            case 38:
               var10000 = 253;
               break;
            case 39:
               var10000 = 84;
               break;
            case 40:
               var10000 = 105;
               break;
            case 41:
               var10000 = 101;
               break;
            case 42:
               var10000 = 100;
               break;
            case 43:
               var10000 = 132;
               break;
            case 44:
               var10000 = 141;
               break;
            case 45:
               var10000 = 87;
               break;
            case 46:
               var10000 = 150;
               break;
            case 47:
               var10000 = 166;
               break;
            case 48:
               var10000 = 202;
               break;
            case 49:
               var10000 = 174;
               break;
            case 50:
               var10000 = 72;
               break;
            case 51:
               var10000 = 224;
               break;
            case 52:
               var10000 = 81;
               break;
            case 53:
               var10000 = 98;
               break;
            case 54:
               var10000 = 14;
               break;
            case 55:
               var10000 = 161;
               break;
            case 56:
               var10000 = 19;
               break;
            case 57:
               var10000 = 184;
               break;
            case 58:
               var10000 = 25;
               break;
            case 59:
               var10000 = 68;
               break;
            case 60:
               var10000 = 221;
               break;
            case 61:
               var10000 = 136;
               break;
            case 62:
               var10000 = 176;
               break;
            case 63:
               var10000 = 210;
               break;
            case 64:
               var10000 = 46;
               break;
            case 65:
               var10000 = 103;
               break;
            case 66:
               var10000 = 90;
               break;
            case 67:
               var10000 = 88;
               break;
            case 68:
               var10000 = 144;
               break;
            case 69:
               var10000 = 85;
               break;
            case 70:
               var10000 = 48;
               break;
            case 71:
               var10000 = 216;
               break;
            case 72:
               var10000 = 247;
               break;
            case 73:
               var10000 = 134;
               break;
            case 74:
               var10000 = 207;
               break;
            case 75:
               var10000 = 243;
               break;
            case 76:
               var10000 = 55;
               break;
            case 77:
               var10000 = 3;
               break;
            case 78:
               var10000 = 171;
               break;
            case 79:
               var10000 = 149;
               break;
            case 80:
               var10000 = 89;
               break;
            case 81:
               var10000 = 173;
               break;
            case 82:
               var10000 = 58;
               break;
            case 83:
               var10000 = 254;
               break;
            case 84:
               var10000 = 42;
               break;
            case 85:
               var10000 = 80;
               break;
            case 86:
               var10000 = 167;
               break;
            case 87:
               var10000 = 30;
               break;
            case 88:
               var10000 = 187;
               break;
            case 89:
               var10000 = 203;
               break;
            case 90:
               var10000 = 191;
               break;
            case 91:
               var10000 = 237;
               break;
            case 92:
               var10000 = 79;
               break;
            case 93:
               var10000 = 240;
               break;
            case 94:
               var10000 = 5;
               break;
            case 95:
               var10000 = 146;
               break;
            case 96:
               var10000 = 248;
               break;
            case 97:
               var10000 = 122;
               break;
            case 98:
               var10000 = 180;
               break;
            case 99:
               var10000 = 223;
               break;
            case 100:
               var10000 = 40;
               break;
            case 101:
               var10000 = 117;
               break;
            case 102:
               var10000 = 235;
               break;
            case 103:
               var10000 = 67;
               break;
            case 104:
               var10000 = 200;
               break;
            case 105:
               var10000 = 196;
               break;
            case 106:
               var10000 = 204;
               break;
            case 107:
               var10000 = 94;
               break;
            case 108:
               var10000 = 57;
               break;
            case 109:
               var10000 = 9;
               break;
            case 110:
               var10000 = 8;
               break;
            case 111:
               var10000 = 54;
               break;
            case 112:
               var10000 = 13;
               break;
            case 113:
               var10000 = 170;
               break;
            case 114:
               var10000 = 28;
               break;
            case 115:
               var10000 = 151;
               break;
            case 116:
               var10000 = 246;
               break;
            case 117:
               var10000 = 227;
               break;
            case 118:
               var10000 = 95;
               break;
            case 119:
               var10000 = 93;
               break;
            case 120:
               var10000 = 38;
               break;
            case 121:
               var10000 = 39;
               break;
            case 122:
               var10000 = 179;
               break;
            case 123:
               var10000 = 165;
               break;
            case 124:
               var10000 = 163;
               break;
            case 125:
               var10000 = 10;
               break;
            case 126:
               var10000 = 96;
               break;
            case 127:
               var10000 = 73;
               break;
            case 128:
               var10000 = 139;
               break;
            case 129:
               var10000 = 242;
               break;
            case 130:
               var10000 = 11;
               break;
            case 131:
               var10000 = 115;
               break;
            case 132:
               var10000 = 220;
               break;
            case 133:
               var10000 = 70;
               break;
            case 134:
               var10000 = 155;
               break;
            case 135:
               var10000 = 228;
               break;
            case 136:
               var10000 = 153;
               break;
            case 137:
               var10000 = 66;
               break;
            case 138:
               var10000 = 20;
               break;
            case 139:
               var10000 = 99;
               break;
            case 140:
               var10000 = 251;
               break;
            case 141:
               var10000 = 212;
               break;
            case 142:
               var10000 = 16;
               break;
            case 143:
               var10000 = 199;
               break;
            case 144:
               var10000 = 43;
               break;
            case 145:
               var10000 = 32;
               break;
            case 146:
               var10000 = 92;
               break;
            case 147:
               var10000 = 22;
               break;
            case 148:
               var10000 = 244;
               break;
            case 149:
               var10000 = 182;
               break;
            case 150:
               var10000 = 126;
               break;
            case 151:
               var10000 = 137;
               break;
            case 152:
               var10000 = 209;
               break;
            case 153:
               var10000 = 206;
               break;
            case 154:
               var10000 = 219;
               break;
            case 155:
               var10000 = 116;
               break;
            case 156:
               var10000 = 112;
               break;
            case 157:
               var10000 = 183;
               break;
            case 158:
               var10000 = 181;
               break;
            case 159:
               var10000 = 214;
               break;
            case 160:
               var10000 = 64;
               break;
            case 161:
               var10000 = 63;
               break;
            case 162:
               var10000 = 129;
               break;
            case 163:
               var10000 = 226;
               break;
            case 164:
               var10000 = 18;
               break;
            case 165:
               var10000 = 164;
               break;
            case 166:
               var10000 = 188;
               break;
            case 167:
               var10000 = 127;
               break;
            case 168:
               var10000 = 33;
               break;
            case 169:
               var10000 = 29;
               break;
            case 170:
               var10000 = 123;
               break;
            case 171:
               var10000 = 110;
               break;
            case 172:
               var10000 = 113;
               break;
            case 173:
               var10000 = 114;
               break;
            case 174:
               var10000 = 82;
               break;
            case 175:
               var10000 = 86;
               break;
            case 176:
               var10000 = 45;
               break;
            case 177:
               var10000 = 162;
               break;
            case 178:
               var10000 = 4;
               break;
            case 179:
               var10000 = 190;
               break;
            case 180:
               var10000 = 50;
               break;
            case 181:
               var10000 = 121;
               break;
            case 182:
               var10000 = 211;
               break;
            case 183:
               var10000 = 130;
               break;
            case 184:
               var10000 = 245;
               break;
            case 185:
               var10000 = 195;
               break;
            case 186:
               var10000 = 91;
               break;
            case 187:
               var10000 = 158;
               break;
            case 188:
               var10000 = 34;
               break;
            case 189:
               var10000 = 160;
               break;
            case 190:
               var10000 = 107;
               break;
            case 191:
               var10000 = 71;
               break;
            case 192:
               var10000 = 61;
               break;
            case 193:
               var10000 = 37;
               break;
            case 194:
               var10000 = 133;
               break;
            case 195:
               var10000 = 208;
               break;
            case 196:
               var10000 = 186;
               break;
            case 197:
               var10000 = 255;
               break;
            case 198:
               var10000 = 152;
               break;
            case 199:
               var10000 = 51;
               break;
            case 200:
               var10000 = 252;
               break;
            case 201:
               var10000 = 106;
               break;
            case 202:
               var10000 = 205;
               break;
            case 203:
               var10000 = 177;
               break;
            case 204:
               var10000 = 49;
               break;
            case 205:
               var10000 = 36;
               break;
            case 206:
               var10000 = 47;
               break;
            case 207:
               var10000 = 140;
               break;
            case 208:
               var10000 = 27;
               break;
            case 209:
               var10000 = 41;
               break;
            case 210:
               var10000 = 74;
               break;
            case 211:
               var10000 = 178;
               break;
            case 212:
               var10000 = 198;
               break;
            case 213:
               var10000 = 213;
               break;
            case 214:
               var10000 = 7;
               break;
            case 215:
               var10000 = 23;
               break;
            case 216:
               var10000 = 118;
               break;
            case 217:
               var10000 = 159;
               break;
            case 218:
               var10000 = 102;
               break;
            case 219:
               var10000 = 24;
               break;
            case 220:
               var10000 = 76;
               break;
            case 221:
               var10000 = 175;
               break;
            case 222:
               var10000 = 239;
               break;
            case 223:
               var10000 = 60;
               break;
            case 224:
               var10000 = 65;
               break;
            case 225:
               var10000 = 21;
               break;
            case 226:
               var10000 = 197;
               break;
            case 227:
               var10000 = 145;
               break;
            case 228:
               var10000 = 131;
               break;
            case 229:
               var10000 = 250;
               break;
            case 230:
               var10000 = 241;
               break;
            case 231:
               var10000 = 201;
               break;
            case 232:
               var10000 = 193;
               break;
            case 233:
               var10000 = 168;
               break;
            case 234:
               var10000 = 135;
               break;
            case 235:
               var10000 = 124;
               break;
            case 236:
               var10000 = 232;
               break;
            case 237:
               var10000 = 26;
               break;
            case 238:
               var10000 = 97;
               break;
            case 239:
               var10000 = 53;
               break;
            case 240:
               var10000 = 225;
               break;
            case 241:
               var10000 = 142;
               break;
            case 242:
               var10000 = 6;
               break;
            case 243:
               var10000 = 147;
               break;
            case 244:
               var10000 = 148;
               break;
            case 245:
               var10000 = 215;
               break;
            case 246:
               var10000 = 1;
               break;
            case 247:
               var10000 = 35;
               break;
            case 248:
               var10000 = 194;
               break;
            case 249:
               var10000 = 119;
               break;
            case 250:
               var10000 = 2;
               break;
            case 251:
               var10000 = 217;
               break;
            case 252:
               var10000 = 108;
               break;
            case 253:
               var10000 = 77;
               break;
            case 254:
               var10000 = 56;
               break;
            default:
               var10000 = 233;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7315;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var15 = new String[2];
      int var13 = 0;
      String var12 = "BBzQøµ×/,\fz\u008cþ\u0089\u008b|÷ö ~Ü\u0080\u001aö\u001ex\u0087ç\u009d\u0012eäk2\u0082Í\u0007\u001e\u009aR¿m=_%\u0007;\u0018ò}¤\u00adÐñ\u008e\u0019AT+ßv\b6NÅ©\u001e,¾p´³X\u009c\u001b1ÓO46 ý";
      int var14 = "BBzQøµ×/,\fz\u008cþ\u0089\u008b|÷ö ~Ü\u0080\u001aö\u001ex\u0087ç\u009d\u0012eäk2\u0082Í\u0007\u001e\u009aR¿m=_%\u0007;\u0018ò}¤\u00adÐñ\u008e\u0019AT+ßv\b6NÅ©\u001e,¾p´³X\u009c\u001b1ÓO46 ý"
         .length();
      char var11 = ',';
      int var10 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var12.substring(++var10, var10 + var11).toCharArray();
            int var10004 = var10003.length;
            int var16 = 0;
            byte var27 = 93;
            var10002 = var10003;
            int var18 = var10004;
            byte var31;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var31 = 93;
               var10006 = var16;
            } else {
               var27 = 93;
               var18 = var10004;
               if (var10004 <= var16) {
                  break label47;
               }

               var10005 = var10003;
               var31 = 93;
               var10006 = var16;
            }

            while (true) {
               char var44 = var10005[var10006];
               byte var45;
               switch (var16 % 7) {
                  case 0:
                     var45 = 71;
                     break;
                  case 1:
                     var45 = 34;
                     break;
                  case 2:
                     var45 = 113;
                     break;
                  case 3:
                     var45 = 6;
                     break;
                  case 4:
                     var45 = 2;
                     break;
                  case 5:
                     var45 = 37;
                     break;
                  default:
                     var45 = 51;
               }

               var10005[var10006] = (char)(var44 ^ var31 ^ var45);
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
            b = new String[2];
            long var2 = 3545411809326109560L;
            long[] var8 = new long[3];
            int var5 = 0;
            String var6 = "æLßDxMÉèÅ\u0097\u008d4\u0088qMG~\u0014\u0012C¢ÂL`";
            int var7 = "æLßDxMÉèÅ\u0097\u008d4\u0088qMG~\u0014\u0012C¢ÂL`".length();
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
            d = new Integer[3];
            long var0 = 6603736987772002416L;
            long var26 = 6603736987771996000L ^ var0;
            byte var23 = -1;
            e = var26;
            return;
         }

         var11 = var12.charAt(var10);
      }
   }
}





