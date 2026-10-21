import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;

public class DH {
   private Map a;
   private Iterator d;
   private FY c;
   private String u;
   private int W = 0;
   private boolean T = false;
   private InputStream Y;
   private InputStream O;
   private OutputStream U;
   ke_4 D;
   private static final String[] b;
   private static final String[] e;
   private static final long[] f;
   private static final Integer[] g;

   public DH(ke_4 var1, Map var2, InputStream var3, OutputStream var4) throws IOException {
      this.D = var1;
      this.a = var2;
      this.d = this.a.keySet().iterator();
      this.W = 0;
      this.O = var3;
      this.U = var4;
   }

   public boolean O() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Ub_2.A ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield DH.d Ljava/util/Iterator;
      // 08: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d: aload 1
      // 0e: ifnonnull 58
      // 11: ifne 21
      // 14: goto 1b
      // 17: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: aload 0
      // 23: getfield DH.d Ljava/util/Iterator;
      // 26: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b: checkcast java/lang/String
      // 2e: putfield DH.u Ljava/lang/String;
      // 31: aload 0
      // 32: aload 0
      // 33: getfield DH.a Ljava/util/Map;
      // 36: aload 0
      // 37: getfield DH.u Ljava/lang/String;
      // 3a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3f: checkcast FY
      // 42: putfield DH.c LFY;
      // 45: aload 0
      // 46: aload 0
      // 47: getfield DH.c LFY;
      // 4a: invokeinterface FY.g ()Ljava/io/InputStream; 1
      // 4f: putfield DH.Y Ljava/io/InputStream;
      // 52: aload 0
      // 53: bipush 0
      // 54: putfield DH.W I
      // 57: bipush 1
      // 58: ireturn
   }

   private void n(int param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Ub_2.A ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnonnull 3c
      // 08: iload 1
      // 09: aload 0
      // 0a: getfield DH.W I
      // 0d: if_icmpeq 41
      // 10: goto 17
      // 13: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: getfield DH.Y Ljava/io/InputStream;
      // 1b: invokevirtual java/io/InputStream.close ()V
      // 1e: aload 0
      // 1f: aload 0
      // 20: getfield DH.c LFY;
      // 23: invokeinterface FY.g ()Ljava/io/InputStream; 1
      // 28: putfield DH.Y Ljava/io/InputStream;
      // 2b: aload 0
      // 2c: getfield DH.Y Ljava/io/InputStream;
      // 2f: iload 1
      // 30: i2l
      // 31: invokevirtual java/io/InputStream.skip (J)J
      // 34: pop2
      // 35: goto 3c
      // 38: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: aload 0
      // 3d: iload 1
      // 3e: putfield DH.W I
      // 41: return
   }

   private byte[] R() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Ub_2.A ()[Ljava/lang/String;
      // 03: sipush 9236
      // 06: ldc2_w 5483518481626799606
      // 09: invokestatic DH.a (IJ)I
      // 0c: newarray 8
      // 0e: astore 2
      // 0f: astore 1
      // 10: aload 0
      // 11: getfield DH.Y Ljava/io/InputStream;
      // 14: aload 2
      // 15: invokevirtual java/io/InputStream.read ([B)I
      // 18: istore 3
      // 19: iload 3
      // 1a: aload 2
      // 1b: arraylength
      // 1c: aload 1
      // 1d: ifnonnull 43
      // 20: if_icmpge 36
      // 23: goto 2a
      // 26: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: bipush 1
      // 2c: putfield DH.T Z
      // 2f: goto 36
      // 32: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 0
      // 37: dup
      // 38: getfield DH.W I
      // 3b: iload 3
      // 3c: iadd
      // 3d: putfield DH.W I
      // 40: iload 3
      // 41: aload 2
      // 42: arraylength
      // 43: if_icmpeq 50
      // 46: aload 2
      // 47: iload 3
      // 48: invokestatic DF.s ([BI)[B
      // 4b: areturn
      // 4c: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: aload 2
      // 51: areturn
   }

   private UK m() throws IOException {
      String[] var10000 = Ub_2.A();
      byte[] var2 = this.R();
      x9 var3 = x9.ZCRCW;
      String[] var1 = var10000;

      label20: {
         try {
            var5 = this;
            if (var1 != null) {
               break label20;
            }

            if (!this.T) {
               return new UK(var3, var2);
            }
         } catch (IOException var4) {
            throw a(var4);
         }

         var3 = x9.ZCRCE;
         var5 = this;
      }

      var5.Y.close();
      return new UK(var3, var2);
   }

   public void k() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic Ub_2.A ()[Ljava/lang/String;
      // 003: new KP
      // 006: dup
      // 007: invokespecial KP.<init> ()V
      // 00a: astore 2
      // 00b: new mp_2
      // 00e: dup
      // 00f: aload 0
      // 010: getfield DH.O Ljava/io/InputStream;
      // 013: invokespecial mp_2.<init> (Ljava/io/InputStream;)V
      // 016: astore 3
      // 017: astore 1
      // 018: new aU
      // 01b: dup
      // 01c: aload 0
      // 01d: getfield DH.U Ljava/io/OutputStream;
      // 020: invokespecial aU.<init> (Ljava/io/OutputStream;)V
      // 023: astore 4
      // 025: bipush 0
      // 026: istore 5
      // 028: bipush 0
      // 029: istore 6
      // 02b: aconst_null
      // 02c: astore 7
      // 02e: aload 4
      // 030: sipush 3044
      // 033: sipush -9826
      // 036: invokestatic DH.a (II)Ljava/lang/String;
      // 039: invokevirtual java/lang/String.getBytes ()[B
      // 03c: invokevirtual aU.I ([B)V
      // 03f: aload 4
      // 041: new Uw_2
      // 044: dup
      // 045: getstatic yu_4.HEX Lyu_4;
      // 048: getstatic x9.ZRQINIT Lx9;
      // 04b: invokespecial Uw_2.<init> (Lyu_4;Lx9;)V
      // 04e: invokevirtual aU.C (LUb_2;)V
      // 051: iload 5
      // 053: ifne 204
      // 056: aload 0
      // 057: getfield DH.D Lke_4;
      // 05a: invokevirtual ke_4.J ()Z
      // 05d: ifne 204
      // 060: aload 3
      // 061: invokevirtual mp_2.G ()LUb_2;
      // 064: astore 7
      // 066: goto 096
      // 069: astore 8
      // 06b: iinc 6 1
      // 06e: iload 6
      // 070: aload 1
      // 071: ifnonnull 09b
      // 074: sipush 15346
      // 077: ldc2_w 1647012458863788561
      // 07a: invokestatic DH.a (IJ)I
      // 07d: if_icmple 096
      // 080: goto 087
      // 083: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: aload 4
      // 089: new Ut_2
      // 08c: dup
      // 08d: invokespecial Ut_2.<init> ()V
      // 090: invokevirtual aU.C (LUb_2;)V
      // 093: bipush 1
      // 094: istore 5
      // 096: aload 7
      // 098: instanceof Ut_2
      // 09b: aload 1
      // 09c: ifnonnull 0bc
      // 09f: ifeq 0ac
      // 0a2: goto 0a9
      // 0a5: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: bipush 1
      // 0aa: istore 5
      // 0ac: aload 7
      // 0ae: aload 1
      // 0af: ifnonnull 0c1
      // 0b2: instanceof Uw_2
      // 0b5: goto 0bc
      // 0b8: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: ifeq 051
      // 0bf: aload 7
      // 0c1: checkcast Uw_2
      // 0c4: astore 8
      // 0c6: getstatic Lu_2.A [I
      // 0c9: aload 8
      // 0cb: invokevirtual Uw_2.h ()Lx9;
      // 0ce: invokevirtual x9.ordinal ()I
      // 0d1: iaload
      // 0d2: aload 1
      // 0d3: ifnonnull 1f2
      // 0d6: tableswitch 276 1 4 34 159 246 257
      // 0f4: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: invokevirtual DH.O ()Z
      // 0fc: ifne 123
      // 0ff: goto 106
      // 102: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: aload 4
      // 108: new Uw_2
      // 10b: dup
      // 10c: getstatic yu_4.BIN Lyu_4;
      // 10f: getstatic x9.ZFIN Lx9;
      // 112: invokespecial Uw_2.<init> (Lyu_4;Lx9;)V
      // 115: invokevirtual aU.C (LUb_2;)V
      // 118: aload 1
      // 119: ifnull 200
      // 11c: goto 123
      // 11f: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: aload 4
      // 125: new Uw_2
      // 128: dup
      // 129: getstatic yu_4.BIN Lyu_4;
      // 12c: getstatic x9.ZFILE Lx9;
      // 12f: bipush 4
      // 130: newarray 8
      // 132: dup
      // 133: bipush 0
      // 134: bipush 0
      // 135: bastore
      // 136: dup
      // 137: bipush 1
      // 138: bipush 0
      // 139: bastore
      // 13a: dup
      // 13b: bipush 2
      // 13c: bipush 0
      // 13d: bastore
      // 13e: dup
      // 13f: bipush 3
      // 140: bipush 1
      // 141: anewarray 234
      // 144: dup
      // 145: bipush 0
      // 146: getstatic dg_4.ZCBIN Ldg_4;
      // 149: aastore
      // 14a: invokestatic dg_4.f ([Ldg_4;)B
      // 14d: bastore
      // 14e: invokespecial Uw_2.<init> (Lyu_4;Lx9;[B)V
      // 151: invokevirtual aU.C (LUb_2;)V
      // 154: aload 4
      // 156: aload 2
      // 157: aload 0
      // 158: getfield DH.u Ljava/lang/String;
      // 15b: aload 0
      // 15c: getfield DH.c LFY;
      // 15f: invokeinterface FY.F ()J 1
      // 164: invokevirtual KP.g (Ljava/lang/String;J)LUK;
      // 167: invokevirtual aU.C (LUb_2;)V
      // 16a: aload 1
      // 16b: ifnull 200
      // 16e: goto 175
      // 171: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 174: athrow
      // 175: aload 0
      // 176: aload 1
      // 177: ifnonnull 196
      // 17a: goto 181
      // 17d: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: getfield DH.T Z
      // 184: ifne 200
      // 187: goto 18e
      // 18a: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: aload 0
      // 18f: goto 196
      // 192: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 195: athrow
      // 196: aload 8
      // 198: invokevirtual Uw_2.Q ()I
      // 19b: invokespecial DH.n (I)V
      // 19e: ldc2_w 388376917454860932
      // 1a1: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1a4: aconst_null
      // 1a5: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1a8: new Cu_2
      // 1ab: dup
      // 1ac: aload 0
      // 1ad: aload 4
      // 1af: invokespecial Cu_2.<init> (LDH;LaU;)V
      // 1b2: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b5: ldc2_w 434592463220957006
      // 1b8: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1bb: dup_x2
      // 1bc: pop
      // 1bd: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1c0: pop
      // 1c1: goto 1c8
      // 1c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c7: athrow
      // 1c8: aload 1
      // 1c9: ifnull 200
      // 1cc: aload 1
      // 1cd: ifnull 200
      // 1d0: goto 1d7
      // 1d3: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d6: athrow
      // 1d7: bipush 1
      // 1d8: istore 5
      // 1da: aload 4
      // 1dc: new Um_2
      // 1df: dup
      // 1e0: invokespecial Um_2.<init> ()V
      // 1e3: invokevirtual aU.C (LUb_2;)V
      // 1e6: aload 1
      // 1e7: ifnull 200
      // 1ea: bipush 1
      // 1eb: goto 1f2
      // 1ee: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f1: athrow
      // 1f2: istore 5
      // 1f4: aload 4
      // 1f6: new Ut_2
      // 1f9: dup
      // 1fa: invokespecial Ut_2.<init> ()V
      // 1fd: invokevirtual aU.C (LUb_2;)V
      // 200: aload 1
      // 201: ifnull 051
      // 204: goto 240
      // 207: astore 5
      // 209: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 20c: new java/lang/StringBuilder
      // 20f: dup
      // 210: invokespecial java/lang/StringBuilder.<init> ()V
      // 213: sipush 3045
      // 216: sipush -10631
      // 219: invokestatic DH.a (II)Ljava/lang/String;
      // 21c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21f: aload 0
      // 220: getfield DH.c LFY;
      // 223: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 226: sipush 3046
      // 229: sipush 22976
      // 22c: invokestatic DH.a (II)Ljava/lang/String;
      // 22f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 232: aload 5
      // 234: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 237: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 23d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 240: return
   }

   void H(aU param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Ub_2.A ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield DH.T Z
      // 08: ifne 6b
      // 0b: aload 0
      // 0c: getfield DH.D Lke_4;
      // 0f: invokevirtual ke_4.J ()Z
      // 12: aload 2
      // 13: ifnonnull 48
      // 16: ifne 6b
      // 19: goto 20
      // 1c: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 1
      // 21: new Uw_2
      // 24: dup
      // 25: getstatic yu_4.BIN Lyu_4;
      // 28: getstatic x9.ZDATA Lx9;
      // 2b: aload 0
      // 2c: getfield DH.W I
      // 2f: invokespecial Uw_2.<init> (Lyu_4;Lx9;I)V
      // 32: invokevirtual aU.C (LUb_2;)V
      // 35: aload 1
      // 36: aload 0
      // 37: invokespecial DH.m ()LUK;
      // 3a: invokevirtual aU.C (LUb_2;)V
      // 3d: aload 0
      // 3e: getfield DH.T Z
      // 41: goto 48
      // 44: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: ifeq 04
      // 4b: aload 1
      // 4c: new Uw_2
      // 4f: dup
      // 50: getstatic yu_4.HEX Lyu_4;
      // 53: getstatic x9.ZEOF Lx9;
      // 56: aload 0
      // 57: getfield DH.W I
      // 5a: invokespecial Uw_2.<init> (Lyu_4;Lx9;I)V
      // 5d: invokevirtual aU.C (LUb_2;)V
      // 60: aload 2
      // 61: ifnonnull 6b
      // 64: goto 6b
      // 67: invokestatic DH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "Ù·ò\u0016s3Ö\u000f'Q\u0018\u0004ïoâfÀè\u0003(]ÂÌG¬P\u0002{Ï";
      int var12 = "Ù·ò\u0016s3Ö\u000f'Q\u0018\u0004ïoâfÀè\u0003(]ÂÌG¬P\u0002{Ï".length();
      char var9 = 3;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 113;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 113;
               var10006 = var14;
            } else {
               var23 = 113;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 113;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 71;
                     break;
                  case 1:
                     var41 = 100;
                     break;
                  case 2:
                     var41 = 79;
                     break;
                  case 3:
                     var41 = 89;
                     break;
                  case 4:
                     var41 = 23;
                     break;
                  case 5:
                     var41 = 74;
                     break;
                  default:
                     var41 = 83;
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
            b = var13;
            e = new String[3];
            long var0 = 951360171334414631L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "\\W\u001aDîï³\"fÕÄn\u0099p\fÑ";
            int var5 = "\\W\u001aDîï³\"fÕÄn\u0099p\fÑ".length();
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

            f = var6;
            g = new Integer[2];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 3044) & 65535;
      if (e[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 55;
               break;
            case 1:
               var10000 = 203;
               break;
            case 2:
               var10000 = 89;
               break;
            case 3:
               var10000 = 153;
               break;
            case 4:
               var10000 = 163;
               break;
            case 5:
               var10000 = 130;
               break;
            case 6:
               var10000 = 69;
               break;
            case 7:
               var10000 = 32;
               break;
            case 8:
               var10000 = 191;
               break;
            case 9:
               var10000 = 124;
               break;
            case 10:
               var10000 = 177;
               break;
            case 11:
               var10000 = 105;
               break;
            case 12:
               var10000 = 68;
               break;
            case 13:
               var10000 = 236;
               break;
            case 14:
               var10000 = 87;
               break;
            case 15:
               var10000 = 210;
               break;
            case 16:
               var10000 = 201;
               break;
            case 17:
               var10000 = 235;
               break;
            case 18:
               var10000 = 29;
               break;
            case 19:
               var10000 = 190;
               break;
            case 20:
               var10000 = 0;
               break;
            case 21:
               var10000 = 64;
               break;
            case 22:
               var10000 = 48;
               break;
            case 23:
               var10000 = 204;
               break;
            case 24:
               var10000 = 214;
               break;
            case 25:
               var10000 = 37;
               break;
            case 26:
               var10000 = 11;
               break;
            case 27:
               var10000 = 62;
               break;
            case 28:
               var10000 = 51;
               break;
            case 29:
               var10000 = 150;
               break;
            case 30:
               var10000 = 99;
               break;
            case 31:
               var10000 = 61;
               break;
            case 32:
               var10000 = 244;
               break;
            case 33:
               var10000 = 209;
               break;
            case 34:
               var10000 = 76;
               break;
            case 35:
               var10000 = 104;
               break;
            case 36:
               var10000 = 174;
               break;
            case 37:
               var10000 = 72;
               break;
            case 38:
               var10000 = 242;
               break;
            case 39:
               var10000 = 146;
               break;
            case 40:
               var10000 = 133;
               break;
            case 41:
               var10000 = 20;
               break;
            case 42:
               var10000 = 19;
               break;
            case 43:
               var10000 = 212;
               break;
            case 44:
               var10000 = 98;
               break;
            case 45:
               var10000 = 241;
               break;
            case 46:
               var10000 = 16;
               break;
            case 47:
               var10000 = 159;
               break;
            case 48:
               var10000 = 4;
               break;
            case 49:
               var10000 = 197;
               break;
            case 50:
               var10000 = 224;
               break;
            case 51:
               var10000 = 128;
               break;
            case 52:
               var10000 = 47;
               break;
            case 53:
               var10000 = 144;
               break;
            case 54:
               var10000 = 120;
               break;
            case 55:
               var10000 = 151;
               break;
            case 56:
               var10000 = 155;
               break;
            case 57:
               var10000 = 231;
               break;
            case 58:
               var10000 = 245;
               break;
            case 59:
               var10000 = 213;
               break;
            case 60:
               var10000 = 52;
               break;
            case 61:
               var10000 = 88;
               break;
            case 62:
               var10000 = 86;
               break;
            case 63:
               var10000 = 117;
               break;
            case 64:
               var10000 = 181;
               break;
            case 65:
               var10000 = 143;
               break;
            case 66:
               var10000 = 240;
               break;
            case 67:
               var10000 = 139;
               break;
            case 68:
               var10000 = 243;
               break;
            case 69:
               var10000 = 109;
               break;
            case 70:
               var10000 = 196;
               break;
            case 71:
               var10000 = 83;
               break;
            case 72:
               var10000 = 116;
               break;
            case 73:
               var10000 = 184;
               break;
            case 74:
               var10000 = 238;
               break;
            case 75:
               var10000 = 100;
               break;
            case 76:
               var10000 = 82;
               break;
            case 77:
               var10000 = 95;
               break;
            case 78:
               var10000 = 17;
               break;
            case 79:
               var10000 = 152;
               break;
            case 80:
               var10000 = 165;
               break;
            case 81:
               var10000 = 173;
               break;
            case 82:
               var10000 = 206;
               break;
            case 83:
               var10000 = 126;
               break;
            case 84:
               var10000 = 215;
               break;
            case 85:
               var10000 = 3;
               break;
            case 86:
               var10000 = 94;
               break;
            case 87:
               var10000 = 205;
               break;
            case 88:
               var10000 = 25;
               break;
            case 89:
               var10000 = 18;
               break;
            case 90:
               var10000 = 27;
               break;
            case 91:
               var10000 = 45;
               break;
            case 92:
               var10000 = 85;
               break;
            case 93:
               var10000 = 34;
               break;
            case 94:
               var10000 = 211;
               break;
            case 95:
               var10000 = 127;
               break;
            case 96:
               var10000 = 91;
               break;
            case 97:
               var10000 = 254;
               break;
            case 98:
               var10000 = 255;
               break;
            case 99:
               var10000 = 46;
               break;
            case 100:
               var10000 = 49;
               break;
            case 101:
               var10000 = 22;
               break;
            case 102:
               var10000 = 97;
               break;
            case 103:
               var10000 = 75;
               break;
            case 104:
               var10000 = 23;
               break;
            case 105:
               var10000 = 138;
               break;
            case 106:
               var10000 = 77;
               break;
            case 107:
               var10000 = 65;
               break;
            case 108:
               var10000 = 233;
               break;
            case 109:
               var10000 = 56;
               break;
            case 110:
               var10000 = 110;
               break;
            case 111:
               var10000 = 178;
               break;
            case 112:
               var10000 = 108;
               break;
            case 113:
               var10000 = 182;
               break;
            case 114:
               var10000 = 74;
               break;
            case 115:
               var10000 = 102;
               break;
            case 116:
               var10000 = 57;
               break;
            case 117:
               var10000 = 208;
               break;
            case 118:
               var10000 = 180;
               break;
            case 119:
               var10000 = 8;
               break;
            case 120:
               var10000 = 248;
               break;
            case 121:
               var10000 = 2;
               break;
            case 122:
               var10000 = 73;
               break;
            case 123:
               var10000 = 31;
               break;
            case 124:
               var10000 = 166;
               break;
            case 125:
               var10000 = 183;
               break;
            case 126:
               var10000 = 230;
               break;
            case 127:
               var10000 = 7;
               break;
            case 128:
               var10000 = 170;
               break;
            case 129:
               var10000 = 232;
               break;
            case 130:
               var10000 = 145;
               break;
            case 131:
               var10000 = 202;
               break;
            case 132:
               var10000 = 111;
               break;
            case 133:
               var10000 = 21;
               break;
            case 134:
               var10000 = 234;
               break;
            case 135:
               var10000 = 70;
               break;
            case 136:
               var10000 = 172;
               break;
            case 137:
               var10000 = 93;
               break;
            case 138:
               var10000 = 171;
               break;
            case 139:
               var10000 = 92;
               break;
            case 140:
               var10000 = 125;
               break;
            case 141:
               var10000 = 60;
               break;
            case 142:
               var10000 = 114;
               break;
            case 143:
               var10000 = 14;
               break;
            case 144:
               var10000 = 132;
               break;
            case 145:
               var10000 = 137;
               break;
            case 146:
               var10000 = 216;
               break;
            case 147:
               var10000 = 66;
               break;
            case 148:
               var10000 = 217;
               break;
            case 149:
               var10000 = 24;
               break;
            case 150:
               var10000 = 54;
               break;
            case 151:
               var10000 = 164;
               break;
            case 152:
               var10000 = 169;
               break;
            case 153:
               var10000 = 157;
               break;
            case 154:
               var10000 = 140;
               break;
            case 155:
               var10000 = 175;
               break;
            case 156:
               var10000 = 107;
               break;
            case 157:
               var10000 = 225;
               break;
            case 158:
               var10000 = 136;
               break;
            case 159:
               var10000 = 38;
               break;
            case 160:
               var10000 = 13;
               break;
            case 161:
               var10000 = 246;
               break;
            case 162:
               var10000 = 134;
               break;
            case 163:
               var10000 = 84;
               break;
            case 164:
               var10000 = 168;
               break;
            case 165:
               var10000 = 253;
               break;
            case 166:
               var10000 = 149;
               break;
            case 167:
               var10000 = 43;
               break;
            case 168:
               var10000 = 237;
               break;
            case 169:
               var10000 = 12;
               break;
            case 170:
               var10000 = 250;
               break;
            case 171:
               var10000 = 42;
               break;
            case 172:
               var10000 = 30;
               break;
            case 173:
               var10000 = 33;
               break;
            case 174:
               var10000 = 28;
               break;
            case 175:
               var10000 = 176;
               break;
            case 176:
               var10000 = 186;
               break;
            case 177:
               var10000 = 113;
               break;
            case 178:
               var10000 = 15;
               break;
            case 179:
               var10000 = 90;
               break;
            case 180:
               var10000 = 188;
               break;
            case 181:
               var10000 = 121;
               break;
            case 182:
               var10000 = 9;
               break;
            case 183:
               var10000 = 162;
               break;
            case 184:
               var10000 = 227;
               break;
            case 185:
               var10000 = 119;
               break;
            case 186:
               var10000 = 44;
               break;
            case 187:
               var10000 = 115;
               break;
            case 188:
               var10000 = 59;
               break;
            case 189:
               var10000 = 53;
               break;
            case 190:
               var10000 = 41;
               break;
            case 191:
               var10000 = 221;
               break;
            case 192:
               var10000 = 218;
               break;
            case 193:
               var10000 = 106;
               break;
            case 194:
               var10000 = 80;
               break;
            case 195:
               var10000 = 67;
               break;
            case 196:
               var10000 = 10;
               break;
            case 197:
               var10000 = 247;
               break;
            case 198:
               var10000 = 135;
               break;
            case 199:
               var10000 = 252;
               break;
            case 200:
               var10000 = 199;
               break;
            case 201:
               var10000 = 249;
               break;
            case 202:
               var10000 = 78;
               break;
            case 203:
               var10000 = 158;
               break;
            case 204:
               var10000 = 26;
               break;
            case 205:
               var10000 = 58;
               break;
            case 206:
               var10000 = 198;
               break;
            case 207:
               var10000 = 35;
               break;
            case 208:
               var10000 = 6;
               break;
            case 209:
               var10000 = 161;
               break;
            case 210:
               var10000 = 101;
               break;
            case 211:
               var10000 = 50;
               break;
            case 212:
               var10000 = 226;
               break;
            case 213:
               var10000 = 195;
               break;
            case 214:
               var10000 = 123;
               break;
            case 215:
               var10000 = 239;
               break;
            case 216:
               var10000 = 228;
               break;
            case 217:
               var10000 = 129;
               break;
            case 218:
               var10000 = 220;
               break;
            case 219:
               var10000 = 194;
               break;
            case 220:
               var10000 = 148;
               break;
            case 221:
               var10000 = 251;
               break;
            case 222:
               var10000 = 200;
               break;
            case 223:
               var10000 = 122;
               break;
            case 224:
               var10000 = 71;
               break;
            case 225:
               var10000 = 192;
               break;
            case 226:
               var10000 = 193;
               break;
            case 227:
               var10000 = 5;
               break;
            case 228:
               var10000 = 154;
               break;
            case 229:
               var10000 = 142;
               break;
            case 230:
               var10000 = 147;
               break;
            case 231:
               var10000 = 219;
               break;
            case 232:
               var10000 = 79;
               break;
            case 233:
               var10000 = 179;
               break;
            case 234:
               var10000 = 185;
               break;
            case 235:
               var10000 = 63;
               break;
            case 236:
               var10000 = 39;
               break;
            case 237:
               var10000 = 223;
               break;
            case 238:
               var10000 = 222;
               break;
            case 239:
               var10000 = 1;
               break;
            case 240:
               var10000 = 131;
               break;
            case 241:
               var10000 = 229;
               break;
            case 242:
               var10000 = 189;
               break;
            case 243:
               var10000 = 103;
               break;
            case 244:
               var10000 = 36;
               break;
            case 245:
               var10000 = 40;
               break;
            case 246:
               var10000 = 187;
               break;
            case 247:
               var10000 = 160;
               break;
            case 248:
               var10000 = 81;
               break;
            case 249:
               var10000 = 96;
               break;
            case 250:
               var10000 = 167;
               break;
            case 251:
               var10000 = 207;
               break;
            case 252:
               var10000 = 141;
               break;
            case 253:
               var10000 = 112;
               break;
            case 254:
               var10000 = 156;
               break;
            default:
               var10000 = 118;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14819;
      if (g[var3] == null) {
         g[var3] = (int)(f[var3] ^ var1);
      }

      return g[var3];
   }
}





