package com.finalshell.ui.adapter;

import com.finalshell.core.Cn4;
import com.finalshell.core.KV;
import com.finalshell.core.Lw4_2;
import com.finalshell.core.Zh2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.BQ;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.YQ;
import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class ReservedAddressAdapter2 extends DefaultTableCellRenderer {
   public Border T;
   public SimpleDateFormat W;
   public BQ q;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public ReservedAddressAdapter2() {
      Border var10001 = BorderFactory.createEmptyBorder(0, a(10793, 209499725788102033L), 2, 4);
      long var2 = 609069556332550507L;
      Border var1 = var10001;
      Ref.s(609069556332550507L, var1, var2);
      SimpleDateFormat var10002 = new SimpleDateFormat(a(29186, 29684));
      long var4 = 361415565481925721L;
      SimpleDateFormat var3 = var10002;
      Ref.s(361415565481925721L, var3, var4);
      BQ var10003 = new BQ();
      long var6 = 181705794370842224L;
      BQ var5 = var10003;
      Ref.s(181705794370842224L, var5, var6);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      String var101;
      String var104;
      String var107;
      Integer var112;
      Integer var115;
      boolean var123;
      Integer var139;
      Object[] var33;
      Object var21 = 181705794370842224L;
      BQ var8 = (BQ)Ref.g(181705794370842224L, var21);
      int[] var10001 = YQ.m();
      Object var9 = null;
      Object var10 = null;
      byte var11 = 2;
      boolean var12 = false;
      int[] var7 = var10001;
      Lw4_2 var13 = (Lw4_2)var1;
      int var14 = var1.convertColumnIndexToModel(var6);
      if (var14 == 1) {
      }

      var8.setHorizontalAlignment(2);
      Cn4 var15 = null;
      Object[] var10002 = Registry.packArgs(false);
      long var24 = 184443954444890081L;
      Object[] var23 = var10002;
      Ref.h(184443954444890081L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var90) {
         throw var90.getTargetException();
      }

      Object var10003 = Registry.packArgs(false);
      long var26 = 190819213857712489L;
      Object var25 = var10003;
      Ref.h(190819213857712489L, var25, var26);

      try {
         ;
      } catch (InvocationTargetException var89) {
         throw var89.getTargetException();
      }

      label388: {
         var10003 = var2.getClass();
         if (var7 != null) {
            if (!var10003.equals(Cn4.class)) {
               break label388;
            }

            var10003 = (Object[])var2;
         }

         var15 = (Cn4)var10003;
         Object var16 = "";
         KV var10004 = (KV)(Registry.emptyArgs());
         long var28 = 249636090880581982L;
         Object var27 = var10004;
         var10004 = Ref.h(249636090880581982L, var27, var28);

         try {
            var10004 = (KV)var10004;
         } catch (InvocationTargetException var88) {
            throw var88.getTargetException();
         }

         label389: {
            KV var17 = var10004;
            int var98 = var14;
            if (var7 != null) {
               if (var14 == 0) {
                  new StringBuilder();
                  Object var10006 = Registry.emptyArgs();
                  long var30 = 406073307634140563L;
                  Object var29 = var10006;
                  var10006 = Ref.h(406073307634140563L, var29, var30);

                  try {
                     var112 = (Integer)var10006;
                  } catch (InvocationTargetException var87) {
                     throw var87.getTargetException();
                  }

                  var16 = var15.append(var112 + 1).append("").toString();
                  if (var7 != null) {
                     break label389;
                  }
               }

               var98 = var14;
            }

            byte var10005 = 1;
            if (var7 != null) {
               if (var98 == 1) {
                  Object[] var99 = Registry.emptyArgs();
                  long var32 = 278346905124376511L;
                  Object[] var31 = var99;
                  Object var100 = Ref.h(278346905124376511L, var31, var32);

                  try {
                     var101 = (String)var100;
                  } catch (InvocationTargetException var86) {
                     throw var86.getTargetException();
                  }

                  var16 = var101;
                  if (var7 != null) {
                     Object var113 = Registry.emptyArgs();
                     long var34 = 229563943762043592L;
                     var33 = var113;
                     var113 = Ref.h(229563943762043592L, var33, var34);

                     try {
                        var115 = (Integer)var113;
                     } catch (InvocationTargetException var85) {
                        throw var85.getTargetException();
                     }

                     if (var115 > 1) {
                        new StringBuilder().append((String)var16).append("┋");
                        Object var10008 = Registry.emptyArgs();
                        long var36 = 229563943762043592L;
                        Object var35 = var10008;
                        var10008 = Ref.h(229563943762043592L, var35, var36);

                        try {
                           var139 = (Integer)var10008;
                        } catch (InvocationTargetException var84) {
                           throw var84.getTargetException();
                        }

                        var16 = var15.append(var139).toString();
                     }
                  }

                  String var116 = (String)(Registry.emptyArgs());
                  long var38 = 410964816567354120L;
                  Object var37 = var116;
                  var116 = Ref.h(410964816567354120L, var37, var38);

                  try {
                     var116 = (String)var116;
                  } catch (InvocationTargetException var83) {
                     throw var83.getTargetException();
                  }

                  if (var7 != null) {
                     if (var116 != null) {
                        new StringBuilder().append((String)var16).append("┋");
                        String var140 = (String)(Registry.emptyArgs());
                        long var40 = 410964816567354120L;
                        Object var39 = var140;
                        var140 = Ref.h(410964816567354120L, var39, var40);

                        try {
                           var140 = (String)var140;
                        } catch (InvocationTargetException var82) {
                           throw var82.getTargetException();
                        }

                        var16 = var15.append((String)var140).toString();
                     }

                     var116 = var15;
                     Object[] var10007 = Registry.emptyArgs();
                     long var42 = 278346905124376511L;
                     Object[] var41 = var10007;
                     Ref.h(278346905124376511L, var41, var42);

                     try {
                        ;
                     } catch (InvocationTargetException var81) {
                        throw var81.getTargetException();
                     }
                  }

                  if (var7 != null) {
                     if (var116 != null) {
                        break label389;
                     }

                     var116 = "*";
                  }

                  var16 = var116;
                  if (var7 != null) {
                     break label389;
                  }
               }

               var98 = var14;
               var10005 = 4;
            }

            if (var7 != null) {
               if (var98 == var10005) {
                  Object[] var102 = Registry.emptyArgs();
                  long var44 = 278346905124376511L;
                  Object[] var43 = var102;
                  Object var103 = Ref.h(278346905124376511L, var43, var44);

                  try {
                     var104 = (String)var103;
                  } catch (InvocationTargetException var80) {
                     throw var80.getTargetException();
                  }

                  String var18 = var104;
                  if (var18 != null) {
                     Zh2_2 var119 = (Zh2_2)(Registry.emptyArgs());
                     long var46 = 544766541203572491L;
                     Object var45 = var119;
                     var119 = Ref.h(544766541203572491L, var45, var46);

                     try {
                        var119 = (Zh2_2)var119;
                     } catch (InvocationTargetException var79) {
                        throw var79.getTargetException();
                     }

                     Zh2_2 var19 = var119;
                     label365:
                     if (var19 != null) {
                        label398: {
                           label399: {
                              label361: {
                                 var119 = var18;
                                 label360:
                                 if (var7 != null) {
                                    if (!var18.startsWith(a(29188, 5318))) {
                                       var119 = var18;
                                       if (var7 == null) {
                                          break label360;
                                       }

                                       if (!var18.startsWith(a(29185, 19000))) {
                                          var123 = var18.startsWith(a(29190, 18753));
                                          if (var7 == null) {
                                             break label399;
                                          }

                                          if (!var123) {
                                             break label361;
                                          }
                                       }
                                    }

                                    var119 = a(29187, 18275);
                                 }

                                 var16 = var119;
                                 if (var7 != null) {
                                    break label365;
                                 }
                              }

                              var119 = var18;
                              if (var7 == null) {
                                 break label398;
                              }

                              var123 = var18.startsWith(a(29191, -20824));
                           }

                           if (var123) {
                              var16 = a(29189, -28318);
                              if (var7 != null) {
                                 break label365;
                              }
                           }

                           var119 = var19.l();
                        }

                        var16 = var119;
                     }
                  }

                  if (var7 != null) {
                     break label389;
                  }
               }

               var98 = var14;
               var10005 = 2;
            }

            if (var7 != null) {
               if (var98 == var10005) {
                  var8.setHorizontalAlignment(4);
                  if (var7 != null) {
                     Object[] var105 = Registry.emptyArgs();
                     long var48 = 278346905124376511L;
                     Object[] var47 = var105;
                     Object var106 = Ref.h(278346905124376511L, var47, var48);

                     try {
                        var107 = (String)var106;
                     } catch (InvocationTargetException var78) {
                        throw var78.getTargetException();
                     }

                     label319:
                     if (var107 != null && (var7 == null || var17 != null)) {
                        Object var125 = Registry.emptyArgs();
                        long var50 = 520926529036853194L;
                        Object var49 = var125;
                        var125 = Ref.h(520926529036853194L, var49, var50);

                        try {
                           var127 = (Integer)var125;
                        } catch (InvocationTargetException var77) {
                           throw var77.getTargetException();
                        }

                        label324: {
                           int var92 = var127;
                           if (var7 != null) {
                              if (var92 <= 0) {
                                 break label324;
                              }

                              var16 = var92 + "";
                           }

                           if (var7 != null) {
                              break label319;
                           }
                        }

                        var16 = a(29184, -26801);
                     }

                     Object[] var128 = Registry.packArgs(true);
                     long var52 = 190819213857712489L;
                     Object[] var51 = var128;
                     Ref.h(190819213857712489L, var51, var52);

                     try {
                        ;
                     } catch (InvocationTargetException var76) {
                        throw var76.getTargetException();
                     }
                  }

                  if (var7 != null) {
                     break label389;
                  }
               }

               var98 = var14;
               var10005 = 3;
            }

            if (var7 != null) {
               if (var98 == var10005) {
                  if (var7 != null && var17 == null) {
                     break label389;
                  }

                  Object[] var108 = Registry.emptyArgs();
                  long var54 = 332825939301957587L;
                  Object[] var53 = var108;
                  Object var109 = Ref.h(332825939301957587L, var53, var54);

                  try {
                     var110 = (ArrayList)var109;
                  } catch (InvocationTargetException var75) {
                     throw var75.getTargetException();
                  }

                  int var93 = var110.size();
                  Object var129 = Registry.emptyArgs();
                  long var56 = 183746953072628965L;
                  Object var55 = var129;
                  var129 = Ref.h(183746953072628965L, var55, var56);

                  try {
                     var131 = (Integer)var129;
                  } catch (InvocationTargetException var74) {
                     throw var74.getTargetException();
                  }

                  int var94 = var131;
                  float var20 = 100.0F * (float)var94 / (float)var93;
                  if (var7 != null) {
                     if (var93 > 0) {
                        new StringBuilder().append("");
                        Object var135 = Registry.packArgs(var20);
                        long var57 = 443004786775321843L;
                        Object var143 = Ref.h2(443004786775321843L, var57);

                        try {
                           var143 = (String)var143;
                        } catch (InvocationTargetException var73) {
                           throw var73.getTargetException();
                        }

                        var16 = var135.append((String)var143).append("").toString();
                     }

                     var8.setHorizontalAlignment(4);
                     Object[] var136 = Registry.packArgs(true);
                     long var60 = 184443954444890081L;
                     Object[] var59 = var136;
                     Ref.h(184443954444890081L, var59, var60);

                     try {
                        ;
                     } catch (InvocationTargetException var72) {
                        throw var72.getTargetException();
                     }
                  }

                  if (var7 != null) {
                     break label389;
                  }
               }

               var98 = var14;
               var10005 = 4;
            }

            if (var98 == var10005) {
            }
         }

         var8.setText((String)var16);
      }

      label406: {
         Object var61 = 609069556332550507L;
         this.setBorder((Border)Ref.g(609069556332550507L, var61));
         if (var7 != null) {
            Object[] var132 = Registry.packArgs(var15);
            long var64 = 256725422018075898L;
            Object[] var63 = var132;
            Ref.h(256725422018075898L, var63, var64);

            try {
               ;
            } catch (InvocationTargetException var71) {
               throw var71.getTargetException();
            }

            if (var6 == 1) {
               Object[] var137 = Registry.packArgs(true);
               long var66 = 370485688598101258L;
               Object[] var65 = var137;
               Ref.h(370485688598101258L, var65, var66);

               try {
                  ;
               } catch (InvocationTargetException var70) {
                  throw var70.getTargetException();
               }

               if (var7 != null) {
                  break label406;
               }
            }
         }

         Object[] var133 = Registry.packArgs(false);
         long var68 = 370485688598101258L;
         Object[] var67 = var133;
         Ref.h(370485688598101258L, var67, var68);

         try {
            ;
         } catch (InvocationTargetException var69) {
            throw var69.getTargetException();
         }
      }

      label409: {
         int var134 = (var3) ? 1 : 0;
         if (var7 != null) {
            if (var3 != 0) {
               var8.setBackground((Color)Registry.lookupField(623875439513009390L).get(null));
               var8.setForeground((Color)Registry.lookupField(513155505692963448L).get(null));
               var8.setOpaque(true);
               if (var7 != null) {
                  break label409;
               }
            }

            var134 = var5 % 2;
         }

         int var91 = var134;
         var8.setForeground(new Color(a(2568, 2721471035910856114L), a(32459, 6596245144442857847L), a(32459, 6596245144442857847L)));
         if (var7 != null) {
            if (var91 == 0) {
               var8.setOpaque(false);
               if (var7 != null) {
                  break label409;
               }
            }

            var8.setOpaque(true);
         }

         var8.setBackground(
            new Color(a(15535, 4513830391152421652L), a(23783, 6330536260375104350L), a(23783, 6330536260375104350L), a(20656, 1065167709549840141L))
         );
      }

      if (Ky4.F$arrString() != null) {
         YQ.Y(new int[3]);
      }

      return var8;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 29191) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 104;
               break;
            case 1:
               var10000 = 56;
               break;
            case 2:
               var10000 = 166;
               break;
            case 3:
               var10000 = 228;
               break;
            case 4:
               var10000 = 87;
               break;
            case 5:
               var10000 = 17;
               break;
            case 6:
               var10000 = 69;
               break;
            case 7:
               var10000 = 103;
               break;
            case 8:
               var10000 = 108;
               break;
            case 9:
               var10000 = 101;
               break;
            case 10:
               var10000 = 122;
               break;
            case 11:
               var10000 = 186;
               break;
            case 12:
               var10000 = 27;
               break;
            case 13:
               var10000 = 154;
               break;
            case 14:
               var10000 = 208;
               break;
            case 15:
               var10000 = 233;
               break;
            case 16:
               var10000 = 62;
               break;
            case 17:
               var10000 = 182;
               break;
            case 18:
               var10000 = 21;
               break;
            case 19:
               var10000 = 243;
               break;
            case 20:
               var10000 = 4;
               break;
            case 21:
               var10000 = 202;
               break;
            case 22:
               var10000 = 120;
               break;
            case 23:
               var10000 = 58;
               break;
            case 24:
               var10000 = 86;
               break;
            case 25:
               var10000 = 187;
               break;
            case 26:
               var10000 = 204;
               break;
            case 27:
               var10000 = 215;
               break;
            case 28:
               var10000 = 81;
               break;
            case 29:
               var10000 = 149;
               break;
            case 30:
               var10000 = 245;
               break;
            case 31:
               var10000 = 242;
               break;
            case 32:
               var10000 = 28;
               break;
            case 33:
               var10000 = 158;
               break;
            case 34:
               var10000 = 23;
               break;
            case 35:
               var10000 = 157;
               break;
            case 36:
               var10000 = 22;
               break;
            case 37:
               var10000 = 143;
               break;
            case 38:
               var10000 = 251;
               break;
            case 39:
               var10000 = 249;
               break;
            case 40:
               var10000 = 191;
               break;
            case 41:
               var10000 = 15;
               break;
            case 42:
               var10000 = 134;
               break;
            case 43:
               var10000 = 181;
               break;
            case 44:
               var10000 = 145;
               break;
            case 45:
               var10000 = 175;
               break;
            case 46:
               var10000 = 47;
               break;
            case 47:
               var10000 = 241;
               break;
            case 48:
               var10000 = 203;
               break;
            case 49:
               var10000 = 178;
               break;
            case 50:
               var10000 = 118;
               break;
            case 51:
               var10000 = 31;
               break;
            case 52:
               var10000 = 42;
               break;
            case 53:
               var10000 = 109;
               break;
            case 54:
               var10000 = 106;
               break;
            case 55:
               var10000 = 1;
               break;
            case 56:
               var10000 = 91;
               break;
            case 57:
               var10000 = 13;
               break;
            case 58:
               var10000 = 39;
               break;
            case 59:
               var10000 = 201;
               break;
            case 60:
               var10000 = 173;
               break;
            case 61:
               var10000 = 225;
               break;
            case 62:
               var10000 = 44;
               break;
            case 63:
               var10000 = 230;
               break;
            case 64:
               var10000 = 165;
               break;
            case 65:
               var10000 = 12;
               break;
            case 66:
               var10000 = 212;
               break;
            case 67:
               var10000 = 61;
               break;
            case 68:
               var10000 = 227;
               break;
            case 69:
               var10000 = 126;
               break;
            case 70:
               var10000 = 209;
               break;
            case 71:
               var10000 = 224;
               break;
            case 72:
               var10000 = 115;
               break;
            case 73:
               var10000 = 49;
               break;
            case 74:
               var10000 = 84;
               break;
            case 75:
               var10000 = 221;
               break;
            case 76:
               var10000 = 171;
               break;
            case 77:
               var10000 = 80;
               break;
            case 78:
               var10000 = 142;
               break;
            case 79:
               var10000 = 40;
               break;
            case 80:
               var10000 = 176;
               break;
            case 81:
               var10000 = 113;
               break;
            case 82:
               var10000 = 235;
               break;
            case 83:
               var10000 = 205;
               break;
            case 84:
               var10000 = 34;
               break;
            case 85:
               var10000 = 198;
               break;
            case 86:
               var10000 = 162;
               break;
            case 87:
               var10000 = 194;
               break;
            case 88:
               var10000 = 98;
               break;
            case 89:
               var10000 = 0;
               break;
            case 90:
               var10000 = 133;
               break;
            case 91:
               var10000 = 217;
               break;
            case 92:
               var10000 = 72;
               break;
            case 93:
               var10000 = 19;
               break;
            case 94:
               var10000 = 33;
               break;
            case 95:
               var10000 = 151;
               break;
            case 96:
               var10000 = 125;
               break;
            case 97:
               var10000 = 246;
               break;
            case 98:
               var10000 = 111;
               break;
            case 99:
               var10000 = 89;
               break;
            case 100:
               var10000 = 60;
               break;
            case 101:
               var10000 = 35;
               break;
            case 102:
               var10000 = 190;
               break;
            case 103:
               var10000 = 9;
               break;
            case 104:
               var10000 = 216;
               break;
            case 105:
               var10000 = 163;
               break;
            case 106:
               var10000 = 66;
               break;
            case 107:
               var10000 = 121;
               break;
            case 108:
               var10000 = 161;
               break;
            case 109:
               var10000 = 155;
               break;
            case 110:
               var10000 = 222;
               break;
            case 111:
               var10000 = 185;
               break;
            case 112:
               var10000 = 174;
               break;
            case 113:
               var10000 = 32;
               break;
            case 114:
               var10000 = 79;
               break;
            case 115:
               var10000 = 195;
               break;
            case 116:
               var10000 = 110;
               break;
            case 117:
               var10000 = 236;
               break;
            case 118:
               var10000 = 137;
               break;
            case 119:
               var10000 = 129;
               break;
            case 120:
               var10000 = 169;
               break;
            case 121:
               var10000 = 112;
               break;
            case 122:
               var10000 = 150;
               break;
            case 123:
               var10000 = 52;
               break;
            case 124:
               var10000 = 18;
               break;
            case 125:
               var10000 = 75;
               break;
            case 126:
               var10000 = 102;
               break;
            case 127:
               var10000 = 218;
               break;
            case 128:
               var10000 = 93;
               break;
            case 129:
               var10000 = 57;
               break;
            case 130:
               var10000 = 250;
               break;
            case 131:
               var10000 = 37;
               break;
            case 132:
               var10000 = 140;
               break;
            case 133:
               var10000 = 68;
               break;
            case 134:
               var10000 = 24;
               break;
            case 135:
               var10000 = 193;
               break;
            case 136:
               var10000 = 239;
               break;
            case 137:
               var10000 = 200;
               break;
            case 138:
               var10000 = 100;
               break;
            case 139:
               var10000 = 184;
               break;
            case 140:
               var10000 = 167;
               break;
            case 141:
               var10000 = 20;
               break;
            case 142:
               var10000 = 88;
               break;
            case 143:
               var10000 = 231;
               break;
            case 144:
               var10000 = 8;
               break;
            case 145:
               var10000 = 74;
               break;
            case 146:
               var10000 = 5;
               break;
            case 147:
               var10000 = 219;
               break;
            case 148:
               var10000 = 11;
               break;
            case 149:
               var10000 = 107;
               break;
            case 150:
               var10000 = 10;
               break;
            case 151:
               var10000 = 144;
               break;
            case 152:
               var10000 = 59;
               break;
            case 153:
               var10000 = 130;
               break;
            case 154:
               var10000 = 238;
               break;
            case 155:
               var10000 = 159;
               break;
            case 156:
               var10000 = 26;
               break;
            case 157:
               var10000 = 170;
               break;
            case 158:
               var10000 = 99;
               break;
            case 159:
               var10000 = 147;
               break;
            case 160:
               var10000 = 43;
               break;
            case 161:
               var10000 = 54;
               break;
            case 162:
               var10000 = 214;
               break;
            case 163:
               var10000 = 14;
               break;
            case 164:
               var10000 = 247;
               break;
            case 165:
               var10000 = 6;
               break;
            case 166:
               var10000 = 135;
               break;
            case 167:
               var10000 = 168;
               break;
            case 168:
               var10000 = 160;
               break;
            case 169:
               var10000 = 76;
               break;
            case 170:
               var10000 = 197;
               break;
            case 171:
               var10000 = 36;
               break;
            case 172:
               var10000 = 179;
               break;
            case 173:
               var10000 = 117;
               break;
            case 174:
               var10000 = 183;
               break;
            case 175:
               var10000 = 229;
               break;
            case 176:
               var10000 = 90;
               break;
            case 177:
               var10000 = 7;
               break;
            case 178:
               var10000 = 132;
               break;
            case 179:
               var10000 = 63;
               break;
            case 180:
               var10000 = 94;
               break;
            case 181:
               var10000 = 97;
               break;
            case 182:
               var10000 = 48;
               break;
            case 183:
               var10000 = 148;
               break;
            case 184:
               var10000 = 65;
               break;
            case 185:
               var10000 = 119;
               break;
            case 186:
               var10000 = 92;
               break;
            case 187:
               var10000 = 153;
               break;
            case 188:
               var10000 = 232;
               break;
            case 189:
               var10000 = 55;
               break;
            case 190:
               var10000 = 146;
               break;
            case 191:
               var10000 = 2;
               break;
            case 192:
               var10000 = 255;
               break;
            case 193:
               var10000 = 64;
               break;
            case 194:
               var10000 = 116;
               break;
            case 195:
               var10000 = 123;
               break;
            case 196:
               var10000 = 95;
               break;
            case 197:
               var10000 = 177;
               break;
            case 198:
               var10000 = 211;
               break;
            case 199:
               var10000 = 105;
               break;
            case 200:
               var10000 = 83;
               break;
            case 201:
               var10000 = 172;
               break;
            case 202:
               var10000 = 127;
               break;
            case 203:
               var10000 = 53;
               break;
            case 204:
               var10000 = 252;
               break;
            case 205:
               var10000 = 138;
               break;
            case 206:
               var10000 = 82;
               break;
            case 207:
               var10000 = 226;
               break;
            case 208:
               var10000 = 38;
               break;
            case 209:
               var10000 = 156;
               break;
            case 210:
               var10000 = 51;
               break;
            case 211:
               var10000 = 96;
               break;
            case 212:
               var10000 = 254;
               break;
            case 213:
               var10000 = 3;
               break;
            case 214:
               var10000 = 141;
               break;
            case 215:
               var10000 = 131;
               break;
            case 216:
               var10000 = 70;
               break;
            case 217:
               var10000 = 124;
               break;
            case 218:
               var10000 = 152;
               break;
            case 219:
               var10000 = 210;
               break;
            case 220:
               var10000 = 192;
               break;
            case 221:
               var10000 = 237;
               break;
            case 222:
               var10000 = 73;
               break;
            case 223:
               var10000 = 244;
               break;
            case 224:
               var10000 = 50;
               break;
            case 225:
               var10000 = 29;
               break;
            case 226:
               var10000 = 234;
               break;
            case 227:
               var10000 = 128;
               break;
            case 228:
               var10000 = 30;
               break;
            case 229:
               var10000 = 196;
               break;
            case 230:
               var10000 = 71;
               break;
            case 231:
               var10000 = 139;
               break;
            case 232:
               var10000 = 213;
               break;
            case 233:
               var10000 = 199;
               break;
            case 234:
               var10000 = 136;
               break;
            case 235:
               var10000 = 46;
               break;
            case 236:
               var10000 = 16;
               break;
            case 237:
               var10000 = 85;
               break;
            case 238:
               var10000 = 220;
               break;
            case 239:
               var10000 = 207;
               break;
            case 240:
               var10000 = 253;
               break;
            case 241:
               var10000 = 25;
               break;
            case 242:
               var10000 = 164;
               break;
            case 243:
               var10000 = 223;
               break;
            case 244:
               var10000 = 189;
               break;
            case 245:
               var10000 = 240;
               break;
            case 246:
               var10000 = 180;
               break;
            case 247:
               var10000 = 248;
               break;
            case 248:
               var10000 = 45;
               break;
            case 249:
               var10000 = 188;
               break;
            case 250:
               var10000 = 78;
               break;
            case 251:
               var10000 = 114;
               break;
            case 252:
               var10000 = 206;
               break;
            case 253:
               var10000 = 67;
               break;
            case 254:
               var10000 = 41;
               break;
            default:
               var10000 = 77;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6072;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[8];
      int var11 = 0;
      String var10 = "Þ§\t\u0012¢\u00ad~¡\u0007È½Ë\u009eú<c\u0003峡埴習\u0003íÙs\u0004侱番垗垩\u0010·O.\u0010z+Íd\u008aÕOÜ·å\u0010\u001f";
      int var12 = "Þ§\t\u0012¢\u00ad~¡\u0007È½Ë\u009eú<c\u0003峡埴習\u0003íÙs\u0004侱番垗垩\u0010·O.\u0010z+Íd\u008aÕOÜ·å\u0010\u001f".length();
      char var9 = '\b';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 6;
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
                        var65 = 74;
                        break;
                     case 1:
                        var65 = 49;
                        break;
                     case 2:
                        var65 = 120;
                        break;
                     case 3:
                        var65 = 54;
                        break;
                     case 4:
                        var65 = 15;
                        break;
                     case 5:
                        var65 = 50;
                        break;
                     default:
                        var65 = 34;
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
                     a = var13;
                     b = new String[8];
                     long var0 = 903768262413126305L;
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "#æ]Ê@L78$&¾\u0013m\u000bA\u009b\u0081yí¦¹\u0093\u0017!ý&ûö\u0011h¡Ñ";
                     int var5 = "#æ]Ê@L78$&¾\u0013m\u000bA\u009b\u0081yí¦¹\u0093\u0017!ý&ûö\u0011h¡Ñ".length();
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
                                    c = var6;
                                    d = new Integer[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "#:¡¡í\u0081cä{c¤\u009c)\u0087M¦";
                                 var5 = "#:¡¡í\u0081cä{c¤\u009c)\u0087M¦".length();
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

                  var10 = "ÂVÒ^\u0002跈攈";
                  var12 = "ÂVÒ^\u0002跈攈".length();
                  var9 = 4;
                  var17 = -1;
            }

            var10000 = 86;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





