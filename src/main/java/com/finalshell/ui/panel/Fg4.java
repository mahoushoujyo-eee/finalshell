package com.finalshell.ui.panel;

import com.finalshell.core.L1;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellRenderer;
import net.miginfocom.swing.MigLayout;

public class Fg4 extends JPanel implements TableCellRenderer {
   public JLabel I;
   public Color U;
   public boolean x;
   public boolean u;
   public int j;
   public String Q;
   public ArrayList b;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public Fg4() {
      Color var10001 = new Color(0.0F, 0.0F, 0.0F, 0.0F);
      long var2 = 497763845716111745L;
      Color var1 = var10001;
      Ref.s(497763845716111745L, var1, var2);
      Registry.lookupField(461058301372135593L).setBoolean(this, false);
      Registry.lookupField(430960577380421690L).setBoolean(this, false);
      Registry.lookupField(542316589517833318L).setInt(this, -1);
      long var4 = 604220075105845485L;
      Object var3 = null;
      Ref.s(604220075105845485L, var3, var4);
      this.setOpaque(true);
      this.setLayout(new MigLayout(a(19312, 19938), a(19325, -1332), a(19319, 32631)));
      this.setBorder(null);
      this.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
      JLabel var10003 = new JLabel();
      long var6 = 442347690627635916L;
      JLabel var5 = var10003;
      Ref.s(442347690627635916L, var5, var6);
      Object var7 = 442347690627635916L;
      ((JLabel)Ref.g(442347690627635916L, var7)).setBorder(null);
      Object var9 = 442347690627635916L;
      ((JLabel)Ref.g(442347690627635916L, var9)).setOpaque(false);
      Object var11 = 442347690627635916L;
      ((JLabel)Ref.g(442347690627635916L, var11)).setHorizontalAlignment(2);
      Object var13 = 442347690627635916L;
      this.add((JLabel)Ref.g(442347690627635916L, var13), "");
      long var16 = 438759596186612739L;
      Object var15 = null;
      Ref.s(438759596186612739L, var15, var16);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      boolean var108;
      boolean var99;
      String[] var7;
      L1 var8;
      int var12;
      Point var13;
      label289: {
         var8 = (L1)var2;
         String[] var10000 = ClearListDialog.i$arrString();
         Object var9 = null;
         Object var10 = null;
         var7 = var10000;
         Point var11 = var1.getMousePosition();
         var12 = -1;
         var13 = MouseInfo.getPointerInfo().getLocation();
         SwingUtilities.convertPointFromScreen(var13, var1);
         Point var86 = var13;
         if (var7 == null) {
            if (var13 == null) {
               break label289;
            }

            var86 = new Point(3, var13.y);
         }

         Point var14 = var86;
         var12 = var1.rowAtPoint(var14);
      }

      label283: {
         int var90;
         label292: {
            int var10003;
            label293: {
               label280: {
                  label279: {
                     label313: {
                        byte var87 = (byte)((var3) ? 1 : 0);
                        if (var7 == null) {
                           if (var3 == 0) {
                              break label279;
                           }

                           this.setBackground(new Color(0.8F, 0.8F, 0.8F, 1.0F));
                           if (var7 != null) {
                              break label313;
                           }

                           var87 = (byte)((Registry.lookupField(430960577380421690L).getBoolean(this)) ? 1 : 0);
                        }

                        if (var87 != 0 && var3 != 0) {
                           String var10001 = Registry.emptyArgs();
                           long var26 = 542058094445767607L;
                           Object var25 = var10001;
                           var10001 = Ref.h(542058094445767607L, var25, var26);

                           try {
                              var10001 = (String)var10001;
                           } catch (InvocationTargetException var77) {
                              throw var77.getTargetException();
                           }

                           String var78 = var10001.trim();
                           ArrayList var10002 = new ArrayList();
                           long var28 = 438759596186612739L;
                           ArrayList var27 = var10002;
                           Ref.s(438759596186612739L, var27, var28);
                           char[] var15 = var78.toCharArray();
                           StringBuffer var16 = new StringBuffer();
                           int var17 = 1;
                           int var18 = 0;
                           char[] var19 = var15;
                           int var20 = var15.length;
                           int var21 = 0;

                           while (var21 < var20) {
                              char var22;
                              int var85;
                              label266: {
                                 var22 = var19[var21];
                                 boolean var23 = false;
                                 var90 = var22;
                                 if (var7 == null) {
                                    var10003 = a(26769, 8075255855381267327L);
                                    if (var7 != null) {
                                       break label293;
                                    }

                                    if (var22 != var10003) {
                                       var85 = 1;
                                       if (var7 == null) {
                                          break label266;
                                       }
                                    }

                                    var90 = 0;
                                 }

                                 var85 = var90;
                              }

                              boolean var24 = false;
                              var90 = var17;
                              var10003 = var85;
                              if (var7 == null) {
                                 if (var17 != var85) {
                                    var24 = true;
                                    Object var29 = 438759596186612739L;
                                    ((ArrayList)Ref.g(438759596186612739L, var29)).add(var16);
                                    var16 = new StringBuffer();
                                 }

                                 var90 = var22;
                                 var10003 = a(14762, 8854418964381307463L);
                              }

                              label257: {
                                 if (var90 == var10003) {
                                    var16.append(a(19313, 28568));
                                    if (var7 == null) {
                                       break label257;
                                    }
                                 }

                                 var16.append(var22);
                              }

                              var17 = var85;
                              var18++;
                              if (var7 == null) {
                                 if (var18 == var15.length) {
                                    if (!var24) {
                                    }

                                    Object var31 = 438759596186612739L;
                                    ((ArrayList)Ref.g(438759596186612739L, var31)).add(var16);
                                 }

                                 var21++;
                              }

                              if (var7 != null) {
                                 break;
                              }
                           }

                           if (var7 == null) {
                              break label280;
                           }
                        }
                     }

                     long var34 = 438759596186612739L;
                     Object var33 = null;
                     Ref.s(438759596186612739L, var33, var34);
                     if (var7 == null) {
                        break label280;
                     }
                  }

                  this.setBackground(new Color(0.97F, 0.97F, 0.97F, 1.0F));
                  Object var35 = 442347690627635916L;
                  ((JLabel)Ref.g(442347690627635916L, var35)).setForeground(new Color(1.0F, 1.0F, 1.0F, 1.0F));
               }

               var90 = (var3) ? 1 : 0;
               if (var7 == null) {
                  if (var3 != 0) {
                     break label283;
                  }

                  var90 = var12;
               }

               if (var7 != null) {
                  break label292;
               }

               var10003 = var5;
            }

            if (var90 != var10003) {
               break label283;
            }

            var90 = var13.y;
         }

         if (var90 > 0) {
            this.setBackground(new Color(0.9F, 0.9F, 0.9F, 1.0F));
         }
      }

      L1 var92 = var8;
      if (var7 == null) {
         if (var8 != null) {
            label316: {
               label220: {
                  Fg4 var95;
                  label300: {
                     int var10004;
                     label301: {
                        label217: {
                           StringBuffer var79 = new StringBuffer();
                           if (var6 == 0) {
                              if (var7 == null) {
                                 Object var37 = 438759596186612739L;
                                 label212:
                                 if ((ArrayList)Ref.g(438759596186612739L, var37) != null) {
                                    byte var94 = (byte)((var3) ? 1 : 0);
                                    if (var7 == null) {
                                       if (var3 == 0) {
                                          break label212;
                                       }

                                       var79.append(a(19318, -13796));
                                       var94 = 0;
                                    }

                                    int var80 = var94;
                                    var95 = this;
                                    Object var39 = 438759596186612739L;

                                    for (StringBuffer var83 : (ArrayList)Ref.g(438759596186612739L, var39)) {
                                       var10004 = Registry.lookupField(542316589517833318L).getInt(this);
                                       if (var7 == null) {
                                          if (var7 != null) {
                                             break label301;
                                          }

                                          var10004 = var10004 == var80 ? 1 : 0;
                                       }

                                       int var84 = var10004;
                                       var10004 = var84;
                                       if (var7 == null) {
                                          if (var84 != 0) {
                                             var79.append(a(19317, 14396));
                                          }

                                          var79.append(var83);
                                          var10004 = var84;
                                       }

                                       if (var7 == null) {
                                          if (var10004 != 0) {
                                             var79.append(a(19316, 4394));
                                          }

                                          var10004 = (var83.toString().startsWith(a(19314, -31016))) ? 1 : 0;
                                       }

                                       if (var10004 == 0) {
                                          var80++;
                                       }

                                       if (var7 != null) {
                                          break;
                                       }
                                    }

                                    var79.append(a(19315, -18270));
                                    Object var41 = 442347690627635916L;
                                    ((JLabel)Ref.g(442347690627635916L, var41)).setText(var79.toString());
                                    if (var7 == null) {
                                       break label217;
                                    }
                                 }
                              }

                              Object var43 = 442347690627635916L;
                              JLabel var96 = (JLabel)Ref.g(442347690627635916L, var43);
                              String var10005 = (String)(Registry.emptyArgs());
                              long var46 = 542058094445767607L;
                              Object var45 = var10005;
                              var10005 = Ref.h(542058094445767607L, var45, var46);

                              try {
                                 var10005 = (String)var10005;
                              } catch (InvocationTargetException var76) {
                                 throw var76.getTargetException();
                              }

                              var8.setText(var10005);
                              if (var7 == null) {
                                 break label217;
                              }
                           }

                           Object var47 = 442347690627635916L;
                           ((JLabel)Ref.g(442347690627635916L, var47)).setText("");
                        }

                        var95 = var1.getRowCount() - var5;
                        if (var7 != null) {
                           break label300;
                        }

                        var10004 = Registry.lookupField(231094135750452722L).getInt(null);
                     }

                     if (!(var95 > var10004) || var7 != null) {
                        break label220;
                     }

                     var95 = Registry.lookupField(461058301372135593L).getBoolean(this);
                  }

                  if (var95 != null) {
                     Registry.emptyArgs();
                     long var49 = 270389152141252877L;
                     Ref.h2(270389152141252877L, var49);
                     Object[] var103 = Registry.emptyArgs();
                     long var52 = 163462326892114024L;
                     Object[] var51 = var103;
                     Ref.h(163462326892114024L, var51, var52);
                     Object var10006 = Registry.emptyArgs();
                     long var54 = 633712494917113170L;
                     Object var53 = var10006;
                     var10006 = Ref.h(633712494917113170L, var53, var54);

                     try {
                        var108 = (Boolean)var10006;
                     } catch (InvocationTargetException var75) {
                        throw var75.getTargetException();
                     }

                     if (!var108) {
                        Object var55 = 442347690627635916L;
                        ((JLabel)Ref.g(442347690627635916L, var55)).setEnabled(false);
                        if (var7 == null) {
                           break label316;
                        }
                     }
                  }
               }

               Object var57 = 442347690627635916L;
               ((JLabel)Ref.g(442347690627635916L, var57)).setEnabled(true);
            }

            Icon var104 = (Icon)(Registry.emptyArgs());
            long var60 = 587854171453059645L;
            Object var59 = var104;
            var104 = Ref.h(587854171453059645L, var59, var60);

            try {
               var104 = (Icon)var104;
            } catch (InvocationTargetException var74) {
               throw var74.getTargetException();
            }

            Icon var81 = var104;
            Object var61 = 442347690627635916L;
            ((JLabel)Ref.g(442347690627635916L, var61)).setIcon(var81);
            Object var63 = 442347690627635916L;
            JLabel var10007 = (JLabel)Ref.g(442347690627635916L, var63);
            Dimension var10008;
            int var10010 = a(29360, 6594772236769614172L);
            Object var65 = 442347690627635916L;
var10010 = new Point((int)this, ((JLabel)Ref.g(442347690627635916L, var65)).getPreferredSize().height);
            var10008.setMinimumSize(var10008);
         }

         var92 = var8;
      }

      if (var7 != null || var92 != null) {
         Object var97 = Registry.emptyArgs();
         long var68 = 456080764218192918L;
         Object var67 = var97;
         var97 = Ref.h(456080764218192918L, var67, var68);

         try {
            var99 = (Boolean)var97;
         } catch (InvocationTargetException var73) {
            throw var73.getTargetException();
         }

         if (var99) {
            Object var69 = 442347690627635916L;
            ((JLabel)Ref.g(442347690627635916L, var69)).setForeground(new Color(0.7F, 0.0F, 0.0F, 1.0F));
            if (var7 == null) {
               return this;
            }
         }
      }

      Object var71 = 442347690627635916L;
      ((JLabel)Ref.g(442347690627635916L, var71)).setForeground(new Color(0.0F, 0.0F, 0.0F, 0.9F));
      return this;
   }

