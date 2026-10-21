package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import org.apache.commons.codec.digest.DigestUtils;

public class Qr2 {
   static int t;
   static int b;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public static String M(String var0) {
      String var1 = "";

      try {
         Registry.packArgs(var0);
         long var3 = 323461560553256104L;
         Object var10001 = Ref.h2(323461560553256104L, var3);

         try {
            var10001 = (String)var10001;
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var1 = (String)var10001;
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      return var1;
   }

   public static String R(String var0) {
      String var1 = "";

      try {
         Registry.packArgs(var0);
         long var3 = 182911976861322990L;
         Object var10001 = Ref.h2(182911976861322990L, var3);

         try {
            var10001 = (String)var10001;
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var1 = (String)var10001;
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      return var1;
   }

   static byte[] u(byte[] var0) {
      Ky4[] var10000 = YT3_2.c();
      Random var2 = new Random((long)var0[5]);
      long var3 = (long)(5 + var2.nextInt(a(757, 2493245420898990152L)));
      long var5 = Registry.lookupField(567239955528735437L).getLong(null) / var3;
      Ky4[] var1 = var10000;
      Random var7 = new Random(var5);
      byte var8 = var0[0];
      int var9 = 0;

      while (true) {
         if (var9 < var8) {
            try {
               var26 = var7.nextLong();
               if (var1 == null) {
                  break;
               }

               var9++;
               if (var1 != null) {
                  continue;
               }
            } catch (IOException var23) {
               throw a(var23);
            }
         }

         var26 = var7.nextLong();
         break;
      }

      long var24 = var26;
      Random var11 = new Random(var24);
      long[] var27 = new long[a(12062, 8739717653884802471L)];
      var27[0] = (long)var0[4];
      var27[1] = var11.nextLong();
      var27[2] = (long)var0[a(19737, 1982386851009755047L)];
      var27[3] = (long)var0[3];
      var27[4] = var11.nextLong();
      var27[5] = (long)var0[1];
      var27[a(4776, 385605897674565650L)] = var7.nextLong();
      var27[a(21367, 3862329676473919944L)] = (long)var0[2];
      long[] var12 = var27;
      ByteArrayOutputStream var13 = new ByteArrayOutputStream();
      DataOutputStream var14 = new DataOutputStream(var13);
      long[] var15 = var12;
      int var16 = var12.length;
      int var17 = 0;

      while (true) {
         if (var17 < var16) {
            long var18 = var15[var17];

            label33: {
               try {
                  var14.writeLong(var18);
               } catch (IOException var22) {
                  var22.printStackTrace();
                  break label33;
               }

               if (var1 == null) {
                  break;
               }
            }

            var17++;
            if (var1 != null) {
               continue;
            }
         }

         try {
            var14.close();
         } catch (IOException var21) {
            var21.printStackTrace();
         }
         break;
      }

      byte[] var25 = var13.toByteArray();
      return DigestUtils.md5(var25);
   }

   public static String U(String param0) throws IOException, Exception {
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
      // 005: aload 1
      // 006: ifnull 01b
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/Qr2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/Qr2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 018: athrow
      // 019: ldc ""
      // 01b: astore 2
      // 01c: aload 0
      // 01d: aload 1
      // 01e: ifnull 103
      // 021: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 024: ldc2_w 330094358428833085
      // 027: astore 7
      // 029: ldc2_w 330094358428833085
      // 02c: aload 7
      // 02e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 031: checkcast java/lang/Boolean
      // 034: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 037: goto 03e
      // 03a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: ifne 102
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/Qr2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 047: athrow
      // 048: aload 0
      // 049: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 04c: ldc2_w 354142893546746586
      // 04f: astore 9
      // 051: ldc2_w 354142893546746586
      // 054: aload 9
      // 056: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 059: checkcast [B
      // 05c: goto 063
      // 05f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 062: athrow
      // 063: astore 3
      // 064: ldc2_w 413769783119953614
      // 067: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 06a: aconst_null
      // 06b: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 06e: newarray 8
      // 070: astore 4
      // 072: aload 3
      // 073: bipush 0
      // 074: ldc2_w 501813363038012860
      // 077: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 07a: aconst_null
      // 07b: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 07e: iadd
      // 07f: aload 4
      // 081: bipush 0
      // 082: aload 4
      // 084: arraylength
      // 085: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 088: aload 3
      // 089: arraylength
      // 08a: aload 4
      // 08c: arraylength
      // 08d: isub
      // 08e: ldc2_w 501813363038012860
      // 091: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 094: aconst_null
      // 095: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 098: isub
      // 099: newarray 8
      // 09b: astore 5
      // 09d: aload 3
      // 09e: aload 4
      // 0a0: arraylength
      // 0a1: ldc2_w 501813363038012860
      // 0a4: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0a7: aconst_null
      // 0a8: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0ab: iadd
      // 0ac: aload 5
      // 0ae: bipush 0
      // 0af: aload 5
      // 0b1: arraylength
      // 0b2: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0b5: aload 5
      // 0b7: aload 4
      // 0b9: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0bc: ldc2_w 486638881355118416
      // 0bf: astore 11
      // 0c1: ldc2_w 486638881355118416
      // 0c4: aload 11
      // 0c6: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c9: checkcast [B
      // 0cc: goto 0d3
      // 0cf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d2: athrow
      // 0d3: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d6: ldc2_w 540375259805653694
      // 0d9: astore 13
      // 0db: ldc2_w 540375259805653694
      // 0de: aload 13
      // 0e0: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e3: checkcast [B
      // 0e6: goto 0ed
      // 0e9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: astore 6
      // 0ef: new java/lang/String
      // 0f2: dup
      // 0f3: aload 6
      // 0f5: sipush 1966
      // 0f8: sipush 26212
      // 0fb: invokestatic com/finalshell/core/Qr2.a (II)Ljava/lang/String;
      // 0fe: invokespecial java/lang/String.<init> ([BLjava/lang/String;)V
      // 101: astore 2
      // 102: aload 2
      // 103: areturn
   }

   public static String C(String var0) throws Exception {
      Registry.packArgs(Registry.lookupField(501813363038012860L).getInt(null));
      long var6 = 553032560684353898L;
      Object var10001 = Ref.h2(553032560684353898L, var6);

      try {
         var10001 = (byte[])var10001;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      byte[] var1 = (byte[])var10001;
      Registry.packArgs(Registry.lookupField(413769783119953614L).getInt(null));
      long var8 = 553032560684353898L;
      Object var10002 = Ref.h2(553032560684353898L, var8);

      try {
         var10002 = (byte[])var10002;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      byte[] var2 = (byte[])var10002;
      Registry.packArgs(var0.getBytes(a(1967, 20353)), var2);
      long var10 = 552062844540288236L;
      Object var10003 = Ref.h2(552062844540288236L, var10);

      try {
         var10003 = (byte[])var10003;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      byte[] var3 = (byte[])var10003;
      byte[] var4 = new byte[var2.length + var3.length + Registry.lookupField(501813363038012860L).getInt(null)];
      System.arraycopy(var1, 0, var4, 0, Registry.lookupField(501813363038012860L).getInt(null));
      System.arraycopy(var2, 0, var4, 0 + Registry.lookupField(501813363038012860L).getInt(null), var2.length);
      System.arraycopy(var3, 0, var4, var2.length + Registry.lookupField(501813363038012860L).getInt(null), var3.length);
      Registry.packArgs(var4);
      long var12 = 480173285509129670L;
      String var10004 = (String)Ref.h2(480173285509129670L, var12);

      try {
         var10004 = var10004;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      return var10004;
   }

   static byte[] O(int var0) {
      byte[] var2 = new byte[var0];
      Ky4[] var10000 = YT3_2.c();
      int var3 = 0;
      Ky4[] var1 = var10000;

      while (true) {
         if (var3 < var0) {
      Random var4;
            var4 = var2;
            if (var1 == null) {
               break;
            }

            var2[var3] = (byte)(5 + (byte)new Random().nextInt(a(16209, 5406361780650968557L)));
            var3++;
            if (var1 != null) {
      Random var4;
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   void p(byte[] var1, long var2) {
      Random var4 = new Random();
      var4.nextLong();
   }

   void Q() {
   }

   public static byte[] x(byte[] var0, byte[] var1) throws Exception {
      short var10000 = 1965;
      SecureRandom var2 = new SecureRandom();
      DESKeySpec var10002;
      Object[] var10004 = Registry.packArgs(var1);
      long var7 = 486638881355118416L;
      Object var10005 = Ref.h2(486638881355118416L, var7);

      try {
         var10005 = (byte[])var10005;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var10004 = new javax.crypto.spec.DESKeySpec((byte[])var10005);
      DESKeySpec var3 = var10002;
      SecretKeyFactory var4 = SecretKeyFactory.getInstance(a(9664, (int)var10002));
      SecretKey var5 = var4.generateSecret(var3);
      Cipher var6 = Cipher.getInstance(a(1965, 9664));
      var6.init(1, var5, var2);
      return var6.doFinal(var0);
   }

   public static byte[] C(byte[] var0, byte[] var1) throws Exception {
      SecureRandom var2 = new SecureRandom();
      DESKeySpec var3 = new DESKeySpec(var1);
      SecretKeyFactory var4 = SecretKeyFactory.getInstance(a(1964, 11549));
      SecretKey var5 = var4.generateSecret(var3);
      Cipher var6 = Cipher.getInstance(a(1965, 9664));
      var6.init(2, var5, var2);
      return var6.doFinal(var0);
   }

   static {
      __vfClinit__();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 1965) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 234;
               break;
            case 1:
               var10000 = 255;
               break;
            case 2:
               var10000 = 223;
               break;
            case 3:
               var10000 = 120;
               break;
            case 4:
               var10000 = 200;
               break;
            case 5:
               var10000 = 11;
               break;
            case 6:
               var10000 = 35;
               break;
            case 7:
               var10000 = 5;
               break;
            case 8:
               var10000 = 29;
               break;
            case 9:
               var10000 = 225;
               break;
            case 10:
               var10000 = 207;
               break;
            case 11:
               var10000 = 2;
               break;
            case 12:
               var10000 = 176;
               break;
            case 13:
               var10000 = 3;
               break;
            case 14:
               var10000 = 148;
               break;
            case 15:
               var10000 = 245;
               break;
            case 16:
               var10000 = 43;
               break;
            case 17:
               var10000 = 1;
               break;
            case 18:
               var10000 = 21;
               break;
            case 19:
               var10000 = 204;
               break;
            case 20:
               var10000 = 231;
               break;
            case 21:
               var10000 = 241;
               break;
            case 22:
               var10000 = 203;
               break;
            case 23:
               var10000 = 143;
               break;
            case 24:
               var10000 = 85;
               break;
            case 25:
               var10000 = 250;
               break;
            case 26:
               var10000 = 125;
               break;
            case 27:
               var10000 = 198;
               break;
            case 28:
               var10000 = 228;
               break;
            case 29:
               var10000 = 98;
               break;
            case 30:
               var10000 = 126;
               break;
            case 31:
               var10000 = 227;
               break;
            case 32:
               var10000 = 94;
               break;
            case 33:
               var10000 = 19;
               break;
            case 34:
               var10000 = 114;
               break;
            case 35:
               var10000 = 197;
               break;
            case 36:
               var10000 = 243;
               break;
            case 37:
               var10000 = 91;
               break;
            case 38:
               var10000 = 49;
               break;
            case 39:
               var10000 = 9;
               break;
            case 40:
               var10000 = 178;
               break;
            case 41:
               var10000 = 118;
               break;
            case 42:
               var10000 = 187;
               break;
            case 43:
               var10000 = 235;
               break;
            case 44:
               var10000 = 100;
               break;
            case 45:
               var10000 = 238;
               break;
            case 46:
               var10000 = 27;
               break;
            case 47:
               var10000 = 72;
               break;
            case 48:
               var10000 = 139;
               break;
            case 49:
               var10000 = 131;
               break;
            case 50:
               var10000 = 66;
               break;
            case 51:
               var10000 = 18;
               break;
            case 52:
               var10000 = 152;
               break;
            case 53:
               var10000 = 218;
               break;
            case 54:
               var10000 = 144;
               break;
            case 55:
               var10000 = 226;
               break;
            case 56:
               var10000 = 229;
               break;
            case 57:
               var10000 = 167;
               break;
            case 58:
               var10000 = 52;
               break;
            case 59:
               var10000 = 107;
               break;
            case 60:
               var10000 = 33;
               break;
            case 61:
               var10000 = 166;
               break;
            case 62:
               var10000 = 163;
               break;
            case 63:
               var10000 = 69;
               break;
            case 64:
               var10000 = 147;
               break;
            case 65:
               var10000 = 132;
               break;
            case 66:
               var10000 = 206;
               break;
            case 67:
               var10000 = 65;
               break;
            case 68:
               var10000 = 80;
               break;
            case 69:
               var10000 = 97;
               break;
            case 70:
               var10000 = 31;
               break;
            case 71:
               var10000 = 23;
               break;
            case 72:
               var10000 = 138;
               break;
            case 73:
               var10000 = 233;
               break;
            case 74:
               var10000 = 46;
               break;
            case 75:
               var10000 = 155;
               break;
            case 76:
               var10000 = 190;
               break;
            case 77:
               var10000 = 20;
               break;
            case 78:
               var10000 = 84;
               break;
            case 79:
               var10000 = 141;
               break;
            case 80:
               var10000 = 34;
               break;
            case 81:
               var10000 = 121;
               break;
            case 82:
               var10000 = 22;
               break;
            case 83:
               var10000 = 7;
               break;
            case 84:
               var10000 = 164;
               break;
            case 85:
               var10000 = 81;
               break;
            case 86:
               var10000 = 145;
               break;
            case 87:
               var10000 = 159;
               break;
            case 88:
               var10000 = 32;
               break;
            case 89:
               var10000 = 37;
               break;
            case 90:
               var10000 = 45;
               break;
            case 91:
               var10000 = 117;
               break;
            case 92:
               var10000 = 220;
               break;
            case 93:
               var10000 = 111;
               break;
            case 94:
               var10000 = 79;
               break;
            case 95:
               var10000 = 53;
               break;
            case 96:
               var10000 = 109;
               break;
            case 97:
               var10000 = 216;
               break;
            case 98:
               var10000 = 156;
               break;
            case 99:
               var10000 = 135;
               break;
            case 100:
               var10000 = 151;
               break;
            case 101:
               var10000 = 73;
               break;
            case 102:
               var10000 = 67;
               break;
            case 103:
               var10000 = 222;
               break;
            case 104:
               var10000 = 57;
               break;
            case 105:
               var10000 = 189;
               break;
            case 106:
               var10000 = 254;
               break;
            case 107:
               var10000 = 134;
               break;
            case 108:
               var10000 = 99;
               break;
            case 109:
               var10000 = 205;
               break;
            case 110:
               var10000 = 253;
               break;
            case 111:
               var10000 = 87;
               break;
            case 112:
               var10000 = 215;
               break;
            case 113:
               var10000 = 110;
               break;
            case 114:
               var10000 = 202;
               break;
            case 115:
               var10000 = 232;
               break;
            case 116:
               var10000 = 137;
               break;
            case 117:
               var10000 = 54;
               break;
            case 118:
               var10000 = 160;
               break;
            case 119:
               var10000 = 230;
               break;
            case 120:
               var10000 = 56;
               break;
            case 121:
               var10000 = 185;
               break;
            case 122:
               var10000 = 224;
               break;
            case 123:
               var10000 = 188;
               break;
            case 124:
               var10000 = 92;
               break;
            case 125:
               var10000 = 251;
               break;
            case 126:
               var10000 = 50;
               break;
            case 127:
               var10000 = 30;
               break;
            case 128:
               var10000 = 196;
               break;
            case 129:
               var10000 = 104;
               break;
            case 130:
               var10000 = 60;
               break;
            case 131:
               var10000 = 165;
               break;
            case 132:
               var10000 = 123;
               break;
            case 133:
               var10000 = 150;
               break;
            case 134:
               var10000 = 199;
               break;
            case 135:
               var10000 = 217;
               break;
            case 136:
               var10000 = 44;
               break;
            case 137:
               var10000 = 0;
               break;
            case 138:
               var10000 = 142;
               break;
            case 139:
               var10000 = 58;
               break;
            case 140:
               var10000 = 77;
               break;
            case 141:
               var10000 = 248;
               break;
            case 142:
               var10000 = 74;
               break;
            case 143:
               var10000 = 106;
               break;
            case 144:
               var10000 = 157;
               break;
            case 145:
               var10000 = 182;
               break;
            case 146:
               var10000 = 181;
               break;
            case 147:
               var10000 = 68;
               break;
            case 148:
               var10000 = 48;
               break;
            case 149:
               var10000 = 6;
               break;
            case 150:
               var10000 = 179;
               break;
            case 151:
               var10000 = 17;
               break;
            case 152:
               var10000 = 129;
               break;
            case 153:
               var10000 = 171;
               break;
            case 154:
               var10000 = 14;
               break;
            case 155:
               var10000 = 214;
               break;
            case 156:
               var10000 = 136;
               break;
            case 157:
               var10000 = 242;
               break;
            case 158:
               var10000 = 13;
               break;
            case 159:
               var10000 = 39;
               break;
            case 160:
               var10000 = 237;
               break;
            case 161:
               var10000 = 15;
               break;
            case 162:
               var10000 = 174;
               break;
            case 163:
               var10000 = 219;
               break;
            case 164:
               var10000 = 38;
               break;
            case 165:
               var10000 = 252;
               break;
            case 166:
               var10000 = 96;
               break;
            case 167:
               var10000 = 59;
               break;
            case 168:
               var10000 = 102;
               break;
            case 169:
               var10000 = 36;
               break;
            case 170:
               var10000 = 195;
               break;
            case 171:
               var10000 = 4;
               break;
            case 172:
               var10000 = 192;
               break;
            case 173:
               var10000 = 62;
               break;
            case 174:
               var10000 = 25;
               break;
            case 175:
               var10000 = 16;
               break;
            case 176:
               var10000 = 193;
               break;
            case 177:
               var10000 = 93;
               break;
            case 178:
               var10000 = 10;
               break;
            case 179:
               var10000 = 168;
               break;
            case 180:
               var10000 = 186;
               break;
            case 181:
               var10000 = 184;
               break;
            case 182:
               var10000 = 194;
               break;
            case 183:
               var10000 = 210;
               break;
            case 184:
               var10000 = 246;
               break;
            case 185:
               var10000 = 180;
               break;
            case 186:
               var10000 = 169;
               break;
            case 187:
               var10000 = 64;
               break;
            case 188:
               var10000 = 153;
               break;
            case 189:
               var10000 = 191;
               break;
            case 190:
               var10000 = 212;
               break;
            case 191:
               var10000 = 209;
               break;
            case 192:
               var10000 = 26;
               break;
            case 193:
               var10000 = 122;
               break;
            case 194:
               var10000 = 175;
               break;
            case 195:
               var10000 = 41;
               break;
            case 196:
               var10000 = 236;
               break;
            case 197:
               var10000 = 208;
               break;
            case 198:
               var10000 = 239;
               break;
            case 199:
               var10000 = 47;
               break;
            case 200:
               var10000 = 113;
               break;
            case 201:
               var10000 = 183;
               break;
            case 202:
               var10000 = 95;
               break;
            case 203:
               var10000 = 162;
               break;
            case 204:
               var10000 = 128;
               break;
            case 205:
               var10000 = 130;
               break;
            case 206:
               var10000 = 89;
               break;
            case 207:
               var10000 = 146;
               break;
            case 208:
               var10000 = 127;
               break;
            case 209:
               var10000 = 221;
               break;
            case 210:
               var10000 = 170;
               break;
            case 211:
               var10000 = 140;
               break;
            case 212:
               var10000 = 108;
               break;
            case 213:
               var10000 = 161;
               break;
            case 214:
               var10000 = 103;
               break;
            case 215:
               var10000 = 86;
               break;
            case 216:
               var10000 = 24;
               break;
            case 217:
               var10000 = 244;
               break;
            case 218:
               var10000 = 83;
               break;
            case 219:
               var10000 = 61;
               break;
            case 220:
               var10000 = 82;
               break;
            case 221:
               var10000 = 154;
               break;
            case 222:
               var10000 = 124;
               break;
            case 223:
               var10000 = 201;
               break;
            case 224:
               var10000 = 90;
               break;
            case 225:
               var10000 = 133;
               break;
            case 226:
               var10000 = 71;
               break;
            case 227:
               var10000 = 116;
               break;
            case 228:
               var10000 = 70;
               break;
            case 229:
               var10000 = 115;
               break;
            case 230:
               var10000 = 63;
               break;
            case 231:
               var10000 = 149;
               break;
            case 232:
               var10000 = 28;
               break;
            case 233:
               var10000 = 75;
               break;
            case 234:
               var10000 = 40;
               break;
            case 235:
               var10000 = 247;
               break;
            case 236:
               var10000 = 177;
               break;
            case 237:
               var10000 = 51;
               break;
            case 238:
               var10000 = 78;
               break;
            case 239:
               var10000 = 211;
               break;
            case 240:
               var10000 = 158;
               break;
            case 241:
               var10000 = 12;
               break;
            case 242:
               var10000 = 88;
               break;
            case 243:
               var10000 = 172;
               break;
            case 244:
               var10000 = 249;
               break;
            case 245:
               var10000 = 101;
               break;
            case 246:
               var10000 = 213;
               break;
            case 247:
               var10000 = 119;
               break;
            case 248:
               var10000 = 8;
               break;
            case 249:
               var10000 = 112;
               break;
            case 250:
               var10000 = 42;
               break;
            case 251:
               var10000 = 173;
               break;
            case 252:
               var10000 = 76;
               break;
            case 253:
               var10000 = 55;
               break;
            case 254:
               var10000 = 105;
               break;
            default:
               var10000 = 240;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15038;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "\u0012¼\u0018\u0003\u0013Ö8";
      int var12 = "\u0012¼\u0018\u0003\u0013Ö8".length();
      char var9 = 3;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 54;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
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
                        var65 = 27;
                        break;
                     case 1:
                        var65 = 47;
                        break;
                     case 2:
                        var65 = 86;
                        break;
                     case 3:
                        var65 = 13;
                        break;
                     case 4:
                        var65 = 115;
                        break;
                     case 5:
                        var65 = 104;
                        break;
                     default:
                        var65 = 86;
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
                     a = var13;
                     c = new String[4];
                     long var0 = 2719428079263445679L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = ";f¹nmo\u0005\u000f\u008c9 Ò\u0083\u0015\u001b`â\u0013ð,&Kw)ÔU\u0096À25Ê\u008cÿ\u0003ßíJ\u0088Z»\u008f\u0080§Ð\u0018Ê|§";
                     int var5 = ";f¹nmo\u0005\u000f\u008c9 Ò\u0083\u0015\u001b`â\u0013ð,&Kw)ÔU\u0096À25Ê\u008cÿ\u0003ßíJ\u0088Z»\u008f\u0080§Ð\u0018Ê|§"
                        .length();
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
                                    d = var6;
                                    e = new Integer[8];
                                    Registry.lookupField(413769783119953614L).setInt(null, a(13484, 6021875269637377559L));
                                    Registry.lookupField(501813363038012860L).setInt(null, a(13259, 5103772786823924083L));
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "h[\u0001á\u0014J{Íb^\u00184¥»ç\u0000";
                                 var5 = "h[\u0001á\u0014J{Íb^\u00184¥»ç\u0000".length();
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

                  var10 = "h\u0093T\u009cp\u0005£\u0090-ü_";
                  var12 = "h\u0093T\u009cp\u0005£\u0090-ü_".length();
                  var9 = 5;
                  var17 = -1;
            }

            var10000 = 55;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}






