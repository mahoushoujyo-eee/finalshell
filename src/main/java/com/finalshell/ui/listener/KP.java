package com.finalshell.ui.listener;

import com.finalshell.core.Gi2;
import com.finalshell.core.KD;
import com.finalshell.core.SL;
import com.finalshell.core.Tk2;
import com.finalshell.core.W6_2;
import com.finalshell.ui.model.EL3;
import com.finalshell.ui.model.KH;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;

public class KP extends KD implements MouseMotionListener, MouseListener, ActionListener, Serializable {
   protected boolean J = W6_2.c;
   protected EL3 N = W6_2.b;
   protected JPopupMenu c = null;
   protected boolean v = false;
   public static long[] a;
   public static Integer[] b;

   public KP() {
   }

   public KP(Icon var1) {
      super(var1);
   }

   public KP(String var1) {
      super(var1);
   }

   public KP(String var1, Icon var2) {
      super(var1, var2);
   }

   public KP(ActionListener var1) {
      super(var1);
   }

   public KP(Icon var1, ActionListener var2) {
      super(var1, var2);
   }

   public KP(String var1, ActionListener var2) {
      super(var1, var2);
   }

   public KP(String var1, Icon var2, ActionListener var3) {
      super(var1, var2, var3);
   }

   public KP(Action var1) {
      super(var1);
   }

   @Override
   protected void init(String var1, Icon var2) {
      super.init(var1, var2);
      this.addMouseMotionListener(this);
      this.addMouseListener(this);
      this.addActionListener(this);
   }

   public JPopupMenu r() {
      return this.c;
   }

   public void O(JPopupMenu var1) {
      this.c = var1;
   }

   public boolean f$boolean() {
      return this.J;
   }

   public void M(boolean var1) {
      this.J = var1;
   }

   public EL3 A() {
      return this.N;
   }

   public void B(EL3 var1) {
      this.N = var1;
   }

   public ImageIcon t() {
      return this.z().g$ImageIcon();
   }

   public void C(ImageIcon var1) {
      this.z().o(var1);
   }

   public int e$int() {
      return this.z().U();
   }

   public void p(int var1) {
      this.z().g(var1);
   }

   public int D() {
      return this.z().O();
   }

   public void M(int var1) {
      this.z().T(var1);
   }

   public void A(SL var1) {
      this.listenerList.add(SL.class, var1);
   }