   public void q() {
      Registry.lookupField(542316589517833318L).setInt(this, -1);
   }

   public int r() {
      return Registry.lookupField(542316589517833318L).getInt(this);
   }

   public void j() {
      ClearListDialog.i$arrString();
      long var5 = 604220075105845485L;
      Object var4 = null;
      Ref.s(604220075105845485L, var4, var5);
      Object var6 = 438759596186612739L;
      Object var10002 = (ArrayList)Ref.g(438759596186612739L, var6);
      if (this == null) {
         if (var10002 == null) {
            return;
         }

         var10002 = this;
         Object var8 = 438759596186612739L;
         ArrayList var10003 = (ArrayList)Ref.g(438759596186612739L, var8);
      }

      label29: {
         int var2 = (var10002.size() + 1) / 2;
         Fg4 var16 = this;
         if (this == null) {
            if (Registry.lookupField(542316589517833318L).getInt(this) == -1) {
               Registry.lookupField(542316589517833318L).setInt(this, var2 - 1);
               if (this == null) {
                  break label29;
               }
            }

            var16 = this;
         }

         Registry.lookupField(542316589517833318L).setInt(var16, Registry.lookupField(542316589517833318L).getInt(var16) - 1);
      }

      int var3 = Registry.lookupField(542316589517833318L).getInt(this) * 2;
      int var17 = var3;
      Fg4 var18 = -1;
      if (this == null) {
         if (var3 <= -1) {
            return;
         }

         var17 = var3;
         var18 = this;
         Object var10 = 438759596186612739L;
         ((ArrayList)Ref.g(438759596186612739L, var10)).size();
      }

      if (var17 < var18) {
         Object var12 = 438759596186612739L;
         String var10004 = ((StringBuffer)((ArrayList)Ref.g(438759596186612739L, var12)).get(var3)).toString();
         long var15 = 604220075105845485L;
         String var14 = var10004;
         Ref.s(604220075105845485L, var14, var15);
      }
   }

