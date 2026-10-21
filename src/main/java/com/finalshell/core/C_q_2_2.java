package com.finalshell.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public abstract class C_q_2_2 extends C_i_2 implements HU_2 {
   public final List k = new ArrayList();
   public final List I = new ArrayList();
   final SortedMap E = new TreeMap();
   public static boolean c;
   public static String d;

   public C_q_2_2(com.finalshell.ui.model.I var1, Fu2_2[] var2, @C_9 C_U[] var3) {
      super(var1, var2, var3);
   }

   public void K(NU_3 var1) {
      this.k.add(var1);
      var1.C(this);
   }

   public void o(RF var1) {
      this.A(var1);
   }

   public void x(NT var1) {
      this.A(var1);
   }

   public void A(C_8_2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/finalshell/core/C_q_2_2.I Ljava/util/List;
      // 04: aload 1
      // 05: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0a: pop
      // 0b: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 0e: aload 1
      // 0f: aload 0
      // 10: invokeinterface com/finalshell/core/C_8_2.C (Lcom/finalshell/core/K_2_2;)V 2
      // 15: astore 2
      // 16: aload 0
      // 17: getfield com/finalshell/core/C_q_2_2.m Lcom/finalshell/core/Hd2;
      // 1a: aload 2
      // 1b: ifnull 33
      // 1e: ifnull 36
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/C_q_2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 0
      // 29: getfield com/finalshell/core/C_q_2_2.m Lcom/finalshell/core/Hd2;
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/C_q_2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: invokevirtual com/finalshell/core/Hd2.z$void ()V
      // 36: return
   }

   public void B(U3_3 param1) throws B2_5 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnull 2f
      // 09: instanceof com/finalshell/core/F22
      // 0c: ifne 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/C_q_2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: new com/finalshell/core/P_5
      // 19: dup
      // 1a: invokespecial com/finalshell/core/P_5.<init> ()V
      // 1d: athrow
      // 1e: invokestatic com/finalshell/core/C_q_2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: getfield com/finalshell/core/C_q_2_2.E Ljava/util/SortedMap;
      // 26: aload 1
      // 27: invokevirtual com/finalshell/core/U3_3.h ()Ljava/lang/String;
      // 2a: invokeinterface java/util/SortedMap.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2f: checkcast com/finalshell/core/U3_3
      // 32: astore 3
      // 33: aload 3
      // 34: aload 2
      // 35: ifnull 6f
      // 38: ifnull 61
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/C_q_2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: aload 1
      // 43: invokevirtual com/finalshell/core/U3_3.P ()Lcom/finalshell/core/Hd2;
      // 46: aload 3
      // 47: invokevirtual com/finalshell/core/U3_3.P ()Lcom/finalshell/core/Hd2;
      // 4a: if_acmpeq 60
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/C_q_2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: new com/finalshell/core/P_5
      // 57: dup
      // 58: invokespecial com/finalshell/core/P_5.<init> ()V
      // 5b: athrow
      // 5c: invokestatic com/finalshell/core/C_q_2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: return
      // 61: aload 0
      // 62: getfield com/finalshell/core/C_q_2_2.E Ljava/util/SortedMap;
      // 65: aload 1
      // 66: invokevirtual com/finalshell/core/U3_3.h ()Ljava/lang/String;
      // 69: aload 1
      // 6a: invokeinterface java/util/SortedMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 6f: pop
      // 70: return
   }

   @Override
   public List t() {
      return this.I;
   }

   NU_3[] z() {
      String[] var1 = RG_2.C();

      label27: {
         try {
            if (var1 == null) {
               return this.k.toArray(new NU_3[this.k.size()]);
            }

            if (this.k.isEmpty()) {
               break label27;
            }
         } catch (P_5 var3) {
            throw a(var3);
         }

         return this.k.toArray(new NU_3[this.k.size()]);
      }

      NU_3 var2 = new NU_3(this.Q(), null, RG_2.J(this.Q(), new String[]{d}), new RJ_2(this.Q()), new Nt2_2[0], null, Collections.emptyList());
      var2.C(this);
      return new NU_3[]{var2};
   }

   @Override
   public SortedMap P() {
      return this.E;
   }

   public static void f(boolean var0) {
      c = var0;
   }

   public static boolean g() {
      return c;
   }

   public static boolean j() {
      boolean var0 = g();

      try {
         return !var0;
      } catch (P_5 var1) {
         throw a(var1);
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (!j()) {
         f(true);
      }

      char[] var10003 = "b\fJ\u0014B1".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 22;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 22;
         var10006 = var0;
      } else {
         var6 = 22;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            d = var9;
            return;
         }

         var10005 = var10003;
         var10 = 22;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 4;
               break;
            case 1:
               var23 = 111;
               break;
            case 2:
               var23 = 62;
               break;
            case 3:
               var23 = 110;
               break;
            case 4:
               var23 = 61;
               break;
            case 5:
               var23 = 68;
               break;
            default:
               var23 = 100;
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
               d = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





