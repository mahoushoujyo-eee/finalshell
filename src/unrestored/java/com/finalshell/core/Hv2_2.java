package com.finalshell.core;

public abstract class Hv2_2 extends Hu2 {
   public final Hd2 O;
   public static String[] a;
   public static String[] b;
   public static long[] k;
   public static Integer[] l;

   public Hv2_2(Hd2 var1) {
      super(var1);
      this.O = var1;
   }

   @Override
   public F3_4 v() throws B2_5 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/Hv2_2.p ()[Lcom/finalshell/core/Hd2;
      // 07: astore 2
      // 08: aload 0
      // 09: getfield com/finalshell/core/Hv2_2.O Lcom/finalshell/core/Hd2;
      // 0c: invokevirtual com/finalshell/core/Hd2.i ()Lcom/finalshell/core/Hd2;
      // 0f: astore 3
      // 10: astore 1
      // 11: aload 3
      // 12: ifnull 30
      // 15: aload 2
      // 16: arraylength
      // 17: bipush 1
      // 18: iadd
      // 19: anewarray 36
      // 1c: astore 4
      // 1e: aload 4
      // 20: bipush 0
      // 21: aload 3
      // 22: aastore
      // 23: aload 2
      // 24: bipush 0
      // 25: aload 4
      // 27: bipush 1
      // 28: aload 2
      // 29: arraylength
      // 2a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2d: aload 4
      // 2f: astore 2
      // 30: aload 2
      // 31: invokestatic com/finalshell/core/Hd2.k ([Lcom/finalshell/core/Hd2;)[Ljava/lang/String;
      // 34: astore 3
      // 35: aload 0
      // 36: invokevirtual com/finalshell/core/Hv2_2.o ()Lcom/finalshell/core/Hd2;
      // 39: invokevirtual com/finalshell/core/Hd2.s ()Z
      // 3c: aload 1
      // 3d: ifnull 55
      // 40: ifeq 7a
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/Hv2_2.b (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 49: athrow
      // 4a: aload 3
      // 4b: arraylength
      // 4c: bipush 2
      // 4d: iadd
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/Hv2_2.b (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 54: athrow
      // 55: anewarray 61
      // 58: astore 4
      // 5a: aload 4
      // 5c: bipush 0
      // 5d: sipush -29311
      // 60: sipush -29983
      // 63: invokestatic com/finalshell/core/Hv2_2.b (II)Ljava/lang/String;
      // 66: aastore
      // 67: aload 4
      // 69: bipush 1
      // 6a: ldc "I"
      // 6c: aastore
      // 6d: aload 3
      // 6e: bipush 0
      // 6f: aload 4
      // 71: bipush 2
      // 72: aload 3
      // 73: arraylength
      // 74: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 77: aload 4
      // 79: astore 3
      // 7a: new com/finalshell/core/F3_4
      // 7d: dup
      // 7e: ldc "V"
      // 80: aload 3
      // 81: invokespecial com/finalshell/core/F3_4.<init> (Ljava/lang/String;[Ljava/lang/String;)V
      // 84: areturn
   }

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: new java/lang/StringBuilder
      // 06: dup
      // 07: aload 0
      // 08: invokevirtual com/finalshell/core/Hv2_2.o ()Lcom/finalshell/core/Hd2;
      // 0b: invokevirtual com/finalshell/core/Hd2.toString ()Ljava/lang/String;
      // 0e: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 11: astore 2
      // 12: astore 1
      // 13: aload 2
      // 14: sipush 25647
      // 17: ldc2_w 9174816309060169661
      // 1a: invokestatic com/finalshell/core/Hv2_2.a (IJ)I
      // 1d: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 20: pop
      // 21: aload 0
      // 22: invokevirtual com/finalshell/core/Hv2_2.p ()[Lcom/finalshell/core/Hd2;
      // 25: astore 3
      // 26: bipush 0
      // 27: istore 4
      // 29: iload 4
      // 2b: aload 3
      // 2c: arraylength
      // 2d: if_icmpge 68
      // 30: aload 1
      // 31: ifnull 88
      // 34: iload 4
      // 36: ifle 55
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/Hv2_2.b (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 3f: athrow
      // 40: aload 2
      // 41: sipush -29310
      // 44: sipush -10530
      // 47: invokestatic com/finalshell/core/Hv2_2.b (II)Ljava/lang/String;
      // 4a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d: pop
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/Hv2_2.b (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 54: athrow
      // 55: aload 2
      // 56: aload 3
      // 57: iload 4
      // 59: aaload
      // 5a: invokevirtual com/finalshell/core/Hd2.toString ()Ljava/lang/String;
      // 5d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60: pop
      // 61: iinc 4 1
      // 64: aload 1
      // 65: ifnonnull 29
      // 68: goto 7a
      // 6b: astore 3
      // 6c: aload 2
      // 6d: sipush -29312
      // 70: sipush 2514
      // 73: invokestatic com/finalshell/core/Hv2_2.b (II)Ljava/lang/String;
      // 76: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 79: pop
      // 7a: aload 2
      // 7b: sipush 30510
      // 7e: ldc2_w 5345383263747046589
      // 81: invokestatic com/finalshell/core/Hv2_2.a (IJ)I
      // 84: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 87: pop
      // 88: aload 2
      // 89: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8c: areturn
   }

   public static B2_5 b(B2_5 var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -29312) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 211;
               break;
            case 1:
               var10000 = 49;
               break;
            case 2:
               var10000 = 26;
               break;
            case 3:
               var10000 = 54;
               break;
            case 4:
               var10000 = 70;
               break;
            case 5:
               var10000 = 228;
               break;
            case 6:
               var10000 = 249;
               break;
            case 7:
               var10000 = 226;
               break;
            case 8:
               var10000 = 132;
               break;
            case 9:
               var10000 = 45;
               break;
            case 10:
               var10000 = 25;
               break;
            case 11:
               var10000 = 202;
               break;
            case 12:
               var10000 = 207;
               break;
            case 13:
               var10000 = 220;
               break;
            case 14:
               var10000 = 84;
               break;
            case 15:
               var10000 = 246;
               break;
            case 16:
               var10000 = 67;
               break;
            case 17:
               var10000 = 115;
               break;
            case 18:
               var10000 = 12;
               break;
            case 19:
               var10000 = 180;
               break;
            case 20:
               var10000 = 34;
               break;
            case 21:
               var10000 = 213;
               break;
            case 22:
               var10000 = 162;
               break;
            case 23:
               var10000 = 176;
               break;
            case 24:
               var10000 = 111;
               break;
            case 25:
               var10000 = 189;
               break;
            case 26:
               var10000 = 197;
               break;
            case 27:
               var10000 = 196;
               break;
            case 28:
               var10000 = 184;
               break;
            case 29:
               var10000 = 198;
               break;
            case 30:
               var10000 = 152;
               break;
            case 31:
               var10000 = 252;
               break;
            case 32:
               var10000 = 60;
               break;
            case 33:
               var10000 = 93;
               break;
            case 34:
               var10000 = 163;
               break;
            case 35:
               var10000 = 253;
               break;
            case 36:
               var10000 = 19;
               break;
            case 37:
               var10000 = 229;
               break;
            case 38:
               var10000 = 146;
               break;
            case 39:
               var10000 = 137;
               break;
            case 40:
               var10000 = 170;
               break;
            case 41:
               var10000 = 206;
               break;
            case 42:
               var10000 = 20;
               break;
            case 43:
               var10000 = 83;
               break;
            case 44:
               var10000 = 42;
               break;
            case 45:
               var10000 = 94;
               break;
            case 46:
               var10000 = 153;
               break;
            case 47:
               var10000 = 41;
               break;
            case 48:
               var10000 = 143;
               break;
            case 49:
               var10000 = 245;
               break;
            case 50:
               var10000 = 91;
               break;
            case 51:
               var10000 = 55;
               break;
            case 52:
               var10000 = 120;
               break;
            case 53:
               var10000 = 135;
               break;
            case 54:
               var10000 = 231;
               break;
            case 55:
               var10000 = 28;
               break;
            case 56:
               var10000 = 99;
               break;
            case 57:
               var10000 = 216;
               break;
            case 58:
               var10000 = 63;
               break;
            case 59:
               var10000 = 31;
               break;
            case 60:
               var10000 = 160;
               break;
            case 61:
               var10000 = 175;
               break;
            case 62:
               var10000 = 167;
               break;
            case 63:
               var10000 = 200;
               break;
            case 64:
               var10000 = 174;
               break;
            case 65:
               var10000 = 72;
               break;
            case 66:
               var10000 = 13;
               break;
            case 67:
               var10000 = 101;
               break;
            case 68:
               var10000 = 56;
               break;
            case 69:
               var10000 = 186;
               break;
            case 70:
               var10000 = 10;
               break;
            case 71:
               var10000 = 129;
               break;
            case 72:
               var10000 = 194;
               break;
            case 73:
               var10000 = 36;
               break;
            case 74:
               var10000 = 48;
               break;
            case 75:
               var10000 = 141;
               break;
            case 76:
               var10000 = 254;
               break;
            case 77:
               var10000 = 109;
               break;
            case 78:
               var10000 = 219;
               break;
            case 79:
               var10000 = 59;
               break;
            case 80:
               var10000 = 247;
               break;
            case 81:
               var10000 = 255;
               break;
            case 82:
               var10000 = 6;
               break;
            case 83:
               var10000 = 73;
               break;
            case 84:
               var10000 = 62;
               break;
            case 85:
               var10000 = 165;
               break;
            case 86:
               var10000 = 52;
               break;
            case 87:
               var10000 = 130;
               break;
            case 88:
               var10000 = 128;
               break;
            case 89:
               var10000 = 66;
               break;
            case 90:
               var10000 = 88;
               break;
            case 91:
               var10000 = 237;
               break;
            case 92:
               var10000 = 71;
               break;
            case 93:
               var10000 = 4;
               break;
            case 94:
               var10000 = 17;
               break;
            case 95:
               var10000 = 15;
               break;
            case 96:
               var10000 = 145;
               break;
            case 97:
               var10000 = 78;
               break;
            case 98:
               var10000 = 248;
               break;
            case 99:
               var10000 = 100;
               break;
            case 100:
               var10000 = 238;
               break;
            case 101:
               var10000 = 221;
               break;
            case 102:
               var10000 = 47;
               break;
            case 103:
               var10000 = 9;
               break;
            case 104:
               var10000 = 161;
               break;
            case 105:
               var10000 = 113;
               break;
            case 106:
               var10000 = 116;
               break;
            case 107:
               var10000 = 3;
               break;
            case 108:
               var10000 = 96;
               break;
            case 109:
               var10000 = 251;
               break;
            case 110:
               var10000 = 104;
               break;
            case 111:
               var10000 = 21;
               break;
            case 112:
               var10000 = 166;
               break;
            case 113:
               var10000 = 58;
               break;
            case 114:
               var10000 = 81;
               break;
            case 115:
               var10000 = 149;
               break;
            case 116:
               var10000 = 27;
               break;
            case 117:
               var10000 = 204;
               break;
            case 118:
               var10000 = 209;
               break;
            case 119:
               var10000 = 171;
               break;
            case 120:
               var10000 = 250;
               break;
            case 121:
               var10000 = 64;
               break;
            case 122:
               var10000 = 223;
               break;
            case 123:
               var10000 = 90;
               break;
            case 124:
               var10000 = 106;
               break;
            case 125:
               var10000 = 29;
               break;
            case 126:
               var10000 = 1;
               break;
            case 127:
               var10000 = 240;
               break;
            case 128:
               var10000 = 205;
               break;
            case 129:
               var10000 = 134;
               break;
            case 130:
               var10000 = 188;
               break;
            case 131:
               var10000 = 68;
               break;
            case 132:
               var10000 = 138;
               break;
            case 133:
               var10000 = 218;
               break;
            case 134:
               var10000 = 85;
               break;
            case 135:
               var10000 = 112;
               break;
            case 136:
               var10000 = 30;
               break;
            case 137:
               var10000 = 122;
               break;
            case 138:
               var10000 = 89;
               break;
            case 139:
               var10000 = 11;
               break;
            case 140:
               var10000 = 127;
               break;
            case 141:
               var10000 = 164;
               break;
            case 142:
               var10000 = 92;
               break;
            case 143:
               var10000 = 97;
               break;
            case 144:
               var10000 = 107;
               break;
            case 145:
               var10000 = 140;
               break;
            case 146:
               var10000 = 43;
               break;
            case 147:
               var10000 = 125;
               break;
            case 148:
               var10000 = 121;
               break;
            case 149:
               var10000 = 133;
               break;
            case 150:
               var10000 = 53;
               break;
            case 151:
               var10000 = 178;
               break;
            case 152:
               var10000 = 227;
               break;
            case 153:
               var10000 = 131;
               break;
            case 154:
               var10000 = 98;
               break;
            case 155:
               var10000 = 235;
               break;
            case 156:
               var10000 = 187;
               break;
            case 157:
               var10000 = 57;
               break;
            case 158:
               var10000 = 241;
               break;
            case 159:
               var10000 = 142;
               break;
            case 160:
               var10000 = 192;
               break;
            case 161:
               var10000 = 44;
               break;
            case 162:
               var10000 = 214;
               break;
            case 163:
               var10000 = 239;
               break;
            case 164:
               var10000 = 80;
               break;
            case 165:
               var10000 = 185;
               break;
            case 166:
               var10000 = 225;
               break;
            case 167:
               var10000 = 126;
               break;
            case 168:
               var10000 = 150;
               break;
            case 169:
               var10000 = 215;
               break;
            case 170:
               var10000 = 169;
               break;
            case 171:
               var10000 = 105;
               break;
            case 172:
               var10000 = 22;
               break;
            case 173:
               var10000 = 203;
               break;
            case 174:
               var10000 = 14;
               break;
            case 175:
               var10000 = 168;
               break;
            case 176:
               var10000 = 119;
               break;
            case 177:
               var10000 = 148;
               break;
            case 178:
               var10000 = 144;
               break;
            case 179:
               var10000 = 124;
               break;
            case 180:
               var10000 = 158;
               break;
            case 181:
               var10000 = 87;
               break;
            case 182:
               var10000 = 108;
               break;
            case 183:
               var10000 = 8;
               break;
            case 184:
               var10000 = 33;
               break;
            case 185:
               var10000 = 154;
               break;
            case 186:
               var10000 = 50;
               break;
            case 187:
               var10000 = 118;
               break;
            case 188:
               var10000 = 35;
               break;
            case 189:
               var10000 = 40;
               break;
            case 190:
               var10000 = 232;
               break;
            case 191:
               var10000 = 233;
               break;
            case 192:
               var10000 = 181;
               break;
            case 193:
               var10000 = 199;
               break;
            case 194:
               var10000 = 136;
               break;
            case 195:
               var10000 = 114;
               break;
            case 196:
               var10000 = 110;
               break;
            case 197:
               var10000 = 77;
               break;
            case 198:
               var10000 = 86;
               break;
            case 199:
               var10000 = 0;
               break;
            case 200:
               var10000 = 234;
               break;
            case 201:
               var10000 = 46;
               break;
            case 202:
               var10000 = 217;
               break;
            case 203:
               var10000 = 7;
               break;
            case 204:
               var10000 = 37;
               break;
            case 205:
               var10000 = 23;
               break;
            case 206:
               var10000 = 61;
               break;
            case 207:
               var10000 = 159;
               break;
            case 208:
               var10000 = 242;
               break;
            case 209:
               var10000 = 151;
               break;
            case 210:
               var10000 = 39;
               break;
            case 211:
               var10000 = 123;
               break;
            case 212:
               var10000 = 24;
               break;
            case 213:
               var10000 = 38;
               break;
            case 214:
               var10000 = 156;
               break;
            case 215:
               var10000 = 183;
               break;
            case 216:
               var10000 = 157;
               break;
            case 217:
               var10000 = 201;
               break;
            case 218:
               var10000 = 236;
               break;
            case 219:
               var10000 = 177;
               break;
            case 220:
               var10000 = 95;
               break;
            case 221:
               var10000 = 222;
               break;
            case 222:
               var10000 = 79;
               break;
            case 223:
               var10000 = 208;
               break;
            case 224:
               var10000 = 18;
               break;
            case 225:
               var10000 = 182;
               break;
            case 226:
               var10000 = 191;
               break;
            case 227:
               var10000 = 147;
               break;
            case 228:
               var10000 = 179;
               break;
            case 229:
               var10000 = 224;
               break;
            case 230:
               var10000 = 210;
               break;
            case 231:
               var10000 = 102;
               break;
            case 232:
               var10000 = 2;
               break;
            case 233:
               var10000 = 74;
               break;
            case 234:
               var10000 = 82;
               break;
            case 235:
               var10000 = 51;
               break;
            case 236:
               var10000 = 65;
               break;
            case 237:
               var10000 = 155;
               break;
            case 238:
               var10000 = 32;
               break;
            case 239:
               var10000 = 212;
               break;
            case 240:
               var10000 = 69;
               break;
            case 241:
               var10000 = 195;
               break;
            case 242:
               var10000 = 243;
               break;
            case 243:
               var10000 = 190;
               break;
            case 244:
               var10000 = 244;
               break;
            case 245:
               var10000 = 75;
               break;
            case 246:
               var10000 = 230;
               break;
            case 247:
               var10000 = 139;
               break;
            case 248:
               var10000 = 16;
               break;
            case 249:
               var10000 = 172;
               break;
            case 250:
               var10000 = 76;
               break;
            case 251:
               var10000 = 103;
               break;
            case 252:
               var10000 = 117;
               break;
            case 253:
               var10000 = 193;
               break;
            case 254:
               var10000 = 5;
               break;
            default:
               var10000 = 173;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2963;
      if (l[var3] == null) {
         l[var3] = (int)(k[var3] ^ var1);
      }

      return l[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "\u009dRÑÒdH\u0015ª\u008a~¦Ù!Æ\u0012\u0099w \u0015´ó\nó\u0082ãv8¶ñc ø6\u0002§Â";
      int var12 = "\u009dRÑÒdH\u0015ª\u008a~¦Ù!Æ\u0012\u0099w \u0015´ó\nó\u0082ãv8¶ñc ø6\u0002§Â".length();
      char var9 = 14;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 127;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 127;
               var10006 = var14;
            } else {
               var23 = 127;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 127;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 56;
                     break;
                  case 1:
                     var41 = 89;
                     break;
                  case 2:
                     var41 = 32;
                     break;
                  case 3:
                     var41 = 17;
                     break;
                  case 4:
                     var41 = 8;
                     break;
                  case 5:
                     var41 = 116;
                     break;
                  default:
                     var41 = 44;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
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
            b = new String[3];
            long var0 = 5948399257224901052L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "ö{\u001b\u008f\u001aã\u008d(Ï\u0019 ûaë\u009e)";
            int var5 = "ö{\u001b\u008f\u001aã\u008d(Ï\u0019 ûaë\u009e)".length();
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

            k = var6;
            l = new Integer[2];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }
}





