package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

class l7_2 implements ActionListener {
   private com.Z.Q I;
   final com.kD_3 R;
   private static final String a;

   l7_2(com.kD_3 var1) {
      this.R = var1;
      this.I = null;
   }

   @Override
   public void actionPerformed(ActionEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/kD_3.u ()[I
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 42
      // 09: getfield com/l7_2.I Lcom/Z/Q;
      // 0c: ifnonnull 41
      // 0f: goto 16
      // 12: invokestatic com/l7_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: aload 0
      // 17: new com/Z/Q
      // 1a: dup
      // 1b: aload 0
      // 1c: getfield com/l7_2.R Lcom/kD_3;
      // 1f: invokestatic com/kD_3.b (Lcom/kD_3;)Ljava/lang/String;
      // 22: invokespecial com/Z/Q.<init> (Ljava/lang/String;)V
      // 25: putfield com/l7_2.I Lcom/Z/Q;
      // 28: aload 0
      // 29: getfield com/l7_2.I Lcom/Z/Q;
      // 2c: getstatic com/l7_2.a Ljava/lang/String;
      // 2f: invokevirtual com/Z/Q.t (Ljava/lang/String;)V
      // 32: aload 0
      // 33: getfield com/l7_2.I Lcom/Z/Q;
      // 36: bipush 0
      // 37: invokevirtual com/Z/Q.setMultiSelectionEnabled (Z)V
      // 3a: goto 41
      // 3d: invokestatic com/l7_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 40: athrow
      // 41: aload 0
      // 42: aload 2
      // 43: ifnonnull 6c
      // 46: getfield com/l7_2.R Lcom/kD_3;
      // 49: invokestatic com/kD_3.b (Lcom/kD_3;)Ljava/lang/String;
      // 4c: ifnull 6b
      // 4f: goto 56
      // 52: invokestatic com/l7_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 55: athrow
      // 56: aload 0
      // 57: getfield com/l7_2.I Lcom/Z/Q;
      // 5a: aload 0
      // 5b: getfield com/l7_2.R Lcom/kD_3;
      // 5e: invokestatic com/kD_3.b (Lcom/kD_3;)Ljava/lang/String;
      // 61: invokevirtual com/Z/Q.f (Ljava/lang/String;)V
      // 64: goto 6b
      // 67: invokestatic com/l7_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 6a: athrow
      // 6b: aload 0
      // 6c: aload 2
      // 6d: ifnonnull 96
      // 70: getfield com/l7_2.I Lcom/Z/Q;
      // 73: aload 0
      // 74: getfield com/l7_2.R Lcom/kD_3;
      // 77: invokestatic com/FN.L (Ljava/awt/Component;)Ljava/awt/Window;
      // 7a: invokevirtual com/Z/Q.showSaveDialog (Ljava/awt/Component;)I
      // 7d: ifne a9
      // 80: goto 87
      // 83: invokestatic com/l7_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 86: athrow
      // 87: aload 0
      // 88: getfield com/l7_2.R Lcom/kD_3;
      // 8b: aload 0
      // 8c: getfield com/l7_2.I Lcom/Z/Q;
      // 8f: invokevirtual com/Z/Q.getSelectedFile ()Ljava/io/File;
      // 92: invokestatic com/kD_3.U (Lcom/kD_3;Ljava/io/File;)V
      // 95: aload 0
      // 96: getfield com/l7_2.R Lcom/kD_3;
      // 99: invokestatic com/kD_3.J (Lcom/kD_3;)Lcom/KD;
      // 9c: bipush 1
      // 9d: invokevirtual com/KD.setEnabled (Z)V
      // a0: goto a9
      // a3: astore 3
      // a4: aload 0
      // a5: aload 3
      // a6: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // a9: return
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "8\u0005l\u001du\u0012\u0004*\u0018 \u001fd\u0011N&\u0014a\u0003:\u0007K9\u0005G\u001cu\u0013O\u000e\u0013 \u0005}\u0000F*"
         .toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 81;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 81;
         var10006 = var0;
      } else {
         var6 = 81;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 81;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 30;
               break;
            case 1:
               var23 = 49;
               break;
            case 2:
               var23 = 95;
               break;
            case 3:
               var23 = 32;
               break;
            case 4:
               var23 = 69;
               break;
            case 5:
               var23 = 37;
               break;
            default:
               var23 = 123;
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





