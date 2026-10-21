package com.finalshell.crypto;

import com.finalshell.core.AB_2;
import com.finalshell.core.IM;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.PW3;
import com.finalshell.core.Pc2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Login extends IM {
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public void L(ConnectHost param1) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aload 1
      // 04: invokevirtual com/finalshell/crypto/ConnectHost.H ()Lcom/finalshell/core/Lv4_2;
      // 07: astore 3
      // 08: istore 2
      // 09: aconst_null
      // 0a: astore 4
      // 0c: new com/finalshell/ui/dialog/SelectPrivateKeyDialog
      // 0f: dup
      // 10: aload 4
      // 12: invokespecial com/finalshell/ui/dialog/SelectPrivateKeyDialog.<init> (Ljava/awt/Window;)V
      // 15: astore 5
      // 17: aload 5
      // 19: aload 4
      // 1b: invokevirtual com/finalshell/ui/dialog/SelectPrivateKeyDialog.setLocationRelativeTo (Ljava/awt/Component;)V
      // 1e: aload 5
      // 20: bipush 1
      // 21: invokevirtual com/finalshell/ui/dialog/SelectPrivateKeyDialog.setVisible (Z)V
      // 24: aload 5
      // 26: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 29: ldc2_w 354630440848279501
      // 2c: astore 8
      // 2e: astore 7
      // 30: ldc2_w 354630440848279501
      // 33: aload 7
      // 35: aload 8
      // 37: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3a: checkcast com/finalshell/core/LN3
      // 3d: goto 44
      // 40: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 43: athrow
      // 44: astore 6
      // 46: iload 2
      // 47: ifeq f4
      // 4a: aload 6
      // 4c: ifnonnull 6b
      // 4f: goto 56
      // 52: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: new com/finalshell/core/Pc2
      // 59: dup
      // 5a: sipush 9784
      // 5d: sipush -21480
      // 60: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 63: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 66: athrow
      // 67: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: aload 3
      // 6c: aload 6
      // 6e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 71: ldc2_w 194080076253066315
      // 74: astore 10
      // 76: astore 9
      // 78: ldc2_w 194080076253066315
      // 7b: aload 9
      // 7d: aload 10
      // 7f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 82: goto 89
      // 85: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 88: athrow
      // 89: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 8c: ldc2_w 118023489548873021
      // 8f: astore 12
      // 91: astore 11
      // 93: ldc2_w 118023489548873021
      // 96: aload 11
      // 98: aload 12
      // 9a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 9d: pop
      // 9e: goto a5
      // a1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a4: athrow
      // a5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // a8: ldc2_w 270389152141252877
      // ab: astore 13
      // ad: ldc2_w 270389152141252877
      // b0: aload 13
      // b2: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // b5: goto bc
      // b8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // bb: athrow
      // bc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // bf: ldc2_w 410905379772103887
      // c2: astore 16
      // c4: astore 15
      // c6: ldc2_w 410905379772103887
      // c9: aload 15
      // cb: aload 16
      // cd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // d0: goto d7
      // d3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // d6: athrow
      // d7: aload 3
      // d8: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // db: ldc2_w 370860320396635908
      // de: astore 18
      // e0: astore 17
      // e2: ldc2_w 370860320396635908
      // e5: aload 17
      // e7: aload 18
      // e9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // ec: pop
      // ed: goto f4
      // f0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // f3: athrow
      // f4: return
   }

   public boolean a(ConnectHost var1) throws Pc2 {
      boolean var2 = false;
      Lv4_2 var3 = var1.H();
      Object[] var10001 = Registry.emptyArgs();
      long var6 = 183387209870064348L;
      Object[] var5 = var10001;
      Registry.packArgs(Ref.h(183387209870064348L, var5, var6), var1.r$Xe_2());
      long var7 = 412678005368187473L;
      Object var10002 = Ref.h2(412678005368187473L, var7);

      try {
         var10002 = (PW3)var10002;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      PW3 var4 = (PW3)var10002;
      if (var4 == null) {
         var2 = true;
      }

      return var2;
   }

   public boolean p(ConnectHost param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual com/finalshell/crypto/ConnectHost.H ()Lcom/finalshell/core/Lv4_2;
      // 004: astore 3
      // 005: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 008: aload 3
      // 009: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 00c: ldc2_w 183387209870064348
      // 00f: astore 30
      // 011: astore 29
      // 013: ldc2_w 183387209870064348
      // 016: aload 29
      // 018: aload 30
      // 01a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01d: goto 024
      // 020: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 023: athrow
      // 024: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 027: ldc2_w 602938716458919917
      // 02a: astore 31
      // 02c: ldc2_w 602938716458919917
      // 02f: aload 31
      // 031: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 034: checkcast com/finalshell/core/LN3
      // 037: goto 03e
      // 03a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: astore 4
      // 040: aload 3
      // 041: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 044: ldc2_w 183387209870064348
      // 047: astore 34
      // 049: astore 33
      // 04b: ldc2_w 183387209870064348
      // 04e: aload 33
      // 050: aload 34
      // 052: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 055: goto 05c
      // 058: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: aload 1
      // 05d: invokevirtual com/finalshell/crypto/ConnectHost.r$Xe_2 ()Lcom/finalshell/core/Xe2;
      // 060: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 063: ldc2_w 412678005368187473
      // 066: astore 35
      // 068: ldc2_w 412678005368187473
      // 06b: aload 35
      // 06d: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 070: checkcast com/finalshell/core/PW3
      // 073: goto 07a
      // 076: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 079: athrow
      // 07a: astore 5
      // 07c: istore 2
      // 07d: aload 4
      // 07f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 082: ldc2_w 557543992546278139
      // 085: astore 38
      // 087: astore 37
      // 089: ldc2_w 557543992546278139
      // 08c: aload 37
      // 08e: aload 38
      // 090: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 093: goto 09a
      // 096: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 099: athrow
      // 09a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 09d: ldc2_w 556691693894836467
      // 0a0: astore 39
      // 0a2: ldc2_w 556691693894836467
      // 0a5: aload 39
      // 0a7: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0aa: checkcast java/lang/String
      // 0ad: goto 0b4
      // 0b0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: astore 6
      // 0b6: aconst_null
      // 0b7: astore 7
      // 0b9: aload 0
      // 0ba: getfield com/finalshell/crypto/Login.a Ljava/lang/String;
      // 0bd: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 0c0: astore 7
      // 0c2: aload 5
      // 0c4: invokeinterface com/finalshell/core/AB_2.u ()[B 1
      // 0c9: astore 8
      // 0cb: aload 1
      // 0cc: sipush 9789
      // 0cf: sipush 16515
      // 0d2: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 0d5: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 0d8: sipush 9752
      // 0db: sipush -18215
      // 0de: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 0e1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e4: istore 10
      // 0e6: aload 1
      // 0e7: sipush 9745
      // 0ea: sipush -27856
      // 0ed: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 0f0: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 0f3: sipush 9772
      // 0f6: bipush 82
      // 0f8: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 0fb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0fe: istore 11
      // 100: aload 1
      // 101: invokevirtual com/finalshell/crypto/ConnectHost.p ()[Ljava/lang/String;
      // 104: astore 12
      // 106: aload 12
      // 108: iload 2
      // 109: ifne 118
      // 10c: ifnull 136
      // 10f: goto 116
      // 112: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: aload 12
      // 118: iload 2
      // 119: ifne 130
      // 11c: arraylength
      // 11d: ifle 136
      // 120: goto 127
      // 123: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: aload 12
      // 129: goto 130
      // 12c: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12f: athrow
      // 130: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 133: goto 139
      // 136: invokestatic java/util/Collections.emptyList ()Ljava/util/List;
      // 139: astore 13
      // 13b: sipush 9777
      // 13e: new java/util/ArrayList
      // 141: dup
      // 142: invokespecial java/util/ArrayList.<init> ()V
      // 145: astore 14
      // 147: sipush -2660
      // 14a: new java/util/ArrayList
      // 14d: dup
      // 14e: invokespecial java/util/ArrayList.<init> ()V
      // 151: astore 15
      // 153: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 156: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 159: ldc ","
      // 15b: invokestatic com/finalshell/core/E8.b (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // 15e: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 161: astore 16
      // 163: aload 16
      // 165: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 16a: astore 17
      // 16c: aload 17
      // 16e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 173: ifeq 2a5
      // 176: aload 17
      // 178: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 17d: checkcast java/lang/String
      // 180: astore 18
      // 182: aload 18
      // 184: sipush 9771
      // 187: sipush 15253
      // 18a: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 18d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 190: iload 2
      // 191: ifne 2cf
      // 194: iload 2
      // 195: ifne 28b
      // 198: goto 19f
      // 19b: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19e: athrow
      // 19f: ifne 27b
      // 1a2: goto 1a9
      // 1a5: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a8: athrow
      // 1a9: aload 18
      // 1ab: sipush 9786
      // 1ae: sipush 2045
      // 1b1: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 1b4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b7: iload 2
      // 1b8: ifne 28b
      // 1bb: goto 1c2
      // 1be: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c1: athrow
      // 1c2: ifne 27b
      // 1c5: goto 1cc
      // 1c8: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cb: athrow
      // 1cc: aload 18
      // 1ce: sipush 9775
      // 1d1: sipush -3689
      // 1d4: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 1d7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1da: iload 2
      // 1db: ifne 28b
      // 1de: goto 1e5
      // 1e1: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e4: athrow
      // 1e5: ifne 27b
      // 1e8: goto 1ef
      // 1eb: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: aload 18
      // 1f1: sipush 9754
      // 1f4: sipush 16286
      // 1f7: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 1fa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1fd: iload 2
      // 1fe: ifne 28b
      // 201: goto 208
      // 204: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 207: athrow
      // 208: ifne 27b
      // 20b: goto 212
      // 20e: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 211: athrow
      // 212: aload 18
      // 214: sipush 9758
      // 217: sipush 23933
      // 21a: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 21d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 220: iload 2
      // 221: ifne 28b
      // 224: goto 22b
      // 227: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22a: athrow
      // 22b: ifne 27b
      // 22e: goto 235
      // 231: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 234: athrow
      // 235: aload 18
      // 237: sipush 9748
      // 23a: sipush -13130
      // 23d: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 240: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 243: iload 2
      // 244: ifne 28b
      // 247: goto 24e
      // 24a: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24d: athrow
      // 24e: ifne 27b
      // 251: goto 258
      // 254: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 257: athrow
      // 258: aload 18
      // 25a: sipush 9762
      // 25d: sipush -8135
      // 260: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 263: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 266: iload 2
      // 267: ifne 2a0
      // 26a: goto 271
      // 26d: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 270: athrow
      // 271: ifeq 290
      // 274: goto 27b
      // 277: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27a: athrow
      // 27b: aload 14
      // 27d: aload 18
      // 27f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 284: goto 28b
      // 287: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28a: athrow
      // 28b: pop
      // 28c: iload 2
      // 28d: ifeq 2a1
      // 290: aload 15
      // 292: aload 18
      // 294: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 299: goto 2a0
      // 29c: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29f: athrow
      // 2a0: pop
      // 2a1: iload 2
      // 2a2: ifeq 16c
      // 2a5: aload 6
      // 2a7: iload 2
      // 2a8: ifne 2ea
      // 2ab: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2ae: ldc2_w 330094358428833085
      // 2b1: astore 41
      // 2b3: ldc2_w 330094358428833085
      // 2b6: aload 41
      // 2b8: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2bb: checkcast java/lang/Boolean
      // 2be: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2c1: goto 2c8
      // 2c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2c7: athrow
      // 2c8: goto 2cf
      // 2cb: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ce: athrow
      // 2cf: ifne 2e3
      // 2d2: aload 6
      // 2d4: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 2d7: astore 17
      // 2d9: aload 5
      // 2db: aload 17
      // 2dd: invokeinterface com/finalshell/core/AB_2.M ([B)Z 2
      // 2e2: pop
      // 2e3: aload 5
      // 2e5: invokeinterface com/finalshell/core/AB_2.B ()Ljava/lang/String; 1
      // 2ea: astore 17
      // 2ec: aconst_null
      // 2ed: astore 18
      // 2ef: aload 17
      // 2f1: sipush 9778
      // 2f4: sipush -27688
      // 2f7: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 2fa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2fd: iload 2
      // 2fe: ifne 32d
      // 301: ifeq 319
      // 304: goto 30b
      // 307: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30a: athrow
      // 30b: new java/util/ArrayList
      // 30e: dup
      // 30f: aload 14
      // 311: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 314: astore 18
      // 316: goto 34b
      // 319: aload 15
      // 31b: iload 2
      // 31c: ifne 33f
      // 31f: aload 17
      // 321: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 326: goto 32d
      // 329: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32c: athrow
      // 32d: ifeq 34b
      // 330: new java/util/ArrayList
      // 333: dup
      // 334: bipush 1
      // 335: invokespecial java/util/ArrayList.<init> (I)V
      // 338: goto 33f
      // 33b: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33e: athrow
      // 33f: astore 18
      // 341: aload 18
      // 343: aload 17
      // 345: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 34a: pop
      // 34b: aload 18
      // 34d: iload 2
      // 34e: ifne 35d
      // 351: ifnull 370
      // 354: goto 35b
      // 357: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35a: athrow
      // 35b: aload 18
      // 35d: invokeinterface java/util/List.isEmpty ()Z 1
      // 362: iload 2
      // 363: ifne 3ce
      // 366: ifeq 3c7
      // 369: goto 370
      // 36c: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36f: athrow
      // 370: aload 1
      // 371: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 374: bipush 0
      // 375: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 37a: iload 2
      // 37b: ifne 3c6
      // 37e: goto 385
      // 381: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 384: athrow
      // 385: ifeq 3c5
      // 388: goto 38f
      // 38b: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38e: athrow
      // 38f: aload 1
      // 390: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 393: bipush 0
      // 394: new java/lang/StringBuilder
      // 397: dup
      // 398: invokespecial java/lang/StringBuilder.<init> ()V
      // 39b: aload 17
      // 39d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a0: sipush 9755
      // 3a3: sipush 12360
      // 3a6: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 3a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ac: aload 5
      // 3ae: invokeinterface com/finalshell/core/AB_2.b ()Ljava/lang/String; 1
      // 3b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3b9: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 3be: goto 3c5
      // 3c1: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c4: athrow
      // 3c5: bipush 0
      // 3c6: ireturn
      // 3c7: aload 18
      // 3c9: invokeinterface java/util/List.isEmpty ()Z 1
      // 3ce: ifne bc2
      // 3d1: aload 1
      // 3d2: getfield com/finalshell/crypto/ConnectHost.X I
      // 3d5: iload 2
      // 3d6: ifne bc3
      // 3d9: goto 3e0
      // 3dc: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3df: athrow
      // 3e0: iload 2
      // 3e1: ifne bc3
      // 3e4: goto 3eb
      // 3e7: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ea: athrow
      // 3eb: aload 1
      // 3ec: getfield com/finalshell/crypto/ConnectHost.iI I
      // 3ef: goto 3f6
      // 3f2: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f5: athrow
      // 3f6: if_icmpge bc2
      // 3f9: aconst_null
      // 3fa: astore 19
      // 3fc: aload 8
      // 3fe: ifnull 704
      // 401: iload 10
      // 403: iload 2
      // 404: ifne 421
      // 407: goto 40e
      // 40a: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40d: athrow
      // 40e: ifeq 704
      // 411: goto 418
      // 414: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 417: athrow
      // 418: sipush 17404
      // 41b: ldc2_w 2503785882161927625
      // 41e: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 421: istore 9
      // 423: aload 18
      // 425: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 42a: astore 20
      // 42c: aload 20
      // 42e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 433: ifeq 6e5
      // 436: aload 20
      // 438: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 43d: checkcast java/lang/String
      // 440: astore 21
      // 442: aload 20
      // 444: invokeinterface java/util/Iterator.remove ()V 1
      // 449: iload 2
      // 44a: ifne 533
      // 44d: aload 13
      // 44f: aload 21
      // 451: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 456: iload 2
      // 457: ifne 3ce
      // 45a: goto 461
      // 45d: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 460: athrow
      // 461: ifeq 4d0
      // 464: aload 5
      // 466: instanceof com/finalshell/core/Y7_2
      // 469: iload 2
      // 46a: ifne 49a
      // 46d: goto 474
      // 470: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 473: athrow
      // 474: ifne 4d0
      // 477: goto 47e
      // 47a: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47d: athrow
      // 47e: aload 1
      // 47f: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 482: bipush 0
      // 483: iload 2
      // 484: ifne 4a2
      // 487: goto 48e
      // 48a: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48d: athrow
      // 48e: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 493: goto 49a
      // 496: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 499: athrow
      // 49a: ifeq 42c
      // 49d: aload 1
      // 49e: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 4a1: bipush 0
      // 4a2: new java/lang/StringBuilder
      // 4a5: dup
      // 4a6: invokespecial java/lang/StringBuilder.<init> ()V
      // 4a9: aload 21
      // 4ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4ae: sipush 9757
      // 4b1: sipush -24110
      // 4b4: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 4b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4ba: aload 5
      // 4bc: invokeinterface com/finalshell/core/AB_2.b ()Ljava/lang/String; 1
      // 4c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4c7: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 4cc: iload 2
      // 4cd: ifeq 42c
      // 4d0: aload 0
      // 4d1: getfield com/finalshell/crypto/Login.g Lcom/finalshell/core/YU;
      // 4d4: invokevirtual com/finalshell/core/YU.M ()V
      // 4d7: aload 0
      // 4d8: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 4db: sipush 24329
      // 4de: ldc2_w 280703387528743231
      // 4e1: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 4e4: invokevirtual com/finalshell/core/UJ.V (B)V
      // 4e7: aload 0
      // 4e8: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 4eb: aload 7
      // 4ed: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 4f0: aload 0
      // 4f1: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 4f4: sipush 9788
      // 4f7: sipush -4199
      // 4fa: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 4fd: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 500: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 503: aload 0
      // 504: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 507: sipush 9781
      // 50a: sipush 22181
      // 50d: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 510: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 513: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 516: aload 0
      // 517: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 51a: bipush 0
      // 51b: invokevirtual com/finalshell/core/UJ.V (B)V
      // 51e: aload 0
      // 51f: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 522: aload 21
      // 524: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 527: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 52a: aload 0
      // 52b: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 52e: aload 8
      // 530: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 533: aload 1
      // 534: aload 0
      // 535: getfield com/finalshell/crypto/Login.g Lcom/finalshell/core/YU;
      // 538: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 53b: aload 0
      // 53c: aload 1
      // 53d: aload 0
      // 53e: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 541: invokevirtual com/finalshell/crypto/ConnectHost.V (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/UJ;
      // 544: putfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 547: aload 0
      // 548: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 54b: invokevirtual com/finalshell/core/UJ.A ()B
      // 54e: sipush 4235
      // 551: ldc2_w 1876528903354025650
      // 554: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 557: iand
      // 558: istore 9
      // 55a: iload 9
      // 55c: sipush 27316
      // 55f: ldc2_w 4985840297517644933
      // 562: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 565: if_icmpne 5ce
      // 568: aload 1
      // 569: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 56c: bipush 0
      // 56d: iload 2
      // 56e: ifne 597
      // 571: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 576: iload 2
      // 577: ifne 5d0
      // 57a: goto 581
      // 57d: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 580: athrow
      // 581: ifeq 5b7
      // 584: goto 58b
      // 587: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58a: athrow
      // 58b: aload 1
      // 58c: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 58f: bipush 0
      // 590: goto 597
      // 593: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 596: athrow
      // 597: new java/lang/StringBuilder
      // 59a: dup
      // 59b: invokespecial java/lang/StringBuilder.<init> ()V
      // 59e: aload 21
      // 5a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5a3: sipush 9791
      // 5a6: sipush -25676
      // 5a9: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 5ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5af: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5b2: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 5b7: new java/util/ArrayList
      // 5ba: dup
      // 5bb: bipush 1
      // 5bc: invokespecial java/util/ArrayList.<init> (I)V
      // 5bf: astore 19
      // 5c1: aload 19
      // 5c3: aload 21
      // 5c5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5ca: pop
      // 5cb: goto 6e5
      // 5ce: iload 9
      // 5d0: sipush 7094
      // 5d3: ldc2_w 8637939309676924298
      // 5d6: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 5d9: iload 2
      // 5da: ifne 645
      // 5dd: if_icmpne 62f
      // 5e0: goto 5e7
      // 5e3: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e6: athrow
      // 5e7: aload 1
      // 5e8: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 5eb: bipush 0
      // 5ec: iload 2
      // 5ed: ifne 60b
      // 5f0: goto 5f7
      // 5f3: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f6: athrow
      // 5f7: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 5fc: ifeq 42c
      // 5ff: goto 606
      // 602: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 605: athrow
      // 606: aload 1
      // 607: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 60a: bipush 0
      // 60b: new java/lang/StringBuilder
      // 60e: dup
      // 60f: invokespecial java/lang/StringBuilder.<init> ()V
      // 612: aload 21
      // 614: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 617: sipush 9753
      // 61a: sipush 8440
      // 61d: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 620: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 623: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 626: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 62b: iload 2
      // 62c: ifeq 42c
      // 62f: iload 9
      // 631: iload 2
      // 632: ifne 6af
      // 635: sipush 30301
      // 638: ldc2_w 286519935367733359
      // 63b: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 63e: goto 645
      // 641: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 644: athrow
      // 645: if_icmpne 69a
      // 648: aload 0
      // 649: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 64c: invokevirtual com/finalshell/core/UJ.d ()I
      // 64f: pop
      // 650: aload 0
      // 651: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 654: invokevirtual com/finalshell/core/UJ.r ()I
      // 657: pop
      // 658: aload 0
      // 659: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 65c: invokevirtual com/finalshell/core/UJ.r ()I
      // 65f: pop
      // 660: aload 0
      // 661: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 664: invokevirtual com/finalshell/core/UJ.S ()[B
      // 667: astore 22
      // 669: aload 0
      // 66a: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 66d: invokevirtual com/finalshell/core/UJ.S ()[B
      // 670: astore 23
      // 672: aload 22
      // 674: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 677: astore 24
      // 679: aload 0
      // 67a: getfield com/finalshell/crypto/Login.J Lcom/finalshell/core/Gq2;
      // 67d: iload 2
      // 67e: ifne 68f
      // 681: ifnull 53b
      // 684: goto 68b
      // 687: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68a: athrow
      // 68b: aload 0
      // 68c: getfield com/finalshell/crypto/Login.J Lcom/finalshell/core/Gq2;
      // 68f: aload 24
      // 691: invokeinterface com/finalshell/core/Gq2.q (Ljava/lang/String;)V 2
      // 696: iload 2
      // 697: ifeq 53b
      // 69a: aload 1
      // 69b: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 69e: bipush 0
      // 69f: iload 2
      // 6a0: ifne 6b7
      // 6a3: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 6a8: goto 6af
      // 6ab: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6ae: athrow
      // 6af: ifeq 42c
      // 6b2: aload 1
      // 6b3: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 6b6: bipush 0
      // 6b7: new java/lang/StringBuilder
      // 6ba: dup
      // 6bb: invokespecial java/lang/StringBuilder.<init> ()V
      // 6be: aload 21
      // 6c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6c3: sipush 9767
      // 6c6: sipush 29045
      // 6c9: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 6cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6cf: iload 9
      // 6d1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6d4: ldc_w ")"
      // 6d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6da: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6dd: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 6e2: goto 42c
      // 6e5: iload 9
      // 6e7: iload 2
      // 6e8: ifne 70b
      // 6eb: sipush 22789
      // 6ee: ldc2_w 7309832622302318398
      // 6f1: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 6f4: if_icmpeq 704
      // 6f7: goto 6fe
      // 6fa: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6fd: athrow
      // 6fe: bipush 0
      // 6ff: ireturn
      // 700: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 703: athrow
      // 704: aload 5
      // 706: invokeinterface com/finalshell/core/AB_2.f ()Z 1
      // 70b: iload 2
      // 70c: ifne 71a
      // 70f: ifeq 71b
      // 712: goto 719
      // 715: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 718: athrow
      // 719: bipush 0
      // 71a: ireturn
      // 71b: aload 8
      // 71d: iload 2
      // 71e: ifne 736
      // 721: ifnonnull 734
      // 724: goto 72b
      // 727: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72a: athrow
      // 72b: aload 5
      // 72d: invokeinterface com/finalshell/core/AB_2.u ()[B 1
      // 732: astore 8
      // 734: aload 8
      // 736: ifnonnull 73f
      // 739: bipush 0
      // 73a: ireturn
      // 73b: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73e: athrow
      // 73f: aload 19
      // 741: iload 2
      // 742: ifne 755
      // 745: ifnonnull 753
      // 748: goto 74f
      // 74b: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74e: athrow
      // 74f: aload 18
      // 751: astore 19
      // 753: aload 19
      // 755: iload 2
      // 756: ifne 770
      // 759: invokeinterface java/util/List.isEmpty ()Z 1
      // 75e: ifeq 76e
      // 761: goto 768
      // 764: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 767: athrow
      // 768: bipush 0
      // 769: ireturn
      // 76a: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76d: athrow
      // 76e: aload 19
      // 770: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 775: astore 20
      // 777: aload 20
      // 779: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 77e: ifeq bbe
      // 781: aload 1
      // 782: iload 2
      // 783: ifne 7a9
      // 786: getfield com/finalshell/crypto/ConnectHost.X I
      // 789: aload 1
      // 78a: getfield com/finalshell/crypto/ConnectHost.iI I
      // 78d: iload 2
      // 78e: ifne 3f6
      // 791: goto 798
      // 794: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 797: athrow
      // 798: if_icmpge bbe
      // 79b: aload 20
      // 79d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 7a2: goto 7a9
      // 7a5: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a8: athrow
      // 7a9: checkcast java/lang/String
      // 7ac: astore 21
      // 7ae: aload 20
      // 7b0: invokeinterface java/util/Iterator.remove ()V 1
      // 7b5: iload 2
      // 7b6: ifne 89b
      // 7b9: aload 13
      // 7bb: aload 21
      // 7bd: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 7c2: ifeq 838
      // 7c5: goto 7cc
      // 7c8: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7cb: athrow
      // 7cc: aload 5
      // 7ce: instanceof com/finalshell/core/Y7_2
      // 7d1: iload 2
      // 7d2: ifne 802
      // 7d5: goto 7dc
      // 7d8: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7db: athrow
      // 7dc: ifne 838
      // 7df: goto 7e6
      // 7e2: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e5: athrow
      // 7e6: aload 1
      // 7e7: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 7ea: bipush 0
      // 7eb: iload 2
      // 7ec: ifne 80a
      // 7ef: goto 7f6
      // 7f2: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f5: athrow
      // 7f6: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 7fb: goto 802
      // 7fe: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 801: athrow
      // 802: ifeq 777
      // 805: aload 1
      // 806: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 809: bipush 0
      // 80a: new java/lang/StringBuilder
      // 80d: dup
      // 80e: invokespecial java/lang/StringBuilder.<init> ()V
      // 811: aload 21
      // 813: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 816: sipush 9751
      // 819: sipush -25943
      // 81c: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 81f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 822: aload 5
      // 824: invokeinterface com/finalshell/core/AB_2.b ()Ljava/lang/String; 1
      // 829: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 82c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 82f: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 834: iload 2
      // 835: ifeq 777
      // 838: aload 0
      // 839: getfield com/finalshell/crypto/Login.g Lcom/finalshell/core/YU;
      // 83c: invokevirtual com/finalshell/core/YU.M ()V
      // 83f: aload 0
      // 840: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 843: sipush 3982
      // 846: ldc2_w 924661294955108793
      // 849: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 84c: invokevirtual com/finalshell/core/UJ.V (B)V
      // 84f: aload 0
      // 850: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 853: aload 7
      // 855: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 858: aload 0
      // 859: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 85c: sipush 9765
      // 85f: sipush -17379
      // 862: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 865: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 868: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 86b: aload 0
      // 86c: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 86f: sipush 9781
      // 872: sipush 22181
      // 875: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 878: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 87b: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 87e: aload 0
      // 87f: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 882: bipush 1
      // 883: invokevirtual com/finalshell/core/UJ.V (B)V
      // 886: aload 0
      // 887: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 88a: aload 21
      // 88c: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 88f: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 892: aload 0
      // 893: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 896: aload 8
      // 898: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 89b: aload 1
      // 89c: invokevirtual com/finalshell/crypto/ConnectHost.I ()[B
      // 89f: astore 22
      // 8a1: aload 22
      // 8a3: arraylength
      // 8a4: istore 23
      // 8a6: bipush 4
      // 8a7: iload 23
      // 8a9: iadd
      // 8aa: aload 0
      // 8ab: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 8ae: getfield com/finalshell/core/UJ.X I
      // 8b1: iadd
      // 8b2: bipush 5
      // 8b3: isub
      // 8b4: newarray 8
      // 8b6: astore 24
      // 8b8: aload 24
      // 8ba: bipush 0
      // 8bb: iload 23
      // 8bd: sipush 28680
      // 8c0: ldc2_w 1012444715525727800
      // 8c3: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 8c6: iushr
      // 8c7: i2b
      // 8c8: bastore
      // 8c9: aload 24
      // 8cb: bipush 1
      // 8cc: iload 23
      // 8ce: sipush 18787
      // 8d1: ldc2_w 1439562841781919568
      // 8d4: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 8d7: iushr
      // 8d8: i2b
      // 8d9: bastore
      // 8da: aload 24
      // 8dc: bipush 2
      // 8dd: iload 23
      // 8df: sipush 12389
      // 8e2: ldc2_w 2509056206643177055
      // 8e5: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 8e8: iushr
      // 8e9: i2b
      // 8ea: bastore
      // 8eb: aload 24
      // 8ed: bipush 3
      // 8ee: iload 23
      // 8f0: i2b
      // 8f1: bastore
      // 8f2: aload 22
      // 8f4: bipush 0
      // 8f5: aload 24
      // 8f7: bipush 4
      // 8f8: iload 23
      // 8fa: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 8fd: aload 0
      // 8fe: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 901: getfield com/finalshell/core/UJ.g [B
      // 904: bipush 5
      // 905: aload 24
      // 907: bipush 4
      // 908: iload 23
      // 90a: iadd
      // 90b: aload 0
      // 90c: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 90f: getfield com/finalshell/core/UJ.X I
      // 912: bipush 5
      // 913: isub
      // 914: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 917: aload 5
      // 919: aload 24
      // 91b: aload 21
      // 91d: invokeinterface com/finalshell/core/AB_2.l ([BLjava/lang/String;)[B 3
      // 922: astore 25
      // 924: iload 2
      // 925: ifne 985
      // 928: aload 25
      // 92a: ifnonnull 97c
      // 92d: goto 934
      // 930: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 933: athrow
      // 934: aload 1
      // 935: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 938: bipush 0
      // 939: iload 2
      // 93a: ifne 958
      // 93d: goto 944
      // 940: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 943: athrow
      // 944: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 949: ifeq 777
      // 94c: goto 953
      // 94f: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 952: athrow
      // 953: aload 1
      // 954: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 957: bipush 0
      // 958: new java/lang/StringBuilder
      // 95b: dup
      // 95c: invokespecial java/lang/StringBuilder.<init> ()V
      // 95f: aload 21
      // 961: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 964: sipush 9764
      // 967: sipush 7809
      // 96a: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 96d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 970: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 973: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 978: iload 2
      // 979: ifeq 777
      // 97c: aload 0
      // 97d: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 980: aload 25
      // 982: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 985: aload 1
      // 986: aload 0
      // 987: getfield com/finalshell/crypto/Login.g Lcom/finalshell/core/YU;
      // 98a: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 98d: aload 0
      // 98e: aload 1
      // 98f: aload 0
      // 990: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 993: invokevirtual com/finalshell/crypto/ConnectHost.V (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/UJ;
      // 996: putfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 999: aload 0
      // 99a: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 99d: invokevirtual com/finalshell/core/UJ.A ()B
      // 9a0: sipush 29210
      // 9a3: ldc2_w 1600741342496252962
      // 9a6: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 9a9: iand
      // 9aa: istore 9
      // 9ac: iload 9
      // 9ae: sipush 30866
      // 9b1: ldc2_w 1818730666808569521
      // 9b4: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 9b7: if_icmpne a0b
      // 9ba: aload 1
      // 9bb: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 9be: bipush 0
      // 9bf: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 9c4: iload 2
      // 9c5: ifne a0d
      // 9c8: iload 2
      // 9c9: ifne a0a
      // 9cc: goto 9d3
      // 9cf: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d2: athrow
      // 9d3: ifeq a09
      // 9d6: goto 9dd
      // 9d9: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9dc: athrow
      // 9dd: aload 1
      // 9de: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 9e1: bipush 0
      // 9e2: new java/lang/StringBuilder
      // 9e5: dup
      // 9e6: invokespecial java/lang/StringBuilder.<init> ()V
      // 9e9: aload 21
      // 9eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9ee: sipush 9790
      // 9f1: sipush 4667
      // 9f4: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 9f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9fa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9fd: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // a02: goto a09
      // a05: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a08: athrow
      // a09: bipush 1
      // a0a: ireturn
      // a0b: iload 9
      // a0d: sipush 9086
      // a10: ldc2_w 1726842834803733852
      // a13: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // a16: iload 2
      // a17: ifne a8c
      // a1a: if_icmpne a76
      // a1d: goto a24
      // a20: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a23: athrow
      // a24: aload 0
      // a25: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // a28: invokevirtual com/finalshell/core/UJ.d ()I
      // a2b: pop
      // a2c: aload 0
      // a2d: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // a30: invokevirtual com/finalshell/core/UJ.r ()I
      // a33: pop
      // a34: aload 0
      // a35: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // a38: invokevirtual com/finalshell/core/UJ.r ()I
      // a3b: pop
      // a3c: aload 0
      // a3d: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // a40: invokevirtual com/finalshell/core/UJ.S ()[B
      // a43: astore 26
      // a45: aload 0
      // a46: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // a49: invokevirtual com/finalshell/core/UJ.S ()[B
      // a4c: astore 27
      // a4e: aload 26
      // a50: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // a53: astore 28
      // a55: aload 0
      // a56: getfield com/finalshell/crypto/Login.J Lcom/finalshell/core/Gq2;
      // a59: iload 2
      // a5a: ifne a6b
      // a5d: ifnull 98d
      // a60: goto a67
      // a63: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a66: athrow
      // a67: aload 0
      // a68: getfield com/finalshell/crypto/Login.J Lcom/finalshell/core/Gq2;
      // a6b: aload 28
      // a6d: invokeinterface com/finalshell/core/Gq2.q (Ljava/lang/String;)V 2
      // a72: iload 2
      // a73: ifeq 98d
      // a76: iload 9
      // a78: iload 2
      // a79: ifne b7d
      // a7c: sipush 7094
      // a7f: ldc2_w 8637939309676924298
      // a82: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // a85: goto a8c
      // a88: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a8b: athrow
      // a8c: if_icmpne b68
      // a8f: aload 0
      // a90: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // a93: invokevirtual com/finalshell/core/UJ.d ()I
      // a96: pop
      // a97: aload 0
      // a98: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // a9b: invokevirtual com/finalshell/core/UJ.r ()I
      // a9e: pop
      // a9f: aload 0
      // aa0: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // aa3: invokevirtual com/finalshell/core/UJ.r ()I
      // aa6: pop
      // aa7: aload 0
      // aa8: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // aab: invokevirtual com/finalshell/core/UJ.S ()[B
      // aae: astore 26
      // ab0: aload 0
      // ab1: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // ab4: invokevirtual com/finalshell/core/UJ.r ()I
      // ab7: istore 27
      // ab9: iload 27
      // abb: iload 2
      // abc: ifne aee
      // abf: ifeq ada
      // ac2: goto ac9
      // ac5: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac8: athrow
      // ac9: new com/finalshell/core/PD
      // acc: dup
      // acd: aload 26
      // acf: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // ad2: invokespecial com/finalshell/core/PD.<init> (Ljava/lang/String;)V
      // ad5: athrow
      // ad6: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ad9: athrow
      // ada: aload 1
      // adb: dup
      // adc: getfield com/finalshell/crypto/ConnectHost.X I
      // adf: bipush 1
      // ae0: iadd
      // ae1: putfield com/finalshell/crypto/ConnectHost.X I
      // ae4: aload 1
      // ae5: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // ae8: bipush 0
      // ae9: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // aee: iload 2
      // aef: ifne b2c
      // af2: ifeq b28
      // af5: goto afc
      // af8: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // afb: athrow
      // afc: aload 1
      // afd: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // b00: bipush 0
      // b01: new java/lang/StringBuilder
      // b04: dup
      // b05: invokespecial java/lang/StringBuilder.<init> ()V
      // b08: aload 21
      // b0a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b0d: sipush 9774
      // b10: sipush 8306
      // b13: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // b16: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b19: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b1c: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // b21: goto b28
      // b24: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b27: athrow
      // b28: aload 1
      // b29: getfield com/finalshell/crypto/ConnectHost.X I
      // b2c: iload 2
      // b2d: ifne b46
      // b30: aload 1
      // b31: getfield com/finalshell/crypto/ConnectHost.iI I
      // b34: if_icmplt b44
      // b37: goto b3e
      // b3a: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b3d: athrow
      // b3e: bipush 0
      // b3f: ireturn
      // b40: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b43: athrow
      // b44: iload 11
      // b46: iload 2
      // b47: ifne b67
      // b4a: ifeq b5f
      // b4d: goto b54
      // b50: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b53: athrow
      // b54: iload 2
      // b55: ifeq bba
      // b58: goto b5f
      // b5b: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b5e: athrow
      // b5f: bipush 0
      // b60: goto b67
      // b63: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b66: athrow
      // b67: ireturn
      // b68: aload 1
      // b69: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // b6c: bipush 0
      // b6d: iload 2
      // b6e: ifne b8c
      // b71: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // b76: goto b7d
      // b79: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b7c: athrow
      // b7d: ifeq bba
      // b80: aload 1
      // b81: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // b84: bipush 0
      // b85: goto b8c
      // b88: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b8b: athrow
      // b8c: new java/lang/StringBuilder
      // b8f: dup
      // b90: invokespecial java/lang/StringBuilder.<init> ()V
      // b93: aload 21
      // b95: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b98: sipush 9763
      // b9b: sipush 6302
      // b9e: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // ba1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ba4: iload 9
      // ba6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // ba9: ldc_w ")"
      // bac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // baf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // bb2: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // bb7: goto bba
      // bba: iload 2
      // bbb: ifeq 777
      // bbe: iload 2
      // bbf: ifeq 3c7
      // bc2: bipush 0
      // bc3: ireturn
   }

   @Override
   public boolean D(ConnectHost param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokespecial com/finalshell/core/IM.D (Lcom/finalshell/crypto/ConnectHost;)Z
      // 05: pop
      // 06: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 09: bipush 0
      // 0a: istore 3
      // 0b: bipush 0
      // 0c: istore 4
      // 0e: istore 2
      // 0f: bipush 1
      // 10: istore 5
      // 12: iload 4
      // 14: ifne 2f
      // 17: aload 0
      // 18: aload 1
      // 19: invokevirtual com/finalshell/crypto/Login.a (Lcom/finalshell/crypto/ConnectHost;)Z
      // 1c: istore 5
      // 1e: iload 2
      // 1f: ifeq 49
      // 22: goto 4c
      // 25: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: astore 6
      // 2b: iload 2
      // 2c: ifne 4c
      // 2f: iload 3
      // 30: iload 2
      // 31: ifeq 46
      // 34: goto 3b
      // 37: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: ifne 49
      // 3e: goto 45
      // 41: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: bipush 1
      // 46: goto 4a
      // 49: bipush 0
      // 4a: istore 5
      // 4c: iload 5
      // 4e: iload 2
      // 4f: ifeq 7a
      // 52: ifeq 68
      // 55: goto 5c
      // 58: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: aload 0
      // 5d: aload 1
      // 5e: invokevirtual com/finalshell/crypto/Login.L (Lcom/finalshell/crypto/ConnectHost;)V
      // 61: goto 68
      // 64: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: aload 0
      // 69: aload 1
      // 6a: invokevirtual com/finalshell/crypto/Login.p (Lcom/finalshell/crypto/ConnectHost;)Z
      // 6d: istore 3
      // 6e: iload 2
      // 6f: ifeq 86
      // 72: iload 3
      // 73: goto 7a
      // 76: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 79: athrow
      // 7a: ifeq 83
      // 7d: bipush 1
      // 7e: ireturn
      // 7f: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82: athrow
      // 83: iinc 4 1
      // 86: goto 0f
   }

   public boolean h(ConnectHost param1, List param2, List param3, List param4) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: istore 5
      // 005: aload 1
      // 006: getfield com/finalshell/crypto/ConnectHost.X I
      // 009: iload 5
      // 00b: ifeq 03a
      // 00e: aload 1
      // 00f: getfield com/finalshell/crypto/ConnectHost.iI I
      // 012: if_icmplt 022
      // 015: goto 01c
      // 018: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: bipush 0
      // 01d: ireturn
      // 01e: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: aload 1
      // 023: sipush 9779
      // 026: sipush 7137
      // 029: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 02c: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 02f: sipush 9772
      // 032: bipush 82
      // 034: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 037: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 03a: istore 6
      // 03c: aload 1
      // 03d: sipush 9783
      // 040: sipush 22768
      // 043: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 046: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 049: sipush 9772
      // 04c: bipush 82
      // 04e: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 051: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 054: istore 7
      // 056: new java/util/ArrayList
      // 059: dup
      // 05a: invokespecial java/util/ArrayList.<init> ()V
      // 05d: astore 8
      // 05f: new java/util/ArrayList
      // 062: dup
      // 063: invokespecial java/util/ArrayList.<init> ()V
      // 066: astore 9
      // 068: aload 3
      // 069: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 06e: astore 10
      // 070: aload 10
      // 072: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 077: ifeq 1b3
      // 07a: aload 10
      // 07c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 081: checkcast java/lang/String
      // 084: astore 11
      // 086: aload 11
      // 088: iload 5
      // 08a: ifeq 1b7
      // 08d: sipush 9778
      // 090: sipush -27688
      // 093: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 096: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 099: iload 5
      // 09b: ifeq 197
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: ifne 187
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: aload 11
      // 0b1: sipush 9770
      // 0b4: sipush -19483
      // 0b7: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 0ba: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bd: iload 5
      // 0bf: ifeq 197
      // 0c2: goto 0c9
      // 0c5: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c8: athrow
      // 0c9: ifne 187
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: aload 11
      // 0d5: sipush 9760
      // 0d8: sipush 19264
      // 0db: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 0de: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e1: iload 5
      // 0e3: ifeq 197
      // 0e6: goto 0ed
      // 0e9: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec: athrow
      // 0ed: ifne 187
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: aload 11
      // 0f9: sipush 9768
      // 0fc: sipush -32650
      // 0ff: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 102: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 105: iload 5
      // 107: ifeq 197
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: ifne 187
      // 114: goto 11b
      // 117: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a: athrow
      // 11b: aload 11
      // 11d: sipush 9744
      // 120: sipush 14425
      // 123: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 126: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 129: iload 5
      // 12b: ifeq 197
      // 12e: goto 135
      // 131: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: ifne 187
      // 138: goto 13f
      // 13b: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13e: athrow
      // 13f: aload 11
      // 141: sipush 9773
      // 144: sipush -27764
      // 147: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 14a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 14d: iload 5
      // 14f: ifeq 197
      // 152: goto 159
      // 155: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158: athrow
      // 159: ifne 187
      // 15c: goto 163
      // 15f: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: aload 11
      // 165: sipush 9780
      // 168: sipush -20863
      // 16b: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 16e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 171: iload 5
      // 173: ifeq 1ad
      // 176: goto 17d
      // 179: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17c: athrow
      // 17d: ifeq 19d
      // 180: goto 187
      // 183: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 186: athrow
      // 187: aload 8
      // 189: aload 11
      // 18b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 190: goto 197
      // 193: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 196: athrow
      // 197: pop
      // 198: iload 5
      // 19a: ifne 1ae
      // 19d: aload 9
      // 19f: aload 11
      // 1a1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1a6: goto 1ad
      // 1a9: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ac: athrow
      // 1ad: pop
      // 1ae: iload 5
      // 1b0: ifne 070
      // 1b3: aload 0
      // 1b4: getfield com/finalshell/crypto/Login.a Ljava/lang/String;
      // 1b7: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 1ba: astore 10
      // 1bc: aload 2
      // 1bd: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1c2: astore 12
      // 1c4: aload 12
      // 1c6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1cb: ifeq b11
      // 1ce: aload 12
      // 1d0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d5: checkcast com/finalshell/core/AB_2
      // 1d8: astore 13
      // 1da: iload 5
      // 1dc: ifeq 206
      // 1df: aload 1
      // 1e0: getfield com/finalshell/crypto/ConnectHost.X I
      // 1e3: iload 5
      // 1e5: ifeq b12
      // 1e8: goto 1ef
      // 1eb: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: aload 1
      // 1f0: getfield com/finalshell/crypto/ConnectHost.iI I
      // 1f3: goto 1fa
      // 1f6: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f9: athrow
      // 1fa: if_icmplt 1ff
      // 1fd: bipush 0
      // 1fe: ireturn
      // 1ff: aload 0
      // 200: aload 1
      // 201: aload 13
      // 203: invokespecial com/finalshell/crypto/Login.F (Lcom/finalshell/crypto/ConnectHost;Lcom/finalshell/core/AB_2;)V
      // 206: aload 13
      // 208: invokeinterface com/finalshell/core/AB_2.B ()Ljava/lang/String; 1
      // 20d: astore 14
      // 20f: aconst_null
      // 210: astore 15
      // 212: aload 14
      // 214: sipush 9778
      // 217: sipush -27688
      // 21a: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 21d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 220: iload 5
      // 222: ifeq 252
      // 225: ifeq 23d
      // 228: goto 22f
      // 22b: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22e: athrow
      // 22f: new java/util/ArrayList
      // 232: dup
      // 233: aload 8
      // 235: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 238: astore 15
      // 23a: goto 270
      // 23d: aload 9
      // 23f: iload 5
      // 241: ifeq 264
      // 244: aload 14
      // 246: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 24b: goto 252
      // 24e: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 251: athrow
      // 252: ifeq 270
      // 255: new java/util/ArrayList
      // 258: dup
      // 259: bipush 1
      // 25a: invokespecial java/util/ArrayList.<init> (I)V
      // 25d: goto 264
      // 260: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 263: athrow
      // 264: astore 15
      // 266: aload 15
      // 268: aload 14
      // 26a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 26f: pop
      // 270: aload 15
      // 272: iload 5
      // 274: ifeq 283
      // 277: ifnull 297
      // 27a: goto 281
      // 27d: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 280: athrow
      // 281: aload 15
      // 283: invokeinterface java/util/List.isEmpty ()Z 1
      // 288: iload 5
      // 28a: ifeq 2f6
      // 28d: ifeq 2ef
      // 290: goto 297
      // 293: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 296: athrow
      // 297: aload 1
      // 298: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 29b: bipush 0
      // 29c: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 2a1: iload 5
      // 2a3: ifeq 2ee
      // 2a6: goto 2ad
      // 2a9: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ac: athrow
      // 2ad: ifeq 2ed
      // 2b0: goto 2b7
      // 2b3: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b6: athrow
      // 2b7: aload 1
      // 2b8: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 2bb: bipush 0
      // 2bc: new java/lang/StringBuilder
      // 2bf: dup
      // 2c0: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c3: aload 14
      // 2c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c8: sipush 9750
      // 2cb: sipush 10198
      // 2ce: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 2d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d4: aload 13
      // 2d6: invokeinterface com/finalshell/core/AB_2.b ()Ljava/lang/String; 1
      // 2db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2de: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2e1: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 2e6: goto 2ed
      // 2e9: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ec: athrow
      // 2ed: bipush 0
      // 2ee: ireturn
      // 2ef: aload 15
      // 2f1: invokeinterface java/util/List.isEmpty ()Z 1
      // 2f6: ifne b0c
      // 2f9: aload 1
      // 2fa: getfield com/finalshell/crypto/ConnectHost.X I
      // 2fd: aload 1
      // 2fe: getfield com/finalshell/crypto/ConnectHost.iI I
      // 301: iload 5
      // 303: ifeq 1fa
      // 306: goto 30d
      // 309: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30c: athrow
      // 30d: if_icmpge b0c
      // 310: aload 13
      // 312: invokeinterface com/finalshell/core/AB_2.u ()[B 1
      // 317: astore 16
      // 319: aconst_null
      // 31a: astore 17
      // 31c: aload 16
      // 31e: ifnull 633
      // 321: iload 6
      // 323: iload 5
      // 325: ifeq 342
      // 328: goto 32f
      // 32b: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32e: athrow
      // 32f: ifeq 633
      // 332: goto 339
      // 335: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 338: athrow
      // 339: sipush 7094
      // 33c: ldc2_w 8637939309676924298
      // 33f: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 342: istore 11
      // 344: aload 15
      // 346: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 34b: astore 18
      // 34d: aload 18
      // 34f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 354: ifeq 613
      // 357: aload 18
      // 359: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 35e: checkcast java/lang/String
      // 361: astore 19
      // 363: aload 18
      // 365: invokeinterface java/util/Iterator.remove ()V 1
      // 36a: iload 5
      // 36c: ifeq 459
      // 36f: aload 4
      // 371: aload 19
      // 373: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 378: iload 5
      // 37a: ifeq 2f6
      // 37d: goto 384
      // 380: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 383: athrow
      // 384: ifeq 3f6
      // 387: aload 13
      // 389: instanceof com/finalshell/core/Y7_2
      // 38c: iload 5
      // 38e: ifeq 3bf
      // 391: goto 398
      // 394: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 397: athrow
      // 398: ifne 3f6
      // 39b: goto 3a2
      // 39e: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a1: athrow
      // 3a2: aload 1
      // 3a3: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 3a6: bipush 0
      // 3a7: iload 5
      // 3a9: ifeq 3c7
      // 3ac: goto 3b3
      // 3af: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b2: athrow
      // 3b3: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 3b8: goto 3bf
      // 3bb: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3be: athrow
      // 3bf: ifeq 34d
      // 3c2: aload 1
      // 3c3: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 3c6: bipush 0
      // 3c7: new java/lang/StringBuilder
      // 3ca: dup
      // 3cb: invokespecial java/lang/StringBuilder.<init> ()V
      // 3ce: aload 19
      // 3d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d3: sipush 9751
      // 3d6: sipush -25943
      // 3d9: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 3dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3df: aload 13
      // 3e1: invokeinterface com/finalshell/core/AB_2.b ()Ljava/lang/String; 1
      // 3e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3ec: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 3f1: iload 5
      // 3f3: ifne 34d
      // 3f6: aload 0
      // 3f7: getfield com/finalshell/crypto/Login.g Lcom/finalshell/core/YU;
      // 3fa: invokevirtual com/finalshell/core/YU.M ()V
      // 3fd: aload 0
      // 3fe: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 401: sipush 3982
      // 404: ldc2_w 924661294955108793
      // 407: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 40a: invokevirtual com/finalshell/core/UJ.V (B)V
      // 40d: aload 0
      // 40e: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 411: aload 10
      // 413: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 416: aload 0
      // 417: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 41a: sipush 9765
      // 41d: sipush -17379
      // 420: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 423: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 426: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 429: aload 0
      // 42a: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 42d: sipush 9781
      // 430: sipush 22181
      // 433: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 436: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 439: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 43c: aload 0
      // 43d: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 440: bipush 0
      // 441: invokevirtual com/finalshell/core/UJ.V (B)V
      // 444: aload 0
      // 445: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 448: aload 19
      // 44a: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 44d: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 450: aload 0
      // 451: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 454: aload 16
      // 456: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 459: aload 1
      // 45a: aload 0
      // 45b: getfield com/finalshell/crypto/Login.g Lcom/finalshell/core/YU;
      // 45e: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 461: aload 0
      // 462: aload 1
      // 463: aload 0
      // 464: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 467: invokevirtual com/finalshell/crypto/ConnectHost.V (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/UJ;
      // 46a: putfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 46d: aload 0
      // 46e: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 471: invokevirtual com/finalshell/core/UJ.A ()B
      // 474: sipush 29210
      // 477: ldc2_w 1600741342496252962
      // 47a: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 47d: iand
      // 47e: istore 11
      // 480: iload 11
      // 482: sipush 22789
      // 485: ldc2_w 7309832622302318398
      // 488: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 48b: if_icmpne 4f5
      // 48e: aload 1
      // 48f: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 492: bipush 0
      // 493: iload 5
      // 495: ifeq 4bf
      // 498: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 49d: iload 5
      // 49f: ifeq 4f7
      // 4a2: goto 4a9
      // 4a5: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a8: athrow
      // 4a9: ifeq 4de
      // 4ac: goto 4b3
      // 4af: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b2: athrow
      // 4b3: aload 1
      // 4b4: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 4b7: bipush 0
      // 4b8: goto 4bf
      // 4bb: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4be: athrow
      // 4bf: new java/lang/StringBuilder
      // 4c2: dup
      // 4c3: invokespecial java/lang/StringBuilder.<init> ()V
      // 4c6: aload 19
      // 4c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4cb: sipush 9756
      // 4ce: bipush 104
      // 4d0: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 4d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4d9: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 4de: new java/util/ArrayList
      // 4e1: dup
      // 4e2: bipush 1
      // 4e3: invokespecial java/util/ArrayList.<init> (I)V
      // 4e6: astore 17
      // 4e8: aload 17
      // 4ea: aload 19
      // 4ec: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4f1: pop
      // 4f2: goto 613
      // 4f5: iload 11
      // 4f7: sipush 7094
      // 4fa: ldc2_w 8637939309676924298
      // 4fd: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 500: iload 5
      // 502: ifeq 570
      // 505: if_icmpne 559
      // 508: goto 50f
      // 50b: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50e: athrow
      // 50f: aload 1
      // 510: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 513: bipush 0
      // 514: iload 5
      // 516: ifeq 534
      // 519: goto 520
      // 51c: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51f: athrow
      // 520: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 525: ifeq 34d
      // 528: goto 52f
      // 52b: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52e: athrow
      // 52f: aload 1
      // 530: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 533: bipush 0
      // 534: new java/lang/StringBuilder
      // 537: dup
      // 538: invokespecial java/lang/StringBuilder.<init> ()V
      // 53b: aload 19
      // 53d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 540: sipush 9749
      // 543: sipush -9335
      // 546: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 549: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 54f: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 554: iload 5
      // 556: ifne 34d
      // 559: iload 11
      // 55b: iload 5
      // 55d: ifeq 5dd
      // 560: sipush 9086
      // 563: ldc2_w 1726842834803733852
      // 566: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 569: goto 570
      // 56c: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56f: athrow
      // 570: if_icmpne 5c7
      // 573: aload 0
      // 574: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 577: invokevirtual com/finalshell/core/UJ.d ()I
      // 57a: pop
      // 57b: aload 0
      // 57c: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 57f: invokevirtual com/finalshell/core/UJ.r ()I
      // 582: pop
      // 583: aload 0
      // 584: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 587: invokevirtual com/finalshell/core/UJ.r ()I
      // 58a: pop
      // 58b: aload 0
      // 58c: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 58f: invokevirtual com/finalshell/core/UJ.S ()[B
      // 592: astore 20
      // 594: aload 0
      // 595: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 598: invokevirtual com/finalshell/core/UJ.S ()[B
      // 59b: astore 21
      // 59d: aload 20
      // 59f: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 5a2: astore 22
      // 5a4: aload 0
      // 5a5: getfield com/finalshell/crypto/Login.J Lcom/finalshell/core/Gq2;
      // 5a8: iload 5
      // 5aa: ifeq 5bb
      // 5ad: ifnull 461
      // 5b0: goto 5b7
      // 5b3: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b6: athrow
      // 5b7: aload 0
      // 5b8: getfield com/finalshell/crypto/Login.J Lcom/finalshell/core/Gq2;
      // 5bb: aload 22
      // 5bd: invokeinterface com/finalshell/core/Gq2.q (Ljava/lang/String;)V 2
      // 5c2: iload 5
      // 5c4: ifne 461
      // 5c7: aload 1
      // 5c8: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 5cb: bipush 0
      // 5cc: iload 5
      // 5ce: ifeq 5e5
      // 5d1: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 5d6: goto 5dd
      // 5d9: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5dc: athrow
      // 5dd: ifeq 34d
      // 5e0: aload 1
      // 5e1: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 5e4: bipush 0
      // 5e5: new java/lang/StringBuilder
      // 5e8: dup
      // 5e9: invokespecial java/lang/StringBuilder.<init> ()V
      // 5ec: aload 19
      // 5ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5f1: sipush 9787
      // 5f4: sipush 20499
      // 5f7: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 5fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5fd: iload 11
      // 5ff: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 602: ldc_w ")"
      // 605: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 608: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 60b: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 610: goto 34d
      // 613: iload 11
      // 615: iload 5
      // 617: ifeq 63a
      // 61a: sipush 22789
      // 61d: ldc2_w 7309832622302318398
      // 620: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 623: if_icmpeq 633
      // 626: goto 62d
      // 629: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62c: athrow
      // 62d: bipush 0
      // 62e: ireturn
      // 62f: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 632: athrow
      // 633: aload 13
      // 635: invokeinterface com/finalshell/core/AB_2.f ()Z 1
      // 63a: iload 5
      // 63c: ifeq 64a
      // 63f: ifeq 64b
      // 642: goto 649
      // 645: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 648: athrow
      // 649: bipush 0
      // 64a: ireturn
      // 64b: aload 16
      // 64d: iload 5
      // 64f: ifeq 667
      // 652: ifnonnull 665
      // 655: goto 65c
      // 658: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65b: athrow
      // 65c: aload 13
      // 65e: invokeinterface com/finalshell/core/AB_2.u ()[B 1
      // 663: astore 16
      // 665: aload 16
      // 667: ifnonnull 670
      // 66a: bipush 0
      // 66b: ireturn
      // 66c: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66f: athrow
      // 670: aload 17
      // 672: iload 5
      // 674: ifeq 687
      // 677: ifnonnull 685
      // 67a: goto 681
      // 67d: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 680: athrow
      // 681: aload 15
      // 683: astore 17
      // 685: aload 17
      // 687: iload 5
      // 689: ifeq 6a3
      // 68c: invokeinterface java/util/List.isEmpty ()Z 1
      // 691: ifeq 6a1
      // 694: goto 69b
      // 697: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69a: athrow
      // 69b: bipush 0
      // 69c: ireturn
      // 69d: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a0: athrow
      // 6a1: aload 17
      // 6a3: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 6a8: astore 18
      // 6aa: aload 18
      // 6ac: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6b1: ifeq b07
      // 6b4: aload 1
      // 6b5: iload 5
      // 6b7: ifeq 6de
      // 6ba: getfield com/finalshell/crypto/ConnectHost.X I
      // 6bd: aload 1
      // 6be: getfield com/finalshell/crypto/ConnectHost.iI I
      // 6c1: iload 5
      // 6c3: ifeq 1fa
      // 6c6: goto 6cd
      // 6c9: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6cc: athrow
      // 6cd: if_icmpge b07
      // 6d0: aload 18
      // 6d2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6d7: goto 6de
      // 6da: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6dd: athrow
      // 6de: checkcast java/lang/String
      // 6e1: astore 19
      // 6e3: aload 18
      // 6e5: invokeinterface java/util/Iterator.remove ()V 1
      // 6ea: iload 5
      // 6ec: ifeq 7d4
      // 6ef: aload 4
      // 6f1: aload 19
      // 6f3: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 6f8: ifeq 771
      // 6fb: goto 702
      // 6fe: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 701: athrow
      // 702: aload 13
      // 704: instanceof com/finalshell/core/Y7_2
      // 707: iload 5
      // 709: ifeq 73a
      // 70c: goto 713
      // 70f: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 712: athrow
      // 713: ifne 771
      // 716: goto 71d
      // 719: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71c: athrow
      // 71d: aload 1
      // 71e: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 721: bipush 0
      // 722: iload 5
      // 724: ifeq 742
      // 727: goto 72e
      // 72a: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72d: athrow
      // 72e: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 733: goto 73a
      // 736: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 739: athrow
      // 73a: ifeq 6aa
      // 73d: aload 1
      // 73e: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 741: bipush 0
      // 742: new java/lang/StringBuilder
      // 745: dup
      // 746: invokespecial java/lang/StringBuilder.<init> ()V
      // 749: aload 19
      // 74b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74e: sipush 9751
      // 751: sipush -25943
      // 754: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 757: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 75a: aload 13
      // 75c: invokeinterface com/finalshell/core/AB_2.b ()Ljava/lang/String; 1
      // 761: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 764: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 767: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 76c: iload 5
      // 76e: ifne 6aa
      // 771: aload 0
      // 772: getfield com/finalshell/crypto/Login.g Lcom/finalshell/core/YU;
      // 775: invokevirtual com/finalshell/core/YU.M ()V
      // 778: aload 0
      // 779: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 77c: sipush 3982
      // 77f: ldc2_w 924661294955108793
      // 782: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 785: invokevirtual com/finalshell/core/UJ.V (B)V
      // 788: aload 0
      // 789: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 78c: aload 10
      // 78e: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 791: aload 0
      // 792: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 795: sipush 9765
      // 798: sipush -17379
      // 79b: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 79e: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 7a1: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 7a4: aload 0
      // 7a5: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 7a8: sipush 9781
      // 7ab: sipush 22181
      // 7ae: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 7b1: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 7b4: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 7b7: aload 0
      // 7b8: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 7bb: bipush 1
      // 7bc: invokevirtual com/finalshell/core/UJ.V (B)V
      // 7bf: aload 0
      // 7c0: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 7c3: aload 19
      // 7c5: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 7c8: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 7cb: aload 0
      // 7cc: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 7cf: aload 16
      // 7d1: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 7d4: aload 1
      // 7d5: invokevirtual com/finalshell/crypto/ConnectHost.I ()[B
      // 7d8: astore 20
      // 7da: aload 20
      // 7dc: arraylength
      // 7dd: istore 21
      // 7df: bipush 4
      // 7e0: iload 21
      // 7e2: iadd
      // 7e3: aload 0
      // 7e4: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 7e7: getfield com/finalshell/core/UJ.X I
      // 7ea: iadd
      // 7eb: bipush 5
      // 7ec: isub
      // 7ed: newarray 8
      // 7ef: astore 22
      // 7f1: aload 22
      // 7f3: bipush 0
      // 7f4: iload 21
      // 7f6: sipush 8252
      // 7f9: ldc2_w 9073712548400379400
      // 7fc: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 7ff: iushr
      // 800: i2b
      // 801: bastore
      // 802: aload 22
      // 804: bipush 1
      // 805: iload 21
      // 807: sipush 13323
      // 80a: ldc2_w 3741246665295405621
      // 80d: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 810: iushr
      // 811: i2b
      // 812: bastore
      // 813: aload 22
      // 815: bipush 2
      // 816: iload 21
      // 818: sipush 3940
      // 81b: ldc2_w 4250895115494922587
      // 81e: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 821: iushr
      // 822: i2b
      // 823: bastore
      // 824: aload 22
      // 826: bipush 3
      // 827: iload 21
      // 829: i2b
      // 82a: bastore
      // 82b: aload 20
      // 82d: bipush 0
      // 82e: aload 22
      // 830: bipush 4
      // 831: iload 21
      // 833: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 836: aload 0
      // 837: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 83a: getfield com/finalshell/core/UJ.g [B
      // 83d: bipush 5
      // 83e: aload 22
      // 840: bipush 4
      // 841: iload 21
      // 843: iadd
      // 844: aload 0
      // 845: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 848: getfield com/finalshell/core/UJ.X I
      // 84b: bipush 5
      // 84c: isub
      // 84d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 850: aload 13
      // 852: aload 22
      // 854: aload 19
      // 856: invokeinterface com/finalshell/core/AB_2.l ([BLjava/lang/String;)[B 3
      // 85b: astore 23
      // 85d: iload 5
      // 85f: ifeq 8c1
      // 862: aload 23
      // 864: ifnonnull 8b8
      // 867: goto 86e
      // 86a: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86d: athrow
      // 86e: aload 1
      // 86f: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 872: bipush 0
      // 873: iload 5
      // 875: ifeq 893
      // 878: goto 87f
      // 87b: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87e: athrow
      // 87f: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 884: ifeq 6aa
      // 887: goto 88e
      // 88a: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88d: athrow
      // 88e: aload 1
      // 88f: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 892: bipush 0
      // 893: new java/lang/StringBuilder
      // 896: dup
      // 897: invokespecial java/lang/StringBuilder.<init> ()V
      // 89a: aload 19
      // 89c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 89f: sipush 9782
      // 8a2: sipush -19709
      // 8a5: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 8a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8ab: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8ae: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 8b3: iload 5
      // 8b5: ifne 6aa
      // 8b8: aload 0
      // 8b9: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 8bc: aload 23
      // 8be: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 8c1: aload 1
      // 8c2: aload 0
      // 8c3: getfield com/finalshell/crypto/Login.g Lcom/finalshell/core/YU;
      // 8c6: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 8c9: aload 0
      // 8ca: aload 1
      // 8cb: aload 0
      // 8cc: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 8cf: invokevirtual com/finalshell/crypto/ConnectHost.V (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/UJ;
      // 8d2: putfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 8d5: aload 0
      // 8d6: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 8d9: invokevirtual com/finalshell/core/UJ.A ()B
      // 8dc: sipush 29210
      // 8df: ldc2_w 1600741342496252962
      // 8e2: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 8e5: iand
      // 8e6: istore 11
      // 8e8: iload 11
      // 8ea: sipush 25796
      // 8ed: ldc2_w 369085042264109817
      // 8f0: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 8f3: if_icmpne 949
      // 8f6: aload 1
      // 8f7: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 8fa: bipush 0
      // 8fb: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 900: iload 5
      // 902: ifeq 94b
      // 905: iload 5
      // 907: ifeq 948
      // 90a: goto 911
      // 90d: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 910: athrow
      // 911: ifeq 947
      // 914: goto 91b
      // 917: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91a: athrow
      // 91b: aload 1
      // 91c: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 91f: bipush 0
      // 920: new java/lang/StringBuilder
      // 923: dup
      // 924: invokespecial java/lang/StringBuilder.<init> ()V
      // 927: aload 19
      // 929: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 92c: sipush 9766
      // 92f: sipush 10924
      // 932: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 935: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 938: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 93b: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 940: goto 947
      // 943: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 946: athrow
      // 947: bipush 1
      // 948: ireturn
      // 949: iload 11
      // 94b: sipush 9086
      // 94e: ldc2_w 1726842834803733852
      // 951: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 954: iload 5
      // 956: ifeq 9ce
      // 959: if_icmpne 9b7
      // 95c: goto 963
      // 95f: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 962: athrow
      // 963: aload 0
      // 964: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 967: invokevirtual com/finalshell/core/UJ.d ()I
      // 96a: pop
      // 96b: aload 0
      // 96c: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 96f: invokevirtual com/finalshell/core/UJ.r ()I
      // 972: pop
      // 973: aload 0
      // 974: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 977: invokevirtual com/finalshell/core/UJ.r ()I
      // 97a: pop
      // 97b: aload 0
      // 97c: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 97f: invokevirtual com/finalshell/core/UJ.S ()[B
      // 982: astore 24
      // 984: aload 0
      // 985: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 988: invokevirtual com/finalshell/core/UJ.S ()[B
      // 98b: astore 25
      // 98d: aload 24
      // 98f: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 992: astore 26
      // 994: aload 0
      // 995: getfield com/finalshell/crypto/Login.J Lcom/finalshell/core/Gq2;
      // 998: iload 5
      // 99a: ifeq 9ab
      // 99d: ifnull 8c9
      // 9a0: goto 9a7
      // 9a3: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a6: athrow
      // 9a7: aload 0
      // 9a8: getfield com/finalshell/crypto/Login.J Lcom/finalshell/core/Gq2;
      // 9ab: aload 26
      // 9ad: invokeinterface com/finalshell/core/Gq2.q (Ljava/lang/String;)V 2
      // 9b2: iload 5
      // 9b4: ifne 8c9
      // 9b7: iload 11
      // 9b9: iload 5
      // 9bb: ifeq ac5
      // 9be: sipush 7094
      // 9c1: ldc2_w 8637939309676924298
      // 9c4: invokestatic com/finalshell/crypto/Login.a (IJ)I
      // 9c7: goto 9ce
      // 9ca: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9cd: athrow
      // 9ce: if_icmpne aaf
      // 9d1: aload 0
      // 9d2: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 9d5: invokevirtual com/finalshell/core/UJ.d ()I
      // 9d8: pop
      // 9d9: aload 0
      // 9da: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 9dd: invokevirtual com/finalshell/core/UJ.r ()I
      // 9e0: pop
      // 9e1: aload 0
      // 9e2: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 9e5: invokevirtual com/finalshell/core/UJ.r ()I
      // 9e8: pop
      // 9e9: aload 0
      // 9ea: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 9ed: invokevirtual com/finalshell/core/UJ.S ()[B
      // 9f0: astore 24
      // 9f2: aload 0
      // 9f3: getfield com/finalshell/crypto/Login.s Lcom/finalshell/core/UJ;
      // 9f6: invokevirtual com/finalshell/core/UJ.r ()I
      // 9f9: istore 25
      // 9fb: iload 25
      // 9fd: iload 5
      // 9ff: ifeq a31
      // a02: ifeq a1d
      // a05: goto a0c
      // a08: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a0b: athrow
      // a0c: new com/finalshell/core/PD
      // a0f: dup
      // a10: aload 24
      // a12: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // a15: invokespecial com/finalshell/core/PD.<init> (Ljava/lang/String;)V
      // a18: athrow
      // a19: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1c: athrow
      // a1d: aload 1
      // a1e: dup
      // a1f: getfield com/finalshell/crypto/ConnectHost.X I
      // a22: bipush 1
      // a23: iadd
      // a24: putfield com/finalshell/crypto/ConnectHost.X I
      // a27: aload 1
      // a28: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // a2b: bipush 0
      // a2c: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // a31: iload 5
      // a33: ifeq a70
      // a36: ifeq a6c
      // a39: goto a40
      // a3c: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a3f: athrow
      // a40: aload 1
      // a41: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // a44: bipush 0
      // a45: new java/lang/StringBuilder
      // a48: dup
      // a49: invokespecial java/lang/StringBuilder.<init> ()V
      // a4c: aload 19
      // a4e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a51: sipush 9776
      // a54: sipush 25341
      // a57: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // a5a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a5d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a60: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // a65: goto a6c
      // a68: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a6b: athrow
      // a6c: aload 1
      // a6d: getfield com/finalshell/crypto/ConnectHost.X I
      // a70: iload 5
      // a72: ifeq a8b
      // a75: aload 1
      // a76: getfield com/finalshell/crypto/ConnectHost.iI I
      // a79: if_icmplt a89
      // a7c: goto a83
      // a7f: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a82: athrow
      // a83: bipush 0
      // a84: ireturn
      // a85: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a88: athrow
      // a89: iload 7
      // a8b: iload 5
      // a8d: ifeq aae
      // a90: ifeq aa6
      // a93: goto a9a
      // a96: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a99: athrow
      // a9a: iload 5
      // a9c: ifne b02
      // a9f: goto aa6
      // aa2: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aa5: athrow
      // aa6: bipush 0
      // aa7: goto aae
      // aaa: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aad: athrow
      // aae: ireturn
      // aaf: aload 1
      // ab0: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // ab3: bipush 0
      // ab4: iload 5
      // ab6: ifeq ad4
      // ab9: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // abe: goto ac5
      // ac1: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac4: athrow
      // ac5: ifeq b02
      // ac8: aload 1
      // ac9: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // acc: bipush 0
      // acd: goto ad4
      // ad0: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ad3: athrow
      // ad4: new java/lang/StringBuilder
      // ad7: dup
      // ad8: invokespecial java/lang/StringBuilder.<init> ()V
      // adb: aload 19
      // add: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ae0: sipush 9785
      // ae3: sipush -23716
      // ae6: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // ae9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // aec: iload 11
      // aee: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // af1: ldc_w ")"
      // af4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // af7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // afa: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // aff: goto b02
      // b02: iload 5
      // b04: ifne 6aa
      // b07: iload 5
      // b09: ifne 2ef
      // b0c: iload 5
      // b0e: ifne 1c4
      // b11: bipush 0
      // b12: ireturn
   }

   public void F(ConnectHost param1, AB_2 param2) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 4
      // 003: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 006: bipush 5
      // 007: istore 5
      // 009: istore 3
      // 00a: aload 2
      // 00b: invokeinterface com/finalshell/core/AB_2.f ()Z 1
      // 010: ifeq 0c3
      // 013: aload 4
      // 015: ifnonnull 0c3
      // 018: aload 0
      // 019: getfield com/finalshell/crypto/Login.J Lcom/finalshell/core/Gq2;
      // 01c: ifnonnull 03b
      // 01f: goto 026
      // 022: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: new com/finalshell/core/Pc2
      // 029: dup
      // 02a: sipush 9769
      // 02d: sipush -13894
      // 030: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 033: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 036: athrow
      // 037: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: aload 2
      // 03c: invokeinterface com/finalshell/core/AB_2.f ()Z 1
      // 041: iload 3
      // 042: ifne 089
      // 045: ifeq 0a1
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: aload 0
      // 050: getfield com/finalshell/crypto/Login.J Lcom/finalshell/core/Gq2;
      // 053: iload 3
      // 054: ifne 0a5
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: new java/lang/StringBuilder
      // 061: dup
      // 062: invokespecial java/lang/StringBuilder.<init> ()V
      // 065: sipush 9759
      // 068: sipush 17445
      // 06b: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 06e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 071: aload 2
      // 072: invokeinterface com/finalshell/core/AB_2.b ()Ljava/lang/String; 1
      // 077: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 07d: invokeinterface com/finalshell/core/Gq2.e (Ljava/lang/String;)Z 2
      // 082: goto 089
      // 085: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: ifne 0a1
      // 08c: new com/finalshell/core/Pz2
      // 08f: dup
      // 090: sipush 9761
      // 093: sipush -9726
      // 096: invokestatic com/finalshell/crypto/Login.a (II)Ljava/lang/String;
      // 099: invokespecial com/finalshell/core/Pz2.<init> (Ljava/lang/String;)V
      // 09c: athrow
      // 09d: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield com/finalshell/crypto/Login.J Lcom/finalshell/core/Gq2;
      // 0a5: invokeinterface com/finalshell/core/Gq2.Q ()Ljava/lang/String; 1
      // 0aa: astore 6
      // 0ac: aload 6
      // 0ae: iload 3
      // 0af: ifne 0be
      // 0b2: ifnull 0c3
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: aload 6
      // 0be: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 0c1: astore 4
      // 0c3: aload 2
      // 0c4: invokeinterface com/finalshell/core/AB_2.f ()Z 1
      // 0c9: iload 3
      // 0ca: ifne 0fd
      // 0cd: ifeq 0ee
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: aload 4
      // 0d9: iload 3
      // 0da: ifne 151
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3: athrow
      // 0e4: ifnull 148
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed: athrow
      // 0ee: aload 2
      // 0ef: aload 4
      // 0f1: invokeinterface com/finalshell/core/AB_2.M ([B)Z 2
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: ifeq 148
      // 100: aload 4
      // 102: iload 3
      // 103: ifne 168
      // 106: goto 10d
      // 109: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: ifnull 166
      // 110: goto 117
      // 113: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 116: athrow
      // 117: aload 1
      // 118: invokevirtual com/finalshell/crypto/ConnectHost.m$cd_4 ()Lcom/finalshell/core/Cd4;
      // 11b: iload 3
      // 11c: ifne 13e
      // 11f: goto 126
      // 122: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125: athrow
      // 126: instanceof com/finalshell/core/Rm4
      // 129: ifeq 166
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: aload 1
      // 134: invokevirtual com/finalshell/crypto/ConnectHost.m$cd_4 ()Lcom/finalshell/core/Cd4;
      // 137: goto 13e
      // 13a: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: checkcast com/finalshell/core/Rm4
      // 141: invokevirtual com/finalshell/core/Rm4.N ()V
      // 144: iload 3
      // 145: ifeq 166
      // 148: aload 4
      // 14a: goto 151
      // 14d: invokestatic com/finalshell/crypto/Login.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: invokestatic com/finalshell/core/E8.Q ([B)V
      // 154: aconst_null
      // 155: astore 4
      // 157: iinc 5 -1
      // 15a: iload 5
      // 15c: ifne 00a
      // 15f: iload 3
      // 160: ifne 15a
      // 163: goto 166
      // 166: aload 4
      // 168: invokestatic com/finalshell/core/E8.Q ([B)V
      // 16b: aconst_null
      // 16c: astore 4
      // 16e: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 9789) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 163;
               break;
            case 1:
               var10000 = 51;
               break;
            case 2:
               var10000 = 133;
               break;
            case 3:
               var10000 = 37;
               break;
            case 4:
               var10000 = 6;
               break;
            case 5:
               var10000 = 129;
               break;
            case 6:
               var10000 = 15;
               break;
            case 7:
               var10000 = 16;
               break;
            case 8:
               var10000 = 18;
               break;
            case 9:
               var10000 = 151;
               break;
            case 10:
               var10000 = 99;
               break;
            case 11:
               var10000 = 83;
               break;
            case 12:
               var10000 = 69;
               break;
            case 13:
               var10000 = 61;
               break;
            case 14:
               var10000 = 229;
               break;
            case 15:
               var10000 = 33;
               break;
            case 16:
               var10000 = 199;
               break;
            case 17:
               var10000 = 142;
               break;
            case 18:
               var10000 = 54;
               break;
            case 19:
               var10000 = 127;
               break;
            case 20:
               var10000 = 125;
               break;
            case 21:
               var10000 = 74;
               break;
            case 22:
               var10000 = 138;
               break;
            case 23:
               var10000 = 36;
               break;
            case 24:
               var10000 = 206;
               break;
            case 25:
               var10000 = 153;
               break;
            case 26:
               var10000 = 226;
               break;
            case 27:
               var10000 = 162;
               break;
            case 28:
               var10000 = 141;
               break;
            case 29:
               var10000 = 52;
               break;
            case 30:
               var10000 = 91;
               break;
            case 31:
               var10000 = 77;
               break;
            case 32:
               var10000 = 75;
               break;
            case 33:
               var10000 = 202;
               break;
            case 34:
               var10000 = 160;
               break;
            case 35:
               var10000 = 255;
               break;
            case 36:
               var10000 = 152;
               break;
            case 37:
               var10000 = 210;
               break;
            case 38:
               var10000 = 20;
               break;
            case 39:
               var10000 = 208;
               break;
            case 40:
               var10000 = 96;
               break;
            case 41:
               var10000 = 128;
               break;
            case 42:
               var10000 = 177;
               break;
            case 43:
               var10000 = 93;
               break;
            case 44:
               var10000 = 110;
               break;
            case 45:
               var10000 = 195;
               break;
            case 46:
               var10000 = 3;
               break;
            case 47:
               var10000 = 70;
               break;
            case 48:
               var10000 = 161;
               break;
            case 49:
               var10000 = 87;
               break;
            case 50:
               var10000 = 213;
               break;
            case 51:
               var10000 = 14;
               break;
            case 52:
               var10000 = 58;
               break;
            case 53:
               var10000 = 225;
               break;
            case 54:
               var10000 = 140;
               break;
            case 55:
               var10000 = 159;
               break;
            case 56:
               var10000 = 76;
               break;
            case 57:
               var10000 = 228;
               break;
            case 58:
               var10000 = 158;
               break;
            case 59:
               var10000 = 73;
               break;
            case 60:
               var10000 = 232;
               break;
            case 61:
               var10000 = 27;
               break;
            case 62:
               var10000 = 200;
               break;
            case 63:
               var10000 = 98;
               break;
            case 64:
               var10000 = 38;
               break;
            case 65:
               var10000 = 132;
               break;
            case 66:
               var10000 = 71;
               break;
            case 67:
               var10000 = 222;
               break;
            case 68:
               var10000 = 170;
               break;
            case 69:
               var10000 = 43;
               break;
            case 70:
               var10000 = 4;
               break;
            case 71:
               var10000 = 25;
               break;
            case 72:
               var10000 = 238;
               break;
            case 73:
               var10000 = 143;
               break;
            case 74:
               var10000 = 34;
               break;
            case 75:
               var10000 = 107;
               break;
            case 76:
               var10000 = 135;
               break;
            case 77:
               var10000 = 49;
               break;
            case 78:
               var10000 = 97;
               break;
            case 79:
               var10000 = 227;
               break;
            case 80:
               var10000 = 88;
               break;
            case 81:
               var10000 = 214;
               break;
            case 82:
               var10000 = 196;
               break;
            case 83:
               var10000 = 183;
               break;
            case 84:
               var10000 = 41;
               break;
            case 85:
               var10000 = 78;
               break;
            case 86:
               var10000 = 7;
               break;
            case 87:
               var10000 = 126;
               break;
            case 88:
               var10000 = 173;
               break;
            case 89:
               var10000 = 241;
               break;
            case 90:
               var10000 = 253;
               break;
            case 91:
               var10000 = 59;
               break;
            case 92:
               var10000 = 68;
               break;
            case 93:
               var10000 = 64;
               break;
            case 94:
               var10000 = 92;
               break;
            case 95:
               var10000 = 53;
               break;
            case 96:
               var10000 = 106;
               break;
            case 97:
               var10000 = 45;
               break;
            case 98:
               var10000 = 164;
               break;
            case 99:
               var10000 = 194;
               break;
            case 100:
               var10000 = 248;
               break;
            case 101:
               var10000 = 180;
               break;
            case 102:
               var10000 = 19;
               break;
            case 103:
               var10000 = 12;
               break;
            case 104:
               var10000 = 60;
               break;
            case 105:
               var10000 = 103;
               break;
            case 106:
               var10000 = 157;
               break;
            case 107:
               var10000 = 242;
               break;
            case 108:
               var10000 = 122;
               break;
            case 109:
               var10000 = 234;
               break;
            case 110:
               var10000 = 149;
               break;
            case 111:
               var10000 = 191;
               break;
            case 112:
               var10000 = 146;
               break;
            case 113:
               var10000 = 251;
               break;
            case 114:
               var10000 = 119;
               break;
            case 115:
               var10000 = 178;
               break;
            case 116:
               var10000 = 134;
               break;
            case 117:
               var10000 = 115;
               break;
            case 118:
               var10000 = 224;
               break;
            case 119:
               var10000 = 245;
               break;
            case 120:
               var10000 = 193;
               break;
            case 121:
               var10000 = 156;
               break;
            case 122:
               var10000 = 148;
               break;
            case 123:
               var10000 = 168;
               break;
            case 124:
               var10000 = 22;
               break;
            case 125:
               var10000 = 147;
               break;
            case 126:
               var10000 = 104;
               break;
            case 127:
               var10000 = 1;
               break;
            case 128:
               var10000 = 130;
               break;
            case 129:
               var10000 = 176;
               break;
            case 130:
               var10000 = 235;
               break;
            case 131:
               var10000 = 24;
               break;
            case 132:
               var10000 = 63;
               break;
            case 133:
               var10000 = 32;
               break;
            case 134:
               var10000 = 29;
               break;
            case 135:
               var10000 = 117;
               break;
            case 136:
               var10000 = 184;
               break;
            case 137:
               var10000 = 109;
               break;
            case 138:
               var10000 = 131;
               break;
            case 139:
               var10000 = 86;
               break;
            case 140:
               var10000 = 30;
               break;
            case 141:
               var10000 = 240;
               break;
            case 142:
               var10000 = 2;
               break;
            case 143:
               var10000 = 39;
               break;
            case 144:
               var10000 = 155;
               break;
            case 145:
               var10000 = 8;
               break;
            case 146:
               var10000 = 166;
               break;
            case 147:
               var10000 = 136;
               break;
            case 148:
               var10000 = 209;
               break;
            case 149:
               var10000 = 55;
               break;
            case 150:
               var10000 = 239;
               break;
            case 151:
               var10000 = 67;
               break;
            case 152:
               var10000 = 47;
               break;
            case 153:
               var10000 = 243;
               break;
            case 154:
               var10000 = 187;
               break;
            case 155:
               var10000 = 150;
               break;
            case 156:
               var10000 = 247;
               break;
            case 157:
               var10000 = 236;
               break;
            case 158:
               var10000 = 9;
               break;
            case 159:
               var10000 = 100;
               break;
            case 160:
               var10000 = 124;
               break;
            case 161:
               var10000 = 62;
               break;
            case 162:
               var10000 = 5;
               break;
            case 163:
               var10000 = 254;
               break;
            case 164:
               var10000 = 95;
               break;
            case 165:
               var10000 = 26;
               break;
            case 166:
               var10000 = 237;
               break;
            case 167:
               var10000 = 198;
               break;
            case 168:
               var10000 = 192;
               break;
            case 169:
               var10000 = 123;
               break;
            case 170:
               var10000 = 165;
               break;
            case 171:
               var10000 = 211;
               break;
            case 172:
               var10000 = 89;
               break;
            case 173:
               var10000 = 174;
               break;
            case 174:
               var10000 = 179;
               break;
            case 175:
               var10000 = 85;
               break;
            case 176:
               var10000 = 114;
               break;
            case 177:
               var10000 = 188;
               break;
            case 178:
               var10000 = 219;
               break;
            case 179:
               var10000 = 167;
               break;
            case 180:
               var10000 = 48;
               break;
            case 181:
               var10000 = 207;
               break;
            case 182:
               var10000 = 250;
               break;
            case 183:
               var10000 = 182;
               break;
            case 184:
               var10000 = 116;
               break;
            case 185:
               var10000 = 11;
               break;
            case 186:
               var10000 = 56;
               break;
            case 187:
               var10000 = 144;
               break;
            case 188:
               var10000 = 244;
               break;
            case 189:
               var10000 = 23;
               break;
            case 190:
               var10000 = 120;
               break;
            case 191:
               var10000 = 212;
               break;
            case 192:
               var10000 = 80;
               break;
            case 193:
               var10000 = 185;
               break;
            case 194:
               var10000 = 72;
               break;
            case 195:
               var10000 = 137;
               break;
            case 196:
               var10000 = 169;
               break;
            case 197:
               var10000 = 252;
               break;
            case 198:
               var10000 = 220;
               break;
            case 199:
               var10000 = 112;
               break;
            case 200:
               var10000 = 81;
               break;
            case 201:
               var10000 = 82;
               break;
            case 202:
               var10000 = 175;
               break;
            case 203:
               var10000 = 79;
               break;
            case 204:
               var10000 = 190;
               break;
            case 205:
               var10000 = 186;
               break;
            case 206:
               var10000 = 28;
               break;
            case 207:
               var10000 = 42;
               break;
            case 208:
               var10000 = 102;
               break;
            case 209:
               var10000 = 197;
               break;
            case 210:
               var10000 = 108;
               break;
            case 211:
               var10000 = 145;
               break;
            case 212:
               var10000 = 90;
               break;
            case 213:
               var10000 = 201;
               break;
            case 214:
               var10000 = 215;
               break;
            case 215:
               var10000 = 205;
               break;
            case 216:
               var10000 = 46;
               break;
            case 217:
               var10000 = 204;
               break;
            case 218:
               var10000 = 233;
               break;
            case 219:
               var10000 = 223;
               break;
            case 220:
               var10000 = 40;
               break;
            case 221:
               var10000 = 172;
               break;
            case 222:
               var10000 = 221;
               break;
            case 223:
               var10000 = 84;
               break;
            case 224:
               var10000 = 113;
               break;
            case 225:
               var10000 = 65;
               break;
            case 226:
               var10000 = 154;
               break;
            case 227:
               var10000 = 189;
               break;
            case 228:
               var10000 = 230;
               break;
            case 229:
               var10000 = 203;
               break;
            case 230:
               var10000 = 21;
               break;
            case 231:
               var10000 = 216;
               break;
            case 232:
               var10000 = 57;
               break;
            case 233:
               var10000 = 121;
               break;
            case 234:
               var10000 = 101;
               break;
            case 235:
               var10000 = 35;
               break;
            case 236:
               var10000 = 105;
               break;
            case 237:
               var10000 = 94;
               break;
            case 238:
               var10000 = 139;
               break;
            case 239:
               var10000 = 0;
               break;
            case 240:
               var10000 = 44;
               break;
            case 241:
               var10000 = 10;
               break;
            case 242:
               var10000 = 118;
               break;
            case 243:
               var10000 = 31;
               break;
            case 244:
               var10000 = 231;
               break;
            case 245:
               var10000 = 50;
               break;
            case 246:
               var10000 = 171;
               break;
            case 247:
               var10000 = 249;
               break;
            case 248:
               var10000 = 13;
               break;
            case 249:
               var10000 = 17;
               break;
            case 250:
               var10000 = 218;
               break;
            case 251:
               var10000 = 111;
               break;
            case 252:
               var10000 = 66;
               break;
            case 253:
               var10000 = 181;
               break;
            case 254:
               var10000 = 217;
               break;
            default:
               var10000 = 246;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5683;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[46];
      int var11 = 0;
      String var10 = "OÏ;\u0087Ô\u0086\u009c<ýá°åT\u0092è<^\u008büXædÚF\u000e\u000b\u0087n\u007fY5ò\u001f7Yäß4i\u0010ÀÝ4\u001fIb¨ª`9âËÙ«\u0012`\róÍU?\u008b\u0000ß\u0004*B\u0090¦\u0095\u0017Ø\u00040\u0006''_ô\u0087Å~¹L\u0093v\u0096Ö\u0082éÃ¬®ú\u0006匷涋盫异譟譃\u001a4wªJ\u009aÈÒÿ/\u0086\u001f\u0081ÿ¹9&AÑñeiX,X¹Y\f×¶ÝY\u0017ö&Ü\u000b§c$\t \u0082rX\u009b´ä©L\u0016\u000ekÎâ\\\u009an6\\\\HIH0\u000b® \u001f¥Ø\u0088, \u008e6(\u001a ®\u0085\u0001\u0083wZV\u0095½õ\u0089\u0005\u0092\u0082$\u0097GjJØUßùæ¼1>\u0012A\u0014\u001fG[?\u0004\u008a§\u0095W\u008f\u0092\u008a&Ï-ø\u0018%±æ9\u0005e\u0090Ì·\u00896\u001eàåÁ\u0097LÃâ®¬¬\u00adù\r\u0003sKèHú²O:²ÉWº\u0018?\u00985m\u0015Û¤\u0097ú\u0094PKHGk\u0086.Üò²'9âí\u0007bùC°íÐX\u0016\u0097úýÐ:Ü¢þÅE{l'TÎä\u0098V²ñj\t\u0003\u0081yo\fÂû\u007fðCÃ¬zZtM½\rF\u0007ãf]+\u0010unõC¿ë\rb#\u008c°¯fp._\u0098\u0011B>\u0016ã«súë\u0099\u0098V\u0082P\u0093Ï0\u0001gN\u00ad\u0003\u0014[¾\\\u0007J¶FYMíL\f¦£óûÒ¢\u009eV\u001cö\u0081\u000e\u000e¯\u009aúÜËA \u0091}\u0088\u00adå\u001d.\u0012\u0005£\u0097±Já&Qãîßà\u0083g\u0004riO\u001a ª8ñÈ¿\u0098\u0011f[6:ÚÎ\u009dÈÕ\fcÞ;/f¶ð\u0084\r£:_ÁÊß÷ÿ/=0I\u0081\t#X\u0002\u0003\u0095ß%Ät\f[\u0001L¯%(`\u0007ÃÛ~H\u0017wêÅÛ\u0099\u009c\u0088\u0083}+!d§(\u000báyl\u001c\u001e\u0012\u0015-\u0016ùH0\u0086\u0083\u0016\u0095§#n§\u000fµø´·×<[¼W \u001c\u0080k!\u0005\u0014\u0006h¹slô\u009c\u0082`Ä\f©æ\u0005´Xâ\"\u009b1o&\u008f\u0010(Ö)~êNÜ/î\u00893ÝãiU8\u000fÖÖ\u0089[Î#m5Mô+£\u0013\u0014\u0095\u0016>HÈ\u0086\u009c\u0016v§_n(\b@û\u008eS\u0090 ³/JÒ\u0010s\u008dB\u0015\u0087#q\u0082[)\u0091t.\u0007\u0003ñ\u0003Û~$0\u0092\u007fm1\u001c×ì\rª\u009aä}ö©òs\u00ad\u0086J\u0080 Y\f\u0016¼4Î\u007fó©&×Üô}dK.t\u0002óÙ\u00ad)\u0005\u0014\u000fe\u0016\u001aëLò\f\u0098dv\u001dT`ON\u0011¨LTC+SY]\u0010\u0013GNL\u0006\bAç]\u0085Qá6µ\u0000§\u0016{W`e\u0089jÔ(\u000b\u009f¢7\u001c?©\u0089tû/DÙ¿\u001cxQ>B÷î\u0014¤üÏ\u0005è¼î\u0003ÝQÜ\u001aó»\n^\u0086¾Ì×û0q³\u0011¨\u0093ä\u001dk\u0094V#ä\u000e\u009aí\u0015NJ6\u0019/jýp\u0082ø\tæ\u000b\u009a9±?8\u0001ýÄ\u001d\u0085dÍ\u0015j°ý'\u0010\u0003";
      int var12 = "OÏ;\u0087Ô\u0086\u009c<ýá°åT\u0092è<^\u008büXædÚF\u000e\u000b\u0087n\u007fY5ò\u001f7Yäß4i\u0010ÀÝ4\u001fIb¨ª`9âËÙ«\u0012`\róÍU?\u008b\u0000ß\u0004*B\u0090¦\u0095\u0017Ø\u00040\u0006''_ô\u0087Å~¹L\u0093v\u0096Ö\u0082éÃ¬®ú\u0006匷涋盫异譟譃\u001a4wªJ\u009aÈÒÿ/\u0086\u001f\u0081ÿ¹9&AÑñeiX,X¹Y\f×¶ÝY\u0017ö&Ü\u000b§c$\t \u0082rX\u009b´ä©L\u0016\u000ekÎâ\\\u009an6\\\\HIH0\u000b® \u001f¥Ø\u0088, \u008e6(\u001a ®\u0085\u0001\u0083wZV\u0095½õ\u0089\u0005\u0092\u0082$\u0097GjJØUßùæ¼1>\u0012A\u0014\u001fG[?\u0004\u008a§\u0095W\u008f\u0092\u008a&Ï-ø\u0018%±æ9\u0005e\u0090Ì·\u00896\u001eàåÁ\u0097LÃâ®¬¬\u00adù\r\u0003sKèHú²O:²ÉWº\u0018?\u00985m\u0015Û¤\u0097ú\u0094PKHGk\u0086.Üò²'9âí\u0007bùC°íÐX\u0016\u0097úýÐ:Ü¢þÅE{l'TÎä\u0098V²ñj\t\u0003\u0081yo\fÂû\u007fðCÃ¬zZtM½\rF\u0007ãf]+\u0010unõC¿ë\rb#\u008c°¯fp._\u0098\u0011B>\u0016ã«súë\u0099\u0098V\u0082P\u0093Ï0\u0001gN\u00ad\u0003\u0014[¾\\\u0007J¶FYMíL\f¦£óûÒ¢\u009eV\u001cö\u0081\u000e\u000e¯\u009aúÜËA \u0091}\u0088\u00adå\u001d.\u0012\u0005£\u0097±Já&Qãîßà\u0083g\u0004riO\u001a ª8ñÈ¿\u0098\u0011f[6:ÚÎ\u009dÈÕ\fcÞ;/f¶ð\u0084\r£:_ÁÊß÷ÿ/=0I\u0081\t#X\u0002\u0003\u0095ß%Ät\f[\u0001L¯%(`\u0007ÃÛ~H\u0017wêÅÛ\u0099\u009c\u0088\u0083}+!d§(\u000báyl\u001c\u001e\u0012\u0015-\u0016ùH0\u0086\u0083\u0016\u0095§#n§\u000fµø´·×<[¼W \u001c\u0080k!\u0005\u0014\u0006h¹slô\u009c\u0082`Ä\f©æ\u0005´Xâ\"\u009b1o&\u008f\u0010(Ö)~êNÜ/î\u00893ÝãiU8\u000fÖÖ\u0089[Î#m5Mô+£\u0013\u0014\u0095\u0016>HÈ\u0086\u009c\u0016v§_n(\b@û\u008eS\u0090 ³/JÒ\u0010s\u008dB\u0015\u0087#q\u0082[)\u0091t.\u0007\u0003ñ\u0003Û~$0\u0092\u007fm1\u001c×ì\rª\u009aä}ö©òs\u00ad\u0086J\u0080 Y\f\u0016¼4Î\u007fó©&×Üô}dK.t\u0002óÙ\u00ad)\u0005\u0014\u000fe\u0016\u001aëLò\f\u0098dv\u001dT`ON\u0011¨LTC+SY]\u0010\u0013GNL\u0006\bAç]\u0085Qá6µ\u0000§\u0016{W`e\u0089jÔ(\u000b\u009f¢7\u001c?©\u0089tû/DÙ¿\u001cxQ>B÷î\u0014¤üÏ\u0005è¼î\u0003ÝQÜ\u001aó»\n^\u0086¾Ì×û0q³\u0011¨\u0093ä\u001dk\u0094V#ä\u000e\u009aí\u0015NJ6\u0019/jýp\u0082ø\tæ\u000b\u009a9±?8\u0001ýÄ\u001d\u0085dÍ\u0015j°ý'\u0010\u0003"
         .length();
      char var9 = 24;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 44;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 22;
                        break;
                     case 1:
                        var65 = 64;
                        break;
                     case 2:
                        var65 = 17;
                        break;
                     case 3:
                        var65 = 30;
                        break;
                     case 4:
                        var65 = 25;
                        break;
                     case 5:
                        var65 = 87;
                        break;
                     default:
                        var65 = 50;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     b = var13;
                     c = new String[46];
                     long var0 = 7570890207146762738L;
                     long[] var6 = new long[18];
                     int var3 = 0;
                     String var4 = "õhDñþ4>²2Wú\u0086\u000eÞ\u0001¨\u0093j\u0096ïV*\u009dK¹\tìà1Ö\u0087Ò|Ð\u009d\u0090\u0081-xyh\u009asÊ\u0092\u0091(ÿæÐ\u0013½u\u00914\bB¬\u008eN\u000f\u001f×âU\u0018K\u00ad\u0085\u0093.ð©Â\u008aJx\u0003Ç¥1¸g\u0090\u0091\\ç¿Bà`\u0005î²\u0005/\u0004\u0092Då.óø¡0»í\u009fÐ{C×a_\u0017\u001f\u0002x\u0093?¦èñ\u0095¦ÚlK";
                     int var5 = "õhDñþ4>²2Wú\u0086\u000eÞ\u0001¨\u0093j\u0096ïV*\u009dK¹\tìà1Ö\u0087Ò|Ð\u009d\u0090\u0081-xyh\u009asÊ\u0092\u0091(ÿæÐ\u0013½u\u00914\bB¬\u008eN\u000f\u001f×âU\u0018K\u00ad\u0085\u0093.ð©Â\u008aJx\u0003Ç¥1¸g\u0090\u0091\\ç¿Bà`\u0005î²\u0005/\u0004\u0092Då.óø¡0»í\u009fÐ{C×a_\u0017\u001f\u0002x\u0093?¦èñ\u0095¦ÚlK"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    d = var6;
                                    e = new Integer[18];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "ÃÖM¿?L\u008fwë\tksA\u0010Ô\u009b";
                                 var5 = "ÃÖM¿?L\u008fwë\tksA\u0010Ô\u009b".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "Tçk8Ðò\u0093\u0092Y\u001d\u0019\u0003å\u000fãÇßCÁ\u0006ç\u001b|Ù\u0002?\u009c¬\u0096\u000e'p\u0016(_\u0012|ßQ\u0006WIhòÐ\u0003øþ+\u0086·iÕ\t\u0095";
                  var12 = "Tçk8Ðò\u0093\u0092Y\u001d\u0019\u0003å\u000fãÇßCÁ\u0006ç\u001b|Ù\u0002?\u009c¬\u0096\u000e'p\u0016(_\u0012|ßQ\u0006WIhòÐ\u0003øþ+\u0086·iÕ\t\u0095"
                     .length();
                  var9 = ' ';
                  var17 = -1;
            }

            var10000 = 126;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





