package com.L;

import com.GA;
import com.GO;
import com.X9;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseWheelListener;
import java.beans.PropertyChangeListener;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.ComboPopup;

public class m extends BasicComboBoxUI implements com.W2, com.L0 {
   protected static ListCellRenderer U;
   protected ImageIcon r = Z.W;
   protected ImageIcon G = Z.X;
   protected int u = Z.Q;
   protected boolean X = Z.e;
   protected boolean R = Z.i;
   protected Color L = Z.c;
   protected int D = Z.P;
   protected int E = Z.N;
   protected boolean M = Z.F;
   protected Color g;
   protected Color a;
   protected boolean b;
   protected boolean f;
   protected boolean m;
   protected com.KD S;
   protected MouseWheelListener W;
   protected X9 J;
   protected PropertyChangeListener z;
   protected PropertyChangeListener O;
   private static com.ky_4[] y;
   private static final String[] c;
   private static final String[] d;
   private static final long e;

   public m() {
      this.g = Z.a;
      this.a = Z.E;
      this.b = Z.s;
      this.f = Z.L;
      this.m = false;
      this.S = null;
      this.W = null;
      this.J = null;
      this.z = null;
      this.O = null;
   }

   public static ComponentUI createUI(JComponent var0) {
      return new m();
   }

   @Override
   public void installUI(JComponent var1) {
      com.ky_4[] var10000 = X();
      super.installUI(var1);
      com.ky_4[] var2 = var10000;
      com.FN.Y(this.comboBox);
      this.comboBox.setFocusable(true);
      LookAndFeel.installProperty(this.comboBox, a(-1125, 2846), Boolean.FALSE);
      this.h();
      JComboBox var3 = this.comboBox;
      if (var2 == null) {
         if (!(this.comboBox.getRenderer() instanceof com.L.Q)) {
            this.comboBox.setRenderer(new com.L.Q());
         }

         this.W = new com.L.Y(this);
         this.comboBox.addMouseWheelListener(this.W);
         this.J = new B(this);
         this.w(this.comboBox.getRenderer());
         this.z = new J(this);
         this.comboBox.addPropertyChangeListener(a(-1123, 6457), this.z);
         this.O = new V(this);
         var3 = this.comboBox;
      }

      var3.addPropertyChangeListener(a(-1133, 29729), this.O);
      if (com.ky_4.F() != null) {
         Q(new com.ky_4[2]);
      }
   }

   @Override
   public void uninstallUI(JComponent var1) {
      this.comboBox.removePropertyChangeListener(a(-1124, 1106), this.O);
      this.comboBox.removePropertyChangeListener(a(-1128, -23818), this.z);
      this.m(this.comboBox.getRenderer());
      this.J = null;
      var1.removeMouseWheelListener(this.W);
      this.W = null;
      this.S = null;
      super.uninstallUI(var1);
   }

   @Override
   public void h() {
      com.ky_4[] var1 = X();
      if (!com.FN.l((JComponent)this.comboBox)) {
         Insets var2 = new Insets(0, 0, 0, 0);
         m var10000 = this;
         if (var1 == null) {
            if (this.X) {
               var2.top = var2.top + this.E + 1;
               var2.left = var2.left + this.E + 1;
               var2.bottom = var2.bottom + this.E + 1;
               var2.right = var2.right + this.E + 1;
            }

            var10000 = this;
         }

         var10000.comboBox.setBorder(GA.y(var2));
      }
   }

   protected void w(Object var1) {
      com.ky_4[] var2 = X();
      Object var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (!(var10000 instanceof com.L.Q)) {
            return;
         }

         var10000 = var1;
      }

