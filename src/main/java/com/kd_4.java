package com;

import java.awt.Insets;
import java.awt.Point;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class kd_4 extends com.kE_3 {
   public static ImageIcon o;
   public static ImageIcon Y;
   public static ImageIcon t;
   private boolean T;
   private boolean V;
   private boolean g;
   private int Z;
   private int z;
   private boolean x;
   private int E;
   private boolean B;
   private File J;
   private File S;

   public kd_4() {
      this(com.Cz_2.f());
   }

   public kd_4(String var1) {
      this(new File(var1));
   }

   public kd_4(File var1) {
      this.T = com.oW_3.E;
      this.V = com.oW_3.c;
      this.g = com.oW_3.b;
      this.Z = com.oW_3.G;
      this.z = com.oW_3.K;
      this.x = com.oW_3.U;
      this.E = com.oW_3.x;
      this.B = com.oW_3.I;
      this.H();
      this.h(var1);
   }

   public kd_4(boolean var1) {
      super(var1);
      this.T = com.oW_3.E;
      this.V = com.oW_3.c;
      this.g = com.oW_3.b;
      this.Z = com.oW_3.G;
      this.z = com.oW_3.K;
      this.x = com.oW_3.U;
      this.E = com.oW_3.x;
      this.B = com.oW_3.I;
      this.H();
      this.h(com.Cz_2.f());
   }

   public kd_4(String var1, boolean var2) {
      this(new File(var1), var2);
   }

   public kd_4(File var1, boolean var2) {
      super(var2);
      com.kE_3.v();
      this.T = com.oW_3.E;
      this.V = com.oW_3.c;
      this.g = com.oW_3.b;
      this.Z = com.oW_3.G;
      this.z = com.oW_3.K;
      this.x = com.oW_3.U;
      this.E = com.oW_3.x;
      this.B = com.oW_3.I;
      this.H();
      this.h(var1);
      if (com.ky_4.F() != null) {
         com.kE_3.O("Ikll7b");
      }
   }

   private void H() {
      this.b(com.oW_3.d);
   }

   public File K() {
      return this.J;
   }

   public void q(String var1) {
      this.h(new File(var1));
   }

   public void h(File var1) {
      this.J = var1.getAbsoluteFile();
      this.u(var1);
   }

   public File D() {
      return this.S;
   }

   public void Z(String var1) {
      this.u(new File(var1));
   }

   public void u(File var1) {
      com.kd_4 var4;
      String var10000 = com.kE_3.v();
      var1 = var1.getAbsoluteFile();
      String var2 = var10000;
      var4 = this;
      label17:
      if (var2 == null) {
         if (!com.Cz_2.n(this.J, var1)) {
            var4 = this;
            if (var2 != null) {
               break label17;
            }

            if (!com.Cz_2.Z(this.J, var1)) {
               this.J = com.Cz_2.x(var1);
            }
         }

         this.S = var1;
         var4 = this;
      }

      var4.g();
   }

   public boolean w() {
      return this.T;
   }

   public void c(boolean var1) {
      this.T = var1;
      this.g();
   }

   public boolean p() {
      return this.V;
   }

   public void u(boolean var1) {
      this.V = var1;
      this.g();
   }

   public boolean U() {
      return this.g;
   }

   public void L(boolean var1) {
      this.g = var1;
      this.g();
   }

   public int h() {
      return this.Z;
   }

   public void m(int var1) {
      this.Z = var1;
      this.g();
   }

   public int P() {
      return this.z;
   }

   public void X(int var1) {
      this.z = var1;
   }

   public boolean G() {
      return this.x;
   }

   public void k(boolean var1) {
      this.x = var1;
      this.g();
   }

   public int e() {
      return this.E;
   }

   public void E(int var1) {
      this.E = var1;
   }

   public boolean M() {
      return this.B;
   }

   public void o(boolean var1) {
      this.B = var1;
   }

   private void g() {
      this.U(false);
      this.removeAll();
      String var10000 = com.kE_3.v();
      File var2 = this.S;
      String var1 = var10000;

      while (true) {
         if (!com.Cz_2.n(var2, this.J)) {
            this.Y(var2);
            var2 = var2.getParentFile();
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         this.Y(this.J);
         this.U(true);
         break;
      }
   }

   private void Y(File var1) {
      String var2 = com.kE_3.v();
      byte var10000 = var1.isDirectory();
      if (var2 == null) {
         if (var10000 != 0) {
            int var3 = this.x;
            com.KR var4 = new com.KR();
            int var11 = this.T;
            if (var2 == null) {
               if (this.T) {
                  var4.setIcon(com.Cz_2.B(var1));
               }

               var11 = this.V;
            }

            label115: {
               if (var2 == null) {
                  if (var11) {
                     String var6;
                     label101: {
                        label118: {
                           String var5 = com.Cz_2.X(var1);
                           var6 = com.Cz_2.b(var5, this.Z);
                           var11 = var3;
                           if (var2 == null) {
                              if (var3 == 0) {
                                 break label118;
                              }

                              var11 = var6.length();
                           }

                           if (var2 != null) {
                              break label101;
                           }

                           if (var11 != var5.length()) {
                              var11 = 1;
                              break label101;
                           }
                        }

                        var11 = 0;
                     }

                     var3 = var11;
                     var4.setText(var6);
                  }

                  if (var2 != null) {
                     break label115;
                  }

                  var11 = this.g;
               }

               if (var11) {
                  this.T(var1, var4, (boolean)var3);
               }

               var4.addActionListener(new _W(this, var1, var4));
               this.add(var4, 0);
            }

            if (var2 == null) {
               return;
            }
         }

         var10000 = this.x;
      }

      int var7 = var10000;
      com.Ov_2 var8 = new com.Ov_2();
      int var13 = this.T;
      if (var2 == null) {
         if (this.T) {
            var8.setIcon(com.Cz_2.B(var1));
         }

         var13 = this.V;
      }

      if (var2 == null) {
         if (var13) {
            String var10;
            label74: {
               label122: {
                  String var9 = com.Cz_2.X(var1);
                  var10 = com.Cz_2.b(var9, this.Z);
                  var13 = var7;
                  if (var2 == null) {
                     if (var7 == 0) {
                        break label122;
                     }

                     var13 = var10.length();
                  }

                  if (var2 != null) {
                     break label74;
                  }

                  if (var13 != var9.length()) {
                     var13 = 1;
                     break label74;
                  }
               }

               var13 = 0;
            }

            var7 = var13;
            var8.setText(var10);
         }

         if (var2 != null) {
            return;
         }

         var13 = this.g;
      }

      if (var13) {
         this.T(var1, var8, (boolean)var7);
      }

      this.add(var8, 0);
   }

   private void I(File[] var1, com.KR var2) {
      com.A.E var4;
      com.CI var5;
      label17: {
         SZ var7;
         Point var8;
         Insets var9;
         label16: {
            var4 = new com.A.E(com.FN.L(var2));
            var4.W(true);
            var4.setAlwaysOnTop(true);
            var5 = new com.CI(var1);
            var5.d(true);
            String var10000 = com.kE_3.v();
            var5.setSelectedIndex(0);
            var5.setVisibleRowCount(Math.min(this.E, var1.length));
            var5.setCellRenderer(new com.OB(this));
            H8 var6 = new H8(this, var5);
            var5.addMouseListener(var6);
            var5.addKeyListener(new com.dM_3(this, var2));
            var7 = new SZ(var5);
            var7.G(0);
            String var3 = var10000;
            var7.r(false);
            var4.add(var7);
            var4.applyComponentOrientation(this.getComponentOrientation());
            var4.pack();
            var8 = var2.getLocationOnScreen();
            var9 = var5.f().getBorder().getBorderInsets(var5);
            if (var3 == null) {
               if (!this.getComponentOrientation().isLeftToRight()) {
                  break label16;
               }

               var4.setLocation(var8.x + var2.getInsets().left - var7.getInsets().left - var9.left, var8.y + var2.getHeight() + 2);
            }

            if (var3 == null) {
               break label17;
            }
         }

         var4.setLocation(
            var8.x + var2.getWidth() - var2.getInsets().right - var7.getWidth() + var7.getInsets().right + var9.right, var8.y + var2.getHeight() + 2
         );
      }

      var4.setVisible(true);
      var5.requestFocusInWindow();
   }

   private void T(File var1, JComponent var2, boolean var3) {
      String var10000 = com.kE_3.v();
      com.ky_4 var5 = new com.ky_4(new com.TO(4, 4));
      String var4 = var10000;
      var5.setOpaque(false);
      boolean var6 = var3;
      if (var4 == null) {
         if (var3) {
            var5.add(new com.O_(com.Cz_2.X(var1), com.Cz_2.B(var1)));
            var5.add(new com.cH_3(false, 0, true));
         }

         var5.add(new com.O_(com.Cz_2.T(var1), o));
         if (var4 != null) {
            return;
         }

         var6 = com.Cz_2.V(var1);
      }

      if (var6) {
         var5.add(new com.O_(com.Cz_2.F(var1), Y));
         var5.add(new com.O_(com.Cz_2.n(var1), t));
      }

      com.ac_2.k(var2, var5);
      var2.addAncestorListener(new com.FQ(this, var2));
   }

   static void I(com.kd_4 var0, File[] var1, com.KR var2) {
      var0.I(var1, var2);
   }

   static int L(com.kd_4 var0) {
      return var0.z;
   }

   static boolean M(com.kd_4 var0) {
      return var0.B;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "&`x\u0006wNI&orGp\u0018_*-g\u0006c\u0013&`x\u0006wNI&orG`\u0000[*-g\u0006c\u0013&`x\u0006wNI&orGw\bU*-g\u0006c";
      int var5 = "&`x\u0006wNI&orGp\u0018_*-g\u0006c\u0013&`x\u0006wNI&orG`\u0000[*-g\u0006c\u0013&`x\u0006wNI&orGw\bU*-g\u0006c".length();
      char var2 = 19;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 122;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 122;
               var10006 = var6;
            } else {
               var13 = 122;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 122;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 53;
                     break;
                  case 1:
                     var29 = 121;
                     break;
                  case 2:
                     var29 = 109;
                     break;
                  case 3:
                     var29 = 18;
                     break;
                  case 4:
                     var29 = 126;
                     break;
                  case 5:
                     var29 = 27;
                     break;
                  default:
                     var29 = 85;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            o = new ImageIcon(com.kd_4.class.getResource(var0[0]));
            Y = new ImageIcon(com.kd_4.class.getResource(var0[1]));
            t = new ImageIcon(com.kd_4.class.getResource(var0[2]));
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}





