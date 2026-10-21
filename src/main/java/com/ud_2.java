package com;

import javax.swing.Action;
import javax.swing.Icon;

public class ud_2 extends uE {
   private static final String a;

   public ud_2() {
   }

   public ud_2(boolean var1) {
      super("", var1);
   }

   public ud_2(Pt_2 var1) {
      this.X(var1);
   }

   public ud_2(Icon var1) {
      super(var1);
   }

   public ud_2(Icon var1, boolean var2) {
      super(var1, var2);
   }

   public ud_2(Icon var1, Pt_2 var2) {
      super(var1);
      this.X(var2);
   }

   public ud_2(String var1) {
      super(var1);
   }

   public ud_2(String var1, boolean var2) {
      super(var1, var2);
   }

   public ud_2(String var1, Pt_2 var2) {
      super(var1);
      this.X(var2);
   }

   public ud_2(String var1, Icon var2) {
      super(var1, var2);
   }

   public ud_2(String var1, Icon var2, boolean var3) {
      super(var1, var2, var3);
   }

   public ud_2(String var1, Icon var2, Pt_2 var3) {
      super(var1, var2);
      this.X(var3);
   }

   public ud_2(Action var1) {
      super(var1);
   }

   @Override
   protected void init(String var1, Icon var2) {
      this.model = new S();
      this.setModel(this.model);
      super.init(var1, var2);
   }

   public S h() {
      return (S)this.model;
   }

   public boolean F() {
      return this.h().O();
   }

   public void U(boolean var1) {
      this.h().y(var1);
   }

   public Pt_2 g() {
      return this.h().y();
   }

   public Pt_2 V(Pt_2 var1) {
      return this.h().Y(var1);
   }

   public void X(Pt_2 var1) {
      this.h().f(var1);
   }

   public boolean g$boolean() {
      return this.h().isSelected();
   }

   public void u() {
      this.X(Pt_2.checked);
   }

   public boolean i() {
      return this.h().X();
   }

   public void s() {
      this.X(Pt_2.mixed);
   }

   public boolean u$boolean() {
      com.ky_4[] var1 = Pt_2.b();
      boolean var10000 = this.g();
      if (var1 == null) {
         if (var10000) {
            return false;
         }

         var10000 = this.i();
      }

      return var1 != null ? var10000 : !var10000;
   }

   public void n() {
      this.X(Pt_2.unchecked);
   }

   public com.Ft_2 R() {
      return (com.Ft_2)this.getUI();
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
      // 00: invokestatic com/Pt_2.b ()[Lcom/ky_4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 33
      // 09: invokevirtual com/ud_2.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/ud_2.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 63
      // 1b: goto 22
      // 1e: invokestatic com/ud_2.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/ud_2.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/Ft_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/ud_2.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.t Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 133
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/Ft_2
      // 40: invokevirtual com/ud_2.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/Ft_2
      // 50: dup
      // 51: invokespecial com/Ft_2.<init> ()V
      // 54: invokevirtual com/ud_2.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 57: aload 1
      // 58: ifnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/ud_2.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/ud_2.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/ud_2.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 6a: return
   }

   @Override
   public String getUIClassID() {
      return a;
   }

   @Override
   public com.Fm_2 M() {
      return this.R();
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u001bprsl4-*Ase{>\u001b zNI".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 60;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 60;
         var10006 = var0;
      } else {
         var6 = 60;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 60;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 115;
               break;
            case 1:
               var23 = 62;
               break;
            case 2:
               var23 = 39;
               break;
            case 3:
               var23 = 60;
               break;
            case 4:
               var23 = 36;
               break;
            case 5:
               var23 = 105;
               break;
            default:
               var23 = 101;
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





