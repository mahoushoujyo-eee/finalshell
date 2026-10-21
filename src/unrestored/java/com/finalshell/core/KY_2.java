package com.finalshell.core;

import com.finalshell.ui.model.Oc2;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;

public class KY_2 implements Ak2, X4 {
   public static KY_2 z;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   @Override
   public void u(NL3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: aload 1
      // 004: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 007: astore 7
      // 009: astore 6
      // 00b: aload 2
      // 00c: instanceof java/util/concurrent/atomic/AtomicInteger
      // 00f: aload 6
      // 011: ifnull 033
      // 014: ifeq 02f
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/KY_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 01d: athrow
      // 01e: aload 2
      // 01f: checkcast java/util/concurrent/atomic/AtomicInteger
      // 022: astore 8
      // 024: aload 7
      // 026: aload 8
      // 028: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 02b: invokevirtual com/finalshell/io/YM3.v (I)V
      // 02e: return
      // 02f: aload 2
      // 030: instanceof java/util/concurrent/atomic/AtomicLong
      // 033: aload 6
      // 035: ifnull 063
      // 038: ifeq 053
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/core/KY_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 041: athrow
      // 042: aload 2
      // 043: checkcast java/util/concurrent/atomic/AtomicLong
      // 046: astore 8
      // 048: aload 7
      // 04a: aload 8
      // 04c: invokevirtual java/util/concurrent/atomic/AtomicLong.get ()J
      // 04f: invokevirtual com/finalshell/io/YM3.i (J)V
      // 052: return
      // 053: aload 2
      // 054: aload 6
      // 056: ifnull 095
      // 059: instanceof java/util/concurrent/atomic/AtomicBoolean
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/KY_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 062: athrow
      // 063: ifeq 094
      // 066: aload 2
      // 067: checkcast java/util/concurrent/atomic/AtomicBoolean
      // 06a: astore 8
      // 06c: aload 7
      // 06e: aload 8
      // 070: invokevirtual java/util/concurrent/atomic/AtomicBoolean.get ()Z
      // 073: ifeq 086
      // 076: sipush 11343
      // 079: sipush -15350
      // 07c: invokestatic com/finalshell/core/KY_2.a (II)Ljava/lang/String;
      // 07f: goto 08f
      // 082: invokestatic com/finalshell/core/KY_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 085: athrow
      // 086: sipush 11342
      // 089: sipush -17691
      // 08c: invokestatic com/finalshell/core/KY_2.a (II)Ljava/lang/String;
      // 08f: invokevirtual com/finalshell/io/YM3.q (Ljava/lang/CharSequence;)Lcom/finalshell/io/YM3;
      // 092: pop
      // 093: return
      // 094: aload 2
      // 095: aload 6
      // 097: ifnull 0b2
      // 09a: ifnonnull 0b1
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/core/KY_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0a3: athrow
      // 0a4: aload 7
      // 0a6: getstatic com/finalshell/ui/model/EP.WriteNullListAsEmpty Lcom/finalshell/ui/model/EP;
      // 0a9: invokevirtual com/finalshell/io/YM3.x (Lcom/finalshell/ui/model/EP;)V
      // 0ac: return
      // 0ad: invokestatic com/finalshell/core/KY_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0b0: athrow
      // 0b1: aload 2
      // 0b2: aload 6
      // 0b4: ifnull 143
      // 0b7: instanceof java/util/concurrent/atomic/AtomicIntegerArray
      // 0ba: ifeq 142
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/KY_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0c3: athrow
      // 0c4: aload 2
      // 0c5: checkcast java/util/concurrent/atomic/AtomicIntegerArray
      // 0c8: astore 8
      // 0ca: aload 8
      // 0cc: invokevirtual java/util/concurrent/atomic/AtomicIntegerArray.length ()I
      // 0cf: istore 9
      // 0d1: aload 7
      // 0d3: sipush 14003
      // 0d6: ldc2_w 1027301428070833994
      // 0d9: invokestatic com/finalshell/core/KY_2.a (IJ)I
      // 0dc: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0df: bipush 0
      // 0e0: istore 10
      // 0e2: iload 10
      // 0e4: iload 9
      // 0e6: if_icmpge 133
      // 0e9: aload 8
      // 0eb: iload 10
      // 0ed: invokevirtual java/util/concurrent/atomic/AtomicIntegerArray.get (I)I
      // 0f0: istore 11
      // 0f2: aload 6
      // 0f4: ifnull 141
      // 0f7: aload 6
      // 0f9: ifnull 12e
      // 0fc: goto 103
      // 0ff: invokestatic com/finalshell/core/KY_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 102: athrow
      // 103: iload 10
      // 105: ifeq 124
      // 108: goto 10f
      // 10b: invokestatic com/finalshell/core/KY_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 10e: athrow
      // 10f: aload 7
      // 111: sipush 8952
      // 114: ldc2_w 1248694989211355910
      // 117: invokestatic com/finalshell/core/KY_2.a (IJ)I
      // 11a: invokevirtual com/finalshell/io/YM3.write (I)V
      // 11d: goto 124
      // 120: invokestatic com/finalshell/core/KY_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 123: athrow
      // 124: aload 7
      // 126: iload 11
      // 128: invokevirtual com/finalshell/io/YM3.v (I)V
      // 12b: iinc 10 1
      // 12e: aload 6
      // 130: ifnonnull 0e2
      // 133: aload 7
      // 135: sipush 1563
      // 138: ldc2_w 6287524709583515620
      // 13b: invokestatic com/finalshell/core/KY_2.a (IJ)I
      // 13e: invokevirtual com/finalshell/io/YM3.write (I)V
      // 141: return
      // 142: aload 2
      // 143: checkcast java/util/concurrent/atomic/AtomicLongArray
      // 146: astore 8
      // 148: aload 8
      // 14a: invokevirtual java/util/concurrent/atomic/AtomicLongArray.length ()I
      // 14d: istore 9
      // 14f: aload 7
      // 151: sipush 11426
      // 154: ldc2_w 6478619990808642905
      // 157: invokestatic com/finalshell/core/KY_2.a (IJ)I
      // 15a: invokevirtual com/finalshell/io/YM3.write (I)V
      // 15d: bipush 0
      // 15e: istore 10
      // 160: iload 10
      // 162: iload 9
      // 164: if_icmpge 1b1
      // 167: aload 8
      // 169: iload 10
      // 16b: invokevirtual java/util/concurrent/atomic/AtomicLongArray.get (I)J
      // 16e: lstore 11
      // 170: aload 6
      // 172: ifnull 1bf
      // 175: aload 6
      // 177: ifnull 1ac
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/core/KY_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 180: athrow
      // 181: iload 10
      // 183: ifeq 1a2
      // 186: goto 18d
      // 189: invokestatic com/finalshell/core/KY_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 18c: athrow
      // 18d: aload 7
      // 18f: sipush 23455
      // 192: ldc2_w 597894198813962851
      // 195: invokestatic com/finalshell/core/KY_2.a (IJ)I
      // 198: invokevirtual com/finalshell/io/YM3.write (I)V
      // 19b: goto 1a2
      // 19e: invokestatic com/finalshell/core/KY_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1a1: athrow
      // 1a2: aload 7
      // 1a4: lload 11
      // 1a6: invokevirtual com/finalshell/io/YM3.i (J)V
      // 1a9: iinc 10 1
      // 1ac: aload 6
      // 1ae: ifnonnull 160
      // 1b1: aload 7
      // 1b3: sipush 21509
      // 1b6: ldc2_w 6314819853717388792
      // 1b9: invokestatic com/finalshell/core/KY_2.a (IJ)I
      // 1bc: invokevirtual com/finalshell/io/YM3.write (I)V
      // 1bf: return
   }

