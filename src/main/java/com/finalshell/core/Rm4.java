package com.finalshell.core;

import java.util.Vector;

public class Rm4 implements Cd4 {
   public Cd4 g;
   public Vector v = new Vector();
   public boolean e = false;

   public Rm4(Cd4 var1) {
      this(var1, false);
   }

   public Rm4(Cd4 var1, boolean var2) {
      this.g = var1;
      this.e = var2;
   }

   @Override
   public String r() {
      return this.g.r();
   }

   @Override
   public int p() {
      return this.g.p();
   }

   @Override
   public boolean D(byte[] var1) {
      return this.g.D(var1);
   }

   @Override
   public boolean i(byte[] var1) {
      return this.g.i(var1);
   }

   @Override
   public void u() {
      this.v.removeAllElements();
      this.g.u();
   }

   @Override
   public Vector e() {
      boolean var10000 = Dm4.F$boolean();
      Vector var2 = new Vector();
      boolean var1 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 < this.v.size()) {
      Vector var7;
            AB_2 var4 = (AB_2)this.v.elementAt(var3);
            var7 = var2;
            if (!var1) {
               break;
            }

            var2.add(var4);
            var3++;
            if (var1) {
               continue;
            }
         }

         var7 = this.g.e();
         break;
      }

      Vector var5 = var7;
      int var6 = 0;

      while (true) {
         if (var6 < var5.size()) {
      Vector var8;
            var8 = var2;
            if (!var1) {
               break;
            }

            var2.add((AB_2)var5.elementAt(var6));
            var6++;
            if (var1) {
               continue;
            }
         }

         var8 = var2;
         break;
      }

      return var8;
   }

   public void N(AB_2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 6e
      // 09: getfield com/finalshell/core/Rm4.e Z
      // 0c: ifne 66
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Rm4.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 15: athrow
      // 16: aload 1
      // 17: invokeinterface com/finalshell/core/AB_2.f ()Z 1
      // 1c: iload 2
      // 1d: ifeq 3c
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/Rm4.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 26: athrow
      // 27: ifne 66
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/Rm4.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 30: athrow
      // 31: aload 1
      // 32: instanceof com/finalshell/core/PW3
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/Rm4.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 3b: athrow
      // 3c: iload 2
      // 3d: ifeq 5d
      // 40: ifeq 66
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/Rm4.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield com/finalshell/core/Rm4.g Lcom/finalshell/core/Cd4;
      // 4e: aload 1
      // 4f: checkcast com/finalshell/core/PW3
      // 52: invokevirtual com/finalshell/core/PW3.J ()Lcom/finalshell/core/Ls4;
      // 55: invokevirtual com/finalshell/core/Ls4.T$arrbyte ()[B
      // 58: invokeinterface com/finalshell/core/Cd4.D ([B)Z 2
      // 5d: pop
      // 5e: goto 75
      // 61: astore 3
      // 62: iload 2
      // 63: ifne 75
      // 66: aload 0
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/Rm4.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 6d: athrow
      // 6e: getfield com/finalshell/core/Rm4.v Ljava/util/Vector;
      // 71: aload 1
      // 72: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 75: return
   }

   public void N() {
      boolean var1 = Dm4.J$boolean();
      Vector var10000 = this.v;
      if (!var1) {
         if (this.v.size() <= 0) {
            return;
         }

         var10000 = this.v;
      }

      Object[] var2 = var10000.toArray();
      int var3 = 0;

      while (var3 < var2.length) {
         AB_2 var4 = (AB_2)var2[var3];
         this.v.removeElement(var4);
         this.N(var4);
         var3++;
         if (var1) {
            break;
         }
      }
   }

   public static Pc2 a(Pc2 var0) {
      return var0;
   }
}