   public void x() {
      String[] var1 = ClearListDialog.i$arrString();
      Object var4 = 438759596186612739L;
      Object var10001 = (ArrayList)Ref.g(438759596186612739L, var4);
      if (var1 == null) {
         if (var10001 == null) {
            return;
         }

         Registry.lookupField(542316589517833318L).setInt(this, Registry.lookupField(542316589517833318L).getInt(this) + 1);
         var10001 = this;
         Object var6 = 438759596186612739L;
         ArrayList var10002 = (ArrayList)Ref.g(438759596186612739L, var6);
      }

      int var2 = (var10001.size() + 1) / 2;
      int var14 = Registry.lookupField(542316589517833318L).getInt(this);
      int var16 = var2;
      if (var1 == null) {
         if (var14 > var2) {
            Registry.lookupField(542316589517833318L).setInt(this, 0);
         }

         var14 = Registry.lookupField(542316589517833318L).getInt(this);
         var16 = 2;
      }

      int var3 = var14 * var16;
      int var15 = var3;
      Fg4 var17 = -1;
      if (var1 == null) {
         if (var3 <= -1) {
            return;
         }

         var15 = var3;
         var17 = this;
         Object var8 = 438759596186612739L;
         ((ArrayList)Ref.g(438759596186612739L, var8)).size();
      }

      if (var15 < var17) {
         Object var10 = 438759596186612739L;
         String var10003 = ((StringBuffer)((ArrayList)Ref.g(438759596186612739L, var10)).get(var3)).toString();
         long var13 = 604220075105845485L;
         String var12 = var10003;
         Ref.s(604220075105845485L, var12, var13);
      }
   }

