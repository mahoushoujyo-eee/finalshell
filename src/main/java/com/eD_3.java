package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.AbstractListModel;

public class eD_3 extends AbstractListModel {
   protected Vector u = new Vector();
   private static final String a;

   public eD_3() {
   }

   public eD_3(Object[] var1) {
      Collections.addAll(this.u, var1);
   }

   public eD_3(Collection var1) {
      this.u.addAll(var1);
   }

   @Override
   public int getSize() {
      return this.u.size();
   }

   @Override
   public Object getElementAt(int var1) {
      return this.u.elementAt(var1);
   }

   public List p() {
      return new ArrayList(this.u);
   }

   public void M(Object[] var1) {
      this.u.copyInto(var1);
   }

   public void s() {
      this.u.trimToSize();
   }

   public void g(int var1) {
      this.u.ensureCapacity(var1);
   }

   public void f(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/CI.c ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/eD_3.u Ljava/util/Vector;
      // 07: invokevirtual java/util/Vector.size ()I
      // 0a: istore 3
      // 0b: astore 2
      // 0c: aload 0
      // 0d: getfield com/eD_3.u Ljava/util/Vector;
      // 10: iload 1
      // 11: invokevirtual java/util/Vector.setSize (I)V
      // 14: iload 3
      // 15: iload 1
      // 16: aload 2
      // 17: ifnonnull 41
      // 1a: if_icmple 38
      // 1d: goto 24
      // 20: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23: athrow
      // 24: aload 0
      // 25: aload 0
      // 26: iload 1
      // 27: iload 3
      // 28: bipush 1
      // 29: isub
      // 2a: invokevirtual com/eD_3.fireIntervalRemoved (Ljava/lang/Object;II)V
      // 2d: aload 2
      // 2e: ifnull 54
      // 31: goto 38
      // 34: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37: athrow
      // 38: iload 3
      // 39: iload 1
      // 3a: goto 41
      // 3d: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40: athrow
      // 41: if_icmpge 54
      // 44: aload 0
      // 45: aload 0
      // 46: iload 3
      // 47: iload 1
      // 48: bipush 1
      // 49: isub
      // 4a: invokevirtual com/eD_3.fireIntervalAdded (Ljava/lang/Object;II)V
      // 4d: goto 54
      // 50: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 53: athrow
      // 54: return
   }

   public int u() {
      return this.u.capacity();
   }

   public int y() {
      return this.u.size();
   }

   public boolean m() {
      return this.u.isEmpty();
   }

   public Enumeration k() {
      return this.u.elements();
   }

   public boolean u(Object var1) {
      return this.u.contains(var1);
   }

   public int J(Object var1) {
      return this.u.indexOf(var1);
   }

   public int u(Object var1, int var2) {
      return this.u.indexOf(var1, var2);
   }

   public int n(Object var1) {
      return this.u.lastIndexOf(var1);
   }

   public int m(Object var1, int var2) {
      return this.u.lastIndexOf(var1, var2);
   }

   public Object r(int var1) {
      return this.u.elementAt(var1);
   }

   public Object N() {
      return this.u.firstElement();
   }

   public Object A() {
      return this.u.lastElement();
   }

   public void X(Object var1, int var2) {
      this.u.setElementAt(var1, var2);
      this.fireContentsChanged(this, var2, var2);
   }

   public void A(int var1) {
      this.u.removeElementAt(var1);
      this.fireIntervalRemoved(this, var1, var1);
   }

   public void q(Object var1, int var2) {
      this.u.insertElementAt(var1, var2);
      this.fireIntervalAdded(this, var2, var2);
   }

   public void T(Object var1) {
      int var2 = this.u.size();
      this.u.addElement(var1);
      this.fireIntervalAdded(this, var2, var2);
   }

