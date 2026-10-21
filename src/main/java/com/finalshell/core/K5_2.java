package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.T22;
import com.finalshell.ui.panel.ImportExportPanel;
import com.finalshell.ui.panel.Ky4;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D.Double;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.JTree.DropLocation;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class K5_2 extends BasicTreeUI {
   public static ImageIcon x;
   public static ImageIcon y;
   public static ImageIcon t;
   public static ImageIcon l;
   public static ImageIcon E;
   public static ImageIcon w;
   public static ImageIcon a;
   public static ImageIcon s;
   public static float[] V;
   public boolean U = N2_2.o;
   public boolean h = N2_2.a;
   public boolean J = N2_2.A;
   public Color i = N2_2.x;
   public com.finalshell.ui.model.T Q = N2_2.Y;
   public int T = N2_2.Q;
   public int S;
   public boolean v;
   public Color W;
   public Color m;
   public int I;
   public BasicStroke z;
   public int B;
   public PropertyChangeListener O;
   public PropertyChangeListener A;
   public TreeSelectionListener d;
   public TreeExpansionListener N;
   public MouseAdapter C;
   public int g;
   public List P;
   public Point n;
   public Point q;
   public boolean k;
   public TreePath G;
   public boolean p;
   public DefaultMutableTreeNode F;
   public long R;
   public long r;
   public Color K;
   public Color D;
   public boolean H;
   public Color b;
   public static String[] c;
   public static String[] e;
   public static long[] f;
   public static Integer[] j;

   public K5_2() {
      com.finalshell.ui.panel.S.d();
      this.S = N2_2.O;
      this.v = N2_2.G;
      this.W = N2_2.E;
      this.m = N2_2.W;
      this.I = N2_2.j;
      this.z = N2_2.D;
      this.B = N2_2.U;
      this.g = -1;
      this.P = new ArrayList();
      this.n = null;
      this.q = null;
      this.k = true;
      this.G = null;
      this.p = false;
      this.K = N2_2.r;
      this.D = N2_2.g;
      this.H = N2_2.y;
      this.b = new Color(a(26372, 4763550615109458083L), a(31478, 5365773978781533526L), a(31478, 5365773978781533526L));
      if (Ky4.F$arrString() != null) {
         com.finalshell.ui.panel.S.W("K1o9k");
      }
   }

   public static ComponentUI createUI(JComponent var0) {
      return new K5_2();
   }

   public boolean f() {
      return this.p;
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      String var10000 = com.finalshell.ui.panel.S.d();
      this.k = this.tree.getComponentOrientation().isLeftToRight();
      String var2 = var10000;
      if (var2 != null) {
         if (!A9.H()) {
            this.setRightChildIndent(N2_2.F);
            this.setLeftChildIndent(N2_2.F);
         }

         this.tree.setRowHeight(-1);
         this.tree.setVisibleRowCount(a(10154, 7217869562283038735L));
         this.O = new com.finalshell.ui.listener.M3(this);
         this.tree.addPropertyChangeListener(a(-5990, 20114), this.O);
         FN.Y(this.tree);
         this.A = new com.finalshell.ui.listener.P3(this);
         this.tree.addPropertyChangeListener(a(-5999, 17158), this.A);
         this.d = new T22(this);
         this.tree.addTreeSelectionListener(this.d);
         this.N = new H5_2(this);
         this.tree.addTreeExpansionListener(this.N);
         this.C = new com.finalshell.ui.listener.I4(this);
         this.tree.addMouseListener(this.C);
         this.tree.addMouseMotionListener(this.C);
      }
   }

   @Override
   public void uninstallUI(JComponent var1) {
      this.tree.removePropertyChangeListener(a(-5995, -1174), this.O);
      this.tree.removePropertyChangeListener(a(-5997, 26900), this.A);
      this.tree.removeTreeSelectionListener(this.d);
      this.tree.removeTreeExpansionListener(this.N);
      this.tree.removeMouseListener(this.C);
      this.tree.removeMouseMotionListener(this.C);
      super.uninstallUI(var1);
   }

   public boolean V() {
      int var5;
      String var1 = com.finalshell.ui.panel.S.d();
      JTree var10000 = this.tree;
      if (var1 != null) {
         if (this.tree == null) {
            return 0 != 0;
         }

         var10000 = this.tree;
      }

      label50: {
         boolean var2 = var10000.isEnabled();
         if (var1 != null) {
            if (!var2) {
               return 0 != 0;
            }

            var10000 = this.tree;
            if (var1 == null) {
               break label50;
            }

            var2 = this.tree.getDragEnabled();
         }

         if (!var2) {
            return 0 != 0;
         }

         var10000 = this.tree;
      }

      TransferHandler var4 = var10000.getTransferHandler();
      if (var1 != null) {
         if (var4 == null) {
            return 0 != 0;
         }

         var4 = this.tree.getTransferHandler();
      }

      var5 = var4.getSourceActions(this.tree);
      if (var1 == null) {
         return var5 != 0;
      } else {
         return (boolean)((var5 > 0 ? 1 : 0) != 0);
      }
   }

   public boolean q$boolean() {
      return this.U;
   }

   public void O(boolean var1) {
      this.U = var1;
   }

   public boolean H$boolean() {
      return this.h;
   }

   public void D(boolean var1) {
      this.h = var1;
   }

   public boolean x() {
      return this.J;
   }

   public void S(boolean var1) {
      this.J = var1;
   }

   public Color Z() {
      return this.i;
   }

   public void e(Color var1) {
      this.i = var1;
   }

   public com.finalshell.ui.model.T q$T() {
      return this.Q;
   }

   public void O(com.finalshell.ui.model.T var1) {
      this.Q = var1;
   }

   public int i() {
      return this.T;
   }

   public void z(int var1) {
      this.T = var1;
   }

   public int A() {
      return this.S;
   }

   public void U(int var1) {
      this.S = var1;
   }

   public boolean E$boolean() {
      return this.v;
   }

   public void B(boolean var1) {
      this.v = var1;
   }

   public Color j() {
      return this.W;
   }

   public void J(Color var1) {
      this.W = var1;
   }

   public Color o$Color() {
      return this.m;
   }

   public void m(Color var1) {
      this.m = var1;
   }

   public int E$int() {
      return this.I;
   }

   public void y(int var1) {
      this.I = var1;
   }

   public BasicStroke R() {
      return this.z;
   }

   public void A(BasicStroke var1) {
      this.z = var1;
   }

   public int H$int() {
      return this.B;
   }

   public void e(int var1) {
      this.B = var1;
   }

   public boolean y() {
      String var1 = com.finalshell.ui.panel.S.d();
      K5_2 var10000 = this;
      if (var1 != null) {
         if (!this.E$boolean()) {
            return 0 != 0;
         }

         var10000 = this;
      }

      JTree var2 = var10000.tree;
      if (var1 != null) {
         if (var10000.tree == null) {
            return 0 != 0;
         }

         var2 = this.tree;
      }

      int var3 = (var2.isEnabled()) ? 1 : 0;
      if (var1 != null) {
         if (var3 == 0) {
            return 0 != 0;
         }

         var3 = this.tree.getSelectionModel().getSelectionMode();
      }

      if (var1 == null) {
         return var3 != 0;
      } else {
         return (boolean)((var3 != 1 ? 1 : 0) != 0);
      }
   }

   public boolean o$boolean() {
      return this.Q == com.finalshell.ui.model.T.line;
   }

   public int Y(Point var1) {
      return this.v(var1, this.o$boolean());
   }

   public int v(Point var1, boolean var2) {
      int var4;
      String var3 = com.finalshell.ui.panel.S.d();
      if (this.tree != null) {
         var4 = 0;

         while (var4 < this.tree.getRowCount()) {
            Rectangle var5 = this.C(var4, var2);
            if (var3 != null) {
               byte var10000 = (byte)((var5.contains(var1)) ? 1 : 0);
               if (var3 == null) {
                  return var10000;
               }

               if (var10000 != 0) {
                  return var4;
               }

               var4++;
            }

            if (var3 == null) {
               break;
            }
         }
      }

      return -1;
   }

   public Rectangle G(int var1) {
      return this.C(var1, this.o$boolean());
   }

   public Rectangle C(int var1, boolean var2) {
      return var2 ? this.A(var1) : this.tree.getRowBounds(var1);
   }

   public Rectangle A(int var1) {
      Rectangle var5;
      String var10000 = com.finalshell.ui.panel.S.d();
      Rectangle var3 = this.tree.getRowBounds(var1);
      String var2 = var10000;
      var5 = var3;
      if (var2 != null) {
         if (var3 != null) {
            Insets var4 = this.tree.getInsets();
            var3.x = var4.left;
            var3.width = this.tree.getWidth() - var4.left - var4.right;
         }

         var5 = var3;
      }

      return var5;
   }

   @Override
   public TreeCellEditor createDefaultCellEditor() {
      return new V5_2();
   }

   @Override
   public void selectPathForEvent(TreePath var1, MouseEvent var2) {
      String var3 = com.finalshell.ui.panel.S.d();
      K5_2 var10000 = this;
      TreePath var10001 = var1;
      MouseEvent var10002 = var2;
      if (var3 != null) {
         if (this.v(var1, var2.getX(), var2.getY())) {
            return;
         }

         var10000 = this;
         var10001 = var1;
         var10002 = var2;
      }

      var10000.selectPathForEvent(var10001, var10002);
   }

   public boolean v(TreePath var1, int var2, int var3) {
      com.finalshell.ui.panel.U3 var5;
      String var4 = com.finalshell.ui.panel.S.d();
      boolean var10000 = this.tree instanceof com.finalshell.ui.panel.U3;
      if (var4 != null) {
         if (var10000) {
            var5 = (com.finalshell.ui.panel.U3)this.tree;
            var10000 = var5.b();
            if (var4 != null) {
               if (var10000) {
                  DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)var1.getLastPathComponent();
                  var10000 = var5.R(var6);
                  if (var4 != null) {
                     if (var10000) {
                        var10000 = var5.N(var6);
                        if (var4 == null) {
                           return var10000;
                        }

                        if (var10000) {
                           Rectangle var7 = var5.C(var1);
                           Rectangle var10 = var7;
                           if (var4 != null) {
                              if (var7 == null) {
                                 return false;
                              }

                              var10 = var7;
                           }

                           var10000 = var10.contains(var2, var3);
                           if (var4 == null) {
                              return var10000;
                           }

                           if (var10000) {
                              return true;
                           }

                           return false;
                        }
                     }

                     var10000 = false;
                  }

                  return var10000;
               }

               var10000 = false;
            }

            return var10000;
         }

         var10000 = false;
      }

      return var10000;
   }

   @Override
   public Color getHashColor() {
      return this.i;
   }

   @Override
   public Icon getExpandedIcon() {
      return this.tree.isEnabled() ? y : l;
   }

   @Override
   public Icon getCollapsedIcon() {
      return this.tree.isEnabled() ? x : t;
   }

   @Override
   public void drawCentered(Component var1, Graphics var2, Icon var3, int var4, int var5) {
      var3.paintIcon(var1, var2, this.C(var4, var3.getIconWidth()), var5 - var3.getIconHeight() / 2);
   }

   public int C(int var1, int var2) {
      String var3 = com.finalshell.ui.panel.S.d();
      int var10000 = (this.k) ? 1 : 0;
      if (var3 != null) {
         if (this.k) {
            return var1 - 2 - (int)Math.ceil((double)var2 / 2.0);
         }

         var10000 = var1 - 1;
      }

      return var10000 - (int)Math.floor((double)var2 / 2.0);
   }

   public void F() {
      String var1 = com.finalshell.ui.panel.S.d();
      K5_2 var10000 = this;
      if (var1 != null) {
         if (this.tree.getSelectionCount() <= 0) {
            return;
         }

         var10000 = this;
      }

      for (Rectangle var3 : var10000.L()) {
         this.tree.repaint(var3);
         if (var1 == null) {
            break;
         }
      }
   }

   public List L() {
      String var10000 = com.finalshell.ui.panel.S.d();
      ArrayList var2 = new ArrayList();
      String var1 = var10000;
      int[] var3 = this.tree.getSelectionRows();
      int[] var12 = var3;
      if (var1 != null) {
         if (var3 == null) {
            return var2;
         }

         var12 = var3;
      }

      Arrays.sort(var12);
      Insets var4 = this.tree.getInsets();
      Rectangle var5 = null;
      int var6 = -1;
      int[] var7 = var3;
      int var8 = var3.length;
      int var9 = 0;

      while (true) {
         if (var9 < var8) {
            int var10 = var7[var9];
            int var13 = (this.Q.equals(com.finalshell.ui.model.T.single)) ? 1 : 0;
            if (var1 == null) {
               break;
            }

            label86: {
               if (var1 != null) {
                  if (var13 != 0) {
                     var2.add(this.tree.getRowBounds(var10));
                     if (var1 != null) {
                        break label86;
                     }
                  }

                  var13 = var6;
               }

               int var10001;
               var10001 = -1;
               label72:
               if (var1 != null) {
                  if (var13 != -1) {
                     var13 = var6 + 1;
                     var10001 = var10;
                     if (var1 == null) {
                        break label72;
                     }

                     if (var13 != var10) {
                        var2.add(var5);
                        var5 = null;
                        var6 = -1;
                     }
                  }

                  var13 = var6;
                  var10001 = -1;
               }

               label65: {
                  if (var1 != null) {
                     if (var13 == var10001) {
                        break label65;
                     }

                     var13 = var6 + 1;
                     var10001 = var10;
                  }

                  if (var13 != var10001) {
                     break label86;
                  }
               }

               Rectangle var11 = this.tree.getRowBounds(var10);
               int var14 = (this.o$boolean()) ? 1 : 0;
               if (var1 != null) {
                  if (var14 != 0) {
                     var11.x = var4.left;
                     var11.width = this.tree.getWidth() - var4.left - var4.right;
                  }

                  var14 = var6;
               }

               var5 = var14 == -1 ? var11 : Rv4.B(var5, var11);
               var6 = var10;
            }

            var9++;
            if (var1 != null) {
               continue;
            }
         }

         if (var5 != null) {
            var2.add(var5);
         }
         break;
      }

      return var2;
   }

   @Override
   public int getHorizontalLegBuffer() {
      return a(25568, 9085472095170124865L);
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      Graphics2D var4;
      String var3 = com.finalshell.ui.panel.S.d();
      K5_2 var10000 = this;
      if (var3 != null) {
         if (this.tree != var2) {
            throw new InternalError(a(-6000, 8370));
         }

         var10000 = this;
      }

      if (var10000.treeState != null) {
         var4 = (Graphics2D)var1;
         this.i(var4);
         this.N(var4);
         this.c(var4);
         this.o(var4);
      }
   }

   public void i(Graphics2D var1) {
      String var10000 = com.finalshell.ui.panel.S.d();
      this.S = 0;
      this.T = 0;
      String var2 = var10000;
      K5_2 var6 = this;
      if (var2 != null) {
         if (this.tree.getSelectionCount() <= 0) {
            return;
         }

         var6 = this;
      }

      for (Rectangle var5 : var6.L()) {
         var5.x = var5.x + this.S;
         var5.y = var5.y + this.S;
         int var10002 = this.S;
         int var10003 = 2;
         if (var2 != null) {
            var10002 = this.S * 2;
            var10003 = this.K != null ? 1 : 0;
         }

         var5.width -= var10002 + var10003;
         var10002 = this.S;
         var10003 = 2;
         if (var2 != null) {
            var10002 = this.S * 2;
            var10003 = this.K != null ? 1 : 0;
         }

         var5.height -= var10002 + var10003;
         var1.setColor(this.D);
         var1.fillRect(var5.x + 1, var5.y, var5.width, var5.height);
         if (var2 == null) {
            break;
         }
      }
   }

   public void N(Graphics2D var1) {
      K5_2 var4;
      Rectangle var5;
      String var2 = com.finalshell.ui.panel.S.d();
      int var10000 = (this.tree.isEnabled()) ? 1 : 0;
      if (var2 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = (this.h) ? 1 : 0;
      }

      if (var2 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = this.g;
      }

      if (var2 != null) {
         if (var10000 == -1) {
            return;
         }

         var10000 = (this.tree.isRowSelected(this.g)) ? 1 : 0;
      }

      label42: {
         label61: {
            if (var2 != null) {
               if (var10000 != 0) {
                  return;
               }

               var4 = this;
               if (var2 == null) {
                  break label61;
               }

               var10000 = (this.o$boolean()) ? 1 : 0;
            }

            if (var10000 != 0) {
               var5 = this.A(this.g);
               break label42;
            }

            var4 = this;
         }

         var5 = var4.tree.getRowBounds(this.g);
      }

      Rectangle var3 = var5;
      Rectangle var6 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return;
         }

         var3.x = var3.x + this.S;
         var3.y = var3.y + this.S;
         var3.width = var3.width - (this.S * 2 + 1);
         var6 = var3;
      }

      var6.height = var6.height - (this.S * 2 + 1);
      var1.setColor(this.b);
      var1.fillRect(var3.x + 1, var3.y, var3.width, var3.height);
   }

   public void c(Graphics2D var1) {
      K5_2 var21;
      int var22;
      TreePath var5;
      Rectangle var3 = var1.getClipBounds();
      Insets var4 = this.tree.getInsets();
      var5 = this.getClosestPathForLocation(this.tree, 0, var3.y);
      String var10000 = com.finalshell.ui.panel.S.d();
      Enumeration var6 = this.treeState.getVisiblePathsFrom(var5);
      int var7 = var3.y + var3.height;
      int var8 = this.treeState.getRowForPath(var5);
      String var2 = var10000;
      this.drawingCache.clear();
      if (var2 != null) {
         if (var5 != null && var6 != null) {
            TreePath var9 = var5.getParentPath();

            while (var9 != null) {
               this.paintVerticalPartOfLeg(var1, var3, var4, var9);
               this.drawingCache.put(var9, Boolean.TRUE);
               var9 = var9.getParentPath();
               if (var2 == null) {
                  return;
               }

               if (var2 == null) {
                  break;
               }
            }

            Rectangle var10 = new Rectangle();
            byte var11 = (byte)((this.isRootVisible()) ? 1 : 0);
            boolean var17 = false;

            while (!var17) {
               var10000 = var6;
               if (var2 != null) {
                  if (!var6.hasMoreElements()) {
                     break;
                  }

                  var10000 = (String)var6.nextElement();
               }

               label109: {
                  label108: {
                     TreePath var16 = (TreePath)var10000;
                     if (var16 != null) {
                        boolean var12;
                        boolean var13;
                        boolean var14;
                        label105: {
                           var14 = this.treeModel.isLeaf(var16.getLastPathComponent());
                           boolean var19 = var14;
                           if (var2 != null) {
                              if (var14) {
                                 var13 = false;
                                 var12 = false;
                                 if (var2 != null) {
                                    break label105;
                                 }
                              }

                              var19 = this.treeState.getExpandedState(var16);
                           }

                           var12 = var19;
                           var13 = this.tree.hasBeenExpanded(var16);
                        }

                        Rectangle var15 = this.A(var16, var4, var10);
                        if (var2 != null) {
                           if (var15 == null) {
                              return;
                           }

                           var9 = var16.getParentPath();
                        }

                        label97: {
                           label131: {
                              label95: {
                                 label132: {
                                    var10000 = var9;
                                    if (var2 != null) {
                                       if (var9 == null) {
                                          break label95;
                                       }

                                       var21 = this;
                                       if (var2 == null) {
                                          break label132;
                                       }

                                       var10000 = this.drawingCache.get(var9);
                                    }

                                    if (var10000 == null) {
                                       this.paintVerticalPartOfLeg(var1, var3, var4, var9);
                                       this.drawingCache.put(var9, Boolean.TRUE);
                                    }

                                    var21 = this;
                                 }

                                 var21.paintHorizontalPartOfLeg(var1, var3, var4, var15, var16, var8, var12, var13, var14);
                                 if (var2 != null) {
                                    break label131;
                                 }
                              }

                              var22 = var11;
                              if (var2 == null) {
                                 break label97;
                              }

                              if (var11 != 0) {
                                 var22 = var8;
                                 if (var2 == null) {
                                    break label97;
                                 }

                                 if (var8 == 0) {
                                    this.paintHorizontalPartOfLeg(var1, var3, var4, var15, var16, var8, var12, var13, var14);
                                 }
                              }
                           }

                           var22 = (this.shouldPaintExpandControl(var16, var8, var12, var13, var14)) ? 1 : 0;
                        }

                        if (var2 != null) {
                           if (var22 != 0) {
                              this.paintExpandControl(var1, var3, var4, var15, var16, var8, var12, var13, var14);
                           }

                           this.paintRow(var1, var3, var4, var15, var16, var8, var12, var13, var14);
                           if (var2 == null) {
                              break label109;
                           }

                           var22 = var15.y + var15.height;
                        }

                        if (var22 < var7) {
                           break label108;
                        }

                        var17 = true;
                        if (var2 != null) {
                           break label108;
                        }
                     }

                     var17 = true;
                  }

                  var8++;
               }

               if (var2 == null) {
                  break;
               }
            }
         }

         this.rendererPane.removeAll();
      }
   }

   public void o(Graphics2D var1) {
      Color var5;
      String var10000 = com.finalshell.ui.panel.S.d();
      DropLocation var3 = this.tree.getDropLocation();
      String var2 = var10000;
      DropLocation var10 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return;
         }

         var10 = var3;
      }

      TreePath var4 = var10.getPath();
      K5_2 var11 = this;
      if (var2 != null) {
         if (this.isDropLine(var3)) {
            var5 = (Color)Registry.lookupField(478965671994811590L).get(null);
            Color[] var6 = new Color[]{var5, var5, var5, var5};
            Rectangle var7 = this.getDropLineRect(var3);
            var1.setPaint(new LinearGradientPaint((float)var7.x, (float)var7.y, (float)(var7.x + var7.width), (float)var7.y, V, var6));
            var1.fillRect(var7.x, var7.y, var7.width, 2);
            if (var2 != null) {
               return;
            }
         }

         var11 = this;
      }

      Rectangle var8 = var11.p(var4);
      PF3 var9 = Fk2.I(this.B, this.T, 1.0F);
      var9.n(var1, var8);
   }

   public Rectangle p(TreePath var1) {
      Rectangle var2 = this.tree.getPathBounds(var1);
      var2.x = var2.x - this.B;
      var2.y = var2.y - this.B;
      var2.width = var2.width + this.B * 2;
      var2.height = var2.height + this.B * 2;
      return var2;
   }

   public void D(Graphics2D var1) {
      Rectangle var5;
      String var2 = com.finalshell.ui.panel.S.d();
      K5_2 var10000 = this;
      if (var2 != null) {
         if (!this.y()) {
            return;
         }

         var10000 = this;
      }

      Object var7 = var10000.n;
      if (var2 != null) {
         if (var10000.n == null) {
            return;
         }

         var7 = this.q;
      }

      if (var2 != null) {
         if (var7 == null) {
            return;
         }

         var7 = RV.X(var1);
      }

      Object var3 = var7;
      Stroke var4 = RV.M(var1, this.z);
      var5 = Rv4.t(new Point[]{this.n, this.q});
      Rectangle var6 = var5.intersection(FN.N(this.tree));
      var6.width--;
      var6.height--;
      var1.setPaint(this.W);
      var1.fill(this.B(var6, true));
      var1.setPaint(this.m);
      var1.draw(this.B(var6, false));
      RV.p(var1, var4);
      RV.X(var1, var3);
   }

   @Override
   public boolean isDropLine(DropLocation var1) {
      String var2 = com.finalshell.ui.panel.S.d();
      DropLocation var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return 0 != 0;
         }

         var10000 = var1;
      }

      if (var2 != null) {
         if (var10000.getPath() == null) {
            return 0 != 0;
         }

         var10000 = var1;
      }

      int var3 = var10000.getChildIndex();
      if (var2 == null) {
         return var3 != 0;
      } else {
         return (boolean)((var3 != -1 ? 1 : 0) != 0);
      }
   }

   @Override
   public Rectangle getDropLineRect(DropLocation var1) {
      long var21;
      Rectangle var4;
      TreePath var5;
      String var2;
      K5_2 var29;
      label102: {
         label105: {
            boolean var3 = false;
            var5 = var1.getPath();
            int var6 = var1.getChildIndex();
            Point var7 = var1.getDropPoint();
            String var10000 = com.finalshell.ui.panel.S.d();
            TreePath var8 = var1.getPath();
            int var9 = var1.getChildIndex();
            var2 = var10000;
            Insets var10 = this.tree.getInsets();
            var29 = this;
            if (var2 != null) {
               if (this.tree.getRowCount() == 0) {
                  var4 = new Rectangle(var10.left, var10.top, this.tree.getWidth() - var10.left - var10.right, 0);
                  if (var2 != null) {
                     break label105;
                  }
               }

               var29 = this;
            }

            label94: {
               TreeModel var11 = var29.getModel();
               Object var12 = var11.getRoot();
               if (var5.getLastPathComponent() == var12 && var6 >= var11.getChildCount(var12)) {
                  Rectangle var13;
                  label106: {
                     var4 = this.tree.getRowBounds(this.tree.getRowCount() - 1);
                     var4.y = var4.y + var4.height;
                     int var28 = (this.tree.isRootVisible()) ? 1 : 0;
                     if (var2 != null) {
                        if (var28 == 0) {
                           var13 = this.tree.getRowBounds(0);
                           if (var2 != null) {
                              break label106;
                           }
                        }

                        var28 = var11.getChildCount(var12);
                     }

                     if (var28 == 0) {
                        var13 = this.tree.getRowBounds(0);
                        var13.x = var13.x + this.totalChildIndent;
                        var13.width = var13.width - (this.totalChildIndent + this.totalChildIndent);
                        if (var2 != null) {
                           break label106;
                        }
                     }

                     TreePath var14 = var5.pathByAddingChild(var11.getChild(var12, var11.getChildCount(var12) - 1));
                     var13 = this.tree.getPathBounds(var14);
                  }

                  var4.x = var13.x;
                  var4.width = var13.width;
                  if (var2 != null) {
                     break label94;
                  }
               }

               var4 = this.tree.getPathBounds(var5.pathByAddingChild(var11.getChild(var5.getLastPathComponent(), var6)));
            }

            var29 = this.tree.getClass().equals(ImportExportPanel.class);
            if (var2 == null) {
               break label102;
            }

            label78:
            if (var29 != null) {
               ImportExportPanel var25 = (ImportExportPanel)this.tree;
               var29 = this;
               DefaultMutableTreeNode var10002 = (DefaultMutableTreeNode)(Registry.packArgs(var7));
               long var19 = 249787479061393778L;
               Object var18 = var10002;
               var10002 = Ref.h(249787479061393778L, var18, var19);

               try {
                  var10002 = (DefaultMutableTreeNode)var10002;
               } catch (InvocationTargetException var23) {
                  throw var23.getTargetException();
               }

               var25.F = var10002;
               DefaultMutableTreeNode var10001 = this.F;
               if (var2 != null) {
                  if (this.F == null) {
                     break label78;
                  }

                  var10001 = (DefaultMutableTreeNode)this.F.getParent();
               }

               DefaultMutableTreeNode var26 = var10001;
               Object var15 = this.F.getUserObject();
               var10002 = Registry.packArgs(this.F);
               var21 = 137915523920596499L;
               Object var20 = var10002;
               var10002 = Ref.h(137915523920596499L, var20, var21);

               try {
                  var10002 = (Rectangle)var10002;
               } catch (InvocationTargetException var22) {
                  throw var22.getTargetException();
               }

               Rectangle var16 = var10002;
               int var35 = var26.getIndex(this.F);
               if (var2 == null) {
                  break label102;
               }

               if (var35 == var26.getChildCount() - 1) {
                  int var17 = (int)(var4.getY() - var7.getY());
                  if (var2 == null) {
                     break label102;
                  }

                  if (var17 <= a(27214, 6436223661878302189L)) {
                     if (var2 == null) {
                        break label102;
                     }

                     if (var17 > 0) {
                        var4.x = var16.x;
                        var4.y--;
                        var3 = true;
                     }
                  }
               }
            }
         }

         var29 = var4.y;
      }

      if (var2 != null) {
         if (var29 == null) {
            var4.y--;
         }

         var29 = this.k;
      }

      if (var29 == null) {
         var4.x = var4.x + var4.width - a(18770, 2251216943926441718L);
      }

      var4.width = a(23310, 4762121926665331880L);
      var4.height = 5;
      return var4;
   }

   public Rectangle A(TreePath var1, Insets var2, Rectangle var3) {
      String var4;
      String var10000 = com.finalshell.ui.panel.S.d();
      var3 = this.treeState.getBounds(var1, var3);
      var4 = var10000;
      Rectangle var6 = var3;
      if (var4 != null) {
         if (var3 != null) {
            label17: {
               if (this.k) {
                  var3.x = var3.x + var2.left;
                  if (var4 != null) {
                     break label17;
                  }
               }

               var3.x = this.tree.getWidth() - (var3.x + var3.width) - var2.right;
            }

            var3.y = var3.y + var2.top;
         }

         var6 = var3;
      }

      return var6;
   }

   public Shape B(Rectangle var1, boolean var2) {
      int var4;
      String var3 = com.finalshell.ui.panel.S.d();
      int var10000 = (var2) ? 1 : 0;
      if (var3 != null) {
         var10000 = var2 ? 1 : 0;
      }

      var4 = var10000;
      return (Shape)(this.I > 0
         ? new Double(
            (double)(var1.x + var4),
            (double)(var1.y + var4),
            (double)(var1.width - var4),
            (double)(var1.height - var4),
            (double)(this.I * 2),
            (double)(this.I * 2)
         )
         : new java.awt.geom.Rectangle2D.Double((double)(var1.x + var4), (double)(var1.y + var4), (double)(var1.width - var4), (double)(var1.height - var4)));
   }

   public DefaultMutableTreeNode n() {
      return this.F;
   }

   public static JTree l(K5_2 var0) {
      return var0.tree;
   }

   public static JTree B(K5_2 var0) {
      return var0.tree;
   }

   public static JTree K(K5_2 var0) {
      return var0.tree;
   }

   public static JTree V(K5_2 var0) {
      return var0.tree;
   }

   public static JTree h(K5_2 var0) {
      return var0.tree;
   }

   public static JTree x(K5_2 var0) {
      return var0.tree;
   }

   public static JTree r(K5_2 var0) {
      return var0.tree;
   }

   public static boolean i(K5_2 var0, TreePath var1, int var2, int var3) {
      return var0.isLocationInExpandControl(var1, var2, var3);
   }

   public static JTree f(K5_2 var0) {
      return var0.tree;
   }

   public static int g(K5_2 var0, int var1, int var2) {
      return var0.getRowX(var1, var2);
   }

   public static JTree s(K5_2 var0) {
      return var0.tree;
   }

   public static JTree b(K5_2 var0) {
      return var0.tree;
   }

   public static JTree w(K5_2 var0) {
      return var0.tree;
   }

   public static JTree E(K5_2 var0) {
      return var0.tree;
   }

   public static JTree k(K5_2 var0) {
      return var0.tree;
   }

   public static boolean K(K5_2 var0, TreePath var1, int var2, int var3) {
      return var0.isLocationInExpandControl(var1, var2, var3);
   }

   public static JTree U(K5_2 var0) {
      return var0.tree;
   }

   public static JTree g(K5_2 var0) {
      return var0.tree;
   }

   public static JTree L(K5_2 var0) {
      return var0.tree;
   }

   public static JTree C(K5_2 var0) {
      return var0.tree;
   }

   public static JTree e(K5_2 var0) {
      return var0.tree;
   }

   public static JTree D(K5_2 var0) {
      return var0.tree;
   }

   public static JTree F(K5_2 var0) {
      return var0.tree;
   }

   public static JTree R(K5_2 var0) {
      return var0.tree;
   }

   public static JTree t(K5_2 var0) {
      return var0.tree;
   }

   public static JTree v(K5_2 var0) {
      return var0.tree;
   }

   public static JTree Y(K5_2 var0) {
      return var0.tree;
   }

   public static JTree n(K5_2 var0) {
      return var0.tree;
   }

   public static JTree j(K5_2 var0) {
      return var0.tree;
   }

   public static JTree y(K5_2 var0) {
      return var0.tree;
   }

   public static JTree I(K5_2 var0) {
      return var0.tree;
   }

   public static JTree p(K5_2 var0) {
      return var0.tree;
   }

   public static JTree a(K5_2 var0) {
      return var0.tree;
   }

   public static JTree H(K5_2 var0) {
      return var0.tree;
   }

   public static JTree G(K5_2 var0) {
      return var0.tree;
   }

   public static JTree i(K5_2 var0) {
      return var0.tree;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      short var4;
      int var2 = (var0 ^ -5998) & 65535;
      if (e[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 186;
               break;
            case 1:
               var10000 = 122;
               break;
            case 2:
               var10000 = 69;
               break;
            case 3:
               var10000 = 125;
               break;
            case 4:
               var10000 = 144;
               break;
            case 5:
               var10000 = 161;
               break;
            case 6:
               var10000 = 173;
               break;
            case 7:
               var10000 = 25;
               break;
            case 8:
               var10000 = 160;
               break;
            case 9:
               var10000 = 133;
               break;
            case 10:
               var10000 = 214;
               break;
            case 11:
               var10000 = 46;
               break;
            case 12:
               var10000 = 130;
               break;
            case 13:
               var10000 = 128;
               break;
            case 14:
               var10000 = 18;
               break;
            case 15:
               var10000 = 59;
               break;
            case 16:
               var10000 = 99;
               break;
            case 17:
               var10000 = 22;
               break;
            case 18:
               var10000 = 45;
               break;
            case 19:
               var10000 = 111;
               break;
            case 20:
               var10000 = 79;
               break;
            case 21:
               var10000 = 171;
               break;
            case 22:
               var10000 = 107;
               break;
            case 23:
               var10000 = 90;
               break;
            case 24:
               var10000 = 142;
               break;
            case 25:
               var10000 = 132;
               break;
            case 26:
               var10000 = 236;
               break;
            case 27:
               var10000 = 141;
               break;
            case 28:
               var10000 = 172;
               break;
            case 29:
               var10000 = 203;
               break;
            case 30:
               var10000 = 53;
               break;
            case 31:
               var10000 = 115;
               break;
            case 32:
               var10000 = 81;
               break;
            case 33:
               var10000 = 64;
               break;
            case 34:
               var10000 = 120;
               break;
            case 35:
               var10000 = 252;
               break;
            case 36:
               var10000 = 47;
               break;
            case 37:
               var10000 = 92;
               break;
            case 38:
               var10000 = 165;
               break;
            case 39:
               var10000 = 14;
               break;
            case 40:
               var10000 = 234;
               break;
            case 41:
               var10000 = 26;
               break;
            case 42:
               var10000 = 66;
               break;
            case 43:
               var10000 = 136;
               break;
            case 44:
               var10000 = 190;
               break;
            case 45:
               var10000 = 57;
               break;
            case 46:
               var10000 = 180;
               break;
            case 47:
               var10000 = 102;
               break;
            case 48:
               var10000 = 118;
               break;
            case 49:
               var10000 = 226;
               break;
            case 50:
               var10000 = 36;
               break;
            case 51:
               var10000 = 106;
               break;
            case 52:
               var10000 = 210;
               break;
            case 53:
               var10000 = 24;
               break;
            case 54:
               var10000 = 193;
               break;
            case 55:
               var10000 = 137;
               break;
            case 56:
               var10000 = 149;
               break;
            case 57:
               var10000 = 16;
               break;
            case 58:
               var10000 = 93;
               break;
            case 59:
               var10000 = 228;
               break;
            case 60:
               var10000 = 218;
               break;
            case 61:
               var10000 = 89;
               break;
            case 62:
               var10000 = 162;
               break;
            case 63:
               var10000 = 60;
               break;
            case 64:
               var10000 = 188;
               break;
            case 65:
               var10000 = 147;
               break;
            case 66:
               var10000 = 243;
               break;
            case 67:
               var10000 = 134;
               break;
            case 68:
               var10000 = 159;
               break;
            case 69:
               var10000 = 85;
               break;
            case 70:
               var10000 = 114;
               break;
            case 71:
               var10000 = 174;
               break;
            case 72:
               var10000 = 241;
               break;
            case 73:
               var10000 = 1;
               break;
            case 74:
               var10000 = 225;
               break;
            case 75:
               var10000 = 140;
               break;
            case 76:
               var10000 = 37;
               break;
            case 77:
               var10000 = 41;
               break;
            case 78:
               var10000 = 135;
               break;
            case 79:
               var10000 = 197;
               break;
            case 80:
               var10000 = 238;
               break;
            case 81:
               var10000 = 213;
               break;
            case 82:
               var10000 = 97;
               break;
            case 83:
               var10000 = 30;
               break;
            case 84:
               var10000 = 139;
               break;
            case 85:
               var10000 = 119;
               break;
            case 86:
               var10000 = 148;
               break;
            case 87:
               var10000 = 78;
               break;
            case 88:
               var10000 = 167;
               break;
            case 89:
               var10000 = 23;
               break;
            case 90:
               var10000 = 33;
               break;
            case 91:
               var10000 = 182;
               break;
            case 92:
               var10000 = 112;
               break;
            case 93:
               var10000 = 204;
               break;
            case 94:
               var10000 = 207;
               break;
            case 95:
               var10000 = 245;
               break;
            case 96:
               var10000 = 101;
               break;
            case 97:
               var10000 = 123;
               break;
            case 98:
               var10000 = 150;
               break;
            case 99:
               var10000 = 138;
               break;
            case 100:
               var10000 = 110;
               break;
            case 101:
               var10000 = 84;
               break;
            case 102:
               var10000 = 201;
               break;
            case 103:
               var10000 = 38;
               break;
            case 104:
               var10000 = 40;
               break;
            case 105:
               var10000 = 212;
               break;
            case 106:
               var10000 = 216;
               break;
            case 107:
               var10000 = 34;
               break;
            case 108:
               var10000 = 244;
               break;
            case 109:
               var10000 = 95;
               break;
            case 110:
               var10000 = 223;
               break;
            case 111:
               var10000 = 55;
               break;
            case 112:
               var10000 = 124;
               break;
            case 113:
               var10000 = 6;
               break;
            case 114:
               var10000 = 129;
               break;
            case 115:
               var10000 = 88;
               break;
            case 116:
               var10000 = 98;
               break;
            case 117:
               var10000 = 170;
               break;
            case 118:
               var10000 = 251;
               break;
            case 119:
               var10000 = 113;
               break;
            case 120:
               var10000 = 250;
               break;
            case 121:
               var10000 = 96;
               break;
            case 122:
               var10000 = 58;
               break;
            case 123:
               var10000 = 191;
               break;
            case 124:
               var10000 = 83;
               break;
            case 125:
               var10000 = 80;
               break;
            case 126:
               var10000 = 183;
               break;
            case 127:
               var10000 = 156;
               break;
            case 128:
               var10000 = 209;
               break;
            case 129:
               var10000 = 43;
               break;
            case 130:
               var10000 = 12;
               break;
            case 131:
               var10000 = 215;
               break;
            case 132:
               var10000 = 239;
               break;
            case 133:
               var10000 = 199;
               break;
            case 134:
               var10000 = 2;
               break;
            case 135:
               var10000 = 3;
               break;
            case 136:
               var10000 = 146;
               break;
            case 137:
               var10000 = 254;
               break;
            case 138:
               var10000 = 177;
               break;
            case 139:
               var10000 = 179;
               break;
            case 140:
               var10000 = 211;
               break;
            case 141:
               var10000 = 20;
               break;
            case 142:
               var10000 = 152;
               break;
            case 143:
               var10000 = 221;
               break;
            case 144:
               var10000 = 17;
               break;
            case 145:
               var10000 = 246;
               break;
            case 146:
               var10000 = 8;
               break;
            case 147:
               var10000 = 208;
               break;
            case 148:
               var10000 = 181;
               break;
            case 149:
               var10000 = 44;
               break;
            case 150:
               var10000 = 21;
               break;
            case 151:
               var10000 = 82;
               break;
            case 152:
               var10000 = 247;
               break;
            case 153:
               var10000 = 72;
               break;
            case 154:
               var10000 = 70;
               break;
            case 155:
               var10000 = 178;
               break;
            case 156:
               var10000 = 253;
               break;
            case 157:
               var10000 = 155;
               break;
            case 158:
               var10000 = 242;
               break;
            case 159:
               var10000 = 200;
               break;
            case 160:
               var10000 = 15;
               break;
            case 161:
               var10000 = 255;
               break;
            case 162:
               var10000 = 28;
               break;
            case 163:
               var10000 = 65;
               break;
            case 164:
               var10000 = 10;
               break;
            case 165:
               var10000 = 103;
               break;
            case 166:
               var10000 = 9;
               break;
            case 167:
               var10000 = 77;
               break;
            case 168:
               var10000 = 153;
               break;
            case 169:
               var10000 = 205;
               break;
            case 170:
               var10000 = 154;
               break;
            case 171:
               var10000 = 175;
               break;
            case 172:
               var10000 = 29;
               break;
            case 173:
               var10000 = 249;
               break;
            case 174:
               var10000 = 219;
               break;
            case 175:
               var10000 = 220;
               break;
            case 176:
               var10000 = 73;
               break;
            case 177:
               var10000 = 42;
               break;
            case 178:
               var10000 = 198;
               break;
            case 179:
               var10000 = 74;
               break;
            case 180:
               var10000 = 54;
               break;
            case 181:
               var10000 = 168;
               break;
            case 182:
               var10000 = 0;
               break;
            case 183:
               var10000 = 196;
               break;
            case 184:
               var10000 = 109;
               break;
            case 185:
               var10000 = 4;
               break;
            case 186:
               var10000 = 108;
               break;
            case 187:
               var10000 = 71;
               break;
            case 188:
               var10000 = 222;
               break;
            case 189:
               var10000 = 185;
               break;
            case 190:
               var10000 = 35;
               break;
            case 191:
               var10000 = 39;
               break;
            case 192:
               var10000 = 248;
               break;
            case 193:
               var10000 = 7;
               break;
            case 194:
               var10000 = 27;
               break;
            case 195:
               var10000 = 75;
               break;
            case 196:
               var10000 = 116;
               break;
            case 197:
               var10000 = 62;
               break;
            case 198:
               var10000 = 86;
               break;
            case 199:
               var10000 = 126;
               break;
            case 200:
               var10000 = 19;
               break;
            case 201:
               var10000 = 227;
               break;
            case 202:
               var10000 = 50;
               break;
            case 203:
               var10000 = 145;
               break;
            case 204:
               var10000 = 187;
               break;
            case 205:
               var10000 = 105;
               break;
            case 206:
               var10000 = 192;
               break;
            case 207:
               var10000 = 217;
               break;
            case 208:
               var10000 = 5;
               break;
            case 209:
               var10000 = 230;
               break;
            case 210:
               var10000 = 56;
               break;
            case 211:
               var10000 = 194;
               break;
            case 212:
               var10000 = 206;
               break;
            case 213:
               var10000 = 176;
               break;
            case 214:
               var10000 = 235;
               break;
            case 215:
               var10000 = 32;
               break;
            case 216:
               var10000 = 51;
               break;
            case 217:
               var10000 = 163;
               break;
            case 218:
               var10000 = 100;
               break;
            case 219:
               var10000 = 13;
               break;
            case 220:
               var10000 = 143;
               break;
            case 221:
               var10000 = 157;
               break;
            case 222:
               var10000 = 224;
               break;
            case 223:
               var10000 = 52;
               break;
            case 224:
               var10000 = 94;
               break;
            case 225:
               var10000 = 240;
               break;
            case 226:
               var10000 = 229;
               break;
            case 227:
               var10000 = 232;
               break;
            case 228:
               var10000 = 91;
               break;
            case 229:
               var10000 = 127;
               break;
            case 230:
               var10000 = 121;
               break;
            case 231:
               var10000 = 166;
               break;
            case 232:
               var10000 = 231;
               break;
            case 233:
               var10000 = 68;
               break;
            case 234:
               var10000 = 63;
               break;
            case 235:
               var10000 = 61;
               break;
            case 236:
               var10000 = 49;
               break;
            case 237:
               var10000 = 104;
               break;
            case 238:
               var10000 = 184;
               break;
            case 239:
               var10000 = 164;
               break;
            case 240:
               var10000 = 233;
               break;
            case 241:
               var10000 = 189;
               break;
            case 242:
               var10000 = 195;
               break;
            case 243:
               var10000 = 76;
               break;
            case 244:
               var10000 = 87;
               break;
            case 245:
               var10000 = 48;
               break;
            case 246:
               var10000 = 31;
               break;
            case 247:
               var10000 = 131;
               break;
            case 248:
               var10000 = 11;
               break;
            case 249:
               var10000 = 237;
               break;
            case 250:
               var10000 = 67;
               break;
            case 251:
               var10000 = 169;
               break;
            case 252:
               var10000 = 202;
               break;
            case 253:
               var10000 = 151;
               break;
            case 254:
               var10000 = 117;
               break;
            default:
               var10000 = 158;
         }

         var4 = var10000;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16293;
      if (j[var3] == null) {
         j[var3] = (int)(f[var3] ^ var1);
      }

      return j[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      boolean var5;
      String[] var13 = new String[10];
      int var11 = 0;
      String var10 = "\"è\u008eH\u008b¤\u000fô¦\u0091`\b\u0013\u001a\u0094Þöö\fá¯Z\u008d.\u0081c\u00163\u0007Ça\u0013±-ð]Èz@Õ\u0091t\u009fn°?|Ó\u0089\u0083'\f\tßG\u0083\u008d@\u0017.½\u0000\u0016\u0081\u0012^à\u0001Iz\u00841ða\u0011\u0098\u0018\f\u0018w\u009e\u008aþ\u0010yÒå\u000fæL¤þ\t(\u0005\u0087\fhÁ0\u0010~Ä\u0005Íú\u0014'õyI\u000b«Ííù\u0080\u0014\u001c¬\u0000S\u0004[gcua\u0012H:#?\u0082\u0088@/\u0003";
      int var12 = "\"è\u008eH\u008b¤\u000fô¦\u0091`\b\u0013\u001a\u0094Þöö\fá¯Z\u008d.\u0081c\u00163\u0007Ça\u0013±-ð]Èz@Õ\u0091t\u009fn°?|Ó\u0089\u0083'\f\tßG\u0083\u008d@\u0017.½\u0000\u0016\u0081\u0012^à\u0001Iz\u00841ða\u0011\u0098\u0018\f\u0018w\u009e\u008aþ\u0010yÒå\u000fæL¤þ\t(\u0005\u0087\fhÁ0\u0010~Ä\u0005Íú\u0014'õyI\u000b«Ííù\u0080\u0014\u001c¬\u0000S\u0004[gcua\u0012H:#?\u0082\u0088@/\u0003"
         .length();
      char var9 = 18;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 62;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 27;
                        break;
                     case 1:
                        var65 = 22;
                        break;
                     case 2:
                        var65 = 123;
                        break;
                     case 3:
                        var65 = 15;
                        break;
                     case 4:
                        var65 = 61;
                        break;
                     case 5:
                        var65 = 57;
                        break;
                     default:
                        var65 = 94;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     c = var13;
                     e = new String[10];
                     long var0 = 894154647333599132L;
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "&Õ\u0087Öîio\u0099®K\u000eÊ\u001f\u0086\u0001:6\u009dáeÛ¤/Å\u009c\u0015ÈÓGi\u0013LíóÌ\u0094><T#";
                     var5 = ("&Õ\u0087Öîio\u0099®K\u000eÊ\u001f\u0086\u0001:6\u009dáeÛ¤/Å\u009c\u0015ÈÓGi\u0013LíóÌ\u0094><T#".length()) != 0;
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    f = var6;
                                    j = new Integer[7];
                                    x = new ImageIcon(K5_2.class.getResource(a(-5996, 17896)));
                                    y = new ImageIcon(K5_2.class.getResource(a(-5994, 27345)));
                                    t = Xg2.J(x);
                                    l = Xg2.J(y);
                                    E = new ImageIcon(K5_2.class.getResource(a(-5989, 9784)));
                                    w = new ImageIcon(K5_2.class.getResource(a(-5993, 2469)));
                                    a = new ImageIcon(K5_2.class.getResource(a(-5998, -17273)));
                                    s = new ImageIcon(K5_2.class.getResource(a(-5998, -17273)));
                                    V = new float[]{0.0F, 0.25F, 0.75F, 1.0F};
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "[\u009b\u0082W>Û²0.óÆ\u000bõ\u00ad\"{";
                                 var5 = ("[\u009b\u0082W>Û²0.óÆ\u000bõ\u00ad\"{".length()) != 0;
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "\u0002ß<Â|\u0096\u0097%\u0094VÑQ½ÿ0æ\u00963\u0013\u0092\u000eéÀ\b²¤\u0004\u0004\u001f\b\u000bf¿\u0097\u0011";
                  var12 = "\u0002ß<Â|\u0096\u0097%\u0094VÑQ½ÿ0æ\u00963\u0013\u0092\u000eéÀ\b²¤\u0004\u0004\u001f\b\u000bf¿\u0097\u0011".length();
                  var9 = 20;
                  var17 = -1;
            }

            var10000 = 107;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





