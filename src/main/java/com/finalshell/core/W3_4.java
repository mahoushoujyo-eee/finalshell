package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.StringTokenizer;

public abstract class W3_4 extends ClassLoader {
   @C_9
   public B_4 X;
   public static String[] a;
   public static String[] b;

   public W3_4() {
   }

   public W3_4(ClassLoader var1) {
      super(var1);
   }

   @F_4(false)
   @Override
   public InputStream getResourceAsStream(String var1) {
      return super.getParent().getResourceAsStream(var1);
   }

   public abstract void K(File[] var1);

   public abstract void f(J_5 var1);

   public void Q(@C_9 String var1) {
      Charset var3;
      label14: {
         Ky4[] var2 = D22_2.b();
         String var10001 = var1;
         if (var2 != null) {
            if (var1 == null) {
               var3 = Charset.defaultCharset();
               break label14;
            }

            var10001 = var1;
         }

         var3 = Charset.forName(var10001);
      }

      this.n(var3);
   }

   public abstract void n(Charset var1);

   public abstract void H(boolean var1, boolean var2, boolean var3);

   public final void q(@C_9 B_4 var1) {
      this.X = var1;
   }

   public static void main(String[] param0) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/D22_2.b ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aconst_null
      // 004: astore 2
      // 005: astore 1
      // 006: aconst_null
      // 007: astore 3
      // 008: bipush 0
      // 009: istore 4
      // 00b: bipush 0
      // 00c: istore 5
      // 00e: bipush 0
      // 00f: istore 6
      // 011: bipush 0
      // 012: istore 7
      // 014: bipush 0
      // 015: istore 8
      // 017: iload 8
      // 019: aload 0
      // 01a: arraylength
      // 01b: if_icmpge 300
      // 01e: aload 0
      // 01f: iload 8
      // 021: aaload
      // 022: astore 9
      // 024: aload 9
      // 026: ldc "-"
      // 028: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 02b: aload 1
      // 02c: ifnull 302
      // 02f: aload 1
      // 030: ifnull 055
      // 033: goto 03a
      // 036: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 039: athrow
      // 03a: ifne 047
      // 03d: goto 044
      // 040: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 043: athrow
      // 044: goto 300
      // 047: sipush 16059
      // 04a: sipush 7365
      // 04d: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 050: aload 9
      // 052: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 055: aload 1
      // 056: ifnull 087
      // 059: ifeq 072
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 062: athrow
      // 063: aload 0
      // 064: iinc 8 1
      // 067: iload 8
      // 069: aaload
      // 06a: invokestatic com/finalshell/core/W3_4.F (Ljava/lang/String;)[Ljava/io/File;
      // 06d: astore 2
      // 06e: aload 1
      // 06f: ifnonnull 2f9
      // 072: sipush 16035
      // 075: sipush 18263
      // 078: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 07b: aload 9
      // 07d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 086: athrow
      // 087: aload 1
      // 088: ifnull 0b6
      // 08b: ifeq 0a1
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 094: athrow
      // 095: aload 0
      // 096: iinc 8 1
      // 099: iload 8
      // 09b: aaload
      // 09c: astore 3
      // 09d: aload 1
      // 09e: ifnonnull 2f9
      // 0a1: sipush 16052
      // 0a4: sipush -18516
      // 0a7: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 0aa: aload 9
      // 0ac: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 0b5: athrow
      // 0b6: aload 1
      // 0b7: ifnull 0e9
      // 0ba: ifeq 0d4
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 0c3: athrow
      // 0c4: bipush 1
      // 0c5: istore 4
      // 0c7: bipush 1
      // 0c8: istore 5
      // 0ca: bipush 1
      // 0cb: istore 6
      // 0cd: bipush 1
      // 0ce: istore 7
      // 0d0: aload 1
      // 0d1: ifnonnull 2f9
      // 0d4: sipush 16057
      // 0d7: sipush 392
      // 0da: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 0dd: aload 9
      // 0df: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e2: goto 0e9
      // 0e5: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 0e8: athrow
      // 0e9: aload 1
      // 0ea: ifnull 11c
      // 0ed: ifeq 107
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 0f6: athrow
      // 0f7: bipush 0
      // 0f8: istore 4
      // 0fa: bipush 0
      // 0fb: istore 5
      // 0fd: bipush 0
      // 0fe: istore 6
      // 100: bipush 1
      // 101: istore 7
      // 103: aload 1
      // 104: ifnonnull 2f9
      // 107: sipush 16042
      // 10a: sipush 629
      // 10d: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 110: aload 9
      // 112: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 115: goto 11c
      // 118: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 11b: athrow
      // 11c: aload 1
      // 11d: ifnull 1ce
      // 120: ifeq 1b9
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 129: athrow
      // 12a: aload 9
      // 12c: sipush 16054
      // 12f: sipush -21082
      // 132: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 135: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 138: aload 1
      // 139: ifnull 156
      // 13c: goto 143
      // 13f: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 142: athrow
      // 143: bipush -1
      // 144: if_icmpeq 159
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 14d: athrow
      // 14e: bipush 1
      // 14f: goto 156
      // 152: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 155: athrow
      // 156: goto 15a
      // 159: bipush 0
      // 15a: istore 4
      // 15c: aload 9
      // 15e: sipush 16044
      // 161: sipush -24515
      // 164: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 167: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 16a: aload 1
      // 16b: ifnull 181
      // 16e: bipush -1
      // 16f: if_icmpeq 184
      // 172: goto 179
      // 175: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 178: athrow
      // 179: bipush 1
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 180: athrow
      // 181: goto 185
      // 184: bipush 0
      // 185: istore 5
      // 187: aload 9
      // 189: sipush 16063
      // 18c: sipush 4594
      // 18f: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 192: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 195: aload 1
      // 196: ifnull 1ac
      // 199: bipush -1
      // 19a: if_icmpeq 1af
      // 19d: goto 1a4
      // 1a0: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 1a3: athrow
      // 1a4: bipush 1
      // 1a5: goto 1ac
      // 1a8: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 1ab: athrow
      // 1ac: goto 1b0
      // 1af: bipush 0
      // 1b0: istore 6
      // 1b2: bipush 1
      // 1b3: istore 7
      // 1b5: aload 1
      // 1b6: ifnonnull 2f9
      // 1b9: sipush 16061
      // 1bc: sipush 9679
      // 1bf: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 1c2: aload 9
      // 1c4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1c7: goto 1ce
      // 1ca: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 1cd: athrow
      // 1ce: aload 1
      // 1cf: ifnull 2f6
      // 1d2: ifeq 2c1
      // 1d5: goto 1dc
      // 1d8: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 1db: athrow
      // 1dc: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 1df: sipush 16043
      // 1e2: sipush -5085
      // 1e5: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 1e8: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 1eb: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 1ee: new java/lang/StringBuilder
      // 1f1: dup
      // 1f2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f5: sipush 16045
      // 1f8: sipush 663
      // 1fb: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 1fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 201: ldc com/finalshell/core/W3_4
      // 203: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 206: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 209: sipush 16034
      // 20c: sipush 5830
      // 20f: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 212: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 215: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 218: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 21b: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 21e: sipush 16048
      // 221: sipush -23800
      // 224: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 227: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 22a: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 22d: sipush 16055
      // 230: sipush -25148
      // 233: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 236: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 239: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 23c: sipush 16062
      // 23f: sipush -27499
      // 242: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 245: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 248: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 24b: new java/lang/StringBuilder
      // 24e: dup
      // 24f: invokespecial java/lang/StringBuilder.<init> ()V
      // 252: sipush 16046
      // 255: sipush -30922
      // 258: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 25b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25e: getstatic java/io/File.pathSeparator Ljava/lang/String;
      // 261: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 264: sipush 16049
      // 267: sipush 10242
      // 26a: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 26d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 270: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 273: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 276: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 279: sipush 16058
      // 27c: sipush -9235
      // 27f: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 282: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 285: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 288: sipush 16050
      // 28b: sipush -29879
      // 28e: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 291: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 294: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 297: sipush 16047
      // 29a: sipush 3675
      // 29d: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 2a0: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 2a3: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 2a6: sipush 16053
      // 2a9: sipush -17193
      // 2ac: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 2af: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 2b2: bipush 0
      // 2b3: invokestatic java/lang/System.exit (I)V
      // 2b6: aload 1
      // 2b7: ifnonnull 2f9
      // 2ba: goto 2c1
      // 2bd: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 2c0: athrow
      // 2c1: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 2c4: new java/lang/StringBuilder
      // 2c7: dup
      // 2c8: invokespecial java/lang/StringBuilder.<init> ()V
      // 2cb: sipush 16040
      // 2ce: sipush 1899
      // 2d1: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 2d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d7: aload 9
      // 2d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2dc: sipush 16056
      // 2df: sipush -17898
      // 2e2: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 2e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2eb: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 2ee: bipush 1
      // 2ef: goto 2f6
      // 2f2: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 2f5: athrow
      // 2f6: invokestatic java/lang/System.exit (I)V
      // 2f9: iinc 8 1
      // 2fc: aload 1
      // 2fd: ifnonnull 017
      // 300: iload 8
      // 302: aload 1
      // 303: ifnull 329
      // 306: aload 0
      // 307: arraylength
      // 308: if_icmpne 32c
      // 30b: goto 312
      // 30e: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 311: athrow
      // 312: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 315: sipush 16041
      // 318: sipush -10293
      // 31b: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 31e: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 321: bipush 1
      // 322: goto 329
      // 325: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 328: athrow
      // 329: invokestatic java/lang/System.exit (I)V
      // 32c: aload 0
      // 32d: iload 8
      // 32f: iinc 8 1
      // 332: aaload
      // 333: astore 9
      // 335: aload 0
      // 336: arraylength
      // 337: iload 8
      // 339: isub
      // 33a: anewarray 70
      // 33d: astore 10
      // 33f: aload 0
      // 340: iload 8
      // 342: aload 10
      // 344: bipush 0
      // 345: aload 0
      // 346: arraylength
      // 347: iload 8
      // 349: isub
      // 34a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 34d: ldc com/finalshell/core/W3_4
      // 34f: invokevirtual java/lang/Class.getClassLoader ()Ljava/lang/ClassLoader;
      // 352: invokestatic com/finalshell/core/Z3_2.A (Ljava/lang/ClassLoader;)Lcom/finalshell/core/U_2_2;
      // 355: invokeinterface com/finalshell/core/U_2_2.C ()Lcom/finalshell/core/W3_4; 1
      // 35a: astore 11
      // 35c: iload 7
      // 35e: ifeq 373
      // 361: aload 11
      // 363: iload 4
      // 365: iload 5
      // 367: iload 6
      // 369: invokevirtual com/finalshell/core/W3_4.H (ZZZ)V
      // 36c: goto 373
      // 36f: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 372: athrow
      // 373: aload 3
      // 374: ifnull 384
      // 377: aload 11
      // 379: aload 3
      // 37a: invokevirtual com/finalshell/core/W3_4.Q (Ljava/lang/String;)V
      // 37d: goto 384
      // 380: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 383: athrow
      // 384: aload 2
      // 385: ifnull 395
      // 388: aload 11
      // 38a: aload 2
      // 38b: invokevirtual com/finalshell/core/W3_4.K ([Ljava/io/File;)V
      // 38e: goto 395
      // 391: invokestatic com/finalshell/core/W3_4.a (Ljava/lang/NoSuchMethodException;)Ljava/lang/NoSuchMethodException;
      // 394: athrow
      // 395: aload 11
      // 397: aload 9
      // 399: invokevirtual com/finalshell/core/W3_4.loadClass (Ljava/lang/String;)Ljava/lang/Class;
      // 39c: astore 12
      // 39e: aload 12
      // 3a0: sipush 16051
      // 3a3: sipush -11891
      // 3a6: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 3a9: bipush 1
      // 3aa: anewarray 112
      // 3ad: dup
      // 3ae: bipush 0
      // 3af: ldc [Ljava/lang/String;
      // 3b1: aastore
      // 3b2: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 3b5: astore 13
      // 3b7: goto 3ee
      // 3ba: astore 14
      // 3bc: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 3bf: new java/lang/StringBuilder
      // 3c2: dup
      // 3c3: invokespecial java/lang/StringBuilder.<init> ()V
      // 3c6: sipush 16060
      // 3c9: sipush 974
      // 3cc: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 3cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d2: aload 9
      // 3d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d7: sipush 16032
      // 3da: sipush -22388
      // 3dd: invokestatic com/finalshell/core/W3_4.a (II)Ljava/lang/String;
      // 3e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3e6: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 3e9: bipush 1
      // 3ea: invokestatic java/lang/System.exit (I)V
      // 3ed: return
      // 3ee: aload 13
      // 3f0: aconst_null
      // 3f1: bipush 1
      // 3f2: anewarray 168
      // 3f5: dup
      // 3f6: bipush 0
      // 3f7: aload 10
      // 3f9: aastore
      // 3fa: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3fd: pop
      // 3fe: return
   }

   public static File[] F(String var0) {
      ArrayList var2 = new ArrayList();
      Ky4[] var10000 = D22_2.b();
      StringTokenizer var3 = new StringTokenizer(var0, File.pathSeparator);
      Ky4[] var1 = var10000;

      while (true) {
         if (var3.hasMoreTokens()) {
      Ky4[] var4;
            var4 = var2;
            if (var1 == null) {
               break;
            }

            var2.add(new File(var3.nextToken()));
            if (var1 != null) {
      Ky4[] var4;
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4.toArray(new File[var2.size()]);
   }

   public static NoSuchMethodException a(NoSuchMethodException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 16058) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 194;
               break;
            case 1:
               var10000 = 91;
               break;
            case 2:
               var10000 = 49;
               break;
            case 3:
               var10000 = 127;
               break;
            case 4:
               var10000 = 237;
               break;
            case 5:
               var10000 = 202;
               break;
            case 6:
               var10000 = 177;
               break;
            case 7:
               var10000 = 83;
               break;
            case 8:
               var10000 = 238;
               break;
            case 9:
               var10000 = 214;
               break;
            case 10:
               var10000 = 182;
               break;
            case 11:
               var10000 = 114;
               break;
            case 12:
               var10000 = 247;
               break;
            case 13:
               var10000 = 130;
               break;
            case 14:
               var10000 = 89;
               break;
            case 15:
               var10000 = 61;
               break;
            case 16:
               var10000 = 154;
               break;
            case 17:
               var10000 = 25;
               break;
            case 18:
               var10000 = 215;
               break;
            case 19:
               var10000 = 225;
               break;
            case 20:
               var10000 = 18;
               break;
            case 21:
               var10000 = 220;
               break;
            case 22:
               var10000 = 183;
               break;
            case 23:
               var10000 = 51;
               break;
            case 24:
               var10000 = 169;
               break;
            case 25:
               var10000 = 243;
               break;
            case 26:
               var10000 = 180;
               break;
            case 27:
               var10000 = 85;
               break;
            case 28:
               var10000 = 158;
               break;
            case 29:
               var10000 = 57;
               break;
            case 30:
               var10000 = 29;
               break;
            case 31:
               var10000 = 110;
               break;
            case 32:
               var10000 = 174;
               break;
            case 33:
               var10000 = 72;
               break;
            case 34:
               var10000 = 97;
               break;
            case 35:
               var10000 = 69;
               break;
            case 36:
               var10000 = 230;
               break;
            case 37:
               var10000 = 24;
               break;
            case 38:
               var10000 = 206;
               break;
            case 39:
               var10000 = 252;
               break;
            case 40:
               var10000 = 6;
               break;
            case 41:
               var10000 = 168;
               break;
            case 42:
               var10000 = 125;
               break;
            case 43:
               var10000 = 81;
               break;
            case 44:
               var10000 = 66;
               break;
            case 45:
               var10000 = 208;
               break;
            case 46:
               var10000 = 129;
               break;
            case 47:
               var10000 = 219;
               break;
            case 48:
               var10000 = 178;
               break;
            case 49:
               var10000 = 113;
               break;
            case 50:
               var10000 = 133;
               break;
            case 51:
               var10000 = 111;
               break;
            case 52:
               var10000 = 179;
               break;
            case 53:
               var10000 = 87;
               break;
            case 54:
               var10000 = 138;
               break;
            case 55:
               var10000 = 232;
               break;
            case 56:
               var10000 = 31;
               break;
            case 57:
               var10000 = 175;
               break;
            case 58:
               var10000 = 207;
               break;
            case 59:
               var10000 = 249;
               break;
            case 60:
               var10000 = 96;
               break;
            case 61:
               var10000 = 250;
               break;
            case 62:
               var10000 = 43;
               break;
            case 63:
               var10000 = 187;
               break;
            case 64:
               var10000 = 33;
               break;
            case 65:
               var10000 = 142;
               break;
            case 66:
               var10000 = 3;
               break;
            case 67:
               var10000 = 152;
               break;
            case 68:
               var10000 = 115;
               break;
            case 69:
               var10000 = 228;
               break;
            case 70:
               var10000 = 149;
               break;
            case 71:
               var10000 = 137;
               break;
            case 72:
               var10000 = 123;
               break;
            case 73:
               var10000 = 44;
               break;
            case 74:
               var10000 = 112;
               break;
            case 75:
               var10000 = 93;
               break;
            case 76:
               var10000 = 211;
               break;
            case 77:
               var10000 = 244;
               break;
            case 78:
               var10000 = 245;
               break;
            case 79:
               var10000 = 14;
               break;
            case 80:
               var10000 = 109;
               break;
            case 81:
               var10000 = 48;
               break;
            case 82:
               var10000 = 192;
               break;
            case 83:
               var10000 = 121;
               break;
            case 84:
               var10000 = 147;
               break;
            case 85:
               var10000 = 42;
               break;
            case 86:
               var10000 = 151;
               break;
            case 87:
               var10000 = 7;
               break;
            case 88:
               var10000 = 47;
               break;
            case 89:
               var10000 = 145;
               break;
            case 90:
               var10000 = 107;
               break;
            case 91:
               var10000 = 117;
               break;
            case 92:
               var10000 = 53;
               break;
            case 93:
               var10000 = 23;
               break;
            case 94:
               var10000 = 144;
               break;
            case 95:
               var10000 = 176;
               break;
            case 96:
               var10000 = 36;
               break;
            case 97:
               var10000 = 62;
               break;
            case 98:
               var10000 = 19;
               break;
            case 99:
               var10000 = 229;
               break;
            case 100:
               var10000 = 28;
               break;
            case 101:
               var10000 = 132;
               break;
            case 102:
               var10000 = 234;
               break;
            case 103:
               var10000 = 173;
               break;
            case 104:
               var10000 = 30;
               break;
            case 105:
               var10000 = 11;
               break;
            case 106:
               var10000 = 46;
               break;
            case 107:
               var10000 = 9;
               break;
            case 108:
               var10000 = 59;
               break;
            case 109:
               var10000 = 128;
               break;
            case 110:
               var10000 = 171;
               break;
            case 111:
               var10000 = 102;
               break;
            case 112:
               var10000 = 140;
               break;
            case 113:
               var10000 = 172;
               break;
            case 114:
               var10000 = 68;
               break;
            case 115:
               var10000 = 120;
               break;
            case 116:
               var10000 = 162;
               break;
            case 117:
               var10000 = 204;
               break;
            case 118:
               var10000 = 55;
               break;
            case 119:
               var10000 = 248;
               break;
            case 120:
               var10000 = 40;
               break;
            case 121:
               var10000 = 197;
               break;
            case 122:
               var10000 = 226;
               break;
            case 123:
               var10000 = 5;
               break;
            case 124:
               var10000 = 38;
               break;
            case 125:
               var10000 = 148;
               break;
            case 126:
               var10000 = 90;
               break;
            case 127:
               var10000 = 77;
               break;
            case 128:
               var10000 = 255;
               break;
            case 129:
               var10000 = 70;
               break;
            case 130:
               var10000 = 134;
               break;
            case 131:
               var10000 = 35;
               break;
            case 132:
               var10000 = 253;
               break;
            case 133:
               var10000 = 163;
               break;
            case 134:
               var10000 = 205;
               break;
            case 135:
               var10000 = 27;
               break;
            case 136:
               var10000 = 166;
               break;
            case 137:
               var10000 = 105;
               break;
            case 138:
               var10000 = 58;
               break;
            case 139:
               var10000 = 78;
               break;
            case 140:
               var10000 = 13;
               break;
            case 141:
               var10000 = 251;
               break;
            case 142:
               var10000 = 136;
               break;
            case 143:
               var10000 = 198;
               break;
            case 144:
               var10000 = 124;
               break;
            case 145:
               var10000 = 222;
               break;
            case 146:
               var10000 = 118;
               break;
            case 147:
               var10000 = 170;
               break;
            case 148:
               var10000 = 8;
               break;
            case 149:
               var10000 = 88;
               break;
            case 150:
               var10000 = 156;
               break;
            case 151:
               var10000 = 235;
               break;
            case 152:
               var10000 = 26;
               break;
            case 153:
               var10000 = 159;
               break;
            case 154:
               var10000 = 94;
               break;
            case 155:
               var10000 = 160;
               break;
            case 156:
               var10000 = 184;
               break;
            case 157:
               var10000 = 86;
               break;
            case 158:
               var10000 = 203;
               break;
            case 159:
               var10000 = 32;
               break;
            case 160:
               var10000 = 218;
               break;
            case 161:
               var10000 = 181;
               break;
            case 162:
               var10000 = 71;
               break;
            case 163:
               var10000 = 191;
               break;
            case 164:
               var10000 = 143;
               break;
            case 165:
               var10000 = 135;
               break;
            case 166:
               var10000 = 104;
               break;
            case 167:
               var10000 = 139;
               break;
            case 168:
               var10000 = 100;
               break;
            case 169:
               var10000 = 190;
               break;
            case 170:
               var10000 = 106;
               break;
            case 171:
               var10000 = 2;
               break;
            case 172:
               var10000 = 209;
               break;
            case 173:
               var10000 = 1;
               break;
            case 174:
               var10000 = 52;
               break;
            case 175:
               var10000 = 37;
               break;
            case 176:
               var10000 = 16;
               break;
            case 177:
               var10000 = 4;
               break;
            case 178:
               var10000 = 242;
               break;
            case 179:
               var10000 = 161;
               break;
            case 180:
               var10000 = 246;
               break;
            case 181:
               var10000 = 131;
               break;
            case 182:
               var10000 = 20;
               break;
            case 183:
               var10000 = 39;
               break;
            case 184:
               var10000 = 146;
               break;
            case 185:
               var10000 = 212;
               break;
            case 186:
               var10000 = 76;
               break;
            case 187:
               var10000 = 196;
               break;
            case 188:
               var10000 = 122;
               break;
            case 189:
               var10000 = 201;
               break;
            case 190:
               var10000 = 15;
               break;
            case 191:
               var10000 = 34;
               break;
            case 192:
               var10000 = 98;
               break;
            case 193:
               var10000 = 224;
               break;
            case 194:
               var10000 = 186;
               break;
            case 195:
               var10000 = 75;
               break;
            case 196:
               var10000 = 119;
               break;
            case 197:
               var10000 = 21;
               break;
            case 198:
               var10000 = 108;
               break;
            case 199:
               var10000 = 213;
               break;
            case 200:
               var10000 = 164;
               break;
            case 201:
               var10000 = 200;
               break;
            case 202:
               var10000 = 84;
               break;
            case 203:
               var10000 = 92;
               break;
            case 204:
               var10000 = 141;
               break;
            case 205:
               var10000 = 82;
               break;
            case 206:
               var10000 = 193;
               break;
            case 207:
               var10000 = 45;
               break;
            case 208:
               var10000 = 189;
               break;
            case 209:
               var10000 = 210;
               break;
            case 210:
               var10000 = 157;
               break;
            case 211:
               var10000 = 231;
               break;
            case 212:
               var10000 = 95;
               break;
            case 213:
               var10000 = 233;
               break;
            case 214:
               var10000 = 155;
               break;
            case 215:
               var10000 = 67;
               break;
            case 216:
               var10000 = 56;
               break;
            case 217:
               var10000 = 12;
               break;
            case 218:
               var10000 = 116;
               break;
            case 219:
               var10000 = 239;
               break;
            case 220:
               var10000 = 153;
               break;
            case 221:
               var10000 = 216;
               break;
            case 222:
               var10000 = 63;
               break;
            case 223:
               var10000 = 60;
               break;
            case 224:
               var10000 = 22;
               break;
            case 225:
               var10000 = 240;
               break;
            case 226:
               var10000 = 73;
               break;
            case 227:
               var10000 = 227;
               break;
            case 228:
               var10000 = 195;
               break;
            case 229:
               var10000 = 126;
               break;
            case 230:
               var10000 = 99;
               break;
            case 231:
               var10000 = 150;
               break;
            case 232:
               var10000 = 217;
               break;
            case 233:
               var10000 = 65;
               break;
            case 234:
               var10000 = 167;
               break;
            case 235:
               var10000 = 64;
               break;
            case 236:
               var10000 = 199;
               break;
            case 237:
               var10000 = 188;
               break;
            case 238:
               var10000 = 74;
               break;
            case 239:
               var10000 = 241;
               break;
            case 240:
               var10000 = 41;
               break;
            case 241:
               var10000 = 50;
               break;
            case 242:
               var10000 = 101;
               break;
            case 243:
               var10000 = 80;
               break;
            case 244:
               var10000 = 236;
               break;
            case 245:
               var10000 = 223;
               break;
            case 246:
               var10000 = 79;
               break;
            case 247:
               var10000 = 17;
               break;
            case 248:
               var10000 = 185;
               break;
            case 249:
               var10000 = 254;
               break;
            case 250:
               var10000 = 221;
               break;
            case 251:
               var10000 = 10;
               break;
            case 252:
               var10000 = 165;
               break;
            case 253:
               var10000 = 103;
               break;
            case 254:
               var10000 = 54;
               break;
            default:
               var10000 = 0;
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
      String[] var5 = new String[27];
      int var3 = 0;
      String var2 = "%Sá\u008fé¶Å£\u0000^\n\u0091d¯äÆ\u000eW\nÀ\u0000þ\u001e\u0016ÆG8\\\u0014\u0094(õú%\u000b´%0-*\u001b\u0002Ã\u009c3W\u000eÝ\u001c¼J\u001dÌ¡2I\t%ô\u001bC\u0007\u0098ÏàýÒt£\u000b\u0082ç\tV6:Ï\r§\\\u008c\u0006³*_T\u008fÕ\u0007\u008a\u0014Zñ©\u0005\u0014\u0005«4Ùn^6\u00124\u0007c5)\u0010Qro«5w¼5çã\u0019¤!\u008eÿ¡ºÑ\u008f8\u008c\u0099$Þ´¯ØÃ\u001e¤ÊTD\t×t2\u0086\u001bî\u0080àL\u008a\u0082\u0092@\u0004\u0090$úFM\u009cFvÏ,7òuµªðÌÖ¯¡hþ¤m\u0000\u008dâº@¸ìTM}=F\f=\u00048\u0015A/\u001aÞceãïç#ie\u009aPK»Ñà¯P\t\u0086¶(Þ/Î{\u0019\u008fW,BSN[\u0085´\u0018ã>&\u0004d,\u0000ñ\n\fÖÝ\u0005¾ø0\u0093é6éÉNæ0k\u0082\u0094èl¶r\u0093\u001bl?1iÓ«9Ã\u0005è\u0080ÓÐv\u0016(wÛJ\t\u0002Â¾ú\u007f!vëúëÍ\u0082ö1E± \u0002b·<w>«\" \u0001¸\u000fmÛ$W:\u00ad»döâ#\u008a\u009fåO76{ýä!)É\u0015Mì\u009f\u0098!\u0018+\u0005¢\u009bÀw¾ï¦º@45{¥V\u0091W\u000fÔ\u0082·\u0003YäØ\u0006\u0013\u001a½ØC¬\u001d\b7VÅÂ\u009aÃè\u0087\u0017sÑÉ\u008aÏ¦<xÔ(\u0007|À8îNñu` \u008a;·gb\u0084ÀqQ\u001c\u008e\u0091ÿÌ\u008e mÔ§yi-\u000fg\u001cD\u008c\u0098£n\u008cï\u0011½\u0088òô\u008bÏ\u0088N\u00950\n¥ï \u0007ºø5÷à»ù¢zøuy\")\u001bÊy\u0082_\u0015\u000ezÃU£Ú1¾þÕ¢$ái\fYÏ\u001düp\u0095l\u0088Ê\u0085:\u008dº²nsPS4\t«\u0004²lÝR\u0007\u0001\n/åh\u0096\u008b)°ßS2ý\u008bW¹\u000b\\<Ô\u0005\u0080\u0091#¤ëÚEu\u00043\u000f¯Ã\u001aä\u0098À\u00170\u0014IzH\u0095õÎ¸[";
      int var4 = "%Sá\u008fé¶Å£\u0000^\n\u0091d¯äÆ\u000eW\nÀ\u0000þ\u001e\u0016ÆG8\\\u0014\u0094(õú%\u000b´%0-*\u001b\u0002Ã\u009c3W\u000eÝ\u001c¼J\u001dÌ¡2I\t%ô\u001bC\u0007\u0098ÏàýÒt£\u000b\u0082ç\tV6:Ï\r§\\\u008c\u0006³*_T\u008fÕ\u0007\u008a\u0014Zñ©\u0005\u0014\u0005«4Ùn^6\u00124\u0007c5)\u0010Qro«5w¼5çã\u0019¤!\u008eÿ¡ºÑ\u008f8\u008c\u0099$Þ´¯ØÃ\u001e¤ÊTD\t×t2\u0086\u001bî\u0080àL\u008a\u0082\u0092@\u0004\u0090$úFM\u009cFvÏ,7òuµªðÌÖ¯¡hþ¤m\u0000\u008dâº@¸ìTM}=F\f=\u00048\u0015A/\u001aÞceãïç#ie\u009aPK»Ñà¯P\t\u0086¶(Þ/Î{\u0019\u008fW,BSN[\u0085´\u0018ã>&\u0004d,\u0000ñ\n\fÖÝ\u0005¾ø0\u0093é6éÉNæ0k\u0082\u0094èl¶r\u0093\u001bl?1iÓ«9Ã\u0005è\u0080ÓÐv\u0016(wÛJ\t\u0002Â¾ú\u007f!vëúëÍ\u0082ö1E± \u0002b·<w>«\" \u0001¸\u000fmÛ$W:\u00ad»döâ#\u008a\u009fåO76{ýä!)É\u0015Mì\u009f\u0098!\u0018+\u0005¢\u009bÀw¾ï¦º@45{¥V\u0091W\u000fÔ\u0082·\u0003YäØ\u0006\u0013\u001a½ØC¬\u001d\b7VÅÂ\u009aÃè\u0087\u0017sÑÉ\u008aÏ¦<xÔ(\u0007|À8îNñu` \u008a;·gb\u0084ÀqQ\u001c\u008e\u0091ÿÌ\u008e mÔ§yi-\u000fg\u001cD\u008c\u0098£n\u008cï\u0011½\u0088òô\u008bÏ\u0088N\u00950\n¥ï \u0007ºø5÷à»ù¢zøuy\")\u001bÊy\u0082_\u0015\u000ezÃU£Ú1¾þÕ¢$ái\fYÏ\u001düp\u0095l\u0088Ê\u0085:\u008dº²nsPS4\t«\u0004²lÝR\u0007\u0001\n/åh\u0096\u008b)°ßS2ý\u008bW¹\u000b\\<Ô\u0005\u0080\u0091#¤ëÚEu\u00043\u000f¯Ã\u001aä\u0098À\u00170\u0014IzH\u0095õÎ¸["
         .length();
      char var1 = '"';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 109;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 94;
                        break;
                     case 1:
                        var46 = 58;
                        break;
                     case 2:
                        var46 = 74;
                        break;
                     case 3:
                        var46 = 102;
                        break;
                     case 4:
                        var46 = 85;
                        break;
                     case 5:
                        var46 = 10;
                        break;
                     default:
                        var46 = 116;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[27];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "ÓÏ?P\u0015\u0085µ\u000b\u0003)¡ã\u0099:\u001bÎì¯Üô\u0012ñºu-ºb63\u0096;zðN×¾\u0019\u0082=ªô\u000fë\u0096ÓÌ\u0014ì\u0098wÕ";
                  var4 = "ÓÏ?P\u0015\u0085µ\u000b\u0003)¡ã\u0099:\u001bÎì¯Üô\u0012ñºu-ºb63\u0096;zðN×¾\u0019\u0082=ªô\u000fë\u0096ÓÌ\u0014ì\u0098wÕ".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 75;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}






