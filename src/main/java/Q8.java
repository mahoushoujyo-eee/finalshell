import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Q8 {
   private FY i;
   private int e;
   private String T;
   private OutputStream b;
   private InputStream k;
   private OutputStream m;
   ke_4 D;
   private static final String[] a;
   private static final String[] c;
   private static final long[] d;
   private static final Integer[] f;

   public Q8(ke_4 param1, FY param2, InputStream param3, OutputStream param4) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: invokestatic Ub_2.A ()[Ljava/lang/String;
      // 07: aload 0
      // 08: bipush 0
      // 09: putfield Q8.e I
      // 0c: astore 5
      // 0e: aload 0
      // 0f: aconst_null
      // 10: putfield Q8.b Ljava/io/OutputStream;
      // 13: aload 0
      // 14: aload 1
      // 15: putfield Q8.D Lke_4;
      // 18: aload 2
      // 19: invokeinterface FY.u ()Z 1
      // 1e: aload 5
      // 20: ifnonnull 3a
      // 23: ifeq 3d
      // 26: goto 2d
      // 29: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 2
      // 2e: invokeinterface FY.B ()Z 1
      // 33: goto 3a
      // 36: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: ifne 4f
      // 3d: new java/io/FileNotFoundException
      // 40: dup
      // 41: aload 2
      // 42: invokeinterface FY.T ()Ljava/lang/String; 1
      // 47: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 4a: athrow
      // 4b: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: aload 0
      // 50: aload 2
      // 51: putfield Q8.i LFY;
      // 54: aload 0
      // 55: aload 3
      // 56: putfield Q8.k Ljava/io/InputStream;
      // 59: aload 0
      // 5a: aload 4
      // 5c: putfield Q8.m Ljava/io/OutputStream;
      // 5f: return
   }

   private FY Q() {
      return this.i.Y(this.T);
   }

   private int n() {
      String[] var10000 = Ub_2.A();
      FY var2 = this.Q();
      String[] var1 = var10000;
      byte var3 = var2.B();
      if (var1 == null) {
         if (var3 != 0) {
            return (int)var2.F();
         }

         var3 = 0;
      }

      return var3;
   }

   private void w(int param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Ub_2.A ()[Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 3
      // 05: aload 0
      // 06: invokespecial Q8.Q ()LFY;
      // 09: astore 4
      // 0b: astore 2
      // 0c: aload 2
      // 0d: ifnonnull 76
      // 10: iload 1
      // 11: ifeq 65
      // 14: goto 1b
      // 17: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 4
      // 1d: invokeinterface FY.B ()Z 1
      // 22: aload 2
      // 23: ifnonnull 64
      // 26: goto 2d
      // 29: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: ifeq 5c
      // 30: goto 37
      // 33: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: aload 4
      // 39: invokeinterface FY.F ()J 1
      // 3e: iload 1
      // 3f: i2l
      // 40: lcmp
      // 41: aload 2
      // 42: ifnonnull 64
      // 45: goto 4c
      // 48: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: ifne 5c
      // 4f: goto 56
      // 52: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: bipush 1
      // 57: istore 3
      // 58: aload 2
      // 59: ifnull 65
      // 5c: bipush 0
      // 5d: goto 64
      // 60: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63: athrow
      // 64: istore 1
      // 65: aload 0
      // 66: aload 4
      // 68: iload 3
      // 69: invokeinterface FY.M (Z)Ljava/io/OutputStream; 2
      // 6e: putfield Q8.b Ljava/io/OutputStream;
      // 71: aload 0
      // 72: iload 1
      // 73: putfield Q8.e I
      // 76: return
   }

   private void l(UK var1) {
      String[] var10000 = Ub_2.A();
      StringBuilder var3 = new StringBuilder(a(4501, 770352517648083404L));
      byte[] var4 = var1.c();
      int var5 = var4.length;
      String[] var2 = var10000;
      int var6 = 0;

      while (true) {
         label23:
         if (var6 < var5) {
            byte var7 = var4[var6];
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               if (var7 == 0) {
                  break label23;
               }

               var3.append((char)var7);
               var6++;
            }

            if (var2 == null) {
               continue;
            }
         }

         this.T = var3.toString();
         break;
      }
   }

   private void O(UK var1) throws IOException {
      this.b.write(var1.c());
      this.e = this.e + var1.c().length;
   }

   public void o() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new mp_2
      // 003: dup
      // 004: aload 0
      // 005: getfield Q8.k Ljava/io/InputStream;
      // 008: invokespecial mp_2.<init> (Ljava/io/InputStream;)V
      // 00b: astore 2
      // 00c: invokestatic Ub_2.A ()[Ljava/lang/String;
      // 00f: new aU
      // 012: dup
      // 013: aload 0
      // 014: getfield Q8.m Ljava/io/OutputStream;
      // 017: invokespecial aU.<init> (Ljava/io/OutputStream;)V
      // 01a: astore 3
      // 01b: getstatic mR.NOTHING LmR;
      // 01e: astore 4
      // 020: bipush 4
      // 021: newarray 8
      // 023: dup
      // 024: bipush 0
      // 025: bipush 0
      // 026: bastore
      // 027: dup
      // 028: bipush 1
      // 029: bipush 4
      // 02a: bastore
      // 02b: dup
      // 02c: bipush 2
      // 02d: bipush 0
      // 02e: bastore
      // 02f: dup
      // 030: bipush 3
      // 031: bipush 2
      // 032: anewarray 150
      // 035: dup
      // 036: bipush 0
      // 037: getstatic dg_4.ESCCTL Ldg_4;
      // 03a: aastore
      // 03b: dup
      // 03c: bipush 1
      // 03d: getstatic dg_4.ESC8 Ldg_4;
      // 040: aastore
      // 041: invokestatic dg_4.f ([Ldg_4;)B
      // 044: bastore
      // 045: astore 5
      // 047: astore 1
      // 048: aload 3
      // 049: sipush -7894
      // 04c: sipush 20248
      // 04f: invokestatic Q8.a (II)Ljava/lang/String;
      // 052: invokevirtual java/lang/String.getBytes ()[B
      // 055: invokevirtual aU.I ([B)V
      // 058: bipush 4
      // 059: newarray 8
      // 05b: dup
      // 05c: bipush 0
      // 05d: bipush 0
      // 05e: bastore
      // 05f: dup
      // 060: bipush 1
      // 061: bipush 0
      // 062: bastore
      // 063: dup
      // 064: bipush 2
      // 065: bipush 0
      // 066: bastore
      // 067: dup
      // 068: bipush 3
      // 069: sipush 4656
      // 06c: ldc2_w 2403193144348437096
      // 06f: invokestatic Q8.a (IJ)I
      // 072: bastore
      // 073: astore 6
      // 075: new Uw_2
      // 078: dup
      // 079: getstatic yu_4.HEX Lyu_4;
      // 07c: getstatic x9.ZRINIT Lx9;
      // 07f: aload 6
      // 081: invokespecial Uw_2.<init> (Lyu_4;Lx9;[B)V
      // 084: astore 7
      // 086: aload 3
      // 087: aload 7
      // 089: invokevirtual aU.C (LUb_2;)V
      // 08c: new Uw_2
      // 08f: dup
      // 090: getstatic yu_4.HEX Lyu_4;
      // 093: getstatic x9.ZRPOS Lx9;
      // 096: invokespecial Uw_2.<init> (Lyu_4;Lx9;)V
      // 099: astore 8
      // 09b: aload 3
      // 09c: aload 8
      // 09e: invokevirtual aU.C (LUb_2;)V
      // 0a1: bipush 0
      // 0a2: istore 9
      // 0a4: bipush 0
      // 0a5: istore 10
      // 0a7: aconst_null
      // 0a8: astore 11
      // 0aa: iload 9
      // 0ac: ifne 2cf
      // 0af: aload 0
      // 0b0: getfield Q8.D Lke_4;
      // 0b3: invokevirtual ke_4.J ()Z
      // 0b6: ifne 2cf
      // 0b9: aload 2
      // 0ba: invokevirtual mp_2.G ()LUb_2;
      // 0bd: astore 11
      // 0bf: goto 0eb
      // 0c2: astore 12
      // 0c4: aload 12
      // 0c6: invokevirtual java/lang/Exception.printStackTrace ()V
      // 0c9: iinc 10 1
      // 0cc: iload 10
      // 0ce: aload 1
      // 0cf: ifnonnull 0f0
      // 0d2: bipush 3
      // 0d3: if_icmplt 0eb
      // 0d6: goto 0dd
      // 0d9: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: aload 3
      // 0de: new Ut_2
      // 0e1: dup
      // 0e2: invokespecial Ut_2.<init> ()V
      // 0e5: invokevirtual aU.C (LUb_2;)V
      // 0e8: bipush 1
      // 0e9: istore 9
      // 0eb: aload 11
      // 0ed: instanceof Ut_2
      // 0f0: aload 1
      // 0f1: ifnonnull 106
      // 0f4: ifeq 101
      // 0f7: goto 0fe
      // 0fa: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: bipush 1
      // 0ff: istore 9
      // 101: aload 11
      // 103: instanceof Um_2
      // 106: aload 1
      // 107: ifnonnull 11c
      // 10a: ifeq 117
      // 10d: goto 114
      // 110: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: bipush 1
      // 115: istore 9
      // 117: aload 11
      // 119: instanceof Uw_2
      // 11c: aload 1
      // 11d: ifnonnull 1ff
      // 120: ifeq 1ef
      // 123: goto 12a
      // 126: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 129: athrow
      // 12a: aload 11
      // 12c: checkcast Uw_2
      // 12f: astore 12
      // 131: getstatic DB.t [I
      // 134: aload 12
      // 136: invokevirtual Uw_2.h ()Lx9;
      // 139: invokevirtual x9.ordinal ()I
      // 13c: iaload
      // 13d: aload 1
      // 13e: ifnonnull 1e2
      // 141: tableswitch 153 1 5 39 50 59 111 129
      // 164: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 167: athrow
      // 168: aload 1
      // 169: ifnull 1ef
      // 16c: goto 173
      // 16f: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: getstatic mR.FILENAME LmR;
      // 176: astore 4
      // 178: aload 1
      // 179: ifnull 1ef
      // 17c: aload 3
      // 17d: new Uw_2
      // 180: dup
      // 181: getstatic yu_4.HEX Lyu_4;
      // 184: getstatic x9.ZRINIT Lx9;
      // 187: aload 5
      // 189: invokespecial Uw_2.<init> (Lyu_4;Lx9;[B)V
      // 18c: invokevirtual aU.C (LUb_2;)V
      // 18f: getstatic mR.NOTHING LmR;
      // 192: astore 4
      // 194: aload 0
      // 195: getfield Q8.b Ljava/io/OutputStream;
      // 198: invokevirtual java/io/OutputStream.flush ()V
      // 19b: aload 0
      // 19c: getfield Q8.b Ljava/io/OutputStream;
      // 19f: invokevirtual java/io/OutputStream.close ()V
      // 1a2: aload 0
      // 1a3: aconst_null
      // 1a4: putfield Q8.T Ljava/lang/String;
      // 1a7: aload 0
      // 1a8: aconst_null
      // 1a9: putfield Q8.b Ljava/io/OutputStream;
      // 1ac: aload 1
      // 1ad: ifnull 1ef
      // 1b0: aload 0
      // 1b1: aload 12
      // 1b3: invokevirtual Uw_2.Q ()I
      // 1b6: invokespecial Q8.w (I)V
      // 1b9: getstatic mR.DATA LmR;
      // 1bc: astore 4
      // 1be: aload 1
      // 1bf: ifnull 1ef
      // 1c2: aload 3
      // 1c3: new Uw_2
      // 1c6: dup
      // 1c7: getstatic yu_4.HEX Lyu_4;
      // 1ca: getstatic x9.ZFIN Lx9;
      // 1cd: invokespecial Uw_2.<init> (Lyu_4;Lx9;)V
      // 1d0: invokevirtual aU.C (LUb_2;)V
      // 1d3: bipush 1
      // 1d4: istore 9
      // 1d6: aload 1
      // 1d7: ifnull 1ef
      // 1da: bipush 1
      // 1db: goto 1e2
      // 1de: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e1: athrow
      // 1e2: istore 9
      // 1e4: aload 3
      // 1e5: new Ut_2
      // 1e8: dup
      // 1e9: invokespecial Ut_2.<init> ()V
      // 1ec: invokevirtual aU.C (LUb_2;)V
      // 1ef: aload 11
      // 1f1: aload 1
      // 1f2: ifnonnull 204
      // 1f5: instanceof UK
      // 1f8: goto 1ff
      // 1fb: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fe: athrow
      // 1ff: ifeq 0aa
      // 202: aload 11
      // 204: checkcast UK
      // 207: astore 12
      // 209: aload 1
      // 20a: ifnonnull 24e
      // 20d: getstatic DB.X [I
      // 210: aload 4
      // 212: invokevirtual mR.ordinal ()I
      // 215: iaload
      // 216: tableswitch 181 1 3 30 60 96
      // 230: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 233: athrow
      // 234: aload 3
      // 235: new Uw_2
      // 238: dup
      // 239: getstatic yu_4.HEX Lyu_4;
      // 23c: getstatic x9.ZRINIT Lx9;
      // 23f: aload 5
      // 241: invokespecial Uw_2.<init> (Lyu_4;Lx9;[B)V
      // 244: invokevirtual aU.C (LUb_2;)V
      // 247: goto 24e
      // 24a: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24d: athrow
      // 24e: aload 1
      // 24f: ifnull 2cb
      // 252: aload 0
      // 253: aload 12
      // 255: invokespecial Q8.l (LUK;)V
      // 258: aload 3
      // 259: new Uw_2
      // 25c: dup
      // 25d: getstatic yu_4.HEX Lyu_4;
      // 260: getstatic x9.ZRPOS Lx9;
      // 263: aload 0
      // 264: invokespecial Q8.n ()I
      // 267: invokespecial Uw_2.<init> (Lyu_4;Lx9;I)V
      // 26a: invokevirtual aU.C (LUb_2;)V
      // 26d: getstatic mR.NOTHING LmR;
      // 270: astore 4
      // 272: aload 1
      // 273: ifnull 2cb
      // 276: aload 0
      // 277: aload 12
      // 279: invokespecial Q8.O (LUK;)V
      // 27c: getstatic DB.t [I
      // 27f: aload 12
      // 281: invokevirtual UK.e ()Lx9;
      // 284: invokevirtual x9.ordinal ()I
      // 287: iaload
      // 288: tableswitch 67 6 8 32 37 62
      // 2a4: invokestatic Q8.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a7: athrow
      // 2a8: getstatic mR.NOTHING LmR;
      // 2ab: astore 4
      // 2ad: aload 3
      // 2ae: new Uw_2
      // 2b1: dup
      // 2b2: getstatic yu_4.HEX Lyu_4;
      // 2b5: getstatic x9.ZACK Lx9;
      // 2b8: aload 0
      // 2b9: getfield Q8.e I
      // 2bc: invokespecial Uw_2.<init> (Lyu_4;Lx9;I)V
      // 2bf: invokevirtual aU.C (LUb_2;)V
      // 2c2: aload 1
      // 2c3: ifnull 2cb
      // 2c6: getstatic mR.NOTHING LmR;
      // 2c9: astore 4
      // 2cb: aload 1
      // 2cc: ifnull 0aa
      // 2cf: goto 2f8
      // 2d2: astore 6
      // 2d4: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 2d7: new java/lang/StringBuilder
      // 2da: dup
      // 2db: invokespecial java/lang/StringBuilder.<init> ()V
      // 2de: sipush -7893
      // 2e1: sipush 8889
      // 2e4: invokestatic Q8.a (II)Ljava/lang/String;
      // 2e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ea: aload 6
      // 2ec: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 2ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2f5: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 2f8: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "l\nûCsªÚ\u0080\u0084YS\u009d\u0013äj\u0096x> J¨'\u009a\r-ã\u008fßäG\u0003o\u0096\u0090\u0007qp";
      int var12 = "l\nûCsªÚ\u0080\u0084YS\u009d\u0013äj\u0096x> J¨'\u009a\r-ã\u008fßäG\u0003o\u0096\u0090\u0007qp".length();
      char var9 = 23;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 27;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 27;
               var10006 = var14;
            } else {
               var23 = 27;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 27;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 1;
                     break;
                  case 1:
                     var41 = 80;
                     break;
                  case 2:
                     var41 = 50;
                     break;
                  case 3:
                     var41 = 50;
                     break;
                  case 4:
                     var41 = 119;
                     break;
                  case 5:
                     var41 = 12;
                     break;
                  default:
                     var41 = 27;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var13[var11++] = var25;
         if ((var8 += var9) >= var12) {
            a = var13;
            c = new String[2];
            long var0 = 4019580862477279557L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "»¡cLë×H\t}\u0085õ]ò`K\u000e";
            int var5 = "»¡cLë×H\t}\u0085õ]ò`K\u000e".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
               var18 = var3++;
               long var31 = (
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
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            d = var6;
            f = new Integer[2];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -7894) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 235;
               break;
            case 1:
               var10000 = 64;
               break;
            case 2:
               var10000 = 48;
               break;
            case 3:
               var10000 = 43;
               break;
            case 4:
               var10000 = 145;
               break;
            case 5:
               var10000 = 169;
               break;
            case 6:
               var10000 = 77;
               break;
            case 7:
               var10000 = 252;
               break;
            case 8:
               var10000 = 36;
               break;
            case 9:
               var10000 = 54;
               break;
            case 10:
               var10000 = 156;
               break;
            case 11:
               var10000 = 232;
               break;
            case 12:
               var10000 = 29;
               break;
            case 13:
               var10000 = 239;
               break;
            case 14:
               var10000 = 117;
               break;
            case 15:
               var10000 = 51;
               break;
            case 16:
               var10000 = 127;
               break;
            case 17:
               var10000 = 210;
               break;
            case 18:
               var10000 = 76;
               break;
            case 19:
               var10000 = 206;
               break;
            case 20:
               var10000 = 194;
               break;
            case 21:
               var10000 = 159;
               break;
            case 22:
               var10000 = 184;
               break;
            case 23:
               var10000 = 78;
               break;
            case 24:
               var10000 = 148;
               break;
            case 25:
               var10000 = 70;
               break;
            case 26:
               var10000 = 61;
               break;
            case 27:
               var10000 = 186;
               break;
            case 28:
               var10000 = 179;
               break;
            case 29:
               var10000 = 222;
               break;
            case 30:
               var10000 = 30;
               break;
            case 31:
               var10000 = 21;
               break;
            case 32:
               var10000 = 177;
               break;
            case 33:
               var10000 = 136;
               break;
            case 34:
               var10000 = 214;
               break;
            case 35:
               var10000 = 244;
               break;
            case 36:
               var10000 = 131;
               break;
            case 37:
               var10000 = 203;
               break;
            case 38:
               var10000 = 104;
               break;
            case 39:
               var10000 = 75;
               break;
            case 40:
               var10000 = 185;
               break;
            case 41:
               var10000 = 250;
               break;
            case 42:
               var10000 = 112;
               break;
            case 43:
               var10000 = 167;
               break;
            case 44:
               var10000 = 1;
               break;
            case 45:
               var10000 = 138;
               break;
            case 46:
               var10000 = 8;
               break;
            case 47:
               var10000 = 164;
               break;
            case 48:
               var10000 = 89;
               break;
            case 49:
               var10000 = 180;
               break;
            case 50:
               var10000 = 160;
               break;
            case 51:
               var10000 = 132;
               break;
            case 52:
               var10000 = 28;
               break;
            case 53:
               var10000 = 2;
               break;
            case 54:
               var10000 = 3;
               break;
            case 55:
               var10000 = 59;
               break;
            case 56:
               var10000 = 72;
               break;
            case 57:
               var10000 = 218;
               break;
            case 58:
               var10000 = 50;
               break;
            case 59:
               var10000 = 187;
               break;
            case 60:
               var10000 = 253;
               break;
            case 61:
               var10000 = 141;
               break;
            case 62:
               var10000 = 133;
               break;
            case 63:
               var10000 = 15;
               break;
            case 64:
               var10000 = 86;
               break;
            case 65:
               var10000 = 154;
               break;
            case 66:
               var10000 = 197;
               break;
            case 67:
               var10000 = 130;
               break;
            case 68:
               var10000 = 219;
               break;
            case 69:
               var10000 = 42;
               break;
            case 70:
               var10000 = 212;
               break;
            case 71:
               var10000 = 9;
               break;
            case 72:
               var10000 = 73;
               break;
            case 73:
               var10000 = 224;
               break;
            case 74:
               var10000 = 0;
               break;
            case 75:
               var10000 = 34;
               break;
            case 76:
               var10000 = 83;
               break;
            case 77:
               var10000 = 150;
               break;
            case 78:
               var10000 = 172;
               break;
            case 79:
               var10000 = 40;
               break;
            case 80:
               var10000 = 246;
               break;
            case 81:
               var10000 = 171;
               break;
            case 82:
               var10000 = 65;
               break;
            case 83:
               var10000 = 67;
               break;
            case 84:
               var10000 = 242;
               break;
            case 85:
               var10000 = 213;
               break;
            case 86:
               var10000 = 110;
               break;
            case 87:
               var10000 = 240;
               break;
            case 88:
               var10000 = 105;
               break;
            case 89:
               var10000 = 106;
               break;
            case 90:
               var10000 = 208;
               break;
            case 91:
               var10000 = 155;
               break;
            case 92:
               var10000 = 249;
               break;
            case 93:
               var10000 = 69;
               break;
            case 94:
               var10000 = 13;
               break;
            case 95:
               var10000 = 134;
               break;
            case 96:
               var10000 = 7;
               break;
            case 97:
               var10000 = 17;
               break;
            case 98:
               var10000 = 190;
               break;
            case 99:
               var10000 = 153;
               break;
            case 100:
               var10000 = 175;
               break;
            case 101:
               var10000 = 170;
               break;
            case 102:
               var10000 = 49;
               break;
            case 103:
               var10000 = 237;
               break;
            case 104:
               var10000 = 243;
               break;
            case 105:
               var10000 = 16;
               break;
            case 106:
               var10000 = 230;
               break;
            case 107:
               var10000 = 151;
               break;
            case 108:
               var10000 = 81;
               break;
            case 109:
               var10000 = 196;
               break;
            case 110:
               var10000 = 103;
               break;
            case 111:
               var10000 = 241;
               break;
            case 112:
               var10000 = 217;
               break;
            case 113:
               var10000 = 205;
               break;
            case 114:
               var10000 = 233;
               break;
            case 115:
               var10000 = 14;
               break;
            case 116:
               var10000 = 191;
               break;
            case 117:
               var10000 = 147;
               break;
            case 118:
               var10000 = 20;
               break;
            case 119:
               var10000 = 45;
               break;
            case 120:
               var10000 = 121;
               break;
            case 121:
               var10000 = 88;
               break;
            case 122:
               var10000 = 97;
               break;
            case 123:
               var10000 = 146;
               break;
            case 124:
               var10000 = 215;
               break;
            case 125:
               var10000 = 254;
               break;
            case 126:
               var10000 = 124;
               break;
            case 127:
               var10000 = 58;
               break;
            case 128:
               var10000 = 251;
               break;
            case 129:
               var10000 = 24;
               break;
            case 130:
               var10000 = 38;
               break;
            case 131:
               var10000 = 178;
               break;
            case 132:
               var10000 = 66;
               break;
            case 133:
               var10000 = 162;
               break;
            case 134:
               var10000 = 207;
               break;
            case 135:
               var10000 = 60;
               break;
            case 136:
               var10000 = 231;
               break;
            case 137:
               var10000 = 247;
               break;
            case 138:
               var10000 = 90;
               break;
            case 139:
               var10000 = 126;
               break;
            case 140:
               var10000 = 5;
               break;
            case 141:
               var10000 = 102;
               break;
            case 142:
               var10000 = 176;
               break;
            case 143:
               var10000 = 18;
               break;
            case 144:
               var10000 = 198;
               break;
            case 145:
               var10000 = 119;
               break;
            case 146:
               var10000 = 189;
               break;
            case 147:
               var10000 = 188;
               break;
            case 148:
               var10000 = 182;
               break;
            case 149:
               var10000 = 223;
               break;
            case 150:
               var10000 = 44;
               break;
            case 151:
               var10000 = 158;
               break;
            case 152:
               var10000 = 109;
               break;
            case 153:
               var10000 = 220;
               break;
            case 154:
               var10000 = 168;
               break;
            case 155:
               var10000 = 23;
               break;
            case 156:
               var10000 = 96;
               break;
            case 157:
               var10000 = 135;
               break;
            case 158:
               var10000 = 84;
               break;
            case 159:
               var10000 = 33;
               break;
            case 160:
               var10000 = 52;
               break;
            case 161:
               var10000 = 53;
               break;
            case 162:
               var10000 = 142;
               break;
            case 163:
               var10000 = 236;
               break;
            case 164:
               var10000 = 211;
               break;
            case 165:
               var10000 = 181;
               break;
            case 166:
               var10000 = 161;
               break;
            case 167:
               var10000 = 216;
               break;
            case 168:
               var10000 = 74;
               break;
            case 169:
               var10000 = 149;
               break;
            case 170:
               var10000 = 91;
               break;
            case 171:
               var10000 = 68;
               break;
            case 172:
               var10000 = 47;
               break;
            case 173:
               var10000 = 62;
               break;
            case 174:
               var10000 = 118;
               break;
            case 175:
               var10000 = 183;
               break;
            case 176:
               var10000 = 27;
               break;
            case 177:
               var10000 = 200;
               break;
            case 178:
               var10000 = 108;
               break;
            case 179:
               var10000 = 204;
               break;
            case 180:
               var10000 = 209;
               break;
            case 181:
               var10000 = 107;
               break;
            case 182:
               var10000 = 92;
               break;
            case 183:
               var10000 = 63;
               break;
            case 184:
               var10000 = 202;
               break;
            case 185:
               var10000 = 248;
               break;
            case 186:
               var10000 = 115;
               break;
            case 187:
               var10000 = 128;
               break;
            case 188:
               var10000 = 229;
               break;
            case 189:
               var10000 = 99;
               break;
            case 190:
               var10000 = 157;
               break;
            case 191:
               var10000 = 199;
               break;
            case 192:
               var10000 = 32;
               break;
            case 193:
               var10000 = 111;
               break;
            case 194:
               var10000 = 225;
               break;
            case 195:
               var10000 = 93;
               break;
            case 196:
               var10000 = 163;
               break;
            case 197:
               var10000 = 80;
               break;
            case 198:
               var10000 = 11;
               break;
            case 199:
               var10000 = 144;
               break;
            case 200:
               var10000 = 221;
               break;
            case 201:
               var10000 = 165;
               break;
            case 202:
               var10000 = 71;
               break;
            case 203:
               var10000 = 139;
               break;
            case 204:
               var10000 = 6;
               break;
            case 205:
               var10000 = 143;
               break;
            case 206:
               var10000 = 79;
               break;
            case 207:
               var10000 = 193;
               break;
            case 208:
               var10000 = 87;
               break;
            case 209:
               var10000 = 55;
               break;
            case 210:
               var10000 = 26;
               break;
            case 211:
               var10000 = 46;
               break;
            case 212:
               var10000 = 122;
               break;
            case 213:
               var10000 = 201;
               break;
            case 214:
               var10000 = 113;
               break;
            case 215:
               var10000 = 19;
               break;
            case 216:
               var10000 = 94;
               break;
            case 217:
               var10000 = 245;
               break;
            case 218:
               var10000 = 101;
               break;
            case 219:
               var10000 = 137;
               break;
            case 220:
               var10000 = 22;
               break;
            case 221:
               var10000 = 234;
               break;
            case 222:
               var10000 = 116;
               break;
            case 223:
               var10000 = 4;
               break;
            case 224:
               var10000 = 31;
               break;
            case 225:
               var10000 = 192;
               break;
            case 226:
               var10000 = 140;
               break;
            case 227:
               var10000 = 12;
               break;
            case 228:
               var10000 = 195;
               break;
            case 229:
               var10000 = 120;
               break;
            case 230:
               var10000 = 85;
               break;
            case 231:
               var10000 = 25;
               break;
            case 232:
               var10000 = 166;
               break;
            case 233:
               var10000 = 37;
               break;
            case 234:
               var10000 = 227;
               break;
            case 235:
               var10000 = 173;
               break;
            case 236:
               var10000 = 152;
               break;
            case 237:
               var10000 = 39;
               break;
            case 238:
               var10000 = 35;
               break;
            case 239:
               var10000 = 56;
               break;
            case 240:
               var10000 = 174;
               break;
            case 241:
               var10000 = 238;
               break;
            case 242:
               var10000 = 228;
               break;
            case 243:
               var10000 = 114;
               break;
            case 244:
               var10000 = 98;
               break;
            case 245:
               var10000 = 82;
               break;
            case 246:
               var10000 = 95;
               break;
            case 247:
               var10000 = 57;
               break;
            case 248:
               var10000 = 100;
               break;
            case 249:
               var10000 = 255;
               break;
            case 250:
               var10000 = 226;
               break;
            case 251:
               var10000 = 123;
               break;
            case 252:
               var10000 = 10;
               break;
            case 253:
               var10000 = 41;
               break;
            case 254:
               var10000 = 125;
               break;
            default:
               var10000 = 129;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30809;
      if (f[var3] == null) {
         f[var3] = (int)(d[var3] ^ var1);
      }

      return f[var3];
   }
}