   public void U(Object[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/CI.c ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: arraylength
      // 06: aload 2
      // 07: ifnonnull 22
      // 0a: ifle 3b
      // 0d: goto 14
      // 10: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13: athrow
      // 14: aload 0
      // 15: getfield com/eD_3.u Ljava/util/Vector;
      // 18: invokevirtual java/util/Vector.size ()I
      // 1b: goto 22
      // 1e: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21: athrow
      // 22: istore 3
      // 23: aload 0
      // 24: getfield com/eD_3.u Ljava/util/Vector;
      // 27: aload 1
      // 28: invokestatic java/util/Collections.addAll (Ljava/util/Collection;[Ljava/lang/Object;)Z
      // 2b: pop
      // 2c: aload 0
      // 2d: aload 0
      // 2e: iload 3
      // 2f: aload 0
      // 30: getfield com/eD_3.u Ljava/util/Vector;
      // 33: invokevirtual java/util/Vector.size ()I
      // 36: bipush 1
      // 37: isub
      // 38: invokevirtual com/eD_3.fireIntervalAdded (Ljava/lang/Object;II)V
      // 3b: return
   }

   public void u(Collection param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/CI.c ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: invokeinterface java/util/Collection.size ()I 1
      // 0a: aload 2
      // 0b: ifnonnull 26
      // 0e: ifle 3f
      // 11: goto 18
      // 14: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield com/eD_3.u Ljava/util/Vector;
      // 1c: invokevirtual java/util/Vector.size ()I
      // 1f: goto 26
      // 22: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25: athrow
      // 26: istore 3
      // 27: aload 0
      // 28: getfield com/eD_3.u Ljava/util/Vector;
      // 2b: aload 1
      // 2c: invokevirtual java/util/Vector.addAll (Ljava/util/Collection;)Z
      // 2f: pop
      // 30: aload 0
      // 31: aload 0
      // 32: iload 3
      // 33: aload 0
      // 34: getfield com/eD_3.u Ljava/util/Vector;
      // 37: invokevirtual java/util/Vector.size ()I
      // 3a: bipush 1
      // 3b: isub
      // 3c: invokevirtual com/eD_3.fireIntervalAdded (Ljava/lang/Object;II)V
      // 3f: return
   }

   public void K(Collection param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/CI.c ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/eD_3.B ()V
      // 07: astore 2
      // 08: aload 1
      // 09: invokeinterface java/util/Collection.size ()I 1
      // 0e: aload 2
      // 0f: ifnonnull 2b
      // 12: ifle 3b
      // 15: goto 1c
      // 18: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield com/eD_3.u Ljava/util/Vector;
      // 20: aload 1
      // 21: invokevirtual java/util/Vector.addAll (Ljava/util/Collection;)Z
      // 24: goto 2b
      // 27: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a: athrow
      // 2b: pop
      // 2c: aload 0
      // 2d: aload 0
      // 2e: bipush 0
      // 2f: aload 0
      // 30: getfield com/eD_3.u Ljava/util/Vector;
      // 33: invokevirtual java/util/Vector.size ()I
      // 36: bipush 1
      // 37: isub
      // 38: invokevirtual com/eD_3.fireIntervalAdded (Ljava/lang/Object;II)V
      // 3b: return
   }

   public boolean y(Object param1) {
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
      // 02: invokevirtual com/eD_3.J (Ljava/lang/Object;)I
      // 05: istore 3
      // 06: invokestatic com/CI.c ()[Ljava/lang/String;
      // 09: aload 0
      // 0a: getfield com/eD_3.u Ljava/util/Vector;
      // 0d: aload 1
      // 0e: invokevirtual java/util/Vector.removeElement (Ljava/lang/Object;)Z
      // 11: istore 4
      // 13: astore 2
      // 14: iload 3
      // 15: aload 2
      // 16: ifnonnull 33
      // 19: iflt 31
      // 1c: goto 23
      // 1f: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22: athrow
      // 23: aload 0
      // 24: aload 0
      // 25: iload 3
      // 26: iload 3
      // 27: invokevirtual com/eD_3.fireIntervalRemoved (Ljava/lang/Object;II)V
      // 2a: goto 31
      // 2d: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30: athrow
      // 31: iload 4
      // 33: ireturn
   }

   public void s(Object[] var1) {
      Object[] var3 = var1;
      String[] var10000 = com.CI.c();
      int var4 = var1.length;
      String[] var2 = var10000;
      int var5 = 0;

      while (var5 < var4) {
         Object var6 = var3[var5];
         this.y(var6);
         var5++;
         if (var2 != null) {
            break;
         }
      }
   }

   public void x(Collection var1) {
      String[] var10000 = com.CI.c();
      Iterator var3 = var1.iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         Object var4 = var3.next();
         this.y(var4);
         if (var2 != null) {
            break;
         }
      }
   }

