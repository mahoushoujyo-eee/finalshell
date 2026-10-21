package com.finalshell.core;

public abstract class HP_2 extends Hu2 {
   public final Hd2 a;
   public static String[] d;
   public static String[] e;
   public static long[] f;
   public static Integer[] l;

   public HP_2(Hd2 var1) {
      super(var1);
      this.a = var1;
   }

   public abstract boolean u();

   public abstract boolean F();

   public abstract Hd2 p() throws B2_5;

   public abstract String K();

   @Override
   public F3_4 v() throws B2_5 {
      return new F3_4(this.p().z$String(), Hd2.k(this.p()));
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
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: new java/lang/StringBuilder
      // 006: dup
      // 007: invokespecial java/lang/StringBuilder.<init> ()V
      // 00a: astore 2
      // 00b: astore 1
      // 00c: aload 2
      // 00d: aload 0
      // 00e: invokevirtual com/finalshell/core/HP_2.p ()Lcom/finalshell/ui/model/S_3;
      // 011: invokevirtual com/finalshell/ui/model/S_3.toString ()Ljava/lang/String;
      // 014: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 017: sipush 22773
      // 01a: ldc2_w 7306048270355822415
      // 01d: invokestatic com/finalshell/core/HP_2.a (IJ)I
      // 020: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 023: pop
      // 024: aload 0
      // 025: invokevirtual com/finalshell/core/HP_2.u ()Z
      // 028: aload 1
      // 029: ifnull 04f
      // 02c: ifeq 04b
      // 02f: goto 036
      // 032: invokestatic com/finalshell/core/HP_2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 035: athrow
      // 036: aload 2
      // 037: sipush 21229
      // 03a: sipush 10438
      // 03d: invokestatic com/finalshell/core/HP_2.b (II)Ljava/lang/String;
      // 040: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 043: pop
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/HP_2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 04a: athrow
      // 04b: aload 0
      // 04c: invokevirtual com/finalshell/core/HP_2.F ()Z
      // 04f: ifeq 067
      // 052: aload 2
      // 053: sipush 21230
      // 056: sipush -10074
      // 059: invokestatic com/finalshell/core/HP_2.b (II)Ljava/lang/String;
      // 05c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05f: pop
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/HP_2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 066: athrow
      // 067: aload 2
      // 068: aload 0
      // 069: invokevirtual com/finalshell/core/HP_2.p ()Lcom/finalshell/core/Hd2;
      // 06c: invokevirtual com/finalshell/core/Hd2.toString ()Ljava/lang/String;
      // 06f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 072: pop
      // 073: goto 085
      // 076: astore 3
      // 077: aload 2
      // 078: sipush 21224
      // 07b: sipush -17309
      // 07e: invokestatic com/finalshell/core/HP_2.b (II)Ljava/lang/String;
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: pop
      // 085: aload 2
      // 086: sipush 32515
      // 089: ldc2_w 7837069990284480698
      // 08c: invokestatic com/finalshell/core/HP_2.a (IJ)I
      // 08f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 092: pop
      // 093: aload 2
      // 094: aload 0
      // 095: invokevirtual com/finalshell/core/HP_2.o ()Lcom/finalshell/core/Hd2;
      // 098: invokevirtual com/finalshell/core/Hd2.toString ()Ljava/lang/String;
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: pop
      // 09f: aload 2
      // 0a0: sipush 26921
      // 0a3: ldc2_w 5842111613402728082
      // 0a6: invokestatic com/finalshell/core/HP_2.a (IJ)I
      // 0a9: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0ac: pop
      // 0ad: aload 2
      // 0ae: aload 0
      // 0af: invokevirtual com/finalshell/core/HP_2.K ()Ljava/lang/String;
      // 0b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b5: pop
      // 0b6: aload 2
      // 0b7: sipush 5554
      // 0ba: ldc2_w 738019209875208716
      // 0bd: invokestatic com/finalshell/core/HP_2.a (IJ)I
      // 0c0: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0c3: pop
      // 0c4: aload 0
      // 0c5: invokevirtual com/finalshell/core/HP_2.p ()[Lcom/finalshell/core/Hd2;
      // 0c8: astore 3
      // 0c9: bipush 0
      // 0ca: istore 4
      // 0cc: iload 4
      // 0ce: aload 3
      // 0cf: arraylength
      // 0d0: if_icmpge 10b
      // 0d3: iload 4
      // 0d5: aload 1
      // 0d6: ifnull 132
      // 0d9: ifle 0f8
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/core/HP_2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0e2: athrow
      // 0e3: aload 2
      // 0e4: sipush 21227
      // 0e7: sipush -29774
      // 0ea: invokestatic com/finalshell/core/HP_2.b (II)Ljava/lang/String;
      // 0ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f0: pop
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/HP_2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0f7: athrow
      // 0f8: aload 2
      // 0f9: aload 3
      // 0fa: iload 4
      // 0fc: aaload
      // 0fd: invokevirtual com/finalshell/core/Hd2.toString ()Ljava/lang/String;
      // 100: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 103: pop
      // 104: iinc 4 1
      // 107: aload 1
      // 108: ifnonnull 0cc
      // 10b: goto 11d
      // 10e: astore 3
      // 10f: aload 2
      // 110: sipush 21231
      // 113: sipush 13999
      // 116: invokestatic com/finalshell/core/HP_2.b (II)Ljava/lang/String;
      // 119: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11c: pop
      // 11d: aload 2
      // 11e: sipush 32220
      // 121: ldc2_w 5791270431527195236
      // 124: invokestatic com/finalshell/core/HP_2.a (IJ)I
      // 127: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 12a: pop
      // 12b: aload 0
      // 12c: invokevirtual com/finalshell/core/HP_2.N ()[Lcom/finalshell/core/Hd2;
      // 12f: astore 3
      // 130: aload 3
      // 131: arraylength
      // 132: aload 1
      // 133: ifnull 15c
      // 136: ifle 18c
      // 139: goto 140
      // 13c: invokestatic com/finalshell/core/HP_2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 13f: athrow
      // 140: aload 2
      // 141: sipush 21228
      // 144: sipush -7284
      // 147: invokestatic com/finalshell/core/HP_2.b (II)Ljava/lang/String;
      // 14a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14d: aload 3
      // 14e: bipush 0
      // 14f: aaload
      // 150: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 153: pop
      // 154: bipush 1
      // 155: goto 15c
      // 158: invokestatic com/finalshell/core/HP_2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 15b: athrow
      // 15c: istore 4
      // 15e: iload 4
      // 160: aload 3
      // 161: arraylength
      // 162: if_icmpge 18c
      // 165: aload 2
      // 166: sipush 21226
      // 169: sipush 12307
      // 16c: invokestatic com/finalshell/core/HP_2.b (II)Ljava/lang/String;
      // 16f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 172: aload 3
      // 173: iload 4
      // 175: aaload
      // 176: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 179: pop
      // 17a: iinc 4 1
      // 17d: aload 1
      // 17e: ifnull 19e
      // 181: aload 1
      // 182: ifnonnull 15e
      // 185: goto 18c
      // 188: invokestatic com/finalshell/core/HP_2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 18b: athrow
      // 18c: goto 19e
      // 18f: astore 3
      // 190: aload 2
      // 191: sipush 21225
      // 194: sipush -4286
      // 197: invokestatic com/finalshell/core/HP_2.b (II)Ljava/lang/String;
      // 19a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19d: pop
      // 19e: aload 2
      // 19f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a2: areturn
   }

