package com;

import java.awt.Dimension;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Co_2 extends com.CI {
   protected boolean n = _E.d;
   protected int g = _E.M;
   protected int d = _E.P;
   protected G6 j = _E.z;
   protected FileFilter W = _E.Z;
   protected com.oQ_3 z;
   protected File G = null;
   protected SZ h = null;
   private static String m;

   public Co_2() {
      super(new eP_3());
      this.Y();
   }

   public Co_2(String var1) {
      super(new eP_3(var1));
      this.Y();
   }

   public Co_2(File var1) {
      super(new eP_3(var1));
      this.Y();
   }

   public Co_2(File[] var1) {
      super(new eP_3(var1));
      this.Y();
   }

   public Co_2(List var1) {
      super(new eP_3(var1));
      this.Y();
   }

   protected void Y() {
      this.setLayoutOrientation(2);
      this.setVisibleRowCount(0);
      this.setCellRenderer(new com.OQ(this));
   }

   public com.OQ l() throws ClassCastException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Co_2.U ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/Co_2.getCellRenderer ()Ljavax/swing/ListCellRenderer;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: aload 1
      // 0b: ifnull 23
      // 0e: instanceof com/OQ
      // 11: ifeq 29
      // 14: goto 1b
      // 17: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 1a: athrow
      // 1b: aload 2
      // 1c: goto 23
      // 1f: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 22: athrow
      // 23: checkcast com/OQ
      // 26: goto 2a
      // 29: aconst_null
      // 2a: areturn
   }

   public eP_3 Y$eP_3() throws ClassCastException {
      return (eP_3)this.getModel();
   }

   @Override
   protected com.K3 O() {
      return new w2_2();
   }

   public void g(int var1) {
      this.g = var1;
   }

   public int r() {
      return this.g;
   }

   public int l$int() {
      return this.d;
   }

   public void m(int var1) {
      this.d = var1;
   }

   public boolean R() {
      return this.n;
   }

   public void y(boolean var1) {
      this.n = var1;
   }

   public G6 Q() {
      return this.j;
   }

   public void l(G6 var1) {
      this.j = var1;
      this.l().g();
   }

   public FileFilter Z() {
      return this.W;
   }

   public void N(FileFilter var1) {
      this.W = var1;
      this.I();
   }

   public void I() {
      this.e(this.v());
   }

   public com.oQ_3 p() {
      return this.z;
   }

   public void W(com.oQ_3 var1) {
      com.oQ_3 var2 = this.z;
      this.z = var1;
      this.Z(var2);
      this.Z(var1);
      this.repaint();
   }

   protected void Z(com.oQ_3 var1) {
      String var2 = U();
      if (var1 != null) {
         for (wo_4 var4 : this.Y().p()) {
            try {
               if (var1.accept(var4.T())) {
                  xb_4.G(var4);
               }
            } catch (ClassCastException var5) {
               throw a(var5);
            }

            if (var2 == null) {
               break;
            }
         }
      }
   }

   public File v() {
      return this.G;
   }

   public void e(File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Co_2.U ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/Co_2.X ()Z
      // 07: pop
      // 08: aload 0
      // 09: invokevirtual com/Co_2.U ()Ljava/util/List;
      // 0c: astore 3
      // 0d: astore 2
      // 0e: aload 1
      // 0f: aload 2
      // 10: ifnull 1e
      // 13: ifnull 2b
      // 16: goto 1d
      // 19: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 1c: athrow
      // 1d: aload 1
      // 1e: aload 0
      // 1f: getfield com/Co_2.W Ljava/io/FileFilter;
      // 22: invokevirtual java/io/File.listFiles (Ljava/io/FileFilter;)[Ljava/io/File;
      // 25: invokestatic com/Cz_2.C ([Ljava/io/File;)[Ljava/io/File;
      // 28: goto 2e
      // 2b: invokestatic com/Cz_2.z ()[Ljava/io/File;
      // 2e: astore 4
      // 30: aload 0
      // 31: invokevirtual com/Co_2.Y ()Lcom/eP_3;
      // 34: aload 4
      // 36: invokevirtual com/eP_3.v ([Ljava/io/File;)V
      // 39: aload 0
      // 3a: aload 2
      // 3b: ifnull 5c
      // 3e: getfield com/Co_2.G Ljava/io/File;
      // 41: aload 1
      // 42: invokestatic com/Cz_2.n (Ljava/io/File;Ljava/io/File;)Z
      // 45: ifeq 5b
      // 48: goto 4f
      // 4b: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 4e: athrow
      // 4f: aload 0
      // 50: aload 3
      // 51: invokevirtual com/Co_2.J (Ljava/util/Collection;)V
      // 54: goto 5b
      // 57: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 5a: athrow
      // 5b: aload 0
      // 5c: aload 1
      // 5d: putfield com/Co_2.G Ljava/io/File;
      // 60: return
   }

   public List U() {
      String var10000 = U();
      Object[] var2 = this.getSelectedValues();
      ArrayList var3 = new ArrayList(var2.length);
      Object[] var4 = var2;
      int var5 = var2.length;
      int var6 = 0;
      String var1 = var10000;

      while (true) {
         if (var6 < var5) {
            Object var7 = var4[var6];

            try {
               var9 = var3;
               if (var1 == null) {
                  break;
               }

               var3.add(((wo_4)var7).T());
               var6++;
               if (var1 != null) {
                  continue;
               }
            } catch (ClassCastException var8) {
               throw a(var8);
            }
         }

         var9 = var3;
         break;
      }

      return var9;
   }

   public File J() {
      String var10000 = U();
      Object var2 = this.getSelectedValue();
      String var1 = var10000;

      try {
         if (var1 == null) {
            return ((wo_4)var2).T();
         }

         if (var2 == null) {
            return null;
         }
      } catch (ClassCastException var3) {
         throw a(var3);
      }

      return ((wo_4)var2).T();
   }

   public void P(File var1) {
      this.U(var1, true);
   }

   public void U(File param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Co_2.U ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/Co_2.Y ()Lcom/eP_3;
      // 07: aload 1
      // 08: invokevirtual com/eP_3.X (Ljava/io/File;)Lcom/wo_4;
      // 0b: astore 4
      // 0d: astore 3
      // 0e: aload 3
      // 0f: ifnull 2c
      // 12: aload 4
      // 14: ifnull 30
      // 17: goto 1e
      // 1a: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 4
      // 21: iload 2
      // 22: invokevirtual com/Co_2.setSelectedValue (Ljava/lang/Object;Z)V
      // 25: goto 2c
      // 28: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 2b: athrow
      // 2c: aload 3
      // 2d: ifnonnull 3b
      // 30: aload 0
      // 31: invokevirtual com/Co_2.clearSelection ()V
      // 34: goto 3b
      // 37: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 3a: athrow
      // 3b: return
   }

   public void J(Collection param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Co_2.U ()Ljava/lang/String;
      // 03: new java/util/ArrayList
      // 06: dup
      // 07: aload 1
      // 08: invokeinterface java/util/Collection.size ()I 1
      // 0d: invokespecial java/util/ArrayList.<init> (I)V
      // 10: astore 3
      // 11: astore 2
      // 12: aload 1
      // 13: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 18: astore 4
      // 1a: aload 4
      // 1c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 21: ifeq 5f
      // 24: aload 4
      // 26: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b: checkcast java/io/File
      // 2e: astore 5
      // 30: aload 0
      // 31: invokevirtual com/Co_2.Y ()Lcom/eP_3;
      // 34: aload 5
      // 36: invokevirtual com/eP_3.X (Ljava/io/File;)Lcom/wo_4;
      // 39: astore 6
      // 3b: aload 2
      // 3c: ifnull 64
      // 3f: aload 6
      // 41: ifnull 5b
      // 44: goto 4b
      // 47: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 4a: athrow
      // 4b: aload 3
      // 4c: aload 6
      // 4e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 53: pop
      // 54: goto 5b
      // 57: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 5a: athrow
      // 5b: aload 2
      // 5c: ifnonnull 1a
      // 5f: aload 0
      // 60: aload 3
      // 61: invokevirtual com/Co_2.I (Ljava/util/List;)V
      // 64: return
   }

   public SZ x() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Co_2.U ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/Co_2.h Lcom/SZ;
      // 08: aload 1
      // 09: ifnull 29
      // 0c: ifnonnull 25
      // 0f: goto 16
      // 12: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: invokevirtual com/Co_2.K ()Lcom/SZ;
      // 1b: putfield com/Co_2.h Lcom/SZ;
      // 1e: goto 25
      // 21: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 24: athrow
      // 25: aload 0
      // 26: getfield com/Co_2.h Lcom/SZ;
      // 29: areturn
   }

   public SZ K() {
      return new Sq_2(this, this);
   }

   @Override
   public Dimension getPreferredSize() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Co_2.U ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokespecial com/CI.getPreferredSize ()Ljava/awt/Dimension;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 0
      // 0a: aload 1
      // 0b: ifnull 28
      // 0e: invokevirtual com/Co_2.getModel ()Ljavax/swing/ListModel;
      // 11: invokeinterface javax/swing/ListModel.getSize ()I 1
      // 16: ifle 3e
      // 19: goto 20
      // 1c: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 1f: athrow
      // 20: aload 0
      // 21: goto 28
      // 24: invokestatic com/Co_2.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 27: athrow
      // 28: bipush 0
      // 29: bipush 0
      // 2a: invokevirtual com/Co_2.getCellBounds (II)Ljava/awt/Rectangle;
      // 2d: invokevirtual java/awt/Rectangle.getSize ()Ljava/awt/Dimension;
      // 30: astore 3
      // 31: aload 2
      // 32: aload 3
      // 33: getfield java/awt/Dimension.width I
      // 36: aload 0
      // 37: getfield com/Co_2.g I
      // 3a: imul
      // 3b: putfield java/awt/Dimension.width I
      // 3e: aload 2
      // 3f: areturn
   }

   public static void E(String var0) {
      m = var0;
   }

   public static String U$String() {
      return m;
   }

   private static ClassCastException a(ClassCastException var0) {
      return var0;
   }

   static {
      if (U() == null) {
         E("AsYfEc");
      }
   }
}





