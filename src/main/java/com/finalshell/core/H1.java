package com.finalshell.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class H1 extends Fq2{
   public static Set B;
   public final Hashtable m = new Hashtable();
   public final Vector g = new Vector();
   public static Hashtable J;
   public static String[] a;
   public static String[] b;

   public static H1 f(String var0) throws IOException {
      StringReader var1 = new StringReader(var0);

      H1 var3;
      try {
         BufferedReader var2 = new BufferedReader(var1);

         try {
            var3 = new H1(var2);
         } catch (Throwable var7) {
            try {
               var2.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }

            throw var7;
         }

         var2.close();
      } catch (Throwable var8) {
         try {
            var1.close();
         } catch (Throwable var5) {
            var8.addSuppressed(var5);
         }

         throw var8;
      }

      var1.close();
      return var3;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static H1 q(String var0) throws IOException {
      boolean var10000 = Dm4.F$boolean();
      BufferedReader var2 = Files.newBufferedReader(Paths.get(E8.V(var0)), StandardCharsets.UTF_8);
      boolean var1 = var10000;

      H1 var3;
      try {
         var3 = new H1(var2);
      } catch (Throwable var8) {
      BufferedReader var10;
         label41: {
            label40: {
               try {
                  var10 = var2;
                  if (!var1) {
                     break label40;
                  }

                  if (var2 == null) {
                     throw var8;
                  }
               } catch (Throwable var7) {
                  throw a(var7);
               }

               try {
                  var10 = var2;
               } catch (Throwable var6) {
      int var11;
                  var11 = var6;
                  boolean var10001 = false;
                  break label41;
               }
            }

            try {
               var10.close();
               throw var8;
            } catch (Throwable var5) {
      BufferedReader var12;
      int var11;
               var11 = var5;
               boolean var13 = false;
            }
         }

         Throwable var4 = var11;
         var8.addSuppressed(var4);
         throw var8;
      }

      label53: {
         try {
            var12 = var2;
            if (!var1) {
               break label53;
            }

            if (var2 == null) {
               return var3;
            }
         } catch (Throwable var9) {
            throw a(var9);
         }

         var12 = var2;
      }

      var12.close();
      return var3;
   }

   public H1(BufferedReader var1) throws IOException {
      this.J(var1);
   }

   public void J(BufferedReader param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc ""
      // 002: astore 3
      // 003: new java/util/Vector
      // 006: dup
      // 007: invokespecial java/util/Vector.<init> ()V
      // 00a: astore 4
      // 00c: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 00f: aconst_null
      // 010: astore 5
      // 012: istore 2
      // 013: aload 1
      // 014: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 017: dup
      // 018: astore 5
      // 01a: ifnull 116
      // 01d: aload 5
      // 01f: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 022: astore 5
      // 024: aload 5
      // 026: iload 2
      // 027: ifne 120
      // 02a: invokevirtual java/lang/String.length ()I
      // 02d: iload 2
      // 02e: ifne 054
      // 031: goto 038
      // 034: invokestatic com/finalshell/core/H1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: ifeq 013
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/core/H1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: aload 5
      // 044: ldc "#"
      // 046: iload 2
      // 047: ifne 06d
      // 04a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/H1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: ifeq 062
      // 057: iload 2
      // 058: ifeq 013
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/core/H1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: aload 5
      // 064: sipush -22384
      // 067: sipush 24030
      // 06a: invokestatic com/finalshell/core/H1.a (II)Ljava/lang/String;
      // 06d: bipush 2
      // 06e: invokevirtual java/lang/String.split (Ljava/lang/String;I)[Ljava/lang/String;
      // 071: astore 6
      // 073: bipush 0
      // 074: istore 7
      // 076: iload 7
      // 078: aload 6
      // 07a: arraylength
      // 07b: if_icmpge 09d
      // 07e: aload 6
      // 080: iload 7
      // 082: aload 6
      // 084: iload 7
      // 086: aaload
      // 087: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 08a: aastore
      // 08b: iinc 7 1
      // 08e: iload 2
      // 08f: ifne 0ba
      // 092: iload 2
      // 093: ifeq 076
      // 096: goto 09d
      // 099: invokestatic com/finalshell/core/H1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: aload 6
      // 09f: arraylength
      // 0a0: iload 2
      // 0a1: ifne 0d5
      // 0a4: bipush 1
      // 0a5: if_icmpgt 0ba
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/H1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: iload 2
      // 0b0: ifeq 013
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/H1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: aload 6
      // 0bc: bipush 0
      // 0bd: aaload
      // 0be: iload 2
      // 0bf: ifne 0f6
      // 0c2: sipush -22382
      // 0c5: sipush 28822
      // 0c8: invokestatic com/finalshell/core/H1.a (II)Ljava/lang/String;
      // 0cb: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/H1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: ifeq 104
      // 0d8: aload 0
      // 0d9: getfield com/finalshell/core/H1.m Ljava/util/Hashtable;
      // 0dc: aload 3
      // 0dd: aload 4
      // 0df: invokevirtual java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 0e2: pop
      // 0e3: aload 0
      // 0e4: getfield com/finalshell/core/H1.g Ljava/util/Vector;
      // 0e7: aload 3
      // 0e8: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 0eb: aload 6
      // 0ed: bipush 1
      // 0ee: aaload
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/core/H1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: astore 3
      // 0f7: new java/util/Vector
      // 0fa: dup
      // 0fb: invokespecial java/util/Vector.<init> ()V
      // 0fe: astore 4
      // 100: iload 2
      // 101: ifeq 112
      // 104: aload 4
      // 106: aload 6
      // 108: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/H1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: iload 2
      // 113: ifeq 013
      // 116: aload 0
      // 117: getfield com/finalshell/core/H1.m Ljava/util/Hashtable;
      // 11a: aload 3
      // 11b: aload 4
      // 11d: invokevirtual java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 120: pop
      // 121: aload 0
      // 122: getfield com/finalshell/core/H1.g Ljava/util/Vector;
      // 125: aload 3
      // 126: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 129: return
   }

   @Override
   public IF s(String var1) {
      return new RI(this, var1);
   }

   public static Hashtable v() {
      return J;
   }

   public static Hashtable H(H1 var0) {
      return var0.m;
   }

   public static Vector T(H1 var0) {
      return var0.g;
   }

   public static Hashtable l() {
      return J;
   }

   public static Set e() {
      return B;
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -22382) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 194;
               break;
            case 1:
               var10000 = 47;
               break;
            case 2:
               var10000 = 68;
               break;
            case 3:
               var10000 = 55;
               break;
            case 4:
               var10000 = 10;
               break;
            case 5:
               var10000 = 246;
               break;
            case 6:
               var10000 = 196;
               break;
            case 7:
               var10000 = 238;
               break;
            case 8:
               var10000 = 26;
               break;
            case 9:
               var10000 = 241;
               break;
            case 10:
               var10000 = 184;
               break;
            case 11:
               var10000 = 208;
               break;
            case 12:
               var10000 = 133;
               break;
            case 13:
               var10000 = 164;
               break;
            case 14:
               var10000 = 123;
               break;
            case 15:
               var10000 = 23;
               break;
            case 16:
               var10000 = 218;
               break;
            case 17:
               var10000 = 210;
               break;
            case 18:
               var10000 = 189;
               break;
            case 19:
               var10000 = 250;
               break;
            case 20:
               var10000 = 129;
               break;
            case 21:
               var10000 = 60;
               break;
            case 22:
               var10000 = 124;
               break;
            case 23:
               var10000 = 89;
               break;
            case 24:
               var10000 = 255;
               break;
            case 25:
               var10000 = 155;
               break;
            case 26:
               var10000 = 237;
               break;
            case 27:
               var10000 = 20;
               break;
            case 28:
               var10000 = 130;
               break;
            case 29:
               var10000 = 2;
               break;
            case 30:
               var10000 = 172;
               break;
            case 31:
               var10000 = 119;
               break;
            case 32:
               var10000 = 63;
               break;
            case 33:
               var10000 = 230;
               break;
            case 34:
               var10000 = 234;
               break;
            case 35:
               var10000 = 24;
               break;
            case 36:
               var10000 = 78;
               break;
            case 37:
               var10000 = 45;
               break;
            case 38:
               var10000 = 46;
               break;
            case 39:
               var10000 = 141;
               break;
            case 40:
               var10000 = 216;
               break;
            case 41:
               var10000 = 173;
               break;
            case 42:
               var10000 = 85;
               break;
            case 43:
               var10000 = 179;
               break;
            case 44:
               var10000 = 193;
               break;
            case 45:
               var10000 = 99;
               break;
            case 46:
               var10000 = 136;
               break;
            case 47:
               var10000 = 137;
               break;
            case 48:
               var10000 = 84;
               break;
            case 49:
               var10000 = 75;
               break;
            case 50:
               var10000 = 186;
               break;
            case 51:
               var10000 = 104;
               break;
            case 52:
               var10000 = 90;
               break;
            case 53:
               var10000 = 6;
               break;
            case 54:
               var10000 = 236;
               break;
            case 55:
               var10000 = 17;
               break;
            case 56:
               var10000 = 27;
               break;
            case 57:
               var10000 = 39;
               break;
            case 58:
               var10000 = 152;
               break;
            case 59:
               var10000 = 22;
               break;
            case 60:
               var10000 = 71;
               break;
            case 61:
               var10000 = 228;
               break;
            case 62:
               var10000 = 138;
               break;
            case 63:
               var10000 = 146;
               break;
            case 64:
               var10000 = 54;
               break;
            case 65:
               var10000 = 249;
               break;
            case 66:
               var10000 = 14;
               break;
            case 67:
               var10000 = 204;
               break;
            case 68:
               var10000 = 21;
               break;
            case 69:
               var10000 = 0;
               break;
            case 70:
               var10000 = 7;
               break;
            case 71:
               var10000 = 16;
               break;
            case 72:
               var10000 = 253;
               break;
            case 73:
               var10000 = 81;
               break;
            case 74:
               var10000 = 86;
               break;
            case 75:
               var10000 = 91;
               break;
            case 76:
               var10000 = 161;
               break;
            case 77:
               var10000 = 103;
               break;
            case 78:
               var10000 = 215;
               break;
            case 79:
               var10000 = 36;
               break;
            case 80:
               var10000 = 15;
               break;
            case 81:
               var10000 = 66;
               break;
            case 82:
               var10000 = 34;
               break;
            case 83:
               var10000 = 125;
               break;
            case 84:
               var10000 = 96;
               break;
            case 85:
               var10000 = 201;
               break;
            case 86:
               var10000 = 1;
               break;
            case 87:
               var10000 = 120;
               break;
            case 88:
               var10000 = 42;
               break;
            case 89:
               var10000 = 98;
               break;
            case 90:
               var10000 = 159;
               break;
            case 91:
               var10000 = 83;
               break;
            case 92:
               var10000 = 128;
               break;
            case 93:
               var10000 = 233;
               break;
            case 94:
               var10000 = 150;
               break;
            case 95:
               var10000 = 58;
               break;
            case 96:
               var10000 = 110;
               break;
            case 97:
               var10000 = 50;
               break;
            case 98:
               var10000 = 31;
               break;
            case 99:
               var10000 = 19;
               break;
            case 100:
               var10000 = 219;
               break;
            case 101:
               var10000 = 195;
               break;
            case 102:
               var10000 = 53;
               break;
            case 103:
               var10000 = 252;
               break;
            case 104:
               var10000 = 162;
               break;
            case 105:
               var10000 = 147;
               break;
            case 106:
               var10000 = 13;
               break;
            case 107:
               var10000 = 205;
               break;
            case 108:
               var10000 = 206;
               break;
            case 109:
               var10000 = 178;
               break;
            case 110:
               var10000 = 52;
               break;
            case 111:
               var10000 = 209;
               break;
            case 112:
               var10000 = 102;
               break;
            case 113:
               var10000 = 112;
               break;
            case 114:
               var10000 = 153;
               break;
            case 115:
               var10000 = 82;
               break;
            case 116:
               var10000 = 65;
               break;
            case 117:
               var10000 = 28;
               break;
            case 118:
               var10000 = 116;
               break;
            case 119:
               var10000 = 243;
               break;
            case 120:
               var10000 = 239;
               break;
            case 121:
               var10000 = 231;
               break;
            case 122:
               var10000 = 132;
               break;
            case 123:
               var10000 = 244;
               break;
            case 124:
               var10000 = 185;
               break;
            case 125:
               var10000 = 72;
               break;
            case 126:
               var10000 = 32;
               break;
            case 127:
               var10000 = 61;
               break;
            case 128:
               var10000 = 175;
               break;
            case 129:
               var10000 = 248;
               break;
            case 130:
               var10000 = 113;
               break;
            case 131:
               var10000 = 127;
               break;
            case 132:
               var10000 = 145;
               break;
            case 133:
               var10000 = 251;
               break;
            case 134:
               var10000 = 225;
               break;
            case 135:
               var10000 = 9;
               break;
            case 136:
               var10000 = 149;
               break;
            case 137:
               var10000 = 226;
               break;
            case 138:
               var10000 = 180;
               break;
            case 139:
               var10000 = 74;
               break;
            case 140:
               var10000 = 37;
               break;
            case 141:
               var10000 = 57;
               break;
            case 142:
               var10000 = 97;
               break;
            case 143:
               var10000 = 192;
               break;
            case 144:
               var10000 = 114;
               break;
            case 145:
               var10000 = 117;
               break;
            case 146:
               var10000 = 35;
               break;
            case 147:
               var10000 = 134;
               break;
            case 148:
               var10000 = 122;
               break;
            case 149:
               var10000 = 115;
               break;
            case 150:
               var10000 = 213;
               break;
            case 151:
               var10000 = 165;
               break;
            case 152:
               var10000 = 168;
               break;
            case 153:
               var10000 = 227;
               break;
            case 154:
               var10000 = 140;
               break;
            case 155:
               var10000 = 174;
               break;
            case 156:
               var10000 = 202;
               break;
            case 157:
               var10000 = 143;
               break;
            case 158:
               var10000 = 107;
               break;
            case 159:
               var10000 = 177;
               break;
            case 160:
               var10000 = 18;
               break;
            case 161:
               var10000 = 139;
               break;
            case 162:
               var10000 = 190;
               break;
            case 163:
               var10000 = 157;
               break;
            case 164:
               var10000 = 121;
               break;
            case 165:
               var10000 = 245;
               break;
            case 166:
               var10000 = 106;
               break;
            case 167:
               var10000 = 64;
               break;
            case 168:
               var10000 = 158;
               break;
            case 169:
               var10000 = 240;
               break;
            case 170:
               var10000 = 49;
               break;
            case 171:
               var10000 = 163;
               break;
            case 172:
               var10000 = 191;
               break;
            case 173:
               var10000 = 247;
               break;
            case 174:
               var10000 = 224;
               break;
            case 175:
               var10000 = 80;
               break;
            case 176:
               var10000 = 109;
               break;
            case 177:
               var10000 = 44;
               break;
            case 178:
               var10000 = 188;
               break;
            case 179:
               var10000 = 87;
               break;
            case 180:
               var10000 = 111;
               break;
            case 181:
               var10000 = 170;
               break;
            case 182:
               var10000 = 33;
               break;
            case 183:
               var10000 = 92;
               break;
            case 184:
               var10000 = 40;
               break;
            case 185:
               var10000 = 211;
               break;
            case 186:
               var10000 = 207;
               break;
            case 187:
               var10000 = 76;
               break;
            case 188:
               var10000 = 108;
               break;
            case 189:
               var10000 = 77;
               break;
            case 190:
               var10000 = 203;
               break;
            case 191:
               var10000 = 51;
               break;
            case 192:
               var10000 = 160;
               break;
            case 193:
               var10000 = 30;
               break;
            case 194:
               var10000 = 197;
               break;
            case 195:
               var10000 = 70;
               break;
            case 196:
               var10000 = 166;
               break;
            case 197:
               var10000 = 220;
               break;
            case 198:
               var10000 = 182;
               break;
            case 199:
               var10000 = 200;
               break;
            case 200:
               var10000 = 38;
               break;
            case 201:
               var10000 = 105;
               break;
            case 202:
               var10000 = 25;
               break;
            case 203:
               var10000 = 79;
               break;
            case 204:
               var10000 = 151;
               break;
            case 205:
               var10000 = 126;
               break;
            case 206:
               var10000 = 4;
               break;
            case 207:
               var10000 = 223;
               break;
            case 208:
               var10000 = 5;
               break;
            case 209:
               var10000 = 73;
               break;
            case 210:
               var10000 = 214;
               break;
            case 211:
               var10000 = 167;
               break;
            case 212:
               var10000 = 183;
               break;
            case 213:
               var10000 = 11;
               break;
            case 214:
               var10000 = 131;
               break;
            case 215:
               var10000 = 59;
               break;
            case 216:
               var10000 = 232;
               break;
            case 217:
               var10000 = 171;
               break;
            case 218:
               var10000 = 142;
               break;
            case 219:
               var10000 = 199;
               break;
            case 220:
               var10000 = 69;
               break;
            case 221:
               var10000 = 100;
               break;
            case 222:
               var10000 = 176;
               break;
            case 223:
               var10000 = 217;
               break;
            case 224:
               var10000 = 118;
               break;
            case 225:
               var10000 = 169;
               break;
            case 226:
               var10000 = 8;
               break;
            case 227:
               var10000 = 221;
               break;
            case 228:
               var10000 = 212;
               break;
            case 229:
               var10000 = 198;
               break;
            case 230:
               var10000 = 187;
               break;
            case 231:
               var10000 = 144;
               break;
            case 232:
               var10000 = 135;
               break;
            case 233:
               var10000 = 148;
               break;
            case 234:
               var10000 = 95;
               break;
            case 235:
               var10000 = 41;
               break;
            case 236:
               var10000 = 229;
               break;
            case 237:
               var10000 = 48;
               break;
            case 238:
               var10000 = 101;
               break;
            case 239:
               var10000 = 67;
               break;
            case 240:
               var10000 = 242;
               break;
            case 241:
               var10000 = 222;
               break;
            case 242:
               var10000 = 254;
               break;
            case 243:
               var10000 = 3;
               break;
            case 244:
               var10000 = 94;
               break;
            case 245:
               var10000 = 29;
               break;
            case 246:
               var10000 = 93;
               break;
            case 247:
               var10000 = 154;
               break;
            case 248:
               var10000 = 62;
               break;
            case 249:
               var10000 = 235;
               break;
            case 250:
               var10000 = 156;
               break;
            case 251:
               var10000 = 12;
               break;
            case 252:
               var10000 = 56;
               break;
            case 253:
               var10000 = 88;
               break;
            case 254:
               var10000 = 43;
               break;
            default:
               var10000 = 181;
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
      String[] var9 = new String[27];
      int var7 = 0;
      String var6 = "2iv=\nÆ§¥>»X\u0019\u008e»¯\u0005\u0091. °i\u000b=>ãÓÚé\u009d]\u0086Û\u001c\n^;¶\u00adÙ*UÐ2f\u0007éá\u009c¹ûf\u0088\u0011Lçéè\u009b\u008eµ±\u0083F¼\u0001ÐxWâ<\u0007Q<sMa6\u001f\u0007»Ñ.ðÊ\u0081j\u0010zq\u000b:ÇÔ>úò/\u0092?\u001cÝõ.\u000f\u009c\u001aóWØyÝO\u008e\u0099\u001d\u008bû!Û\u000fgi\u008c97´ ö1®êm\u0015ý\u0004\u00181ª\u001c\u0003Ü\u0097\u009a\u001d\u0018Ë\u009aÐÀ\rJdEäEÿi\tû5\u0007j~ìJå\u0018I\u0004/\u009a@¯\u000b\u00146ÆÒ~É\tY\u0014[N\u0011\u0014w²þ\u0014ÈPKqeFA«é\u0083ëd\r\u008eå\u0089Ò>ÜÀ¸²]\u009c(\r\u0016ó\u009fD¥×Cû\u00874\u0098\u001fºp@VÄ\u0093ãIZ\u0093\u009c\u000fò®3\u008c+ÓzôÕ\u008aª\u0007L¸,\u0003\u0017x\u009e\f©o«\u0007cuVÚ\u009cî,þ\u0004~*J\u009d\u0004h\u009b\u0088«\rmZõ%±\"1g\u008c¦[Wõ";
      int var8 = "2iv=\nÆ§¥>»X\u0019\u008e»¯\u0005\u0091. °i\u000b=>ãÓÚé\u009d]\u0086Û\u001c\n^;¶\u00adÙ*UÐ2f\u0007éá\u009c¹ûf\u0088\u0011Lçéè\u009b\u008eµ±\u0083F¼\u0001ÐxWâ<\u0007Q<sMa6\u001f\u0007»Ñ.ðÊ\u0081j\u0010zq\u000b:ÇÔ>úò/\u0092?\u001cÝõ.\u000f\u009c\u001aóWØyÝO\u008e\u0099\u001d\u008bû!Û\u000fgi\u008c97´ ö1®êm\u0015ý\u0004\u00181ª\u001c\u0003Ü\u0097\u009a\u001d\u0018Ë\u009aÐÀ\rJdEäEÿi\tû5\u0007j~ìJå\u0018I\u0004/\u009a@¯\u000b\u00146ÆÒ~É\tY\u0014[N\u0011\u0014w²þ\u0014ÈPKqeFA«é\u0083ëd\r\u008eå\u0089Ò>ÜÀ¸²]\u009c(\r\u0016ó\u009fD¥×Cû\u00874\u0098\u001fºp@VÄ\u0093ãIZ\u0093\u009c\u000fò®3\u008c+ÓzôÕ\u008aª\u0007L¸,\u0003\u0017x\u009e\f©o«\u0007cuVÚ\u009cî,þ\u0004~*J\u009d\u0004h\u009b\u0088«\rmZõ%±\"1g\u008c¦[Wõ"
         .length();
      char var5 = 4;
      int var12 = -1;

      label52:
      while (true) {
         byte var10000 = 18;
         String var10001 = var6.substring(++var12, var12 + var5);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var31 = var10001.toCharArray();
               int var10004 = var31.length;
               int var10 = 0;
               byte var34 = var10000;
               var26 = var31;
               int var19 = var10004;
               byte var39;
               char[] var43;
               int var10006;
               if (var10004 <= 1) {
                  var43 = var31;
                  var39 = var10000;
                  var10006 = var10;
               } else {
                  var34 = var10000;
                  var19 = var10004;
                  if (var10004 <= var10) {
                     break label47;
                  }

                  var43 = var31;
                  var39 = var10000;
                  var10006 = var10;
               }

               while (true) {
                  char var52 = var43[var10006];
                  byte var53;
                  switch (var10 % 7) {
                     case 0:
                        var53 = 64;
                        break;
                     case 1:
                        var53 = 22;
                        break;
                     case 2:
                        var53 = 90;
                        break;
                     case 3:
                        var53 = 116;
                        break;
                     case 4:
                        var53 = 15;
                        break;
                     case 5:
                        var53 = 86;
                        break;
                     default:
                        var53 = 56;
                  }

                  var43[var10006] = (char)(var52 ^ var39 ^ var53);
                  var10++;
                  if (var34 == 0) {
                     var10006 = var34;
                     var43 = var26;
                     var39 = var34;
                  } else {
                     if (var19 <= var10) {
                        break;
                     }

                     var43 = var26;
                     var39 = var34;
                     var10006 = var10;
                  }
               }
            }

            String var36 = new String(var26).intern();
            switch (var10002) {
               case 0:
                  var9[var7++] = var36;
                  if ((var12 += var5) >= var8) {
                     a = var9;
                     b = new String[27];
                     long var2 = 6648637467162394274L;
                     long var30 = 5131659248757980836L ^ var2;
                     byte var21 = -1;
                     long var0 = var30;
                     String[] var14 = new String[(int)var0];
                     var14[0] = a(-22390, -13050);
                     var14[1] = a(-22379, -30601);
                     var14[2] = a(-22389, -20642);
                     var14[3] = a(-22372, 10104);
                     var14[4] = a(-22370, -4538);
                     var14[5] = a(-22400, 31100);
                     B = Stream.of(var14).map(String::toUpperCase).collect(Collectors.toSet());
                     J = new Hashtable();
                     J.put(a(-22394, 6446), a(-22397, -13860));
                     J.put(a(-22399, -7707), a(-22398, 8981));
                     J.put(a(-22381, 17521), a(-22374, 20542));
                     J.put(a(-22378, -9228), a(-22374, 20542));
                     J.put(a(-22369, 13936), a(-22395, -27121));
                     J.put(a(-22377, -12254), a(-22396, 4130));
                     J.put(a(-22376, 30129), a(-22383, 9981));
                     J.put(a(-22375, 2140), a(-22371, 25612));
                     J.put(a(-22380, 14377), a(-22373, -3517));
                     J.put(a(-22393, 5826), a(-22392, -31468));
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var36;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label52;
                  }

                  var6 = "\f*\u0006â5üÃz´ôIÄýîþ¼|\u0017n¼\u0092\u007fT\u008c2¦Fª°ÈCUîº\u0004\u009c\u0016ý\u000ef:";
                  var8 = "\f*\u0006â5üÃz´ôIÄýîþ¼|\u0017n¼\u0092\u007fT\u008c2¦Fª°ÈCUîº\u0004\u009c\u0016ý\u000ef:".length();
                  var5 = 17;
                  var12 = -1;
            }

            var10000 = 7;
            var10001 = var6.substring(++var12, var12 + var5);
            var10002 = 0;
         }
      }
   }
}





