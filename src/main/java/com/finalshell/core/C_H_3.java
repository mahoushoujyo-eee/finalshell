package com.finalshell.core;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

public class C_H_3 extends C_g_2 {
   public final J_5 z;
   public final H_4 R;
   public final J_5 m;
   public static String[] e;
   public static String[] f;
   public static long g;

   public C_H_3(ClassLoader var1, @C_9 File[] var2, @C_9 String var3, File var4) {
      this(var1, (J_5)(var2 == null ? new Q2_3(new File(".")) : new A_5(var2)), var3, new Q2_3(var4), new E2_5(var4));
   }

   public C_H_3(ClassLoader var1, J_5 var2, @C_9 String var3, J_5 var4, H_4 var5) {
      super(var1, var2, var3);
      this.z = var4;
      this.R = var5;
      this.m = var2;
   }

   @C_9
   @Override
   protected Map Q(String param1) throws ClassNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: aload 0
      // 004: getfield com/finalshell/core/C_H_3.z Lcom/finalshell/core/J_5;
      // 007: aload 1
      // 008: invokestatic com/finalshell/core/Cr2_2.A (Ljava/lang/String;)Ljava/lang/String;
      // 00b: invokevirtual com/finalshell/core/J_5.J (Ljava/lang/String;)Lcom/finalshell/core/N_6;
      // 00e: astore 3
      // 00f: astore 2
      // 010: aload 3
      // 011: aload 2
      // 012: ifnull 031
      // 015: ifnull 0b0
      // 018: goto 01f
      // 01b: invokestatic com/finalshell/core/C_H_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 01e: athrow
      // 01f: aload 0
      // 020: getfield com/finalshell/core/C_H_3.m Lcom/finalshell/core/J_5;
      // 023: aload 1
      // 024: invokestatic com/finalshell/core/Cr2_2.R (Ljava/lang/String;)Ljava/lang/String;
      // 027: invokevirtual com/finalshell/core/J_5.J (Ljava/lang/String;)Lcom/finalshell/core/N_6;
      // 02a: goto 031
      // 02d: invokestatic com/finalshell/core/C_H_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 030: athrow
      // 031: astore 4
      // 033: aload 4
      // 035: aload 2
      // 036: ifnull 04b
      // 039: ifnonnull 049
      // 03c: goto 043
      // 03f: invokestatic com/finalshell/core/C_H_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 042: athrow
      // 043: aconst_null
      // 044: areturn
      // 045: invokestatic com/finalshell/core/C_H_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 048: athrow
      // 049: aload 4
      // 04b: aload 2
      // 04c: ifnull 066
      // 04f: invokeinterface com/finalshell/core/N_6.z ()J 1
      // 054: aload 3
      // 055: invokeinterface com/finalshell/core/N_6.z ()J 1
      // 05a: lcmp
      // 05b: ifge 0b0
      // 05e: goto 065
      // 061: invokestatic com/finalshell/core/C_H_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 064: athrow
      // 065: aload 3
      // 066: invokestatic com/finalshell/core/C_H_3.Q (Lcom/finalshell/core/N_6;)[B
      // 069: astore 5
      // 06b: goto 099
      // 06e: astore 6
      // 070: new java/lang/ClassNotFoundException
      // 073: dup
      // 074: new java/lang/StringBuilder
      // 077: dup
      // 078: invokespecial java/lang/StringBuilder.<init> ()V
      // 07b: sipush -24462
      // 07e: sipush -1201
      // 081: invokestatic com/finalshell/core/C_H_3.c (II)Ljava/lang/String;
      // 084: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 087: aload 3
      // 088: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 08b: ldc "\""
      // 08d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 090: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 093: aload 6
      // 095: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 098: athrow
      // 099: new java/util/HashMap
      // 09c: dup
      // 09d: invokespecial java/util/HashMap.<init> ()V
      // 0a0: astore 6
      // 0a2: aload 6
      // 0a4: aload 1
      // 0a5: aload 5
      // 0a7: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0ac: pop
      // 0ad: aload 6
      // 0af: areturn
      // 0b0: aload 0
      // 0b1: aload 1
      // 0b2: invokespecial com/finalshell/core/C_g_2.Q (Ljava/lang/String;)Ljava/util/Map;
      // 0b5: astore 3
      // 0b6: aload 3
      // 0b7: aload 2
      // 0b8: ifnull 0cc
      // 0bb: ifnonnull 0cb
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/C_H_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0c4: athrow
      // 0c5: aconst_null
      // 0c6: areturn
      // 0c7: invokestatic com/finalshell/core/C_H_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0ca: athrow
      // 0cb: aload 3
      // 0cc: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0d1: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0d6: astore 4
      // 0d8: aload 4
      // 0da: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0df: ifeq 14a
      // 0e2: aload 4
      // 0e4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e9: checkcast java/util/Map$Entry
      // 0ec: astore 5
      // 0ee: aload 5
      // 0f0: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0f5: checkcast java/lang/String
      // 0f8: astore 6
      // 0fa: aload 5
      // 0fc: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 101: checkcast [B
      // 104: astore 7
      // 106: aload 0
      // 107: getfield com/finalshell/core/C_H_3.R Lcom/finalshell/core/H_4;
      // 10a: aload 6
      // 10c: invokestatic com/finalshell/core/Cr2_2.A (Ljava/lang/String;)Ljava/lang/String;
      // 10f: aload 7
      // 111: invokestatic com/finalshell/core/C_H_3.B (Lcom/finalshell/core/H_4;Ljava/lang/String;[B)V
      // 114: goto 146
      // 117: astore 8
      // 119: new java/lang/ClassNotFoundException
      // 11c: dup
      // 11d: new java/lang/StringBuilder
      // 120: dup
      // 121: invokespecial java/lang/StringBuilder.<init> ()V
      // 124: sipush -24461
      // 127: sipush 9837
      // 12a: invokestatic com/finalshell/core/C_H_3.c (II)Ljava/lang/String;
      // 12d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 130: aload 6
      // 132: invokestatic com/finalshell/core/Cr2_2.A (Ljava/lang/String;)Ljava/lang/String;
      // 135: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 138: ldc "\""
      // 13a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 140: aload 8
      // 142: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 145: athrow
      // 146: aload 2
      // 147: ifnonnull 0d8
      // 14a: aload 3
      // 14b: areturn
   }

   public static byte[] Q(N_6 var0) throws IOException {
      String[] var10000 = RG_2.C();
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      byte[] var3 = new byte[(int)g];
      String[] var1 = var10000;
      InputStream var4 = var0.o$InputStream();

      try {
         do {
            int var5 = var4.read(var3);
            if (var5 == -1) {
               break;
            }

            var2.write(var3, 0, var5);
         } while (var1 != null);
      } finally {
         try {
            var4.close();
         } catch (IOException var11) {
         }
      }

      return var2.toByteArray();
   }

   public static void B(H_4 var0, String var1, byte[] var2) throws IOException {
      OutputStream var3 = var0.X(var1);

      try {
         var3.write(var2);
      } finally {
         try {
            var3.close();
         } catch (IOException var10) {
         }
      }
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String c(int var0, int var1) {
      int var2 = (var0 ^ -24462) & 65535;
      if (f[var2] == null) {
         char[] var3 = e[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 176;
               break;
            case 1:
               var10000 = 132;
               break;
            case 2:
               var10000 = 141;
               break;
            case 3:
               var10000 = 87;
               break;
            case 4:
               var10000 = 187;
               break;
            case 5:
               var10000 = 173;
               break;
            case 6:
               var10000 = 28;
               break;
            case 7:
               var10000 = 93;
               break;
            case 8:
               var10000 = 65;
               break;
            case 9:
               var10000 = 8;
               break;
            case 10:
               var10000 = 107;
               break;
            case 11:
               var10000 = 228;
               break;
            case 12:
               var10000 = 230;
               break;
            case 13:
               var10000 = 43;
               break;
            case 14:
               var10000 = 64;
               break;
            case 15:
               var10000 = 25;
               break;
            case 16:
               var10000 = 249;
               break;
            case 17:
               var10000 = 40;
               break;
            case 18:
               var10000 = 76;
               break;
            case 19:
               var10000 = 252;
               break;
            case 20:
               var10000 = 95;
               break;
            case 21:
               var10000 = 227;
               break;
            case 22:
               var10000 = 42;
               break;
            case 23:
               var10000 = 144;
               break;
            case 24:
               var10000 = 212;
               break;
            case 25:
               var10000 = 89;
               break;
            case 26:
               var10000 = 27;
               break;
            case 27:
               var10000 = 206;
               break;
            case 28:
               var10000 = 51;
               break;
            case 29:
               var10000 = 94;
               break;
            case 30:
               var10000 = 119;
               break;
            case 31:
               var10000 = 139;
               break;
            case 32:
               var10000 = 233;
               break;
            case 33:
               var10000 = 157;
               break;
            case 34:
               var10000 = 114;
               break;
            case 35:
               var10000 = 129;
               break;
            case 36:
               var10000 = 81;
               break;
            case 37:
               var10000 = 239;
               break;
            case 38:
               var10000 = 34;
               break;
            case 39:
               var10000 = 169;
               break;
            case 40:
               var10000 = 7;
               break;
            case 41:
               var10000 = 117;
               break;
            case 42:
               var10000 = 24;
               break;
            case 43:
               var10000 = 14;
               break;
            case 44:
               var10000 = 83;
               break;
            case 45:
               var10000 = 15;
               break;
            case 46:
               var10000 = 61;
               break;
            case 47:
               var10000 = 164;
               break;
            case 48:
               var10000 = 246;
               break;
            case 49:
               var10000 = 127;
               break;
            case 50:
               var10000 = 143;
               break;
            case 51:
               var10000 = 97;
               break;
            case 52:
               var10000 = 98;
               break;
            case 53:
               var10000 = 194;
               break;
            case 54:
               var10000 = 159;
               break;
            case 55:
               var10000 = 242;
               break;
            case 56:
               var10000 = 120;
               break;
            case 57:
               var10000 = 91;
               break;
            case 58:
               var10000 = 179;
               break;
            case 59:
               var10000 = 53;
               break;
            case 60:
               var10000 = 195;
               break;
            case 61:
               var10000 = 122;
               break;
            case 62:
               var10000 = 57;
               break;
            case 63:
               var10000 = 78;
               break;
            case 64:
               var10000 = 9;
               break;
            case 65:
               var10000 = 150;
               break;
            case 66:
               var10000 = 63;
               break;
            case 67:
               var10000 = 248;
               break;
            case 68:
               var10000 = 237;
               break;
            case 69:
               var10000 = 240;
               break;
            case 70:
               var10000 = 47;
               break;
            case 71:
               var10000 = 22;
               break;
            case 72:
               var10000 = 218;
               break;
            case 73:
               var10000 = 220;
               break;
            case 74:
               var10000 = 232;
               break;
            case 75:
               var10000 = 54;
               break;
            case 76:
               var10000 = 2;
               break;
            case 77:
               var10000 = 222;
               break;
            case 78:
               var10000 = 67;
               break;
            case 79:
               var10000 = 5;
               break;
            case 80:
               var10000 = 207;
               break;
            case 81:
               var10000 = 123;
               break;
            case 82:
               var10000 = 226;
               break;
            case 83:
               var10000 = 41;
               break;
            case 84:
               var10000 = 32;
               break;
            case 85:
               var10000 = 247;
               break;
            case 86:
               var10000 = 79;
               break;
            case 87:
               var10000 = 80;
               break;
            case 88:
               var10000 = 85;
               break;
            case 89:
               var10000 = 201;
               break;
            case 90:
               var10000 = 142;
               break;
            case 91:
               var10000 = 69;
               break;
            case 92:
               var10000 = 241;
               break;
            case 93:
               var10000 = 62;
               break;
            case 94:
               var10000 = 140;
               break;
            case 95:
               var10000 = 137;
               break;
            case 96:
               var10000 = 0;
               break;
            case 97:
               var10000 = 254;
               break;
            case 98:
               var10000 = 165;
               break;
            case 99:
               var10000 = 225;
               break;
            case 100:
               var10000 = 184;
               break;
            case 101:
               var10000 = 180;
               break;
            case 102:
               var10000 = 115;
               break;
            case 103:
               var10000 = 135;
               break;
            case 104:
               var10000 = 200;
               break;
            case 105:
               var10000 = 190;
               break;
            case 106:
               var10000 = 250;
               break;
            case 107:
               var10000 = 20;
               break;
            case 108:
               var10000 = 1;
               break;
            case 109:
               var10000 = 183;
               break;
            case 110:
               var10000 = 121;
               break;
            case 111:
               var10000 = 243;
               break;
            case 112:
               var10000 = 29;
               break;
            case 113:
               var10000 = 193;
               break;
            case 114:
               var10000 = 103;
               break;
            case 115:
               var10000 = 106;
               break;
            case 116:
               var10000 = 251;
               break;
            case 117:
               var10000 = 58;
               break;
            case 118:
               var10000 = 111;
               break;
            case 119:
               var10000 = 100;
               break;
            case 120:
               var10000 = 188;
               break;
            case 121:
               var10000 = 197;
               break;
            case 122:
               var10000 = 49;
               break;
            case 123:
               var10000 = 253;
               break;
            case 124:
               var10000 = 26;
               break;
            case 125:
               var10000 = 21;
               break;
            case 126:
               var10000 = 84;
               break;
            case 127:
               var10000 = 23;
               break;
            case 128:
               var10000 = 202;
               break;
            case 129:
               var10000 = 108;
               break;
            case 130:
               var10000 = 12;
               break;
            case 131:
               var10000 = 205;
               break;
            case 132:
               var10000 = 154;
               break;
            case 133:
               var10000 = 235;
               break;
            case 134:
               var10000 = 151;
               break;
            case 135:
               var10000 = 71;
               break;
            case 136:
               var10000 = 156;
               break;
            case 137:
               var10000 = 168;
               break;
            case 138:
               var10000 = 185;
               break;
            case 139:
               var10000 = 44;
               break;
            case 140:
               var10000 = 209;
               break;
            case 141:
               var10000 = 217;
               break;
            case 142:
               var10000 = 192;
               break;
            case 143:
               var10000 = 72;
               break;
            case 144:
               var10000 = 70;
               break;
            case 145:
               var10000 = 148;
               break;
            case 146:
               var10000 = 166;
               break;
            case 147:
               var10000 = 211;
               break;
            case 148:
               var10000 = 96;
               break;
            case 149:
               var10000 = 204;
               break;
            case 150:
               var10000 = 255;
               break;
            case 151:
               var10000 = 208;
               break;
            case 152:
               var10000 = 215;
               break;
            case 153:
               var10000 = 73;
               break;
            case 154:
               var10000 = 172;
               break;
            case 155:
               var10000 = 86;
               break;
            case 156:
               var10000 = 109;
               break;
            case 157:
               var10000 = 221;
               break;
            case 158:
               var10000 = 128;
               break;
            case 159:
               var10000 = 178;
               break;
            case 160:
               var10000 = 229;
               break;
            case 161:
               var10000 = 170;
               break;
            case 162:
               var10000 = 186;
               break;
            case 163:
               var10000 = 167;
               break;
            case 164:
               var10000 = 31;
               break;
            case 165:
               var10000 = 158;
               break;
            case 166:
               var10000 = 126;
               break;
            case 167:
               var10000 = 153;
               break;
            case 168:
               var10000 = 210;
               break;
            case 169:
               var10000 = 223;
               break;
            case 170:
               var10000 = 90;
               break;
            case 171:
               var10000 = 131;
               break;
            case 172:
               var10000 = 82;
               break;
            case 173:
               var10000 = 55;
               break;
            case 174:
               var10000 = 4;
               break;
            case 175:
               var10000 = 30;
               break;
            case 176:
               var10000 = 175;
               break;
            case 177:
               var10000 = 219;
               break;
            case 178:
               var10000 = 145;
               break;
            case 179:
               var10000 = 75;
               break;
            case 180:
               var10000 = 48;
               break;
            case 181:
               var10000 = 189;
               break;
            case 182:
               var10000 = 177;
               break;
            case 183:
               var10000 = 39;
               break;
            case 184:
               var10000 = 199;
               break;
            case 185:
               var10000 = 203;
               break;
            case 186:
               var10000 = 104;
               break;
            case 187:
               var10000 = 163;
               break;
            case 188:
               var10000 = 19;
               break;
            case 189:
               var10000 = 146;
               break;
            case 190:
               var10000 = 155;
               break;
            case 191:
               var10000 = 214;
               break;
            case 192:
               var10000 = 74;
               break;
            case 193:
               var10000 = 161;
               break;
            case 194:
               var10000 = 162;
               break;
            case 195:
               var10000 = 33;
               break;
            case 196:
               var10000 = 46;
               break;
            case 197:
               var10000 = 113;
               break;
            case 198:
               var10000 = 77;
               break;
            case 199:
               var10000 = 18;
               break;
            case 200:
               var10000 = 45;
               break;
            case 201:
               var10000 = 231;
               break;
            case 202:
               var10000 = 125;
               break;
            case 203:
               var10000 = 99;
               break;
            case 204:
               var10000 = 149;
               break;
            case 205:
               var10000 = 136;
               break;
            case 206:
               var10000 = 138;
               break;
            case 207:
               var10000 = 182;
               break;
            case 208:
               var10000 = 16;
               break;
            case 209:
               var10000 = 133;
               break;
            case 210:
               var10000 = 66;
               break;
            case 211:
               var10000 = 174;
               break;
            case 212:
               var10000 = 17;
               break;
            case 213:
               var10000 = 10;
               break;
            case 214:
               var10000 = 11;
               break;
            case 215:
               var10000 = 102;
               break;
            case 216:
               var10000 = 3;
               break;
            case 217:
               var10000 = 244;
               break;
            case 218:
               var10000 = 196;
               break;
            case 219:
               var10000 = 224;
               break;
            case 220:
               var10000 = 236;
               break;
            case 221:
               var10000 = 6;
               break;
            case 222:
               var10000 = 35;
               break;
            case 223:
               var10000 = 171;
               break;
            case 224:
               var10000 = 152;
               break;
            case 225:
               var10000 = 101;
               break;
            case 226:
               var10000 = 181;
               break;
            case 227:
               var10000 = 37;
               break;
            case 228:
               var10000 = 59;
               break;
            case 229:
               var10000 = 60;
               break;
            case 230:
               var10000 = 92;
               break;
            case 231:
               var10000 = 198;
               break;
            case 232:
               var10000 = 116;
               break;
            case 233:
               var10000 = 147;
               break;
            case 234:
               var10000 = 245;
               break;
            case 235:
               var10000 = 191;
               break;
            case 236:
               var10000 = 118;
               break;
            case 237:
               var10000 = 213;
               break;
            case 238:
               var10000 = 68;
               break;
            case 239:
               var10000 = 112;
               break;
            case 240:
               var10000 = 13;
               break;
            case 241:
               var10000 = 38;
               break;
            case 242:
               var10000 = 52;
               break;
            case 243:
               var10000 = 105;
               break;
            case 244:
               var10000 = 56;
               break;
            case 245:
               var10000 = 234;
               break;
            case 246:
               var10000 = 124;
               break;
            case 247:
               var10000 = 88;
               break;
            case 248:
               var10000 = 110;
               break;
            case 249:
               var10000 = 50;
               break;
            case 250:
               var10000 = 160;
               break;
            case 251:
               var10000 = 216;
               break;
            case 252:
               var10000 = 130;
               break;
            case 253:
               var10000 = 134;
               break;
            case 254:
               var10000 = 36;
               break;
            default:
               var10000 = 238;
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

         f[var2] = new String(var3).intern();
      }

      return f[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "_º-¨i\u009e\u0081¡\u000eÃý\u0002\u008cò\u001bÅ\u001aËjÛ\u0094O\u0015ô\u0012\u0017\u0012b)VàS°\u0018(ô9ä\u0014.\b^x¸&§\u0000ßv";
      int var6 = "_º-¨i\u009e\u0081¡\u000eÃý\u0002\u008cò\u001bÅ\u001aËjÛ\u0094O\u0015ô\u0012\u0017\u0012b)VàS°\u0018(ô9ä\u0014.\b^x¸&§\u0000ßv".length();
      char var3 = 25;
      int var2 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var4.substring(++var2, var2 + var3).toCharArray();
            int var10004 = var10003.length;
            int var8 = 0;
            byte var17 = 83;
            var10002 = var10003;
            int var10 = var10004;
            byte var20;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var20 = 83;
               var10006 = var8;
            } else {
               var17 = 83;
               var10 = var10004;
               if (var10004 <= var8) {
                  break label38;
               }

               var10005 = var10003;
               var20 = 83;
               var10006 = var8;
            }

            while (true) {
               char var32 = var10005[var10006];
               byte var33;
               switch (var8 % 7) {
                  case 0:
                     var33 = 71;
                     break;
                  case 1:
                     var33 = 73;
                     break;
                  case 2:
                     var33 = 110;
                     break;
                  case 3:
                     var33 = 66;
                     break;
                  case 4:
                     var33 = 28;
                     break;
                  case 5:
                     var33 = 124;
                     break;
                  default:
                     var33 = 53;
               }

               var10005[var10006] = (char)(var32 ^ var20 ^ var33);
               var8++;
               if (var17 == 0) {
                  var10006 = var17;
                  var10005 = var10002;
                  var20 = var17;
               } else {
                  if (var10 <= var8) {
                     break;
                  }

                  var10005 = var10002;
                  var20 = var17;
                  var10006 = var8;
               }
            }
         }

         String var19 = new String(var10002).intern();
         byte var12 = -1;
         var7[var5++] = var19;
         if ((var2 += var3) >= var6) {
            e = var7;
            f = new String[2];
            long var0 = 3086293022042747319L;
            long var16 = -4876949491499933257L ^ var0;
            var12 = -1;
            g = var16;
            return;
         }

         var3 = var4.charAt(var2);
      }
   }
}





