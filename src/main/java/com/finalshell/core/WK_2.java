package com.finalshell.core;

import com.finalshell.ui.adapter.Oy2;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTableHeaderUI;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class WK_2 extends BasicTableHeaderUI {
   public static Color Q;
   public static Color G;
   public static Color D;
   public static Color C;
   boolean x = true;
   public static String a;

   public static ComponentUI createUI(JComponent var0) {
      return new WK_2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      FN.Y(this.header);
      LookAndFeel.installProperty(this.header, a, Boolean.TRUE);
      this.header.setDefaultRenderer(new Oy2(this));
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      int var10000 = (PQ.G()) ? 1 : 0;
      Graphics2D var4 = (Graphics2D)var1;
      Paint var5 = t(0, 1, 0, this.header.getHeight() - 1);
      boolean var3 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      var4.setPaint(var5);
      if (var2.isOpaque()) {
      }

      var4.setColor(Q);
      var4.drawLine(0, 0, this.header.getWidth(), 0);
      var4.setPaint(G);
      var4.drawLine(0, this.header.getHeight() - 1, this.header.getWidth(), this.header.getHeight() - 1);
      var10000 = this.header.getColumnModel().getColumnCount();
      if (var3) {
         if (var10000 <= 0) {
            return;
         }

         var10000 = (this.header.getComponentOrientation().isLeftToRight()) ? 1 : 0;
      }

      int var6 = var10000;
      Rectangle var7 = var1.getClipBounds();
      Point var8 = var7.getLocation();
      Point var9 = new Point(var7.x + var7.width - 1, var7.y);
      TableColumnModel var10 = this.header.getColumnModel();
      int var11 = this.header.columnAtPoint(var6 != 0 ? var8 : var9);
      int var12 = this.header.columnAtPoint(var6 != 0 ? var9 : var8);
      var10000 = var11;
      int var10001 = -1;
      if (var3) {
         if (var11 == -1) {
            var11 = 0;
         }

         var10000 = var12;
         var10001 = -1;
      }

      label116: {
         if (var3) {
            if (var10000 != var10001) {
               break label116;
            }

            var10000 = var10.getColumnCount();
            var10001 = 1;
         }

         var12 = var10000 - var10001;
      }

      TableColumn var13 = this.header.getDraggedColumn();
      var10001 = var6;
      if (var3) {
         var10001 = var6 != 0 ? var11 : var12;
      }

      label109: {
         label123: {
            Rectangle var15 = this.header.getHeaderRect(var10001);
            var10000 = var6;
            if (var3) {
               if (var6 != 0) {
                  int var17 = var11;

                  while (var17 <= var12) {
                     TableColumn var16 = var10.getColumn(var17);
                     int var14 = var16.getWidth();
                     var15.width = var14;
                     if (var3) {
      TableColumn var26;
                        var26 = var16;
                        if (!var3) {
                           break label109;
                        }

                        if (var16 != var13) {
                           this.D(var1, var15, var17, var16, var13, var10);
                        }

                        var15.x += var14;
                        var17++;
                     }

                     if (!var3) {
                        break;
                     }
                  }

                  if (var3) {
                     break label123;
                  }
               }

               var10000 = var12;
            }

            int var21 = var10000;

            while (var21 >= var11) {
               TableColumn var20 = var10.getColumn(var21);
               int var19 = var20.getWidth();
               var15.width = var19;
               if (var3) {
      TableColumn var26;
                  var26 = var20;
                  if (!var3) {
                     break label109;
                  }

                  if (var20 != var13) {
                     this.D(var1, var15, var21, var20, var13, var10);
                  }

                  var15.x += var19;
                  var21--;
               }

               if (!var3) {
      TableColumn var26;
      TableColumn var26;
                  break;
               }
            }
         }

         var26 = var13;
      }

      if (var26 != null) {
         int var22 = this.H(var13);
         Rectangle var18 = this.header.getHeaderRect(var22);
         var18.x = var18.x + this.header.getDraggedDistance();
         var4.setPaint(var5);
         this.D(var1, var18, var22, var13, var13, var10);
      }

      if (Ky4.F$arrString() != null) {
         PQ.N$void(!var3);
      }
   }

   public static Paint t(int var0, int var1, int var2, int var3) {
      boolean var4 = PQ.G();
      Color var10000 = C;
      if (var4) {
         if (C != null) {
            if (!var4) {
               return D;
            }

            if (!Ax2.Z(D, new Object[]{C})) {
               return new GradientPaint((float)var0, (float)var1, D, (float)var2, (float)var3, C);
            }
         }

         var10000 = D;
      }

      return var10000;
   }

   public void D(Graphics var1, Rectangle var2, int var3, TableColumn var4, TableColumn var5, TableColumnModel var6) {
      int var10000 = PQ.G();
      byte var8 = this.header.getComponentOrientation().isLeftToRight();
      boolean var7 = (boolean)var10000;
      WK_2 var10 = this;
      if (var7) {
         if (this.x) {
            var1.setColor(GO.N);
            var1.drawLine(var2.x - 1, var2.y + 2, var2.x - 1, var2.y + var2.height - 4);
         }

         var10 = this;
      }

      JComponent var9 = (JComponent)var10.L(var3);
      var9.setEnabled(this.header.getTable().isEnabled());
      this.rendererPane.paintComponent(var1, var9, this.header, var2.x, var2.y, var2.width, var2.height, true);
      if (this.x) {
         label29:
         if (var4 != var5) {
            var10000 = var8;
            if (var7) {
               if (var8 != 0) {
                  if (var3 == var6.getColumnCount() - 1) {
                     return;
                  }
                  break label29;
               }

               var10000 = var3;
            }

            if (var10000 == 0) {
               return;
            }
         }

         var1.setColor(Sm2.h);
         var1.drawLine(var2.x + var2.width - 1, var2.y + 2, var2.x + var2.width - 1, var2.y + var2.height - 4);
      }
   }

   public Component L(int var1) {
      boolean var2;
      TableColumn var3;
      TableCellRenderer var4;
      label32: {
         boolean var10000 = PQ.G();
         var3 = this.header.getColumnModel().getColumn(var1);
         var2 = var10000;
         var4 = var3.getHeaderRenderer();
         TableCellRenderer var6 = var4;
         if (var2) {
            if (var4 != null) {
               break label32;
            }

            var6 = this.header.getDefaultRenderer();
         }

         var4 = var6;
      }

      boolean var7;
      label26: {
         label35: {
            var7 = this.header.isPaintingForPrint();
            if (var2) {
               if (var7) {
                  break label35;
               }

               var7 = this.header.hasFocus();
            }

            if (!var2) {
               break label26;
            }

            if (var7) {
               var7 = true;
               break label26;
            }
         }

         var7 = false;
      }

      boolean var5 = var7;
      return var4.getTableCellRendererComponent(this.header.getTable(), var3.getHeaderValue(), false, var5, -1, var1);
   }

   public int H(TableColumn var1) {
      boolean var10000 = PQ.p();
      TableColumnModel var3 = this.header.getColumnModel();
      boolean var2 = var10000;
      int var4 = 0;

      while (var4 < var3.getColumnCount()) {
         if (var3.getColumn(var4) == var1) {
            return var4;
         }

         var4++;
         if (var2) {
            break;
         }
      }

      return -1;
   }

   @Override
   public Dimension getPreferredSize(JComponent var1) {
      Dimension var2 = super.getPreferredSize(var1);
      var2.height = Math.max(var2.height, Sm2.w);
      return var2;
   }

   public boolean f() {
      return this.x;
   }

   public void H(boolean var1) {
      this.x = var1;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "$p\\D\u0003@".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 124;
      char[] var10002 = var10003;
      int var1 = var10004;
      char[] var10;
      byte var14;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var10 = var10003;
         var10005 = var0;
         char var10008 = var10003[var0];
         var10007 = 124;
         var10006 = var10008;
         switch (var0 % 7) {
            case 0:
               var14 = 55;
               break;
            case 1:
               var14 = 124;
               break;
            case 2:
               var14 = 65;
               break;
            case 3:
               var14 = 73;
               break;
            case 4:
               var14 = 10;
               break;
            case 5:
               var14 = 89;
               break;
            default:
               var14 = 105;
         }
      } else {
         var6 = 124;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            Q = Sm2.P;
            G = Sm2.U;
            D = Sm2.b;
            C = Sm2.q;
            return;
         }

         var10 = var10003;
         var10005 = var0;
         char var15 = var10003[var0];
         var10007 = 124;
         var10006 = var15;
         switch (var0 % 7) {
            case 0:
               var14 = 55;
               break;
            case 1:
               var14 = 124;
               break;
            case 2:
               var14 = 65;
               break;
            case 3:
               var14 = 73;
               break;
            case 4:
               var14 = 10;
               break;
            case 5:
               var14 = 89;
               break;
            default:
               var14 = 105;
         }
      }

      while (true) {
         var10[var10005] = (char)(var10006 ^ var10007 ^ var14);
         var0++;
         if (var6 == 0) {
            var10 = var10002;
            var10005 = var6;
            char var17 = var10002[var6];
            var10007 = var6;
            var10006 = var17;
            switch (var0 % 7) {
               case 0:
                  var14 = 55;
                  break;
               case 1:
                  var14 = 124;
                  break;
               case 2:
                  var14 = 65;
                  break;
               case 3:
                  var14 = 73;
                  break;
               case 4:
                  var14 = 10;
                  break;
               case 5:
                  var14 = 89;
                  break;
               default:
                  var14 = 105;
            }
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               Q = Sm2.P;
               G = Sm2.U;
               D = Sm2.b;
               C = Sm2.q;
               return;
            }

            var10 = var10002;
            var10005 = var0;
            char var16 = var10002[var0];
            var10007 = var6;
            var10006 = var16;
            switch (var0 % 7) {
               case 0:
                  var14 = 55;
                  break;
               case 1:
                  var14 = 124;
                  break;
               case 2:
                  var14 = 65;
                  break;
               case 3:
                  var14 = 73;
                  break;
               case 4:
                  var14 = 10;
                  break;
               case 5:
                  var14 = 89;
                  break;
               default:
                  var14 = 105;
            }
         }
      }
   }
}





