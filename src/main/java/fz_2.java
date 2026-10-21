import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;

public class Fz_2 extends Reader {
   private volatile boolean j;
   private boolean G;
   private char T;
   private static volatile boolean M;
   private Charset Y;
   private CharsetDecoder x;
   private ByteBuffer L;
   private InputStream w;
   private ReadableByteChannel s;
   boolean i;
   ArrayList E;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   private void Q() throws IOException {
      try {
         if (com.c.c(171983685064499719L).getBoolean(this)) {
            throw new IOException(a(2856, -27635));
         }
      } catch (IOException var1) {
         throw a(var1);
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static Fz_2 a(InputStream var0, Object var1, String var2) throws UnsupportedEncodingException {
      com.ky_4[] var10000 = yT_3.c();
      String var4 = var2;
      com.ky_4[] var3 = var10000;

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
            return new Fz_2(var0, var1, Charset.forName(var4));
         }
      } catch (IllegalCharsetNameException var6) {
         boolean var10 = false;
      }

      throw new UnsupportedEncodingException(var4);
   }

   public static Fz_2 h(InputStream var0, Object var1, Charset var2) {
      return new Fz_2(var0, var1, var2);
   }

   public static Fz_2 c(InputStream var0, Object var1, CharsetDecoder var2) {
      return new Fz_2(var0, var1, var2);
   }

   public static Fz_2 X(ReadableByteChannel var0, CharsetDecoder var1, int var2) {
      return new Fz_2(var0, var1, var2);
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
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 36
      // 09: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0c: ldc2_w 474431652270352362
      // 0f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 12: dup_x2
      // 13: pop
      // 14: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 17: checkcast java/lang/Boolean
      // 1a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1d: goto 24
      // 20: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 23: athrow
      // 24: ifeq 4f
      // 27: goto 2e
      // 2a: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 0
      // 2f: goto 36
      // 32: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: invokestatic com/c.f ()[Ljava/lang/Object;
      // 39: ldc2_w 629311754842700722
      // 3c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 3f: dup_x2
      // 40: pop
      // 41: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 44: checkcast java/lang/String
      // 47: goto 4e
      // 4a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: areturn
      // 4f: aconst_null
      // 50: areturn
   }

