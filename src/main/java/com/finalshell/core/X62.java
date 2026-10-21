package com.finalshell.core;

import com.finalshell.ui.model.KH;
import com.finalshell.ui.model.XS;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public abstract class X62 {
   public static int e;
   public static String[] a;
   public static String[] b;

   public abstract String z();

   public abstract String P();

   public abstract String O();

   public abstract String A$String();

   public abstract List f();

   public boolean T() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/X62.B ()I
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/X62.f ()Ljava/util/List;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifeq 19
      // 0e: ifnull 30
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 2
      // 19: invokeinterface java/util/List.size ()I 1
      // 1e: iload 1
      // 1f: ifeq 2d
      // 22: ifle 30
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: bipush 1
      // 2d: goto 31
      // 30: bipush 0
      // 31: istore 3
      // 32: iload 3
      // 33: iload 1
      // 34: ifeq 57
      // 37: ifeq 87
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: aload 2
      // 42: sipush -28914
      // 45: sipush 28795
      // 48: invokestatic com/finalshell/core/X62.a (II)Ljava/lang/String;
      // 4b: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: iload 1
      // 58: ifeq 84
      // 5b: ifne 83
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: aload 2
      // 66: invokestatic com/finalshell/core/Wx2.W ()Ljava/lang/String;
      // 69: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 6e: iload 1
      // 6f: ifeq 84
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: ifeq 87
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82: athrow
      // 83: bipush 1
      // 84: goto 88
      // 87: bipush 0
      // 88: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 8b: ifnull 9c
      // 8e: iinc 1 1
      // 91: iload 1
      // 92: invokestatic com/finalshell/core/X62.x (I)V
      // 95: goto 9c
      // 98: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: ireturn
   }

   public abstract String M();

   public abstract com.finalshell.ui.model.BN G(JComponent var1, KH var2);

   protected KH Q(JComponent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/X62.B ()I
      // 03: aload 1
      // 04: invokevirtual javax/swing/JComponent.getUIClassID ()Ljava/lang/String;
      // 07: invokestatic com/finalshell/ui/model/KH.t (Ljava/lang/String;)Lcom/finalshell/ui/model/KH;
      // 0a: astore 3
      // 0b: istore 2
      // 0c: aload 3
      // 0d: iload 2
      // 0e: ifeq 45
      // 11: ifnonnull 44
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: new com/finalshell/core/WG
      // 1e: dup
      // 1f: new java/lang/StringBuilder
      // 22: dup
      // 23: invokespecial java/lang/StringBuilder.<init> ()V
      // 26: sipush -28920
      // 29: sipush 21458
      // 2c: invokestatic com/finalshell/core/X62.a (II)Ljava/lang/String;
      // 2f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32: aload 1
      // 33: invokevirtual javax/swing/JComponent.getUIClassID ()Ljava/lang/String;
      // 36: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3c: invokespecial com/finalshell/core/WG.<init> (Ljava/lang/String;)V
      // 3f: athrow
      // 40: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: aload 3
      // 45: areturn
   }

   protected com.finalshell.ui.model.BN D(JComponent var1) {
      return this.e(var1, this.Q(var1));
   }

   protected com.finalshell.ui.model.BN e(JComponent param1, KH param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/X62.A$int ()I
      // 03: aload 0
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual com/finalshell/core/X62.G (Ljavax/swing/JComponent;Lcom/finalshell/ui/model/KH;)Lcom/finalshell/ui/model/BN;
      // 09: astore 4
      // 0b: istore 3
      // 0c: aload 4
      // 0e: iload 3
      // 0f: ifne 47
      // 12: ifnonnull 45
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: new com/finalshell/core/WG
      // 1f: dup
      // 20: new java/lang/StringBuilder
      // 23: dup
      // 24: invokespecial java/lang/StringBuilder.<init> ()V
      // 27: sipush -28917
      // 2a: sipush 32342
      // 2d: invokestatic com/finalshell/core/X62.a (II)Ljava/lang/String;
      // 30: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33: aload 1
      // 34: invokevirtual javax/swing/JComponent.getUIClassID ()Ljava/lang/String;
      // 37: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3d: invokespecial com/finalshell/core/WG.<init> (Ljava/lang/String;)V
      // 40: athrow
      // 41: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 4
      // 47: areturn
   }

   protected ComponentUI g(JComponent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/X62.B ()I
      // 03: aload 1
      // 04: invokestatic com/finalshell/core/GA.Z (Ljava/awt/Component;)Ljavax/swing/plaf/ComponentUI;
      // 07: astore 3
      // 08: istore 2
      // 09: aload 3
      // 0a: iload 2
      // 0b: ifeq 3f
      // 0e: ifnonnull 3e
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: new com/finalshell/core/WG
      // 1b: dup
      // 1c: new java/lang/StringBuilder
      // 1f: dup
      // 20: invokespecial java/lang/StringBuilder.<init> ()V
      // 23: sipush -28916
      // 26: sipush -6666
      // 29: invokestatic com/finalshell/core/X62.a (II)Ljava/lang/String;
      // 2c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f: aload 1
      // 30: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 33: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 36: invokespecial com/finalshell/core/WG.<init> (Ljava/lang/String;)V
      // 39: athrow
      // 3a: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 3
      // 3f: areturn
   }

   public boolean v(JComponent var1) {
      return this.E(var1, Ox4.A(var1), Ox4.x(var1));
   }

   public boolean E(JComponent param1, Map param2, Map param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/X62.B ()I
      // 003: istore 4
      // 005: aload 0
      // 006: aload 1
      // 007: invokevirtual com/finalshell/core/X62.Q (Ljavax/swing/JComponent;)Lcom/finalshell/ui/model/KH;
      // 00a: astore 5
      // 00c: aload 0
      // 00d: aload 1
      // 00e: aload 5
      // 010: invokevirtual com/finalshell/core/X62.e (Ljavax/swing/JComponent;Lcom/finalshell/ui/model/KH;)Lcom/finalshell/ui/model/BN;
      // 013: astore 6
      // 015: aload 0
      // 016: aload 1
      // 017: invokevirtual com/finalshell/core/X62.g (Ljavax/swing/JComponent;)Ljavax/swing/plaf/ComponentUI;
      // 01a: astore 7
      // 01c: aload 6
      // 01e: invokevirtual com/finalshell/ui/model/BN.X ()Ljava/util/List;
      // 021: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 026: astore 8
      // 028: aload 8
      // 02a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 02f: ifeq 11d
      // 032: aload 8
      // 034: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 039: checkcast com/finalshell/ui/model/XS
      // 03c: astore 9
      // 03e: aload 9
      // 040: invokevirtual com/finalshell/ui/model/XS.x ()Ljava/lang/String;
      // 043: astore 10
      // 045: iload 4
      // 047: ifeq 134
      // 04a: aload 3
      // 04b: iload 4
      // 04d: ifeq 0a4
      // 050: goto 057
      // 053: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: ifnull 091
      // 05a: goto 061
      // 05d: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: aload 3
      // 062: iload 4
      // 064: ifeq 0a4
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: aload 10
      // 070: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 075: ifeq 091
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: aload 3
      // 080: aload 10
      // 082: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 087: checkcast com/finalshell/core/Og4
      // 08a: astore 11
      // 08c: iload 4
      // 08e: ifne 100
      // 091: aload 9
      // 093: invokevirtual com/finalshell/ui/model/XS.b$String ()Ljava/lang/String;
      // 096: bipush 0
      // 097: anewarray 4
      // 09a: invokestatic com/finalshell/core/Kp2.y (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a3: athrow
      // 0a4: checkcast com/finalshell/core/Og4
      // 0a7: astore 11
      // 0a9: aload 11
      // 0ab: ifnonnull 0e8
      // 0ae: new com/finalshell/core/WG
      // 0b1: dup
      // 0b2: new java/lang/StringBuilder
      // 0b5: dup
      // 0b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b9: sipush -28923
      // 0bc: sipush 5472
      // 0bf: invokestatic com/finalshell/core/X62.a (II)Ljava/lang/String;
      // 0c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c5: aload 9
      // 0c7: invokevirtual com/finalshell/ui/model/XS.b$String ()Ljava/lang/String;
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: sipush -28913
      // 0d0: sipush 22161
      // 0d3: invokestatic com/finalshell/core/X62.a (II)Ljava/lang/String;
      // 0d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d9: aload 1
      // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0dd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e0: invokespecial com/finalshell/core/WG.<init> (Ljava/lang/String;)V
      // 0e3: athrow
      // 0e4: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: aload 2
      // 0ea: aload 9
      // 0ec: aload 10
      // 0ee: invokevirtual com/finalshell/core/X62.Q (Ljava/util/Map;Lcom/finalshell/ui/model/XS;Ljava/lang/String;)Ljava/util/Map;
      // 0f1: astore 12
      // 0f3: aload 0
      // 0f4: aload 11
      // 0f6: aload 9
      // 0f8: invokevirtual com/finalshell/ui/model/XS.b$Map ()Ljava/util/Map;
      // 0fb: aload 12
      // 0fd: invokevirtual com/finalshell/core/X62.I (Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;)V
      // 100: aload 10
      // 102: invokestatic com/finalshell/core/Kp2.W (Ljava/lang/String;)Ljava/lang/String;
      // 105: astore 12
      // 107: aload 7
      // 109: aload 12
      // 10b: bipush 1
      // 10c: anewarray 4
      // 10f: dup
      // 110: bipush 0
      // 111: aload 11
      // 113: aastore
      // 114: invokestatic com/finalshell/core/Kp2.j (Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 117: pop
      // 118: iload 4
      // 11a: ifne 028
      // 11d: aload 0
      // 11e: aload 7
      // 120: aload 6
      // 122: invokevirtual com/finalshell/ui/model/BN.Y ()Ljava/util/Map;
      // 125: aconst_null
      // 126: invokevirtual com/finalshell/core/X62.I (Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;)V
      // 129: aload 0
      // 12a: aload 1
      // 12b: aload 6
      // 12d: invokevirtual com/finalshell/ui/model/BN.G ()Ljava/util/Map;
      // 130: aconst_null
      // 131: invokevirtual com/finalshell/core/X62.I (Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;)V
      // 134: bipush 1
      // 135: ireturn
      // 136: astore 5
      // 138: aload 0
      // 139: aload 5
      // 13b: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 13e: bipush 0
      // 13f: ireturn
   }

   protected Map Q(Map var1, XS var2, String var3) {
      int var4 = A$int();

      Map var10000;
      label34: {
         try {
            var10000 = var1;
            if (var4 != 0) {
               break label34;
            }

            if (var1 == null) {
               return null;
            }
         } catch (WG var6) {
            throw a(var6);
         }

         var10000 = var1;
      }

      try {
         if (var2.p()) {
            return (Map)var10000.get(null);
         }
      } catch (WG var5) {
         throw a(var5);
      }

      return (Map)var10000.get(var3);
   }

   public boolean d(JComponent var1) {
      int var2 = B();

      try {
         com.finalshell.ui.model.BN var3 = this.D(var1);
         ComponentUI var4 = this.g(var1);

         for (XS var6 : var3.X()) {
            String var7 = Kp2.W(var6.x());
            Kp2.j(var4, var7, new Object[]{(Og4)null});
            if (var2 == 0) {
               break;
            }
         }

         return true;
      } catch (Throwable var8) {
         NE3.g(this, var8);
         return false;
      }
   }

   public Object J(JComponent var1, String var2) {
      return this.w(var1, null, var2);
   }

   public Object w(JComponent param1, String param2, String param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/X62.A$int ()I
      // 03: aload 0
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual com/finalshell/core/X62.N (Ljavax/swing/JComponent;Ljava/lang/String;)Lcom/finalshell/core/Og4;
      // 09: astore 5
      // 0b: istore 4
      // 0d: aload 5
      // 0f: iload 4
      // 11: ifne 2b
      // 14: ifnull 2c
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 5
      // 20: aload 3
      // 21: invokestatic com/finalshell/core/X62.Z (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: areturn
      // 2c: invokestatic com/finalshell/core/Ox4.O$boolean ()Z
      // 2f: ifne 38
      // 32: aconst_null
      // 33: areturn
      // 34: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: new com/finalshell/core/WG
      // 3b: dup
      // 3c: new java/lang/StringBuilder
      // 3f: dup
      // 40: invokespecial java/lang/StringBuilder.<init> ()V
      // 43: sipush -28919
      // 46: sipush 2445
      // 49: invokestatic com/finalshell/core/X62.a (II)Ljava/lang/String;
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: aload 2
      // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53: sipush -28924
      // 56: sipush 29804
      // 59: invokestatic com/finalshell/core/X62.a (II)Ljava/lang/String;
      // 5c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5f: aload 1
      // 60: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 63: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 66: invokespecial com/finalshell/core/WG.<init> (Ljava/lang/String;)V
      // 69: athrow
   }

   public boolean M(JComponent var1, String var2, Object var3) {
      return this.i(var1, null, var2, var3);
   }

   public boolean i(JComponent var1, String var2, String var3, Object var4) {
      int var10000 = A$int();
      Og4 var6 = this.N(var1, var2);
      int var5 = var10000;

      label52: {
         try {
            if (var5 != 0) {
               return M(var6, var3, var4);
            }

            if (var6 == null) {
               break label52;
            }
         } catch (WG var8) {
            throw a(var8);
         }

         return M(var6, var3, var4);
      }

      try {
         boolean var10 = Ox4.O$boolean();
         if (var5 != 0) {
            return var10;
         }

         if (var10) {
            throw new WG(a(-28915, 27022) + var2 + a(-28918, -2122) + var1);
         }
      } catch (WG var7) {
         throw a(var7);
      }

      return false;
   }

   protected void I(Object param1, Map param2, Map param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/X62.A$int ()I
      // 003: istore 4
      // 005: aload 3
      // 006: iload 4
      // 008: ifne 0a8
      // 00b: ifnull 0a0
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: aload 3
      // 016: iload 4
      // 018: ifne 0a8
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 021: athrow
      // 022: invokeinterface java/util/Map.size ()I 1
      // 027: ifle 0a0
      // 02a: goto 031
      // 02d: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 030: athrow
      // 031: aload 2
      // 032: iload 4
      // 034: ifne 099
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: ifnull 091
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: aload 2
      // 049: iload 4
      // 04b: ifne 099
      // 04e: goto 055
      // 051: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: invokeinterface java/util/Map.size ()I 1
      // 05a: ifle 091
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063: athrow
      // 064: new java/util/HashMap
      // 067: dup
      // 068: aload 2
      // 069: invokeinterface java/util/Map.size ()I 1
      // 06e: aload 3
      // 06f: invokeinterface java/util/Map.size ()I 1
      // 074: invokestatic java/lang/Math.max (II)I
      // 077: invokespecial java/util/HashMap.<init> (I)V
      // 07a: astore 5
      // 07c: aload 5
      // 07e: aload 2
      // 07f: invokeinterface java/util/Map.putAll (Ljava/util/Map;)V 2
      // 084: aload 5
      // 086: aload 3
      // 087: invokeinterface java/util/Map.putAll (Ljava/util/Map;)V 2
      // 08c: iload 4
      // 08e: ifeq 0aa
      // 091: aload 3
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 098: athrow
      // 099: astore 5
      // 09b: iload 4
      // 09d: ifeq 0aa
      // 0a0: aload 2
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: astore 5
      // 0aa: aload 5
      // 0ac: iload 4
      // 0ae: ifne 0bd
      // 0b1: ifnull 117
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: aload 5
      // 0bd: iload 4
      // 0bf: ifne 0da
      // 0c2: invokeinterface java/util/Map.size ()I 1
      // 0c7: ifle 117
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: aload 5
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/core/X62.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0df: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0e4: astore 6
      // 0e6: aload 6
      // 0e8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ed: ifeq 117
      // 0f0: aload 6
      // 0f2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f7: checkcast java/util/Map$Entry
      // 0fa: astore 7
      // 0fc: aload 1
      // 0fd: aload 7
      // 0ff: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 104: checkcast java/lang/String
      // 107: aload 7
      // 109: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 10e: invokestatic com/finalshell/core/X62.M (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z
      // 111: pop
      // 112: iload 4
      // 114: ifeq 0e6
      // 117: return
   }

   public static boolean M(Object var0, String var1, Object var2) {
      try {
         if (var2 == C12.Z) {
            return false;
         }
      } catch (NoSuchMethodException var9) {
         throw a(var9);
      }

      try {
         String var10 = Kp2.W(var1);
         Kp2.j(var0, var10, new Object[]{var2});
         return true;
      } catch (NoSuchMethodException var6) {
         NE3.g(X62.class, var6);
      } catch (InvocationTargetException var7) {
         NE3.g(X62.class, var7);
      } catch (IllegalAccessException var8) {
         NE3.g(X62.class, var8);
      }

      try {
         Field var3 = Kp2.k(var0.getClass(), var1);
         var3.setAccessible(true);
         var3.set(var0, var2);
         return true;
      } catch (NoSuchFieldException var4) {
         NE3.g(X62.class, var4);
         return false;
      } catch (IllegalAccessException var5) {
         NE3.g(X62.class, var5);
         return false;
      }
   }

   public static Object Z(Object var0, String var1) {
      java.lang.Class var2 = var0.getClass();

      try {
         Method var8 = Kp2.i(var0, var1);
         return var8.invoke(var0);
      } catch (InvocationTargetException var6) {
         NE3.g(X62.class, var6);
      } catch (IllegalAccessException var7) {
         NE3.g(X62.class, var7);
      }

      try {
         Field var3 = Kp2.k(var2, var1);
         var3.setAccessible(true);
         return var3.get(var0);
      } catch (NoSuchFieldException var4) {
         NE3.g(X62.class, var4);
         return null;
      } catch (IllegalAccessException var5) {
         NE3.g(X62.class, var5);
         return null;
      }
   }

   public Og4 N(JComponent var1, String var2) {
      int var3 = A$int();

      String var10000;
      label32: {
         label31: {
            try {
               var10000 = var2;
               if (var3 != 0) {
                  break label32;
               }

               if (var2 != null) {
                  break label31;
               }
            } catch (WG var7) {
               throw a(var7);
            }

            var10000 = this.D(var1).T().x();
            break label32;
         }

         var10000 = var2;
      }

      String var4 = var10000;
      ComponentUI var5 = this.g(var1);

      try {
         Og4 var8 = (Og4)Z(var5, var4);
         if (var3 != 0) {
            Ky4.K(new String[5]);
         }

         return var8;
      } catch (WG var6) {
         throw a(var6);
      }
   }

   @Override
   public String toString() {
      return this.P();
   }

   public static void x(int var0) {
      e = var0;
   }

   public static int B() {
      return e;
   }

   public static int A$int() {
      int var0 = B();

      try {
         return var0 == 0 ? 69 : 0;
      } catch (WG var1) {
         throw a(var1);
      }
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -28915) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 245;
               break;
            case 1:
               var10000 = 88;
               break;
            case 2:
               var10000 = 91;
               break;
            case 3:
               var10000 = 164;
               break;
            case 4:
               var10000 = 149;
               break;
            case 5:
               var10000 = 125;
               break;
            case 6:
               var10000 = 249;
               break;
            case 7:
               var10000 = 119;
               break;
            case 8:
               var10000 = 209;
               break;
            case 9:
               var10000 = 200;
               break;
            case 10:
               var10000 = 182;
               break;
            case 11:
               var10000 = 110;
               break;
            case 12:
               var10000 = 171;
               break;
            case 13:
               var10000 = 151;
               break;
            case 14:
               var10000 = 120;
               break;
            case 15:
               var10000 = 129;
               break;
            case 16:
               var10000 = 141;
               break;
            case 17:
               var10000 = 50;
               break;
            case 18:
               var10000 = 115;
               break;
            case 19:
               var10000 = 254;
               break;
            case 20:
               var10000 = 65;
               break;
            case 21:
               var10000 = 229;
               break;
            case 22:
               var10000 = 71;
               break;
            case 23:
               var10000 = 137;
               break;
            case 24:
               var10000 = 198;
               break;
            case 25:
               var10000 = 177;
               break;
            case 26:
               var10000 = 221;
               break;
            case 27:
               var10000 = 163;
               break;
            case 28:
               var10000 = 103;
               break;
            case 29:
               var10000 = 114;
               break;
            case 30:
               var10000 = 85;
               break;
            case 31:
               var10000 = 101;
               break;
            case 32:
               var10000 = 180;
               break;
            case 33:
               var10000 = 240;
               break;
            case 34:
               var10000 = 75;
               break;
            case 35:
               var10000 = 61;
               break;
            case 36:
               var10000 = 184;
               break;
            case 37:
               var10000 = 216;
               break;
            case 38:
               var10000 = 98;
               break;
            case 39:
               var10000 = 239;
               break;
            case 40:
               var10000 = 46;
               break;
            case 41:
               var10000 = 107;
               break;
            case 42:
               var10000 = 203;
               break;
            case 43:
               var10000 = 139;
               break;
            case 44:
               var10000 = 253;
               break;
            case 45:
               var10000 = 237;
               break;
            case 46:
               var10000 = 4;
               break;
            case 47:
               var10000 = 53;
               break;
            case 48:
               var10000 = 56;
               break;
            case 49:
               var10000 = 38;
               break;
            case 50:
               var10000 = 210;
               break;
            case 51:
               var10000 = 147;
               break;
            case 52:
               var10000 = 90;
               break;
            case 53:
               var10000 = 186;
               break;
            case 54:
               var10000 = 250;
               break;
            case 55:
               var10000 = 93;
               break;
            case 56:
               var10000 = 159;
               break;
            case 57:
               var10000 = 166;
               break;
            case 58:
               var10000 = 82;
               break;
            case 59:
               var10000 = 5;
               break;
            case 60:
               var10000 = 235;
               break;
            case 61:
               var10000 = 124;
               break;
            case 62:
               var10000 = 97;
               break;
            case 63:
               var10000 = 234;
               break;
            case 64:
               var10000 = 111;
               break;
            case 65:
               var10000 = 22;
               break;
            case 66:
               var10000 = 23;
               break;
            case 67:
               var10000 = 29;
               break;
            case 68:
               var10000 = 11;
               break;
            case 69:
               var10000 = 106;
               break;
            case 70:
               var10000 = 19;
               break;
            case 71:
               var10000 = 55;
               break;
            case 72:
               var10000 = 12;
               break;
            case 73:
               var10000 = 7;
               break;
            case 74:
               var10000 = 153;
               break;
            case 75:
               var10000 = 168;
               break;
            case 76:
               var10000 = 156;
               break;
            case 77:
               var10000 = 241;
               break;
            case 78:
               var10000 = 6;
               break;
            case 79:
               var10000 = 16;
               break;
            case 80:
               var10000 = 70;
               break;
            case 81:
               var10000 = 176;
               break;
            case 82:
               var10000 = 26;
               break;
            case 83:
               var10000 = 24;
               break;
            case 84:
               var10000 = 145;
               break;
            case 85:
               var10000 = 154;
               break;
            case 86:
               var10000 = 170;
               break;
            case 87:
               var10000 = 215;
               break;
            case 88:
               var10000 = 201;
               break;
            case 89:
               var10000 = 86;
               break;
            case 90:
               var10000 = 100;
               break;
            case 91:
               var10000 = 150;
               break;
            case 92:
               var10000 = 212;
               break;
            case 93:
               var10000 = 127;
               break;
            case 94:
               var10000 = 89;
               break;
            case 95:
               var10000 = 220;
               break;
            case 96:
               var10000 = 49;
               break;
            case 97:
               var10000 = 130;
               break;
            case 98:
               var10000 = 58;
               break;
            case 99:
               var10000 = 148;
               break;
            case 100:
               var10000 = 246;
               break;
            case 101:
               var10000 = 40;
               break;
            case 102:
               var10000 = 45;
               break;
            case 103:
               var10000 = 83;
               break;
            case 104:
               var10000 = 140;
               break;
            case 105:
               var10000 = 193;
               break;
            case 106:
               var10000 = 13;
               break;
            case 107:
               var10000 = 84;
               break;
            case 108:
               var10000 = 196;
               break;
            case 109:
               var10000 = 108;
               break;
            case 110:
               var10000 = 118;
               break;
            case 111:
               var10000 = 189;
               break;
            case 112:
               var10000 = 172;
               break;
            case 113:
               var10000 = 28;
               break;
            case 114:
               var10000 = 251;
               break;
            case 115:
               var10000 = 54;
               break;
            case 116:
               var10000 = 10;
               break;
            case 117:
               var10000 = 190;
               break;
            case 118:
               var10000 = 57;
               break;
            case 119:
               var10000 = 255;
               break;
            case 120:
               var10000 = 77;
               break;
            case 121:
               var10000 = 15;
               break;
            case 122:
               var10000 = 248;
               break;
            case 123:
               var10000 = 99;
               break;
            case 124:
               var10000 = 112;
               break;
            case 125:
               var10000 = 165;
               break;
            case 126:
               var10000 = 21;
               break;
            case 127:
               var10000 = 179;
               break;
            case 128:
               var10000 = 32;
               break;
            case 129:
               var10000 = 80;
               break;
            case 130:
               var10000 = 102;
               break;
            case 131:
               var10000 = 146;
               break;
            case 132:
               var10000 = 181;
               break;
            case 133:
               var10000 = 195;
               break;
            case 134:
               var10000 = 35;
               break;
            case 135:
               var10000 = 202;
               break;
            case 136:
               var10000 = 218;
               break;
            case 137:
               var10000 = 142;
               break;
            case 138:
               var10000 = 34;
               break;
            case 139:
               var10000 = 175;
               break;
            case 140:
               var10000 = 60;
               break;
            case 141:
               var10000 = 42;
               break;
            case 142:
               var10000 = 27;
               break;
            case 143:
               var10000 = 174;
               break;
            case 144:
               var10000 = 81;
               break;
            case 145:
               var10000 = 33;
               break;
            case 146:
               var10000 = 2;
               break;
            case 147:
               var10000 = 136;
               break;
            case 148:
               var10000 = 66;
               break;
            case 149:
               var10000 = 18;
               break;
            case 150:
               var10000 = 51;
               break;
            case 151:
               var10000 = 135;
               break;
            case 152:
               var10000 = 59;
               break;
            case 153:
               var10000 = 14;
               break;
            case 154:
               var10000 = 232;
               break;
            case 155:
               var10000 = 8;
               break;
            case 156:
               var10000 = 144;
               break;
            case 157:
               var10000 = 192;
               break;
            case 158:
               var10000 = 208;
               break;
            case 159:
               var10000 = 185;
               break;
            case 160:
               var10000 = 41;
               break;
            case 161:
               var10000 = 63;
               break;
            case 162:
               var10000 = 1;
               break;
            case 163:
               var10000 = 113;
               break;
            case 164:
               var10000 = 67;
               break;
            case 165:
               var10000 = 72;
               break;
            case 166:
               var10000 = 69;
               break;
            case 167:
               var10000 = 211;
               break;
            case 168:
               var10000 = 247;
               break;
            case 169:
               var10000 = 132;
               break;
            case 170:
               var10000 = 92;
               break;
            case 171:
               var10000 = 155;
               break;
            case 172:
               var10000 = 223;
               break;
            case 173:
               var10000 = 43;
               break;
            case 174:
               var10000 = 158;
               break;
            case 175:
               var10000 = 222;
               break;
            case 176:
               var10000 = 123;
               break;
            case 177:
               var10000 = 162;
               break;
            case 178:
               var10000 = 238;
               break;
            case 179:
               var10000 = 122;
               break;
            case 180:
               var10000 = 207;
               break;
            case 181:
               var10000 = 213;
               break;
            case 182:
               var10000 = 109;
               break;
            case 183:
               var10000 = 167;
               break;
            case 184:
               var10000 = 3;
               break;
            case 185:
               var10000 = 226;
               break;
            case 186:
               var10000 = 206;
               break;
            case 187:
               var10000 = 39;
               break;
            case 188:
               var10000 = 236;
               break;
            case 189:
               var10000 = 44;
               break;
            case 190:
               var10000 = 20;
               break;
            case 191:
               var10000 = 197;
               break;
            case 192:
               var10000 = 79;
               break;
            case 193:
               var10000 = 228;
               break;
            case 194:
               var10000 = 30;
               break;
            case 195:
               var10000 = 121;
               break;
            case 196:
               var10000 = 126;
               break;
            case 197:
               var10000 = 94;
               break;
            case 198:
               var10000 = 105;
               break;
            case 199:
               var10000 = 96;
               break;
            case 200:
               var10000 = 104;
               break;
            case 201:
               var10000 = 244;
               break;
            case 202:
               var10000 = 74;
               break;
            case 203:
               var10000 = 194;
               break;
            case 204:
               var10000 = 217;
               break;
            case 205:
               var10000 = 138;
               break;
            case 206:
               var10000 = 227;
               break;
            case 207:
               var10000 = 242;
               break;
            case 208:
               var10000 = 9;
               break;
            case 209:
               var10000 = 31;
               break;
            case 210:
               var10000 = 17;
               break;
            case 211:
               var10000 = 233;
               break;
            case 212:
               var10000 = 187;
               break;
            case 213:
               var10000 = 133;
               break;
            case 214:
               var10000 = 47;
               break;
            case 215:
               var10000 = 183;
               break;
            case 216:
               var10000 = 62;
               break;
            case 217:
               var10000 = 252;
               break;
            case 218:
               var10000 = 231;
               break;
            case 219:
               var10000 = 224;
               break;
            case 220:
               var10000 = 52;
               break;
            case 221:
               var10000 = 191;
               break;
            case 222:
               var10000 = 64;
               break;
            case 223:
               var10000 = 78;
               break;
            case 224:
               var10000 = 95;
               break;
            case 225:
               var10000 = 36;
               break;
            case 226:
               var10000 = 230;
               break;
            case 227:
               var10000 = 152;
               break;
            case 228:
               var10000 = 157;
               break;
            case 229:
               var10000 = 73;
               break;
            case 230:
               var10000 = 128;
               break;
            case 231:
               var10000 = 205;
               break;
            case 232:
               var10000 = 131;
               break;
            case 233:
               var10000 = 143;
               break;
            case 234:
               var10000 = 161;
               break;
            case 235:
               var10000 = 243;
               break;
            case 236:
               var10000 = 68;
               break;
            case 237:
               var10000 = 0;
               break;
            case 238:
               var10000 = 199;
               break;
            case 239:
               var10000 = 178;
               break;
            case 240:
               var10000 = 204;
               break;
            case 241:
               var10000 = 87;
               break;
            case 242:
               var10000 = 134;
               break;
            case 243:
               var10000 = 169;
               break;
            case 244:
               var10000 = 76;
               break;
            case 245:
               var10000 = 48;
               break;
            case 246:
               var10000 = 188;
               break;
            case 247:
               var10000 = 37;
               break;
            case 248:
               var10000 = 117;
               break;
            case 249:
               var10000 = 219;
               break;
            case 250:
               var10000 = 173;
               break;
            case 251:
               var10000 = 116;
               break;
            case 252:
               var10000 = 160;
               break;
            case 253:
               var10000 = 214;
               break;
            case 254:
               var10000 = 225;
               break;
            default:
               var10000 = 25;
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
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "3H$£ì\nÀF\u009bô\u0017ê\u0080¤\u009e\u001cL&Î\u008368¿ôãÍÿ\u0012\u0086[ \u0005y1l\u0003MD\u0011¹ì\u0010Ñ\u000b \u0017¡H·/¾ºÏ\u0004¨+\u0011V\u000e»\u0003÷ztê$Þ¢\u0093\u000bj2\u001cí\u0003\u0095òâ\u0011Ç\u0015º\b?\u007fºèÔ!þP½ó9ö¸\u001fÝ\u0000^DúäfËÄCsÂy\u009d&¶\bÜöNÔ$\u001a\u009bX\u0015\u008e#_öv,²\u0095wSÒ\u0015ÄÁ¡î\u0087R«\u0006Ði\u009dfxW¾ÔO\u008fö\u009a§)Q5ùF\n¯\u0097ST\u0089=TK?ÝÃ\u001f±\u0013V®x\u0000©¥*gPÿmÆü\u0093`°\u008c\f\u001b$É\u0007\u001f¨¼\rÄð3";
      int var4 = "3H$£ì\nÀF\u009bô\u0017ê\u0080¤\u009e\u001cL&Î\u008368¿ôãÍÿ\u0012\u0086[ \u0005y1l\u0003MD\u0011¹ì\u0010Ñ\u000b \u0017¡H·/¾ºÏ\u0004¨+\u0011V\u000e»\u0003÷ztê$Þ¢\u0093\u000bj2\u001cí\u0003\u0095òâ\u0011Ç\u0015º\b?\u007fºèÔ!þP½ó9ö¸\u001fÝ\u0000^DúäfËÄCsÂy\u009d&¶\bÜöNÔ$\u001a\u009bX\u0015\u008e#_öv,²\u0095wSÒ\u0015ÄÁ¡î\u0087R«\u0006Ði\u009dfxW¾ÔO\u008fö\u009a§)Q5ùF\n¯\u0097ST\u0089=TK?ÝÃ\u001f±\u0013V®x\u0000©¥*gPÿmÆü\u0093`°\u008c\f\u001b$É\u0007\u001f¨¼\rÄð3"
         .length();
      x(124);
      char var1 = 17;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 61;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
      char[] var20;
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
                        var46 = 117;
                        break;
                     case 1:
                        var46 = 18;
                        break;
                     case 2:
                        var46 = 69;
                        break;
                     case 3:
                        var46 = 81;
                        break;
                     case 4:
                        var46 = 106;
                        break;
                     case 5:
                        var46 = 8;
                        break;
                     default:
                        var46 = 2;
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
                     b = new String[10];
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

                  var2 = "¾)§ò\u00122É\u008a%eS='°(i1\u0082¤`ýM.Ï: \u001fá\u008cÃÂU\u0012\u0093xòCÔäb:\u0082\u00930/\u0019`66óÚÇ\u008c8\u0016Ë\fM";
                  var4 = "¾)§ò\u00122É\u008a%eS='°(i1\u0082¤`ýM.Ï: \u001fá\u008cÃÂU\u0012\u0093xòCÔäb:\u0082\u00930/\u0019`66óÚÇ\u008c8\u0016Ë\fM".length();
                  var1 = 26;
                  var8 = -1;
            }

            var10000 = 33;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





