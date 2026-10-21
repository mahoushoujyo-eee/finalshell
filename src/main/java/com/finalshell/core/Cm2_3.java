package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cm2_3 extends Y_3 {
   public final CM_2[] S;
   public static Y2_3 i;
   public static Y2_3 I;
   public static Y2_3 Q;
   public static Y2_3 n;
   public static Y2_3 V;
   public static Y2_3 Y;
   public static Y2_3 e;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] f;

   public Cm2_3(short var1, CM_2[] var2) {
      super(var1);
      this.S = var2;
   }

   public static Y_3 V(short param0, DataInputStream param1, Cr2_2 param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual java/io/DataInputStream.readUnsignedShort ()I
      // 004: anewarray 40
      // 007: astore 4
      // 009: invokestatic com/finalshell/core/Cr2_2.q$arrky_4 ()[Lcom/finalshell/ui/panel/Ky4;
      // 00c: bipush 0
      // 00d: istore 5
      // 00f: astore 3
      // 010: iload 5
      // 012: aload 4
      // 014: arraylength
      // 015: if_icmpge 1e8
      // 018: aload 1
      // 019: invokevirtual java/io/DataInputStream.readUnsignedByte ()I
      // 01c: istore 6
      // 01e: iload 6
      // 020: sipush 16523
      // 023: ldc2_w 7235474621961882095
      // 026: invokestatic com/finalshell/core/Cm2_3.a (IJ)I
      // 029: aload 3
      // 02a: ifnonnull 052
      // 02d: if_icmpgt 047
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 036: athrow
      // 037: new com/finalshell/core/CO_2
      // 03a: dup
      // 03b: iload 6
      // 03d: invokespecial com/finalshell/core/CO_2.<init> (I)V
      // 040: goto 1a1
      // 043: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 046: athrow
      // 047: iload 6
      // 049: sipush 10594
      // 04c: ldc2_w 7603415220800397319
      // 04f: invokestatic com/finalshell/core/Cm2_3.a (IJ)I
      // 052: aload 3
      // 053: ifnonnull 08a
      // 056: if_icmpgt 07f
      // 059: goto 060
      // 05c: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 05f: athrow
      // 060: new com/finalshell/core/Co2
      // 063: dup
      // 064: iload 6
      // 066: sipush 23747
      // 069: ldc2_w 4154893961555465634
      // 06c: invokestatic com/finalshell/core/Cm2_3.a (IJ)I
      // 06f: isub
      // 070: aload 1
      // 071: aload 2
      // 072: invokestatic com/finalshell/core/Cm2_3.E (Ljava/io/DataInputStream;Lcom/finalshell/core/Cr2_2;)Lcom/finalshell/core/Y2_3;
      // 075: invokespecial com/finalshell/core/Co2.<init> (ILcom/finalshell/core/Y2_3;)V
      // 078: goto 1a1
      // 07b: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 07e: athrow
      // 07f: iload 6
      // 081: sipush 7913
      // 084: ldc2_w 8215346687948724106
      // 087: invokestatic com/finalshell/core/Cm2_3.a (IJ)I
      // 08a: aload 3
      // 08b: ifnonnull 0ab
      // 08e: if_icmpgt 0a0
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 097: athrow
      // 098: aconst_null
      // 099: goto 1a1
      // 09c: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 09f: athrow
      // 0a0: iload 6
      // 0a2: sipush 11341
      // 0a5: ldc2_w 5127465119036187949
      // 0a8: invokestatic com/finalshell/core/Cm2_3.a (IJ)I
      // 0ab: aload 3
      // 0ac: ifnonnull 0db
      // 0af: if_icmpne 0d0
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0b8: athrow
      // 0b9: new com/finalshell/core/Cz2_2
      // 0bc: dup
      // 0bd: aload 1
      // 0be: invokevirtual java/io/DataInputStream.readUnsignedShort ()I
      // 0c1: aload 1
      // 0c2: aload 2
      // 0c3: invokestatic com/finalshell/core/Cm2_3.E (Ljava/io/DataInputStream;Lcom/finalshell/core/Cr2_2;)Lcom/finalshell/core/Y2_3;
      // 0c6: invokespecial com/finalshell/core/Cz2_2.<init> (ILcom/finalshell/core/Y2_3;)V
      // 0c9: goto 1a1
      // 0cc: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0cf: athrow
      // 0d0: iload 6
      // 0d2: sipush 9105
      // 0d5: ldc2_w 8863043763206073087
      // 0d8: invokestatic com/finalshell/core/Cm2_3.a (IJ)I
      // 0db: aload 3
      // 0dc: ifnonnull 112
      // 0df: if_icmpgt 107
      // 0e2: goto 0e9
      // 0e5: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e8: athrow
      // 0e9: new com/finalshell/core/CJ_3
      // 0ec: dup
      // 0ed: aload 1
      // 0ee: invokevirtual java/io/DataInputStream.readUnsignedShort ()I
      // 0f1: sipush 12629
      // 0f4: ldc2_w 1588383527014578227
      // 0f7: invokestatic com/finalshell/core/Cm2_3.a (IJ)I
      // 0fa: iload 6
      // 0fc: isub
      // 0fd: invokespecial com/finalshell/core/CJ_3.<init> (II)V
      // 100: goto 1a1
      // 103: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 106: athrow
      // 107: iload 6
      // 109: sipush 12450
      // 10c: ldc2_w 4367327083357092303
      // 10f: invokestatic com/finalshell/core/Cm2_3.a (IJ)I
      // 112: aload 3
      // 113: ifnonnull 13d
      // 116: if_icmpne 132
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 11f: athrow
      // 120: new com/finalshell/core/CR_3
      // 123: dup
      // 124: aload 1
      // 125: invokevirtual java/io/DataInputStream.readUnsignedShort ()I
      // 128: invokespecial com/finalshell/core/CR_3.<init> (I)V
      // 12b: goto 1a1
      // 12e: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 131: athrow
      // 132: iload 6
      // 134: sipush 1691
      // 137: ldc2_w 5773578111324151
      // 13a: invokestatic com/finalshell/core/Cm2_3.a (IJ)I
      // 13d: aload 3
      // 13e: ifnonnull 179
      // 141: if_icmpgt 16e
      // 144: goto 14b
      // 147: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 14a: athrow
      // 14b: new com/finalshell/core/CQ_2
      // 14e: dup
      // 14f: aload 1
      // 150: invokevirtual java/io/DataInputStream.readUnsignedShort ()I
      // 153: aload 1
      // 154: iload 6
      // 156: sipush 12450
      // 159: ldc2_w 4367327083357092303
      // 15c: invokestatic com/finalshell/core/Cm2_3.a (IJ)I
      // 15f: isub
      // 160: aload 2
      // 161: invokestatic com/finalshell/core/Cm2_3.J (Ljava/io/DataInputStream;ILcom/finalshell/core/Cr2_2;)[Lcom/finalshell/core/Y2_3;
      // 164: invokespecial com/finalshell/core/CQ_2.<init> (I[Lcom/finalshell/core/Y2_3;)V
      // 167: goto 1a1
      // 16a: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 16d: athrow
      // 16e: iload 6
      // 170: sipush 32318
      // 173: ldc2_w 4978422019542447964
      // 176: invokestatic com/finalshell/core/Cm2_3.a (IJ)I
      // 179: if_icmpne 1a0
      // 17c: new com/finalshell/core/CH_3
      // 17f: dup
      // 180: aload 1
      // 181: invokevirtual java/io/DataInputStream.readUnsignedShort ()I
      // 184: aload 1
      // 185: aload 1
      // 186: invokevirtual java/io/DataInputStream.readUnsignedShort ()I
      // 189: aload 2
      // 18a: invokestatic com/finalshell/core/Cm2_3.J (Ljava/io/DataInputStream;ILcom/finalshell/core/Cr2_2;)[Lcom/finalshell/core/Y2_3;
      // 18d: aload 1
      // 18e: aload 1
      // 18f: invokevirtual java/io/DataInputStream.readUnsignedShort ()I
      // 192: aload 2
      // 193: invokestatic com/finalshell/core/Cm2_3.J (Ljava/io/DataInputStream;ILcom/finalshell/core/Cr2_2;)[Lcom/finalshell/core/Y2_3;
      // 196: invokespecial com/finalshell/core/CH_3.<init> (I[Lcom/finalshell/core/Y2_3;[Lcom/finalshell/core/Y2_3;)V
      // 199: goto 1a1
      // 19c: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 19f: athrow
      // 1a0: aconst_null
      // 1a1: astore 7
      // 1a3: aload 3
      // 1a4: ifnonnull 1e4
      // 1a7: aload 7
      // 1a9: ifnonnull 1da
      // 1ac: goto 1b3
      // 1af: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1b2: athrow
      // 1b3: new com/finalshell/core/L2_4
      // 1b6: dup
      // 1b7: new java/lang/StringBuilder
      // 1ba: dup
      // 1bb: invokespecial java/lang/StringBuilder.<init> ()V
      // 1be: sipush -1268
      // 1c1: sipush 8504
      // 1c4: invokestatic com/finalshell/core/Cm2_3.a (II)Ljava/lang/String;
      // 1c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ca: iload 6
      // 1cc: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1cf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d2: invokespecial com/finalshell/core/L2_4.<init> (Ljava/lang/String;)V
      // 1d5: athrow
      // 1d6: invokestatic com/finalshell/core/Cm2_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1d9: athrow
      // 1da: aload 4
      // 1dc: iload 5
      // 1de: aload 7
      // 1e0: aastore
      // 1e1: iinc 5 1
      // 1e4: aload 3
      // 1e5: ifnull 010
      // 1e8: new com/finalshell/core/Cm2_3
      // 1eb: dup
      // 1ec: iload 0
      // 1ed: aload 4
      // 1ef: invokespecial com/finalshell/core/Cm2_3.<init> (S[Lcom/finalshell/core/CM_2;)V
      // 1f2: areturn
   }

   public static void K(Y2_3[] var0, DataOutputStream var1) throws IOException {
      Y2_3[] var3 = var0;
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      int var4 = var0.length;
      Ky4[] var2 = var10000;
      int var5 = 0;

      while (var5 < var4) {
         Y2_3 var6 = var3[var5];
         var6.H(var1);
         var5++;
         if (var2 != null) {
            break;
         }
      }
   }

   public static Y2_3[] J(DataInputStream var0, int var1, Cr2_2 var2) throws IOException {
      Y2_3[] var4 = new Y2_3[var1];
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      int var5 = 0;
      Ky4[] var3 = var10000;

      while (true) {
         if (var5 < var1) {
      int var7;
            try {
               var7 = var4;
               if (var3 != null) {
                  break;
               }

               var4[var5] = E(var0, var2);
               var5++;
               if (var3 == null) {
                  continue;
               }
            } catch (IOException var6) {
      int var7;
               throw a(var6);
            }
         }

         var7 = var4;
         break;
      }

      return var7;
   }

   public static Y2_3 E(DataInputStream var0, Cr2_2 var1) throws IOException {
      int var2 = a(14794, 5275612595348811949L) & var0.readByte();

      label40: {
         try {
            switch (var2) {
               case 0:
                  return i;
               case 1:
                  return I;
               case 2:
                  return Q;
               case 3:
                  return n;
               case 4:
                  return V;
               case 5:
                  return Y;
               case 6:
                  return e;
               case 7:
                  break label40;
               case 8:
                  return new Ca2_2(var0.readShort());
            }
         } catch (IOException var4) {
            throw a(var4);
         }

         throw new L2_4(a(-1267, 11655) + var2);
      }

      short var3 = var0.readShort();
      return new I2_3(var3, var1.X(var3).E(var1));
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      var1.writeShort(this.S.length);
      CM_2[] var3 = this.S;
      int var4 = var3.length;
      int var5 = 0;
      Ky4[] var2 = var10000;

      while (var5 < var4) {
         CM_2 var6 = var3[var5];
         var6.e(var1);
         var5++;
         if (var2 != null) {
            break;
         }
      }
   }

   static Y_3 J(short var0, DataInputStream var1, Cr2_2 var2) throws IOException {
      return V(var0, var1, var2);
   }

   static void o(Y2_3[] var0, DataOutputStream var1) throws IOException {
      K(var0, var1);
   }

   static {
      __vfClinit__();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -1268) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 214;
               break;
            case 1:
               var10000 = 133;
               break;
            case 2:
               var10000 = 95;
               break;
            case 3:
               var10000 = 94;
               break;
            case 4:
               var10000 = 38;
               break;
            case 5:
               var10000 = 96;
               break;
            case 6:
               var10000 = 203;
               break;
            case 7:
               var10000 = 198;
               break;
            case 8:
               var10000 = 122;
               break;
            case 9:
               var10000 = 74;
               break;
            case 10:
               var10000 = 222;
               break;
            case 11:
               var10000 = 43;
               break;
            case 12:
               var10000 = 8;
               break;
            case 13:
               var10000 = 35;
               break;
            case 14:
               var10000 = 175;
               break;
            case 15:
               var10000 = 111;
               break;
            case 16:
               var10000 = 245;
               break;
            case 17:
               var10000 = 220;
               break;
            case 18:
               var10000 = 117;
               break;
            case 19:
               var10000 = 135;
               break;
            case 20:
               var10000 = 56;
               break;
            case 21:
               var10000 = 16;
               break;
            case 22:
               var10000 = 68;
               break;
            case 23:
               var10000 = 140;
               break;
            case 24:
               var10000 = 0;
               break;
            case 25:
               var10000 = 55;
               break;
            case 26:
               var10000 = 60;
               break;
            case 27:
               var10000 = 144;
               break;
            case 28:
               var10000 = 155;
               break;
            case 29:
               var10000 = 89;
               break;
            case 30:
               var10000 = 150;
               break;
            case 31:
               var10000 = 179;
               break;
            case 32:
               var10000 = 240;
               break;
            case 33:
               var10000 = 15;
               break;
            case 34:
               var10000 = 24;
               break;
            case 35:
               var10000 = 105;
               break;
            case 36:
               var10000 = 244;
               break;
            case 37:
               var10000 = 20;
               break;
            case 38:
               var10000 = 63;
               break;
            case 39:
               var10000 = 130;
               break;
            case 40:
               var10000 = 189;
               break;
            case 41:
               var10000 = 97;
               break;
            case 42:
               var10000 = 132;
               break;
            case 43:
               var10000 = 98;
               break;
            case 44:
               var10000 = 59;
               break;
            case 45:
               var10000 = 37;
               break;
            case 46:
               var10000 = 107;
               break;
            case 47:
               var10000 = 1;
               break;
            case 48:
               var10000 = 243;
               break;
            case 49:
               var10000 = 246;
               break;
            case 50:
               var10000 = 173;
               break;
            case 51:
               var10000 = 121;
               break;
            case 52:
               var10000 = 141;
               break;
            case 53:
               var10000 = 54;
               break;
            case 54:
               var10000 = 57;
               break;
            case 55:
               var10000 = 106;
               break;
            case 56:
               var10000 = 102;
               break;
            case 57:
               var10000 = 67;
               break;
            case 58:
               var10000 = 201;
               break;
            case 59:
               var10000 = 92;
               break;
            case 60:
               var10000 = 30;
               break;
            case 61:
               var10000 = 64;
               break;
            case 62:
               var10000 = 192;
               break;
            case 63:
               var10000 = 42;
               break;
            case 64:
               var10000 = 115;
               break;
            case 65:
               var10000 = 247;
               break;
            case 66:
               var10000 = 45;
               break;
            case 67:
               var10000 = 197;
               break;
            case 68:
               var10000 = 157;
               break;
            case 69:
               var10000 = 25;
               break;
            case 70:
               var10000 = 209;
               break;
            case 71:
               var10000 = 109;
               break;
            case 72:
               var10000 = 235;
               break;
            case 73:
               var10000 = 188;
               break;
            case 74:
               var10000 = 199;
               break;
            case 75:
               var10000 = 84;
               break;
            case 76:
               var10000 = 116;
               break;
            case 77:
               var10000 = 23;
               break;
            case 78:
               var10000 = 4;
               break;
            case 79:
               var10000 = 139;
               break;
            case 80:
               var10000 = 28;
               break;
            case 81:
               var10000 = 186;
               break;
            case 82:
               var10000 = 40;
               break;
            case 83:
               var10000 = 85;
               break;
            case 84:
               var10000 = 27;
               break;
            case 85:
               var10000 = 159;
               break;
            case 86:
               var10000 = 145;
               break;
            case 87:
               var10000 = 233;
               break;
            case 88:
               var10000 = 22;
               break;
            case 89:
               var10000 = 50;
               break;
            case 90:
               var10000 = 78;
               break;
            case 91:
               var10000 = 93;
               break;
            case 92:
               var10000 = 17;
               break;
            case 93:
               var10000 = 228;
               break;
            case 94:
               var10000 = 162;
               break;
            case 95:
               var10000 = 29;
               break;
            case 96:
               var10000 = 53;
               break;
            case 97:
               var10000 = 14;
               break;
            case 98:
               var10000 = 134;
               break;
            case 99:
               var10000 = 86;
               break;
            case 100:
               var10000 = 88;
               break;
            case 101:
               var10000 = 131;
               break;
            case 102:
               var10000 = 213;
               break;
            case 103:
               var10000 = 219;
               break;
            case 104:
               var10000 = 146;
               break;
            case 105:
               var10000 = 127;
               break;
            case 106:
               var10000 = 249;
               break;
            case 107:
               var10000 = 208;
               break;
            case 108:
               var10000 = 254;
               break;
            case 109:
               var10000 = 206;
               break;
            case 110:
               var10000 = 200;
               break;
            case 111:
               var10000 = 104;
               break;
            case 112:
               var10000 = 252;
               break;
            case 113:
               var10000 = 236;
               break;
            case 114:
               var10000 = 62;
               break;
            case 115:
               var10000 = 36;
               break;
            case 116:
               var10000 = 215;
               break;
            case 117:
               var10000 = 136;
               break;
            case 118:
               var10000 = 195;
               break;
            case 119:
               var10000 = 103;
               break;
            case 120:
               var10000 = 142;
               break;
            case 121:
               var10000 = 196;
               break;
            case 122:
               var10000 = 147;
               break;
            case 123:
               var10000 = 129;
               break;
            case 124:
               var10000 = 194;
               break;
            case 125:
               var10000 = 231;
               break;
            case 126:
               var10000 = 207;
               break;
            case 127:
               var10000 = 125;
               break;
            case 128:
               var10000 = 190;
               break;
            case 129:
               var10000 = 48;
               break;
            case 130:
               var10000 = 227;
               break;
            case 131:
               var10000 = 33;
               break;
            case 132:
               var10000 = 118;
               break;
            case 133:
               var10000 = 237;
               break;
            case 134:
               var10000 = 230;
               break;
            case 135:
               var10000 = 255;
               break;
            case 136:
               var10000 = 69;
               break;
            case 137:
               var10000 = 7;
               break;
            case 138:
               var10000 = 39;
               break;
            case 139:
               var10000 = 26;
               break;
            case 140:
               var10000 = 210;
               break;
            case 141:
               var10000 = 242;
               break;
            case 142:
               var10000 = 128;
               break;
            case 143:
               var10000 = 156;
               break;
            case 144:
               var10000 = 90;
               break;
            case 145:
               var10000 = 47;
               break;
            case 146:
               var10000 = 165;
               break;
            case 147:
               var10000 = 149;
               break;
            case 148:
               var10000 = 148;
               break;
            case 149:
               var10000 = 184;
               break;
            case 150:
               var10000 = 217;
               break;
            case 151:
               var10000 = 79;
               break;
            case 152:
               var10000 = 178;
               break;
            case 153:
               var10000 = 212;
               break;
            case 154:
               var10000 = 226;
               break;
            case 155:
               var10000 = 143;
               break;
            case 156:
               var10000 = 87;
               break;
            case 157:
               var10000 = 100;
               break;
            case 158:
               var10000 = 160;
               break;
            case 159:
               var10000 = 123;
               break;
            case 160:
               var10000 = 161;
               break;
            case 161:
               var10000 = 80;
               break;
            case 162:
               var10000 = 73;
               break;
            case 163:
               var10000 = 181;
               break;
            case 164:
               var10000 = 250;
               break;
            case 165:
               var10000 = 169;
               break;
            case 166:
               var10000 = 251;
               break;
            case 167:
               var10000 = 170;
               break;
            case 168:
               var10000 = 153;
               break;
            case 169:
               var10000 = 61;
               break;
            case 170:
               var10000 = 65;
               break;
            case 171:
               var10000 = 218;
               break;
            case 172:
               var10000 = 253;
               break;
            case 173:
               var10000 = 58;
               break;
            case 174:
               var10000 = 46;
               break;
            case 175:
               var10000 = 224;
               break;
            case 176:
               var10000 = 110;
               break;
            case 177:
               var10000 = 171;
               break;
            case 178:
               var10000 = 202;
               break;
            case 179:
               var10000 = 229;
               break;
            case 180:
               var10000 = 205;
               break;
            case 181:
               var10000 = 31;
               break;
            case 182:
               var10000 = 138;
               break;
            case 183:
               var10000 = 126;
               break;
            case 184:
               var10000 = 72;
               break;
            case 185:
               var10000 = 52;
               break;
            case 186:
               var10000 = 66;
               break;
            case 187:
               var10000 = 11;
               break;
            case 188:
               var10000 = 101;
               break;
            case 189:
               var10000 = 19;
               break;
            case 190:
               var10000 = 76;
               break;
            case 191:
               var10000 = 112;
               break;
            case 192:
               var10000 = 70;
               break;
            case 193:
               var10000 = 113;
               break;
            case 194:
               var10000 = 238;
               break;
            case 195:
               var10000 = 49;
               break;
            case 196:
               var10000 = 75;
               break;
            case 197:
               var10000 = 163;
               break;
            case 198:
               var10000 = 32;
               break;
            case 199:
               var10000 = 177;
               break;
            case 200:
               var10000 = 168;
               break;
            case 201:
               var10000 = 137;
               break;
            case 202:
               var10000 = 44;
               break;
            case 203:
               var10000 = 187;
               break;
            case 204:
               var10000 = 183;
               break;
            case 205:
               var10000 = 180;
               break;
            case 206:
               var10000 = 174;
               break;
            case 207:
               var10000 = 114;
               break;
            case 208:
               var10000 = 248;
               break;
            case 209:
               var10000 = 172;
               break;
            case 210:
               var10000 = 124;
               break;
            case 211:
               var10000 = 81;
               break;
            case 212:
               var10000 = 239;
               break;
            case 213:
               var10000 = 211;
               break;
            case 214:
               var10000 = 34;
               break;
            case 215:
               var10000 = 51;
               break;
            case 216:
               var10000 = 10;
               break;
            case 217:
               var10000 = 71;
               break;
            case 218:
               var10000 = 77;
               break;
            case 219:
               var10000 = 204;
               break;
            case 220:
               var10000 = 6;
               break;
            case 221:
               var10000 = 5;
               break;
            case 222:
               var10000 = 91;
               break;
            case 223:
               var10000 = 167;
               break;
            case 224:
               var10000 = 176;
               break;
            case 225:
               var10000 = 83;
               break;
            case 226:
               var10000 = 2;
               break;
            case 227:
               var10000 = 12;
               break;
            case 228:
               var10000 = 164;
               break;
            case 229:
               var10000 = 21;
               break;
            case 230:
               var10000 = 223;
               break;
            case 231:
               var10000 = 221;
               break;
            case 232:
               var10000 = 232;
               break;
            case 233:
               var10000 = 166;
               break;
            case 234:
               var10000 = 154;
               break;
            case 235:
               var10000 = 13;
               break;
            case 236:
               var10000 = 108;
               break;
            case 237:
               var10000 = 216;
               break;
            case 238:
               var10000 = 191;
               break;
            case 239:
               var10000 = 234;
               break;
            case 240:
               var10000 = 41;
               break;
            case 241:
               var10000 = 119;
               break;
            case 242:
               var10000 = 120;
               break;
            case 243:
               var10000 = 182;
               break;
            case 244:
               var10000 = 151;
               break;
            case 245:
               var10000 = 241;
               break;
            case 246:
               var10000 = 152;
               break;
            case 247:
               var10000 = 158;
               break;
            case 248:
               var10000 = 185;
               break;
            case 249:
               var10000 = 9;
               break;
            case 250:
               var10000 = 225;
               break;
            case 251:
               var10000 = 18;
               break;
            case 252:
               var10000 = 193;
               break;
            case 253:
               var10000 = 99;
               break;
            case 254:
               var10000 = 3;
               break;
            default:
               var10000 = 82;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2404;
      if (f[var3] == null) {
         f[var3] = (int)(d[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "ÈØGEûëÀ]\u000e³!(eo\u0083µ\u00888Î¦(Á \u0090'\u0083H\u001beqY\u007ff»¨#pÿP¡\u0019w\u009cÎ\u0080ÐF}õ¸3¿UOø¤ø\u0007_\"D¢O´\u008f×3\u0090äèË";
      int var12 = "ÈØGEûëÀ]\u000e³!(eo\u0083µ\u00888Î¦(Á \u0090'\u0083H\u001beqY\u007ff»¨#pÿP¡\u0019w\u009cÎ\u0080ÐF}õ¸3¿UOø¤ø\u0007_\"D¢O´\u008f×3\u0090äèË"
         .length();
      char var9 = '#';
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 60;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 60;
               var10006 = var14;
            } else {
               var27 = 60;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 60;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 85;
                     break;
                  case 1:
                     var47 = 91;
                     break;
                  case 2:
                     var47 = 89;
                     break;
                  case 3:
                     var47 = 76;
                     break;
                  case 4:
                     var47 = 87;
                     break;
                  case 5:
                     var47 = 85;
                     break;
                  default:
                     var47 = 107;
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
            c = new String[2];
            long var0 = 7935399195986086131L;
            long[] var6 = new long[11];
            int var3 = 0;
            String var4 = "V\u0087¬\u0086,Ï\u0081#ey\u0000\u0011 0è\u008b\u0010\u0015\u0087ë\u0085bð;)òÃ¯Müx¡\u0010eÕß\u0089ðm)Ï(\u0083W\u0012F\u001d\u0011>3(fCd¿P×¡\t?Bv_\u008fK-²L\u009bÃGú";
            int var5 = "V\u0087¬\u0086,Ï\u0081#ey\u0000\u0011 0è\u008b\u0010\u0015\u0087ë\u0085bð;)òÃ¯Müx¡\u0010eÕß\u0089ðm)Ï(\u0083W\u0012F\u001d\u0011>3(fCd¿P×¡\t?Bv_\u008fK-²L\u009bÃGú"
               .length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
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
                           d = var6;
                           f = new Integer[11];
                           i = new P2_3();
                           I = new CV();
                           Q = new Cw2();
                           n = new C_10();
                           V = new CI_2();
                           Y = new Ci2_2();
                           e = new B_5();
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "+<ÉK®ÚñÇ¿ç\u009a§m\bbö";
                        var5 = "+<ÉK®ÚñÇ¿ç\u009a§m\bbö".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
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