   @Override
   public int read() throws IOException {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(466395161270742666L);
      Object[] var10002 = var10001;
      Fz_2 var2 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   private int y() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: aload 0
      // 04: getfield Fz_2.lock Ljava/lang/Object;
      // 07: dup
      // 08: astore 2
      // 09: monitorenter
      // 0a: astore 1
      // 0b: aload 0
      // 0c: ldc2_w 533806280716047158
      // 0f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 12: swap
      // 13: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 16: aload 1
      // 17: ifnull 40
      // 1a: ifeq 3f
      // 1d: goto 24
      // 20: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 0
      // 25: bipush 0
      // 26: ldc2_w 533806280716047158
      // 29: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2c: dup_x2
      // 2d: pop
      // 2e: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 31: aload 0
      // 32: ldc2_w 220243994838712492
      // 35: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
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
      // 47: invokestatic com/c.a (Ljava/lang/Object;II)[Ljava/lang/Object;
      // 4a: ldc2_w 207421342036700868
      // 4d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 50: dup_x2
      // 51: pop
      // 52: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 55: checkcast java/lang/Integer
      // 58: invokevirtual java/lang/Integer.intValue ()I
      // 5b: goto 62
      // 5e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 61: athrow
      // 62: istore 4
      // 64: iload 4
      // 66: aload 1
      // 67: ifnull bc
      // 6a: tableswitch 72 -1 2 34 72 66 38
      // 88: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: bipush -1
      // 8d: aload 2
      // 8e: monitorexit
      // 8f: ireturn
      // 90: aload 0
      // 91: aload 3
      // 92: bipush 1
      // 93: caload
      // 94: ldc2_w 220243994838712492
      // 97: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 9a: dup_x2
      // 9b: pop
      // 9c: invokevirtual java/lang/reflect/Field.setChar (Ljava/lang/Object;C)V
      // 9f: aload 0
      // a0: bipush 1
      // a1: ldc2_w 533806280716047158
      // a4: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // a7: dup_x2
      // a8: pop
      // a9: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // ac: aload 3
      // ad: bipush 0
      // ae: caload
      // af: aload 2
      // b0: monitorexit
      // b1: ireturn
      // b2: ldc2_w 526937170182300429
      // b5: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // b8: aconst_null
      // b9: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // bc: aload 1
      // bd: ifnull db
      // c0: ifne d8
      // c3: goto ca
      // c6: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c9: athrow
      // ca: new java/lang/AssertionError
      // cd: dup
      // ce: iload 4
      // d0: invokespecial java/lang/AssertionError.<init> (I)V
      // d3: athrow
      // d4: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d7: athrow
      // d8: bipush -1
      // d9: aload 2
      // da: monitorexit
      // db: ireturn
      // dc: astore 5
      // de: aload 2
      // df: monitorexit
      // e0: aload 5
      // e2: athrow
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
      // 000: invokestatic yT_3.c ()[Lcom/ky_4;
      // 003: iload 2
      // 004: istore 5
      // 006: iload 3
      // 007: istore 6
      // 009: astore 4
      // 00b: aload 0
      // 00c: getfield Fz_2.lock Ljava/lang/Object;
      // 00f: dup
      // 010: astore 7
      // 012: monitorenter
      // 013: aload 0
      // 014: invokestatic com/c.f ()[Ljava/lang/Object;
      // 017: ldc2_w 567289451762661371
      // 01a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 01d: dup_x2
      // 01e: pop
      // 01f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 022: pop
      // 023: goto 02a
      // 026: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 029: athrow
      // 02a: iload 5
      // 02c: aload 4
      // 02e: ifnull 036
      // 031: iflt 097
      // 034: iload 5
      // 036: aload 4
      // 038: ifnull 050
      // 03b: aload 1
      // 03c: arraylength
      // 03d: if_icmpgt 097
      // 040: goto 047
      // 043: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 046: athrow
      // 047: iload 6
      // 049: goto 050
      // 04c: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: aload 4
      // 052: ifnull 06b
      // 055: iflt 097
      // 058: goto 05f
      // 05b: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05e: athrow
      // 05f: iload 5
      // 061: iload 6
      // 063: iadd
      // 064: goto 06b
      // 067: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: aload 1
      // 06c: arraylength
      // 06d: aload 4
      // 06f: ifnull 087
      // 072: if_icmpgt 097
      // 075: goto 07c
      // 078: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: iload 5
      // 07e: iload 6
      // 080: goto 087
      // 083: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: iadd
      // 088: aload 4
      // 08a: ifnull 0a5
      // 08d: ifge 0a3
      // 090: goto 097
      // 093: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: new java/lang/IndexOutOfBoundsException
      // 09a: dup
      // 09b: invokespecial java/lang/IndexOutOfBoundsException.<init> ()V
      // 09e: athrow
      // 09f: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: iload 6
      // 0a5: aload 4
      // 0a7: ifnull 0ba
      // 0aa: ifne 0b9
      // 0ad: goto 0b4
      // 0b0: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: bipush 0
      // 0b5: aload 7
      // 0b7: monitorexit
      // 0b8: ireturn
      // 0b9: bipush 0
      // 0ba: istore 8
      // 0bc: aload 0
      // 0bd: ldc2_w 533806280716047158
      // 0c0: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0c3: swap
      // 0c4: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 0c7: aload 4
      // 0c9: ifnull 14d
      // 0cc: ifeq 14b
      // 0cf: goto 0d6
      // 0d2: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: aload 1
      // 0d7: iload 5
      // 0d9: aload 0
      // 0da: ldc2_w 220243994838712492
      // 0dd: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0e0: swap
      // 0e1: invokevirtual java/lang/reflect/Field.getChar (Ljava/lang/Object;)C
      // 0e4: castore
      // 0e5: iinc 5 1
      // 0e8: iinc 6 -1
      // 0eb: aload 0
      // 0ec: bipush 0
      // 0ed: ldc2_w 533806280716047158
      // 0f0: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0f3: dup_x2
      // 0f4: pop
      // 0f5: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 0f8: bipush 1
      // 0f9: istore 8
      // 0fb: iload 6
      // 0fd: aload 4
      // 0ff: ifnull 14a
      // 102: ifeq 13e
      // 105: goto 10c
      // 108: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: aload 0
      // 10d: invokestatic com/c.f ()[Ljava/lang/Object;
      // 110: ldc2_w 277843894480433599
      // 113: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 116: dup_x2
      // 117: pop
      // 118: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 11b: checkcast java/lang/Boolean
      // 11e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 121: goto 128
      // 124: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 127: athrow
      // 128: aload 4
      // 12a: ifnull 14d
      // 12d: goto 134
      // 130: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 133: athrow
      // 134: ifne 14b
      // 137: goto 13e
      // 13a: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: iload 8
      // 140: aload 7
      // 142: monitorexit
      // 143: goto 14a
      // 146: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: ireturn
      // 14b: iload 6
      // 14d: bipush 1
      // 14e: aload 4
      // 150: ifnull 1e4
      // 153: if_icmpne 1be
      // 156: goto 15d
      // 159: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15c: athrow
      // 15d: aload 0
      // 15e: invokestatic com/c.f ()[Ljava/lang/Object;
      // 161: ldc2_w 466395161270742666
      // 164: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 167: dup_x2
      // 168: pop
      // 169: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 16c: checkcast java/lang/Integer
      // 16f: invokevirtual java/lang/Integer.intValue ()I
      // 172: goto 179
      // 175: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 178: athrow
      // 179: istore 9
      // 17b: iload 9
      // 17d: bipush -1
      // 17e: aload 4
      // 180: ifnull 1b9
      // 183: if_icmpne 1af
      // 186: goto 18d
      // 189: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18c: athrow
      // 18d: iload 8
      // 18f: aload 4
      // 191: ifnull 1a6
      // 194: goto 19b
      // 197: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19a: athrow
      // 19b: ifne 1a9
      // 19e: goto 1a5
      // 1a1: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a4: athrow
      // 1a5: bipush -1
      // 1a6: goto 1ab
      // 1a9: iload 8
      // 1ab: aload 7
      // 1ad: monitorexit
      // 1ae: ireturn
      // 1af: aload 1
      // 1b0: iload 5
      // 1b2: iload 9
      // 1b4: i2c
      // 1b5: castore
      // 1b6: iload 8
      // 1b8: bipush 1
      // 1b9: iadd
      // 1ba: aload 7
      // 1bc: monitorexit
      // 1bd: ireturn
      // 1be: iload 8
      // 1c0: aload 0
      // 1c1: aload 1
      // 1c2: iload 5
      // 1c4: iload 5
      // 1c6: iload 6
      // 1c8: iadd
      // 1c9: invokestatic com/c.a (Ljava/lang/Object;II)[Ljava/lang/Object;
      // 1cc: ldc2_w 378968898911894070
      // 1cf: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1d2: dup_x2
      // 1d3: pop
      // 1d4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1d7: checkcast java/lang/Integer
      // 1da: invokevirtual java/lang/Integer.intValue ()I
      // 1dd: goto 1e4
      // 1e0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e3: athrow
      // 1e4: iadd
      // 1e5: aload 7
      // 1e7: monitorexit
      // 1e8: ireturn
      // 1e9: astore 10
      // 1eb: aload 7
      // 1ed: monitorexit
      // 1ee: aload 10
      // 1f0: athrow
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
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: aload 0
      // 04: getfield Fz_2.lock Ljava/lang/Object;
      // 07: dup
      // 08: astore 2
      // 09: monitorenter
      // 0a: astore 1
      // 0b: aload 0
      // 0c: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0f: ldc2_w 567289451762661371
      // 12: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 15: dup_x2
      // 16: pop
      // 17: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1a: pop
      // 1b: goto 22
      // 1e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 0
      // 23: ldc2_w 533806280716047158
      // 26: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 29: swap
      // 2a: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 2d: aload 1
      // 2e: ifnull 6d
      // 31: ifne 6c
      // 34: goto 3b
      // 37: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 0
      // 3c: invokestatic com/c.f ()[Ljava/lang/Object;
      // 3f: ldc2_w 277843894480433599
      // 42: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 45: dup_x2
      // 46: pop
      // 47: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4a: checkcast java/lang/Boolean
      // 4d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 50: goto 57
      // 53: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 56: athrow
      // 57: aload 1
      // 58: ifnull 6d
      // 5b: goto 62
      // 5e: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: ifeq 70
      // 65: goto 6c
      // 68: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: bipush 1
      // 6d: goto 71
      // 70: bipush 0
      // 71: aload 2
      // 72: monitorexit
      // 73: ireturn
      // 74: astore 3
      // 75: aload 2
      // 76: monitorexit
      // 77: aload 3
      // 78: athrow
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void close() throws IOException {
      com.ky_4[] var10000 = yT_3.c();
      Object var2 = this.lock;
      synchronized (this.lock){} // $VF: monitorenter 
      com.ky_4[] var1 = var10000;

      try {
         label56: {
            label60: {
               try {
                  var10000 = this;
                  if (var1 == null) {
                     break label60;
                  }

                  if (com.c.c(171983685064499719L).getBoolean(this)) {
                     break label56;
                  }
               } catch (IOException var8) {
                  throw a(var8);
               }

               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(607673094265595581L);
               Object[] var10002 = var10001;
               Fz_2 var12 = this;
               Method var11 = var10003;

               try {
                  var11.invoke(var12, var10002);
               } catch (InvocationTargetException var7) {
                  throw var7.getTargetException();
               }

               com.c.c(171983685064499719L).setBoolean(this, true);
               var10000 = (com.ky_4[])var2;
            }

            // $VF: monitorexit
            return;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   private boolean H() {
      com.ky_4[] var1 = yT_3.c();

      try {
         boolean var10000 = com.c.c(171983685064499719L).getBoolean(this);
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

   private static FileChannel L(FileInputStream var0) {
      try {
         if (!com.c.c(140794893555705299L).getBoolean(null)) {
            return null;
         }
      } catch (UnsatisfiedLinkError var3) {
         throw a(var3);
      }

      try {
         return var0.getChannel();
      } catch (UnsatisfiedLinkError var2) {
         com.c.c(140794893555705299L).setBoolean(null, false);
         return null;
      }
   }

   Fz_2(InputStream var1, Object var2, Charset var3) {
      this(var1, var2, var3.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE));
   }

   Fz_2(InputStream param1, Object param2, CharsetDecoder param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: aload 0
      // 04: aload 2
      // 05: invokespecial java/io/Reader.<init> (Ljava/lang/Object;)V
      // 08: astore 4
      // 0a: aload 0
      // 0b: bipush 0
      // 0c: ldc2_w 533806280716047158
      // 0f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 12: dup_x2
      // 13: pop
      // 14: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 17: aload 0
      // 18: bipush 0
      // 19: ldc2_w 249215334697892941
      // 1c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1f: dup_x2
      // 20: pop
      // 21: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 24: aload 0
      // 25: new java/util/ArrayList
      // 28: dup
      // 29: invokespecial java/util/ArrayList.<init> ()V
      // 2c: ldc2_w 157900765809029780
      // 2f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 32: dup_x2
      // 33: pop
      // 34: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 37: aload 0
      // 38: aload 3
      // 39: invokevirtual java/nio/charset/CharsetDecoder.charset ()Ljava/nio/charset/Charset;
      // 3c: ldc2_w 553018690272945810
      // 3f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 42: dup_x2
      // 43: pop
      // 44: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 47: aload 0
      // 48: aload 3
      // 49: ldc2_w 611444958030254644
      // 4c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 4f: dup_x2
      // 50: pop
      // 51: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 54: aload 0
      // 55: aload 4
      // 57: ifnull ab
      // 5a: ldc2_w 513892591654619705
      // 5d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 60: swap
      // 61: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 64: checkcast java/nio/channels/ReadableByteChannel
      // 67: ifnonnull aa
      // 6a: goto 71
      // 6d: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: aload 0
      // 72: aload 1
      // 73: ldc2_w 283913459258382303
      // 76: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 79: dup_x2
      // 7a: pop
      // 7b: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 7e: aload 0
      // 7f: aconst_null
      // 80: ldc2_w 513892591654619705
      // 83: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 86: dup_x2
      // 87: pop
      // 88: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 8b: aload 0
      // 8c: sipush 14818
      // 8f: ldc2_w 6684125702607510708
      // 92: invokestatic Fz_2.a (IJ)I
      // 95: invokestatic java/nio/ByteBuffer.allocate (I)Ljava/nio/ByteBuffer;
      // 98: ldc2_w 200975572261612164
      // 9b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 9e: dup_x2
      // 9f: pop
      // a0: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // a3: goto aa
      // a6: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a9: athrow
      // aa: aload 0
      // ab: ldc2_w 200975572261612164
      // ae: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // b1: swap
      // b2: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // b5: checkcast java/nio/ByteBuffer
      // b8: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // bb: pop
      // bc: return
   }

   Fz_2(ReadableByteChannel param1, CharsetDecoder param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/io/Reader.<init> ()V
      // 04: aload 0
      // 05: bipush 0
      // 06: ldc2_w 533806280716047158
      // 09: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0c: dup_x2
      // 0d: pop
      // 0e: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 11: aload 0
      // 12: bipush 0
      // 13: ldc2_w 249215334697892941
      // 16: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 19: dup_x2
      // 1a: pop
      // 1b: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 1e: aload 0
      // 1f: new java/util/ArrayList
      // 22: dup
      // 23: invokespecial java/util/ArrayList.<init> ()V
      // 26: ldc2_w 157900765809029780
      // 29: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2c: dup_x2
      // 2d: pop
      // 2e: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 31: aload 0
      // 32: aconst_null
      // 33: ldc2_w 283913459258382303
      // 36: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 39: dup_x2
      // 3a: pop
      // 3b: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 3e: invokestatic yT_3.c ()[Lcom/ky_4;
      // 41: aload 0
      // 42: aload 1
      // 43: ldc2_w 513892591654619705
      // 46: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 49: dup_x2
      // 4a: pop
      // 4b: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 4e: astore 4
      // 50: aload 0
      // 51: aload 2
      // 52: ldc2_w 611444958030254644
      // 55: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 58: dup_x2
      // 59: pop
      // 5a: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 5d: aload 0
      // 5e: aload 2
      // 5f: invokevirtual java/nio/charset/CharsetDecoder.charset ()Ljava/nio/charset/Charset;
      // 62: ldc2_w 553018690272945810
      // 65: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 68: dup_x2
      // 69: pop
      // 6a: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 6d: aload 0
      // 6e: iload 3
      // 6f: aload 4
      // 71: ifnull 8f
      // 74: ifge 8e
      // 77: goto 7e
      // 7a: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d: athrow
      // 7e: sipush 24698
      // 81: ldc2_w 3912071447041492264
      // 84: invokestatic Fz_2.a (IJ)I
      // 87: goto bb
      // 8a: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: iload 3
      // 8f: aload 4
      // 91: ifnull b7
      // 94: sipush 30718
      // 97: ldc2_w 8570008180280742564
      // 9a: invokestatic Fz_2.a (IJ)I
      // 9d: if_icmpge ba
      // a0: goto a7
      // a3: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a6: athrow
      // a7: sipush 16014
      // aa: ldc2_w 8885243877555608537
      // ad: invokestatic Fz_2.a (IJ)I
      // b0: goto b7
      // b3: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6: athrow
      // b7: goto bb
      // ba: iload 3
      // bb: invokestatic java/nio/ByteBuffer.allocate (I)Ljava/nio/ByteBuffer;
      // be: ldc2_w 200975572261612164
      // c1: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // c4: dup_x2
      // c5: pop
      // c6: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // c9: aload 0
      // ca: ldc2_w 200975572261612164
      // cd: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // d0: swap
      // d1: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // d4: checkcast java/nio/ByteBuffer
      // d7: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // da: pop
      // db: return
   }

   private int E() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic yT_3.c ()[Lcom/ky_4;
      // 003: aload 0
      // 004: ldc2_w 200975572261612164
      // 007: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 00a: swap
      // 00b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 00e: checkcast java/nio/ByteBuffer
      // 011: invokevirtual java/nio/ByteBuffer.compact ()Ljava/nio/ByteBuffer;
      // 014: pop
      // 015: astore 1
      // 016: aload 0
      // 017: aload 1
      // 018: ifnull 085
      // 01b: ldc2_w 513892591654619705
      // 01e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 021: swap
      // 022: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 025: checkcast java/nio/channels/ReadableByteChannel
      // 028: ifnull 07d
      // 02b: goto 032
      // 02e: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 031: athrow
      // 032: aload 0
      // 033: ldc2_w 513892591654619705
      // 036: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 039: swap
      // 03a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 03d: checkcast java/nio/channels/ReadableByteChannel
      // 040: aload 0
      // 041: ldc2_w 200975572261612164
      // 044: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 047: swap
      // 048: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 04b: checkcast java/nio/ByteBuffer
      // 04e: invokeinterface java/nio/channels/ReadableByteChannel.read (Ljava/nio/ByteBuffer;)I 2
      // 053: istore 2
      // 054: iload 2
      // 055: aload 1
      // 056: ifnull 064
      // 059: ifge 079
      // 05c: goto 063
      // 05f: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: iload 2
      // 064: istore 3
      // 065: aload 0
      // 066: ldc2_w 200975572261612164
      // 069: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 06c: swap
      // 06d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 070: checkcast java/nio/ByteBuffer
      // 073: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 076: pop
      // 077: iload 3
      // 078: ireturn
      // 079: aload 1
      // 07a: ifnonnull 232
      // 07d: aload 0
      // 07e: goto 085
      // 081: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: ldc2_w 200975572261612164
      // 088: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 08b: swap
      // 08c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08f: checkcast java/nio/ByteBuffer
      // 092: invokevirtual java/nio/ByteBuffer.limit ()I
      // 095: istore 2
      // 096: aload 0
      // 097: ldc2_w 200975572261612164
      // 09a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 09d: swap
      // 09e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a1: checkcast java/nio/ByteBuffer
      // 0a4: invokevirtual java/nio/ByteBuffer.position ()I
      // 0a7: istore 3
      // 0a8: ldc2_w 526937170182300429
      // 0ab: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0ae: aconst_null
      // 0af: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 0b2: aload 1
      // 0b3: ifnull 0e4
      // 0b6: ifne 0e3
      // 0b9: goto 0c0
      // 0bc: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: iload 3
      // 0c1: iload 2
      // 0c2: aload 1
      // 0c3: ifnull 0e5
      // 0c6: goto 0cd
      // 0c9: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: if_icmple 0e3
      // 0d0: goto 0d7
      // 0d3: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: new java/lang/AssertionError
      // 0da: dup
      // 0db: invokespecial java/lang/AssertionError.<init> ()V
      // 0de: athrow
      // 0df: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e2: athrow
      // 0e3: iload 3
      // 0e4: iload 2
      // 0e5: aload 1
      // 0e6: ifnull 0fc
      // 0e9: if_icmpgt 100
      // 0ec: goto 0f3
      // 0ef: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f2: athrow
      // 0f3: iload 2
      // 0f4: iload 3
      // 0f5: goto 0fc
      // 0f8: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: isub
      // 0fd: goto 101
      // 100: bipush 0
      // 101: istore 4
      // 103: ldc2_w 526937170182300429
      // 106: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 109: aconst_null
      // 10a: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 10d: aload 1
      // 10e: ifnull 175
      // 111: ifne 13e
      // 114: goto 11b
      // 117: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11a: athrow
      // 11b: iload 4
      // 11d: aload 1
      // 11e: ifnull 175
      // 121: goto 128
      // 124: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: ifgt 13e
      // 12b: goto 132
      // 12e: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 131: athrow
      // 132: new java/lang/AssertionError
      // 135: dup
      // 136: invokespecial java/lang/AssertionError.<init> ()V
      // 139: athrow
      // 13a: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: aload 0
      // 13f: ldc2_w 283913459258382303
      // 142: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 145: swap
      // 146: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 149: checkcast java/io/InputStream
      // 14c: aload 0
      // 14d: ldc2_w 200975572261612164
      // 150: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 153: swap
      // 154: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 157: checkcast java/nio/ByteBuffer
      // 15a: invokevirtual java/nio/ByteBuffer.array ()[B
      // 15d: aload 0
      // 15e: ldc2_w 200975572261612164
      // 161: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 164: swap
      // 165: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 168: checkcast java/nio/ByteBuffer
      // 16b: invokevirtual java/nio/ByteBuffer.arrayOffset ()I
      // 16e: iload 3
      // 16f: iadd
      // 170: iload 4
      // 172: invokevirtual java/io/InputStream.read ([BII)I
      // 175: istore 5
      // 177: iload 5
      // 179: aload 1
      // 17a: ifnull 1a2
      // 17d: ifge 1a0
      // 180: goto 187
      // 183: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 186: athrow
      // 187: iload 5
      // 189: istore 6
      // 18b: aload 0
      // 18c: ldc2_w 200975572261612164
      // 18f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 192: swap
      // 193: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 196: checkcast java/nio/ByteBuffer
      // 199: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 19c: pop
      // 19d: iload 6
      // 19f: ireturn
      // 1a0: iload 5
      // 1a2: aload 1
      // 1a3: ifnull 1cf
      // 1a6: ifne 1c5
      // 1a9: goto 1b0
      // 1ac: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1af: athrow
      // 1b0: new java/io/IOException
      // 1b3: dup
      // 1b4: sipush 2857
      // 1b7: sipush 15319
      // 1ba: invokestatic Fz_2.a (II)Ljava/lang/String;
      // 1bd: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 1c0: athrow
      // 1c1: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c4: athrow
      // 1c5: ldc2_w 526937170182300429
      // 1c8: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1cb: aconst_null
      // 1cc: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 1cf: aload 1
      // 1d0: ifnull 1df
      // 1d3: ifne 21c
      // 1d6: goto 1dd
      // 1d9: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1dc: athrow
      // 1dd: iload 5
      // 1df: iload 4
      // 1e1: if_icmple 21c
      // 1e4: new java/lang/AssertionError
      // 1e7: dup
      // 1e8: new java/lang/StringBuilder
      // 1eb: dup
      // 1ec: invokespecial java/lang/StringBuilder.<init> ()V
      // 1ef: sipush 2858
      // 1f2: sipush -26577
      // 1f5: invokestatic Fz_2.a (II)Ljava/lang/String;
      // 1f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fb: iload 5
      // 1fd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 200: sipush 2859
      // 203: sipush -6498
      // 206: invokestatic Fz_2.a (II)Ljava/lang/String;
      // 209: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20c: iload 4
      // 20e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 211: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 214: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 217: athrow
      // 218: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21b: athrow
      // 21c: aload 0
      // 21d: ldc2_w 200975572261612164
      // 220: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 223: swap
      // 224: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 227: checkcast java/nio/ByteBuffer
      // 22a: iload 3
      // 22b: iload 5
      // 22d: iadd
      // 22e: invokevirtual java/nio/ByteBuffer.position (I)Ljava/nio/ByteBuffer;
      // 231: pop
      // 232: aload 0
      // 233: ldc2_w 200975572261612164
      // 236: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 239: swap
      // 23a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 23d: checkcast java/nio/ByteBuffer
      // 240: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 243: pop
      // 244: goto 25e
      // 247: astore 7
      // 249: aload 0
      // 24a: ldc2_w 200975572261612164
      // 24d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 250: swap
      // 251: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 254: checkcast java/nio/ByteBuffer
      // 257: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 25a: pop
      // 25b: aload 7
      // 25d: athrow
      // 25e: aload 0
      // 25f: ldc2_w 200975572261612164
      // 262: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 265: swap
      // 266: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 269: checkcast java/nio/ByteBuffer
      // 26c: invokevirtual java/nio/ByteBuffer.remaining ()I
      // 26f: istore 2
      // 270: ldc2_w 526937170182300429
      // 273: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 276: aconst_null
      // 277: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 27a: aload 1
      // 27b: ifnull 2ac
      // 27e: ifne 2ab
      // 281: goto 288
      // 284: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 287: athrow
      // 288: iload 2
      // 289: aload 1
      // 28a: ifnull 2ac
      // 28d: goto 294
      // 290: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 293: athrow
      // 294: ifne 2ab
      // 297: goto 29e
      // 29a: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29d: athrow
      // 29e: new java/lang/AssertionError
      // 2a1: dup
      // 2a2: iload 2
      // 2a3: invokespecial java/lang/AssertionError.<init> (I)V
      // 2a6: athrow
      // 2a7: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2aa: athrow
      // 2ab: iload 2
      // 2ac: ireturn
   }

   int J(char[] param1, int param2, int param3) throws IOException {
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
      // 004: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 007: swap
      // 008: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 00b: checkcast java/util/ArrayList
      // 00e: invokevirtual java/util/ArrayList.clear ()V
      // 011: iinc 3 -100
      // 014: invokestatic yT_3.c ()[Lcom/ky_4;
      // 017: bipush 0
      // 018: istore 5
      // 01a: astore 4
      // 01c: bipush 0
      // 01d: istore 6
      // 01f: ldc2_w 526937170182300429
      // 022: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 025: aconst_null
      // 026: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 029: aload 4
      // 02b: ifnull 042
      // 02e: ifne 052
      // 031: goto 038
      // 034: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: iload 3
      // 039: iload 2
      // 03a: isub
      // 03b: goto 042
      // 03e: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: bipush 1
      // 043: if_icmpgt 052
      // 046: new java/lang/AssertionError
      // 049: dup
      // 04a: invokespecial java/lang/AssertionError.<init> ()V
      // 04d: athrow
      // 04e: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: aload 1
      // 053: iload 2
      // 054: iload 3
      // 055: iload 2
      // 056: isub
      // 057: invokestatic java/nio/CharBuffer.wrap ([CII)Ljava/nio/CharBuffer;
      // 05a: astore 7
      // 05c: aload 7
      // 05e: invokevirtual java/nio/CharBuffer.position ()I
      // 061: aload 4
      // 063: ifnull 078
      // 066: ifeq 077
      // 069: goto 070
      // 06c: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: aload 7
      // 072: invokevirtual java/nio/CharBuffer.slice ()Ljava/nio/CharBuffer;
      // 075: astore 7
      // 077: bipush 0
      // 078: istore 8
      // 07a: bipush 0
      // 07b: istore 9
      // 07d: bipush 0
      // 07e: istore 10
      // 080: aload 7
      // 082: invokevirtual java/nio/CharBuffer.position ()I
      // 085: istore 11
      // 087: aload 0
      // 088: ldc2_w 200975572261612164
      // 08b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 08e: swap
      // 08f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 092: checkcast java/nio/ByteBuffer
      // 095: invokevirtual java/nio/ByteBuffer.position ()I
      // 098: istore 12
      // 09a: aload 0
      // 09b: ldc2_w 611444958030254644
      // 09e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0a1: swap
      // 0a2: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a5: checkcast java/nio/charset/CharsetDecoder
      // 0a8: aload 0
      // 0a9: ldc2_w 200975572261612164
      // 0ac: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0af: swap
      // 0b0: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b3: checkcast java/nio/ByteBuffer
      // 0b6: aload 7
      // 0b8: iload 8
      // 0ba: invokevirtual java/nio/charset/CharsetDecoder.decode (Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;
      // 0bd: astore 13
      // 0bf: aload 0
      // 0c0: ldc2_w 200975572261612164
      // 0c3: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0c6: swap
      // 0c7: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ca: checkcast java/nio/ByteBuffer
      // 0cd: invokevirtual java/nio/ByteBuffer.position ()I
      // 0d0: istore 14
      // 0d2: iload 14
      // 0d4: iload 12
      // 0d6: isub
      // 0d7: istore 15
      // 0d9: iload 6
      // 0db: iload 15
      // 0dd: iadd
      // 0de: istore 6
      // 0e0: iload 10
      // 0e2: ifeq 0e5
      // 0e5: iload 15
      // 0e7: aload 4
      // 0e9: ifnull 103
      // 0ec: ifge 101
      // 0ef: goto 0f6
      // 0f2: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: invokestatic java/lang/System.currentTimeMillis ()J
      // 0f9: pop2
      // 0fa: goto 101
      // 0fd: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: iload 12
      // 103: istore 16
      // 105: iload 16
      // 107: iload 14
      // 109: if_icmpge 14d
      // 10c: aload 0
      // 10d: ldc2_w 200975572261612164
      // 110: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 113: swap
      // 114: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 117: checkcast java/nio/ByteBuffer
      // 11a: invokevirtual java/nio/ByteBuffer.array ()[B
      // 11d: iload 16
      // 11f: baload
      // 120: istore 17
      // 122: aload 0
      // 123: ldc2_w 157900765809029780
      // 126: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 129: swap
      // 12a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 12d: checkcast java/util/ArrayList
      // 130: iload 17
      // 132: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 135: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 138: pop
      // 139: iinc 16 1
      // 13c: aload 4
      // 13e: ifnull 2ab
      // 141: aload 4
      // 143: ifnonnull 105
      // 146: goto 14d
      // 149: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: aload 13
      // 14f: invokevirtual java/nio/charset/CoderResult.isUnderflow ()Z
      // 152: aload 4
      // 154: ifnull 2bc
      // 157: ifeq 2ab
      // 15a: goto 161
      // 15d: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 160: athrow
      // 161: iload 8
      // 163: aload 4
      // 165: ifnull 191
      // 168: goto 16f
      // 16b: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16e: athrow
      // 16f: ifeq 185
      // 172: goto 179
      // 175: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 178: athrow
      // 179: aload 4
      // 17b: ifnonnull 310
      // 17e: goto 185
      // 181: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 184: athrow
      // 185: aload 7
      // 187: invokevirtual java/nio/CharBuffer.hasRemaining ()Z
      // 18a: goto 191
      // 18d: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 190: athrow
      // 191: aload 4
      // 193: ifnull 1b8
      // 196: ifne 1ac
      // 199: goto 1a0
      // 19c: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19f: athrow
      // 1a0: aload 4
      // 1a2: ifnonnull 310
      // 1a5: goto 1ac
      // 1a8: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ab: athrow
      // 1ac: aload 7
      // 1ae: invokevirtual java/nio/CharBuffer.position ()I
      // 1b1: goto 1b8
      // 1b4: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b7: athrow
      // 1b8: aload 4
      // 1ba: ifnull 228
      // 1bd: ifle 205
      // 1c0: goto 1c7
      // 1c3: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c6: athrow
      // 1c7: aload 0
      // 1c8: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1cb: ldc2_w 261599358558391043
      // 1ce: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1d1: dup_x2
      // 1d2: pop
      // 1d3: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1d6: checkcast java/lang/Boolean
      // 1d9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1dc: goto 1e3
      // 1df: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e2: athrow
      // 1e3: aload 4
      // 1e5: ifnull 228
      // 1e8: goto 1ef
      // 1eb: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ee: athrow
      // 1ef: ifne 205
      // 1f2: goto 1f9
      // 1f5: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f8: athrow
      // 1f9: aload 4
      // 1fb: ifnonnull 310
      // 1fe: goto 205
      // 201: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 204: athrow
      // 205: aload 0
      // 206: invokestatic com/c.f ()[Ljava/lang/Object;
      // 209: ldc2_w 369109331329909235
      // 20c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 20f: dup_x2
      // 210: pop
      // 211: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 214: checkcast java/lang/Integer
      // 217: invokevirtual java/lang/Integer.intValue ()I
      // 21a: goto 221
      // 21d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 220: athrow
      // 221: istore 16
      // 223: bipush 1
      // 224: istore 10
      // 226: iload 16
      // 228: aload 4
      // 22a: ifnull 2a4
      // 22d: ifge 29f
      // 230: goto 237
      // 233: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 236: athrow
      // 237: bipush 1
      // 238: istore 8
      // 23a: aload 4
      // 23c: ifnull 29a
      // 23f: aload 7
      // 241: invokevirtual java/nio/CharBuffer.position ()I
      // 244: ifne 281
      // 247: goto 24e
      // 24a: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24d: athrow
      // 24e: aload 0
      // 24f: aload 4
      // 251: ifnull 289
      // 254: goto 25b
      // 257: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25a: athrow
      // 25b: ldc2_w 200975572261612164
      // 25e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 261: swap
      // 262: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 265: checkcast java/nio/ByteBuffer
      // 268: invokevirtual java/nio/ByteBuffer.hasRemaining ()Z
      // 26b: ifne 281
      // 26e: goto 275
      // 271: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 274: athrow
      // 275: aload 4
      // 277: ifnonnull 310
      // 27a: goto 281
      // 27d: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 280: athrow
      // 281: aload 0
      // 282: goto 289
      // 285: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 288: athrow
      // 289: ldc2_w 611444958030254644
      // 28c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 28f: swap
      // 290: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 293: checkcast java/nio/charset/CharsetDecoder
      // 296: invokevirtual java/nio/charset/CharsetDecoder.reset ()Ljava/nio/charset/CharsetDecoder;
      // 299: pop
      // 29a: aload 4
      // 29c: ifnonnull 087
      // 29f: iload 9
      // 2a1: iload 16
      // 2a3: iadd
      // 2a4: istore 9
      // 2a6: aload 4
      // 2a8: ifnonnull 087
      // 2ab: aload 13
      // 2ad: aload 4
      // 2af: ifnull 308
      // 2b2: invokevirtual java/nio/charset/CoderResult.isOverflow ()Z
      // 2b5: goto 2bc
      // 2b8: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bb: athrow
      // 2bc: ifeq 306
      // 2bf: ldc2_w 526937170182300429
      // 2c2: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2c5: aconst_null
      // 2c6: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 2c9: aload 4
      // 2cb: ifnull 319
      // 2ce: goto 2d5
      // 2d1: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d4: athrow
      // 2d5: ifne 310
      // 2d8: goto 2df
      // 2db: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2de: athrow
      // 2df: aload 7
      // 2e1: invokevirtual java/nio/CharBuffer.position ()I
      // 2e4: aload 4
      // 2e6: ifnull 319
      // 2e9: goto 2f0
      // 2ec: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ef: athrow
      // 2f0: ifgt 310
      // 2f3: goto 2fa
      // 2f6: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f9: athrow
      // 2fa: new java/lang/AssertionError
      // 2fd: dup
      // 2fe: invokespecial java/lang/AssertionError.<init> ()V
      // 301: athrow
      // 302: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 305: athrow
      // 306: aload 13
      // 308: invokevirtual java/nio/charset/CoderResult.throwException ()V
      // 30b: aload 4
      // 30d: ifnonnull 087
      // 310: aload 7
      // 312: invokevirtual java/nio/CharBuffer.position ()I
      // 315: istore 12
      // 317: iload 8
      // 319: aload 4
      // 31b: ifnull 346
      // 31e: ifeq 341
      // 321: goto 328
      // 324: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 327: athrow
      // 328: aload 0
      // 329: ldc2_w 611444958030254644
      // 32c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 32f: swap
      // 330: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 333: checkcast java/nio/charset/CharsetDecoder
      // 336: invokevirtual java/nio/charset/CharsetDecoder.reset ()Ljava/nio/charset/CharsetDecoder;
      // 339: pop
      // 33a: goto 341
      // 33d: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 340: athrow
      // 341: aload 7
      // 343: invokevirtual java/nio/CharBuffer.position ()I
      // 346: aload 4
      // 348: ifnull 3a0
      // 34b: ifne 398
      // 34e: goto 355
      // 351: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 354: athrow
      // 355: iload 8
      // 357: aload 4
      // 359: ifnull 37d
      // 35c: goto 363
      // 35f: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 362: athrow
      // 363: ifeq 373
      // 366: goto 36d
      // 369: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36c: athrow
      // 36d: bipush -1
      // 36e: ireturn
      // 36f: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 372: athrow
      // 373: ldc2_w 526937170182300429
      // 376: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 379: aconst_null
      // 37a: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 37d: aload 4
      // 37f: ifnull 3a0
      // 382: ifne 398
      // 385: goto 38c
      // 388: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38b: athrow
      // 38c: new java/lang/AssertionError
      // 38f: dup
      // 390: invokespecial java/lang/AssertionError.<init> ()V
      // 393: athrow
      // 394: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 397: athrow
      // 398: aload 7
      // 39a: invokevirtual java/nio/CharBuffer.position ()I
      // 39d: istore 5
      // 39f: bipush 0
      // 3a0: istore 13
      // 3a2: aload 0
      // 3a3: ldc2_w 200975572261612164
      // 3a6: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3a9: swap
      // 3aa: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3ad: checkcast java/nio/ByteBuffer
      // 3b0: invokevirtual java/nio/ByteBuffer.array ()[B
      // 3b3: astore 14
      // 3b5: iload 12
      // 3b7: iload 11
      // 3b9: isub
      // 3ba: istore 15
      // 3bc: iload 3
      // 3bd: iload 2
      // 3be: isub
      // 3bf: iload 15
      // 3c1: isub
      // 3c2: istore 16
      // 3c4: bipush 0
      // 3c5: istore 17
      // 3c7: iload 16
      // 3c9: aload 4
      // 3cb: ifnull 3f0
      // 3ce: ifle 41e
      // 3d1: goto 3d8
      // 3d4: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d7: athrow
      // 3d8: aload 0
      // 3d9: ldc2_w 200975572261612164
      // 3dc: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3df: swap
      // 3e0: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3e3: checkcast java/nio/ByteBuffer
      // 3e6: invokevirtual java/nio/ByteBuffer.remaining ()I
      // 3e9: goto 3f0
      // 3ec: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ef: athrow
      // 3f0: aload 4
      // 3f2: ifnull 41c
      // 3f5: ifle 41e
      // 3f8: goto 3ff
      // 3fb: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3fe: athrow
      // 3ff: iload 16
      // 401: aload 0
      // 402: ldc2_w 200975572261612164
      // 405: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 408: swap
      // 409: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 40c: checkcast java/nio/ByteBuffer
      // 40f: invokevirtual java/nio/ByteBuffer.remaining ()I
      // 412: invokestatic java/lang/Math.min (II)I
      // 415: goto 41c
      // 418: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41b: athrow
      // 41c: istore 17
      // 41e: aload 14
      // 420: astore 18
      // 422: aload 18
      // 424: arraylength
      // 425: istore 19
      // 427: bipush 0
      // 428: istore 20
      // 42a: iload 20
      // 42c: iload 19
      // 42e: if_icmpge 520
      // 431: aload 18
      // 433: iload 20
      // 435: baload
      // 436: istore 21
      // 438: aload 4
      // 43a: ifnull 51b
      // 43d: iload 13
      // 43f: bipush 2
      // 440: aload 4
      // 442: ifnull 522
      // 445: goto 44c
      // 448: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44b: athrow
      // 44c: if_icmplt 515
      // 44f: goto 456
      // 452: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 455: athrow
      // 456: aload 14
      // 458: iload 13
      // 45a: bipush 1
      // 45b: isub
      // 45c: baload
      // 45d: sipush 22279
      // 460: ldc2_w 4777490264669778518
      // 463: invokestatic Fz_2.a (IJ)I
      // 466: aload 4
      // 468: ifnull 493
      // 46b: goto 472
      // 46e: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 471: athrow
      // 472: if_icmpne 515
      // 475: goto 47c
      // 478: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47b: athrow
      // 47c: aload 14
      // 47e: iload 13
      // 480: bipush 2
      // 481: isub
      // 482: baload
      // 483: sipush 27023
      // 486: ldc2_w 2994393337764564191
      // 489: invokestatic Fz_2.a (IJ)I
      // 48c: goto 493
      // 48f: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 492: athrow
      // 493: aload 4
      // 495: ifnull 4d2
      // 498: if_icmpne 515
      // 49b: goto 4a2
      // 49e: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a1: athrow
      // 4a2: aload 0
      // 4a3: bipush 1
      // 4a4: ldc2_w 249215334697892941
      // 4a7: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 4aa: dup_x2
      // 4ab: pop
      // 4ac: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 4af: aload 4
      // 4b1: ifnull 51b
      // 4b4: goto 4bb
      // 4b7: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ba: athrow
      // 4bb: aload 14
      // 4bd: iload 13
      // 4bf: bipush 1
      // 4c0: iadd
      // 4c1: baload
      // 4c2: sipush 32456
      // 4c5: ldc2_w 8697765157444574107
      // 4c8: invokestatic Fz_2.a (IJ)I
      // 4cb: goto 4d2
      // 4ce: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d1: athrow
      // 4d2: if_icmpne 515
      // 4d5: aload 14
      // 4d7: iload 13
      // 4d9: bipush 2
      // 4da: iadd
      // 4db: baload
      // 4dc: sipush 5411
      // 4df: ldc2_w 4180062081311584374
      // 4e2: invokestatic Fz_2.a (IJ)I
      // 4e5: aload 4
      // 4e7: ifnull 512
      // 4ea: goto 4f1
      // 4ed: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f0: athrow
      // 4f1: if_icmpne 515
      // 4f4: goto 4fb
      // 4f7: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4fa: athrow
      // 4fb: aload 14
      // 4fd: iload 13
      // 4ff: bipush 3
      // 500: iadd
      // 501: baload
      // 502: sipush 16207
      // 505: ldc2_w 6823891315145251355
      // 508: invokestatic Fz_2.a (IJ)I
      // 50b: goto 512
      // 50e: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 511: athrow
      // 512: if_icmpne 515
      // 515: iinc 13 1
      // 518: iinc 20 1
      // 51b: aload 4
      // 51d: ifnonnull 42a
      // 520: iload 3
      // 521: iload 2
      // 522: isub
      // 523: istore 18
      // 525: iload 9
      // 527: iload 18
      // 529: if_icmple 52c
      // 52c: iload 9
      // 52e: aload 0
      // 52f: ldc2_w 157900765809029780
      // 532: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 535: swap
      // 536: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 539: checkcast java/util/ArrayList
      // 53c: invokevirtual java/util/ArrayList.size ()I
      // 53f: isub
      // 540: istore 19
      // 542: iload 17
      // 544: istore 19
      // 546: aload 0
      // 547: ldc2_w 249215334697892941
      // 54a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 54d: swap
      // 54e: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 551: aload 4
      // 553: ifnull 668
      // 556: ifeq 666
      // 559: goto 560
      // 55c: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55f: athrow
      // 560: iload 2
      // 561: istore 20
      // 563: bipush 0
      // 564: istore 21
      // 566: iload 20
      // 568: iload 3
      // 569: iload 2
      // 56a: isub
      // 56b: if_icmpge 5d4
      // 56e: iload 21
      // 570: aload 4
      // 572: ifnull 5da
      // 575: aload 4
      // 577: ifnull 5da
      // 57a: goto 581
      // 57d: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 580: athrow
      // 581: aload 0
      // 582: ldc2_w 157900765809029780
      // 585: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 588: swap
      // 589: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 58c: checkcast java/util/ArrayList
      // 58f: invokevirtual java/util/ArrayList.size ()I
      // 592: if_icmpge 5d4
      // 595: goto 59c
      // 598: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59b: athrow
      // 59c: aload 0
      // 59d: ldc2_w 157900765809029780
      // 5a0: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 5a3: swap
      // 5a4: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 5a7: checkcast java/util/ArrayList
      // 5aa: iload 21
      // 5ac: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 5af: checkcast java/lang/Byte
      // 5b2: invokevirtual java/lang/Byte.byteValue ()B
      // 5b5: istore 22
      // 5b7: aload 1
      // 5b8: iload 20
      // 5ba: caload
      // 5bb: istore 23
      // 5bd: aload 1
      // 5be: iload 20
      // 5c0: iload 22
      // 5c2: i2c
      // 5c3: castore
      // 5c4: iload 22
      // 5c6: ifeq 5c9
      // 5c9: iinc 20 1
      // 5cc: iinc 21 1
      // 5cf: aload 4
      // 5d1: ifnonnull 566
      // 5d4: iload 6
      // 5d6: istore 5
      // 5d8: iload 19
      // 5da: aload 4
      // 5dc: ifnull 668
      // 5df: ifle 666
      // 5e2: goto 5e9
      // 5e5: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e8: athrow
      // 5e9: bipush 0
      // 5ea: istore 22
      // 5ec: iload 22
      // 5ee: iload 19
      // 5f0: if_icmpge 639
      // 5f3: aload 0
      // 5f4: ldc2_w 200975572261612164
      // 5f7: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 5fa: swap
      // 5fb: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 5fe: checkcast java/nio/ByteBuffer
      // 601: invokevirtual java/nio/ByteBuffer.array ()[B
      // 604: aload 0
      // 605: ldc2_w 200975572261612164
      // 608: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 60b: swap
      // 60c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 60f: checkcast java/nio/ByteBuffer
      // 612: invokevirtual java/nio/ByteBuffer.position ()I
      // 615: iload 22
      // 617: iadd
      // 618: baload
      // 619: istore 23
      // 61b: aload 1
      // 61c: iload 20
      // 61e: iload 22
      // 620: iadd
      // 621: iload 23
      // 623: i2c
      // 624: castore
      // 625: iinc 22 1
      // 628: aload 4
      // 62a: ifnull 65f
      // 62d: aload 4
      // 62f: ifnonnull 5ec
      // 632: goto 639
      // 635: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 638: athrow
      // 639: aload 0
      // 63a: ldc2_w 200975572261612164
      // 63d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 640: swap
      // 641: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 644: checkcast java/nio/ByteBuffer
      // 647: aload 0
      // 648: ldc2_w 200975572261612164
      // 64b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 64e: swap
      // 64f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 652: checkcast java/nio/ByteBuffer
      // 655: invokevirtual java/nio/ByteBuffer.position ()I
      // 658: iload 19
      // 65a: iadd
      // 65b: invokevirtual java/nio/ByteBuffer.position (I)Ljava/nio/ByteBuffer;
      // 65e: pop
      // 65f: iload 5
      // 661: iload 19
      // 663: iadd
      // 664: istore 5
      // 666: iload 5
      // 668: ireturn
   }

   String D() {
      return ((Charset)com.c.c(553018690272945810L).get(this)).name();
   }

   private boolean B() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 47
      // 09: ldc2_w 283913459258382303
      // 0c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0f: swap
      // 10: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 13: checkcast java/io/InputStream
      // 16: ifnull 46
      // 19: goto 20
      // 1c: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 0
      // 21: ldc2_w 283913459258382303
      // 24: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 27: swap
      // 28: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2b: checkcast java/io/InputStream
      // 2e: invokevirtual java/io/InputStream.available ()I
      // 31: aload 1
      // 32: ifnull 63
      // 35: goto 3c
      // 38: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: ifgt 62
      // 3f: goto 46
      // 42: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 0
      // 47: ldc2_w 513892591654619705
      // 4a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 4d: swap
      // 4e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 51: instanceof java/nio/channels/FileChannel
      // 54: aload 1
      // 55: ifnull 63
      // 58: ifeq 66
      // 5b: goto 62
      // 5e: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: bipush 1
      // 63: goto 67
      // 66: bipush 0
      // 67: ireturn
      // 68: astore 2
      // 69: bipush 0
      // 6a: ireturn
   }

   boolean X() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: astore 1
      // 04: aload 0
      // 05: ldc2_w 200975572261612164
      // 08: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0b: swap
      // 0c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f: checkcast java/nio/ByteBuffer
      // 12: invokevirtual java/nio/ByteBuffer.hasRemaining ()Z
      // 15: aload 1
      // 16: ifnull 55
      // 19: ifne 54
      // 1c: goto 23
      // 1f: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: invokestatic com/c.f ()[Ljava/lang/Object;
      // 27: ldc2_w 261599358558391043
      // 2a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2d: dup_x2
      // 2e: pop
      // 2f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 32: checkcast java/lang/Boolean
      // 35: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 38: goto 3f
      // 3b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 1
      // 40: ifnull 55
      // 43: goto 4a
      // 46: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: ifeq 58
      // 4d: goto 54
      // 50: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: bipush 1
      // 55: goto 59
      // 58: bipush 0
      // 59: ireturn
   }

   void c() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 46
      // 09: ldc2_w 513892591654619705
      // 0c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0f: swap
      // 10: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 13: checkcast java/nio/channels/ReadableByteChannel
      // 16: ifnull 3e
      // 19: goto 20
      // 1c: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 0
      // 21: ldc2_w 513892591654619705
      // 24: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 27: swap
      // 28: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2b: checkcast java/nio/channels/ReadableByteChannel
      // 2e: invokeinterface java/nio/channels/ReadableByteChannel.close ()V 1
      // 33: aload 1
      // 34: ifnonnull 56
      // 37: goto 3e
      // 3a: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 0
      // 3f: goto 46
      // 42: invokestatic Fz_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: ldc2_w 283913459258382303
      // 49: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 4c: swap
      // 4d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 50: checkcast java/io/InputStream
      // 53: invokevirtual java/io/InputStream.close ()V
      // 56: return
   }

   public boolean O() {
      return com.c.c(249215334697892941L).getBoolean(this);
   }

   public void v(boolean var1) {
      com.c.c(249215334697892941L).setBoolean(this, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "|\u0002\u008b^\b:9\u0006|Î7\u000f\u009c";
      int var12 = "|\u0002\u008b^\b:9\u0006|Î7\u000f\u009c".length();
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
                                          if (!Fz_2.class.desiredAssertionStatus()) {
                                             var21 = true;
                                             break label48;
                                          }
                                       } catch (IllegalCharsetNameException var15) {
                                          throw a(var15);
                                       }

                                       var21 = false;
                                    }

                                    F = var21;
                                    com.c.c(140794893555705299L).setBoolean(null, true);
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
                  var12 = "\u0086o\u0016\u007f×\r«k|\u0080\u0010¿=+\u0090H\u0004ÂR»3\u0096\u001f|m%¡¬\u008bÞ\u0007_øÂ¼lrmñ¤0\u0014çv(\u0004¤Té¤Ú\u0005¶µÊ¹¹"
                     .length();
                  var9 = '\r';
                  var18 = -1;
            }

            var10000 = 41;
            var10001 = var10.substring(++var18, var18 + var9);
            var10002 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9554;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





