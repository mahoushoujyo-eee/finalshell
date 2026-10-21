package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.Cg4;
import com.finalshell.core.FN;
import com.finalshell.core.GO;
import com.finalshell.core.IE3;
import com.finalshell.core.Ka2;
import com.finalshell.core.ON;
import com.finalshell.core.Oc4;
import com.finalshell.core.Og4;
import com.finalshell.core.SN;
import com.finalshell.core.WC_2;
import com.finalshell.core.W_3;
import com.finalshell.core.Xk2;
import com.finalshell.ui.listener.C_U;
import com.finalshell.ui.listener.Dv4;
import com.finalshell.ui.listener.Rt2;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.AWTEventListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JWindow;
import javax.swing.Popup;

public class QB extends Ky4 implements W_3 {
   protected List a = new ArrayList(2);
   protected boolean V = true;
   protected boolean F = true;
   protected boolean e = false;
   protected boolean Y = false;
   protected float P = 1.0F;
   protected boolean n = true;
   protected float A = 0.05F;
   protected float y;
   protected final Object c;
   protected boolean r;
   protected boolean U;
   protected WC_2 l;
   protected WC_2 S;
   protected final List t;
   protected final List K;
   protected final Object i;
   protected Popup E;
   protected JWindow w;
   protected Component b;
   protected Window z;
   protected AWTEventListener N;
   protected Ka2 f;
   protected Rt2 W;
   public static long p;

   public QB() {
      this.y = 0.0F;
      this.c = new Object();
      this.r = false;
      this.U = false;
      this.l = null;
      this.S = null;
      this.t = new ArrayList();
      this.K = new ArrayList();
      this.i = new Object();
   }

   public QB(Component var1) {
      super(var1);
      this.y = 0.0F;
      this.c = new Object();
      this.r = false;
      this.U = false;
      this.l = null;
      this.S = null;
      this.t = new ArrayList();
      this.K = new ArrayList();
      this.i = new Object();
   }

   public QB(Og4 var1) {
      super(var1);
      this.y = 0.0F;
      this.c = new Object();
      this.r = false;
      this.U = false;
      this.l = null;
      this.S = null;
      this.t = new ArrayList();
      this.K = new ArrayList();
      this.i = new Object();
   }

   public QB(LayoutManager var1, Og4 var2) {
      super(var1, var2);
      this.y = 0.0F;
      this.c = new Object();
      this.r = false;
      this.U = false;
      this.l = null;
      this.S = null;
      this.t = new ArrayList();
      this.K = new ArrayList();
      this.i = new Object();
   }

   public QB(Og4 var1, Component var2) {
      super(var1, var2);
      this.y = 0.0F;
      this.c = new Object();
      this.r = false;
      this.U = false;
      this.l = null;
      this.S = null;
      this.t = new ArrayList();
      this.K = new ArrayList();
      this.i = new Object();
   }

   public QB(LayoutManager var1, Og4 var2, Component[] var3) {
      super(var1, var2, var3);
      WC_2.V();
      this.y = 0.0F;
      this.c = new Object();
      this.r = false;
      this.U = false;
      this.l = null;
      this.S = null;
      this.t = new ArrayList();
      this.K = new ArrayList();
      this.i = new Object();
      if (Ky4.F$arrString() != null) {
         WC_2.I(new int[4]);
      }
   }

   public QB(LayoutManager var1) {
      super(var1);
      this.y = 0.0F;
      this.c = new Object();
      this.r = false;
      this.U = false;
      this.l = null;
      this.S = null;
      this.t = new ArrayList();
      this.K = new ArrayList();
      this.i = new Object();
   }

   public QB(LayoutManager var1, Component[] var2) {
      super(var1, var2);
      this.y = 0.0F;
      this.c = new Object();
      this.r = false;
      this.U = false;
      this.l = null;
      this.S = null;
      this.t = new ArrayList();
      this.K = new ArrayList();
      this.i = new Object();
   }

