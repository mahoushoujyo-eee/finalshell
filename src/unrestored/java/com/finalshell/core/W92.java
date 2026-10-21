package com.finalshell.core;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.Map.Entry;
import javax.swing.AbstractButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.text.JTextComponent;

public class W92 {
   public static Map G;
   public static Map r;
   public static boolean T;
   public static boolean i;
   public static String[] a;
   public static String[] b;

   public static void A() {
      String var0 = Cl4_2.I();

      boolean var10000;
      label20: {
         try {
            var10000 = i;
            if (var0 != null) {
               break label20;
            }

            if (i) {
               return;
            }
         } catch (RuntimeException var1) {
            throw a(var1);
         }

         var10000 = true;
      }

      i = var10000;
      d(AbstractButton.class, IY.class);
      d(JComboBox.class, IQ.class);
      d(JSlider.class, Ia2.class);
      d(JPasswordField.class, Ig2.class);
      d(JTextComponent.class, IH.class);
      d(JScrollBar.class, Ix2.class);
      d(JTabbedPane.class, Ir2.class);
      d(JRootPane.class, Ie2.class);
   }

   public static boolean c() {
      return T;
   }

   public static void z(boolean var0) {
      T = var0;
   }

   public static boolean w(JComponent var0) {
      return o(var0.getClass());
   }

   public static boolean o(java.lang.Class var0) {
      try {
         if (O(var0) != null) {
            return true;
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }

      return false;
   }

   public static void d(java.lang.Class var0, java.lang.Class var1) {
      G.put(var0, var1);
   }

   public static java.lang.Class O(java.lang.Class param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: getstatic com/finalshell/core/W92.G Ljava/util/Map;
      // 06: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 0b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 10: astore 2
      // 11: astore 1
      // 12: aload 2
      // 13: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 18: ifeq 50
      // 1b: aload 2
      // 1c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21: checkcast java/lang/Class
      // 24: astore 3
      // 25: aload 3
      // 26: aload 1
      // 27: ifnonnull 4b
      // 2a: aload 0
      // 2b: invokestatic com/finalshell/core/Kp2.d (Ljava/lang/Class;Ljava/lang/Class;)Z
      // 2e: ifeq 4c
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: getstatic com/finalshell/core/W92.G Ljava/util/Map;
      // 3b: aload 3
      // 3c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 41: checkcast java/lang/Class
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: areturn
      // 4c: aload 1
      // 4d: ifnull 12
      // 50: aconst_null
      // 51: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static IB c(AS var0) {
      Throwable var9;
      String var10000 = Cl4_2.I();
      java.lang.Class var2 = O(var0.l().getClass());
      String var1 = var10000;

      label41: {
         label40: {
            try {
               var10000 = (String)(var2);
               if (var1 != null) {
                  break label40;
               }

               if (var2 == null) {
                  return null;
               }
            } catch (Throwable var7) {
               throw a(var7);
            }

            try {
               var10000 = (String)Kp2.f(var2, new Object[]{var0});
            } catch (Throwable var6) {
               var9 = var6;
               boolean var10001 = false;
               break label41;
            }
         }

         try {
            return (IB)var10000;
         } catch (Throwable var5) {
            var9 = var5;
            boolean var10 = false;
         }
      }

      Throwable var3 = var9;

      try {
         if (T) {
            throw new RuntimeException(a(23784, 16839) + var2.getCanonicalName() + ".", var3);
         } else {
            return null;
         }
      } catch (Throwable var4) {
         throw a(var4);
      }
   }

   public static void C(AS param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokestatic com/finalshell/core/W92.c (Lcom/finalshell/core/AS;)Lcom/finalshell/core/IB;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 1
      // 0a: ifnonnull 27
      // 0d: aload 2
      // 0e: ifnull 2b
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: invokevirtual com/finalshell/core/AS.l ()Ljavax/swing/JComponent;
      // 1c: aload 2
      // 1d: invokestatic com/finalshell/core/W92.J (Ljavax/swing/JComponent;Lcom/finalshell/core/IB;)V
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 1
      // 28: ifnull 73
      // 2b: getstatic com/finalshell/core/W92.T Z
      // 2e: ifeq 73
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: new java/lang/RuntimeException
      // 3b: dup
      // 3c: new java/lang/StringBuilder
      // 3f: dup
      // 40: invokespecial java/lang/StringBuilder.<init> ()V
      // 43: sipush 23785
      // 46: sipush 2016
      // 49: invokestatic com/finalshell/core/W92.a (II)Ljava/lang/String;
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: aload 0
      // 50: invokevirtual com/finalshell/core/AS.l ()Ljavax/swing/JComponent;
      // 53: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 56: invokevirtual java/lang/Class.getCanonicalName ()Ljava/lang/String;
      // 59: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5c: sipush 23791
      // 5f: sipush -7383
      // 62: invokestatic com/finalshell/core/W92.a (II)Ljava/lang/String;
      // 65: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 68: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6b: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 6e: athrow
      // 6f: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: return
   }

   public static void J(JComponent var0, IB var1) {
      M(var0);
      var0.putClientProperty(a(23788, -18161), var1);
      r.put(var0, new WeakReference<>(var1));
   }

   public static void C(JComponent param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: getstatic com/finalshell/core/W92.r Ljava/util/Map;
      // 06: aload 0
      // 07: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c: checkcast java/lang/ref/WeakReference
      // 0f: astore 2
      // 10: astore 1
      // 11: aload 2
      // 12: aload 1
      // 13: ifnonnull 2b
      // 16: ifnull 31
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 2
      // 21: invokevirtual java/lang/ref/WeakReference.get ()Ljava/lang/Object;
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: checkcast com/finalshell/core/IB
      // 2e: goto 32
      // 31: aconst_null
      // 32: astore 3
      // 33: aload 3
      // 34: aload 1
      // 35: ifnonnull 43
      // 38: ifnull 4a
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 3
      // 43: invokevirtual com/finalshell/core/IB.E ()V
      // 46: aload 1
      // 47: ifnull 89
      // 4a: getstatic com/finalshell/core/W92.T Z
      // 4d: ifeq 89
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: new java/lang/RuntimeException
      // 5a: dup
      // 5b: new java/lang/StringBuilder
      // 5e: dup
      // 5f: invokespecial java/lang/StringBuilder.<init> ()V
      // 62: sipush 23790
      // 65: sipush -26204
      // 68: invokestatic com/finalshell/core/W92.a (II)Ljava/lang/String;
      // 6b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e: aload 0
      // 6f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 72: sipush 23786
      // 75: sipush 9394
      // 78: invokestatic com/finalshell/core/W92.a (II)Ljava/lang/String;
      // 7b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 81: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 84: athrow
      // 85: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: return
   }

   public static void y() {
      String var10000 = Cl4_2.I();
      Iterator var1 = r.entrySet().iterator();
      String var0 = var10000;

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         h((JComponent)var2.getKey());
         if (var0 != null) {
            break;
         }
      }
   }

