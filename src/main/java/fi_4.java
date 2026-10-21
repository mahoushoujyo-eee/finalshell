import java.io.IOException;
import java.net.Socket;

public final class fi_4 {
   private static com.ky_4[] s;
   private static final String[] a;
   private static final String[] b;
   private static final long c;

   public static Socket I(String param0, int param1, String param2, int param3, String param4, String param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic fi_4.P ()[Lcom/ky_4;
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
      // 01d: invokestatic fi_4.a (II)Ljava/lang/String;
      // 020: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 023: aload 0
      // 024: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 027: ldc ":"
      // 029: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02c: iload 1
      // 02d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 030: sipush 3154
      // 033: sipush 15212
      // 036: invokestatic fi_4.a (II)Ljava/lang/String;
      // 039: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 03f: astore 8
      // 041: aload 4
      // 043: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 046: ldc2_w 330094358428833085
      // 049: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 04c: swap
      // 04d: aconst_null
      // 04e: swap
      // 04f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 052: checkcast java/lang/Boolean
      // 055: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 058: goto 05f
      // 05b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05e: athrow
      // 05f: aload 6
      // 061: ifnull 09f
      // 064: ifne 120
      // 067: goto 06e
      // 06a: invokestatic fi_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: aload 5
      // 070: aload 6
      // 072: ifnull 0c3
      // 075: goto 07c
      // 078: invokestatic fi_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 07f: ldc2_w 330094358428833085
      // 082: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 085: swap
      // 086: aconst_null
      // 087: swap
      // 088: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 08b: checkcast java/lang/Boolean
      // 08e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 091: goto 098
      // 094: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 097: athrow
      // 098: goto 09f
      // 09b: invokestatic fi_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: ifne 120
      // 0a2: sipush 3159
      // 0a5: sipush 24796
      // 0a8: invokestatic fi_4.a (II)Ljava/lang/String;
      // 0ab: bipush 2
      // 0ac: anewarray 4
      // 0af: dup
      // 0b0: bipush 0
      // 0b1: aload 4
      // 0b3: aastore
      // 0b4: dup
      // 0b5: bipush 1
      // 0b6: aload 5
      // 0b8: aastore
      // 0b9: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0bc: goto 0c3
      // 0bf: invokestatic fi_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: astore 9
      // 0c5: aload 9
      // 0c7: invokevirtual java/lang/String.getBytes ()[B
      // 0ca: invokestatic ay_2.t ([B)Ljava/lang/String;
      // 0cd: astore 10
      // 0cf: aload 10
      // 0d1: sipush 3161
      // 0d4: sipush 31418
      // 0d7: invokestatic fi_4.a (II)Ljava/lang/String;
      // 0da: ldc ""
      // 0dc: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0df: astore 10
      // 0e1: new java/lang/StringBuilder
      // 0e4: dup
      // 0e5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e8: aload 8
      // 0ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ed: sipush 3152
      // 0f0: sipush -11581
      // 0f3: invokestatic fi_4.a (II)Ljava/lang/String;
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f9: aload 10
      // 0fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fe: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 101: astore 8
      // 103: new java/lang/StringBuilder
      // 106: dup
      // 107: invokespecial java/lang/StringBuilder.<init> ()V
      // 10a: aload 8
      // 10c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10f: sipush 3158
      // 112: sipush 18093
      // 115: invokestatic fi_4.a (II)Ljava/lang/String;
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11e: astore 8
      // 120: goto 12a
      // 123: astore 9
      // 125: aload 9
      // 127: invokevirtual java/lang/Exception.printStackTrace ()V
      // 12a: new java/lang/StringBuilder
      // 12d: dup
      // 12e: invokespecial java/lang/StringBuilder.<init> ()V
      // 131: aload 8
      // 133: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 136: sipush 3153
      // 139: sipush -16574
      // 13c: invokestatic fi_4.a (II)Ljava/lang/String;
      // 13f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 142: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 145: astore 8
      // 147: aload 7
      // 149: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 14c: aload 8
      // 14e: invokevirtual java/lang/String.getBytes ()[B
      // 151: invokevirtual java/io/OutputStream.write ([B)V
      // 154: getstatic fi_4.c J
      // 157: l2i
      // 158: newarray 8
      // 15a: astore 9
      // 15c: aload 7
      // 15e: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 161: astore 10
      // 163: aload 10
      // 165: aload 9
      // 167: bipush 0
      // 168: aload 9
      // 16a: arraylength
      // 16b: invokevirtual java/io/InputStream.read ([BII)I
      // 16e: istore 11
      // 170: iload 11
      // 172: ifgt 18a
      // 175: new java/net/SocketException
      // 178: dup
      // 179: sipush 3155
      // 17c: sipush 31509
      // 17f: invokestatic fi_4.a (II)Ljava/lang/String;
      // 182: invokespecial java/net/SocketException.<init> (Ljava/lang/String;)V
      // 185: athrow
      // 186: invokestatic fi_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 189: athrow
      // 18a: new java/lang/String
      // 18d: dup
      // 18e: aload 9
      // 190: bipush 0
      // 191: iload 11
      // 193: sipush 3162
      // 196: sipush -18821
      // 199: invokestatic fi_4.a (II)Ljava/lang/String;
      // 19c: invokespecial java/lang/String.<init> ([BIILjava/lang/String;)V
      // 19f: astore 12
      // 1a1: aload 12
      // 1a3: sipush 3157
      // 1a6: sipush 28853
      // 1a9: invokestatic fi_4.a (II)Ljava/lang/String;
      // 1ac: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 1af: aload 6
      // 1b1: ifnull 1d7
      // 1b4: bipush -1
      // 1b5: if_icmpeq 1fc
      // 1b8: goto 1bf
      // 1bb: invokestatic fi_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1be: athrow
      // 1bf: aload 10
      // 1c1: aload 6
      // 1c3: ifnull 1dc
      // 1c6: goto 1cd
      // 1c9: invokestatic fi_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cc: athrow
      // 1cd: invokevirtual java/io/InputStream.available ()I
      // 1d0: goto 1d7
      // 1d3: invokestatic fi_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d6: athrow
      // 1d7: ifle 1e6
      // 1da: aload 10
      // 1dc: aload 10
      // 1de: invokevirtual java/io/InputStream.available ()I
      // 1e1: i2l
      // 1e2: invokevirtual java/io/InputStream.skip (J)J
      // 1e5: pop2
      // 1e6: aload 7
      // 1e8: aload 6
      // 1ea: ifnonnull 1fb
      // 1ed: bipush 3
      // 1ee: anewarray 77
      // 1f1: invokestatic com/ky_4.K ([Ljava/lang/String;)V
      // 1f4: goto 1fb
      // 1f7: invokestatic fi_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fa: athrow
      // 1fb: areturn
      // 1fc: new ti_4
      // 1ff: dup
      // 200: sipush 3163
      // 203: sipush 19653
      // 206: invokestatic fi_4.a (II)Ljava/lang/String;
      // 209: aload 12
      // 20b: invokespecial ti_4.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 20e: athrow
   }

   public static void N(com.ky_4[] var0) {
      s = var0;
   }

   public static com.ky_4[] P() {
      return s;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var7 = new String[11];
      com.ky_4[] var10000 = new com.ky_4[2];
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

   private static String a(int var0, int var1) {
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
}





