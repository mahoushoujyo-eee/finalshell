package com.Z;

import com.Xg_2;
import com.i2_2;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class Q extends JFileChooser implements com.au_2, com.cX_3 {
   protected List f = null;
   private static final String a;

   public Q() {
      super(com.Z.p_2.m);
   }

   public Q(String var1) {
      super(var1);
   }

   public Q(File var1) {
      super(var1);
   }

   public Q(FileSystemView var1) {
      super(var1);
   }

   public Q(File var1, FileSystemView var2) {
      super(var1, var2);
   }

   public Q(String var1, FileSystemView var2) {
      super(var1, var2);
   }

   @Override
   protected JDialog createDialog(Component var1) throws HeadlessException {
      JDialog var2 = super.createDialog(var1);

      try {
         if (this.f != null) {
            var2.setIconImages(this.f);
         }

         return var2;
      } catch (HeadlessException var3) {
         throw a(var3);
      }
   }

   public Image K() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Z/T.v ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/Z/Q.f Ljava/util/List;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 4b
      // 0f: goto 16
      // 12: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/Z/Q.f Ljava/util/List;
      // 1a: goto 21
      // 1d: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 1
      // 22: ifnonnull 45
      // 25: invokeinterface java/util/List.size ()I 1
      // 2a: ifle 4b
      // 2d: goto 34
      // 30: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 0
      // 35: getfield com/Z/Q.f Ljava/util/List;
      // 38: bipush 0
      // 39: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 3e: goto 45
      // 41: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: checkcast java/awt/Image
      // 48: goto 4c
      // 4b: aconst_null
      // 4c: areturn
   }

   public List S() {
      return this.f;
   }

   public void a(ImageIcon var1) {
      this.K(var1.getImage());
   }

   public void K(Image var1) {
      this.s(Arrays.asList(var1));
   }

   public void C(List var1) {
      this.s(Xg_2.i(var1));
   }

   public void s(List param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Z/T.v ()Ljava/lang/String;
      // 03: aload 0
      // 04: aload 1
      // 05: putfield com/Z/Q.f Ljava/util/List;
      // 08: astore 2
      // 09: aload 0
      // 0a: invokestatic com/FN.L (Ljava/awt/Component;)Ljava/awt/Window;
      // 0d: astore 3
      // 0e: aload 3
      // 0f: aload 2
      // 10: ifnonnull 1e
      // 13: ifnull 3b
      // 16: goto 1d
      // 19: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 3
      // 1e: aload 2
      // 1f: ifnonnull 37
      // 22: instanceof javax/swing/JDialog
      // 25: ifeq 3b
      // 28: goto 2f
      // 2b: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 3
      // 30: goto 37
      // 33: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 1
      // 38: invokevirtual java/awt/Window.setIconImages (Ljava/util/List;)V
      // 3b: return
   }

   public void t(String var1) {
      this.u(var1, new Object[0]);
   }

   public void e(String var1) {
      com.Z.Q var10000;
      File var10001;
      label16: {
         try {
            var10000 = this;
            if (var1 != null) {
               var10001 = new File(var1);
               break label16;
            }
         } catch (HeadlessException var2) {
            throw a(var2);
         }

         var10001 = null;
      }

      var10000.setCurrentDirectory(var10001);
   }

   public void f(String var1) {
      com.Z.Q var10000;
      File var10001;
      label16: {
         try {
            var10000 = this;
            if (var1 != null) {
               var10001 = new File(var1);
               break label16;
            }
         } catch (HeadlessException var2) {
            throw a(var2);
         }

         var10001 = null;
      }

      var10000.setSelectedFile(var10001);
   }

   public com.Z.T d() {
      return this.n().v();
   }

   public List H() {
      return this.n().h();
   }

   public com.b.V H$combV() {
      return this.n().E();
   }

   public boolean u() {
      return this.n().Q();
   }

   public void D(boolean var1) {
      this.n().a(var1);
   }

   public void W(com.Z.O var1) {
      this.n().u(var1);
   }

   public void h(String var1) {
      this.n().F(var1);
   }

   public com.Z.A n() {
      return (com.Z.A)this.getUI();
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
      // 00: invokestatic com/Z/T.v ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 27
      // 09: invokevirtual com/Z/Q.isAcceptAllFileFilterUsed ()Z
      // 0c: ifeq 26
      // 0f: goto 16
      // 12: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: invokevirtual com/Z/Q.getAcceptAllFileFilter ()Ljavax/swing/filechooser/FileFilter;
      // 1b: invokevirtual com/Z/Q.removeChoosableFileFilter (Ljavax/swing/filechooser/FileFilter;)Z
      // 1e: pop
      // 1f: goto 26
      // 22: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 0
      // 27: aload 1
      // 28: ifnonnull 55
      // 2b: invokevirtual com/Z/Q.getUI ()Ljavax/swing/plaf/FileChooserUI;
      // 2e: ifnull 54
      // 31: goto 38
      // 34: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 0
      // 39: aload 1
      // 3a: ifnonnull 85
      // 3d: goto 44
      // 40: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: invokevirtual com/Z/Q.getUI ()Ljavax/swing/plaf/FileChooserUI;
      // 47: instanceof com/Z/A
      // 4a: ifne 7d
      // 4d: goto 54
      // 50: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: aload 0
      // 55: getstatic com/a9.I Ljava/lang/String;
      // 58: bipush 0
      // 59: anewarray 76
      // 5c: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5f: checkcast com/Z/A
      // 62: invokevirtual com/Z/Q.setUI (Ljavax/swing/plaf/ComponentUI;)V
      // 65: goto 8c
      // 68: astore 2
      // 69: aload 0
      // 6a: aload 2
      // 6b: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 6e: aload 0
      // 6f: new com/Z/A
      // 72: dup
      // 73: invokespecial com/Z/A.<init> ()V
      // 76: invokevirtual com/Z/Q.setUI (Ljavax/swing/plaf/ComponentUI;)V
      // 79: aload 1
      // 7a: ifnull 8c
      // 7d: aload 0
      // 7e: goto 85
      // 81: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: aload 0
      // 86: invokevirtual com/Z/Q.getUI ()Ljavax/swing/plaf/FileChooserUI;
      // 89: invokevirtual com/Z/Q.setUI (Ljavax/swing/plaf/ComponentUI;)V
      // 8c: aload 0
      // 8d: aload 1
      // 8e: ifnonnull bd
      // 91: invokevirtual com/Z/Q.getFileSystemView ()Ljavax/swing/filechooser/FileSystemView;
      // 94: ifnonnull ac
      // 97: goto 9e
      // 9a: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9d: athrow
      // 9e: aload 0
      // 9f: invokestatic javax/swing/filechooser/FileSystemView.getFileSystemView ()Ljavax/swing/filechooser/FileSystemView;
      // a2: invokevirtual com/Z/Q.setFileSystemView (Ljavax/swing/filechooser/FileSystemView;)V
      // a5: goto ac
      // a8: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ab: athrow
      // ac: aload 0
      // ad: getstatic com/Z/Q.a Ljava/lang/String;
      // b0: aload 0
      // b1: invokevirtual com/Z/Q.getUI ()Ljavax/swing/plaf/FileChooserUI;
      // b4: aload 0
      // b5: invokevirtual javax/swing/plaf/FileChooserUI.getFileView (Ljavax/swing/JFileChooser;)Ljavax/swing/filechooser/FileView;
      // b8: invokestatic com/Kp_2.k (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z
      // bb: pop
      // bc: aload 0
      // bd: aload 1
      // be: ifnonnull d6
      // c1: invokevirtual com/Z/Q.isAcceptAllFileFilterUsed ()Z
      // c4: ifeq dd
      // c7: goto ce
      // ca: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cd: athrow
      // ce: aload 0
      // cf: goto d6
      // d2: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d5: athrow
      // d6: aload 0
      // d7: invokevirtual com/Z/Q.getAcceptAllFileFilter ()Ljavax/swing/filechooser/FileFilter;
      // da: invokevirtual com/Z/Q.addChoosableFileFilter (Ljavax/swing/filechooser/FileFilter;)V
      // dd: return
   }

   @Override
   public void u(String var1, Object[] var2) {
      i2_2.n(this, var1, var2);
   }

   @Override
   public void F(Object[] var1) {
      i2_2.U(this, var1);
   }

   @Override
   public void N(String var1, Object[] var2) {
      i2_2.q(this, var1, var2);
   }

   @Override
   public void M() {
      i2_2.L(this);
   }

   @Override
   public boolean k() {
      return i2_2.Z(this);
   }

   @Override
   public void M(com.ld_4 var1) {
      i2_2.g(this, var1);
   }

   @Override
   public void i() {
      i2_2.o(this);
   }

   @Override
   public void o(String var1) {
      i2_2.f(this, var1);
   }

   @Override
   public void I() {
      i2_2.p(this);
   }

   @Override
   public String q() {
      return i2_2.O(this);
   }

   public static File d$File() {
      return p(null, null, null);
   }

   public static File K(com.OR var0) {
      return p(null, null, var0);
   }

   public static File s(Component var0, com.OR var1) {
      return p(var0, null, var1);
   }

   public static File T(String var0, com.OR var1) {
      return p(null, var0, var1);
   }

   public static File X(Component var0, String var1) {
      return p(var0, var1, null);
   }

   public static File p(Component param0, String param1, com.OR param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Z/T.v ()Ljava/lang/String;
      // 03: new com/Z/Q
      // 06: dup
      // 07: aload 1
      // 08: invokespecial com/Z/Q.<init> (Ljava/lang/String;)V
      // 0b: astore 4
      // 0d: astore 3
      // 0e: aload 4
      // 10: aload 3
      // 11: ifnonnull 34
      // 14: bipush 0
      // 15: invokevirtual com/Z/Q.setMultiSelectionEnabled (Z)V
      // 18: aload 2
      // 19: ifnull 32
      // 1c: goto 23
      // 1f: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 2
      // 24: aload 4
      // 26: invokeinterface com/OR.j (Ljava/lang/Object;)V 2
      // 2b: goto 32
      // 2e: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 4
      // 34: aload 3
      // 35: ifnonnull 4f
      // 38: aload 0
      // 39: invokevirtual com/Z/Q.showOpenDialog (Ljava/awt/Component;)I
      // 3c: ifne 53
      // 3f: goto 46
      // 42: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 4
      // 48: goto 4f
      // 4b: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: invokevirtual com/Z/Q.getSelectedFile ()Ljava/io/File;
      // 52: areturn
      // 53: aconst_null
      // 54: areturn
   }

   public static List K$List() {
      return d(null, null, null);
   }

   public static List H(com.OR var0) {
      return d(null, null, var0);
   }

   public static List H(Component var0, com.OR var1) {
      return d(var0, null, var1);
   }

   public static List A(String var0, com.OR var1) {
      return d(null, var0, var1);
   }

   public static List b(Component var0, String var1) {
      return d(var0, var1, null);
   }

   public static List d(Component param0, String param1, com.OR param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Z/T.v ()Ljava/lang/String;
      // 03: new com/Z/Q
      // 06: dup
      // 07: aload 1
      // 08: invokespecial com/Z/Q.<init> (Ljava/lang/String;)V
      // 0b: astore 4
      // 0d: astore 3
      // 0e: aload 4
      // 10: aload 3
      // 11: ifnonnull 34
      // 14: bipush 1
      // 15: invokevirtual com/Z/Q.setMultiSelectionEnabled (Z)V
      // 18: aload 2
      // 19: ifnull 32
      // 1c: goto 23
      // 1f: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 2
      // 24: aload 4
      // 26: invokeinterface com/OR.j (Ljava/lang/Object;)V 2
      // 2b: goto 32
      // 2e: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 4
      // 34: aload 3
      // 35: ifnonnull 4f
      // 38: aload 0
      // 39: invokevirtual com/Z/Q.showOpenDialog (Ljava/awt/Component;)I
      // 3c: ifne 56
      // 3f: goto 46
      // 42: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 4
      // 48: goto 4f
      // 4b: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: invokevirtual com/Z/Q.getSelectedFiles ()[Ljava/io/File;
      // 52: invokestatic com/aL.o ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 55: areturn
      // 56: aconst_null
      // 57: areturn
   }

   public static File C() {
      return V(null, null, null);
   }

   public static File m(com.OR var0) {
      return V(null, null, var0);
   }

   public static File q(Component var0, com.OR var1) {
      return V(var0, null, var1);
   }

   public static File r(String var0, com.OR var1) {
      return V(null, var0, var1);
   }

   public static File R(Component var0, String var1) {
      return V(var0, var1, null);
   }

   public static File V(Component param0, String param1, com.OR param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Z/T.v ()Ljava/lang/String;
      // 03: new com/Z/Q
      // 06: dup
      // 07: aload 1
      // 08: invokespecial com/Z/Q.<init> (Ljava/lang/String;)V
      // 0b: astore 4
      // 0d: astore 3
      // 0e: aload 4
      // 10: aload 3
      // 11: ifnonnull 34
      // 14: bipush 1
      // 15: invokevirtual com/Z/Q.setMultiSelectionEnabled (Z)V
      // 18: aload 2
      // 19: ifnull 32
      // 1c: goto 23
      // 1f: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 2
      // 24: aload 4
      // 26: invokeinterface com/OR.j (Ljava/lang/Object;)V 2
      // 2b: goto 32
      // 2e: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 4
      // 34: aload 3
      // 35: ifnonnull 4f
      // 38: aload 0
      // 39: invokevirtual com/Z/Q.showSaveDialog (Ljava/awt/Component;)I
      // 3c: ifne 53
      // 3f: goto 46
      // 42: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 4
      // 48: goto 4f
      // 4b: invokestatic com/Z/Q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: invokevirtual com/Z/Q.getSelectedFile ()Ljava/io/File;
      // 52: areturn
      // 53: aconst_null
      // 54: areturn
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "'\u0017\tgc;8;\u001b8".toCharArray();
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
            a = var9;
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
               var23 = 68;
               break;
            case 1:
               var23 = 104;
               break;
            case 2:
               var23 = 89;
               break;
            case 3:
               var23 = 24;
               break;
            case 4:
               var23 = 25;
               break;
            case 5:
               var23 = 72;
               break;
            default:
               var23 = 120;
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