   @Override
   public Object z(Yn4 var1, Type var2, Object var3) {
      AtomicLongArray var10;
      AtomicIntegerArray var11;
      String var4 = Nv4.o();
      P7 var10000 = var1.N;
      if (var4 != null) {
         if (var1.N.P() != a(933, 1037425389240117844L)) {
            Oc2 var5 = new Oc2();
            var1.B(var5);
            if (var2 == AtomicIntegerArray.class) {
               AtomicIntegerArray var8 = new AtomicIntegerArray(var5.size());
               int var9 = 0;

               while (true) {
                  if (var9 < var5.size()) {
                     var11 = var8;
                     if (var4 == null) {
                        break;
                     }

                     var8.set(var9, var5.p(var9));
                     var9++;
                     if (var4 != null) {
                        continue;
                     }
                  }

                  var11 = var8;
                  break;
               }

               return var11;
            }

            AtomicLongArray var6 = new AtomicLongArray(var5.size());
            int var7 = 0;

            while (true) {
               if (var7 < var5.size()) {
                  var10 = var6;
                  if (var4 == null) {
                     break;
                  }

                  var6.set(var7, var5.I(var7));
                  var7++;
                  if (var4 != null) {
                     continue;
                  }
               }

               var10 = var6;
               break;
            }

            return var10;
         }

         var10000 = var1.N;
      }

      var10000.S(a(9519, 1464520981123714263L));
      return null;
   }

