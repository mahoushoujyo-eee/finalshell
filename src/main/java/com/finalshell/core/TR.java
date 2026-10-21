package com.finalshell.core;

import java.net.InetAddress;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class TR implements Cloneable {
   public Hashtable d;
   public Vector l;
   public Vector N;
   public boolean O = true;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] e;
   public static long[] f;
   public static Long[] g;

   public TR() {
      this.l = new Vector();
      this.d = new Hashtable();
      this.N = new Vector();
   }

   public synchronized boolean K(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: aload 2
      // 006: ifnull 01f
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: bipush 0
      // 014: ireturn
      // 015: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 1
      // 01a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 01d: astore 1
      // 01e: aload 1
      // 01f: invokevirtual java/lang/String.length ()I
      // 022: aload 2
      // 023: ifnull 040
      // 026: ifne 036
      // 029: goto 030
      // 02c: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f: athrow
      // 030: bipush 0
      // 031: ireturn
      // 032: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: aload 1
      // 037: aload 1
      // 038: invokevirtual java/lang/String.length ()I
      // 03b: bipush 1
      // 03c: isub
      // 03d: invokevirtual java/lang/String.charAt (I)C
      // 040: sipush 26490
      // 043: ldc2_w 4664272378163898213
      // 046: invokestatic com/finalshell/core/TR.a (IJ)I
      // 049: aload 2
      // 04a: ifnull 12a
      // 04d: if_icmpne 115
      // 050: goto 057
      // 053: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 056: athrow
      // 057: aload 1
      // 058: invokestatic com/finalshell/core/TR.X (Ljava/lang/String;)[I
      // 05b: astore 4
      // 05d: lconst_0
      // 05e: dup2
      // 05f: lstore 7
      // 061: lstore 5
      // 063: aload 4
      // 065: ifnonnull 06e
      // 068: bipush 0
      // 069: ireturn
      // 06a: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: bipush 0
      // 06f: istore 9
      // 071: aload 2
      // 072: ifnonnull 0de
      // 075: aload 4
      // 077: iload 9
      // 079: iaload
      // 07a: iflt 0a2
      // 07d: goto 084
      // 080: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: lload 5
      // 086: aload 4
      // 088: iload 9
      // 08a: iaload
      // 08b: i2l
      // 08c: sipush 12504
      // 08f: ldc2_w 4729875909600112836
      // 092: invokestatic com/finalshell/core/TR.a (IJ)I
      // 095: bipush 3
      // 096: iload 9
      // 098: isub
      // 099: imul
      // 09a: lshl
      // 09b: ladd
      // 09c: lstore 5
      // 09e: aload 2
      // 09f: ifnonnull 0d4
      // 0a2: lload 5
      // 0a4: lstore 7
      // 0a6: aload 2
      // 0a7: ifnonnull 0ca
      // 0aa: lload 7
      // 0ac: sipush 24527
      // 0af: ldc2_w 4228090076581626330
      // 0b2: invokestatic com/finalshell/core/TR.b (IJ)J
      // 0b5: sipush 643
      // 0b8: ldc2_w 610822574488568472
      // 0bb: invokestatic com/finalshell/core/TR.a (IJ)I
      // 0be: bipush 3
      // 0bf: iload 9
      // 0c1: iinc 9 1
      // 0c4: isub
      // 0c5: imul
      // 0c6: lshl
      // 0c7: ladd
      // 0c8: lstore 7
      // 0ca: iload 9
      // 0cc: bipush 4
      // 0cd: if_icmplt 0aa
      // 0d0: aload 2
      // 0d1: ifnonnull 0e4
      // 0d4: iinc 9 1
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dd: athrow
      // 0de: iload 9
      // 0e0: bipush 4
      // 0e1: if_icmplt 075
      // 0e4: bipush 4
      // 0e5: anewarray 4
      // 0e8: dup
      // 0e9: bipush 0
      // 0ea: aload 1
      // 0eb: aastore
      // 0ec: dup
      // 0ed: bipush 2
      // 0ee: new java/lang/Long
      // 0f1: dup
      // 0f2: lload 5
      // 0f4: invokespecial java/lang/Long.<init> (J)V
      // 0f7: aastore
      // 0f8: dup
      // 0f9: bipush 3
      // 0fa: new java/lang/Long
      // 0fd: dup
      // 0fe: lload 7
      // 100: invokespecial java/lang/Long.<init> (J)V
      // 103: aastore
      // 104: astore 3
      // 105: aload 0
      // 106: getfield com/finalshell/core/TR.l Ljava/util/Vector;
      // 109: aload 3
      // 10a: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 10d: aload 2
      // 10e: ifnull 0a6
      // 111: aload 2
      // 112: ifnonnull 1c1
      // 115: aload 1
      // 116: bipush 0
      // 117: invokevirtual java/lang/String.charAt (I)C
      // 11a: sipush 22468
      // 11d: ldc2_w 8750353965831591898
      // 120: invokestatic com/finalshell/core/TR.a (IJ)I
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 129: athrow
      // 12a: if_icmpne 14f
      // 12d: aload 0
      // 12e: getfield com/finalshell/core/TR.N Ljava/util/Vector;
      // 131: aload 1
      // 132: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 135: aload 0
      // 136: getfield com/finalshell/core/TR.l Ljava/util/Vector;
      // 139: bipush 4
      // 13a: anewarray 4
      // 13d: dup
      // 13e: bipush 0
      // 13f: aload 1
      // 140: aastore
      // 141: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 144: aload 2
      // 145: ifnonnull 1c1
      // 148: goto 14f
      // 14b: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14e: athrow
      // 14f: new java/util/StringTokenizer
      // 152: dup
      // 153: aload 1
      // 154: sipush 10254
      // 157: sipush 19922
      // 15a: invokestatic com/finalshell/core/TR.a (II)Ljava/lang/String;
      // 15d: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 160: astore 4
      // 162: aload 4
      // 164: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 167: aload 2
      // 168: ifnull 1a2
      // 16b: bipush 1
      // 16c: if_icmple 19a
      // 16f: goto 176
      // 172: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175: athrow
      // 176: bipush 4
      // 177: anewarray 4
      // 17a: dup
      // 17b: bipush 0
      // 17c: aload 1
      // 17d: aastore
      // 17e: astore 3
      // 17f: aload 0
      // 180: aload 3
      // 181: aload 4
      // 183: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 186: aload 4
      // 188: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 18b: invokespecial com/finalshell/core/TR.h ([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
      // 18e: aload 0
      // 18f: getfield com/finalshell/core/TR.l Ljava/util/Vector;
      // 192: aload 3
      // 193: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 196: aload 2
      // 197: ifnonnull 1c1
      // 19a: bipush 4
      // 19b: goto 1a2
      // 19e: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a1: athrow
      // 1a2: anewarray 4
      // 1a5: dup
      // 1a6: bipush 0
      // 1a7: aload 1
      // 1a8: aastore
      // 1a9: astore 3
      // 1aa: aload 0
      // 1ab: getfield com/finalshell/core/TR.l Ljava/util/Vector;
      // 1ae: aload 3
      // 1af: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 1b2: aload 0
      // 1b3: getfield com/finalshell/core/TR.d Ljava/util/Hashtable;
      // 1b6: aload 1
      // 1b7: aload 3
      // 1b8: invokevirtual java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 1bb: pop
      // 1bc: aload 0
      // 1bd: aload 3
      // 1be: invokespecial com/finalshell/core/TR.R ([Ljava/lang/Object;)V
      // 1c1: bipush 1
      // 1c2: ireturn
   }

   public synchronized void Y(InetAddress var1) {
      long var4;
      long var2 = var4 = J(var1);
      this.l.addElement(new Object[]{var1.getHostName(), var1, new Long(var2), new Long(var4)});
   }

   public synchronized void f(InetAddress var1, InetAddress var2) {
      this.l.addElement(new Object[]{var1.getHostAddress() + ":" + var2.getHostAddress(), null, new Long(J(var1)), new Long(J(var2))});
   }

   public synchronized boolean t(String var1) {
      return this.P(var1, true);
   }

   public synchronized boolean P(String param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: getfield com/finalshell/core/TR.l Ljava/util/Vector;
      // 08: invokevirtual java/util/Vector.size ()I
      // 0b: aload 3
      // 0c: ifnull 28
      // 0f: ifne 1f
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: bipush 0
      // 1a: ireturn
      // 1b: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 1
      // 20: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 23: astore 1
      // 24: aload 1
      // 25: invokevirtual java/lang/String.length ()I
      // 28: aload 3
      // 29: ifnull 41
      // 2c: ifne 3c
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: bipush 0
      // 37: ireturn
      // 38: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: aload 0
      // 3d: aload 1
      // 3e: invokespecial com/finalshell/core/TR.h (Ljava/lang/String;)Z
      // 41: aload 3
      // 42: ifnull 65
      // 45: ifeq 55
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: bipush 1
      // 50: ireturn
      // 51: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: aload 0
      // 56: aload 1
      // 57: aload 3
      // 58: ifnull 70
      // 5b: invokespecial com/finalshell/core/TR.a (Ljava/lang/String;)Z
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: ifeq 6e
      // 68: bipush 1
      // 69: ireturn
      // 6a: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: aload 0
      // 6f: aload 1
      // 70: invokevirtual com/finalshell/core/TR.e (Ljava/lang/String;)J
      // 73: lstore 4
      // 75: lload 4
      // 77: lconst_0
      // 78: lcmp
      // 79: aload 3
      // 7a: ifnull 93
      // 7d: iflt 92
      // 80: goto 87
      // 83: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86: athrow
      // 87: aload 0
      // 88: lload 4
      // 8a: invokespecial com/finalshell/core/TR.u (J)Z
      // 8d: ireturn
      // 8e: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91: athrow
      // 92: iload 2
      // 93: aload 3
      // 94: ifnull a2
      // 97: ifne a3
      // 9a: goto a1
      // 9d: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a0: athrow
      // a1: bipush 0
      // a2: ireturn
      // a3: aload 1
      // a4: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // a7: astore 6
      // a9: aload 0
      // aa: aload 6
      // ac: invokevirtual com/finalshell/core/TR.a (Ljava/net/InetAddress;)Z
      // af: ireturn
      // b0: astore 6
      // b2: bipush 0
      // b3: ireturn
   }

   public synchronized boolean a(InetAddress param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual java/net/InetAddress.getHostName ()Ljava/lang/String;
      // 09: invokespecial com/finalshell/core/TR.a (Ljava/lang/String;)Z
      // 0c: aload 2
      // 0d: ifnull 28
      // 10: ifeq 20
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: bipush 1
      // 1b: ireturn
      // 1c: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: invokevirtual java/net/InetAddress.getHostName ()Ljava/lang/String;
      // 25: invokespecial com/finalshell/core/TR.h (Ljava/lang/String;)Z
      // 28: aload 2
      // 29: ifnull 44
      // 2c: ifeq 3c
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: bipush 1
      // 37: ireturn
      // 38: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: aload 0
      // 3d: aload 1
      // 3e: invokestatic com/finalshell/core/TR.J (Ljava/net/InetAddress;)J
      // 41: invokespecial com/finalshell/core/TR.u (J)Z
      // 44: ireturn
   }

   public synchronized String[] D() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/TR.l Ljava/util/Vector;
      // 07: invokevirtual java/util/Vector.size ()I
      // 0a: istore 2
      // 0b: astore 1
      // 0c: iload 2
      // 0d: anewarray 57
      // 10: astore 4
      // 12: bipush 0
      // 13: istore 5
      // 15: aload 1
      // 16: ifnonnull 3b
      // 19: aload 0
      // 1a: getfield com/finalshell/core/TR.l Ljava/util/Vector;
      // 1d: iload 5
      // 1f: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 22: checkcast [Ljava/lang/Object;
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: astore 3
      // 2d: aload 4
      // 2f: iload 5
      // 31: aload 3
      // 32: bipush 0
      // 33: aaload
      // 34: checkcast java/lang/String
      // 37: aastore
      // 38: iinc 5 1
      // 3b: iload 5
      // 3d: iload 2
      // 3e: if_icmplt 19
      // 41: aload 4
      // 43: aload 1
      // 44: ifnull 2c
      // 47: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public synchronized boolean R(String var1) {
      String[] var10000 = Jk2.Y();
      Enumeration var3 = this.l.elements();
      String[] var2 = var10000;
      boolean var6;
      if (var2 != null && !var3.hasMoreElements()) {
         var6 = false;
      } else {
         while (true) {
            Object[] var4 = (Object[])var3.nextElement();
            if (var1.equals(var4[0])) {
               try {
                  this.l.removeElement(var4);
                  this.N.removeElement(var1);
                  this.d.remove(var1);
                  var6 = true;
                  if (var2 != null) {
                     return true;
                  }
                  break;
               } catch (NumberFormatException var5) {
                  throw a(var5);
               }
            }

            if (!var3.hasMoreElements()) {
               var6 = false;
               break;
            }
         }
      }

      return var6;
   }

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/TR.D ()[Ljava/lang/String;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: aload 1
      // 0b: ifnull 21
      // 0e: arraylength
      // 0f: ifne 20
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: ldc ""
      // 1b: areturn
      // 1c: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 2
      // 21: bipush 0
      // 22: aaload
      // 23: astore 3
      // 24: bipush 1
      // 25: istore 4
      // 27: aload 1
      // 28: ifnonnull 57
      // 2b: new java/lang/StringBuilder
      // 2e: dup
      // 2f: aload 3
      // 30: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 33: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 36: sipush 10255
      // 39: sipush -22546
      // 3c: invokestatic com/finalshell/core/TR.a (II)Ljava/lang/String;
      // 3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42: aload 2
      // 43: iload 4
      // 45: aaload
      // 46: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: astore 3
      // 54: iinc 4 1
      // 57: iload 4
      // 59: aload 2
      // 5a: arraylength
      // 5b: if_icmplt 2b
      // 5e: aload 3
      // 5f: aload 1
      // 60: ifnull 53
      // 63: areturn
   }

   @Override
   public Object clone() {
      TR var1 = new TR();
      var1.l = (Vector)this.l.clone();
      var1.N = (Vector)this.N.clone();
      var1.d = (Hashtable)this.d.clone();
      return var1;
   }

   public synchronized boolean u(long param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/TR.l Ljava/util/Vector;
      // 07: invokevirtual java/util/Vector.elements ()Ljava/util/Enumeration;
      // 0a: astore 4
      // 0c: astore 3
      // 0d: aload 3
      // 0e: ifnonnull a3
      // 11: aload 4
      // 13: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 18: checkcast [Ljava/lang/Object;
      // 1b: astore 5
      // 1d: aload 5
      // 1f: bipush 2
      // 20: aaload
      // 21: aload 3
      // 22: ifnull 34
      // 25: ifnonnull 30
      // 28: aconst_null
      // 29: goto 37
      // 2c: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: aload 5
      // 32: bipush 2
      // 33: aaload
      // 34: checkcast java/lang/Long
      // 37: astore 6
      // 39: aload 5
      // 3b: bipush 3
      // 3c: aaload
      // 3d: aload 3
      // 3e: ifnull 57
      // 41: ifnonnull 53
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: aconst_null
      // 4c: goto 5a
      // 4f: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: aload 5
      // 55: bipush 3
      // 56: aaload
      // 57: checkcast java/lang/Long
      // 5a: astore 7
      // 5c: aload 6
      // 5e: aload 3
      // 5f: ifnull 6e
      // 62: ifnull a3
      // 65: goto 6c
      // 68: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: aload 6
      // 6e: invokevirtual java/lang/Long.longValue ()J
      // 71: lload 1
      // 72: lcmp
      // 73: aload 3
      // 74: ifnull aa
      // 77: ifgt a3
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: aload 7
      // 83: invokevirtual java/lang/Long.longValue ()J
      // 86: lload 1
      // 87: lcmp
      // 88: iflt a3
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91: athrow
      // 92: bipush 1
      // 93: aload 3
      // 94: ifnull ae
      // 97: goto 9e
      // 9a: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d: athrow
      // 9e: ireturn
      // 9f: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a2: athrow
      // a3: aload 4
      // a5: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // aa: ifne 11
      // ad: bipush 0
      // ae: ireturn
   }

   public boolean h(String var1) {
      return this.d.containsKey(var1);
   }

   public boolean a(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/TR.N Ljava/util/Vector;
      // 07: invokevirtual java/util/Vector.elements ()Ljava/util/Enumeration;
      // 0a: astore 3
      // 0b: astore 2
      // 0c: aload 2
      // 0d: ifnonnull 31
      // 10: aload 1
      // 11: aload 3
      // 12: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 17: checkcast java/lang/String
      // 1a: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 1d: ifeq 31
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: bipush 1
      // 28: aload 2
      // 29: ifnull 3b
      // 2c: ireturn
      // 2d: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: aload 3
      // 32: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 37: ifne 10
      // 3a: bipush 0
      // 3b: ireturn
   }

   public void R(Object[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: aload 0
      // 04: aload 1
      // 05: bipush 0
      // 06: aaload
      // 07: checkcast java/lang/String
      // 0a: invokevirtual com/finalshell/core/TR.e (Ljava/lang/String;)J
      // 0d: lstore 3
      // 0e: astore 2
      // 0f: aload 2
      // 10: ifnull 36
      // 13: lload 3
      // 14: lconst_0
      // 15: lcmp
      // 16: iflt 3a
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 1
      // 21: bipush 2
      // 22: aload 1
      // 23: bipush 3
      // 24: new java/lang/Long
      // 27: dup
      // 28: lload 3
      // 29: invokespecial java/lang/Long.<init> (J)V
      // 2c: dup_x2
      // 2d: aastore
      // 2e: aastore
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 2
      // 37: ifnonnull 4d
      // 3a: new com/finalshell/task/Kn4
      // 3d: dup
      // 3e: aload 1
      // 3f: invokespecial com/finalshell/task/Kn4.<init> ([Ljava/lang/Object;)V
      // 42: astore 5
      // 44: aload 5
      // 46: aload 0
      // 47: getfield com/finalshell/core/TR.O Z
      // 4a: invokevirtual com/finalshell/task/Kn4.Q (Z)V
      // 4d: return
   }

   public void h(Object[] param1, String param2, String param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: astore 4
      // 05: aload 0
      // 06: aload 2
      // 07: invokevirtual com/finalshell/core/TR.e (Ljava/lang/String;)J
      // 0a: dup2
      // 0b: lstore 5
      // 0d: lconst_0
      // 0e: aload 4
      // 10: ifnull 2b
      // 13: lcmp
      // 14: iflt 56
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 3
      // 20: invokevirtual com/finalshell/core/TR.e (Ljava/lang/String;)J
      // 23: dup2
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: lstore 7
      // 2d: lconst_0
      // 2e: lcmp
      // 2f: iflt 56
      // 32: aload 1
      // 33: bipush 2
      // 34: new java/lang/Long
      // 37: dup
      // 38: lload 5
      // 3a: invokespecial java/lang/Long.<init> (J)V
      // 3d: aastore
      // 3e: aload 1
      // 3f: bipush 3
      // 40: new java/lang/Long
      // 43: dup
      // 44: lload 7
      // 46: invokespecial java/lang/Long.<init> (J)V
      // 49: aastore
      // 4a: aload 4
      // 4c: ifnonnull 6b
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: new com/finalshell/task/Kn4
      // 59: dup
      // 5a: aload 1
      // 5b: aload 2
      // 5c: aload 3
      // 5d: invokespecial com/finalshell/task/Kn4.<init> ([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
      // 60: astore 9
      // 62: aload 9
      // 64: aload 0
      // 65: getfield com/finalshell/core/TR.O Z
      // 68: invokevirtual com/finalshell/task/Kn4.Q (Z)V
      // 6b: return
   }

   public static long J(InetAddress param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: lconst_0
      // 04: lstore 2
      // 05: aload 0
      // 06: invokevirtual java/net/InetAddress.getAddress ()[B
      // 09: astore 4
      // 0b: astore 1
      // 0c: aload 4
      // 0e: arraylength
      // 0f: aload 1
      // 10: ifnull 26
      // 13: bipush 4
      // 14: if_icmpne 5f
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: istore 5
      // 28: aload 1
      // 29: ifnonnull 51
      // 2c: lload 2
      // 2d: aload 4
      // 2f: iload 5
      // 31: baload
      // 32: i2l
      // 33: sipush 5420
      // 36: ldc2_w 6219678247215254331
      // 39: invokestatic com/finalshell/core/TR.b (IJ)J
      // 3c: land
      // 3d: sipush 643
      // 40: ldc2_w 610822574488568472
      // 43: invokestatic com/finalshell/core/TR.a (IJ)I
      // 46: bipush 3
      // 47: iload 5
      // 49: isub
      // 4a: imul
      // 4b: lshl
      // 4c: ladd
      // 4d: lstore 2
      // 4e: iinc 5 1
      // 51: iload 5
      // 53: bipush 4
      // 54: if_icmplt 2c
      // 57: aload 1
      // 58: ifnull 4e
      // 5b: aload 1
      // 5c: ifnonnull 65
      // 5f: lconst_0
      // 60: lreturn
      // 61: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: lload 2
      // 66: lreturn
   }

   public long e(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: lconst_0
      // 04: lstore 3
      // 05: astore 2
      // 06: aload 1
      // 07: aload 2
      // 08: ifnull 2b
      // 0b: bipush 0
      // 0c: invokevirtual java/lang/String.charAt (I)C
      // 0f: invokestatic java/lang/Character.isDigit (C)Z
      // 12: ifne 2a
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: sipush 27952
      // 1f: ldc2_w 1754076243955921700
      // 22: invokestatic com/finalshell/core/TR.b (IJ)J
      // 25: lreturn
      // 26: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 1
      // 2b: invokestatic com/finalshell/core/TR.X (Ljava/lang/String;)[I
      // 2e: astore 5
      // 30: aload 5
      // 32: ifnonnull 43
      // 35: sipush 28344
      // 38: ldc2_w 1256994436608700590
      // 3b: invokestatic com/finalshell/core/TR.b (IJ)J
      // 3e: lreturn
      // 3f: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: bipush 0
      // 44: istore 6
      // 46: aload 2
      // 47: ifnonnull 83
      // 4a: lload 3
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51: athrow
      // 52: aload 5
      // 54: iload 6
      // 56: iaload
      // 57: aload 2
      // 58: ifnull 6a
      // 5b: iflt 6d
      // 5e: aload 5
      // 60: iload 6
      // 62: iaload
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: goto 6e
      // 6d: bipush 0
      // 6e: i2l
      // 6f: sipush 643
      // 72: ldc2_w 610822574488568472
      // 75: invokestatic com/finalshell/core/TR.a (IJ)I
      // 78: bipush 3
      // 79: iload 6
      // 7b: isub
      // 7c: imul
      // 7d: lshl
      // 7e: ladd
      // 7f: lstore 3
      // 80: iinc 6 1
      // 83: iload 6
      // 85: aload 5
      // 87: arraylength
      // 88: if_icmplt 4a
      // 8b: lload 3
      // 8c: aload 2
      // 8d: ifnull 52
      // 90: lreturn
   }

   public static int[] X(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 4
      // 01: newarray 10
      // 03: dup
      // 04: bipush 0
      // 05: bipush -1
      // 06: iastore
      // 07: dup
      // 08: bipush 1
      // 09: bipush -1
      // 0a: iastore
      // 0b: dup
      // 0c: bipush 2
      // 0d: bipush -1
      // 0e: iastore
      // 0f: dup
      // 10: bipush 3
      // 11: bipush -1
      // 12: iastore
      // 13: astore 2
      // 14: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 17: bipush 0
      // 18: istore 3
      // 19: new java/util/StringTokenizer
      // 1c: dup
      // 1d: aload 0
      // 1e: ldc_w "."
      // 21: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 24: astore 4
      // 26: astore 1
      // 27: aload 4
      // 29: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 2c: aload 1
      // 2d: ifnull 65
      // 30: bipush 4
      // 31: if_icmple 60
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: aconst_null
      // 3c: areturn
      // 3d: invokestatic com/finalshell/core/TR.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 2
      // 42: iload 3
      // 43: iinc 3 1
      // 46: aload 4
      // 48: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 4b: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 4e: sipush 20226
      // 51: ldc2_w 7033398132176817951
      // 54: invokestatic com/finalshell/core/TR.a (IJ)I
      // 57: iand
      // 58: iastore
      // 59: goto 60
      // 5c: astore 5
      // 5e: aconst_null
      // 5f: areturn
      // 60: aload 4
      // 62: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 65: ifne 41
      // 68: aload 2
      // 69: aload 1
      // 6a: ifnull 42
      // 6d: areturn
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 10255) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 124;
               break;
            case 1:
               var10000 = 195;
               break;
            case 2:
               var10000 = 223;
               break;
            case 3:
               var10000 = 88;
               break;
            case 4:
               var10000 = 222;
               break;
            case 5:
               var10000 = 26;
               break;
            case 6:
               var10000 = 100;
               break;
            case 7:
               var10000 = 5;
               break;
            case 8:
               var10000 = 134;
               break;
            case 9:
               var10000 = 148;
               break;
            case 10:
               var10000 = 95;
               break;
            case 11:
               var10000 = 185;
               break;
            case 12:
               var10000 = 61;
               break;
            case 13:
               var10000 = 49;
               break;
            case 14:
               var10000 = 45;
               break;
            case 15:
               var10000 = 108;
               break;
            case 16:
               var10000 = 152;
               break;
            case 17:
               var10000 = 96;
               break;
            case 18:
               var10000 = 128;
               break;
            case 19:
               var10000 = 150;
               break;
            case 20:
               var10000 = 169;
               break;
            case 21:
               var10000 = 126;
               break;
            case 22:
               var10000 = 105;
               break;
            case 23:
               var10000 = 54;
               break;
            case 24:
               var10000 = 179;
               break;
            case 25:
               var10000 = 84;
               break;
            case 26:
               var10000 = 122;
               break;
            case 27:
               var10000 = 216;
               break;
            case 28:
               var10000 = 50;
               break;
            case 29:
               var10000 = 6;
               break;
            case 30:
               var10000 = 63;
               break;
            case 31:
               var10000 = 71;
               break;
            case 32:
               var10000 = 97;
               break;
            case 33:
               var10000 = 130;
               break;
            case 34:
               var10000 = 164;
               break;
            case 35:
               var10000 = 99;
               break;
            case 36:
               var10000 = 110;
               break;
            case 37:
               var10000 = 106;
               break;
            case 38:
               var10000 = 234;
               break;
            case 39:
               var10000 = 21;
               break;
            case 40:
               var10000 = 180;
               break;
            case 41:
               var10000 = 59;
               break;
            case 42:
               var10000 = 212;
               break;
            case 43:
               var10000 = 147;
               break;
            case 44:
               var10000 = 36;
               break;
            case 45:
               var10000 = 162;
               break;
            case 46:
               var10000 = 46;
               break;
            case 47:
               var10000 = 28;
               break;
            case 48:
               var10000 = 66;
               break;
            case 49:
               var10000 = 20;
               break;
            case 50:
               var10000 = 37;
               break;
            case 51:
               var10000 = 237;
               break;
            case 52:
               var10000 = 111;
               break;
            case 53:
               var10000 = 74;
               break;
            case 54:
               var10000 = 29;
               break;
            case 55:
               var10000 = 27;
               break;
            case 56:
               var10000 = 125;
               break;
            case 57:
               var10000 = 197;
               break;
            case 58:
               var10000 = 1;
               break;
            case 59:
               var10000 = 117;
               break;
            case 60:
               var10000 = 231;
               break;
            case 61:
               var10000 = 3;
               break;
            case 62:
               var10000 = 2;
               break;
            case 63:
               var10000 = 118;
               break;
            case 64:
               var10000 = 156;
               break;
            case 65:
               var10000 = 161;
               break;
            case 66:
               var10000 = 228;
               break;
            case 67:
               var10000 = 62;
               break;
            case 68:
               var10000 = 137;
               break;
            case 69:
               var10000 = 51;
               break;
            case 70:
               var10000 = 184;
               break;
            case 71:
               var10000 = 48;
               break;
            case 72:
               var10000 = 86;
               break;
            case 73:
               var10000 = 75;
               break;
            case 74:
               var10000 = 0;
               break;
            case 75:
               var10000 = 151;
               break;
            case 76:
               var10000 = 17;
               break;
            case 77:
               var10000 = 135;
               break;
            case 78:
               var10000 = 227;
               break;
            case 79:
               var10000 = 211;
               break;
            case 80:
               var10000 = 4;
               break;
            case 81:
               var10000 = 77;
               break;
            case 82:
               var10000 = 146;
               break;
            case 83:
               var10000 = 176;
               break;
            case 84:
               var10000 = 136;
               break;
            case 85:
               var10000 = 220;
               break;
            case 86:
               var10000 = 76;
               break;
            case 87:
               var10000 = 34;
               break;
            case 88:
               var10000 = 87;
               break;
            case 89:
               var10000 = 68;
               break;
            case 90:
               var10000 = 249;
               break;
            case 91:
               var10000 = 201;
               break;
            case 92:
               var10000 = 138;
               break;
            case 93:
               var10000 = 158;
               break;
            case 94:
               var10000 = 208;
               break;
            case 95:
               var10000 = 202;
               break;
            case 96:
               var10000 = 91;
               break;
            case 97:
               var10000 = 7;
               break;
            case 98:
               var10000 = 67;
               break;
            case 99:
               var10000 = 52;
               break;
            case 100:
               var10000 = 174;
               break;
            case 101:
               var10000 = 240;
               break;
            case 102:
               var10000 = 44;
               break;
            case 103:
               var10000 = 112;
               break;
            case 104:
               var10000 = 78;
               break;
            case 105:
               var10000 = 121;
               break;
            case 106:
               var10000 = 13;
               break;
            case 107:
               var10000 = 254;
               break;
            case 108:
               var10000 = 178;
               break;
            case 109:
               var10000 = 253;
               break;
            case 110:
               var10000 = 242;
               break;
            case 111:
               var10000 = 22;
               break;
            case 112:
               var10000 = 92;
               break;
            case 113:
               var10000 = 236;
               break;
            case 114:
               var10000 = 114;
               break;
            case 115:
               var10000 = 127;
               break;
            case 116:
               var10000 = 38;
               break;
            case 117:
               var10000 = 60;
               break;
            case 118:
               var10000 = 218;
               break;
            case 119:
               var10000 = 165;
               break;
            case 120:
               var10000 = 250;
               break;
            case 121:
               var10000 = 139;
               break;
            case 122:
               var10000 = 238;
               break;
            case 123:
               var10000 = 33;
               break;
            case 124:
               var10000 = 175;
               break;
            case 125:
               var10000 = 81;
               break;
            case 126:
               var10000 = 14;
               break;
            case 127:
               var10000 = 113;
               break;
            case 128:
               var10000 = 98;
               break;
            case 129:
               var10000 = 188;
               break;
            case 130:
               var10000 = 204;
               break;
            case 131:
               var10000 = 182;
               break;
            case 132:
               var10000 = 30;
               break;
            case 133:
               var10000 = 219;
               break;
            case 134:
               var10000 = 193;
               break;
            case 135:
               var10000 = 31;
               break;
            case 136:
               var10000 = 16;
               break;
            case 137:
               var10000 = 206;
               break;
            case 138:
               var10000 = 103;
               break;
            case 139:
               var10000 = 173;
               break;
            case 140:
               var10000 = 70;
               break;
            case 141:
               var10000 = 232;
               break;
            case 142:
               var10000 = 224;
               break;
            case 143:
               var10000 = 94;
               break;
            case 144:
               var10000 = 41;
               break;
            case 145:
               var10000 = 40;
               break;
            case 146:
               var10000 = 101;
               break;
            case 147:
               var10000 = 102;
               break;
            case 148:
               var10000 = 239;
               break;
            case 149:
               var10000 = 205;
               break;
            case 150:
               var10000 = 35;
               break;
            case 151:
               var10000 = 248;
               break;
            case 152:
               var10000 = 119;
               break;
            case 153:
               var10000 = 217;
               break;
            case 154:
               var10000 = 221;
               break;
            case 155:
               var10000 = 190;
               break;
            case 156:
               var10000 = 131;
               break;
            case 157:
               var10000 = 207;
               break;
            case 158:
               var10000 = 23;
               break;
            case 159:
               var10000 = 160;
               break;
            case 160:
               var10000 = 80;
               break;
            case 161:
               var10000 = 109;
               break;
            case 162:
               var10000 = 213;
               break;
            case 163:
               var10000 = 187;
               break;
            case 164:
               var10000 = 115;
               break;
            case 165:
               var10000 = 116;
               break;
            case 166:
               var10000 = 72;
               break;
            case 167:
               var10000 = 199;
               break;
            case 168:
               var10000 = 90;
               break;
            case 169:
               var10000 = 183;
               break;
            case 170:
               var10000 = 53;
               break;
            case 171:
               var10000 = 15;
               break;
            case 172:
               var10000 = 196;
               break;
            case 173:
               var10000 = 89;
               break;
            case 174:
               var10000 = 24;
               break;
            case 175:
               var10000 = 154;
               break;
            case 176:
               var10000 = 149;
               break;
            case 177:
               var10000 = 42;
               break;
            case 178:
               var10000 = 209;
               break;
            case 179:
               var10000 = 157;
               break;
            case 180:
               var10000 = 56;
               break;
            case 181:
               var10000 = 12;
               break;
            case 182:
               var10000 = 73;
               break;
            case 183:
               var10000 = 203;
               break;
            case 184:
               var10000 = 163;
               break;
            case 185:
               var10000 = 230;
               break;
            case 186:
               var10000 = 142;
               break;
            case 187:
               var10000 = 85;
               break;
            case 188:
               var10000 = 133;
               break;
            case 189:
               var10000 = 215;
               break;
            case 190:
               var10000 = 198;
               break;
            case 191:
               var10000 = 255;
               break;
            case 192:
               var10000 = 153;
               break;
            case 193:
               var10000 = 241;
               break;
            case 194:
               var10000 = 192;
               break;
            case 195:
               var10000 = 82;
               break;
            case 196:
               var10000 = 225;
               break;
            case 197:
               var10000 = 55;
               break;
            case 198:
               var10000 = 214;
               break;
            case 199:
               var10000 = 172;
               break;
            case 200:
               var10000 = 140;
               break;
            case 201:
               var10000 = 145;
               break;
            case 202:
               var10000 = 233;
               break;
            case 203:
               var10000 = 18;
               break;
            case 204:
               var10000 = 229;
               break;
            case 205:
               var10000 = 170;
               break;
            case 206:
               var10000 = 247;
               break;
            case 207:
               var10000 = 200;
               break;
            case 208:
               var10000 = 251;
               break;
            case 209:
               var10000 = 141;
               break;
            case 210:
               var10000 = 120;
               break;
            case 211:
               var10000 = 168;
               break;
            case 212:
               var10000 = 79;
               break;
            case 213:
               var10000 = 32;
               break;
            case 214:
               var10000 = 19;
               break;
            case 215:
               var10000 = 129;
               break;
            case 216:
               var10000 = 9;
               break;
            case 217:
               var10000 = 246;
               break;
            case 218:
               var10000 = 189;
               break;
            case 219:
               var10000 = 155;
               break;
            case 220:
               var10000 = 167;
               break;
            case 221:
               var10000 = 58;
               break;
            case 222:
               var10000 = 245;
               break;
            case 223:
               var10000 = 143;
               break;
            case 224:
               var10000 = 57;
               break;
            case 225:
               var10000 = 25;
               break;
            case 226:
               var10000 = 65;
               break;
            case 227:
               var10000 = 210;
               break;
            case 228:
               var10000 = 43;
               break;
            case 229:
               var10000 = 181;
               break;
            case 230:
               var10000 = 83;
               break;
            case 231:
               var10000 = 69;
               break;
            case 232:
               var10000 = 243;
               break;
            case 233:
               var10000 = 177;
               break;
            case 234:
               var10000 = 11;
               break;
            case 235:
               var10000 = 8;
               break;
            case 236:
               var10000 = 235;
               break;
            case 237:
               var10000 = 166;
               break;
            case 238:
               var10000 = 104;
               break;
            case 239:
               var10000 = 39;
               break;
            case 240:
               var10000 = 159;
               break;
            case 241:
               var10000 = 194;
               break;
            case 242:
               var10000 = 252;
               break;
            case 243:
               var10000 = 191;
               break;
            case 244:
               var10000 = 226;
               break;
            case 245:
               var10000 = 47;
               break;
            case 246:
               var10000 = 93;
               break;
            case 247:
               var10000 = 64;
               break;
            case 248:
               var10000 = 132;
               break;
            case 249:
               var10000 = 244;
               break;
            case 250:
               var10000 = 123;
               break;
            case 251:
               var10000 = 107;
               break;
            case 252:
               var10000 = 144;
               break;
            case 253:
               var10000 = 171;
               break;
            case 254:
               var10000 = 10;
               break;
            default:
               var10000 = 186;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16415;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 24087) & 32767;
      if (g[var3] == null) {
         g[var3] = f[var3] ^ var1;
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[2];
      int var19 = 0;
      String var18 = "MÕ\u0006°`w\u0082\u0092i";
      int var20 = "MÕ\u0006°`w\u0082\u0092i".length();
      char var17 = 2;
      int var16 = -1;

      while (true) {
         char[] var10002;
         label74: {
            char[] var10003 = var18.substring(++var16, var16 + var17).toCharArray();
            int var10004 = var10003.length;
            int var22 = 0;
            byte var42 = 34;
            var10002 = var10003;
            int var27 = var10004;
            byte var49;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var49 = 34;
               var10006 = var22;
            } else {
               var42 = 34;
               var27 = var10004;
               if (var10004 <= var22) {
                  break label74;
               }

               var10005 = var10003;
               var49 = 34;
               var10006 = var22;
            }

            while (true) {
               char var65 = var10005[var10006];
               byte var66;
               switch (var22 % 7) {
                  case 0:
                     var66 = 83;
                     break;
                  case 1:
                     var66 = 23;
                     break;
                  case 2:
                     var66 = 68;
                     break;
                  case 3:
                     var66 = 40;
                     break;
                  case 4:
                     var66 = 50;
                     break;
                  case 5:
                     var66 = 43;
                     break;
                  default:
                     var66 = 46;
               }

               var10005[var10006] = (char)(var65 ^ var49 ^ var66);
               var22++;
               if (var42 == 0) {
                  var10006 = var42;
                  var10005 = var10002;
                  var49 = var42;
               } else {
                  if (var27 <= var22) {
                     break;
                  }

                  var10005 = var10002;
                  var49 = var42;
                  var10006 = var22;
               }
            }
         }

         String var44 = new String(var10002).intern();
         int var29 = -1;
         var21[var19++] = var44;
         if ((var16 += var17) >= var20) {
            a = var21;
            b = new String[2];
            long var8 = 7496333484551392058L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12 = "*\u008e\u008bU¼\u00adlqã7\u00187PßÜÎ\u0098ñJ·pÆÄÚ";
            int var13 = "*\u008e\u008bU¼\u00adlqã7\u00187PßÜÎ\u0098ñJ·pÆÄÚ".length();
            byte var10 = 0;

            label58:
            while (true) {
               var29 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var29, var10).getBytes("ISO-8859-1");
               long[] var10000 = var14;
               var29 = var11++;
               long var38 = ((long)var15[0] & 255L) << 56
                  | ((long)var15[1] & 255L) << 48
                  | ((long)var15[2] & 255L) << 40
                  | ((long)var15[3] & 255L) << 32
                  | ((long)var15[4] & 255L) << 24
                  | ((long)var15[5] & 255L) << 16
                  | ((long)var15[6] & 255L) << 8
                  | (long)var15[7] & 255L;
               byte var45 = -1;

               while (true) {
                  long var54 = var38 ^ var8;
                  switch (var45) {
                     case 0:
                        var10000[var29] = var54;
                        if (var10 >= var13) {
                           c = var14;
                           e = new Integer[5];
                           long var0 = 25985116824437617L;
                           long[] var6 = new long[4];
                           int var3 = 0;
                           String var4 = "V\fí:ç¹ÈµîÒ\u0013k8\u008fL ";
                           int var5 = "V\fí:ç¹ÈµîÒ\u0013k8\u008fL ".length();
                           byte var2 = 0;

                           label48:
                           while (true) {
                              int var33 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                              var10000 = var6;
                              var33 = var3++;
                              long var40 = ((long)var7[0] & 255L) << 56
                                 | ((long)var7[1] & 255L) << 48
                                 | ((long)var7[2] & 255L) << 40
                                 | ((long)var7[3] & 255L) << 32
                                 | ((long)var7[4] & 255L) << 24
                                 | ((long)var7[5] & 255L) << 16
                                 | ((long)var7[6] & 255L) << 8
                                 | (long)var7[7] & 255L;
                              byte var47 = -1;

                              while (true) {
                                 var54 = var40 ^ var0;
                                 switch (var47) {
                                    case 0:
                                       var10000[var33] = var54;
                                       if (var2 >= var5) {
                                          f = var6;
                                          g = new Long[4];
                                          return;
                                       }
                                       break;
                                    default:
                                       var10000[var33] = var54;
                                       if (var2 < var5) {
                                          continue label48;
                                       }

                                       var4 = ":ñ`Ö\u008cÄ\u0002Tçô\u0015 cÊÏª";
                                       var5 = ":ñ`Ö\u008cÄ\u0002Tçô\u0015 cÊÏª".length();
                                       var2 = 0;
                                 }

                                 byte var35 = var2;
                                 var2 += 8;
                                 var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                                 var10000 = var6;
                                 var33 = var3++;
                                 var40 = ((long)var7[0] & 255L) << 56
                                    | ((long)var7[1] & 255L) << 48
                                    | ((long)var7[2] & 255L) << 40
                                    | ((long)var7[3] & 255L) << 32
                                    | ((long)var7[4] & 255L) << 24
                                    | ((long)var7[5] & 255L) << 16
                                    | ((long)var7[6] & 255L) << 8
                                    | (long)var7[7] & 255L;
                                 var47 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var10000[var29] = var54;
                        if (var10 < var13) {
                           continue label58;
                        }

                        var12 = "\u000bÛ×À/é;öR\u0002Úom£\tª";
                        var13 = "\u000bÛ×À/é;öR\u0002Úom£\tª".length();
                        var10 = 0;
                  }

                  byte var32 = var10;
                  var10 += 8;
                  var15 = var12.substring(var32, var10).getBytes("ISO-8859-1");
                  var10000 = var14;
                  var29 = var11++;
                  var38 = ((long)var15[0] & 255L) << 56
                     | ((long)var15[1] & 255L) << 48
                     | ((long)var15[2] & 255L) << 40
                     | ((long)var15[3] & 255L) << 32
                     | ((long)var15[4] & 255L) << 24
                     | ((long)var15[5] & 255L) << 16
                     | ((long)var15[6] & 255L) << 8
                     | (long)var15[7] & 255L;
                  var45 = 0;
               }
            }
         }

         var17 = var18.charAt(var16);
      }
   }
}





