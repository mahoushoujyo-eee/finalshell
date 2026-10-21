package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.GO;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.panel.AA;
import com.finalshell.ui.panel.Connection5;
import com.finalshell.ui.panel.RouteTracePanel2;
import com.finalshell.ui.panel.ShowDeletedPanel;
import com.finalshell.ui.panel.Tv2;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class OQ3 implements MouseListener {
   public long B;
   public final ShowDeletedPanel r;
   public final boolean F;
   public final Connection5 L;
   public static long[] a;
   public static Long[] b;

   public OQ3(Connection5 var1, ShowDeletedPanel var2, boolean var3) {
      this.L = var1;
      this.r = var2;
      this.F = var3;
      Registry.lookupField(343665629204695331L).setLong(this, 0L);
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      String var2 = AA.z();
      int var10000 = var1.getClickCount();
      if (var2 == null) {
         boolean var7 = var10000 == 2;
      }

      Registry.emptyArgs();
      long var4 = 454647487873911743L;
      Object var10001 = Ref.h2(454647487873911743L, var4);

      try {
         var8 = (Boolean)var10001;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      if (var2 == null) {
         if (var8 == 0) {
            return;
         }

         long var10;
         var8 = (var10 = System.currentTimeMillis() - Registry.lookupField(343665629204695331L).getLong(this) - a(880, 8800055089297986574L)) == 0L
            ? 0
            : (var10 < 0L ? -1 : 1);
      }

      if (var2 == null) {
         boolean var9 = var8 < 0;
      }

      Registry.lookupField(343665629204695331L).setLong(this, System.currentTimeMillis());
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      AA.z();
      Object var7 = 414214645141473905L;
      Ref.g(414214645141473905L, var7);
      Object var9 = 593306439561595691L;
      int var3 = ((Connection5)Ref.g(593306439561595691L, var9)).getRowForLocation(var1.getX(), var1.getY());
      Object var11 = 414214645141473905L;
      Ref.g(414214645141473905L, var11);
      Object var13 = 414214645141473905L;
      Object var10006 = Ref.g(414214645141473905L, var13);
      Object var15 = 593306439561595691L;
      TreePath var10007 = ((Connection5)Ref.g(593306439561595691L, var15)).getPathForLocation(var1.getX(), var1.getY());
      long var18 = 231686721816212635L;
      TreePath var17 = var10007;
      Ref.s(231686721816212635L, var17, var18);
      Object var2 = var10006;
      int var29 = var3;
      byte var30 = -1;
      if (var2 == null) {
         if (var3 != -1) {
            if (var1.getClickCount() != 1) {
               return;
            }

            label36: {
               System.currentTimeMillis();
               Object var19 = 414214645141473905L;
               long var4 = this - Registry.lookupField(159470416555914823L).getLong(Ref.g(414214645141473905L, var19));
               long var32;
               OQ3 var31 = (var32 = var4 - a(9273, 9088079100375348038L)) == 0L ? 0 : (var32 < 0L ? -1 : 1);
               if (var2 == null) {
                  if (!(var31 > 0)) {
                     break label36;
                  }

                  var31 = this;
                  Object var21 = 414214645141473905L;
                  Ref.g(414214645141473905L, var21);
                  Object var23 = 593306439561595691L;
                  ((Connection5)Ref.g(593306439561595691L, var23)).getSelectionCount();
               }

               OQ3 var6 = var31;
               if (var6 == null) {
                  Object var25 = 414214645141473905L;
                  Registry.lookupField(137395258222385003L).setBoolean(Ref.g(414214645141473905L, var25), true);
               }
            }

            if (var2 == null) {
               return;
            }
         }

         var29 = var1.getButton();
         var30 = 1;
      }

      if (var2 == null) {
         if (var29 == var30) {
            Object var27 = 414214645141473905L;
            ((Connection5)Ref.g(414214645141473905L, var27)).getSelectionModel().clearSelection();
         }

         var29 = var1.getButton();
         var30 = 3;
      }

      if (var29 == var30) {
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      AA.z();
      Object var16 = 259251831013725374L;
      Ref.g(259251831013725374L, var16);
      Object[] var10003 = Registry.emptyArgs();
      long var19 = 149160680229662748L;
      Object[] var18 = var10003;
      var10003 = Ref.h(149160680229662748L, var18, var19);

      try {
         var10003 = (com.finalshell.ui.dialog.KQ)var10003;
      } catch (InvocationTargetException var74) {
         throw var74.getTargetException();
      }

      com.finalshell.ui.dialog.KQ var3 = var10003;
      Object[] var10004 = Registry.emptyArgs();
      long var21 = 249886410317960768L;
      Object[] var20 = var10004;
      var10004 = Ref.h(249886410317960768L, var20, var21);

      try {
         var10004 = (com.finalshell.ui.frame.U)var10004;
      } catch (InvocationTargetException var73) {
         throw var73.getTargetException();
      }

      com.finalshell.ui.frame.U var4 = var10004;
      Connection5 var5 = (Connection5)var1.getSource();
      Object var22 = 414214645141473905L;
      Object var10005 = Ref.g(414214645141473905L, var22);
      Object[] var10006 = Registry.packArgs(var1.getPoint());
      long var25 = 379754982100791858L;
      Object[] var24 = var10006;
      var10006 = Ref.h(379754982100791858L, var24, var25);

      try {
         var83 = (Integer)var10006;
      } catch (InvocationTargetException var72) {
         throw var72.getTargetException();
      }

      Object var2;
      int var6;
      int var7;
      label194: {
         var6 = var83;
         var7 = 0;
         var2 = var10005;
         int var81 = var6;
         if (var2 == null) {
            if (var6 != 0) {
               break label194;
            }

            var81 = 1;
         }

         var7 = var81;
      }

      var10006 = Registry.packArgs(var6);
      long var27 = 313360281912871059L;
      Object[] var26 = var10006;
      var10006 = Ref.h(313360281912871059L, var26, var27);

      try {
         var10006 = (DefaultMutableTreeNode)var10006;
      } catch (InvocationTargetException var71) {
         throw var71.getTargetException();
      }

      Connection5 var93;
      label198: {
         label199: {
            DefaultMutableTreeNode var8;
            TreePath var9;
            label200: {
               var8 = var10006;
               var9 = null;
               if (var6 > -1) {
                  var10006 = var5;
                  Object[] var10007 = Registry.packArgs(var8);
                  long var29 = 263865946362642439L;
                  Object[] var28 = var10007;
                  var93 = (Connection5)Ref.h(263865946362642439L, var28, var29);

                  try {
                     var89 = (TreePath)var93;
                  } catch (InvocationTargetException var70) {
                     throw var70.getTargetException();
                  }

                  var9 = var89;
                  var90 = var1.getButton();
                  if (var2 != null) {
                     break label200;
                  }

                  label181:
                  if (var90 == 1) {
                     var93 = var8;
                     if (var2 == null) {
                        if (var8 == null) {
                           break label181;
                        }

                        var93 = (Connection5)var8.getUserObject();
                     }

                     byte var10008;
                     label174: {
                        var92 = var93.getClass().equals(Ck4.class);
                        if (var2 == null) {
                           if (var92 != 0) {
                              Ck4 var10 = (Ck4)var8.getUserObject();
                              var92 = var1.getClickCount();
                              var10008 = 2;
                              if (var2 != null) {
                                 break label174;
                              }

                              if (var92 == 2) {
                                 Object[] var94 = Registry.emptyArgs();
                                 long var31 = 303756590022481369L;
                                 Object[] var30 = var94;
                                 Ref.h(303756590022481369L, var30, var31);
                                 Object[] var10009 = Registry.emptyArgs();
                                 long var33 = 194560825135347400L;
                                 Object[] var32 = var10009;
                                 Ref.h(194560825135347400L, var32, var33);
                                 Object[] var10010 = Registry.emptyArgs();
                                 long var35 = 424156930953488367L;
                                 Object[] var34 = var10010;
                                 var10010 = Ref.h(424156930953488367L, var34, var35);

                                 try {
                                    var10010 = (com.finalshell.ui.panel.F8)var10010;
                                 } catch (InvocationTargetException var69) {
                                    throw var69.getTargetException();
                                 }

                                 com.finalshell.ui.panel.F8 var11 = var10010;
                                 SwingUtilities.invokeLater(new GO(this, var11, var10, var4));
                              }
                           }

                           var92 = var1.getClickCount();
                        }

                        var10008 = 1;
                     }

                     if (var92 == var10008) {
                     }
                  }
               }

               var10006 = var1.getButton();
               if (var2 != null) {
                  break label199;
               }

               var90 = 3;
            }

            if (var10006 == var90) {
               var10006 = this;
               Object var36 = 414214645141473905L;
               Ref.g(414214645141473905L, var36);
               Object[] var95 = Registry.emptyArgs();
               long var39 = 213918959370705943L;
               Object[] var38 = var95;
               Ref.h(213918959370705943L, var38, var39);
               Tv2 var96 = Registry.emptyArgs();
               long var41 = 196767746087547704L;
               Object[] var40 = var96;
               var96 = Ref.h(196767746087547704L, var40, var41);

               try {
                  var96 = (Tv2)var96;
               } catch (InvocationTargetException var68) {
                  throw var68.getTargetException();
               }

               var96.setVisible(false);
               DefaultMutableTreeNode var75 = var8;
               if (var2 == null) {
                  if (var8 == null) {
                     Object var42 = 414214645141473905L;
                     Ref.g(414214645141473905L, var42);
                     Object var44 = 213130010239103238L;
                     var75 = (DefaultMutableTreeNode)Ref.g(213130010239103238L, var44);
                     var7 = 1;
                  }

                  Object var46 = 414214645141473905L;
                  Ref.g(414214645141473905L, var46);
                  RouteTracePanel2 var10011 = new RouteTracePanel2(var5, var75, var3, (boolean)var7, Registry.lookupField(451929456137016711L).getBoolean(this));
                  long var49 = 486701759580007258L;
                  RouteTracePanel2 var48 = var10011;
                  Ref.s(486701759580007258L, var48, var49);
                  Object var50 = 414214645141473905L;
                  Ref.g(414214645141473905L, var50);
                  Object var52 = 486701759580007258L;
                  ((RouteTracePanel2)Ref.g(486701759580007258L, var52)).show((Component)var1.getSource(), var1.getX() + 1, var1.getY() + 1);
                  Object[] var10014 = Registry.packArgs(true);
                  long var55 = 438941361784812150L;
                  Object[] var54 = var10014;
                  Ref.h(438941361784812150L, var54, var55);

                  try {
                     ;
                  } catch (InvocationTargetException var67) {
                     throw var67.getTargetException();
                  }

                  Object var56 = 414214645141473905L;
                  Ref.g(414214645141473905L, var56);
                  Object var58 = 486701759580007258L;
                  ((RouteTracePanel2)Ref.g(486701759580007258L, var58)).addPopupMenuListener(new TK3(this, var3));
               }

               List var101 = (List)(Registry.emptyArgs());
               long var61 = 447854232501987193L;
               Object[] var60 = var101;
               var101 = Ref.h(447854232501987193L, var60, var61);

               try {
                  var101 = (List)var101;
               } catch (InvocationTargetException var66) {
                  throw var66.getTargetException();
               }

               List var76 = var101;
               DefaultMutableTreeNode var12 = var75;
               boolean var13 = false;

               label157: {
                  for (DefaultMutableTreeNode var15 : var76) {
                     var104 = var15.equals(var12);
                     if (var2 != null) {
                        break label157;
                     }

                     label153: {
                        if (var2 == null) {
                           if (!var104) {
                              break label153;
                           }

                           var104 = true;
                        }

                        var13 = var104;
                        if (var2 == null) {
                           break;
                        }
                     }

                     if (var2 != null) {
      Object var104;
      Object var104;
                        break;
                     }
                  }

                  var104 = var13;
               }

               if (var2 != null) {
                  break label199;
               }

               if (!var104) {
                  var5.setSelectionPath(var9);
               }
            }

            var10006 = this;
            Object var62 = 414214645141473905L;
            var93 = (Connection5)Ref.g(414214645141473905L, var62);
            if (var2 != null) {
               break label198;
            }

            Registry.lookupField(137395258222385003L).getBoolean(var93);
         }

         if (var10006 == null) {
            return;
         }

         Object var64 = 414214645141473905L;
         var93 = (Connection5)Ref.g(414214645141473905L, var64);
      }

      Registry.lookupField(137395258222385003L).setBoolean(var93, false);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Object var2 = 414214645141473905L;
      Registry.lookupField(137395258222385003L).setBoolean(Ref.g(414214645141473905L, var2), false);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Object var2 = 414214645141473905L;
      Registry.lookupField(137395258222385003L).setBoolean(Ref.g(414214645141473905L, var2), false);
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 6015) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 9201609407459792327L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0001\u00adøÊy\u000e¦\u0095\u0005\u0092¼z\\ñ\u0004\u0015";
      int var5 = "\u0001\u00adøÊy\u000e¦\u0095\u0005\u0092¼z\\ñ\u0004\u0015".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
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
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Long[2];
   }
}






