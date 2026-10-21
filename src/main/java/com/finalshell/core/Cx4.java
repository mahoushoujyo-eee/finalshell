package com.finalshell.core;

import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class Cx4 implements Composite {
   public static String[] c;
   protected float k;
   protected int M;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] e;

   public Cx4(int var1) {
      this(var1, 1.0F);
   }

   public Cx4(int param1, float param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/ZH.U ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokespecial java/lang/Object.<init> ()V
      // 07: astore 3
      // 08: fload 2
      // 09: fconst_0
      // 0a: fcmpg
      // 0b: aload 3
      // 0c: ifnonnull 23
      // 0f: iflt 31
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/Cx4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18: athrow
      // 19: fload 2
      // 1a: fconst_1
      // 1b: fcmpl
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/Cx4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22: athrow
      // 23: aload 3
      // 24: ifnonnull 47
      // 27: ifle 46
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/Cx4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30: athrow
      // 31: new java/lang/IllegalArgumentException
      // 34: dup
      // 35: sipush -31224
      // 38: sipush -8738
      // 3b: invokestatic com/finalshell/core/Cx4.a (II)Ljava/lang/String;
      // 3e: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 41: athrow
      // 42: invokestatic com/finalshell/core/Cx4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 45: athrow
      // 46: iload 1
      // 47: aload 3
      // 48: ifnonnull 56
      // 4b: iflt 62
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/Cx4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 54: athrow
      // 55: iload 1
      // 56: sipush 30315
      // 59: ldc2_w 2842537104617723895
      // 5c: invokestatic com/finalshell/core/Cx4.a (IJ)I
      // 5f: if_icmple 77
      // 62: new java/lang/IllegalArgumentException
      // 65: dup
      // 66: sipush -31206
      // 69: sipush 31297
      // 6c: invokestatic com/finalshell/core/Cx4.a (II)Ljava/lang/String;
      // 6f: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 72: athrow
      // 73: invokestatic com/finalshell/core/Cx4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 76: athrow
      // 77: aload 0
      // 78: iload 1
      // 79: putfield com/finalshell/core/Cx4.M I
      // 7c: aload 0
      // 7d: fload 2
      // 7e: putfield com/finalshell/core/Cx4.k F
      // 81: return
   }

   public static Composite E(int var0, float var1) {
      String[] var2 = ZH.U();

      try {
         if (var2 != null) {
            return AlphaComposite.getInstance(var0, var1);
         } else {
            switch (var0) {
               case 0:
                  return AlphaComposite.getInstance(3, var1);
               case 23:
                  return AlphaComposite.getInstance(a(14929, 5772784241633958878L), var1);
               case 24:
                  return AlphaComposite.getInstance(a(20943, 930034775272550478L), var1);
               default:
                  return new Cx4(var0, var1);
            }
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }
   }

   @Override
   public CompositeContext createContext(ColorModel var1, ColorModel var2, RenderingHints var3) {
      return new Di4(this.M, this.k, var1, var2);
   }

   public float j() {
      return this.k;
   }

   public int q() {
      return this.M;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.k) * a(8380, 1342559684714070305L) + this.M;
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/ZH.U ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 1d
      // 09: instanceof com/finalshell/core/Cx4
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Cx4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic com/finalshell/core/Cx4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: aload 1
      // 1d: checkcast com/finalshell/core/Cx4
      // 20: astore 3
      // 21: aload 0
      // 22: getfield com/finalshell/core/Cx4.M I
      // 25: aload 2
      // 26: ifnonnull 47
      // 29: aload 3
      // 2a: getfield com/finalshell/core/Cx4.M I
      // 2d: if_icmpne 59
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Cx4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: aload 0
      // 38: getfield com/finalshell/core/Cx4.k F
      // 3b: aload 3
      // 3c: getfield com/finalshell/core/Cx4.k F
      // 3f: fcmpl
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/Cx4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46: athrow
      // 47: aload 2
      // 48: ifnonnull 56
      // 4b: ifne 59
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/Cx4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5a
      // 59: bipush 0
      // 5a: ireturn
   }

   static {
      __vfClinit__();
   }

   public static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -31218) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 55;
               break;
            case 1:
               var10000 = 74;
               break;
            case 2:
               var10000 = 138;
               break;
            case 3:
               var10000 = 82;
               break;
            case 4:
               var10000 = 184;
               break;
            case 5:
               var10000 = 189;
               break;
            case 6:
               var10000 = 129;
               break;
            case 7:
               var10000 = 160;
               break;
            case 8:
               var10000 = 84;
               break;
            case 9:
               var10000 = 177;
               break;
            case 10:
               var10000 = 96;
               break;
            case 11:
               var10000 = 151;
               break;
            case 12:
               var10000 = 37;
               break;
            case 13:
               var10000 = 217;
               break;
            case 14:
               var10000 = 178;
               break;
            case 15:
               var10000 = 79;
               break;
            case 16:
               var10000 = 59;
               break;
            case 17:
               var10000 = 226;
               break;
            case 18:
               var10000 = 148;
               break;
            case 19:
               var10000 = 167;
               break;
            case 20:
               var10000 = 249;
               break;
            case 21:
               var10000 = 8;
               break;
            case 22:
               var10000 = 110;
               break;
            case 23:
               var10000 = 13;
               break;
            case 24:
               var10000 = 102;
               break;
            case 25:
               var10000 = 54;
               break;
            case 26:
               var10000 = 78;
               break;
            case 27:
               var10000 = 222;
               break;
            case 28:
               var10000 = 210;
               break;
            case 29:
               var10000 = 31;
               break;
            case 30:
               var10000 = 118;
               break;
            case 31:
               var10000 = 32;
               break;
            case 32:
               var10000 = 218;
               break;
            case 33:
               var10000 = 76;
               break;
            case 34:
               var10000 = 7;
               break;
            case 35:
               var10000 = 234;
               break;
            case 36:
               var10000 = 149;
               break;
            case 37:
               var10000 = 117;
               break;
            case 38:
               var10000 = 235;
               break;
            case 39:
               var10000 = 164;
               break;
            case 40:
               var10000 = 58;
               break;
            case 41:
               var10000 = 122;
               break;
            case 42:
               var10000 = 4;
               break;
            case 43:
               var10000 = 242;
               break;
            case 44:
               var10000 = 6;
               break;
            case 45:
               var10000 = 26;
               break;
            case 46:
               var10000 = 114;
               break;
            case 47:
               var10000 = 33;
               break;
            case 48:
               var10000 = 188;
               break;
            case 49:
               var10000 = 193;
               break;
            case 50:
               var10000 = 154;
               break;
            case 51:
               var10000 = 251;
               break;
            case 52:
               var10000 = 255;
               break;
            case 53:
               var10000 = 28;
               break;
            case 54:
               var10000 = 51;
               break;
            case 55:
               var10000 = 81;
               break;
            case 56:
               var10000 = 9;
               break;
            case 57:
               var10000 = 97;
               break;
            case 58:
               var10000 = 131;
               break;
            case 59:
               var10000 = 196;
               break;
            case 60:
               var10000 = 127;
               break;
            case 61:
               var10000 = 23;
               break;
            case 62:
               var10000 = 66;
               break;
            case 63:
               var10000 = 179;
               break;
            case 64:
               var10000 = 39;
               break;
            case 65:
               var10000 = 180;
               break;
            case 66:
               var10000 = 146;
               break;
            case 67:
               var10000 = 30;
               break;
            case 68:
               var10000 = 227;
               break;
            case 69:
               var10000 = 145;
               break;
            case 70:
               var10000 = 12;
               break;
            case 71:
               var10000 = 173;
               break;
            case 72:
               var10000 = 85;
               break;
            case 73:
               var10000 = 229;
               break;
            case 74:
               var10000 = 221;
               break;
            case 75:
               var10000 = 191;
               break;
            case 76:
               var10000 = 121;
               break;
            case 77:
               var10000 = 64;
               break;
            case 78:
               var10000 = 10;
               break;
            case 79:
               var10000 = 238;
               break;
            case 80:
               var10000 = 182;
               break;
            case 81:
               var10000 = 195;
               break;
            case 82:
               var10000 = 109;
               break;
            case 83:
               var10000 = 56;
               break;
            case 84:
               var10000 = 140;
               break;
            case 85:
               var10000 = 150;
               break;
            case 86:
               var10000 = 239;
               break;
            case 87:
               var10000 = 71;
               break;
            case 88:
               var10000 = 208;
               break;
            case 89:
               var10000 = 220;
               break;
            case 90:
               var10000 = 34;
               break;
            case 91:
               var10000 = 130;
               break;
            case 92:
               var10000 = 245;
               break;
            case 93:
               var10000 = 36;
               break;
            case 94:
               var10000 = 22;
               break;
            case 95:
               var10000 = 87;
               break;
            case 96:
               var10000 = 243;
               break;
            case 97:
               var10000 = 143;
               break;
            case 98:
               var10000 = 63;
               break;
            case 99:
               var10000 = 2;
               break;
            case 100:
               var10000 = 113;
               break;
            case 101:
               var10000 = 252;
               break;
            case 102:
               var10000 = 163;
               break;
            case 103:
               var10000 = 213;
               break;
            case 104:
               var10000 = 24;
               break;
            case 105:
               var10000 = 16;
               break;
            case 106:
               var10000 = 181;
               break;
            case 107:
               var10000 = 174;
               break;
            case 108:
               var10000 = 216;
               break;
            case 109:
               var10000 = 14;
               break;
            case 110:
               var10000 = 98;
               break;
            case 111:
               var10000 = 159;
               break;
            case 112:
               var10000 = 52;
               break;
            case 113:
               var10000 = 199;
               break;
            case 114:
               var10000 = 166;
               break;
            case 115:
               var10000 = 156;
               break;
            case 116:
               var10000 = 212;
               break;
            case 117:
               var10000 = 183;
               break;
            case 118:
               var10000 = 29;
               break;
            case 119:
               var10000 = 49;
               break;
            case 120:
               var10000 = 0;
               break;
            case 121:
               var10000 = 67;
               break;
            case 122:
               var10000 = 69;
               break;
            case 123:
               var10000 = 89;
               break;
            case 124:
               var10000 = 50;
               break;
            case 125:
               var10000 = 175;
               break;
            case 126:
               var10000 = 73;
               break;
            case 127:
               var10000 = 237;
               break;
            case 128:
               var10000 = 25;
               break;
            case 129:
               var10000 = 161;
               break;
            case 130:
               var10000 = 94;
               break;
            case 131:
               var10000 = 185;
               break;
            case 132:
               var10000 = 133;
               break;
            case 133:
               var10000 = 19;
               break;
            case 134:
               var10000 = 204;
               break;
            case 135:
               var10000 = 3;
               break;
            case 136:
               var10000 = 232;
               break;
            case 137:
               var10000 = 83;
               break;
            case 138:
               var10000 = 207;
               break;
            case 139:
               var10000 = 162;
               break;
            case 140:
               var10000 = 144;
               break;
            case 141:
               var10000 = 17;
               break;
            case 142:
               var10000 = 105;
               break;
            case 143:
               var10000 = 165;
               break;
            case 144:
               var10000 = 157;
               break;
            case 145:
               var10000 = 57;
               break;
            case 146:
               var10000 = 200;
               break;
            case 147:
               var10000 = 246;
               break;
            case 148:
               var10000 = 46;
               break;
            case 149:
               var10000 = 21;
               break;
            case 150:
               var10000 = 225;
               break;
            case 151:
               var10000 = 201;
               break;
            case 152:
               var10000 = 106;
               break;
            case 153:
               var10000 = 62;
               break;
            case 154:
               var10000 = 60;
               break;
            case 155:
               var10000 = 137;
               break;
            case 156:
               var10000 = 209;
               break;
            case 157:
               var10000 = 116;
               break;
            case 158:
               var10000 = 211;
               break;
            case 159:
               var10000 = 44;
               break;
            case 160:
               var10000 = 119;
               break;
            case 161:
               var10000 = 134;
               break;
            case 162:
               var10000 = 153;
               break;
            case 163:
               var10000 = 233;
               break;
            case 164:
               var10000 = 90;
               break;
            case 165:
               var10000 = 111;
               break;
            case 166:
               var10000 = 135;
               break;
            case 167:
               var10000 = 112;
               break;
            case 168:
               var10000 = 92;
               break;
            case 169:
               var10000 = 214;
               break;
            case 170:
               var10000 = 101;
               break;
            case 171:
               var10000 = 45;
               break;
            case 172:
               var10000 = 197;
               break;
            case 173:
               var10000 = 18;
               break;
            case 174:
               var10000 = 107;
               break;
            case 175:
               var10000 = 126;
               break;
            case 176:
               var10000 = 41;
               break;
            case 177:
               var10000 = 192;
               break;
            case 178:
               var10000 = 61;
               break;
            case 179:
               var10000 = 95;
               break;
            case 180:
               var10000 = 254;
               break;
            case 181:
               var10000 = 15;
               break;
            case 182:
               var10000 = 77;
               break;
            case 183:
               var10000 = 86;
               break;
            case 184:
               var10000 = 99;
               break;
            case 185:
               var10000 = 219;
               break;
            case 186:
               var10000 = 125;
               break;
            case 187:
               var10000 = 103;
               break;
            case 188:
               var10000 = 53;
               break;
            case 189:
               var10000 = 139;
               break;
            case 190:
               var10000 = 43;
               break;
            case 191:
               var10000 = 215;
               break;
            case 192:
               var10000 = 231;
               break;
            case 193:
               var10000 = 72;
               break;
            case 194:
               var10000 = 168;
               break;
            case 195:
               var10000 = 240;
               break;
            case 196:
               var10000 = 228;
               break;
            case 197:
               var10000 = 250;
               break;
            case 198:
               var10000 = 68;
               break;
            case 199:
               var10000 = 65;
               break;
            case 200:
               var10000 = 1;
               break;
            case 201:
               var10000 = 104;
               break;
            case 202:
               var10000 = 142;
               break;
            case 203:
               var10000 = 236;
               break;
            case 204:
               var10000 = 93;
               break;
            case 205:
               var10000 = 147;
               break;
            case 206:
               var10000 = 35;
               break;
            case 207:
               var10000 = 120;
               break;
            case 208:
               var10000 = 152;
               break;
            case 209:
               var10000 = 27;
               break;
            case 210:
               var10000 = 253;
               break;
            case 211:
               var10000 = 80;
               break;
            case 212:
               var10000 = 42;
               break;
            case 213:
               var10000 = 20;
               break;
            case 214:
               var10000 = 194;
               break;
            case 215:
               var10000 = 202;
               break;
            case 216:
               var10000 = 203;
               break;
            case 217:
               var10000 = 169;
               break;
            case 218:
               var10000 = 223;
               break;
            case 219:
               var10000 = 190;
               break;
            case 220:
               var10000 = 5;
               break;
            case 221:
               var10000 = 141;
               break;
            case 222:
               var10000 = 248;
               break;
            case 223:
               var10000 = 244;
               break;
            case 224:
               var10000 = 91;
               break;
            case 225:
               var10000 = 171;
               break;
            case 226:
               var10000 = 88;
               break;
            case 227:
               var10000 = 47;
               break;
            case 228:
               var10000 = 172;
               break;
            case 229:
               var10000 = 48;
               break;
            case 230:
               var10000 = 187;
               break;
            case 231:
               var10000 = 75;
               break;
            case 232:
               var10000 = 230;
               break;
            case 233:
               var10000 = 136;
               break;
            case 234:
               var10000 = 247;
               break;
            case 235:
               var10000 = 170;
               break;
            case 236:
               var10000 = 108;
               break;
            case 237:
               var10000 = 155;
               break;
            case 238:
               var10000 = 176;
               break;
            case 239:
               var10000 = 198;
               break;
            case 240:
               var10000 = 115;
               break;
            case 241:
               var10000 = 70;
               break;
            case 242:
               var10000 = 241;
               break;
            case 243:
               var10000 = 124;
               break;
            case 244:
               var10000 = 186;
               break;
            case 245:
               var10000 = 206;
               break;
            case 246:
               var10000 = 132;
               break;
            case 247:
               var10000 = 38;
               break;
            case 248:
               var10000 = 123;
               break;
            case 249:
               var10000 = 100;
               break;
            case 250:
               var10000 = 128;
               break;
            case 251:
               var10000 = 11;
               break;
            case 252:
               var10000 = 205;
               break;
            case 253:
               var10000 = 40;
               break;
            case 254:
               var10000 = 224;
               break;
            default:
               var10000 = 158;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8588;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[27];
      int var11 = 0;
      String var10 = "1\"\u0089ã¸íþ\u008b\u0004þ\u0012èø\n×ÎøîáÒ\bb\u001d)\u0003È\u0091r\nBJd\u001dÖé\u00ad¾ì\"\b\u009ec\u0014Ì|¦ÛÏ\u0018\t}S)\u0003Õ'ã¹\u000b¼ì\u0084°zd\u0095ÁfUõä\u001d\u0015\u0007¾\n:bÎù1\n5Ç¶\u0001*#tÚ+ë\u0006\u008d\u0081\u000bÐJ\u0003\u0007°\u0011Uçt\u0012Ú\u0003Û\u00059\n_\u0085\u0097\u0096\u0098Ã\"Æáh\u0007\u0099Q¿ï$\u0015`\n\u009bÝ\u0096\u0096k¿½¹\u0094¾\u0007£´g\r0Þ\u0019\tÀ}Ù»7P(d¦\u0005¥`Sæ\u0091\b§&àd6¢åq\u000bÍå±^ÓÜ~Ìî3_\u0016mARêU<:\"\u000e@¬\u008c\u008fà\u0006ü®J\u0018\u00ad/\u0017\t!\u009b_\u0018rû\u0090Od\n,¾\u009fô\u000b;úÔkJ\nX\u001e\u0003!\u00853²+§\u009f\u0006è\u008e\u0019´\f\u0084";
      int var12 = "1\"\u0089ã¸íþ\u008b\u0004þ\u0012èø\n×ÎøîáÒ\bb\u001d)\u0003È\u0091r\nBJd\u001dÖé\u00ad¾ì\"\b\u009ec\u0014Ì|¦ÛÏ\u0018\t}S)\u0003Õ'ã¹\u000b¼ì\u0084°zd\u0095ÁfUõä\u001d\u0015\u0007¾\n:bÎù1\n5Ç¶\u0001*#tÚ+ë\u0006\u008d\u0081\u000bÐJ\u0003\u0007°\u0011Uçt\u0012Ú\u0003Û\u00059\n_\u0085\u0097\u0096\u0098Ã\"Æáh\u0007\u0099Q¿ï$\u0015`\n\u009bÝ\u0096\u0096k¿½¹\u0094¾\u0007£´g\r0Þ\u0019\tÀ}Ù»7P(d¦\u0005¥`Sæ\u0091\b§&àd6¢åq\u000bÍå±^ÓÜ~Ìî3_\u0016mARêU<:\"\u000e@¬\u008c\u008fà\u0006ü®J\u0018\u00ad/\u0017\t!\u009b_\u0018rû\u0090Od\n,¾\u009fô\u000b;úÔkJ\nX\u001e\u0003!\u00853²+§\u009f\u0006è\u008e\u0019´\f\u0084"
         .length();
      char var9 = '\b';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 43;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var34;
            label65: {
               char[] var40 = var10001.toCharArray();
               int var10004 = var40.length;
               int var14 = 0;
               byte var43 = var10000;
               var34 = var40;
               int var25 = var10004;
               byte var50;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var40;
                  var50 = var10000;
                  var10006 = var14;
               } else {
                  var43 = var10000;
                  var25 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var56 = var40;
                  var50 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var65 = var56[var10006];
                  byte var66;
                  switch (var14 % 7) {
                     case 0:
                        var66 = 24;
                        break;
                     case 1:
                        var66 = 96;
                        break;
                     case 2:
                        var66 = 2;
                        break;
                     case 3:
                        var66 = 77;
                        break;
                     case 4:
                        var66 = 120;
                        break;
                     case 5:
                        var66 = 82;
                        break;
                     default:
                        var66 = 61;
                  }

                  var56[var10006] = (char)(var65 ^ var50 ^ var66);
                  var14++;
                  if (var43 == 0) {
                     var10006 = var43;
                     var56 = var34;
                     var50 = var43;
                  } else {
                     if (var25 <= var14) {
                        break;
                     }

                     var56 = var34;
                     var50 = var43;
                     var10006 = var14;
                  }
               }
            }

            String var45 = new String(var34).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var45;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[27];
                     long var0 = 5412037879357003103L;
                     long[] var6 = new long[24];
                     int var3 = 0;
                     String var4 = "<£\u0089í*\u0003\u0013 ±\u0014/\u0087(ò\u007f\u008dD»Úy\u007f#±\u0085U*ZåI\u0098Î\u0087¥*ªh\u0098\u0082l°}C4çJâuwûwëxå\u0093ï\u001e\r\u0006\"bI\u0087Jeôµ¾\u001817}ÐÆ¾\u009ad\u0007QyûRÌýºD|)ZôuK\u0012T\u0002óXZá\u009bWÍ\t¸~y{¦O¶é%\u0019Mû%Xy\t5\u0094´6tó³á¬¼1\u008f\u0086¾C\u0093\u0002°îdä^g,Ôa$iÆ÷ÒdæµU[X8\u0082\u008c\u001f\u009dò~ZÍ\nlEsd]\u0006\u0018ù\u0014µÀ";
                     int var5 = "<£\u0089í*\u0003\u0013 ±\u0014/\u0087(ò\u007f\u008dD»Úy\u007f#±\u0085U*ZåI\u0098Î\u0087¥*ªh\u0098\u0082l°}C4çJâuwûwëxå\u0093ï\u001e\r\u0006\"bI\u0087Jeôµ¾\u001817}ÐÆ¾\u009ad\u0007QyûRÌýºD|)ZôuK\u0012T\u0002óXZá\u009bWÍ\t¸~y{¦O¶é%\u0019Mû%Xy\t5\u0094´6tó³á¬¼1\u008f\u0086¾C\u0093\u0002°îdä^g,Ôa$iÆ÷ÒdæµU[X8\u0082\u008c\u001f\u009dò~ZÍ\nlEsd]\u0006\u0018ù\u0014µÀ"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var27 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var28 = var3++;
                        long var38 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var46 = -1;

                        while (true) {
                           long var55 = var38 ^ var0;
                           switch (var46) {
                              case 0:
                                 var19[var28] = var55;
                                 if (var2 >= var5) {
                                    d = var6;
                                    e = new Integer[24];
                                    String[] var20 = new String[a(2886, 1349661096347839179L)];
                                    var20[0] = a(-31225, -12261);
                                    var20[1] = a(-31227, 4239);
                                    var20[2] = a(-31204, 18165);
                                    var20[3] = a(-31232, 23368);
                                    var20[4] = a(-31221, 28658);
                                    var20[5] = a(-31212, 1550);
                                    var20[a(17746, 1187673698047091932L)] = a(-31217, -16606);
                                    var20[a(16054, 4737906554493148989L)] = a(-31207, -5930);
                                    var20[a(7107, 4174150725151734345L)] = a(-31210, 25670);
                                    var20[a(424, 1194463994428661793L)] = a(-31223, 14802);
                                    var20[a(3371, 2396784908352171182L)] = a(-31201, 9651);
                                    var20[a(1931, 280826375345710604L)] = a(-31203, -24163);
                                    var20[a(15490, 3891254387829054744L)] = a(-31219, -17730);
                                    var20[a(16708, 4172281622147719366L)] = a(-31220, -28573);
                                    var20[a(22638, 647108791190026733L)] = a(-31222, 15098);
                                    var20[a(2308, 608204176433817728L)] = a(-31209, -9310);
                                    var20[a(12708, 9088271245935644732L)] = a(-31229, -11958);
                                    var20[a(16663, 7907990602935754894L)] = a(-31226, 25814);
                                    var20[a(26593, 441473180474492525L)] = a(-31230, -30724);
                                    var20[a(4711, 1782078959730340857L)] = a(-31205, 19926);
                                    var20[a(19637, 8805379450758884661L)] = a(-31202, -13774);
                                    var20[a(23958, 2206817795125312528L)] = a(-31218, -26922);
                                    var20[a(6257, 2071110266653391353L)] = a(-31228, -6789);
                                    var20[a(28701, 2809131886601195910L)] = a(-31231, 10336);
                                    var20[a(27461, 2744346089485519578L)] = a(-31208, -17300);
                                    c = var20;
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var28] = var55;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u000fÚ²¿S3HKt~?Äª\u001e\u0004Î";
                                 var5 = "\u000fÚ²¿S3HKt~?Äª\u001e\u0004Î".length();
                                 var2 = 0;
                           }

                           byte var29 = var2;
                           var2 += 8;
                           var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var28 = var3++;
                           var38 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var46 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var45;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "õú\u0004\u000f×\u0006\u0096Ó\u0091á¯S";
                  var12 = "õú\u0004\u000f×\u0006\u0096Ó\u0091á¯S".length();
                  var9 = 5;
                  var17 = -1;
            }

            var10000 = 31;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