   public static B2_5 a(B2_5 var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ 21229) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 57;
               break;
            case 1:
               var10000 = 126;
               break;
            case 2:
               var10000 = 92;
               break;
            case 3:
               var10000 = 152;
               break;
            case 4:
               var10000 = 237;
               break;
            case 5:
               var10000 = 39;
               break;
            case 6:
               var10000 = 230;
               break;
            case 7:
               var10000 = 198;
               break;
            case 8:
               var10000 = 94;
               break;
            case 9:
               var10000 = 160;
               break;
            case 10:
               var10000 = 180;
               break;
            case 11:
               var10000 = 159;
               break;
            case 12:
               var10000 = 218;
               break;
            case 13:
               var10000 = 155;
               break;
            case 14:
               var10000 = 104;
               break;
            case 15:
               var10000 = 201;
               break;
            case 16:
               var10000 = 171;
               break;
            case 17:
               var10000 = 13;
               break;
            case 18:
               var10000 = 83;
               break;
            case 19:
               var10000 = 56;
               break;
            case 20:
               var10000 = 26;
               break;
            case 21:
               var10000 = 0;
               break;
            case 22:
               var10000 = 216;
               break;
            case 23:
               var10000 = 89;
               break;
            case 24:
               var10000 = 84;
               break;
            case 25:
               var10000 = 213;
               break;
            case 26:
               var10000 = 247;
               break;
            case 27:
               var10000 = 251;
               break;
            case 28:
               var10000 = 98;
               break;
            case 29:
               var10000 = 10;
               break;
            case 30:
               var10000 = 141;
               break;
            case 31:
               var10000 = 138;
               break;
            case 32:
               var10000 = 254;
               break;
            case 33:
               var10000 = 110;
               break;
            case 34:
               var10000 = 123;
               break;
            case 35:
               var10000 = 34;
               break;
            case 36:
               var10000 = 48;
               break;
            case 37:
               var10000 = 70;
               break;
            case 38:
               var10000 = 203;
               break;
            case 39:
               var10000 = 149;
               break;
            case 40:
               var10000 = 144;
               break;
            case 41:
               var10000 = 214;
               break;
            case 42:
               var10000 = 134;
               break;
            case 43:
               var10000 = 189;
               break;
            case 44:
               var10000 = 119;
               break;
            case 45:
               var10000 = 65;
               break;
            case 46:
               var10000 = 197;
               break;
            case 47:
               var10000 = 79;
               break;
            case 48:
               var10000 = 90;
               break;
            case 49:
               var10000 = 61;
               break;
            case 50:
               var10000 = 238;
               break;
            case 51:
               var10000 = 75;
               break;
            case 52:
               var10000 = 81;
               break;
            case 53:
               var10000 = 179;
               break;
            case 54:
               var10000 = 177;
               break;
            case 55:
               var10000 = 106;
               break;
            case 56:
               var10000 = 32;
               break;
            case 57:
               var10000 = 240;
               break;
            case 58:
               var10000 = 156;
               break;
            case 59:
               var10000 = 59;
               break;
            case 60:
               var10000 = 186;
               break;
            case 61:
               var10000 = 54;
               break;
            case 62:
               var10000 = 124;
               break;
            case 63:
               var10000 = 2;
               break;
            case 64:
               var10000 = 93;
               break;
            case 65:
               var10000 = 208;
               break;
            case 66:
               var10000 = 43;
               break;
            case 67:
               var10000 = 95;
               break;
            case 68:
               var10000 = 58;
               break;
            case 69:
               var10000 = 252;
               break;
            case 70:
               var10000 = 228;
               break;
            case 71:
               var10000 = 37;
               break;
            case 72:
               var10000 = 117;
               break;
            case 73:
               var10000 = 53;
               break;
            case 74:
               var10000 = 164;
               break;
            case 75:
               var10000 = 175;
               break;
            case 76:
               var10000 = 220;
               break;
            case 77:
               var10000 = 35;
               break;
            case 78:
               var10000 = 140;
               break;
            case 79:
               var10000 = 105;
               break;
            case 80:
               var10000 = 60;
               break;
            case 81:
               var10000 = 219;
               break;
            case 82:
               var10000 = 161;
               break;
            case 83:
               var10000 = 191;
               break;
            case 84:
               var10000 = 249;
               break;
            case 85:
               var10000 = 121;
               break;
            case 86:
               var10000 = 195;
               break;
            case 87:
               var10000 = 55;
               break;
            case 88:
               var10000 = 128;
               break;
            case 89:
               var10000 = 165;
               break;
            case 90:
               var10000 = 167;
               break;
            case 91:
               var10000 = 170;
               break;
            case 92:
               var10000 = 78;
               break;
            case 93:
               var10000 = 168;
               break;
            case 94:
               var10000 = 51;
               break;
            case 95:
               var10000 = 139;
               break;
            case 96:
               var10000 = 16;
               break;
            case 97:
               var10000 = 85;
               break;
            case 98:
               var10000 = 185;
               break;
            case 99:
               var10000 = 182;
               break;
            case 100:
               var10000 = 157;
               break;
            case 101:
               var10000 = 207;
               break;
            case 102:
               var10000 = 129;
               break;
            case 103:
               var10000 = 21;
               break;
            case 104:
               var10000 = 158;
               break;
            case 105:
               var10000 = 69;
               break;
            case 106:
               var10000 = 22;
               break;
            case 107:
               var10000 = 88;
               break;
            case 108:
               var10000 = 1;
               break;
            case 109:
               var10000 = 86;
               break;
            case 110:
               var10000 = 224;
               break;
            case 111:
               var10000 = 241;
               break;
            case 112:
               var10000 = 9;
               break;
            case 113:
               var10000 = 151;
               break;
            case 114:
               var10000 = 225;
               break;
            case 115:
               var10000 = 243;
               break;
            case 116:
               var10000 = 136;
               break;
            case 117:
               var10000 = 133;
               break;
            case 118:
               var10000 = 91;
               break;
            case 119:
               var10000 = 102;
               break;
            case 120:
               var10000 = 31;
               break;
            case 121:
               var10000 = 246;
               break;
            case 122:
               var10000 = 101;
               break;
            case 123:
               var10000 = 49;
               break;
            case 124:
               var10000 = 122;
               break;
            case 125:
               var10000 = 19;
               break;
            case 126:
               var10000 = 154;
               break;
            case 127:
               var10000 = 99;
               break;
            case 128:
               var10000 = 153;
               break;
            case 129:
               var10000 = 234;
               break;
            case 130:
               var10000 = 24;
               break;
            case 131:
               var10000 = 178;
               break;
            case 132:
               var10000 = 209;
               break;
            case 133:
               var10000 = 211;
               break;
            case 134:
               var10000 = 204;
               break;
            case 135:
               var10000 = 120;
               break;
            case 136:
               var10000 = 142;
               break;
            case 137:
               var10000 = 188;
               break;
            case 138:
               var10000 = 7;
               break;
            case 139:
               var10000 = 3;
               break;
            case 140:
               var10000 = 229;
               break;
            case 141:
               var10000 = 111;
               break;
            case 142:
               var10000 = 103;
               break;
            case 143:
               var10000 = 6;
               break;
            case 144:
               var10000 = 184;
               break;
            case 145:
               var10000 = 226;
               break;
            case 146:
               var10000 = 181;
               break;
            case 147:
               var10000 = 11;
               break;
            case 148:
               var10000 = 192;
               break;
            case 149:
               var10000 = 150;
               break;
            case 150:
               var10000 = 96;
               break;
            case 151:
               var10000 = 36;
               break;
            case 152:
               var10000 = 202;
               break;
            case 153:
               var10000 = 14;
               break;
            case 154:
               var10000 = 146;
               break;
            case 155:
               var10000 = 199;
               break;
            case 156:
               var10000 = 233;
               break;
            case 157:
               var10000 = 162;
               break;
            case 158:
               var10000 = 29;
               break;
            case 159:
               var10000 = 64;
               break;
            case 160:
               var10000 = 174;
               break;
            case 161:
               var10000 = 223;
               break;
            case 162:
               var10000 = 245;
               break;
            case 163:
               var10000 = 132;
               break;
            case 164:
               var10000 = 77;
               break;
            case 165:
               var10000 = 190;
               break;
            case 166:
               var10000 = 253;
               break;
            case 167:
               var10000 = 46;
               break;
            case 168:
               var10000 = 87;
               break;
            case 169:
               var10000 = 206;
               break;
            case 170:
               var10000 = 131;
               break;
            case 171:
               var10000 = 215;
               break;
            case 172:
               var10000 = 166;
               break;
            case 173:
               var10000 = 210;
               break;
            case 174:
               var10000 = 18;
               break;
            case 175:
               var10000 = 222;
               break;
            case 176:
               var10000 = 172;
               break;
            case 177:
               var10000 = 5;
               break;
            case 178:
               var10000 = 73;
               break;
            case 179:
               var10000 = 62;
               break;
            case 180:
               var10000 = 52;
               break;
            case 181:
               var10000 = 137;
               break;
            case 182:
               var10000 = 194;
               break;
            case 183:
               var10000 = 63;
               break;
            case 184:
               var10000 = 27;
               break;
            case 185:
               var10000 = 72;
               break;
            case 186:
               var10000 = 97;
               break;
            case 187:
               var10000 = 30;
               break;
            case 188:
               var10000 = 236;
               break;
            case 189:
               var10000 = 239;
               break;
            case 190:
               var10000 = 25;
               break;
            case 191:
               var10000 = 20;
               break;
            case 192:
               var10000 = 109;
               break;
            case 193:
               var10000 = 193;
               break;
            case 194:
               var10000 = 28;
               break;
            case 195:
               var10000 = 44;
               break;
            case 196:
               var10000 = 66;
               break;
            case 197:
               var10000 = 148;
               break;
            case 198:
               var10000 = 250;
               break;
            case 199:
               var10000 = 163;
               break;
            case 200:
               var10000 = 135;
               break;
            case 201:
               var10000 = 227;
               break;
            case 202:
               var10000 = 15;
               break;
            case 203:
               var10000 = 173;
               break;
            case 204:
               var10000 = 80;
               break;
            case 205:
               var10000 = 116;
               break;
            case 206:
               var10000 = 33;
               break;
            case 207:
               var10000 = 187;
               break;
            case 208:
               var10000 = 231;
               break;
            case 209:
               var10000 = 47;
               break;
            case 210:
               var10000 = 143;
               break;
            case 211:
               var10000 = 113;
               break;
            case 212:
               var10000 = 17;
               break;
            case 213:
               var10000 = 108;
               break;
            case 214:
               var10000 = 71;
               break;
            case 215:
               var10000 = 127;
               break;
            case 216:
               var10000 = 40;
               break;
            case 217:
               var10000 = 196;
               break;
            case 218:
               var10000 = 107;
               break;
            case 219:
               var10000 = 205;
               break;
            case 220:
               var10000 = 235;
               break;
            case 221:
               var10000 = 74;
               break;
            case 222:
               var10000 = 67;
               break;
            case 223:
               var10000 = 100;
               break;
            case 224:
               var10000 = 221;
               break;
            case 225:
               var10000 = 145;
               break;
            case 226:
               var10000 = 183;
               break;
            case 227:
               var10000 = 115;
               break;
            case 228:
               var10000 = 114;
               break;
            case 229:
               var10000 = 232;
               break;
            case 230:
               var10000 = 169;
               break;
            case 231:
               var10000 = 41;
               break;
            case 232:
               var10000 = 8;
               break;
            case 233:
               var10000 = 217;
               break;
            case 234:
               var10000 = 50;
               break;
            case 235:
               var10000 = 118;
               break;
            case 236:
               var10000 = 130;
               break;
            case 237:
               var10000 = 242;
               break;
            case 238:
               var10000 = 176;
               break;
            case 239:
               var10000 = 112;
               break;
            case 240:
               var10000 = 255;
               break;
            case 241:
               var10000 = 68;
               break;
            case 242:
               var10000 = 4;
               break;
            case 243:
               var10000 = 38;
               break;
            case 244:
               var10000 = 45;
               break;
            case 245:
               var10000 = 125;
               break;
            case 246:
               var10000 = 244;
               break;
            case 247:
               var10000 = 82;
               break;
            case 248:
               var10000 = 42;
               break;
            case 249:
               var10000 = 12;
               break;
            case 250:
               var10000 = 147;
               break;
            case 251:
               var10000 = 76;
               break;
            case 252:
               var10000 = 200;
               break;
            case 253:
               var10000 = 23;
               break;
            case 254:
               var10000 = 248;
               break;
            default:
               var10000 = 212;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12218;
      if (l[var3] == null) {
         l[var3] = (int)(f[var3] ^ var1);
      }

