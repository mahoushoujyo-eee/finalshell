package com.finalshell.core;

import com.finalshell.ui.model.EL3;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;

public class L extends W_2 implements HQ {
   public int e = Cq4.y;
   public boolean k = Cq4.d;
   public EL3 K = null;
   public com.finalshell.ui.model.L92 s = null;
   public static String[] g;
   public static String[] h;
   public static long[] l;
   public static Integer[] m;

   public int g() {
      return this.e;
   }

   @Override
   public void F(int var1) {
      this.e = var1;
   }

   public boolean s() {
      return this.k;
   }

   @Override
   public void v(boolean var1) {
      this.k = var1;
   }

   @Override
   public void b(EL3 var1) {
      this.K = var1;
   }

   @Override
   public void v(com.finalshell.ui.model.L92 var1) {
      int[] var10000 = W_2.B$arrint();
      this.s = var1;
      int[] var2 = var10000;
      L var3 = this;
      if (var2 == null) {
         if (this.s != com.finalshell.ui.model.L92.menuBarSubMenu) {
            return;
         }

         var3 = this;
      }

      var3.b(com.finalshell.ui.model.M.simple);
   }

   public Insets e(JPopupMenu var1) {
      Insets var2 = super.B(var1);
      var2.top = var2.top + this.J;
      var2.bottom = var2.bottom + this.J;
      return var2;
   }

   public void t(Graphics2D var1, JPopupMenu var2) {
      Dimension var3 = var2.getSize();
      this.E(var1, var2, var3);
      this.s(var1, var2, var3);
      this.B(var1, var2, var3);
      this.S(var1, var2, var3);
   }

   public void B(Graphics2D var1, JPopupMenu var2, Dimension var3) {
      int var19;
      int var20;
      boolean var21;
      int var23;
      Component var24;
      int[] var4 = W_2.B$arrint();
      L var10000 = this;
      if (var4 == null) {
         if (this.R != com.finalshell.ui.model.M.dropdown) {
            return;
         }

         var10000 = this;
      }

      int var17 = var10000.J;
      if (var4 == null) {
         if (var10000.J != 0) {
            return;
         }

         var17 = this.u;
      }

      if (var4 == null) {
      int var18;
         var17 = var17 == 1 ? 1 : 0;
      }

      int var5;
      label184: {
         var5 = var17;
         FJ var6 = (FJ)var2.getUI();
         var18 = var5;
         if (var4 == null) {
            if (var5 != 0) {
               var18 = var6.J().top + this.U.top;
               if (var4 == null) {
                  var18 = var18 == 0 ? 1 : 0;
               }
               break label184;
            }

            var18 = var6.J().bottom + this.U.bottom;
         }

         if (var4 == null) {
            var18 = var18 == 0 ? 1 : 0;
         }
      }

      int var7 = var18;
      var19 = var7;
      if (var4 == null) {
         if (var7 == 0) {
            return;
         }

         var19 = var5;
      }

      label173: {
         if (var4 == null) {
            if (var19 != 0) {
               var20 = 0;
               break label173;
            }

            var19 = var2.getComponentCount();
         }

         var20 = var19 - 1;
      }

      label199: {
         int var8 = var20;
         Component var9 = var2.getComponent(var8);
         var21 = var2 instanceof BasicComboPopup;
         if (var4 == null) {
            if (var21) {
               Component var22 = var9;
               if (var4 == null) {
                  if (!(var9 instanceof JScrollPane)) {
                     return;
                  }

                  var22 = var9;
               }

               label202: {
                  JList var11;
                  JScrollPane var10 = (JScrollPane)var22;
                  var11 = (JList)var10.getViewport().getView();
                  var23 = var5;
                  label161:
                  if (var4 == null) {
                     if (var5 != 0) {
                        var23 = var11.getSelectedIndex();
                        if (var4 != null) {
                           break label161;
                        }

                        if (var23 == 0) {
                           label155: {
                              M3 var12 = this.O(var2);
                              if (var4 == null) {
                                 if (var12 == null) {
                                    break label155;
                                 }

                                 var1.setPaint(var12.P());
                              }

                              var1.fill(this.d(var2, var3, true));
                           }

                           if (var4 == null) {
                              break label202;
                           }
                        }
                     }

                     var23 = var5;
                  }

                  if (var4 == null) {
                     if (var23 != 0) {
                        break label202;
                     }

                     var23 = var11.getSelectedIndex();
                  }

                  label141:
                  if (var23 == var11.getModel().getSize() - 1) {
                     M3 var16 = this.O(var2);
                     if (var4 == null) {
                        if (var16 == null) {
                           break label141;
                        }

                        var1.setPaint(var16.S());
                     }

                     var1.fill(this.d(var2, var3, true));
                  }
               }

               if (var4 == null) {
                  return;
               }
            }

            var24 = var9;
            if (var4 != null) {
               break label199;
            }

            var21 = var9 instanceof JMenuItem;
         }

         if (!var21) {
            return;
         }

         var24 = var9;
      }

      JMenuItem var13 = (JMenuItem)var24;
      boolean var25 = var13.isEnabled();
      if (var4 == null) {
         if (!var25) {
            return;
         }

         var25 = var13.getModel().isArmed();
      }

      label116:
      if (var4 == null) {
         if (!var25) {
            var25 = var13.isSelected();
            if (var4 != null) {
               break label116;
            }

            if (!var25) {
               return;
            }
         }

         var25 = var13.getUI() instanceof OC3;
      }

      label203: {
         if (var4 == null) {
            if (var25) {
               OC3 var14 = (OC3)var13.getUI();
               var1.setPaint(var5 != 0 ? var14.J() : var14.Y());
               var1.fill(this.d(var2, var3, true));
               if (var4 == null) {
                  return;
               }
            }

            var26 = var13.getUI();
            if (var4 != null) {
               break label203;
            }

            var25 = var26 instanceof Yh2_2;
         }

         if (!var25) {
            return;
         }

         var26 = var13.getUI();
      }

      Yh2_2 var15 = (Yh2_2)var26;
      var1.setPaint(var5 != 0 ? var15.S$Paint() : var15.u());
      var1.fill(this.d(var2, var3, true));
   }

