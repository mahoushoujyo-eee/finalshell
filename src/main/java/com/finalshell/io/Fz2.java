package com.finalshell.io;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;

public class Fz2 extends Reader {
   public volatile boolean j;
   public boolean G;
   public char T;
   public static volatile boolean M;
   public Charset Y;
   public CharsetDecoder x;
   public ByteBuffer L;
   public InputStream w;
   public ReadableByteChannel s;
   public boolean i;
   public ArrayList E;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public void Q() throws IOException {
      try {
         if (Registry.lookupField(171983685064499719L).getBoolean(this)) {
            throw new IOException(a(2856, -27635));
         }
      } catch (IOException var1) {
         throw a(var1);
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static Fz2 a(InputStream var0, Object var1, String var2) throws UnsupportedEncodingException {
      String var9;
      Ky4[] var10000 = YT3_2.c();
      String var4 = var2;
      Ky4[] var3 = var10000;

      label35: {
         label34: {
            try {
               var9 = var4;
               if (var3 == null) {
                  break label35;
               }

               if (var4 != null) {
                  break label34;
               }
            } catch (IllegalCharsetNameException var8) {
               throw a(var8);
            }

            var4 = Charset.defaultCharset().name();
         }

         try {
            var9 = var4;
         } catch (IllegalCharsetNameException var7) {
            boolean var10001 = false;
            throw new UnsupportedEncodingException(var4);
         }
      }

      try {
         if (Charset.isSupported(var9)) {
            return new Fz2(var0, var1, Charset.forName(var4));
         }
      } catch (IllegalCharsetNameException var6) {
         boolean var10 = false;
      }

      throw new UnsupportedEncodingException(var4);
   }

   public static Fz2 h(InputStream var0, Object var1, Charset var2) {
      return new Fz2(var0, var1, var2);
   }

   public static Fz2 c(InputStream var0, Object var1, CharsetDecoder var2) {
      return new Fz2(var0, var1, var2);
   }

   public static Fz2 X(ReadableByteChannel var0, CharsetDecoder var1, int var2) {
      return new Fz2(var0, var1, var2);
   }

   public String p() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 38
      // 09: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0c: ldc2_w 474431652270352362
      // 0f: astore 3
      // 10: astore 2
      // 11: ldc2_w 474431652270352362
      // 14: aload 2
      // 15: aload 3
      // 16: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 19: checkcast java/lang/Boolean
      // 1c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1f: goto 26
      // 22: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 25: athrow
      // 26: ifeq 57
      // 29: goto 30
      // 2c: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 0
      // 31: goto 38
      // 34: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3b: ldc2_w 629311754842700722
      // 3e: astore 5
      // 40: astore 4
      // 42: ldc2_w 629311754842700722
      // 45: aload 4
      // 47: aload 5
      // 49: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4c: checkcast java/lang/String
      // 4f: goto 56
      // 52: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 55: athrow
      // 56: areturn
      // 57: aconst_null
      // 58: areturn
   }

   @Override
   public int read() throws IOException {
      Object var10001 = Registry.emptyArgs();
      long var2 = 466395161270742666L;
      Object var1 = var10001;
      var10001 = Ref.h(466395161270742666L, var1, var2);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public int y() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: getfield com/finalshell/io/Fz2.lock Ljava/lang/Object;
      // 07: dup
      // 08: astore 2
      // 09: monitorenter
      // 0a: astore 1
      // 0b: aload 0
      // 0c: ldc2_w 533806280716047158
      // 0f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 12: swap
      // 13: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 16: aload 1
      // 17: ifnull 40
      // 1a: ifeq 3f
      // 1d: goto 24
      // 20: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 0
      // 25: bipush 0
      // 26: ldc2_w 533806280716047158
      // 29: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2c: dup_x2
      // 2d: pop
      // 2e: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 31: aload 0
      // 32: ldc2_w 220243994838712492
      // 35: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 38: swap
      // 39: invokevirtual java/lang/reflect/Field.getChar (Ljava/lang/Object;)C
      // 3c: aload 2
      // 3d: monitorexit
      // 3e: ireturn
      // 3f: bipush 2
      // 40: newarray 5
      // 42: astore 3
      // 43: aload 0
      // 44: aload 3
      // 45: bipush 0
      // 46: bipush 2
      // 47: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;II)[Ljava/lang/Object;
      // 4a: ldc2_w 207421342036700868
      // 4d: astore 7
      // 4f: astore 6
      // 51: ldc2_w 207421342036700868
      // 54: aload 6
      // 56: aload 7
      // 58: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5b: checkcast java/lang/Integer
      // 5e: invokevirtual java/lang/Integer.intValue ()I
      // 61: goto 68
      // 64: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 67: athrow
      // 68: istore 4
      // 6a: iload 4
      // 6c: aload 1
      // 6d: ifnull c4
      // 70: tableswitch 74 -1 2 36 74 68 40
      // 90: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: bipush -1
      // 95: aload 2
      // 96: monitorexit
      // 97: ireturn
      // 98: aload 0
      // 99: aload 3
      // 9a: bipush 1
      // 9b: caload
      // 9c: ldc2_w 220243994838712492
      // 9f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // a2: dup_x2
      // a3: pop
      // a4: invokevirtual java/lang/reflect/Field.setChar (Ljava/lang/Object;C)V
      // a7: aload 0
      // a8: bipush 1
      // a9: ldc2_w 533806280716047158
      // ac: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // af: dup_x2
      // b0: pop
      // b1: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // b4: aload 3
      // b5: bipush 0
      // b6: caload
      // b7: aload 2
      // b8: monitorexit
      // b9: ireturn
      // ba: ldc2_w 526937170182300429
      // bd: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // c0: aconst_null
      // c1: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // c4: aload 1
      // c5: ifnull e3
      // c8: ifne e0
      // cb: goto d2
      // ce: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d1: athrow
      // d2: new java/lang/AssertionError
      // d5: dup
      // d6: iload 4
      // d8: invokespecial java/lang/AssertionError.<init> (I)V
      // db: athrow
      // dc: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // df: athrow
      // e0: bipush -1
      // e1: aload 2
      // e2: monitorexit
      // e3: ireturn
      // e4: astore 5
      // e6: aload 2
      // e7: monitorexit
      // e8: aload 5
      // ea: athrow
   }

   @Override
   public int read(char[] param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: iload 2
      // 004: istore 5
      // 006: iload 3
      // 007: istore 6
      // 009: astore 4
      // 00b: aload 0
      // 00c: getfield com/finalshell/io/Fz2.lock Ljava/lang/Object;
      // 00f: dup
      // 010: astore 7
      // 012: monitorenter
      // 013: aload 0
      // 014: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 017: ldc2_w 567289451762661371
      // 01a: astore 12
      // 01c: astore 11
      // 01e: ldc2_w 567289451762661371
      // 021: aload 11
      // 023: aload 12
      // 025: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 028: pop
      // 029: goto 030
      // 02c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02f: athrow
      // 030: iload 5
      // 032: aload 4
      // 034: ifnull 03c
      // 037: iflt 09d
      // 03a: iload 5
      // 03c: aload 4
      // 03e: ifnull 056
      // 041: aload 1
      // 042: arraylength
      // 043: if_icmpgt 09d
      // 046: goto 04d
      // 049: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: iload 6
      // 04f: goto 056
      // 052: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 055: athrow
      // 056: aload 4
      // 058: ifnull 071
      // 05b: iflt 09d
      // 05e: goto 065
      // 061: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: iload 5
      // 067: iload 6
      // 069: iadd
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: aload 1
      // 072: arraylength
      // 073: aload 4
      // 075: ifnull 08d
      // 078: if_icmpgt 09d
      // 07b: goto 082
      // 07e: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 081: athrow
      // 082: iload 5
      // 084: iload 6
      // 086: goto 08d
      // 089: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: iadd
      // 08e: aload 4
      // 090: ifnull 0ab
      // 093: ifge 0a9
      // 096: goto 09d
      // 099: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: new java/lang/IndexOutOfBoundsException
      // 0a0: dup
      // 0a1: invokespecial java/lang/IndexOutOfBoundsException.<init> ()V
      // 0a4: athrow
      // 0a5: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a8: athrow
      // 0a9: iload 6
      // 0ab: aload 4
      // 0ad: ifnull 0c0
      // 0b0: ifne 0bf
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: bipush 0
      // 0bb: aload 7
      // 0bd: monitorexit
      // 0be: ireturn
      // 0bf: bipush 0
      // 0c0: istore 8
      // 0c2: aload 0
      // 0c3: ldc2_w 533806280716047158
      // 0c6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0c9: swap
      // 0ca: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 0cd: aload 4
      // 0cf: ifnull 159
      // 0d2: ifeq 157
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: aload 1
      // 0dd: iload 5
      // 0df: aload 0
      // 0e0: ldc2_w 220243994838712492
      // 0e3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e6: swap
      // 0e7: invokevirtual java/lang/reflect/Field.getChar (Ljava/lang/Object;)C
      // 0ea: castore
      // 0eb: iinc 5 1
      // 0ee: iinc 6 -1
      // 0f1: aload 0
      // 0f2: bipush 0
      // 0f3: ldc2_w 533806280716047158
      // 0f6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 0fe: bipush 1
      // 0ff: istore 8
      // 101: iload 6
      // 103: aload 4
      // 105: ifnull 156
      // 108: ifeq 14a
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: aload 0
      // 113: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 116: ldc2_w 277843894480433599
      // 119: astore 14
      // 11b: astore 13
      // 11d: ldc2_w 277843894480433599
      // 120: aload 13
      // 122: aload 14
      // 124: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 127: checkcast java/lang/Boolean
      // 12a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 12d: goto 134
      // 130: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 133: athrow
      // 134: aload 4
      // 136: ifnull 159
      // 139: goto 140
      // 13c: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: ifne 157
      // 143: goto 14a
      // 146: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: iload 8
      // 14c: aload 7
      // 14e: monitorexit
      // 14f: goto 156
      // 152: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 155: athrow
      // 156: ireturn
      // 157: iload 6
      // 159: bipush 1
      // 15a: aload 4
      // 15c: ifnull 1fc
      // 15f: if_icmpne 1d0
      // 162: goto 169
      // 165: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 168: athrow
      // 169: aload 0
      // 16a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 16d: ldc2_w 466395161270742666
      // 170: astore 16
      // 172: astore 15
      // 174: ldc2_w 466395161270742666
      // 177: aload 15
      // 179: aload 16
      // 17b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 17e: checkcast java/lang/Integer
      // 181: invokevirtual java/lang/Integer.intValue ()I
      // 184: goto 18b
      // 187: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18a: athrow
      // 18b: istore 9
      // 18d: iload 9
      // 18f: bipush -1
      // 190: aload 4
      // 192: ifnull 1cb
      // 195: if_icmpne 1c1
      // 198: goto 19f
      // 19b: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19e: athrow
      // 19f: iload 8
      // 1a1: aload 4
      // 1a3: ifnull 1b8
      // 1a6: goto 1ad
      // 1a9: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ac: athrow
      // 1ad: ifne 1bb
      // 1b0: goto 1b7
      // 1b3: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b6: athrow
      // 1b7: bipush -1
      // 1b8: goto 1bd
      // 1bb: iload 8
      // 1bd: aload 7
      // 1bf: monitorexit
      // 1c0: ireturn
      // 1c1: aload 1
      // 1c2: iload 5
      // 1c4: iload 9
      // 1c6: i2c
      // 1c7: castore
      // 1c8: iload 8
      // 1ca: bipush 1
      // 1cb: iadd
      // 1cc: aload 7
      // 1ce: monitorexit
      // 1cf: ireturn
      // 1d0: iload 8
      // 1d2: aload 0
      // 1d3: aload 1
      // 1d4: iload 5
      // 1d6: iload 5
      // 1d8: iload 6
      // 1da: iadd
      // 1db: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;II)[Ljava/lang/Object;
      // 1de: ldc2_w 378968898911894070
      // 1e1: astore 18
      // 1e3: astore 17
      // 1e5: ldc2_w 378968898911894070
      // 1e8: aload 17
      // 1ea: aload 18
      // 1ec: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ef: checkcast java/lang/Integer
      // 1f2: invokevirtual java/lang/Integer.intValue ()I
      // 1f5: goto 1fc
      // 1f8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1fb: athrow
      // 1fc: iadd
      // 1fd: aload 7
      // 1ff: monitorexit
      // 200: ireturn
      // 201: astore 10
      // 203: aload 7
      // 205: monitorexit
      // 206: aload 10
      // 208: athrow
   }

   @Override
   public boolean ready() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: getfield com/finalshell/io/Fz2.lock Ljava/lang/Object;
      // 07: dup
      // 08: astore 2
      // 09: monitorenter
      // 0a: astore 1
      // 0b: aload 0
      // 0c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0f: ldc2_w 567289451762661371
      // 12: astore 5
      // 14: astore 4
      // 16: ldc2_w 567289451762661371
      // 19: aload 4
      // 1b: aload 5
      // 1d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 20: pop
      // 21: goto 28
      // 24: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 0
      // 29: ldc2_w 533806280716047158
      // 2c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2f: swap
      // 30: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 33: aload 1
      // 34: ifnull 79
      // 37: ifne 78
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: aload 0
      // 42: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 45: ldc2_w 277843894480433599
      // 48: astore 7
      // 4a: astore 6
      // 4c: ldc2_w 277843894480433599
      // 4f: aload 6
      // 51: aload 7
      // 53: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 56: checkcast java/lang/Boolean
      // 59: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5c: goto 63
      // 5f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 1
      // 64: ifnull 79
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d: athrow
      // 6e: ifeq 7c
      // 71: goto 78
      // 74: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: bipush 1
      // 79: goto 7d
      // 7c: bipush 0
      // 7d: aload 2
      // 7e: monitorexit
      // 7f: ireturn
      // 80: astore 3
      // 81: aload 2
      // 82: monitorexit
      // 83: aload 3
      // 84: athrow
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void close() throws IOException {
      Fz2 var12;
      Ky4[] var10000 = YT3_2.c();
      Object var2 = this.lock;
      synchronized (this.lock){} // $VF: monitorenter 
      Ky4[] var1 = var10000;

      try {
         label56: {
            label60: {
               try {
                  var12 = this;
                  if (var1 == null) {
                     break label60;
                  }

                  if (Registry.lookupField(171983685064499719L).getBoolean(this)) {
                     break label56;
                  }
               } catch (IOException var10) {
                  throw a(var10);
               }

               var12 = this;
               Object[] var10001 = Registry.emptyArgs();
               long var5 = 607673094265595581L;
               Object[] var4 = var10001;
               Ref.h(607673094265595581L, var4, var5);

               try {
                  ;
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }

               Registry.lookupField(171983685064499719L).setBoolean(this, true);
            }

            // $VF: monitorexit
            return;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public boolean H() {
      Ky4[] var1 = YT3_2.c();

      try {
         boolean var10000 = Registry.lookupField(171983685064499719L).getBoolean(this);
         if (var1 == null) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (IllegalCharsetNameException var2) {
         throw a(var2);
      }

      return false;
   }

   public static FileChannel L(FileInputStream var0) {
      try {
         if (!Registry.lookupField(140794893555705299L).getBoolean(null)) {
            return null;
         }
      } catch (UnsatisfiedLinkError var3) {
         throw a(var3);
      }

      try {
         return var0.getChannel();
      } catch (UnsatisfiedLinkError var2) {
         Registry.lookupField(140794893555705299L).setBoolean(null, false);
         return null;
      }
   }

   public Fz2(InputStream var1, Object var2, Charset var3) {
      this(var1, var2, var3.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE));
   }

   public Fz2(InputStream param1, Object param2, CharsetDecoder param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: aload 2
      // 05: invokespecial java/io/Reader.<init> (Ljava/lang/Object;)V
      // 08: astore 4
      // 0a: aload 0
      // 0b: bipush 0
      // 0c: ldc2_w 533806280716047158
      // 0f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 12: dup_x2
      // 13: pop
      // 14: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 17: aload 0
      // 18: bipush 0
      // 19: ldc2_w 249215334697892941
      // 1c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1f: dup_x2
      // 20: pop
      // 21: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 24: aload 0
      // 25: new java/util/ArrayList
      // 28: dup
      // 29: invokespecial java/util/ArrayList.<init> ()V
      // 2c: ldc2_w 157900765809029780
      // 2f: astore 6
      // 31: astore 5
      // 33: ldc2_w 157900765809029780
      // 36: aload 5
      // 38: aload 6
      // 3a: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 3d: aload 0
      // 3e: aload 3
      // 3f: invokevirtual java/nio/charset/CharsetDecoder.charset ()Ljava/nio/charset/Charset;
      // 42: ldc2_w 553018690272945810
      // 45: astore 8
      // 47: astore 7
      // 49: ldc2_w 553018690272945810
      // 4c: aload 7
      // 4e: aload 8
      // 50: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 53: aload 0
      // 54: aload 3
      // 55: ldc2_w 611444958030254644
      // 58: astore 10
      // 5a: astore 9
      // 5c: ldc2_w 611444958030254644
      // 5f: aload 9
      // 61: aload 10
      // 63: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 66: aload 0
      // 67: aload 4
      // 69: ifnull d2
      // 6c: ldc2_w 513892591654619705
      // 6f: astore 11
      // 71: ldc2_w 513892591654619705
      // 74: aload 11
      // 76: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 79: checkcast java/nio/channels/ReadableByteChannel
      // 7c: ifnonnull d1
      // 7f: goto 86
      // 82: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: aload 0
      // 87: aload 1
      // 88: ldc2_w 283913459258382303
      // 8b: astore 14
      // 8d: astore 13
      // 8f: ldc2_w 283913459258382303
      // 92: aload 13
      // 94: aload 14
      // 96: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 99: aload 0
      // 9a: aconst_null
      // 9b: ldc2_w 513892591654619705
      // 9e: astore 16
      // a0: astore 15
      // a2: ldc2_w 513892591654619705
      // a5: aload 15
      // a7: aload 16
      // a9: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // ac: aload 0
      // ad: sipush 14818
      // b0: ldc2_w 6684125702607510708
      // b3: invokestatic com/finalshell/io/Fz2.a (IJ)I
      // b6: invokestatic java/nio/ByteBuffer.allocate (I)Ljava/nio/ByteBuffer;
      // b9: ldc2_w 200975572261612164
      // bc: astore 18
      // be: astore 17
      // c0: ldc2_w 200975572261612164
      // c3: aload 17
      // c5: aload 18
      // c7: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // ca: goto d1
      // cd: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d0: athrow
      // d1: aload 0
      // d2: ldc2_w 200975572261612164
      // d5: astore 19
      // d7: ldc2_w 200975572261612164
      // da: aload 19
      // dc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // df: checkcast java/nio/ByteBuffer
      // e2: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // e5: pop
      // e6: return
   }

   public Fz2(ReadableByteChannel param1, CharsetDecoder param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/io/Reader.<init> ()V
      // 004: aload 0
      // 005: bipush 0
      // 006: ldc2_w 533806280716047158
      // 009: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 00c: dup_x2
      // 00d: pop
      // 00e: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 011: aload 0
      // 012: bipush 0
      // 013: ldc2_w 249215334697892941
      // 016: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 019: dup_x2
      // 01a: pop
      // 01b: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 01e: aload 0
      // 01f: new java/util/ArrayList
      // 022: dup
      // 023: invokespecial java/util/ArrayList.<init> ()V
      // 026: ldc2_w 157900765809029780
      // 029: astore 6
      // 02b: astore 5
      // 02d: ldc2_w 157900765809029780
      // 030: aload 5
      // 032: aload 6
      // 034: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 037: aload 0
      // 038: aconst_null
      // 039: ldc2_w 283913459258382303
      // 03c: astore 8
      // 03e: astore 7
      // 040: ldc2_w 283913459258382303
      // 043: aload 7
      // 045: aload 8
      // 047: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 04a: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 04d: aload 0
      // 04e: aload 1
      // 04f: ldc2_w 513892591654619705
      // 052: astore 10
      // 054: astore 9
      // 056: ldc2_w 513892591654619705
      // 059: aload 9
      // 05b: aload 10
      // 05d: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 060: astore 4
      // 062: aload 0
      // 063: aload 2
      // 064: ldc2_w 611444958030254644
      // 067: astore 12
      // 069: astore 11
      // 06b: ldc2_w 611444958030254644
      // 06e: aload 11
      // 070: aload 12
      // 072: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 075: aload 0
      // 076: aload 2
      // 077: invokevirtual java/nio/charset/CharsetDecoder.charset ()Ljava/nio/charset/Charset;
      // 07a: ldc2_w 553018690272945810
      // 07d: astore 14
      // 07f: astore 13
      // 081: ldc2_w 553018690272945810
      // 084: aload 13
      // 086: aload 14
      // 088: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 08b: aload 0
      // 08c: iload 3
      // 08d: aload 4
      // 08f: ifnull 0ad
      // 092: ifge 0ac
      // 095: goto 09c
      // 098: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: sipush 24698
      // 09f: ldc2_w 3912071447041492264
      // 0a2: invokestatic com/finalshell/io/Fz2.a (IJ)I
      // 0a5: goto 0d9
      // 0a8: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: iload 3
      // 0ad: aload 4
      // 0af: ifnull 0d5
      // 0b2: sipush 30718
      // 0b5: ldc2_w 8570008180280742564
      // 0b8: invokestatic com/finalshell/io/Fz2.a (IJ)I
      // 0bb: if_icmpge 0d8
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: sipush 16014
      // 0c8: ldc2_w 8885243877555608537
      // 0cb: invokestatic com/finalshell/io/Fz2.a (IJ)I
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: goto 0d9
      // 0d8: iload 3
      // 0d9: invokestatic java/nio/ByteBuffer.allocate (I)Ljava/nio/ByteBuffer;
      // 0dc: ldc2_w 200975572261612164
      // 0df: astore 16
      // 0e1: astore 15
      // 0e3: ldc2_w 200975572261612164
      // 0e6: aload 15
      // 0e8: aload 16
      // 0ea: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0ed: aload 0
      // 0ee: ldc2_w 200975572261612164
      // 0f1: astore 17
      // 0f3: ldc2_w 200975572261612164
      // 0f6: aload 17
      // 0f8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0fb: checkcast java/nio/ByteBuffer
      // 0fe: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 101: pop
      // 102: return
   }

   public int E() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 0
      // 004: ldc2_w 200975572261612164
      // 007: astore 8
      // 009: ldc2_w 200975572261612164
      // 00c: aload 8
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: checkcast java/nio/ByteBuffer
      // 014: invokevirtual java/nio/ByteBuffer.compact ()Ljava/nio/ByteBuffer;
      // 017: pop
      // 018: astore 1
      // 019: aload 0
      // 01a: aload 1
      // 01b: ifnull 094
      // 01e: ldc2_w 513892591654619705
      // 021: astore 10
      // 023: ldc2_w 513892591654619705
      // 026: aload 10
      // 028: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 02b: checkcast java/nio/channels/ReadableByteChannel
      // 02e: ifnull 08c
      // 031: goto 038
      // 034: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: aload 0
      // 039: ldc2_w 513892591654619705
      // 03c: astore 12
      // 03e: ldc2_w 513892591654619705
      // 041: aload 12
      // 043: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 046: checkcast java/nio/channels/ReadableByteChannel
      // 049: aload 0
      // 04a: ldc2_w 200975572261612164
      // 04d: astore 14
      // 04f: ldc2_w 200975572261612164
      // 052: aload 14
      // 054: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 057: checkcast java/nio/ByteBuffer
      // 05a: invokeinterface java/nio/channels/ReadableByteChannel.read (Ljava/nio/ByteBuffer;)I 2
      // 05f: istore 2
      // 060: iload 2
      // 061: aload 1
      // 062: ifnull 070
      // 065: ifge 088
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: iload 2
      // 070: istore 3
      // 071: aload 0
      // 072: ldc2_w 200975572261612164
      // 075: astore 16
      // 077: ldc2_w 200975572261612164
      // 07a: aload 16
      // 07c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 07f: checkcast java/nio/ByteBuffer
      // 082: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 085: pop
      // 086: iload 3
      // 087: ireturn
      // 088: aload 1
      // 089: ifnonnull 256
      // 08c: aload 0
      // 08d: goto 094
      // 090: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: ldc2_w 200975572261612164
      // 097: astore 18
      // 099: ldc2_w 200975572261612164
      // 09c: aload 18
      // 09e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0a1: checkcast java/nio/ByteBuffer
      // 0a4: invokevirtual java/nio/ByteBuffer.limit ()I
      // 0a7: istore 2
      // 0a8: aload 0
      // 0a9: ldc2_w 200975572261612164
      // 0ac: astore 20
      // 0ae: ldc2_w 200975572261612164
      // 0b1: aload 20
      // 0b3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b6: checkcast java/nio/ByteBuffer
      // 0b9: invokevirtual java/nio/ByteBuffer.position ()I
      // 0bc: istore 3
      // 0bd: ldc2_w 526937170182300429
      // 0c0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0c3: aconst_null
      // 0c4: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 0c7: aload 1
      // 0c8: ifnull 0f9
      // 0cb: ifne 0f8
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: iload 3
      // 0d6: iload 2
      // 0d7: aload 1
      // 0d8: ifnull 0fa
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: if_icmple 0f8
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: new java/lang/AssertionError
      // 0ef: dup
      // 0f0: invokespecial java/lang/AssertionError.<init> ()V
      // 0f3: athrow
      // 0f4: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: iload 3
      // 0f9: iload 2
      // 0fa: aload 1
      // 0fb: ifnull 111
      // 0fe: if_icmpgt 115
      // 101: goto 108
      // 104: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: iload 2
      // 109: iload 3
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 110: athrow
      // 111: isub
      // 112: goto 116
      // 115: bipush 0
      // 116: istore 4
      // 118: ldc2_w 526937170182300429
      // 11b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 11e: aconst_null
      // 11f: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 122: aload 1
      // 123: ifnull 193
      // 126: ifne 153
      // 129: goto 130
      // 12c: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: iload 4
      // 132: aload 1
      // 133: ifnull 193
      // 136: goto 13d
      // 139: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: ifgt 153
      // 140: goto 147
      // 143: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 146: athrow
      // 147: new java/lang/AssertionError
      // 14a: dup
      // 14b: invokespecial java/lang/AssertionError.<init> ()V
      // 14e: athrow
      // 14f: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 152: athrow
      // 153: aload 0
      // 154: ldc2_w 283913459258382303
      // 157: astore 22
      // 159: ldc2_w 283913459258382303
      // 15c: aload 22
      // 15e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 161: checkcast java/io/InputStream
      // 164: aload 0
      // 165: ldc2_w 200975572261612164
      // 168: astore 24
      // 16a: ldc2_w 200975572261612164
      // 16d: aload 24
      // 16f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 172: checkcast java/nio/ByteBuffer
      // 175: invokevirtual java/nio/ByteBuffer.array ()[B
      // 178: aload 0
      // 179: ldc2_w 200975572261612164
      // 17c: astore 26
      // 17e: ldc2_w 200975572261612164
      // 181: aload 26
      // 183: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 186: checkcast java/nio/ByteBuffer
      // 189: invokevirtual java/nio/ByteBuffer.arrayOffset ()I
      // 18c: iload 3
      // 18d: iadd
      // 18e: iload 4
      // 190: invokevirtual java/io/InputStream.read ([BII)I
      // 193: istore 5
      // 195: iload 5
      // 197: aload 1
      // 198: ifnull 1c3
      // 19b: ifge 1c1
      // 19e: goto 1a5
      // 1a1: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a4: athrow
      // 1a5: iload 5
      // 1a7: istore 6
      // 1a9: aload 0
      // 1aa: ldc2_w 200975572261612164
      // 1ad: astore 28
      // 1af: ldc2_w 200975572261612164
      // 1b2: aload 28
      // 1b4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b7: checkcast java/nio/ByteBuffer
      // 1ba: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 1bd: pop
      // 1be: iload 6
      // 1c0: ireturn
      // 1c1: iload 5
      // 1c3: aload 1
      // 1c4: ifnull 1f0
      // 1c7: ifne 1e6
      // 1ca: goto 1d1
      // 1cd: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d0: athrow
      // 1d1: new java/io/IOException
      // 1d4: dup
      // 1d5: sipush 2857
      // 1d8: sipush 15319
      // 1db: invokestatic com/finalshell/io/Fz2.a (II)Ljava/lang/String;
      // 1de: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 1e1: athrow
      // 1e2: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e5: athrow
      // 1e6: ldc2_w 526937170182300429
      // 1e9: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1ec: aconst_null
      // 1ed: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 1f0: aload 1
      // 1f1: ifnull 200
      // 1f4: ifne 23d
      // 1f7: goto 1fe
      // 1fa: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fd: athrow
      // 1fe: iload 5
      // 200: iload 4
      // 202: if_icmple 23d
      // 205: new java/lang/AssertionError
      // 208: dup
      // 209: new java/lang/StringBuilder
      // 20c: dup
      // 20d: invokespecial java/lang/StringBuilder.<init> ()V
      // 210: sipush 2858
      // 213: sipush -26577
      // 216: invokestatic com/finalshell/io/Fz2.a (II)Ljava/lang/String;
      // 219: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21c: iload 5
      // 21e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 221: sipush 2859
      // 224: sipush -6498
      // 227: invokestatic com/finalshell/io/Fz2.a (II)Ljava/lang/String;
      // 22a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22d: iload 4
      // 22f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 232: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 235: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 238: athrow
      // 239: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23c: athrow
      // 23d: aload 0
      // 23e: ldc2_w 200975572261612164
      // 241: astore 30
      // 243: ldc2_w 200975572261612164
      // 246: aload 30
      // 248: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 24b: checkcast java/nio/ByteBuffer
      // 24e: iload 3
      // 24f: iload 5
      // 251: iadd
      // 252: invokevirtual java/nio/ByteBuffer.position (I)Ljava/nio/ByteBuffer;
      // 255: pop
      // 256: aload 0
      // 257: ldc2_w 200975572261612164
      // 25a: astore 32
      // 25c: ldc2_w 200975572261612164
      // 25f: aload 32
      // 261: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 264: checkcast java/nio/ByteBuffer
      // 267: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 26a: pop
      // 26b: goto 288
      // 26e: astore 7
      // 270: aload 0
      // 271: ldc2_w 200975572261612164
      // 274: astore 34
      // 276: ldc2_w 200975572261612164
      // 279: aload 34
      // 27b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 27e: checkcast java/nio/ByteBuffer
      // 281: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 284: pop
      // 285: aload 7
      // 287: athrow
      // 288: aload 0
      // 289: ldc2_w 200975572261612164
      // 28c: astore 36
      // 28e: ldc2_w 200975572261612164
      // 291: aload 36
      // 293: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 296: checkcast java/nio/ByteBuffer
      // 299: invokevirtual java/nio/ByteBuffer.remaining ()I
      // 29c: istore 2
      // 29d: ldc2_w 526937170182300429
      // 2a0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2a3: aconst_null
      // 2a4: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 2a7: aload 1
      // 2a8: ifnull 2d9
      // 2ab: ifne 2d8
      // 2ae: goto 2b5
      // 2b1: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b4: athrow
      // 2b5: iload 2
      // 2b6: aload 1
      // 2b7: ifnull 2d9
      // 2ba: goto 2c1
      // 2bd: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c0: athrow
      // 2c1: ifne 2d8
      // 2c4: goto 2cb
      // 2c7: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ca: athrow
      // 2cb: new java/lang/AssertionError
      // 2ce: dup
      // 2cf: iload 2
      // 2d0: invokespecial java/lang/AssertionError.<init> (I)V
      // 2d3: athrow
      // 2d4: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d7: athrow
      // 2d8: iload 2
      // 2d9: ireturn
   }

   public int J(char[] param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: ldc2_w 157900765809029780
      // 004: astore 24
      // 006: ldc2_w 157900765809029780
      // 009: aload 24
      // 00b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 00e: checkcast java/util/ArrayList
      // 011: invokevirtual java/util/ArrayList.clear ()V
      // 014: iinc 3 -100
      // 017: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 01a: bipush 0
      // 01b: istore 5
      // 01d: astore 4
      // 01f: bipush 0
      // 020: istore 6
      // 022: ldc2_w 526937170182300429
      // 025: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 028: aconst_null
      // 029: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 02c: aload 4
      // 02e: ifnull 045
      // 031: ifne 055
      // 034: goto 03b
      // 037: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: iload 3
      // 03c: iload 2
      // 03d: isub
      // 03e: goto 045
      // 041: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 044: athrow
      // 045: bipush 1
      // 046: if_icmpgt 055
      // 049: new java/lang/AssertionError
      // 04c: dup
      // 04d: invokespecial java/lang/AssertionError.<init> ()V
      // 050: athrow
      // 051: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: aload 1
      // 056: iload 2
      // 057: iload 3
      // 058: iload 2
      // 059: isub
      // 05a: invokestatic java/nio/CharBuffer.wrap ([CII)Ljava/nio/CharBuffer;
      // 05d: astore 7
      // 05f: aload 7
      // 061: invokevirtual java/nio/CharBuffer.position ()I
      // 064: aload 4
      // 066: ifnull 07b
      // 069: ifeq 07a
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: aload 7
      // 075: invokevirtual java/nio/CharBuffer.slice ()Ljava/nio/CharBuffer;
      // 078: astore 7
      // 07a: bipush 0
      // 07b: istore 8
      // 07d: bipush 0
      // 07e: istore 9
      // 080: bipush 0
      // 081: istore 10
      // 083: aload 7
      // 085: invokevirtual java/nio/CharBuffer.position ()I
      // 088: istore 11
      // 08a: aload 0
      // 08b: ldc2_w 200975572261612164
      // 08e: astore 26
      // 090: ldc2_w 200975572261612164
      // 093: aload 26
      // 095: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 098: checkcast java/nio/ByteBuffer
      // 09b: invokevirtual java/nio/ByteBuffer.position ()I
      // 09e: istore 12
      // 0a0: aload 0
      // 0a1: ldc2_w 611444958030254644
      // 0a4: astore 28
      // 0a6: ldc2_w 611444958030254644
      // 0a9: aload 28
      // 0ab: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ae: checkcast java/nio/charset/CharsetDecoder
      // 0b1: aload 0
      // 0b2: ldc2_w 200975572261612164
      // 0b5: astore 30
      // 0b7: ldc2_w 200975572261612164
      // 0ba: aload 30
      // 0bc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bf: checkcast java/nio/ByteBuffer
      // 0c2: aload 7
      // 0c4: iload 8
      // 0c6: invokevirtual java/nio/charset/CharsetDecoder.decode (Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;
      // 0c9: astore 13
      // 0cb: aload 0
      // 0cc: ldc2_w 200975572261612164
      // 0cf: astore 32
      // 0d1: ldc2_w 200975572261612164
      // 0d4: aload 32
      // 0d6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d9: checkcast java/nio/ByteBuffer
      // 0dc: invokevirtual java/nio/ByteBuffer.position ()I
      // 0df: istore 14
      // 0e1: iload 14
      // 0e3: iload 12
      // 0e5: isub
      // 0e6: istore 15
      // 0e8: iload 6
      // 0ea: iload 15
      // 0ec: iadd
      // 0ed: istore 6
      // 0ef: iload 10
      // 0f1: ifeq 0f4
      // 0f4: iload 15
      // 0f6: aload 4
      // 0f8: ifnull 112
      // 0fb: ifge 110
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: invokestatic java/lang/System.currentTimeMillis ()J
      // 108: pop2
      // 109: goto 110
      // 10c: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: iload 12
      // 112: istore 16
      // 114: iload 16
      // 116: iload 14
      // 118: if_icmpge 162
      // 11b: aload 0
      // 11c: ldc2_w 200975572261612164
      // 11f: astore 34
      // 121: ldc2_w 200975572261612164
      // 124: aload 34
      // 126: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 129: checkcast java/nio/ByteBuffer
      // 12c: invokevirtual java/nio/ByteBuffer.array ()[B
      // 12f: iload 16
      // 131: baload
      // 132: istore 17
      // 134: aload 0
      // 135: ldc2_w 157900765809029780
      // 138: astore 36
      // 13a: ldc2_w 157900765809029780
      // 13d: aload 36
      // 13f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 142: checkcast java/util/ArrayList
      // 145: iload 17
      // 147: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 14a: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 14d: pop
      // 14e: iinc 16 1
      // 151: aload 4
      // 153: ifnull 2d2
      // 156: aload 4
      // 158: ifnonnull 114
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 161: athrow
      // 162: aload 13
      // 164: invokevirtual java/nio/charset/CoderResult.isUnderflow ()Z
      // 167: aload 4
      // 169: ifnull 2e3
      // 16c: ifeq 2d2
      // 16f: goto 176
      // 172: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 175: athrow
      // 176: iload 8
      // 178: aload 4
      // 17a: ifnull 1a6
      // 17d: goto 184
      // 180: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 183: athrow
      // 184: ifeq 19a
      // 187: goto 18e
      // 18a: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18d: athrow
      // 18e: aload 4
      // 190: ifnonnull 337
      // 193: goto 19a
      // 196: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: aload 7
      // 19c: invokevirtual java/nio/CharBuffer.hasRemaining ()Z
      // 19f: goto 1a6
      // 1a2: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a5: athrow
      // 1a6: aload 4
      // 1a8: ifnull 1cd
      // 1ab: ifne 1c1
      // 1ae: goto 1b5
      // 1b1: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b4: athrow
      // 1b5: aload 4
      // 1b7: ifnonnull 337
      // 1ba: goto 1c1
      // 1bd: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c0: athrow
      // 1c1: aload 7
      // 1c3: invokevirtual java/nio/CharBuffer.position ()I
      // 1c6: goto 1cd
      // 1c9: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cc: athrow
      // 1cd: aload 4
      // 1cf: ifnull 249
      // 1d2: ifle 220
      // 1d5: goto 1dc
      // 1d8: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1db: athrow
      // 1dc: aload 0
      // 1dd: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1e0: ldc2_w 261599358558391043
      // 1e3: astore 39
      // 1e5: astore 38
      // 1e7: ldc2_w 261599358558391043
      // 1ea: aload 38
      // 1ec: aload 39
      // 1ee: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1f1: checkcast java/lang/Boolean
      // 1f4: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1f7: goto 1fe
      // 1fa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1fd: athrow
      // 1fe: aload 4
      // 200: ifnull 249
      // 203: goto 20a
      // 206: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 209: athrow
      // 20a: ifne 220
      // 20d: goto 214
      // 210: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 213: athrow
      // 214: aload 4
      // 216: ifnonnull 337
      // 219: goto 220
      // 21c: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21f: athrow
      // 220: aload 0
      // 221: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 224: ldc2_w 369109331329909235
      // 227: astore 41
      // 229: astore 40
      // 22b: ldc2_w 369109331329909235
      // 22e: aload 40
      // 230: aload 41
      // 232: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 235: checkcast java/lang/Integer
      // 238: invokevirtual java/lang/Integer.intValue ()I
      // 23b: goto 242
      // 23e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 241: athrow
      // 242: istore 16
      // 244: bipush 1
      // 245: istore 10
      // 247: iload 16
      // 249: aload 4
      // 24b: ifnull 2cb
      // 24e: ifge 2c6
      // 251: goto 258
      // 254: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 257: athrow
      // 258: bipush 1
      // 259: istore 8
      // 25b: aload 4
      // 25d: ifnull 2c1
      // 260: aload 7
      // 262: invokevirtual java/nio/CharBuffer.position ()I
      // 265: ifne 2a5
      // 268: goto 26f
      // 26b: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26e: athrow
      // 26f: aload 0
      // 270: aload 4
      // 272: ifnull 2ad
      // 275: goto 27c
      // 278: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27b: athrow
      // 27c: ldc2_w 200975572261612164
      // 27f: astore 42
      // 281: ldc2_w 200975572261612164
      // 284: aload 42
      // 286: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 289: checkcast java/nio/ByteBuffer
      // 28c: invokevirtual java/nio/ByteBuffer.hasRemaining ()Z
      // 28f: ifne 2a5
      // 292: goto 299
      // 295: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 298: athrow
      // 299: aload 4
      // 29b: ifnonnull 337
      // 29e: goto 2a5
      // 2a1: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a4: athrow
      // 2a5: aload 0
      // 2a6: goto 2ad
      // 2a9: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ac: athrow
      // 2ad: ldc2_w 611444958030254644
      // 2b0: astore 44
      // 2b2: ldc2_w 611444958030254644
      // 2b5: aload 44
      // 2b7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2ba: checkcast java/nio/charset/CharsetDecoder
      // 2bd: invokevirtual java/nio/charset/CharsetDecoder.reset ()Ljava/nio/charset/CharsetDecoder;
      // 2c0: pop
      // 2c1: aload 4
      // 2c3: ifnonnull 08a
      // 2c6: iload 9
      // 2c8: iload 16
      // 2ca: iadd
      // 2cb: istore 9
      // 2cd: aload 4
      // 2cf: ifnonnull 08a
      // 2d2: aload 13
      // 2d4: aload 4
      // 2d6: ifnull 32f
      // 2d9: invokevirtual java/nio/charset/CoderResult.isOverflow ()Z
      // 2dc: goto 2e3
      // 2df: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e2: athrow
      // 2e3: ifeq 32d
      // 2e6: ldc2_w 526937170182300429
      // 2e9: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2ec: aconst_null
      // 2ed: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 2f0: aload 4
      // 2f2: ifnull 340
      // 2f5: goto 2fc
      // 2f8: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2fb: athrow
      // 2fc: ifne 337
      // 2ff: goto 306
      // 302: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 305: athrow
      // 306: aload 7
      // 308: invokevirtual java/nio/CharBuffer.position ()I
      // 30b: aload 4
      // 30d: ifnull 340
      // 310: goto 317
      // 313: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 316: athrow
      // 317: ifgt 337
      // 31a: goto 321
      // 31d: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 320: athrow
      // 321: new java/lang/AssertionError
      // 324: dup
      // 325: invokespecial java/lang/AssertionError.<init> ()V
      // 328: athrow
      // 329: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32c: athrow
      // 32d: aload 13
      // 32f: invokevirtual java/nio/charset/CoderResult.throwException ()V
      // 332: aload 4
      // 334: ifnonnull 08a
      // 337: aload 7
      // 339: invokevirtual java/nio/CharBuffer.position ()I
      // 33c: istore 12
      // 33e: iload 8
      // 340: aload 4
      // 342: ifnull 370
      // 345: ifeq 36b
      // 348: goto 34f
      // 34b: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34e: athrow
      // 34f: aload 0
      // 350: ldc2_w 611444958030254644
      // 353: astore 46
      // 355: ldc2_w 611444958030254644
      // 358: aload 46
      // 35a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 35d: checkcast java/nio/charset/CharsetDecoder
      // 360: invokevirtual java/nio/charset/CharsetDecoder.reset ()Ljava/nio/charset/CharsetDecoder;
      // 363: pop
      // 364: goto 36b
      // 367: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36a: athrow
      // 36b: aload 7
      // 36d: invokevirtual java/nio/CharBuffer.position ()I
      // 370: aload 4
      // 372: ifnull 3ca
      // 375: ifne 3c2
      // 378: goto 37f
      // 37b: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37e: athrow
      // 37f: iload 8
      // 381: aload 4
      // 383: ifnull 3a7
      // 386: goto 38d
      // 389: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38c: athrow
      // 38d: ifeq 39d
      // 390: goto 397
      // 393: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 396: athrow
      // 397: bipush -1
      // 398: ireturn
      // 399: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39c: athrow
      // 39d: ldc2_w 526937170182300429
      // 3a0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3a3: aconst_null
      // 3a4: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 3a7: aload 4
      // 3a9: ifnull 3ca
      // 3ac: ifne 3c2
      // 3af: goto 3b6
      // 3b2: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b5: athrow
      // 3b6: new java/lang/AssertionError
      // 3b9: dup
      // 3ba: invokespecial java/lang/AssertionError.<init> ()V
      // 3bd: athrow
      // 3be: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c1: athrow
      // 3c2: aload 7
      // 3c4: invokevirtual java/nio/CharBuffer.position ()I
      // 3c7: istore 5
      // 3c9: bipush 0
      // 3ca: istore 13
      // 3cc: aload 0
      // 3cd: ldc2_w 200975572261612164
      // 3d0: astore 48
      // 3d2: ldc2_w 200975572261612164
      // 3d5: aload 48
      // 3d7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3da: checkcast java/nio/ByteBuffer
      // 3dd: invokevirtual java/nio/ByteBuffer.array ()[B
      // 3e0: astore 14
      // 3e2: iload 12
      // 3e4: iload 11
      // 3e6: isub
      // 3e7: istore 15
      // 3e9: iload 3
      // 3ea: iload 2
      // 3eb: isub
      // 3ec: iload 15
      // 3ee: isub
      // 3ef: istore 16
      // 3f1: bipush 0
      // 3f2: istore 17
      // 3f4: iload 16
      // 3f6: aload 4
      // 3f8: ifnull 420
      // 3fb: ifle 451
      // 3fe: goto 405
      // 401: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 404: athrow
      // 405: aload 0
      // 406: ldc2_w 200975572261612164
      // 409: astore 50
      // 40b: ldc2_w 200975572261612164
      // 40e: aload 50
      // 410: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 413: checkcast java/nio/ByteBuffer
      // 416: invokevirtual java/nio/ByteBuffer.remaining ()I
      // 419: goto 420
      // 41c: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41f: athrow
      // 420: aload 4
      // 422: ifnull 44f
      // 425: ifle 451
      // 428: goto 42f
      // 42b: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42e: athrow
      // 42f: iload 16
      // 431: aload 0
      // 432: ldc2_w 200975572261612164
      // 435: astore 52
      // 437: ldc2_w 200975572261612164
      // 43a: aload 52
      // 43c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 43f: checkcast java/nio/ByteBuffer
      // 442: invokevirtual java/nio/ByteBuffer.remaining ()I
      // 445: invokestatic java/lang/Math.min (II)I
      // 448: goto 44f
      // 44b: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44e: athrow
      // 44f: istore 17
      // 451: aload 14
      // 453: astore 18
      // 455: aload 18
      // 457: arraylength
      // 458: istore 19
      // 45a: bipush 0
      // 45b: istore 20
      // 45d: iload 20
      // 45f: iload 19
      // 461: if_icmpge 553
      // 464: aload 18
      // 466: iload 20
      // 468: baload
      // 469: istore 21
      // 46b: aload 4
      // 46d: ifnull 54e
      // 470: iload 13
      // 472: bipush 2
      // 473: aload 4
      // 475: ifnull 555
      // 478: goto 47f
      // 47b: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47e: athrow
      // 47f: if_icmplt 548
      // 482: goto 489
      // 485: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 488: athrow
      // 489: aload 14
      // 48b: iload 13
      // 48d: bipush 1
      // 48e: isub
      // 48f: baload
      // 490: sipush 22279
      // 493: ldc2_w 4777490264669778518
      // 496: invokestatic com/finalshell/io/Fz2.a (IJ)I
      // 499: aload 4
      // 49b: ifnull 4c6
      // 49e: goto 4a5
      // 4a1: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a4: athrow
      // 4a5: if_icmpne 548
      // 4a8: goto 4af
      // 4ab: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ae: athrow
      // 4af: aload 14
      // 4b1: iload 13
      // 4b3: bipush 2
      // 4b4: isub
      // 4b5: baload
      // 4b6: sipush 27023
      // 4b9: ldc2_w 2994393337764564191
      // 4bc: invokestatic com/finalshell/io/Fz2.a (IJ)I
      // 4bf: goto 4c6
      // 4c2: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c5: athrow
      // 4c6: aload 4
      // 4c8: ifnull 505
      // 4cb: if_icmpne 548
      // 4ce: goto 4d5
      // 4d1: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d4: athrow
      // 4d5: aload 0
      // 4d6: bipush 1
      // 4d7: ldc2_w 249215334697892941
      // 4da: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 4dd: dup_x2
      // 4de: pop
      // 4df: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 4e2: aload 4
      // 4e4: ifnull 54e
      // 4e7: goto 4ee
      // 4ea: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ed: athrow
      // 4ee: aload 14
      // 4f0: iload 13
      // 4f2: bipush 1
      // 4f3: iadd
      // 4f4: baload
      // 4f5: sipush 32456
      // 4f8: ldc2_w 8697765157444574107
      // 4fb: invokestatic com/finalshell/io/Fz2.a (IJ)I
      // 4fe: goto 505
      // 501: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 504: athrow
      // 505: if_icmpne 548
      // 508: aload 14
      // 50a: iload 13
      // 50c: bipush 2
      // 50d: iadd
      // 50e: baload
      // 50f: sipush 5411
      // 512: ldc2_w 4180062081311584374
      // 515: invokestatic com/finalshell/io/Fz2.a (IJ)I
      // 518: aload 4
      // 51a: ifnull 545
      // 51d: goto 524
      // 520: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 523: athrow
      // 524: if_icmpne 548
      // 527: goto 52e
      // 52a: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52d: athrow
      // 52e: aload 14
      // 530: iload 13
      // 532: bipush 3
      // 533: iadd
      // 534: baload
      // 535: sipush 16207
      // 538: ldc2_w 6823891315145251355
      // 53b: invokestatic com/finalshell/io/Fz2.a (IJ)I
      // 53e: goto 545
      // 541: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 544: athrow
      // 545: if_icmpne 548
      // 548: iinc 13 1
      // 54b: iinc 20 1
      // 54e: aload 4
      // 550: ifnonnull 45d
      // 553: iload 3
      // 554: iload 2
      // 555: isub
      // 556: istore 18
      // 558: iload 9
      // 55a: iload 18
      // 55c: if_icmple 55f
      // 55f: iload 9
      // 561: aload 0
      // 562: ldc2_w 157900765809029780
      // 565: astore 54
      // 567: ldc2_w 157900765809029780
      // 56a: aload 54
      // 56c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 56f: checkcast java/util/ArrayList
      // 572: invokevirtual java/util/ArrayList.size ()I
      // 575: isub
      // 576: istore 19
      // 578: iload 17
      // 57a: istore 19
      // 57c: aload 0
      // 57d: ldc2_w 249215334697892941
      // 580: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 583: swap
      // 584: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 587: aload 4
      // 589: ifnull 6b0
      // 58c: ifeq 6ae
      // 58f: goto 596
      // 592: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 595: athrow
      // 596: iload 2
      // 597: istore 20
      // 599: bipush 0
      // 59a: istore 21
      // 59c: iload 20
      // 59e: iload 3
      // 59f: iload 2
      // 5a0: isub
      // 5a1: if_icmpge 610
      // 5a4: iload 21
      // 5a6: aload 4
      // 5a8: ifnull 616
      // 5ab: aload 4
      // 5ad: ifnull 616
      // 5b0: goto 5b7
      // 5b3: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b6: athrow
      // 5b7: aload 0
      // 5b8: ldc2_w 157900765809029780
      // 5bb: astore 56
      // 5bd: ldc2_w 157900765809029780
      // 5c0: aload 56
      // 5c2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5c5: checkcast java/util/ArrayList
      // 5c8: invokevirtual java/util/ArrayList.size ()I
      // 5cb: if_icmpge 610
      // 5ce: goto 5d5
      // 5d1: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d4: athrow
      // 5d5: aload 0
      // 5d6: ldc2_w 157900765809029780
      // 5d9: astore 58
      // 5db: ldc2_w 157900765809029780
      // 5de: aload 58
      // 5e0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5e3: checkcast java/util/ArrayList
      // 5e6: iload 21
      // 5e8: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 5eb: checkcast java/lang/Byte
      // 5ee: invokevirtual java/lang/Byte.byteValue ()B
      // 5f1: istore 22
      // 5f3: aload 1
      // 5f4: iload 20
      // 5f6: caload
      // 5f7: istore 23
      // 5f9: aload 1
      // 5fa: iload 20
      // 5fc: iload 22
      // 5fe: i2c
      // 5ff: castore
      // 600: iload 22
      // 602: ifeq 605
      // 605: iinc 20 1
      // 608: iinc 21 1
      // 60b: aload 4
      // 60d: ifnonnull 59c
      // 610: iload 6
      // 612: istore 5
      // 614: iload 19
      // 616: aload 4
      // 618: ifnull 6b0
      // 61b: ifle 6ae
      // 61e: goto 625
      // 621: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 624: athrow
      // 625: bipush 0
      // 626: istore 22
      // 628: iload 22
      // 62a: iload 19
      // 62c: if_icmpge 67b
      // 62f: aload 0
      // 630: ldc2_w 200975572261612164
      // 633: astore 60
      // 635: ldc2_w 200975572261612164
      // 638: aload 60
      // 63a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 63d: checkcast java/nio/ByteBuffer
      // 640: invokevirtual java/nio/ByteBuffer.array ()[B
      // 643: aload 0
      // 644: ldc2_w 200975572261612164
      // 647: astore 62
      // 649: ldc2_w 200975572261612164
      // 64c: aload 62
      // 64e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 651: checkcast java/nio/ByteBuffer
      // 654: invokevirtual java/nio/ByteBuffer.position ()I
      // 657: iload 22
      // 659: iadd
      // 65a: baload
      // 65b: istore 23
      // 65d: aload 1
      // 65e: iload 20
      // 660: iload 22
      // 662: iadd
      // 663: iload 23
      // 665: i2c
      // 666: castore
      // 667: iinc 22 1
      // 66a: aload 4
      // 66c: ifnull 6a7
      // 66f: aload 4
      // 671: ifnonnull 628
      // 674: goto 67b
      // 677: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67a: athrow
      // 67b: aload 0
      // 67c: ldc2_w 200975572261612164
      // 67f: astore 64
      // 681: ldc2_w 200975572261612164
      // 684: aload 64
      // 686: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 689: checkcast java/nio/ByteBuffer
      // 68c: aload 0
      // 68d: ldc2_w 200975572261612164
      // 690: astore 66
      // 692: ldc2_w 200975572261612164
      // 695: aload 66
      // 697: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 69a: checkcast java/nio/ByteBuffer
      // 69d: invokevirtual java/nio/ByteBuffer.position ()I
      // 6a0: iload 19
      // 6a2: iadd
      // 6a3: invokevirtual java/nio/ByteBuffer.position (I)Ljava/nio/ByteBuffer;
      // 6a6: pop
      // 6a7: iload 5
      // 6a9: iload 19
      // 6ab: iadd
      // 6ac: istore 5
      // 6ae: iload 5
      // 6b0: ireturn
   }

   public String D() {
      Object var1 = 553018690272945810L;
      return ((Charset)Ref.g(553018690272945810L, var1)).name();
   }

   public boolean B() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 4b
      // 09: ldc2_w 283913459258382303
      // 0c: astore 3
      // 0d: ldc2_w 283913459258382303
      // 10: aload 3
      // 11: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 14: checkcast java/io/InputStream
      // 17: ifnull 4a
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 0
      // 22: ldc2_w 283913459258382303
      // 25: astore 5
      // 27: ldc2_w 283913459258382303
      // 2a: aload 5
      // 2c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2f: checkcast java/io/InputStream
      // 32: invokevirtual java/io/InputStream.available ()I
      // 35: aload 1
      // 36: ifnull 6a
      // 39: goto 40
      // 3c: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: ifgt 69
      // 43: goto 4a
      // 46: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 0
      // 4b: ldc2_w 513892591654619705
      // 4e: astore 7
      // 50: ldc2_w 513892591654619705
      // 53: aload 7
      // 55: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 58: instanceof java/nio/channels/FileChannel
      // 5b: aload 1
      // 5c: ifnull 6a
      // 5f: ifeq 6d
      // 62: goto 69
      // 65: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: bipush 1
      // 6a: goto 6e
      // 6d: bipush 0
      // 6e: ireturn
      // 6f: astore 2
      // 70: bipush 0
      // 71: ireturn
   }

   public boolean X() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: ldc2_w 200975572261612164
      // 08: astore 2
      // 09: ldc2_w 200975572261612164
      // 0c: aload 2
      // 0d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10: checkcast java/nio/ByteBuffer
      // 13: invokevirtual java/nio/ByteBuffer.hasRemaining ()Z
      // 16: aload 1
      // 17: ifnull 5c
      // 1a: ifne 5b
      // 1d: goto 24
      // 20: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 0
      // 25: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 28: ldc2_w 261599358558391043
      // 2b: astore 5
      // 2d: astore 4
      // 2f: ldc2_w 261599358558391043
      // 32: aload 4
      // 34: aload 5
      // 36: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 39: checkcast java/lang/Boolean
      // 3c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3f: goto 46
      // 42: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 1
      // 47: ifnull 5c
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: ifeq 5f
      // 54: goto 5b
      // 57: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: bipush 1
      // 5c: goto 60
      // 5f: bipush 0
      // 60: ireturn
   }

   public void c() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 4a
      // 09: ldc2_w 513892591654619705
      // 0c: astore 2
      // 0d: ldc2_w 513892591654619705
      // 10: aload 2
      // 11: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 14: checkcast java/nio/channels/ReadableByteChannel
      // 17: ifnull 42
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 0
      // 22: ldc2_w 513892591654619705
      // 25: astore 4
      // 27: ldc2_w 513892591654619705
      // 2a: aload 4
      // 2c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2f: checkcast java/nio/channels/ReadableByteChannel
      // 32: invokeinterface java/nio/channels/ReadableByteChannel.close ()V 1
      // 37: aload 1
      // 38: ifnonnull 5d
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 0
      // 43: goto 4a
      // 46: invokestatic com/finalshell/io/Fz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: ldc2_w 283913459258382303
      // 4d: astore 6
      // 4f: ldc2_w 283913459258382303
      // 52: aload 6
      // 54: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 57: checkcast java/io/InputStream
      // 5a: invokevirtual java/io/InputStream.close ()V
      // 5d: return
   }

