package com;

import java.awt.Color;
import java.awt.Stroke;
import javax.swing.JSeparator;

public class KA extends JSeparator {
   private static final String a;

   public KA() {
      super(0);
   }

   public Color D() {
      return this.N().Y();
   }

   public com.KA Z(Color var1) {
      this.N().D(var1);
      return this;
   }

   public Stroke d() {
      return this.N().j();
   }

   public com.KA o(Stroke var1) {
      this.N().o(var1);
      return this;
   }

   public int d$int() {
      return this.N().A();
   }

   public com.KA J(int var1) {
      this.N().F(var1);
      return this;
   }

   public int h() {
      return this.N().I();
   }

   public com.KA E(int var1) {
      this.N().v(var1);
      return this;
   }

   public com.Yd_2 N() {
      return (com.Yd_2)this.getUI();
   }

   @Override
   public void updateUI() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/pb_4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/KA.getUI ()Ljavax/swing/plaf/SeparatorUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/KA.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/KA.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/KA.getUI ()Ljavax/swing/plaf/SeparatorUI;
      // 25: instanceof com/Yd_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/KA.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.zI Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 80
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/Yd_2
      // 40: invokevirtual com/KA.setUI (Ljavax/swing/plaf/SeparatorUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/Yd_2
      // 50: dup
      // 51: invokespecial com/Yd_2.<init> ()V
      // 54: invokevirtual com/KA.setUI (Ljavax/swing/plaf/SeparatorUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/KA.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/KA.getUI ()Ljavax/swing/plaf/SeparatorUI;
      // 67: invokevirtual com/KA.setUI (Ljavax/swing/plaf/SeparatorUI;)V
      // 6a: return
   }

   @Override
   public String getUIClassID() {
      return a;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "?4X\u000f}#\u001e\u0001.{\u001f}\u000f\t\u000e/G\bX'".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 120;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 120;
         var10006 = var0;
      } else {
         var6 = 120;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 120;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 23;
               break;
            case 1:
               var23 = 35;
               break;
            case 2:
               var23 = 80;
               break;
            case 3:
               var23 = 2;
               break;
            case 4:
               var23 = 117;
               break;
            case 5:
               var23 = 22;
               break;
            default:
               var23 = 3;
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