   public static void h(JComponent param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: getstatic com/finalshell/core/W92.r Ljava/util/Map;
      // 06: aload 0
      // 07: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c: checkcast java/lang/ref/WeakReference
      // 0f: astore 2
      // 10: astore 1
      // 11: aload 2
      // 12: aload 1
      // 13: ifnonnull 2b
      // 16: ifnull 31
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 2
      // 21: invokevirtual java/lang/ref/WeakReference.get ()Ljava/lang/Object;
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: checkcast com/finalshell/core/IB
      // 2e: goto 32
      // 31: aconst_null
      // 32: astore 3
      // 33: aload 3
      // 34: aload 1
      // 35: ifnonnull 43
      // 38: ifnull 4b
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 3
      // 43: bipush 0
      // 44: invokevirtual com/finalshell/core/IB.r (Z)V
      // 47: aload 1
      // 48: ifnull 8a
      // 4b: getstatic com/finalshell/core/W92.T Z
      // 4e: ifeq 8a
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: new java/lang/RuntimeException
      // 5b: dup
      // 5c: new java/lang/StringBuilder
      // 5f: dup
      // 60: invokespecial java/lang/StringBuilder.<init> ()V
      // 63: sipush 23789
      // 66: sipush 14205
      // 69: invokestatic com/finalshell/core/W92.a (II)Ljava/lang/String;
      // 6c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6f: aload 0
      // 70: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 73: sipush 23787
      // 76: sipush 7747
      // 79: invokestatic com/finalshell/core/W92.a (II)Ljava/lang/String;
      // 7c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 82: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 85: athrow
      // 86: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: return
   }