      return l[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[8];
      int var11 = 0;
      String var10 = ".|\t\u0013\u001b'Ã\bðúâÅH/<ÿ\u000eSº\u000fw=æGú\u009as\u001cúlÛ\ty\u009f¡»E03\u009c_\u001fÅrÝngÅ\f\u009eóÿ iÒ¢\u0015ûÔ1.è~\u0003ÎEá\u00147\u001bÏF\t\u000e5\u008eÃñ¤6tàü0Ð\u0092õÖ";
      int var12 = ".|\t\u0013\u001b'Ã\bðúâÅH/<ÿ\u000eSº\u000fw=æGú\u009as\u001cúlÛ\ty\u009f¡»E03\u009c_\u001fÅrÝngÅ\f\u009eóÿ iÒ¢\u0015ûÔ1.è~\u0003ÎEá\u00147\u001bÏF\t\u000e5\u008eÃñ¤6tàü0Ð\u0092õÖ"
         .length();
      char var9 = 7;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 97;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
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
                        var65 = 44;
                        break;
                     case 1:
                        var65 = 27;
                        break;
                     case 2:
                        var65 = 120;
                        break;
                     case 3:
                        var65 = 60;
                        break;
                     case 4:
                        var65 = 92;
                        break;
                     case 5:
                        var65 = 22;
                        break;
                     default:
                        var65 = 2;
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
                     d = var13;
                     e = new String[8];
                     long var0 = 94778274870883624L;
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "î°{Îäp\u0002G\u001eºÈ@\u0081\u0017³\u0094¼ÔTï\u009b|§e";
                     int var5 = "î°{Îäp\u0002G\u001eºÈ@\u0081\u0017³\u0094¼ÔTï\u009b|§e".length();
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
                                    f = var6;
                                    l = new Integer[5];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "óÇÝ \u008cÝ¥²\u009a®$8\u0014\u001cÏ\f";
                                 var5 = "óÇÝ \u008cÝ¥²\u009a®$8\u0014\u001cÏ\f".length();
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

                  var10 = "4ö\u0002\u00adµ";
                  var12 = "4ö\u0002\u00adµ".length();
                  var9 = 2;
                  var17 = -1;
            }

            var10000 = 34;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





