package com;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public class QM implements com.ak_2, X4 {
   public static final com.QM f;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   @Override
   public void u(nL_3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/nv_4.o ()Ljava/lang/String;
      // 003: aload 1
      // 004: getfield com/nL_3.w Lcom/yM_3;
      // 007: astore 7
      // 009: astore 6
      // 00b: aload 6
      // 00d: ifnull 02a
      // 010: aload 2
      // 011: ifnonnull 02b
      // 014: goto 01b
      // 017: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 01a: athrow
      // 01b: aload 7
      // 01d: getstatic com/EP.WriteNullListAsEmpty Lcom/EP;
      // 020: invokevirtual com/yM_3.x (Lcom/EP;)V
      // 023: goto 02a
      // 026: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 029: athrow
      // 02a: return
      // 02b: aconst_null
      // 02c: astore 8
      // 02e: aload 7
      // 030: getstatic com/EP.WriteClassName Lcom/EP;
      // 033: invokevirtual com/yM_3.I (Lcom/EP;)Z
      // 036: aload 6
      // 038: ifnull 054
      // 03b: ifne 057
      // 03e: goto 045
      // 041: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 044: athrow
      // 045: iload 5
      // 047: getstatic com/EP.WriteClassName Lcom/EP;
      // 04a: invokestatic com/EP.e (ILcom/EP;)Z
      // 04d: goto 054
      // 050: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 053: athrow
      // 054: ifeq 05e
      // 057: aload 4
      // 059: invokestatic com/B8.r (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
      // 05c: astore 8
      // 05e: aload 2
      // 05f: checkcast java/util/Collection
      // 062: astore 9
      // 064: aload 1
      // 065: getfield com/nL_3.W Lcom/uh_2;
      // 068: astore 10
      // 06a: aload 1
      // 06b: aload 10
      // 06d: aload 2
      // 06e: aload 3
      // 06f: bipush 0
      // 070: invokevirtual com/nL_3.N (Lcom/uh_2;Ljava/lang/Object;Ljava/lang/Object;I)V
      // 073: aload 7
      // 075: getstatic com/EP.WriteClassName Lcom/EP;
      // 078: invokevirtual com/yM_3.I (Lcom/EP;)Z
      // 07b: aload 6
      // 07d: ifnull 0ed
      // 080: ifeq 0ec
      // 083: goto 08a
      // 086: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 089: athrow
      // 08a: ldc java/util/HashSet
      // 08c: aload 9
      // 08e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 091: aload 6
      // 093: ifnull 0d3
      // 096: goto 09d
      // 099: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 09c: athrow
      // 09d: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 0a0: ifeq 0c5
      // 0a3: goto 0aa
      // 0a6: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0a9: athrow
      // 0aa: aload 7
      // 0ac: sipush -21473
      // 0af: sipush 11637
      // 0b2: invokestatic com/QM.a (II)Ljava/lang/String;
      // 0b5: invokevirtual com/yM_3.q (Ljava/lang/CharSequence;)Lcom/yM_3;
      // 0b8: pop
      // 0b9: aload 6
      // 0bb: ifnonnull 0ec
      // 0be: goto 0c5
      // 0c1: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0c4: athrow
      // 0c5: ldc java/util/TreeSet
      // 0c7: aload 9
      // 0c9: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0cc: goto 0d3
      // 0cf: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0d2: athrow
      // 0d3: if_acmpne 0ec
      // 0d6: aload 7
      // 0d8: sipush -21474
      // 0db: sipush 29641
      // 0de: invokestatic com/QM.a (II)Ljava/lang/String;
      // 0e1: invokevirtual com/yM_3.q (Ljava/lang/CharSequence;)Lcom/yM_3;
      // 0e4: pop
      // 0e5: goto 0ec
      // 0e8: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0eb: athrow
      // 0ec: bipush 0
      // 0ed: istore 11
      // 0ef: aload 7
      // 0f1: sipush 8491
      // 0f4: ldc2_w 7662110432714683560
      // 0f7: invokestatic com/QM.a (IJ)I
      // 0fa: invokevirtual com/yM_3.T (C)Lcom/yM_3;
      // 0fd: pop
      // 0fe: aload 9
      // 100: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 105: astore 12
      // 107: aload 12
      // 109: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 10e: ifeq 258
      // 111: aload 12
      // 113: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 118: astore 13
      // 11a: aload 6
      // 11c: ifnull 26d
      // 11f: iload 11
      // 121: iinc 11 1
      // 124: ifeq 144
      // 127: goto 12e
      // 12a: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 12d: athrow
      // 12e: aload 7
      // 130: sipush 8835
      // 133: ldc2_w 94288060220405506
      // 136: invokestatic com/QM.a (IJ)I
      // 139: invokevirtual com/yM_3.T (C)Lcom/yM_3;
      // 13c: pop
      // 13d: goto 144
      // 140: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 143: athrow
      // 144: aload 13
      // 146: aload 6
      // 148: ifnull 168
      // 14b: ifnonnull 166
      // 14e: goto 155
      // 151: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 154: athrow
      // 155: aload 7
      // 157: invokevirtual com/yM_3.Y ()V
      // 15a: aload 6
      // 15c: ifnonnull 107
      // 15f: goto 166
      // 162: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 165: athrow
      // 166: aload 13
      // 168: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 16b: astore 14
      // 16d: aload 14
      // 16f: ldc java/lang/Integer
      // 171: aload 6
      // 173: ifnull 19d
      // 176: if_acmpne 199
      // 179: goto 180
      // 17c: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 17f: athrow
      // 180: aload 7
      // 182: aload 13
      // 184: checkcast java/lang/Integer
      // 187: invokevirtual java/lang/Integer.intValue ()I
      // 18a: invokevirtual com/yM_3.v (I)V
      // 18d: aload 6
      // 18f: ifnonnull 107
      // 192: goto 199
      // 195: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 198: athrow
      // 199: aload 14
      // 19b: ldc java/lang/Long
      // 19d: if_acmpne 1de
      // 1a0: aload 7
      // 1a2: aload 13
      // 1a4: checkcast java/lang/Long
      // 1a7: invokevirtual java/lang/Long.longValue ()J
      // 1aa: invokevirtual com/yM_3.i (J)V
      // 1ad: aload 7
      // 1af: aload 6
      // 1b1: ifnull 1cd
      // 1b4: goto 1bb
      // 1b7: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1ba: athrow
      // 1bb: getstatic com/EP.WriteClassName Lcom/EP;
      // 1be: invokevirtual com/yM_3.I (Lcom/EP;)Z
      // 1c1: ifeq 107
      // 1c4: goto 1cb
      // 1c7: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1ca: athrow
      // 1cb: aload 7
      // 1cd: sipush 12814
      // 1d0: ldc2_w 4936265311323350926
      // 1d3: invokestatic com/QM.a (IJ)I
      // 1d6: invokevirtual com/yM_3.write (I)V
      // 1d9: aload 6
      // 1db: ifnonnull 107
      // 1de: aload 1
      // 1df: aload 14
      // 1e1: invokevirtual com/nL_3.E (Ljava/lang/Class;)Lcom/ak_2;
      // 1e4: astore 15
      // 1e6: iload 5
      // 1e8: getstatic com/EP.WriteClassName Lcom/EP;
      // 1eb: invokestatic com/EP.e (ILcom/EP;)Z
      // 1ee: aload 6
      // 1f0: ifnull 215
      // 1f3: ifeq 237
      // 1f6: goto 1fd
      // 1f9: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1fc: athrow
      // 1fd: aload 15
      // 1ff: aload 6
      // 201: ifnull 240
      // 204: goto 20b
      // 207: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 20a: athrow
      // 20b: instanceof com/nj_4
      // 20e: goto 215
      // 211: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 214: athrow
      // 215: ifeq 237
      // 218: aload 15
      // 21a: checkcast com/nj_4
      // 21d: astore 16
      // 21f: aload 16
      // 221: aload 1
      // 222: aload 13
      // 224: iload 11
      // 226: bipush 1
      // 227: isub
      // 228: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 22b: aload 8
      // 22d: iload 5
      // 22f: invokevirtual com/nj_4.s (Lcom/nL_3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
      // 232: aload 6
      // 234: ifnonnull 253
      // 237: aload 15
      // 239: goto 240
      // 23c: invokestatic com/QM.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 23f: athrow
      // 240: aload 1
      // 241: aload 13
      // 243: iload 11
      // 245: bipush 1
      // 246: isub
      // 247: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 24a: aload 8
      // 24c: iload 5
      // 24e: invokeinterface com/ak_2.u (Lcom/nL_3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V 6
      // 253: aload 6
      // 255: ifnonnull 107
      // 258: aload 7
      // 25a: sipush 29575
      // 25d: ldc2_w 6204445405520864770
      // 260: invokestatic com/QM.a (IJ)I
      // 263: invokevirtual com/yM_3.T (C)Lcom/yM_3;
      // 266: pop
      // 267: aload 1
      // 268: aload 10
      // 26a: putfield com/nL_3.W Lcom/uh_2;
      // 26d: goto 27b
      // 270: astore 17
      // 272: aload 1
      // 273: aload 10
      // 275: putfield com/nL_3.W Lcom/uh_2;
      // 278: aload 17
      // 27a: athrow
      // 27b: return
   }

   @Override
   public Object z(com.yn_4 var1, Type var2, Object var3) {
      String var4 = nv_4.o();
      P7 var10000 = var1.N;
      if (var4 != null) {
         if (var1.N.P() != a(12198, 6050819566495562276L)) {
            if (var2 == com.Oc_2.class) {
               com.Oc_2 var7 = new com.Oc_2();
               var1.B(var7);
               return var7;
            }

            Object var5;
            label24: {
               label23: {
                  var10000 = var1.N;
                  if (var4 != null) {
                     if (var1.N.P() != a(6863, 581811359390748488L)) {
                        break label23;
                     }

                     var10000 = var1.N;
                  }

                  var10000.K();
                  var5 = com.B8.a(var2);
                  if (var4 != null) {
                     break label24;
                  }
               }

               var5 = com.B8.P(var2);
            }

            Type var6 = com.B8.r(var2);
            var1.t(var6, (Collection)var5, var3);
            return var5;
         }

         var10000 = var1.N;
      }

      var10000.S(a(27588, 1824467588120755778L));
      return null;
   }

   @Override
   public int j() {
      return a(15127, 2656043904263974547L);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "Ôn\u0088\u0007\u0002º¤\u0093®´\u0018";
      int var12 = "Ôn\u0088\u0007\u0002º¤\u0093®´\u0018".length();
      char var9 = 3;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 6;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 6;
               var10006 = var14;
            } else {
               var27 = 6;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 6;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 69;
                     break;
                  case 1:
                     var47 = 113;
                     break;
                  case 2:
                     var47 = 49;
                     break;
                  case 3:
                     var47 = 117;
                     break;
                  case 4:
                     var47 = 64;
                     break;
                  case 5:
                     var47 = 2;
                     break;
                  default:
                     var47 = 78;
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
            long var0 = 4801555662637435556L;
            long[] var6 = new long[8];
            int var3 = 0;
            String var4 = "\u009e\u008bÅð46p\u0088,\u008bÑW³\u0000þWÿ(MÏÖGífkâ\u0012lÇ:}\u008ahûtÆ¦ã´öÔ¯\u0006d2\u0000Åù";
            int var5 = "\u009e\u008bÅð46p\u0088,\u008bÑW³\u0000þWÿ(MÏÖGífkâ\u0012lÇ:}\u008ahûtÆ¦ã´öÔ¯\u0006d2\u0000Åù".length();
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
                           d = new Integer[8];
                           f = new com.QM();
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "åôu\u0006µ»ä9\u0092\u00069=0¥,û";
                        var5 = "åôu\u0006µ»ä9\u0092\u00069=0¥,û".length();
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

   private static IOException a(IOException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -21473) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 141;
               break;
            case 1:
               var10000 = 226;
               break;
            case 2:
               var10000 = 253;
               break;
            case 3:
               var10000 = 88;
               break;
            case 4:
               var10000 = 78;
               break;
            case 5:
               var10000 = 46;
               break;
            case 6:
               var10000 = 229;
               break;
            case 7:
               var10000 = 215;
               break;
            case 8:
               var10000 = 237;
               break;
            case 9:
               var10000 = 157;
               break;
            case 10:
               var10000 = 223;
               break;
            case 11:
               var10000 = 94;
               break;
            case 12:
               var10000 = 236;
               break;
            case 13:
               var10000 = 57;
               break;
            case 14:
               var10000 = 77;
               break;
            case 15:
               var10000 = 59;
               break;
            case 16:
               var10000 = 29;
               break;
            case 17:
               var10000 = 182;
               break;
            case 18:
               var10000 = 102;
               break;
            case 19:
               var10000 = 47;
               break;
            case 20:
               var10000 = 217;
               break;
            case 21:
               var10000 = 82;
               break;
            case 22:
               var10000 = 62;
               break;
            case 23:
               var10000 = 12;
               break;
            case 24:
               var10000 = 116;
               break;
            case 25:
               var10000 = 188;
               break;
            case 26:
               var10000 = 124;
               break;
            case 27:
               var10000 = 44;
               break;
            case 28:
               var10000 = 148;
               break;
            case 29:
               var10000 = 112;
               break;
            case 30:
               var10000 = 23;
               break;
            case 31:
               var10000 = 9;
               break;
            case 32:
               var10000 = 107;
               break;
            case 33:
               var10000 = 244;
               break;
            case 34:
               var10000 = 174;
               break;
            case 35:
               var10000 = 10;
               break;
            case 36:
               var10000 = 163;
               break;
            case 37:
               var10000 = 243;
               break;
            case 38:
               var10000 = 142;
               break;
            case 39:
               var10000 = 238;
               break;
            case 40:
               var10000 = 171;
               break;
            case 41:
               var10000 = 6;
               break;
            case 42:
               var10000 = 210;
               break;
            case 43:
               var10000 = 224;
               break;
            case 44:
               var10000 = 68;
               break;
            case 45:
               var10000 = 103;
               break;
            case 46:
               var10000 = 152;
               break;
            case 47:
               var10000 = 81;
               break;
            case 48:
               var10000 = 93;
               break;
            case 49:
               var10000 = 76;
               break;
            case 50:
               var10000 = 122;
               break;
            case 51:
               var10000 = 190;
               break;
            case 52:
               var10000 = 204;
               break;
            case 53:
               var10000 = 13;
               break;
            case 54:
               var10000 = 218;
               break;
            case 55:
               var10000 = 65;
               break;
            case 56:
               var10000 = 211;
               break;
            case 57:
               var10000 = 25;
               break;
            case 58:
               var10000 = 66;
               break;
            case 59:
               var10000 = 201;
               break;
            case 60:
               var10000 = 119;
               break;
            case 61:
               var10000 = 125;
               break;
            case 62:
               var10000 = 187;
               break;
            case 63:
               var10000 = 109;
               break;
            case 64:
               var10000 = 85;
               break;
            case 65:
               var10000 = 180;
               break;
            case 66:
               var10000 = 115;
               break;
            case 67:
               var10000 = 108;
               break;
            case 68:
               var10000 = 239;
               break;
            case 69:
               var10000 = 164;
               break;
            case 70:
               var10000 = 111;
               break;
            case 71:
               var10000 = 55;
               break;
            case 72:
               var10000 = 91;
               break;
            case 73:
               var10000 = 97;
               break;
            case 74:
               var10000 = 234;
               break;
            case 75:
               var10000 = 144;
               break;
            case 76:
               var10000 = 33;
               break;
            case 77:
               var10000 = 89;
               break;
            case 78:
               var10000 = 20;
               break;
            case 79:
               var10000 = 158;
               break;
            case 80:
               var10000 = 222;
               break;
            case 81:
               var10000 = 137;
               break;
            case 82:
               var10000 = 143;
               break;
            case 83:
               var10000 = 72;
               break;
            case 84:
               var10000 = 199;
               break;
            case 85:
               var10000 = 233;
               break;
            case 86:
               var10000 = 220;
               break;
            case 87:
               var10000 = 249;
               break;
            case 88:
               var10000 = 184;
               break;
            case 89:
               var10000 = 207;
               break;
            case 90:
               var10000 = 75;
               break;
            case 91:
               var10000 = 203;
               break;
            case 92:
               var10000 = 99;
               break;
            case 93:
               var10000 = 63;
               break;
            case 94:
               var10000 = 214;
               break;
            case 95:
               var10000 = 106;
               break;
            case 96:
               var10000 = 228;
               break;
            case 97:
               var10000 = 14;
               break;
            case 98:
               var10000 = 61;
               break;
            case 99:
               var10000 = 8;
               break;
            case 100:
               var10000 = 87;
               break;
            case 101:
               var10000 = 30;
               break;
            case 102:
               var10000 = 101;
               break;
            case 103:
               var10000 = 185;
               break;
            case 104:
               var10000 = 196;
               break;
            case 105:
               var10000 = 130;
               break;
            case 106:
               var10000 = 195;
               break;
            case 107:
               var10000 = 168;
               break;
            case 108:
               var10000 = 179;
               break;
            case 109:
               var10000 = 154;
               break;
            case 110:
               var10000 = 248;
               break;
            case 111:
               var10000 = 146;
               break;
            case 112:
               var10000 = 105;
               break;
            case 113:
               var10000 = 69;
               break;
            case 114:
               var10000 = 156;
               break;
            case 115:
               var10000 = 60;
               break;
            case 116:
               var10000 = 176;
               break;
            case 117:
               var10000 = 49;
               break;
            case 118:
               var10000 = 230;
               break;
            case 119:
               var10000 = 173;
               break;
            case 120:
               var10000 = 126;
               break;
            case 121:
               var10000 = 50;
               break;
            case 122:
               var10000 = 121;
               break;
            case 123:
               var10000 = 235;
               break;
            case 124:
               var10000 = 225;
               break;
            case 125:
               var10000 = 219;
               break;
            case 126:
               var10000 = 159;
               break;
            case 127:
               var10000 = 118;
               break;
            case 128:
               var10000 = 149;
               break;
            case 129:
               var10000 = 100;
               break;
            case 130:
               var10000 = 252;
               break;
            case 131:
               var10000 = 64;
               break;
            case 132:
               var10000 = 189;
               break;
            case 133:
               var10000 = 134;
               break;
            case 134:
               var10000 = 167;
               break;
            case 135:
               var10000 = 5;
               break;
            case 136:
               var10000 = 83;
               break;
            case 137:
               var10000 = 240;
               break;
            case 138:
               var10000 = 254;
               break;
            case 139:
               var10000 = 140;
               break;
            case 140:
               var10000 = 36;
               break;
            case 141:
               var10000 = 74;
               break;
            case 142:
               var10000 = 202;
               break;
            case 143:
               var10000 = 231;
               break;
            case 144:
               var10000 = 117;
               break;
            case 145:
               var10000 = 200;
               break;
            case 146:
               var10000 = 120;
               break;
            case 147:
               var10000 = 170;
               break;
            case 148:
               var10000 = 104;
               break;
            case 149:
               var10000 = 70;
               break;
            case 150:
               var10000 = 242;
               break;
            case 151:
               var10000 = 177;
               break;
            case 152:
               var10000 = 114;
               break;
            case 153:
               var10000 = 52;
               break;
            case 154:
               var10000 = 133;
               break;
            case 155:
               var10000 = 67;
               break;
            case 156:
               var10000 = 19;
               break;
            case 157:
               var10000 = 43;
               break;
            case 158:
               var10000 = 4;
               break;
            case 159:
               var10000 = 41;
               break;
            case 160:
               var10000 = 172;
               break;
            case 161:
               var10000 = 128;
               break;
            case 162:
               var10000 = 247;
               break;
            case 163:
               var10000 = 212;
               break;
            case 164:
               var10000 = 28;
               break;
            case 165:
               var10000 = 151;
               break;
            case 166:
               var10000 = 73;
               break;
            case 167:
               var10000 = 7;
               break;
            case 168:
               var10000 = 0;
               break;
            case 169:
               var10000 = 113;
               break;
            case 170:
               var10000 = 24;
               break;
            case 171:
               var10000 = 186;
               break;
            case 172:
               var10000 = 183;
               break;
            case 173:
               var10000 = 86;
               break;
            case 174:
               var10000 = 178;
               break;
            case 175:
               var10000 = 2;
               break;
            case 176:
               var10000 = 39;
               break;
            case 177:
               var10000 = 161;
               break;
            case 178:
               var10000 = 208;
               break;
            case 179:
               var10000 = 90;
               break;
            case 180:
               var10000 = 131;
               break;
            case 181:
               var10000 = 26;
               break;
            case 182:
               var10000 = 255;
               break;
            case 183:
               var10000 = 34;
               break;
            case 184:
               var10000 = 35;
               break;
            case 185:
               var10000 = 209;
               break;
            case 186:
               var10000 = 22;
               break;
            case 187:
               var10000 = 138;
               break;
            case 188:
               var10000 = 191;
               break;
            case 189:
               var10000 = 129;
               break;
            case 190:
               var10000 = 227;
               break;
            case 191:
               var10000 = 58;
               break;
            case 192:
               var10000 = 250;
               break;
            case 193:
               var10000 = 53;
               break;
            case 194:
               var10000 = 162;
               break;
            case 195:
               var10000 = 165;
               break;
            case 196:
               var10000 = 150;
               break;
            case 197:
               var10000 = 98;
               break;
            case 198:
               var10000 = 21;
               break;
            case 199:
               var10000 = 245;
               break;
            case 200:
               var10000 = 15;
               break;
            case 201:
               var10000 = 32;
               break;
            case 202:
               var10000 = 3;
               break;
            case 203:
               var10000 = 92;
               break;
            case 204:
               var10000 = 95;
               break;
            case 205:
               var10000 = 16;
               break;
            case 206:
               var10000 = 216;
               break;
            case 207:
               var10000 = 205;
               break;
            case 208:
               var10000 = 213;
               break;
            case 209:
               var10000 = 71;
               break;
            case 210:
               var10000 = 241;
               break;
            case 211:
               var10000 = 192;
               break;
            case 212:
               var10000 = 96;
               break;
            case 213:
               var10000 = 153;
               break;
            case 214:
               var10000 = 232;
               break;
            case 215:
               var10000 = 127;
               break;
            case 216:
               var10000 = 246;
               break;
            case 217:
               var10000 = 42;
               break;
            case 218:
               var10000 = 139;
               break;
            case 219:
               var10000 = 132;
               break;
            case 220:
               var10000 = 169;
               break;
            case 221:
               var10000 = 38;
               break;
            case 222:
               var10000 = 193;
               break;
            case 223:
               var10000 = 11;
               break;
            case 224:
               var10000 = 45;
               break;
            case 225:
               var10000 = 166;
               break;
            case 226:
               var10000 = 79;
               break;
            case 227:
               var10000 = 80;
               break;
            case 228:
               var10000 = 48;
               break;
            case 229:
               var10000 = 206;
               break;
            case 230:
               var10000 = 27;
               break;
            case 231:
               var10000 = 18;
               break;
            case 232:
               var10000 = 1;
               break;
            case 233:
               var10000 = 145;
               break;
            case 234:
               var10000 = 31;
               break;
            case 235:
               var10000 = 194;
               break;
            case 236:
               var10000 = 197;
               break;
            case 237:
               var10000 = 181;
               break;
            case 238:
               var10000 = 123;
               break;
            case 239:
               var10000 = 160;
               break;
            case 240:
               var10000 = 175;
               break;
            case 241:
               var10000 = 251;
               break;
            case 242:
               var10000 = 84;
               break;
            case 243:
               var10000 = 56;
               break;
            case 244:
               var10000 = 147;
               break;
            case 245:
               var10000 = 135;
               break;
            case 246:
               var10000 = 136;
               break;
            case 247:
               var10000 = 54;
               break;
            case 248:
               var10000 = 37;
               break;
            case 249:
               var10000 = 198;
               break;
            case 250:
               var10000 = 155;
               break;
            case 251:
               var10000 = 110;
               break;
            case 252:
               var10000 = 221;
               break;
            case 253:
               var10000 = 51;
               break;
            case 254:
               var10000 = 40;
               break;
            default:
               var10000 = 17;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21890;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