   public M3 O(JPopupMenu var1) {
      int[] var10000 = W_2.B$arrint();
      JComboBox var3 = (JComboBox)Kp2.G(var1, b(-4787, 13469));
      int[] var2 = var10000;
      JComboBox var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return null;
         }

         var4 = var3;
      }

      ComboBoxUI var5 = var4.getUI();
      if (var2 != null) {
         return (M3)var5;
      } else {
         return var5 instanceof M3 ? (M3)var3.getUI() : null;
      }
   }

   @Override
   public Point F(JPopupMenu var1, Component var2, int var3, int var4) {
      boolean var17;
      boolean var18;
      boolean var19;
      L var21;
      int[] var10000 = W_2.B$arrint();
      byte var6 = var2.getComponentOrientation().isLeftToRight();
      int[] var5 = var10000;
      int var10001 = var6;
      if (var5 == null) {
         var10001 = var6 != 0 ? 0 : b(4281, 2958210818686711873L);
      }

      this.v = var10001;
      if (var5 == null) {
         label497: {
            label496:
            if (var2 != null) {
               label494: {
                  Component var15 = var2;
                  if (var5 == null) {
                     if (!var2.isShowing()) {
                        var16 = null;
                        break label494;
                     }

                     var15 = var2;
                  }

                  var16 = var15.getLocationOnScreen();
               }

               Point var7;
               label488: {
                  label504: {
                     var7 = var16;
                     var17 = this.k;
                     if (var5 == null) {
                        if (!this.k) {
                           break label504;
                        }

                        var17 = var2.isShowing();
                     }

                     if (var5 != null) {
                        break label488;
                     }

                     if (var17) {
                        var17 = true;
                        break label488;
                     }
                  }

                  var17 = false;
               }

               boolean var8;
               int var9;
               label534: {
                  var8 = var17;
                  var9 = this.c();
                  var18 = var2 instanceof JMenu;
                  if (var5 == null) {
                     if (!var18) {
                        break label534;
                     }

                     var18 = var2.getParent() instanceof JPopupMenu;
                  }

                  if (var5 == null) {
                     if (var18) {
                        this.b(com.finalshell.ui.model.M.simple);
                        if (var5 != null) {
                           return new Point(var3, var4);
                        }

                        if (!var8) {
                           break label496;
                        }

                        var10001 = var7.x;
                        if (var5 == null) {
                           var10001 = var7.x <= var3 ? -1 : 1;
                        }

                        int var49;
                        label466: {
                           var49 = this.Y;
                           if (var5 == null) {
                              if (this.Y) {
                                 var49 = var9 - this.e;
                                 break label466;
                              }

                              var49 = this.e;
                           }

                           var49 = -var49;
                        }

                        var3 += var10001 * var49;
                        var10001 = var7.y;
                        if (var5 == null) {
                           var10001 = var7.y <= var4 ? -1 : 1;
                        }

                        label459: {
                           L var50 = this;
                           if (var5 == null) {
                              if (this.Y) {
                                 var49 = var9 + 1 + this.J;
                                 break label459;
                              }

                              var50 = this;
                           }

                           var49 = var50.J;
                        }

                        var4 += var10001 * var49;
                        if (var5 == null) {
                           break label496;
                        }
                     }

                     var18 = Cq4.W;
                  }

                  label508: {
                     if (var5 == null) {
                        if (var18) {
                           break label508;
                        }

                        this.b(com.finalshell.ui.model.M.simple);
                        if (var5 != null) {
                           return new Point(var3, var4);
                        }

                        var18 = var8;
                     }

                     if (!var18) {
                        break label496;
                     }

                     var10001 = var7.x;
                     if (var5 == null) {
                        var10001 = var7.x <= var3 ? -1 : 1;
                     }

                     int var53;
                     label447: {
                        var53 = this.Y;
                        if (var5 == null) {
                           if (this.Y) {
                              var53 = var9 - this.e;
                              break label447;
                           }

                           var53 = this.e;
                        }

                        var53 = -var53;
                     }

                     label441: {
                        var3 += var10001 * var53;
                        L var32 = this;
                        if (var5 == null) {
                           if (this.Y) {
                              var10001 = var9 + this.J + 1;
                              break label441;
                           }

                           var32 = this;
                        }

                        var10001 = var32.J;
                     }

                     var4 -= var10001;
                     if (var5 == null) {
                        break label496;
                     }
                  }

                  this.b(com.finalshell.ui.model.M.dropdown);
                  var10001 = var7.y;
                  if (var5 == null) {
                     var10001 = var7.y <= var4 ? 1 : 3;
                  }

                  this.u = var10001;
                  if (var5 == null) {
                     if (var8) {
                        var10001 = var7.x;
                        if (var5 == null) {
                           var10001 = var7.x <= var3 ? -1 : 1;
                        }

                        int var54 = this.Y;
                        if (var5 == null) {
                           var54 = this.Y ? var9 : 0;
                        }

                        var3 += var10001 * var54;
                        var10001 = var7.y;
                        if (var5 == null) {
                           var10001 = var7.y <= var4 ? -1 : 1;
                        }

                        var54 = this.Y;
                        if (var5 == null) {
                           var54 = this.Y ? var9 - this.q : 0;
                        }

                        var4 += var10001 * var54;
                     }

                     this.v = var7.x + var2.getWidth() / 2 - var3;
                  }

                  if (var5 == null) {
                     break label496;
                  }
               }

               int var10;
               var10 = this.R == com.finalshell.ui.model.M.dropdown ? 1 : 0;
               var19 = var2 instanceof JComboBox;
               label419:
               if (var5 == null) {
                  if (var19) {
                     var19 = var1.getName().equals(b(-4788, -18915));
                     if (var5 != null) {
                        break label419;
                     }

                     if (var19) {
                        var10001 = var7.y;
                        if (var5 == null) {
                           var10001 = var7.y <= var4 ? 1 : 3;
                        }

                        this.u = var10001;
                        if (var5 == null) {
                           label410:
                           if (var8) {
                              var10001 = this.Y;
                              if (var5 == null) {
                                 var10001 = this.Y ? -var9 : 0;
                              }

                              var3 += var10001;
                              int var20 = this.u;
                              if (var5 == null) {
                                 if (this.u == 1) {
                                    label515: {
                                       var10001 = this.Y;
                                       if (var5 == null) {
                                          if (!this.Y) {
                                             var10001 = 0;
                                             break label515;
                                          }

                                          var10001 = var9;
                                       }

                                       int var56 = var10;
                                       if (var5 == null) {
                                          var56 = var10 != 0 ? this.q : 0;
                                       }

                                       var10001 -= var56;
                                    }

                                    var4 -= var10001;
                                    if (var5 == null) {
                                       break label410;
                                    }
                                 }

                                 var20 = var2.getPreferredSize().height;
                              }

                              int var11;
                              int var58;
                              label516: {
                                 var11 = (var20) ? 1 : 0;
                                 var58 = this.Y;
                                 if (var5 == null) {
                                    if (!this.Y) {
                                       var58 = 0;
                                       break label516;
                                    }

                                    var58 = var9;
                                 }

                                 int var10003 = var10;
                                 if (var5 == null) {
                                    var10003 = var10 != 0 ? this.q : 0;
                                 }

                                 var58 -= var10003;
                              }

                              var4 -= var11 + var58;
                           }

                           this.v = var7.x + var2.getWidth() / 2 - var3;
                        }

                        if (var5 == null) {
                           break label496;
                        }
                     }
                  }

                  var19 = var8;
               }

               if (var19) {
                  var21 = this;
                  if (var5 != null) {
                     break label497;
                  }

                  if (this.K != null) {
                     Dimension var14 = var1.getPreferredSize();
                     Dimension var12 = var2.getSize();
                     int var22 = var10;
                     if (var5 == null) {
                        var22 = var10 != 0 ? var9 - this.q : 0;
                     }

                     label518: {
                        int var13;
                        label376: {
                           label519: {
                              label520: {
                                 label373: {
                                    label521: {
                                       var13 = var22;
                                       int var23 = V_2.c[this.K.ordinal()];
                                       if (var5 == null) {
                                          switch (var23) {
                                             case 1:
                                                var23 = var6;
                                                break;
                                             case 2:
                                                break label521;
                                             case 3:
                                                break label373;
                                             case 4:
                                                break label520;
                                             case 5:
                                                break label519;
                                             case 6:
                                                break label376;
                                             default:
                                                break label518;
                                          }
                                       }

                                       label361: {
                                          if (var5 == null) {
                                             if (var23 != 0) {
                                                var24 = var7.x;
                                                break label361;
                                             }

                                             var23 = var7.x + var12.width;
                                          }

                                          var24 = var23 - var14.width;
                                       }

                                       label355: {
                                          var10001 = this.Y;
                                          if (var5 == null) {
                                             if (!this.Y) {
                                                var10001 = 0;
                                                break label355;
                                             }

                                             var10001 = var6;
                                          }

                                          if (var5 == null) {
                                             var10001 = var10001 != 0 ? -var9 : var9;
                                          }
                                       }

                                       var3 = var24 + var10001;
                                       var4 = var7.y - var14.height + var13;
                                       var10001 = var6;
                                       if (var5 == null) {
                                          var10001 = var6 != 0 ? 0 : b(8696, 8169618003492849921L);
                                       }

                                       this.v = var10001;
                                       if (var5 == null) {
                                          break label518;
                                       }
                                    }

                                    var3 = var7.x + var12.width / 2 - var14.width / 2;
                                    var4 = var7.y - var14.height + var13;
                                    this.v = var7.x + var2.getWidth() / 2 - var3;
                                    if (var5 == null) {
                                       break label518;
                                    }
                                 }

                                 int var25 = var6;
                                 if (var5 == null) {
                                    var25 = var6 != 0 ? var7.x + var12.width - var14.width : var7.x;
                                 }

                                 label346: {
                                    var10001 = this.Y;
                                    if (var5 == null) {
                                       if (!this.Y) {
                                          var10001 = 0;
                                          break label346;
                                       }

                                       var10001 = var6;
                                    }

                                    if (var5 == null) {
                                       var10001 = var10001 != 0 ? var9 : -var9;
                                    }
                                 }

                                 var3 = var25 + var10001;
                                 var4 = var7.y - var14.height + var13;
                                 var10001 = var6;
                                 if (var5 == null) {
                                    var10001 = var6 != 0 ? b(8696, 8169618003492849921L) : 0;
                                 }

                                 this.v = var10001;
                                 if (var5 == null) {
                                    break label518;
                                 }
                              }

                              label339: {
                                 int var26 = var6;
                                 if (var5 == null) {
                                    if (var6 != 0) {
                                       var27 = var7.x;
                                       break label339;
                                    }

                                    var26 = var7.x + var12.width;
                                 }

                                 var27 = var26 - var14.width;
                              }

                              label333: {
                                 var10001 = this.Y;
                                 if (var5 == null) {
                                    if (!this.Y) {
                                       var10001 = 0;
                                       break label333;
                                    }

                                    var10001 = var6;
                                 }

                                 if (var5 == null) {
                                    var10001 = var10001 != 0 ? -var9 : var9;
                                 }
                              }

                              var3 = var27 + var10001;
                              var4 = var7.y + var12.height - var13;
                              var10001 = var6;
                              if (var5 == null) {
                                 var10001 = var6 != 0 ? 0 : b(8696, 8169618003492849921L);
                              }

                              this.v = var10001;
                              if (var5 == null) {
                                 break label518;
                              }
                           }

                           var3 = var7.x + var12.width / 2 - var14.width / 2;
                           var4 = var7.y + var12.height - var13;
                           this.v = var7.x + var2.getWidth() / 2 - var3;
                           if (var5 == null) {
                              break label518;
                           }
                        }

                        int var28 = var6;
                        if (var5 == null) {
                           var28 = var6 != 0 ? var7.x + var12.width - var14.width : var7.x;
                        }

                        label325: {
                           var10001 = this.Y;
                           if (var5 == null) {
                              if (!this.Y) {
                                 var10001 = 0;
                                 break label325;
                              }

                              var10001 = var6;
                           }

                           if (var5 == null) {
                              var10001 = var10001 != 0 ? var9 : -var9;
                           }
                        }

                        var3 = var28 + var10001;
                        var4 = var7.y + var12.height - var13;
                        var10001 = var6;
                        if (var5 == null) {
                           var10001 = var6 != 0 ? b(8696, 8169618003492849921L) : 0;
                        }

                        this.v = var10001;
                     }

                     this.u = this.K.L();
                  }
               }
            }

            var21 = this;
         }

         var21.K = null;
      }

      return new Point(var3, var4);
   }

   @Override
   public void C(Graphics2D var1, JComponent var2) {
      this.t(var1, (JPopupMenu)var2);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.e((JPopupMenu)var1);
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -4788) & 65535;
      if (h[var2] == null) {
         char[] var3 = g[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 193;
               break;
            case 1:
               var10000 = 4;
               break;
            case 2:
               var10000 = 30;
               break;
            case 3:
               var10000 = 39;
               break;
            case 4:
               var10000 = 44;
               break;
            case 5:
               var10000 = 132;
               break;
            case 6:
               var10000 = 86;
               break;
            case 7:
               var10000 = 109;
               break;
            case 8:
               var10000 = 167;
               break;
            case 9:
               var10000 = 148;
               break;
            case 10:
               var10000 = 18;
               break;
            case 11:
               var10000 = 233;
               break;
            case 12:
               var10000 = 151;
               break;
            case 13:
               var10000 = 166;
               break;
            case 14:
               var10000 = 17;
               break;
            case 15:
               var10000 = 78;
               break;
            case 16:
               var10000 = 134;
               break;
            case 17:
               var10000 = 218;
               break;
            case 18:
               var10000 = 101;
               break;
            case 19:
               var10000 = 122;
               break;
            case 20:
               var10000 = 68;
               break;
            case 21:
               var10000 = 187;
               break;
            case 22:
               var10000 = 197;
               break;
            case 23:
               var10000 = 138;
               break;
            case 24:
               var10000 = 63;
               break;
            case 25:
               var10000 = 210;
               break;
            case 26:
               var10000 = 19;
               break;
            case 27:
               var10000 = 209;
               break;
            case 28:
               var10000 = 206;
               break;
            case 29:
               var10000 = 225;
               break;
            case 30:
               var10000 = 227;
               break;
            case 31:
               var10000 = 242;
               break;
            case 32:
               var10000 = 125;
               break;
            case 33:
               var10000 = 104;
               break;
            case 34:
               var10000 = 144;
               break;
            case 35:
               var10000 = 141;
               break;
            case 36:
               var10000 = 168;
               break;
            case 37:
               var10000 = 169;
               break;
            case 38:
               var10000 = 230;
               break;
            case 39:
               var10000 = 129;
               break;
            case 40:
               var10000 = 228;
               break;
            case 41:
               var10000 = 52;
               break;
            case 42:
               var10000 = 183;
               break;
            case 43:
               var10000 = 84;
               break;
            case 44:
               var10000 = 131;
               break;
            case 45:
               var10000 = 192;
               break;
            case 46:
               var10000 = 69;
               break;
            case 47:
               var10000 = 253;
               break;
            case 48:
               var10000 = 40;
               break;
            case 49:
               var10000 = 80;
               break;
            case 50:
               var10000 = 12;
               break;
            case 51:
               var10000 = 229;
               break;
            case 52:
               var10000 = 22;
               break;
            case 53:
               var10000 = 204;
               break;
            case 54:
               var10000 = 8;
               break;
            case 55:
               var10000 = 10;
               break;
            case 56:
               var10000 = 115;
               break;
            case 57:
               var10000 = 214;
               break;
            case 58:
               var10000 = 108;
               break;
            case 59:
               var10000 = 130;
               break;
            case 60:
               var10000 = 243;
               break;
            case 61:
               var10000 = 176;
               break;
            case 62:
               var10000 = 142;
               break;
            case 63:
               var10000 = 79;
               break;
            case 64:
               var10000 = 74;
               break;
            case 65:
               var10000 = 174;
               break;
            case 66:
               var10000 = 119;
               break;
            case 67:
               var10000 = 42;
               break;
            case 68:
               var10000 = 11;
               break;
            case 69:
               var10000 = 92;
               break;
            case 70:
               var10000 = 182;
               break;
            case 71:
               var10000 = 54;
               break;
            case 72:
               var10000 = 217;
               break;
            case 73:
               var10000 = 172;
               break;
            case 74:
               var10000 = 33;
               break;
            case 75:
               var10000 = 127;
               break;
            case 76:
               var10000 = 100;
               break;
            case 77:
               var10000 = 23;
               break;
            case 78:
               var10000 = 64;
               break;
            case 79:
               var10000 = 135;
               break;
            case 80:
               var10000 = 48;
               break;
            case 81:
               var10000 = 254;
               break;
            case 82:
               var10000 = 221;
               break;
            case 83:
               var10000 = 128;
               break;
            case 84:
               var10000 = 102;
               break;
            case 85:
               var10000 = 246;
               break;
            case 86:
               var10000 = 198;
               break;
            case 87:
               var10000 = 2;
               break;
            case 88:
               var10000 = 237;
               break;
            case 89:
               var10000 = 24;
               break;
            case 90:
               var10000 = 181;
               break;
            case 91:
               var10000 = 70;
               break;
            case 92:
               var10000 = 67;
               break;
            case 93:
               var10000 = 184;
               break;
            case 94:
               var10000 = 114;
               break;
            case 95:
               var10000 = 121;
               break;
            case 96:
               var10000 = 87;
               break;
            case 97:
               var10000 = 7;
               break;
            case 98:
               var10000 = 223;
               break;
            case 99:
               var10000 = 201;
               break;
            case 100:
               var10000 = 195;
               break;
            case 101:
               var10000 = 212;
               break;
            case 102:
               var10000 = 123;
               break;
            case 103:
               var10000 = 133;
               break;
            case 104:
               var10000 = 27;
               break;
            case 105:
               var10000 = 124;
               break;
            case 106:
               var10000 = 149;
               break;
            case 107:
               var10000 = 113;
               break;
            case 108:
               var10000 = 85;
               break;
            case 109:
               var10000 = 239;
               break;
            case 110:
               var10000 = 244;
               break;
            case 111:
               var10000 = 190;
               break;
            case 112:
               var10000 = 226;
               break;
            case 113:
               var10000 = 46;
               break;
            case 114:
               var10000 = 13;
               break;
            case 115:
               var10000 = 232;
               break;
            case 116:
               var10000 = 83;
               break;
            case 117:
               var10000 = 153;
               break;
            case 118:
               var10000 = 165;
               break;
            case 119:
               var10000 = 41;
               break;
            case 120:
               var10000 = 81;
               break;
            case 121:
               var10000 = 35;
               break;
            case 122:
               var10000 = 234;
               break;
            case 123:
               var10000 = 145;
               break;
            case 124:
               var10000 = 106;
               break;
            case 125:
               var10000 = 161;
               break;
            case 126:
               var10000 = 76;
               break;
            case 127:
               var10000 = 224;
               break;
            case 128:
               var10000 = 164;
               break;
            case 129:
               var10000 = 91;
               break;
            case 130:
               var10000 = 177;
               break;
            case 131:
               var10000 = 194;
               break;
            case 132:
               var10000 = 200;
               break;
            case 133:
               var10000 = 5;
               break;
            case 134:
               var10000 = 162;
               break;
            case 135:
               var10000 = 60;
               break;
            case 136:
               var10000 = 61;
               break;
            case 137:
               var10000 = 251;
               break;
            case 138:
               var10000 = 186;
               break;
            case 139:
               var10000 = 136;
               break;
            case 140:
               var10000 = 249;
               break;
            case 141:
               var10000 = 77;
               break;
            case 142:
               var10000 = 157;
               break;
            case 143:
               var10000 = 216;
               break;
            case 144:
               var10000 = 238;
               break;
            case 145:
               var10000 = 97;
               break;
            case 146:
               var10000 = 94;
               break;
            case 147:
               var10000 = 137;
               break;
            case 148:
               var10000 = 241;
               break;
            case 149:
               var10000 = 49;
               break;
            case 150:
               var10000 = 189;
               break;
            case 151:
               var10000 = 75;
               break;
            case 152:
               var10000 = 57;
               break;
            case 153:
               var10000 = 99;
               break;
            case 154:
               var10000 = 90;
               break;
            case 155:
               var10000 = 231;
               break;
            case 156:
               var10000 = 6;
               break;
            case 157:
               var10000 = 47;
               break;
            case 158:
               var10000 = 31;
               break;
            case 159:
               var10000 = 28;
               break;
            case 160:
               var10000 = 65;
               break;
            case 161:
               var10000 = 105;
               break;
            case 162:
               var10000 = 150;
               break;
            case 163:
               var10000 = 62;
               break;
            case 164:
               var10000 = 15;
               break;
            case 165:
               var10000 = 66;
               break;
            case 166:
               var10000 = 71;
               break;
            case 167:
               var10000 = 139;
               break;
            case 168:
               var10000 = 45;
               break;
            case 169:
               var10000 = 208;
               break;
            case 170:
               var10000 = 191;
               break;
            case 171:
               var10000 = 205;
               break;
            case 172:
               var10000 = 26;
               break;
            case 173:
               var10000 = 118;
               break;
            case 174:
               var10000 = 112;
               break;
            case 175:
               var10000 = 107;
               break;
            case 176:
               var10000 = 170;
               break;
            case 177:
               var10000 = 110;
               break;
            case 178:
               var10000 = 235;
               break;
            case 179:
               var10000 = 38;
               break;
            case 180:
               var10000 = 152;
               break;
            case 181:
               var10000 = 163;
               break;
            case 182:
               var10000 = 207;
               break;
            case 183:
               var10000 = 203;
               break;
            case 184:
               var10000 = 56;
               break;
            case 185:
               var10000 = 255;
               break;
            case 186:
               var10000 = 240;
               break;
            case 187:
               var10000 = 58;
               break;
            case 188:
               var10000 = 14;
               break;
            case 189:
               var10000 = 211;
               break;
            case 190:
               var10000 = 156;
               break;
            case 191:
               var10000 = 103;
               break;
            case 192:
               var10000 = 50;
               break;
            case 193:
               var10000 = 9;
               break;
            case 194:
               var10000 = 0;
               break;
            case 195:
               var10000 = 51;
               break;
            case 196:
               var10000 = 247;
               break;
            case 197:
               var10000 = 213;
               break;
            case 198:
               var10000 = 16;
               break;
            case 199:
               var10000 = 73;
               break;
            case 200:
               var10000 = 180;
               break;
            case 201:
               var10000 = 236;
               break;
            case 202:
               var10000 = 21;
               break;
            case 203:
               var10000 = 146;
               break;
            case 204:
               var10000 = 158;
               break;
            case 205:
               var10000 = 175;
               break;
            case 206:
               var10000 = 116;
               break;
            case 207:
               var10000 = 37;
               break;
            case 208:
               var10000 = 185;
               break;
            case 209:
               var10000 = 248;
               break;
            case 210:
               var10000 = 245;
               break;
            case 211:
               var10000 = 20;
               break;
            case 212:
               var10000 = 95;
               break;
            case 213:
               var10000 = 120;
               break;
            case 214:
               var10000 = 1;
               break;
            case 215:
               var10000 = 178;
               break;
            case 216:
               var10000 = 59;
               break;
            case 217:
               var10000 = 199;
               break;
            case 218:
               var10000 = 117;
               break;
            case 219:
               var10000 = 147;
               break;
            case 220:
               var10000 = 126;
               break;
            case 221:
               var10000 = 93;
               break;
            case 222:
               var10000 = 111;
               break;
            case 223:
               var10000 = 171;
               break;
            case 224:
               var10000 = 179;
               break;
            case 225:
               var10000 = 154;
               break;
            case 226:
               var10000 = 29;
               break;
            case 227:
               var10000 = 155;
               break;
            case 228:
               var10000 = 36;
               break;
            case 229:
               var10000 = 25;
               break;
            case 230:
               var10000 = 96;
               break;
            case 231:
               var10000 = 89;
               break;
            case 232:
               var10000 = 252;
               break;
            case 233:
               var10000 = 196;
               break;
            case 234:
               var10000 = 173;
               break;
            case 235:
               var10000 = 202;
               break;
            case 236:
               var10000 = 72;
               break;
            case 237:
               var10000 = 32;
               break;
            case 238:
               var10000 = 220;
               break;
            case 239:
               var10000 = 55;
               break;
            case 240:
               var10000 = 188;
               break;
            case 241:
               var10000 = 98;
               break;
            case 242:
               var10000 = 43;
               break;
            case 243:
               var10000 = 215;
               break;
            case 244:
               var10000 = 219;
               break;
            case 245:
               var10000 = 222;
               break;
            case 246:
               var10000 = 140;
               break;
            case 247:
               var10000 = 159;
               break;
            case 248:
               var10000 = 250;
               break;
            case 249:
               var10000 = 34;
               break;
            case 250:
               var10000 = 160;
               break;
            case 251:
               var10000 = 88;
               break;
            case 252:
               var10000 = 82;
               break;
            case 253:
               var10000 = 53;
               break;
            case 254:
               var10000 = 143;
               break;
            default:
               var10000 = 3;
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

         h[var2] = new String(var3).intern();
      }

      return h[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26872;
      if (m[var3] == null) {
         m[var3] = (int)(l[var3] ^ var1);
      }

      return m[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      int var16;
      int var23;
      int var27;
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "nêêÄéåí1CIä<\u001b´3\u0091\bWãéå\u0089Óá¯";
      int var12 = "nêêÄéåí1CIä<\u001b´3\u0091\bWãéå\u0089Óá¯".length();
      char var9 = 16;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            var23 = 16;
            var10002 = var10003;
            var16 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 16;
               var10006 = var14;
            } else {
               var23 = 16;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 16;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 19;
                     break;
                  case 1:
                     var41 = 82;
                     break;
                  case 2:
                     var41 = 17;
                     break;
                  case 3:
                     var41 = 33;
                     break;
                  case 4:
                     var41 = 43;
                     break;
                  case 5:
                     var41 = 53;
                     break;
                  default:
                     var41 = 74;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var13[var11++] = var25;
         if ((var8 += var9) >= var12) {
            g = var13;
            h = new String[2];
            long var0 = 5451125638915824452L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "s\u0081ÇÒ ì\u001cú+H¿Ór¶-º";
            int var5 = "s\u0081ÇÒ ì\u001cú+H¿Ór¶-º".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
               var18 = var3++;
               long var31 = (
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
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            l = var6;
            m = new Integer[2];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }
}





