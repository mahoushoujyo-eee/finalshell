package com;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class u2 extends us_2 {
   protected boolean i;
   protected EY Z;
   protected final Object G;
   protected int l;

   public u2() {
      this(RK.drives);
   }

   public u2(RK var1) {
      this(var1.I());
   }

   public u2(String var1) {
      this(new File[]{new File(var1)});
   }

   public u2(File[] var1) {
      this(com.aL.e(var1));
   }

   public u2(List var1) {
      int var3;
      label22: {
         label24: {
            String[] var10000 = com.cB_3.C();
            super(new r6_2(var1));
            this.i = Nk_2.m;
            this.Z = null;
            this.G = new Object();
            String[] var2 = var10000;
            this.l = 0;
            this.setEditable(false);
            List var10001 = var1;
            if (var2 != null) {
               if (var1 == null) {
                  break label24;
               }

               var10001 = var1;
            }

            var3 = var10001.size();
            if (var2 == null) {
               break label22;
            }

            if (var3 == 1) {
               var3 = 1;
               break label22;
            }
         }

         var3 = 0;
      }

      this.setRootVisible((boolean)var3);
      this.setCellRenderer(new com.Oi_2());
      this.setCellEditor(new rY_3());
      this.Z(Nk_2.m);
   }

   public r6_2 Y() {
      return (r6_2)super.W();
   }

   @Override
   public void setModel(TreeModel var1) {
      boolean var2 = this.w();
      this.q(false);
      super.setModel(var1);
      this.q(var2);
   }

   protected EY V() {
      String[] var1 = com.cB_3.C();
      EY var10000 = this.Z;
      if (var1 != null) {
         if (this.Z == null) {
            this.Z = new EH(this);
         }

         var10000 = this.Z;
      }

      return var10000;
   }

   public boolean M() {
      return this.i;
   }

   public void Z(boolean var1) {
      String[] var2;
      EY var3;
      label24: {
         this.i = var1;
         String[] var10000 = com.cB_3.C();
         var3 = this.V();
         var2 = var10000;
         if (var2 != null) {
            if (!var1) {
               break label24;
            }

            this.setTransferHandler(var3);
         }

         if (var2 != null) {
            return;
         }
      }

      u2 var4 = this;
      if (var2 != null) {
         if (this.getTransferHandler() != var3) {
            return;
         }

         var4 = this;
      }

      var4.setTransferHandler(null);
   }

   public com.On_2 r() {
      String[] var10000 = com.cB_3.C();
      com.On_2 var2 = this.a();
      String[] var1 = var10000;
      com.On_2 var3 = var2;
      if (var1 != null) {
         var3 = var2 instanceof iZ_3 ? ((iZ_3)var2).u() : null;
      }

      return var3;
   }

   public void M(com.On_2 var1) {
      this.S(var1 != null ? new iZ_3(var1) : null);
   }

   public void g(String var1) {
      com.cY_3 var2 = (com.cY_3)this.M();
      var2.o(var1);
      this.D().B(var2);
   }

   public void g(File var1) {
      this.q(var1, false);
   }

   public void q(File var1, boolean var2) {
      this.X(var1, true, var2);
   }

   public void O(File var1) {
      this.X(var1, false, true);
   }

   public void B(File var1) {
      this.X(var1, false, false);
   }

   public void b(File var1, boolean var2) {
      this.X(var1, var2, false);
   }

   public void X(File var1, boolean var2, boolean var3) {
      this.l(var1, var2, var3, null);
   }

   public void l(File var1, boolean var2, boolean var3, Runnable var4) {
      label95: {
         String[] var5 = com.cB_3.C();
         com.cY_3 var10000 = var1;
         if (var5 != null) {
            if (var1 == null) {
               break label95;
            }

            var10000 = (com.cY_3)this.G;
         }

         int var6;
         synchronized (var10000) {
            this.l++;
            var6 = this.l;
         }

         label96: {
            com.cY_3 var7 = this.A(var1);
            var10000 = var7;
            if (var5 != null) {
               if (var7 == null) {
                  break label96;
               }

               var10000 = var7;
            }

            File var13 = var10000.D();
            if (var5 != null) {
               if (com.Cz_2.n(var13, var1)) {
                  label98: {
                     var14 = var2;
                     label78:
                     if (var5 != null) {
                        if (var2 != 0) {
                           var14 = var6;
                           if (var5 == null) {
                              break label78;
                           }

                           if (var6 == this.l) {
                              this.G(var7, (boolean)var3);
                              if (var5 != null) {
                                 break label98;
                              }
                           }
                        }

                        var14 = var3;
                     }

                     if (var14 != 0) {
                        this.P(var7);
                     }

                     this.O(var7);
                  }

                  Runnable var15 = var4;
                  if (var5 != null) {
                     if (var4 == null) {
                        break label96;
                     }

                     var15 = var4;
                  }

                  var15.run();
                  if (var5 != null) {
                     break label96;
                  }
               }

               var13 = var1;
            }

            List var8 = com.Cz_2.c(var13);
            int var9 = var8.indexOf(var7.D());
            int var10 = var9;

            while (true) {
               if (var10 >= 0) {
                  var8.remove(var10);
                  var10--;
                  if (var5 == null) {
                     break;
                  }

                  if (var5 != null) {
                     continue;
                  }
               }

               this.d(new SA(this, var7, var8, (boolean)var2, var6, (boolean)var3, var4));
               break;
            }

            this.K(var7);
         }

         if (var5 != null) {
            return;
         }
      }

      if (var2 != 0) {
         this.clearSelection();
      }
   }

   protected void G(com.cY_3 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/cB_3.C ()[Ljava/lang/String;
      // 03: astore 3
      // 04: aload 1
      // 05: invokevirtual com/cY_3.i ()Ljavax/swing/tree/TreePath;
      // 08: astore 4
      // 0a: aload 0
      // 0b: aload 4
      // 0d: aload 3
      // 0e: ifnull 9b
      // 11: invokevirtual com/u2.setSelectionPath (Ljavax/swing/tree/TreePath;)V
      // 14: iload 2
      // 15: ifeq 91
      // 18: goto 1f
      // 1b: invokestatic com/u2.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 3
      // 21: ifnull 46
      // 24: goto 2b
      // 27: invokestatic com/u2.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: invokevirtual com/u2.p ()Z
      // 2e: ifne 45
      // 31: goto 38
      // 34: invokestatic com/u2.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 0
      // 39: aload 4
      // 3b: invokevirtual com/u2.expandPath (Ljavax/swing/tree/TreePath;)V
      // 3e: goto 45
      // 41: invokestatic com/u2.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 0
      // 46: aload 4
      // 48: invokevirtual com/u2.getPathBounds (Ljavax/swing/tree/TreePath;)Ljava/awt/Rectangle;
      // 4b: astore 5
      // 4d: aload 5
      // 4f: aload 3
      // 50: ifnull 68
      // 53: ifnull 8d
      // 56: goto 5d
      // 59: invokestatic com/u2.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 0
      // 5e: invokevirtual com/u2.getVisibleRect ()Ljava/awt/Rectangle;
      // 61: goto 68
      // 64: invokestatic com/u2.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: astore 6
      // 6a: new java/awt/Rectangle
      // 6d: dup
      // 6e: aload 6
      // 70: getfield java/awt/Rectangle.x I
      // 73: aload 5
      // 75: getfield java/awt/Rectangle.y I
      // 78: aload 6
      // 7a: getfield java/awt/Rectangle.width I
      // 7d: aload 6
      // 7f: getfield java/awt/Rectangle.height I
      // 82: invokespecial java/awt/Rectangle.<init> (IIII)V
      // 85: astore 7
      // 87: aload 0
      // 88: aload 7
      // 8a: invokevirtual com/u2.scrollRectToVisible (Ljava/awt/Rectangle;)V
      // 8d: aload 3
      // 8e: ifnonnull 9e
      // 91: aload 0
      // 92: aload 4
      // 94: goto 9b
      // 97: invokestatic com/u2.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9a: athrow
      // 9b: invokevirtual com/u2.scrollPathToVisible (Ljavax/swing/tree/TreePath;)V
      // 9e: goto a8
      // a1: astore 4
      // a3: aload 4
      // a5: invokevirtual java/lang/Throwable.printStackTrace ()V
      // a8: return
   }

   public File N() {
      String[] var10000 = com.cB_3.C();
      com.cY_3 var2 = (com.cY_3)this.Q();
      String[] var1 = var10000;
      com.cY_3 var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return null;
         }

         var3 = var2;
      }

      return var3.D();
   }

   public List p() {
      String[] var10000 = com.cB_3.C();
      ArrayList var2 = new ArrayList();
      String[] var1 = var10000;
      TreePath[] var7 = this.getSelectionPaths();
      if (var1 != null) {
         if (var7 == null) {
            return var2;
         }

         var7 = this.getSelectionPaths();
      }

      TreePath[] var3 = var7;
      int var4 = var3.length;
      int var5 = 0;

      while (var5 < var4) {
         TreePath var6 = var3[var5];
         if (var1 == null) {
            return var2;
         }

         var2.add(((com.cY_3)this.b(var6)).D());
         var5++;
         if (var1 == null) {
            break;
         }
      }

      return var2;
   }

   @Override
   public List V$List() {
      String[] var10000 = com.cB_3.C();
      ArrayList var2 = new ArrayList();
      String[] var1 = var10000;
      TreePath[] var7 = this.getSelectionPaths();
      if (var1 != null) {
         if (var7 == null) {
            return var2;
         }

         var7 = this.getSelectionPaths();
      }

      TreePath[] var3 = var7;
      int var4 = var3.length;
      int var5 = 0;

      while (var5 < var4) {
         TreePath var6 = var3[var5];
         if (var1 == null) {
            return var2;
         }

         var2.add((com.cY_3)this.b(var6));
         var5++;
         if (var1 == null) {
            break;
         }
      }

      return var2;
   }

   public boolean E(File var1, File var2) {
      return this.b(var1, new File[]{var2});
   }

   public boolean S(com.cY_3 var1, File var2) {
      return this.N(var1, new File[]{var2});
   }

   public boolean b(File var1, File[] var2) {
      return this.H(var1, com.aL.e(var2));
   }

   public boolean N(com.cY_3 var1, File[] var2) {
      return this.O(var1, com.aL.e(var2));
   }

   public boolean H(File var1, List var2) {
      String[] var10000 = com.cB_3.C();
      com.cY_3 var4 = this.d(var1);
      String[] var3 = var10000;
      if (var4 != null) {
         boolean var5 = this.O(var4, var2);
         if (var3 == null) {
            return var5;
         }

         if (var5) {
            return true;
         }
      }

      return false;
   }

   public boolean O(com.cY_3 var1, List var2) {
      String[] var3 = com.cB_3.C();
      boolean var10000 = this.hasBeenExpanded(this.N(var1));
      if (var3 != null) {
         if (var10000) {
            ArrayList var4 = new ArrayList(var2.size());
            Iterator var5 = var2.iterator();

            while (true) {
               if (var5.hasNext()) {
                  File var6 = (File)var5.next();
                  var4.add(new com.cY_3(var6));
                  if (var3 == null) {
                     break;
                  }

                  if (var3 != null) {
                     continue;
                  }
               }

               this.z(var1, var4);
               break;
            }

            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   public boolean Y(File var1) {
      return this.c(this.d(var1));
   }

   public boolean U(File[] var1) {
      String[] var10000 = com.cB_3.C();
      boolean var3 = false;
      String[] var2 = var10000;
      File[] var4 = var1;
      int var5 = var1.length;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            File var7 = var4[var6];
            var8 = var3 | this.Y(var7);
            if (var2 == null) {
               break;
            }

            var3 = var8;
            var6++;
            if (var2 != null) {
               continue;
            }
         }

         var8 = var3;
         break;
      }

      return var8;
   }

   public boolean r(List var1) {
      String[] var10000 = com.cB_3.C();
      boolean var3 = false;
      Iterator var4 = var1.iterator();
      String[] var2 = var10000;

      while (true) {
         if (var4.hasNext()) {
            File var5 = (File)var4.next();
            var6 = var3 | this.Y(var5);
            if (var2 == null) {
               break;
            }

            var3 = var6;
            if (var2 != null) {
               continue;
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   public void r(File var1) {
      label16: {
         String[] var10000 = com.cB_3.C();
         com.cY_3 var3 = this.d(var1);
         String[] var2 = var10000;
         if (var2 != null) {
            if (var3 == null) {
               break label16;
            }

            this.b(var3);
         }

         if (var2 != null) {
            return;
         }
      }

      this.l(var1, false, false, new com.a5(this, var1));
   }

   public List d(com.cY_3 var1) {
      String[] var10000 = com.cB_3.C();
      ArrayList var3 = new ArrayList();
      String[] var2 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var1.getChildCount()) {
            var5 = var3;
            if (var2 == null) {
               break;
            }

            var3.add(var1.V(var4).D());
            var4++;
            if (var2 != null) {
               continue;
            }
         }

         var5 = var3;
         break;
      }

      return var5;
   }

   public com.cY_3 d(File var1) {
      com.cY_3 var2 = this.A(var1);
      return var2 != null && com.Cz_2.n(var1, var2.D()) ? var2 : null;
   }

   public com.cY_3 A(File var1) {
      return this.m((com.cY_3)this.getModel().getRoot(), com.Cz_2.c(var1));
   }

   protected com.cY_3 m(com.cY_3 var1, List var2) {
      String[] var3;
      byte var9;
      label43: {
         String[] var10000 = com.cB_3.C();
         File var4 = var1.D();
         var3 = var10000;
         if (var4 != null) {
            var9 = var2.contains(var4);
            if (var3 == null) {
               break label43;
            }

            if (var9 != 0) {
               int var5 = var2.indexOf(var4);
               int var6 = var5;

               while (var6 >= 0) {
                  var2.remove(var6);
                  var6--;
                  if (var3 == null) {
                     break;
                  }
               }

               return this.U(var1, var2);
            }
         }

         var9 = 0;
      }

      int var7 = var9;

      while (var7 < var1.getChildCount()) {
         com.cY_3 var8 = this.m(var1.V(var7), var2);
         if (var3 != null) {
            if (var8 != null) {
               return var8;
            }

            var7++;
         }

         if (var3 == null) {
            break;
         }
      }

      return null;
   }

   protected com.cY_3 U(com.cY_3 var1, List var2) {
      String[] var3 = com.cB_3.C();
      int var10000 = var2.size();
      if (var3 != null) {
         if (var10000 <= 0) {
            return var1;
         }

         var10000 = 0;
      }

      int var4 = var10000;

      while (var4 < var1.getChildCount()) {
         com.cY_3 var5 = var1.V(var4);
         if (var3 != null) {
            if (var3 == null) {
               return var5;
            }

            if (var5.D().equals(var2.get(0))) {
               var2.remove(0);
               return this.U(var5, var2);
            }

            var4++;
         }

         if (var3 == null) {
            break;
         }
      }

      return var1;
   }

   public void t(File var1) {
      this.d(var1, false);
   }

   public void d(File var1, boolean var2) {
      String[] var10000 = com.cB_3.C();
      com.cY_3 var4 = this.d(var1);
      String[] var3 = var10000;
      if (var3 != null && var4 != null) {
         this.S(var4, var2);
      }
   }

   public void s(File var1) {
      this.D(var1, false);
   }

   public void D(File var1, boolean var2) {
      String[] var10000 = com.cB_3.C();
      com.cY_3 var4 = this.d(var1);
      String[] var3 = var10000;
      if (var3 != null && var4 != null) {
         this.B(var4, var2);
      }
   }

   @Override
   public r7_2 W() {
      return this.Y();
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }
}