   public boolean K() {
      return Registry.lookupField(461058301372135593L).getBoolean(this);
   }

   public void h(boolean var1) {
      Registry.lookupField(461058301372135593L).setBoolean(this, var1);
   }

   public boolean G() {
      return Registry.lookupField(430960577380421690L).getBoolean(this);
   }

   public void e(boolean var1) {
      Registry.lookupField(430960577380421690L).setBoolean(this, var1);
   }

   public String H() {
      Object var1 = 604220075105845485L;
      return (String)Ref.g(604220075105845485L, var1);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 19317) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 204;
               break;
            case 1:
               var10000 = 154;
               break;
            case 2:
               var10000 = 149;
               break;
            case 3:
               var10000 = 23;
               break;
            case 4:
               var10000 = 250;
               break;
            case 5:
               var10000 = 151;
               break;
            case 6:
               var10000 = 172;
               break;
            case 7:
               var10000 = 5;
               break;
            case 8:
               var10000 = 78;
               break;
            case 9:
               var10000 = 35;
               break;
            case 10:
               var10000 = 223;
               break;
            case 11:
               var10000 = 241;
               break;
            case 12:
               var10000 = 68;
               break;
            case 13:
               var10000 = 81;
               break;
            case 14:
               var10000 = 216;
               break;
            case 15:
               var10000 = 109;
               break;
            case 16:
               var10000 = 221;
               break;
            case 17:
               var10000 = 32;
               break;
            case 18:
               var10000 = 170;
               break;
            case 19:
               var10000 = 237;
               break;
            case 20:
               var10000 = 190;
               break;
            case 21:
               var10000 = 217;
               break;
            case 22:
               var10000 = 4;
               break;
            case 23:
               var10000 = 243;
               break;
            case 24:
               var10000 = 69;
               break;
            case 25:
               var10000 = 20;
               break;
            case 26:
               var10000 = 49;
               break;
            case 27:
               var10000 = 196;
               break;
            case 28:
               var10000 = 184;
               break;
            case 29:
               var10000 = 177;
               break;
            case 30:
               var10000 = 40;
               break;
            case 31:
               var10000 = 29;
               break;
            case 32:
               var10000 = 208;
               break;
            case 33:
               var10000 = 0;
               break;
            case 34:
               var10000 = 201;
               break;
            case 35:
               var10000 = 218;
               break;
            case 36:
               var10000 = 27;
               break;
            case 37:
               var10000 = 53;
               break;
            case 38:
               var10000 = 86;
               break;
            case 39:
               var10000 = 65;
               break;
            case 40:
               var10000 = 138;
               break;
            case 41:
               var10000 = 160;
               break;
            case 42:
               var10000 = 153;
               break;
            case 43:
               var10000 = 43;
               break;
            case 44:
               var10000 = 194;
               break;
            case 45:
               var10000 = 77;
               break;
            case 46:
               var10000 = 80;
               break;
            case 47:
               var10000 = 134;
               break;
            case 48:
               var10000 = 135;
               break;
            case 49:
               var10000 = 198;
               break;
            case 50:
               var10000 = 127;
               break;
            case 51:
               var10000 = 193;
               break;
            case 52:
               var10000 = 215;
               break;
            case 53:
               var10000 = 233;
               break;
            case 54:
               var10000 = 178;
               break;
            case 55:
               var10000 = 24;
               break;
            case 56:
               var10000 = 166;
               break;
            case 57:
               var10000 = 155;
               break;
            case 58:
               var10000 = 185;
               break;
            case 59:
               var10000 = 111;
               break;
            case 60:
               var10000 = 128;
               break;
            case 61:
               var10000 = 186;
               break;
            case 62:
               var10000 = 26;
               break;
            case 63:
               var10000 = 71;
               break;
            case 64:
               var10000 = 13;
               break;
            case 65:
               var10000 = 168;
               break;
            case 66:
               var10000 = 79;
               break;
            case 67:
               var10000 = 253;
               break;
            case 68:
               var10000 = 157;
               break;
            case 69:
               var10000 = 112;
               break;
            case 70:
               var10000 = 156;
               break;
            case 71:
               var10000 = 147;
               break;
            case 72:
               var10000 = 203;
               break;
            case 73:
               var10000 = 202;
               break;
            case 74:
               var10000 = 25;
               break;
            case 75:
               var10000 = 182;
               break;
            case 76:
               var10000 = 245;
               break;
            case 77:
               var10000 = 7;
               break;
            case 78:
               var10000 = 63;
               break;
            case 79:
               var10000 = 234;
               break;
            case 80:
               var10000 = 192;
               break;
            case 81:
               var10000 = 34;
               break;
            case 82:
               var10000 = 44;
               break;
            case 83:
               var10000 = 101;
               break;
            case 84:
               var10000 = 240;
               break;
            case 85:
               var10000 = 162;
               break;
            case 86:
               var10000 = 214;
               break;
            case 87:
               var10000 = 228;
               break;
            case 88:
               var10000 = 171;
               break;
            case 89:
               var10000 = 36;
               break;
            case 90:
               var10000 = 54;
               break;
            case 91:
               var10000 = 188;
               break;
            case 92:
               var10000 = 197;
               break;
            case 93:
               var10000 = 133;
               break;
            case 94:
               var10000 = 33;
               break;
            case 95:
               var10000 = 115;
               break;
            case 96:
               var10000 = 74;
               break;
            case 97:
               var10000 = 85;
               break;
            case 98:
               var10000 = 100;
               break;
            case 99:
               var10000 = 45;
               break;
            case 100:
               var10000 = 106;
               break;
            case 101:
               var10000 = 12;
               break;
            case 102:
               var10000 = 75;
               break;
            case 103:
               var10000 = 125;
               break;
            case 104:
               var10000 = 50;
               break;
            case 105:
               var10000 = 173;
               break;
            case 106:
               var10000 = 191;
               break;
            case 107:
               var10000 = 42;
               break;
            case 108:
               var10000 = 252;
               break;
            case 109:
               var10000 = 19;
               break;
            case 110:
               var10000 = 62;
               break;
            case 111:
               var10000 = 232;
               break;
            case 112:
               var10000 = 102;
               break;
            case 113:
               var10000 = 46;
               break;
            case 114:
               var10000 = 11;
               break;
            case 115:
               var10000 = 37;
               break;
            case 116:
               var10000 = 2;
               break;
            case 117:
               var10000 = 219;
               break;
            case 118:
               var10000 = 116;
               break;
            case 119:
               var10000 = 136;
               break;
            case 120:
               var10000 = 56;
               break;
            case 121:
               var10000 = 131;
               break;
            case 122:
               var10000 = 91;
               break;
            case 123:
               var10000 = 22;
               break;
            case 124:
               var10000 = 92;
               break;
            case 125:
               var10000 = 88;
               break;
            case 126:
               var10000 = 64;
               break;
            case 127:
               var10000 = 108;
               break;
            case 128:
               var10000 = 229;
               break;
            case 129:
               var10000 = 130;
               break;
            case 130:
               var10000 = 73;
               break;
            case 131:
               var10000 = 6;
               break;
            case 132:
               var10000 = 169;
               break;
            case 133:
               var10000 = 226;
               break;
            case 134:
               var10000 = 144;
               break;
            case 135:
               var10000 = 57;
               break;
            case 136:
               var10000 = 242;
               break;
            case 137:
               var10000 = 137;
               break;
            case 138:
               var10000 = 150;
               break;
            case 139:
               var10000 = 123;
               break;
            case 140:
               var10000 = 9;
               break;
            case 141:
               var10000 = 17;
               break;
            case 142:
               var10000 = 158;
               break;
            case 143:
               var10000 = 180;
               break;
            case 144:
               var10000 = 161;
               break;
            case 145:
               var10000 = 38;
               break;
            case 146:
               var10000 = 8;
               break;
            case 147:
               var10000 = 58;
               break;
            case 148:
               var10000 = 210;
               break;
            case 149:
               var10000 = 183;
               break;
            case 150:
               var10000 = 14;
               break;
            case 151:
               var10000 = 129;
               break;
            case 152:
               var10000 = 126;
               break;
            case 153:
               var10000 = 209;
               break;
            case 154:
               var10000 = 10;
               break;
            case 155:
               var10000 = 238;
               break;
            case 156:
               var10000 = 3;
               break;
            case 157:
               var10000 = 72;
               break;
            case 158:
               var10000 = 143;
               break;
            case 159:
               var10000 = 227;
               break;
            case 160:
               var10000 = 248;
               break;
            case 161:
               var10000 = 255;
               break;
            case 162:
               var10000 = 247;
               break;
            case 163:
               var10000 = 159;
               break;
            case 164:
               var10000 = 1;
               break;
            case 165:
               var10000 = 21;
               break;
            case 166:
               var10000 = 225;
               break;
            case 167:
               var10000 = 239;
               break;
            case 168:
               var10000 = 83;
               break;
            case 169:
               var10000 = 174;
               break;
            case 170:
               var10000 = 87;
               break;
            case 171:
               var10000 = 163;
               break;
            case 172:
               var10000 = 70;
               break;
            case 173:
               var10000 = 236;
               break;
            case 174:
               var10000 = 205;
               break;
            case 175:
               var10000 = 230;
               break;
            case 176:
               var10000 = 105;
               break;
            case 177:
               var10000 = 118;
               break;
            case 178:
               var10000 = 94;
               break;
            case 179:
               var10000 = 121;
               break;
            case 180:
               var10000 = 146;
               break;
            case 181:
               var10000 = 97;
               break;
            case 182:
               var10000 = 200;
               break;
            case 183:
               var10000 = 231;
               break;
            case 184:
               var10000 = 165;
               break;
            case 185:
               var10000 = 212;
               break;
            case 186:
               var10000 = 15;
               break;
            case 187:
               var10000 = 251;
               break;
            case 188:
               var10000 = 249;
               break;
            case 189:
               var10000 = 30;
               break;
            case 190:
               var10000 = 222;
               break;
            case 191:
               var10000 = 207;
               break;
            case 192:
               var10000 = 28;
               break;
            case 193:
               var10000 = 164;
               break;
            case 194:
               var10000 = 89;
               break;
            case 195:
               var10000 = 244;
               break;
            case 196:
               var10000 = 246;
               break;
            case 197:
               var10000 = 124;
               break;
            case 198:
               var10000 = 213;
               break;
            case 199:
               var10000 = 176;
               break;
            case 200:
               var10000 = 140;
               break;
            case 201:
               var10000 = 67;
               break;
            case 202:
               var10000 = 181;
               break;
            case 203:
               var10000 = 220;
               break;
            case 204:
               var10000 = 113;
               break;
            case 205:
               var10000 = 179;
               break;
            case 206:
               var10000 = 235;
               break;
            case 207:
               var10000 = 60;
               break;
            case 208:
               var10000 = 104;
               break;
            case 209:
               var10000 = 254;
               break;
            case 210:
               var10000 = 142;
               break;
            case 211:
               var10000 = 41;
               break;
            case 212:
               var10000 = 52;
               break;
            case 213:
               var10000 = 84;
               break;
            case 214:
               var10000 = 117;
               break;
            case 215:
               var10000 = 59;
               break;
            case 216:
               var10000 = 76;
               break;
            case 217:
               var10000 = 148;
               break;
            case 218:
               var10000 = 152;
               break;
            case 219:
               var10000 = 139;
               break;
            case 220:
               var10000 = 145;
               break;
            case 221:
               var10000 = 132;
               break;
            case 222:
               var10000 = 39;
               break;
            case 223:
               var10000 = 55;
               break;
            case 224:
               var10000 = 122;
               break;
            case 225:
               var10000 = 82;
               break;
            case 226:
               var10000 = 95;
               break;
            case 227:
               var10000 = 187;
               break;
            case 228:
               var10000 = 175;
               break;
            case 229:
               var10000 = 103;
               break;
            case 230:
               var10000 = 189;
               break;
            case 231:
               var10000 = 98;
               break;
            case 232:
               var10000 = 110;
               break;
            case 233:
               var10000 = 199;
               break;
            case 234:
               var10000 = 47;
               break;
            case 235:
               var10000 = 61;
               break;
            case 236:
               var10000 = 90;
               break;
            case 237:
               var10000 = 107;
               break;
            case 238:
               var10000 = 16;
               break;
            case 239:
               var10000 = 206;
               break;
            case 240:
               var10000 = 31;
               break;
            case 241:
               var10000 = 48;
               break;
            case 242:
               var10000 = 211;
               break;
            case 243:
               var10000 = 195;
               break;
            case 244:
               var10000 = 119;
               break;
            case 245:
               var10000 = 120;
               break;
            case 246:
               var10000 = 114;
               break;
            case 247:
               var10000 = 167;
               break;
            case 248:
               var10000 = 141;
               break;
            case 249:
               var10000 = 51;
               break;
            case 250:
               var10000 = 18;
               break;
            case 251:
               var10000 = 99;
               break;
            case 252:
               var10000 = 93;
               break;
            case 253:
               var10000 = 66;
               break;
            case 254:
               var10000 = 224;
               break;
            default:
               var10000 = 96;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11244;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var13 = new String[9];
      int var11 = 0;
      String var10 = "\u0086ßaþ÷Ñ\u009d\u0096KZ;Ù¤>+«\u0007\u0087ìHùàD{\u0004Í±·÷\f¿\u008a]\u0098\u0010`%pë!Gß\u0006\u00155G·\u009b]\u0019\u0089öp\u0099\t\u0015\u0014\u0004\u009eX\u0094µØ{:\u009d\u0098¨\u0013\u009c\u009epNo\u000e\u000e\u0095\u0083\u000e\u0014¦ôø\u0013RÔ5¿½ó";
      int var12 = "\u0086ßaþ÷Ñ\u009d\u0096KZ;Ù¤>+«\u0007\u0087ìHùàD{\u0004Í±·÷\f¿\u008a]\u0098\u0010`%pë!Gß\u0006\u00155G·\u009b]\u0019\u0089öp\u0099\t\u0015\u0014\u0004\u009eX\u0094µØ{:\u009d\u0098¨\u0013\u009c\u009epNo\u000e\u000e\u0095\u0083\u000e\u0014¦ôø\u0013RÔ5¿½ó"
         .length();
      char var9 = 16;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 54;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 93;
                        break;
                     case 1:
                        var58 = 66;
                        break;
                     case 2:
                        var58 = 62;
                        break;
                     case 3:
                        var58 = 121;
                        break;
                     case 4:
                        var58 = 26;
                        break;
                     case 5:
                        var58 = 82;
                        break;
                     default:
                        var58 = 73;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     c = new String[9];
                     long var0 = 5396316259461862845L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "?\u008a$·¯¡K1þÅù\u0086¤\u008d\u0087Ú£Í\u008cov\u0087Vâ";
                     int var5 = "?\u008a$·¯¡K1þÅù\u0086¤\u008d\u0087Ú£Í\u008cov\u0087Vâ".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     d = var6;
                     e = new Integer[3];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "À)\u0010Ù\u009c}\u0004<:dk";
                  var12 = "À)\u0010Ù\u009c}\u0004<:dk".length();
                  var9 = 6;
                  var16 = -1;
            }

            var10000 = 115;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





