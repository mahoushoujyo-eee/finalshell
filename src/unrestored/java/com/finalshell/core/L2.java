package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.FileDescriptor;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class L2 {
   public static volatile Object V;
   public volatile String b;
   public volatile int v;
   public volatile Nv2 E;
   public static volatile Hashtable C;
   public static volatile Hashtable Y;
   public static volatile Hashtable L;
   public volatile Hashtable j = new Hashtable();
   public static String a;
   public static long c;

   @Override
   public boolean equals(Object var1) {
      Ky4[] var2 = XA.P();
      boolean var10000 = var1 instanceof L2;
      if (var2 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.b.equals(((L2)var1).b);
      }

      return var2 == null ? var10000 : var10000;
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static void Z(String var0, int var1, Nv2 var2) {
      synchronized (V) {
         C.put(var0, new L2(var0, var1, var2));
      }
   }

   public L2(String var1, int var2, Nv2 var3) {
      this.b = var1;
      this.v = var2;
      this.E = var3;
   }

   public static L2 f(String param0) throws LQ3_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: getstatic com/finalshell/core/L2.V Ljava/lang/Object;
      // 006: dup
      // 007: astore 2
      // 008: monitorenter
      // 009: astore 1
      // 00a: bipush 0
      // 00b: istore 3
      // 00c: getstatic com/finalshell/core/L2.Y Ljava/util/Hashtable;
      // 00f: invokevirtual java/util/Hashtable.values ()Ljava/util/Collection;
      // 012: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 017: astore 4
      // 019: aload 4
      // 01b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 020: ifeq 061
      // 023: aload 4
      // 025: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 02a: checkcast com/finalshell/core/L2
      // 02d: astore 5
      // 02f: aload 5
      // 031: aload 1
      // 032: ifnull 05c
      // 035: invokevirtual com/finalshell/core/L2.U ()Ljava/lang/String;
      // 038: aload 0
      // 039: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 03c: aload 1
      // 03d: ifnull 062
      // 040: goto 047
      // 043: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: ifeq 05d
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 5
      // 053: aload 2
      // 054: monitorexit
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: areturn
      // 05d: aload 1
      // 05e: ifnonnull 019
      // 061: iload 3
      // 062: ifeq 0b5
      // 065: invokestatic com/finalshell/core/L2.N$Enumeration ()Ljava/util/Enumeration;
      // 068: astore 4
      // 06a: aload 4
      // 06c: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 071: ifeq 0b2
      // 074: aload 4
      // 076: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 07b: checkcast com/finalshell/core/L2
      // 07e: astore 5
      // 080: aload 1
      // 081: ifnull 17d
      // 084: aload 5
      // 086: aload 1
      // 087: ifnull 0ad
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: invokevirtual com/finalshell/core/L2.U ()Ljava/lang/String;
      // 094: aload 0
      // 095: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 098: ifeq 0ae
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: aload 5
      // 0a4: aload 2
      // 0a5: monitorexit
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac: athrow
      // 0ad: areturn
      // 0ae: aload 1
      // 0af: ifnonnull 06a
      // 0b2: goto 17d
      // 0b5: getstatic com/finalshell/core/L2.C Ljava/util/Hashtable;
      // 0b8: aload 0
      // 0b9: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0bc: checkcast com/finalshell/core/L2
      // 0bf: astore 4
      // 0c1: aload 4
      // 0c3: aload 1
      // 0c4: ifnull 0dc
      // 0c7: ifnull 0dd
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: aload 4
      // 0d3: aload 2
      // 0d4: monitorexit
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: areturn
      // 0dd: aload 0
      // 0de: getstatic jtermios/j.HV I
      // 0e1: getstatic jtermios/j.z I
      // 0e4: ior
      // 0e5: getstatic jtermios/j.J I
      // 0e8: ior
      // 0e9: invokestatic jtermios/j.D (Ljava/lang/String;I)I
      // 0ec: istore 5
      // 0ee: iload 5
      // 0f0: bipush -1
      // 0f1: aload 1
      // 0f2: ifnull 16d
      // 0f5: if_icmpeq 160
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe: athrow
      // 0ff: iload 5
      // 101: new jtermios/X
      // 104: dup
      // 105: invokespecial jtermios/X.<init> ()V
      // 108: invokestatic jtermios/j.T (ILjtermios/X;)I
      // 10b: aload 1
      // 10c: ifnull 148
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: bipush -1
      // 117: if_icmpne 13c
      // 11a: goto 121
      // 11d: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 120: athrow
      // 121: invokestatic jtermios/j.z ()I
      // 124: aload 1
      // 125: ifnull 15b
      // 128: goto 12f
      // 12b: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e: athrow
      // 12f: getstatic jtermios/j.K I
      // 132: if_icmpeq 156
      // 135: goto 13c
      // 138: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13b: athrow
      // 13c: iload 5
      // 13e: invokestatic jtermios/j.m (I)I
      // 141: goto 148
      // 144: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 147: athrow
      // 148: pop
      // 149: new com/finalshell/core/L2
      // 14c: dup
      // 14d: aload 0
      // 14e: bipush 1
      // 14f: aconst_null
      // 150: invokespecial com/finalshell/core/L2.<init> (Ljava/lang/String;ILcom/finalshell/core/Nv2;)V
      // 153: aload 2
      // 154: monitorexit
      // 155: areturn
      // 156: iload 5
      // 158: invokestatic jtermios/j.m (I)I
      // 15b: pop
      // 15c: aload 1
      // 15d: ifnonnull 17d
      // 160: invokestatic jtermios/j.z ()I
      // 163: getstatic jtermios/j.H1 I
      // 166: goto 16d
      // 169: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16c: athrow
      // 16d: if_icmpeq 17d
      // 170: new com/finalshell/core/L2
      // 173: dup
      // 174: aload 0
      // 175: bipush 1
      // 176: aconst_null
      // 177: invokespecial com/finalshell/core/L2.<init> (Ljava/lang/String;ILcom/finalshell/core/Nv2;)V
      // 17a: aload 2
      // 17b: monitorexit
      // 17c: areturn
      // 17d: new com/finalshell/core/LQ3_2
      // 180: dup
      // 181: invokespecial com/finalshell/core/LQ3_2.<init> ()V
      // 184: athrow
      // 185: astore 6
      // 187: aload 2
      // 188: monitorexit
      // 189: aload 6
      // 18b: athrow
   }

   public static L2 v(XA param0) throws LQ3_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: getstatic com/finalshell/core/L2.V Ljava/lang/Object;
      // 06: dup
      // 07: astore 2
      // 08: monitorenter
      // 09: astore 1
      // 0a: getstatic com/finalshell/core/L2.Y Ljava/util/Hashtable;
      // 0d: aload 0
      // 0e: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 11: checkcast com/finalshell/core/L2
      // 14: astore 3
      // 15: aload 3
      // 16: aload 1
      // 17: ifnull 33
      // 1a: ifnonnull 30
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: new com/finalshell/core/LQ3_2
      // 27: dup
      // 28: invokespecial com/finalshell/core/LQ3_2.<init> ()V
      // 2b: athrow
      // 2c: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: aload 3
      // 31: aload 2
      // 32: monitorexit
      // 33: areturn
      // 34: astore 4
      // 36: aload 2
      // 37: monitorexit
      // 38: aload 4
      // 3a: athrow
   }

   public XA r(String param1, int param2) throws O {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: getstatic com/finalshell/core/L2.V Ljava/lang/Object;
      // 06: dup
      // 07: astore 4
      // 09: monitorenter
      // 0a: astore 3
      // 0b: invokestatic java/lang/System.currentTimeMillis ()J
      // 0e: lstore 5
      // 10: getstatic com/finalshell/core/L2.L Ljava/util/Hashtable;
      // 13: aload 0
      // 14: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 17: checkcast java/lang/String
      // 1a: astore 7
      // 1c: aload 7
      // 1e: ifnull 5b
      // 21: aload 0
      // 22: bipush 3
      // 23: invokespecial com/finalshell/core/L2.X (I)V
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: invokestatic java/lang/System.currentTimeMillis ()J
      // 30: lload 5
      // 32: lsub
      // 33: iload 2
      // 34: i2l
      // 35: lcmp
      // 36: ifge 50
      // 39: getstatic com/finalshell/core/L2.V Ljava/lang/Object;
      // 3c: getstatic com/finalshell/core/L2.c J
      // 3f: invokevirtual java/lang/Object.wait (J)V
      // 42: aload 0
      // 43: invokevirtual com/finalshell/core/L2.N$boolean ()Z
      // 46: ifne 2d
      // 49: aload 3
      // 4a: ifnull 42
      // 4d: goto 50
      // 50: goto 5b
      // 53: astore 8
      // 55: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 58: invokevirtual java/lang/Thread.interrupt ()V
      // 5b: aload 0
      // 5c: aload 3
      // 5d: ifnull 8a
      // 60: invokevirtual com/finalshell/core/L2.N$boolean ()Z
      // 63: ifeq 7d
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: new com/finalshell/core/O
      // 70: dup
      // 71: aload 0
      // 72: invokevirtual com/finalshell/core/L2.x ()Ljava/lang/String;
      // 75: invokespecial com/finalshell/core/O.<init> (Ljava/lang/String;)V
      // 78: athrow
      // 79: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c: athrow
      // 7d: getstatic com/finalshell/core/L2.C Ljava/util/Hashtable;
      // 80: aload 0
      // 81: getfield com/finalshell/core/L2.b Ljava/lang/String;
      // 84: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 87: checkcast com/finalshell/core/L2
      // 8a: astore 8
      // 8c: aload 8
      // 8e: aload 3
      // 8f: ifnull 9e
      // 92: ifnull b5
      // 95: goto 9c
      // 98: invokestatic com/finalshell/core/L2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: aload 8
      // 9e: getfield com/finalshell/core/L2.E Lcom/finalshell/core/Nv2;
      // a1: aload 0
      // a2: getfield com/finalshell/core/L2.b Ljava/lang/String;
      // a5: aload 8
      // a7: getfield com/finalshell/core/L2.v I
      // aa: invokeinterface com/finalshell/core/Nv2.E (Ljava/lang/String;I)Lcom/finalshell/core/XA; 3
      // af: astore 9
      // b1: aload 3
      // b2: ifnonnull c3
      // b5: new com/finalshell/core/X3_3
      // b8: dup
      // b9: aload 0
      // ba: getfield com/finalshell/core/L2.b Ljava/lang/String;
      // bd: iload 2
      // be: invokespecial com/finalshell/core/X3_3.<init> (Ljava/lang/String;I)V
      // c1: astore 9
      // c3: getstatic com/finalshell/core/L2.Y Ljava/util/Hashtable;
      // c6: aload 9
      // c8: aload 0
      // c9: invokevirtual java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // cc: pop
      // cd: getstatic com/finalshell/core/L2.L Ljava/util/Hashtable;
      // d0: aload 0
      // d1: aload 1
      // d2: invokevirtual java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // d5: pop
      // d6: aload 0
      // d7: bipush 1
      // d8: invokespecial com/finalshell/core/L2.X (I)V
      // db: aload 9
      // dd: aload 4
      // df: monitorexit
      // e0: areturn
      // e1: astore 10
      // e3: aload 4
      // e5: monitorexit
      // e6: aload 10
      // e8: athrow
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void B(XA var0) {
      Ky4 var10000 = XA.P();
      Object var2 = V;
      synchronized (V){} // $VF: monitorenter 
      Ky4[] var1 = var10000;

      try {
         L2 var3 = (L2)Y.remove(var0);
         var10000 = (Ky4)(var3);
         if (var1 != null) {
            if (var3 != null) {
               var3.X(2);
               L.remove(var3);
            }

            var10000 = (Ky4)((Ky4[])var2);
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public XA K(FileDescriptor var1) throws Mw2 {
      throw new Mw2(a);
   }

   public String U() {
      return this.b;
   }

   public int r() {
      return this.v;
   }

   public static Enumeration N$Enumeration() {
      synchronized (V) {
         return new YG();
      }
   }

   public String x() {
      synchronized (V) {
         return (String)L.get(this);
      }
   }

   public boolean N$boolean() {
      return this.x() != null;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void x(Ob2 var1) {
      Ky4[] var10000 = XA.P();
      Object var3 = V;
      synchronized (V){} // $VF: monitorenter 
      Ky4[] var2 = var10000;

      try {
         Object var4 = (List)this.j.get(this);
         var10000 = (Ky4[])var4;
         if (var2 != null) {
            if (var4 == null) {
               var4 = new LinkedList();
               this.j.put(this, var4);
            }

            ((java.math.BigInteger)var4).add(var1);
            var10000 = (Ky4[])var3;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Q(Ob2 var1) {
      Ky4[] var10000 = XA.P();
      Object var3 = V;
      synchronized (V){} // $VF: monitorenter 
      Ky4[] var2 = var10000;

      try {
         List var4 = (List)this.j.get(this);
         var10000 = (Ky4[])(var4);
         if (var2 != null) {
            if (var4 == null) {
               // $VF: monitorexit
               return;
            }

            var4.remove(var1);
            var10000 = (Ky4[])(var4);
         }

         if (var2 != null) {
            if (var10000.isEmpty()) {
               this.j.remove(this);
            }

            var10000 = (Ky4[])var3;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void X(int var1) {
      Ky4[] var10000 = XA.P();
      Object var3 = V;
      synchronized (V){} // $VF: monitorenter 
      Ky4[] var2 = var10000;

      try {
         List var4 = (List)this.j.get(this);
         List var10 = var4;
         if (var2 != null) {
            if (var4 == null) {
               // $VF: monitorexit
               return;
            }

            var10 = var4;
         }

         Iterator var5 = var10.iterator();

         while (true) {
            if (var5.hasNext()) {
               Ob2 var6 = (Ob2)var5.next();
               var6.o(var1);
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            }

            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }

   public static Hashtable X() {
      return C;
   }

   public L2(String var1, int var2, Nv2 var3, YG var4) {
      this(var1, var2, var3);
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = " $21xrd 9w91xso02,;f\u007f? 8-xzy;t$*(dy= 2;".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 92;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 92;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 19;
               break;
            case 1:
               var21 = 8;
               break;
            case 2:
               var21 = 11;
               break;
            case 3:
               var21 = 3;
               break;
            case 4:
               var21 = 4;
               break;
            case 5:
               var21 = 72;
               break;
            default:
               var21 = 74;
         }
      } else {
         var13 = 92;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 4492757750992385759L;
            long var12 = 4492757750992385754L ^ var3;
            var8 = -1;
            c = var12;
            V = new Object();
            C = new Hashtable();
            Y = new Hashtable();
            L = new Hashtable();
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 92;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 19;
               break;
            case 1:
               var21 = 8;
               break;
            case 2:
               var21 = 11;
               break;
            case 3:
               var21 = 3;
               break;
            case 4:
               var21 = 4;
               break;
            case 5:
               var21 = 72;
               break;
            default:
               var21 = 74;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 19;
                  break;
               case 1:
                  var21 = 8;
                  break;
               case 2:
                  var21 = 11;
                  break;
               case 3:
                  var21 = 3;
                  break;
               case 4:
                  var21 = 4;
                  break;
               case 5:
                  var21 = 72;
                  break;
               default:
                  var21 = 74;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 4492757750992385759L;
               long var11 = 4492757750992385754L ^ var0;
               var6 = -1;
               c = var11;
               V = new Object();
               C = new Hashtable();
               Y = new Hashtable();
               L = new Hashtable();
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 19;
                  break;
               case 1:
                  var21 = 8;
                  break;
               case 2:
                  var21 = 11;
                  break;
               case 3:
                  var21 = 3;
                  break;
               case 4:
                  var21 = 4;
                  break;
               case 5:
                  var21 = 72;
                  break;
               default:
                  var21 = 74;
            }
         }
      }
   }
}





