package com.finalshell.core;

import com.finalshell.ui.model.CG3;
import com.finalshell.ui.model.NC3;
import com.finalshell.ui.model.PP;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.QS;
import java.awt.Component;
import java.awt.Insets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.Map.Entry;
import javax.swing.Icon;
import javax.swing.SwingConstants;

public final class Lq4 implements SwingConstants {
   public static int o;
   public static CG3 k;
   public static Insets h;
   public static int V;
   public static boolean d;
   public static int B;
   public static boolean q;
   public static Map E;
   public static Map a;
   public static Map L;
   public static Map U;
   public static String b;

   public static int r() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/QQ.N$arrky_4 ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 0
      // 04: getstatic com/finalshell/core/Lq4.o I
      // 07: aload 0
      // 08: ifnonnull 23
      // 0b: bipush -1
      // 0c: if_icmpeq 20
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: getstatic com/finalshell/core/Lq4.o I
      // 19: goto 36
      // 1c: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: invokestatic com/finalshell/core/Wx2.t ()Z
      // 23: aload 0
      // 24: ifnonnull 32
      // 27: ifeq 35
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 30: athrow
      // 31: bipush 4
      // 32: goto 36
      // 35: bipush 2
      // 36: ireturn
   }

   public static void p(int var0) {
      o = var0;
      n();
   }

   public static CG3 E$cG_3() {
      return k;
   }

   public static void p(CG3 var0) {
      k = var0;
      n();
   }

   public static Insets L() {
      return h;
   }

   public static void g(int var0) {
      H(var0, var0, var0, var0);
   }

   public static void H(int var0, int var1, int var2, int var3) {
      l(new Insets(var0, var1, var2, var3));
   }

   public static void l(Insets var0) {
      h = var0;
      n();
   }

   public static int J() {
      return V;
   }

   public static void P(int var0) {
      V = var0;
      n();
   }

   public static boolean d() {
      return d;
   }

   public static void Y(boolean var0) {
      d = var0;
      n();
   }

   public static int S() {
      return B;
   }

   public static void B(int var0) {
      try {
         B = var0;
         if (d) {
            n();
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }
   }

   public static boolean l() {
      return q;
   }

   public static void F(boolean var0) {
      q = var0;
   }

   public static void n() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/QQ.N$arrky_4 ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: new java/util/ArrayList
      // 06: dup
      // 07: invokespecial java/util/ArrayList.<init> ()V
      // 0a: astore 1
      // 0b: getstatic com/finalshell/core/Lq4.a Ljava/util/Map;
      // 0e: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 13: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 18: astore 2
      // 19: astore 0
      // 1a: aload 2
      // 1b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 20: ifeq 72
      // 23: aload 2
      // 24: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 29: checkcast java/util/Map$Entry
      // 2c: astore 3
      // 2d: aload 3
      // 2e: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 33: checkcast com/finalshell/ui/panel/Qt2
      // 36: astore 4
      // 38: aload 1
      // 39: aload 4
      // 3b: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 40: aload 0
      // 41: ifnonnull 86
      // 44: aload 0
      // 45: ifnonnull 68
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4e: athrow
      // 4f: ifne 6e
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 58: athrow
      // 59: aload 1
      // 5a: aload 4
      // 5c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 67: athrow
      // 68: pop
      // 69: aload 4
      // 6b: invokevirtual com/finalshell/ui/panel/Qt2.revalidate ()V
      // 6e: aload 0
      // 6f: ifnull 1a
      // 72: getstatic com/finalshell/core/Lq4.L Ljava/util/Map;
      // 75: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 7a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 7f: astore 2
      // 80: aload 2
      // 81: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 86: ifeq a3
      // 89: aload 2
      // 8a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8f: checkcast java/util/Map$Entry
      // 92: astore 3
      // 93: aload 3
      // 94: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 99: checkcast com/finalshell/core/F_
      // 9c: invokevirtual com/finalshell/core/F_.w ()V
      // 9f: aload 0
      // a0: ifnull 80
      // a3: return
   }

   public static void E$void() {
      Ky4[] var10000 = com.finalshell.ui.panel.QQ.N$arrky_4();
      Iterator var1 = a.entrySet().iterator();
      Ky4[] var0 = var10000;

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();

         try {
            ((QS)var2.getKey()).V();
            if (var0 == null && var0 == null) {
               continue;
            }
            break;
         } catch (RuntimeException var3) {
            throw a(var3);
         }
      }

      for (Entry var4 : U.entrySet()) {
         ((com.finalshell.ui.panel.QQ)var4.getKey()).l();
         if (var0 != null) {
            break;
         }
      }
   }

   public static com.finalshell.ui.panel.QQ p(String var0) {
      return Q(null, new com.finalshell.ui.panel.O(var0), PP.information.S());
   }

   public static com.finalshell.ui.panel.QQ b(String var0, Icon var1) {
      return Q(null, new com.finalshell.ui.panel.O(var0), var1);
   }

   public static com.finalshell.ui.panel.QQ K(Component var0, String var1) {
      return Q(var0, new com.finalshell.ui.panel.O(var1), PP.information.S());
   }

   public static com.finalshell.ui.panel.QQ C(Component var0, String var1, Icon var2) {
      return Q(var0, new com.finalshell.ui.panel.O(var1), var2);
   }

   public static com.finalshell.ui.panel.QQ h(Component var0) {
      return Q(null, var0, PP.information.S());
   }

   public static com.finalshell.ui.panel.QQ J(Component var0, Icon var1) {
      return Q(null, var0, var1);
   }

   public static com.finalshell.ui.panel.QQ U(Component var0, Component var1) {
      return Q(var0, var1, PP.information.S());
   }

   public static com.finalshell.ui.panel.QQ Q(Component var0, Component var1, Icon var2) {
      com.finalshell.ui.panel.QQ var3 = new com.finalshell.ui.panel.QQ();
      var3.A(var2);
      var3.Z(var1);
      return o(var0, var3);
   }

   public static com.finalshell.ui.panel.QQ n(String var0, NC3[] var1) {
      return k(null, new com.finalshell.ui.panel.O(var0), PP.information.S(), var1);
   }

   public static com.finalshell.ui.panel.QQ p(String var0, Icon var1, NC3[] var2) {
      return k(null, new com.finalshell.ui.panel.O(var0), var1, var2);
   }

   public static com.finalshell.ui.panel.QQ q(Component var0, String var1, NC3[] var2) {
      return k(var0, new com.finalshell.ui.panel.O(var1), PP.information.S(), var2);
   }

   public static com.finalshell.ui.panel.QQ m(Component var0, String var1, Icon var2, NC3[] var3) {
      return k(var0, new com.finalshell.ui.panel.O(var1), var2, var3);
   }

   public static com.finalshell.ui.panel.QQ J(Component var0, NC3[] var1) {
      return k(null, var0, PP.information.S(), var1);
   }

   public static com.finalshell.ui.panel.QQ r(Component var0, Icon var1, NC3[] var2) {
      return k(null, var0, var1, var2);
   }

   public static com.finalshell.ui.panel.QQ l(Component var0, Component var1, NC3[] var2) {
      return k(var0, var1, PP.information.S(), var2);
   }

   public static com.finalshell.ui.panel.QQ k(Component var0, Component var1, Icon var2, NC3[] var3) {
      com.finalshell.ui.panel.QQ var4 = new com.finalshell.ui.panel.QQ();
      var4.A(var2);
      var4.Z(var1);
      var4.q(var3);
      return o(var0, var4);
   }

   public static com.finalshell.ui.panel.QQ L(com.finalshell.ui.panel.QQ var0) {
      return o(null, var0);
   }

   public static com.finalshell.ui.panel.QQ o(Component var0, com.finalshell.ui.panel.QQ var1) {
      F_ var2 = I(var0);
      U.put(var1, FN.L(var0));
      var1.e(new Eq4(var1, var2));
      var1.M(var0, 0, 0);
      var2.V(var1.W());
      return var1;
   }

   public static F_ I(Component param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/QQ.N$arrky_4 ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 14
      // 09: ifnull 33
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: aload 0
      // 14: aload 1
      // 15: ifnonnull 2d
      // 18: invokevirtual java/awt/Component.isShowing ()Z
      // 1b: ifeq 33
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 24: athrow
      // 25: aload 0
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2c: athrow
      // 2d: invokestatic com/finalshell/core/FN.L (Ljava/awt/Component;)Ljava/awt/Window;
      // 30: goto 34
      // 33: aconst_null
      // 34: astore 2
      // 35: aload 2
      // 36: aload 1
      // 37: ifnonnull 45
      // 3a: ifnull 4e
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 43: athrow
      // 44: aload 2
      // 45: invokevirtual java/awt/Window.getGraphicsConfiguration ()Ljava/awt/GraphicsConfiguration;
      // 48: invokevirtual java/awt/GraphicsConfiguration.getDevice ()Ljava/awt/GraphicsDevice;
      // 4b: goto 54
      // 4e: invokestatic java/awt/GraphicsEnvironment.getLocalGraphicsEnvironment ()Ljava/awt/GraphicsEnvironment;
      // 51: invokevirtual java/awt/GraphicsEnvironment.getDefaultScreenDevice ()Ljava/awt/GraphicsDevice;
      // 54: astore 3
      // 55: getstatic com/finalshell/core/Lq4.L Ljava/util/Map;
      // 58: aload 3
      // 59: aload 1
      // 5a: ifnonnull 89
      // 5d: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 62: ifne 85
      // 65: goto 6c
      // 68: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6b: athrow
      // 6c: getstatic com/finalshell/core/Lq4.L Ljava/util/Map;
      // 6f: aload 3
      // 70: new com/finalshell/core/F_
      // 73: dup
      // 74: aload 3
      // 75: invokespecial com/finalshell/core/F_.<init> (Ljava/awt/GraphicsDevice;)V
      // 78: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 7d: pop
      // 7e: goto 85
      // 81: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 84: athrow
      // 85: getstatic com/finalshell/core/Lq4.L Ljava/util/Map;
      // 88: aload 3
      // 89: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 8e: checkcast com/finalshell/core/F_
      // 91: areturn
   }

   public static QS u(String var0) {
      return s(FN.N(), new com.finalshell.ui.panel.O(var0), PP.information.S());
   }

   public static QS J(String var0, Icon var1) {
      return s(FN.N(), new com.finalshell.ui.panel.O(var0), var1);
   }

   public static QS n(Component var0, String var1) {
      return s(var0, new com.finalshell.ui.panel.O(var1), PP.information.S());
   }

   public static QS z(Component var0, String var1, Icon var2) {
      return s(var0, new com.finalshell.ui.panel.O(var1), var2);
   }

   public static QS r(Component var0) {
      return s(FN.N(), var0, PP.information.S());
   }

   public static QS R(Component var0, Icon var1) {
      return s(FN.N(), var0, var1);
   }

   public static QS K(Component var0, Component var1) {
      return s(var0, var1, PP.information.S());
   }

   public static QS s(Component var0, Component var1, Icon var2) {
      QS var3 = new QS();
      var3.T(var2);
      var3.M(var1);
      return Q(var0, var3);
   }

   public static QS H(String var0, NC3[] var1) {
      return c(FN.N(), new com.finalshell.ui.panel.O(var0), PP.information.S(), var1);
   }

   public static QS s(String var0, Icon var1, NC3[] var2) {
      return c(FN.N(), new com.finalshell.ui.panel.O(var0), var1, var2);
   }

   public static QS m(Component var0, String var1, NC3[] var2) {
      return c(var0, new com.finalshell.ui.panel.O(var1), PP.information.S(), var2);
   }

   public static QS r(Component var0, String var1, Icon var2, NC3[] var3) {
      return c(var0, new com.finalshell.ui.panel.O(var1), var2, var3);
   }

   public static QS E(Component var0, NC3[] var1) {
      return c(FN.N(), var0, PP.information.S(), var1);
   }

   public static QS Y(Component var0, Icon var1, NC3[] var2) {
      return c(FN.N(), var0, var1, var2);
   }

   public static QS m(Component var0, Component var1, NC3[] var2) {
      return c(var0, var1, PP.information.S(), var2);
   }

   public static QS c(Component var0, Component var1, Icon var2, NC3[] var3) {
      QS var4 = new QS();
      var4.T(var2);
      var4.M(var1);
      var4.a(var3);
      return Q(var0, var4);
   }

   public static QS V(QS var0) {
      return Q(FN.N(), var0);
   }

   public static QS Q(Component param0, QS param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/QQ.N$arrky_4 ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 23
      // 09: ifnonnull 22
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: new java/lang/RuntimeException
      // 16: dup
      // 17: getstatic com/finalshell/core/Lq4.b Ljava/lang/String;
      // 1a: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 1d: athrow
      // 1e: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 21: athrow
      // 22: aload 0
      // 23: invokestatic com/finalshell/core/NC.n (Ljava/awt/Component;)Lcom/finalshell/ui/panel/Qt2;
      // 26: astore 3
      // 27: getstatic com/finalshell/core/Lq4.E Ljava/util/Map;
      // 2a: aload 2
      // 2b: ifnonnull 63
      // 2e: aload 3
      // 2f: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 34: ifne 59
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/Lq4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d: athrow
      // 3e: new com/finalshell/core/To2
      // 41: dup
      // 42: invokespecial com/finalshell/core/To2.<init> ()V
      // 45: astore 4
      // 47: aload 3
      // 48: aload 4
      // 4a: invokevirtual com/finalshell/ui/panel/Qt2.V (Ljava/awt/LayoutManager;)V
      // 4d: getstatic com/finalshell/core/Lq4.E Ljava/util/Map;
      // 50: aload 3
      // 51: aload 4
      // 53: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 58: pop
      // 59: getstatic com/finalshell/core/Lq4.a Ljava/util/Map;
      // 5c: aload 1
      // 5d: aload 3
      // 5e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 63: pop
      // 64: aload 1
      // 65: new com/finalshell/core/EB3
      // 68: dup
      // 69: aload 1
      // 6a: invokespecial com/finalshell/core/EB3.<init> (Lcom/finalshell/ui/panel/QS;)V
      // 6d: invokevirtual com/finalshell/ui/panel/QS.W (Lcom/finalshell/core/Cg4;)V
      // 70: aload 1
      // 71: aload 0
      // 72: invokevirtual com/finalshell/ui/panel/QS.l (Ljava/awt/Component;)V
      // 75: aload 1
      // 76: areturn
   }

   static {
      __vfClinit__();
   }

   public static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0002h0x4f\u0010% ;eq0\u0010%i7f4f\u000e?n1e&5Y\"oun85\t:a,*8(\u00173rud>2\u00100i6k%/\u00168!".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 37;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 37;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 115;
               break;
            case 1:
               var37 = 37;
               break;
            case 2:
               var37 = 112;
               break;
            case 3:
               var37 = 47;
               break;
            case 4:
               var37 = 116;
               break;
            case 5:
               var37 = 99;
               break;
            default:
               var37 = 92;
         }
      } else {
         var25 = 37;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            b = var29;
            long var10 = 4060033758317710139L;
            long[] var9 = new long[2];
            int var12 = 0;
            String var13 = "õ\u0013x74\u009f\u000b?¸Ó'%4\u009f\u000b1";
            int var14 = "õ\u0013x74\u009f\u000b?¸Ó'%4\u009f\u000b1".length();
            byte var11 = 0;

            do {
               var21 = var11;
               var11 += 8;
               byte[] var15 = var13.substring(var21, var11).getBytes("ISO-8859-1");
               var21 = var12++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var10;
               byte var30 = -1;
               var9[var21] = var35;
            } while (var11 < var14);

            o = -1;
            k = CG3.stack;
            h = new Insets(0, 0, 0, 0);
            V = (int)var9[1];
            d = true;
            B = (int)var9[0];
            q = true;
            E = new WeakHashMap();
            a = new WeakHashMap();
            L = new HashMap(1);
            U = new WeakHashMap();
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 37;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 115;
               break;
            case 1:
               var37 = 37;
               break;
            case 2:
               var37 = 112;
               break;
            case 3:
               var37 = 47;
               break;
            case 4:
               var37 = 116;
               break;
            case 5:
               var37 = 99;
               break;
            default:
               var37 = 92;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 115;
                  break;
               case 1:
                  var37 = 37;
                  break;
               case 2:
                  var37 = 112;
                  break;
               case 3:
                  var37 = 47;
                  break;
               case 4:
                  var37 = 116;
                  break;
               case 5:
                  var37 = 99;
                  break;
               default:
                  var37 = 92;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               b = var27;
               long var1 = 4060033758317710139L;
               long[] var0 = new long[2];
               int var4 = 0;
               String var5 = "õ\u0013x74\u009f\u000b?¸Ó'%4\u009f\u000b1";
               int var6 = "õ\u0013x74\u009f\u000b?¸Ó'%4\u009f\u000b1".length();
               byte var3 = 0;

               do {
                  var18 = var3;
                  var3 += 8;
                  byte[] var7 = var5.substring(var18, var3).getBytes("ISO-8859-1");
                  var18 = var4++;
                  long var34 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var1;
                  byte var28 = -1;
                  var0[var18] = var34;
               } while (var3 < var6);

               o = -1;
               k = CG3.stack;
               h = new Insets(0, 0, 0, 0);
               V = (int)var0[1];
               d = true;
               B = (int)var0[0];
               q = true;
               E = new WeakHashMap();
               a = new WeakHashMap();
               L = new HashMap(1);
               U = new WeakHashMap();
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 115;
                  break;
               case 1:
                  var37 = 37;
                  break;
               case 2:
                  var37 = 112;
                  break;
               case 3:
                  var37 = 47;
                  break;
               case 4:
                  var37 = 116;
                  break;
               case 5:
                  var37 = 99;
                  break;
               default:
                  var37 = 92;
            }
         }
      }
   }
}





