package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.C_7;
import com.finalshell.core.FN;
import com.finalshell.core.Gw2;
import com.finalshell.core.N62;
import com.finalshell.core.WC_2;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;

public class XW extends JComponent implements ActionListener {
   public List N;
   public BufferedImage Z;
   public BufferedImage X;
   public List I;
   public WC_2 R;
   public boolean u;
   public boolean O;
   public N62 e;
   public static String[] S;
   public static String a;

   public XW() {
      this(null, null);
   }

   public XW(BufferedImage var1) {
      this(var1, null);
   }

   public XW(BufferedImage var1, BufferedImage var2) {
   super();
      String[] var10000 = w();
      this.N = new ArrayList(1);
      this.Z = null;
      this.X = null;
      String[] var3 = var10000;
      this.I = new ArrayList();
      this.R = null;
      this.u = false;
      this.O = false;
      this.e = null;
      this.Z = var1;
      this.X = var2;
      FN.Y(this);
      this.setOpaque(false);
      if (var3 != null) {
         Ky4.K(new String[3]);
      }
   }

   public boolean C() {
      boolean var2;
      String[] var1 = w();
      WC_2 var10000 = this.R;
      if (var1 == null) {
         if (this.R == null) {
            return false;
         }

         var10000 = this.R;
      }

      var2 = var10000.i();
      if (var1 == null) {
         if (!var2) {
            return false;
         }

         var2 = this.u;
      }

      return var1 != null ? var2 : var2;
   }

   public boolean l() {
      return this.O;
   }

   public void b(boolean var1) {
      this.O = var1;
   }

   public BufferedImage R$BufferedImage() {
      return this.Z;
   }

   public void o(BufferedImage var1) {
      this.Z = var1;
   }

   public BufferedImage y() {
      return this.X;
   }

   public void m(BufferedImage var1) {
      this.X = var1;
   }

   public List p() {
      return this.I;
   }

   public N62 E() {
      String[] var1 = w();
      List var10000 = this.I;
      if (var1 == null) {
         if (this.I == null) {
            return null;
         }

         var10000 = this.I;
      }

      if (var1 != null) {
         return (N62)var10000;
      } else {
         return var10000.size() > 0 ? (N62)this.I.get(0) : null;
      }
   }

   public void C(N62 var1) {
      String[] var2 = w();
      List var10000 = this.I;
      if (var2 == null) {
         if (this.I == null) {
            this.I = new ArrayList();
         }

         var10000 = this.I;
      }

      var10000.add(var1);
   }

   public void W() {
      String[] var1 = w();
      List var10000 = this.I;
      if (var1 == null) {
         if (this.I == null) {
            return;
         }

         var10000 = this.I;
      }

      var10000.clear();
      this.I = null;
   }

   public void f(N62 var1) {
      String[] var2 = w();
      List var10000 = this.I;
      if (var2 == null) {
         if (this.I == null) {
            return;
         }

         var10000 = this.I;
      }

      var10000.remove(var1);
   }

   public void Z(N62 var1) {
      this.I = var1 != null ? AL_2.e(new N62[]{var1}) : null;
   }

   public void C(List var1) {
      this.I = var1;
   }

   public void W(N62[] var1) {
      ArrayList var3;
      label14: {
         String[] var2 = w();
         N62[] var10001 = var1;
         if (var2 == null) {
            if (var1 == null) {
               var3 = null;
               break label14;
            }

            var10001 = var1;
         }

         var3 = AL_2.e(var10001);
      }

      this.I = var3;
   }

   public void R$void() {
      String[] var1;
      XW var10000;
      label50: {
         label51: {
            var1 = w();
            var10000 = this;
            if (var1 == null) {
               if (this.R != null) {
                  var2 = this.R.i();
                  if (var1 != null) {
                     break label51;
                  }

                  if (var2 != 0) {
                     this.R.Y();
                     this.R = null;
                  }
               }

               var10000 = this;
            }

            if (var1 != null) {
               break label50;
            }

            var2 = var10000.N.size();
         }

         if (var2 > 0) {
            this.N.clear();
         }

         var10000 = this;
      }

      BufferedImage var3 = var10000.Z;
      if (var1 == null) {
         if (var10000.Z != null) {
            this.Z.flush();
            this.Z = null;
         }

         var3 = this.X;
      }

      if (var1 == null) {
         if (var3 == null) {
            return;
         }

         var3 = this.X;
      }

      var3.flush();
      this.X = null;
   }

   public void X(BufferedImage var1) {
      String[] var2 = w();
      XW var10000 = this;
      if (var2 == null) {
         if (this.C()) {
            return;
         }

         this.m(var1);
         var10000 = this;
      }

      var10000.x();
   }

