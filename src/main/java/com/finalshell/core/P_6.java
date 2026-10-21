package com.finalshell.core;

import java.io.IOException;

public class P_6 extends ClassLoader {
   public final J_5 g;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public P_6(J_5 var1, ClassLoader var2) {
      super(var2);
      this.g = var1;
   }

   public J_5 s() {
      return this.g;
   }

   @Override
   public java.lang.Class findClass(@C_9 String param1) throws ClassNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/N_5.R ()Z
      // 003: istore 2
      // 004: getstatic com/finalshell/core/P_6.M Z
      // 007: ifne 021
      // 00a: aload 1
      // 00b: ifnonnull 021
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/P_6.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 014: athrow
      // 015: new java/lang/AssertionError
      // 018: dup
      // 019: invokespecial java/lang/AssertionError.<init> ()V
      // 01c: athrow
      // 01d: invokestatic com/finalshell/core/P_6.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 020: athrow
      // 021: aload 0
      // 022: getfield com/finalshell/core/P_6.g Lcom/finalshell/core/J_5;
      // 025: new java/lang/StringBuilder
      // 028: dup
      // 029: invokespecial java/lang/StringBuilder.<init> ()V
      // 02c: aload 1
      // 02d: sipush 22525
      // 030: ldc2_w 6999755780554242260
      // 033: invokestatic com/finalshell/core/P_6.a (IJ)I
      // 036: sipush 31101
      // 039: ldc2_w 8055182954161837654
      // 03c: invokestatic com/finalshell/core/P_6.a (IJ)I
      // 03f: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 042: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 045: sipush -11894
      // 048: sipush 15918
      // 04b: invokestatic com/finalshell/core/P_6.a (II)Ljava/lang/String;
      // 04e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 051: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 054: invokevirtual com/finalshell/core/J_5.J (Ljava/lang/String;)Lcom/finalshell/core/N_6;
      // 057: astore 3
      // 058: aload 3
      // 059: iload 2
      // 05a: ifeq 075
      // 05d: ifnonnull 074
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/P_6.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 066: athrow
      // 067: new java/lang/ClassNotFoundException
      // 06a: dup
      // 06b: aload 1
      // 06c: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;)V
      // 06f: athrow
      // 070: invokestatic com/finalshell/core/P_6.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 073: athrow
      // 074: aload 3
      // 075: invokeinterface com/finalshell/core/N_6.o$InputStream ()Ljava/io/InputStream; 1
      // 07a: astore 4
      // 07c: goto 0be
      // 07f: astore 5
      // 081: new java/lang/ClassNotFoundException
      // 084: dup
      // 085: new java/lang/StringBuilder
      // 088: dup
      // 089: invokespecial java/lang/StringBuilder.<init> ()V
      // 08c: sipush -11893
      // 08f: sipush -6315
      // 092: invokestatic com/finalshell/core/P_6.a (II)Ljava/lang/String;
      // 095: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 098: aload 3
      // 099: invokeinterface com/finalshell/core/N_6.o$String ()Ljava/lang/String; 1
      // 09e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a1: sipush -11895
      // 0a4: sipush 23998
      // 0a7: invokestatic com/finalshell/core/P_6.a (II)Ljava/lang/String;
      // 0aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ad: aload 5
      // 0af: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 0b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b8: aload 5
      // 0ba: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 0bd: athrow
      // 0be: new java/io/ByteArrayOutputStream
      // 0c1: dup
      // 0c2: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 0c5: astore 5
      // 0c7: sipush 7335
      // 0ca: ldc2_w 6378701561424638863
      // 0cd: invokestatic com/finalshell/core/P_6.a (IJ)I
      // 0d0: newarray 8
      // 0d2: astore 6
      // 0d4: aload 4
      // 0d6: aload 6
      // 0d8: invokevirtual java/io/InputStream.read ([B)I
      // 0db: istore 7
      // 0dd: iload 7
      // 0df: bipush -1
      // 0e0: if_icmpne 0e6
      // 0e3: goto 0f4
      // 0e6: aload 5
      // 0e8: aload 6
      // 0ea: bipush 0
      // 0eb: iload 7
      // 0ed: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
      // 0f0: iload 2
      // 0f1: ifne 0d4
      // 0f4: aload 4
      // 0f6: invokevirtual java/io/InputStream.close ()V
      // 0f9: goto 13b
      // 0fc: astore 6
      // 0fe: goto 13b
      // 101: astore 6
      // 103: new java/lang/ClassNotFoundException
      // 106: dup
      // 107: new java/lang/StringBuilder
      // 10a: dup
      // 10b: invokespecial java/lang/StringBuilder.<init> ()V
      // 10e: sipush -11896
      // 111: sipush -26839
      // 114: invokestatic com/finalshell/core/P_6.a (II)Ljava/lang/String;
      // 117: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11a: aload 3
      // 11b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 11e: ldc "\""
      // 120: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 123: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 126: aload 6
      // 128: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 12b: athrow
      // 12c: astore 8
      // 12e: aload 4
      // 130: invokevirtual java/io/InputStream.close ()V
      // 133: goto 138
      // 136: astore 9
      // 138: aload 8
      // 13a: athrow
      // 13b: aload 5
      // 13d: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 140: astore 6
      // 142: aload 0
      // 143: aconst_null
      // 144: aload 6
      // 146: bipush 0
      // 147: aload 6
      // 149: arraylength
      // 14a: invokespecial java/lang/ClassLoader.defineClass (Ljava/lang/String;[BII)Ljava/lang/Class;
      // 14d: astore 7
      // 14f: aload 7
      // 151: iload 2
      // 152: ifeq 175
      // 155: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 158: aload 1
      // 159: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15c: ifne 173
      // 15f: goto 166
      // 162: invokestatic com/finalshell/core/P_6.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 165: athrow
      // 166: new java/lang/ClassNotFoundException
      // 169: dup
      // 16a: aload 1
      // 16b: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;)V
      // 16e: athrow
      // 16f: invokestatic com/finalshell/core/P_6.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 172: athrow
      // 173: aload 7
      // 175: areturn
   }

   static {
      __vfClinit__();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -11896) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 248;
               break;
            case 1:
               var10000 = 170;
               break;
            case 2:
               var10000 = 34;
               break;
            case 3:
               var10000 = 251;
               break;
            case 4:
               var10000 = 243;
               break;
            case 5:
               var10000 = 10;
               break;
            case 6:
               var10000 = 213;
               break;
            case 7:
               var10000 = 15;
               break;
            case 8:
               var10000 = 254;
               break;
            case 9:
               var10000 = 147;
               break;
            case 10:
               var10000 = 75;
               break;
            case 11:
               var10000 = 7;
               break;
            case 12:
               var10000 = 36;
               break;
            case 13:
               var10000 = 119;
               break;
            case 14:
               var10000 = 215;
               break;
            case 15:
               var10000 = 156;
               break;
            case 16:
               var10000 = 145;
               break;
            case 17:
               var10000 = 95;
               break;
            case 18:
               var10000 = 221;
               break;
            case 19:
               var10000 = 25;
               break;
            case 20:
               var10000 = 105;
               break;
            case 21:
               var10000 = 59;
               break;
            case 22:
               var10000 = 104;
               break;
            case 23:
               var10000 = 35;
               break;
            case 24:
               var10000 = 13;
               break;
            case 25:
               var10000 = 231;
               break;
            case 26:
               var10000 = 212;
               break;
            case 27:
               var10000 = 158;
               break;
            case 28:
               var10000 = 116;
               break;
            case 29:
               var10000 = 117;
               break;
            case 30:
               var10000 = 216;
               break;
            case 31:
               var10000 = 89;
               break;
            case 32:
               var10000 = 94;
               break;
            case 33:
               var10000 = 99;
               break;
            case 34:
               var10000 = 141;
               break;
            case 35:
               var10000 = 245;
               break;
            case 36:
               var10000 = 111;
               break;
            case 37:
               var10000 = 56;
               break;
            case 38:
               var10000 = 113;
               break;
            case 39:
               var10000 = 29;
               break;
            case 40:
               var10000 = 121;
               break;
            case 41:
               var10000 = 22;
               break;
            case 42:
               var10000 = 54;
               break;
            case 43:
               var10000 = 98;
               break;
            case 44:
               var10000 = 163;
               break;
            case 45:
               var10000 = 9;
               break;
            case 46:
               var10000 = 120;
               break;
            case 47:
               var10000 = 42;
               break;
            case 48:
               var10000 = 173;
               break;
            case 49:
               var10000 = 195;
               break;
            case 50:
               var10000 = 211;
               break;
            case 51:
               var10000 = 17;
               break;
            case 52:
               var10000 = 86;
               break;
            case 53:
               var10000 = 187;
               break;
            case 54:
               var10000 = 148;
               break;
            case 55:
               var10000 = 122;
               break;
            case 56:
               var10000 = 227;
               break;
            case 57:
               var10000 = 222;
               break;
            case 58:
               var10000 = 23;
               break;
            case 59:
               var10000 = 31;
               break;
            case 60:
               var10000 = 205;
               break;
            case 61:
               var10000 = 182;
               break;
            case 62:
               var10000 = 11;
               break;
            case 63:
               var10000 = 134;
               break;
            case 64:
               var10000 = 169;
               break;
            case 65:
               var10000 = 28;
               break;
            case 66:
               var10000 = 77;
               break;
            case 67:
               var10000 = 167;
               break;
            case 68:
               var10000 = 30;
               break;
            case 69:
               var10000 = 152;
               break;
            case 70:
               var10000 = 223;
               break;
            case 71:
               var10000 = 73;
               break;
            case 72:
               var10000 = 41;
               break;
            case 73:
               var10000 = 204;
               break;
            case 74:
               var10000 = 197;
               break;
            case 75:
               var10000 = 133;
               break;
            case 76:
               var10000 = 72;
               break;
            case 77:
               var10000 = 110;
               break;
            case 78:
               var10000 = 64;
               break;
            case 79:
               var10000 = 32;
               break;
            case 80:
               var10000 = 217;
               break;
            case 81:
               var10000 = 214;
               break;
            case 82:
               var10000 = 164;
               break;
            case 83:
               var10000 = 44;
               break;
            case 84:
               var10000 = 176;
               break;
            case 85:
               var10000 = 154;
               break;
            case 86:
               var10000 = 185;
               break;
            case 87:
               var10000 = 155;
               break;
            case 88:
               var10000 = 3;
               break;
            case 89:
               var10000 = 63;
               break;
            case 90:
               var10000 = 157;
               break;
            case 91:
               var10000 = 48;
               break;
            case 92:
               var10000 = 114;
               break;
            case 93:
               var10000 = 91;
               break;
            case 94:
               var10000 = 143;
               break;
            case 95:
               var10000 = 52;
               break;
            case 96:
               var10000 = 230;
               break;
            case 97:
               var10000 = 150;
               break;
            case 98:
               var10000 = 225;
               break;
            case 99:
               var10000 = 128;
               break;
            case 100:
               var10000 = 209;
               break;
            case 101:
               var10000 = 80;
               break;
            case 102:
               var10000 = 92;
               break;
            case 103:
               var10000 = 181;
               break;
            case 104:
               var10000 = 26;
               break;
            case 105:
               var10000 = 55;
               break;
            case 106:
               var10000 = 12;
               break;
            case 107:
               var10000 = 129;
               break;
            case 108:
               var10000 = 235;
               break;
            case 109:
               var10000 = 183;
               break;
            case 110:
               var10000 = 177;
               break;
            case 111:
               var10000 = 81;
               break;
            case 112:
               var10000 = 27;
               break;
            case 113:
               var10000 = 161;
               break;
            case 114:
               var10000 = 142;
               break;
            case 115:
               var10000 = 166;
               break;
            case 116:
               var10000 = 218;
               break;
            case 117:
               var10000 = 179;
               break;
            case 118:
               var10000 = 51;
               break;
            case 119:
               var10000 = 24;
               break;
            case 120:
               var10000 = 165;
               break;
            case 121:
               var10000 = 82;
               break;
            case 122:
               var10000 = 109;
               break;
            case 123:
               var10000 = 131;
               break;
            case 124:
               var10000 = 14;
               break;
            case 125:
               var10000 = 124;
               break;
            case 126:
               var10000 = 115;
               break;
            case 127:
               var10000 = 194;
               break;
            case 128:
               var10000 = 126;
               break;
            case 129:
               var10000 = 229;
               break;
            case 130:
               var10000 = 118;
               break;
            case 131:
               var10000 = 78;
               break;
            case 132:
               var10000 = 21;
               break;
            case 133:
               var10000 = 125;
               break;
            case 134:
               var10000 = 186;
               break;
            case 135:
               var10000 = 252;
               break;
            case 136:
               var10000 = 97;
               break;
            case 137:
               var10000 = 107;
               break;
            case 138:
               var10000 = 67;
               break;
            case 139:
               var10000 = 19;
               break;
            case 140:
               var10000 = 39;
               break;
            case 141:
               var10000 = 4;
               break;
            case 142:
               var10000 = 171;
               break;
            case 143:
               var10000 = 208;
               break;
            case 144:
               var10000 = 220;
               break;
            case 145:
               var10000 = 174;
               break;
            case 146:
               var10000 = 90;
               break;
            case 147:
               var10000 = 62;
               break;
            case 148:
               var10000 = 198;
               break;
            case 149:
               var10000 = 192;
               break;
            case 150:
               var10000 = 160;
               break;
            case 151:
               var10000 = 100;
               break;
            case 152:
               var10000 = 68;
               break;
            case 153:
               var10000 = 96;
               break;
            case 154:
               var10000 = 6;
               break;
            case 155:
               var10000 = 57;
               break;
            case 156:
               var10000 = 244;
               break;
            case 157:
               var10000 = 180;
               break;
            case 158:
               var10000 = 101;
               break;
            case 159:
               var10000 = 85;
               break;
            case 160:
               var10000 = 188;
               break;
            case 161:
               var10000 = 137;
               break;
            case 162:
               var10000 = 199;
               break;
            case 163:
               var10000 = 135;
               break;
            case 164:
               var10000 = 33;
               break;
            case 165:
               var10000 = 66;
               break;
            case 166:
               var10000 = 193;
               break;
            case 167:
               var10000 = 249;
               break;
            case 168:
               var10000 = 238;
               break;
            case 169:
               var10000 = 53;
               break;
            case 170:
               var10000 = 175;
               break;
            case 171:
               var10000 = 240;
               break;
            case 172:
               var10000 = 5;
               break;
            case 173:
               var10000 = 74;
               break;
            case 174:
               var10000 = 189;
               break;
            case 175:
               var10000 = 234;
               break;
            case 176:
               var10000 = 140;
               break;
            case 177:
               var10000 = 206;
               break;
            case 178:
               var10000 = 127;
               break;
            case 179:
               var10000 = 191;
               break;
            case 180:
               var10000 = 46;
               break;
            case 181:
               var10000 = 196;
               break;
            case 182:
               var10000 = 207;
               break;
            case 183:
               var10000 = 65;
               break;
            case 184:
               var10000 = 70;
               break;
            case 185:
               var10000 = 224;
               break;
            case 186:
               var10000 = 190;
               break;
            case 187:
               var10000 = 210;
               break;
            case 188:
               var10000 = 106;
               break;
            case 189:
               var10000 = 93;
               break;
            case 190:
               var10000 = 246;
               break;
            case 191:
               var10000 = 242;
               break;
            case 192:
               var10000 = 153;
               break;
            case 193:
               var10000 = 84;
               break;
            case 194:
               var10000 = 241;
               break;
            case 195:
               var10000 = 239;
               break;
            case 196:
               var10000 = 146;
               break;
            case 197:
               var10000 = 136;
               break;
            case 198:
               var10000 = 226;
               break;
            case 199:
               var10000 = 50;
               break;
            case 200:
               var10000 = 202;
               break;
            case 201:
               var10000 = 103;
               break;
            case 202:
               var10000 = 172;
               break;
            case 203:
               var10000 = 247;
               break;
            case 204:
               var10000 = 250;
               break;
            case 205:
               var10000 = 228;
               break;
            case 206:
               var10000 = 201;
               break;
            case 207:
               var10000 = 18;
               break;
            case 208:
               var10000 = 149;
               break;
            case 209:
               var10000 = 1;
               break;
            case 210:
               var10000 = 178;
               break;
            case 211:
               var10000 = 159;
               break;
            case 212:
               var10000 = 83;
               break;
            case 213:
               var10000 = 58;
               break;
            case 214:
               var10000 = 40;
               break;
            case 215:
               var10000 = 20;
               break;
            case 216:
               var10000 = 45;
               break;
            case 217:
               var10000 = 236;
               break;
            case 218:
               var10000 = 38;
               break;
            case 219:
               var10000 = 2;
               break;
            case 220:
               var10000 = 219;
               break;
            case 221:
               var10000 = 138;
               break;
            case 222:
               var10000 = 130;
               break;
            case 223:
               var10000 = 132;
               break;
            case 224:
               var10000 = 88;
               break;
            case 225:
               var10000 = 76;
               break;
            case 226:
               var10000 = 71;
               break;
            case 227:
               var10000 = 102;
               break;
            case 228:
               var10000 = 255;
               break;
            case 229:
               var10000 = 87;
               break;
            case 230:
               var10000 = 237;
               break;
            case 231:
               var10000 = 49;
               break;
            case 232:
               var10000 = 184;
               break;
            case 233:
               var10000 = 200;
               break;
            case 234:
               var10000 = 203;
               break;
            case 235:
               var10000 = 233;
               break;
            case 236:
               var10000 = 123;
               break;
            case 237:
               var10000 = 79;
               break;
            case 238:
               var10000 = 168;
               break;
            case 239:
               var10000 = 37;
               break;
            case 240:
               var10000 = 60;
               break;
            case 241:
               var10000 = 0;
               break;
            case 242:
               var10000 = 8;
               break;
            case 243:
               var10000 = 43;
               break;
            case 244:
               var10000 = 16;
               break;
            case 245:
               var10000 = 47;
               break;
            case 246:
               var10000 = 61;
               break;
            case 247:
               var10000 = 151;
               break;
            case 248:
               var10000 = 139;
               break;
            case 249:
               var10000 = 69;
               break;
            case 250:
               var10000 = 232;
               break;
            case 251:
               var10000 = 108;
               break;
            case 252:
               var10000 = 162;
               break;
            case 253:
               var10000 = 112;
               break;
            case 254:
               var10000 = 253;
               break;
            default:
               var10000 = 144;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28457;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      boolean M;
      char[] var30;
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = ";â\u009d/q\u0092r\u000b\u0085ª\u0000!ÏfX¢N«î+ôzìn¡\u00034µC";
      int var12 = ";â\u009d/q\u0092r\u000b\u0085ª\u0000!ÏfX¢N«î+ôzìn¡\u00034µC".length();
      char var9 = 25;
      int var16 = -1;

      label68:
      while (true) {
         byte var10000 = 113;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label63: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label63;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 76;
                        break;
                     case 1:
                        var58 = 52;
                        break;
                     case 2:
                        var58 = 85;
                        break;
                     case 3:
                        var58 = 7;
                        break;
                     case 4:
                        var58 = 19;
                        break;
                     case 5:
                        var58 = 78;
                        break;
                     default:
                        var58 = 66;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[4];
                     long var0 = 7202741100356347888L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "ÅyÄ\u001e¹´\u009f\n\u0086\u0016®èO)D\u007f¸U\u001a¾\u0080A±\u0089";
                     int var5 = "ÅyÄ\u001e¹´\u009f\n\u0086\u0016®èO)D\u007f¸U\u001a¾\u0080A±\u0089".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     c = var6;
                     d = new Integer[3];
                     M = !P_6.class.desiredAssertionStatus();
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label68;
                  }

                  var10 = "rw¹\u00ad°\u0089\u001d½\f\u0004¼5X\t¡\u0019\f`\u00060qT³<zSö§¸\u0082\u000f\u008dLê*\u009f";
                  var12 = "rw¹\u00ad°\u0089\u001d½\f\u0004¼5X\t¡\u0019\f`\u00060qT³<zSö§¸\u0082\u000f\u008dLê*\u009f".length();
                  var9 = 6;
                  var16 = -1;
            }

            var10000 = 13;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





