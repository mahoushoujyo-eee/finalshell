package com.finalshell.core;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

import com.finalshell.ui.panel.Ky4;
import java.io.IOException;
import java.net.Socket;

public final class HttpProxySocketFactory {
   public static Ky4[] s;
   public static String[] a;
   public static String[] b;
   public static long c;

   public static Socket I(String param0, int param1, String param2, int param3, String param4, String param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Fi4.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: new java/net/Socket
      // 006: dup
      // 007: aload 2
      // 008: iload 3
      // 009: invokespecial java/net/Socket.<init> (Ljava/lang/String;I)V
      // 00c: astore 7
      // 00e: astore 6
      // 010: new java/lang/StringBuilder
      // 013: dup
      // 014: invokespecial java/lang/StringBuilder.<init> ()V
      // 017: sipush 3156
      // 01a: sipush -22202
      // 01d: invokestatic com/finalshell/core/Fi4.a (II)Ljava/lang/String;
      // 020: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 023: aload 0
      // 024: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 027: ldc ":"
      // 029: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02c: iload 1
      // 02d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 030: sipush 3154
      // 033: sipush 15212
      // 036: invokestatic com/finalshell/core/Fi4.a (II)Ljava/lang/String;
      // 039: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 03f: astore 8
      // 041: aload 4
      // 043: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 046: ldc2_w 330094358428833085
      // 049: astore 13
      // 04b: ldc2_w 330094358428833085
      // 04e: aload 13
      // 050: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 053: checkcast java/lang/Boolean
      // 056: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 059: goto 060
      // 05c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05f: athrow
      // 060: aload 6
      // 062: ifnull 0a1
      // 065: ifne 122
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/Fi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: aload 5
      // 071: aload 6
      // 073: ifnull 0c5
      // 076: goto 07d
      // 079: invokestatic com/finalshell/core/Fi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c: athrow
      // 07d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 080: ldc2_w 330094358428833085
      // 083: astore 15
      // 085: ldc2_w 330094358428833085
      // 088: aload 15
      // 08a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 08d: checkcast java/lang/Boolean
      // 090: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 093: goto 09a
      // 096: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 099: athrow
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/Fi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: ifne 122
      // 0a4: sipush 3159
      // 0a7: sipush 24796
      // 0aa: invokestatic com/finalshell/core/Fi4.a (II)Ljava/lang/String;
      // 0ad: bipush 2
      // 0ae: anewarray 4
      // 0b1: dup
      // 0b2: bipush 0
      // 0b3: aload 4
      // 0b5: aastore
      // 0b6: dup
      // 0b7: bipush 1
      // 0b8: aload 5
      // 0ba: aastore
      // 0bb: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/Fi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: astore 9
      // 0c7: aload 9
      // 0c9: invokevirtual java/lang/String.getBytes ()[B
      // 0cc: invokestatic com/finalshell/core/Ay2.t ([B)Ljava/lang/String;
      // 0cf: astore 10
      // 0d1: aload 10
      // 0d3: sipush 3161
      // 0d6: sipush 31418
      // 0d9: invokestatic com/finalshell/core/Fi4.a (II)Ljava/lang/String;
      // 0dc: ldc ""
      // 0de: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0e1: astore 10
      // 0e3: new java/lang/StringBuilder
      // 0e6: dup
      // 0e7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ea: aload 8
      // 0ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef: sipush 3152
      // 0f2: sipush -11581
      // 0f5: invokestatic com/finalshell/core/Fi4.a (II)Ljava/lang/String;
      // 0f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fb: aload 10
      // 0fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 100: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 103: astore 8
      // 105: new java/lang/StringBuilder
      // 108: dup
      // 109: invokespecial java/lang/StringBuilder.<init> ()V
      // 10c: aload 8
      // 10e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 111: sipush 3158
      // 114: sipush 18093
      // 117: invokestatic com/finalshell/core/Fi4.a (II)Ljava/lang/String;
      // 11a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 120: astore 8
      // 122: goto 12c
      // 125: astore 9
      // 127: aload 9
      // 129: invokevirtual java/lang/Exception.printStackTrace ()V
      // 12c: new java/lang/StringBuilder
      // 12f: dup
      // 130: invokespecial java/lang/StringBuilder.<init> ()V
      // 133: aload 8
      // 135: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 138: sipush 3153
      // 13b: sipush -16574
      // 13e: invokestatic com/finalshell/core/Fi4.a (II)Ljava/lang/String;
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 144: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 147: astore 8
      // 149: aload 7
      // 14b: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 14e: aload 8
      // 150: invokevirtual java/lang/String.getBytes ()[B
      // 153: invokevirtual java/io/OutputStream.write ([B)V
      // 156: getstatic com/finalshell/core/Fi4.c J
      // 159: l2i
      // 15a: newarray 8
      // 15c: astore 9
      // 15e: aload 7
      // 160: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 163: astore 10
      // 165: aload 10
      // 167: aload 9
      // 169: bipush 0
      // 16a: aload 9
      // 16c: arraylength
      // 16d: invokevirtual java/io/InputStream.read ([BII)I
      // 170: istore 11
      // 172: iload 11
      // 174: ifgt 18c
      // 177: new java/net/SocketException
      // 17a: dup
      // 17b: sipush 3155
      // 17e: sipush 31509
      // 181: invokestatic com/finalshell/core/Fi4.a (II)Ljava/lang/String;
      // 184: invokespecial java/net/SocketException.<init> (Ljava/lang/String;)V
      // 187: athrow
      // 188: invokestatic com/finalshell/core/Fi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18b: athrow
      // 18c: new java/lang/String
      // 18f: dup
      // 190: aload 9
      // 192: bipush 0
      // 193: iload 11
      // 195: sipush 3162
      // 198: sipush -18821
      // 19b: invokestatic com/finalshell/core/Fi4.a (II)Ljava/lang/String;
      // 19e: invokespecial java/lang/String.<init> ([BIILjava/lang/String;)V
      // 1a1: astore 12
      // 1a3: aload 12
      // 1a5: sipush 3157
      // 1a8: sipush 28853
      // 1ab: invokestatic com/finalshell/core/Fi4.a (II)Ljava/lang/String;
      // 1ae: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 1b1: aload 6
      // 1b3: ifnull 1d9
      // 1b6: bipush -1
      // 1b7: if_icmpeq 1fe
      // 1ba: goto 1c1
      // 1bd: invokestatic com/finalshell/core/Fi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c0: athrow
      // 1c1: aload 10
      // 1c3: aload 6
      // 1c5: ifnull 1de
      // 1c8: goto 1cf
      // 1cb: invokestatic com/finalshell/core/Fi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ce: athrow
      // 1cf: invokevirtual java/io/InputStream.available ()I
      // 1d2: goto 1d9
      // 1d5: invokestatic com/finalshell/core/Fi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d8: athrow
      // 1d9: ifle 1e8
      // 1dc: aload 10
      // 1de: aload 10
      // 1e0: invokevirtual java/io/InputStream.available ()I
      // 1e3: i2l
      // 1e4: invokevirtual java/io/InputStream.skip (J)J
      // 1e7: pop2
      // 1e8: aload 7
      // 1ea: aload 6
      // 1ec: ifnonnull 1fd
      // 1ef: bipush 3
      // 1f0: anewarray 81
      // 1f3: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 1f6: goto 1fd
      // 1f9: invokestatic com/finalshell/core/Fi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fc: athrow
      // 1fd: areturn
      // 1fe: new com/finalshell/network/Ti4
      // 201: dup
      // 202: sipush 3163
      // 205: sipush 19653
      // 208: invokestatic com/finalshell/core/Fi4.a (II)Ljava/lang/String;
      // 20b: aload 12
      // 20d: invokespecial com/finalshell/network/Ti4.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 210: athrow
   }

