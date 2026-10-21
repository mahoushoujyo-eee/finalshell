package com;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;

class eX_3 extends ObjectInputStream {
   static Field[] j;
   static volatile boolean R;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   static void w() {
      String var0 = Hi_2.C();

      try {
         if (j != null || R) {
            return;
         }
      } catch (Throwable var8) {
         throw a(var8);
      }

      try {
         Field[] var1 = ObjectInputStream.class.getDeclaredFields();
         String[] var2 = new String[]{a(28713, 17662), a(28715, -7087), a(28714, -25445), a(28712, -981)};
         Field[] var3 = new Field[var2.length];
         int var4 = 0;

         while (var4 < var2.length) {
            Field var5 = com.B8.X(ObjectInputStream.class, var2[var4], var1);

            try {
               var5.setAccessible(true);
               var3[var4] = var5;
               var4++;
               if (var0 != null) {
                  return;
               }

               if (var0 != null) {
                  break;
               }
            } catch (Throwable var6) {
               throw a(var6);
            }
         }

         j = var3;
      } catch (Throwable var7) {
         R = true;
      }
   }

   public eX_3(ObjectInputStream var1) throws IOException {
      String var10000 = Hi_2.C();
      super(var1);
      String var2 = var10000;

      try {
         int var3 = 0;

         while (var3 < j.length) {
            Field var4 = j[var3];
            Object var5 = var4.get(var1);

            try {
               var4.set(this, var5);
               var3++;
               if (var2 != null || var2 != null) {
                  break;
               }
            } catch (IllegalAccessException var6) {
               throw a(var6);
            }
         }
      } catch (IllegalAccessException var7) {
         R = true;
      }
   }