      ((com.L.Q)var10000).O(this.J);
   }

   protected void m(Object var1) {
      com.ky_4[] var2 = X();
      Object var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (!(var10000 instanceof com.L.Q)) {
            return;
         }

         var10000 = var1;
      }

      ((com.L.Q)var10000).m(this.J);
   }

   @Override
   protected void installComponents() {
      com.ky_4[] var10000 = X();
      this.comboBox.setLayout(this.createLayoutManager());
      com.ky_4[] var1 = var10000;
      this.arrowButton = this.createArrowButton();
      this.comboBox.add(this.arrowButton, a(-1121, -1067));
      m var2 = this;
      if (var1 == null) {
         if (this.arrowButton != null) {
            this.configureArrowButton();
         }

         var2 = this;
      }

      JComboBox var3 = var2.comboBox;
      if (var1 == null) {
         if (var2.comboBox.isEditable()) {
            this.addEditor();
         }

         var3 = this.comboBox;
      }

      var3.add(this.currentValuePane, a(-1126, -3845));
   }

   @Override
   protected ComboBoxEditor createEditor() {
      ComboBoxEditor var2;
      Component var7;
      label25: {
         com.ky_4[] var10000 = X();
         var2 = super.createEditor();
         com.ky_4[] var1 = var10000;
         Component var3 = var2.getEditorComponent();
         var3.addFocusListener(new com.L.O(this));
         boolean var6 = var3 instanceof JComponent;
         if (var1 == null) {
            if (var6) {
               ((JComponent)var3).setOpaque(false);
            }

            var7 = var3;
            if (var1 != null) {
               break label25;
            }

            var6 = var3 instanceof JTextField;
         }

         if (!var6) {
            return var2;
         }

         var7 = var3;
      }

      JTextField var4 = (JTextField)var7;
      com.QH var5 = new com.QH();
      var5.R(false);
      var4.setUI(var5);
      var4.setMargin(new Insets(0, 1, 0, 1));
      return var2;
   }

   @Override
   protected JButton createArrowButton() {
      this.S = new com.KD();
      this.S.G(true);
      this.S.r(false);
      this.S.t(false);
      this.S.setName(a(-1135, 25609));
      this.S.setIcon(this.r);
      this.S.O(this.u);
      return this.S;
   }

   @Override
   public void configureArrowButton() {
      com.ky_4[] var10000 = X();
      super.configureArrowButton();
      com.ky_4[] var1 = var10000;
      JButton var2 = this.arrowButton;
      if (var1 == null) {
         if (this.arrowButton == null) {
            return;
         }

         var2 = this.arrowButton;
      }

      var2.setFocusable(false);
   }

   @Override
   protected ComboPopup createPopup() {
      return new com.L.c(this, this.comboBox);
   }

   public boolean M() {
      com.ky_4[] var1 = X();
      Object var10000 = this.comboBox;
      if (var1 == null) {
         if (this.comboBox == null) {
            return false;
         }

         var10000 = this.comboBox.getClientProperty(a(-1122, -4085));
      }

      Object var2 = var10000;
      var10000 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return false;
         }

         var10000 = var2;
      }

      boolean var4 = (Boolean)var10000;
      return var1 != null ? var4 : var4;
   }

   @Override
   public Shape B() {
      com.ky_4[] var1 = X();
      m var10000 = this;
      if (var1 == null) {
         if (this.X) {
            return GA.X(this.comboBox, this.E, this.D);
         }

         var10000 = this;
      }

      return com.FN.N(var10000.comboBox);
   }

   public void m(int var1) {
      com.ky_4[] var2 = X();
      Component var10000 = this.editor;
      if (var2 == null) {
         if (!(this.editor instanceof JTextField)) {
            return;
         }

         var10000 = this.editor;
      }

      ((JTextField)var10000).setColumns(var1);
   }

   public boolean m() {
      return this.m;
   }

   public void G(boolean var1) {
      this.m = var1;
      this.isMinimumSizeDirty = true;
      this.comboBox.revalidate();
   }

   public ImageIcon d() {
      return this.r;
   }

   public void k(ImageIcon var1) {
      com.ky_4[] var10000 = X();
      this.r = var1;
      com.ky_4[] var2 = var10000;
      m var3 = this;
      if (var2 == null) {
         if (this.S == null) {
            return;
         }

         var3 = this;
      }

      if (var2 == null) {
         if (var3.isPopupVisible(this.comboBox)) {
            return;
         }

         var3 = this;
      }

      var3.S.setIcon(var1);
   }

   public ImageIcon L() {
      return this.G;
   }

   public void h(ImageIcon var1) {
      com.ky_4[] var10000 = X();
      this.G = var1;
      com.ky_4[] var2 = var10000;
      m var3 = this;
      if (var2 == null) {
         if (this.S == null) {
            return;
         }

         var3 = this;
      }

      if (var2 == null) {
         if (!var3.isPopupVisible(this.comboBox)) {
            return;
         }

         var3 = this;
      }

      var3.S.setIcon(var1);
   }

   public int B$int() {
      return this.u;
   }

   public void D(int var1) {
      com.ky_4[] var10000 = X();
      this.u = var1;
      com.ky_4[] var2 = var10000;
      if (var2 == null && this.S != null) {
         this.S.O(var1);
      }
   }

   public boolean k() {
      return this.X;
   }

   public void n(boolean var1) {
      this.X = var1;
      this.h();
   }

   public boolean J() {
      return this.R;
   }

   public void E(boolean var1) {
      this.R = var1;
   }

   public Color U() {
      return this.L;
   }

   public void l(Color var1) {
      this.L = var1;
   }

   public boolean f() {
      return this.M;
   }

   public void a(boolean var1) {
      this.M = var1;
   }

   public int N() {
      return this.D;
   }

   public void P(int var1) {
      this.D = var1;
   }

   public int J$int() {
      return this.E;
   }

   public void A(int var1) {
      this.E = var1;
      this.h();
   }

   public boolean G() {
      return this.b;
   }

   public void W(boolean var1) {
      this.b = var1;
   }

   public boolean I() {
      return this.f;
   }

   public void T(boolean var1) {
      this.f = var1;
   }

   public Paint P() {
      return this.g;
   }

   public Paint S() {
      return this.a;
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      com.ky_4[] var10000 = X();
      this.hasFocus = this.comboBox.hasFocus();
      Rectangle var4 = this.rectangleForCurrentValue();
      com.ky_4[] var3 = var10000;
      this.paintCurrentValueBackground(var1, var4, this.hasFocus);
      m var5 = this;
      if (var3 == null) {
         if (this.comboBox.isEditable()) {
            return;
         }

         var5 = this;
      }

      var5.paintCurrentValue(var1, var4, this.hasFocus);
   }

   @Override
   public void paintCurrentValueBackground(Graphics var1, Rectangle var2, boolean var3) {
      com.ky_4[] var4;
      Graphics2D var5;
      label95: {
         com.ky_4[] var10000 = X();
         var5 = (Graphics2D)var1;
         var4 = var10000;
         boolean var14 = this.X;
         if (var4 == null) {
            if (this.X) {
               label87: {
                  label86: {
                     boolean var15 = this.M;
                     if (var4 == null) {
                        if (!this.M) {
                           break label86;
                        }

                        var15 = this.Y();
                     }

                     if (var15) {
                        var16 = GO.c;
                        break label87;
                     }
                  }

                  var16 = GO.r;
               }

               Color var6;
               Color var8;
               boolean var10006;
               label77: {
                  label97: {
                     var6 = var16;
                     boolean var7 = this.isPopupVisible(this.comboBox);
                     var8 = !var7 ? this.comboBox.getBackground() : this.L;
                     var10006 = this.R;
                     if (var4 == null) {
                        if (!this.R) {
                           break label97;
                        }

                        var10006 = var7;
                     }

                     if (var4 != null) {
                        break label77;
                     }

                     if (!var10006) {
                        var10006 = true;
                        break label77;
                     }
                  }

                  var10006 = false;
               }

               GA.Z(var5, this.comboBox, var6, this.E, this.D, true, var10006, GO.Ff, GO.FX, var8, 1.0F);
               if (var4 == null) {
                  break label95;
               }
            }

            var14 = this.isPopupVisible(this.comboBox);
         }

         boolean var9 = var14;
         Rectangle var11 = com.FN.N(this.comboBox);
         var5.setPaint(new GradientPaint(0.0F, (float)this.E, var9 ? GO.Fm : GO.FR, 0.0F, (float)(this.comboBox.getHeight() - this.E), var9 ? GO.Fo : GO.Q));
         var5.fillRect(var11.x, var11.y, var11.width, var11.height);
      }

      int var17 = this.comboBox.isEditable();
      if (var4 == null) {
         if (var17 == 0) {
            return;
         }

         var17 = this.comboBox.getComponentOrientation().isLeftToRight();
      }

      Insets var12;
      label56: {
         byte var10 = (byte)var17;
         var12 = this.comboBox.getInsets();
         var17 = var10;
         if (var4 == null) {
            if (var10 != 0) {
               var17 = this.comboBox.getWidth() - var12.right - this.S.getWidth() - 1;
               break label56;
            }

            var17 = var12.left;
         }

         var17 += this.S.getWidth();
      }

      int var13 = var17;
      var5.setPaint(this.comboBox.isEnabled() ? GO.N : GO.FX);
      var5.drawLine(var13, var12.top + 1, var13, this.comboBox.getHeight() - var12.bottom - 2);
   }

   protected boolean Y() {
      return com.FN.l((Component)this.comboBox);
   }

   @Override
   public void paintCurrentValue(Graphics var1, Rectangle var2, boolean var3) {
      com.ky_4[] var4;
      Component var6;
      label41: {
         ListCellRenderer var5;
         label40: {
            com.ky_4[] var10000 = X();
            var5 = this.comboBox.getRenderer();
            var4 = var10000;
            boolean var12 = var3;
            if (var4 == null) {
               if (!var3) {
                  break label40;
               }

               var12 = this.isPopupVisible(this.comboBox);
            }

            if (!var12) {
               var6 = var5.getListCellRendererComponent(this.listBox, this.comboBox.getSelectedItem(), -1, true, false);
               if (var4 == null) {
                  break label41;
               }

               com.ky_4.K(new String[5]);
            }
         }

         var6 = var5.getListCellRendererComponent(this.listBox, this.comboBox.getSelectedItem(), -1, false, false);
         var6.setBackground(UIManager.getColor(a(-1134, 29385)));
      }

      label30: {
         var6.setFont(this.comboBox.getFont());
         Object var13 = this.comboBox;
         if (var4 == null) {
            if (this.comboBox.isEnabled()) {
               var6.setForeground(this.comboBox.getForeground());
               var6.setBackground(this.comboBox.getBackground());
               if (var4 == null) {
                  break label30;
               }
            }

            var6.setForeground(UIManager.getColor(a(-1136, -25605)));
            var13 = var6;
         }

         var13.setBackground(UIManager.getColor(a(-1127, 26858)));
      }

      boolean var7 = false;
      int var14 = var6 instanceof JPanel;
      if (var4 == null) {
         if (var14 != 0) {
            var7 = true;
         }

         var14 = var2.x;
      }

      int var8 = var14;
      int var9 = var2.y;
      int var10 = var2.width;
      int var11 = var2.height;
      this.currentValuePane.paintComponent(var1, var6, this.comboBox, var8, var9, var10, var11, var7);
   }

   @Override
   protected LayoutManager createLayoutManager() {
      return new t(this);
   }

   @Override
   public Dimension getMinimumSize(JComponent var1) {
      com.ky_4[] var2 = X();
      m var10000 = this;
      if (var2 == null) {
         if (!this.isMinimumSizeDirty) {
            return new Dimension(this.cachedMinimumSize);
         }

         var10000 = this;
      }

      Dimension var3 = var10000.getDisplaySize();
      Insets var4 = this.getInsets();
      int var5 = this.arrowButton.getPreferredSize().width;
      var3.height = var3.height + var4.top + var4.bottom;
      var3.width = var3.width + var4.left + var4.right + 1 + var5;
      this.cachedMinimumSize.setSize(var3.width, var3.height);
      this.isMinimumSizeDirty = false;
      return new Dimension(var3);
   }

   @Override
   protected Dimension getDisplaySize() {
      com.ky_4[] var10000 = X();
      Dimension var2 = new Dimension();
      com.ky_4[] var1 = var10000;
      Object var3 = this.comboBox.getRenderer();
      var10000 = (com.ky_4[])var3;
      if (var1 == null) {
         if (var3 == null) {
            var3 = new DefaultListCellRenderer();
         }

         var10000 = (com.ky_4[])this.comboBox.getPrototypeDisplayValue();
      }

      label82: {
         label83: {
            label84: {
               label74: {
                  Object var4 = var10000;
                  if (var1 == null) {
                     if (var4 == null) {
                        break label74;
                     }

                     var2 = this.getSizeForComponent(var3.getListCellRendererComponent(this.listBox, var4, -1, false, false));
                  }

                  if (var1 == null) {
                     break label84;
                  }
               }

               ComboBoxModel var5 = this.comboBox.getModel();
               int var6 = var5.getSize();
               var16 = var6;
               if (var1 == null) {
                  if (var6 > 0) {
                     byte var17 = this.m;
                     if (var1 == null) {
                        if (this.m) {
                           Object var8 = var5.getElementAt(0);
                           Component var9 = var3.getListCellRendererComponent(this.listBox, var8, -1, false, false);
                           Dimension var7 = this.getSizeForComponent(var9);
                           var2.width = Math.max(var2.width, var7.width);
                           var2.height = Math.max(var2.height, var7.height);
                           if (var1 == null) {
                              break label84;
                           }
                        }

                        var17 = 0;
                     }

                     int var13 = var17;

                     while (var13 < var6) {
                        Object var14 = var5.getElementAt(var13);
                        Component var10 = var3.getListCellRendererComponent(this.listBox, var14, -1, false, false);
                        Dimension var12 = this.getSizeForComponent(var10);
                        var2.width = Math.max(var2.width, var12.width);
                        var2.height = Math.max(var2.height, var12.height);
                        var13++;
                        if (var1 != null) {
                           break label84;
                        }

                        if (var1 != null) {
                           break;
                        }
                     }

                     if (var1 == null) {
                        break label84;
                     }
                  }

                  var2 = this.getDefaultSize();
                  var16 = this.comboBox.isEditable();
               }

               if (var1 != null) {
                  break label83;
               }

               if (var16 != 0) {
                  var2.width = (int)e;
               }
            }

            var18 = this.comboBox;
            if (var1 != null) {
               break label82;
            }

            var16 = this.comboBox.isEditable();
         }

         if (var16 == 0) {
            return var2;
         }

         var18 = this.editor;
      }

      Dimension var11 = var18.getPreferredSize();
      var2.width = Math.max(var2.width, var11.width);
      var2.height = Math.max(var2.height, var11.height);
      return var2;
   }

   @Override
   protected Dimension getDefaultSize() {
      return this.getSizeForComponent(L().getListCellRendererComponent(this.listBox, " ", -1, false, false));
   }

   @Override
   protected Rectangle rectangleForCurrentValue() {
      com.ky_4[] var10000 = X();
      int var2 = this.comboBox.getWidth();
      com.ky_4[] var1 = var10000;
      int var3 = this.comboBox.getHeight();
      Insets var4 = this.comboBox.getInsets();
      int var5 = var3 - (var4.top + var4.bottom);
      m var6 = this;
      if (var1 == null) {
         if (this.arrowButton != null) {
            var5 = this.arrowButton.getWidth();
         }

         var6 = this;
      }

      return var6.comboBox.getComponentOrientation().isLeftToRight()
         ? new Rectangle(var4.left, var4.top, var2 - (var4.left + var4.right + var5) - 1, var3 - (var4.top + var4.bottom))
         : new Rectangle(var4.left + var5 + 1, var4.top, var2 - (var4.left + var4.right + var5), var3 - (var4.top + var4.bottom));
   }

   protected static ListCellRenderer L$ListCellRenderer() {
      com.ky_4[] var0 = X();
      ListCellRenderer var10000 = U;
      if (var0 == null) {
         if (U == null) {
            U = new com.L.Q();
         }

         var10000 = U;
      }

      return var10000;
   }

   @Override
   protected Dimension getSizeForComponent(Component var1) {
      this.currentValuePane.add(var1);
      var1.setFont(this.comboBox.getFont());
      Dimension var2 = var1.getPreferredSize();
      this.currentValuePane.remove(var1);
      return var2;
   }

   static JComboBox F(m var0) {
      return var0.comboBox;
   }

   static JComboBox B(m var0) {
      return var0.comboBox;
   }

   static JComboBox M(m var0) {
      return var0.comboBox;
   }

   static JComboBox C(m var0) {
      return var0.comboBox;
   }

   static JComboBox a(m var0) {
      return var0.comboBox;
   }

   static JList I(m var0) {
      return var0.listBox;
   }

   static boolean x(m var0, boolean var1) {
      return var0.isMinimumSizeDirty = var1;
   }

   static JComboBox o(m var0) {
      return var0.comboBox;
   }

   static JList O(m var0) {
      return var0.listBox;
   }

   static JComboBox h(m var0) {
      return var0.comboBox;
   }

   static JList Z(m var0) {
      return var0.listBox;
   }

   static JComboBox v(m var0) {
      return var0.comboBox;
   }

   static JComboBox R(m var0) {
      return var0.comboBox;
   }

   static JButton v$JButton(m var0) {
      return var0.arrowButton;
   }

   static Insets O$Insets(m var0) {
      return var0.getInsets();
   }

   static JButton N(m var0) {
      return var0.arrowButton;
   }

   static JButton I$JButton(m var0) {
      return var0.arrowButton;
   }

   static JButton D(m var0) {
      return var0.arrowButton;
   }

   static Component i(m var0) {
      return var0.editor;
   }

   static Component W(m var0) {
      return var0.editor;
   }

   public static void Q(com.ky_4[] var0) {
      y = var0;
   }

   public static com.ky_4[] X() {
      return y;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var7 = new String[12];
      int var5 = 0;
      Q(null);
      String var4 = "=I¿\u0006i\u0004ÐlÊ\u0019\b¤bØ\u00025tø²\u001b\u0018ß[ø,Ý\u009a»Jz(<\u008e\n\u0082¿Ë\u009f\u00184×\u009c;iÍ)¨\u001bø³mÓ¥{*ð\u0082¬\u00adå\u000b2¯Ò \u001bP\u008a]\u0087\u009bj\f\u008e§\u0003\u008c\u008e¨\u0007Bþþý\u0016Zµ\b=/ë«SA4\u0014\u0013Y«sv)\f:\u0081^;¢ÂÜÂ\u009d\tä.Ë\u0007N\u0093\u007fP&ï³";
      int var6 = "=I¿\u0006i\u0004ÐlÊ\u0019\b¤bØ\u00025tø²\u001b\u0018ß[ø,Ý\u009a»Jz(<\u008e\n\u0082¿Ë\u009f\u00184×\u009c;iÍ)¨\u001bø³mÓ¥{*ð\u0082¬\u00adå\u000b2¯Ò \u001bP\u008a]\u0087\u009bj\f\u008e§\u0003\u008c\u008e¨\u0007Bþþý\u0016Zµ\b=/ë«SA4\u0014\u0013Y«sv)\f:\u0081^;¢ÂÜÂ\u009d\tä.Ë\u0007N\u0093\u007fP&ï³"
         .length();
      char var3 = 3;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 55;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 36;
                        break;
                     case 1:
                        var50 = 65;
                        break;
                     case 2:
                        var50 = 75;
                        break;
                     case 3:
                        var50 = 26;
                        break;
                     case 4:
                        var50 = 80;
                        break;
                     case 5:
                        var50 = 60;
                        break;
                     default:
                        var50 = 41;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     c = var7;
                     d = new String[12];
                     long var0 = 3224092947114691527L;
                     long var27 = -5208932006932706397L ^ var0;
                     byte var18 = -1;
                     e = var27;
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "\u0082«Ëµý·c5¶ht½ÆùH\u0002Qï\u0086l\u0006g\rÕÈ}Ë\u0014äÐ\u0007ÚdZP\u0088ÐÚ£OJ\u00938è¤\u0092*«";
                  var6 = "\u0082«Ëµý·c5¶ht½ÆùH\u0002Qï\u0086l\u0006g\rÕÈ}Ë\u0014äÐ\u0007ÚdZP\u0088ÐÚ£OJ\u00938è¤\u0092*«".length();
                  var3 = 27;
                  var10 = -1;
            }

            var10000 = 16;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -1126) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 156;
               break;
            case 1:
               var10000 = 78;
               break;
            case 2:
               var10000 = 16;
               break;
            case 3:
               var10000 = 13;
               break;
            case 4:
               var10000 = 104;
               break;
            case 5:
               var10000 = 68;
               break;
            case 6:
               var10000 = 111;
               break;
            case 7:
               var10000 = 87;
               break;
            case 8:
               var10000 = 51;
               break;
            case 9:
               var10000 = 223;
               break;
            case 10:
               var10000 = 27;
               break;
            case 11:
               var10000 = 162;
               break;
            case 12:
               var10000 = 167;
               break;
            case 13:
               var10000 = 89;
               break;
            case 14:
               var10000 = 161;
               break;
            case 15:
               var10000 = 105;
               break;
            case 16:
               var10000 = 133;
               break;
            case 17:
               var10000 = 251;
               break;
            case 18:
               var10000 = 119;
               break;
            case 19:
               var10000 = 204;
               break;
            case 20:
               var10000 = 160;
               break;
            case 21:
               var10000 = 1;
               break;
            case 22:
               var10000 = 121;
               break;
            case 23:
               var10000 = 137;
               break;
            case 24:
               var10000 = 57;
               break;
            case 25:
               var10000 = 96;
               break;
            case 26:
               var10000 = 128;
               break;
            case 27:
               var10000 = 58;
               break;
            case 28:
               var10000 = 232;
               break;
            case 29:
               var10000 = 178;
               break;
            case 30:
               var10000 = 244;
               break;
            case 31:
               var10000 = 60;
               break;
            case 32:
               var10000 = 126;
               break;
            case 33:
               var10000 = 240;
               break;
            case 34:
               var10000 = 132;
               break;
            case 35:
               var10000 = 185;
               break;
            case 36:
               var10000 = 56;
               break;
            case 37:
               var10000 = 33;
               break;
            case 38:
               var10000 = 188;
               break;
            case 39:
               var10000 = 109;
               break;
            case 40:
               var10000 = 46;
               break;
            case 41:
               var10000 = 52;
               break;
            case 42:
               var10000 = 184;
               break;
            case 43:
               var10000 = 112;
               break;
            case 44:
               var10000 = 93;
               break;
            case 45:
               var10000 = 165;
               break;
            case 46:
               var10000 = 221;
               break;
            case 47:
               var10000 = 3;
               break;
            case 48:
               var10000 = 28;
               break;
            case 49:
               var10000 = 218;
               break;
            case 50:
               var10000 = 158;
               break;
            case 51:
               var10000 = 189;
               break;
            case 52:
               var10000 = 23;
               break;
            case 53:
               var10000 = 140;
               break;
            case 54:
               var10000 = 238;
               break;
            case 55:
               var10000 = 146;
               break;
            case 56:
               var10000 = 54;
               break;
            case 57:
               var10000 = 216;
               break;
            case 58:
               var10000 = 74;
               break;
            case 59:
               var10000 = 108;
               break;
            case 60:
               var10000 = 154;
               break;
            case 61:
               var10000 = 153;
               break;
            case 62:
               var10000 = 159;
               break;
            case 63:
               var10000 = 72;
               break;
            case 64:
               var10000 = 155;
               break;
            case 65:
               var10000 = 141;
               break;
            case 66:
               var10000 = 196;
               break;
            case 67:
               var10000 = 139;
               break;
            case 68:
               var10000 = 176;
               break;
            case 69:
               var10000 = 138;
               break;
            case 70:
               var10000 = 34;
               break;
            case 71:
               var10000 = 245;
               break;
            case 72:
               var10000 = 148;
               break;
            case 73:
               var10000 = 170;
               break;
            case 74:
               var10000 = 192;
               break;
            case 75:
               var10000 = 213;
               break;
            case 76:
               var10000 = 59;
               break;
            case 77:
               var10000 = 11;
               break;
            case 78:
               var10000 = 145;
               break;
            case 79:
               var10000 = 237;
               break;
            case 80:
               var10000 = 76;
               break;
            case 81:
               var10000 = 30;
               break;
            case 82:
               var10000 = 171;
               break;
            case 83:
               var10000 = 107;
               break;
            case 84:
               var10000 = 253;
               break;
            case 85:
               var10000 = 217;
               break;
            case 86:
               var10000 = 110;
               break;
            case 87:
               var10000 = 174;
               break;
            case 88:
               var10000 = 229;
               break;
            case 89:
               var10000 = 254;
               break;
            case 90:
               var10000 = 194;
               break;
            case 91:
               var10000 = 222;
               break;
            case 92:
               var10000 = 202;
               break;
            case 93:
               var10000 = 233;
               break;
            case 94:
               var10000 = 207;
               break;
            case 95:
               var10000 = 63;
               break;
            case 96:
               var10000 = 143;
               break;
            case 97:
               var10000 = 65;
               break;
            case 98:
               var10000 = 31;
               break;
            case 99:
               var10000 = 21;
               break;
            case 100:
               var10000 = 67;
               break;
            case 101:
               var10000 = 179;
               break;
            case 102:
               var10000 = 123;
               break;
            case 103:
               var10000 = 113;
               break;
            case 104:
               var10000 = 226;
               break;
            case 105:
               var10000 = 35;
               break;
            case 106:
               var10000 = 147;
               break;
            case 107:
               var10000 = 210;
               break;
            case 108:
               var10000 = 10;
               break;
            case 109:
               var10000 = 17;
               break;
            case 110:
               var10000 = 120;
               break;
            case 111:
               var10000 = 103;
               break;
            case 112:
               var10000 = 134;
               break;
            case 113:
               var10000 = 190;
               break;
            case 114:
               var10000 = 14;
               break;
            case 115:
               var10000 = 15;
               break;
            case 116:
               var10000 = 206;
               break;
            case 117:
               var10000 = 101;
               break;
            case 118:
               var10000 = 175;
               break;
            case 119:
               var10000 = 177;
               break;
            case 120:
               var10000 = 32;
               break;
            case 121:
               var10000 = 144;
               break;
            case 122:
               var10000 = 9;
               break;
            case 123:
               var10000 = 129;
               break;
            case 124:
               var10000 = 98;
               break;
            case 125:
               var10000 = 205;
               break;
            case 126:
               var10000 = 231;
               break;
            case 127:
               var10000 = 201;
               break;
            case 128:
               var10000 = 8;
               break;
            case 129:
               var10000 = 239;
               break;
            case 130:
               var10000 = 172;
               break;
            case 131:
               var10000 = 211;
               break;
            case 132:
               var10000 = 29;
               break;
            case 133:
               var10000 = 166;
               break;
            case 134:
               var10000 = 53;
               break;
            case 135:
               var10000 = 100;
               break;
            case 136:
               var10000 = 215;
               break;
            case 137:
               var10000 = 18;
               break;
            case 138:
               var10000 = 151;
               break;
            case 139:
               var10000 = 203;
               break;
            case 140:
               var10000 = 227;
               break;
            case 141:
               var10000 = 163;
               break;
            case 142:
               var10000 = 102;
               break;
            case 143:
               var10000 = 198;
               break;
            case 144:
               var10000 = 180;
               break;
            case 145:
               var10000 = 66;
               break;
            case 146:
               var10000 = 85;
               break;
            case 147:
               var10000 = 187;
               break;
            case 148:
               var10000 = 82;
               break;
            case 149:
               var10000 = 40;
               break;
            case 150:
               var10000 = 47;
               break;
            case 151:
               var10000 = 26;
               break;
            case 152:
               var10000 = 37;
               break;
            case 153:
               var10000 = 81;
               break;
            case 154:
               var10000 = 95;
               break;
            case 155:
               var10000 = 88;
               break;
            case 156:
               var10000 = 248;
               break;
            case 157:
               var10000 = 7;
               break;
            case 158:
               var10000 = 24;
               break;
            case 159:
               var10000 = 39;
               break;
            case 160:
               var10000 = 200;
               break;
            case 161:
               var10000 = 12;
               break;
            case 162:
               var10000 = 71;
               break;
            case 163:
               var10000 = 94;
               break;
            case 164:
               var10000 = 234;
               break;
            case 165:
               var10000 = 182;
               break;
            case 166:
               var10000 = 117;
               break;
            case 167:
               var10000 = 208;
               break;
            case 168:
               var10000 = 124;
               break;
            case 169:
               var10000 = 69;
               break;
            case 170:
               var10000 = 135;
               break;
            case 171:
               var10000 = 252;
               break;
            case 172:
               var10000 = 131;
               break;
            case 173:
               var10000 = 197;
               break;
            case 174:
               var10000 = 125;
               break;
            case 175:
               var10000 = 235;
               break;
            case 176:
               var10000 = 36;
               break;
            case 177:
               var10000 = 212;
               break;
            case 178:
               var10000 = 90;
               break;
            case 179:
               var10000 = 48;
               break;
            case 180:
               var10000 = 61;
               break;
            case 181:
               var10000 = 169;
               break;
            case 182:
               var10000 = 6;
               break;
            case 183:
               var10000 = 49;
               break;
            case 184:
               var10000 = 181;
               break;
            case 185:
               var10000 = 44;
               break;
            case 186:
               var10000 = 116;
               break;
            case 187:
               var10000 = 41;
               break;
            case 188:
               var10000 = 195;
               break;
            case 189:
               var10000 = 214;
               break;
            case 190:
               var10000 = 4;
               break;
            case 191:
               var10000 = 168;
               break;
            case 192:
               var10000 = 220;
               break;
            case 193:
               var10000 = 255;
               break;
            case 194:
               var10000 = 99;
               break;
            case 195:
               var10000 = 55;
               break;
            case 196:
               var10000 = 249;
               break;
            case 197:
               var10000 = 157;
               break;
            case 198:
               var10000 = 64;
               break;
            case 199:
               var10000 = 241;
               break;
            case 200:
               var10000 = 228;
               break;
            case 201:
               var10000 = 209;
               break;
            case 202:
               var10000 = 219;
               break;
            case 203:
               var10000 = 97;
               break;
            case 204:
               var10000 = 5;
               break;
            case 205:
               var10000 = 130;
               break;
            case 206:
               var10000 = 183;
               break;
            case 207:
               var10000 = 45;
               break;
            case 208:
               var10000 = 118;
               break;
            case 209:
               var10000 = 42;
               break;
            case 210:
               var10000 = 79;
               break;
            case 211:
               var10000 = 242;
               break;
            case 212:
               var10000 = 225;
               break;
            case 213:
               var10000 = 127;
               break;
            case 214:
               var10000 = 62;
               break;
            case 215:
               var10000 = 114;
               break;
            case 216:
               var10000 = 152;
               break;
            case 217:
               var10000 = 38;
               break;
            case 218:
               var10000 = 20;
               break;
            case 219:
               var10000 = 246;
               break;
            case 220:
               var10000 = 122;
               break;
            case 221:
               var10000 = 70;
               break;
            case 222:
               var10000 = 0;
               break;
            case 223:
               var10000 = 193;
               break;
            case 224:
               var10000 = 43;
               break;
            case 225:
               var10000 = 84;
               break;
            case 226:
               var10000 = 236;
               break;
            case 227:
               var10000 = 73;
               break;
            case 228:
               var10000 = 164;
               break;
            case 229:
               var10000 = 25;
               break;
            case 230:
               var10000 = 136;
               break;
            case 231:
               var10000 = 247;
               break;
            case 232:
               var10000 = 77;
               break;
            case 233:
               var10000 = 80;
               break;
            case 234:
               var10000 = 50;
               break;
            case 235:
               var10000 = 106;
               break;
            case 236:
               var10000 = 83;
               break;
            case 237:
               var10000 = 142;
               break;
            case 238:
               var10000 = 230;
               break;
            case 239:
               var10000 = 149;
               break;
            case 240:
               var10000 = 150;
               break;
            case 241:
               var10000 = 75;
               break;
            case 242:
               var10000 = 22;
               break;
            case 243:
               var10000 = 92;
               break;
            case 244:
               var10000 = 19;
               break;
            case 245:
               var10000 = 199;
               break;
            case 246:
               var10000 = 115;
               break;
            case 247:
               var10000 = 186;
               break;
            case 248:
               var10000 = 91;
               break;
            case 249:
               var10000 = 243;
               break;
            case 250:
               var10000 = 224;
               break;
            case 251:
               var10000 = 86;
               break;
            case 252:
               var10000 = 191;
               break;
            case 253:
               var10000 = 173;
               break;
            case 254:
               var10000 = 250;
               break;
            default:
               var10000 = 2;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }
}