   public static void N(Ky4[] var0) {
      s = var0;
   }

   public static Ky4[] P() {
      return s;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 3155) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 62;
               break;
            case 1:
               var10000 = 7;
               break;
            case 2:
               var10000 = 71;
               break;
            case 3:
               var10000 = 86;
               break;
            case 4:
               var10000 = 55;
               break;
            case 5:
               var10000 = 81;
               break;
            case 6:
               var10000 = 14;
               break;
            case 7:
               var10000 = 147;
               break;
            case 8:
               var10000 = 18;
               break;
            case 9:
               var10000 = 176;
               break;
            case 10:
               var10000 = 91;
               break;
            case 11:
               var10000 = 188;
               break;
            case 12:
               var10000 = 70;
               break;
            case 13:
               var10000 = 6;
               break;
            case 14:
               var10000 = 66;
               break;
            case 15:
               var10000 = 92;
               break;
            case 16:
               var10000 = 57;
               break;
            case 17:
               var10000 = 178;
               break;
            case 18:
               var10000 = 56;
               break;
            case 19:
               var10000 = 232;
               break;
            case 20:
               var10000 = 157;
               break;
            case 21:
               var10000 = 185;
               break;
            case 22:
               var10000 = 225;
               break;
            case 23:
               var10000 = 244;
               break;
            case 24:
               var10000 = 198;
               break;
            case 25:
               var10000 = 88;
               break;
            case 26:
               var10000 = 214;
               break;
            case 27:
               var10000 = 102;
               break;
            case 28:
               var10000 = 131;
               break;
            case 29:
               var10000 = 153;
               break;
            case 30:
               var10000 = 173;
               break;
            case 31:
               var10000 = 46;
               break;
            case 32:
               var10000 = 67;
               break;
            case 33:
               var10000 = 238;
               break;
            case 34:
               var10000 = 211;
               break;
            case 35:
               var10000 = 228;
               break;
            case 36:
               var10000 = 224;
               break;
            case 37:
               var10000 = 227;
               break;
            case 38:
               var10000 = 243;
               break;
            case 39:
               var10000 = 35;
               break;
            case 40:
               var10000 = 163;
               break;
            case 41:
               var10000 = 179;
               break;
            case 42:
               var10000 = 124;
               break;
            case 43:
               var10000 = 161;
               break;
            case 44:
               var10000 = 79;
               break;
            case 45:
               var10000 = 169;
               break;
            case 46:
               var10000 = 45;
               break;
            case 47:
               var10000 = 234;
               break;
            case 48:
               var10000 = 133;
               break;
            case 49:
               var10000 = 204;
               break;
            case 50:
               var10000 = 19;
               break;
            case 51:
               var10000 = 152;
               break;
            case 52:
               var10000 = 186;
               break;
            case 53:
               var10000 = 210;
               break;
            case 54:
               var10000 = 201;
               break;
            case 55:
               var10000 = 109;
               break;
            case 56:
               var10000 = 195;
               break;
            case 57:
               var10000 = 84;
               break;
            case 58:
               var10000 = 31;
               break;
            case 59:
               var10000 = 229;
               break;
            case 60:
               var10000 = 3;
               break;
            case 61:
               var10000 = 21;
               break;
            case 62:
               var10000 = 87;
               break;
            case 63:
               var10000 = 5;
               break;
            case 64:
               var10000 = 175;
               break;
            case 65:
               var10000 = 128;
               break;
            case 66:
               var10000 = 172;
               break;
            case 67:
               var10000 = 68;
               break;
            case 68:
               var10000 = 23;
               break;
            case 69:
               var10000 = 207;
               break;
            case 70:
               var10000 = 111;
               break;
            case 71:
               var10000 = 208;
               break;
            case 72:
               var10000 = 242;
               break;
            case 73:
               var10000 = 33;
               break;
            case 74:
               var10000 = 101;
               break;
            case 75:
               var10000 = 196;
               break;
            case 76:
               var10000 = 158;
               break;
            case 77:
               var10000 = 197;
               break;
            case 78:
               var10000 = 108;
               break;
            case 79:
               var10000 = 32;
               break;
            case 80:
               var10000 = 216;
               break;
            case 81:
               var10000 = 10;
               break;
            case 82:
               var10000 = 155;
               break;
            case 83:
               var10000 = 24;
               break;
            case 84:
               var10000 = 118;
               break;
            case 85:
               var10000 = 99;
               break;
            case 86:
               var10000 = 246;
               break;
            case 87:
               var10000 = 137;
               break;
            case 88:
               var10000 = 52;
               break;
            case 89:
               var10000 = 181;
               break;
            case 90:
               var10000 = 58;
               break;
            case 91:
               var10000 = 12;
               break;
            case 92:
               var10000 = 114;
               break;
            case 93:
               var10000 = 164;
               break;
            case 94:
               var10000 = 44;
               break;
            case 95:
               var10000 = 136;
               break;
            case 96:
               var10000 = 250;
               break;
            case 97:
               var10000 = 199;
               break;
            case 98:
               var10000 = 49;
               break;
            case 99:
               var10000 = 48;
               break;
            case 100:
               var10000 = 203;
               break;
            case 101:
               var10000 = 236;
               break;
            case 102:
               var10000 = 41;
               break;
            case 103:
               var10000 = 223;
               break;
            case 104:
               var10000 = 39;
               break;
            case 105:
               var10000 = 146;
               break;
            case 106:
               var10000 = 240;
               break;
            case 107:
               var10000 = 117;
               break;
            case 108:
               var10000 = 29;
               break;
            case 109:
               var10000 = 34;
               break;
            case 110:
               var10000 = 107;
               break;
            case 111:
               var10000 = 104;
               break;
            case 112:
               var10000 = 90;
               break;
            case 113:
               var10000 = 15;
               break;
            case 114:
               var10000 = 65;
               break;
            case 115:
               var10000 = 105;
               break;
            case 116:
               var10000 = 168;
               break;
            case 117:
               var10000 = 141;
               break;
            case 118:
               var10000 = 151;
               break;
            case 119:
               var10000 = 231;
               break;
            case 120:
               var10000 = 215;
               break;
            case 121:
               var10000 = 47;
               break;
            case 122:
               var10000 = 8;
               break;
            case 123:
               var10000 = 106;
               break;
            case 124:
               var10000 = 209;
               break;
            case 125:
               var10000 = 254;
               break;
            case 126:
               var10000 = 93;
               break;
            case 127:
               var10000 = 248;
               break;
            case 128:
               var10000 = 2;
               break;
            case 129:
               var10000 = 219;
               break;
            case 130:
               var10000 = 174;
               break;
            case 131:
               var10000 = 253;
               break;
            case 132:
               var10000 = 239;
               break;
            case 133:
               var10000 = 11;
               break;
            case 134:
               var10000 = 148;
               break;
            case 135:
               var10000 = 76;
               break;
            case 136:
               var10000 = 40;
               break;
            case 137:
               var10000 = 78;
               break;
            case 138:
               var10000 = 16;
               break;
            case 139:
               var10000 = 165;
               break;
            case 140:
               var10000 = 202;
               break;
            case 141:
               var10000 = 194;
               break;
            case 142:
               var10000 = 166;
               break;
            case 143:
               var10000 = 77;
               break;
            case 144:
               var10000 = 95;
               break;
            case 145:
               var10000 = 28;
               break;
            case 146:
               var10000 = 126;
               break;
            case 147:
               var10000 = 255;
               break;
            case 148:
               var10000 = 150;
               break;
            case 149:
               var10000 = 63;
               break;
            case 150:
               var10000 = 235;
               break;
            case 151:
               var10000 = 134;
               break;
            case 152:
               var10000 = 30;
               break;
            case 153:
               var10000 = 127;
               break;
            case 154:
               var10000 = 190;
               break;
            case 155:
               var10000 = 245;
               break;
            case 156:
               var10000 = 75;
               break;
            case 157:
               var10000 = 38;
               break;
            case 158:
               var10000 = 43;
               break;
            case 159:
               var10000 = 122;
               break;
            case 160:
               var10000 = 222;
               break;
            case 161:
               var10000 = 220;
               break;
            case 162:
               var10000 = 96;
               break;
            case 163:
               var10000 = 130;
               break;
            case 164:
               var10000 = 27;
               break;
            case 165:
               var10000 = 249;
               break;
            case 166:
               var10000 = 184;
               break;
            case 167:
               var10000 = 60;
               break;
            case 168:
               var10000 = 73;
               break;
            case 169:
               var10000 = 167;
               break;
            case 170:
               var10000 = 230;
               break;
            case 171:
               var10000 = 241;
               break;
            case 172:
               var10000 = 42;
               break;
            case 173:
               var10000 = 120;
               break;
            case 174:
               var10000 = 82;
               break;
            case 175:
               var10000 = 22;
               break;
            case 176:
               var10000 = 80;
               break;
            case 177:
               var10000 = 140;
               break;
            case 178:
               var10000 = 51;
               break;
            case 179:
               var10000 = 193;
               break;
            case 180:
               var10000 = 252;
               break;
            case 181:
               var10000 = 72;
               break;
            case 182:
               var10000 = 116;
               break;
            case 183:
               var10000 = 149;
               break;
            case 184:
               var10000 = 251;
               break;
            case 185:
               var10000 = 103;
               break;
            case 186:
               var10000 = 4;
               break;
            case 187:
               var10000 = 233;
               break;
            case 188:
               var10000 = 187;
               break;
            case 189:
               var10000 = 98;
               break;
            case 190:
               var10000 = 205;
               break;
            case 191:
               var10000 = 1;
               break;
            case 192:
               var10000 = 113;
               break;
            case 193:
               var10000 = 9;
               break;
            case 194:
               var10000 = 145;
               break;
            case 195:
               var10000 = 83;
               break;
            case 196:
               var10000 = 191;
               break;
            case 197:
               var10000 = 100;
               break;
            case 198:
               var10000 = 85;
               break;
            case 199:
               var10000 = 135;
               break;
            case 200:
               var10000 = 0;
               break;
            case 201:
               var10000 = 54;
               break;
            case 202:
               var10000 = 89;
               break;
            case 203:
               var10000 = 237;
               break;
            case 204:
               var10000 = 170;
               break;
            case 205:
               var10000 = 94;
               break;
            case 206:
               var10000 = 132;
               break;
            case 207:
               var10000 = 119;
               break;
            case 208:
               var10000 = 226;
               break;
            case 209:
               var10000 = 50;
               break;
            case 210:
               var10000 = 206;
               break;
            case 211:
               var10000 = 121;
               break;
            case 212:
               var10000 = 212;
               break;
            case 213:
               var10000 = 142;
               break;
            case 214:
               var10000 = 159;
               break;
            case 215:
               var10000 = 247;
               break;
            case 216:
               var10000 = 20;
               break;
            case 217:
               var10000 = 25;
               break;
            case 218:
               var10000 = 154;
               break;
            case 219:
               var10000 = 217;
               break;
            case 220:
               var10000 = 162;
               break;
            case 221:
               var10000 = 182;
               break;
            case 222:
               var10000 = 61;
               break;
            case 223:
               var10000 = 129;
               break;
            case 224:
               var10000 = 192;
               break;
            case 225:
               var10000 = 138;
               break;
            case 226:
               var10000 = 17;
               break;
            case 227:
               var10000 = 64;
               break;
            case 228:
               var10000 = 171;
               break;
            case 229:
               var10000 = 160;
               break;
            case 230:
               var10000 = 144;
               break;
            case 231:
               var10000 = 123;
               break;
            case 232:
               var10000 = 69;
               break;
            case 233:
               var10000 = 143;
               break;
            case 234:
               var10000 = 139;
               break;
            case 235:
               var10000 = 59;
               break;
            case 236:
               var10000 = 156;
               break;
            case 237:
               var10000 = 125;
               break;
            case 238:
               var10000 = 110;
               break;
            case 239:
               var10000 = 37;
               break;
            case 240:
               var10000 = 26;
               break;
            case 241:
               var10000 = 13;
               break;
            case 242:
               var10000 = 112;
               break;
            case 243:
               var10000 = 177;
               break;
            case 244:
               var10000 = 180;
               break;
            case 245:
               var10000 = 200;
               break;
            case 246:
               var10000 = 53;
               break;
            case 247:
               var10000 = 183;
               break;
            case 248:
               var10000 = 221;
               break;
            case 249:
               var10000 = 218;
               break;
            case 250:
               var10000 = 74;
               break;
            case 251:
               var10000 = 36;
               break;
            case 252:
               var10000 = 115;
               break;
            case 253:
               var10000 = 213;
               break;
            case 254:
               var10000 = 189;
               break;
            default:
               var10000 = 97;
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
      char[] var24;
      String[] var7 = new String[11];
      Ky4[] var10000 = new Ky4[2];
      int var5 = 0;
      N(var10000);
      String var4 = "m\u008eË¦Iúa%r\u0095´ïî 2\u0006\u000bÚÓ\u0094æ.¨ã±ÜÇ\u000bmh\u00ad\u00adßN]3Ið\u0081\u0002G\u0081\u001bÙÖ~+Ð5ÀEÁk\u0018\u009eâXg\u008e¸ñÙ\u008cu°/\u001ftyà\u00052¦\u008dY[\u0002³q\u0003xy;\bÞ#Î9ÿé\u008b(\u0015ò\u0012ÉÖ¹E±l\u0013«½Ì\u0000|ÄÑ£ÕyÚ\u0090";
      int var6 = "m\u008eË¦Iúa%r\u0095´ïî 2\u0006\u000bÚÓ\u0094æ.¨ã±ÜÇ\u000bmh\u00ad\u00adßN]3Ið\u0081\u0002G\u0081\u001bÙÖ~+Ð5ÀEÁk\u0018\u009eâXg\u008e¸ñÙ\u008cu°/\u001ftyà\u00052¦\u008dY[\u0002³q\u0003xy;\bÞ#Î9ÿé\u008b(\u0015ò\u0012ÉÖ¹E±l\u0013«½Ì\u0000|ÄÑ£ÕyÚ\u0090"
         .length();
      char var3 = 27;
      int var10 = -1;