   public void C() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/CI.c ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/eD_3.u Ljava/util/Vector;
      // 07: invokevirtual java/util/Vector.size ()I
      // 0a: bipush 1
      // 0b: isub
      // 0c: istore 2
      // 0d: astore 1
      // 0e: aload 0
      // 0f: aload 1
      // 10: ifnonnull 2c
      // 13: getfield com/eD_3.u Ljava/util/Vector;
      // 16: invokevirtual java/util/Vector.removeAllElements ()V
      // 19: iload 2
      // 1a: iflt 32
      // 1d: goto 24
      // 20: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23: athrow
      // 24: aload 0
      // 25: goto 2c
      // 28: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b: athrow
      // 2c: aload 0
      // 2d: bipush 0
      // 2e: iload 2
      // 2f: invokevirtual com/eD_3.fireIntervalRemoved (Ljava/lang/Object;II)V
      // 32: return
   }

   public void J(int var1) {
      String[] var10000 = com.CI.c();
      int var3 = 0;
      String[] var2 = var10000;

      while (true) {
         if (var3 < var1) {
            try {
               this.u.removeElementAt(var1);
               var3++;
               if (var2 != null) {
                  break;
               }

               if (var2 == null) {
                  continue;
               }
            } catch (IllegalArgumentException var5) {
               throw a(var5);
            }
         }

         try {
            if (var1 > 0) {
               this.fireIntervalRemoved(this, 0, var1 - 1);
            }
            break;
         } catch (IllegalArgumentException var4) {
            throw a(var4);
         }
      }
   }

   public void i(int var1) {
      String[] var10000 = com.CI.c();
      int var3 = this.y() - 1;
      String[] var2 = var10000;
      int var4 = var3;

      while (true) {
         if (var4 > var1) {
            try {
               this.u.removeElementAt(var4);
               var4--;
               if (var2 != null) {
                  break;
               }

               if (var2 == null) {
                  continue;
               }
            } catch (IllegalArgumentException var6) {
               throw a(var6);
            }
         }

         try {
            if (var3 > var1) {
               this.fireIntervalRemoved(this, var1 + 1, var3);
            }
            break;
         } catch (IllegalArgumentException var5) {
            throw a(var5);
         }
      }
   }

   @Override
   public String toString() {
      return this.u.toString();
   }

   public Object[] D() {
      Object[] var1 = new Object[this.u.size()];
      this.u.copyInto(var1);
      return var1;
   }

   public Object A$Object(int var1) {
      return this.u.elementAt(var1);
   }

   public Object A(int var1, Object var2) {
      Object var3 = this.u.elementAt(var1);
      this.u.setElementAt(var2, var1);
      this.fireContentsChanged(this, var1, var1);
      return var3;
   }

   public void O(Object var1) {
      this.y(this.y(), var1);
   }

   public void y(int var1, Object var2) {
      this.u.insertElementAt(var2, var1);
      this.fireIntervalAdded(this, var1, var1);
   }

   public Object v(Object var1) {
      int var2 = this.J(var1);

      try {
         if (var2 != -1) {
            return this.c(var2);
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }

      return null;
   }

   public Object c(int var1) {
      Object var2 = this.u.elementAt(var1);
      this.u.removeElementAt(var1);
      this.fireIntervalRemoved(this, var1, var1);
      return var2;
   }

   public void B() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/CI.c ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/eD_3.u Ljava/util/Vector;
      // 07: invokevirtual java/util/Vector.size ()I
      // 0a: bipush 1
      // 0b: isub
      // 0c: istore 2
      // 0d: astore 1
      // 0e: aload 0
      // 0f: aload 1
      // 10: ifnonnull 2c
      // 13: getfield com/eD_3.u Ljava/util/Vector;
      // 16: invokevirtual java/util/Vector.removeAllElements ()V
      // 19: iload 2
      // 1a: iflt 32
      // 1d: goto 24
      // 20: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23: athrow
      // 24: aload 0
      // 25: goto 2c
      // 28: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b: athrow
      // 2c: aload 0
      // 2d: bipush 0
      // 2e: iload 2
      // 2f: invokevirtual com/eD_3.fireIntervalRemoved (Ljava/lang/Object;II)V
      // 32: return
   }

   public void q(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/CI.c ()[Ljava/lang/String;
      // 03: astore 3
      // 04: iload 1
      // 05: aload 3
      // 06: ifnonnull 24
      // 09: iload 2
      // 0a: if_icmple 23
      // 0d: goto 14
      // 10: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13: athrow
      // 14: new java/lang/IllegalArgumentException
      // 17: dup
      // 18: getstatic com/eD_3.a Ljava/lang/String;
      // 1b: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 1e: athrow
      // 1f: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22: athrow
      // 23: iload 2
      // 24: istore 4
      // 26: iload 4
      // 28: iload 1
      // 29: if_icmplt 47
      // 2c: aload 0
      // 2d: getfield com/eD_3.u Ljava/util/Vector;
      // 30: iload 4
      // 32: invokevirtual java/util/Vector.removeElementAt (I)V
      // 35: iinc 4 -1
      // 38: aload 3
      // 39: ifnonnull 4e
      // 3c: aload 3
      // 3d: ifnull 26
      // 40: goto 47
      // 43: invokestatic com/eD_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46: athrow
      // 47: aload 0
      // 48: aload 0
      // 49: iload 1
      // 4a: iload 2
      // 4b: invokevirtual com/eD_3.fireIntervalRemoved (Ljava/lang/Object;II)V
      // 4e: return
   }

   public void S(Object var1) {
      int var2 = this.J(var1);

      try {
         if (var2 != -1) {
            this.fireContentsChanged(this, var2, var2);
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "KyG} *&Hs\b}\u001c76\riM0UybYda~\r!:".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 116;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 116;
         var10006 = var0;
      } else {
         var6 = 116;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 116;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 89;
               break;
            case 1:
               var23 = 127;
               break;
            case 2:
               var23 = 92;
               break;
            case 3:
               var23 = 100;
               break;
            case 4:
               var23 = 29;
               break;
            case 5:
               var23 = 48;
               break;
            default:
               var23 = 54;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