   public void x() {
      long var2;
      XW var4;
      long var8;
      String[] var1;
      label76: {
         var1 = w();
         boolean var10000 = this.C();
         if (var1 == null) {
            if (var10000) {
               return;
            }

            var4 = this;
            if (var1 != null) {
               break label76;
            }

            var10000 = this.l();
         }

         if (var10000) {
            return;
         }

         var4 = this;
      }

      label61: {
         label78: {
            label59: {
               label58: {
                  if (var1 == null) {
                     if (var4.I != null) {
                        var5 = this.I.size();
                        if (var1 != null) {
                           break label59;
                        }

                        if (var5 > 0) {
                           break label58;
                        }
                     }

                     var4 = this;
                  }

                  var4.e = null;
                  if (var1 == null) {
                     break label78;
                  }
               }

               var5 = this.I.size();
            }

            byte var10001 = 1;
            if (var1 == null) {
               if (var5 == 1) {
                  this.e = (N62)this.I.get(0);
                  if (var1 == null) {
                     break label78;
                  }
               }

               var4 = this;
               if (var1 != null) {
                  break label61;
               }

               var5 = this.I.size();
               var10001 = 1;
            }

            if (var5 > var10001) {
               this.e = (N62)this.I.get(Gw2.K(this.I.size()));
            }
         }

         var4 = this;
      }

      label37: {
         N62 var7 = var4.e;
         if (var1 == null) {
            if (var4.e == null) {
               var8 = 0L;
               break label37;
            }

            var7 = this.e;
         }

         var8 = var7.y();
      }

      var2 = var8;
      this.R = new WC_2(a, var2, this);
      this.S();
      this.R.u$WC();
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      XW var10000;
      String[] var2 = w();
      var10000 = this;
      label18:
      if (var2 == null) {
         if (this.e != null) {
            var10000 = this;
            if (var2 != null) {
               break label18;
            }

            if (!this.e.J(this)) {
               return;
            }
         }

         this.R.Y();
         var10000 = this;
      }

      var10000.u();
   }

   public void d() {
      String[] var1 = w();
      if (var1 == null && this.R != null) {
         this.R.Y();
      }
   }

   public void u() {
      BufferedImage var1 = this.Z;
      this.Z = this.X;
      this.X = var1;
      this.e = null;
      this.repaint();
      this.r();
   }

   @Override
   public void paintComponent(Graphics var1) {
      String[] var2;
      XW var4;
      Graphics2D var3;
      BufferedImage var5;
      label35: {
         String[] var10000 = w();
         super.paintComponent(var1);
         var2 = var10000;
         var3 = (Graphics2D)var1;
         var4 = this;
         label34:
         if (var2 == null) {
            if (this.e != null) {
               var4 = this;
               if (var2 != null) {
                  break label34;
               }

               if (this.e.X()) {
                  var5 = this.Z;
                  if (var2 != null) {
                     break label35;
                  }

                  if (this.Z != null) {
                     var5 = this.X;
                     if (var2 != null) {
                        break label35;
                     }

                     if (this.X != null) {
                        this.e.D(var3, this);
                        if (var2 == null) {
                           return;
                        }
                     }
                  }
               }
            }

            var4 = this;
         }

         var5 = var4.Z;
      }

      if (var5 != null) {
         var3.drawImage(this.Z, 0, 0, this.getWidth(), this.getHeight(), null);
      }
   }

   @Override
   public Dimension getPreferredSize() {
      String[] var1 = w();
      BufferedImage var10000 = this.Z;
      if (var1 == null) {
         if (this.Z != null) {
            return new Dimension(this.Z.getWidth(), this.Z.getHeight());
         }

         var10000 = this.X;
      }

      return var10000 != null ? new Dimension(this.X.getWidth(), this.X.getHeight()) : new Dimension(0, 0);
   }

   public void s(C_7 var1) {
      this.N.add(var1);
   }

   public void Q(C_7 var1) {
      this.N.remove(var1);
   }

   public void S() {
      String[] var10000 = w();
      Iterator var2 = AL_2.J((Collection)this.N).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         C_7 var3 = (C_7)var2.next();
         var3.X();
         if (var1 != null) {
            break;
         }
      }
   }

   public void r() {
      String[] var10000 = w();
      Iterator var2 = AL_2.J((Collection)this.N).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         C_7 var3 = (C_7)var2.next();
         var3.L();
         if (var1 != null) {
            break;
         }
      }
   }

   public static void N(String[] var0) {
      S = var0;
   }

   public static String[] w() {
      return S;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var8;
      if (w() != null) {
         N(new String[4]);
      }

      char[] var10003 = "9VK\u000e:\u000f'\u0011UY\u0000+2:\u001e\u0015K\u0007664\u0004TX".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 14;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 14;
         var10006 = var0;
      } else {
         var6 = 14;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 14;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 126;
               break;
            case 1:
               var23 = 53;
               break;
            case 2:
               var23 = 36;
               break;
            case 3:
               var23 = 103;
               break;
            case 4:
               var23 = 81;
               break;
            case 5:
               var23 = 85;
               break;
            default:
               var23 = 91;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               var8 = new String(var10002).intern();
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





