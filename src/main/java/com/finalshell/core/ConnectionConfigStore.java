package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.F02;
import com.finalshell.ui.model.O0;
import com.finalshell.ui.model.Oc2;
import com.finalshell.ui.panel.ConnectionProperty;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ConnectionConfigStore {
   public HashMap P;
   public HashMap e;
   public HashMap k;
   public boolean o;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long f;

   public ConnectionConfigStore() {
      HashMap var10001 = new HashMap();
      long var2 = 625414770048383533L;
      HashMap var1 = var10001;
      Ref.s(625414770048383533L, var1, var2);
      HashMap var10002 = new HashMap();
      long var4 = 284174249540363036L;
      HashMap var3 = var10002;
      Ref.s(284174249540363036L, var3, var4);
      HashMap var10003 = new HashMap();
      long var6 = 468802884589973322L;
      HashMap var5 = var10003;
      Ref.s(468802884589973322L, var5, var6);
      Registry.lookupField(519525852301985336L).setBoolean(this, false);
   }

   public void o() {
   }

   public O0 d() {
      Oc2 var1 = new Oc2();
      Oc2 var2 = new Oc2();
      Object[] var10001 = Registry.packArgs(new File((String)Registry.lookupField(478301022169899080L).get(null)), var1, var2);
      long var5 = 319878986049367460L;
      Object[] var4 = var10001;
      Ref.h(319878986049367460L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      O0 var3 = new O0();
      var3.C(a(-17631, 24341), var1);
      var3.C(a(-17611, -1729), var2);
      return var3;
   }

   public ArrayList y() {
      ArrayList var2 = new ArrayList();
      Lv4_2.H$arrint();
      Object var4 = 625414770048383533L;
      Iterator var3 = ((HashMap)Ref.g(625414770048383533L, var4)).keySet().iterator();
      ConnectionConfigStore var1 = this;

      while (true) {
         if (var3.hasNext()) {
            Object var6 = 625414770048383533L;
            this.add((Lv4_2)((HashMap)Ref.g(625414770048383533L, var6)).get(var3.next()));
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         Collections.sort(var2, new F02(this));
         break;
      }

      return var2;
   }

   public ArrayList E() {
      Lv4_2.H$arrint();
      ArrayList var2 = new ArrayList();
      Object var4 = 625414770048383533L;
      Iterator var3 = ((HashMap)Ref.g(625414770048383533L, var4)).keySet().iterator();
      ConnectionConfigStore var1 = this;

      while (true) {
         if (var3.hasNext()) {
            Object var6 = 625414770048383533L;
            this.add((Lv4_2)((HashMap)Ref.g(625414770048383533L, var6)).get(var3.next()));
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         Collections.sort(var2, new com.finalshell.ui.model.K92(this));
         break;
      }

      return var2;
   }

   public ArrayList V() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: Invalid argument: OBJECT
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.getZeroConstant(ConstExprent.java:599)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:391)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:256)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:146)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:47)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:302)
      //
      // Bytecode:
      // 000: new java/util/ArrayList
      // 003: dup
      // 004: invokespecial java/util/ArrayList.<init> ()V
      // 007: astore 2
      // 008: invokestatic com/finalshell/core/Lv4_2.H$arrint ()[I
      // 00b: aload 0
      // 00c: ldc2_w 625414770048383533
      // 00f: astore 9
      // 011: ldc2_w 625414770048383533
      // 014: aload 9
      // 016: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 019: checkcast java/util/HashMap
      // 01c: invokevirtual java/util/HashMap.keySet ()Ljava/util/Set;
      // 01f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 024: astore 3
      // 025: astore 1
      // 026: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 029: ldc2_w 270389152141252877
      // 02c: astore 11
      // 02e: ldc2_w 270389152141252877
      // 031: aload 11
      // 033: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 036: goto 03d
      // 039: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 040: ldc2_w 306266403902896148
      // 043: astore 14
      // 045: astore 13
      // 047: ldc2_w 306266403902896148
      // 04a: aload 13
      // 04c: aload 14
      // 04e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 051: goto 058
      // 054: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 057: athrow
      // 058: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 05b: ldc2_w 476632081533033558
      // 05e: astore 16
      // 060: astore 15
      // 062: ldc2_w 476632081533033558
      // 065: aload 15
      // 067: aload 16
      // 069: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 06c: checkcast java/lang/Long
      // 06f: invokevirtual java/lang/Long.longValue ()J
      // 072: goto 079
      // 075: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 078: athrow
      // 079: lstore 4
      // 07b: aload 3
      // 07c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 081: ifeq 156
      // 084: aload 0
      // 085: ldc2_w 625414770048383533
      // 088: astore 17
      // 08a: ldc2_w 625414770048383533
      // 08d: aload 17
      // 08f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 092: checkcast java/util/HashMap
      // 095: aload 3
      // 096: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 09b: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 09e: checkcast com/finalshell/core/Lv4_2
      // 0a1: astore 6
      // 0a3: aload 6
      // 0a5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0a8: ldc2_w 622590009271170486
      // 0ab: astore 20
      // 0ad: astore 19
      // 0af: ldc2_w 622590009271170486
      // 0b2: aload 19
      // 0b4: aload 20
      // 0b6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0b9: checkcast java/lang/Long
      // 0bc: invokevirtual java/lang/Long.longValue ()J
      // 0bf: goto 0c6
      // 0c2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: lstore 7
      // 0c8: aload 1
      // 0c9: ifnull 162
      // 0cc: aload 6
      // 0ce: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0d1: ldc2_w 365199820804367683
      // 0d4: astore 22
      // 0d6: astore 21
      // 0d8: ldc2_w 365199820804367683
      // 0db: aload 21
      // 0dd: aload 22
      // 0df: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e2: checkcast java/lang/Long
      // 0e5: invokevirtual java/lang/Long.longValue ()J
      // 0e8: goto 0ef
      // 0eb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: aload 6
      // 0f1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0f4: ldc2_w 622590009271170486
      // 0f7: astore 24
      // 0f9: astore 23
      // 0fb: ldc2_w 622590009271170486
      // 0fe: aload 23
      // 100: aload 24
      // 102: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 105: checkcast java/lang/Long
      // 108: invokevirtual java/lang/Long.longValue ()J
      // 10b: goto 112
      // 10e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 111: athrow
      // 112: lcmp
      // 113: aload 1
      // 114: ifnull 144
      // 117: ifle 13f
      // 11a: aload 6
      // 11c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 11f: ldc2_w 365199820804367683
      // 122: astore 26
      // 124: astore 25
      // 126: ldc2_w 365199820804367683
      // 129: aload 25
      // 12b: aload 26
      // 12d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 130: checkcast java/lang/Long
      // 133: invokevirtual java/lang/Long.longValue ()J
      // 136: goto 13d
      // 139: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: lstore 7
      // 13f: lload 7
      // 141: lload 4
      // 143: lcmp
      // 144: aload 1
      // 145: ifnull 151
      // 148: ifle 152
      // 14b: aload 2
      // 14c: aload 6
      // 14e: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 151: pop
      // 152: aload 1
      // 153: ifnonnull 07b
      // 156: aload 2
      // 157: new com/finalshell/ui/model/K9
      // 15a: dup
      // 15b: aload 0
      // 15c: invokespecial com/finalshell/ui/model/K9.<init> (Lcom/finalshell/core/Yf2;)V
      // 15f: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
      // 162: aload 2
      // 163: areturn
   }

   public void q(File param1, ArrayList param2, ArrayList param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Lv4_2.H$arrint ()[I
      // 003: aload 1
      // 004: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 007: astore 5
      // 009: astore 4
      // 00b: aload 5
      // 00d: aload 4
      // 00f: ifnull 01e
      // 012: ifnull 18b
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 5
      // 01e: astore 6
      // 020: aload 6
      // 022: arraylength
      // 023: istore 7
      // 025: bipush 0
      // 026: istore 8
      // 028: iload 8
      // 02a: iload 7
      // 02c: if_icmpge 18b
      // 02f: aload 6
      // 031: iload 8
      // 033: aaload
      // 034: astore 9
      // 036: aload 9
      // 038: invokevirtual java/io/File.isFile ()Z
      // 03b: aload 4
      // 03d: ifnull 158
      // 040: ifeq 14c
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 049: athrow
      // 04a: aload 9
      // 04c: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 04f: sipush -17607
      // 052: sipush 2021
      // 055: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 058: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 05b: aload 4
      // 05d: ifnull 0e9
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: ifeq 0d1
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: new com/finalshell/core/Lv4_2
      // 074: dup
      // 075: invokespecial com/finalshell/core/Lv4_2.<init> ()V
      // 078: astore 10
      // 07a: aload 10
      // 07c: aload 9
      // 07e: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 081: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 084: ldc2_w 574053907803002361
      // 087: astore 13
      // 089: astore 12
      // 08b: ldc2_w 574053907803002361
      // 08e: aload 12
      // 090: aload 13
      // 092: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 095: pop
      // 096: goto 09d
      // 099: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: aload 10
      // 09f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0a2: ldc2_w 540969864624467425
      // 0a5: astore 15
      // 0a7: astore 14
      // 0a9: ldc2_w 540969864624467425
      // 0ac: aload 14
      // 0ae: aload 15
      // 0b0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0b3: pop
      // 0b4: goto 0bb
      // 0b7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: goto 0c5
      // 0be: astore 11
      // 0c0: aload 11
      // 0c2: invokevirtual java/lang/Exception.printStackTrace ()V
      // 0c5: aload 3
      // 0c6: aload 10
      // 0c8: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0cb: pop
      // 0cc: aload 4
      // 0ce: ifnonnull 183
      // 0d1: aload 9
      // 0d3: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 0d6: sipush -17608
      // 0d9: sipush 29649
      // 0dc: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 0df: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e2: goto 0e9
      // 0e5: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e8: athrow
      // 0e9: ifeq 183
      // 0ec: new com/finalshell/core/LO3
      // 0ef: dup
      // 0f0: invokespecial com/finalshell/core/LO3.<init> ()V
      // 0f3: astore 10
      // 0f5: aload 10
      // 0f7: aload 9
      // 0f9: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0fc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ff: ldc2_w 452404885675972754
      // 102: astore 17
      // 104: astore 16
      // 106: ldc2_w 452404885675972754
      // 109: aload 16
      // 10b: aload 17
      // 10d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 110: pop
      // 111: goto 118
      // 114: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 117: athrow
      // 118: aload 10
      // 11a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 11d: ldc2_w 409669529177196680
      // 120: astore 19
      // 122: astore 18
      // 124: ldc2_w 409669529177196680
      // 127: aload 18
      // 129: aload 19
      // 12b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 12e: pop
      // 12f: goto 136
      // 132: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 135: athrow
      // 136: goto 140
      // 139: astore 11
      // 13b: aload 11
      // 13d: invokevirtual java/lang/Exception.printStackTrace ()V
      // 140: aload 2
      // 141: aload 10
      // 143: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 146: pop
      // 147: aload 4
      // 149: ifnonnull 183
      // 14c: aload 9
      // 14e: invokevirtual java/io/File.isDirectory ()Z
      // 151: goto 158
      // 154: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 157: athrow
      // 158: ifeq 183
      // 15b: aload 0
      // 15c: aload 9
      // 15e: aload 2
      // 15f: aload 3
      // 160: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 163: ldc2_w 232808289332421156
      // 166: astore 21
      // 168: astore 20
      // 16a: ldc2_w 232808289332421156
      // 16d: aload 20
      // 16f: aload 21
      // 171: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 174: pop
      // 175: goto 17c
      // 178: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17b: athrow
      // 17c: goto 183
      // 17f: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 182: athrow
      // 183: iinc 8 1
      // 186: aload 4
      // 188: ifnonnull 028
      // 18b: return
   }

   public void D(File param1, Oc2 param2, Oc2 param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Lv4_2.H$arrint ()[I
      // 003: aload 1
      // 004: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 007: astore 5
      // 009: astore 4
      // 00b: aload 5
      // 00d: aload 4
      // 00f: ifnull 01e
      // 012: ifnull 153
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 5
      // 01e: astore 6
      // 020: aload 6
      // 022: arraylength
      // 023: istore 7
      // 025: bipush 0
      // 026: istore 8
      // 028: iload 8
      // 02a: iload 7
      // 02c: if_icmpge 153
      // 02f: aload 6
      // 031: iload 8
      // 033: aaload
      // 034: astore 9
      // 036: aload 9
      // 038: invokevirtual java/io/File.isFile ()Z
      // 03b: aload 4
      // 03d: ifnull 120
      // 040: ifeq 114
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 049: athrow
      // 04a: aload 9
      // 04c: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 04f: sipush -17607
      // 052: sipush 2021
      // 055: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 058: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 05b: aload 4
      // 05d: ifnull 0d3
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: ifeq 0af
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: aload 9
      // 073: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 076: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 079: ldc2_w 340002508208074194
      // 07c: astore 12
      // 07e: ldc2_w 340002508208074194
      // 081: aload 12
      // 083: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 086: checkcast java/lang/String
      // 089: goto 090
      // 08c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08f: athrow
      // 090: astore 10
      // 092: aload 10
      // 094: invokestatic com/finalshell/ui/model/O0.y (Ljava/lang/String;)Lcom/finalshell/ui/model/O0;
      // 097: astore 11
      // 099: aload 3
      // 09a: aload 11
      // 09c: invokevirtual com/finalshell/ui/model/Oc2.add (Ljava/lang/Object;)Z
      // 09f: pop
      // 0a0: goto 14b
      // 0a3: astore 10
      // 0a5: aload 10
      // 0a7: invokevirtual java/lang/Exception.printStackTrace ()V
      // 0aa: aload 4
      // 0ac: ifnonnull 14b
      // 0af: aload 9
      // 0b1: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 0b4: aload 4
      // 0b6: ifnull 0f5
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: sipush -17608
      // 0c3: sipush 29649
      // 0c6: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 0c9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: ifeq 14b
      // 0d6: aload 9
      // 0d8: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0db: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0de: ldc2_w 340002508208074194
      // 0e1: astore 14
      // 0e3: ldc2_w 340002508208074194
      // 0e6: aload 14
      // 0e8: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0eb: checkcast java/lang/String
      // 0ee: goto 0f5
      // 0f1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: astore 10
      // 0f7: aload 10
      // 0f9: invokestatic com/finalshell/ui/model/O0.y (Ljava/lang/String;)Lcom/finalshell/ui/model/O0;
      // 0fc: astore 11
      // 0fe: aload 2
      // 0ff: aload 11
      // 101: invokevirtual com/finalshell/ui/model/Oc2.add (Ljava/lang/Object;)Z
      // 104: pop
      // 105: goto 14b
      // 108: astore 10
      // 10a: aload 10
      // 10c: invokevirtual java/lang/Exception.printStackTrace ()V
      // 10f: aload 4
      // 111: ifnonnull 14b
      // 114: aload 9
      // 116: invokevirtual java/io/File.isDirectory ()Z
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: ifeq 14b
      // 123: aload 0
      // 124: aload 9
      // 126: aload 2
      // 127: aload 3
      // 128: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 12b: ldc2_w 319878986049367460
      // 12e: astore 17
      // 130: astore 16
      // 132: ldc2_w 319878986049367460
      // 135: aload 16
      // 137: aload 17
      // 139: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 13c: pop
      // 13d: goto 144
      // 140: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 143: athrow
      // 144: goto 14b
      // 147: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14a: athrow
      // 14b: iinc 8 1
      // 14e: aload 4
      // 150: ifnonnull 028
      // 153: return
   }

   public void X(O0 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Lv4_2.H$arrint ()[I
      // 003: aload 1
      // 004: sipush -17610
      // 007: sipush 12530
      // 00a: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 00d: invokevirtual com/finalshell/ui/model/O0.J (Ljava/lang/String;)Lcom/finalshell/ui/model/Oc2;
      // 010: astore 3
      // 011: astore 2
      // 012: aload 1
      // 013: sipush -17616
      // 016: sipush 27706
      // 019: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 01c: invokevirtual com/finalshell/ui/model/O0.J (Ljava/lang/String;)Lcom/finalshell/ui/model/Oc2;
      // 01f: astore 4
      // 021: new java/util/ArrayList
      // 024: dup
      // 025: invokespecial java/util/ArrayList.<init> ()V
      // 028: astore 5
      // 02a: bipush 0
      // 02b: istore 6
      // 02d: iload 6
      // 02f: aload 3
      // 030: invokevirtual com/finalshell/ui/model/Oc2.size ()I
      // 033: if_icmpge 081
      // 036: aload 3
      // 037: iload 6
      // 039: invokevirtual com/finalshell/ui/model/Oc2.V (I)Lcom/finalshell/ui/model/O0;
      // 03c: astore 7
      // 03e: new com/finalshell/core/LO3
      // 041: dup
      // 042: invokespecial com/finalshell/core/LO3.<init> ()V
      // 045: astore 8
      // 047: aload 8
      // 049: aload 7
      // 04b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 04e: ldc2_w 499690674028780412
      // 051: astore 24
      // 053: astore 23
      // 055: ldc2_w 499690674028780412
      // 058: aload 23
      // 05a: aload 24
      // 05c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 05f: pop
      // 060: goto 067
      // 063: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 066: athrow
      // 067: aload 5
      // 069: aload 2
      // 06a: ifnull 088
      // 06d: aload 8
      // 06f: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 072: pop
      // 073: iinc 6 1
      // 076: aload 2
      // 077: ifnonnull 02d
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: new java/util/ArrayList
      // 084: dup
      // 085: invokespecial java/util/ArrayList.<init> ()V
      // 088: astore 6
      // 08a: bipush 0
      // 08b: istore 7
      // 08d: iload 7
      // 08f: aload 4
      // 091: invokevirtual com/finalshell/ui/model/Oc2.size ()I
      // 094: if_icmpge 0e3
      // 097: aload 4
      // 099: iload 7
      // 09b: invokevirtual com/finalshell/ui/model/Oc2.V (I)Lcom/finalshell/ui/model/O0;
      // 09e: astore 8
      // 0a0: new com/finalshell/core/Lv4_2
      // 0a3: dup
      // 0a4: invokespecial com/finalshell/core/Lv4_2.<init> ()V
      // 0a7: astore 9
      // 0a9: aload 9
      // 0ab: aload 8
      // 0ad: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0b0: ldc2_w 158785826570849572
      // 0b3: astore 26
      // 0b5: astore 25
      // 0b7: ldc2_w 158785826570849572
      // 0ba: aload 25
      // 0bc: aload 26
      // 0be: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c1: pop
      // 0c2: goto 0c9
      // 0c5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: aload 6
      // 0cb: aload 2
      // 0cc: ifnull 0ea
      // 0cf: aload 9
      // 0d1: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0d4: pop
      // 0d5: iinc 7 1
      // 0d8: aload 2
      // 0d9: ifnonnull 08d
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: new java/util/ArrayList
      // 0e6: dup
      // 0e7: invokespecial java/util/ArrayList.<init> ()V
      // 0ea: astore 7
      // 0ec: new java/util/ArrayList
      // 0ef: dup
      // 0f0: invokespecial java/util/ArrayList.<init> ()V
      // 0f3: astore 8
      // 0f5: new com/finalshell/ui/model/Oc2
      // 0f8: dup
      // 0f9: invokespecial com/finalshell/ui/model/Oc2.<init> ()V
      // 0fc: astore 9
      // 0fe: new com/finalshell/ui/model/Oc2
      // 101: dup
      // 102: invokespecial com/finalshell/ui/model/Oc2.<init> ()V
      // 105: astore 10
      // 107: aload 0
      // 108: new java/io/File
      // 10b: dup
      // 10c: ldc2_w 478301022169899080
      // 10f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 112: aconst_null
      // 113: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 116: checkcast java/lang/String
      // 119: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 11c: aload 9
      // 11e: aload 10
      // 120: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 123: ldc2_w 319878986049367460
      // 126: astore 28
      // 128: astore 27
      // 12a: ldc2_w 319878986049367460
      // 12d: aload 27
      // 12f: aload 28
      // 131: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 134: pop
      // 135: goto 13c
      // 138: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13b: athrow
      // 13c: aload 9
      // 13e: invokevirtual com/finalshell/ui/model/Oc2.toArray ()[Ljava/lang/Object;
      // 141: astore 11
      // 143: aload 11
      // 145: arraylength
      // 146: istore 12
      // 148: bipush 0
      // 149: istore 13
      // 14b: iload 13
      // 14d: iload 12
      // 14f: if_icmpge 1a3
      // 152: aload 11
      // 154: iload 13
      // 156: aaload
      // 157: astore 14
      // 159: aload 14
      // 15b: checkcast com/finalshell/ui/model/O0
      // 15e: astore 15
      // 160: new com/finalshell/core/LO3
      // 163: dup
      // 164: invokespecial com/finalshell/core/LO3.<init> ()V
      // 167: astore 16
      // 169: aload 16
      // 16b: aload 15
      // 16d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 170: ldc2_w 499690674028780412
      // 173: astore 30
      // 175: astore 29
      // 177: ldc2_w 499690674028780412
      // 17a: aload 29
      // 17c: aload 30
      // 17e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 181: pop
      // 182: goto 189
      // 185: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 188: athrow
      // 189: aload 7
      // 18b: aload 16
      // 18d: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 190: pop
      // 191: iinc 13 1
      // 194: aload 2
      // 195: ifnull 1af
      // 198: aload 2
      // 199: ifnonnull 14b
      // 19c: goto 1a3
      // 19f: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a2: athrow
      // 1a3: aload 10
      // 1a5: invokevirtual com/finalshell/ui/model/Oc2.toArray ()[Ljava/lang/Object;
      // 1a8: astore 11
      // 1aa: aload 11
      // 1ac: arraylength
      // 1ad: istore 12
      // 1af: bipush 0
      // 1b0: istore 13
      // 1b2: iload 13
      // 1b4: iload 12
      // 1b6: if_icmpge 20f
      // 1b9: aload 11
      // 1bb: iload 13
      // 1bd: aaload
      // 1be: astore 14
      // 1c0: aload 2
      // 1c1: ifnull 20b
      // 1c4: aload 14
      // 1c6: ifnull 208
      // 1c9: goto 1d0
      // 1cc: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cf: athrow
      // 1d0: aload 14
      // 1d2: checkcast com/finalshell/ui/model/O0
      // 1d5: astore 15
      // 1d7: new com/finalshell/core/Lv4_2
      // 1da: dup
      // 1db: invokespecial com/finalshell/core/Lv4_2.<init> ()V
      // 1de: astore 16
      // 1e0: aload 16
      // 1e2: aload 15
      // 1e4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1e7: ldc2_w 158785826570849572
      // 1ea: astore 32
      // 1ec: astore 31
      // 1ee: ldc2_w 158785826570849572
      // 1f1: aload 31
      // 1f3: aload 32
      // 1f5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1f8: pop
      // 1f9: goto 200
      // 1fc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ff: athrow
      // 200: aload 8
      // 202: aload 16
      // 204: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 207: pop
      // 208: iinc 13 1
      // 20b: aload 2
      // 20c: ifnonnull 1b2
      // 20f: aload 5
      // 211: aload 7
      // 213: new com/finalshell/core/LO3
      // 216: dup
      // 217: invokespecial com/finalshell/core/LO3.<init> ()V
      // 21a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 21d: ldc2_w 212474312414779304
      // 220: astore 33
      // 222: ldc2_w 212474312414779304
      // 225: aload 33
      // 227: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 22a: checkcast java/util/ArrayList
      // 22d: goto 234
      // 230: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 233: athrow
      // 234: astore 11
      // 236: aload 6
      // 238: aload 8
      // 23a: new com/finalshell/core/Lv4_2
      // 23d: dup
      // 23e: invokespecial com/finalshell/core/Lv4_2.<init> ()V
      // 241: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 244: ldc2_w 212474312414779304
      // 247: astore 35
      // 249: ldc2_w 212474312414779304
      // 24c: aload 35
      // 24e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 251: checkcast java/util/ArrayList
      // 254: goto 25b
      // 257: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 25a: athrow
      // 25b: astore 12
      // 25d: new java/util/ArrayList
      // 260: dup
      // 261: invokespecial java/util/ArrayList.<init> ()V
      // 264: astore 13
      // 266: aload 12
      // 268: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 26b: astore 14
      // 26d: aload 14
      // 26f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 274: ifeq 2d5
      // 277: aload 14
      // 279: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27e: checkcast com/finalshell/core/Lv4_2
      // 281: astore 15
      // 283: aload 15
      // 285: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 288: ldc2_w 366543685241882690
      // 28b: astore 37
      // 28d: ldc2_w 366543685241882690
      // 290: aload 37
      // 292: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 295: checkcast java/lang/Boolean
      // 298: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 29b: goto 2a2
      // 29e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a1: athrow
      // 2a2: istore 16
      // 2a4: bipush 0
      // 2a5: istore 16
      // 2a7: aload 2
      // 2a8: ifnull 2d9
      // 2ab: iload 16
      // 2ad: aload 2
      // 2ae: ifnull 2d0
      // 2b1: goto 2b8
      // 2b4: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b7: athrow
      // 2b8: ifne 2d1
      // 2bb: goto 2c2
      // 2be: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c1: athrow
      // 2c2: aload 13
      // 2c4: aload 15
      // 2c6: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 2c9: goto 2d0
      // 2cc: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cf: athrow
      // 2d0: pop
      // 2d1: aload 2
      // 2d2: ifnonnull 26d
      // 2d5: aload 13
      // 2d7: astore 12
      // 2d9: new java/util/HashMap
      // 2dc: dup
      // 2dd: invokespecial java/util/HashMap.<init> ()V
      // 2e0: astore 14
      // 2e2: new java/util/HashMap
      // 2e5: dup
      // 2e6: invokespecial java/util/HashMap.<init> ()V
      // 2e9: astore 15
      // 2eb: new java/util/ArrayList
      // 2ee: dup
      // 2ef: invokespecial java/util/ArrayList.<init> ()V
      // 2f2: astore 16
      // 2f4: aload 11
      // 2f6: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 2f9: astore 17
      // 2fb: aload 17
      // 2fd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 302: ifeq 363
      // 305: aload 17
      // 307: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 30c: checkcast com/finalshell/core/LO3
      // 30f: astore 18
      // 311: aload 18
      // 313: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 316: ldc2_w 366543685241882690
      // 319: astore 39
      // 31b: ldc2_w 366543685241882690
      // 31e: aload 39
      // 320: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 323: checkcast java/lang/Boolean
      // 326: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 329: goto 330
      // 32c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 32f: athrow
      // 330: istore 19
      // 332: bipush 0
      // 333: istore 19
      // 335: iload 19
      // 337: aload 2
      // 338: ifnull 375
      // 33b: aload 2
      // 33c: ifnull 35e
      // 33f: goto 346
      // 342: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 345: athrow
      // 346: ifne 35f
      // 349: goto 350
      // 34c: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34f: athrow
      // 350: aload 16
      // 352: aload 18
      // 354: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 357: goto 35e
      // 35a: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35d: athrow
      // 35e: pop
      // 35f: aload 2
      // 360: ifnonnull 2fb
      // 363: aload 16
      // 365: astore 11
      // 367: aload 11
      // 369: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 36c: astore 17
      // 36e: aload 17
      // 370: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 375: ifeq 3bb
      // 378: aload 17
      // 37a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 37f: checkcast com/finalshell/core/LO3
      // 382: astore 18
      // 384: aload 14
      // 386: aload 18
      // 388: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 38b: ldc2_w 194080076253066315
      // 38e: astore 42
      // 390: astore 41
      // 392: ldc2_w 194080076253066315
      // 395: aload 41
      // 397: aload 42
      // 399: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 39c: checkcast java/lang/String
      // 39f: goto 3a6
      // 3a2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a5: athrow
      // 3a6: aload 18
      // 3a8: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 3ab: pop
      // 3ac: aload 2
      // 3ad: ifnull 3c2
      // 3b0: aload 2
      // 3b1: ifnonnull 36e
      // 3b4: goto 3bb
      // 3b7: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ba: athrow
      // 3bb: aload 12
      // 3bd: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 3c0: astore 17
      // 3c2: aload 17
      // 3c4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3c9: ifeq 40f
      // 3cc: aload 17
      // 3ce: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3d3: checkcast com/finalshell/core/Lv4_2
      // 3d6: astore 18
      // 3d8: aload 15
      // 3da: aload 18
      // 3dc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3df: ldc2_w 292557478156152530
      // 3e2: astore 44
      // 3e4: astore 43
      // 3e6: ldc2_w 292557478156152530
      // 3e9: aload 43
      // 3eb: aload 44
      // 3ed: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3f0: checkcast java/lang/String
      // 3f3: goto 3fa
      // 3f6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3f9: athrow
      // 3fa: aload 18
      // 3fc: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 3ff: pop
      // 400: aload 2
      // 401: ifnull 426
      // 404: aload 2
      // 405: ifnonnull 3c2
      // 408: goto 40f
      // 40b: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40e: athrow
      // 40f: new java/io/File
      // 412: dup
      // 413: ldc2_w 478301022169899080
      // 416: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 419: aconst_null
      // 41a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 41d: checkcast java/lang/String
      // 420: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 423: invokestatic org/apache/commons/io/FileUtils.cleanDirectory (Ljava/io/File;)V
      // 426: goto 430
      // 429: astore 17
      // 42b: aload 17
      // 42d: invokevirtual java/io/IOException.printStackTrace ()V
      // 430: ldc2_w 478301022169899080
      // 433: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 436: aconst_null
      // 437: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 43a: checkcast java/lang/String
      // 43d: astore 17
      // 43f: aload 11
      // 441: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 444: astore 18
      // 446: aload 18
      // 448: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 44d: ifeq 524
      // 450: aload 18
      // 452: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 457: checkcast com/finalshell/core/LO3
      // 45a: astore 19
      // 45c: aload 0
      // 45d: aload 17
      // 45f: aload 19
      // 461: aload 14
      // 463: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 466: ldc2_w 481707439367783010
      // 469: astore 46
      // 46b: astore 45
      // 46d: ldc2_w 481707439367783010
      // 470: aload 45
      // 472: aload 46
      // 474: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 477: checkcast java/lang/String
      // 47a: goto 481
      // 47d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 480: athrow
      // 481: astore 20
      // 483: aload 2
      // 484: ifnull 4c5
      // 487: aload 20
      // 489: aload 2
      // 48a: ifnull 53c
      // 48d: goto 494
      // 490: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 493: athrow
      // 494: ifnull 520
      // 497: goto 49e
      // 49a: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49d: athrow
      // 49e: aload 19
      // 4a0: aload 20
      // 4a2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4a5: ldc2_w 452404885675972754
      // 4a8: astore 48
      // 4aa: astore 47
      // 4ac: ldc2_w 452404885675972754
      // 4af: aload 47
      // 4b1: aload 48
      // 4b3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4b6: pop
      // 4b7: goto 4be
      // 4ba: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4bd: athrow
      // 4be: goto 4c5
      // 4c1: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c4: athrow
      // 4c5: new java/io/File
      // 4c8: dup
      // 4c9: aload 19
      // 4cb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4ce: ldc2_w 120462869438675327
      // 4d1: astore 50
      // 4d3: astore 49
      // 4d5: ldc2_w 120462869438675327
      // 4d8: aload 49
      // 4da: aload 50
      // 4dc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4df: checkcast java/lang/String
      // 4e2: goto 4e9
      // 4e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4e8: athrow
      // 4e9: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 4ec: astore 21
      // 4ee: aload 21
      // 4f0: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 4f3: invokevirtual java/io/File.mkdirs ()Z
      // 4f6: pop
      // 4f7: aload 19
      // 4f9: bipush 0
      // 4fa: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 4fd: ldc2_w 222535382303311372
      // 500: astore 52
      // 502: astore 51
      // 504: ldc2_w 222535382303311372
      // 507: aload 51
      // 509: aload 52
      // 50b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 50e: pop
      // 50f: goto 516
      // 512: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 515: athrow
      // 516: goto 520
      // 519: astore 22
      // 51b: aload 22
      // 51d: invokevirtual java/lang/Exception.printStackTrace ()V
      // 520: aload 2
      // 521: ifnonnull 446
      // 524: aload 12
      // 526: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 529: astore 18
      // 52b: aload 18
      // 52d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 532: ifeq 60b
      // 535: aload 18
      // 537: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 53c: checkcast com/finalshell/core/Lv4_2
      // 53f: astore 19
      // 541: aload 0
      // 542: aload 17
      // 544: aload 19
      // 546: aload 15
      // 548: aload 14
      // 54a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 54d: ldc2_w 482498617677490932
      // 550: astore 54
      // 552: astore 53
      // 554: ldc2_w 482498617677490932
      // 557: aload 53
      // 559: aload 54
      // 55b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 55e: checkcast java/lang/String
      // 561: goto 568
      // 564: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 567: athrow
      // 568: astore 20
      // 56a: aload 2
      // 56b: ifnull 66f
      // 56e: aload 2
      // 56f: ifnull 5ac
      // 572: goto 579
      // 575: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 578: athrow
      // 579: aload 20
      // 57b: ifnull 607
      // 57e: goto 585
      // 581: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 584: athrow
      // 585: aload 19
      // 587: aload 20
      // 589: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 58c: ldc2_w 574053907803002361
      // 58f: astore 56
      // 591: astore 55
      // 593: ldc2_w 574053907803002361
      // 596: aload 55
      // 598: aload 56
      // 59a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 59d: pop
      // 59e: goto 5a5
      // 5a1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5a4: athrow
      // 5a5: goto 5ac
      // 5a8: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ab: athrow
      // 5ac: new java/io/File
      // 5af: dup
      // 5b0: aload 19
      // 5b2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5b5: ldc2_w 432693308750455264
      // 5b8: astore 58
      // 5ba: astore 57
      // 5bc: ldc2_w 432693308750455264
      // 5bf: aload 57
      // 5c1: aload 58
      // 5c3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5c6: checkcast java/lang/String
      // 5c9: goto 5d0
      // 5cc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5cf: athrow
      // 5d0: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 5d3: astore 21
      // 5d5: aload 21
      // 5d7: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 5da: invokevirtual java/io/File.mkdirs ()Z
      // 5dd: pop
      // 5de: aload 19
      // 5e0: bipush 0
      // 5e1: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 5e4: ldc2_w 184613906199936191
      // 5e7: astore 60
      // 5e9: astore 59
      // 5eb: ldc2_w 184613906199936191
      // 5ee: aload 59
      // 5f0: aload 60
      // 5f2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5f5: pop
      // 5f6: goto 5fd
      // 5f9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5fc: athrow
      // 5fd: goto 607
      // 600: astore 22
      // 602: aload 22
      // 604: invokevirtual java/lang/Exception.printStackTrace ()V
      // 607: aload 2
      // 608: ifnonnull 52b
      // 60b: aload 0
      // 60c: ldc2_w 625414770048383533
      // 60f: astore 61
      // 611: ldc2_w 625414770048383533
      // 614: aload 61
      // 616: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 619: checkcast java/util/HashMap
      // 61c: invokevirtual java/util/HashMap.clear ()V
      // 61f: aload 0
      // 620: ldc2_w 284174249540363036
      // 623: astore 63
      // 625: ldc2_w 284174249540363036
      // 628: aload 63
      // 62a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 62d: checkcast java/util/HashMap
      // 630: invokevirtual java/util/HashMap.clear ()V
      // 633: aload 0
      // 634: ldc2_w 468802884589973322
      // 637: astore 65
      // 639: ldc2_w 468802884589973322
      // 63c: aload 65
      // 63e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 641: checkcast java/util/HashMap
      // 644: invokevirtual java/util/HashMap.clear ()V
      // 647: aload 0
      // 648: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 64b: ldc2_w 209972189706778209
      // 64e: astore 68
      // 650: astore 67
      // 652: ldc2_w 209972189706778209
      // 655: aload 67
      // 657: aload 68
      // 659: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 65c: pop
      // 65d: goto 664
      // 660: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 663: athrow
      // 664: new com/finalshell/task/Y82
      // 667: dup
      // 668: aload 0
      // 669: invokespecial com/finalshell/task/Y82.<init> (Lcom/finalshell/core/Yf2;)V
      // 66c: invokestatic javax/swing/SwingUtilities.invokeLater (Ljava/lang/Runnable;)V
      // 66f: return
   }

   public String Z(String var1, Lv4_2 var2, HashMap var3, HashMap var4) {
      Lv4_2.H$arrint();
      String var10002 = (String)(Registry.packArgs(var1, var2, var3, var4));
      long var8 = 124131248420855239L;
      Object var7 = var10002;
      var10002 = Ref.h(124131248420855239L, var7, var8);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      String var6 = var10002;
      Object var10001 = var6;
      if (this != null) {
         if (var6 == null) {
            return null;
         }

         var10001 = new StringBuilder().append(var6).append(File.separator);
         String var10003 = (String)(Registry.emptyArgs());
         long var10 = 292557478156152530L;
         Object var9 = var10003;
         var10003 = Ref.h(292557478156152530L, var9, var10);

         try {
            var10003 = (String)var10003;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         var2.append((String)var10003).append(a(-17601, 14094)).toString();
      }

      return (String)var10001;
   }

   public String Z(String var1, Ln4_2 var2, HashMap var3, HashMap var4) {
      Lv4_2.H$arrint();
      String var6 = null;
      String var10002 = (String)(Registry.emptyArgs());
      long var10 = 413442976446181537L;
      Object var9 = var10002;
      var10002 = Ref.h(413442976446181537L, var9, var10);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      String var7 = var10002;
      Object var10001 = var7;
      if (var2 != null) {
         if (var7.equals(a(-17602, 17474))) {
            return var1;
         }

         var10001 = var4;
         String var10003 = (String)(Registry.emptyArgs());
         long var12 = 413442976446181537L;
         Object var11 = var10003;
         var10003 = Ref.h(413442976446181537L, var11, var12);

         try {
            var10003 = (String)var10003;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }

         var2.get(var10003);
      }

      LO3 var8 = (LO3)var10001;
      if (var8 != null) {
         var10002 = Registry.packArgs(var1, var8, var3, var4);
         long var14 = 124131248420855239L;
         Object var13 = var10002;
         var10002 = Ref.h(124131248420855239L, var13, var14);

         try {
            var10002 = (String)var10002;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         var6 = var10002;
         var10002 = var6;
         if (var2 != null) {
            if (var6 == null) {
               return null;
            }

            var10002 = var6;
         }

         if (var2 != null) {
            if (!var10002.endsWith(File.separator)) {
               var6 = var6 + File.separator;
            }

            var10002 = (String)(new StringBuilder().append(var6));
            String var10004 = (String)(Registry.emptyArgs());
            long var16 = 413442976446181537L;
            Object var15 = var10004;
            var10004 = Ref.h(413442976446181537L, var15, var16);

            try {
               var10004 = (String)var10004;
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }

            var2.append((String)var10004).toString();
         }

         var6 = var10002;
      }

      return var6;
   }

   public String C(String var1, LO3 var2, HashMap var3) {
      Lv4_2.H$arrint();
      String var10002 = (String)(Registry.packArgs(var1, var2, var3));
      long var7 = 556374816825191893L;
      Object var6 = var10002;
      var10002 = Ref.h(556374816825191893L, var6, var7);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      String var5 = var10002;
      Object var10001 = var5;
      if (this != null) {
         if (var5 == null) {
            return null;
         }

         var10001 = new StringBuilder().append(var5).append(File.separator);
         String var10003 = (String)(Registry.emptyArgs());
         long var9 = 194080076253066315L;
         Object var8 = var10003;
         var10003 = Ref.h(194080076253066315L, var8, var9);

         try {
            var10003 = (String)var10003;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         var2.append((String)var10003).append(File.separator).append(a(-17608, 29649)).toString();
      }

      return (String)var10001;
   }

   public String m(String var1, LO3 var2, HashMap var3) {
      String var5 = "";
      Lv4_2.H$arrint();
      String var10002 = (String)(Registry.emptyArgs());
      long var10 = 413442976446181537L;
      Object var9 = var10002;
      var10002 = Ref.h(413442976446181537L, var9, var10);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      String var6 = var10002;
      Object var10001 = var6;
      if (var2 != null) {
         if (var6.equals(a(-17602, 17474))) {
            return var1;
         }

         var10001 = var3;
         String var10003 = (String)(Registry.emptyArgs());
         long var12 = 194080076253066315L;
         Object var11 = var10003;
         var10003 = Ref.h(194080076253066315L, var11, var12);

         try {
            var10003 = (String)var10003;
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }

         var2.get(var10003);
      }

      LO3 var7 = (LO3)var10001;
      String var30 = (String)(Registry.emptyArgs());
      long var14 = 413442976446181537L;
      Object var13 = var30;
      var30 = Ref.h(413442976446181537L, var13, var14);

      try {
         var30 = (String)var30;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      LO3 var8 = (LO3)var7.get(var30);
      LO3 var27 = var7;
      if (var2 != null) {
         if (var7 == null) {
            return var5;
         }

         var27 = var8;
      }

      if (var27 != null) {
         var30 = Registry.packArgs(var1, var8, var3);
         long var16 = 556374816825191893L;
         Object var15 = var30;
         var30 = Ref.h(556374816825191893L, var15, var16);

         try {
            var30 = (String)var30;
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         var5 = var30;
         var30 = var5;
         if (var2 != null) {
            if (!var5.endsWith(File.separator)) {
               var5 = var5 + File.separator;
            }

            var30 = (String)(new StringBuilder().append(var5));
            String var10005 = (String)(Registry.emptyArgs());
            long var18 = 413442976446181537L;
            Object var17 = var10005;
            var10005 = Ref.h(413442976446181537L, var17, var18);

            try {
               var10005 = (String)var10005;
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }

            var2.append((String)var10005).append(File.separator).toString();
         }

         var5 = var30;
      }

      return var5;
   }

   public void U() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: new java/io/File
      // 004: dup
      // 005: ldc2_w 478301022169899080
      // 008: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 00b: aconst_null
      // 00c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 00f: checkcast java/lang/String
      // 012: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 015: new java/util/ArrayList
      // 018: dup
      // 019: invokespecial java/util/ArrayList.<init> ()V
      // 01c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 01f: ldc2_w 149873078330225244
      // 022: astore 7
      // 024: astore 6
      // 026: ldc2_w 149873078330225244
      // 029: aload 6
      // 02b: aload 7
      // 02d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 030: pop
      // 031: goto 038
      // 034: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 037: athrow
      // 038: invokestatic com/finalshell/core/Lv4_2.H$arrint ()[I
      // 03b: new java/util/ArrayList
      // 03e: dup
      // 03f: invokespecial java/util/ArrayList.<init> ()V
      // 042: astore 2
      // 043: aload 0
      // 044: new java/io/File
      // 047: dup
      // 048: ldc2_w 478301022169899080
      // 04b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 04e: aconst_null
      // 04f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 052: checkcast java/lang/String
      // 055: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 058: aload 2
      // 059: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 05c: ldc2_w 280917971226844586
      // 05f: astore 9
      // 061: astore 8
      // 063: ldc2_w 280917971226844586
      // 066: aload 8
      // 068: aload 9
      // 06a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 06d: pop
      // 06e: goto 075
      // 071: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 074: athrow
      // 075: astore 1
      // 076: aload 2
      // 077: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 07a: astore 3
      // 07b: aload 3
      // 07c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 081: ifeq 0f4
      // 084: aload 3
      // 085: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08a: checkcast java/io/File
      // 08d: astore 4
      // 08f: aload 1
      // 090: ifnull 101
      // 093: aload 1
      // 094: ifnull 0e6
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: aload 4
      // 0a0: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0a3: sipush -17607
      // 0a6: sipush 2021
      // 0a9: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 0ac: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0af: ifne 0c4
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: aload 1
      // 0ba: ifnonnull 07b
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: aload 4
      // 0c7: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0ca: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0cd: ldc2_w 392060547546048329
      // 0d0: astore 11
      // 0d2: astore 10
      // 0d4: ldc2_w 392060547546048329
      // 0d7: aload 10
      // 0d9: aload 11
      // 0db: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0de: goto 0e5
      // 0e1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: pop
      // 0e6: goto 0f0
      // 0e9: astore 5
      // 0eb: aload 5
      // 0ed: invokevirtual java/lang/Exception.printStackTrace ()V
      // 0f0: aload 1
      // 0f1: ifnonnull 07b
      // 0f4: aload 0
      // 0f5: bipush 1
      // 0f6: ldc2_w 519525852301985336
      // 0f9: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0fc: dup_x2
      // 0fd: pop
      // 0fe: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 101: return
   }

   public boolean A() {
      return Registry.lookupField(519525852301985336L).getBoolean(this);
   }

   public HashSet s() {
      HashSet var1 = new HashSet();
      Object[] var10001 = Registry.packArgs(new File((String)Registry.lookupField(478301022169899080L).get(null)), var1);
      long var3 = 412070775441827555L;
      Object[] var2 = var10001;
      Ref.h(412070775441827555L, var2, var3);

      try {
         return var1;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void U(File param1, HashSet param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Lv4_2.H$arrint ()[I
      // 003: aload 1
      // 004: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 007: astore 4
      // 009: astore 3
      // 00a: aload 4
      // 00c: aload 3
      // 00d: ifnull 01c
      // 010: ifnull 2a4
      // 013: goto 01a
      // 016: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 019: athrow
      // 01a: aload 4
      // 01c: astore 5
      // 01e: aload 5
      // 020: arraylength
      // 021: istore 6
      // 023: bipush 0
      // 024: istore 7
      // 026: iload 7
      // 028: iload 6
      // 02a: if_icmpge 2a4
      // 02d: aload 5
      // 02f: iload 7
      // 031: aaload
      // 032: astore 8
      // 034: aload 8
      // 036: invokevirtual java/io/File.isFile ()Z
      // 039: aload 3
      // 03a: ifnull 273
      // 03d: ifeq 267
      // 040: goto 047
      // 043: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: aconst_null
      // 048: astore 9
      // 04a: aload 8
      // 04c: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 04f: sipush -17607
      // 052: sipush 2021
      // 055: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 058: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 05b: aload 3
      // 05c: ifnull 166
      // 05f: ifeq 155
      // 062: goto 069
      // 065: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 068: athrow
      // 069: aload 8
      // 06b: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 06e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 071: ldc2_w 489538163792786034
      // 074: astore 13
      // 076: ldc2_w 489538163792786034
      // 079: aload 13
      // 07b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 07e: checkcast java/lang/Boolean
      // 081: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 084: goto 08b
      // 087: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: istore 10
      // 08d: iload 10
      // 08f: ifne 125
      // 092: aload 8
      // 094: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 097: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 09a: ldc2_w 267247201659746241
      // 09d: astore 15
      // 09f: ldc2_w 267247201659746241
      // 0a2: aload 15
      // 0a4: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a7: checkcast com/finalshell/ui/model/O0
      // 0aa: goto 0b1
      // 0ad: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: astore 11
      // 0b3: aload 11
      // 0b5: aload 3
      // 0b6: ifnull 0c5
      // 0b9: ifnull 11c
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: aload 11
      // 0c5: invokevirtual com/finalshell/ui/model/O0.toString ()Ljava/lang/String;
      // 0c8: aload 8
      // 0ca: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0cd: ldc2_w 606168502965872893
      // 0d0: astore 17
      // 0d2: ldc2_w 606168502965872893
      // 0d5: aload 17
      // 0d7: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0da: pop
      // 0db: goto 0e2
      // 0de: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: new java/lang/StringBuilder
      // 0e5: dup
      // 0e6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e9: sipush -17613
      // 0ec: sipush 14224
      // 0ef: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 0f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f5: aload 8
      // 0f7: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 0fa: bipush 0
      // 0fb: sipush 29726
      // 0fe: ldc2_w 1827515249212320220
      // 101: invokestatic com/finalshell/core/Yf2.a (IJ)I
      // 104: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 107: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10d: astore 9
      // 10f: goto 122
      // 112: astore 12
      // 114: aload 12
      // 116: invokevirtual java/lang/Exception.printStackTrace ()V
      // 119: goto 122
      // 11c: aload 8
      // 11e: invokevirtual java/io/File.delete ()Z
      // 121: pop
      // 122: goto 152
      // 125: new java/lang/StringBuilder
      // 128: dup
      // 129: invokespecial java/lang/StringBuilder.<init> ()V
      // 12c: sipush -17625
      // 12f: sipush 3121
      // 132: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 135: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 138: aload 8
      // 13a: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 13d: bipush 0
      // 13e: sipush 2797
      // 141: ldc2_w 9146014943586326318
      // 144: invokestatic com/finalshell/core/Yf2.a (IJ)I
      // 147: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 14a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 150: astore 9
      // 152: goto 250
      // 155: aload 8
      // 157: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 15a: sipush -17608
      // 15d: sipush 29649
      // 160: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 163: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 166: aload 3
      // 167: ifnull 19d
      // 16a: ifeq 250
      // 16d: goto 174
      // 170: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 173: athrow
      // 174: aload 8
      // 176: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 179: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 17c: ldc2_w 489538163792786034
      // 17f: astore 19
      // 181: ldc2_w 489538163792786034
      // 184: aload 19
      // 186: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 189: checkcast java/lang/Boolean
      // 18c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 18f: goto 196
      // 192: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 195: athrow
      // 196: goto 19d
      // 199: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: istore 10
      // 19f: iload 10
      // 1a1: ifne 22d
      // 1a4: aload 8
      // 1a6: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 1a9: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1ac: ldc2_w 172104375824907718
      // 1af: astore 21
      // 1b1: ldc2_w 172104375824907718
      // 1b4: aload 21
      // 1b6: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1b9: checkcast com/finalshell/ui/model/O0
      // 1bc: goto 1c3
      // 1bf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c2: athrow
      // 1c3: astore 11
      // 1c5: aload 11
      // 1c7: aload 3
      // 1c8: ifnull 1d7
      // 1cb: ifnull 224
      // 1ce: goto 1d5
      // 1d1: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d4: athrow
      // 1d5: aload 11
      // 1d7: invokevirtual com/finalshell/ui/model/O0.toString ()Ljava/lang/String;
      // 1da: aload 8
      // 1dc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 1df: ldc2_w 606168502965872893
      // 1e2: astore 23
      // 1e4: ldc2_w 606168502965872893
      // 1e7: aload 23
      // 1e9: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ec: pop
      // 1ed: goto 1f4
      // 1f0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f3: athrow
      // 1f4: new java/lang/StringBuilder
      // 1f7: dup
      // 1f8: invokespecial java/lang/StringBuilder.<init> ()V
      // 1fb: sipush -17615
      // 1fe: sipush 29341
      // 201: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 204: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 207: aload 8
      // 209: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 20c: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 20f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 212: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 215: astore 9
      // 217: goto 22a
      // 21a: astore 12
      // 21c: aload 12
      // 21e: invokevirtual java/lang/Exception.printStackTrace ()V
      // 221: goto 22a
      // 224: aload 8
      // 226: invokevirtual java/io/File.delete ()Z
      // 229: pop
      // 22a: goto 250
      // 22d: new java/lang/StringBuilder
      // 230: dup
      // 231: invokespecial java/lang/StringBuilder.<init> ()V
      // 234: sipush -17630
      // 237: sipush 29649
      // 23a: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 23d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 240: aload 8
      // 242: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 245: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 248: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 24e: astore 9
      // 250: aload 9
      // 252: ifnull 263
      // 255: aload 2
      // 256: aload 9
      // 258: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 25b: pop
      // 25c: goto 263
      // 25f: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 262: athrow
      // 263: aload 3
      // 264: ifnonnull 29d
      // 267: aload 8
      // 269: invokevirtual java/io/File.isDirectory ()Z
      // 26c: goto 273
      // 26f: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 272: athrow
      // 273: ifeq 29d
      // 276: aload 0
      // 277: aload 8
      // 279: aload 2
      // 27a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 27d: ldc2_w 412070775441827555
      // 280: astore 26
      // 282: astore 25
      // 284: ldc2_w 412070775441827555
      // 287: aload 25
      // 289: aload 26
      // 28b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 28e: pop
      // 28f: goto 296
      // 292: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 295: athrow
      // 296: goto 29d
      // 299: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29c: athrow
      // 29d: iinc 7 1
      // 2a0: aload 3
      // 2a1: ifnonnull 026
      // 2a4: return
   }

   public void v() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/util/ArrayList
      // 003: dup
      // 004: invokespecial java/util/ArrayList.<init> ()V
      // 007: astore 2
      // 008: new java/util/ArrayList
      // 00b: dup
      // 00c: invokespecial java/util/ArrayList.<init> ()V
      // 00f: astore 3
      // 010: invokestatic com/finalshell/core/Lv4_2.H$arrint ()[I
      // 013: aload 0
      // 014: new java/io/File
      // 017: dup
      // 018: ldc2_w 478301022169899080
      // 01b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 01e: aconst_null
      // 01f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 022: checkcast java/lang/String
      // 025: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 028: aload 2
      // 029: aload 3
      // 02a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 02d: ldc2_w 232808289332421156
      // 030: astore 18
      // 032: astore 17
      // 034: ldc2_w 232808289332421156
      // 037: aload 17
      // 039: aload 18
      // 03b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03e: pop
      // 03f: goto 046
      // 042: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 045: athrow
      // 046: astore 1
      // 047: getstatic com/finalshell/core/Yf2.f J
      // 04a: lstore 4
      // 04c: bipush 0
      // 04d: istore 6
      // 04f: aload 3
      // 050: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 053: astore 7
      // 055: aload 7
      // 057: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 05c: ifeq 15f
      // 05f: aload 7
      // 061: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 066: checkcast com/finalshell/core/Lv4_2
      // 069: astore 8
      // 06b: aload 8
      // 06d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 070: ldc2_w 366543685241882690
      // 073: astore 19
      // 075: ldc2_w 366543685241882690
      // 078: aload 19
      // 07a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 07d: checkcast java/lang/Boolean
      // 080: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 083: goto 08a
      // 086: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 089: athrow
      // 08a: aload 1
      // 08b: ifnull 16c
      // 08e: ifeq 15b
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 09b: ldc2_w 270389152141252877
      // 09e: astore 21
      // 0a0: ldc2_w 270389152141252877
      // 0a3: aload 21
      // 0a5: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a8: goto 0af
      // 0ab: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0b2: ldc2_w 445913128761932285
      // 0b5: astore 24
      // 0b7: astore 23
      // 0b9: ldc2_w 445913128761932285
      // 0bc: aload 23
      // 0be: aload 24
      // 0c0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c3: goto 0ca
      // 0c6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: aload 8
      // 0cc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0cf: ldc2_w 292557478156152530
      // 0d2: astore 26
      // 0d4: astore 25
      // 0d6: ldc2_w 292557478156152530
      // 0d9: aload 25
      // 0db: aload 26
      // 0dd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e0: goto 0e7
      // 0e3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ea: ldc2_w 342864006414696382
      // 0ed: astore 28
      // 0ef: astore 27
      // 0f1: ldc2_w 342864006414696382
      // 0f4: aload 27
      // 0f6: aload 28
      // 0f8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0fb: checkcast java/lang/Long
      // 0fe: invokevirtual java/lang/Long.longValue ()J
      // 101: goto 108
      // 104: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 107: athrow
      // 108: lstore 9
      // 10a: lload 9
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: aload 1
      // 10f: ifnull 12c
      // 112: ifle 15b
      // 115: goto 11c
      // 118: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b: athrow
      // 11c: invokestatic java/lang/System.currentTimeMillis ()J
      // 11f: lload 9
      // 121: lsub
      // 122: lload 4
      // 124: lcmp
      // 125: goto 12c
      // 128: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: ifle 15b
      // 12f: new java/io/File
      // 132: dup
      // 133: aload 8
      // 135: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 138: ldc2_w 432693308750455264
      // 13b: astore 30
      // 13d: astore 29
      // 13f: ldc2_w 432693308750455264
      // 142: aload 29
      // 144: aload 30
      // 146: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 149: checkcast java/lang/String
      // 14c: goto 153
      // 14f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 152: athrow
      // 153: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 156: astore 11
      // 158: bipush 1
      // 159: istore 6
      // 15b: aload 1
      // 15c: ifnonnull 055
      // 15f: aload 2
      // 160: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 163: astore 7
      // 165: aload 7
      // 167: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 16c: ifeq 27d
      // 16f: aload 7
      // 171: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 176: checkcast com/finalshell/core/LO3
      // 179: astore 8
      // 17b: aload 8
      // 17d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 180: ldc2_w 366543685241882690
      // 183: astore 31
      // 185: ldc2_w 366543685241882690
      // 188: aload 31
      // 18a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 18d: checkcast java/lang/Boolean
      // 190: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 193: goto 19a
      // 196: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 199: athrow
      // 19a: aload 1
      // 19b: ifnull 27f
      // 19e: ifeq 279
      // 1a1: goto 1a8
      // 1a4: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a7: athrow
      // 1a8: new java/io/File
      // 1ab: dup
      // 1ac: aload 8
      // 1ae: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b1: ldc2_w 120462869438675327
      // 1b4: astore 34
      // 1b6: astore 33
      // 1b8: ldc2_w 120462869438675327
      // 1bb: aload 33
      // 1bd: aload 34
      // 1bf: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c2: checkcast java/lang/String
      // 1c5: goto 1cc
      // 1c8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1cb: athrow
      // 1cc: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 1cf: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 1d2: astore 9
      // 1d4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1d7: ldc2_w 270389152141252877
      // 1da: astore 35
      // 1dc: ldc2_w 270389152141252877
      // 1df: aload 35
      // 1e1: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e4: goto 1eb
      // 1e7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ea: athrow
      // 1eb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1ee: ldc2_w 445913128761932285
      // 1f1: astore 38
      // 1f3: astore 37
      // 1f5: ldc2_w 445913128761932285
      // 1f8: aload 37
      // 1fa: aload 38
      // 1fc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ff: goto 206
      // 202: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 205: athrow
      // 206: aload 8
      // 208: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 20b: ldc2_w 194080076253066315
      // 20e: astore 40
      // 210: astore 39
      // 212: ldc2_w 194080076253066315
      // 215: aload 39
      // 217: aload 40
      // 219: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 21c: goto 223
      // 21f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 222: athrow
      // 223: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 226: ldc2_w 342864006414696382
      // 229: astore 42
      // 22b: astore 41
      // 22d: ldc2_w 342864006414696382
      // 230: aload 41
      // 232: aload 42
      // 234: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 237: checkcast java/lang/Long
      // 23a: invokevirtual java/lang/Long.longValue ()J
      // 23d: goto 244
      // 240: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 243: athrow
      // 244: lstore 10
      // 246: lload 10
      // 248: lconst_0
      // 249: lcmp
      // 24a: aload 1
      // 24b: ifnull 268
      // 24e: ifle 279
      // 251: goto 258
      // 254: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 257: athrow
      // 258: invokestatic java/lang/System.currentTimeMillis ()J
      // 25b: lload 10
      // 25d: lsub
      // 25e: lload 4
      // 260: lcmp
      // 261: goto 268
      // 264: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 267: athrow
      // 268: aload 1
      // 269: ifnull 277
      // 26c: ifle 279
      // 26f: goto 276
      // 272: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 275: athrow
      // 276: bipush 1
      // 277: istore 6
      // 279: aload 1
      // 27a: ifnonnull 165
      // 27d: iload 6
      // 27f: ifeq 518
      // 282: sipush -17603
      // 285: sipush -7287
      // 288: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 28b: astore 7
      // 28d: new java/text/SimpleDateFormat
      // 290: dup
      // 291: aload 7
      // 293: invokespecial java/text/SimpleDateFormat.<init> (Ljava/lang/String;)V
      // 296: astore 8
      // 298: aload 8
      // 29a: new java/util/Date
      // 29d: dup
      // 29e: invokespecial java/util/Date.<init> ()V
      // 2a1: invokevirtual java/text/SimpleDateFormat.format (Ljava/util/Date;)Ljava/lang/String;
      // 2a4: astore 9
      // 2a6: new java/io/File
      // 2a9: dup
      // 2aa: new java/lang/StringBuilder
      // 2ad: dup
      // 2ae: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b1: ldc2_w 300479712887697887
      // 2b4: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2b7: aconst_null
      // 2b8: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2bb: checkcast java/lang/String
      // 2be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c1: aload 9
      // 2c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2c9: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 2cc: astore 10
      // 2ce: new java/io/File
      // 2d1: dup
      // 2d2: ldc2_w 478301022169899080
      // 2d5: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2d8: aconst_null
      // 2d9: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2dc: checkcast java/lang/String
      // 2df: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 2e2: aload 10
      // 2e4: invokestatic org/apache/commons/io/FileUtils.copyDirectory (Ljava/io/File;Ljava/io/File;)V
      // 2e7: goto 2f1
      // 2ea: astore 11
      // 2ec: aload 11
      // 2ee: invokevirtual java/io/IOException.printStackTrace ()V
      // 2f1: aload 3
      // 2f2: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 2f5: astore 11
      // 2f7: aload 11
      // 2f9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2fe: ifeq 404
      // 301: aload 11
      // 303: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 308: checkcast com/finalshell/core/Lv4_2
      // 30b: astore 12
      // 30d: aload 12
      // 30f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 312: ldc2_w 366543685241882690
      // 315: astore 43
      // 317: ldc2_w 366543685241882690
      // 31a: aload 43
      // 31c: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 31f: checkcast java/lang/Boolean
      // 322: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 325: goto 32c
      // 328: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 32b: athrow
      // 32c: aload 1
      // 32d: ifnull 411
      // 330: ifeq 400
      // 333: goto 33a
      // 336: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 339: athrow
      // 33a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 33d: ldc2_w 270389152141252877
      // 340: astore 45
      // 342: ldc2_w 270389152141252877
      // 345: aload 45
      // 347: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 34a: goto 351
      // 34d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 350: athrow
      // 351: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 354: ldc2_w 445913128761932285
      // 357: astore 48
      // 359: astore 47
      // 35b: ldc2_w 445913128761932285
      // 35e: aload 47
      // 360: aload 48
      // 362: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 365: goto 36c
      // 368: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 36b: athrow
      // 36c: aload 12
      // 36e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 371: ldc2_w 292557478156152530
      // 374: astore 50
      // 376: astore 49
      // 378: ldc2_w 292557478156152530
      // 37b: aload 49
      // 37d: aload 50
      // 37f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 382: goto 389
      // 385: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 388: athrow
      // 389: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 38c: ldc2_w 342864006414696382
      // 38f: astore 52
      // 391: astore 51
      // 393: ldc2_w 342864006414696382
      // 396: aload 51
      // 398: aload 52
      // 39a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 39d: checkcast java/lang/Long
      // 3a0: invokevirtual java/lang/Long.longValue ()J
      // 3a3: goto 3aa
      // 3a6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a9: athrow
      // 3aa: lstore 13
      // 3ac: lload 13
      // 3ae: lconst_0
      // 3af: lcmp
      // 3b0: aload 1
      // 3b1: ifnull 3ce
      // 3b4: ifle 400
      // 3b7: goto 3be
      // 3ba: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bd: athrow
      // 3be: invokestatic java/lang/System.currentTimeMillis ()J
      // 3c1: lload 13
      // 3c3: lsub
      // 3c4: lload 4
      // 3c6: lcmp
      // 3c7: goto 3ce
      // 3ca: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3cd: athrow
      // 3ce: ifle 400
      // 3d1: new java/io/File
      // 3d4: dup
      // 3d5: aload 12
      // 3d7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3da: ldc2_w 432693308750455264
      // 3dd: astore 54
      // 3df: astore 53
      // 3e1: ldc2_w 432693308750455264
      // 3e4: aload 53
      // 3e6: aload 54
      // 3e8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3eb: checkcast java/lang/String
      // 3ee: goto 3f5
      // 3f1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3f4: athrow
      // 3f5: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 3f8: astore 15
      // 3fa: aload 15
      // 3fc: invokevirtual java/io/File.delete ()Z
      // 3ff: pop
      // 400: aload 1
      // 401: ifnonnull 2f7
      // 404: aload 2
      // 405: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 408: astore 11
      // 40a: aload 11
      // 40c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 411: ifeq 518
      // 414: aload 11
      // 416: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 41b: checkcast com/finalshell/core/LO3
      // 41e: astore 12
      // 420: aload 12
      // 422: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 425: ldc2_w 366543685241882690
      // 428: astore 55
      // 42a: ldc2_w 366543685241882690
      // 42d: aload 55
      // 42f: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 432: checkcast java/lang/Boolean
      // 435: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 438: goto 43f
      // 43b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 43e: athrow
      // 43f: ifeq 514
      // 442: new java/io/File
      // 445: dup
      // 446: aload 12
      // 448: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 44b: ldc2_w 120462869438675327
      // 44e: astore 58
      // 450: astore 57
      // 452: ldc2_w 120462869438675327
      // 455: aload 57
      // 457: aload 58
      // 459: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 45c: checkcast java/lang/String
      // 45f: goto 466
      // 462: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 465: athrow
      // 466: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 469: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 46c: astore 13
      // 46e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 471: ldc2_w 270389152141252877
      // 474: astore 59
      // 476: ldc2_w 270389152141252877
      // 479: aload 59
      // 47b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 47e: goto 485
      // 481: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 484: athrow
      // 485: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 488: ldc2_w 445913128761932285
      // 48b: astore 62
      // 48d: astore 61
      // 48f: ldc2_w 445913128761932285
      // 492: aload 61
      // 494: aload 62
      // 496: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 499: goto 4a0
      // 49c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 49f: athrow
      // 4a0: aload 12
      // 4a2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4a5: ldc2_w 194080076253066315
      // 4a8: astore 64
      // 4aa: astore 63
      // 4ac: ldc2_w 194080076253066315
      // 4af: aload 63
      // 4b1: aload 64
      // 4b3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4b6: goto 4bd
      // 4b9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4bc: athrow
      // 4bd: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4c0: ldc2_w 342864006414696382
      // 4c3: astore 66
      // 4c5: astore 65
      // 4c7: ldc2_w 342864006414696382
      // 4ca: aload 65
      // 4cc: aload 66
      // 4ce: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4d1: checkcast java/lang/Long
      // 4d4: invokevirtual java/lang/Long.longValue ()J
      // 4d7: goto 4de
      // 4da: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4dd: athrow
      // 4de: lstore 14
      // 4e0: lload 14
      // 4e2: lconst_0
      // 4e3: lcmp
      // 4e4: aload 1
      // 4e5: ifnull 502
      // 4e8: ifle 514
      // 4eb: goto 4f2
      // 4ee: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f1: athrow
      // 4f2: invokestatic java/lang/System.currentTimeMillis ()J
      // 4f5: lload 14
      // 4f7: lsub
      // 4f8: lload 4
      // 4fa: lcmp
      // 4fb: goto 502
      // 4fe: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 501: athrow
      // 502: ifle 514
      // 505: aload 13
      // 507: invokestatic org/apache/commons/io/FileUtils.forceDelete (Ljava/io/File;)V
      // 50a: goto 514
      // 50d: astore 16
      // 50f: aload 16
      // 511: invokevirtual java/io/IOException.printStackTrace ()V
      // 514: aload 1
      // 515: ifnonnull 40a
      // 518: return
   }

   public void G(File param1, ArrayList param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Lv4_2.H$arrint ()[I
      // 003: aload 1
      // 004: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 007: astore 4
      // 009: astore 3
      // 00a: aload 4
      // 00c: aload 3
      // 00d: ifnull 01c
      // 010: ifnull 533
      // 013: goto 01a
      // 016: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 019: athrow
      // 01a: aload 4
      // 01c: astore 5
      // 01e: aload 5
      // 020: arraylength
      // 021: istore 6
      // 023: bipush 0
      // 024: istore 7
      // 026: iload 7
      // 028: iload 6
      // 02a: if_icmpge 533
      // 02d: aload 5
      // 02f: iload 7
      // 031: aaload
      // 032: astore 8
      // 034: aload 8
      // 036: invokevirtual java/io/File.isFile ()Z
      // 039: aload 3
      // 03a: ifnull 24b
      // 03d: ifeq 23b
      // 040: goto 047
      // 043: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: aload 8
      // 049: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 04c: sipush -17607
      // 04f: sipush 2021
      // 052: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 055: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 058: aload 3
      // 059: ifnull 23a
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: ifne 234
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: aload 8
      // 06f: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 072: sipush -17614
      // 075: sipush 3384
      // 078: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 07b: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 07e: aload 3
      // 07f: ifnull 23a
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: ifne 234
      // 08c: goto 093
      // 08f: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 092: athrow
      // 093: aload 8
      // 095: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 098: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 09b: ldc2_w 247244861321523360
      // 09e: astore 17
      // 0a0: ldc2_w 247244861321523360
      // 0a3: aload 17
      // 0a5: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a8: checkcast java/lang/String
      // 0ab: goto 0b2
      // 0ae: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: astore 9
      // 0b4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0b7: ldc2_w 236040230540929068
      // 0ba: astore 19
      // 0bc: ldc2_w 236040230540929068
      // 0bf: aload 19
      // 0c1: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c4: checkcast java/lang/String
      // 0c7: goto 0ce
      // 0ca: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: astore 10
      // 0d0: new java/lang/StringBuilder
      // 0d3: dup
      // 0d4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d7: aload 10
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dc: sipush -17607
      // 0df: sipush 2021
      // 0e2: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0eb: astore 11
      // 0ed: new java/io/File
      // 0f0: dup
      // 0f1: new java/lang/StringBuilder
      // 0f4: dup
      // 0f5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f8: aload 8
      // 0fa: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 0fd: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 100: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 103: getstatic java/io/File.separator Ljava/lang/String;
      // 106: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 109: aload 11
      // 10b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 111: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 114: astore 12
      // 116: aload 8
      // 118: aload 12
      // 11a: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 11d: pop
      // 11e: aload 12
      // 120: astore 8
      // 122: aload 8
      // 124: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 127: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 12a: ldc2_w 340002508208074194
      // 12d: astore 21
      // 12f: ldc2_w 340002508208074194
      // 132: aload 21
      // 134: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 137: checkcast java/lang/String
      // 13a: goto 141
      // 13d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 140: athrow
      // 141: invokestatic com/finalshell/ui/model/O0.y (Ljava/lang/String;)Lcom/finalshell/ui/model/O0;
      // 144: astore 13
      // 146: aload 13
      // 148: aload 3
      // 149: ifnull 200
      // 14c: sipush -17626
      // 14f: sipush -19094
      // 152: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 155: invokevirtual com/finalshell/ui/model/O0.containsKey (Ljava/lang/Object;)Z
      // 158: ifne 1fe
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 161: athrow
      // 162: aload 13
      // 164: sipush -17609
      // 167: sipush 31877
      // 16a: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 16d: aload 9
      // 16f: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 172: pop
      // 173: aload 13
      // 175: sipush -17604
      // 178: sipush -12767
      // 17b: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 17e: aload 10
      // 180: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 183: pop
      // 184: invokestatic java/lang/System.currentTimeMillis ()J
      // 187: lstore 14
      // 189: aload 13
      // 18b: sipush -17605
      // 18e: sipush -1569
      // 191: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 194: lload 14
      // 196: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 199: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 19c: pop
      // 19d: aload 8
      // 19f: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 1a2: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 1a5: astore 16
      // 1a7: aload 16
      // 1a9: aload 3
      // 1aa: ifnull 1fd
      // 1ad: sipush -17629
      // 1b0: sipush -14418
      // 1b3: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 1b6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b9: ifne 1df
      // 1bc: goto 1c3
      // 1bf: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c2: athrow
      // 1c3: aload 13
      // 1c5: sipush -17632
      // 1c8: sipush -11391
      // 1cb: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 1ce: aload 16
      // 1d0: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 1d3: pop
      // 1d4: aload 3
      // 1d5: ifnonnull 1fe
      // 1d8: goto 1df
      // 1db: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1de: athrow
      // 1df: aload 13
      // 1e1: sipush -17612
      // 1e4: sipush -29283
      // 1e7: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 1ea: sipush -17606
      // 1ed: sipush 13373
      // 1f0: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 1f3: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 1f6: goto 1fd
      // 1f9: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fc: athrow
      // 1fd: pop
      // 1fe: aload 13
      // 200: invokevirtual com/finalshell/ui/model/O0.toString ()Ljava/lang/String;
      // 203: aload 8
      // 205: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 208: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 20b: ldc2_w 373871880855596298
      // 20e: astore 23
      // 210: ldc2_w 373871880855596298
      // 213: aload 23
      // 215: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 218: pop
      // 219: goto 220
      // 21c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 21f: athrow
      // 220: goto 22a
      // 223: astore 14
      // 225: aload 14
      // 227: invokevirtual java/lang/Exception.printStackTrace ()V
      // 22a: goto 234
      // 22d: astore 14
      // 22f: aload 14
      // 231: invokevirtual java/lang/Exception.printStackTrace ()V
      // 234: aload 2
      // 235: aload 8
      // 237: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 23a: pop
      // 23b: aload 8
      // 23d: aload 3
      // 23e: ifnull 280
      // 241: invokevirtual java/io/File.isDirectory ()Z
      // 244: goto 24b
      // 247: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24a: athrow
      // 24b: ifeq 52c
      // 24e: new java/io/File
      // 251: dup
      // 252: new java/lang/StringBuilder
      // 255: dup
      // 256: invokespecial java/lang/StringBuilder.<init> ()V
      // 259: aload 8
      // 25b: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 25e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 261: getstatic java/io/File.separator Ljava/lang/String;
      // 264: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 267: sipush -17608
      // 26a: sipush 29649
      // 26d: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 270: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 273: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 276: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 279: goto 280
      // 27c: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27f: athrow
      // 280: astore 9
      // 282: aconst_null
      // 283: astore 10
      // 285: aload 9
      // 287: aload 3
      // 288: ifnull 2a1
      // 28b: invokevirtual java/io/File.exists ()Z
      // 28e: ifne 481
      // 291: goto 298
      // 294: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 297: athrow
      // 298: aload 8
      // 29a: goto 2a1
      // 29d: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a0: athrow
      // 2a1: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 2a4: astore 11
      // 2a6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2a9: ldc2_w 236040230540929068
      // 2ac: astore 25
      // 2ae: ldc2_w 236040230540929068
      // 2b1: aload 25
      // 2b3: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2b6: checkcast java/lang/String
      // 2b9: goto 2c0
      // 2bc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2bf: athrow
      // 2c0: astore 12
      // 2c2: new java/io/File
      // 2c5: dup
      // 2c6: new java/lang/StringBuilder
      // 2c9: dup
      // 2ca: invokespecial java/lang/StringBuilder.<init> ()V
      // 2cd: aload 8
      // 2cf: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 2d2: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 2d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d8: getstatic java/io/File.separator Ljava/lang/String;
      // 2db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2de: aload 12
      // 2e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2e6: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 2e9: astore 13
      // 2eb: aload 8
      // 2ed: aload 13
      // 2ef: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 2f2: pop
      // 2f3: aload 13
      // 2f5: astore 8
      // 2f7: new java/io/File
      // 2fa: dup
      // 2fb: new java/lang/StringBuilder
      // 2fe: dup
      // 2ff: invokespecial java/lang/StringBuilder.<init> ()V
      // 302: aload 8
      // 304: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 307: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30a: getstatic java/io/File.separator Ljava/lang/String;
      // 30d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 310: sipush -17608
      // 313: sipush 29649
      // 316: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 319: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 31f: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 322: astore 9
      // 324: new com/finalshell/core/LO3
      // 327: dup
      // 328: invokespecial com/finalshell/core/LO3.<init> ()V
      // 32b: astore 10
      // 32d: aload 10
      // 32f: aload 11
      // 331: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 334: ldc2_w 193904661956891993
      // 337: astore 28
      // 339: astore 27
      // 33b: ldc2_w 193904661956891993
      // 33e: aload 27
      // 340: aload 28
      // 342: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 345: pop
      // 346: goto 34d
      // 349: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 34c: athrow
      // 34d: aload 10
      // 34f: aload 12
      // 351: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 354: ldc2_w 416906230259364838
      // 357: astore 30
      // 359: astore 29
      // 35b: ldc2_w 416906230259364838
      // 35e: aload 29
      // 360: aload 30
      // 362: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 365: pop
      // 366: goto 36d
      // 369: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 36c: athrow
      // 36d: aload 10
      // 36f: invokestatic java/lang/System.currentTimeMillis ()J
      // 372: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 375: ldc2_w 632174181210947576
      // 378: astore 32
      // 37a: astore 31
      // 37c: ldc2_w 632174181210947576
      // 37f: aload 31
      // 381: aload 32
      // 383: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 386: pop
      // 387: goto 38e
      // 38a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 38d: athrow
      // 38e: aload 8
      // 390: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 393: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 396: astore 14
      // 398: aload 3
      // 399: ifnull 3db
      // 39c: aload 14
      // 39e: sipush -17627
      // 3a1: sipush -30758
      // 3a4: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 3a7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3aa: ifne 3df
      // 3ad: goto 3b4
      // 3b0: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b3: athrow
      // 3b4: aload 10
      // 3b6: aload 14
      // 3b8: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3bb: ldc2_w 579965879482954180
      // 3be: astore 34
      // 3c0: astore 33
      // 3c2: ldc2_w 579965879482954180
      // 3c5: aload 33
      // 3c7: aload 34
      // 3c9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3cc: pop
      // 3cd: goto 3d4
      // 3d0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3d3: athrow
      // 3d4: goto 3db
      // 3d7: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3da: athrow
      // 3db: aload 3
      // 3dc: ifnonnull 40d
      // 3df: aload 10
      // 3e1: sipush -17602
      // 3e4: sipush 17474
      // 3e7: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 3ea: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3ed: ldc2_w 579965879482954180
      // 3f0: astore 36
      // 3f2: astore 35
      // 3f4: ldc2_w 579965879482954180
      // 3f7: aload 35
      // 3f9: aload 36
      // 3fb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3fe: pop
      // 3ff: goto 406
      // 402: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 405: athrow
      // 406: goto 40d
      // 409: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40c: athrow
      // 40d: aload 10
      // 40f: aload 9
      // 411: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 414: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 417: ldc2_w 452404885675972754
      // 41a: astore 38
      // 41c: astore 37
      // 41e: ldc2_w 452404885675972754
      // 421: aload 37
      // 423: aload 38
      // 425: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 428: pop
      // 429: goto 430
      // 42c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 42f: athrow
      // 430: aload 10
      // 432: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 435: ldc2_w 185793966100702169
      // 438: astore 40
      // 43a: astore 39
      // 43c: ldc2_w 185793966100702169
      // 43f: aload 39
      // 441: aload 40
      // 443: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 446: checkcast com/finalshell/ui/model/O0
      // 449: goto 450
      // 44c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 44f: athrow
      // 450: astore 15
      // 452: aload 15
      // 454: invokevirtual com/finalshell/ui/model/O0.toString ()Ljava/lang/String;
      // 457: aload 9
      // 459: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 45c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 45f: ldc2_w 373871880855596298
      // 462: astore 41
      // 464: ldc2_w 373871880855596298
      // 467: aload 41
      // 469: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 46c: pop
      // 46d: goto 474
      // 470: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 473: athrow
      // 474: goto 47e
      // 477: astore 16
      // 479: aload 16
      // 47b: invokevirtual java/lang/Exception.printStackTrace ()V
      // 47e: goto 4d5
      // 481: new com/finalshell/core/LO3
      // 484: dup
      // 485: invokespecial com/finalshell/core/LO3.<init> ()V
      // 488: astore 10
      // 48a: aload 10
      // 48c: aload 9
      // 48e: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 491: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 494: ldc2_w 452404885675972754
      // 497: astore 44
      // 499: astore 43
      // 49b: ldc2_w 452404885675972754
      // 49e: aload 43
      // 4a0: aload 44
      // 4a2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4a5: pop
      // 4a6: goto 4ad
      // 4a9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4ac: athrow
      // 4ad: aload 10
      // 4af: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4b2: ldc2_w 409669529177196680
      // 4b5: astore 46
      // 4b7: astore 45
      // 4b9: ldc2_w 409669529177196680
      // 4bc: aload 45
      // 4be: aload 46
      // 4c0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4c3: pop
      // 4c4: goto 4cb
      // 4c7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4ca: athrow
      // 4cb: goto 4d5
      // 4ce: astore 11
      // 4d0: aload 11
      // 4d2: invokevirtual java/lang/Exception.printStackTrace ()V
      // 4d5: aload 0
      // 4d6: ldc2_w 468802884589973322
      // 4d9: astore 47
      // 4db: ldc2_w 468802884589973322
      // 4de: aload 47
      // 4e0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4e3: checkcast java/util/HashMap
      // 4e6: aload 10
      // 4e8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4eb: ldc2_w 194080076253066315
      // 4ee: astore 50
      // 4f0: astore 49
      // 4f2: ldc2_w 194080076253066315
      // 4f5: aload 49
      // 4f7: aload 50
      // 4f9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4fc: checkcast java/lang/String
      // 4ff: goto 506
      // 502: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 505: athrow
      // 506: aload 10
      // 508: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 50b: pop
      // 50c: aload 0
      // 50d: aload 8
      // 50f: aload 2
      // 510: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 513: ldc2_w 149873078330225244
      // 516: astore 52
      // 518: astore 51
      // 51a: ldc2_w 149873078330225244
      // 51d: aload 51
      // 51f: aload 52
      // 521: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 524: pop
      // 525: goto 52c
      // 528: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 52b: athrow
      // 52c: iinc 7 1
      // 52f: aload 3
      // 530: ifnonnull 026
      // 533: return
   }

   public Lv4_2 c(String var1) throws Exception {
      Lv4_2 var2 = new Lv4_2();
      Object[] var10001 = Registry.packArgs(var1);
      long var5 = 574053907803002361L;
      Object[] var4 = var10001;
      Ref.h(574053907803002361L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      try {
         Object[] var10002 = Registry.emptyArgs();
         long var7 = 540969864624467425L;
         Object[] var6 = var10002;
         Ref.h(540969864624467425L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }

         Object var8 = 625414770048383533L;
         HashMap var10003 = (HashMap)Ref.g(625414770048383533L, var8);
         String var10005 = (String)(Registry.emptyArgs());
         long var11 = 292557478156152530L;
         Object var10 = var10005;
         var10005 = Ref.h(292557478156152530L, var10, var11);

         try {
            var10005 = (String)var10005;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         var2.put(var10005, var2);
         Object var12 = 284174249540363036L;
         ((HashMap)Ref.g(284174249540363036L, var12)).put(var1, var2);
      } catch (Exception var16) {
         var16.printStackTrace();
      }

      return var2;
   }

   public void U(String var1, String var2) {
      Lv4_2 var10001 = (Lv4_2)(Registry.packArgs(var1));
      long var8 = 489768706953623433L;
      Object var7 = var10001;
      var10001 = Ref.h(489768706953623433L, var7, var8);

      try {
         var10001 = (Lv4_2)var10001;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      Lv4_2 var4 = var10001;
      Lv4_2.H$arrint();
      Object[] var10003 = Registry.packArgs(var2);
      long var10 = 574053907803002361L;
      Object[] var9 = var10003;
      Ref.h(574053907803002361L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      Lv4_2 var3 = var4;
      String var5 = new File(var2).getParentFile().getName();

      label91: {
         label86: {
            try {
               if (var3 == null) {
                  break label91;
               }

               if (!var5.equals(a(-17627, -30758))) {
                  break label86;
               }
            } catch (Exception var38) {
               throw a(var38);
            }

            var5 = a(-17602, 17474);
         }

         var10003 = Registry.packArgs(var5);
         long var12 = 579965879482954180L;
         Object[] var11 = var10003;
         Ref.h(579965879482954180L, var11, var12);

         try {
            ;
         } catch (InvocationTargetException var35) {
            throw var35.getTargetException();
         }

         Object[] var10004 = Registry.e(System.currentTimeMillis());
         long var14 = 275634842768439116L;
         Object[] var13 = var10004;
         Ref.h(275634842768439116L, var13, var14);

         try {
            ;
         } catch (InvocationTargetException var34) {
            throw var34.getTargetException();
         }

         try {
            Object[] var10005 = Registry.emptyArgs();
            long var16 = 510288519500652836L;
            Object[] var15 = var10005;
            Ref.h(510288519500652836L, var15, var16);

            try {
               ;
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }
         } catch (Exception var33) {
            var33.printStackTrace();
         }
      }

      try {
         Object var17 = 625414770048383533L;
         HashMap var42 = (HashMap)Ref.g(625414770048383533L, var17);
         String var43 = (String)(Registry.emptyArgs());
         long var20 = 292557478156152530L;
         Object var19 = var43;
         var43 = Ref.h(292557478156152530L, var19, var20);

         try {
            var43 = (String)var43;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }

         var4.put(var43, var4);
         Object var21 = 284174249540363036L;
         ((HashMap)Ref.g(284174249540363036L, var21)).remove(var1);
         Object var23 = 284174249540363036L;
         ((HashMap)Ref.g(284174249540363036L, var23)).put(var2, var4);
      } catch (Exception var31) {
         var31.printStackTrace();
      }

      Registry.emptyArgs();
      long var25 = 270389152141252877L;
      Ref.h2(270389152141252877L, var25);
      Object[] var10002 = Registry.packArgs(new TQ3("", Registry.lookupField(530374631343329180L).getInt(null), -1));
      long var28 = 473928376202613579L;
      Object[] var27 = var10002;
      Ref.h(473928376202613579L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }
   }

   public void D(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Lv4_2.H$arrint ()[I
      // 003: new java/io/File
      // 006: dup
      // 007: aload 1
      // 008: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 00b: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 00e: astore 3
      // 00f: astore 2
      // 010: new java/io/File
      // 013: dup
      // 014: aload 1
      // 015: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 018: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 01b: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 01e: astore 4
      // 020: aload 4
      // 022: aload 2
      // 023: ifnull 04c
      // 026: sipush -17627
      // 029: sipush -30758
      // 02c: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 02f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 032: ifeq 04e
      // 035: goto 03c
      // 038: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: sipush -17602
      // 03f: sipush 17474
      // 042: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: astore 4
      // 04e: aload 0
      // 04f: aload 3
      // 050: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 053: ldc2_w 133273064107181210
      // 056: astore 11
      // 058: astore 10
      // 05a: ldc2_w 133273064107181210
      // 05d: aload 10
      // 05f: aload 11
      // 061: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 064: checkcast com/finalshell/core/LO3
      // 067: goto 06e
      // 06a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: astore 5
      // 070: aload 5
      // 072: aload 4
      // 074: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 077: ldc2_w 579965879482954180
      // 07a: astore 13
      // 07c: astore 12
      // 07e: ldc2_w 579965879482954180
      // 081: aload 12
      // 083: aload 13
      // 085: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 088: pop
      // 089: goto 090
      // 08c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 5
      // 092: invokestatic java/lang/System.currentTimeMillis ()J
      // 095: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 098: ldc2_w 275634842768439116
      // 09b: astore 15
      // 09d: astore 14
      // 09f: ldc2_w 275634842768439116
      // 0a2: aload 14
      // 0a4: aload 15
      // 0a6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a9: pop
      // 0aa: goto 0b1
      // 0ad: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: aload 5
      // 0b3: new java/lang/StringBuilder
      // 0b6: dup
      // 0b7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ba: aload 1
      // 0bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0be: getstatic java/io/File.separator Ljava/lang/String;
      // 0c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c4: sipush -17608
      // 0c7: sipush 29649
      // 0ca: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 0cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d3: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d6: ldc2_w 452404885675972754
      // 0d9: astore 17
      // 0db: astore 16
      // 0dd: ldc2_w 452404885675972754
      // 0e0: aload 16
      // 0e2: aload 17
      // 0e4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e7: pop
      // 0e8: goto 0ef
      // 0eb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: aload 5
      // 0f1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0f4: ldc2_w 627686680651717230
      // 0f7: astore 19
      // 0f9: astore 18
      // 0fb: ldc2_w 627686680651717230
      // 0fe: aload 18
      // 100: aload 19
      // 102: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 105: pop
      // 106: goto 10d
      // 109: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: goto 117
      // 110: astore 6
      // 112: aload 6
      // 114: invokevirtual java/lang/Exception.printStackTrace ()V
      // 117: new java/util/ArrayList
      // 11a: dup
      // 11b: invokespecial java/util/ArrayList.<init> ()V
      // 11e: astore 6
      // 120: aload 0
      // 121: new java/io/File
      // 124: dup
      // 125: aload 1
      // 126: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 129: aload 6
      // 12b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 12e: ldc2_w 280917971226844586
      // 131: astore 21
      // 133: astore 20
      // 135: ldc2_w 280917971226844586
      // 138: aload 20
      // 13a: aload 21
      // 13c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 13f: pop
      // 140: goto 147
      // 143: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 146: athrow
      // 147: aload 6
      // 149: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 14c: astore 7
      // 14e: aload 7
      // 150: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 155: ifeq 1be
      // 158: aload 7
      // 15a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 15f: checkcast java/io/File
      // 162: astore 8
      // 164: aload 2
      // 165: ifnull 206
      // 168: aload 2
      // 169: ifnull 1b0
      // 16c: goto 173
      // 16f: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: aload 8
      // 175: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 178: sipush -17607
      // 17b: sipush 2021
      // 17e: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 181: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 184: ifeq 1ba
      // 187: goto 18e
      // 18a: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: aload 0
      // 18f: aload 8
      // 191: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 194: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 197: ldc2_w 392060547546048329
      // 19a: astore 23
      // 19c: astore 22
      // 19e: ldc2_w 392060547546048329
      // 1a1: aload 22
      // 1a3: aload 23
      // 1a5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1a8: goto 1af
      // 1ab: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ae: athrow
      // 1af: pop
      // 1b0: goto 1ba
      // 1b3: astore 9
      // 1b5: aload 9
      // 1b7: invokevirtual java/lang/Exception.printStackTrace ()V
      // 1ba: aload 2
      // 1bb: ifnonnull 14e
      // 1be: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1c1: ldc2_w 270389152141252877
      // 1c4: astore 24
      // 1c6: ldc2_w 270389152141252877
      // 1c9: aload 24
      // 1cb: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ce: goto 1d5
      // 1d1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d4: athrow
      // 1d5: new com/finalshell/core/TQ3
      // 1d8: dup
      // 1d9: ldc_w ""
      // 1dc: ldc2_w 360540448640992052
      // 1df: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1e2: aconst_null
      // 1e3: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 1e6: bipush -1
      // 1e7: invokespecial com/finalshell/core/TQ3.<init> (Ljava/lang/String;II)V
      // 1ea: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1ed: ldc2_w 473928376202613579
      // 1f0: astore 27
      // 1f2: astore 26
      // 1f4: ldc2_w 473928376202613579
      // 1f7: aload 26
      // 1f9: aload 27
      // 1fb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1fe: pop
      // 1ff: goto 206
      // 202: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 205: athrow
      // 206: return
   }

   public LO3 D(String param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Lv4_2.H$arrint ()[I
      // 003: new com/finalshell/core/LO3
      // 006: dup
      // 007: invokespecial com/finalshell/core/LO3.<init> ()V
      // 00a: astore 4
      // 00c: astore 3
      // 00d: aload 4
      // 00f: aload 2
      // 010: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 013: ldc2_w 193904661956891993
      // 016: astore 9
      // 018: astore 8
      // 01a: ldc2_w 193904661956891993
      // 01d: aload 8
      // 01f: aload 9
      // 021: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 024: pop
      // 025: goto 02c
      // 028: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: new java/io/File
      // 02f: dup
      // 030: aload 1
      // 031: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 034: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 037: astore 5
      // 039: aload 3
      // 03a: ifnull 083
      // 03d: aload 5
      // 03f: sipush -17627
      // 042: sipush -30758
      // 045: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 048: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 04b: ifeq 087
      // 04e: goto 055
      // 051: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: aload 4
      // 057: sipush -17602
      // 05a: sipush 17474
      // 05d: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 060: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 063: ldc2_w 579965879482954180
      // 066: astore 11
      // 068: astore 10
      // 06a: ldc2_w 579965879482954180
      // 06d: aload 10
      // 06f: aload 11
      // 071: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 074: pop
      // 075: goto 07c
      // 078: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: goto 083
      // 07f: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: aload 3
      // 084: ifnonnull 0ae
      // 087: aload 4
      // 089: aload 5
      // 08b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 08e: ldc2_w 579965879482954180
      // 091: astore 13
      // 093: astore 12
      // 095: ldc2_w 579965879482954180
      // 098: aload 12
      // 09a: aload 13
      // 09c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 09f: pop
      // 0a0: goto 0a7
      // 0a3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: new java/lang/StringBuilder
      // 0b1: dup
      // 0b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b5: aload 1
      // 0b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b9: getstatic java/io/File.separator Ljava/lang/String;
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: aload 4
      // 0c1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0c4: ldc2_w 194080076253066315
      // 0c7: astore 15
      // 0c9: astore 14
      // 0cb: ldc2_w 194080076253066315
      // 0ce: aload 14
      // 0d0: aload 15
      // 0d2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d5: checkcast java/lang/String
      // 0d8: goto 0df
      // 0db: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0de: athrow
      // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e2: getstatic java/io/File.separator Ljava/lang/String;
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e8: sipush -17608
      // 0eb: sipush 29649
      // 0ee: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 0f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f7: astore 6
      // 0f9: aload 4
      // 0fb: aload 6
      // 0fd: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 100: ldc2_w 452404885675972754
      // 103: astore 17
      // 105: astore 16
      // 107: ldc2_w 452404885675972754
      // 10a: aload 16
      // 10c: aload 17
      // 10e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 111: pop
      // 112: goto 119
      // 115: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 118: athrow
      // 119: aload 4
      // 11b: invokestatic java/lang/System.currentTimeMillis ()J
      // 11e: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 121: ldc2_w 632174181210947576
      // 124: astore 19
      // 126: astore 18
      // 128: ldc2_w 632174181210947576
      // 12b: aload 18
      // 12d: aload 19
      // 12f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 132: pop
      // 133: goto 13a
      // 136: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 139: athrow
      // 13a: aload 4
      // 13c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 13f: ldc2_w 627686680651717230
      // 142: astore 21
      // 144: astore 20
      // 146: ldc2_w 627686680651717230
      // 149: aload 20
      // 14b: aload 21
      // 14d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 150: pop
      // 151: goto 158
      // 154: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 157: athrow
      // 158: goto 162
      // 15b: astore 7
      // 15d: aload 7
      // 15f: invokevirtual java/lang/Exception.printStackTrace ()V
      // 162: aload 0
      // 163: ldc2_w 468802884589973322
      // 166: astore 22
      // 168: ldc2_w 468802884589973322
      // 16b: aload 22
      // 16d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 170: checkcast java/util/HashMap
      // 173: aload 4
      // 175: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 178: ldc2_w 194080076253066315
      // 17b: astore 25
      // 17d: astore 24
      // 17f: ldc2_w 194080076253066315
      // 182: aload 24
      // 184: aload 25
      // 186: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 189: checkcast java/lang/String
      // 18c: goto 193
      // 18f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 192: athrow
      // 193: aload 4
      // 195: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 198: pop
      // 199: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 19c: ldc2_w 270389152141252877
      // 19f: astore 26
      // 1a1: ldc2_w 270389152141252877
      // 1a4: aload 26
      // 1a6: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1a9: goto 1b0
      // 1ac: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1af: athrow
      // 1b0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b3: ldc2_w 612604310671515822
      // 1b6: astore 29
      // 1b8: astore 28
      // 1ba: ldc2_w 612604310671515822
      // 1bd: aload 28
      // 1bf: aload 29
      // 1c1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c4: goto 1cb
      // 1c7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ca: athrow
      // 1cb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1ce: ldc2_w 200561288808923907
      // 1d1: astore 31
      // 1d3: astore 30
      // 1d5: ldc2_w 200561288808923907
      // 1d8: aload 30
      // 1da: aload 31
      // 1dc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1df: pop
      // 1e0: goto 1e7
      // 1e3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e6: athrow
      // 1e7: aload 4
      // 1e9: areturn
   }

   public void f() {
      Registry.emptyArgs();
      long var1 = 270389152141252877L;
      Ref.h2(270389152141252877L, var1);
      Object[] var10002 = Registry.packArgs(new TQ3("", Registry.lookupField(596294270063838005L).getInt(null), -1));
      long var4 = 473928376202613579L;
      Object[] var3 = var10002;
      Ref.h(473928376202613579L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void K(Lv4_2 var1) {
      Object[] var10001 = Registry.packArgs(var1, -1, true);
      long var3 = 425640194583900456L;
      Object[] var2 = var10001;
      Ref.h(425640194583900456L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void n(Lv4_2 param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Lv4_2.H$arrint ()[I
      // 003: astore 4
      // 005: iload 3
      // 006: aload 4
      // 008: ifnull 187
      // 00b: ifne 186
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: aload 1
      // 016: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 019: ldc2_w 236040230540929068
      // 01c: astore 11
      // 01e: ldc2_w 236040230540929068
      // 021: aload 11
      // 023: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 026: goto 02d
      // 029: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 030: ldc2_w 611820767281823807
      // 033: astore 14
      // 035: astore 13
      // 037: ldc2_w 611820767281823807
      // 03a: aload 13
      // 03c: aload 14
      // 03e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 041: pop
      // 042: goto 049
      // 045: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 048: athrow
      // 049: aload 1
      // 04a: invokestatic java/lang/System.currentTimeMillis ()J
      // 04d: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 050: ldc2_w 632174181210947576
      // 053: astore 16
      // 055: astore 15
      // 057: ldc2_w 632174181210947576
      // 05a: aload 15
      // 05c: aload 16
      // 05e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 061: pop
      // 062: goto 069
      // 065: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 068: athrow
      // 069: new java/io/File
      // 06c: dup
      // 06d: aload 1
      // 06e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 071: ldc2_w 128510527043101878
      // 074: astore 18
      // 076: astore 17
      // 078: ldc2_w 128510527043101878
      // 07b: aload 17
      // 07d: aload 18
      // 07f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 082: checkcast java/lang/String
      // 085: goto 08c
      // 088: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08b: athrow
      // 08c: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 08f: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 092: astore 5
      // 094: aload 4
      // 096: ifnull 0d7
      // 099: aload 5
      // 09b: sipush -17627
      // 09e: sipush -30758
      // 0a1: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 0a4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a7: ifne 0dc
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: aload 1
      // 0b2: aload 5
      // 0b4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0b7: ldc2_w 579965879482954180
      // 0ba: astore 20
      // 0bc: astore 19
      // 0be: ldc2_w 579965879482954180
      // 0c1: aload 19
      // 0c3: aload 20
      // 0c5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c8: pop
      // 0c9: goto 0d0
      // 0cc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0cf: athrow
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: aload 4
      // 0d9: ifnonnull 109
      // 0dc: aload 1
      // 0dd: sipush -17602
      // 0e0: sipush 17474
      // 0e3: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 0e6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0e9: ldc2_w 579965879482954180
      // 0ec: astore 22
      // 0ee: astore 21
      // 0f0: ldc2_w 579965879482954180
      // 0f3: aload 21
      // 0f5: aload 22
      // 0f7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0fa: pop
      // 0fb: goto 102
      // 0fe: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 101: athrow
      // 102: goto 109
      // 105: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 108: athrow
      // 109: aload 1
      // 10a: new java/lang/StringBuilder
      // 10d: dup
      // 10e: invokespecial java/lang/StringBuilder.<init> ()V
      // 111: aload 1
      // 112: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 115: ldc2_w 128510527043101878
      // 118: astore 24
      // 11a: astore 23
      // 11c: ldc2_w 128510527043101878
      // 11f: aload 23
      // 121: aload 24
      // 123: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 126: checkcast java/lang/String
      // 129: goto 130
      // 12c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12f: athrow
      // 130: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 133: getstatic java/io/File.separator Ljava/lang/String;
      // 136: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 139: aload 1
      // 13a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 13d: ldc2_w 292557478156152530
      // 140: astore 26
      // 142: astore 25
      // 144: ldc2_w 292557478156152530
      // 147: aload 25
      // 149: aload 26
      // 14b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 14e: checkcast java/lang/String
      // 151: goto 158
      // 154: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 157: athrow
      // 158: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15b: sipush -17607
      // 15e: sipush 2021
      // 161: invokestatic com/finalshell/core/Yf2.a (II)Ljava/lang/String;
      // 164: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 167: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 16d: ldc2_w 574053907803002361
      // 170: astore 28
      // 172: astore 27
      // 174: ldc2_w 574053907803002361
      // 177: aload 27
      // 179: aload 28
      // 17b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 17e: pop
      // 17f: goto 186
      // 182: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 185: athrow
      // 186: bipush 0
      // 187: istore 5
      // 189: aload 1
      // 18a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 18d: ldc2_w 432693308750455264
      // 190: astore 30
      // 192: astore 29
      // 194: ldc2_w 432693308750455264
      // 197: aload 29
      // 199: aload 30
      // 19b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 19e: checkcast java/lang/String
      // 1a1: goto 1a8
      // 1a4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a7: athrow
      // 1a8: astore 6
      // 1aa: aload 1
      // 1ab: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1ae: ldc2_w 510288519500652836
      // 1b1: astore 32
      // 1b3: astore 31
      // 1b5: ldc2_w 510288519500652836
      // 1b8: aload 31
      // 1ba: aload 32
      // 1bc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1bf: pop
      // 1c0: goto 1c7
      // 1c3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c6: athrow
      // 1c7: aload 1
      // 1c8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1cb: ldc2_w 432693308750455264
      // 1ce: astore 34
      // 1d0: astore 33
      // 1d2: ldc2_w 432693308750455264
      // 1d5: aload 33
      // 1d7: aload 34
      // 1d9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1dc: checkcast java/lang/String
      // 1df: goto 1e6
      // 1e2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e5: athrow
      // 1e6: astore 7
      // 1e8: aload 6
      // 1ea: aload 4
      // 1ec: ifnull 2de
      // 1ef: ifnull 255
      // 1f2: goto 1f9
      // 1f5: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f8: athrow
      // 1f9: aload 7
      // 1fb: aload 4
      // 1fd: ifnull 2de
      // 200: goto 207
      // 203: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 206: athrow
      // 207: aload 6
      // 209: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 20c: ifne 255
      // 20f: goto 216
      // 212: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 215: athrow
      // 216: aload 0
      // 217: ldc2_w 284174249540363036
      // 21a: astore 35
      // 21c: ldc2_w 284174249540363036
      // 21f: aload 35
      // 221: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 224: checkcast java/util/HashMap
      // 227: aload 6
      // 229: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 22c: pop
      // 22d: aload 0
      // 22e: ldc2_w 284174249540363036
      // 231: astore 37
      // 233: ldc2_w 284174249540363036
      // 236: aload 37
      // 238: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 23b: checkcast java/util/HashMap
      // 23e: aload 7
      // 240: aload 1
      // 241: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 244: pop
      // 245: new java/io/File
      // 248: dup
      // 249: aload 6
      // 24b: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 24e: invokevirtual java/io/File.delete ()Z
      // 251: pop
      // 252: bipush 1
      // 253: istore 5
      // 255: aload 0
      // 256: ldc2_w 625414770048383533
      // 259: astore 39
      // 25b: ldc2_w 625414770048383533
      // 25e: aload 39
      // 260: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 263: checkcast java/util/HashMap
      // 266: aload 1
      // 267: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 26a: ldc2_w 292557478156152530
      // 26d: astore 42
      // 26f: astore 41
      // 271: ldc2_w 292557478156152530
      // 274: aload 41
      // 276: aload 42
      // 278: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 27b: checkcast java/lang/String
      // 27e: goto 285
      // 281: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 284: athrow
      // 285: aload 1
      // 286: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 289: pop
      // 28a: aload 0
      // 28b: ldc2_w 284174249540363036
      // 28e: astore 43
      // 290: ldc2_w 284174249540363036
      // 293: aload 43
      // 295: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 298: checkcast java/util/HashMap
      // 29b: aload 1
      // 29c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 29f: ldc2_w 432693308750455264
      // 2a2: astore 46
      // 2a4: astore 45
      // 2a6: ldc2_w 432693308750455264
      // 2a9: aload 45
      // 2ab: aload 46
      // 2ad: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2b0: checkcast java/lang/String
      // 2b3: goto 2ba
      // 2b6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2b9: athrow
      // 2ba: aload 1
      // 2bb: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 2be: pop
      // 2bf: aload 1
      // 2c0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2c3: ldc2_w 432693308750455264
      // 2c6: astore 48
      // 2c8: astore 47
      // 2ca: ldc2_w 432693308750455264
      // 2cd: aload 47
      // 2cf: aload 48
      // 2d1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2d4: checkcast java/lang/String
      // 2d7: goto 2de
      // 2da: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2dd: athrow
      // 2de: astore 8
      // 2e0: ldc2_w 141097745113806009
      // 2e3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2e6: aconst_null
      // 2e7: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 2ea: istore 9
      // 2ec: iload 5
      // 2ee: aload 4
      // 2f0: ifnull 30a
      // 2f3: ifeq 309
      // 2f6: goto 2fd
      // 2f9: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fc: athrow
      // 2fd: ldc2_w 230499244448933173
      // 300: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 303: aconst_null
      // 304: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 307: istore 9
      // 309: iload 3
      // 30a: aload 4
      // 30c: ifnull 323
      // 30f: ifeq 325
      // 312: goto 319
      // 315: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 318: athrow
      // 319: ldc2_w 119984829432323123
      // 31c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 31f: aconst_null
      // 320: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 323: istore 9
      // 325: new com/finalshell/core/TQ3
      // 328: dup
      // 329: aload 8
      // 32b: iload 9
      // 32d: iload 2
      // 32e: invokespecial com/finalshell/core/TQ3.<init> (Ljava/lang/String;II)V
      // 331: astore 10
      // 333: aload 10
      // 335: aload 8
      // 337: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 33a: ldc2_w 326254939683842115
      // 33d: astore 50
      // 33f: astore 49
      // 341: ldc2_w 326254939683842115
      // 344: aload 49
      // 346: aload 50
      // 348: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 34b: pop
      // 34c: goto 353
      // 34f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 352: athrow
      // 353: aload 4
      // 355: ifnull 432
      // 358: iload 5
      // 35a: ifeq 38b
      // 35d: goto 364
      // 360: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 363: athrow
      // 364: aload 10
      // 366: aload 6
      // 368: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 36b: ldc2_w 281908821644695730
      // 36e: astore 52
      // 370: astore 51
      // 372: ldc2_w 281908821644695730
      // 375: aload 51
      // 377: aload 52
      // 379: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 37c: pop
      // 37d: goto 384
      // 380: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 383: athrow
      // 384: goto 38b
      // 387: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38a: athrow
      // 38b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 38e: ldc2_w 270389152141252877
      // 391: astore 53
      // 393: ldc2_w 270389152141252877
      // 396: aload 53
      // 398: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 39b: goto 3a2
      // 39e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a1: athrow
      // 3a2: aload 10
      // 3a4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3a7: ldc2_w 473928376202613579
      // 3aa: astore 56
      // 3ac: astore 55
      // 3ae: ldc2_w 473928376202613579
      // 3b1: aload 55
      // 3b3: aload 56
      // 3b5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3b8: pop
      // 3b9: goto 3c0
      // 3bc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3bf: athrow
      // 3c0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3c3: ldc2_w 270389152141252877
      // 3c6: astore 57
      // 3c8: ldc2_w 270389152141252877
      // 3cb: aload 57
      // 3cd: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 3d0: goto 3d7
      // 3d3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3d6: athrow
      // 3d7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3da: ldc2_w 634817973682994708
      // 3dd: astore 60
      // 3df: astore 59
      // 3e1: ldc2_w 634817973682994708
      // 3e4: aload 59
      // 3e6: aload 60
      // 3e8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3eb: goto 3f2
      // 3ee: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3f1: athrow
      // 3f2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3f5: ldc2_w 240567170779145617
      // 3f8: astore 62
      // 3fa: astore 61
      // 3fc: ldc2_w 240567170779145617
      // 3ff: aload 61
      // 401: aload 62
      // 403: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 406: goto 40d
      // 409: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 40c: athrow
      // 40d: new com/finalshell/core/Cx2
      // 410: dup
      // 411: aload 0
      // 412: aload 1
      // 413: invokespecial com/finalshell/core/Cx2.<init> (Lcom/finalshell/core/Yf2;Lcom/finalshell/core/Lv4_2;)V
      // 416: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 419: ldc2_w 442259795076941885
      // 41c: astore 64
      // 41e: astore 63
      // 420: ldc2_w 442259795076941885
      // 423: aload 63
      // 425: aload 64
      // 427: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 42a: pop
      // 42b: goto 432
      // 42e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 431: athrow
      // 432: goto 43c
      // 435: astore 5
      // 437: aload 5
      // 439: invokevirtual java/lang/Exception.printStackTrace ()V
      // 43c: return
   }

   public void R(File param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Lv4_2.H$arrint ()[I
      // 003: new com/finalshell/core/Lv4_2
      // 006: dup
      // 007: invokespecial com/finalshell/core/Lv4_2.<init> ()V
      // 00a: astore 3
      // 00b: aload 3
      // 00c: aload 1
      // 00d: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 010: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 013: ldc2_w 574053907803002361
      // 016: astore 8
      // 018: astore 7
      // 01a: ldc2_w 574053907803002361
      // 01d: aload 7
      // 01f: aload 8
      // 021: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 024: pop
      // 025: goto 02c
      // 028: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: aload 3
      // 02d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 030: ldc2_w 540969864624467425
      // 033: astore 10
      // 035: astore 9
      // 037: ldc2_w 540969864624467425
      // 03a: aload 9
      // 03c: aload 10
      // 03e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 041: pop
      // 042: goto 049
      // 045: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 048: athrow
      // 049: astore 2
      // 04a: aload 0
      // 04b: ldc2_w 625414770048383533
      // 04e: astore 11
      // 050: ldc2_w 625414770048383533
      // 053: aload 11
      // 055: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 058: checkcast java/util/HashMap
      // 05b: aload 3
      // 05c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 05f: ldc2_w 292557478156152530
      // 062: astore 14
      // 064: astore 13
      // 066: ldc2_w 292557478156152530
      // 069: aload 13
      // 06b: aload 14
      // 06d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 070: checkcast java/lang/String
      // 073: goto 07a
      // 076: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 079: athrow
      // 07a: aload 2
      // 07b: ifnull 17d
      // 07e: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 081: ifeq 0e3
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a: athrow
      // 08b: aload 3
      // 08c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 08f: ldc2_w 236040230540929068
      // 092: astore 15
      // 094: ldc2_w 236040230540929068
      // 097: aload 15
      // 099: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 09c: goto 0a3
      // 09f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a6: ldc2_w 611820767281823807
      // 0a9: astore 18
      // 0ab: astore 17
      // 0ad: ldc2_w 611820767281823807
      // 0b0: aload 17
      // 0b2: aload 18
      // 0b4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0b7: pop
      // 0b8: goto 0bf
      // 0bb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: aload 3
      // 0c0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0c3: ldc2_w 510288519500652836
      // 0c6: astore 20
      // 0c8: astore 19
      // 0ca: ldc2_w 510288519500652836
      // 0cd: aload 19
      // 0cf: aload 20
      // 0d1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d4: pop
      // 0d5: goto 0dc
      // 0d8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/core/Yf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: ldc2_w 284174249540363036
      // 0e7: astore 21
      // 0e9: ldc2_w 284174249540363036
      // 0ec: aload 21
      // 0ee: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f1: checkcast java/util/HashMap
      // 0f4: aload 3
      // 0f5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0f8: ldc2_w 432693308750455264
      // 0fb: astore 24
      // 0fd: astore 23
      // 0ff: ldc2_w 432693308750455264
      // 102: aload 23
      // 104: aload 24
      // 106: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 109: checkcast java/lang/String
      // 10c: goto 113
      // 10f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 112: athrow
      // 113: aload 3
      // 114: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 117: pop
      // 118: aload 0
      // 119: ldc2_w 625414770048383533
      // 11c: astore 25
      // 11e: ldc2_w 625414770048383533
      // 121: aload 25
      // 123: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 126: checkcast java/util/HashMap
      // 129: aload 3
      // 12a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 12d: ldc2_w 292557478156152530
      // 130: astore 28
      // 132: astore 27
      // 134: ldc2_w 292557478156152530
      // 137: aload 27
      // 139: aload 28
      // 13b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 13e: checkcast java/lang/String
      // 141: goto 148
      // 144: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 147: athrow
      // 148: aload 3
      // 149: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 14c: pop
      // 14d: aload 0
      // 14e: ldc2_w 284174249540363036
      // 151: astore 29
      // 153: ldc2_w 284174249540363036
      // 156: aload 29
      // 158: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 15b: checkcast java/util/HashMap
      // 15e: aload 3
      // 15f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 162: ldc2_w 432693308750455264
      // 165: astore 32
      // 167: astore 31
      // 169: ldc2_w 432693308750455264
      // 16c: aload 31
      // 16e: aload 32
      // 170: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 173: checkcast java/lang/String
      // 176: goto 17d
      // 179: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17c: athrow
      // 17d: aload 3
      // 17e: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 181: pop
      // 182: aload 3
      // 183: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 186: ldc2_w 432693308750455264
      // 189: astore 34
      // 18b: astore 33
      // 18d: ldc2_w 432693308750455264
      // 190: aload 33
      // 192: aload 34
      // 194: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 197: checkcast java/lang/String
      // 19a: goto 1a1
      // 19d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a0: athrow
      // 1a1: astore 4
      // 1a3: ldc2_w 141097745113806009
      // 1a6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1a9: aconst_null
      // 1aa: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 1ad: istore 5
      // 1af: new com/finalshell/core/TQ3
      // 1b2: dup
      // 1b3: aload 4
      // 1b5: iload 5
      // 1b7: bipush 0
      // 1b8: invokespecial com/finalshell/core/TQ3.<init> (Ljava/lang/String;II)V
      // 1bb: astore 6
      // 1bd: aload 6
      // 1bf: aload 4
      // 1c1: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1c4: ldc2_w 326254939683842115
      // 1c7: astore 36
      // 1c9: astore 35
      // 1cb: ldc2_w 326254939683842115
      // 1ce: aload 35
      // 1d0: aload 36
      // 1d2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1d5: pop
      // 1d6: goto 1dd
      // 1d9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1dc: athrow
      // 1dd: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1e0: ldc2_w 270389152141252877
      // 1e3: astore 37
      // 1e5: ldc2_w 270389152141252877
      // 1e8: aload 37
      // 1ea: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ed: goto 1f4
      // 1f0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f3: athrow
      // 1f4: aload 6
      // 1f6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1f9: ldc2_w 473928376202613579
      // 1fc: astore 40
      // 1fe: astore 39
      // 200: ldc2_w 473928376202613579
      // 203: aload 39
      // 205: aload 40
      // 207: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 20a: pop
      // 20b: goto 212
      // 20e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 211: athrow
      // 212: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 215: ldc2_w 270389152141252877
      // 218: astore 41
      // 21a: ldc2_w 270389152141252877
      // 21d: aload 41
      // 21f: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 222: goto 229
      // 225: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 228: athrow
      // 229: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 22c: ldc2_w 634817973682994708
      // 22f: astore 44
      // 231: astore 43
      // 233: ldc2_w 634817973682994708
      // 236: aload 43
      // 238: aload 44
      // 23a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 23d: goto 244
      // 240: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 243: athrow
      // 244: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 247: ldc2_w 240567170779145617
      // 24a: astore 46
      // 24c: astore 45
      // 24e: ldc2_w 240567170779145617
      // 251: aload 45
      // 253: aload 46
      // 255: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 258: goto 25f
      // 25b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 25e: athrow
      // 25f: new com/finalshell/core/Yh4_2
      // 262: dup
      // 263: aload 0
      // 264: aload 3
      // 265: invokespecial com/finalshell/core/Yh4_2.<init> (Lcom/finalshell/core/Yf2;Lcom/finalshell/core/Lv4_2;)V
      // 268: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 26b: ldc2_w 442259795076941885
      // 26e: astore 48
      // 270: astore 47
      // 272: ldc2_w 442259795076941885
      // 275: aload 47
      // 277: aload 48
      // 279: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 27c: pop
      // 27d: goto 284
      // 280: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 283: athrow
      // 284: return
   }

   public void Y(File var1) throws Exception {
      Object[] var33;
      Lv4_2 var2 = new Lv4_2();
      Object[] var10001 = Registry.packArgs(var1.getAbsolutePath());
      long var8 = 574053907803002361L;
      Object[] var7 = var10001;
      Ref.h(574053907803002361L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var57) {
         throw var57.getTargetException();
      }

      Object[] var10002 = Registry.emptyArgs();
      long var10 = 540969864624467425L;
      Object[] var9 = var10002;
      Ref.h(540969864624467425L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var56) {
         throw var56.getTargetException();
      }

      Object var11 = 284174249540363036L;
      Lv4_2 var3 = (Lv4_2)((HashMap)Ref.g(284174249540363036L, var11)).get(var1.getAbsolutePath());
      Object[] var10005 = Registry.emptyArgs();
      long var14 = 292557478156152530L;
      Object[] var13 = var10005;
      var10005 = Registry.packArgs(Ref.h(292557478156152530L, var13, var14));
      long var16 = 611820767281823807L;
      Object[] var15 = var10005;
      Ref.h(611820767281823807L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var55) {
         throw var55.getTargetException();
      }

      Object[] var10006 = Registry.emptyArgs();
      long var18 = 510288519500652836L;
      Object[] var17 = var10006;
      Ref.h(510288519500652836L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var54) {
         throw var54.getTargetException();
      }

      Object var19 = 284174249540363036L;
      HashMap var10007 = (HashMap)Ref.g(284174249540363036L, var19);
      String var10009 = (String)(Registry.emptyArgs());
      long var22 = 432693308750455264L;
      Object var21 = var10009;
      var10009 = Ref.h(432693308750455264L, var21, var22);

      try {
         var10009 = (String)var10009;
      } catch (InvocationTargetException var53) {
         throw var53.getTargetException();
      }

      var2.put(var10009, var2);
      Object var23 = 625414770048383533L;
      HashMap var61 = (HashMap)Ref.g(625414770048383533L, var23);
      String var10011 = (String)(Registry.emptyArgs());
      long var26 = 292557478156152530L;
      Object var25 = var10011;
      var10011 = Ref.h(292557478156152530L, var25, var26);

      try {
         var10011 = (String)var10011;
      } catch (InvocationTargetException var52) {
         throw var52.getTargetException();
      }

      var2.put(var10011, var2);
      Object var27 = 284174249540363036L;
      HashMap var64 = (HashMap)Ref.g(284174249540363036L, var27);
      String var10013 = (String)(Registry.emptyArgs());
      long var30 = 432693308750455264L;
      Object var29 = var10013;
      var10013 = Ref.h(432693308750455264L, var29, var30);

      try {
         var10013 = (String)var10013;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      var2.put(var10013, var2);
      var10013 = Registry.emptyArgs();
      long var32 = 432693308750455264L;
      Object var31 = var10013;
      var10013 = Ref.h(432693308750455264L, var31, var32);

      try {
         var10013 = (String)var10013;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      String var4 = var10013;
      int var5 = Registry.lookupField(119984829432323123L).getInt(null);
      TQ3 var6 = new TQ3(var4, var5, 0);
      Object[] var10014 = Registry.packArgs(var4);
      long var34 = 326254939683842115L;
      var33 = var10014;
      Ref.h(326254939683842115L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }

      Registry.emptyArgs();
      long var35 = 270389152141252877L;
      Ref.h2(270389152141252877L, var35);
      Object[] var10016 = Registry.packArgs(var6);
      long var38 = 473928376202613579L;
      Object[] var37 = var10016;
      Ref.h(473928376202613579L, var37, var38);

      try {
         ;
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      Registry.emptyArgs();
      long var39 = 270389152141252877L;
      Ref.h2(270389152141252877L, var39);
      Object[] var10018 = Registry.emptyArgs();
      long var42 = 634817973682994708L;
      Object[] var41 = var10018;
      Ref.h(634817973682994708L, var41, var42);
      Object[] var10019 = Registry.emptyArgs();
      long var44 = 240567170779145617L;
      Object[] var43 = var10019;
      Ref.h(240567170779145617L, var43, var44);
      Object[] var10020 = Registry.packArgs(new Ad2(this, var2));
      long var46 = 442259795076941885L;
      Object[] var45 = var10020;
      Ref.h(442259795076941885L, var45, var46);

      try {
         ;
      } catch (InvocationTargetException var47) {
         throw var47.getTargetException();
      }
   }

   public void h(String var1) {
      long var33;
      int var2 = Registry.lookupField(234937930320207719L).getInt(null);
      TQ3 var3 = new TQ3(var1, var2, -1);
      Object[] var10001 = Registry.packArgs(var1);
      long var7 = 326254939683842115L;
      Object[] var6 = var10001;
      Ref.h(326254939683842115L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      Registry.emptyArgs();
      long var8 = 270389152141252877L;
      Ref.h2(270389152141252877L, var8);
      Object[] var10003 = Registry.packArgs(var3);
      long var11 = 473928376202613579L;
      Object[] var10 = var10003;
      Ref.h(473928376202613579L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var47) {
         throw var47.getTargetException();
      }

      Object var12 = 284174249540363036L;
      Lv4_2 var4 = (Lv4_2)((HashMap)Ref.g(284174249540363036L, var12)).get(var1);
      Object[] var10005 = Registry.e(System.currentTimeMillis());
      long var15 = 448034136929726083L;
      Object[] var14 = var10005;
      Ref.h(448034136929726083L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }

      try {
         Object[] var10006 = Registry.emptyArgs();
         long var17 = 510288519500652836L;
         Object[] var16 = var10006;
         Ref.h(510288519500652836L, var16, var17);

         try {
            ;
         } catch (InvocationTargetException var44) {
            throw var44.getTargetException();
         }
      } catch (Exception var45) {
         var45.printStackTrace();
      }

      Registry.emptyArgs();
      long var18 = 270389152141252877L;
      Ref.h2(270389152141252877L, var18);
      Object[] var10002 = Registry.emptyArgs();
      long var21 = 445913128761932285L;
      Object[] var20 = var10002;
      Ref.h(445913128761932285L, var20, var21);
      Object[] var10004 = Registry.emptyArgs();
      long var23 = 292557478156152530L;
      Object[] var22 = var10004;
      Ref.h(292557478156152530L, var22, var23);
      Object[] var50 = Registry.emptyArgs();
      long var25 = 286931176286176762L;
      Object[] var24 = var50;
      var10005 = Registry.packArgs(var4, Ref.h(286931176286176762L, var24, var25), Registry.lookupField(341718875000366390L).getInt(null));
      long var27 = 303601760398924256L;
      Object[] var26 = var10005;
      Ref.h(303601760398924256L, var26, var27);

      try {
         ;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      Registry.emptyArgs();
      long var28 = 270389152141252877L;
      Ref.h2(270389152141252877L, var28);
      Object[] var10007 = Registry.emptyArgs();
      long var31 = 612604310671515822L;
      Object[] var30 = var10007;
      Ref.h(612604310671515822L, var30, var31);
      Object[] var10008 = Registry.emptyArgs();
      var33 = 200561288808923907L;
      Object[] var32 = var10008;
      Ref.h(200561288808923907L, var32, var33);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      Registry.emptyArgs();
      long var34 = 270389152141252877L;
      Ref.h2(270389152141252877L, var34);
      TQ3 var10011;
      String var10013 = (String)(Registry.emptyArgs());
      long var37 = 432693308750455264L;
      Object var36 = var10013;
      var10013 = Ref.h(432693308750455264L, var36, var37);

      try {
         var10013 = (String)var10013;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      var4 = (Lv4_2)(new com.finalshell.core.TQ3(var10013, Registry.lookupField(234937930320207719L).getInt(null), -1));
      Object[] var51 = Registry.packArgs(var10011);
      long var39 = 473928376202613579L;
      Object[] var38 = var51;
      Ref.h(473928376202613579L, var38, var39);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }
   }

   public void g(String var1) {
      Object[] var33;
      int var2 = Registry.lookupField(592636579672783356L).getInt(null);
      TQ3 var3 = new TQ3(var1, var2, -1);
      Object[] var10001 = Registry.packArgs(var1);
      long var8 = 326254939683842115L;
      Object[] var7 = var10001;
      Ref.h(326254939683842115L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      Registry.emptyArgs();
      long var9 = 270389152141252877L;
      Ref.h2(270389152141252877L, var9);
      Object[] var10003 = Registry.packArgs(var3);
      long var12 = 473928376202613579L;
      Object[] var11 = var10003;
      Ref.h(473928376202613579L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      String var4 = new File(var1).getName();
      Object var13 = 468802884589973322L;
      LO3 var5 = (LO3)((HashMap)Ref.g(468802884589973322L, var13)).get(var4);
      Object[] var10005 = Registry.e(System.currentTimeMillis());
      long var16 = 275634842768439116L;
      Object[] var15 = var10005;
      Ref.h(275634842768439116L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      try {
         Object[] var10006 = Registry.emptyArgs();
         long var18 = 627686680651717230L;
         Object[] var17 = var10006;
         Ref.h(627686680651717230L, var17, var18);

         try {
            ;
         } catch (InvocationTargetException var37) {
            throw var37.getTargetException();
         }
      } catch (Exception var38) {
         var38.printStackTrace();
      }

      Registry.emptyArgs();
      long var19 = 270389152141252877L;
      Ref.h2(270389152141252877L, var19);
      Object[] var10002 = Registry.emptyArgs();
      long var22 = 445913128761932285L;
      Object[] var21 = var10002;
      Ref.h(445913128761932285L, var21, var22);
      Object[] var10004 = Registry.emptyArgs();
      long var24 = 194080076253066315L;
      Object[] var23 = var10004;
      Ref.h(194080076253066315L, var23, var24);
      Object[] var43 = Registry.emptyArgs();
      long var26 = 286931176286176762L;
      Object[] var25 = var43;
      var10005 = Registry.packArgs(var5, Ref.h(286931176286176762L, var25, var26), Registry.lookupField(374091936438414305L).getInt(null));
      long var28 = 303601760398924256L;
      Object[] var27 = var10005;
      Ref.h(303601760398924256L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      Registry.emptyArgs();
      long var29 = 270389152141252877L;
      Ref.h2(270389152141252877L, var29);
      Object[] var10007 = Registry.emptyArgs();
      long var32 = 612604310671515822L;
      Object[] var31 = var10007;
      Ref.h(612604310671515822L, var31, var32);
      Object[] var10008 = Registry.emptyArgs();
      long var34 = 200561288808923907L;
      var33 = var10008;
      Ref.h(200561288808923907L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }
   }

   public void Y(String var1) {
      Object[] var33;
      int var2 = Registry.lookupField(428968525961987582L).getInt(null);
      TQ3 var3 = new TQ3(var1, var2, -1);
      Object[] var10001 = Registry.packArgs(var1);
      long var6 = 326254939683842115L;
      Object[] var5 = var10001;
      Ref.h(326254939683842115L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      Registry.emptyArgs();
      long var7 = 270389152141252877L;
      Ref.h2(270389152141252877L, var7);
      Object[] var10003 = Registry.packArgs(var3);
      long var10 = 473928376202613579L;
      Object[] var9 = var10003;
      Ref.h(473928376202613579L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      Object var11 = 284174249540363036L;
      Lv4_2 var4 = (Lv4_2)((HashMap)Ref.g(284174249540363036L, var11)).get(var1);
      Registry.emptyArgs();
      long var13 = 270389152141252877L;
      Ref.h2(270389152141252877L, var13);
      Object[] var10006 = Registry.emptyArgs();
      long var16 = 445913128761932285L;
      Object[] var15 = var10006;
      Ref.h(445913128761932285L, var15, var16);
      Object[] var10008 = Registry.emptyArgs();
      long var18 = 292557478156152530L;
      Object[] var17 = var10008;
      Ref.h(292557478156152530L, var17, var18);
      Object[] var10010 = Registry.emptyArgs();
      long var20 = 286931176286176762L;
      Object[] var19 = var10010;
      Object[] var10009 = Registry.packArgs(var4, Ref.h(286931176286176762L, var19, var20), Registry.lookupField(341718875000366390L).getInt(null));
      long var22 = 200839191777796316L;
      Object[] var21 = var10009;
      Ref.h(200839191777796316L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      Registry.emptyArgs();
      long var23 = 270389152141252877L;
      Ref.h2(270389152141252877L, var23);
      Object[] var10011 = Registry.emptyArgs();
      long var26 = 612604310671515822L;
      Object[] var25 = var10011;
      Ref.h(612604310671515822L, var25, var26);
      Object[] var10012 = Registry.emptyArgs();
      long var28 = 200561288808923907L;
      Object[] var27 = var10012;
      Ref.h(200561288808923907L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      Registry.emptyArgs();
      long var29 = 270389152141252877L;
      Ref.h2(270389152141252877L, var29);
      TQ3 var10015;
      String var10017 = (String)(Registry.emptyArgs());
      long var32 = 432693308750455264L;
      Object var31 = var10017;
      var10017 = Ref.h(432693308750455264L, var31, var32);

      try {
         var10017 = (String)var10017;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      var4 = (Lv4_2)(new com.finalshell.core.TQ3(var10017, Registry.lookupField(428968525961987582L).getInt(null), -1));
      Object[] var41 = Registry.packArgs(var10015);
      long var34 = 473928376202613579L;
      var33 = var41;
      Ref.h(473928376202613579L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }
   }

   public void x(String var1) {
      int var2 = Registry.lookupField(360540448640992052L).getInt(null);
      TQ3 var3 = new TQ3(var1, var2, -1);
      Object[] var10001 = Registry.packArgs(var1);
      long var7 = 326254939683842115L;
      Object[] var6 = var10001;
      Ref.h(326254939683842115L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      Registry.emptyArgs();
      long var8 = 270389152141252877L;
      Ref.h2(270389152141252877L, var8);
      Object[] var10003 = Registry.packArgs(var3);
      long var11 = 473928376202613579L;
      Object[] var10 = var10003;
      Ref.h(473928376202613579L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      String var4 = new File(var1).getName();
      Object var12 = 468802884589973322L;
      LO3 var5 = (LO3)((HashMap)Ref.g(468802884589973322L, var12)).get(var4);
      Registry.emptyArgs();
      long var14 = 270389152141252877L;
      Ref.h2(270389152141252877L, var14);
      Object[] var10006 = Registry.emptyArgs();
      long var17 = 445913128761932285L;
      Object[] var16 = var10006;
      Ref.h(445913128761932285L, var16, var17);
      Object[] var10008 = Registry.emptyArgs();
      long var19 = 194080076253066315L;
      Object[] var18 = var10008;
      Ref.h(194080076253066315L, var18, var19);
      Object[] var10010 = Registry.emptyArgs();
      long var21 = 286931176286176762L;
      Object[] var20 = var10010;
      Object[] var10009 = Registry.packArgs(var5, Ref.h(286931176286176762L, var20, var21), Registry.lookupField(374091936438414305L).getInt(null));
      long var23 = 200839191777796316L;
      Object[] var22 = var10009;
      Ref.h(200839191777796316L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      Registry.emptyArgs();
      long var24 = 270389152141252877L;
      Ref.h2(270389152141252877L, var24);
      Object[] var10011 = Registry.emptyArgs();
      long var27 = 612604310671515822L;
      Object[] var26 = var10011;
      Ref.h(612604310671515822L, var26, var27);
      Object[] var10012 = Registry.emptyArgs();
      long var29 = 200561288808923907L;
      Object[] var28 = var10012;
      Ref.h(200561288808923907L, var28, var29);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }
   }

   public LO3 m(String var1) {
      Object var2 = 468802884589973322L;
      return (LO3)((HashMap)Ref.g(468802884589973322L, var2)).get(var1);
   }

   public Lv4_2 q(String var1) {
      Object var2 = 284174249540363036L;
      return (Lv4_2)((HashMap)Ref.g(284174249540363036L, var2)).get(var1);
   }

   public Lv4_2 T(String var1) {
      Lv4_2 var2 = new Lv4_2();
      Object[] var10001 = Registry.packArgs(var1);
      long var5 = 574053907803002361L;
      Object[] var4 = var10001;
      Ref.h(574053907803002361L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      try {
         Object[] var10002 = Registry.emptyArgs();
         long var7 = 540969864624467425L;
         Object[] var6 = var10002;
         Ref.h(540969864624467425L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

      return var2;
   }

   public Lv4_2 E(ConnectionProperty var1) {
      Lv4_2 var2 = var1.a();
      var1.H(null);
      Lv4_2 var10002 = (Lv4_2)(Registry.emptyArgs());
      long var6 = 292557478156152530L;
      Object var5 = var10002;
      var10002 = Registry.packArgs(Ref.h(292557478156152530L, var5, var6));
      long var8 = 343419559142469673L;
      Object var7 = var10002;
      var10002 = Ref.h(343419559142469673L, var7, var8);

      try {
         var10002 = (Lv4_2)var10002;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Lv4_2 var3 = var10002;
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 432693308750455264L;
      Object[] var9 = var10005;
      Lv4_2 var10004 = Registry.packArgs(var3, Ref.h(432693308750455264L, var9, var10));
      long var12 = 495418189741494584L;
      Object var11 = var10004;
      var10004 = Ref.h(495418189741494584L, var11, var12);

      try {
         var10004 = (Lv4_2)var10004;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      return var10004;
   }

   public Lv4_2 r(ConnectionProperty var1, String var2) {
      int[] var10000 = Lv4_2.H$arrint();
      Lv4_2 var4 = var1.a();
      int[] var3 = var10000;
      Lv4_2 var14 = var4;
      if (var3 != null) {
         if (var4 == null) {
            Lv4_2 var10001 = (Lv4_2)(Registry.packArgs(var2));
            long var6 = 145297327718058114L;
            Object var5 = var10001;
            var10001 = Ref.h(145297327718058114L, var5, var6);

            try {
               var10001 = (Lv4_2)var10001;
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            var4 = var10001;
            var1.H(var4);
            if (var3 != null) {
               return var4;
            }
         }

         var14 = var4;
      }

      if (var3 != null) {
         String var17 = (String)(Registry.emptyArgs());
         long var8 = 432693308750455264L;
         Object var7 = var17;
         var17 = Ref.h(432693308750455264L, var7, var8);

         try {
            var17 = (String)var17;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         if (var17.equals(var2)) {
            return var4;
         }

         Object[] var10002 = Registry.packArgs(var2);
         long var10 = 145297327718058114L;
         Object[] var9 = var10002;
         Ref.h(145297327718058114L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }
      }

      var4 = var14;
      var1.H(var4);
      return var4;
   }

   public Lv4_2 S(String var1) {
      Object var2 = 625414770048383533L;
      return (Lv4_2)((HashMap)Ref.g(625414770048383533L, var2)).get(var1);
   }

   public void p(String var1, String var2, boolean var3) {
      Object var5 = 284174249540363036L;
      Lv4_2 var4 = (Lv4_2)((HashMap)Ref.g(284174249540363036L, var5)).get(var1);
      Object[] var10002 = Registry.packArgs(var2);
      long var8 = 574053907803002361L;
      Object[] var7 = var10002;
      Ref.h(574053907803002361L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public void o(File var1, ArrayList var2) {
      int[] var10000 = Lv4_2.H$arrint();
      File[] var4 = var1.listFiles();
      int[] var3 = var10000;
      File[] var12 = var4;
      if (var3 != null) {
         if (var4 == null) {
            return;
         }

         var12 = var4;
      }

      File[] var5 = var12;
      int var6 = var5.length;
      int var7 = 0;

      while (var7 < var6) {
         File var8 = var5[var7];
         boolean var13 = var8.isFile();
         if (var3 != null) {
            if (var13) {
               var2.add(var8);
            }

            var13 = var8.isDirectory();
         }

         if (var13) {
            Object[] var10001 = Registry.packArgs(var8, var2);
            long var10 = 280917971226844586L;
            Object[] var9 = var10001;
            Ref.h(280917971226844586L, var9, var10);

            try {
               ;
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }
         }

         var7++;
         if (var3 == null) {
            break;
         }
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -17613) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 75;
               break;
            case 1:
               var10000 = 88;
               break;
            case 2:
               var10000 = 254;
               break;
            case 3:
               var10000 = 231;
               break;
            case 4:
               var10000 = 94;
               break;
            case 5:
               var10000 = 135;
               break;
            case 6:
               var10000 = 238;
               break;
            case 7:
               var10000 = 141;
               break;
            case 8:
               var10000 = 182;
               break;
            case 9:
               var10000 = 81;
               break;
            case 10:
               var10000 = 7;
               break;
            case 11:
               var10000 = 68;
               break;
            case 12:
               var10000 = 9;
               break;
            case 13:
               var10000 = 95;
               break;
            case 14:
               var10000 = 106;
               break;
            case 15:
               var10000 = 157;
               break;
            case 16:
               var10000 = 85;
               break;
            case 17:
               var10000 = 74;
               break;
            case 18:
               var10000 = 0;
               break;
            case 19:
               var10000 = 54;
               break;
            case 20:
               var10000 = 183;
               break;
            case 21:
               var10000 = 156;
               break;
            case 22:
               var10000 = 48;
               break;
            case 23:
               var10000 = 206;
               break;
            case 24:
               var10000 = 232;
               break;
            case 25:
               var10000 = 13;
               break;
            case 26:
               var10000 = 158;
               break;
            case 27:
               var10000 = 123;
               break;
            case 28:
               var10000 = 96;
               break;
            case 29:
               var10000 = 52;
               break;
            case 30:
               var10000 = 218;
               break;
            case 31:
               var10000 = 220;
               break;
            case 32:
               var10000 = 155;
               break;
            case 33:
               var10000 = 202;
               break;
            case 34:
               var10000 = 208;
               break;
            case 35:
               var10000 = 39;
               break;
            case 36:
               var10000 = 38;
               break;
            case 37:
               var10000 = 51;
               break;
            case 38:
               var10000 = 226;
               break;
            case 39:
               var10000 = 57;
               break;
            case 40:
               var10000 = 27;
               break;
            case 41:
               var10000 = 241;
               break;
            case 42:
               var10000 = 150;
               break;
            case 43:
               var10000 = 198;
               break;
            case 44:
               var10000 = 185;
               break;
            case 45:
               var10000 = 43;
               break;
            case 46:
               var10000 = 61;
               break;
            case 47:
               var10000 = 83;
               break;
            case 48:
               var10000 = 33;
               break;
            case 49:
               var10000 = 79;
               break;
            case 50:
               var10000 = 19;
               break;
            case 51:
               var10000 = 145;
               break;
            case 52:
               var10000 = 152;
               break;
            case 53:
               var10000 = 31;
               break;
            case 54:
               var10000 = 205;
               break;
            case 55:
               var10000 = 139;
               break;
            case 56:
               var10000 = 102;
               break;
            case 57:
               var10000 = 176;
               break;
            case 58:
               var10000 = 146;
               break;
            case 59:
               var10000 = 84;
               break;
            case 60:
               var10000 = 64;
               break;
            case 61:
               var10000 = 132;
               break;
            case 62:
               var10000 = 137;
               break;
            case 63:
               var10000 = 178;
               break;
            case 64:
               var10000 = 97;
               break;
            case 65:
               var10000 = 105;
               break;
            case 66:
               var10000 = 253;
               break;
            case 67:
               var10000 = 120;
               break;
            case 68:
               var10000 = 80;
               break;
            case 69:
               var10000 = 223;
               break;
            case 70:
               var10000 = 200;
               break;
            case 71:
               var10000 = 49;
               break;
            case 72:
               var10000 = 133;
               break;
            case 73:
               var10000 = 201;
               break;
            case 74:
               var10000 = 177;
               break;
            case 75:
               var10000 = 82;
               break;
            case 76:
               var10000 = 16;
               break;
            case 77:
               var10000 = 45;
               break;
            case 78:
               var10000 = 213;
               break;
            case 79:
               var10000 = 189;
               break;
            case 80:
               var10000 = 228;
               break;
            case 81:
               var10000 = 41;
               break;
            case 82:
               var10000 = 89;
               break;
            case 83:
               var10000 = 204;
               break;
            case 84:
               var10000 = 187;
               break;
            case 85:
               var10000 = 4;
               break;
            case 86:
               var10000 = 71;
               break;
            case 87:
               var10000 = 227;
               break;
            case 88:
               var10000 = 35;
               break;
            case 89:
               var10000 = 72;
               break;
            case 90:
               var10000 = 138;
               break;
            case 91:
               var10000 = 143;
               break;
            case 92:
               var10000 = 180;
               break;
            case 93:
               var10000 = 214;
               break;
            case 94:
               var10000 = 255;
               break;
            case 95:
               var10000 = 173;
               break;
            case 96:
               var10000 = 108;
               break;
            case 97:
               var10000 = 234;
               break;
            case 98:
               var10000 = 203;
               break;
            case 99:
               var10000 = 167;
               break;
            case 100:
               var10000 = 5;
               break;
            case 101:
               var10000 = 216;
               break;
            case 102:
               var10000 = 128;
               break;
            case 103:
               var10000 = 112;
               break;
            case 104:
               var10000 = 159;
               break;
            case 105:
               var10000 = 118;
               break;
            case 106:
               var10000 = 40;
               break;
            case 107:
               var10000 = 6;
               break;
            case 108:
               var10000 = 26;
               break;
            case 109:
               var10000 = 142;
               break;
            case 110:
               var10000 = 115;
               break;
            case 111:
               var10000 = 87;
               break;
            case 112:
               var10000 = 91;
               break;
            case 113:
               var10000 = 55;
               break;
            case 114:
               var10000 = 229;
               break;
            case 115:
               var10000 = 56;
               break;
            case 116:
               var10000 = 174;
               break;
            case 117:
               var10000 = 162;
               break;
            case 118:
               var10000 = 86;
               break;
            case 119:
               var10000 = 148;
               break;
            case 120:
               var10000 = 32;
               break;
            case 121:
               var10000 = 237;
               break;
            case 122:
               var10000 = 53;
               break;
            case 123:
               var10000 = 245;
               break;
            case 124:
               var10000 = 29;
               break;
            case 125:
               var10000 = 184;
               break;
            case 126:
               var10000 = 24;
               break;
            case 127:
               var10000 = 161;
               break;
            case 128:
               var10000 = 147;
               break;
            case 129:
               var10000 = 92;
               break;
            case 130:
               var10000 = 22;
               break;
            case 131:
               var10000 = 169;
               break;
            case 132:
               var10000 = 251;
               break;
            case 133:
               var10000 = 30;
               break;
            case 134:
               var10000 = 14;
               break;
            case 135:
               var10000 = 37;
               break;
            case 136:
               var10000 = 124;
               break;
            case 137:
               var10000 = 23;
               break;
            case 138:
               var10000 = 217;
               break;
            case 139:
               var10000 = 107;
               break;
            case 140:
               var10000 = 10;
               break;
            case 141:
               var10000 = 192;
               break;
            case 142:
               var10000 = 193;
               break;
            case 143:
               var10000 = 140;
               break;
            case 144:
               var10000 = 171;
               break;
            case 145:
               var10000 = 116;
               break;
            case 146:
               var10000 = 101;
               break;
            case 147:
               var10000 = 63;
               break;
            case 148:
               var10000 = 70;
               break;
            case 149:
               var10000 = 44;
               break;
            case 150:
               var10000 = 18;
               break;
            case 151:
               var10000 = 160;
               break;
            case 152:
               var10000 = 59;
               break;
            case 153:
               var10000 = 209;
               break;
            case 154:
               var10000 = 114;
               break;
            case 155:
               var10000 = 2;
               break;
            case 156:
               var10000 = 110;
               break;
            case 157:
               var10000 = 60;
               break;
            case 158:
               var10000 = 36;
               break;
            case 159:
               var10000 = 163;
               break;
            case 160:
               var10000 = 121;
               break;
            case 161:
               var10000 = 179;
               break;
            case 162:
               var10000 = 153;
               break;
            case 163:
               var10000 = 100;
               break;
            case 164:
               var10000 = 122;
               break;
            case 165:
               var10000 = 119;
               break;
            case 166:
               var10000 = 221;
               break;
            case 167:
               var10000 = 242;
               break;
            case 168:
               var10000 = 197;
               break;
            case 169:
               var10000 = 25;
               break;
            case 170:
               var10000 = 109;
               break;
            case 171:
               var10000 = 222;
               break;
            case 172:
               var10000 = 235;
               break;
            case 173:
               var10000 = 246;
               break;
            case 174:
               var10000 = 247;
               break;
            case 175:
               var10000 = 47;
               break;
            case 176:
               var10000 = 66;
               break;
            case 177:
               var10000 = 188;
               break;
            case 178:
               var10000 = 1;
               break;
            case 179:
               var10000 = 130;
               break;
            case 180:
               var10000 = 149;
               break;
            case 181:
               var10000 = 240;
               break;
            case 182:
               var10000 = 136;
               break;
            case 183:
               var10000 = 65;
               break;
            case 184:
               var10000 = 76;
               break;
            case 185:
               var10000 = 212;
               break;
            case 186:
               var10000 = 225;
               break;
            case 187:
               var10000 = 224;
               break;
            case 188:
               var10000 = 244;
               break;
            case 189:
               var10000 = 20;
               break;
            case 190:
               var10000 = 207;
               break;
            case 191:
               var10000 = 11;
               break;
            case 192:
               var10000 = 58;
               break;
            case 193:
               var10000 = 230;
               break;
            case 194:
               var10000 = 42;
               break;
            case 195:
               var10000 = 233;
               break;
            case 196:
               var10000 = 154;
               break;
            case 197:
               var10000 = 46;
               break;
            case 198:
               var10000 = 195;
               break;
            case 199:
               var10000 = 15;
               break;
            case 200:
               var10000 = 117;
               break;
            case 201:
               var10000 = 129;
               break;
            case 202:
               var10000 = 250;
               break;
            case 203:
               var10000 = 151;
               break;
            case 204:
               var10000 = 98;
               break;
            case 205:
               var10000 = 73;
               break;
            case 206:
               var10000 = 252;
               break;
            case 207:
               var10000 = 3;
               break;
            case 208:
               var10000 = 17;
               break;
            case 209:
               var10000 = 8;
               break;
            case 210:
               var10000 = 181;
               break;
            case 211:
               var10000 = 134;
               break;
            case 212:
               var10000 = 239;
               break;
            case 213:
               var10000 = 125;
               break;
            case 214:
               var10000 = 50;
               break;
            case 215:
               var10000 = 236;
               break;
            case 216:
               var10000 = 12;
               break;
            case 217:
               var10000 = 111;
               break;
            case 218:
               var10000 = 186;
               break;
            case 219:
               var10000 = 113;
               break;
            case 220:
               var10000 = 211;
               break;
            case 221:
               var10000 = 67;
               break;
            case 222:
               var10000 = 243;
               break;
            case 223:
               var10000 = 190;
               break;
            case 224:
               var10000 = 196;
               break;
            case 225:
               var10000 = 175;
               break;
            case 226:
               var10000 = 191;
               break;
            case 227:
               var10000 = 194;
               break;
            case 228:
               var10000 = 144;
               break;
            case 229:
               var10000 = 77;
               break;
            case 230:
               var10000 = 69;
               break;
            case 231:
               var10000 = 21;
               break;
            case 232:
               var10000 = 62;
               break;
            case 233:
               var10000 = 99;
               break;
            case 234:
               var10000 = 170;
               break;
            case 235:
               var10000 = 131;
               break;
            case 236:
               var10000 = 34;
               break;
            case 237:
               var10000 = 78;
               break;
            case 238:
               var10000 = 127;
               break;
            case 239:
               var10000 = 168;
               break;
            case 240:
               var10000 = 215;
               break;
            case 241:
               var10000 = 93;
               break;
            case 242:
               var10000 = 248;
               break;
            case 243:
               var10000 = 28;
               break;
            case 244:
               var10000 = 210;
               break;
            case 245:
               var10000 = 165;
               break;
            case 246:
               var10000 = 166;
               break;
            case 247:
               var10000 = 126;
               break;
            case 248:
               var10000 = 249;
               break;
            case 249:
               var10000 = 219;
               break;
            case 250:
               var10000 = 199;
               break;
            case 251:
               var10000 = 103;
               break;
            case 252:
               var10000 = 104;
               break;
            case 253:
               var10000 = 172;
               break;
            case 254:
               var10000 = 164;
               break;
            default:
               var10000 = 90;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7618;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var15 = new String[23];
      int var13 = 0;
      String var12 = "æ$Ca\u0018\n¢;6B®\u001aù\u0092\u000e\u000b»>O(Ûy\u0080SsÜ\u0014\u000e\r¬\u0099z\u00013ª\u0013uýCÃC\u007f\u0005ë¥E\u009c\u008c\u0004\u0092ñb\u001f\u0004¿\u0083\u0093N\u0005Y{\u0013GF\tðæìýyäÏ%Ò\u000by%»ð|Ð6\u008dàØ4\u00044©+Ê\u0014Ð¹?_½ËkîÆº\n\u0080CÆ\u008fIî¸#\u0082\u000b\u008b\u0013I\u008d\u001bÍ\u0098Åp\u000et\u0014\u001biFE\u0092\u0088\u008e\u0086z·\u009d!±òÑÏ%hZ\u0098\u0004¤Ì9f\u0011Ñ\u0000ë&Ð9\u0086\u008d\u008bïTgßC\u009fÝg\u0002\u0087\u0010\u0004N*V \u000e\u008b\u0013I\u008d\u001bÍéÌ\u001d\u0006N¼â\u0090\u0004%\tÀ\u001f\t¶\u0082$q`uì\u0017¶\u000f¯\u000bj\u0084=¶\u0006¬¢°<D«YD";
      int var14 = "æ$Ca\u0018\n¢;6B®\u001aù\u0092\u000e\u000b»>O(Ûy\u0080SsÜ\u0014\u000e\r¬\u0099z\u00013ª\u0013uýCÃC\u007f\u0005ë¥E\u009c\u008c\u0004\u0092ñb\u001f\u0004¿\u0083\u0093N\u0005Y{\u0013GF\tðæìýyäÏ%Ò\u000by%»ð|Ð6\u008dàØ4\u00044©+Ê\u0014Ð¹?_½ËkîÆº\n\u0080CÆ\u008fIî¸#\u0082\u000b\u008b\u0013I\u008d\u001bÍ\u0098Åp\u000et\u0014\u001biFE\u0092\u0088\u008e\u0086z·\u009d!±òÑÏ%hZ\u0098\u0004¤Ì9f\u0011Ñ\u0000ë&Ð9\u0086\u008d\u008bïTgßC\u009fÝg\u0002\u0087\u0010\u0004N*V \u000e\u008b\u0013I\u008d\u001bÍéÌ\u001d\u0006N¼â\u0090\u0004%\tÀ\u001f\t¶\u0082$q`uì\u0017¶\u000f¯\u000bj\u0084=¶\u0006¬¢°<D«YD"
         .length();
      char var11 = 15;
      int var18 = -1;

      label61:
      while (true) {
         byte var10000 = 70;
         String var10001 = var12.substring(++var18, var18 + var11);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var38 = var10001.toCharArray();
               int var10004 = var38.length;
               int var16 = 0;
               byte var41 = var10000;
               var33 = var38;
               int var24 = var10004;
               byte var47;
               char[] var52;
               int var10006;
               if (var10004 <= 1) {
                  var52 = var38;
                  var47 = var10000;
                  var10006 = var16;
               } else {
                  var41 = var10000;
                  var24 = var10004;
                  if (var10004 <= var16) {
                     break label56;
                  }

                  var52 = var38;
                  var47 = var10000;
                  var10006 = var16;
               }

               while (true) {
                  char var61 = var52[var10006];
                  byte var62;
                  switch (var16 % 7) {
                     case 0:
                        var62 = 8;
                        break;
                     case 1:
                        var62 = 127;
                        break;
                     case 2:
                        var62 = 113;
                        break;
                     case 3:
                        var62 = 104;
                        break;
                     case 4:
                        var62 = 22;
                        break;
                     case 5:
                        var62 = 101;
                        break;
                     default:
                        var62 = 80;
                  }

                  var52[var10006] = (char)(var61 ^ var47 ^ var62);
                  var16++;
                  if (var41 == 0) {
                     var10006 = var41;
                     var52 = var33;
                     var47 = var41;
                  } else {
                     if (var24 <= var16) {
                        break;
                     }

                     var52 = var33;
                     var47 = var41;
                     var10006 = var16;
                  }
               }
            }

            String var43 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var15[var13++] = var43;
                  if ((var18 += var11) >= var14) {
                     a = var15;
                     b = new String[23];
                     long var2 = 7780681785457742111L;
                     long[] var8 = new long[2];
                     int var5 = 0;
                     String var6 = "aÌò\u0099îgxÓ\u0089\u0017â\u000b\u0002o\u0006!";
                     int var7 = "aÌò\u0099îgxÓ\u0089\u0017â\u000b\u0002o\u0006!".length();
                     byte var4 = 0;

                     do {
                        byte var26 = var4;
                        var4 += 8;
                        byte[] var9 = var6.substring(var26, var4).getBytes("ISO-8859-1");
                        int var27 = var5++;
                        long var51 = (
                              ((long)var9[0] & 255L) << 56
                                 | ((long)var9[1] & 255L) << 48
                                 | ((long)var9[2] & 255L) << 40
                                 | ((long)var9[3] & 255L) << 32
                                 | ((long)var9[4] & 255L) << 24
                                 | ((long)var9[5] & 255L) << 16
                                 | ((long)var9[6] & 255L) << 8
                                 | (long)var9[7] & 255L
                           )
                           ^ var2;
                        byte var44 = -1;
                        var8[var27] = var51;
                     } while (var4 < var7);

                     c = var8;
                     d = new Integer[2];
                     long var0 = 4118265833767677246L;
                     long var37 = 4118265831516235070L ^ var0;
                     byte var28 = -1;
                     f = var37;
                     return;
                  }

                  var11 = var12.charAt(var18);
                  break;
               default:
                  var15[var13++] = var43;
                  if ((var18 += var11) < var14) {
                     var11 = var12.charAt(var18);
                     continue label61;
                  }

                  var12 = "\u0096½kÎK:ýý´û\u0093\u0004,¨7Ý";
                  var14 = "\u0096½kÎK:ýý´û\u0093\u0004,¨7Ý".length();
                  var11 = 11;
                  var18 = -1;
            }

            var10000 = 110;
            var10001 = var12.substring(++var18, var18 + var11);
            var10002 = 0;
         }
      }
   }
}