      label52:
      while (true) {
         byte var11 = 2;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var29 = var10001.toCharArray();
               int var10004 = var29.length;
               int var8 = 0;
               byte var32 = var11;
               var24 = var29;
               int var17 = var10004;
               byte var37;
               char[] var41;
               int var10006;
               if (var10004 <= 1) {
                  var41 = var29;
                  var37 = var11;
                  var10006 = var8;
               } else {
                  var32 = var11;
                  var17 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var41 = var29;
                  var37 = var11;
                  var10006 = var8;
               }

               while (true) {
                  char var50 = var41[var10006];
                  byte var51;
                  switch (var8 % 7) {
                     case 0:
                        var51 = 57;
                        break;
                     case 1:
                        var51 = 103;
                        break;
                     case 2:
                        var51 = 21;
                        break;
                     case 3:
                        var51 = 27;
                        break;
                     case 4:
                        var51 = 4;
                        break;
                     case 5:
                        var51 = 43;
                        break;
                     default:
                        var51 = 15;
                  }

                  var41[var10006] = (char)(var50 ^ var37 ^ var51);
                  var8++;
                  if (var32 == 0) {
                     var10006 = var32;
                     var41 = var24;
                     var37 = var32;
                  } else {
                     if (var17 <= var8) {
                        break;
                     }

                     var41 = var24;
                     var37 = var32;
                     var10006 = var8;
                  }
               }
            }

            String var34 = new String(var24).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var34;
                  if ((var10 += var3) >= var6) {
                     a = var7;
                     b = new String[11];
                     long var0 = 4693312597017164131L;
                     long var28 = 1491959827026606947L ^ var0;
                     byte var19 = -1;
                     c = var28;
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var34;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "bp íó\u0002QO";
                  var6 = "bp íó\u0002QO".length();
                  var3 = 5;
                  var10 = -1;
            }

            var11 = 7;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