   @Override
   public int j() {
      return a(24240, 4552186646244865866L);
   }

   static {
      __vfClinit__();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 11342) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 38;
               break;
            case 1:
               var10000 = 47;
               break;
            case 2:
               var10000 = 56;
               break;
            case 3:
               var10000 = 206;
               break;
            case 4:
               var10000 = 69;
               break;
            case 5:
               var10000 = 107;
               break;
            case 6:
               var10000 = 79;
               break;
            case 7:
               var10000 = 213;
               break;
            case 8:
               var10000 = 78;
               break;
            case 9:
               var10000 = 177;
               break;
            case 10:
               var10000 = 227;
               break;
            case 11:
               var10000 = 171;
               break;
            case 12:
               var10000 = 129;
               break;
            case 13:
               var10000 = 181;
               break;
            case 14:
               var10000 = 100;
               break;
            case 15:
               var10000 = 134;
               break;
            case 16:
               var10000 = 189;
               break;
            case 17:
               var10000 = 162;
               break;
            case 18:
               var10000 = 63;
               break;
            case 19:
               var10000 = 210;
               break;
            case 20:
               var10000 = 164;
               break;
            case 21:
               var10000 = 68;
               break;
            case 22:
               var10000 = 232;
               break;
            case 23:
               var10000 = 185;
               break;
            case 24:
               var10000 = 199;
               break;
            case 25:
               var10000 = 40;
               break;
            case 26:
               var10000 = 74;
               break;
            case 27:
               var10000 = 251;
               break;
            case 28:
               var10000 = 223;
               break;
            case 29:
               var10000 = 221;
               break;
            case 30:
               var10000 = 111;
               break;
            case 31:
               var10000 = 141;
               break;
            case 32:
               var10000 = 5;
               break;
            case 33:
               var10000 = 236;
               break;
            case 34:
               var10000 = 22;
               break;
            case 35:
               var10000 = 54;
               break;
            case 36:
               var10000 = 252;
               break;
            case 37:
               var10000 = 163;
               break;
            case 38:
               var10000 = 10;
               break;
            case 39:
               var10000 = 57;
               break;
            case 40:
               var10000 = 244;
               break;
            case 41:
               var10000 = 238;
               break;
            case 42:
               var10000 = 23;
               break;
            case 43:
               var10000 = 86;
               break;
            case 44:
               var10000 = 123;
               break;
            case 45:
               var10000 = 246;
               break;
            case 46:
               var10000 = 114;
               break;
            case 47:
               var10000 = 173;
               break;
            case 48:
               var10000 = 64;
               break;
            case 49:
               var10000 = 131;
               break;
            case 50:
               var10000 = 161;
               break;
            case 51:
               var10000 = 118;
               break;
            case 52:
               var10000 = 46;
               break;
            case 53:
               var10000 = 155;
               break;
            case 54:
               var10000 = 217;
               break;
            case 55:
               var10000 = 49;
               break;
            case 56:
               var10000 = 81;
               break;
            case 57:
               var10000 = 6;
               break;
            case 58:
               var10000 = 43;
               break;
            case 59:
               var10000 = 202;
               break;
            case 60:
               var10000 = 167;
               break;
            case 61:
               var10000 = 66;
               break;
            case 62:
               var10000 = 198;
               break;
            case 63:
               var10000 = 240;
               break;
            case 64:
               var10000 = 112;
               break;
            case 65:
               var10000 = 254;
               break;
            case 66:
               var10000 = 85;
               break;
            case 67:
               var10000 = 192;
               break;
            case 68:
               var10000 = 196;
               break;
            case 69:
               var10000 = 115;
               break;
            case 70:
               var10000 = 201;
               break;
            case 71:
               var10000 = 52;
               break;
            case 72:
               var10000 = 67;
               break;
            case 73:
               var10000 = 55;
               break;
            case 74:
               var10000 = 150;
               break;
            case 75:
               var10000 = 214;
               break;
            case 76:
               var10000 = 87;
               break;
            case 77:
               var10000 = 29;
               break;
            case 78:
               var10000 = 211;
               break;
            case 79:
               var10000 = 248;
               break;
            case 80:
               var10000 = 188;
               break;
            case 81:
               var10000 = 92;
               break;
            case 82:
               var10000 = 193;
               break;
            case 83:
               var10000 = 137;
               break;
            case 84:
               var10000 = 44;
               break;
            case 85:
               var10000 = 169;
               break;
            case 86:
               var10000 = 36;
               break;
            case 87:
               var10000 = 37;
               break;
            case 88:
               var10000 = 58;
               break;
            case 89:
               var10000 = 96;
               break;
            case 90:
               var10000 = 200;
               break;
            case 91:
               var10000 = 219;
               break;
            case 92:
               var10000 = 90;
               break;
            case 93:
               var10000 = 159;
               break;
            case 94:
               var10000 = 195;
               break;
            case 95:
               var10000 = 142;
               break;
            case 96:
               var10000 = 222;
               break;
            case 97:
               var10000 = 2;
               break;
            case 98:
               var10000 = 0;
               break;
            case 99:
               var10000 = 17;
               break;
            case 100:
               var10000 = 250;
               break;
            case 101:
               var10000 = 30;
               break;
            case 102:
               var10000 = 19;
               break;
            case 103:
               var10000 = 4;
               break;
            case 104:
               var10000 = 119;
               break;
            case 105:
               var10000 = 75;
               break;
            case 106:
               var10000 = 94;
               break;
            case 107:
               var10000 = 33;
               break;
            case 108:
               var10000 = 139;
               break;
            case 109:
               var10000 = 184;
               break;
            case 110:
               var10000 = 104;
               break;
            case 111:
               var10000 = 122;
               break;
            case 112:
               var10000 = 26;
               break;
            case 113:
               var10000 = 215;
               break;
            case 114:
               var10000 = 220;
               break;
            case 115:
               var10000 = 186;
               break;
            case 116:
               var10000 = 16;
               break;
            case 117:
               var10000 = 61;
               break;
            case 118:
               var10000 = 84;
               break;
            case 119:
               var10000 = 31;
               break;
            case 120:
               var10000 = 178;
               break;
            case 121:
               var10000 = 191;
               break;
            case 122:
               var10000 = 230;
               break;
            case 123:
               var10000 = 125;
               break;
            case 124:
               var10000 = 160;
               break;
            case 125:
               var10000 = 110;
               break;
            case 126:
               var10000 = 255;
               break;
            case 127:
               var10000 = 45;
               break;
            case 128:
               var10000 = 128;
               break;
            case 129:
               var10000 = 70;
               break;
            case 130:
               var10000 = 225;
               break;
            case 131:
               var10000 = 190;
               break;
            case 132:
               var10000 = 121;
               break;
            case 133:
               var10000 = 204;
               break;
            case 134:
               var10000 = 51;
               break;
            case 135:
               var10000 = 187;
               break;
            case 136:
               var10000 = 25;
               break;
            case 137:
               var10000 = 1;
               break;
            case 138:
               var10000 = 237;
               break;
            case 139:
               var10000 = 98;
               break;
            case 140:
               var10000 = 228;
               break;
            case 141:
               var10000 = 216;
               break;
            case 142:
               var10000 = 11;
               break;
            case 143:
               var10000 = 9;
               break;
            case 144:
               var10000 = 12;
               break;
            case 145:
               var10000 = 183;
               break;
            case 146:
               var10000 = 148;
               break;
            case 147:
               var10000 = 174;
               break;
            case 148:
               var10000 = 165;
               break;
            case 149:
               var10000 = 172;
               break;
            case 150:
               var10000 = 103;
               break;
            case 151:
               var10000 = 203;
               break;
            case 152:
               var10000 = 176;
               break;
            case 153:
               var10000 = 95;
               break;
            case 154:
               var10000 = 149;
               break;
            case 155:
               var10000 = 208;
               break;
            case 156:
               var10000 = 89;
               break;
            case 157:
               var10000 = 144;
               break;
            case 158:
               var10000 = 105;
               break;
            case 159:
               var10000 = 197;
               break;
            case 160:
               var10000 = 77;
               break;
            case 161:
               var10000 = 135;
               break;
            case 162:
               var10000 = 209;
               break;
            case 163:
               var10000 = 99;
               break;
            case 164:
               var10000 = 7;
               break;
            case 165:
               var10000 = 239;
               break;
            case 166:
               var10000 = 168;
               break;
            case 167:
               var10000 = 152;
               break;
            case 168:
               var10000 = 241;
               break;
            case 169:
               var10000 = 24;
               break;
            case 170:
               var10000 = 120;
               break;
            case 171:
               var10000 = 127;
               break;
            case 172:
               var10000 = 153;
               break;
            case 173:
               var10000 = 231;
               break;
            case 174:
               var10000 = 179;
               break;
            case 175:
               var10000 = 247;
               break;
            case 176:
               var10000 = 39;
               break;
            case 177:
               var10000 = 243;
               break;
            case 178:
               var10000 = 170;
               break;
            case 179:
               var10000 = 166;
               break;
            case 180:
               var10000 = 133;
               break;
            case 181:
               var10000 = 65;
               break;
            case 182:
               var10000 = 182;
               break;
            case 183:
               var10000 = 233;
               break;
            case 184:
               var10000 = 27;
               break;
            case 185:
               var10000 = 130;
               break;
            case 186:
               var10000 = 234;
               break;
            case 187:
               var10000 = 13;
               break;
            case 188:
               var10000 = 136;
               break;
            case 189:
               var10000 = 73;
               break;
            case 190:
               var10000 = 253;
               break;
            case 191:
               var10000 = 106;
               break;
            case 192:
               var10000 = 124;
               break;
            case 193:
               var10000 = 32;
               break;
            case 194:
               var10000 = 143;
               break;
            case 195:
               var10000 = 93;
               break;
            case 196:
               var10000 = 91;
               break;
            case 197:
               var10000 = 242;
               break;
            case 198:
               var10000 = 180;
               break;
            case 199:
               var10000 = 117;
               break;
            case 200:
               var10000 = 146;
               break;
            case 201:
               var10000 = 157;
               break;
            case 202:
               var10000 = 35;
               break;
            case 203:
               var10000 = 224;
               break;
            case 204:
               var10000 = 59;
               break;
            case 205:
               var10000 = 116;
               break;
            case 206:
               var10000 = 212;
               break;
            case 207:
               var10000 = 145;
               break;
            case 208:
               var10000 = 205;
               break;
            case 209:
               var10000 = 218;
               break;
            case 210:
               var10000 = 147;
               break;
            case 211:
               var10000 = 76;
               break;
            case 212:
               var10000 = 109;
               break;
            case 213:
               var10000 = 154;
               break;
            case 214:
               var10000 = 14;
               break;
            case 215:
               var10000 = 18;
               break;
            case 216:
               var10000 = 207;
               break;
            case 217:
               var10000 = 156;
               break;
            case 218:
               var10000 = 194;
               break;
            case 219:
               var10000 = 3;
               break;
            case 220:
               var10000 = 28;
               break;
            case 221:
               var10000 = 229;
               break;
            case 222:
               var10000 = 140;
               break;
            case 223:
               var10000 = 226;
               break;
            case 224:
               var10000 = 245;
               break;
            case 225:
               var10000 = 50;
               break;
            case 226:
               var10000 = 82;
               break;
            case 227:
               var10000 = 101;
               break;
            case 228:
               var10000 = 108;
               break;
            case 229:
               var10000 = 80;
               break;
            case 230:
               var10000 = 62;
               break;
            case 231:
               var10000 = 71;
               break;
            case 232:
               var10000 = 102;
               break;
            case 233:
               var10000 = 34;
               break;
            case 234:
               var10000 = 97;
               break;
            case 235:
               var10000 = 72;
               break;
            case 236:
               var10000 = 88;
               break;
            case 237:
               var10000 = 21;
               break;
            case 238:
               var10000 = 41;
               break;
            case 239:
               var10000 = 83;
               break;
            case 240:
               var10000 = 126;
               break;
            case 241:
               var10000 = 48;
               break;
            case 242:
               var10000 = 8;
               break;
            case 243:
               var10000 = 249;
               break;
            case 244:
               var10000 = 20;
               break;
            case 245:
               var10000 = 15;
               break;
            case 246:
               var10000 = 132;
               break;
            case 247:
               var10000 = 42;
               break;
            case 248:
               var10000 = 113;
               break;
            case 249:
               var10000 = 158;
               break;
            case 250:
               var10000 = 53;
               break;
            case 251:
               var10000 = 175;
               break;
            case 252:
               var10000 = 60;
               break;
            case 253:
               var10000 = 138;
               break;
            case 254:
               var10000 = 151;
               break;
            default:
               var10000 = 235;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27129;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      int var11;
      String[] var13 = new String[2];
      var11 = 0;
      String var10 = "\u0084\\.\u0086n\u0004\u0013Ù\u0095Q";
      int var12 = "\u0084\\.\u0086n\u0004\u0013Ù\u0095Q".length();
      char var9 = 5;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 61;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 61;
               var10006 = var14;
            } else {
               var27 = 61;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 61;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 117;
                     break;
                  case 1:
                     var47 = 127;
                     break;
                  case 2:
                     var47 = 76;
                     break;
                  case 3:
                     var47 = 70;
                     break;
                  case 4:
                     var47 = 60;
                     break;
                  case 5:
                     var47 = 113;
                     break;
                  default:
                     var47 = 42;
               }

               var10005[var10006] = (char)(var46 ^ var32 ^ var47);
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[2];
            long var0 = 4896599615745395841L;
            long[] var6 = new long[9];
            int var3 = 0;
            String var4 = " \u000bs\u0083\u0086¸S\u0090÷µkd\u0092-ÀFúÚìïM5I\u0083_\u0000)\u0083ßb;Åòö\u00adê&¹1$8\u001b|Í\u001aC>Î[þåJ æã8";
            int var5 = " \u000bs\u0083\u0086¸S\u0090÷µkd\u0092-ÀFúÚìïM5I\u0083_\u0000)\u0083ßb;Åòö\u00adê&¹1$8\u001b|Í\u001aC>Î[þåJ æã8".length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               long[] var10000 = var6;
               var19 = var3++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var0;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var2 >= var5) {
                           c = var6;
                           d = new Integer[9];
                           z = new KY_2();
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "O§A×/\u0011G«ývIÜ!qfÝ";
                        var5 = "O§A×/\u0011G«ývIÜ!qfÝ".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var10000 = var6;
                  var19 = var3++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }
}