   public QB(String var1) {
      super(var1);
      this.y = 0.0F;
      this.c = new Object();
      this.r = false;
      this.U = false;
      this.l = null;
      this.S = null;
      this.t = new ArrayList();
      this.K = new ArrayList();
      this.i = new Object();
   }

   public QB(String var1, LayoutManager var2) {
      super(var1, var2);
      this.y = 0.0F;
      this.c = new Object();
      this.r = false;
      this.U = false;
      this.l = null;
      this.S = null;
      this.t = new ArrayList();
      this.K = new ArrayList();
      this.i = new Object();
   }

   public QB(String var1, Component var2) {
      super(var1, var2);
      this.y = 0.0F;
      this.c = new Object();
      this.r = false;
      this.U = false;
      this.l = null;
      this.S = null;
      this.t = new ArrayList();
      this.K = new ArrayList();
      this.i = new Object();
   }

   public boolean l$boolean() {
      return this.V;
   }

   public void a(boolean var1) {
      this.V = var1;
   }

   public Popup F$Popup() {
      return this.E;
   }

   public JWindow W$JWindow() {
      return this.w;
   }

   public Component F$Component() {
      return this.b;
   }

   public Window w() {
      return this.z;
   }

   public float u() {
      return this.y;
   }

   public boolean q$boolean() {
      return this.r;
   }

   public boolean k() {
      return this.U;
   }

   public JWindow C(boolean var1) {
      this.F = var1;
      return this.E();
   }

   protected JWindow E() {
      int[] var1 = WC_2.V();
      JWindow var10000 = this.w;
      if (var1 == null) {
         if (this.w != null) {
            SN.N(this.w, this.F);
         }

         var10000 = this.w;
      }

      return var10000;
   }

   @Override
   public boolean N() {
      return this.F;
   }

   public JWindow t(float var1) {
      this.P = var1;
      return this.B$JWindow();
   }

   protected JWindow B$JWindow() {
      int[] var1 = WC_2.V();
      JWindow var10000 = this.w;
      if (var1 == null) {
         if (this.w != null) {
            SN.s(this.w, this.P * this.y);
         }

         var10000 = this.w;
      }

      return var10000;
   }

   public float B$float() {
      return this.P;
   }

   public boolean Z() {
      return this.e;
   }

   public void t(boolean var1) {
      int[] var2 = WC_2.V();
      QB var10000 = this;
      if (var2 == null) {
         this.e = var1;
         if (var1) {
            var10000 = this;
            if (var2 == null) {
               if (this.w == null) {
                  return;
               }

               var10000 = this;
            }

            if (var2 == null) {
               if (var10000.W != null) {
                  return;
               }

               var10000 = this;
            }

            if (var2 == null) {
               if (var10000.z == null) {
                  return;
               }

               var10000 = this;
            }

            var10000.h();
            if (var2 == null) {
               return;
            }
         }

         var10000 = this;
      }

      if (var2 == null) {
         if (var10000.w == null) {
            return;
         }

         var10000 = this;
      }

      if (var2 == null) {
         if (var10000.W == null) {
            return;
         }

         var10000 = this;
      }

      if (var2 == null) {
         if (var10000.z == null) {
            return;
         }

         var10000 = this;
      }

      var10000.Y();
   }

   protected void h() {
      this.W = Rt2.q(this.w, this.z);
   }

   protected void Y() {
      Rt2.f(this.z, this.W);
      this.W = null;
   }

   public boolean G$boolean() {
      return this.Y;
   }

   public void J(boolean var1) {
      int[] var10000 = WC_2.V();
      this.Y = var1;
      int[] var2 = var10000;
      JWindow var3 = this.w;
      if (var2 == null) {
         if (this.w == null) {
            return;
         }

         var3 = this.w;
      }

      var3.setAlwaysOnTop(var1);
   }

   public boolean o() {
      return this.n;
   }

   public void Y(boolean var1) {
      this.n = var1;
   }

   public float J() {
      return this.A;
   }