   public void g(SL var1) {
      KP var10000;
      label18: {
         boolean var2 = Tk2.B();
         if (var1 != null) {
            var10000 = this;
            if (var2) {
               break label18;
            }

            if (this.getAction() == var1) {
               this.setAction(null);
               if (!var2) {
                  return;
               }
            }
         }

         var10000 = this;
      }

      var10000.listenerList.remove(SL.class, var1);
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = Tk2.B();
      KP var10000 = this;
      if (!var2) {
         if (this.c == null) {
            this.n(var1);
            if (!var2) {
               return;
            }
         }

         var10000 = this;
      }

      label39: {
         boolean var3 = var10000.J;
         if (!var2) {
            if (var10000.J) {
               this.e$void();
               this.n(var1);
               if (!var2) {
                  return;
               }
            }

            var10000 = this;
            if (var2) {
               break label39;
            }

            var3 = this.v;
         }

         if (var3) {
            this.e$void();
            this.X(var1);
            if (!var2) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.n(var1);
   }

   public void e$void() {
      KP var2;
      label27: {
         boolean var1 = Tk2.Q();
         boolean var10000 = this.c.getUI() instanceof com.finalshell.core.FJ;
         if (var1) {
            if (var10000) {
               ((com.finalshell.core.FJ)this.c.getUI()).N(this.N);
            }

            var2 = this;
            if (!var1) {
               break label27;
            }

            var10000 = this.getComponentOrientation().isLeftToRight();
         }

         if (var10000) {
            this.c.show(this, 0, this.getHeight());
            if (var1) {
               return;
            }
         }

         var2 = this;
      }

      var2.c.show(this, this.getWidth() - this.c.getPreferredSize().width, this.getHeight());
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      boolean var10000 = Tk2.B();
      boolean var3 = this.v;
      boolean var2 = var10000;
      KP var4 = this;
      Rectangle var10001 = this.z().o(this);
      if (!var2) {
         this.v = var10001.contains(var1.getPoint());
         if (var3 == this.v) {
            return;
         }

         var4 = this;
         var10001 = this.z().D(this);
      }

      var4.repaint(var10001);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      boolean var10000 = Tk2.Q();
      boolean var3 = this.v;
      boolean var2 = var10000;
      KP var4 = this;
      if (var2) {
         this.v = false;
         if (var3 == this.v) {
            return;
         }

         var4 = this;
      }

      var4.repaint(this.z().D(this));
   }

   protected void n(ActionEvent var1) {
      Object[] var3 = this.listenerList.getListenerList();
      boolean var10000 = Tk2.B();
      ActionEvent var4 = null;
      boolean var2 = var10000;
      int var5 = var3.length - 2;

      while (var5 >= 0) {
         if (var3[var5] == SL.class) {
            Object var7 = var4;
            if (!var2) {
               if (var4 == null) {
                  String var6;
                  label27: {
                     var6 = var1.getActionCommand();
                     String var8 = var6;
                     if (!var2) {
                        if (var6 != null) {
                           break label27;
                        }

                        var8 = this.getActionCommand();
                     }

                     var6 = var8;
                  }

                  var4 = new ActionEvent(this, a(26610, 6430039751003275732L), var6, var1.getWhen(), var1.getModifiers());
               }

               var7 = var3[var5 + 1];
            }

            ((SL)var7).K(var4);
         }

         var5 -= 2;
         if (var2) {
            break;
         }
      }
   }

   protected void X(ActionEvent var1) {
      boolean var10000 = Tk2.B();
      Object[] var3 = this.listenerList.getListenerList();
      boolean var2 = var10000;
      ActionEvent var4 = null;
      int var5 = var3.length - 2;

      while (var5 >= 0) {
         if (var3[var5] == SL.class) {
            Object var7 = var4;
            if (!var2) {
               if (var4 == null) {
                  String var6;
                  label27: {
                     var6 = var1.getActionCommand();
                     String var8 = var6;
                     if (!var2) {
                        if (var6 != null) {
                           break label27;
                        }

                        var8 = this.getActionCommand();
                     }

                     var6 = var8;
                  }

                  var4 = new ActionEvent(this, a(8905, 7117045198216414446L), var6, var1.getWhen(), var1.getModifiers());
               }

               var7 = var3[var5 + 1];
            }

            ((SL)var7).i(var4);
         }

         var5 -= 2;
         if (var2) {
            break;
         }
      }
   }

   public com.finalshell.core.Gf2 z() {
      return (com.finalshell.core.Gf2)this.getUI();
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
      // 00: invokestatic com/finalshell/core/Tk2.Q ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 33
      // 09: invokevirtual com/finalshell/ui/listener/KP.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/listener/KP.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/listener/KP.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/listener/KP.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/finalshell/core/Gf2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/listener/KP.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.zL Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 284
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/Gf2
      // 40: invokevirtual com/finalshell/ui/listener/KP.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/Gf2
      // 50: dup
      // 51: invokespecial com/finalshell/core/Gf2.<init> ()V
      // 54: invokevirtual com/finalshell/ui/listener/KP.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 57: iload 1
      // 58: ifne 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/listener/KP.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/listener/KP.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/finalshell/ui/listener/KP.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 6a: return
   }

   @Override
   public String getUIClassID() {
      return KH.splitButton.n();
   }

   public Gi2 f$Gi_2() {
      return this.z();
   }

   public static Throwable b(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26151;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5084559714687166735L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u001c:¼õ{&n\b`¥P\u0086ã\u0001«2";
      int var5 = "\u001c:¼õ{&n\b`¥P\u0086ã\u0001«2".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }
}