   public static void M(JComponent param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: getstatic com/finalshell/core/W92.r Ljava/util/Map;
      // 06: aload 0
      // 07: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c: checkcast java/lang/ref/WeakReference
      // 0f: astore 2
      // 10: astore 1
      // 11: aload 2
      // 12: aload 1
      // 13: ifnonnull 2b
      // 16: ifnull 31
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 2
      // 21: invokevirtual java/lang/ref/WeakReference.get ()Ljava/lang/Object;
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: checkcast com/finalshell/core/IB
      // 2e: goto 32
      // 31: aconst_null
      // 32: astore 3
      // 33: aload 3
      // 34: aload 1
      // 35: ifnonnull 64
      // 38: ifnull 65
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 3
      // 43: invokevirtual com/finalshell/core/IB.c ()V
      // 46: aload 0
      // 47: sipush 23777
      // 4a: sipush -25066
      // 4d: invokestatic com/finalshell/core/W92.a (II)Ljava/lang/String;
      // 50: aconst_null
      // 51: invokevirtual javax/swing/JComponent.putClientProperty (Ljava/lang/Object;Ljava/lang/Object;)V
      // 54: getstatic com/finalshell/core/W92.r Ljava/util/Map;
      // 57: aload 0
      // 58: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5d: goto 64
      // 60: invokestatic com/finalshell/core/W92.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: pop
      // 65: return
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 23785) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 56;
               break;
            case 1:
               var10000 = 155;
               break;
            case 2:
               var10000 = 73;
               break;
            case 3:
               var10000 = 233;
               break;
            case 4:
               var10000 = 108;
               break;
            case 5:
               var10000 = 106;
               break;
            case 6:
               var10000 = 191;
               break;
            case 7:
               var10000 = 111;
               break;
            case 8:
               var10000 = 223;
               break;
            case 9:
               var10000 = 175;
               break;
            case 10:
               var10000 = 244;
               break;
            case 11:
               var10000 = 67;
               break;
            case 12:
               var10000 = 50;
               break;
            case 13:
               var10000 = 161;
               break;
            case 14:
               var10000 = 134;
               break;
            case 15:
               var10000 = 220;
               break;
            case 16:
               var10000 = 19;
               break;
            case 17:
               var10000 = 83;
               break;
            case 18:
               var10000 = 70;
               break;
            case 19:
               var10000 = 126;
               break;
            case 20:
               var10000 = 143;
               break;
            case 21:
               var10000 = 66;
               break;
            case 22:
               var10000 = 193;
               break;
            case 23:
               var10000 = 195;
               break;
            case 24:
               var10000 = 151;
               break;
            case 25:
               var10000 = 249;
               break;
            case 26:
               var10000 = 85;
               break;
            case 27:
               var10000 = 232;
               break;
            case 28:
               var10000 = 217;
               break;
            case 29:
               var10000 = 27;
               break;
            case 30:
               var10000 = 229;
               break;
            case 31:
               var10000 = 64;
               break;
            case 32:
               var10000 = 3;
               break;
            case 33:
               var10000 = 180;
               break;
            case 34:
               var10000 = 142;
               break;
            case 35:
               var10000 = 197;
               break;
            case 36:
               var10000 = 177;
               break;
            case 37:
               var10000 = 62;
               break;
            case 38:
               var10000 = 162;
               break;
            case 39:
               var10000 = 78;
               break;
            case 40:
               var10000 = 216;
               break;
            case 41:
               var10000 = 250;
               break;
            case 42:
               var10000 = 167;
               break;
            case 43:
               var10000 = 166;
               break;
            case 44:
               var10000 = 29;
               break;
            case 45:
               var10000 = 77;
               break;
            case 46:
               var10000 = 196;
               break;
            case 47:
               var10000 = 89;
               break;
            case 48:
               var10000 = 230;
               break;
            case 49:
               var10000 = 88;
               break;
            case 50:
               var10000 = 104;
               break;
            case 51:
               var10000 = 235;
               break;
            case 52:
               var10000 = 181;
               break;
            case 53:
               var10000 = 14;
               break;
            case 54:
               var10000 = 81;
               break;
            case 55:
               var10000 = 103;
               break;
            case 56:
               var10000 = 93;
               break;
            case 57:
               var10000 = 12;
               break;
            case 58:
               var10000 = 218;
               break;
            case 59:
               var10000 = 96;
               break;
            case 60:
               var10000 = 98;
               break;
            case 61:
               var10000 = 127;
               break;
            case 62:
               var10000 = 5;
               break;
            case 63:
               var10000 = 240;
               break;
            case 64:
               var10000 = 253;
               break;
            case 65:
               var10000 = 13;
               break;
            case 66:
               var10000 = 234;
               break;
            case 67:
               var10000 = 202;
               break;
            case 68:
               var10000 = 84;
               break;
            case 69:
               var10000 = 245;
               break;
            case 70:
               var10000 = 6;
               break;
            case 71:
               var10000 = 39;
               break;
            case 72:
               var10000 = 213;
               break;
            case 73:
               var10000 = 219;
               break;
            case 74:
               var10000 = 107;
               break;
            case 75:
               var10000 = 10;
               break;
            case 76:
               var10000 = 105;
               break;
            case 77:
               var10000 = 71;
               break;
            case 78:
               var10000 = 226;
               break;
            case 79:
               var10000 = 221;
               break;
            case 80:
               var10000 = 183;
               break;
            case 81:
               var10000 = 207;
               break;
            case 82:
               var10000 = 72;
               break;
            case 83:
               var10000 = 82;
               break;
            case 84:
               var10000 = 205;
               break;
            case 85:
               var10000 = 61;
               break;
            case 86:
               var10000 = 237;
               break;
            case 87:
               var10000 = 110;
               break;
            case 88:
               var10000 = 159;
               break;
            case 89:
               var10000 = 114;
               break;
            case 90:
               var10000 = 164;
               break;
            case 91:
               var10000 = 204;
               break;
            case 92:
               var10000 = 184;
               break;
            case 93:
               var10000 = 238;
               break;
            case 94:
               var10000 = 42;
               break;
            case 95:
               var10000 = 74;
               break;
            case 96:
               var10000 = 255;
               break;
            case 97:
               var10000 = 165;
               break;
            case 98:
               var10000 = 68;
               break;
            case 99:
               var10000 = 139;
               break;
            case 100:
               var10000 = 80;
               break;
            case 101:
               var10000 = 144;
               break;
            case 102:
               var10000 = 251;
               break;
            case 103:
               var10000 = 239;
               break;
            case 104:
               var10000 = 141;
               break;
            case 105:
               var10000 = 75;
               break;
            case 106:
               var10000 = 109;
               break;
            case 107:
               var10000 = 40;
               break;
            case 108:
               var10000 = 154;
               break;
            case 109:
               var10000 = 158;
               break;
            case 110:
               var10000 = 20;
               break;
            case 111:
               var10000 = 188;
               break;
            case 112:
               var10000 = 125;
               break;
            case 113:
               var10000 = 208;
               break;
            case 114:
               var10000 = 45;
               break;
            case 115:
               var10000 = 210;
               break;
            case 116:
               var10000 = 24;
               break;
            case 117:
               var10000 = 150;
               break;
            case 118:
               var10000 = 8;
               break;
            case 119:
               var10000 = 163;
               break;
            case 120:
               var10000 = 174;
               break;
            case 121:
               var10000 = 99;
               break;
            case 122:
               var10000 = 135;
               break;
            case 123:
               var10000 = 228;
               break;
            case 124:
               var10000 = 133;
               break;
            case 125:
               var10000 = 94;
               break;
            case 126:
               var10000 = 51;
               break;
            case 127:
               var10000 = 254;
               break;
            case 128:
               var10000 = 35;
               break;
            case 129:
               var10000 = 65;
               break;
            case 130:
               var10000 = 30;
               break;
            case 131:
               var10000 = 16;
               break;
            case 132:
               var10000 = 187;
               break;
            case 133:
               var10000 = 215;
               break;
            case 134:
               var10000 = 49;
               break;
            case 135:
               var10000 = 132;
               break;
            case 136:
               var10000 = 172;
               break;
            case 137:
               var10000 = 179;
               break;
            case 138:
               var10000 = 102;
               break;
            case 139:
               var10000 = 53;
               break;
            case 140:
               var10000 = 48;
               break;
            case 141:
               var10000 = 1;
               break;
            case 142:
               var10000 = 212;
               break;
            case 143:
               var10000 = 157;
               break;
            case 144:
               var10000 = 241;
               break;
            case 145:
               var10000 = 112;
               break;
            case 146:
               var10000 = 194;
               break;
            case 147:
               var10000 = 22;
               break;
            case 148:
               var10000 = 145;
               break;
            case 149:
               var10000 = 203;
               break;
            case 150:
               var10000 = 58;
               break;
            case 151:
               var10000 = 11;
               break;
            case 152:
               var10000 = 182;
               break;
            case 153:
               var10000 = 26;
               break;
            case 154:
               var10000 = 57;
               break;
            case 155:
               var10000 = 189;
               break;
            case 156:
               var10000 = 149;
               break;
            case 157:
               var10000 = 211;
               break;
            case 158:
               var10000 = 41;
               break;
            case 159:
               var10000 = 129;
               break;
            case 160:
               var10000 = 15;
               break;
            case 161:
               var10000 = 116;
               break;
            case 162:
               var10000 = 169;
               break;
            case 163:
               var10000 = 131;
               break;
            case 164:
               var10000 = 160;
               break;
            case 165:
               var10000 = 113;
               break;
            case 166:
               var10000 = 185;
               break;
            case 167:
               var10000 = 95;
               break;
            case 168:
               var10000 = 18;
               break;
            case 169:
               var10000 = 124;
               break;
            case 170:
               var10000 = 23;
               break;
            case 171:
               var10000 = 36;
               break;
            case 172:
               var10000 = 246;
               break;
            case 173:
               var10000 = 200;
               break;
            case 174:
               var10000 = 227;
               break;
            case 175:
               var10000 = 69;
               break;
            case 176:
               var10000 = 76;
               break;
            case 177:
               var10000 = 192;
               break;
            case 178:
               var10000 = 28;
               break;
            case 179:
               var10000 = 79;
               break;
            case 180:
               var10000 = 224;
               break;
            case 181:
               var10000 = 46;
               break;
            case 182:
               var10000 = 171;
               break;
            case 183:
               var10000 = 9;
               break;
            case 184:
               var10000 = 100;
               break;
            case 185:
               var10000 = 214;
               break;
            case 186:
               var10000 = 186;
               break;
            case 187:
               var10000 = 168;
               break;
            case 188:
               var10000 = 92;
               break;
            case 189:
               var10000 = 34;
               break;
            case 190:
               var10000 = 152;
               break;
            case 191:
               var10000 = 137;
               break;
            case 192:
               var10000 = 52;
               break;
            case 193:
               var10000 = 54;
               break;
            case 194:
               var10000 = 122;
               break;
            case 195:
               var10000 = 117;
               break;
            case 196:
               var10000 = 136;
               break;
            case 197:
               var10000 = 118;
               break;
            case 198:
               var10000 = 44;
               break;
            case 199:
               var10000 = 225;
               break;
            case 200:
               var10000 = 243;
               break;
            case 201:
               var10000 = 190;
               break;
            case 202:
               var10000 = 37;
               break;
            case 203:
               var10000 = 38;
               break;
            case 204:
               var10000 = 236;
               break;
            case 205:
               var10000 = 31;
               break;
            case 206:
               var10000 = 25;
               break;
            case 207:
               var10000 = 130;
               break;
            case 208:
               var10000 = 55;
               break;
            case 209:
               var10000 = 91;
               break;
            case 210:
               var10000 = 209;
               break;
            case 211:
               var10000 = 222;
               break;
            case 212:
               var10000 = 7;
               break;
            case 213:
               var10000 = 156;
               break;
            case 214:
               var10000 = 128;
               break;
            case 215:
               var10000 = 97;
               break;
            case 216:
               var10000 = 140;
               break;
            case 217:
               var10000 = 21;
               break;
            case 218:
               var10000 = 247;
               break;
            case 219:
               var10000 = 17;
               break;
            case 220:
               var10000 = 4;
               break;
            case 221:
               var10000 = 59;
               break;
            case 222:
               var10000 = 146;
               break;
            case 223:
               var10000 = 173;
               break;
            case 224:
               var10000 = 176;
               break;
            case 225:
               var10000 = 242;
               break;
            case 226:
               var10000 = 170;
               break;
            case 227:
               var10000 = 119;
               break;
            case 228:
               var10000 = 2;
               break;
            case 229:
               var10000 = 120;
               break;
            case 230:
               var10000 = 206;
               break;
            case 231:
               var10000 = 178;
               break;
            case 232:
               var10000 = 138;
               break;
            case 233:
               var10000 = 101;
               break;
            case 234:
               var10000 = 121;
               break;
            case 235:
               var10000 = 231;
               break;
            case 236:
               var10000 = 199;
               break;
            case 237:
               var10000 = 87;
               break;
            case 238:
               var10000 = 32;
               break;
            case 239:
               var10000 = 63;
               break;
            case 240:
               var10000 = 86;
               break;
            case 241:
               var10000 = 148;
               break;
            case 242:
               var10000 = 115;
               break;
            case 243:
               var10000 = 201;
               break;
            case 244:
               var10000 = 147;
               break;
            case 245:
               var10000 = 0;
               break;
            case 246:
               var10000 = 153;
               break;
            case 247:
               var10000 = 33;
               break;
            case 248:
               var10000 = 90;
               break;
            case 249:
               var10000 = 43;
               break;
            case 250:
               var10000 = 248;
               break;
            case 251:
               var10000 = 252;
               break;
            case 252:
               var10000 = 198;
               break;
            case 253:
               var10000 = 123;
               break;
            case 254:
               var10000 = 60;
               break;
            default:
               var10000 = 47;
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
      char[] var20;
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "mwsU\u0016$\u001e\u008frê\u0089×%ò<,D×U\u0090±[¯>³hè¦\u0017ÖîMuÈ£\u001d\u000e(p\u000eÓ54F/ñ\"\u0090ï6´o8*\u0006üÌ\u009axb\u00145V{iÕÀÊ\t÷1öªà\u0096ê¦M1&_\u0014pºÓôÀsh\u007f£ÿ|s±\u00adÀÁ\bÝ\u008eÂ\n¬ÁK\u0083\u0011þþÔn\u0081\u0012\u0095\"C°,\u001c\u009d\u0095\u001aG\u0093.³\u0019Ì\u0095s\u0094\u0012\t\u0085î\u009dyfÃ¨ýÜ\u009bçüË¯,ó+";
      int var4 = "mwsU\u0016$\u001e\u008frê\u0089×%ò<,D×U\u0090±[¯>³hè¦\u0017ÖîMuÈ£\u001d\u000e(p\u000eÓ54F/ñ\"\u0090ï6´o8*\u0006üÌ\u009axb\u00145V{iÕÀÊ\t÷1öªà\u0096ê¦M1&_\u0014pºÓôÀsh\u007f£ÿ|s±\u00adÀÁ\bÝ\u008eÂ\n¬ÁK\u0083\u0011þþÔn\u0081\u0012\u0095\"C°,\u001c\u009d\u0095\u001aG\u0093.³\u0019Ì\u0095s\u0094\u0012\t\u0085î\u009dyfÃ¨ýÜ\u009bçüË¯,ó+"
         .length();
      char var1 = 15;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 112;
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
                        var46 = 85;
                        break;
                     case 1:
                        var46 = 90;
                        break;
                     case 2:
                        var46 = 76;
                        break;
                     case 3:
                        var46 = 124;
                        break;
                     case 4:
                        var46 = 32;
                        break;
                     case 5:
                        var46 = 111;
                        break;
                     default:
                        var46 = 65;
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
                     b = new String[9];
                     G = new LinkedHashMap();
                     r = new WeakHashMap();
                     T = true;
                     i = false;
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

                  var2 = " >þX\u0083¡\u0088\u001b\u0084\\\u0012\u0085\u0014eRÌd¥¾9\u0006Ó\"\u009f¼m\u0005c¢";
                  var4 = " >þX\u0083¡\u0088\u001b\u0084\\\u0012\u0085\u0014eRÌd¥¾9\u0006Ó\"\u009f¼m\u0005c¢".length();
                  var1 = '\n';
                  var8 = -1;
            }

            var10000 = 80;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





