package com.finalshell.core;
import com.finalshell.reflect.Ref;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.io.IOException;

public class Vk2 {
   public static boolean m;
   public static boolean y;
   public static boolean H;
   public static boolean k;
   public static boolean L;
   public static boolean g;
   public static boolean w;
   public static boolean p;
   public static Ky4[] R;

   static {
      __vfClinit__();
   }

   public static boolean s() {
      return ((Boolean)Ref.g(481142582595933403L, null)).booleanValue();
   }

   public static boolean f() {
      return ((Boolean)Ref.g(211652848099132453L, null)).booleanValue();
   }

   public static boolean g() {
      return ((Boolean)Ref.g(141081595822631600L, null)).booleanValue();
   }

   public static boolean k() {
      return ((Boolean)Ref.g(177188004954483969L, null)).booleanValue();
   }

   public static boolean Y() {
      return ((Boolean)Ref.g(289627883740095040L, null)).booleanValue();
   }

   public static boolean j() {
      return ((Boolean)Ref.g(602842999202273941L, null)).booleanValue();
   }

   public static boolean R() {
      return ((Boolean)Ref.g(478117737005329770L, null)).booleanValue();
   }

   public static boolean E() {
      return ((Boolean)Ref.g(234239026957570090L, null)).booleanValue();
   }

   public static void P(Ky4[] var0) {
      R = var0;
   }