   public boolean O() {
      return Registry.lookupField(249215334697892941L).getBoolean(this);
   }

   public void v(boolean var1) {
      Registry.lookupField(249215334697892941L).setBoolean(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 2858) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 77;
               break;
            case 1:
               var10000 = 132;
               break;
            case 2:
               var10000 = 168;
               break;
            case 3:
               var10000 = 141;
               break;
            case 4:
               var10000 = 20;
               break;
            case 5:
               var10000 = 96;
               break;
            case 6:
               var10000 = 215;
               break;
            case 7:
               var10000 = 226;
               break;
            case 8:
               var10000 = 82;
               break;
            case 9:
               var10000 = 138;
               break;
            case 10:
               var10000 = 144;
               break;
            case 11:
               var10000 = 131;
               break;
            case 12:
               var10000 = 213;
               break;
            case 13:
               var10000 = 162;
               break;
            case 14:
               var10000 = 241;
               break;
            case 15:
               var10000 = 151;
               break;
            case 16:
               var10000 = 236;
               break;
            case 17:
               var10000 = 190;
               break;
            case 18:
               var10000 = 217;
               break;
            case 19:
               var10000 = 175;
               break;
            case 20:
               var10000 = 92;
               break;
            case 21:
               var10000 = 50;
               break;
            case 22:
               var10000 = 188;
               break;
            case 23:
               var10000 = 146;
               break;
            case 24:
               var10000 = 39;
               break;
            case 25:
               var10000 = 35;
               break;
            case 26:
               var10000 = 46;
               break;
            case 27:
               var10000 = 194;
               break;
            case 28:
               var10000 = 199;
               break;
            case 29:
               var10000 = 19;
               break;
            case 30:
               var10000 = 183;
               break;
            case 31:
               var10000 = 72;
               break;
            case 32:
               var10000 = 198;
               break;
            case 33:
               var10000 = 230;
               break;
            case 34:
               var10000 = 255;
               break;
            case 35:
               var10000 = 189;
               break;
            case 36:
               var10000 = 197;
               break;
            case 37:
               var10000 = 123;
               break;
            case 38:
               var10000 = 139;
               break;
            case 39:
               var10000 = 224;
               break;
            case 40:
               var10000 = 8;
               break;
            case 41:
               var10000 = 164;
               break;
            case 42:
               var10000 = 235;
               break;
            case 43:
               var10000 = 32;
               break;
            case 44:
               var10000 = 135;
               break;
            case 45:
               var10000 = 38;
               break;
            case 46:
               var10000 = 79;
               break;
            case 47:
               var10000 = 155;
               break;
            case 48:
               var10000 = 130;
               break;
            case 49:
               var10000 = 89;
               break;
            case 50:
               var10000 = 227;
               break;
            case 51:
               var10000 = 81;
               break;
            case 52:
               var10000 = 122;
               break;
            case 53:
               var10000 = 218;
               break;
            case 54:
               var10000 = 181;
               break;
            case 55:
               var10000 = 78;
               break;
            case 56:
               var10000 = 109;
               break;
            case 57:
               var10000 = 231;
               break;
            case 58:
               var10000 = 214;
               break;
            case 59:
               var10000 = 23;
               break;
            case 60:
               var10000 = 11;
               break;
            case 61:
               var10000 = 87;
               break;
            case 62:
               var10000 = 124;
               break;
            case 63:
               var10000 = 69;
               break;
            case 64:
               var10000 = 196;
               break;
            case 65:
               var10000 = 172;
               break;
            case 66:
               var10000 = 33;
               break;
            case 67:
               var10000 = 179;
               break;
            case 68:
               var10000 = 121;
               break;
            case 69:
               var10000 = 247;
               break;
            case 70:
               var10000 = 56;
               break;
            case 71:
               var10000 = 147;
               break;
            case 72:
               var10000 = 253;
               break;
            case 73:
               var10000 = 5;
               break;
            case 74:
               var10000 = 83;
               break;
            case 75:
               var10000 = 245;
               break;
            case 76:
               var10000 = 26;
               break;
            case 77:
               var10000 = 118;
               break;
            case 78:
               var10000 = 6;
               break;
            case 79:
               var10000 = 254;
               break;
            case 80:
               var10000 = 178;
               break;
            case 81:
               var10000 = 97;
               break;
            case 82:
               var10000 = 24;
               break;
            case 83:
               var10000 = 15;
               break;
            case 84:
               var10000 = 153;
               break;
            case 85:
               var10000 = 103;
               break;
            case 86:
               var10000 = 251;
               break;
            case 87:
               var10000 = 240;
               break;
            case 88:
               var10000 = 187;
               break;
            case 89:
               var10000 = 95;
               break;
            case 90:
               var10000 = 63;
               break;
            case 91:
               var10000 = 42;
               break;
            case 92:
               var10000 = 128;
               break;
            case 93:
               var10000 = 173;
               break;
            case 94:
               var10000 = 86;
               break;
            case 95:
               var10000 = 201;
               break;
            case 96:
               var10000 = 102;
               break;
            case 97:
               var10000 = 133;
               break;
            case 98:
               var10000 = 88;
               break;
            case 99:
               var10000 = 21;
               break;
            case 100:
               var10000 = 159;
               break;
            case 101:
               var10000 = 13;
               break;
            case 102:
               var10000 = 53;
               break;
            case 103:
               var10000 = 142;
               break;
            case 104:
               var10000 = 207;
               break;
            case 105:
               var10000 = 40;
               break;
            case 106:
               var10000 = 225;
               break;
            case 107:
               var10000 = 211;
               break;
            case 108:
               var10000 = 233;
               break;
            case 109:
               var10000 = 108;
               break;
            case 110:
               var10000 = 125;
               break;
            case 111:
               var10000 = 195;
               break;
            case 112:
               var10000 = 51;
               break;
            case 113:
               var10000 = 41;
               break;
            case 114:
               var10000 = 62;
               break;
            case 115:
               var10000 = 91;
               break;
            case 116:
               var10000 = 171;
               break;
            case 117:
               var10000 = 250;
               break;
            case 118:
               var10000 = 243;
               break;
            case 119:
               var10000 = 66;
               break;
            case 120:
               var10000 = 163;
               break;
            case 121:
               var10000 = 34;
               break;
            case 122:
               var10000 = 99;
               break;
            case 123:
               var10000 = 176;
               break;
            case 124:
               var10000 = 209;
               break;
            case 125:
               var10000 = 84;
               break;
            case 126:
               var10000 = 248;
               break;
            case 127:
               var10000 = 25;
               break;
            case 128:
               var10000 = 17;
               break;
            case 129:
               var10000 = 120;
               break;
            case 130:
               var10000 = 71;
               break;
            case 131:
               var10000 = 27;
               break;
            case 132:
               var10000 = 129;
               break;
            case 133:
               var10000 = 2;
               break;
            case 134:
               var10000 = 192;
               break;
            case 135:
               var10000 = 106;
               break;
            case 136:
               var10000 = 134;
               break;
            case 137:
               var10000 = 114;
               break;
            case 138:
               var10000 = 73;
               break;
            case 139:
               var10000 = 98;
               break;
            case 140:
               var10000 = 232;
               break;
            case 141:
               var10000 = 18;
               break;
            case 142:
               var10000 = 140;
               break;
            case 143:
               var10000 = 68;
               break;
            case 144:
               var10000 = 107;
               break;
            case 145:
               var10000 = 220;
               break;
            case 146:
               var10000 = 31;
               break;
            case 147:
               var10000 = 212;
               break;
            case 148:
               var10000 = 16;
               break;
            case 149:
               var10000 = 152;
               break;
            case 150:
               var10000 = 205;
               break;
            case 151:
               var10000 = 186;
               break;
            case 152:
               var10000 = 228;
               break;
            case 153:
               var10000 = 160;
               break;
            case 154:
               var10000 = 1;
               break;
            case 155:
               var10000 = 206;
               break;
            case 156:
               var10000 = 59;
               break;
            case 157:
               var10000 = 4;
               break;
            case 158:
               var10000 = 45;
               break;
            case 159:
               var10000 = 29;
               break;
            case 160:
               var10000 = 166;
               break;
            case 161:
               var10000 = 58;
               break;
            case 162:
               var10000 = 28;
               break;
            case 163:
               var10000 = 169;
               break;
            case 164:
               var10000 = 112;
               break;
            case 165:
               var10000 = 65;
               break;
            case 166:
               var10000 = 49;
               break;
            case 167:
               var10000 = 156;
               break;
            case 168:
               var10000 = 94;
               break;
            case 169:
               var10000 = 76;
               break;
            case 170:
               var10000 = 12;
               break;
            case 171:
               var10000 = 37;
               break;
            case 172:
               var10000 = 157;
               break;
            case 173:
               var10000 = 234;
               break;
            case 174:
               var10000 = 60;
               break;
            case 175:
               var10000 = 143;
               break;
            case 176:
               var10000 = 44;
               break;
            case 177:
               var10000 = 48;
               break;
            case 178:
               var10000 = 193;
               break;
            case 179:
               var10000 = 10;
               break;
            case 180:
               var10000 = 246;
               break;
            case 181:
               var10000 = 52;
               break;
            case 182:
               var10000 = 22;
               break;
            case 183:
               var10000 = 252;
               break;
            case 184:
               var10000 = 43;
               break;
            case 185:
               var10000 = 180;
               break;
            case 186:
               var10000 = 100;
               break;
            case 187:
               var10000 = 105;
               break;
            case 188:
               var10000 = 55;
               break;
            case 189:
               var10000 = 115;
               break;
            case 190:
               var10000 = 101;
               break;
            case 191:
               var10000 = 111;
               break;
            case 192:
               var10000 = 161;
               break;
            case 193:
               var10000 = 0;
               break;
            case 194:
               var10000 = 219;
               break;
            case 195:
               var10000 = 70;
               break;
            case 196:
               var10000 = 221;
               break;
            case 197:
               var10000 = 64;
               break;
            case 198:
               var10000 = 104;
               break;
            case 199:
               var10000 = 119;
               break;
            case 200:
               var10000 = 174;
               break;
            case 201:
               var10000 = 7;
               break;
            case 202:
               var10000 = 200;
               break;
            case 203:
               var10000 = 244;
               break;
            case 204:
               var10000 = 14;
               break;
            case 205:
               var10000 = 67;
               break;
            case 206:
               var10000 = 137;
               break;
            case 207:
               var10000 = 145;
               break;
            case 208:
               var10000 = 238;
               break;
            case 209:
               var10000 = 237;
               break;
            case 210:
               var10000 = 136;
               break;
            case 211:
               var10000 = 222;
               break;
            case 212:
               var10000 = 148;
               break;
            case 213:
               var10000 = 167;
               break;
            case 214:
               var10000 = 177;
               break;
            case 215:
               var10000 = 30;
               break;
            case 216:
               var10000 = 154;
               break;
            case 217:
               var10000 = 170;
               break;
            case 218:
               var10000 = 239;
               break;
            case 219:
               var10000 = 36;
               break;
            case 220:
               var10000 = 85;
               break;
            case 221:
               var10000 = 229;
               break;
            case 222:
               var10000 = 249;
               break;
            case 223:
               var10000 = 80;
               break;
            case 224:
               var10000 = 210;
               break;
            case 225:
               var10000 = 61;
               break;
            case 226:
               var10000 = 127;
               break;
            case 227:
               var10000 = 149;
               break;
            case 228:
               var10000 = 54;
               break;
            case 229:
               var10000 = 93;
               break;
            case 230:
               var10000 = 191;
               break;
            case 231:
               var10000 = 216;
               break;
            case 232:
               var10000 = 202;
               break;
            case 233:
               var10000 = 184;
               break;
            case 234:
               var10000 = 165;
               break;
            case 235:
               var10000 = 117;
               break;
            case 236:
               var10000 = 57;
               break;
            case 237:
               var10000 = 204;
               break;
            case 238:
               var10000 = 203;
               break;
            case 239:
               var10000 = 74;
               break;
            case 240:
               var10000 = 182;
               break;
            case 241:
               var10000 = 110;
               break;
            case 242:
               var10000 = 47;
               break;
            case 243:
               var10000 = 113;
               break;
            case 244:
               var10000 = 116;
               break;
            case 245:
               var10000 = 158;
               break;
            case 246:
               var10000 = 75;
               break;
            case 247:
               var10000 = 223;
               break;
            case 248:
               var10000 = 150;
               break;
            case 249:
               var10000 = 208;
               break;
            case 250:
               var10000 = 185;
               break;
            case 251:
               var10000 = 9;
               break;
            case 252:
               var10000 = 90;
               break;
            case 253:
               var10000 = 242;
               break;
            case 254:
               var10000 = 3;
               break;
            default:
               var10000 = 126;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9554;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      boolean F;
      boolean var12;
      boolean var21;
      char[] var35;
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "|\u0002\u008b^\b:9\u0006|Î7\u000f\u009c";
      var12 = ("|\u0002\u008b^\b:9\u0006|Î7\u000f\u009c".length()) != 0;
      char var9 = 4;
      int var18 = -1;

      label85:
      while (true) {
         byte var10000 = 24;
         String var10001 = var10.substring(++var18, var18 + var9);
         byte var10002 = -1;

         while (true) {
            label80: {
               char[] var41 = var10001.toCharArray();
               int var10004 = var41.length;
               int var14 = 0;
               byte var44 = var10000;
               var35 = var41;
               int var26 = var10004;
               byte var51;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var41;
                  var51 = var10000;
                  var10006 = var14;
               } else {
                  var44 = var10000;
                  var26 = var10004;
                  if (var10004 <= var14) {
                     break label80;
                  }

                  var57 = var41;
                  var51 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var66 = var57[var10006];
                  byte var67;
                  switch (var14 % 7) {
                     case 0:
                        var67 = 13;
                        break;
                     case 1:
                        var67 = 74;
                        break;
                     case 2:
                        var67 = 32;
                        break;
                     case 3:
                        var67 = 72;
                        break;
                     case 4:
                        var67 = 64;
                        break;
                     case 5:
                        var67 = 67;
                        break;
                     default:
                        var67 = 56;
                  }

                  var57[var10006] = (char)(var66 ^ var51 ^ var67);
                  var14++;
                  if (var44 == 0) {
                     var10006 = var44;
                     var57 = var35;
                     var51 = var44;
                  } else {
                     if (var26 <= var14) {
                        break;
                     }

                     var57 = var35;
                     var51 = var44;
                     var10006 = var14;
                  }
               }
            }

            String var46 = new String(var35).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var46;
                  if ((var18 += var9) >= var12) {
                     a = var13;
                     b = new String[4];
                     long var0 = 513906960465056354L;
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "[!x'jÅ·JÁA\u000bx\u0097^\t»\u000f©2>M^\u001e\u0097\u0018yWÒ=\u0099 \u001e?\u0081ëvûänÖs\u0083Z¼jtI\u009bc·\u0097ïC\u0005ÈI";
                     int var5 = "[!x'jÅ·JÁA\u000bx\u0097^\t»\u000f©2>M^\u001e\u0097\u0018yWÒ=\u0099 \u001e?\u0081ëvûänÖs\u0083Z¼jtI\u009bc·\u0097ïC\u0005ÈI"
                        .length();
                     byte var2 = 0;

                     label59:
                     while (true) {
                        byte var28 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        long[] var20 = var6;
                        int var29 = var3++;
                        long var39 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var47 = -1;

                        while (true) {
                           long var56 = var39 ^ var0;
                           switch (var47) {
                              case 0:
                                 var20[var29] = var56;
                                 if (var2 >= var5) {
                                    c = var6;
                                    d = new Integer[9];

                                    label48: {
                                       try {
                                          if (!Fz2.class.desiredAssertionStatus()) {
                                             var21 = true;
                                             break label48;
                                          }
                                       } catch (IllegalCharsetNameException var15) {
                                          throw a(var15);
                                       }

                                       var21 = false;
                                    }

                                    F = var21;
                                    Registry.lookupField(140794893555705299L).setBoolean(null, true);
                                    return;
                                 }
                                 break;
                              default:
                                 var20[var29] = var56;
                                 if (var2 < var5) {
                                    continue label59;
                                 }

                                 var4 = "\u0005ER¾\u0085¶â$î6\u0015lÙÍ\u0080æ";
                                 var5 = "\u0005ER¾\u0085¶â$î6\u0015lÙÍ\u0080æ".length();
                                 var2 = 0;
                           }

                           byte var30 = var2;
                           var2 += 8;
                           var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                           var20 = var6;
                           var29 = var3++;
                           var39 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var47 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var18);
                  break;
               default:
                  var13[var11++] = var46;
                  if ((var18 += var9) < var12) {
                     var9 = var10.charAt(var18);
                     continue label85;
                  }

                  var10 = "\u0086o\u0016\u007f×\r«k|\u0080\u0010¿=+\u0090H\u0004ÂR»3\u0096\u001f|m%¡¬\u008bÞ\u0007_øÂ¼lrmñ¤0\u0014çv(\u0004¤Té¤Ú\u0005¶µÊ¹¹";
                  var12 = "\u0086o\u0016\u007f×\r«k|\u0080\u0010¿=+\u0090H\u0004ÂR»3\u0096\u001f|m%¡¬\u008bÞ\u0007_øÂ¼lrmñ¤0\u0014çv(\u0004¤Té¤Ú\u0005¶µÊ¹¹";
                     // [VF] .length();
                  var9 = '\r';
                  var18 = -1;
            }

            var10000 = 41;
            var10001 = var10.substring(++var18, var18 + var9);
            var10002 = 0;
         }
      }
   }
}





