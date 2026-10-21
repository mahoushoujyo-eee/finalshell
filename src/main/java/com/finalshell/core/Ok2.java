package com.finalshell.core;

import com.finalshell.io.YM3;
import com.finalshell.ui.model.EP;
import com.finalshell.ui.model.Ks2_2;
import com.finalshell.ui.model.O0;
import com.finalshell.ui.model.Oc2;
import com.finalshell.ui.panel.Ky4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Ok2 implements CA3_2, Xd4 {
   public static TimeZone X;
   public static Locale Y;
   public static String Z;
   public static Wr4[] s;
   public static String z;
   public static int h;
   public static int a;
   public static ConcurrentHashMap A;
   public static ThreadLocal H;
   public static ThreadLocal w;
   public static Ky4[] i;
   public static String[] b;
   public static String[] c;
   public static long[] f;
   public static Integer[] j;

   public static void z(Properties param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: sipush 22088
      // 004: sipush -16668
      // 007: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 00a: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 00d: astore 1
      // 00e: getstatic com/finalshell/ui/model/EP.MapSortField Lcom/finalshell/ui/model/EP;
      // 011: invokevirtual com/finalshell/ui/model/EP.a ()I
      // 014: istore 2
      // 015: sipush 22085
      // 018: sipush 15788
      // 01b: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 01e: aload 1
      // 01f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 022: ifeq 034
      // 025: getstatic com/finalshell/core/Ok2.a I
      // 028: iload 2
      // 029: ior
      // 02a: putstatic com/finalshell/core/Ok2.a I
      // 02d: goto 055
      // 030: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: sipush 22082
      // 037: sipush 23817
      // 03a: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 03d: aload 1
      // 03e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 041: ifeq 055
      // 044: getstatic com/finalshell/core/Ok2.a I
      // 047: iload 2
      // 048: bipush -1
      // 049: ixor
      // 04a: iand
      // 04b: putstatic com/finalshell/core/Ok2.a I
      // 04e: goto 055
      // 051: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: sipush 22087
      // 058: sipush 28665
      // 05b: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 05e: aload 0
      // 05f: sipush 22089
      // 062: sipush -14243
      // 065: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 068: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 06b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 06e: ifeq 085
      // 071: getstatic com/finalshell/core/Ok2.h I
      // 074: getstatic com/finalshell/ui/model/Ks2_2.NonStringKeyAsString Lcom/finalshell/ui/model/Ks2_2;
      // 077: invokevirtual com/finalshell/ui/model/Ks2_2.v ()I
      // 07a: ior
      // 07b: putstatic com/finalshell/core/Ok2.h I
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: sipush 22087
      // 088: sipush 28665
      // 08b: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 08e: aload 0
      // 08f: sipush 22094
      // 092: sipush 10644
      // 095: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 098: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 09b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 09e: ifne 0c4
      // 0a1: sipush 22087
      // 0a4: sipush 28665
      // 0a7: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 0aa: aload 0
      // 0ab: sipush 22090
      // 0ae: sipush 7620
      // 0b1: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 0b4: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 0b7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ba: ifeq 0d8
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: getstatic com/finalshell/core/Ok2.h I
      // 0c7: getstatic com/finalshell/ui/model/Ks2_2.ErrorOnEnumNotMatch Lcom/finalshell/ui/model/Ks2_2;
      // 0ca: invokevirtual com/finalshell/ui/model/Ks2_2.v ()I
      // 0cd: ior
      // 0ce: putstatic com/finalshell/core/Ok2.h I
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d7: athrow
      // 0d8: sipush 22083
      // 0db: sipush -31277
      // 0de: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 0e1: aload 0
      // 0e2: sipush 22091
      // 0e5: sipush -523
      // 0e8: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 0eb: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 0ee: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f1: ifeq 109
      // 0f4: getstatic com/finalshell/core/IG.D Lcom/finalshell/core/IG;
      // 0f7: bipush 0
      // 0f8: invokevirtual com/finalshell/core/IG.P (Z)V
      // 0fb: getstatic com/finalshell/core/En2.a Lcom/finalshell/core/En2;
      // 0fe: bipush 0
      // 0ff: invokevirtual com/finalshell/core/En2.g (Z)V
      // 102: goto 109
      // 105: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 108: athrow
      // 109: return
   }

   public static void W(String var0) {
      Z = var0;
      IG.D.q.U(var0, 0, var0.length(), var0.hashCode(), true);
   }

   public static Object X(String var0) {
      return E(var0, h);
   }

   public static Object q(String var0, IG var1) {
      return Z(var0, var1, h);
   }

   public static Object l(String var0, IG var1, Ks2_2[] var2) {
      String var10000;
      var10000 = Hi2.C();
      int var4 = h;
      String var3 = var10000;
      Ks2_2[] var5 = var2;
      int var6 = var2.length;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            var10000 = (String)(var5[var7]);
            if (var3 != null) {
               break;
            }

            Object var8 = var10000;
            var4 = Ks2_2.H(var4, (Ks2_2)var8, true);
            var7++;
            if (var3 == null) {
               continue;
            }
         }

         var10000 = (String)Z(var0, var1, var4);
         break;
      }

      return var10000;
   }

   public static Object Z(String var0, IG var1, int var2) {
      try {
         if (var0 == null) {
            return null;
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      Yn4 var3 = new Yn4(var0, var1, var2);
      Object var4 = var3.M();
      var3.Y(var4);
      var3.close();
      return var4;
   }

   public static Object E(String var0, int var1) {
      return Z(var0, IG.G(), var1);
   }

   public static Object T(byte[] var0, Ks2_2[] var1) {
      char[] var2 = O(var0.length);
      int var3 = S7.U(var0, 0, var0.length, var2);

      try {
         if (var3 < 0) {
            return null;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      return C(new String(var2, 0, var3), var1);
   }

   public static Object g(byte[] param0, int param1, int param2, CharsetDecoder param3, Ks2_2[] param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 5
      // 05: aload 0
      // 06: aload 5
      // 08: ifnonnull 16
      // 0b: ifnull 26
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: aload 0
      // 16: arraylength
      // 17: aload 5
      // 19: ifnonnull 2f
      // 1c: ifne 2c
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aconst_null
      // 27: areturn
      // 28: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: getstatic com/finalshell/core/Ok2.h I
      // 2f: istore 6
      // 31: aload 4
      // 33: astore 7
      // 35: aload 7
      // 37: arraylength
      // 38: istore 8
      // 3a: bipush 0
      // 3b: istore 9
      // 3d: iload 9
      // 3f: iload 8
      // 41: if_icmpge 62
      // 44: aload 7
      // 46: iload 9
      // 48: aaload
      // 49: aload 5
      // 4b: ifnonnull 6b
      // 4e: astore 10
      // 50: iload 6
      // 52: aload 10
      // 54: bipush 1
      // 55: invokestatic com/finalshell/ui/model/Ks2_2.H (ILcom/finalshell/ui/model/Ks2_2;Z)I
      // 58: istore 6
      // 5a: iinc 9 1
      // 5d: aload 5
      // 5f: ifnull 3d
      // 62: aload 0
      // 63: iload 1
      // 64: iload 2
      // 65: aload 3
      // 66: iload 6
      // 68: invokestatic com/finalshell/core/Ok2.L ([BIILjava/nio/charset/CharsetDecoder;I)Ljava/lang/Object;
      // 6b: areturn
   }

   public static Object L(byte[] var0, int var1, int var2, CharsetDecoder var3, int var4) {
      var3.reset();
      int var5 = (int)((double)var2 * (double)var3.maxCharsPerByte());
      char[] var6 = O(var5);
      ByteBuffer var7 = ByteBuffer.wrap(var0, var1, var2);
      CharBuffer var8 = CharBuffer.wrap(var6);
      S7.a(var3, var7, var8);
      int var9 = var8.position();
      Yn4 var10 = new Yn4(var6, var9, IG.G(), var4);
      Object var11 = var10.M();
      var10.Y(var11);
      var10.close();
      return var11;
   }

   public static Object C(String var0, Ks2_2[] var1) {
      String var10000;
      var10000 = Hi2.C();
      int var3 = h;
      String var2 = var10000;
      Ks2_2[] var4 = var1;
      int var5 = var1.length;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            var10000 = (String)(var4[var6]);
            if (var2 != null) {
               break;
            }

            Object var7 = var10000;
            var3 = Ks2_2.H(var3, (Ks2_2)var7, true);
            var6++;
            if (var2 == null) {
               continue;
            }
         }

         var10000 = (String)E(var0, var3);
         break;
      }

      return var10000;
   }

   public static O0 J(String var0, Ks2_2[] var1) {
      return (O0)C(var0, var1);
   }

   public static O0 y$O0(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokestatic com/finalshell/core/Ok2.X (Ljava/lang/String;)Ljava/lang/Object;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: aload 1
      // 0b: ifnonnull 28
      // 0e: instanceof com/finalshell/ui/model/O0
      // 11: ifeq 24
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 2
      // 1c: checkcast com/finalshell/ui/model/O0
      // 1f: areturn
      // 20: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 2
      // 25: invokestatic com/finalshell/core/Ok2.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 28: checkcast com/finalshell/ui/model/O0
      // 2b: areturn
      // 2c: astore 3
      // 2d: new com/finalshell/core/Hi2
      // 30: dup
      // 31: sipush 22084
      // 34: sipush -24661
      // 37: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 3a: aload 3
      // 3b: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 3e: athrow
   }

   public static Object G(String var0, HI var1, Ks2_2[] var2) {
      return Z(var0, var1.I, IG.D, h, var2);
   }

   public static Object I(String var0, java.lang.Class var1, Ks2_2[] var2) {
      return X(var0, var1, IG.D, null, h, var2);
   }

   public static Object R(String var0, java.lang.Class var1, Fc2_2 var2, Ks2_2[] var3) {
      return X(var0, var1, IG.D, var2, h, var3);
   }

   public static Object B(String var0, Type var1, Ks2_2[] var2) {
      return Z(var0, var1, IG.D, h, var2);
   }

   public static Object S(String var0, Type var1, Fc2_2 var2, Ks2_2[] var3) {
      return X(var0, var1, IG.D, var2, h, var3);
   }

   public static Object F(String var0, Type var1, int var2, Ks2_2[] var3) {
      String var4 = Hi2.C();

      try {
         if (var0 == null) {
            return null;
         }
      } catch (RuntimeException var9) {
         throw a(var9);
      }

      for (Ks2_2 var8 : var3) {
         var2 = Ks2_2.H(var2, var8, true);
         if (var4 != null) {
            break;
         }
      }

      Yn4 var10 = new Yn4(var0, IG.G(), var2);
      Object var11 = var10.o(var1);
      var10.Y(var11);
      var10.close();
      return var11;
   }

   public static Object w(String var0, Type var1, IG var2, Ks2_2[] var3) {
      return X(var0, var1, var2, null, h, var3);
   }

   public static Object Z(String var0, Type var1, IG var2, int var3, Ks2_2[] var4) {
      return X(var0, var1, var2, null, var3, var4);
   }

   public static Object X(String param0, Type param1, IG param2, Fc2_2 param3, int param4, Ks2_2[] param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 6
      // 005: aload 0
      // 006: aload 6
      // 008: ifnonnull 016
      // 00b: ifnull 01c
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: aload 0
      // 016: invokevirtual java/lang/String.length ()I
      // 019: ifne 022
      // 01c: aconst_null
      // 01d: areturn
      // 01e: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: aload 5
      // 024: aload 6
      // 026: ifnonnull 035
      // 029: ifnull 05f
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: aload 5
      // 035: astore 7
      // 037: aload 7
      // 039: arraylength
      // 03a: istore 8
      // 03c: bipush 0
      // 03d: istore 9
      // 03f: iload 9
      // 041: iload 8
      // 043: if_icmpge 05f
      // 046: aload 7
      // 048: iload 9
      // 04a: aaload
      // 04b: astore 10
      // 04d: iload 4
      // 04f: aload 10
      // 051: getfield com/finalshell/ui/model/Ks2_2.mask I
      // 054: ior
      // 055: istore 4
      // 057: iinc 9 1
      // 05a: aload 6
      // 05c: ifnull 03f
      // 05f: new com/finalshell/core/Yn4
      // 062: dup
      // 063: aload 0
      // 064: aload 2
      // 065: iload 4
      // 067: invokespecial com/finalshell/core/Yn4.<init> (Ljava/lang/String;Lcom/finalshell/core/IG;I)V
      // 06a: astore 7
      // 06c: aload 3
      // 06d: aload 6
      // 06f: ifnonnull 0ff
      // 072: ifnull 0f8
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: aload 3
      // 07d: instanceof com/finalshell/core/Da2
      // 080: aload 6
      // 082: ifnonnull 0b0
      // 085: goto 08c
      // 088: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: ifeq 0ac
      // 08f: goto 096
      // 092: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095: athrow
      // 096: aload 7
      // 098: invokevirtual com/finalshell/core/Yn4.Q$List ()Ljava/util/List;
      // 09b: aload 3
      // 09c: checkcast com/finalshell/core/Da2
      // 09f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0a4: pop
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: aload 3
      // 0ad: instanceof com/finalshell/core/GV
      // 0b0: aload 6
      // 0b2: ifnonnull 0e5
      // 0b5: ifeq 0d5
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: aload 7
      // 0c1: invokevirtual com/finalshell/core/Yn4.l ()Ljava/util/List;
      // 0c4: aload 3
      // 0c5: checkcast com/finalshell/core/GV
      // 0c8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0cd: pop
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: aload 3
      // 0d6: aload 6
      // 0d8: ifnonnull 0ff
      // 0db: instanceof com/finalshell/core/Ni4
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: ifeq 0f8
      // 0e8: aload 7
      // 0ea: aload 3
      // 0eb: checkcast com/finalshell/core/Ni4
      // 0ee: invokevirtual com/finalshell/core/Yn4.E (Lcom/finalshell/core/Ni4;)V
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: aload 7
      // 0fa: aload 1
      // 0fb: aconst_null
      // 0fc: invokevirtual com/finalshell/core/Yn4.r (Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
      // 0ff: astore 8
      // 101: aload 7
      // 103: aload 8
      // 105: invokevirtual com/finalshell/core/Yn4.Y (Ljava/lang/Object;)V
      // 108: aload 7
      // 10a: invokevirtual com/finalshell/core/Yn4.close ()V
      // 10d: aload 8
      // 10f: areturn
   }

   public static Object l(byte[] var0, Type var1, Ks2_2[] var2) {
      return r(var0, 0, var0.length, S7.v, var1, var2);
   }

   public static Object r(byte[] var0, int var1, int var2, Charset var3, Type var4, Ks2_2[] var5) {
      return L(var0, var1, var2, var3, var4, IG.D, null, h, var5);
   }

   public static Object A(byte[] var0, Charset var1, Type var2, IG var3, Fc2_2 var4, int var5, Ks2_2[] var6) {
      return L(var0, 0, var0.length, var1, var2, var3, var4, var5, var6);
   }

   public static Object L(byte[] param0, int param1, int param2, Charset param3, Type param4, IG param5, Fc2_2 param6, int param7, Ks2_2[] param8) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 9
      // 05: aload 3
      // 06: aload 9
      // 08: ifnonnull 18
      // 0b: ifnonnull 19
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: getstatic com/finalshell/core/S7.v Ljava/nio/charset/Charset;
      // 18: astore 3
      // 19: aconst_null
      // 1a: astore 10
      // 1c: aload 3
      // 1d: getstatic com/finalshell/core/S7.v Ljava/nio/charset/Charset;
      // 20: if_acmpne d1
      // 23: aload 0
      // 24: arraylength
      // 25: invokestatic com/finalshell/core/Ok2.O (I)[C
      // 28: astore 11
      // 2a: aload 0
      // 2b: iload 1
      // 2c: iload 2
      // 2d: aload 11
      // 2f: invokestatic com/finalshell/core/S7.U ([BII[C)I
      // 32: istore 12
      // 34: iload 12
      // 36: ifge 85
      // 39: aconst_null
      // 3a: astore 13
      // 3c: new java/io/InputStreamReader
      // 3f: dup
      // 40: new java/util/zip/GZIPInputStream
      // 43: dup
      // 44: new java/io/ByteArrayInputStream
      // 47: dup
      // 48: aload 0
      // 49: iload 1
      // 4a: iload 2
      // 4b: invokespecial java/io/ByteArrayInputStream.<init> ([BII)V
      // 4e: invokespecial java/util/zip/GZIPInputStream.<init> (Ljava/io/InputStream;)V
      // 51: sipush 22081
      // 54: sipush 19135
      // 57: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 5a: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 5d: astore 13
      // 5f: aload 13
      // 61: invokestatic com/finalshell/core/S7.G (Ljava/io/Reader;)Ljava/lang/String;
      // 64: astore 10
      // 66: aload 13
      // 68: invokestatic com/finalshell/core/S7.o (Ljava/io/Closeable;)V
      // 6b: goto 85
      // 6e: astore 14
      // 70: aconst_null
      // 71: astore 15
      // 73: aload 13
      // 75: invokestatic com/finalshell/core/S7.o (Ljava/io/Closeable;)V
      // 78: aload 15
      // 7a: areturn
      // 7b: astore 16
      // 7d: aload 13
      // 7f: invokestatic com/finalshell/core/S7.o (Ljava/io/Closeable;)V
      // 82: aload 16
      // 84: athrow
      // 85: aload 10
      // 87: aload 9
      // 89: ifnonnull aa
      // 8c: ifnonnull a8
      // 8f: goto 96
      // 92: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 95: athrow
      // 96: iload 12
      // 98: ifge a8
      // 9b: goto a2
      // 9e: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1: athrow
      // a2: aconst_null
      // a3: areturn
      // a4: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a7: athrow
      // a8: aload 10
      // aa: aload 9
      // ac: ifnonnull cc
      // af: ifnonnull ce
      // b2: goto b9
      // b5: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b8: athrow
      // b9: new java/lang/String
      // bc: dup
      // bd: aload 11
      // bf: bipush 0
      // c0: iload 12
      // c2: invokespecial java/lang/String.<init> ([CII)V
      // c5: goto cc
      // c8: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cb: athrow
      // cc: astore 10
      // ce: goto e8
      // d1: iload 2
      // d2: ifge db
      // d5: aconst_null
      // d6: areturn
      // d7: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // da: athrow
      // db: new java/lang/String
      // de: dup
      // df: aload 0
      // e0: iload 1
      // e1: iload 2
      // e2: aload 3
      // e3: invokespecial java/lang/String.<init> ([BIILjava/nio/charset/Charset;)V
      // e6: astore 10
      // e8: aload 10
      // ea: aload 4
      // ec: aload 5
      // ee: aload 6
      // f0: iload 7
      // f2: aload 8
      // f4: invokestatic com/finalshell/core/Ok2.X (Ljava/lang/String;Ljava/lang/reflect/Type;Lcom/finalshell/core/IG;Lcom/finalshell/core/Fc2_2;I[Lcom/finalshell/ui/model/Ks2_2;)Ljava/lang/Object;
      // f7: areturn
   }

   public static Object F(byte[] var0, int var1, int var2, CharsetDecoder var3, Type var4, Ks2_2[] var5) {
      var3.reset();
      int var6 = (int)((double)var2 * (double)var3.maxCharsPerByte());
      char[] var7 = O(var6);
      ByteBuffer var8 = ByteBuffer.wrap(var0, var1, var2);
      CharBuffer var9 = CharBuffer.wrap(var7);
      S7.a(var3, var8, var9);
      int var10 = var9.position();
      return r(var7, var10, var4, var5);
   }

   public static Object r(char[] param0, int param1, Type param2, Ks2_2[] param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 0
      // 06: aload 4
      // 08: ifnonnull 16
      // 0b: ifnull 26
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: aload 0
      // 16: arraylength
      // 17: aload 4
      // 19: ifnonnull 2f
      // 1c: ifne 2c
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aconst_null
      // 27: areturn
      // 28: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: getstatic com/finalshell/core/Ok2.h I
      // 2f: istore 5
      // 31: aload 3
      // 32: astore 6
      // 34: aload 6
      // 36: arraylength
      // 37: istore 7
      // 39: bipush 0
      // 3a: istore 8
      // 3c: iload 8
      // 3e: iload 7
      // 40: if_icmpge 5c
      // 43: aload 6
      // 45: iload 8
      // 47: aaload
      // 48: astore 9
      // 4a: iload 5
      // 4c: aload 9
      // 4e: bipush 1
      // 4f: invokestatic com/finalshell/ui/model/Ks2_2.H (ILcom/finalshell/ui/model/Ks2_2;Z)I
      // 52: istore 5
      // 54: iinc 8 1
      // 57: aload 4
      // 59: ifnull 3c
      // 5c: new com/finalshell/core/Yn4
      // 5f: dup
      // 60: aload 0
      // 61: iload 1
      // 62: invokestatic com/finalshell/core/IG.G ()Lcom/finalshell/core/IG;
      // 65: iload 5
      // 67: invokespecial com/finalshell/core/Yn4.<init> ([CILcom/finalshell/core/IG;I)V
      // 6a: astore 6
      // 6c: aload 6
      // 6e: aload 2
      // 6f: invokevirtual com/finalshell/core/Yn4.o (Ljava/lang/reflect/Type;)Ljava/lang/Object;
      // 72: astore 7
      // 74: aload 6
      // 76: aload 7
      // 78: invokevirtual com/finalshell/core/Yn4.Y (Ljava/lang/Object;)V
      // 7b: aload 6
      // 7d: invokevirtual com/finalshell/core/Yn4.close ()V
      // 80: aload 7
      // 82: areturn
   }

   public static Object c(InputStream var0, Type var1, Ks2_2[] var2) throws IOException {
      return a(var0, S7.v, var1, var2);
   }

   public static Object a(InputStream var0, Charset var1, Type var2, Ks2_2[] var3) throws IOException {
      return K(var0, var1, var2, IG.D, var3);
   }

   public static Object K(InputStream var0, Charset var1, Type var2, IG var3, Ks2_2[] var4) throws IOException {
      return A(var0, var1, var2, var3, null, h, var4);
   }

   public static Object A(InputStream param0, Charset param1, Type param2, IG param3, Fc2_2 param4, int param5, Ks2_2[] param6) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 7
      // 05: aload 1
      // 06: aload 7
      // 08: ifnonnull 18
      // 0b: ifnonnull 19
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: getstatic com/finalshell/core/S7.v Ljava/nio/charset/Charset;
      // 18: astore 1
      // 19: sipush 4340
      // 1c: ldc2_w 6658045543267204732
      // 1f: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 22: invokestatic com/finalshell/core/Ok2.K (I)[B
      // 25: astore 8
      // 27: bipush 0
      // 28: istore 9
      // 2a: aload 0
      // 2b: aload 8
      // 2d: iload 9
      // 2f: aload 8
      // 31: arraylength
      // 32: iload 9
      // 34: isub
      // 35: invokevirtual java/io/InputStream.read ([BII)I
      // 38: istore 10
      // 3a: iload 10
      // 3c: bipush -1
      // 3d: if_icmpne 51
      // 40: aload 7
      // 42: ifnonnull 58
      // 45: aload 7
      // 47: ifnull 93
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: iload 9
      // 53: iload 10
      // 55: iadd
      // 56: istore 9
      // 58: iload 9
      // 5a: aload 8
      // 5c: arraylength
      // 5d: aload 7
      // 5f: ifnonnull 79
      // 62: if_icmpne 8e
      // 65: goto 6c
      // 68: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: aload 8
      // 6e: arraylength
      // 6f: bipush 3
      // 70: imul
      // 71: bipush 2
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: idiv
      // 7a: newarray 8
      // 7c: astore 11
      // 7e: aload 8
      // 80: bipush 0
      // 81: aload 11
      // 83: bipush 0
      // 84: aload 8
      // 86: arraylength
      // 87: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 8a: aload 11
      // 8c: astore 8
      // 8e: aload 7
      // 90: ifnull 2a
      // 93: aload 8
      // 95: bipush 0
      // 96: iload 9
      // 98: aload 1
      // 99: aload 2
      // 9a: aload 3
      // 9b: aload 4
      // 9d: iload 5
      // 9f: aload 6
      // a1: invokestatic com/finalshell/core/Ok2.L ([BIILjava/nio/charset/Charset;Ljava/lang/reflect/Type;Lcom/finalshell/core/IG;Lcom/finalshell/core/Fc2_2;I[Lcom/finalshell/ui/model/Ks2_2;)Ljava/lang/Object;
      // a4: areturn
   }

   public static Object n(String var0, java.lang.Class var1) {
      return I(var0, var1, new Ks2_2[0]);
   }

   public static Oc2 D(String var0) {
      return f(var0, IG.D);
   }

   public static Oc2 f(String param0, IG param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: ifnonnull 0e
      // 08: aconst_null
      // 09: areturn
      // 0a: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d: athrow
      // 0e: new com/finalshell/core/Yn4
      // 11: dup
      // 12: aload 0
      // 13: aload 1
      // 14: invokespecial com/finalshell/core/Yn4.<init> (Ljava/lang/String;Lcom/finalshell/core/IG;)V
      // 17: astore 3
      // 18: aload 3
      // 19: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 1c: astore 5
      // 1e: aload 5
      // 20: invokeinterface com/finalshell/core/P7.P ()I 1
      // 25: sipush 12087
      // 28: ldc2_w 4365792771298181563
      // 2b: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 2e: aload 2
      // 2f: ifnonnull 6c
      // 32: if_icmpne 4a
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: aload 5
      // 3e: invokeinterface com/finalshell/core/P7.K ()V 1
      // 43: aconst_null
      // 44: astore 4
      // 46: aload 2
      // 47: ifnull 9c
      // 4a: aload 5
      // 4c: invokeinterface com/finalshell/core/P7.P ()I 1
      // 51: aload 2
      // 52: ifnonnull 7d
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: sipush 1511
      // 5f: ldc2_w 1011378586708601696
      // 62: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 65: goto 6c
      // 68: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: if_icmpne 87
      // 6f: aload 5
      // 71: invokeinterface com/finalshell/core/P7.k ()Z 1
      // 76: goto 7d
      // 79: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c: athrow
      // 7d: ifeq 87
      // 80: aconst_null
      // 81: astore 4
      // 83: aload 2
      // 84: ifnull 9c
      // 87: new com/finalshell/ui/model/Oc2
      // 8a: dup
      // 8b: invokespecial com/finalshell/ui/model/Oc2.<init> ()V
      // 8e: astore 4
      // 90: aload 3
      // 91: aload 4
      // 93: invokevirtual com/finalshell/core/Yn4.B (Ljava/util/Collection;)V
      // 96: aload 3
      // 97: aload 4
      // 99: invokevirtual com/finalshell/core/Yn4.Y (Ljava/lang/Object;)V
      // 9c: aload 3
      // 9d: invokevirtual com/finalshell/core/Yn4.close ()V
      // a0: aload 4
      // a2: areturn
   }

   public static List o(String var0, java.lang.Class var1) {
      return u(var0, var1, IG.D);
   }

   public static List u(String param0, java.lang.Class param1, IG param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: ifnonnull 0e
      // 08: aconst_null
      // 09: areturn
      // 0a: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d: athrow
      // 0e: new com/finalshell/core/Yn4
      // 11: dup
      // 12: aload 0
      // 13: aload 2
      // 14: invokespecial com/finalshell/core/Yn4.<init> (Ljava/lang/String;Lcom/finalshell/core/IG;)V
      // 17: astore 5
      // 19: aload 5
      // 1b: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 1e: astore 6
      // 20: aload 6
      // 22: invokeinterface com/finalshell/core/P7.P ()I 1
      // 27: istore 7
      // 29: iload 7
      // 2b: sipush 21192
      // 2e: ldc2_w 6954785655616781381
      // 31: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 34: aload 3
      // 35: ifnonnull 6d
      // 38: if_icmpne 50
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: aload 6
      // 44: invokeinterface com/finalshell/core/P7.K ()V 1
      // 49: aconst_null
      // 4a: astore 4
      // 4c: aload 3
      // 4d: ifnull a0
      // 50: iload 7
      // 52: aload 3
      // 53: ifnonnull 7e
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: sipush 1511
      // 60: ldc2_w 1011378586708601696
      // 63: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: if_icmpne 88
      // 70: aload 6
      // 72: invokeinterface com/finalshell/core/P7.k ()Z 1
      // 77: goto 7e
      // 7a: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d: athrow
      // 7e: ifeq 88
      // 81: aconst_null
      // 82: astore 4
      // 84: aload 3
      // 85: ifnull a0
      // 88: new java/util/ArrayList
      // 8b: dup
      // 8c: invokespecial java/util/ArrayList.<init> ()V
      // 8f: astore 4
      // 91: aload 5
      // 93: aload 1
      // 94: aload 4
      // 96: invokevirtual com/finalshell/core/Yn4.s (Ljava/lang/Class;Ljava/util/Collection;)V
      // 99: aload 5
      // 9b: aload 4
      // 9d: invokevirtual com/finalshell/core/Yn4.Y (Ljava/lang/Object;)V
      // a0: aload 5
      // a2: invokevirtual com/finalshell/core/Yn4.close ()V
      // a5: aload 4
      // a7: areturn
   }

   public static List B(String var0, Type[] var1) {
      return V(var0, var1, IG.D);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static List V(String var0, Type[] var1, IG var2) {
      Object[] var10000;
      String var3 = Hi2.C();

      try {
         if (var0 == null) {
            return null;
         }
      } catch (RuntimeException var10) {
         throw a(var10);
      }

      Yn4 var5 = new Yn4(var0, var2);
      Object[] var6 = var5.h(var1);

      List var4;
      label42: {
         label56: {
            label53: {
               try {
                  var10000 = var6;
                  if (var3 != null) {
                     break label56;
                  }

                  if (var6 != null) {
                     break label53;
                  }
               } catch (RuntimeException var9) {
                  throw a(var9);
               }

               var4 = null;

               try {
                  if (var3 == null) {
                     break label42;
                  }
               } catch (RuntimeException var8) {
                  boolean var10001 = false;
                  throw a(var8);
               }
            }

            try {
               var10000 = var6;
            } catch (RuntimeException var7) {
               boolean var12 = false;
               throw a(var7);
            }
         }

         var4 = Arrays.asList(var10000);
      }

      var5.Y(var4);
      var5.close();
      return var4;
   }

   public static String x(Object var0) {
      return G(var0, s, new EP[0]);
   }

   public static String i(Object var0, EP[] var1) {
      return z(var0, a, var1);
   }

   public static String z(Object param0, int param1, EP[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: new com/finalshell/io/YM3
      // 06: dup
      // 07: aconst_null
      // 08: checkcast java/io/Writer
      // 0b: iload 1
      // 0c: aload 2
      // 0d: invokespecial com/finalshell/io/YM3.<init> (Ljava/io/Writer;I[Lcom/finalshell/ui/model/EP;)V
      // 10: astore 4
      // 12: astore 3
      // 13: new com/finalshell/core/NL3
      // 16: dup
      // 17: aload 4
      // 19: invokespecial com/finalshell/core/NL3.<init> (Lcom/finalshell/io/YM3;)V
      // 1c: astore 5
      // 1e: aload 5
      // 20: aload 0
      // 21: invokevirtual com/finalshell/core/NL3.B (Ljava/lang/Object;)V
      // 24: aload 4
      // 26: invokevirtual com/finalshell/io/YM3.toString ()Ljava/lang/String;
      // 29: astore 6
      // 2b: aload 6
      // 2d: invokevirtual java/lang/String.length ()I
      // 30: istore 7
      // 32: iload 7
      // 34: aload 3
      // 35: ifnonnull 5d
      // 38: ifle a8
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: aload 6
      // 44: aload 3
      // 45: ifnonnull aa
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: iload 7
      // 51: bipush 1
      // 52: isub
      // 53: invokevirtual java/lang/String.charAt (I)C
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: sipush 14220
      // 60: ldc2_w 3738329768231262474
      // 63: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 66: if_icmpne a8
      // 69: aload 0
      // 6a: instanceof java/lang/Number
      // 6d: aload 3
      // 6e: ifnonnull 91
      // 71: goto 78
      // 74: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: ifeq a8
      // 7b: goto 82
      // 7e: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81: athrow
      // 82: aload 4
      // 84: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 87: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 8a: goto 91
      // 8d: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 90: athrow
      // 91: ifne a8
      // 94: aload 6
      // 96: bipush 0
      // 97: iload 7
      // 99: bipush 1
      // 9a: isub
      // 9b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 9e: astore 8
      // a0: aload 4
      // a2: invokevirtual com/finalshell/io/YM3.close ()V
      // a5: aload 8
      // a7: areturn
      // a8: aload 6
      // aa: astore 8
      // ac: aload 4
      // ae: invokevirtual com/finalshell/io/YM3.close ()V
      // b1: aload 8
      // b3: areturn
      // b4: astore 9
      // b6: aload 4
      // b8: invokevirtual com/finalshell/io/YM3.close ()V
      // bb: aload 9
      // bd: athrow
   }

   public static String D(Object var0, String var1, EP[] var2) {
      return D(var0, En2.a, null, var1, a, var2);
   }

   public static String N(Object var0, Wr4 var1, EP[] var2) {
      return D(var0, En2.a, new Wr4[]{var1}, null, a, var2);
   }

   public static String G(Object var0, Wr4[] var1, EP[] var2) {
      return D(var0, En2.a, var1, null, a, var2);
   }

   public static byte[] Y(Object var0, EP[] var1) {
      return p(var0, a, var1);
   }

   public static byte[] Q(Object var0, Wr4 var1, EP[] var2) {
      return h(var0, En2.a, new Wr4[]{var1}, a, var2);
   }

   public static byte[] p(Object var0, int var1, EP[] var2) {
      return L(var0, En2.a, var1, var2);
   }

   public static String K(Object var0, En2 var1, EP[] var2) {
      return J(var0, var1, (Wr4)null, var2);
   }

   public static String J(Object var0, En2 var1, Wr4 var2, EP[] var3) {
      return D(var0, var1, new Wr4[]{var2}, null, a, var3);
   }

   public static String y(Object var0, En2 var1, Wr4[] var2, EP[] var3) {
      return D(var0, var1, var2, null, a, var3);
   }

   public static String D(Object var0, En2 var1, Wr4[] var2, String var3, int var4, EP[] var5) {
      String var10000;
      Wr4[] var26;
      var10000 = Hi2.C();
      YM3 var7 = new YM3(null, var4, var5);
      String var6 = var10000;

      String var24;
      try {
         NL3 var8 = new NL3(var7, var1);

         label111: {
            label110: {
               try {
                  var10000 = var3;
                  if (var6 != null) {
                     break label110;
                  }

                  if (var3 == null) {
                     break label111;
                  }
               } catch (RuntimeException var22) {
                  throw a(var22);
               }

               var10000 = var3;
            }

            try {
               if (var10000.length() != 0) {
                  var8.W(var3);
                  var8.D(EP.WriteDateUseDateFormat, true);
               }
            } catch (RuntimeException var19) {
               throw a(var19);
            }
         }

         label102: {
            label119: {
               label100: {
                  try {
                     var26 = var2;
                     if (var6 != null) {
                        break label100;
                     }

                     if (var2 == null) {
                        break label119;
                     }
                  } catch (RuntimeException var21) {
                     throw a(var21);
                  }

                  var26 = var2;
               }

               Wr4[] var9 = var26;
               int var10 = var9.length;
               int var11 = 0;

               while (var11 < var10) {
                  Wr4 var12 = var9[var11];

                  try {
                     var8.a(var12);
                     var11++;
                     if (var6 != null) {
                        break label102;
                     }

                     if (var6 != null) {
                        break;
                     }
                  } catch (RuntimeException var20) {
                     throw a(var20);
                  }
               }
            }

            var8.B(var0);
         }

         var24 = var7.toString();
      } finally {
         var7.close();
      }

      return var24;
   }

   /** @deprecated */
   public static String n(Object var0, En2 var1, EP[] var2) {
      return D(var0, var1, s, null, 0, var2);
   }

   public static byte[] g(Object var0, En2 var1, EP[] var2) {
      return h(var0, var1, s, a, var2);
   }

   public static byte[] L(Object var0, En2 var1, int var2, EP[] var3) {
      return h(var0, var1, s, var2, var3);
   }

   public static byte[] o(Object var0, Wr4[] var1, EP[] var2) {
      return h(var0, En2.a, var1, a, var2);
   }

   public static byte[] k(Object var0, En2 var1, Wr4 var2, EP[] var3) {
      return h(var0, var1, new Wr4[]{var2}, a, var3);
   }

   public static byte[] h(Object var0, En2 var1, Wr4[] var2, int var3, EP[] var4) {
      return t(var0, var1, var2, null, var3, var4);
   }

   public static byte[] t(Object var0, En2 var1, Wr4[] var2, String var3, int var4, EP[] var5) {
      return d(S7.v, var0, var1, var2, var3, var4, var5);
   }

   public static byte[] d(Charset var0, Object var1, En2 var2, Wr4[] var3, String var4, int var5, EP[] var6) {
      String var10000;
      Wr4[] var27;
      var10000 = Hi2.C();
      YM3 var8 = new YM3(null, var5, var6);
      String var7 = var10000;

      byte[] var25;
      try {
         NL3 var9 = new NL3(var8, var2);

         label111: {
            label110: {
               try {
                  var10000 = var4;
                  if (var7 != null) {
                     break label110;
                  }

                  if (var4 == null) {
                     break label111;
                  }
               } catch (RuntimeException var23) {
                  throw a(var23);
               }

               var10000 = var4;
            }

            try {
               if (var10000.length() != 0) {
                  var9.W(var4);
                  var9.D(EP.WriteDateUseDateFormat, true);
               }
            } catch (RuntimeException var20) {
               throw a(var20);
            }
         }

         label102: {
            label119: {
               label100: {
                  try {
                     var27 = var3;
                     if (var7 != null) {
                        break label100;
                     }

                     if (var3 == null) {
                        break label119;
                     }
                  } catch (RuntimeException var22) {
                     throw a(var22);
                  }

                  var27 = var3;
               }

               Wr4[] var10 = var27;
               int var11 = var10.length;
               int var12 = 0;

               while (var12 < var11) {
                  Wr4 var13 = var10[var12];

                  try {
                     var9.a(var13);
                     var12++;
                     if (var7 != null) {
                        break label102;
                     }

                     if (var7 != null) {
                        break;
                     }
                  } catch (RuntimeException var21) {
                     throw a(var21);
                  }
               }
            }

            var9.B(var1);
         }

         var25 = var8.f(var0);
      } finally {
         var8.close();
      }

      return var25;
   }

   public static byte[] t(Charset var0, Object var1, En2 var2, Wr4[] var3, String var4, int var5, EP[] var6) {
      String var10000;
      Wr4[] var27;
      var10000 = Hi2.C();
      YM3 var8 = new YM3(null, var5, var6);
      String var7 = var10000;

      byte[] var25;
      try {
         NL3 var9 = new NL3(var8, var2);

         label111: {
            label110: {
               try {
                  var10000 = var4;
                  if (var7 != null) {
                     break label110;
                  }

                  if (var4 == null) {
                     break label111;
                  }
               } catch (RuntimeException var23) {
                  throw a(var23);
               }

               var10000 = var4;
            }

            try {
               if (var10000.length() != 0) {
                  var9.Q(var4);
                  var9.D(EP.WriteDateUseDateFormat, true);
               }
            } catch (RuntimeException var20) {
               throw a(var20);
            }
         }

         label102: {
            label119: {
               label100: {
                  try {
                     var27 = var3;
                     if (var7 != null) {
                        break label100;
                     }

                     if (var3 == null) {
                        break label119;
                     }
                  } catch (RuntimeException var22) {
                     throw a(var22);
                  }

                  var27 = var3;
               }

               Wr4[] var10 = var27;
               int var11 = var10.length;
               int var12 = 0;

               while (var12 < var11) {
                  Wr4 var13 = var10[var12];

                  try {
                     var9.a(var13);
                     var12++;
                     if (var7 != null) {
                        break label102;
                     }

                     if (var7 != null) {
                        break;
                     }
                  } catch (RuntimeException var21) {
                     throw a(var21);
                  }
               }
            }

            var9.B(var1);
         }

         var25 = var8.f(var0);
      } finally {
         var8.close();
      }

      return var25;
   }

   public static String b(Object var0, boolean var1) {
      try {
         if (!var1) {
            return x(var0);
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return i(var0, new EP[]{EP.PrettyFormat});
   }

   /** @deprecated */
   public static void T(Object var0, Writer var1, EP[] var2) {
      v(var1, var0, var2);
   }

   public static void v(Writer var0, Object var1, EP[] var2) {
      u(var0, var1, a, var2);
   }

   public static void u(Writer var0, Object var1, int var2, EP[] var3) {
      YM3 var4 = new YM3(var0, var2, var3);

      try {
         NL3 var5 = new NL3(var4);
         var5.B(var1);
      } finally {
         var4.close();
      }
   }

   public static final int O(OutputStream var0, Object var1, EP[] var2) throws IOException {
      return k(var0, var1, a, var2);
   }

   public static final int k(OutputStream var0, Object var1, int var2, EP[] var3) throws IOException {
      return R(var0, S7.v, var1, En2.a, null, null, var2, var3);
   }

   public static final int S(OutputStream var0, Charset var1, Object var2, EP[] var3) throws IOException {
      return R(var0, var1, var2, En2.a, null, null, a, var3);
   }

   public static final int R(OutputStream var0, Charset var1, Object var2, En2 var3, Wr4[] var4, String var5, int var6, EP[] var7) throws IOException {
      String var10000;
      Wr4[] var29;
      var10000 = Hi2.C();
      YM3 var9 = new YM3(null, var6, var7);
      String var8 = var10000;

      int var27;
      try {
         NL3 var10 = new NL3(var9, var3);

         label111: {
            label110: {
               try {
                  var10000 = var5;
                  if (var8 != null) {
                     break label110;
                  }

                  if (var5 == null) {
                     break label111;
                  }
               } catch (IOException var24) {
                  throw a(var24);
               }

               var10000 = var5;
            }

            try {
               if (var10000.length() != 0) {
                  var10.W(var5);
                  var10.D(EP.WriteDateUseDateFormat, true);
               }
            } catch (IOException var21) {
               throw a(var21);
            }
         }

         label102: {
            label119: {
               label100: {
                  try {
                     var29 = var4;
                     if (var8 != null) {
                        break label100;
                     }

                     if (var4 == null) {
                        break label119;
                     }
                  } catch (IOException var23) {
                     throw a(var23);
                  }

                  var29 = var4;
               }

               Wr4[] var11 = var29;
               var27 = var11.length;
               int var13 = 0;

               while (var13 < var27) {
                  Wr4 var14 = var11[var13];

                  try {
                     var10.a(var14);
                     var13++;
                     if (var8 != null) {
                        break label102;
                     }

                     if (var8 != null) {
                        break;
                     }
                  } catch (IOException var22) {
                     throw a(var22);
                  }
               }
            }

            var10.B(var2);
         }

         int var26 = var9.c(var0, var1);
         var27 = var26;
      } finally {
         var9.close();
      }

      return var27;
   }

   public static final int x(OutputStream var0, Charset var1, Object var2, En2 var3, Wr4[] var4, String var5, int var6, EP[] var7) throws IOException {
      String var10000;
      Wr4[] var29;
      var10000 = Hi2.C();
      YM3 var9 = new YM3(null, var6, var7);
      String var8 = var10000;

      int var27;
      try {
         NL3 var10 = new NL3(var9, var3);

         label111: {
            label110: {
               try {
                  var10000 = var5;
                  if (var8 != null) {
                     break label110;
                  }

                  if (var5 == null) {
                     break label111;
                  }
               } catch (IOException var24) {
                  throw a(var24);
               }

               var10000 = var5;
            }

            try {
               if (var10000.length() != 0) {
                  var10.Q(var5);
                  var10.D(EP.WriteDateUseDateFormat, true);
               }
            } catch (IOException var21) {
               throw a(var21);
            }
         }

         label102: {
            label119: {
               label100: {
                  try {
                     var29 = var4;
                     if (var8 != null) {
                        break label100;
                     }

                     if (var4 == null) {
                        break label119;
                     }
                  } catch (IOException var23) {
                     throw a(var23);
                  }

                  var29 = var4;
               }

               Wr4[] var11 = var29;
               var27 = var11.length;
               int var13 = 0;

               while (var13 < var27) {
                  Wr4 var14 = var11[var13];

                  try {
                     var10.a(var14);
                     var13++;
                     if (var8 != null) {
                        break label102;
                     }

                     if (var8 != null) {
                        break;
                     }
                  } catch (IOException var22) {
                     throw a(var22);
                  }
               }
            }

            var10.B(var2);
         }

         int var26 = var9.c(var0, var1);
         var27 = var26;
      } finally {
         var9.close();
      }

      return var27;
   }

   @Override
   public String toString() {
      return this.V();
   }

   @Override
   public String V() {
      YM3 var1 = new YM3();

      String var2;
      try {
         new NL3(var1).B(this);
         var2 = var1.toString();
      } finally {
         var1.close();
      }

      return var2;
   }

   public String y(EP[] var1) {
      YM3 var2 = new YM3(null, a, var1);

      String var3;
      try {
         new NL3(var2).B(this);
         var3 = var2.toString();
      } finally {
         var2.close();
      }

      return var3;
   }

   @Override
   public void M(Appendable var1) {
      YM3 var2 = new YM3();

      try {
         new NL3(var2).B(this);
         var1.append(var2.toString());
      } catch (IOException var7) {
         throw new Hi2(var7.getMessage(), var7);
      } finally {
         var2.close();
      }
   }

   public static Object b(Object var0) {
      return l(var0, En2.a);
   }

   /** @deprecated */
   public static Object M(Object var0, IG var1) {
      return l(var0, En2.a);
   }

   public static Object l(Object param0, En2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: aload 2
      // 006: ifnonnull 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 0
      // 01a: instanceof com/finalshell/core/Ok2
      // 01d: aload 2
      // 01e: ifnonnull 035
      // 021: ifeq 031
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: aload 0
      // 02c: areturn
      // 02d: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 0
      // 032: instanceof java/util/Map
      // 035: aload 2
      // 036: ifnonnull 102
      // 039: ifeq 0fe
      // 03c: goto 043
      // 03f: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 042: athrow
      // 043: aload 0
      // 044: checkcast java/util/Map
      // 047: astore 3
      // 048: aload 3
      // 049: invokeinterface java/util/Map.size ()I 1
      // 04e: istore 4
      // 050: aload 3
      // 051: instanceof java/util/LinkedHashMap
      // 054: aload 2
      // 055: ifnonnull 07c
      // 058: ifeq 071
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: new java/util/LinkedHashMap
      // 065: dup
      // 066: iload 4
      // 068: invokespecial java/util/LinkedHashMap.<init> (I)V
      // 06b: astore 5
      // 06d: aload 2
      // 06e: ifnull 097
      // 071: aload 3
      // 072: instanceof java/util/TreeMap
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: ifeq 08c
      // 07f: new java/util/TreeMap
      // 082: dup
      // 083: invokespecial java/util/TreeMap.<init> ()V
      // 086: astore 5
      // 088: aload 2
      // 089: ifnull 097
      // 08c: new java/util/HashMap
      // 08f: dup
      // 090: iload 4
      // 092: invokespecial java/util/HashMap.<init> (I)V
      // 095: astore 5
      // 097: new com/finalshell/ui/model/O0
      // 09a: dup
      // 09b: aload 5
      // 09d: invokespecial com/finalshell/ui/model/O0.<init> (Ljava/util/Map;)V
      // 0a0: astore 6
      // 0a2: aload 3
      // 0a3: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0a8: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0ad: astore 7
      // 0af: aload 7
      // 0b1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b6: ifeq 0fb
      // 0b9: aload 7
      // 0bb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c0: checkcast java/util/Map$Entry
      // 0c3: astore 8
      // 0c5: aload 8
      // 0c7: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0cc: astore 9
      // 0ce: aload 9
      // 0d0: invokestatic com/finalshell/core/B8_2.i (Ljava/lang/Object;)Ljava/lang/String;
      // 0d3: astore 10
      // 0d5: aload 8
      // 0d7: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0dc: aload 1
      // 0dd: invokestatic com/finalshell/core/Ok2.l (Ljava/lang/Object;Lcom/finalshell/core/En2;)Ljava/lang/Object;
      // 0e0: astore 11
      // 0e2: aload 6
      // 0e4: aload 2
      // 0e5: ifnonnull 0fd
      // 0e8: aload 10
      // 0ea: aload 11
      // 0ec: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 0ef: pop
      // 0f0: aload 2
      // 0f1: ifnull 0af
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa: athrow
      // 0fb: aload 6
      // 0fd: areturn
      // 0fe: aload 0
      // 0ff: instanceof java/util/Collection
      // 102: aload 2
      // 103: ifnonnull 170
      // 106: ifeq 161
      // 109: goto 110
      // 10c: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f: athrow
      // 110: aload 0
      // 111: checkcast java/util/Collection
      // 114: astore 3
      // 115: new com/finalshell/ui/model/Oc2
      // 118: dup
      // 119: aload 3
      // 11a: invokeinterface java/util/Collection.size ()I 1
      // 11f: invokespecial com/finalshell/ui/model/Oc2.<init> (I)V
      // 122: astore 4
      // 124: aload 3
      // 125: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 12a: astore 5
      // 12c: aload 5
      // 12e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 133: ifeq 15e
      // 136: aload 5
      // 138: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 13d: astore 6
      // 13f: aload 6
      // 141: aload 1
      // 142: invokestatic com/finalshell/core/Ok2.l (Ljava/lang/Object;Lcom/finalshell/core/En2;)Ljava/lang/Object;
      // 145: astore 7
      // 147: aload 4
      // 149: aload 2
      // 14a: ifnonnull 160
      // 14d: aload 7
      // 14f: invokevirtual com/finalshell/ui/model/Oc2.add (Ljava/lang/Object;)Z
      // 152: pop
      // 153: aload 2
      // 154: ifnull 12c
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: aload 4
      // 160: areturn
      // 161: aload 0
      // 162: aload 2
      // 163: ifnonnull 17e
      // 166: instanceof com/finalshell/core/CN
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: ifeq 17d
      // 173: aload 0
      // 174: invokestatic com/finalshell/core/Ok2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 177: astore 3
      // 178: aload 3
      // 179: invokestatic com/finalshell/core/Ok2.X (Ljava/lang/String;)Ljava/lang/Object;
      // 17c: areturn
      // 17d: aload 0
      // 17e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 181: astore 3
      // 182: aload 3
      // 183: invokevirtual java/lang/Class.isEnum ()Z
      // 186: aload 2
      // 187: ifnonnull 1a4
      // 18a: ifeq 1a0
      // 18d: goto 194
      // 190: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 193: athrow
      // 194: aload 0
      // 195: checkcast java/lang/Enum
      // 198: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 19b: areturn
      // 19c: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: aload 3
      // 1a1: invokevirtual java/lang/Class.isArray ()Z
      // 1a4: aload 2
      // 1a5: ifnonnull 208
      // 1a8: ifeq 1f9
      // 1ab: goto 1b2
      // 1ae: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b1: athrow
      // 1b2: aload 0
      // 1b3: invokestatic java/lang/reflect/Array.getLength (Ljava/lang/Object;)I
      // 1b6: istore 4
      // 1b8: new com/finalshell/ui/model/Oc2
      // 1bb: dup
      // 1bc: iload 4
      // 1be: invokespecial com/finalshell/ui/model/Oc2.<init> (I)V
      // 1c1: astore 5
      // 1c3: bipush 0
      // 1c4: istore 6
      // 1c6: iload 6
      // 1c8: iload 4
      // 1ca: if_icmpge 1f6
      // 1cd: aload 0
      // 1ce: iload 6
      // 1d0: invokestatic java/lang/reflect/Array.get (Ljava/lang/Object;I)Ljava/lang/Object;
      // 1d3: astore 7
      // 1d5: aload 7
      // 1d7: invokestatic com/finalshell/core/Ok2.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 1da: astore 8
      // 1dc: aload 5
      // 1de: aload 2
      // 1df: ifnonnull 1f8
      // 1e2: aload 8
      // 1e4: invokevirtual com/finalshell/ui/model/Oc2.add (Ljava/lang/Object;)Z
      // 1e7: pop
      // 1e8: iinc 6 1
      // 1eb: aload 2
      // 1ec: ifnull 1c6
      // 1ef: goto 1f6
      // 1f2: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: aload 5
      // 1f8: areturn
      // 1f9: aload 3
      // 1fa: aload 2
      // 1fb: ifnonnull 20c
      // 1fe: invokestatic com/finalshell/core/IG.C (Ljava/lang/Class;)Z
      // 201: goto 208
      // 204: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 207: athrow
      // 208: ifeq 20d
      // 20b: aload 0
      // 20c: areturn
      // 20d: aload 1
      // 20e: aload 3
      // 20f: invokevirtual com/finalshell/core/En2.O$ak_2 (Ljava/lang/Class;)Lcom/finalshell/core/Ak2;
      // 212: astore 4
      // 214: aload 4
      // 216: aload 2
      // 217: ifnonnull 310
      // 21a: instanceof com/finalshell/core/Nj4
      // 21d: ifeq 30f
      // 220: goto 227
      // 223: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 226: athrow
      // 227: aload 4
      // 229: checkcast com/finalshell/core/Nj4
      // 22c: astore 5
      // 22e: aload 5
      // 230: invokevirtual com/finalshell/core/Nj4.j ()Lcom/finalshell/core/O4;
      // 233: astore 6
      // 235: bipush 0
      // 236: istore 7
      // 238: aload 6
      // 23a: aload 2
      // 23b: ifnonnull 24a
      // 23e: ifnull 293
      // 241: goto 248
      // 244: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 247: athrow
      // 248: aload 6
      // 24a: invokeinterface com/finalshell/core/O4.u ()[Lcom/finalshell/ui/model/EP; 1
      // 24f: astore 8
      // 251: aload 8
      // 253: arraylength
      // 254: istore 9
      // 256: bipush 0
      // 257: istore 10
      // 259: iload 10
      // 25b: iload 9
      // 25d: if_icmpge 293
      // 260: aload 8
      // 262: iload 10
      // 264: aaload
      // 265: astore 11
      // 267: aload 11
      // 269: getstatic com/finalshell/ui/model/EP.SortField Lcom/finalshell/ui/model/EP;
      // 26c: aload 2
      // 26d: ifnonnull 286
      // 270: if_acmpeq 289
      // 273: goto 27a
      // 276: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 279: athrow
      // 27a: aload 11
      // 27c: getstatic com/finalshell/ui/model/EP.MapSortField Lcom/finalshell/ui/model/EP;
      // 27f: goto 286
      // 282: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 285: athrow
      // 286: if_acmpne 28c
      // 289: bipush 1
      // 28a: istore 7
      // 28c: iinc 10 1
      // 28f: aload 2
      // 290: ifnull 259
      // 293: new com/finalshell/ui/model/O0
      // 296: dup
      // 297: iload 7
      // 299: invokespecial com/finalshell/ui/model/O0.<init> (Z)V
      // 29c: astore 8
      // 29e: aload 5
      // 2a0: aload 0
      // 2a1: invokevirtual com/finalshell/core/Nj4.k (Ljava/lang/Object;)Ljava/util/Map;
      // 2a4: astore 9
      // 2a6: aload 9
      // 2a8: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 2ad: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 2b2: astore 10
      // 2b4: aload 10
      // 2b6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2bb: ifeq 2f4
      // 2be: aload 10
      // 2c0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c5: checkcast java/util/Map$Entry
      // 2c8: astore 11
      // 2ca: aload 8
      // 2cc: aload 11
      // 2ce: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 2d3: checkcast java/lang/String
      // 2d6: aload 11
      // 2d8: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 2dd: aload 1
      // 2de: invokestatic com/finalshell/core/Ok2.l (Ljava/lang/Object;Lcom/finalshell/core/En2;)Ljava/lang/Object;
      // 2e1: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 2e4: pop
      // 2e5: aload 2
      // 2e6: ifnonnull 30c
      // 2e9: aload 2
      // 2ea: ifnull 2b4
      // 2ed: goto 2f4
      // 2f0: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f3: athrow
      // 2f4: goto 30c
      // 2f7: astore 9
      // 2f9: new com/finalshell/core/Hi2
      // 2fc: dup
      // 2fd: sipush 22086
      // 300: sipush 721
      // 303: invokestatic com/finalshell/core/Ok2.a (II)Ljava/lang/String;
      // 306: aload 9
      // 308: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 30b: athrow
      // 30c: aload 8
      // 30e: areturn
      // 30f: aload 0
      // 310: aload 1
      // 311: bipush 0
      // 312: anewarray 53
      // 315: invokestatic com/finalshell/core/Ok2.K (Ljava/lang/Object;Lcom/finalshell/core/En2;[Lcom/finalshell/ui/model/EP;)Ljava/lang/String;
      // 318: astore 5
      // 31a: aload 5
      // 31c: invokestatic com/finalshell/core/Ok2.X (Ljava/lang/String;)Ljava/lang/Object;
      // 31f: areturn
   }

   public static Object z(Ok2 var0, java.lang.Class var1) {
      return B8_2.B(var0, var1, IG.G());
   }

   public Object X(java.lang.Class param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: ldc_w com/finalshell/ui/model/Oc2
      // 08: aload 2
      // 09: ifnonnull 20
      // 0c: if_acmpeq 60
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 1
      // 17: ldc com/finalshell/core/Ok2
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 2
      // 21: ifnonnull 39
      // 24: if_acmpeq 60
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: aload 1
      // 2f: ldc_w java/util/Collection
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: aload 2
      // 3a: ifnonnull 5d
      // 3d: if_acmpeq 60
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: aload 1
      // 48: aload 2
      // 49: ifnonnull 6e
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: ldc_w java/util/List
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: if_acmpne 66
      // 60: aload 0
      // 61: areturn
      // 62: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 0
      // 67: aload 1
      // 68: invokestatic com/finalshell/core/IG.G ()Lcom/finalshell/core/IG;
      // 6b: invokestatic com/finalshell/core/B8_2.B (Ljava/lang/Object;Ljava/lang/Class;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 6e: areturn
   }

   public Object W(Type var1) {
      return B8_2.I(this, var1, IG.G());
   }

   public Object X(HI var1) {
      HI var10000;
      String var2 = Hi2.C();

      Type var5;
      label24: {
         label23: {
            label22: {
               try {
                  var10000 = var1;
                  if (var2 != null) {
                     break label23;
                  }

                  if (var1 == null) {
                     break label22;
                  }
               } catch (RuntimeException var4) {
                  throw a(var4);
               }

               var10000 = var1;
               break label23;
            }

            var5 = null;
            break label24;
         }

         var5 = var10000.O();
      }

      Type var3 = var5;
      return B8_2.I(this, var3, IG.G());
   }

   public static byte[] K(int param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: getstatic com/finalshell/core/Ok2.H Ljava/lang/ThreadLocal;
      // 06: invokevirtual java/lang/ThreadLocal.get ()Ljava/lang/Object;
      // 09: checkcast [B
      // 0c: astore 2
      // 0d: astore 1
      // 0e: aload 2
      // 0f: aload 1
      // 10: ifnonnull 6a
      // 13: ifnonnull 62
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: iload 0
      // 1e: aload 1
      // 1f: ifnonnull 5b
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: sipush 4340
      // 2c: ldc2_w 6658045543267204732
      // 2f: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 32: if_icmpgt 53
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: sipush 4340
      // 3f: ldc2_w 6658045543267204732
      // 42: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 45: newarray 8
      // 47: astore 2
      // 48: getstatic com/finalshell/core/Ok2.H Ljava/lang/ThreadLocal;
      // 4b: aload 2
      // 4c: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // 4f: aload 1
      // 50: ifnull 7e
      // 53: iload 0
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: newarray 8
      // 5d: astore 2
      // 5e: aload 1
      // 5f: ifnull 7e
      // 62: aload 2
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: aload 1
      // 6b: ifnonnull 7f
      // 6e: arraylength
      // 6f: iload 0
      // 70: if_icmpge 7e
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 79: athrow
      // 7a: iload 0
      // 7b: newarray 8
      // 7d: astore 2
      // 7e: aload 2
      // 7f: areturn
   }

   public static char[] O(int param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: getstatic com/finalshell/core/Ok2.w Ljava/lang/ThreadLocal;
      // 06: invokevirtual java/lang/ThreadLocal.get ()Ljava/lang/Object;
      // 09: checkcast [C
      // 0c: astore 2
      // 0d: astore 1
      // 0e: aload 2
      // 0f: aload 1
      // 10: ifnonnull 6a
      // 13: ifnonnull 62
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: iload 0
      // 1e: aload 1
      // 1f: ifnonnull 5b
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: sipush 660
      // 2c: ldc2_w 2940802758088387613
      // 2f: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 32: if_icmpgt 53
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: sipush 4340
      // 3f: ldc2_w 6658045543267204732
      // 42: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 45: newarray 5
      // 47: astore 2
      // 48: getstatic com/finalshell/core/Ok2.w Ljava/lang/ThreadLocal;
      // 4b: aload 2
      // 4c: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // 4f: aload 1
      // 50: ifnull 7e
      // 53: iload 0
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: newarray 5
      // 5d: astore 2
      // 5e: aload 1
      // 5f: ifnull 7e
      // 62: aload 2
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: aload 1
      // 6b: ifnonnull 7f
      // 6e: arraylength
      // 6f: iload 0
      // 70: if_icmpge 7e
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 79: athrow
      // 7a: iload 0
      // 7b: newarray 5
      // 7d: astore 2
      // 7e: aload 2
      // 7f: areturn
   }

   /** @deprecated */
   public static boolean Q(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: aload 1
      // 006: ifnonnull 014
      // 009: ifnull 025
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: aload 0
      // 014: invokevirtual java/lang/String.length ()I
      // 017: aload 1
      // 018: ifnonnull 026
      // 01b: ifne 027
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: bipush 0
      // 026: ireturn
      // 027: new com/finalshell/core/Uy2_2
      // 02a: dup
      // 02b: aload 0
      // 02c: invokespecial com/finalshell/core/Uy2_2.<init> (Ljava/lang/String;)V
      // 02f: astore 2
      // 030: aload 2
      // 031: invokevirtual com/finalshell/core/Uy2_2.K ()V
      // 034: aload 2
      // 035: invokevirtual com/finalshell/core/Uy2_2.P ()I
      // 038: istore 3
      // 039: iload 3
      // 03a: aload 1
      // 03b: ifnonnull 0e0
      // 03e: tableswitch 154 2 14 139 139 139 139 139 139 139 154 154 154 70 154 123
      // 080: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: aload 2
      // 085: aload 1
      // 086: ifnonnull 0b1
      // 089: goto 090
      // 08c: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: invokevirtual com/finalshell/core/Uy2_2.w ()C
      // 093: sipush 31538
      // 096: ldc2_w 1230044598097450429
      // 099: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 09c: if_icmpne 0b0
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: bipush 0
      // 0a7: istore 4
      // 0a9: aload 2
      // 0aa: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 0ad: iload 4
      // 0af: ireturn
      // 0b0: aload 2
      // 0b1: bipush 1
      // 0b2: invokevirtual com/finalshell/core/Uy2_2.d (Z)V
      // 0b5: aload 1
      // 0b6: ifnull 0e9
      // 0b9: aload 2
      // 0ba: bipush 1
      // 0bb: invokevirtual com/finalshell/core/Uy2_2.X (Z)V
      // 0be: aload 1
      // 0bf: ifnull 0e9
      // 0c2: goto 0c9
      // 0c5: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c8: athrow
      // 0c9: aload 2
      // 0ca: invokevirtual com/finalshell/core/Uy2_2.K ()V
      // 0cd: aload 1
      // 0ce: ifnull 0e9
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d7: athrow
      // 0d8: bipush 0
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: istore 4
      // 0e2: aload 2
      // 0e3: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 0e6: iload 4
      // 0e8: ireturn
      // 0e9: aload 2
      // 0ea: invokevirtual com/finalshell/core/Uy2_2.P ()I
      // 0ed: aload 1
      // 0ee: ifnonnull 10c
      // 0f1: sipush 1511
      // 0f4: ldc2_w 1011378586708601696
      // 0f7: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 0fa: if_icmpne 10f
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103: athrow
      // 104: bipush 1
      // 105: goto 10c
      // 108: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b: athrow
      // 10c: goto 110
      // 10f: bipush 0
      // 110: istore 4
      // 112: aload 2
      // 113: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 116: iload 4
      // 118: ireturn
      // 119: astore 3
      // 11a: bipush 0
      // 11b: istore 4
      // 11d: aload 2
      // 11e: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 121: iload 4
      // 123: ireturn
      // 124: astore 5
      // 126: aload 2
      // 127: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 12a: aload 5
      // 12c: athrow
   }

   /** @deprecated */
   public static boolean y$boolean(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 14
      // 09: ifnull 25
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/lang/String.length ()I
      // 17: aload 1
      // 18: ifnonnull 26
      // 1b: ifne 27
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
      // 27: new com/finalshell/core/Uy2_2
      // 2a: dup
      // 2b: aload 0
      // 2c: invokespecial com/finalshell/core/Uy2_2.<init> (Ljava/lang/String;)V
      // 2f: astore 2
      // 30: aload 2
      // 31: invokevirtual com/finalshell/core/Uy2_2.K ()V
      // 34: aload 2
      // 35: invokevirtual com/finalshell/core/Uy2_2.P ()I
      // 38: istore 3
      // 39: iload 3
      // 3a: aload 1
      // 3b: ifnonnull ac
      // 3e: sipush 21142
      // 41: ldc2_w 6343635491314646040
      // 44: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 47: if_icmpne ab
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: aload 2
      // 52: invokevirtual com/finalshell/core/Uy2_2.w ()C
      // 55: sipush 32614
      // 58: ldc2_w 6517112391450169826
      // 5b: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 5e: aload 1
      // 5f: ifnonnull 9a
      // 62: goto 69
      // 65: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: if_icmpne 7d
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: bipush 0
      // 74: istore 4
      // 76: aload 2
      // 77: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 7a: iload 4
      // 7c: ireturn
      // 7d: aload 2
      // 7e: bipush 1
      // 7f: invokevirtual com/finalshell/core/Uy2_2.d (Z)V
      // 82: aload 2
      // 83: invokevirtual com/finalshell/core/Uy2_2.P ()I
      // 86: aload 1
      // 87: ifnonnull 9e
      // 8a: sipush 2451
      // 8d: ldc2_w 8158925982375077657
      // 90: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 93: goto 9a
      // 96: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 99: athrow
      // 9a: if_icmpne a1
      // 9d: bipush 1
      // 9e: goto a2
      // a1: bipush 0
      // a2: istore 4
      // a4: aload 2
      // a5: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // a8: iload 4
      // aa: ireturn
      // ab: bipush 0
      // ac: istore 4
      // ae: aload 2
      // af: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // b2: iload 4
      // b4: ireturn
      // b5: astore 3
      // b6: bipush 0
      // b7: istore 4
      // b9: aload 2
      // ba: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // bd: iload 4
      // bf: ireturn
      // c0: astore 5
      // c2: aload 2
      // c3: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // c6: aload 5
      // c8: athrow
   }

   /** @deprecated */
   public static boolean q(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 14
      // 09: ifnull 25
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/lang/String.length ()I
      // 17: aload 1
      // 18: ifnonnull 26
      // 1b: ifne 27
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
      // 27: new com/finalshell/core/Uy2_2
      // 2a: dup
      // 2b: aload 0
      // 2c: invokespecial com/finalshell/core/Uy2_2.<init> (Ljava/lang/String;)V
      // 2f: astore 2
      // 30: aload 2
      // 31: invokevirtual com/finalshell/core/Uy2_2.K ()V
      // 34: aload 2
      // 35: invokevirtual com/finalshell/core/Uy2_2.P ()I
      // 38: istore 3
      // 39: iload 3
      // 3a: aload 1
      // 3b: ifnonnull 8e
      // 3e: sipush 24935
      // 41: ldc2_w 2026361931282583522
      // 44: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 47: if_icmpne 8d
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: aload 2
      // 52: bipush 1
      // 53: invokevirtual com/finalshell/core/Uy2_2.X (Z)V
      // 56: aload 2
      // 57: invokevirtual com/finalshell/core/Uy2_2.P ()I
      // 5a: aload 1
      // 5b: ifnonnull 80
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: sipush 1511
      // 68: ldc2_w 1011378586708601696
      // 6b: invokestatic com/finalshell/core/Ok2.a (IJ)I
      // 6e: if_icmpne 83
      // 71: goto 78
      // 74: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: bipush 1
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: goto 84
      // 83: bipush 0
      // 84: istore 4
      // 86: aload 2
      // 87: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 8a: iload 4
      // 8c: ireturn
      // 8d: bipush 0
      // 8e: istore 4
      // 90: aload 2
      // 91: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 94: iload 4
      // 96: ireturn
      // 97: astore 3
      // 98: bipush 0
      // 99: istore 4
      // 9b: aload 2
      // 9c: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 9f: iload 4
      // a1: ireturn
      // a2: astore 5
      // a4: aload 2
      // a5: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // a8: aload 5
      // aa: athrow
   }

   public static void c(Yn4 var0, Object var1) {
      var0.Y(var1);
   }

   public static void Y(Type param0, Type param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 14
      // 09: ifnull 32
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 1
      // 14: aload 2
      // 15: ifnonnull 31
      // 18: ifnull 32
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: getstatic com/finalshell/core/Ok2.A Ljava/util/concurrent/ConcurrentHashMap;
      // 25: aload 0
      // 26: aload 1
      // 27: invokevirtual java/util/concurrent/ConcurrentHashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: pop
      // 32: return
   }

   public static void y(Type param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 21
      // 09: ifnull 22
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: getstatic com/finalshell/core/Ok2.A Ljava/util/concurrent/ConcurrentHashMap;
      // 16: aload 0
      // 17: invokevirtual java/util/concurrent/ConcurrentHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Ok2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: pop
      // 22: return
   }

   public static void d() {
      A.clear();
   }

   public static Type k(Type var0) {
      try {
         return var0 != null ? (Type)A.get(var0) : null;
      } catch (RuntimeException var1) {
         throw a(var1);
      }
   }

   static {
      __vfClinit__();
   }

   public static void X(Ky4[] var0) {
      i = var0;
   }

   public static Ky4[] j() {
      return i;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 22083) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 216;
               break;
            case 1:
               var10000 = 97;
               break;
            case 2:
               var10000 = 79;
               break;
            case 3:
               var10000 = 106;
               break;
            case 4:
               var10000 = 165;
               break;
            case 5:
               var10000 = 145;
               break;
            case 6:
               var10000 = 107;
               break;
            case 7:
               var10000 = 194;
               break;
            case 8:
               var10000 = 118;
               break;
            case 9:
               var10000 = 47;
               break;
            case 10:
               var10000 = 110;
               break;
            case 11:
               var10000 = 95;
               break;
            case 12:
               var10000 = 217;
               break;
            case 13:
               var10000 = 239;
               break;
            case 14:
               var10000 = 99;
               break;
            case 15:
               var10000 = 236;
               break;
            case 16:
               var10000 = 208;
               break;
            case 17:
               var10000 = 64;
               break;
            case 18:
               var10000 = 210;
               break;
            case 19:
               var10000 = 98;
               break;
            case 20:
               var10000 = 84;
               break;
            case 21:
               var10000 = 189;
               break;
            case 22:
               var10000 = 14;
               break;
            case 23:
               var10000 = 52;
               break;
            case 24:
               var10000 = 231;
               break;
            case 25:
               var10000 = 131;
               break;
            case 26:
               var10000 = 20;
               break;
            case 27:
               var10000 = 83;
               break;
            case 28:
               var10000 = 129;
               break;
            case 29:
               var10000 = 144;
               break;
            case 30:
               var10000 = 42;
               break;
            case 31:
               var10000 = 232;
               break;
            case 32:
               var10000 = 170;
               break;
            case 33:
               var10000 = 18;
               break;
            case 34:
               var10000 = 185;
               break;
            case 35:
               var10000 = 8;
               break;
            case 36:
               var10000 = 100;
               break;
            case 37:
               var10000 = 2;
               break;
            case 38:
               var10000 = 132;
               break;
            case 39:
               var10000 = 58;
               break;
            case 40:
               var10000 = 17;
               break;
            case 41:
               var10000 = 71;
               break;
            case 42:
               var10000 = 45;
               break;
            case 43:
               var10000 = 89;
               break;
            case 44:
               var10000 = 172;
               break;
            case 45:
               var10000 = 60;
               break;
            case 46:
               var10000 = 202;
               break;
            case 47:
               var10000 = 39;
               break;
            case 48:
               var10000 = 33;
               break;
            case 49:
               var10000 = 204;
               break;
            case 50:
               var10000 = 55;
               break;
            case 51:
               var10000 = 197;
               break;
            case 52:
               var10000 = 49;
               break;
            case 53:
               var10000 = 161;
               break;
            case 54:
               var10000 = 133;
               break;
            case 55:
               var10000 = 234;
               break;
            case 56:
               var10000 = 19;
               break;
            case 57:
               var10000 = 56;
               break;
            case 58:
               var10000 = 37;
               break;
            case 59:
               var10000 = 41;
               break;
            case 60:
               var10000 = 6;
               break;
            case 61:
               var10000 = 178;
               break;
            case 62:
               var10000 = 65;
               break;
            case 63:
               var10000 = 12;
               break;
            case 64:
               var10000 = 235;
               break;
            case 65:
               var10000 = 248;
               break;
            case 66:
               var10000 = 7;
               break;
            case 67:
               var10000 = 253;
               break;
            case 68:
               var10000 = 93;
               break;
            case 69:
               var10000 = 29;
               break;
            case 70:
               var10000 = 242;
               break;
            case 71:
               var10000 = 173;
               break;
            case 72:
               var10000 = 171;
               break;
            case 73:
               var10000 = 151;
               break;
            case 74:
               var10000 = 137;
               break;
            case 75:
               var10000 = 86;
               break;
            case 76:
               var10000 = 27;
               break;
            case 77:
               var10000 = 54;
               break;
            case 78:
               var10000 = 160;
               break;
            case 79:
               var10000 = 149;
               break;
            case 80:
               var10000 = 25;
               break;
            case 81:
               var10000 = 229;
               break;
            case 82:
               var10000 = 69;
               break;
            case 83:
               var10000 = 184;
               break;
            case 84:
               var10000 = 21;
               break;
            case 85:
               var10000 = 3;
               break;
            case 86:
               var10000 = 113;
               break;
            case 87:
               var10000 = 135;
               break;
            case 88:
               var10000 = 16;
               break;
            case 89:
               var10000 = 238;
               break;
            case 90:
               var10000 = 177;
               break;
            case 91:
               var10000 = 192;
               break;
            case 92:
               var10000 = 152;
               break;
            case 93:
               var10000 = 222;
               break;
            case 94:
               var10000 = 174;
               break;
            case 95:
               var10000 = 61;
               break;
            case 96:
               var10000 = 9;
               break;
            case 97:
               var10000 = 224;
               break;
            case 98:
               var10000 = 36;
               break;
            case 99:
               var10000 = 53;
               break;
            case 100:
               var10000 = 1;
               break;
            case 101:
               var10000 = 201;
               break;
            case 102:
               var10000 = 252;
               break;
            case 103:
               var10000 = 127;
               break;
            case 104:
               var10000 = 117;
               break;
            case 105:
               var10000 = 139;
               break;
            case 106:
               var10000 = 102;
               break;
            case 107:
               var10000 = 244;
               break;
            case 108:
               var10000 = 156;
               break;
            case 109:
               var10000 = 22;
               break;
            case 110:
               var10000 = 162;
               break;
            case 111:
               var10000 = 251;
               break;
            case 112:
               var10000 = 125;
               break;
            case 113:
               var10000 = 187;
               break;
            case 114:
               var10000 = 212;
               break;
            case 115:
               var10000 = 183;
               break;
            case 116:
               var10000 = 158;
               break;
            case 117:
               var10000 = 213;
               break;
            case 118:
               var10000 = 186;
               break;
            case 119:
               var10000 = 198;
               break;
            case 120:
               var10000 = 88;
               break;
            case 121:
               var10000 = 143;
               break;
            case 122:
               var10000 = 164;
               break;
            case 123:
               var10000 = 82;
               break;
            case 124:
               var10000 = 63;
               break;
            case 125:
               var10000 = 72;
               break;
            case 126:
               var10000 = 85;
               break;
            case 127:
               var10000 = 0;
               break;
            case 128:
               var10000 = 240;
               break;
            case 129:
               var10000 = 123;
               break;
            case 130:
               var10000 = 246;
               break;
            case 131:
               var10000 = 218;
               break;
            case 132:
               var10000 = 78;
               break;
            case 133:
               var10000 = 207;
               break;
            case 134:
               var10000 = 73;
               break;
            case 135:
               var10000 = 77;
               break;
            case 136:
               var10000 = 76;
               break;
            case 137:
               var10000 = 153;
               break;
            case 138:
               var10000 = 114;
               break;
            case 139:
               var10000 = 51;
               break;
            case 140:
               var10000 = 119;
               break;
            case 141:
               var10000 = 209;
               break;
            case 142:
               var10000 = 140;
               break;
            case 143:
               var10000 = 223;
               break;
            case 144:
               var10000 = 191;
               break;
            case 145:
               var10000 = 130;
               break;
            case 146:
               var10000 = 115;
               break;
            case 147:
               var10000 = 148;
               break;
            case 148:
               var10000 = 190;
               break;
            case 149:
               var10000 = 116;
               break;
            case 150:
               var10000 = 121;
               break;
            case 151:
               var10000 = 146;
               break;
            case 152:
               var10000 = 24;
               break;
            case 153:
               var10000 = 243;
               break;
            case 154:
               var10000 = 188;
               break;
            case 155:
               var10000 = 154;
               break;
            case 156:
               var10000 = 226;
               break;
            case 157:
               var10000 = 23;
               break;
            case 158:
               var10000 = 62;
               break;
            case 159:
               var10000 = 142;
               break;
            case 160:
               var10000 = 67;
               break;
            case 161:
               var10000 = 43;
               break;
            case 162:
               var10000 = 15;
               break;
            case 163:
               var10000 = 26;
               break;
            case 164:
               var10000 = 205;
               break;
            case 165:
               var10000 = 4;
               break;
            case 166:
               var10000 = 230;
               break;
            case 167:
               var10000 = 138;
               break;
            case 168:
               var10000 = 203;
               break;
            case 169:
               var10000 = 245;
               break;
            case 170:
               var10000 = 227;
               break;
            case 171:
               var10000 = 40;
               break;
            case 172:
               var10000 = 157;
               break;
            case 173:
               var10000 = 80;
               break;
            case 174:
               var10000 = 66;
               break;
            case 175:
               var10000 = 169;
               break;
            case 176:
               var10000 = 196;
               break;
            case 177:
               var10000 = 150;
               break;
            case 178:
               var10000 = 175;
               break;
            case 179:
               var10000 = 87;
               break;
            case 180:
               var10000 = 199;
               break;
            case 181:
               var10000 = 96;
               break;
            case 182:
               var10000 = 155;
               break;
            case 183:
               var10000 = 167;
               break;
            case 184:
               var10000 = 136;
               break;
            case 185:
               var10000 = 94;
               break;
            case 186:
               var10000 = 134;
               break;
            case 187:
               var10000 = 91;
               break;
            case 188:
               var10000 = 10;
               break;
            case 189:
               var10000 = 104;
               break;
            case 190:
               var10000 = 57;
               break;
            case 191:
               var10000 = 48;
               break;
            case 192:
               var10000 = 126;
               break;
            case 193:
               var10000 = 50;
               break;
            case 194:
               var10000 = 221;
               break;
            case 195:
               var10000 = 225;
               break;
            case 196:
               var10000 = 35;
               break;
            case 197:
               var10000 = 168;
               break;
            case 198:
               var10000 = 34;
               break;
            case 199:
               var10000 = 70;
               break;
            case 200:
               var10000 = 147;
               break;
            case 201:
               var10000 = 206;
               break;
            case 202:
               var10000 = 74;
               break;
            case 203:
               var10000 = 247;
               break;
            case 204:
               var10000 = 108;
               break;
            case 205:
               var10000 = 46;
               break;
            case 206:
               var10000 = 249;
               break;
            case 207:
               var10000 = 44;
               break;
            case 208:
               var10000 = 214;
               break;
            case 209:
               var10000 = 111;
               break;
            case 210:
               var10000 = 228;
               break;
            case 211:
               var10000 = 220;
               break;
            case 212:
               var10000 = 122;
               break;
            case 213:
               var10000 = 181;
               break;
            case 214:
               var10000 = 112;
               break;
            case 215:
               var10000 = 11;
               break;
            case 216:
               var10000 = 176;
               break;
            case 217:
               var10000 = 32;
               break;
            case 218:
               var10000 = 233;
               break;
            case 219:
               var10000 = 182;
               break;
            case 220:
               var10000 = 215;
               break;
            case 221:
               var10000 = 68;
               break;
            case 222:
               var10000 = 105;
               break;
            case 223:
               var10000 = 75;
               break;
            case 224:
               var10000 = 141;
               break;
            case 225:
               var10000 = 90;
               break;
            case 226:
               var10000 = 193;
               break;
            case 227:
               var10000 = 59;
               break;
            case 228:
               var10000 = 28;
               break;
            case 229:
               var10000 = 31;
               break;
            case 230:
               var10000 = 179;
               break;
            case 231:
               var10000 = 120;
               break;
            case 232:
               var10000 = 180;
               break;
            case 233:
               var10000 = 241;
               break;
            case 234:
               var10000 = 38;
               break;
            case 235:
               var10000 = 128;
               break;
            case 236:
               var10000 = 92;
               break;
            case 237:
               var10000 = 250;
               break;
            case 238:
               var10000 = 237;
               break;
            case 239:
               var10000 = 124;
               break;
            case 240:
               var10000 = 159;
               break;
            case 241:
               var10000 = 13;
               break;
            case 242:
               var10000 = 219;
               break;
            case 243:
               var10000 = 103;
               break;
            case 244:
               var10000 = 195;
               break;
            case 245:
               var10000 = 254;
               break;
            case 246:
               var10000 = 255;
               break;
            case 247:
               var10000 = 163;
               break;
            case 248:
               var10000 = 81;
               break;
            case 249:
               var10000 = 211;
               break;
            case 250:
               var10000 = 109;
               break;
            case 251:
               var10000 = 166;
               break;
            case 252:
               var10000 = 200;
               break;
            case 253:
               var10000 = 5;
               break;
            case 254:
               var10000 = 30;
               break;
            default:
               var10000 = 101;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28303;
      if (j[var3] == null) {
         j[var3] = (int)(f[var3] ^ var1);
      }

      return j[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      int var27;
      char[] var47;
      String[] var13 = new String[14];
      int var11 = 0;
      String var10 = "¼x·ñ\u009b\u0005¡#\u0014\u009aï\u0005\u0087l¯¾ª\u0013^_\u0002\u0004Ò\u001dh\u0010)\b-HO\u0085¿\u0004ëó\u009a\u0004\u0003Â\tÁ\f\u009d(å\u0014\u0019sRö¸\u0083\u0084×\u0004ú<6\u001e\u001b:5À\u000b<¬§MÉ\n\u0085\u0091\u000bKP\u0017$U![:ô/3a2\u008b\u0012µÛ\u0089\u0082¯_JâAxpÆÐ\u0081ìUZ!,8\u00978\u000b\u0099n\u008cÄ\u0099\u00adyP\u0097¤ç×@´*\u00ad\u008aGKAN\u0099Ö[ó\u0081U¢ \u001f{W^£øR\u0002-\u0014\u0093$exFñx×\u001fÚÉvD\u001f\u0086ªå\u0016\t\u0086!\u0087\u0004Á·\u008c\u0015\u0090Ê¾«V©c\u0097yWv(\u0016Fý1!)\u009b,{³!ð\u0002´\u0012\u0016?#Im\u00878éÙulg\u009dÆ\u009dªm\u00ad`´\f¡\u008cÜÕ";
      int var12 = "¼x·ñ\u009b\u0005¡#\u0014\u009aï\u0005\u0087l¯¾ª\u0013^_\u0002\u0004Ò\u001dh\u0010)\b-HO\u0085¿\u0004ëó\u009a\u0004\u0003Â\tÁ\f\u009d(å\u0014\u0019sRö¸\u0083\u0084×\u0004ú<6\u001e\u001b:5À\u000b<¬§MÉ\n\u0085\u0091\u000bKP\u0017$U![:ô/3a2\u008b\u0012µÛ\u0089\u0082¯_JâAxpÆÐ\u0081ìUZ!,8\u00978\u000b\u0099n\u008cÄ\u0099\u00adyP\u0097¤ç×@´*\u00ad\u008aGKAN\u0099Ö[ó\u0081U¢ \u001f{W^£øR\u0002-\u0014\u0093$exFñx×\u001fÚÉvD\u001f\u0086ªå\u0016\t\u0086!\u0087\u0004Á·\u008c\u0015\u0090Ê¾«V©c\u0097yWv(\u0016Fý1!)\u009b,{³!ð\u0002´\u0012\u0016?#Im\u00878éÙulg\u009dÆ\u009dªm\u00ad`´\f¡\u008cÜÕ"
         .length();
      char var9 = 5;
      X(null);
      int var18 = -1;

      label70:
      while (true) {
         byte var10000 = 4;
         String var10001 = var10.substring(++var18, var18 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var53 = var10001.toCharArray();
               int var10004 = var53.length;
               int var14 = 0;
               byte var56 = var10000;
               var47 = var53;
               int var38 = var10004;
               byte var63;
               char[] var69;
               int var10006;
               if (var10004 <= 1) {
                  var69 = var53;
                  var63 = var10000;
                  var10006 = var14;
               } else {
                  var56 = var10000;
                  var38 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var69 = var53;
                  var63 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var78 = var69[var10006];
                  byte var79;
                  switch (var14 % 7) {
                     case 0:
                        var79 = 26;
                        break;
                     case 1:
                        var79 = 107;
                        break;
                     case 2:
                        var79 = 33;
                        break;
                     case 3:
                        var79 = 41;
                        break;
                     case 4:
                        var79 = 73;
                        break;
                     case 5:
                        var79 = 39;
                        break;
                     default:
                        var79 = 90;
                  }

                  var69[var10006] = (char)(var78 ^ var63 ^ var79);
                  var14++;
                  if (var56 == 0) {
                     var10006 = var56;
                     var69 = var47;
                     var63 = var56;
                  } else {
                     if (var38 <= var14) {
                        break;
                     }

                     var69 = var47;
                     var63 = var56;
                     var10006 = var14;
                  }
               }
            }

            String var58 = new String(var47).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var58;
                  if ((var18 += var9) >= var12) {
                     b = var13;
                     c = new String[14];
                     long var0 = 3230512175600390237L;
                     long[] var6 = new long[12];
                     int var3 = 0;
                     String var4 = "\u001ecE¹R@Åú\u0007\u00904x¡bìIAX\u0091-\u00819l\u0010ÇI\u008bn-\u000e\u0011îu\u0007<Rò\u001aý\u001e- Íõ-\u0017·P\"\u0083\u009aL+e¼@\u00111\u009a\r}í.!mN¤ \u007f\u000f»)ª\u008aô\u001e\r\u008d\ty";
                     int var5 = "\u001ecE¹R@Åú\u0007\u00904x¡bìIAX\u0091-\u00819l\u0010ÇI\u008bn-\u000e\u0011îu\u0007<Rò\u001aý\u001e- Íõ-\u0017·P\"\u0083\u009aL+e¼@\u00111\u009a\r}í.!mN¤ \u007f\u000f»)ª\u008aô\u001e\r\u008d\ty"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var40 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                        long[] var33 = var6;
                        int var41 = var3++;
                        long var51 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var59 = -1;

                        while (true) {
                           long var68 = var51 ^ var0;
                           switch (var59) {
                              case 0:
                                 var33[var41] = var68;
                                 if (var2 >= var5) {
                                    f = var6;
                                    j = new Integer[12];
                                    X = TimeZone.getDefault();
                                    Y = Locale.getDefault();
                                    Z = a(22095, -11194);
                                    s = new Wr4[0];
                                    z = a(22080, 13348);
                                    A = new ConcurrentHashMap(a(17368, 6563529773784935763L));
                                    int var15 = 0;
                                    var15 |= Ks2_2.AutoCloseSource.v();
                                    var15 |= Ks2_2.InternFieldNames.v();
                                    var15 |= Ks2_2.UseBigDecimal.v();
                                    var15 |= Ks2_2.AllowUnQuotedFieldNames.v();
                                    var15 |= Ks2_2.AllowSingleQuotes.v();
                                    var15 |= Ks2_2.AllowArbitraryCommas.v();
                                    var15 |= Ks2_2.SortFeidFastMatch.v();
                                    var15 |= Ks2_2.IgnoreNotMatch.v();
                                    h = var15;
                                    var27 = 0;
                                    var27 |= EP.QuoteFieldNames.a();
                                    var27 |= EP.SkipTransientField.a();
                                    var27 |= EP.WriteEnumUsingName.a();
                                    var27 |= EP.SortField.a();
                                    a = var27;
                                    z(S7.S);
                                    H = new ThreadLocal();
                                    w = new ThreadLocal();
                                    return;
                                 }
                                 break;
                              default:
                                 var33[var41] = var68;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "ñ\u0090\u0003\u0098\u0091E_±1\u0007Bäð\u0093A¥";
                                 var5 = "ñ\u0090\u0003\u0098\u0091E_±1\u0007Bäð\u0093A¥".length();
                                 var2 = 0;
                           }

                           byte var42 = var2;
                           var2 += 8;
                           var7 = var4.substring(var42, var2).getBytes("ISO-8859-1");
                           var33 = var6;
                           var41 = var3++;
                           var51 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var59 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var18);
                  break;
               default:
                  var13[var11++] = var58;
                  if ((var18 += var9) < var12) {
                     var9 = var10.charAt(var18);
                     continue label70;
                  }

                  var10 = "\u0019Î=Z´#¸#4SÿJ& 'ðP\u0006Í@E\u0082ßÀD\u0004øþ \u0013ÀÚ\u0099ð/\u0080\u0005\u0082\u00101®";
                  var12 = "\u0019Î=Z´#¸#4SÿJ& 'ðP\u0006Í@E\u0082ßÀD\u0004øþ \u0013ÀÚ\u0099ð/\u0080\u0005\u0082\u00101®".length();
                  var9 = 5;
                  var18 = -1;
            }

            var10000 = 97;
            var10001 = var10.substring(++var18, var18 + var9);
            var10002 = 0;
         }
      }
   }
}