   @Override
   protected Class resolveClass(ObjectStreamClass param1) throws IOException, ClassNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: aload 1
      // 04: invokevirtual java/io/ObjectStreamClass.getName ()Ljava/lang/String;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 3
      // 0a: invokevirtual java/lang/String.length ()I
      // 0d: aload 2
      // 0e: ifnonnull 30
      // 11: bipush 2
      // 12: if_icmple de
      // 15: goto 1c
      // 18: invokestatic com/eX_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 3
      // 1d: sipush 30858
      // 20: ldc2_w 8314877708782352783
      // 23: invokestatic com/eX_3.a (IJ)I
      // 26: invokevirtual java/lang/String.lastIndexOf (I)I
      // 29: goto 30
      // 2c: invokestatic com/eX_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: istore 4
      // 32: iload 4
      // 34: bipush -1
      // 35: aload 2
      // 36: ifnonnull 5c
      // 39: if_icmpeq 4c
      // 3c: goto 43
      // 3f: invokestatic com/eX_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 3
      // 44: iload 4
      // 46: bipush 1
      // 47: iadd
      // 48: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 4b: astore 3
      // 4c: aload 3
      // 4d: aload 2
      // 4e: ifnonnull b7
      // 51: invokevirtual java/lang/String.length ()I
      // 54: bipush 2
      // 55: goto 5c
      // 58: invokestatic com/eX_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: if_icmple b6
      // 5f: aload 3
      // 60: aload 2
      // 61: ifnonnull b7
      // 64: goto 6b
      // 67: invokestatic com/eX_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: bipush 0
      // 6c: invokevirtual java/lang/String.charAt (I)C
      // 6f: sipush 9788
      // 72: ldc2_w 8693702727048357688
      // 75: invokestatic com/eX_3.a (IJ)I
      // 78: if_icmpne b6
      // 7b: goto 82
      // 7e: invokestatic com/eX_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: aload 3
      // 83: aload 2
      // 84: ifnonnull b7
      // 87: goto 8e
      // 8a: invokestatic com/eX_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: aload 3
      // 8f: invokevirtual java/lang/String.length ()I
      // 92: bipush 1
      // 93: isub
      // 94: invokevirtual java/lang/String.charAt (I)C
      // 97: sipush 14875
      // 9a: ldc2_w 8696891554618571549
      // 9d: invokestatic com/eX_3.a (IJ)I
      // a0: if_icmpne b6
      // a3: goto aa
      // a6: invokestatic com/eX_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a9: athrow
      // aa: aload 3
      // ab: bipush 1
      // ac: aload 3
      // ad: invokevirtual java/lang/String.length ()I
      // b0: bipush 1
      // b1: isub
      // b2: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // b5: astore 3
      // b6: aload 3
      // b7: invokestatic com/B8.A (Ljava/lang/String;)Ljava/lang/Class;
      // ba: aload 2
      // bb: ifnonnull e3
      // be: ifnonnull de
      // c1: goto c8
      // c4: invokestatic com/eX_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c7: athrow
      // c8: getstatic com/IG.D Lcom/IG;
      // cb: aload 3
      // cc: aconst_null
      // cd: getstatic com/Ks_2.SupportAutoType Lcom/Ks_2;
      // d0: getfield com/Ks_2.mask I
      // d3: invokevirtual com/IG.P (Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Class;
      // d6: pop
      // d7: goto de
      // da: invokestatic com/eX_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // dd: athrow
      // de: aload 0
      // df: aload 1
      // e0: invokespecial java/io/ObjectInputStream.resolveClass (Ljava/io/ObjectStreamClass;)Ljava/lang/Class;
      // e3: areturn
   }

   @Override
   protected Class resolveProxyClass(String[] param1) throws IOException, ClassNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: astore 3
      // 02: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 05: aload 3
      // 06: arraylength
      // 07: istore 4
      // 09: astore 2
      // 0a: bipush 0
      // 0b: istore 5
      // 0d: iload 5
      // 0f: iload 4
      // 11: if_icmpge 50
      // 14: aload 3
      // 15: iload 5
      // 17: aaload
      // 18: astore 6
      // 1a: aload 2
      // 1b: ifnonnull 4c
      // 1e: aload 6
      // 20: invokestatic com/B8.A (Ljava/lang/String;)Ljava/lang/Class;
      // 23: aload 2
      // 24: ifnonnull 55
      // 27: goto 2e
      // 2a: invokestatic com/eX_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: ifnonnull 49
      // 31: goto 38
      // 34: invokestatic com/eX_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: getstatic com/IG.D Lcom/IG;
      // 3b: aload 6
      // 3d: aconst_null
      // 3e: invokevirtual com/IG.Z (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;
      // 41: pop
      // 42: goto 49
      // 45: invokestatic com/eX_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: iinc 5 1
      // 4c: aload 2
      // 4d: ifnull 0d
      // 50: aload 0
      // 51: aload 1
      // 52: invokespecial java/io/ObjectInputStream.resolveProxyClass ([Ljava/lang/String;)Ljava/lang/Class;
      // 55: areturn
   }

   @Override
   protected void readStreamHeader() throws IOException, StreamCorruptedException {
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = ">\u0087*ò\u007f/\\ä6ñ\u0007\u00050K\u0013Éâ7";
      int var12 = ">\u0087*ò\u007f/\\ä6ñ\u0007\u00050K\u0013Éâ7".length();
      char var9 = '\n';
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 84;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
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
                     break label56;
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
                        var58 = 17;
                        break;
                     case 1:
                        var58 = 44;
                        break;
                     case 2:
                        var58 = 28;
                        break;
                     case 3:
                        var58 = 103;
                        break;
                     case 4:
                        var58 = 50;
                        break;
                     case 5:
                        var58 = 63;
                        break;
                     default:
                        var58 = 4;
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
                     long var0 = 3722794724862762721L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "\u0003Íö\nW«y\u00951Ü\u0005®-í§5#ü\u0089\u008b\u0088\u0006åÇ";
                     int var5 = "\u0003Íö\nW«y\u00951Ü\u0005®-í§5#ü\u0089\u008b\u0088\u0006åÇ".length();
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
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "µIm\nû\u0001\u0099ÿtÌ\u009f\fx§";
                  var12 = "µIm\nû\u0001\u0099ÿtÌ\u009f\fx§".length();
                  var9 = 3;
                  var16 = -1;
            }

            var10000 = 5;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 28715) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 33;
               break;
            case 1:
               var10000 = 237;
               break;
            case 2:
               var10000 = 137;
               break;
            case 3:
               var10000 = 35;
               break;
            case 4:
               var10000 = 230;
               break;
            case 5:
               var10000 = 183;
               break;
            case 6:
               var10000 = 99;
               break;
            case 7:
               var10000 = 196;
               break;
            case 8:
               var10000 = 31;
               break;
            case 9:
               var10000 = 12;
               break;
            case 10:
               var10000 = 72;
               break;
            case 11:
               var10000 = 207;
               break;
            case 12:
               var10000 = 87;
               break;
            case 13:
               var10000 = 63;
               break;
            case 14:
               var10000 = 57;
               break;
            case 15:
               var10000 = 119;
               break;
            case 16:
               var10000 = 89;
               break;
            case 17:
               var10000 = 112;
               break;
            case 18:
               var10000 = 66;
               break;
            case 19:
               var10000 = 163;
               break;
            case 20:
               var10000 = 142;
               break;
            case 21:
               var10000 = 102;
               break;
            case 22:
               var10000 = 202;
               break;
            case 23:
               var10000 = 217;
               break;
            case 24:
               var10000 = 135;
               break;
            case 25:
               var10000 = 90;
               break;
            case 26:
               var10000 = 37;
               break;
            case 27:
               var10000 = 167;
               break;
            case 28:
               var10000 = 223;
               break;
            case 29:
               var10000 = 75;
               break;
            case 30:
               var10000 = 252;
               break;
            case 31:
               var10000 = 250;
               break;
            case 32:
               var10000 = 248;
               break;
            case 33:
               var10000 = 220;
               break;
            case 34:
               var10000 = 255;
               break;
            case 35:
               var10000 = 78;
               break;
            case 36:
               var10000 = 198;
               break;
            case 37:
               var10000 = 101;
               break;
            case 38:
               var10000 = 134;
               break;
            case 39:
               var10000 = 233;
               break;
            case 40:
               var10000 = 114;
               break;
            case 41:
               var10000 = 180;
               break;
            case 42:
               var10000 = 190;
               break;
            case 43:
               var10000 = 98;
               break;
            case 44:
               var10000 = 104;
               break;
            case 45:
               var10000 = 213;
               break;
            case 46:
               var10000 = 2;
               break;
            case 47:
               var10000 = 238;
               break;
            case 48:
               var10000 = 95;
               break;
            case 49:
               var10000 = 191;
               break;
            case 50:
               var10000 = 86;
               break;
            case 51:
               var10000 = 120;
               break;
            case 52:
               var10000 = 219;
               break;
            case 53:
               var10000 = 184;
               break;
            case 54:
               var10000 = 110;
               break;
            case 55:
               var10000 = 133;
               break;
            case 56:
               var10000 = 36;
               break;
            case 57:
               var10000 = 126;
               break;
            case 58:
               var10000 = 144;
               break;
            case 59:
               var10000 = 122;
               break;
            case 60:
               var10000 = 240;
               break;
            case 61:
               var10000 = 47;
               break;
            case 62:
               var10000 = 177;
               break;
            case 63:
               var10000 = 152;
               break;
            case 64:
               var10000 = 115;
               break;
            case 65:
               var10000 = 53;
               break;
            case 66:
               var10000 = 212;
               break;
            case 67:
               var10000 = 229;
               break;
            case 68:
               var10000 = 127;
               break;
            case 69:
               var10000 = 162;
               break;
            case 70:
               var10000 = 166;
               break;
            case 71:
               var10000 = 224;
               break;
            case 72:
               var10000 = 26;
               break;
            case 73:
               var10000 = 62;
               break;
            case 74:
               var10000 = 138;
               break;
            case 75:
               var10000 = 20;
               break;
            case 76:
               var10000 = 156;
               break;
            case 77:
               var10000 = 109;
               break;
            case 78:
               var10000 = 169;
               break;
            case 79:
               var10000 = 91;
               break;
            case 80:
               var10000 = 61;
               break;
            case 81:
               var10000 = 56;
               break;
            case 82:
               var10000 = 228;
               break;
            case 83:
               var10000 = 170;
               break;
            case 84:
               var10000 = 13;
               break;
            case 85:
               var10000 = 27;
               break;
            case 86:
               var10000 = 172;
               break;
            case 87:
               var10000 = 236;
               break;
            case 88:
               var10000 = 147;
               break;
            case 89:
               var10000 = 100;
               break;
            case 90:
               var10000 = 17;
               break;
            case 91:
               var10000 = 19;
               break;
            case 92:
               var10000 = 188;
               break;
            case 93:
               var10000 = 242;
               break;
            case 94:
               var10000 = 24;
               break;
            case 95:
               var10000 = 108;
               break;
            case 96:
               var10000 = 200;
               break;
            case 97:
               var10000 = 49;
               break;
            case 98:
               var10000 = 96;
               break;
            case 99:
               var10000 = 193;
               break;
            case 100:
               var10000 = 201;
               break;
            case 101:
               var10000 = 0;
               break;
            case 102:
               var10000 = 18;
               break;
            case 103:
               var10000 = 140;
               break;
            case 104:
               var10000 = 231;
               break;
            case 105:
               var10000 = 215;
               break;
            case 106:
               var10000 = 5;
               break;
            case 107:
               var10000 = 51;
               break;
            case 108:
               var10000 = 84;
               break;
            case 109:
               var10000 = 60;
               break;
            case 110:
               var10000 = 194;
               break;
            case 111:
               var10000 = 39;
               break;
            case 112:
               var10000 = 239;
               break;
            case 113:
               var10000 = 174;
               break;
            case 114:
               var10000 = 176;
               break;
            case 115:
               var10000 = 247;
               break;
            case 116:
               var10000 = 44;
               break;
            case 117:
               var10000 = 254;
               break;
            case 118:
               var10000 = 192;
               break;
            case 119:
               var10000 = 128;
               break;
            case 120:
               var10000 = 253;
               break;
            case 121:
               var10000 = 32;
               break;
            case 122:
               var10000 = 22;
               break;
            case 123:
               var10000 = 70;
               break;
            case 124:
               var10000 = 227;
               break;
            case 125:
               var10000 = 216;
               break;
            case 126:
               var10000 = 111;
               break;
            case 127:
               var10000 = 58;
               break;
            case 128:
               var10000 = 221;
               break;
            case 129:
               var10000 = 226;
               break;
            case 130:
               var10000 = 28;
               break;
            case 131:
               var10000 = 48;
               break;
            case 132:
               var10000 = 181;
               break;
            case 133:
               var10000 = 139;
               break;
            case 134:
               var10000 = 125;
               break;
            case 135:
               var10000 = 173;
               break;
            case 136:
               var10000 = 161;
               break;
            case 137:
               var10000 = 136;
               break;
            case 138:
               var10000 = 106;
               break;
            case 139:
               var10000 = 34;
               break;
            case 140:
               var10000 = 214;
               break;
            case 141:
               var10000 = 146;
               break;
            case 142:
               var10000 = 16;
               break;
            case 143:
               var10000 = 251;
               break;
            case 144:
               var10000 = 65;
               break;
            case 145:
               var10000 = 7;
               break;
            case 146:
               var10000 = 92;
               break;
            case 147:
               var10000 = 187;
               break;
            case 148:
               var10000 = 209;
               break;
            case 149:
               var10000 = 151;
               break;
            case 150:
               var10000 = 218;
               break;
            case 151:
               var10000 = 175;
               break;
            case 152:
               var10000 = 77;
               break;
            case 153:
               var10000 = 154;
               break;
            case 154:
               var10000 = 15;
               break;
            case 155:
               var10000 = 222;
               break;
            case 156:
               var10000 = 85;
               break;
            case 157:
               var10000 = 245;
               break;
            case 158:
               var10000 = 153;
               break;
            case 159:
               var10000 = 143;
               break;
            case 160:
               var10000 = 235;
               break;
            case 161:
               var10000 = 59;
               break;
            case 162:
               var10000 = 158;
               break;
            case 163:
               var10000 = 43;
               break;
            case 164:
               var10000 = 29;
               break;
            case 165:
               var10000 = 97;
               break;
            case 166:
               var10000 = 117;
               break;
            case 167:
               var10000 = 41;
               break;
            case 168:
               var10000 = 4;
               break;
            case 169:
               var10000 = 42;
               break;
            case 170:
               var10000 = 171;
               break;
            case 171:
               var10000 = 130;
               break;
            case 172:
               var10000 = 124;
               break;
            case 173:
               var10000 = 164;
               break;
            case 174:
               var10000 = 121;
               break;
            case 175:
               var10000 = 155;
               break;
            case 176:
               var10000 = 206;
               break;
            case 177:
               var10000 = 74;
               break;
            case 178:
               var10000 = 179;
               break;
            case 179:
               var10000 = 107;
               break;
            case 180:
               var10000 = 50;
               break;
            case 181:
               var10000 = 182;
               break;
            case 182:
               var10000 = 189;
               break;
            case 183:
               var10000 = 148;
               break;
            case 184:
               var10000 = 234;
               break;
            case 185:
               var10000 = 21;
               break;
            case 186:
               var10000 = 83;
               break;
            case 187:
               var10000 = 204;
               break;
            case 188:
               var10000 = 25;
               break;
            case 189:
               var10000 = 129;
               break;
            case 190:
               var10000 = 38;
               break;
            case 191:
               var10000 = 210;
               break;
            case 192:
               var10000 = 165;
               break;
            case 193:
               var10000 = 105;
               break;
            case 194:
               var10000 = 141;
               break;
            case 195:
               var10000 = 249;
               break;
            case 196:
               var10000 = 243;
               break;
            case 197:
               var10000 = 241;
               break;
            case 198:
               var10000 = 203;
               break;
            case 199:
               var10000 = 54;
               break;
            case 200:
               var10000 = 82;
               break;
            case 201:
               var10000 = 113;
               break;
            case 202:
               var10000 = 123;
               break;
            case 203:
               var10000 = 30;
               break;
            case 204:
               var10000 = 69;
               break;
            case 205:
               var10000 = 40;
               break;
            case 206:
               var10000 = 6;
               break;
            case 207:
               var10000 = 103;
               break;
            case 208:
               var10000 = 23;
               break;
            case 209:
               var10000 = 186;
               break;
            case 210:
               var10000 = 178;
               break;
            case 211:
               var10000 = 160;
               break;
            case 212:
               var10000 = 88;
               break;
            case 213:
               var10000 = 73;
               break;
            case 214:
               var10000 = 199;
               break;
            case 215:
               var10000 = 79;
               break;
            case 216:
               var10000 = 118;
               break;
            case 217:
               var10000 = 9;
               break;
            case 218:
               var10000 = 145;
               break;
            case 219:
               var10000 = 205;
               break;
            case 220:
               var10000 = 46;
               break;
            case 221:
               var10000 = 80;
               break;
            case 222:
               var10000 = 150;
               break;
            case 223:
               var10000 = 67;
               break;
            case 224:
               var10000 = 76;
               break;
            case 225:
               var10000 = 94;
               break;
            case 226:
               var10000 = 225;
               break;
            case 227:
               var10000 = 244;
               break;
            case 228:
               var10000 = 3;
               break;
            case 229:
               var10000 = 52;
               break;
            case 230:
               var10000 = 168;
               break;
            case 231:
               var10000 = 8;
               break;
            case 232:
               var10000 = 195;
               break;
            case 233:
               var10000 = 208;
               break;
            case 234:
               var10000 = 116;
               break;
            case 235:
               var10000 = 185;
               break;
            case 236:
               var10000 = 157;
               break;
            case 237:
               var10000 = 81;
               break;
            case 238:
               var10000 = 64;
               break;
            case 239:
               var10000 = 159;
               break;
            case 240:
               var10000 = 11;
               break;
            case 241:
               var10000 = 131;
               break;
            case 242:
               var10000 = 45;
               break;
            case 243:
               var10000 = 1;
               break;
            case 244:
               var10000 = 132;
               break;
            case 245:
               var10000 = 14;
               break;
            case 246:
               var10000 = 197;
               break;
            case 247:
               var10000 = 93;
               break;
            case 248:
               var10000 = 55;
               break;
            case 249:
               var10000 = 71;
               break;
            case 250:
               var10000 = 10;
               break;
            case 251:
               var10000 = 149;
               break;
            case 252:
               var10000 = 211;
               break;
            case 253:
               var10000 = 232;
               break;
            case 254:
               var10000 = 246;
               break;
            default:
               var10000 = 68;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16644;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





