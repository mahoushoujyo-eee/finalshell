package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;

public class Le4 implements C_H {
   public Signature H;
   public KeyFactory F;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   @Override
   public void k$void() throws Exception {
      this.H = Signature.getInstance(a(-13053, -21063));
      this.F = KeyFactory.getInstance(a(-13056, 5511));
   }

   @Override
   public void g(byte[] var1, byte[] var2, byte[] var3, byte[] var4) throws Exception {
      DSAPublicKeySpec var5 = new DSAPublicKeySpec(new BigInteger(var1), new BigInteger(var2), new BigInteger(var3), new BigInteger(var4));
      PublicKey var6 = this.F.generatePublic(var5);
      this.H.initVerify(var6);
   }

   @Override
   public void A(byte[] var1, byte[] var2, byte[] var3, byte[] var4) throws Exception {
      DSAPrivateKeySpec var5 = new DSAPrivateKeySpec(new BigInteger(var1), new BigInteger(var2), new BigInteger(var3), new BigInteger(var4));
      PrivateKey var6 = this.F.generatePrivate(var5);
      this.H.initSign(var6);
   }

   @Override
   public byte[] k$arrbyte() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/finalshell/core/Le4.H Ljava/security/Signature;
      // 004: invokevirtual java/security/Signature.sign ()[B
      // 007: astore 2
      // 008: bipush 0
      // 009: istore 3
      // 00a: bipush 3
      // 00b: istore 4
      // 00d: invokestatic com/finalshell/core/Y12.D ()Z
      // 010: aload 2
      // 011: iload 4
      // 013: iinc 4 1
      // 016: baload
      // 017: sipush 14129
      // 01a: ldc2_w 3837366427553422682
      // 01d: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 020: iand
      // 021: istore 3
      // 022: iload 3
      // 023: newarray 8
      // 025: astore 5
      // 027: aload 2
      // 028: iload 4
      // 02a: aload 5
      // 02c: bipush 0
      // 02d: aload 5
      // 02f: arraylength
      // 030: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 033: iload 4
      // 035: iload 3
      // 036: iadd
      // 037: bipush 1
      // 038: iadd
      // 039: istore 4
      // 03b: aload 2
      // 03c: iload 4
      // 03e: iinc 4 1
      // 041: baload
      // 042: sipush 889
      // 045: ldc2_w 2124911773326534934
      // 048: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 04b: iand
      // 04c: istore 3
      // 04d: iload 3
      // 04e: newarray 8
      // 050: astore 6
      // 052: istore 1
      // 053: bipush 120
      // 055: aload 2
      // 056: iload 4
      // 058: aload 6
      // 05a: bipush 0
      // 05b: aload 6
      // 05d: arraylength
      // 05e: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 061: ldc2_w 1668825962950453776
      // 064: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 067: newarray 8
      // 069: astore 7
      // 06b: aload 5
      // 06d: aload 5
      // 06f: arraylength
      // 070: iload 1
      // 071: ifne 08f
      // 074: sipush 28899
      // 077: ldc2_w 2262926679424277130
      // 07a: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 07d: if_icmple 092
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: bipush 1
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: goto 093
      // 092: bipush 0
      // 093: aload 7
      // 095: aload 5
      // 097: arraylength
      // 098: sipush 28899
      // 09b: ldc2_w 2262926679424277130
      // 09e: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 0a1: iload 1
      // 0a2: ifne 0c3
      // 0a5: if_icmple 0b7
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: bipush 0
      // 0b0: goto 0c4
      // 0b3: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b6: athrow
      // 0b7: sipush 28899
      // 0ba: ldc2_w 2262926679424277130
      // 0bd: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 0c0: aload 5
      // 0c2: arraylength
      // 0c3: isub
      // 0c4: aload 5
      // 0c6: iload 1
      // 0c7: ifne 0f0
      // 0ca: arraylength
      // 0cb: sipush 28899
      // 0ce: ldc2_w 2262926679424277130
      // 0d1: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 0d4: if_icmple 0ee
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dd: athrow
      // 0de: sipush 28899
      // 0e1: ldc2_w 2262926679424277130
      // 0e4: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 0e7: goto 0f1
      // 0ea: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed: athrow
      // 0ee: aload 5
      // 0f0: arraylength
      // 0f1: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0f4: aload 6
      // 0f6: aload 6
      // 0f8: arraylength
      // 0f9: iload 1
      // 0fa: ifne 118
      // 0fd: sipush 28899
      // 100: ldc2_w 2262926679424277130
      // 103: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 106: if_icmple 11b
      // 109: goto 110
      // 10c: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f: athrow
      // 110: bipush 1
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: goto 11c
      // 11b: bipush 0
      // 11c: aload 7
      // 11e: aload 6
      // 120: arraylength
      // 121: sipush 28899
      // 124: ldc2_w 2262926679424277130
      // 127: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 12a: iload 1
      // 12b: ifne 154
      // 12e: if_icmple 148
      // 131: goto 138
      // 134: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: sipush 28899
      // 13b: ldc2_w 2262926679424277130
      // 13e: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 141: goto 155
      // 144: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 147: athrow
      // 148: sipush 25372
      // 14b: ldc2_w 7701538120159758718
      // 14e: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 151: aload 6
      // 153: arraylength
      // 154: isub
      // 155: aload 6
      // 157: iload 1
      // 158: ifne 181
      // 15b: arraylength
      // 15c: sipush 28899
      // 15f: ldc2_w 2262926679424277130
      // 162: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 165: if_icmple 17f
      // 168: goto 16f
      // 16b: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16e: athrow
      // 16f: sipush 28899
      // 172: ldc2_w 2262926679424277130
      // 175: invokestatic com/finalshell/core/Le4.a (IJ)I
      // 178: goto 182
      // 17b: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17e: athrow
      // 17f: aload 6
      // 181: arraylength
      // 182: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 185: aload 7
      // 187: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 18a: ifnull 1a4
      // 18d: iload 1
      // 18e: ifeq 1a0
      // 191: goto 198
      // 194: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 197: athrow
      // 198: bipush 0
      // 199: goto 1a1
      // 19c: invokestatic com/finalshell/core/Le4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: bipush 1
      // 1a1: invokestatic com/finalshell/core/Y12.N (Z)V
      // 1a4: areturn
   }

   @Override
   public void d(byte[] var1) throws Exception {
      this.H.update(var1);
   }

   @Override
   public boolean g(byte[] var1) throws Exception {
      int var10000 = (Y12.Q()) ? 1 : 0;
      int var3 = 0;
      boolean var2 = (var10000) != 0;
      int var4 = 0;
      UJ var6 = new UJ(var1);

      label69: {
         label68: {
            try {
               var10000 = (new String(var6.S(), StandardCharsets.UTF_8).equals(a(-13054, 23458))) ? 1 : 0;
               if (!var2) {
                  break label69;
               }

               if (var10000 == 0) {
                  break label68;
               }
            } catch (Exception var15) {
               throw a(var15);
            }

            var4 = var6.d();
            var3 = var6.R();
            byte[] var5 = new byte[var4];
            System.arraycopy(var1, var3, var5, 0, var4);
            var1 = var5;
         }

         var10000 = a(24197, 715478848111064296L);
      }

      byte[] var7 = new byte[var10000];
      System.arraycopy(var1, 0, var7, 0, a(28899, 2262926679424277130L));
      var7 = this.W(var7);
      byte[] var8 = new byte[a(28899, 2262926679424277130L)];
      System.arraycopy(var1, a(28899, 2262926679424277130L), var8, 0, a(28899, 2262926679424277130L));
      var8 = this.W(var8);

      label59: {
         label58: {
            try {
               var10000 = var7[0] & a(20207, 968265002645562497L);
               if (!var2) {
                  break label59;
               }

               if (var10000 != 0) {
                  break label58;
               }
            } catch (Exception var14) {
               throw a(var14);
            }

            var10000 = 0;
            break label59;
         }

         var10000 = 1;
      }

      int var9 = var10000;

      label49: {
         label48: {
            try {
               var10000 = var8[0] & a(10448, 1787881703496893114L);
               if (!var2) {
                  break label49;
               }

               if (var10000 != 0) {
                  break label48;
               }
            } catch (Exception var13) {
               throw a(var13);
            }

            var10000 = 0;
            break label49;
         }

         var10000 = 1;
      }

      int var10 = var10000;
      int var11 = var7.length + var8.length + a(13371, 6941340995718078042L) + var9 + var10;
      byte[] var19 = new byte[var11];
      var19[0] = (byte)a(8452, 8277449822260120424L);
      var19[1] = (byte)(var7.length + var8.length + 4);
      var19[1] += (byte)var9;
      var19[1] += (byte)var10;
      var19[2] = 2;
      var19[3] = (byte)var7.length;
      var19[3] += (byte)var9;
      System.arraycopy(var7, 0, var19, 4 + var9, var7.length);
      var19[4 + var19[3]] = 2;
      var19[5 + var19[3]] = (byte)var8.length;
      var19[5 + var19[3]] = (byte)(var19[5 + var19[3]] + (byte)var10);
      System.arraycopy(var8, 0, var19, a(19136, 1641786827958952096L) + var19[3] + var10, var8.length);
      var1 = var19;

      try {
         boolean var25 = this.H.verify(var1);
         if (!var2) {
            Ky4.K(new String[3]);
         }

         return var25;
      } catch (Exception var12) {
         throw a(var12);
      }
   }

   public byte[] W(byte[] var1) {
      boolean var2 = Y12.D();
      byte[] var10000 = var1;
      if (!var2) {
         if (var1.length > 1) {
            if (var2) {
               return var1;
            }

            if (var1[0] == 0) {
               if (var2) {
                  return var1;
               }

               if ((var1[1] & a(10448, 1787881703496893114L)) == 0) {
                  byte[] var3 = new byte[var1.length - 1];
                  System.arraycopy(var1, 1, var3, 0, var3.length);
                  return this.W(var3);
               }
            }
         }

         var10000 = var1;
      }

      return var10000;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -13054) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 195;
               break;
            case 1:
               var10000 = 199;
               break;
            case 2:
               var10000 = 31;
               break;
            case 3:
               var10000 = 173;
               break;
            case 4:
               var10000 = 99;
               break;
            case 5:
               var10000 = 165;
               break;
            case 6:
               var10000 = 111;
               break;
            case 7:
               var10000 = 214;
               break;
            case 8:
               var10000 = 234;
               break;
            case 9:
               var10000 = 150;
               break;
            case 10:
               var10000 = 219;
               break;
            case 11:
               var10000 = 107;
               break;
            case 12:
               var10000 = 60;
               break;
            case 13:
               var10000 = 120;
               break;
            case 14:
               var10000 = 78;
               break;
            case 15:
               var10000 = 8;
               break;
            case 16:
               var10000 = 17;
               break;
            case 17:
               var10000 = 212;
               break;
            case 18:
               var10000 = 149;
               break;
            case 19:
               var10000 = 80;
               break;
            case 20:
               var10000 = 217;
               break;
            case 21:
               var10000 = 187;
               break;
            case 22:
               var10000 = 184;
               break;
            case 23:
               var10000 = 171;
               break;
            case 24:
               var10000 = 24;
               break;
            case 25:
               var10000 = 71;
               break;
            case 26:
               var10000 = 65;
               break;
            case 27:
               var10000 = 61;
               break;
            case 28:
               var10000 = 125;
               break;
            case 29:
               var10000 = 104;
               break;
            case 30:
               var10000 = 133;
               break;
            case 31:
               var10000 = 231;
               break;
            case 32:
               var10000 = 215;
               break;
            case 33:
               var10000 = 239;
               break;
            case 34:
               var10000 = 101;
               break;
            case 35:
               var10000 = 147;
               break;
            case 36:
               var10000 = 113;
               break;
            case 37:
               var10000 = 79;
               break;
            case 38:
               var10000 = 175;
               break;
            case 39:
               var10000 = 244;
               break;
            case 40:
               var10000 = 245;
               break;
            case 41:
               var10000 = 255;
               break;
            case 42:
               var10000 = 178;
               break;
            case 43:
               var10000 = 83;
               break;
            case 44:
               var10000 = 1;
               break;
            case 45:
               var10000 = 54;
               break;
            case 46:
               var10000 = 19;
               break;
            case 47:
               var10000 = 193;
               break;
            case 48:
               var10000 = 189;
               break;
            case 49:
               var10000 = 183;
               break;
            case 50:
               var10000 = 235;
               break;
            case 51:
               var10000 = 210;
               break;
            case 52:
               var10000 = 18;
               break;
            case 53:
               var10000 = 22;
               break;
            case 54:
               var10000 = 242;
               break;
            case 55:
               var10000 = 216;
               break;
            case 56:
               var10000 = 155;
               break;
            case 57:
               var10000 = 161;
               break;
            case 58:
               var10000 = 9;
               break;
            case 59:
               var10000 = 207;
               break;
            case 60:
               var10000 = 68;
               break;
            case 61:
               var10000 = 169;
               break;
            case 62:
               var10000 = 190;
               break;
            case 63:
               var10000 = 69;
               break;
            case 64:
               var10000 = 23;
               break;
            case 65:
               var10000 = 158;
               break;
            case 66:
               var10000 = 166;
               break;
            case 67:
               var10000 = 128;
               break;
            case 68:
               var10000 = 108;
               break;
            case 69:
               var10000 = 7;
               break;
            case 70:
               var10000 = 229;
               break;
            case 71:
               var10000 = 43;
               break;
            case 72:
               var10000 = 194;
               break;
            case 73:
               var10000 = 66;
               break;
            case 74:
               var10000 = 29;
               break;
            case 75:
               var10000 = 122;
               break;
            case 76:
               var10000 = 152;
               break;
            case 77:
               var10000 = 88;
               break;
            case 78:
               var10000 = 230;
               break;
            case 79:
               var10000 = 77;
               break;
            case 80:
               var10000 = 81;
               break;
            case 81:
               var10000 = 146;
               break;
            case 82:
               var10000 = 89;
               break;
            case 83:
               var10000 = 117;
               break;
            case 84:
               var10000 = 237;
               break;
            case 85:
               var10000 = 248;
               break;
            case 86:
               var10000 = 243;
               break;
            case 87:
               var10000 = 30;
               break;
            case 88:
               var10000 = 254;
               break;
            case 89:
               var10000 = 106;
               break;
            case 90:
               var10000 = 62;
               break;
            case 91:
               var10000 = 112;
               break;
            case 92:
               var10000 = 123;
               break;
            case 93:
               var10000 = 116;
               break;
            case 94:
               var10000 = 25;
               break;
            case 95:
               var10000 = 203;
               break;
            case 96:
               var10000 = 233;
               break;
            case 97:
               var10000 = 164;
               break;
            case 98:
               var10000 = 36;
               break;
            case 99:
               var10000 = 137;
               break;
            case 100:
               var10000 = 52;
               break;
            case 101:
               var10000 = 34;
               break;
            case 102:
               var10000 = 97;
               break;
            case 103:
               var10000 = 143;
               break;
            case 104:
               var10000 = 160;
               break;
            case 105:
               var10000 = 135;
               break;
            case 106:
               var10000 = 26;
               break;
            case 107:
               var10000 = 240;
               break;
            case 108:
               var10000 = 44;
               break;
            case 109:
               var10000 = 73;
               break;
            case 110:
               var10000 = 130;
               break;
            case 111:
               var10000 = 20;
               break;
            case 112:
               var10000 = 47;
               break;
            case 113:
               var10000 = 139;
               break;
            case 114:
               var10000 = 27;
               break;
            case 115:
               var10000 = 102;
               break;
            case 116:
               var10000 = 33;
               break;
            case 117:
               var10000 = 226;
               break;
            case 118:
               var10000 = 92;
               break;
            case 119:
               var10000 = 74;
               break;
            case 120:
               var10000 = 227;
               break;
            case 121:
               var10000 = 63;
               break;
            case 122:
               var10000 = 127;
               break;
            case 123:
               var10000 = 114;
               break;
            case 124:
               var10000 = 186;
               break;
            case 125:
               var10000 = 221;
               break;
            case 126:
               var10000 = 103;
               break;
            case 127:
               var10000 = 48;
               break;
            case 128:
               var10000 = 153;
               break;
            case 129:
               var10000 = 59;
               break;
            case 130:
               var10000 = 202;
               break;
            case 131:
               var10000 = 45;
               break;
            case 132:
               var10000 = 222;
               break;
            case 133:
               var10000 = 50;
               break;
            case 134:
               var10000 = 56;
               break;
            case 135:
               var10000 = 41;
               break;
            case 136:
               var10000 = 132;
               break;
            case 137:
               var10000 = 249;
               break;
            case 138:
               var10000 = 109;
               break;
            case 139:
               var10000 = 170;
               break;
            case 140:
               var10000 = 93;
               break;
            case 141:
               var10000 = 86;
               break;
            case 142:
               var10000 = 136;
               break;
            case 143:
               var10000 = 40;
               break;
            case 144:
               var10000 = 85;
               break;
            case 145:
               var10000 = 218;
               break;
            case 146:
               var10000 = 94;
               break;
            case 147:
               var10000 = 200;
               break;
            case 148:
               var10000 = 57;
               break;
            case 149:
               var10000 = 224;
               break;
            case 150:
               var10000 = 182;
               break;
            case 151:
               var10000 = 157;
               break;
            case 152:
               var10000 = 95;
               break;
            case 153:
               var10000 = 172;
               break;
            case 154:
               var10000 = 119;
               break;
            case 155:
               var10000 = 251;
               break;
            case 156:
               var10000 = 2;
               break;
            case 157:
               var10000 = 246;
               break;
            case 158:
               var10000 = 250;
               break;
            case 159:
               var10000 = 49;
               break;
            case 160:
               var10000 = 14;
               break;
            case 161:
               var10000 = 197;
               break;
            case 162:
               var10000 = 39;
               break;
            case 163:
               var10000 = 209;
               break;
            case 164:
               var10000 = 3;
               break;
            case 165:
               var10000 = 142;
               break;
            case 166:
               var10000 = 82;
               break;
            case 167:
               var10000 = 134;
               break;
            case 168:
               var10000 = 70;
               break;
            case 169:
               var10000 = 201;
               break;
            case 170:
               var10000 = 13;
               break;
            case 171:
               var10000 = 32;
               break;
            case 172:
               var10000 = 140;
               break;
            case 173:
               var10000 = 205;
               break;
            case 174:
               var10000 = 124;
               break;
            case 175:
               var10000 = 192;
               break;
            case 176:
               var10000 = 196;
               break;
            case 177:
               var10000 = 4;
               break;
            case 178:
               var10000 = 241;
               break;
            case 179:
               var10000 = 105;
               break;
            case 180:
               var10000 = 16;
               break;
            case 181:
               var10000 = 204;
               break;
            case 182:
               var10000 = 185;
               break;
            case 183:
               var10000 = 228;
               break;
            case 184:
               var10000 = 75;
               break;
            case 185:
               var10000 = 206;
               break;
            case 186:
               var10000 = 198;
               break;
            case 187:
               var10000 = 213;
               break;
            case 188:
               var10000 = 58;
               break;
            case 189:
               var10000 = 15;
               break;
            case 190:
               var10000 = 35;
               break;
            case 191:
               var10000 = 220;
               break;
            case 192:
               var10000 = 12;
               break;
            case 193:
               var10000 = 162;
               break;
            case 194:
               var10000 = 67;
               break;
            case 195:
               var10000 = 129;
               break;
            case 196:
               var10000 = 138;
               break;
            case 197:
               var10000 = 144;
               break;
            case 198:
               var10000 = 168;
               break;
            case 199:
               var10000 = 211;
               break;
            case 200:
               var10000 = 10;
               break;
            case 201:
               var10000 = 87;
               break;
            case 202:
               var10000 = 126;
               break;
            case 203:
               var10000 = 5;
               break;
            case 204:
               var10000 = 84;
               break;
            case 205:
               var10000 = 118;
               break;
            case 206:
               var10000 = 179;
               break;
            case 207:
               var10000 = 11;
               break;
            case 208:
               var10000 = 28;
               break;
            case 209:
               var10000 = 148;
               break;
            case 210:
               var10000 = 236;
               break;
            case 211:
               var10000 = 163;
               break;
            case 212:
               var10000 = 223;
               break;
            case 213:
               var10000 = 76;
               break;
            case 214:
               var10000 = 225;
               break;
            case 215:
               var10000 = 174;
               break;
            case 216:
               var10000 = 46;
               break;
            case 217:
               var10000 = 208;
               break;
            case 218:
               var10000 = 90;
               break;
            case 219:
               var10000 = 159;
               break;
            case 220:
               var10000 = 0;
               break;
            case 221:
               var10000 = 188;
               break;
            case 222:
               var10000 = 177;
               break;
            case 223:
               var10000 = 115;
               break;
            case 224:
               var10000 = 37;
               break;
            case 225:
               var10000 = 151;
               break;
            case 226:
               var10000 = 232;
               break;
            case 227:
               var10000 = 72;
               break;
            case 228:
               var10000 = 131;
               break;
            case 229:
               var10000 = 53;
               break;
            case 230:
               var10000 = 64;
               break;
            case 231:
               var10000 = 6;
               break;
            case 232:
               var10000 = 176;
               break;
            case 233:
               var10000 = 121;
               break;
            case 234:
               var10000 = 253;
               break;
            case 235:
               var10000 = 38;
               break;
            case 236:
               var10000 = 180;
               break;
            case 237:
               var10000 = 247;
               break;
            case 238:
               var10000 = 21;
               break;
            case 239:
               var10000 = 96;
               break;
            case 240:
               var10000 = 98;
               break;
            case 241:
               var10000 = 42;
               break;
            case 242:
               var10000 = 154;
               break;
            case 243:
               var10000 = 167;
               break;
            case 244:
               var10000 = 252;
               break;
            case 245:
               var10000 = 51;
               break;
            case 246:
               var10000 = 100;
               break;
            case 247:
               var10000 = 91;
               break;
            case 248:
               var10000 = 110;
               break;
            case 249:
               var10000 = 191;
               break;
            case 250:
               var10000 = 55;
               break;
            case 251:
               var10000 = 181;
               break;
            case 252:
               var10000 = 238;
               break;
            case 253:
               var10000 = 141;
               break;
            case 254:
               var10000 = 156;
               break;
            default:
               var10000 = 145;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27240;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "MºÓû¥¤Ü\u000bsB\u0019¤ãÊb\u0004_¹ú\u0003IÖ«";
      int var12 = "MºÓû¥¤Ü\u000bsB\u0019¤ãÊb\u0004_¹ú\u0003IÖ«".length();
      char var9 = 7;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 69;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 69;
               var10006 = var14;
            } else {
               var27 = 69;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 69;
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
                     var47 = 107;
                     break;
                  case 2:
                     var47 = 72;
                     break;
                  case 3:
                     var47 = 28;
                     break;
                  case 4:
                     var47 = 58;
                     break;
                  case 5:
                     var47 = 78;
                     break;
                  default:
                     var47 = 89;
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
            b = new String[3];
            long var0 = 4826292961860426728L;
            long[] var6 = new long[11];
            int var3 = 0;
            String var4 = "·\u0004ÕæÜ4ñÐqÞ\f,\u008a~\u0001v\u0096?_¡\bòÙÒ\u008c¶7í\u0086üFMó\u0092\u0083ò(GÐ°\u0082mÀ\u0019|_¯\u0014\u0099R@e\u000e\u0089?éÃ\u0085V\u000b!\u0084ò\u0001r^Y\u0017 À;N";
            int var5 = "·\u0004ÕæÜ4ñÐqÞ\f,\u008a~\u0001v\u0096?_¡\bòÙÒ\u008c¶7í\u0086üFMó\u0092\u0083ò(GÐ°\u0082mÀ\u0019|_¯\u0014\u0099R@e\u000e\u0089?éÃ\u0085V\u000b!\u0084ò\u0001r^Y\u0017 À;N"
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
                           c = var6;
                           d = new Integer[11];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "\u0081çox\u001f\tE´ õ,Îaè\u0012¾";
                        var5 = "\u0081çox\u001f\tE´ õ,Îaè\u0012¾".length();
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





