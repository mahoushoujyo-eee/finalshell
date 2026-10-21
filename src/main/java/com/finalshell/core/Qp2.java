package com.finalshell.core;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.adapter.BL;
import com.finalshell.ui.panel.FileCommandPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class Qp2 extends JTable {
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Qp2() {
      this.setSelectionBackground((Color)Registry.lookupField(623875439513009390L).get(null));
      this.setSelectionForeground((Color)Registry.lookupField(513155505692963448L).get(null));
      this.setBorder(null);
      this.setBorder(BorderFactory.createEmptyBorder());
      this.setDragEnabled(false);
      this.setShowGrid(false);
      this.setAutoResizeMode(3);
      this.setIntercellSpacing(new Dimension(0, 0));
      this.setSelectionMode(0);
      this.getTableHeader().setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      this.addMouseListener(new com.finalshell.ui.listener.DB3(this));
      this.setDefaultRenderer(Kl2.class, new BL());
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
   }

   @Override
   public void setModel(TableModel var1) {
      super.setModel(var1);
      boolean var10000 = FileCommandPanel.q();
      TableColumnModel var3 = this.getColumnModel();
      boolean var2 = var10000;
      this.setPreferredScrollableViewportSize(new Dimension(a(27490, 9008288787270549889L), a(28871, 727885258968914469L)));
      JLabel var4 = new JLabel();
      var4.setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      var4.setText(a);
      int var5 = var4.getPreferredSize().width;
      TableColumnModel var8 = var3;
      if (var2) {
         if (var3.getColumnCount() <= 1) {
            return;
         }

         var3.getColumn(0).setPreferredWidth(a(3811, 1661198216132142085L));
         var3.getColumn(0).setMinWidth(a(20169, 3273156019140584489L));
         var3.getColumn(1).setPreferredWidth(a(26438, 8368305677147721127L));
         var8 = var3;
      }

      var8.getColumn(1).setMinWidth(var5);
      BL var6 = new BL();
      int var7 = 0;

      while (var7 < var3.getColumnCount()) {
         var3.getColumn(var7).setCellRenderer(var6);
         var7++;
         if (!var2) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10978;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "c\u001fJGT6Cc\u001fJGT6".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 104;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 104;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 51;
               break;
            case 1:
               var50 = 79;
               break;
            case 2:
               var50 = 26;
               break;
            case 3:
               var50 = 1;
               break;
            case 4:
               var50 = 4;
               break;
            case 5:
               var50 = 19;
               break;
            default:
               var50 = 4;
         }
      } else {
         var34 = 104;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 9164847704104554022L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12 = "M\u0094\r`µ¡3\u0013y\u0096\u0013\u0086`ÑÁ\u0087¥¥MÛXúª\u0011";
            int var13 = "M\u0094\r`µ¡3\u0013y\u0096\u0013\u0086`ÑÁ\u0087¥¥MÛXúª\u0011".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[5];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u009dW]eõò\u0083Ñ£\u000eî_\t¥iË";
                        var13 = "\u009dW]eõò\u0083Ñ£\u000eî_\t¥iË".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 104;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 51;
               break;
            case 1:
               var50 = 79;
               break;
            case 2:
               var50 = 26;
               break;
            case 3:
               var50 = 1;
               break;
            case 4:
               var50 = 4;
               break;
            case 5:
               var50 = 19;
               break;
            default:
               var50 = 4;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 51;
                  break;
               case 1:
                  var50 = 79;
                  break;
               case 2:
                  var50 = 26;
                  break;
               case 3:
                  var50 = 1;
                  break;
               case 4:
                  var50 = 4;
                  break;
               case 5:
                  var50 = 19;
                  break;
               default:
                  var50 = 4;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 9164847704104554022L;
               long[] var6 = new long[5];
               int var3 = 0;
               String var4 = "M\u0094\r`µ¡3\u0013y\u0096\u0013\u0086`ÑÁ\u0087¥¥MÛXúª\u0011";
               int var5 = "M\u0094\r`µ¡3\u0013y\u0096\u0013\u0086`ÑÁ\u0087¥¥MÛXúª\u0011".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u009dW]eõò\u0083Ñ£\u000eî_\t¥iË";
                           var5 = "\u009dW]eõò\u0083Ñ£\u000eî_\t¥iË".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 51;
                  break;
               case 1:
                  var50 = 79;
                  break;
               case 2:
                  var50 = 26;
                  break;
               case 3:
                  var50 = 1;
                  break;
               case 4:
                  var50 = 4;
                  break;
               case 5:
                  var50 = 19;
                  break;
               default:
                  var50 = 4;
            }
         }
      }
   }
}





