package com;

import java.util.Vector;

class rm_4 implements com.cd_4 {
   private com.cd_4 g;
   private Vector v = new Vector();
   private boolean e = false;

   rm_4(com.cd_4 var1) {
      this(var1, false);
   }

   rm_4(com.cd_4 var1, boolean var2) {
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
      boolean var10000 = com.dm_4.F();
      Vector var2 = new Vector();
      boolean var1 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 < this.v.size()) {
            com.aB var4 = (com.aB)this.v.elementAt(var3);
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
            var8 = var2;
            if (!var1) {
               break;
            }

            var2.add((com.aB)var5.elementAt(var6));
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

   void N(com.aB param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/dm_4.F ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 6e
      // 09: getfield com/rm_4.e Z
      // 0c: ifne 66
      // 0f: goto 16
      // 12: invokestatic com/rm_4.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 15: athrow
      // 16: aload 1
      // 17: invokeinterface com/aB.f ()Z 1
      // 1c: iload 2
      // 1d: ifeq 3c
      // 20: goto 27
      // 23: invokestatic com/rm_4.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 26: athrow
      // 27: ifne 66
      // 2a: goto 31
      // 2d: invokestatic com/rm_4.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 30: athrow
      // 31: aload 1
      // 32: instanceof com/pW_3
      // 35: goto 3c
      // 38: invokestatic com/rm_4.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 3b: athrow
      // 3c: iload 2
      // 3d: ifeq 5d
      // 40: ifeq 66
      // 43: goto 4a
      // 46: invokestatic com/rm_4.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield com/rm_4.g Lcom/cd_4;
      // 4e: aload 1
      // 4f: checkcast com/pW_3
      // 52: invokevirtual com/pW_3.J ()Lcom/ls_4;
      // 55: invokevirtual com/ls_4.T ()[B
      // 58: invokeinterface com/cd_4.D ([B)Z 2
      // 5d: pop
      // 5e: goto 75
      // 61: astore 3
      // 62: iload 2
      // 63: ifne 75
      // 66: aload 0
      // 67: goto 6e
      // 6a: invokestatic com/rm_4.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 6d: athrow
      // 6e: getfield com/rm_4.v Ljava/util/Vector;
      // 71: aload 1
      // 72: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 75: return
   }

   void N() {
      boolean var1 = com.dm_4.J();
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
         com.aB var4 = (com.aB)var2[var3];
         this.v.removeElement(var4);
         this.N(var4);
         var3++;
         if (var1) {
            break;
         }
      }
   }

   private static Pc_2 a(Pc_2 var0) {
      return var0;
   }
}





