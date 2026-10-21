package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class U5 {
   public String S;
   public String r;
   public String G;
   public int U;
   public String T;
   public int N;
   public boolean E;
   public long m;
   public long z;
   public long i;
   public boolean K;
   public String b;

   public U5() {
      Registry.lookupField(232769090608234294L).setBoolean(this, true);
      Registry.lookupField(122260549014038868L).setBoolean(this, true);
   }

   public String J() {
      Object var1 = 283311159112623232L;
      return (String)Ref.g(283311159112623232L, var1);
   }

   public void D(String var1) {
      long var3 = 283311159112623232L;
      Ref.s(283311159112623232L, var1, var3);
   }

   public String v() {
      Object var1 = 251738432986306305L;
      return (String)Ref.g(251738432986306305L, var1);
   }

   public void z(String var1) {
      long var3 = 251738432986306305L;
      Ref.s(251738432986306305L, var1, var3);
   }

   public String W$String() {
      Object var1 = 225949772870791807L;
      return (String)Ref.g(225949772870791807L, var1);
   }

   public void o(String var1) {
      long var3 = 225949772870791807L;
      Ref.s(225949772870791807L, var1, var3);
   }

   public int V() {
      return Registry.lookupField(455786782259304528L).getInt(this);
   }

   public void Z(int var1) {
      Registry.lookupField(455786782259304528L).setInt(this, var1);
   }

   public String N() {
      Object var1 = 575146494959108595L;
      return (String)Ref.g(575146494959108595L, var1);
   }

   public void Y(String var1) {
      long var3 = 575146494959108595L;
      Ref.s(575146494959108595L, var1, var3);
   }

   public int W$int() {
      return Registry.lookupField(295537603742973144L).getInt(this);
   }

   public void j(int var1) {
      Registry.lookupField(295537603742973144L).setInt(this, var1);
   }

   public boolean y$boolean() {
      return Registry.lookupField(232769090608234294L).getBoolean(this);
   }

   public void l(boolean var1) {
      Registry.lookupField(232769090608234294L).setBoolean(this, var1);
   }

   public String z() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ln4_2.R ()Z
      // 03: ldc ""
      // 05: astore 2
      // 06: istore 1
      // 07: aload 0
      // 08: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0b: ldc2_w 568690108981290565
      // 0e: astore 5
      // 10: astore 4
      // 12: ldc2_w 568690108981290565
      // 15: aload 4
      // 17: aload 5
      // 19: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c: checkcast java/lang/String
      // 1f: goto 26
      // 22: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 25: athrow
      // 26: iload 1
      // 27: ifne b0
      // 2a: ifnull af
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/U5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 0
      // 35: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 38: ldc2_w 568690108981290565
      // 3b: astore 7
      // 3d: astore 6
      // 3f: ldc2_w 568690108981290565
      // 42: aload 6
      // 44: aload 7
      // 46: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 49: checkcast java/lang/String
      // 4c: goto 53
      // 4f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 52: athrow
      // 53: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 56: iload 1
      // 57: ifne b0
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/U5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: ldc ""
      // 63: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 66: ifne af
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/U5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: aload 0
      // 71: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 74: ldc2_w 568690108981290565
      // 77: astore 9
      // 79: astore 8
      // 7b: ldc2_w 568690108981290565
      // 7e: aload 8
      // 80: aload 9
      // 82: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 85: goto 8c
      // 88: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 8f: ldc2_w 556691693894836467
      // 92: astore 10
      // 94: ldc2_w 556691693894836467
      // 97: aload 10
      // 99: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 9c: checkcast java/lang/String
      // 9f: goto a6
      // a2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a5: athrow
      // a6: astore 2
      // a7: goto af
      // aa: astore 3
      // ab: aload 3
      // ac: invokevirtual java/lang/Exception.printStackTrace ()V
      // af: aload 2
      // b0: areturn
   }

   public long L() {
      return Registry.lookupField(347442644177885426L).getLong(this);
   }

   public void P(long var1) {
      Registry.lookupField(347442644177885426L).setLong(this, var1);
   }

   public void y$void() {
      Object[] var10001 = Registry.e(System.currentTimeMillis());
      long var2 = 557723764585032017L;
      Object[] var1 = var10001;
      Ref.h(557723764585032017L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public long n$long() {
      return Registry.lookupField(510833496136861094L).getLong(this);
   }

   public void Y(long var1) {
      Registry.lookupField(510833496136861094L).setLong(this, var1);
   }

   public long T() {
      return Registry.lookupField(226922218393040989L).getLong(this);
   }

   public void c(long var1) {
      Registry.lookupField(226922218393040989L).setLong(this, var1);
   }

   public boolean n$boolean() {
      return Registry.lookupField(122260549014038868L).getBoolean(this);
   }

   public void Z(boolean var1) {
      Registry.lookupField(122260549014038868L).setBoolean(this, var1);
   }

   public String D() {
      Object var1 = 465157499302305378L;
      return (String)Ref.g(465157499302305378L, var1);
   }

   public void d(String var1) {
      long var3 = 465157499302305378L;
      Ref.s(465157499302305378L, var1, var3);
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





