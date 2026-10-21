package com.finalshell.task;

import com.finalshell.core.CH;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class PasswordError2 implements Runnable {
   public final BufferedWriter A;
   public final String q;
   public final BufferedReader C;
   public final Process G;
   public final CH w;
   public static String[] a;
   public static String[] b;

   public PasswordError2(BufferedWriter var1, String var2, BufferedReader var3, Process var4, CH var5) {
      this.A = var1;
      this.q = var2;
      this.C = var3;
      this.G = var4;
      this.w = var5;
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
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 1
      // 004: aload 0
      // 005: ldc2_w 636647750796500976
      // 008: astore 5
      // 00a: ldc2_w 636647750796500976
      // 00d: aload 5
      // 00f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 012: checkcast java/io/BufferedWriter
      // 015: new java/lang/StringBuilder
      // 018: dup
      // 019: invokespecial java/lang/StringBuilder.<init> ()V
      // 01c: aload 0
      // 01d: ldc2_w 179553340939640161
      // 020: astore 7
      // 022: ldc2_w 179553340939640161
      // 025: aload 7
      // 027: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 02a: checkcast java/lang/String
      // 02d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 030: ldc "\n"
      // 032: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 035: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 038: invokevirtual java/io/BufferedWriter.write (Ljava/lang/String;)V
      // 03b: aload 0
      // 03c: ldc2_w 636647750796500976
      // 03f: astore 9
      // 041: ldc2_w 636647750796500976
      // 044: aload 9
      // 046: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 049: checkcast java/io/BufferedWriter
      // 04c: invokevirtual java/io/BufferedWriter.flush ()V
      // 04f: bipush 1
      // 050: istore 3
      // 051: aload 0
      // 052: ldc2_w 130606649057096355
      // 055: astore 11
      // 057: ldc2_w 130606649057096355
      // 05a: aload 11
      // 05c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05f: checkcast java/io/BufferedReader
      // 062: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 065: dup
      // 066: astore 2
      // 067: ifnull 14d
      // 06a: aload 1
      // 06b: ifnull 161
      // 06e: iload 3
      // 06f: ifeq 0f1
      // 072: goto 079
      // 075: invokestatic com/finalshell/task/PasswordError2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 078: athrow
      // 079: aload 2
      // 07a: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 07d: astore 4
      // 07f: aload 4
      // 081: sipush 8015
      // 084: sipush -31116
      // 087: invokestatic com/finalshell/task/PasswordError2.a (II)Ljava/lang/String;
      // 08a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 08d: aload 1
      // 08e: ifnull 0b0
      // 091: ifeq 0f1
      // 094: goto 09b
      // 097: invokestatic com/finalshell/task/PasswordError2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 09a: athrow
      // 09b: aload 4
      // 09d: sipush 8013
      // 0a0: sipush 16573
      // 0a3: invokestatic com/finalshell/task/PasswordError2.a (II)Ljava/lang/String;
      // 0a6: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/task/PasswordError2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0af: athrow
      // 0b0: ifeq 0f1
      // 0b3: aload 0
      // 0b4: ldc2_w 368890641500353539
      // 0b7: astore 13
      // 0b9: ldc2_w 368890641500353539
      // 0bc: aload 13
      // 0be: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c1: checkcast java/lang/Process
      // 0c4: invokevirtual java/lang/Process.destroy ()V
      // 0c7: aload 0
      // 0c8: ldc2_w 164187905795418814
      // 0cb: astore 15
      // 0cd: ldc2_w 164187905795418814
      // 0d0: aload 15
      // 0d2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d5: checkcast com/finalshell/core/CH
      // 0d8: sipush 8014
      // 0db: sipush -20043
      // 0de: invokestatic com/finalshell/task/PasswordError2.a (II)Ljava/lang/String;
      // 0e1: invokeinterface com/finalshell/core/CH.d (Ljava/lang/String;)V 2
      // 0e6: aload 1
      // 0e7: ifnonnull 14d
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/task/PasswordError2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: ldc2_w 164187905795418814
      // 0f5: astore 17
      // 0f7: ldc2_w 164187905795418814
      // 0fa: aload 17
      // 0fc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ff: checkcast com/finalshell/core/CH
      // 102: aload 1
      // 103: ifnull 12f
      // 106: goto 10d
      // 109: invokestatic com/finalshell/task/PasswordError2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 10c: athrow
      // 10d: ifnull 147
      // 110: goto 117
      // 113: invokestatic com/finalshell/task/PasswordError2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 116: athrow
      // 117: aload 0
      // 118: ldc2_w 164187905795418814
      // 11b: astore 19
      // 11d: ldc2_w 164187905795418814
      // 120: aload 19
      // 122: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 125: checkcast com/finalshell/core/CH
      // 128: goto 12f
      // 12b: invokestatic com/finalshell/task/PasswordError2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 12e: athrow
      // 12f: new java/lang/StringBuilder
      // 132: dup
      // 133: invokespecial java/lang/StringBuilder.<init> ()V
      // 136: aload 2
      // 137: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13a: ldc "\n"
      // 13c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 142: invokeinterface com/finalshell/core/CH.d (Ljava/lang/String;)V 2
      // 147: bipush 0
      // 148: istore 3
      // 149: aload 1
      // 14a: ifnonnull 051
      // 14d: aload 0
      // 14e: ldc2_w 130606649057096355
      // 151: astore 21
      // 153: ldc2_w 130606649057096355
      // 156: aload 21
      // 158: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 15b: checkcast java/io/BufferedReader
      // 15e: invokevirtual java/io/BufferedReader.close ()V
      // 161: goto 169
      // 164: astore 3
      // 165: aload 3
      // 166: invokevirtual java/io/IOException.printStackTrace ()V
      // 169: return
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 8015) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 162;
               break;
            case 1:
               var10000 = 170;
               break;
            case 2:
               var10000 = 21;
               break;
            case 3:
               var10000 = 18;
               break;
            case 4:
               var10000 = 41;
               break;
            case 5:
               var10000 = 233;
               break;
            case 6:
               var10000 = 114;
               break;
            case 7:
               var10000 = 152;
               break;
            case 8:
               var10000 = 148;
               break;
            case 9:
               var10000 = 194;
               break;
            case 10:
               var10000 = 253;
               break;
            case 11:
               var10000 = 249;
               break;
            case 12:
               var10000 = 102;
               break;
            case 13:
               var10000 = 213;
               break;
            case 14:
               var10000 = 31;
               break;
            case 15:
               var10000 = 126;
               break;
            case 16:
               var10000 = 23;
               break;
            case 17:
               var10000 = 7;
               break;
            case 18:
               var10000 = 39;
               break;
            case 19:
               var10000 = 197;
               break;
            case 20:
               var10000 = 88;
               break;
            case 21:
               var10000 = 117;
               break;
            case 22:
               var10000 = 143;
               break;
            case 23:
               var10000 = 130;
               break;
            case 24:
               var10000 = 133;
               break;
            case 25:
               var10000 = 138;
               break;
            case 26:
               var10000 = 110;
               break;
            case 27:
               var10000 = 232;
               break;
            case 28:
               var10000 = 182;
               break;
            case 29:
               var10000 = 74;
               break;
            case 30:
               var10000 = 84;
               break;
            case 31:
               var10000 = 155;
               break;
            case 32:
               var10000 = 48;
               break;
            case 33:
               var10000 = 199;
               break;
            case 34:
               var10000 = 80;
               break;
            case 35:
               var10000 = 89;
               break;
            case 36:
               var10000 = 111;
               break;
            case 37:
               var10000 = 100;
               break;
            case 38:
               var10000 = 45;
               break;
            case 39:
               var10000 = 195;
               break;
            case 40:
               var10000 = 187;
               break;
            case 41:
               var10000 = 24;
               break;
            case 42:
               var10000 = 212;
               break;
            case 43:
               var10000 = 186;
               break;
            case 44:
               var10000 = 177;
               break;
            case 45:
               var10000 = 220;
               break;
            case 46:
               var10000 = 223;
               break;
            case 47:
               var10000 = 224;
               break;
            case 48:
               var10000 = 29;
               break;
            case 49:
               var10000 = 58;
               break;
            case 50:
               var10000 = 141;
               break;
            case 51:
               var10000 = 201;
               break;
            case 52:
               var10000 = 16;
               break;
            case 53:
               var10000 = 25;
               break;
            case 54:
               var10000 = 65;
               break;
            case 55:
               var10000 = 144;
               break;
            case 56:
               var10000 = 109;
               break;
            case 57:
               var10000 = 241;
               break;
            case 58:
               var10000 = 128;
               break;
            case 59:
               var10000 = 14;
               break;
            case 60:
               var10000 = 151;
               break;
            case 61:
               var10000 = 119;
               break;
            case 62:
               var10000 = 246;
               break;
            case 63:
               var10000 = 206;
               break;
            case 64:
               var10000 = 76;
               break;
            case 65:
               var10000 = 43;
               break;
            case 66:
               var10000 = 131;
               break;
            case 67:
               var10000 = 47;
               break;
            case 68:
               var10000 = 251;
               break;
            case 69:
               var10000 = 196;
               break;
            case 70:
               var10000 = 184;
               break;
            case 71:
               var10000 = 168;
               break;
            case 72:
               var10000 = 98;
               break;
            case 73:
               var10000 = 54;
               break;
            case 74:
               var10000 = 228;
               break;
            case 75:
               var10000 = 210;
               break;
            case 76:
               var10000 = 189;
               break;
            case 77:
               var10000 = 165;
               break;
            case 78:
               var10000 = 56;
               break;
            case 79:
               var10000 = 127;
               break;
            case 80:
               var10000 = 169;
               break;
            case 81:
               var10000 = 9;
               break;
            case 82:
               var10000 = 44;
               break;
            case 83:
               var10000 = 12;
               break;
            case 84:
               var10000 = 234;
               break;
            case 85:
               var10000 = 42;
               break;
            case 86:
               var10000 = 5;
               break;
            case 87:
               var10000 = 0;
               break;
            case 88:
               var10000 = 198;
               break;
            case 89:
               var10000 = 179;
               break;
            case 90:
               var10000 = 200;
               break;
            case 91:
               var10000 = 255;
               break;
            case 92:
               var10000 = 227;
               break;
            case 93:
               var10000 = 107;
               break;
            case 94:
               var10000 = 122;
               break;
            case 95:
               var10000 = 166;
               break;
            case 96:
               var10000 = 59;
               break;
            case 97:
               var10000 = 229;
               break;
            case 98:
               var10000 = 61;
               break;
            case 99:
               var10000 = 62;
               break;
            case 100:
               var10000 = 178;
               break;
            case 101:
               var10000 = 135;
               break;
            case 102:
               var10000 = 92;
               break;
            case 103:
               var10000 = 207;
               break;
            case 104:
               var10000 = 167;
               break;
            case 105:
               var10000 = 26;
               break;
            case 106:
               var10000 = 238;
               break;
            case 107:
               var10000 = 147;
               break;
            case 108:
               var10000 = 192;
               break;
            case 109:
               var10000 = 209;
               break;
            case 110:
               var10000 = 4;
               break;
            case 111:
               var10000 = 205;
               break;
            case 112:
               var10000 = 6;
               break;
            case 113:
               var10000 = 254;
               break;
            case 114:
               var10000 = 20;
               break;
            case 115:
               var10000 = 121;
               break;
            case 116:
               var10000 = 230;
               break;
            case 117:
               var10000 = 244;
               break;
            case 118:
               var10000 = 28;
               break;
            case 119:
               var10000 = 219;
               break;
            case 120:
               var10000 = 99;
               break;
            case 121:
               var10000 = 38;
               break;
            case 122:
               var10000 = 72;
               break;
            case 123:
               var10000 = 36;
               break;
            case 124:
               var10000 = 181;
               break;
            case 125:
               var10000 = 71;
               break;
            case 126:
               var10000 = 37;
               break;
            case 127:
               var10000 = 242;
               break;
            case 128:
               var10000 = 118;
               break;
            case 129:
               var10000 = 97;
               break;
            case 130:
               var10000 = 247;
               break;
            case 131:
               var10000 = 240;
               break;
            case 132:
               var10000 = 172;
               break;
            case 133:
               var10000 = 101;
               break;
            case 134:
               var10000 = 193;
               break;
            case 135:
               var10000 = 185;
               break;
            case 136:
               var10000 = 120;
               break;
            case 137:
               var10000 = 11;
               break;
            case 138:
               var10000 = 22;
               break;
            case 139:
               var10000 = 104;
               break;
            case 140:
               var10000 = 94;
               break;
            case 141:
               var10000 = 202;
               break;
            case 142:
               var10000 = 221;
               break;
            case 143:
               var10000 = 86;
               break;
            case 144:
               var10000 = 108;
               break;
            case 145:
               var10000 = 17;
               break;
            case 146:
               var10000 = 174;
               break;
            case 147:
               var10000 = 123;
               break;
            case 148:
               var10000 = 81;
               break;
            case 149:
               var10000 = 124;
               break;
            case 150:
               var10000 = 180;
               break;
            case 151:
               var10000 = 68;
               break;
            case 152:
               var10000 = 245;
               break;
            case 153:
               var10000 = 60;
               break;
            case 154:
               var10000 = 239;
               break;
            case 155:
               var10000 = 132;
               break;
            case 156:
               var10000 = 73;
               break;
            case 157:
               var10000 = 173;
               break;
            case 158:
               var10000 = 149;
               break;
            case 159:
               var10000 = 113;
               break;
            case 160:
               var10000 = 70;
               break;
            case 161:
               var10000 = 140;
               break;
            case 162:
               var10000 = 231;
               break;
            case 163:
               var10000 = 161;
               break;
            case 164:
               var10000 = 160;
               break;
            case 165:
               var10000 = 225;
               break;
            case 166:
               var10000 = 66;
               break;
            case 167:
               var10000 = 95;
               break;
            case 168:
               var10000 = 33;
               break;
            case 169:
               var10000 = 129;
               break;
            case 170:
               var10000 = 214;
               break;
            case 171:
               var10000 = 248;
               break;
            case 172:
               var10000 = 115;
               break;
            case 173:
               var10000 = 96;
               break;
            case 174:
               var10000 = 222;
               break;
            case 175:
               var10000 = 145;
               break;
            case 176:
               var10000 = 63;
               break;
            case 177:
               var10000 = 183;
               break;
            case 178:
               var10000 = 64;
               break;
            case 179:
               var10000 = 159;
               break;
            case 180:
               var10000 = 87;
               break;
            case 181:
               var10000 = 190;
               break;
            case 182:
               var10000 = 137;
               break;
            case 183:
               var10000 = 78;
               break;
            case 184:
               var10000 = 164;
               break;
            case 185:
               var10000 = 53;
               break;
            case 186:
               var10000 = 69;
               break;
            case 187:
               var10000 = 188;
               break;
            case 188:
               var10000 = 236;
               break;
            case 189:
               var10000 = 158;
               break;
            case 190:
               var10000 = 19;
               break;
            case 191:
               var10000 = 146;
               break;
            case 192:
               var10000 = 51;
               break;
            case 193:
               var10000 = 243;
               break;
            case 194:
               var10000 = 90;
               break;
            case 195:
               var10000 = 27;
               break;
            case 196:
               var10000 = 52;
               break;
            case 197:
               var10000 = 216;
               break;
            case 198:
               var10000 = 175;
               break;
            case 199:
               var10000 = 150;
               break;
            case 200:
               var10000 = 171;
               break;
            case 201:
               var10000 = 106;
               break;
            case 202:
               var10000 = 116;
               break;
            case 203:
               var10000 = 176;
               break;
            case 204:
               var10000 = 91;
               break;
            case 205:
               var10000 = 237;
               break;
            case 206:
               var10000 = 163;
               break;
            case 207:
               var10000 = 105;
               break;
            case 208:
               var10000 = 34;
               break;
            case 209:
               var10000 = 235;
               break;
            case 210:
               var10000 = 215;
               break;
            case 211:
               var10000 = 15;
               break;
            case 212:
               var10000 = 157;
               break;
            case 213:
               var10000 = 142;
               break;
            case 214:
               var10000 = 154;
               break;
            case 215:
               var10000 = 191;
               break;
            case 216:
               var10000 = 40;
               break;
            case 217:
               var10000 = 67;
               break;
            case 218:
               var10000 = 156;
               break;
            case 219:
               var10000 = 55;
               break;
            case 220:
               var10000 = 50;
               break;
            case 221:
               var10000 = 3;
               break;
            case 222:
               var10000 = 13;
               break;
            case 223:
               var10000 = 125;
               break;
            case 224:
               var10000 = 8;
               break;
            case 225:
               var10000 = 83;
               break;
            case 226:
               var10000 = 35;
               break;
            case 227:
               var10000 = 134;
               break;
            case 228:
               var10000 = 85;
               break;
            case 229:
               var10000 = 250;
               break;
            case 230:
               var10000 = 204;
               break;
            case 231:
               var10000 = 2;
               break;
            case 232:
               var10000 = 10;
               break;
            case 233:
               var10000 = 136;
               break;
            case 234:
               var10000 = 75;
               break;
            case 235:
               var10000 = 218;
               break;
            case 236:
               var10000 = 77;
               break;
            case 237:
               var10000 = 57;
               break;
            case 238:
               var10000 = 217;
               break;
            case 239:
               var10000 = 82;
               break;
            case 240:
               var10000 = 208;
               break;
            case 241:
               var10000 = 226;
               break;
            case 242:
               var10000 = 211;
               break;
            case 243:
               var10000 = 32;
               break;
            case 244:
               var10000 = 252;
               break;
            case 245:
               var10000 = 153;
               break;
            case 246:
               var10000 = 79;
               break;
            case 247:
               var10000 = 203;
               break;
            case 248:
               var10000 = 1;
               break;
            case 249:
               var10000 = 103;
               break;
            case 250:
               var10000 = 49;
               break;
            case 251:
               var10000 = 46;
               break;
            case 252:
               var10000 = 112;
               break;
            case 253:
               var10000 = 30;
               break;
            case 254:
               var10000 = 139;
               break;
            default:
               var10000 = 93;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "¹Ù¼\u0094<\u0085ø\u008e\u0005孬磬锌诂p\u0003a§)";
      int var4 = "¹Ù¼\u0094<\u0085ø\u008e\u0005孬磬锌诂p\u0003a§)".length();
      char var1 = '\b';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 73;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 73;
               var10006 = var6;
            } else {
               var13 = 73;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 73;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 84;
                     break;
                  case 1:
                     var29 = 23;
                     break;
                  case 2:
                     var29 = 108;
                     break;
                  case 3:
                     var29 = 19;
                     break;
                  case 4:
                     var29 = 44;
                     break;
                  case 5:
                     var29 = 103;
                     break;
                  default:
                     var29 = 113;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
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
}