   public static Ky4[] y() {
      return R;
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static void __vfClinit__() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 14
      // 002: anewarray 69
      // 005: astore 0
      // 006: bipush 0
      // 007: istore 4
      // 009: ldc "-4.\u00064~u\u0014ai\u0007#5mX%>\u0017\u0003>6.\u0007#5mW60\u001a\u0003\"3;\u0003\"/;\u0007-'1Z?kK\u0003;/-\u0005-+'\u000fc\u0005 ),W0\u0003!' "
      // 00b: dup
      // 00c: astore 3
      // 00d: invokevirtual java/lang/String.length ()I
      // 010: istore 5
      // 012: bipush 3
      // 013: istore 2
      // 014: bipush 4
      // 015: anewarray 77
      // 018: bipush -1
      // 019: istore 1
      // 01a: invokestatic com/finalshell/core/Vk2.P ([Lcom/finalshell/ui/panel/Ky4;)V
      // 01d: bipush 42
      // 01f: iinc 1 1
      // 022: aload 3
      // 023: iload 1
      // 024: dup
      // 025: iload 2
      // 026: iadd
      // 027: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 02a: bipush -1
      // 02b: goto 087
      // 02e: aload 0
      // 02f: swap
      // 030: iload 4
      // 032: iinc 4 1
      // 035: swap
      // 036: aastore
      // 037: iload 1
      // 038: iload 2
      // 039: iadd
      // 03a: dup
      // 03b: istore 1
      // 03c: iload 5
      // 03e: if_icmpge 04a
      // 041: aload 3
      // 042: iload 1
      // 043: invokevirtual java/lang/String.charAt (I)C
      // 046: istore 2
      // 047: goto 01d
      // 04a: ldc "\u0004\u001a\u0004r\u0006\u0018RYJME"
      // 04c: dup
      // 04d: astore 3
      // 04e: invokevirtual java/lang/String.length ()I
      // 051: istore 5
      // 053: bipush 4
      // 054: istore 2
      // 055: bipush -1
      // 056: istore 1
      // 057: bipush 6
      // 059: iinc 1 1
      // 05c: aload 3
      // 05d: iload 1
      // 05e: dup
      // 05f: iload 2
      // 060: iadd
      // 061: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 064: bipush 0
      // 065: goto 087
      // 068: aload 0
      // 069: swap
      // 06a: iload 4
      // 06c: iinc 4 1
      // 06f: swap
      // 070: aastore
      // 071: iload 1
      // 072: iload 2
      // 073: iadd
      // 074: dup
      // 075: istore 1
      // 076: iload 5
      // 078: if_icmpge 084
      // 07b: aload 3
      // 07c: iload 1
      // 07d: invokevirtual java/lang/String.charAt (I)C
      // 080: istore 2
      // 081: goto 057
      // 084: goto 124
      // 087: dup_x2
      // 088: pop
      // 089: invokevirtual java/lang/String.toCharArray ()[C
      // 08c: dup_x1
      // 08d: arraylength
      // 08e: dup_x2
      // 08f: pop
      // 090: bipush 0
      // 091: istore 6
      // 093: dup2_x1
      // 094: pop2
      // 095: dup_x2
      // 096: bipush 1
      // 097: if_icmpgt 0fc
      // 09a: dup2
      // 09b: swap
      // 09c: iload 6
      // 09e: dup2_x1
      // 09f: caload
      // 0a0: swap
      // 0a1: iload 6
      // 0a3: bipush 7
      // 0a5: irem
      // 0a6: tableswitch 68 0 5 38 43 48 53 58 63
      // 0cc: bipush 102
      // 0ce: goto 0ec
      // 0d1: bipush 108
      // 0d3: goto 0ec
      // 0d6: bipush 105
      // 0d8: goto 0ec
      // 0db: bipush 19
      // 0dd: goto 0ec
      // 0e0: bipush 125
      // 0e2: goto 0ec
      // 0e5: bipush 119
      // 0e7: goto 0ec
      // 0ea: bipush 85
      // 0ec: ixor
      // 0ed: ixor
      // 0ee: i2c
      // 0ef: castore
      // 0f0: iinc 6 1
      // 0f3: dup
      // 0f4: ifne 0fc
      // 0f7: dup2
      // 0f8: dup_x1
      // 0f9: goto 09e
      // 0fc: dup2_x1
      // 0fd: pop2
      // 0fe: dup_x2
      // 0ff: iload 6
      // 101: if_icmpgt 09a
      // 104: pop
      // 105: new java/lang/String
      // 108: dup_x1
      // 109: swap
      // 10a: invokespecial java/lang/String.<init> ([C)V
      // 10d: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 110: swap
      // 111: pop
      // 112: swap
      // 113: tableswitch -229 0 0 -171
      // 124: bipush 0
      // 125: ldc2_w 481142582595933403
      // 128: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 12b: aconst_null
      // 12c: dup2_x1
      // 12d: pop2
      // 12e: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 131: bipush 0
      // 132: ldc2_w 211652848099132453
      // 135: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 138: aconst_null
      // 139: dup2_x1
      // 13a: pop2
      // 13b: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 13e: bipush 0
      // 13f: ldc2_w 141081595822631600
      // 142: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 145: aconst_null
      // 146: dup2_x1
      // 147: pop2
      // 148: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 14b: bipush 0
      // 14c: ldc2_w 177188004954483969
      // 14f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 152: aconst_null
      // 153: dup2_x1
      // 154: pop2
      // 155: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 158: bipush 0
      // 159: ldc2_w 289627883740095040
      // 15c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 15f: aconst_null
      // 160: dup2_x1
      // 161: pop2
      // 162: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 165: bipush 0
      // 166: ldc2_w 602842999202273941
      // 169: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 16c: aconst_null
      // 16d: dup2_x1
      // 16e: pop2
      // 16f: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 172: bipush 0
      // 173: ldc2_w 478117737005329770
      // 176: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 179: aconst_null
      // 17a: dup2_x1
      // 17b: pop2
      // 17c: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 17f: bipush 0
      // 180: ldc2_w 234239026957570090
      // 183: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 186: aconst_null
      // 187: dup2_x1
      // 188: pop2
      // 189: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 18c: aload 0
      // 18d: bipush 2
      // 18e: aaload
      // 18f: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 192: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 195: astore 7
      // 197: aload 0
      // 198: bipush 4
      // 199: aaload
      // 19a: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 19d: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 1a0: astore 8
      // 1a2: aload 7
      // 1a4: aload 0
      // 1a5: bipush 9
      // 1a7: aaload
      // 1a8: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1ab: ifne 1db
      // 1ae: aload 7
      // 1b0: aload 0
      // 1b1: bipush 13
      // 1b3: aaload
      // 1b4: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1b7: ifne 1db
      // 1ba: goto 1c1
      // 1bd: invokestatic com/finalshell/core/Vk2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1c0: athrow
      // 1c1: aload 7
      // 1c3: aload 0
      // 1c4: bipush 1
      // 1c5: aaload
      // 1c6: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1c9: ifne 1db
      // 1cc: goto 1d3
      // 1cf: invokestatic com/finalshell/core/Vk2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1d2: athrow
      // 1d3: bipush 0
      // 1d4: goto 1dc
      // 1d7: invokestatic com/finalshell/core/Vk2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1da: athrow
      // 1db: bipush 1
      // 1dc: ldc2_w 478117737005329770
      // 1df: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1e2: aconst_null
      // 1e3: dup2_x1
      // 1e4: pop2
      // 1e5: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 1e8: aload 7
      // 1ea: aload 0
      // 1eb: bipush 0
      // 1ec: aaload
      // 1ed: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1f0: ifne 20e
      // 1f3: aload 7
      // 1f5: aload 0
      // 1f6: bipush 7
      // 1f8: aaload
      // 1f9: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1fc: ifne 20e
      // 1ff: goto 206
      // 202: invokestatic com/finalshell/core/Vk2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 205: athrow
      // 206: bipush 0
      // 207: goto 20f
      // 20a: invokestatic com/finalshell/core/Vk2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 20d: athrow
      // 20e: bipush 1
      // 20f: ldc2_w 602842999202273941
      // 212: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 215: aconst_null
      // 216: dup2_x1
      // 217: pop2
      // 218: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 21b: aload 7
      // 21d: aload 0
      // 21e: bipush 10
      // 220: aaload
      // 221: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 224: ldc2_w 234239026957570090
      // 227: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 22a: aconst_null
      // 22b: dup2_x1
      // 22c: pop2
      // 22d: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 230: aload 8
      // 232: aload 0
      // 233: bipush 8
      // 235: aaload
      // 236: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 239: ldc2_w 481142582595933403
      // 23c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 23f: aconst_null
      // 240: dup2_x1
      // 241: pop2
      // 242: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 245: aload 8
      // 247: aload 0
      // 248: bipush 5
      // 249: aaload
      // 24a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 24d: ifne 26b
      // 250: aload 8
      // 252: aload 0
      // 253: bipush 6
      // 255: aaload
      // 256: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 259: ifne 26b
      // 25c: goto 263
      // 25f: invokestatic com/finalshell/core/Vk2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 262: athrow
      // 263: bipush 0
      // 264: goto 26c
      // 267: invokestatic com/finalshell/core/Vk2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 26a: athrow
      // 26b: bipush 1
      // 26c: ldc2_w 211652848099132453
      // 26f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 272: aconst_null
      // 273: dup2_x1
      // 274: pop2
      // 275: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 278: aload 8
      // 27a: aload 0
      // 27b: bipush 11
      // 27d: aaload
      // 27e: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 281: ldc2_w 141081595822631600
      // 284: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 287: aconst_null
      // 288: dup2_x1
      // 289: pop2
      // 28a: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 28d: ldc2_w 211652848099132453
      // 290: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 293: aconst_null
      // 294: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 297: ifeq 2f0
      // 29a: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 29d: bipush 1
      // 29e: anewarray 69
      // 2a1: dup
      // 2a2: bipush 0
      // 2a3: aload 0
      // 2a4: bipush 12
      // 2a6: aaload
      // 2a7: aastore
      // 2a8: aconst_null
      // 2a9: invokevirtual java/lang/Runtime.exec ([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Process;
      // 2ac: pop
      // 2ad: bipush 1
      // 2ae: ldc2_w 289627883740095040
      // 2b1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2b4: aconst_null
      // 2b5: dup2_x1
      // 2b6: pop2
      // 2b7: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 2ba: goto 2bf
      // 2bd: astore 9
      // 2bf: ldc2_w 289627883740095040
      // 2c2: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2c5: aconst_null
      // 2c6: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 2c9: ifne 2f0
      // 2cc: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 2cf: bipush 1
      // 2d0: anewarray 69
      // 2d3: dup
      // 2d4: bipush 0
      // 2d5: aload 0
      // 2d6: bipush 3
      // 2d7: aaload
      // 2d8: aastore
      // 2d9: aconst_null
      // 2da: invokevirtual java/lang/Runtime.exec ([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Process;
      // 2dd: pop
      // 2de: bipush 1
      // 2df: ldc2_w 177188004954483969
      // 2e2: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2e5: aconst_null
      // 2e6: dup2_x1
      // 2e7: pop2
      // 2e8: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 2eb: goto 2f0
      // 2ee: astore 9
      // 2f0: return
   }
}