   public void c(float var1) {
      this.A = var1;
   }

   public QB F(Component var1, Point var2) {
      return this.M(var1, var2.x, var2.y);
   }

   public QB M(Component var1, int var2, int var3) {
      this.T(var1, var2, var3);
      return this;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected void T(Component var1, int var2, int var3) {
      int[] var10000 = WC_2.V();
      Object var5 = this.c;
      synchronized (this.c){} // $VF: monitorenter 
      int[] var4 = var10000;

      try {
         var10000 = (int[])this;
         if (var4 == null) {
            label175:
            if (!this.r) {
               label196: {
                  boolean var11 = this.U;
                  if (var4 == null) {
                     label183: {
                        if (!this.U) {
                           var12 = this;
                           if (var4 != null) {
                              break label183;
                           }

                           if (this.w != null) {
                              break label175;
                           }
                        }

                        this.r = true;
                        var12 = this;
                     }

                     if (var4 != null) {
                        break label196;
                     }

                     var11 = var12.U;
                  }

                  if (var11) {
                     QB var13 = this;
                     if (var4 == null) {
                        if (this.S != null) {
                           this.S.Y();
                        }

                        var13 = this;
                     }

                     var13.U = false;
                  }

                  this.b = var1;
                  this.z = FN.L(var1);
                  var12 = this;
               }

               label166: {
                  var12.y = this.n ? 0.0F : 1.0F;
                  QB var14 = this;
                  if (var4 == null) {
                     if (this.z != null) {
                        Rectangle var6 = FN.f$Rectangle(var1);
                        this.E = Xk2.L(var1, this, var6.x + var2, var6.y + var3);
                        if (var4 == null) {
                           break label166;
                        }
                     }

                     var14 = this;
                  }

                  var14.E = Xk2.L(var1, this, var2, var3);
               }

               this.w = (JWindow)FN.L(this);
               this.w.setAlwaysOnTop(this.Y);
               this.E();
               this.B$JWindow();
               this.z$void();
               this.N = new Oc4(this);
               Toolkit.getDefaultToolkit().addAWTEventListener(this.N, p);
               this.f = new IE3(this);
               ON.F(this.f);
               this.E.show();
               boolean var15 = this.n;
               if (var4 == null) {
                  if (this.n) {
                     this.l = WC_2.E(GO.L, 0L, new Dv4(this));
                  }

                  var15 = this.e;
               }

               if (var4 == null) {
                  label156: {
                     if (var15) {
                        var16 = this;
                        if (var4 != null) {
                           break label156;
                        }

                        if (this.z != null) {
                           this.h();
                        }
                     }

                     var16 = this;
                  }

                  var15 = var16.n;
               }

               label198: {
                  if (var4 == null) {
                     if (!var15) {
                        this.r = false;
                     }

                     this.t();
                     var10000 = (int[])this;
                     if (var4 != null) {
                        break label198;
                     }

                     var15 = this.n;
                  }

                  if (!var15) {
                     this.T();
                  }

                  var10000 = (int[])var5;
               }

               // $VF: monitorexit
               return;
            }

            var10000 = (int[])var5;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public QB l$QB() {
      this.W$void();
      return this;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected void W$void() {
      int[] var10000 = WC_2.V();
      Object var2 = this.c;
      synchronized (this.c){} // $VF: monitorenter 
      int[] var1 = var10000;

      try {
         var10000 = (int[])this;
         label111:
         if (var1 == null) {
            if (!this.U) {
               var10000 = (int[])this.w;
               if (var1 != null) {
                  break label111;
               }

               label115:
               if (this.w != null) {
                  label139: {
                     label140: {
                        var7 = this;
                        if (var1 == null) {
                           if (this.w != null) {
                              var8 = this.w.isShowing();
                              if (var1 != null) {
                                 break label140;
                              }

                              if (!var8) {
                                 break label115;
                              }
                           }

                           this.U = true;
                           var7 = this;
                        }

                        if (var1 != null) {
                           break label139;
                        }

                        var8 = var7.r;
                     }

                     if (var8) {
                        QB var9 = this;
                        if (var1 == null) {
                           if (this.l != null) {
                              this.l.Y();
                           }

                           var9 = this;
                        }

                        var9.r = false;
                     }

                     var7 = this;
                  }

                  label105: {
                     var7.y = this.n ? 1.0F : 0.0F;
                     QB var10 = this;
                     if (var1 == null) {
                        if (this.n) {
                           this.S = WC_2.E(GO.L, 0L, new C_U(this));
                           if (var1 == null) {
                              break label105;
                           }
                        }

                        var10 = this;
                     }

                     var10.D();
                  }

                  // $VF: monitorexit
                  return;
               }
            }

            var10000 = (int[])var2;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   protected void D() {
      QB var2;
      int[] var10000 = WC_2.V();
      this.g();
      int[] var1 = var10000;
      var2 = this;
      label17:
      if (var1 == null) {
         if (this.e) {
            var2 = this;
            if (var1 != null) {
               break label17;
            }

            if (this.z != null) {
               this.Y();
            }
         }

         Toolkit.getDefaultToolkit().removeAWTEventListener(this.N);
         this.N = null;
         ON.x(this.f);
         this.f = null;
         this.z = null;
         this.b = null;
         this.E.hide();
         this.E = null;
         this.w = null;
         this.S();
         var2 = this;
      }

      var2.q$void();
   }

   protected void i() {
   }

   protected void f() {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void p(Runnable var1) {
      int[] var10000 = WC_2.V();
      Object var3 = this.i;
      synchronized (this.i){} // $VF: monitorenter 
      int[] var2 = var10000;

      try {
         label73: {
            label72: {
               label77: {
                  label70: {
                     boolean var7 = this.isShowing();
                     if (var2 == null) {
                        if (var7) {
                           var8 = this.q$boolean();
                           if (var2 != null) {
                              break label77;
                           }

                           if (!var8) {
                              break label70;
                           }
                        }

                        this.t.add(var1);
                     }

                     if (var2 == null) {
                        break label72;
                     }
                  }

                  var10000 = (int[])this;
                  if (var2 != null) {
                     break label73;
                  }

                  var8 = this.isShowing();
               }

               if (var8) {
                  var10000 = (int[])this;
                  if (var2 != null) {
                     break label73;
                  }

                  if (!this.k()) {
                     var1.run();
                  }
               }
            }

            var10000 = (int[])var3;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void T() {
      int[] var10000 = WC_2.V();
      Object var2 = this.i;
      synchronized (this.i){} // $VF: monitorenter 
      int[] var1 = var10000;

      try {
         Iterator var3 = this.t.iterator();

         while (true) {
            if (var3.hasNext()) {
               Runnable var4 = (Runnable)var3.next();
               var4.run();
               if (var1 != null) {
                  break;
               }

               if (var1 == null) {
                  continue;
               }
            }

            this.t.clear();
            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void b(Runnable var1) {
      int[] var10000 = WC_2.V();
      Object var3 = this.i;
      synchronized (this.i){} // $VF: monitorenter 
      int[] var2 = var10000;

      try {
         label38: {
            label37: {
               boolean var7 = this.isShowing();
               if (var2 == null) {
                  if (!var7) {
                     break label37;
                  }

                  this.K.add(var1);
               }

               if (var2 == null) {
                  break label38;
               }
            }

            var1.run();
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void q$void() {
      int[] var10000 = WC_2.V();
      Object var2 = this.i;
      synchronized (this.i){} // $VF: monitorenter 
      int[] var1 = var10000;

      try {
         Iterator var3 = this.K.iterator();

         while (true) {
            if (var3.hasNext()) {
               Runnable var4 = (Runnable)var3.next();
               var4.run();
               if (var1 != null) {
                  break;
               }

               if (var1 == null) {
                  continue;
               }
            }

            this.K.clear();
            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }

   public void e(Cg4 var1) {
      synchronized (this.i) {
         this.a.add(var1);
      }
   }

   public void j(Cg4 var1) {
      synchronized (this.i) {
         this.a.remove(var1);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void z$void() {
      int[] var10000 = WC_2.V();
      Object var2 = this.i;
      synchronized (this.i){} // $VF: monitorenter 
      int[] var1 = var10000;

      try {
         Iterator var3 = AL_2.J((Collection)this.a).iterator();

         while (true) {
            if (var3.hasNext()) {
               Cg4 var4 = (Cg4)var3.next();
               var4.Y();
               if (var1 != null) {
                  break;
               }

               if (var1 == null) {
                  continue;
               }
            }

            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void t() {
      int[] var10000 = WC_2.V();
      Object var2 = this.i;
      synchronized (this.i){} // $VF: monitorenter 
      int[] var1 = var10000;

      try {
         Iterator var3 = AL_2.J((Collection)this.a).iterator();

         while (true) {
            if (var3.hasNext()) {
               Cg4 var4 = (Cg4)var3.next();
               var4.h();
               if (var1 != null) {
                  break;
               }

               if (var1 == null) {
                  continue;
               }
            }

            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void g() {
      int[] var10000 = WC_2.V();
      Object var2 = this.i;
      synchronized (this.i){} // $VF: monitorenter 
      int[] var1 = var10000;

      try {
         Iterator var3 = AL_2.J((Collection)this.a).iterator();

         while (true) {
            if (var3.hasNext()) {
               Cg4 var4 = (Cg4)var3.next();
               var4.T();
               if (var1 != null) {
                  break;
               }

               if (var1 == null) {
                  continue;
               }
            }

            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void S() {
      int[] var10000 = WC_2.V();
      Object var2 = this.i;
      synchronized (this.i){} // $VF: monitorenter 
      int[] var1 = var10000;

      try {
         Iterator var3 = AL_2.J((Collection)this.a).iterator();

         while (true) {
            if (var3.hasNext()) {
               Cg4 var4 = (Cg4)var3.next();
               var4.H();
               if (var1 != null) {
                  break;
               }

               if (var1 == null) {
                  continue;
               }
            }

            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }

   public JWindow G$JWindow() {
      return (JWindow)SN.v(this.w);
   }

   public JWindow E(Component var1) {
      return (JWindow)SN.u(this.w, var1);
   }

   public JWindow C(int var1, int var2) {
      return (JWindow)SN.H(this.w, var1, var2);
   }

   public JWindow i(Component var1, int var2, int var3) {
      return (JWindow)SN.Q(this.w, var1, var2, var3);
   }

   public JWindow h(int var1) {
      return (JWindow)SN.W(this.w, var1);
   }

   public JWindow x(int var1) {
      return (JWindow)SN.G(this.w, var1);
   }

   public JWindow z$JWindow() {
      return (JWindow)SN.D(this.w);
   }

   public JWindow r(boolean var1) {
      return (JWindow)SN.g(this.w, var1);
   }

   @Override
   public Window S(boolean var1) {
      return this.r(var1);
   }

   @Override
   public Window X() {
      return this.z$JWindow();
   }

   @Override
   public Window o(int var1) {
      return this.x(var1);
   }

   @Override
   public Window U(int var1) {
      return this.h(var1);
   }

   @Override
   public Window A(Component var1, int var2, int var3) {
      return this.i(var1, var2, var3);
   }

   @Override
   public Window q(int var1, int var2) {
      return this.C(var1, var2);
   }

   @Override
   public Window I(Component var1) {
      return this.E(var1);
   }

   public Window F$Window() {
      return this.G$JWindow();
   }

   @Override
   public Window D(float var1) {
      return this.t(var1);
   }

   @Override
   public Window h(boolean var1) {
      return this.C(var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 212897127728810365L;
      long var10002 = 212897127728810349L ^ var0;
      byte var10001 = -1;
      p = var10002;
   }
}





