import com._1;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingConstants;

public class nP extends com.T4 implements SwingConstants {
   protected Map E;
   protected Insets H;
   protected Insets r;
   private static final String[] a;
   private static final String[] b;
   private static final long[] d;
   private static final Integer[] e;

   public nP() {
      com.c.c(232621628964701672L).set(this, new HashMap());
      com.c.c(319278625247167072L).set(this, null);
      com.c.c(449571377597292178L).set(this, null);
   }

   public Insets H() {
      return (Insets)com.c.c(319278625247167072L).get(this);
   }

   public void A(int var1) {
      Object[] var10001 = com.c.a(var1, var1, var1, var1);
      Method var10003 = com.c.d(366364782117642186L);
      Object[] var10002 = var10001;
      nP var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void w(int var1, int var2, int var3, int var4) {
      Object[] var10001 = com.c.a(new Insets(var1, var2, var3, var4));
      Method var10003 = com.c.d(592667338758188707L);
      Object[] var10002 = var10001;
      nP var6 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void x(Insets var1) {
      com.c.c(319278625247167072L).set(this, var1);
   }

   public Insets w() {
      return (Insets)com.c.c(449571377597292178L).get(this);
   }

   public void V(int var1) {
      Object[] var10001 = com.c.a(var1, var1, var1, var1);
      Method var10003 = com.c.d(204170067243007436L);
      Object[] var10002 = var10001;
      nP var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void F(int var1, int var2, int var3, int var4) {
      Object[] var10001 = com.c.a(new Insets(var1, var2, var3, var4));
      Method var10003 = com.c.d(539827804849763183L);
      Object[] var10002 = var10001;
      nP var6 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void q(Insets var1) {
      com.c.c(449571377597292178L).set(this, var1);
   }

   @Override
   public void A(Component param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic F8.y ()[Ljava/lang/String;
      // 03: aload 2
      // 04: checkcast java/lang/String
      // 07: astore 4
      // 09: astore 3
      // 0a: aload 4
      // 0c: aload 3
      // 0d: ifnonnull 1c
      // 10: ifnull 59
      // 13: goto 1a
      // 16: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19: athrow
      // 1a: aload 4
      // 1c: aload 3
      // 1d: ifnonnull 84
      // 20: sipush -21869
      // 23: sipush 27444
      // 26: invokestatic nP.a (II)Ljava/lang/String;
      // 29: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2c: ifne 6e
      // 2f: goto 36
      // 32: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35: athrow
      // 36: aload 4
      // 38: aload 3
      // 39: ifnonnull 84
      // 3c: goto 43
      // 3f: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: sipush -21872
      // 46: sipush 12452
      // 49: invokestatic nP.a (II)Ljava/lang/String;
      // 4c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4f: ifne 6e
      // 52: goto 59
      // 55: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 58: athrow
      // 59: new java/lang/IllegalArgumentException
      // 5c: dup
      // 5d: sipush -21870
      // 60: sipush 25675
      // 63: invokestatic nP.a (II)Ljava/lang/String;
      // 66: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 69: athrow
      // 6a: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6d: athrow
      // 6e: aload 0
      // 6f: ldc2_w 232621628964701672
      // 72: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 75: swap
      // 76: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 79: checkcast java/util/Map
      // 7c: aload 1
      // 7d: aload 4
      // 7f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 84: pop
      // 85: return
   }

   @Override
   public void F(Component var1) {
      ((Map)com.c.c(232621628964701672L).get(this)).remove(var1);
   }

   @Override
   public Dimension preferredLayoutSize(Container param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual java/awt/Container.getInsets ()Ljava/awt/Insets;
      // 04: astore 3
      // 05: aload 0
      // 06: aload 1
      // 07: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a: ldc2_w 488644587593575643
      // 0d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 10: dup_x2
      // 11: pop
      // 12: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 15: checkcast java/awt/Insets
      // 18: goto 1f
      // 1b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: astore 4
      // 21: new java/awt/Dimension
      // 24: dup
      // 25: invokespecial java/awt/Dimension.<init> ()V
      // 28: astore 5
      // 2a: aload 1
      // 2b: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 2e: astore 6
      // 30: invokestatic F8.y ()[Ljava/lang/String;
      // 33: aload 6
      // 35: arraylength
      // 36: istore 7
      // 38: astore 2
      // 39: bipush 0
      // 3a: istore 8
      // 3c: iload 8
      // 3e: iload 7
      // 40: if_icmpge de
      // 43: aload 6
      // 45: iload 8
      // 47: aaload
      // 48: astore 9
      // 4a: aload 0
      // 4b: ldc2_w 232621628964701672
      // 4e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 51: swap
      // 52: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 55: checkcast java/util/Map
      // 58: aload 9
      // 5a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5f: checkcast java/lang/String
      // 62: astore 10
      // 64: aload 2
      // 65: ifnonnull da
      // 68: aload 10
      // 6a: ifnull d7
      // 6d: goto 74
      // 70: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 73: athrow
      // 74: aload 10
      // 76: sipush -21869
      // 79: sipush 27444
      // 7c: invokestatic nP.a (II)Ljava/lang/String;
      // 7f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 82: ifeq d7
      // 85: goto 8c
      // 88: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8b: athrow
      // 8c: aload 9
      // 8e: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 91: astore 11
      // 93: aload 5
      // 95: new java/awt/Dimension
      // 98: dup
      // 99: aload 3
      // 9a: getfield java/awt/Insets.left I
      // 9d: aload 4
      // 9f: getfield java/awt/Insets.left I
      // a2: iadd
      // a3: aload 11
      // a5: getfield java/awt/Dimension.width I
      // a8: iadd
      // a9: aload 4
      // ab: getfield java/awt/Insets.right I
      // ae: iadd
      // af: aload 3
      // b0: getfield java/awt/Insets.right I
      // b3: iadd
      // b4: aload 3
      // b5: getfield java/awt/Insets.top I
      // b8: aload 4
      // ba: getfield java/awt/Insets.top I
      // bd: iadd
      // be: aload 11
      // c0: getfield java/awt/Dimension.height I
      // c3: iadd
      // c4: aload 4
      // c6: getfield java/awt/Insets.bottom I
      // c9: iadd
      // ca: aload 3
      // cb: getfield java/awt/Insets.bottom I
      // ce: iadd
      // cf: invokespecial java/awt/Dimension.<init> (II)V
      // d2: invokestatic com/FN.h (Ljava/awt/Dimension;Ljava/awt/Dimension;)Ljava/awt/Dimension;
      // d5: astore 5
      // d7: iinc 8 1
      // da: aload 2
      // db: ifnull 3c
      // de: aload 5
      // e0: areturn
   }

   protected Insets J(Container param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ldc2_w 319278625247167072
      // 04: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 07: swap
      // 08: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b: checkcast java/awt/Insets
      // 0e: ifnull 4b
      // 11: aload 1
      // 12: invokevirtual java/awt/Container.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 15: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 18: ifeq 37
      // 1b: goto 22
      // 1e: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21: athrow
      // 22: aload 0
      // 23: ldc2_w 319278625247167072
      // 26: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 29: swap
      // 2a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2d: checkcast java/awt/Insets
      // 30: goto 56
      // 33: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: aload 0
      // 38: ldc2_w 319278625247167072
      // 3b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3e: swap
      // 3f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 42: checkcast java/awt/Insets
      // 45: invokestatic com/FN.p (Ljava/awt/Insets;)Ljava/awt/Insets;
      // 48: goto 56
      // 4b: new java/awt/Insets
      // 4e: dup
      // 4f: bipush 0
      // 50: bipush 0
      // 51: bipush 0
      // 52: bipush 0
      // 53: invokespecial java/awt/Insets.<init> (IIII)V
      // 56: areturn
   }

   @Override
   public void layoutContainer(Container param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual java/awt/Container.getInsets ()Ljava/awt/Insets;
      // 004: astore 3
      // 005: aload 0
      // 006: aload 1
      // 007: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 00a: ldc2_w 488644587593575643
      // 00d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 010: dup_x2
      // 011: pop
      // 012: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 015: checkcast java/awt/Insets
      // 018: goto 01f
      // 01b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: astore 4
      // 021: aload 1
      // 022: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 025: astore 5
      // 027: aload 5
      // 029: arraylength
      // 02a: istore 6
      // 02c: invokestatic F8.y ()[Ljava/lang/String;
      // 02f: bipush 0
      // 030: istore 7
      // 032: astore 2
      // 033: iload 7
      // 035: iload 6
      // 037: if_icmpge 3d3
      // 03a: aload 5
      // 03c: iload 7
      // 03e: aaload
      // 03f: astore 8
      // 041: aload 0
      // 042: ldc2_w 232621628964701672
      // 045: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 048: swap
      // 049: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 04c: checkcast java/util/Map
      // 04f: aload 8
      // 051: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 056: checkcast java/lang/String
      // 059: astore 9
      // 05b: aload 2
      // 05c: ifnonnull 3cf
      // 05f: aload 9
      // 061: ifnull 3cc
      // 064: goto 06b
      // 067: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06a: athrow
      // 06b: aload 1
      // 06c: invokevirtual java/awt/Container.getWidth ()I
      // 06f: istore 10
      // 071: aload 1
      // 072: invokevirtual java/awt/Container.getHeight ()I
      // 075: istore 11
      // 077: aload 9
      // 079: sipush -21866
      // 07c: sipush 15761
      // 07f: invokestatic nP.a (II)Ljava/lang/String;
      // 082: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 085: aload 2
      // 086: ifnonnull 0fc
      // 089: ifeq 0e7
      // 08c: goto 093
      // 08f: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 092: athrow
      // 093: aload 8
      // 095: aload 3
      // 096: getfield java/awt/Insets.left I
      // 099: aload 4
      // 09b: getfield java/awt/Insets.left I
      // 09e: iadd
      // 09f: aload 3
      // 0a0: getfield java/awt/Insets.top I
      // 0a3: aload 4
      // 0a5: getfield java/awt/Insets.top I
      // 0a8: iadd
      // 0a9: iload 10
      // 0ab: aload 3
      // 0ac: getfield java/awt/Insets.left I
      // 0af: isub
      // 0b0: aload 3
      // 0b1: getfield java/awt/Insets.right I
      // 0b4: isub
      // 0b5: aload 4
      // 0b7: getfield java/awt/Insets.left I
      // 0ba: isub
      // 0bb: aload 4
      // 0bd: getfield java/awt/Insets.right I
      // 0c0: isub
      // 0c1: iload 11
      // 0c3: aload 3
      // 0c4: getfield java/awt/Insets.top I
      // 0c7: isub
      // 0c8: aload 3
      // 0c9: getfield java/awt/Insets.bottom I
      // 0cc: isub
      // 0cd: aload 4
      // 0cf: getfield java/awt/Insets.top I
      // 0d2: isub
      // 0d3: aload 4
      // 0d5: getfield java/awt/Insets.bottom I
      // 0d8: isub
      // 0d9: invokevirtual java/awt/Component.setBounds (IIII)V
      // 0dc: aload 2
      // 0dd: ifnull 3cc
      // 0e0: goto 0e7
      // 0e3: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e6: athrow
      // 0e7: aload 9
      // 0e9: sipush -21871
      // 0ec: sipush -19497
      // 0ef: invokestatic nP.a (II)Ljava/lang/String;
      // 0f2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f5: goto 0fc
      // 0f8: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fb: athrow
      // 0fc: ifeq 3cc
      // 0ff: aload 1
      // 100: checkcast mj_2
      // 103: astore 12
      // 105: aload 12
      // 107: aload 8
      // 109: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 10c: ldc2_w 301251920477522944
      // 10f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 112: dup_x2
      // 113: pop
      // 114: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 117: checkcast com/_1
      // 11a: goto 121
      // 11d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 120: athrow
      // 121: astore 13
      // 123: aload 0
      // 124: ldc2_w 449571377597292178
      // 127: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 12a: swap
      // 12b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 12e: checkcast java/awt/Insets
      // 131: aload 2
      // 132: ifnonnull 154
      // 135: ifnull 157
      // 138: goto 13f
      // 13b: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13e: athrow
      // 13f: aload 0
      // 140: ldc2_w 449571377597292178
      // 143: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 146: swap
      // 147: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 14a: checkcast java/awt/Insets
      // 14d: goto 154
      // 150: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 153: athrow
      // 154: goto 162
      // 157: new java/awt/Insets
      // 15a: dup
      // 15b: bipush 0
      // 15c: bipush 0
      // 15d: bipush 0
      // 15e: bipush 0
      // 15f: invokespecial java/awt/Insets.<init> (IIII)V
      // 162: astore 14
      // 164: aload 13
      // 166: invokevirtual com/_1.c ()Lcom/rk_4;
      // 169: ldc2_w 450139753234189664
      // 16c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 16f: aconst_null
      // 170: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 173: checkcast ci_4
      // 176: invokevirtual com/rk_4.equals (Ljava/lang/Object;)Z
      // 179: aload 2
      // 17a: ifnonnull 1f7
      // 17d: ifeq 1db
      // 180: goto 187
      // 183: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 186: athrow
      // 187: aload 8
      // 189: aload 3
      // 18a: getfield java/awt/Insets.left I
      // 18d: aload 14
      // 18f: getfield java/awt/Insets.left I
      // 192: iadd
      // 193: aload 3
      // 194: getfield java/awt/Insets.top I
      // 197: aload 14
      // 199: getfield java/awt/Insets.top I
      // 19c: iadd
      // 19d: iload 10
      // 19f: aload 3
      // 1a0: getfield java/awt/Insets.left I
      // 1a3: isub
      // 1a4: aload 14
      // 1a6: getfield java/awt/Insets.left I
      // 1a9: isub
      // 1aa: aload 3
      // 1ab: getfield java/awt/Insets.right I
      // 1ae: isub
      // 1af: aload 14
      // 1b1: getfield java/awt/Insets.right I
      // 1b4: isub
      // 1b5: iload 11
      // 1b7: aload 3
      // 1b8: getfield java/awt/Insets.top I
      // 1bb: isub
      // 1bc: aload 14
      // 1be: getfield java/awt/Insets.top I
      // 1c1: isub
      // 1c2: aload 3
      // 1c3: getfield java/awt/Insets.bottom I
      // 1c6: isub
      // 1c7: aload 14
      // 1c9: getfield java/awt/Insets.bottom I
      // 1cc: isub
      // 1cd: invokevirtual java/awt/Component.setBounds (IIII)V
      // 1d0: aload 2
      // 1d1: ifnull 3cc
      // 1d4: goto 1db
      // 1d7: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1da: athrow
      // 1db: aload 13
      // 1dd: invokevirtual com/_1.c ()Lcom/rk_4;
      // 1e0: ldc2_w 125951356802921136
      // 1e3: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1e6: aconst_null
      // 1e7: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1ea: checkcast ci_4
      // 1ed: invokevirtual com/rk_4.equals (Ljava/lang/Object;)Z
      // 1f0: goto 1f7
      // 1f3: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f6: athrow
      // 1f7: ifeq 3b3
      // 1fa: aload 8
      // 1fc: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 1ff: astore 15
      // 201: aload 0
      // 202: aload 8
      // 204: aload 13
      // 206: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 209: ldc2_w 558852456288832772
      // 20c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 20f: dup_x2
      // 210: pop
      // 211: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 214: checkcast java/lang/Integer
      // 217: invokevirtual java/lang/Integer.intValue ()I
      // 21a: goto 221
      // 21d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 220: athrow
      // 221: istore 17
      // 223: iload 17
      // 225: bipush 2
      // 226: aload 2
      // 227: ifnonnull 25c
      // 22a: if_icmpeq 24c
      // 22d: goto 234
      // 230: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 233: athrow
      // 234: iload 17
      // 236: bipush -1
      // 237: aload 2
      // 238: ifnonnull 26d
      // 23b: goto 242
      // 23e: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 241: athrow
      // 242: if_icmpne 263
      // 245: goto 24c
      // 248: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24b: athrow
      // 24c: aload 3
      // 24d: getfield java/awt/Insets.left I
      // 250: aload 14
      // 252: getfield java/awt/Insets.left I
      // 255: goto 25c
      // 258: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25b: athrow
      // 25c: iadd
      // 25d: istore 16
      // 25f: aload 2
      // 260: ifnull 2a9
      // 263: iload 17
      // 265: bipush 4
      // 266: goto 26d
      // 269: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 26c: athrow
      // 26d: aload 2
      // 26e: ifnonnull 2a6
      // 271: if_icmpne 294
      // 274: goto 27b
      // 277: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27a: athrow
      // 27b: iload 10
      // 27d: aload 3
      // 27e: getfield java/awt/Insets.right I
      // 281: isub
      // 282: aload 14
      // 284: getfield java/awt/Insets.right I
      // 287: isub
      // 288: aload 15
      // 28a: getfield java/awt/Dimension.width I
      // 28d: isub
      // 28e: istore 16
      // 290: aload 2
      // 291: ifnull 2a9
      // 294: iload 10
      // 296: bipush 2
      // 297: idiv
      // 298: aload 15
      // 29a: getfield java/awt/Dimension.width I
      // 29d: bipush 2
      // 29e: idiv
      // 29f: goto 2a6
      // 2a2: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a5: athrow
      // 2a6: isub
      // 2a7: istore 16
      // 2a9: aload 13
      // 2ab: invokevirtual com/_1.X ()I
      // 2ae: istore 19
      // 2b0: iload 19
      // 2b2: bipush 1
      // 2b3: aload 2
      // 2b4: ifnonnull 2e9
      // 2b7: if_icmpeq 2d9
      // 2ba: goto 2c1
      // 2bd: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c0: athrow
      // 2c1: iload 19
      // 2c3: bipush -1
      // 2c4: aload 2
      // 2c5: ifnonnull 2fa
      // 2c8: goto 2cf
      // 2cb: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ce: athrow
      // 2cf: if_icmpne 2f0
      // 2d2: goto 2d9
      // 2d5: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d8: athrow
      // 2d9: aload 3
      // 2da: getfield java/awt/Insets.top I
      // 2dd: aload 14
      // 2df: getfield java/awt/Insets.top I
      // 2e2: goto 2e9
      // 2e5: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e8: athrow
      // 2e9: iadd
      // 2ea: istore 18
      // 2ec: aload 2
      // 2ed: ifnull 336
      // 2f0: iload 19
      // 2f2: bipush 3
      // 2f3: goto 2fa
      // 2f6: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2f9: athrow
      // 2fa: aload 2
      // 2fb: ifnonnull 333
      // 2fe: if_icmpne 321
      // 301: goto 308
      // 304: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 307: athrow
      // 308: iload 11
      // 30a: aload 3
      // 30b: getfield java/awt/Insets.bottom I
      // 30e: isub
      // 30f: aload 14
      // 311: getfield java/awt/Insets.bottom I
      // 314: isub
      // 315: aload 15
      // 317: getfield java/awt/Dimension.height I
      // 31a: isub
      // 31b: istore 18
      // 31d: aload 2
      // 31e: ifnull 336
      // 321: iload 11
      // 323: bipush 2
      // 324: idiv
      // 325: aload 15
      // 327: getfield java/awt/Dimension.height I
      // 32a: bipush 2
      // 32b: idiv
      // 32c: goto 333
      // 32f: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 332: athrow
      // 333: isub
      // 334: istore 18
      // 336: aload 8
      // 338: iload 16
      // 33a: iload 18
      // 33c: iload 17
      // 33e: bipush -1
      // 33f: aload 2
      // 340: ifnonnull 36b
      // 343: if_icmpne 36f
      // 346: goto 34d
      // 349: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34c: athrow
      // 34d: iload 10
      // 34f: aload 3
      // 350: getfield java/awt/Insets.left I
      // 353: isub
      // 354: aload 14
      // 356: getfield java/awt/Insets.left I
      // 359: isub
      // 35a: aload 3
      // 35b: getfield java/awt/Insets.right I
      // 35e: isub
      // 35f: aload 14
      // 361: getfield java/awt/Insets.right I
      // 364: goto 36b
      // 367: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36a: athrow
      // 36b: isub
      // 36c: goto 374
      // 36f: aload 15
      // 371: getfield java/awt/Dimension.width I
      // 374: iload 19
      // 376: bipush -1
      // 377: aload 2
      // 378: ifnonnull 3a3
      // 37b: if_icmpne 3a7
      // 37e: goto 385
      // 381: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 384: athrow
      // 385: iload 11
      // 387: aload 3
      // 388: getfield java/awt/Insets.top I
      // 38b: isub
      // 38c: aload 14
      // 38e: getfield java/awt/Insets.top I
      // 391: isub
      // 392: aload 3
      // 393: getfield java/awt/Insets.bottom I
      // 396: isub
      // 397: aload 14
      // 399: getfield java/awt/Insets.bottom I
      // 39c: goto 3a3
      // 39f: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a2: athrow
      // 3a3: isub
      // 3a4: goto 3ac
      // 3a7: aload 15
      // 3a9: getfield java/awt/Dimension.height I
      // 3ac: invokevirtual java/awt/Component.setBounds (IIII)V
      // 3af: aload 2
      // 3b0: ifnull 3cc
      // 3b3: aload 8
      // 3b5: aload 13
      // 3b7: invokevirtual com/_1.Q ()Lcom/E;
      // 3ba: invokeinterface com/E.J ()Ljava/lang/Object; 1
      // 3bf: checkcast java/awt/Rectangle
      // 3c2: invokevirtual java/awt/Component.setBounds (Ljava/awt/Rectangle;)V
      // 3c5: goto 3cc
      // 3c8: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3cb: athrow
      // 3cc: iinc 7 1
      // 3cf: aload 2
      // 3d0: ifnull 033
      // 3d3: return
   }

   protected int W(Component param1, _1 param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic F8.y ()[Ljava/lang/String;
      // 03: aload 1
      // 04: invokevirtual java/awt/Component.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 07: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 0a: istore 4
      // 0c: astore 3
      // 0d: aload 2
      // 0e: invokevirtual com/_1.r ()I
      // 11: sipush 8371
      // 14: ldc2_w 7981408119552749152
      // 17: invokestatic nP.b (IJ)I
      // 1a: aload 3
      // 1b: ifnonnull 5d
      // 1e: if_icmpne 45
      // 21: goto 28
      // 24: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27: athrow
      // 28: iload 4
      // 2a: aload 3
      // 2b: ifnonnull 40
      // 2e: goto 35
      // 31: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: ifeq 43
      // 38: goto 3f
      // 3b: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e: athrow
      // 3f: bipush 2
      // 40: goto 44
      // 43: bipush 4
      // 44: ireturn
      // 45: aload 2
      // 46: invokevirtual com/_1.r ()I
      // 49: aload 3
      // 4a: ifnonnull 81
      // 4d: sipush 26253
      // 50: ldc2_w 6556506702773315679
      // 53: invokestatic nP.b (IJ)I
      // 56: goto 5d
      // 59: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5c: athrow
      // 5d: if_icmpne 7d
      // 60: iload 4
      // 62: aload 3
      // 63: ifnonnull 78
      // 66: goto 6d
      // 69: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6c: athrow
      // 6d: ifeq 7b
      // 70: goto 77
      // 73: invokestatic nP.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 76: athrow
      // 77: bipush 4
      // 78: goto 7c
      // 7b: bipush 2
      // 7c: ireturn
      // 7d: aload 2
      // 7e: invokevirtual com/_1.r ()I
      // 81: ireturn
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[5];
      int var11 = 0;
      String var10 = "ñß·ç\u0098\u0013\u0087¡\u0000Ñ÷\u0004\u008dl\u0007x´\u0012\u0017\u008c5\u0013\bå_ï\u0004¤Cq\u0087!Ñ\u008b]\u009a´¢1·\u0010.=ù\rö¨òÀÏ\u0011\u0095ã¼\u0012\u0003\u0001»y«Cì\u0007Y\u001eµLDÞ-Ñ6\tÏýSvcâ¹Í>\u0007fîã,\u007fäE";
      int var12 = "ñß·ç\u0098\u0013\u0087¡\u0000Ñ÷\u0004\u008dl\u0007x´\u0012\u0017\u008c5\u0013\bå_ï\u0004¤Cq\u0087!Ñ\u008b]\u009a´¢1·\u0010.=ù\rö¨òÀÏ\u0011\u0095ã¼\u0012\u0003\u0001»y«Cì\u0007Y\u001eµLDÞ-Ñ6\tÏýSvcâ¹Í>\u0007fîã,\u007fäE"
         .length();
      char var9 = 'H';
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 88;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 70;
                        break;
                     case 1:
                        var58 = 35;
                        break;
                     case 2:
                        var58 = 87;
                        break;
                     case 3:
                        var58 = 8;
                        break;
                     case 4:
                        var58 = 27;
                        break;
                     case 5:
                        var58 = 106;
                        break;
                     default:
                        var58 = 6;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[5];
                     long var0 = 7011778143450801173L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "?;\u0012íö~ÌA³&\u0085\u0003ñg\u008a\u007f";
                     int var5 = "?;\u0012íö~ÌA³&\u0085\u0003ñg\u008a\u007f".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     d = var6;
                     e = new Integer[2];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "\u008cÔ\u0099L\u0017Ïo\tROÇ\u0007Öë(Ë+";
                  var12 = "\u008cÔ\u0099L\u0017Ïo\tROÇ\u0007Öë(Ë+".length();
                  var9 = 7;
                  var16 = -1;
            }

            var10000 = 50;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -21870) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 173;
               break;
            case 1:
               var10000 = 211;
               break;
            case 2:
               var10000 = 4;
               break;
            case 3:
               var10000 = 195;
               break;
            case 4:
               var10000 = 118;
               break;
            case 5:
               var10000 = 79;
               break;
            case 6:
               var10000 = 38;
               break;
            case 7:
               var10000 = 16;
               break;
            case 8:
               var10000 = 99;
               break;
            case 9:
               var10000 = 166;
               break;
            case 10:
               var10000 = 33;
               break;
            case 11:
               var10000 = 234;
               break;
            case 12:
               var10000 = 127;
               break;
            case 13:
               var10000 = 218;
               break;
            case 14:
               var10000 = 3;
               break;
            case 15:
               var10000 = 110;
               break;
            case 16:
               var10000 = 102;
               break;
            case 17:
               var10000 = 36;
               break;
            case 18:
               var10000 = 53;
               break;
            case 19:
               var10000 = 57;
               break;
            case 20:
               var10000 = 154;
               break;
            case 21:
               var10000 = 117;
               break;
            case 22:
               var10000 = 1;
               break;
            case 23:
               var10000 = 65;
               break;
            case 24:
               var10000 = 55;
               break;
            case 25:
               var10000 = 84;
               break;
            case 26:
               var10000 = 119;
               break;
            case 27:
               var10000 = 58;
               break;
            case 28:
               var10000 = 245;
               break;
            case 29:
               var10000 = 164;
               break;
            case 30:
               var10000 = 39;
               break;
            case 31:
               var10000 = 229;
               break;
            case 32:
               var10000 = 196;
               break;
            case 33:
               var10000 = 188;
               break;
            case 34:
               var10000 = 248;
               break;
            case 35:
               var10000 = 70;
               break;
            case 36:
               var10000 = 9;
               break;
            case 37:
               var10000 = 230;
               break;
            case 38:
               var10000 = 44;
               break;
            case 39:
               var10000 = 148;
               break;
            case 40:
               var10000 = 8;
               break;
            case 41:
               var10000 = 242;
               break;
            case 42:
               var10000 = 125;
               break;
            case 43:
               var10000 = 29;
               break;
            case 44:
               var10000 = 204;
               break;
            case 45:
               var10000 = 143;
               break;
            case 46:
               var10000 = 206;
               break;
            case 47:
               var10000 = 181;
               break;
            case 48:
               var10000 = 56;
               break;
            case 49:
               var10000 = 30;
               break;
            case 50:
               var10000 = 46;
               break;
            case 51:
               var10000 = 205;
               break;
            case 52:
               var10000 = 168;
               break;
            case 53:
               var10000 = 74;
               break;
            case 54:
               var10000 = 26;
               break;
            case 55:
               var10000 = 48;
               break;
            case 56:
               var10000 = 52;
               break;
            case 57:
               var10000 = 86;
               break;
            case 58:
               var10000 = 15;
               break;
            case 59:
               var10000 = 122;
               break;
            case 60:
               var10000 = 177;
               break;
            case 61:
               var10000 = 250;
               break;
            case 62:
               var10000 = 128;
               break;
            case 63:
               var10000 = 232;
               break;
            case 64:
               var10000 = 106;
               break;
            case 65:
               var10000 = 223;
               break;
            case 66:
               var10000 = 150;
               break;
            case 67:
               var10000 = 5;
               break;
            case 68:
               var10000 = 175;
               break;
            case 69:
               var10000 = 191;
               break;
            case 70:
               var10000 = 184;
               break;
            case 71:
               var10000 = 222;
               break;
            case 72:
               var10000 = 88;
               break;
            case 73:
               var10000 = 236;
               break;
            case 74:
               var10000 = 161;
               break;
            case 75:
               var10000 = 146;
               break;
            case 76:
               var10000 = 201;
               break;
            case 77:
               var10000 = 247;
               break;
            case 78:
               var10000 = 237;
               break;
            case 79:
               var10000 = 96;
               break;
            case 80:
               var10000 = 113;
               break;
            case 81:
               var10000 = 231;
               break;
            case 82:
               var10000 = 202;
               break;
            case 83:
               var10000 = 149;
               break;
            case 84:
               var10000 = 24;
               break;
            case 85:
               var10000 = 121;
               break;
            case 86:
               var10000 = 179;
               break;
            case 87:
               var10000 = 253;
               break;
            case 88:
               var10000 = 227;
               break;
            case 89:
               var10000 = 95;
               break;
            case 90:
               var10000 = 75;
               break;
            case 91:
               var10000 = 112;
               break;
            case 92:
               var10000 = 209;
               break;
            case 93:
               var10000 = 137;
               break;
            case 94:
               var10000 = 108;
               break;
            case 95:
               var10000 = 152;
               break;
            case 96:
               var10000 = 0;
               break;
            case 97:
               var10000 = 187;
               break;
            case 98:
               var10000 = 194;
               break;
            case 99:
               var10000 = 47;
               break;
            case 100:
               var10000 = 189;
               break;
            case 101:
               var10000 = 165;
               break;
            case 102:
               var10000 = 115;
               break;
            case 103:
               var10000 = 193;
               break;
            case 104:
               var10000 = 254;
               break;
            case 105:
               var10000 = 37;
               break;
            case 106:
               var10000 = 144;
               break;
            case 107:
               var10000 = 31;
               break;
            case 108:
               var10000 = 17;
               break;
            case 109:
               var10000 = 235;
               break;
            case 110:
               var10000 = 178;
               break;
            case 111:
               var10000 = 216;
               break;
            case 112:
               var10000 = 73;
               break;
            case 113:
               var10000 = 186;
               break;
            case 114:
               var10000 = 132;
               break;
            case 115:
               var10000 = 228;
               break;
            case 116:
               var10000 = 91;
               break;
            case 117:
               var10000 = 19;
               break;
            case 118:
               var10000 = 210;
               break;
            case 119:
               var10000 = 198;
               break;
            case 120:
               var10000 = 109;
               break;
            case 121:
               var10000 = 87;
               break;
            case 122:
               var10000 = 62;
               break;
            case 123:
               var10000 = 120;
               break;
            case 124:
               var10000 = 60;
               break;
            case 125:
               var10000 = 169;
               break;
            case 126:
               var10000 = 14;
               break;
            case 127:
               var10000 = 83;
               break;
            case 128:
               var10000 = 220;
               break;
            case 129:
               var10000 = 42;
               break;
            case 130:
               var10000 = 151;
               break;
            case 131:
               var10000 = 107;
               break;
            case 132:
               var10000 = 54;
               break;
            case 133:
               var10000 = 35;
               break;
            case 134:
               var10000 = 224;
               break;
            case 135:
               var10000 = 124;
               break;
            case 136:
               var10000 = 67;
               break;
            case 137:
               var10000 = 185;
               break;
            case 138:
               var10000 = 251;
               break;
            case 139:
               var10000 = 22;
               break;
            case 140:
               var10000 = 182;
               break;
            case 141:
               var10000 = 142;
               break;
            case 142:
               var10000 = 133;
               break;
            case 143:
               var10000 = 92;
               break;
            case 144:
               var10000 = 141;
               break;
            case 145:
               var10000 = 156;
               break;
            case 146:
               var10000 = 163;
               break;
            case 147:
               var10000 = 43;
               break;
            case 148:
               var10000 = 13;
               break;
            case 149:
               var10000 = 213;
               break;
            case 150:
               var10000 = 183;
               break;
            case 151:
               var10000 = 239;
               break;
            case 152:
               var10000 = 40;
               break;
            case 153:
               var10000 = 82;
               break;
            case 154:
               var10000 = 147;
               break;
            case 155:
               var10000 = 90;
               break;
            case 156:
               var10000 = 153;
               break;
            case 157:
               var10000 = 111;
               break;
            case 158:
               var10000 = 241;
               break;
            case 159:
               var10000 = 85;
               break;
            case 160:
               var10000 = 139;
               break;
            case 161:
               var10000 = 100;
               break;
            case 162:
               var10000 = 78;
               break;
            case 163:
               var10000 = 126;
               break;
            case 164:
               var10000 = 50;
               break;
            case 165:
               var10000 = 176;
               break;
            case 166:
               var10000 = 135;
               break;
            case 167:
               var10000 = 240;
               break;
            case 168:
               var10000 = 171;
               break;
            case 169:
               var10000 = 77;
               break;
            case 170:
               var10000 = 208;
               break;
            case 171:
               var10000 = 140;
               break;
            case 172:
               var10000 = 200;
               break;
            case 173:
               var10000 = 252;
               break;
            case 174:
               var10000 = 66;
               break;
            case 175:
               var10000 = 114;
               break;
            case 176:
               var10000 = 28;
               break;
            case 177:
               var10000 = 192;
               break;
            case 178:
               var10000 = 138;
               break;
            case 179:
               var10000 = 63;
               break;
            case 180:
               var10000 = 10;
               break;
            case 181:
               var10000 = 172;
               break;
            case 182:
               var10000 = 170;
               break;
            case 183:
               var10000 = 98;
               break;
            case 184:
               var10000 = 103;
               break;
            case 185:
               var10000 = 2;
               break;
            case 186:
               var10000 = 130;
               break;
            case 187:
               var10000 = 71;
               break;
            case 188:
               var10000 = 174;
               break;
            case 189:
               var10000 = 155;
               break;
            case 190:
               var10000 = 6;
               break;
            case 191:
               var10000 = 167;
               break;
            case 192:
               var10000 = 134;
               break;
            case 193:
               var10000 = 23;
               break;
            case 194:
               var10000 = 190;
               break;
            case 195:
               var10000 = 238;
               break;
            case 196:
               var10000 = 246;
               break;
            case 197:
               var10000 = 101;
               break;
            case 198:
               var10000 = 27;
               break;
            case 199:
               var10000 = 158;
               break;
            case 200:
               var10000 = 219;
               break;
            case 201:
               var10000 = 7;
               break;
            case 202:
               var10000 = 197;
               break;
            case 203:
               var10000 = 131;
               break;
            case 204:
               var10000 = 157;
               break;
            case 205:
               var10000 = 217;
               break;
            case 206:
               var10000 = 72;
               break;
            case 207:
               var10000 = 215;
               break;
            case 208:
               var10000 = 51;
               break;
            case 209:
               var10000 = 162;
               break;
            case 210:
               var10000 = 221;
               break;
            case 211:
               var10000 = 41;
               break;
            case 212:
               var10000 = 214;
               break;
            case 213:
               var10000 = 89;
               break;
            case 214:
               var10000 = 226;
               break;
            case 215:
               var10000 = 129;
               break;
            case 216:
               var10000 = 21;
               break;
            case 217:
               var10000 = 212;
               break;
            case 218:
               var10000 = 68;
               break;
            case 219:
               var10000 = 20;
               break;
            case 220:
               var10000 = 94;
               break;
            case 221:
               var10000 = 180;
               break;
            case 222:
               var10000 = 244;
               break;
            case 223:
               var10000 = 45;
               break;
            case 224:
               var10000 = 160;
               break;
            case 225:
               var10000 = 203;
               break;
            case 226:
               var10000 = 69;
               break;
            case 227:
               var10000 = 145;
               break;
            case 228:
               var10000 = 97;
               break;
            case 229:
               var10000 = 116;
               break;
            case 230:
               var10000 = 93;
               break;
            case 231:
               var10000 = 136;
               break;
            case 232:
               var10000 = 104;
               break;
            case 233:
               var10000 = 18;
               break;
            case 234:
               var10000 = 199;
               break;
            case 235:
               var10000 = 34;
               break;
            case 236:
               var10000 = 61;
               break;
            case 237:
               var10000 = 81;
               break;
            case 238:
               var10000 = 25;
               break;
            case 239:
               var10000 = 159;
               break;
            case 240:
               var10000 = 123;
               break;
            case 241:
               var10000 = 12;
               break;
            case 242:
               var10000 = 249;
               break;
            case 243:
               var10000 = 105;
               break;
            case 244:
               var10000 = 255;
               break;
            case 245:
               var10000 = 80;
               break;
            case 246:
               var10000 = 59;
               break;
            case 247:
               var10000 = 76;
               break;
            case 248:
               var10000 = 32;
               break;
            case 249:
               var10000 = 243;
               break;
            case 250:
               var10000 = 225;
               break;
            case 251:
               var10000 = 233;
               break;
            case 252:
               var10000 = 11;
               break;
            case 253:
               var10000 = 64;
               break;
            case 254:
               var10000 = 207;
               break;
            default:
               var10000 = 49;
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3794;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }
}





